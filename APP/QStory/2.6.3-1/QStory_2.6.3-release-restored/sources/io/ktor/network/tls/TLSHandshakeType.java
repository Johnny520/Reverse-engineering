package io.ktor.network.tls;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m151d2 = {"Lio/ktor/network/tls/TLSHandshakeType;", "", "", "code", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "io/ktor/network/tls/飘花落叶言子楪苏哲兰世", "HelloRequest", "ClientHello", "ServerHello", "Certificate", "ServerKeyExchange", "CertificateRequest", "ServerDone", "CertificateVerify", "ClientKeyExchange", "Finished", "ktor-network-tls"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class TLSHandshakeType {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ TLSHandshakeType[] $VALUES;
    public static final C4878 Companion;
    private static final TLSHandshakeType[] byCode;
    private final int code;
    public static final TLSHandshakeType HelloRequest = new TLSHandshakeType("HelloRequest", 0, 0);
    public static final TLSHandshakeType ClientHello = new TLSHandshakeType("ClientHello", 1, 1);
    public static final TLSHandshakeType ServerHello = new TLSHandshakeType("ServerHello", 2, 2);
    public static final TLSHandshakeType Certificate = new TLSHandshakeType("Certificate", 3, 11);
    public static final TLSHandshakeType ServerKeyExchange = new TLSHandshakeType("ServerKeyExchange", 4, 12);
    public static final TLSHandshakeType CertificateRequest = new TLSHandshakeType("CertificateRequest", 5, 13);
    public static final TLSHandshakeType ServerDone = new TLSHandshakeType("ServerDone", 6, 14);
    public static final TLSHandshakeType CertificateVerify = new TLSHandshakeType("CertificateVerify", 7, 15);
    public static final TLSHandshakeType ClientKeyExchange = new TLSHandshakeType("ClientKeyExchange", 8, 16);
    public static final TLSHandshakeType Finished = new TLSHandshakeType("Finished", 9, 20);

    private static final /* synthetic */ TLSHandshakeType[] $values() {
        return new TLSHandshakeType[]{HelloRequest, ClientHello, ServerHello, Certificate, ServerKeyExchange, CertificateRequest, ServerDone, CertificateVerify, ClientKeyExchange, Finished};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object next;
        TLSHandshakeType[] tLSHandshakeTypeArr$values = $values();
        $VALUES = tLSHandshakeTypeArr$values;
        $ENTRIES = AbstractC5196.m9425(tLSHandshakeTypeArr$values);
        Companion = new C4878();
        TLSHandshakeType[] tLSHandshakeTypeArr = new TLSHandshakeType[256];
        for (int i = 0; i < 256; i++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((TLSHandshakeType) next).code == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            tLSHandshakeTypeArr[i] = next;
        }
        byCode = tLSHandshakeTypeArr;
    }

    private TLSHandshakeType(String str, int i, int i2) {
        this.code = i2;
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static TLSHandshakeType valueOf(String str) {
        return (TLSHandshakeType) Enum.valueOf(TLSHandshakeType.class, str);
    }

    public static TLSHandshakeType[] values() {
        return (TLSHandshakeType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
