package p166l7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import p209o7.C3076j;
import p229p7.C3331a;
import p229p7.C3341k;
import p257r7.C3735y;
import p273s7.C3933b;
import p273s7.C3934c;
import p298u7.C4281d;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: l7.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2525m extends AbstractC2513a implements Iterable, Comparable {

    /* JADX INFO: renamed from: o */
    public final C3933b f8159o;

    /* JADX INFO: renamed from: p */
    public C3735y f8160p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2525m() {
        C3341k c3341k = new C3341k();
        super(c3341k, 2);
        C3934c c3934c = new C3934c(c3341k.f10753t);
        C3933b c3933b = new C3933b(c3341k, c3934c);
        this.f8159o = c3933b;
        m6539P(c3934c);
        m6539P(c3933b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static String m5932W(String str) {
        char cCharAt;
        while (str.length() > 0 && ((cCharAt = str.charAt(0)) == '*' || cCharAt == '+' || cCharAt == '^')) {
            str = str.substring(1);
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    public final void mo5560M() {
        ((C3341k) this.f8138m).f10755v.mo5562c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2525m c2525m) {
        C3331a c3331a = this.f8138m;
        int i9 = ((C3341k) c3331a).f10751r.get();
        C3331a c3331a2 = c2525m.f8138m;
        C3331a c3331a3 = c2525m.f8138m;
        int i10 = ((C3341k) c3331a2).f10751r.get();
        if (i9 != i10) {
            return AbstractC5999a.m10739b(i9, i10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((((C3341k) c3331a).f10752s.get() & 3) == 1 ? "1" : "0");
        sb2.append(((C3341k) c3331a).f10755v.m8942T());
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((((C3341k) c3331a3).f10752s.get() & 3) == 1 ? "1" : "0");
        sb3.append(((C3341k) c3331a3).f10755v.m8942T());
        return string.compareTo(sb3.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX INFO: renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m5934V() {
        C2518f c2518f;
        C3735y c3735yM8604c0;
        C3735y c3735y = this.f8160p;
        C3331a c3331a = this.f8138m;
        if (c3735y != null) {
            C4281d c4281d = (C4281d) c3735y.m5553u(C4281d.class);
            int i9 = c3735y.f7657g;
            if ((c4281d != null ? i9 + 1 + c4281d.f14200t.f12083n : i9 + 1) == ((C3341k) c3331a).f10751r.f12076k[0]) {
                c3735yM8604c0 = this.f8160p;
            } else {
                this.f8160p = null;
                C3076j c3076j = (C3076j) m5553u(C3076j.class);
                c2518f = c3076j == null ? (C2518f) c3076j.m5553u(C2518f.class) : null;
                if (c2518f != null) {
                    c3735yM8604c0 = null;
                } else {
                    c3735yM8604c0 = c2518f.f8145o.m8604c0(((C3341k) c3331a).f10751r.get());
                    this.f8160p = c3735yM8604c0;
                }
            }
        } else {
            C3076j c3076j2 = (C3076j) m5553u(C3076j.class);
            if (c3076j2 == null) {
            }
            if (c2518f != null) {
            }
        }
        if (c3735yM8604c0 != null) {
            return c3735yM8604c0.f12101m;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f8159o.m8125n0(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m5549K(byteArrayOutputStream);
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    public final String toString() {
        return m5934V() + '{' + this.f8138m + '}';
    }

    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
    }
}
