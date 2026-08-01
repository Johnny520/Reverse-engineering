package p000;

/* JADX INFO: renamed from: m4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0536m4 implements p000.hq1 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f6929;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f6930;

    public C0536m4(androidx.appcompat.app.AppCompatActivity r2) {
            r1 = this;
            r0 = 0
            r1.f6929 = r0
            r1.<init>()
            r1.f6930 = r2
            return
    }

    public C0536m4(p000.C0574n5 r2) {
            r1 = this;
            r0 = 1
            r1.f6929 = r0
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f6930 = r0
            java.lang.String r0 = "androidx.savedstate.Restarter"
            r2.m3974(r0, r1)
            return
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: α */
    public final android.os.Bundle mo1949() {
            r2 = this;
            int r0 = r2.f6929
            switch(r0) {
                case 0: goto L2d;
                default: goto L5;
            }
        L5:
            r0 = 0
            l91[] r1 = new p000.l91[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            l91[] r0 = (p000.l91[]) r0
            android.os.Bundle r0 = p000.jx0.m3044(r0)
            java.lang.Object r2 = r2.f6930
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            java.util.List r2 = p000.AbstractC0984xh.m6666(r2)
            boolean r1 = r2 instanceof java.util.ArrayList
            if (r1 == 0) goto L21
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            goto L27
        L21:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r2 = r1
        L27:
            java.lang.String r1 = "classes_to_restore"
            r0.putStringArrayList(r1, r2)
            return r0
        L2d:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Object r2 = r2.f6930
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            androidx.appcompat.app.α r2 = r2.m197()
            r2.getClass()
            return r0
    }
}
