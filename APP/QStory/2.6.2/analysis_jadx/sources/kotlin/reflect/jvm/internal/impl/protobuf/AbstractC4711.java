package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.protobuf.C3530;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4711 implements InterfaceC4698 {
    static {
        int i = C4725.f13799;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m9416(InterfaceC4700 interfaceC4700) {
        if (interfaceC4700 == null || interfaceC4700.isInitialized()) {
        } else {
            throw (interfaceC4700 instanceof AbstractC4712 ? ((AbstractC4712) interfaceC4700).newUninitializedMessageException() : new UninitializedMessageException(interfaceC4700)).asInvalidProtocolBufferException().setUnfinishedMessage(interfaceC4700);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4700 m9417(InputStream inputStream, C4725 c4725) throws InvalidProtocolBufferException {
        InterfaceC4700 interfaceC4700;
        try {
            int i = inputStream.read();
            if (i == -1) {
                interfaceC4700 = null;
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
                C4708 c4708 = new C4708(new C3530(inputStream, i, 1));
                interfaceC4700 = (InterfaceC4700) mo9282(c4708, c4725);
                try {
                    if (c4708.f13761 != 0) {
                        throw InvalidProtocolBufferException.invalidEndTag();
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(interfaceC4700);
                }
            }
            m9416(interfaceC4700);
            return interfaceC4700;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }
}
