package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.InterfaceC4691e;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p299ub.AbstractC8611a0;
import p376zd.C9980b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, m16758d2 = {"Lokhttp3/Protocol;", _UrlKt.FRAGMENT_ENCODE_SET, "protocol", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "HTTP_3", "toString", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class Protocol {
    private static final /* synthetic */ InterfaceC7197a $ENTRIES;
    private static final /* synthetic */ Protocol[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String protocol;
    public static final Protocol HTTP_1_0 = new Protocol("HTTP_1_0", 0, "http/1.0");
    public static final Protocol HTTP_1_1 = new Protocol("HTTP_1_1", 1, "http/1.1");

    @InterfaceC4691e
    public static final Protocol SPDY_3 = new Protocol("SPDY_3", 2, "spdy/3.1");
    public static final Protocol HTTP_2 = new Protocol("HTTP_2", 3, "h2");
    public static final Protocol H2_PRIOR_KNOWLEDGE = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final Protocol QUIC = new Protocol("QUIC", 5, "quic");
    public static final Protocol HTTP_3 = new Protocol("HTTP_3", 6, "h3");

    private static final /* synthetic */ Protocol[] $values() {
        return new Protocol[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    static {
        Protocol[] protocolArr$values = $values();
        $VALUES = protocolArr$values;
        $ENTRIES = AbstractC7198b.m28437a(protocolArr$values);
        INSTANCE = new Companion(null);
    }

    private Protocol(String str, int i10, String str2) {
        this.protocol = str2;
    }

    public static final Protocol get(String str) {
        return INSTANCE.get(str);
    }

    public static InterfaceC7197a getEntries() {
        return $ENTRIES;
    }

    public static Protocol valueOf(String str) {
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    public static Protocol[] values() {
        return (Protocol[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m16758d2 = {"Lokhttp3/Protocol$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "get", "Lokhttp3/Protocol;", "protocol", _UrlKt.FRAGMENT_ENCODE_SET, "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final Protocol get(String protocol) throws IOException {
            protocol.getClass();
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (AbstractC1061t.m3842c(protocol, protocol2.protocol)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.HTTP_1_1;
            if (AbstractC1061t.m3842c(protocol, protocol3.protocol)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (AbstractC1061t.m3842c(protocol, protocol4.protocol)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.HTTP_2;
            if (AbstractC1061t.m3842c(protocol, protocol5.protocol)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.SPDY_3;
            if (AbstractC1061t.m3842c(protocol, protocol6.protocol)) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.QUIC;
            if (AbstractC1061t.m3842c(protocol, protocol7.protocol)) {
                return protocol7;
            }
            Protocol protocol8 = Protocol.HTTP_3;
            if (AbstractC8611a0.m33075T(protocol, protocol8.protocol, false, 2, null)) {
                return protocol8;
            }
            C9980b1.m38629a("Unexpected protocol: ", protocol);
            return null;
        }

        private Companion() {
        }
    }
}
