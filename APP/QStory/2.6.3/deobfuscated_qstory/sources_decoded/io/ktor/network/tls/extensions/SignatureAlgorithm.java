package io.ktor.network.tls.extensions;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p255.C8193;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/network/tls/extensions/SignatureAlgorithm;", "", "", "code", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IB)V", "B", "getCode", "()B", "Companion", "飘花落叶言楪兰苏子世哲/飘花落叶言子楪世哲苏兰", "ANON", "RSA", "DSA", "ECDSA", "ED25519", "ED448", "ktor-network-tls"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SignatureAlgorithm {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ SignatureAlgorithm[] $VALUES;
    public static final C8193 Companion;
    private final byte code;
    public static final SignatureAlgorithm ANON = new SignatureAlgorithm("ANON", 0, (byte) 0);
    public static final SignatureAlgorithm RSA = new SignatureAlgorithm("RSA", 1, (byte) 1);
    public static final SignatureAlgorithm DSA = new SignatureAlgorithm("DSA", 2, (byte) 2);
    public static final SignatureAlgorithm ECDSA = new SignatureAlgorithm("ECDSA", 3, (byte) 3);
    public static final SignatureAlgorithm ED25519 = new SignatureAlgorithm("ED25519", 4, (byte) 7);
    public static final SignatureAlgorithm ED448 = new SignatureAlgorithm("ED448", 5, (byte) 8);

    private static final /* synthetic */ SignatureAlgorithm[] $values() {
        return new SignatureAlgorithm[]{ANON, RSA, DSA, ECDSA, ED25519, ED448};
    }

    static {
        SignatureAlgorithm[] signatureAlgorithmArr$values = $values();
        $VALUES = signatureAlgorithmArr$values;
        $ENTRIES = AbstractC4364.m8866(signatureAlgorithmArr$values);
        Companion = new C8193();
    }

    private SignatureAlgorithm(String str, int i, byte b) {
        this.code = b;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static SignatureAlgorithm valueOf(String str) {
        return (SignatureAlgorithm) Enum.valueOf(SignatureAlgorithm.class, str);
    }

    public static SignatureAlgorithm[] values() {
        return (SignatureAlgorithm[]) $VALUES.clone();
    }

    public final byte getCode() {
        return this.code;
    }
}
