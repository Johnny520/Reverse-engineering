package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17586g;

    public /* synthetic */ m0(int r1) {
            r0 = this;
            r0.f17586g = r1
            r0.<init>()
            return
    }

    public /* synthetic */ m0(int r1, int r2) {
            r0 = this;
            r0.f17586g = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f17586g
            switch(r0) {
                case 0: goto L468;
                case 1: goto L443;
                case 2: goto L41e;
                case 3: goto L3f9;
                case 4: goto L3d4;
                case 5: goto L3a9;
                case 6: goto L39f;
                case 7: goto L38d;
                case 8: goto L37b;
                case 9: goto L351;
                case 10: goto L310;
                case 11: goto L2ea;
                case 12: goto L2d2;
                case 13: goto L2ba;
                case 14: goto L2a3;
                case 15: goto L28e;
                case 16: goto L277;
                case 17: goto L232;
                case 18: goto L1f0;
                case 19: goto L1ab;
                case 20: goto L193;
                case 21: goto L17b;
                case 22: goto L152;
                case 23: goto L125;
                case 24: goto L10d;
                case 25: goto Le3;
                case 26: goto La1;
                case 27: goto L5c;
                case 28: goto L47;
                default: goto L5;
            }
        L5:
            java.util.Set r7 = (java.util.Set) r7
            u6.a r8 = (u6.a) r8
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.reflect.Executable r8 = r8.f13523c
            java.lang.reflect.Type[] r8 = r8.getGenericExceptionTypes()
            r8.getClass()
            java.lang.reflect.Type[] r8 = (java.lang.reflect.Type[]) r8
            java.util.List r8 = tf.l.L0(r8)
            int r0 = r7.size()
            int r1 = r8.size()
            r2 = 0
            if (r0 == r1) goto L26
            goto L33
        L26:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L38
            r2 = 1
        L33:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L38:
            java.lang.Object r7 = r7.next()
            wb.en.n(r7)
            java.lang.Object r7 = r8.get(r2)
            java.lang.reflect.Type r7 = (java.lang.reflect.Type) r7
            r7 = 0
            throw r7
        L47:
            if (r7 != 0) goto L56
            u6.d r8 = (u6.d) r8
            java.lang.reflect.Method r7 = r8.f13528c
            java.lang.reflect.Type r7 = r7.getGenericReturnType()
            r7.getClass()
            r7 = 0
            throw r7
        L56:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
        L5c:
            java.util.Set r7 = (java.util.Set) r7
            u6.a r8 = (u6.a) r8
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.reflect.Executable r8 = r8.f13523c
            java.lang.reflect.TypeVariable[] r8 = r8.getTypeParameters()
            r8.getClass()
            java.lang.reflect.TypeVariable[] r8 = (java.lang.reflect.TypeVariable[]) r8
            java.util.List r8 = tf.l.L0(r8)
            int r0 = r7.size()
            int r1 = r8.size()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L7e
            goto L8b
        L7e:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L92
            r3 = r2
        L8b:
            r7 = r3 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L92:
            java.lang.Object r7 = r7.next()
            wb.en.n(r7)
            java.lang.Object r7 = r8.get(r3)
            java.lang.reflect.Type r7 = (java.lang.reflect.Type) r7
            r7 = 0
            throw r7
        La1:
            java.util.Set r7 = (java.util.Set) r7
            u6.a r8 = (u6.a) r8
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.reflect.Executable r8 = r8.f13523c
            java.lang.reflect.TypeVariable[] r8 = r8.getTypeParameters()
            r8.getClass()
            java.lang.reflect.TypeVariable[] r8 = (java.lang.reflect.TypeVariable[]) r8
            java.util.List r8 = tf.l.L0(r8)
            int r0 = r7.size()
            int r1 = r8.size()
            r2 = 0
            if (r0 == r1) goto Lc2
            goto Lcf
        Lc2:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto Ld4
            r2 = 1
        Lcf:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        Ld4:
            java.lang.Object r7 = r7.next()
            wb.en.n(r7)
            java.lang.Object r7 = r8.get(r2)
            java.lang.reflect.Type r7 = (java.lang.reflect.Type) r7
            r7 = 0
            throw r7
        Le3:
            fg.l r7 = (fg.l) r7
            u6.a r8 = (u6.a) r8
            java.lang.reflect.Executable r8 = r8.f13523c     // Catch: java.lang.Throwable -> Lfb
            int r8 = r8.getParameterCount()     // Catch: java.lang.Throwable -> Lfb
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r7 = r7.invoke(r8)     // Catch: java.lang.Throwable -> Lfb
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lfb
            r7.booleanValue()     // Catch: java.lang.Throwable -> Lfb
            goto L103
        Lfb:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        L103:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r0 = r7 instanceof sf.f
            if (r0 == 0) goto L10a
            r7 = r8
        L10a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            return r7
        L10d:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            u6.a r8 = (u6.a) r8
            java.lang.reflect.Executable r8 = r8.f13523c
            int r8 = r8.getParameterCount()
            if (r8 != r7) goto L11f
            r7 = 1
            goto L120
        L11f:
            r7 = 0
        L120:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L125:
            fg.l r7 = (fg.l) r7
            u6.a r8 = (u6.a) r8
            java.lang.reflect.Executable r8 = r8.f13523c     // Catch: java.lang.Throwable -> L140
            java.lang.Class[] r8 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L140
            r8.getClass()     // Catch: java.lang.Throwable -> L140
            java.util.List r8 = tf.l.L0(r8)     // Catch: java.lang.Throwable -> L140
            java.lang.Object r7 = r7.invoke(r8)     // Catch: java.lang.Throwable -> L140
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L140
            r7.getClass()     // Catch: java.lang.Throwable -> L140
            goto L148
        L140:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        L148:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r0 = r7 instanceof sf.f
            if (r0 == 0) goto L14f
            r7 = r8
        L14f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            return r7
        L152:
            fg.l r7 = (fg.l) r7
            u6.d r8 = (u6.d) r8
            java.lang.reflect.Method r8 = r8.f13528c     // Catch: java.lang.Throwable -> L169
            java.lang.Class r8 = r8.getReturnType()     // Catch: java.lang.Throwable -> L169
            r8.getClass()     // Catch: java.lang.Throwable -> L169
            java.lang.Object r7 = r7.invoke(r8)     // Catch: java.lang.Throwable -> L169
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L169
            r7.getClass()     // Catch: java.lang.Throwable -> L169
            goto L171
        L169:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        L171:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r0 = r7 instanceof sf.f
            if (r0 == 0) goto L178
            r7 = r8
        L178:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            return r7
        L17b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            u6.a r8 = (u6.a) r8
            java.lang.reflect.Executable r8 = r8.f13523c
            boolean r8 = r8.isVarArgs()
            if (r8 == r7) goto L18d
            r7 = 1
            goto L18e
        L18d:
            r7 = 0
        L18e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L193:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            u6.a r8 = (u6.a) r8
            java.lang.reflect.Executable r8 = r8.f13523c
            boolean r8 = r8.isVarArgs()
            if (r8 != r7) goto L1a5
            r7 = 1
            goto L1a6
        L1a5:
            r7 = 0
        L1a6:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L1ab:
            java.util.Set r7 = (java.util.Set) r7
            u6.a r8 = (u6.a) r8
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.reflect.Executable r8 = r8.f13523c
            java.lang.reflect.Type[] r8 = r8.getGenericParameterTypes()
            r8.getClass()
            java.lang.reflect.Type[] r8 = (java.lang.reflect.Type[]) r8
            java.util.List r8 = tf.l.L0(r8)
            int r0 = r7.size()
            int r1 = r8.size()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L1cd
            goto L1da
        L1cd:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L1e1
            r3 = r2
        L1da:
            r7 = r3 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L1e1:
            java.lang.Object r7 = r7.next()
            wb.en.n(r7)
            java.lang.Object r7 = r8.get(r3)
            java.lang.reflect.Type r7 = (java.lang.reflect.Type) r7
            r7 = 0
            throw r7
        L1f0:
            java.util.Set r7 = (java.util.Set) r7
            u6.a r8 = (u6.a) r8
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.reflect.Executable r8 = r8.f13523c
            java.lang.reflect.Type[] r8 = r8.getGenericParameterTypes()
            r8.getClass()
            java.lang.reflect.Type[] r8 = (java.lang.reflect.Type[]) r8
            java.util.List r8 = tf.l.L0(r8)
            int r0 = r7.size()
            int r1 = r8.size()
            r2 = 0
            if (r0 == r1) goto L211
            goto L21e
        L211:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L223
            r2 = 1
        L21e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L223:
            java.lang.Object r7 = r7.next()
            wb.en.n(r7)
            java.lang.Object r7 = r8.get(r2)
            java.lang.reflect.Type r7 = (java.lang.reflect.Type) r7
            r7 = 0
            throw r7
        L232:
            java.util.Set r7 = (java.util.Set) r7
            u6.a r8 = (u6.a) r8
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.reflect.Executable r8 = r8.f13523c
            java.lang.reflect.Type[] r8 = r8.getGenericExceptionTypes()
            r8.getClass()
            java.lang.reflect.Type[] r8 = (java.lang.reflect.Type[]) r8
            java.util.List r8 = tf.l.L0(r8)
            int r0 = r7.size()
            int r1 = r8.size()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L254
            goto L261
        L254:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L268
            r3 = r2
        L261:
            r7 = r3 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L268:
            java.lang.Object r7 = r7.next()
            wb.en.n(r7)
            java.lang.Object r7 = r8.get(r3)
            java.lang.reflect.Type r7 = (java.lang.reflect.Type) r7
            r7 = 0
            throw r7
        L277:
            fg.l r7 = (fg.l) r7
            u6.b r8 = (u6.b) r8
            java.lang.reflect.Field r8 = r8.f13525c
            java.lang.reflect.Type r8 = r8.getGenericType()
            r8.getClass()
            java.lang.Object r7 = r7.invoke(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.getClass()
            return r7
        L28e:
            if (r7 != 0) goto L29d
            u6.b r8 = (u6.b) r8
            java.lang.reflect.Field r7 = r8.f13525c
            java.lang.reflect.Type r7 = r7.getGenericType()
            r7.getClass()
            r7 = 0
            throw r7
        L29d:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
        L2a3:
            fg.l r7 = (fg.l) r7
            u6.b r8 = (u6.b) r8
            java.lang.reflect.Field r8 = r8.f13525c
            java.lang.Class r8 = r8.getType()
            r8.getClass()
            java.lang.Object r7 = r7.invoke(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.getClass()
            return r7
        L2ba:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            u6.b r8 = (u6.b) r8
            java.lang.reflect.Field r8 = r8.f13525c
            boolean r8 = r8.isEnumConstant()
            if (r8 == r7) goto L2cc
            r7 = 1
            goto L2cd
        L2cc:
            r7 = 0
        L2cd:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L2d2:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            u6.b r8 = (u6.b) r8
            java.lang.reflect.Field r8 = r8.f13525c
            boolean r8 = r8.isEnumConstant()
            if (r8 != r7) goto L2e4
            r7 = 1
            goto L2e5
        L2e4:
            r7 = 0
        L2e5:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L2ea:
            fg.l r7 = (fg.l) r7
            u6.d r8 = (u6.d) r8
            java.lang.reflect.Method r8 = r8.f13528c     // Catch: java.lang.Throwable -> L2fe
            java.lang.Object r8 = r8.getDefaultValue()     // Catch: java.lang.Throwable -> L2fe
            java.lang.Object r7 = r7.invoke(r8)     // Catch: java.lang.Throwable -> L2fe
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L2fe
            r7.booleanValue()     // Catch: java.lang.Throwable -> L2fe
            goto L306
        L2fe:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        L306:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r0 = r7 instanceof sf.f
            if (r0 == 0) goto L30d
            r7 = r8
        L30d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            return r7
        L310:
            wf.g r7 = (wf.g) r7
            wf.e r8 = (wf.e) r8
            r7.getClass()
            r8.getClass()
            wf.f r0 = r8.getKey()
            wf.g r7 = r7.t(r0)
            wf.h r0 = wf.h.f20786g
            if (r7 != r0) goto L327
            goto L350
        L327:
            wf.d r1 = wf.d.f20785g
            wf.e r2 = r7.s(r1)
            qg.p r2 = (qg.p) r2
            if (r2 != 0) goto L338
            wf.b r0 = new wf.b
            r0.<init>(r8, r7)
        L336:
            r8 = r0
            goto L350
        L338:
            wf.g r7 = r7.t(r1)
            if (r7 != r0) goto L345
            wf.b r7 = new wf.b
            r7.<init>(r2, r8)
            r8 = r7
            goto L350
        L345:
            wf.b r0 = new wf.b
            wf.b r1 = new wf.b
            r1.<init>(r8, r7)
            r0.<init>(r2, r1)
            goto L336
        L350:
            return r8
        L351:
            java.lang.String r7 = (java.lang.String) r7
            wf.e r8 = (wf.e) r8
            r7.getClass()
            r8.getClass()
            int r0 = r7.length()
            if (r0 != 0) goto L366
            java.lang.String r7 = r8.toString()
            goto L37a
        L366:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = ", "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
        L37a:
            return r7
        L37b:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            r8.getClass()
            r8 = 1
            int r8 = i0.r.C(r8)
            wb.ho.a(r7, r8)
            sf.n r7 = sf.n.f12433a
            return r7
        L38d:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            r8.getClass()
            r8 = 1
            int r8 = i0.r.C(r8)
            wb.ho.R(r7, r8)
            sf.n r7 = sf.n.f12433a
            return r7
        L39f:
            xb.i r7 = (xb.i) r7
            e1.b r8 = (e1.b) r8
            r7.getClass()
            sf.n r7 = sf.n.f12433a
            return r7
        L3a9:
            r3 = r7
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            r8 = r7 & 3
            r0 = 2
            r1 = 1
            if (r8 == r0) goto L3ba
            r8 = r1
            goto L3bb
        L3ba:
            r8 = 0
        L3bb:
            r7 = r7 & r1
            boolean r7 = r3.S(r7, r8)
            if (r7 == 0) goto L3ce
            r4 = 54
            r5 = 4
            java.lang.String r0 = "生效范围"
            java.lang.String r1 = "微信和小程序定位"
            r2 = 0
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            goto L3d1
        L3ce:
            r3.V()
        L3d1:
            sf.n r7 = sf.n.f12433a
            return r7
        L3d4:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r0 = r8 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L3e4
            r0 = r2
            goto L3e5
        L3e4:
            r0 = 0
        L3e5:
            r8 = r8 & r2
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto L3f3
            java.lang.String r8 = "没有匹配标签"
            r0 = 6
            wb.ho.s0(r8, r7, r0)
            goto L3f6
        L3f3:
            r7.V()
        L3f6:
            sf.n r7 = sf.n.f12433a
            return r7
        L3f9:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r0 = r8 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L409
            r0 = r2
            goto L40a
        L409:
            r0 = 0
        L40a:
            r8 = r8 & r2
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto L418
            java.lang.String r8 = "没有匹配结果"
            r0 = 6
            wb.ho.s0(r8, r7, r0)
            goto L41b
        L418:
            r7.V()
        L41b:
            sf.n r7 = sf.n.f12433a
            return r7
        L41e:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r0 = r8 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L42e
            r0 = r2
            goto L42f
        L42e:
            r0 = 0
        L42f:
            r8 = r8 & r2
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto L43d
            java.lang.String r8 = "暂无关键词，点击底部“添加关键词”。"
            r0 = 6
            wb.ho.s0(r8, r7, r0)
            goto L440
        L43d:
            r7.V()
        L440:
            sf.n r7 = sf.n.f12433a
            return r7
        L443:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r0 = r8 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L453
            r0 = r2
            goto L454
        L453:
            r0 = 0
        L454:
            r8 = r8 & r2
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto L462
            java.lang.String r8 = "正在载入标签..."
            r0 = 6
            wb.ho.s0(r8, r7, r0)
            goto L465
        L462:
            r7.V()
        L465:
            sf.n r7 = sf.n.f12433a
            return r7
        L468:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r0 = r8 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L478
            r0 = r2
            goto L479
        L478:
            r0 = 0
        L479:
            r8 = r8 & r2
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto L487
            java.lang.String r8 = "该规则已不存在"
            r0 = 6
            wb.ho.s0(r8, r7, r0)
            goto L48a
        L487:
            r7.V()
        L48a:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
