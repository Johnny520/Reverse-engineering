package io.ktor.network.tls.extensions;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p255.C8195;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lio/ktor/network/tls/extensions/HashAlgorithm;", "", "", "code", "", "openSSLName", "macName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V", "B", "getCode", "()B", "Ljava/lang/String;", "getOpenSSLName", "()Ljava/lang/String;", "getMacName", "Companion", "飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏哲兰", "NONE", "MD5", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "INTRINSIC", "ktor-network-tls"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HashAlgorithm {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ HashAlgorithm[] $VALUES;
    public static final C8195 Companion;
    private final byte code;
    private final String macName;
    private final String openSSLName;
    public static final HashAlgorithm NONE = new HashAlgorithm("NONE", 0, (byte) 0, "", "");
    public static final HashAlgorithm MD5 = new HashAlgorithm("MD5", 1, (byte) 1, "MD5", "HmacMD5");
    public static final HashAlgorithm SHA1 = new HashAlgorithm("SHA1", 2, (byte) 2, "SHA-1", "HmacSHA1");
    public static final HashAlgorithm SHA224 = new HashAlgorithm("SHA224", 3, (byte) 3, "SHA-224", "HmacSHA224");
    public static final HashAlgorithm SHA256 = new HashAlgorithm("SHA256", 4, (byte) 4, "SHA-256", "HmacSHA256");
    public static final HashAlgorithm SHA384 = new HashAlgorithm("SHA384", 5, (byte) 5, "SHA-384", "HmacSHA384");
    public static final HashAlgorithm SHA512 = new HashAlgorithm("SHA512", 6, (byte) 6, "SHA-512", "HmacSHA512");
    public static final HashAlgorithm INTRINSIC = new HashAlgorithm("INTRINSIC", 7, (byte) 8, "INTRINSIC", "Intrinsic");

    private static final /* synthetic */ HashAlgorithm[] $values() {
        return new HashAlgorithm[]{NONE, MD5, SHA1, SHA224, SHA256, SHA384, SHA512, INTRINSIC};
    }

    static {
        HashAlgorithm[] hashAlgorithmArr$values = $values();
        $VALUES = hashAlgorithmArr$values;
        $ENTRIES = AbstractC4364.m8866(hashAlgorithmArr$values);
        Companion = new C8195();
    }

    private HashAlgorithm(String str, int i, byte b, String str2, String str3) {
        this.code = b;
        this.openSSLName = str2;
        this.macName = str3;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static HashAlgorithm valueOf(String str) {
        return (HashAlgorithm) Enum.valueOf(HashAlgorithm.class, str);
    }

    public static HashAlgorithm[] values() {
        return (HashAlgorithm[]) $VALUES.clone();
    }

    public final byte getCode() {
        return this.code;
    }

    public final String getMacName() {
        return this.macName;
    }

    public final String getOpenSSLName() {
        return this.openSSLName;
    }
}
