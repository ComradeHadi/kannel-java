package org.kannel.protocol.jms;

import org.kannel.protocol.packets.SMSPacketMessage;
import java.io.Serializable;

public interface JMSTranslator{

	public SMSPacketMessage objectToKannel(Object obj);
	
	public Serializable kannelToObject(SMSPacketMessage sms);
	
}
