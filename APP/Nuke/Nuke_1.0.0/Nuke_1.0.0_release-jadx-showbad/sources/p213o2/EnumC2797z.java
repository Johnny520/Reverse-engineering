package p213o2;

import java.io.IOException;
import p027E4.C0330q;
import p224q2.AbstractC2917h;
import p258w2.C3390a;
import p258w2.C3392c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o2.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC2797z {

    /* JADX INFO: renamed from: d */
    public static final C2793v f8820d;

    /* JADX INFO: renamed from: e */
    public static final C2794w f8821e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC2797z[] f8822f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2793v c2793v = new C2793v();
        f8820d = c2793v;
        C2794w c2794w = new C2794w();
        f8821e = c2794w;
        f8822f = new EnumC2797z[]{c2793v, c2794w, new EnumC2797z() { // from class: o2.x
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: b */
            public static Double m4985b(String str, C3390a c3390a) throws C3392c {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (c3390a.f10598r != 1) {
                            throw new C3392c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c3390a.m5646m(true));
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e5) {
                    throw new C0330q("Cannot parse " + str + "; at path " + c3390a.m5646m(true), e5);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p213o2.EnumC2797z
            /* JADX INFO: renamed from: a */
            public final Number mo4984a(C3390a c3390a) throws IOException {
                String strM5628H = c3390a.m5628H();
                if (strM5628H.indexOf(46) >= 0) {
                    return m4985b(strM5628H, c3390a);
                }
                try {
                    return Long.valueOf(Long.parseLong(strM5628H));
                } catch (NumberFormatException unused) {
                    return m4985b(strM5628H, c3390a);
                }
            }
        }, new EnumC2797z() { // from class: o2.y
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p213o2.EnumC2797z
            /* JADX INFO: renamed from: a */
            public final Number mo4984a(C3390a c3390a) throws IOException {
                String strM5628H = c3390a.m5628H();
                try {
                    return AbstractC2917h.m5117i(strM5628H);
                } catch (NumberFormatException e5) {
                    throw new C0330q("Cannot parse " + strM5628H + "; at path " + c3390a.m5646m(true), e5);
                }
            }
        }};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2797z valueOf(String str) {
        return (EnumC2797z) Enum.valueOf(EnumC2797z.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2797z[] values() {
        return (EnumC2797z[]) f8822f.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract Number mo4984a(C3390a c3390a);
}
