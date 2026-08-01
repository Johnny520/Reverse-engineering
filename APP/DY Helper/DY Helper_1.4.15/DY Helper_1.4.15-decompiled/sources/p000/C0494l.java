package p000;

/* JADX INFO: renamed from: l */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0494l extends p000.AbstractC0782s1 {

    /* JADX INFO: renamed from: φ */
    public final /* synthetic */ int f6336;

    public /* synthetic */ C0494l(int r1) {
            r0 = this;
            r0.f6336 = r1
            r0.<init>()
            return
    }

    @Override // p000.AbstractC0782s1
    /* JADX INFO: renamed from: φ */
    public final java.lang.Object mo3431(int r5, android.content.Intent r6) {
            r4 = this;
            int r4 = r4.f6336
            switch(r4) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            k r4 = new k
            r4.<init>(r5, r6)
            return r4
        Lb:
            k r4 = new k
            r4.<init>(r5, r6)
            return r4
        L11:
            r4 = -1
            if (r5 == r4) goto L15
            goto L52
        L15:
            if (r6 != 0) goto L18
            goto L52
        L18:
            java.lang.String r4 = "androidx.activity.result.contract.extra.PERMISSIONS"
            java.lang.String[] r4 = r6.getStringArrayExtra(r4)
            java.lang.String r5 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            int[] r5 = r6.getIntArrayExtra(r5)
            if (r5 == 0) goto L52
            if (r4 != 0) goto L29
            goto L52
        L29:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = r5.length
            r6.<init>(r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L32:
            if (r2 >= r0) goto L45
            r3 = r5[r2]
            if (r3 != 0) goto L3a
            r3 = 1
            goto L3b
        L3a:
            r3 = r1
        L3b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L32
        L45:
            java.util.ArrayList r4 = p000.AbstractC0312g7.m2248(r4)
            java.util.ArrayList r4 = p000.AbstractC0984xh.m6672(r4, r6)
            java.util.Map r4 = p000.ex0.m1974(r4)
            goto L54
        L52:
            kz r4 = p000.C0493kz.f6332
        L54:
            return r4
    }
}
