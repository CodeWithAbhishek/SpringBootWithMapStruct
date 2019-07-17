# SpringBootWithMapStruct
A Simple spring boot project with rest controller and MapStruct Example
In this application we are mapping "your infromation" class's beans in to "yourfriendinfromation" class's beans.



NOTE:--When you will build this project the implementation of the mapper interface will genrated in the target/genrated-source folder.


=====================================================================================================================================
// this class wil be genrate after the build.
package com.codewithabhishek.mapper;

import com.codewithabhishek.beans.YourFriendInformation;
import com.codewithabhishek.beans.YourInformation;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-07-18T00:50:34+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
@Component
public class MappersinterImpl implements Mappersinter {

    @Override
    public YourFriendInformation getYourFriendInformation(YourInformation yourInformation) {
        if ( yourInformation == null ) {
            return null;
        }

        YourFriendInformation yourFriendInformation = new YourFriendInformation();

        yourFriendInformation.setYourFriendLastName( yourInformation.getYourLastName() );
        yourFriendInformation.setYourFriendsName( yourInformation.getYourName() );

        return yourFriendInformation;
    }
}
================================================================================================================================
