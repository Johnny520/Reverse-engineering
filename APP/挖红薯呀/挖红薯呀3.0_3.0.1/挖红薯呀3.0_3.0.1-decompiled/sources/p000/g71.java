package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class g71 {

    /* JADX INFO: renamed from: a */
    public final f71 f1879a;

    /* JADX INFO: renamed from: b */
    public final ng0 f1880b;

    /* JADX INFO: renamed from: c */
    public final long f1881c;

    /* JADX INFO: renamed from: d */
    public final float f1882d;

    /* JADX INFO: renamed from: e */
    public final float f1883e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f1884f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g71(f71 f71Var, ng0 ng0Var, long j) {
        this.f1879a = f71Var;
        this.f1880b = ng0Var;
        this.f1881c = j;
        ArrayList arrayList = (ArrayList) ng0Var.f4262e;
        float fM795c = 0.0f;
        this.f1882d = arrayList.isEmpty() ? 0.0f : ((wo0) arrayList.get(0)).f7159a.f7540d.m795c(0);
        ArrayList arrayList2 = (ArrayList) ng0Var.f4262e;
        if (!arrayList2.isEmpty()) {
            wo0 wo0Var = (wo0) AbstractC0960ye.m5246P(arrayList2);
            fM795c = wo0Var.f7159a.f7540d.m795c(r3.f1327f - 1) + wo0Var.f7164f;
        }
        this.f1883e = fM795c;
        this.f1884f = (ArrayList) ng0Var.f4261d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1227a(int i) {
        ng0 ng0Var = this.f1880b;
        ArrayList arrayList = (ArrayList) ng0Var.f4262e;
        wo0 wo0Var = (wo0) arrayList.get(i >= ((C0200f8) ((C0681r9) ng0Var.f4260c).f5327a).f1625e.length() ? o30.m2778r(arrayList) : i < 0 ? 0 : w60.m4910q(i, arrayList));
        return wo0Var.f7159a.f7540d.f1326e.getLineForOffset(wo0Var.m5013a(i)) + wo0Var.f7162d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m1228b(float f) {
        ArrayList arrayList = (ArrayList) this.f1880b.f4262e;
        int size = 0;
        if (f > 0.0f) {
            if (f < ((wo0) AbstractC0960ye.m5246P(arrayList)).f7165g) {
                int size2 = arrayList.size() - 1;
                int i = 0;
                while (true) {
                    if (i > size2) {
                        size = -(i + 1);
                        break;
                    }
                    int i2 = (i + size2) >>> 1;
                    wo0 wo0Var = (wo0) arrayList.get(i2);
                    byte b = wo0Var.f7164f > f ? (byte) 1 : wo0Var.f7165g <= f ? (byte) -1 : (byte) 0;
                    if (b >= 0) {
                        if (b <= 0) {
                            size = i2;
                            break;
                        }
                        size2 = i2 - 1;
                    } else {
                        i = i2 + 1;
                    }
                }
            } else {
                size = arrayList.size() - 1;
            }
        }
        wo0 wo0Var2 = (wo0) arrayList.get(size);
        int i3 = wo0Var2.f7161c;
        int i4 = wo0Var2.f7162d;
        if (i3 - wo0Var2.f7160b == 0) {
            return i4;
        }
        C0951y5 c0951y5 = wo0Var2.f7159a;
        float f2 = f - wo0Var2.f7164f;
        e71 e71Var = c0951y5.f7540d;
        return e71Var.f1326e.getLineForVertical(((int) f2) - e71Var.f1328g) + i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m1229c(int i) {
        ng0 ng0Var = this.f1880b;
        ng0Var.m2703b(i);
        ArrayList arrayList = (ArrayList) ng0Var.f4262e;
        wo0 wo0Var = (wo0) arrayList.get(w60.m4911r(i, arrayList));
        C0951y5 c0951y5 = wo0Var.f7159a;
        return c0951y5.f7540d.f1326e.getLineStart(i - wo0Var.f7162d) + wo0Var.f7160b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m1230d(int i) {
        ng0 ng0Var = this.f1880b;
        ng0Var.m2703b(i);
        ArrayList arrayList = (ArrayList) ng0Var.f4262e;
        wo0 wo0Var = (wo0) arrayList.get(w60.m4911r(i, arrayList));
        C0951y5 c0951y5 = wo0Var.f7159a;
        return c0951y5.f7540d.m798f(i - wo0Var.f7162d) + wo0Var.f7164f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final wu0 m1231e(int i) {
        ng0 ng0Var = this.f1880b;
        C0200f8 c0200f8 = (C0200f8) ((C0681r9) ng0Var.f4260c).f5327a;
        if (i < 0 || i > c0200f8.f1625e.length()) {
            x10.m5082a("offset(" + i + ") is out of bounds [0, " + c0200f8.f1625e.length() + ']');
        }
        int length = ((C0200f8) ((C0681r9) ng0Var.f4260c).f5327a).f1625e.length();
        ArrayList arrayList = (ArrayList) ng0Var.f4262e;
        wo0 wo0Var = (wo0) arrayList.get(i == length ? o30.m2778r(arrayList) : w60.m4910q(i, arrayList));
        C0951y5 c0951y5 = wo0Var.f7159a;
        int iM5013a = wo0Var.m5013a(i);
        e71 e71Var = c0951y5.f7540d;
        return e71Var.f1326e.getParagraphDirection(e71Var.f1326e.getLineForOffset(iM5013a)) == 1 ? wu0.f7190d : wu0.f7191e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g71)) {
            return false;
        }
        g71 g71Var = (g71) obj;
        return p30.m3002l(this.f1879a, g71Var.f1879a) && p30.m3002l(this.f1880b, g71Var.f1880b) && d30.m628a(this.f1881c, g71Var.f1881c) && this.f1882d == g71Var.f1882d && this.f1883e == g71Var.f1883e && p30.m3002l(this.f1884f, g71Var.f1884f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1884f.hashCode() + AbstractC0748t1.m4143a(this.f1883e, AbstractC0748t1.m4143a(this.f1882d, AbstractC0748t1.m4146d(this.f1881c, (this.f1880b.hashCode() + (this.f1879a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f1879a + ", multiParagraph=" + this.f1880b + ", size=" + ((Object) d30.m629b(this.f1881c)) + ", firstBaseline=" + this.f1882d + ", lastBaseline=" + this.f1883e + ", placeholderRects=" + this.f1884f + ')';
    }
}
