package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yg implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f20392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ db.c f20393i;

    public /* synthetic */ yg(int r1, db.c r2, fg.l r3) {
            r0 = this;
            r0.f20391g = r1
            r0.f20392h = r3
            r0.f20393i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r27 = this;
            r0 = r27
            int r1 = r0.f20391g
            switch(r1) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            fg.l r1 = r0.f20392h
            db.c r2 = r0.f20393i
            r1.invoke(r2)
        Le:
            sf.n r1 = sf.n.f12433a
            return r1
        L11:
            db.c r2 = r0.f20393i
            java.util.ArrayList r1 = wb.ho.T6(r2)
            db.a r3 = new db.a
            java.lang.String r4 = ""
            r5 = 0
            r3.<init>(r5, r4)
            java.util.ArrayList r23 = tf.m.G1(r1, r3)
            r25 = 0
            r26 = 3670015(0x37ffff, float:5.142786E-39)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            db.c r1 = db.c.a(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            fg.l r2 = r0.f20392h
            r2.invoke(r1)
            goto Le
    }
}
