package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1563h;

    public /* synthetic */ s(java.lang.String r1, int r2) {
            r0 = this;
            r0.f1562g = r2
            r0.f1563h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f1562g
            sf.n r1 = sf.n.f12433a
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r5 = r8.f1563h
            switch(r0) {
                case 0: goto L236;
                case 1: goto L213;
                case 2: goto L206;
                case 3: goto L1ed;
                case 4: goto L1d4;
                case 5: goto L1ca;
                case 6: goto L1b6;
                case 7: goto L19b;
                case 8: goto L189;
                case 9: goto L177;
                case 10: goto L160;
                case 11: goto L147;
                case 12: goto L12c;
                case 13: goto L10a;
                case 14: goto Lef;
                case 15: goto Le1;
                case 16: goto Ld6;
                case 17: goto Lbd;
                case 18: goto Laf;
                case 19: goto L96;
                case 20: goto L84;
                case 21: goto L72;
                case 22: goto L19;
                default: goto Lc;
            }
        Lc:
            y9.d r9 = (y9.d) r9
            java.lang.String r9 = r9.f22330a
            boolean r9 = r9.equals(r5)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L19:
            og.f r9 = (og.f) r9
            r9.getClass()
            og.i r9 = (og.i) r9
            java.util.List r9 = r9.a()
            og.g r9 = (og.g) r9
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "notify@all"
            boolean r0 = gg.l.a(r9, r0)
            if (r0 == 0) goto L3f
            java.lang.String r9 = "所有人"
            goto L69
        L3f:
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L4a
            java.lang.String r1 = r0.t(r5, r9)
            goto L4b
        L4a:
            r1 = r2
        L4b:
            java.lang.String r3 = ""
            if (r1 != 0) goto L50
            r1 = r3
        L50:
            boolean r4 = og.m.t0(r1)
            if (r4 == 0) goto L61
            if (r0 == 0) goto L5c
            java.lang.String r2 = r0.r(r9)
        L5c:
            if (r2 != 0) goto L5f
            goto L60
        L5f:
            r3 = r2
        L60:
            r1 = r3
        L61:
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L68
            goto L69
        L68:
            r9 = r1
        L69:
            java.lang.String r0 = "@"
            java.lang.String r1 = "\u2005"
            java.lang.String r9 = eh.a.n(r0, r9, r1)
            return r9
        L72:
            r2 = r9
            android.webkit.WebView r2 = (android.webkit.WebView) r2
            r2.getClass()
            java.lang.String r6 = "UTF-8"
            r7 = 0
            r3 = 0
            java.lang.String r4 = r8.f1563h
            java.lang.String r5 = "image/svg+xml"
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)
            return r1
        L84:
            vb.a r9 = (vb.a) r9
            r9.getClass()
            java.lang.String r9 = r9.a()
            boolean r9 = r5.equals(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L96:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r0 = "ID: "
            boolean r0 = og.t.d0(r9, r0, r3)
            if (r0 == 0) goto Laa
            boolean r9 = og.m.h0(r9, r5, r3)
            if (r9 == 0) goto Laa
            r3 = r4
        Laa:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        Laf:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            boolean r9 = r9.equals(r5)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        Lbd:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.lang.String r0 = l8.d.m(r9, r5)
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto Ld5
            java.lang.String r0 = l8.d.o(r9, r5)
        Ld5:
            return r0
        Ld6:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            r8.d r9 = new r8.d
            r9.<init>(r5)
            return r9
        Le1:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            boolean r9 = og.t.d0(r9, r5, r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        Lef:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L105
            j8.h r0 = r0.f6820f
            if (r0 == 0) goto L105
            boolean r9 = r0.A(r5, r9)
            if (r9 != r4) goto L105
            r3 = r4
        L105:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L10a:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L127
            java.io.File r1 = new java.io.File
            r1.<init>(r9)
            java.lang.String r1 = r1.getName()
            androidx.lifecycle.x r0 = r0.f6819e
            boolean r9 = r0.T(r5, r9, r1)
            if (r9 != r4) goto L127
            r3 = r4
        L127:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L12c:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L142
            bb.b r0 = r0.f6817c
            if (r0 == 0) goto L142
            boolean r9 = r0.q(r5, r9)
            if (r9 != r4) goto L142
            r3 = r4
        L142:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L147:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L15b
            j8.f r0 = r0.f6818d
            boolean r9 = r0.v(r5, r9)
            if (r9 != r4) goto L15b
            r3 = r4
        L15b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L160:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L172
            boolean r9 = r0.a(r5, r9)
            if (r9 != r4) goto L172
            r3 = r4
        L172:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L177:
            f2.y r9 = (f2.y) r9
            mg.d[] r0 = f2.w.f3251a
            f2.x r0 = f2.u.f3223a
            java.util.List r2 = a.a.x0(r5)
            r9.a(r0, r2)
            r0 = 5
            f2.w.c(r9, r0)
            return r1
        L189:
            t7.b r9 = (t7.b) r9
            r9.getClass()
            java.lang.String r9 = r9.c()
            boolean r9 = og.t.X(r9, r5)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L19b:
            t7.b r9 = (t7.b) r9
            r9.getClass()
            boolean r0 = og.m.t0(r5)
            if (r0 != 0) goto L1b0
            java.lang.String r9 = r9.c()
            boolean r9 = og.t.X(r9, r5)
            if (r9 == 0) goto L1b1
        L1b0:
            r3 = r4
        L1b1:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L1b6:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r9 = fb.u.z(r5, r9)
            if (r9 == 0) goto L1c9
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r2 = r9.toString()
        L1c9:
            return r2
        L1ca:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r9 = fb.u.y(r5, r9)
            return r9
        L1d4:
            og.f r9 = (og.f) r9
            r9.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "<title>"
            r9.<init>(r0)
            r9.append(r5)
            java.lang.String r0 = "</title>"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            return r9
        L1ed:
            og.f r9 = (og.f) r9
            r9.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "&lt;title&gt;"
            r9.<init>(r0)
            r9.append(r5)
            java.lang.String r0 = "&lt;/title&gt;"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            return r9
        L206:
            eb.j0 r9 = (eb.j0) r9
            java.lang.String r9 = r9.f2565a
            boolean r9 = r9.equals(r5)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L213:
            sf.e r9 = (sf.e) r9
            r9.getClass()
            java.lang.Object r9 = r9.f12418g
            java.lang.String r9 = (java.lang.String) r9
            int r0 = r9.length()
            if (r0 <= 0) goto L231
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L231
            java.lang.String r0 = "@chatroom"
            boolean r9 = og.t.W(r9, r0, r3)
            if (r9 != 0) goto L231
            r3 = r4
        L231:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L236:
            wb.jv r9 = (wb.jv) r9
            r9.getClass()
            java.util.List r9 = r9.f17145f
            boolean r9 = r9.contains(r5)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
    }
}
