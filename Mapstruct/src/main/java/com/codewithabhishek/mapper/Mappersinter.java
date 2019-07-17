/**
 * 
 */
package com.codewithabhishek.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.codewithabhishek.beans.YourInformation;
import com.codewithabhishek.beans.YourFriendInformation;



/**
 * @author abhishek singh
 *
 */


@Mapper(componentModel = "spring")
public interface Mappersinter {
	
	
	
	@Mappings({
		@Mapping(source="yourName",target="yourFriendsName"),
		@Mapping(source="yourLastName",target="yourFriendLastName")
	})
	public YourFriendInformation getYourFriendInformation(YourInformation yourInformation) ;
}
