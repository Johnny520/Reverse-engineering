package io.ktor.network.tls.extensions;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;
import p255.C8193;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006)"}, d2 = {"Lio/ktor/network/tls/extensions/NamedCurve;", "", "", "code", "", "fieldSize", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ISI)V", "S", "getCode", "()S", "I", "getFieldSize", "()I", "Companion", "飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲", "sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "ktor-network-tls"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NamedCurve {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ NamedCurve[] $VALUES;
    public static final C8193 Companion;
    private final short code;
    private final int fieldSize;
    public static final NamedCurve sect163k1 = new NamedCurve("sect163k1", 0, 1, 163);
    public static final NamedCurve sect163r1 = new NamedCurve("sect163r1", 1, 2, 163);
    public static final NamedCurve sect163r2 = new NamedCurve("sect163r2", 2, 3, 163);
    public static final NamedCurve sect193r1 = new NamedCurve("sect193r1", 3, 4, 193);
    public static final NamedCurve sect193r2 = new NamedCurve("sect193r2", 4, 5, 193);
    public static final NamedCurve sect233k1 = new NamedCurve("sect233k1", 5, 6, 233);
    public static final NamedCurve sect233r1 = new NamedCurve("sect233r1", 6, 7, 233);
    public static final NamedCurve sect239k1 = new NamedCurve("sect239k1", 7, 8, 239);
    public static final NamedCurve sect283k1 = new NamedCurve("sect283k1", 8, 9, 283);
    public static final NamedCurve sect283r1 = new NamedCurve("sect283r1", 9, 10, 283);
    public static final NamedCurve sect409k1 = new NamedCurve("sect409k1", 10, 11, 409);
    public static final NamedCurve sect409r1 = new NamedCurve("sect409r1", 11, 12, 409);
    public static final NamedCurve sect571k1 = new NamedCurve("sect571k1", 12, 13, 571);
    public static final NamedCurve sect571r1 = new NamedCurve("sect571r1", 13, 14, 571);
    public static final NamedCurve secp160k1 = new NamedCurve("secp160k1", 14, 15, 160);
    public static final NamedCurve secp160r1 = new NamedCurve("secp160r1", 15, 16, 160);
    public static final NamedCurve secp160r2 = new NamedCurve("secp160r2", 16, 17, 160);
    public static final NamedCurve secp192k1 = new NamedCurve("secp192k1", 17, 18, 192);
    public static final NamedCurve secp192r1 = new NamedCurve("secp192r1", 18, 19, 192);
    public static final NamedCurve secp224k1 = new NamedCurve("secp224k1", 19, 20, Opcodes.SHL_INT_LIT8);
    public static final NamedCurve secp224r1 = new NamedCurve("secp224r1", 20, 21, Opcodes.SHL_INT_LIT8);
    public static final NamedCurve secp256k1 = new NamedCurve("secp256k1", 21, 22, 256);
    public static final NamedCurve secp256r1 = new NamedCurve("secp256r1", 22, 23, 256);
    public static final NamedCurve secp384r1 = new NamedCurve("secp384r1", 23, 24, 384);
    public static final NamedCurve secp521r1 = new NamedCurve("secp521r1", 24, 25, 521);

    private static final /* synthetic */ NamedCurve[] $values() {
        return new NamedCurve[]{sect163k1, sect163r1, sect163r2, sect193r1, sect193r2, sect233k1, sect233r1, sect239k1, sect283k1, sect283r1, sect409k1, sect409r1, sect571k1, sect571r1, secp160k1, secp160r1, secp160r2, secp192k1, secp192r1, secp224k1, secp224r1, secp256k1, secp256r1, secp384r1, secp521r1};
    }

    static {
        NamedCurve[] namedCurveArr$values = $values();
        $VALUES = namedCurveArr$values;
        $ENTRIES = AbstractC4363.m8876(namedCurveArr$values);
        Companion = new C8193();
    }

    private NamedCurve(String str, int i, short s, int i2) {
        this.code = s;
        this.fieldSize = i2;
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static NamedCurve valueOf(String str) {
        return (NamedCurve) Enum.valueOf(NamedCurve.class, str);
    }

    public static NamedCurve[] values() {
        return (NamedCurve[]) $VALUES.clone();
    }

    public final short getCode() {
        return this.code;
    }

    public final int getFieldSize() {
        return this.fieldSize;
    }
}
