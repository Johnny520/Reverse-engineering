package p118X3;

import p049I2.AbstractC0797o;
import p110W0.C1577b;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p155e3.AbstractC2030a;
import p155e3.AbstractC2031b;
import p155e3.EnumC2032c;

/* JADX INFO: renamed from: X3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1693c {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f5788n = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f5789a;

    /* JADX INFO: renamed from: b */
    public final boolean f5790b;

    /* JADX INFO: renamed from: c */
    public final int f5791c;

    /* JADX INFO: renamed from: d */
    public final int f5792d;

    /* JADX INFO: renamed from: e */
    public final boolean f5793e;

    /* JADX INFO: renamed from: f */
    public final boolean f5794f;

    /* JADX INFO: renamed from: g */
    public final boolean f5795g;

    /* JADX INFO: renamed from: h */
    public final int f5796h;

    /* JADX INFO: renamed from: i */
    public final int f5797i;

    /* JADX INFO: renamed from: j */
    public final boolean f5798j;

    /* JADX INFO: renamed from: k */
    public final boolean f5799k;

    /* JADX INFO: renamed from: l */
    public final boolean f5800l;

    /* JADX INFO: renamed from: m */
    public String f5801m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long jM1376D;
        C1577b c1577b = AbstractC2030a.f6765d;
        EnumC2032c enumC2032c = EnumC2032c.SECONDS;
        AbstractC1665j.m2985e(enumC2032c, "unit");
        if (enumC2032c.compareTo(enumC2032c) <= 0) {
            jM1376D = AbstractC1784a.m3227m(Integer.MAX_VALUE, enumC2032c, EnumC2032c.NANOSECONDS) << 1;
            int i5 = AbstractC2031b.f6768a;
        } else {
            jM1376D = AbstractC0797o.m1376D(Integer.MAX_VALUE, enumC2032c);
        }
        long jM3732c = AbstractC2030a.m3732c(jM1376D, enumC2032c);
        if (jM3732c >= 0) {
            return;
        }
        throw new IllegalArgumentException(("maxStale < 0: " + jM3732c).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1693c(boolean z5, boolean z6, int i5, int i6, boolean z7, boolean z8, boolean z9, int i7, int i8, boolean z10, boolean z11, boolean z12, String str) {
        this.f5789a = z5;
        this.f5790b = z6;
        this.f5791c = i5;
        this.f5792d = i6;
        this.f5793e = z7;
        this.f5794f = z8;
        this.f5795g = z9;
        this.f5796h = i7;
        this.f5797i = i8;
        this.f5798j = z10;
        this.f5799k = z11;
        this.f5800l = z12;
        this.f5801m = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f5801m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5789a) {
            sb.append("no-cache, ");
        }
        if (this.f5790b) {
            sb.append("no-store, ");
        }
        int i5 = this.f5791c;
        if (i5 != -1) {
            sb.append("max-age=");
            sb.append(i5);
            sb.append(", ");
        }
        int i6 = this.f5792d;
        if (i6 != -1) {
            sb.append("s-maxage=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f5793e) {
            sb.append("private, ");
        }
        if (this.f5794f) {
            sb.append("public, ");
        }
        if (this.f5795g) {
            sb.append("must-revalidate, ");
        }
        int i7 = this.f5796h;
        if (i7 != -1) {
            sb.append("max-stale=");
            sb.append(i7);
            sb.append(", ");
        }
        int i8 = this.f5797i;
        if (i8 != -1) {
            sb.append("min-fresh=");
            sb.append(i8);
            sb.append(", ");
        }
        if (this.f5798j) {
            sb.append("only-if-cached, ");
        }
        if (this.f5799k) {
            sb.append("no-transform, ");
        }
        if (this.f5800l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        AbstractC1665j.m2984d(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String string = sb.toString();
        this.f5801m = string;
        return string;
    }
}
