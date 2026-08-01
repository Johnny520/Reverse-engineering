package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛳᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0251 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.graphics.Rect[][] f934;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.graphics.Rect[][] f935;

    public AbstractC0251() {
            r1 = this;
            xhss.ᲀᛳᛲᛶ r0 = new xhss.ᲀᛳᛲᛶ
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public AbstractC0251(xhss.C0847 r3) {
            r2 = this;
            r2.<init>()
            r0 = 10
            android.graphics.Rect[][] r1 = new android.graphics.Rect[r0][]
            r2.f935 = r1
            android.graphics.Rect[][] r0 = new android.graphics.Rect[r0][]
            r2.f934 = r0
            r2.mo556(r3)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public abstract xhss.C0847 mo555();

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public void mo556(xhss.C0847 r5) {
            r4 = this;
            r0 = 1
        L1:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L3c
            xhss.ᛵᛸᛱ r1 = r5.f2754
            java.util.List r1 = r1.mo327(r0)
            int r2 = xhss.C0915.m1495(r0)
            int r3 = r1.size()
            android.graphics.Rect[] r3 = new android.graphics.Rect[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            android.graphics.Rect[] r1 = (android.graphics.Rect[]) r1
            android.graphics.Rect[][] r3 = r4.f935
            r3[r2] = r1
            r1 = 8
            if (r0 == r1) goto L39
            xhss.ᛵᛸᛱ r1 = r5.f2754
            java.util.List r1 = r1.mo334(r0)
            int r3 = r1.size()
            android.graphics.Rect[] r3 = new android.graphics.Rect[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            android.graphics.Rect[] r1 = (android.graphics.Rect[]) r1
            android.graphics.Rect[][] r3 = r4.f934
            r3[r2] = r1
        L39:
            int r0 = r0 << 1
            goto L1
        L3c:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m557() {
            r0 = this;
            return
    }
}
