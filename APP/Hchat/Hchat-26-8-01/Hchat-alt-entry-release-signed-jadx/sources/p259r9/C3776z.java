package p259r9;

import java.time.format.DateTimeFormatter;
import java.util.Set;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: r9.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3776z {

    /* JADX INFO: renamed from: a */
    public final boolean f12352a;

    /* JADX INFO: renamed from: b */
    public final String f12353b;

    /* JADX INFO: renamed from: c */
    public final String f12354c;

    /* JADX INFO: renamed from: d */
    public final Set f12355d;

    /* JADX INFO: renamed from: e */
    public final DateTimeFormatter f12356e;

    /* JADX INFO: renamed from: f */
    public final float f12357f;

    /* JADX INFO: renamed from: g */
    public final int f12358g;

    /* JADX INFO: renamed from: h */
    public final int f12359h;

    /* JADX INFO: renamed from: i */
    public final int f12360i;

    /* JADX INFO: renamed from: j */
    public final boolean f12361j;

    /* JADX INFO: renamed from: k */
    public final int f12362k;

    /* JADX INFO: renamed from: l */
    public final int f12363l;

    /* JADX INFO: renamed from: m */
    public final int f12364m;

    /* JADX INFO: renamed from: n */
    public final int f12365n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3776z(boolean z9, String str, String str2, Set set, DateTimeFormatter dateTimeFormatter, float f3, int i9, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        this.f12352a = z9;
        this.f12353b = str;
        this.f12354c = str2;
        this.f12355d = set;
        this.f12356e = dateTimeFormatter;
        this.f12357f = f3;
        this.f12358g = i9;
        this.f12359h = i10;
        this.f12360i = i11;
        this.f12361j = z10;
        this.f12362k = i12;
        this.f12363l = i13;
        this.f12364m = i14;
        this.f12365n = i15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3776z)) {
            return false;
        }
        C3776z c3776z = (C3776z) obj;
        return this.f12352a == c3776z.f12352a && this.f12353b.equals(c3776z.f12353b) && this.f12354c.equals(c3776z.f12354c) && this.f12355d.equals(c3776z.f12355d) && this.f12356e.equals(c3776z.f12356e) && Float.compare(this.f12357f, c3776z.f12357f) == 0 && this.f12358g == c3776z.f12358g && this.f12359h == c3776z.f12359h && this.f12360i == c3776z.f12360i && this.f12361j == c3776z.f12361j && this.f12362k == c3776z.f12362k && this.f12363l == c3776z.f12363l && this.f12364m == c3776z.f12364m && this.f12365n == c3776z.f12365n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f12365n) + AbstractC0921a.m2242e(this.f12364m, AbstractC0921a.m2242e(this.f12363l, AbstractC0921a.m2242e(this.f12362k, AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f12360i, AbstractC0921a.m2242e(this.f12359h, AbstractC0921a.m2242e(this.f12358g, AbstractC0921a.m2241d(this.f12357f, (this.f12356e.hashCode() + ((this.f12355d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(Boolean.hashCode(this.f12352a) * 31, 31, this.f12353b), 31, this.f12354c)) * 31)) * 31, 31), 31), 31), 31), 31, this.f12361j), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageDetailsConfig(enabled=");
        sb2.append(this.f12352a);
        sb2.append(", position=");
        sb2.append(this.f12353b);
        sb2.append(", format=");
        sb2.append(this.f12354c);
        sb2.append(", tokens=");
        sb2.append(this.f12355d);
        sb2.append(", timeFormatter=");
        sb2.append(this.f12356e);
        sb2.append(", textSizeSp=");
        sb2.append(this.f12357f);
        sb2.append(", avatarGapDp=");
        AbstractC4855en.m9272p(sb2, this.f12358g, ", leftMarginDp=", this.f12359h, ", rightMarginDp=");
        sb2.append(this.f12360i);
        sb2.append(", clickShow=");
        sb2.append(this.f12361j);
        sb2.append(", lightTextColor=");
        AbstractC4855en.m9272p(sb2, this.f12362k, ", darkTextColor=", this.f12363l, ", lightBgColor=");
        sb2.append(this.f12364m);
        sb2.append(", darkBgColor=");
        sb2.append(this.f12365n);
        sb2.append(")");
        return sb2.toString();
    }
}
