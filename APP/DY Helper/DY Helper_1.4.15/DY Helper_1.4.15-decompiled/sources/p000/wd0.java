package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wd0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.e71 f11685;

    public wd0(p000.e71 r1) {
            r0 = this;
            r0.<init>()
            r0.f11685 = r1
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            s62 r0 = p000.s62.f9751
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            r3.getClass()
            e71 r2 = r2.f11685
            r3.dismiss()     // Catch: java.lang.Throwable -> L16
            r2.invoke()     // Catch: java.lang.Throwable -> L16
            r3 = r0
            goto L1c
        L16:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
        L1c:
            java.lang.Throwable r2 = p000.fo1.m2190(r3)
            if (r2 == 0) goto L2d
            java.lang.String r3 = r2.getMessage()
            java.lang.String r4 = "Dux 确认回调失败: "
            java.lang.String r1 = "r65a3d6a0829c23aa"
            p000.AbstractC0602nx.m4145(r4, r3, r1, r2)
        L2d:
            return r0
    }
}
