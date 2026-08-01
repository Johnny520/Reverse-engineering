package p000;

/* JADX INFO: renamed from: ze */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1055ze implements java.util.Comparator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f13059;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.C0016af f13060;

    public /* synthetic */ C1055ze(p000.C0016af r1, int r2) {
            r0 = this;
            r0.f13059 = r2
            r0.f13060 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f13059
            switch(r0) {
                case 0: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            af r1 = r1.f13060
            int r3 = p000.C0016af.m96(r1, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            int r1 = p000.C0016af.m96(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = p000.AbstractC0073bd.m877(r3, r1)
            return r1
        L20:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            af r1 = r1.f13060
            int r3 = p000.C0016af.m96(r1, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            int r1 = p000.C0016af.m96(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = p000.AbstractC0073bd.m877(r3, r1)
            return r1
    }
}
