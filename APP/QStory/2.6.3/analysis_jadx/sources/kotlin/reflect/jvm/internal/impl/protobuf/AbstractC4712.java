package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.protobuf.C3531;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4712 implements InterfaceC4699 {
    static {
        int i = C4726.f13803;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m9406(InterfaceC4701 interfaceC4701) {
        if (interfaceC4701 == null || interfaceC4701.isInitialized()) {
        } else {
            throw (interfaceC4701 instanceof AbstractC4713 ? ((AbstractC4713) interfaceC4701).newUninitializedMessageException() : new UninitializedMessageException(interfaceC4701)).asInvalidProtocolBufferException().setUnfinishedMessage(interfaceC4701);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4701 m9407(InputStream inputStream, C4726 c4726) throws InvalidProtocolBufferException {
        InterfaceC4701 interfaceC4701;
        try {
            int i = inputStream.read();
            if (i == -1) {
                interfaceC4701 = null;
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
                C4709 c4709 = new C4709(new C3531(inputStream, i, 1));
                interfaceC4701 = (InterfaceC4701) mo9272(c4709, c4726);
                try {
                    if (c4709.f13765 != 0) {
                        throw InvalidProtocolBufferException.invalidEndTag();
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(interfaceC4701);
                }
            }
            m9406(interfaceC4701);
            return interfaceC4701;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }
}
