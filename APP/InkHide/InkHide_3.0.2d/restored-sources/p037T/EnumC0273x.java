package p037T;

import java.math.BigDecimal;
import p009E0.C0102b;
import p022L.AbstractC0174d;
import p051b0.C0493b;
import p051b0.C0495d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: T.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC0273x {

    /* JADX INFO: renamed from: a */
    public static final C0269t f639a;

    /* JADX INFO: renamed from: b */
    public static final C0270u f640b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC0273x[] f641c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0269t c0269t = new C0269t();
        f639a = c0269t;
        C0270u c0270u = new C0270u();
        f640b = c0270u;
        f641c = new EnumC0273x[]{c0269t, c0270u, new EnumC0273x() { // from class: T.v
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p037T.EnumC0273x
            /* JADX INFO: renamed from: a */
            public final Number mo492a(C0493b c0493b) throws C0495d {
                String strMo584v = c0493b.mo584v();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strMo584v));
                    } catch (NumberFormatException unused) {
                        Double dValueOf = Double.valueOf(strMo584v);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!c0493b.f1547b) {
                                throw new C0495d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c0493b.mo576j());
                            }
                        }
                        return dValueOf;
                    }
                } catch (NumberFormatException e2) {
                    StringBuilder sbM357m = AbstractC0174d.m357m("Cannot parse ", strMo584v, "; at path ");
                    sbM357m.append(c0493b.mo576j());
                    throw new C0102b(sbM357m.toString(), e2);
                }
            }
        }, new EnumC0273x() { // from class: T.w
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p037T.EnumC0273x
            /* JADX INFO: renamed from: a */
            public final Number mo492a(C0493b c0493b) {
                String strMo584v = c0493b.mo584v();
                try {
                    return new BigDecimal(strMo584v);
                } catch (NumberFormatException e2) {
                    StringBuilder sbM357m = AbstractC0174d.m357m("Cannot parse ", strMo584v, "; at path ");
                    sbM357m.append(c0493b.mo576j());
                    throw new C0102b(sbM357m.toString(), e2);
                }
            }
        }};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0273x valueOf(String str) {
        return (EnumC0273x) Enum.valueOf(EnumC0273x.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0273x[] values() {
        return (EnumC0273x[]) f641c.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract Number mo492a(C0493b c0493b);
}
