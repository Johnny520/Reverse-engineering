package ab;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends gg.j implements fg.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f145n;

    public /* synthetic */ b(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            r0.f145n = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f145n
            switch(r0) {
                case 0: goto L238;
                case 1: goto L227;
                case 2: goto L216;
                case 3: goto L205;
                case 4: goto L1f4;
                case 5: goto L1e3;
                case 6: goto L1d2;
                case 7: goto L1c1;
                case 8: goto L1b0;
                case 9: goto L19f;
                case 10: goto L18e;
                case 11: goto L17d;
                case 12: goto L16c;
                case 13: goto L15b;
                case 14: goto L14a;
                case 15: goto L139;
                case 16: goto L128;
                case 17: goto L117;
                case 18: goto L106;
                case 19: goto Lf5;
                case 20: goto Le4;
                case 21: goto Ld3;
                case 22: goto Lc2;
                case 23: goto Lb1;
                case 24: goto L5d;
                case 25: goto L49;
                case 26: goto L38;
                case 27: goto L27;
                case 28: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ia.u r0 = (ia.u) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L16:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ia.u r0 = (ia.u) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L27:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ia.u r0 = (ia.u) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L38:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ia.u r0 = (ia.u) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L49:
            android.app.Activity r8 = (android.app.Activity) r8
            p8.l r9 = (p8.l) r9
            r8.getClass()
            r9.getClass()
            java.lang.Object r0 = r7.f4549h
            ia.q r0 = (ia.q) r0
            r0.g(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L5d:
            r2 = r8
            android.app.Activity r2 = (android.app.Activity) r2
            r5 = r9
            p8.l r5 = (p8.l) r5
            r2.getClass()
            r5.getClass()
            java.lang.Object r8 = r7.f4549h
            r1 = r8
            ia.q r1 = (ia.q) r1
            r1.getClass()
            r4 = r2
            java.lang.String r2 = r5.f10391a
            if (r2 == 0) goto Lae
            android.content.SharedPreferences r8 = r1.f6624d
            java.lang.String r9 = "fake_like_use_non_friends"
            r0 = 0
            boolean r3 = r8.getBoolean(r9, r0)
            c9.u r0 = new c9.u
            r0.<init>(r1, r2, r3, r4, r5)
            if (r3 == 0) goto L89
            java.lang.String r8 = "正在载入好友和非好友..."
            goto L8b
        L89:
            java.lang.String r8 = "正在载入好友列表..."
        L8b:
            k.s1 r9 = new k.s1
            r2 = 7
            r9.<init>(r2)
            java.lang.String r2 = "朋友圈伪集赞"
            wb.kv r8 = wb.y2.X1(r4, r9, r2, r8)
            java.lang.Thread r9 = new java.lang.Thread
            r5 = r0
            ia.l r0 = new ia.l
            r6 = 1
            r2 = r4
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "Hchat-MomentsFakeLikeContacts"
            r9.<init>(r0, r8)
            r8 = 1
            r9.setDaemon(r8)
            r9.start()
        Lae:
            sf.n r8 = sf.n.f12433a
            return r8
        Lb1:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            hb.u r0 = (hb.u) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        Lc2:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ha.e0 r0 = (ha.e0) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        Ld3:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ha.a0 r0 = (ha.a0) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        Le4:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ha.v r0 = (ha.v) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        Lf5:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ha.o r0 = (ha.o) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L106:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ha.l r0 = (ha.l) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L117:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ha.i r0 = (ha.i) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L128:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ha.e r0 = (ha.e) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L139:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ha.a r0 = (ha.a) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L14a:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            h9.a r0 = (h9.a) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L15b:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            g9.a r0 = (g9.a) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L16c:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            fa.a r0 = (fa.a) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L17d:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            f9.a r0 = (f9.a) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L18e:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ea.a r0 = (ea.a) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L19f:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            db.b r0 = (db.b) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L1b0:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            d9.d r0 = (d9.d) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L1c1:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ca.f r0 = (ca.f) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L1d2:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ca.f r0 = (ca.f) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L1e3:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ca.f r0 = (ca.f) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L1f4:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            bb.e r0 = (bb.e) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L205:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            bb.e r0 = (bb.e) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L216:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            bb.e r0 = (bb.e) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L227:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            bb.e r0 = (bb.e) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
        L238:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.getClass()
            java.lang.Object r0 = r7.f4549h
            ab.c r0 = (ab.c) r0
            r0.e(r8, r9)
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
