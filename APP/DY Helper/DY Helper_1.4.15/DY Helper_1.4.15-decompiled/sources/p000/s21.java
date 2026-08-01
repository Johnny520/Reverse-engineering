package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class s21 implements java.util.Comparator {

    /* JADX INFO: renamed from: β */
    public static final p000.s21 f9688 = null;

    /* JADX INFO: renamed from: γ */
    public static final p000.s21 f9689 = null;

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9690;

    static {
            s21 r0 = new s21
            r1 = 0
            r0.<init>(r1)
            p000.s21.f9688 = r0
            s21 r0 = new s21
            r1 = 1
            r0.<init>(r1)
            p000.s21.f9689 = r0
            return
    }

    public /* synthetic */ s21(int r1) {
            r0 = this;
            r0.f9690 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.f9690
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r1.getClass()
            r2.getClass()
            int r0 = r2.compareTo(r1)
            return r0
        L14:
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r1.getClass()
            r2.getClass()
            int r0 = r1.compareTo(r2)
            return r0
    }

    @Override // java.util.Comparator
    public final java.util.Comparator reversed() {
            r0 = this;
            int r0 = r0.f9690
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            s21 r0 = p000.s21.f9688
            return r0
        L8:
            s21 r0 = p000.s21.f9689
            return r0
    }
}
