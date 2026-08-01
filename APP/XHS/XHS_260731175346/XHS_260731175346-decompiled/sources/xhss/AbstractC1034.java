package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛴᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1034 extends xhss.AbstractC0251 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final android.view.WindowInsets.Builder f3339;

    public AbstractC1034() {
            r1 = this;
            r1.<init>()
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
            r1.f3339 = r0
            return
    }

    @Override // xhss.AbstractC0251
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public xhss.C0847 mo555() {
            r3 = this;
            r3.m557()
            android.view.WindowInsets$Builder r0 = r3.f3339
            android.view.WindowInsets r0 = r0.build()
            r1 = 0
            xhss.ᲀᛳᛲᛶ r0 = xhss.C0847.m1430(r1, r0)
            xhss.ᛵᛸᛱ r2 = r0.f2754
            r2.mo331(r1)
            r2.mo326(r1)
            android.graphics.Rect[][] r1 = r3.f935
            r2.mo324(r1)
            android.graphics.Rect[][] r3 = r3.f934
            r2.mo333(r3)
            return r0
    }
}
