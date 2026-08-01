package io.ktor.network.tls.extensions;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p255.C8192;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/network/tls/extensions/TLSExtensionType;", "", "", "code", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IS)V", "S", "getCode", "()S", "Companion", "飘花落叶言楪兰苏子世哲/飘花落叶言子楪世哲兰苏", "SERVER_NAME", "MAX_FRAGMENT_LENGTH", "CLIENT_CERTIFICATE_URL", "TRUSTED_CA_KEYS", "TRUNCATED_HMAC", "STATUS_REQUEST", "ELLIPTIC_CURVES", "EC_POINT_FORMAT", "SIGNATURE_ALGORITHMS", "ktor-network-tls"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TLSExtensionType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ TLSExtensionType[] $VALUES;
    public static final C8192 Companion;
    private final short code;
    public static final TLSExtensionType SERVER_NAME = new TLSExtensionType("SERVER_NAME", 0, 0);
    public static final TLSExtensionType MAX_FRAGMENT_LENGTH = new TLSExtensionType("MAX_FRAGMENT_LENGTH", 1, 1);
    public static final TLSExtensionType CLIENT_CERTIFICATE_URL = new TLSExtensionType("CLIENT_CERTIFICATE_URL", 2, 2);
    public static final TLSExtensionType TRUSTED_CA_KEYS = new TLSExtensionType("TRUSTED_CA_KEYS", 3, 3);
    public static final TLSExtensionType TRUNCATED_HMAC = new TLSExtensionType("TRUNCATED_HMAC", 4, 4);
    public static final TLSExtensionType STATUS_REQUEST = new TLSExtensionType("STATUS_REQUEST", 5, 5);
    public static final TLSExtensionType ELLIPTIC_CURVES = new TLSExtensionType("ELLIPTIC_CURVES", 6, 10);
    public static final TLSExtensionType EC_POINT_FORMAT = new TLSExtensionType("EC_POINT_FORMAT", 7, 11);
    public static final TLSExtensionType SIGNATURE_ALGORITHMS = new TLSExtensionType("SIGNATURE_ALGORITHMS", 8, 13);

    private static final /* synthetic */ TLSExtensionType[] $values() {
        return new TLSExtensionType[]{SERVER_NAME, MAX_FRAGMENT_LENGTH, CLIENT_CERTIFICATE_URL, TRUSTED_CA_KEYS, TRUNCATED_HMAC, STATUS_REQUEST, ELLIPTIC_CURVES, EC_POINT_FORMAT, SIGNATURE_ALGORITHMS};
    }

    static {
        TLSExtensionType[] tLSExtensionTypeArr$values = $values();
        $VALUES = tLSExtensionTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(tLSExtensionTypeArr$values);
        Companion = new C8192();
    }

    private TLSExtensionType(String str, int i, short s) {
        this.code = s;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static TLSExtensionType valueOf(String str) {
        return (TLSExtensionType) Enum.valueOf(TLSExtensionType.class, str);
    }

    public static TLSExtensionType[] values() {
        return (TLSExtensionType[]) $VALUES.clone();
    }

    public final short getCode() {
        return this.code;
    }
}
