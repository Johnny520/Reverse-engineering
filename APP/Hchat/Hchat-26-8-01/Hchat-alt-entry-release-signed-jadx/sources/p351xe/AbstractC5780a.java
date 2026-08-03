package p351xe;

import java.util.Objects;
import mh.AbstractC2846d;
import p020b5.C0192k;
import p157kd.C2389c;

/* JADX INFO: renamed from: xe.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5780a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(AbstractC5780a.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10465a(String str, String str2) {
        if (Objects.equals(str, str2)) {
            return str;
        }
        if (C5796q.m10501g(str) || C5796q.m10501g(str2)) {
            return (str == null || str.isEmpty()) ? str2 : str;
        }
        C0192k c0192k = new C0192k();
        C5796q.m10503j(str, new C2389c(c0192k, 3));
        C0192k c0192k2 = new C0192k();
        C5796q.m10503j(str2, new C2389c(c0192k2, 3));
        int i9 = c0192k.f489c;
        if (i9 != 0 || c0192k2.f489c != 0) {
            float f3 = i9 / c0192k.f488b;
            float f10 = c0192k2.f489c / c0192k2.f488b;
            if (Math.abs(f10 - f3) >= 0.001d) {
                return f3 <= f10 ? str : str2;
            }
        }
        if (c0192k.f488b >= c0192k2.f488b) {
        }
    }
}
