package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class id2 implements p000.kr0 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.AbstractC0878un f5034;

    public id2(p000.AbstractC0878un r1) {
            r0 = this;
            r0.<init>()
            r0.f5034 = r1
            return
    }

    public final boolean equals(java.lang.Object r10) {
            r9 = this;
            boolean r0 = r10 instanceof p000.kr0
            if (r0 == 0) goto L2d
            boolean r0 = r10 instanceof p000.id2
            if (r0 == 0) goto L2d
            p80 r1 = new p80
            java.lang.String r6 = "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"
            r7 = 0
            r2 = 1
            un r3 = r9.f5034
            java.lang.Class<un> r4 = p000.AbstractC0878un.class
            java.lang.String r5 = "scheduleFrameEndCallback"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            id2 r10 = (p000.id2) r10
            p80 r2 = new p80
            un r4 = r10.f5034
            java.lang.String r7 = "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"
            r8 = 0
            r3 = 1
            java.lang.Class<un> r5 = p000.AbstractC0878un.class
            java.lang.String r6 = "scheduleFrameEndCallback"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            boolean r9 = r1.equals(r2)
            return r9
        L2d:
            r9 = 0
            return r9
    }

    public final int hashCode() {
            r7 = this;
            p80 r0 = new p80
            java.lang.String r5 = "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"
            r6 = 0
            r1 = 1
            un r2 = r7.f5034
            java.lang.Class<un> r3 = p000.AbstractC0878un.class
            java.lang.String r4 = "scheduleFrameEndCallback"
            r0.<init>(r1, r2, r3, r4, r5, r6)
            int r7 = r0.hashCode()
            return r7
    }
}
