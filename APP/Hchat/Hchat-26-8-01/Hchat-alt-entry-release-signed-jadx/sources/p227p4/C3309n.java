package p227p4;

import bsh.C0353j;
import p136j8.C2104o;
import p295u4.C4265o;
import p311v4.C4451c0;
import p311v4.C4453d0;

/* JADX INFO: renamed from: p4.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3309n implements Comparable {

    /* JADX INFO: renamed from: g */
    public final int f10668g;

    /* JADX INFO: renamed from: h */
    public final int f10669h;

    /* JADX INFO: renamed from: i */
    public final C4265o f10670i;

    /* JADX INFO: renamed from: j */
    public final C4453d0 f10671j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3309n(int i9, int i10, C4265o c4265o) {
        if (i9 < 0) {
            C2104o.m5294t("address < 0");
            throw null;
        }
        if (i10 == 0) {
            C0353j.m1305c("disposition == null");
            throw null;
        }
        try {
            if (c4265o.f13967i == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f10668g = i9;
            this.f10669h = i10;
            this.f10670i = c4265o;
            this.f10671j = C4453d0.m8902l(c4265o.f13966h.getType());
        } catch (NullPointerException unused) {
            C0353j.m1305c("spec == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3309n c3309n) {
        int i9 = c3309n.f10668g;
        int i10 = this.f10668g;
        if (i10 < i9) {
            return -1;
        }
        if (i10 <= i9) {
            boolean z9 = this.f10669h == 1;
            if (z9 == (c3309n.f10669h == 1)) {
                return this.f10670i.compareTo(c3309n.f10670i);
            }
            if (!z9) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C4451c0 m6997b() {
        return this.f10670i.f13967i.f13959h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C3309n) && compareTo((C3309n) obj) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(this.f10668g));
        sb2.append(" ");
        switch (this.f10669h) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "END_SIMPLY";
                break;
            case 3:
                str = "END_REPLACED";
                break;
            case 4:
                str = "END_MOVED";
                break;
            case 5:
                str = "END_CLOBBERED_BY_PREV";
                break;
            case 6:
                str = "END_CLOBBERED_BY_NEXT";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f10670i);
        return sb2.toString();
    }
}
