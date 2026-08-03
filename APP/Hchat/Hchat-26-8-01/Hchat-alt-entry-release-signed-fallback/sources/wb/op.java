package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class op implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18151i;

    public /* synthetic */ op(int r1, i0.a1 r2, i0.a1 r3) {
            r0 = this;
            r0.f18149g = r1
            r0.f18150h = r2
            r0.f18151i = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f18149g
            switch(r0) {
                case 0: goto Lbe;
                case 1: goto L51;
                default: goto L5;
            }
        L5:
            n2.s r6 = (n2.s) r6
            r6.getClass()
            i2.g r6 = r6.f8976a
            java.lang.String r6 = r6.f6314h
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2a
            char r3 = r6.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 == 0) goto L27
            r0.append(r3)
        L27:
            int r2 = r2 + 1
            goto L18
        L2a:
            java.lang.String r6 = r0.toString()
            r0 = 10
            java.lang.String r6 = og.m.P0(r0, r6)
            n2.s r0 = new n2.s
            int r1 = r6.length()
            long r1 = i2.e0.b(r1, r1)
            r3 = 4
            r0.<init>(r3, r6, r1)
            i0.a1 r6 = r5.f18150h
            r6.setValue(r0)
            java.lang.String r6 = ""
            i0.a1 r0 = r5.f18151i
            r0.setValue(r6)
            sf.n r6 = sf.n.f12433a
            return r6
        L51:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f18150h
            r0.setValue(r6)
            int r0 = r6.hashCode()
            switch(r0) {
                case -2131439764: goto L9f;
                case -1249537483: goto L93;
                case -1010579470: goto L87;
                case 629437796: goto L7b;
                case 1231576595: goto L6f;
                case 1975967741: goto L63;
                default: goto L62;
            }
        L62:
            goto La7
        L63:
            java.lang.String r0 = "siliconflow"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L6c
            goto La7
        L6c:
            java.lang.String r6 = "https://api.siliconflow.cn/v1/chat/completions"
            goto Lac
        L6f:
            java.lang.String r0 = "openrouter"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L78
            goto La7
        L78:
            java.lang.String r6 = "https://openrouter.ai/api/v1/chat/completions"
            goto Lac
        L7b:
            java.lang.String r0 = "deepseek"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L84
            goto La7
        L84:
            java.lang.String r6 = "https://api.deepseek.com/chat/completions"
            goto Lac
        L87:
            java.lang.String r0 = "openai"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L90
            goto La7
        L90:
            java.lang.String r6 = "https://api.openai.com/v1/chat/completions"
            goto Lac
        L93:
            java.lang.String r0 = "gemini"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L9c
            goto La7
        L9c:
            java.lang.String r6 = "https://generativelanguage.googleapis.com/v1beta"
            goto Lac
        L9f:
            java.lang.String r0 = "anthropic"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto Laa
        La7:
            java.lang.String r6 = ""
            goto Lac
        Laa:
            java.lang.String r6 = "https://api.anthropic.com/v1/messages"
        Lac:
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto Lb3
            goto Lb4
        Lb3:
            r6 = 0
        Lb4:
            if (r6 == 0) goto Lbb
            i0.a1 r0 = r5.f18151i
            r0.setValue(r6)
        Lbb:
            sf.n r6 = sf.n.f12433a
            return r6
        Lbe:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r5.f18150h
            r1.setValue(r0)
            if (r6 == 0) goto Ld9
            i0.a1 r6 = r5.f18151i
            java.lang.Object r0 = r6.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            r1 = 1
            p.a.u(r0, r1, r6)
        Ld9:
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
