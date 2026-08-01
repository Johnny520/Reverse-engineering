package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.protobuf.C4363;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5544 implements InterfaceC5531 {
    static {
        int i = C5558.f14148;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m9965(InterfaceC5533 interfaceC5533) {
        if (interfaceC5533 == null || interfaceC5533.isInitialized()) {
        } else {
            throw (interfaceC5533 instanceof AbstractC5545 ? ((AbstractC5545) interfaceC5533).newUninitializedMessageException() : new UninitializedMessageException(interfaceC5533)).asInvalidProtocolBufferException().setUnfinishedMessage(interfaceC5533);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5533 m9966(InputStream inputStream, C5558 c5558) throws InvalidProtocolBufferException {
        InterfaceC5533 interfaceC5533;
        try {
            int i = inputStream.read();
            if (i == -1) {
                interfaceC5533 = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int i3 = inputStream.read();
                                if (i3 == -1) {
                                    throw InvalidProtocolBufferException.truncatedMessage();
                                }
                                if ((i3 & 128) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw InvalidProtocolBufferException.malformedVarint();
                        }
                        int i4 = inputStream.read();
                        if (i4 == -1) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        i |= (i4 & 127) << i2;
                        if ((i4 & 128) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                C5541 c5541 = new C5541(new C4363(inputStream, i, 1));
                interfaceC5533 = (InterfaceC5533) mo9831(c5541, c5558);
                try {
                    if (c5541.f14110 != 0) {
                        throw InvalidProtocolBufferException.invalidEndTag();
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(interfaceC5533);
                }
            }
            m9965(interfaceC5533);
            return interfaceC5533;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }
}
