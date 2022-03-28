package org.tae.service;

import org.tae.domain.MemberDTO;

public interface MemberService {
	
		public void insert(MemberDTO mdto);

		public MemberDTO login(MemberDTO mdto);
		
}
