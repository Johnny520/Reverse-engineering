package x6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r6.c f21198h;

    public /* synthetic */ a(r6.c r1, int r2) {
            r0 = this;
            r0.f21197g = r2
            r0.f21198h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f21197g
            switch(r0) {
                case 0: goto L56e;
                case 1: goto L510;
                case 2: goto L4f7;
                case 3: goto L481;
                case 4: goto L40b;
                case 5: goto L3ae;
                case 6: goto L354;
                case 7: goto L2f7;
                case 8: goto L29c;
                case 9: goto L23f;
                case 10: goto L227;
                case 11: goto L210;
                case 12: goto L1f8;
                case 13: goto L1de;
                case 14: goto L17c;
                case 15: goto L11a;
                case 16: goto L91;
                default: goto L5;
            }
        L5:
            java.util.Set r10 = (java.util.Set) r10
            u6.c r11 = (u6.c) r11
            java.lang.reflect.Member r11 = r11.a()
            boolean r0 = r11 instanceof java.lang.reflect.AnnotatedElement
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.reflect.AnnotatedElement r11 = (java.lang.reflect.AnnotatedElement) r11
            goto L16
        L15:
            r11 = r1
        L16:
            r0 = 0
            if (r11 == 0) goto L20
            java.lang.annotation.Annotation[] r11 = r11.getDeclaredAnnotations()
            if (r11 == 0) goto L20
            goto L22
        L20:
            java.lang.annotation.Annotation[] r11 = new java.lang.annotation.Annotation[r0]
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r11.length
            r2.<init>(r3)
            int r3 = r11.length
            r4 = r0
        L2a:
            if (r4 >= r3) goto L3f
            r5 = r11[r4]
            gg.f r5 = a.a.Q(r5)
            java.lang.Class r5 = r5.a()
            r5.getClass()
            r2.add(r5)
            int r4 = r4 + 1
            goto L2a
        L3f:
            java.util.Collection r10 = (java.util.Collection) r10
            int r11 = r10.size()
            int r3 = r2.size()
            r4 = 1
            if (r11 == r3) goto L4d
            goto L8a
        L4d:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = r0
        L54:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L89
            java.lang.Object r3 = r10.next()
            int r5 = r11 + 1
            java.lang.Object r11 = r2.get(r11)
            java.lang.Class r11 = (java.lang.Class) r11
            r6.c r6 = r9.f21198h
            java.lang.Class r3 = x6.g.k(r3, r6, r1)
            java.lang.Class<s6.b> r6 = s6.b.class
            gg.f r7 = gg.v.a(r6)
            java.lang.Class r7 = a.a.a0(r7)
            if (r7 != 0) goto L79
            goto L7a
        L79:
            r6 = r7
        L7a:
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L87
            boolean r11 = gg.l.a(r11, r3)
            if (r11 != 0) goto L87
            goto L8a
        L87:
            r11 = r5
            goto L54
        L89:
            r0 = r4
        L8a:
            r10 = r0 ^ 1
        L8c:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L91:
            java.util.Set r10 = (java.util.Set) r10
            u6.c r11 = (u6.c) r11
            java.lang.reflect.Member r11 = r11.a()
            boolean r0 = r11 instanceof java.lang.reflect.AnnotatedElement
            r1 = 0
            if (r0 == 0) goto La1
            java.lang.reflect.AnnotatedElement r11 = (java.lang.reflect.AnnotatedElement) r11
            goto La2
        La1:
            r11 = r1
        La2:
            r0 = 0
            if (r11 == 0) goto Lac
            java.lang.annotation.Annotation[] r11 = r11.getDeclaredAnnotations()
            if (r11 == 0) goto Lac
            goto Lae
        Lac:
            java.lang.annotation.Annotation[] r11 = new java.lang.annotation.Annotation[r0]
        Lae:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r11.length
            r2.<init>(r3)
            int r3 = r11.length
            r4 = r0
        Lb6:
            if (r4 >= r3) goto Lcb
            r5 = r11[r4]
            gg.f r5 = a.a.Q(r5)
            java.lang.Class r5 = r5.a()
            r5.getClass()
            r2.add(r5)
            int r4 = r4 + 1
            goto Lb6
        Lcb:
            java.util.Collection r10 = (java.util.Collection) r10
            int r11 = r10.size()
            int r3 = r2.size()
            if (r11 == r3) goto Ld8
            goto L115
        Ld8:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = r0
        Ldf:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L114
            java.lang.Object r3 = r10.next()
            int r4 = r11 + 1
            java.lang.Object r11 = r2.get(r11)
            java.lang.Class r11 = (java.lang.Class) r11
            r6.c r5 = r9.f21198h
            java.lang.Class r3 = x6.g.k(r3, r5, r1)
            java.lang.Class<s6.b> r5 = s6.b.class
            gg.f r6 = gg.v.a(r5)
            java.lang.Class r6 = a.a.a0(r6)
            if (r6 != 0) goto L104
            goto L105
        L104:
            r5 = r6
        L105:
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L112
            boolean r11 = gg.l.a(r11, r3)
            if (r11 != 0) goto L112
            goto L115
        L112:
            r11 = r4
            goto Ldf
        L114:
            r0 = 1
        L115:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            return r10
        L11a:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.reflect.Executable r11 = r11.f13523c
            java.lang.Class[] r11 = r11.getExceptionTypes()
            r11.getClass()
            java.util.List r11 = tf.l.L0(r11)
            int r0 = r10.size()
            int r1 = r11.size()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L13a
            goto L178
        L13a:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r0 = r3
        L141:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L177
            java.lang.Object r1 = r10.next()
            int r4 = r0 + 1
            java.lang.Object r0 = r11.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            r6.c r5 = r9.f21198h
            r6 = 0
            java.lang.Class r1 = x6.g.k(r1, r5, r6)
            java.lang.Class<s6.b> r5 = s6.b.class
            gg.f r6 = gg.v.a(r5)
            java.lang.Class r6 = a.a.a0(r6)
            if (r6 != 0) goto L167
            goto L168
        L167:
            r5 = r6
        L168:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L175
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L175
            goto L178
        L175:
            r0 = r4
            goto L141
        L177:
            r3 = r2
        L178:
            r10 = r3 ^ 1
            goto L8c
        L17c:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.reflect.Executable r11 = r11.f13523c
            java.lang.Class[] r11 = r11.getExceptionTypes()
            r11.getClass()
            java.util.List r11 = tf.l.L0(r11)
            int r0 = r10.size()
            int r1 = r11.size()
            r2 = 0
            if (r0 == r1) goto L19b
            goto L1d9
        L19b:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r0 = r2
        L1a2:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L1d8
            java.lang.Object r1 = r10.next()
            int r3 = r0 + 1
            java.lang.Object r0 = r11.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            r6.c r4 = r9.f21198h
            r5 = 0
            java.lang.Class r1 = x6.g.k(r1, r4, r5)
            java.lang.Class<s6.b> r4 = s6.b.class
            gg.f r5 = gg.v.a(r4)
            java.lang.Class r5 = a.a.a0(r5)
            if (r5 != 0) goto L1c8
            goto L1c9
        L1c8:
            r4 = r5
        L1c9:
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L1d6
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1d6
            goto L1d9
        L1d6:
            r0 = r3
            goto L1a2
        L1d8:
            r2 = 1
        L1d9:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        L1de:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            r11.getClass()
            r11 = 0
            java.lang.reflect.AnnotatedElement[] r11 = new java.lang.reflect.AnnotatedElement[r11]
            java.util.List r11 = x6.g.e(r11)
            java.util.Collection r10 = (java.util.Collection) r10
            r6.c r0 = r9.f21198h
            boolean r10 = x6.g.f(r10, r11, r0)
        L1f4:
            r10 = r10 ^ 1
            goto L8c
        L1f8:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            r11.getClass()
            r11 = 0
            java.lang.reflect.AnnotatedElement[] r11 = new java.lang.reflect.AnnotatedElement[r11]
            java.util.List r11 = x6.g.e(r11)
            java.util.Collection r10 = (java.util.Collection) r10
            r6.c r0 = r9.f21198h
            boolean r10 = x6.g.f(r10, r11, r0)
            goto L8c
        L210:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            r11.getClass()
            r11 = 0
            java.lang.reflect.AnnotatedElement[] r11 = new java.lang.reflect.AnnotatedElement[r11]
            java.util.List r11 = x6.g.e(r11)
            java.util.Collection r10 = (java.util.Collection) r10
            r6.c r0 = r9.f21198h
            boolean r10 = x6.g.f(r10, r11, r0)
            goto L1f4
        L227:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            r11.getClass()
            r11 = 0
            java.lang.reflect.AnnotatedElement[] r11 = new java.lang.reflect.AnnotatedElement[r11]
            java.util.List r11 = x6.g.e(r11)
            java.util.Collection r10 = (java.util.Collection) r10
            r6.c r0 = r9.f21198h
            boolean r10 = x6.g.f(r10, r11, r0)
            goto L8c
        L23f:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            r11.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 0
            r11.<init>(r0)
            java.util.Collection r10 = (java.util.Collection) r10
            int r1 = r10.size()
            int r2 = r11.size()
            r3 = 1
            if (r1 == r2) goto L25a
            goto L298
        L25a:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r1 = r0
        L261:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L297
            java.lang.Object r2 = r10.next()
            int r4 = r1 + 1
            java.lang.Object r1 = r11.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r6.c r5 = r9.f21198h
            r6 = 0
            java.lang.Class r2 = x6.g.k(r2, r5, r6)
            java.lang.Class<s6.b> r5 = s6.b.class
            gg.f r6 = gg.v.a(r5)
            java.lang.Class r6 = a.a.a0(r6)
            if (r6 != 0) goto L287
            goto L288
        L287:
            r5 = r6
        L288:
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L295
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L295
            goto L298
        L295:
            r1 = r4
            goto L261
        L297:
            r0 = r3
        L298:
            r10 = r0 ^ 1
            goto L8c
        L29c:
            java.util.List r10 = (java.util.List) r10
            u6.a r11 = (u6.a) r11
            java.lang.reflect.Executable r11 = r11.f13523c
            java.lang.Class[] r11 = r11.getParameterTypes()
            r11.getClass()
            java.util.List r11 = tf.l.L0(r11)
            int r0 = r10.size()
            int r1 = r11.size()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L2bb
            goto L178
        L2bb:
            java.util.Iterator r10 = r10.iterator()
            r0 = r3
        L2c0:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L177
            java.lang.Object r1 = r10.next()
            int r4 = r0 + 1
            java.lang.Object r0 = r11.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            r6.c r5 = r9.f21198h
            r6 = 0
            java.lang.Class r1 = x6.g.k(r1, r5, r6)
            java.lang.Class<s6.b> r5 = s6.b.class
            gg.f r6 = gg.v.a(r5)
            java.lang.Class r6 = a.a.a0(r6)
            if (r6 != 0) goto L2e6
            goto L2e7
        L2e6:
            r5 = r6
        L2e7:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L2f5
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2f5
            goto L178
        L2f5:
            r0 = r4
            goto L2c0
        L2f7:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            r11.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 0
            r11.<init>(r0)
            java.util.Collection r10 = (java.util.Collection) r10
            int r1 = r10.size()
            int r2 = r11.size()
            if (r1 == r2) goto L311
            goto L34f
        L311:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r1 = r0
        L318:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L34e
            java.lang.Object r2 = r10.next()
            int r3 = r1 + 1
            java.lang.Object r1 = r11.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r6.c r4 = r9.f21198h
            r5 = 0
            java.lang.Class r2 = x6.g.k(r2, r4, r5)
            java.lang.Class<s6.b> r4 = s6.b.class
            gg.f r5 = gg.v.a(r4)
            java.lang.Class r5 = a.a.a0(r5)
            if (r5 != 0) goto L33e
            goto L33f
        L33e:
            r4 = r5
        L33f:
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L34c
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L34c
            goto L34f
        L34c:
            r1 = r3
            goto L318
        L34e:
            r0 = 1
        L34f:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            return r10
        L354:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            r11.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 0
            r11.<init>(r0)
            java.util.Collection r10 = (java.util.Collection) r10
            int r1 = r10.size()
            int r2 = r11.size()
            r3 = 1
            if (r1 == r2) goto L370
            goto L298
        L370:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r1 = r0
        L377:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L297
            java.lang.Object r2 = r10.next()
            int r4 = r1 + 1
            java.lang.Object r1 = r11.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r6.c r5 = r9.f21198h
            r6 = 0
            java.lang.Class r2 = x6.g.k(r2, r5, r6)
            java.lang.Class<s6.b> r5 = s6.b.class
            gg.f r6 = gg.v.a(r5)
            java.lang.Class r6 = a.a.a0(r6)
            if (r6 != 0) goto L39d
            goto L39e
        L39d:
            r5 = r6
        L39e:
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L3ac
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L3ac
            goto L298
        L3ac:
            r1 = r4
            goto L377
        L3ae:
            java.util.Set r10 = (java.util.Set) r10
            u6.a r11 = (u6.a) r11
            r11.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 0
            r11.<init>(r0)
            java.util.Collection r10 = (java.util.Collection) r10
            int r1 = r10.size()
            int r2 = r11.size()
            if (r1 == r2) goto L3c8
            goto L406
        L3c8:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r1 = r0
        L3cf:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L405
            java.lang.Object r2 = r10.next()
            int r3 = r1 + 1
            java.lang.Object r1 = r11.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r6.c r4 = r9.f21198h
            r5 = 0
            java.lang.Class r2 = x6.g.k(r2, r4, r5)
            java.lang.Class<s6.b> r4 = s6.b.class
            gg.f r5 = gg.v.a(r4)
            java.lang.Class r5 = a.a.a0(r5)
            if (r5 != 0) goto L3f5
            goto L3f6
        L3f5:
            r4 = r5
        L3f6:
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L403
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L403
            goto L406
        L403:
            r1 = r3
            goto L3cf
        L405:
            r0 = 1
        L406:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            return r10
        L40b:
            java.util.List r10 = (java.util.List) r10
            u6.a r11 = (u6.a) r11
            java.lang.reflect.Executable r11 = r11.f13523c
            java.lang.annotation.Annotation[][] r11 = r11.getParameterAnnotations()
            r11.getClass()
            java.lang.annotation.Annotation[][] r11 = (java.lang.annotation.Annotation[][]) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
            r3 = r2
        L423:
            if (r3 >= r1) goto L44c
            r4 = r11[r3]
            java.lang.annotation.Annotation[] r4 = (java.lang.annotation.Annotation[]) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.length
            r5.<init>(r6)
            int r6 = r4.length
            r7 = r2
        L431:
            if (r7 >= r6) goto L446
            r8 = r4[r7]
            gg.f r8 = a.a.Q(r8)
            java.lang.Class r8 = r8.a()
            r8.getClass()
            r5.add(r8)
            int r7 = r7 + 1
            goto L431
        L446:
            r0.add(r5)
            int r3 = r3 + 1
            goto L423
        L44c:
            int r11 = r10.size()
            int r1 = r0.size()
            r3 = 1
            if (r11 == r1) goto L458
            goto L47d
        L458:
            java.util.Iterator r10 = r10.iterator()
            r11 = r2
        L45d:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L47c
            java.lang.Object r1 = r10.next()
            java.util.Collection r1 = (java.util.Collection) r1
            int r4 = r11 + 1
            java.lang.Object r11 = r0.get(r11)
            java.util.List r11 = (java.util.List) r11
            r6.c r5 = r9.f21198h
            boolean r11 = x6.g.f(r1, r11, r5)
            if (r11 != 0) goto L47a
            goto L47d
        L47a:
            r11 = r4
            goto L45d
        L47c:
            r2 = r3
        L47d:
            r10 = r2 ^ 1
            goto L8c
        L481:
            java.util.List r10 = (java.util.List) r10
            u6.a r11 = (u6.a) r11
            java.lang.reflect.Executable r11 = r11.f13523c
            java.lang.annotation.Annotation[][] r11 = r11.getParameterAnnotations()
            r11.getClass()
            java.lang.annotation.Annotation[][] r11 = (java.lang.annotation.Annotation[][]) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
            r3 = r2
        L499:
            if (r3 >= r1) goto L4c2
            r4 = r11[r3]
            java.lang.annotation.Annotation[] r4 = (java.lang.annotation.Annotation[]) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.length
            r5.<init>(r6)
            int r6 = r4.length
            r7 = r2
        L4a7:
            if (r7 >= r6) goto L4bc
            r8 = r4[r7]
            gg.f r8 = a.a.Q(r8)
            java.lang.Class r8 = r8.a()
            r8.getClass()
            r5.add(r8)
            int r7 = r7 + 1
            goto L4a7
        L4bc:
            r0.add(r5)
            int r3 = r3 + 1
            goto L499
        L4c2:
            int r11 = r10.size()
            int r1 = r0.size()
            if (r11 == r1) goto L4cd
            goto L4f2
        L4cd:
            java.util.Iterator r10 = r10.iterator()
            r11 = r2
        L4d2:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L4f1
            java.lang.Object r1 = r10.next()
            java.util.Collection r1 = (java.util.Collection) r1
            int r3 = r11 + 1
            java.lang.Object r11 = r0.get(r11)
            java.util.List r11 = (java.util.List) r11
            r6.c r4 = r9.f21198h
            boolean r11 = x6.g.f(r1, r11, r4)
            if (r11 != 0) goto L4ef
            goto L4f2
        L4ef:
            r11 = r3
            goto L4d2
        L4f1:
            r2 = 1
        L4f2:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        L4f7:
            u6.d r11 = (u6.d) r11
            java.lang.reflect.Method r11 = r11.f13528c
            java.lang.Class r11 = r11.getReturnType()
            r11.getClass()
            java.lang.String r0 = "Method: returnType"
            r6.c r1 = r9.f21198h
            java.lang.Class r10 = x6.g.k(r10, r1, r0)
            boolean r10 = r11.equals(r10)
            goto L8c
        L510:
            java.util.List r10 = (java.util.List) r10
            u6.a r11 = (u6.a) r11
            java.lang.reflect.Executable r11 = r11.f13523c
            java.lang.Class[] r11 = r11.getParameterTypes()
            r11.getClass()
            java.util.List r11 = tf.l.L0(r11)
            int r0 = r10.size()
            int r1 = r11.size()
            r2 = 0
            if (r0 == r1) goto L52d
            goto L569
        L52d:
            java.util.Iterator r10 = r10.iterator()
            r0 = r2
        L532:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L568
            java.lang.Object r1 = r10.next()
            int r3 = r0 + 1
            java.lang.Object r0 = r11.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            r6.c r4 = r9.f21198h
            r5 = 0
            java.lang.Class r1 = x6.g.k(r1, r4, r5)
            java.lang.Class<s6.b> r4 = s6.b.class
            gg.f r5 = gg.v.a(r4)
            java.lang.Class r5 = a.a.a0(r5)
            if (r5 != 0) goto L558
            goto L559
        L558:
            r4 = r5
        L559:
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L566
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L566
            goto L569
        L566:
            r0 = r3
            goto L532
        L568:
            r2 = 1
        L569:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        L56e:
            u6.b r11 = (u6.b) r11
            java.lang.reflect.Field r11 = r11.f13525c
            java.lang.Class r11 = r11.getType()
            r11.getClass()
            java.lang.String r0 = "Field: type"
            r6.c r1 = r9.f21198h
            java.lang.Class r10 = x6.g.k(r10, r1, r0)
            boolean r10 = r11.equals(r10)
            goto L8c
    }
}
