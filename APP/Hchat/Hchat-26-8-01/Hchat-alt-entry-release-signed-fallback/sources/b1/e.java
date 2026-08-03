package b1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gg.q f434h;

    public e(androidx.lifecycle.x r1, b1.h r2, gg.q r3) {
            r0 = this;
            r1 = 0
            r0.f433g = r1
            r0.f434h = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    public e(gg.q r2) {
            r1 = this;
            r0 = 1
            r1.f433g = r0
            r1.f434h = r2
            r2 = 1
            r1.<init>(r2)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f433g
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            s1.f r2 = (s1.f) r2
            boolean r2 = r2.f12228w
            if (r2 == 0) goto L13
            gg.q r2 = r1.f434h
            r0 = 0
            r2.f4560g = r0
            x1.d2 r2 = x1.d2.f20874i
            goto L15
        L13:
            x1.d2 r2 = x1.d2.f20872g
        L15:
            return r2
        L16:
            b1.h r2 = (b1.h) r2
            boolean r0 = r2.f21832t
            if (r0 != 0) goto L1f
            x1.d2 r2 = x1.d2.f20873h
            goto L34
        L1f:
            b1.h r0 = r2.f442v
            if (r0 != 0) goto L24
            goto L29
        L24:
            java.lang.String r0 = "DragAndDropTarget self reference must be null at the start of a drag and drop session"
            u1.a.b(r0)
        L29:
            r0 = 0
            r2.f442v = r0
            gg.q r2 = r1.f434h
            boolean r0 = r2.f4560g
            r2.f4560g = r0
            x1.d2 r2 = x1.d2.f20872g
        L34:
            return r2
    }
}
