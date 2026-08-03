package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2427g;

    public /* synthetic */ h(int r1) {
            r0 = this;
            r0.f2427g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f2427g
            switch(r0) {
                case 0: goto L1bc;
                case 1: goto L199;
                case 2: goto L192;
                case 3: goto L17e;
                case 4: goto L171;
                case 5: goto L164;
                case 6: goto L137;
                case 7: goto L130;
                case 8: goto L11d;
                case 9: goto L116;
                case 10: goto L103;
                case 11: goto Lf8;
                case 12: goto Led;
                case 13: goto Le6;
                case 14: goto Ldb;
                case 15: goto Ld4;
                case 16: goto Lc9;
                case 17: goto Lbe;
                case 18: goto Lb3;
                case 19: goto La8;
                case 20: goto La1;
                case 21: goto L9c;
                case 22: goto L97;
                case 23: goto L8a;
                case 24: goto L6e;
                case 25: goto L5c;
                case 26: goto L54;
                case 27: goto L4a;
                case 28: goto L30;
                default: goto L5;
            }
        L5:
            java.io.File r5 = (java.io.File) r5
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L10
            java.lang.String r0 = "/"
            goto L27
        L10:
            long r0 = r5.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " ("
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " bytes)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L27:
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = bc.e.i(r5, r0)
            return r5
        L30:
            bc.l r5 = (bc.l) r5
            r5.getClass()
            bc.d r0 = r5.b()
            if (r0 == 0) goto L3c
            goto L42
        L3c:
            ud.e r5 = r5.f751b
            bc.d r0 = r5.V()
        L42:
            java.lang.String r5 = r0.b()
            r5.getClass()
            return r5
        L4a:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r5.getClass()
            java.lang.Throwable r5 = r5.getCause()
            return r5
        L54:
            fb.c r5 = (fb.c) r5
            r5.getClass()
            java.lang.String r5 = r5.f3432b
            return r5
        L5c:
            fb.c r5 = (fb.c) r5
            r5.getClass()
            java.lang.String r5 = r5.f3431a
            java.lang.String r0 = "user"
            boolean r5 = gg.l.a(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L6e:
            java.lang.Byte r5 = (java.lang.Byte) r5
            byte r5 = r5.byteValue()
            r5 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r0 = 1
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String r0 = "%02x"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            return r5
        L8a:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            java.lang.String r5 = r5.toGenericString()
            r5.getClass()
            return r5
        L97:
            n2.i r5 = (n2.i) r5
            sf.n r5 = sf.n.f12433a
            return r5
        L9c:
            java.util.List r5 = (java.util.List) r5
            sf.n r5 = sf.n.f12433a
            return r5
        La1:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.CharSequence r5 = h.Hchat.hooks.items.script.ScriptWaBridge.y(r5)
            return r5
        La8:
            eb.k0 r5 = (eb.k0) r5
            r5.getClass()
            r5 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Lb3:
            eb.a0 r5 = (eb.a0) r5
            boolean r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.e(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Lbe:
            eb.a0 r5 = (eb.a0) r5
            boolean r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.g(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Lc9:
            eb.a0 r5 = (eb.a0) r5
            boolean r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.o(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Ld4:
            java.io.File r5 = (java.io.File) r5
            java.lang.String r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.w(r5)
            return r5
        Ldb:
            eb.a0 r5 = (eb.a0) r5
            boolean r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.y(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Le6:
            java.io.File r5 = (java.io.File) r5
            eb.c0 r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.l(r5)
            return r5
        Led:
            eb.a0 r5 = (eb.a0) r5
            boolean r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.h(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Lf8:
            eb.a0 r5 = (eb.a0) r5
            boolean r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.r(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L103:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r5 = r5.length()
            if (r5 <= 0) goto L110
            r5 = 1
            goto L111
        L110:
            r5 = 0
        L111:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L116:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p.a.l(r5, r5)
            return r5
        L11d:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r5 = r5.length()
            if (r5 <= 0) goto L12a
            r5 = 1
            goto L12b
        L12a:
            r5 = 0
        L12b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L130:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p.a.l(r5, r5)
            return r5
        L137:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r5.getClass()
            java.lang.Object r0 = r5.getKey()
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Object r5 = r5.getValue()
            r5.getClass()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            sf.e r1 = new sf.e
            r1.<init>(r0, r5)
            return r1
        L164:
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            r5.getClass()
            java.lang.String r5 = r5.toGenericString()
            r5.getClass()
            return r5
        L171:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            java.lang.String r5 = r5.toGenericString()
            r5.getClass()
            return r5
        L17e:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            r5.getClass()
            java.lang.Class r5 = r5.getType()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L192:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p.a.l(r5, r5)
            return r5
        L199:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            java.lang.Class r0 = r5.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L1b6
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L1b6
            r5 = 1
            goto L1b7
        L1b6:
            r5 = 0
        L1b7:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L1bc:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r5 = gg.l.a(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
    }
}
