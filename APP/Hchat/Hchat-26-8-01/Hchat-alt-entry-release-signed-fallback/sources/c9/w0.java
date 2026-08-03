package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f1421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f1422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f1423j;

    public /* synthetic */ w0(i0.a1 r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f1420g = r4
            r0.f1421h = r1
            r0.f1422i = r2
            r0.f1423j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f1420g
            switch(r0) {
                case 0: goto Lc8;
                case 1: goto Lb3;
                case 2: goto L9e;
                case 3: goto L87;
                case 4: goto L6a;
                case 5: goto L4b;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r4.f1421h
            java.lang.Object r0 = r0.getValue()
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            sf.n r1 = sf.n.f12433a
            if (r0 == 0) goto L4a
            i0.a1 r2 = r4.f1422i
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L28
            r0.pause()     // Catch: java.lang.Throwable -> L22
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.setValue(r0)
            goto L4a
        L28:
            r0.start()     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L32
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L32
            r3 = r1
            goto L38
        L32:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
        L38:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 == 0) goto L4a
            java.lang.String r0 = "预览播放失败"
            i0.a1 r3 = r4.f1423j
            r3.setValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.setValue(r0)
        L4a:
            return r1
        L4b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r4.f1421h
            r1.setValue(r0)
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            i0.a1 r2 = r4.f1422i
            r2.setValue(r1)
            i0.a1 r1 = r4.f1423j
            java.lang.Object r1 = r1.getValue()
            fg.l r1 = (fg.l) r1
            r1.invoke(r0)
        L67:
            sf.n r0 = sf.n.f12433a
            return r0
        L6a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r4.f1421h
            r1.setValue(r0)
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            i0.a1 r2 = r4.f1422i
            r2.setValue(r1)
            i0.a1 r1 = r4.f1423j
            java.lang.Object r1 = r1.getValue()
            fg.l r1 = (fg.l) r1
            r1.invoke(r0)
            goto L67
        L87:
            r0 = 0
            i0.a1 r1 = r4.f1421h
            r1.setValue(r0)
            db.c r0 = a2.a.p()
            i0.a1 r1 = r4.f1422i
            r1.setValue(r0)
            wb.xq r0 = wb.xq.f20251b
            i0.a1 r1 = r4.f1423j
            r1.setValue(r0)
            goto L67
        L9e:
            i0.a1 r0 = r4.f1421h
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            i0.a1 r1 = r4.f1422i
            r1.setValue(r0)
            wb.h r0 = wb.h.f16469d
            i0.a1 r1 = r4.f1423j
            r1.setValue(r0)
            goto L67
        Lb3:
            i0.a1 r0 = r4.f1421h
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            i0.a1 r1 = r4.f1422i
            r1.setValue(r0)
            wb.h r0 = wb.h.f16470e
            i0.a1 r1 = r4.f1423j
            r1.setValue(r0)
            goto L67
        Lc8:
            java.lang.String r0 = ""
            i0.a1 r1 = r4.f1421h
            r1.setValue(r0)
            r0 = 0
            i0.a1 r1 = r4.f1422i
            r1.setValue(r0)
            c9.e1 r0 = c9.e1.f1172i
            i0.a1 r1 = r4.f1423j
            r1.setValue(r0)
            goto L67
    }
}
