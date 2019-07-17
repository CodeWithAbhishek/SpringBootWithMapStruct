# SpringBootWithMapStruct
A Simple spring boot project with rest controller and MapStruct Example
In this application we are mapping "your infromation" class's beans in to "yourfriendinfromation" class's beans.



NOTE:--When you will build this project the implementation of the mapper interface will genrated in the target/genrated-source folder.


=====================================================================================================================================
// this class wil be genrate after the build.


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
