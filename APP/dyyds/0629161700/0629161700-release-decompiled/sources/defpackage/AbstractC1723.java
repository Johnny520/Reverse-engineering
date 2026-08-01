package defpackage;

/* JADX INFO: renamed from: ᲀᛸᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1723 implements defpackage.InterfaceC0696 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f7642;

    public AbstractC1723(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto L10;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r0 = 20
            r2.<init>(r0)
            r1.f7642 = r2
            return
        L10:
            r1.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f7642 = r2
            return
    }

    public AbstractC1723(defpackage.InterfaceC1035 r1) {
            r0 = this;
            r0.<init>()
            r0.f7642 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m3106(defpackage.InterfaceC1111 r3) {
            r2 = this;
            java.lang.Object r2 = r2.f7642
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            int r0 = r2.size()
            r1 = 20
            if (r0 >= r1) goto Lf
            r2.offer(r3)
        Lf:
            return
    }

    @Override // defpackage.InterfaceC0696
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public defpackage.InterfaceC2267 mo365(defpackage.C1326 r2) {
            r1 = this;
            ᛷᲀᲀᲇ r2 = new ᛷᲀᲀᲇ
            java.lang.Object r1 = r1.f7642
            ᛶᛳᛵᛵ r1 = (defpackage.InterfaceC1035) r1
            r0 = 2
            r2.<init>(r0, r1)
            return r2
    }
}
