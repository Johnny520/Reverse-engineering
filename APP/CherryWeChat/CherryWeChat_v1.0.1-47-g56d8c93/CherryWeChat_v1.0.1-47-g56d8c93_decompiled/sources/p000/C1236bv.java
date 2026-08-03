package p000;

/* JADX INFO: renamed from: bv */
/* JADX INFO: loaded from: classes.dex */
public final class C1236bv {

    /* JADX INFO: renamed from: a */
    public final AbstractC0043B f4203a;

    /* JADX INFO: renamed from: b */
    public final String f4204b;

    /* JADX INFO: renamed from: c */
    public final Object[] f4205c;

    /* JADX INFO: renamed from: d */
    public final int f4206d;

    public C1236bv(AbstractC0043B abstractC0043B, String str, Object[] objArr) {
        this.f4203a = abstractC0043B;
        this.f4204b = str;
        this.f4205c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f4206d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f4206d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }
}
