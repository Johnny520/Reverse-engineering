package defpackage;

/* JADX INFO: renamed from: ᛷᲇᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1379 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.graphics.Rect[][] f6019;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Rect[][] f6020;

    public AbstractC1379() {
            r1 = this;
            ᲈᛸᛱᲀ r0 = new ᲈᛸᛱᲀ
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public AbstractC1379(defpackage.C2300 r3) {
            r2 = this;
            r2.<init>()
            r0 = 10
            android.graphics.Rect[][] r1 = new android.graphics.Rect[r0][]
            r2.f6019 = r1
            android.graphics.Rect[][] r0 = new android.graphics.Rect[r0][]
            r2.f6020 = r0
            r2.mo2548(r3)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void mo2548(defpackage.C2300 r5) {
            r4 = this;
            r0 = 1
        L1:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L3c
            ᛲᲇᲀᲈ r1 = r5.f9727
            java.util.List r1 = r1.mo1121(r0)
            int r2 = defpackage.AbstractC0069.m513(r0)
            int r3 = r1.size()
            android.graphics.Rect[] r3 = new android.graphics.Rect[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            android.graphics.Rect[] r1 = (android.graphics.Rect[]) r1
            android.graphics.Rect[][] r3 = r4.f6019
            r3[r2] = r1
            r1 = 8
            if (r0 == r1) goto L39
            ᛲᲇᲀᲈ r1 = r5.f9727
            java.util.List r1 = r1.mo1131(r0)
            int r3 = r1.size()
            android.graphics.Rect[] r3 = new android.graphics.Rect[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            android.graphics.Rect[] r1 = (android.graphics.Rect[]) r1
            android.graphics.Rect[][] r3 = r4.f6020
            r3[r2] = r1
        L39:
            int r0 = r0 << 1
            goto L1
        L3c:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2549() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public abstract defpackage.C2300 mo2550();
}
