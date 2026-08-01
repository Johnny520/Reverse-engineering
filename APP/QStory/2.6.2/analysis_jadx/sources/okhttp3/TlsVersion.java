package okhttp3;

import kotlin.InterfaceC5168;
import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;
import p015.C6192;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/TlsVersion;", "", "", "javaName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;)V", "-deprecated_javaName", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "飘花落叶言世兰楪子苏哲/飘花落叶言子世哲楪兰苏", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TlsVersion {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ TlsVersion[] $VALUES;
    public static final C6192 Companion;
    private final String javaName;
    public static final TlsVersion TLS_1_3 = new TlsVersion("TLS_1_3", 0, "TLSv1.3");
    public static final TlsVersion TLS_1_2 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
    public static final TlsVersion TLS_1_1 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
    public static final TlsVersion TLS_1_0 = new TlsVersion("TLS_1_0", 3, "TLSv1");
    public static final TlsVersion SSL_3_0 = new TlsVersion("SSL_3_0", 4, "SSLv3");

    private static final /* synthetic */ TlsVersion[] $values() {
        return new TlsVersion[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    static {
        TlsVersion[] tlsVersionArr$values = $values();
        $VALUES = tlsVersionArr$values;
        $ENTRIES = AbstractC4363.m8876(tlsVersionArr$values);
        Companion = new C6192();
    }

    private TlsVersion(String str, int i, String str2) {
        this.javaName = str2;
    }

    public static final TlsVersion forJavaName(String str) {
        Companion.getClass();
        return C6192.m11643(str);
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static TlsVersion valueOf(String str) {
        return (TlsVersion) Enum.valueOf(TlsVersion.class, str);
    }

    public static TlsVersion[] values() {
        return (TlsVersion[]) $VALUES.clone();
    }

    @InterfaceC5168
    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name and from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
