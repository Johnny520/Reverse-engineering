package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pk implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18475i;

    public /* synthetic */ pk(int r1, i0.a1 r2, i0.a1 r3) {
            r0 = this;
            r0.f18473g = r1
            r0.f18474h = r2
            r0.f18475i = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r9 = this;
            int r0 = r9.f18473g
            switch(r0) {
                case 0: goto L11c;
                case 1: goto Le4;
                case 2: goto Ld5;
                case 3: goto L9f;
                case 4: goto L8f;
                case 5: goto L81;
                case 6: goto L4c;
                case 7: goto L3d;
                case 8: goto L19;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r9.f18474h
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            i0.a1 r2 = r9.f18475i
            r2.setValue(r1)
            r1 = 0
            r0.setValue(r1)
        L16:
            sf.n r0 = sf.n.f12433a
            return r0
        L19:
            i0.a1 r0 = r9.f18474h
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            i0.a1 r1 = r9.f18475i
            r1.setValue(r0)
            goto L16
        L3d:
            java.lang.String r0 = ""
            i0.a1 r1 = r9.f18474h
            r1.setValue(r0)
            java.lang.String r0 = "create"
            i0.a1 r1 = r9.f18475i
            r1.setValue(r0)
            goto L16
        L4c:
            wb.gu r0 = new wb.gu
            wb.v0 r1 = new wb.v0
            i0.a1 r2 = r9.f18474h
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r7 = 0
            r8 = 62
            java.lang.String r4 = "|"
            r5 = 0
            r6 = 0
            java.lang.String r5 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            w0.l r6 = new w0.l
            r2 = 10
            r6.<init>(r2)
            r7 = 1
            r8 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "设置允许名单"
            wb.u0 r3 = wb.u0.f19346i
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r1)
            i0.a1 r1 = r9.f18475i
            r1.setValue(r0)
            goto L16
        L81:
            r0 = 0
            i0.a1 r1 = r9.f18474h
            r1.setValue(r0)
            java.lang.String r0 = "rules"
            i0.a1 r1 = r9.f18475i
            r1.setValue(r0)
            goto L16
        L8f:
            java.lang.String r0 = "${sendText}"
            i0.a1 r1 = r9.f18474h
            r1.setValue(r0)
            java.lang.String r0 = "HH:mm:ss"
            i0.a1 r1 = r9.f18475i
            r1.setValue(r0)
            goto L16
        L9f:
            wb.eq r0 = new wb.eq
            wb.v0 r1 = new wb.v0
            i0.a1 r2 = r9.f18474h
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r7 = 0
            r8 = 62
            java.lang.String r4 = "|"
            r5 = 0
            r6 = 0
            java.lang.String r5 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            w0.l r6 = new w0.l
            r2 = 13
            r6.<init>(r2)
            r7 = 1
            r8 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "允许他人点歌的聊天"
            wb.u0 r3 = wb.u0.f19346i
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r1)
            i0.a1 r1 = r9.f18475i
            r1.setValue(r0)
            goto L16
        Ld5:
            r0 = 0
            i0.a1 r1 = r9.f18474h
            r1.setValue(r0)
            wb.g r0 = wb.g.f16288i
            i0.a1 r1 = r9.f18475i
            r1.setValue(r0)
            goto L16
        Le4:
            wb.tv r0 = new wb.tv
            wb.v0 r1 = new wb.v0
            i0.a1 r2 = r9.f18474h
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r7 = 0
            r8 = 62
            java.lang.String r4 = "|"
            r5 = 0
            r6 = 0
            java.lang.String r5 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            wb.jk r6 = new wb.jk
            r2 = 12
            r6.<init>(r2)
            r7 = 1
            r8 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "选择排除好友"
            wb.u0 r3 = wb.u0.f19344g
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            wb.wv r2 = wb.wv.f20070h
            r0.<init>(r2, r1)
            i0.a1 r1 = r9.f18475i
            r1.setValue(r0)
            goto L16
        L11c:
            wb.tv r0 = new wb.tv
            wb.v0 r1 = new wb.v0
            i0.a1 r2 = r9.f18474h
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r7 = 0
            r8 = 62
            java.lang.String r4 = "|"
            r5 = 0
            r6 = 0
            java.lang.String r5 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            wb.jk r6 = new wb.jk
            r2 = 8
            r6.<init>(r2)
            r7 = 1
            r8 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "选择检测好友"
            wb.u0 r3 = wb.u0.f19344g
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            wb.wv r2 = wb.wv.f20069g
            r0.<init>(r2, r1)
            i0.a1 r1 = r9.f18475i
            r1.setValue(r0)
            goto L16
    }
}
