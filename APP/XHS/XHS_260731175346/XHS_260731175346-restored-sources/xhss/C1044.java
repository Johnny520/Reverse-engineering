package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛵᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1044 implements xhss.InterfaceC0517 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3367;

    public /* synthetic */ C1044(int r1) {
            r0 = this;
            r0.f3367 = r1
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0517
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.Object mo115(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r5 = r5.f3367
            r0 = 0
            r1 = 1
            r2 = 0
            switch(r5) {
                case 0: goto L3ea;
                case 1: goto L3af;
                case 2: goto L3a6;
                case 3: goto L39d;
                case 4: goto L390;
                case 5: goto L37e;
                case 6: goto L370;
                case 7: goto L35e;
                case 8: goto L327;
                case 9: goto L2f2;
                case 10: goto L2bb;
                case 11: goto L2a6;
                case 12: goto L291;
                case 13: goto L26e;
                case 14: goto L247;
                case 15: goto L232;
                case 16: goto L20b;
                case 17: goto L1d6;
                case 18: goto L19f;
                case 19: goto L16a;
                case 20: goto L155;
                case 21: goto L144;
                case 22: goto L121;
                case 23: goto Lf4;
                case 24: goto Lc8;
                case 25: goto L7a;
                case 26: goto L65;
                case 27: goto L50;
                case 28: goto L1d;
                default: goto L8;
            }
        L8:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r6 = r7.isBridge()
            if (r6 == r5) goto L17
            goto L18
        L17:
            r1 = r2
        L18:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L1d:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            boolean r5 = r7 instanceof java.lang.reflect.Method
            if (r5 == 0) goto L2c
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r5 = r7.toGenericString()
            goto L41
        L2c:
            boolean r5 = r7 instanceof java.lang.reflect.Constructor
            if (r5 == 0) goto L37
            java.lang.reflect.Constructor r7 = (java.lang.reflect.Constructor) r7
            java.lang.String r5 = r7.toGenericString()
            goto L41
        L37:
            boolean r5 = r7 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L4a
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.String r5 = r7.toGenericString()
        L41:
            boolean r5 = xhss.AbstractC0007.m97(r5, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L4f
        L4a:
            java.lang.String r5 = "Unsupported member type: "
            xhss.C0532.m948(r7, r5)
        L4f:
            return r0
        L50:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            boolean r6 = r7.isSynthetic()
            if (r6 == r5) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L65:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            boolean r6 = r7.isSynthetic()
            if (r6 != r5) goto L74
            goto L75
        L74:
            r1 = r2
        L75:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L7a:
            xhss.ᛷᛴᛲᛲ r6 = (xhss.InterfaceC0645) r6
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            int r5 = r7.getModifiers()     // Catch: java.lang.Throwable -> Lb7
            xhss.ᲇᛳᛴ r7 = xhss.EnumC0858.f2771     // Catch: java.lang.Throwable -> Lb7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb7
            xhss.ᛸᛲᲀᛵ r3 = new xhss.ᛸᛲᲀᛵ     // Catch: java.lang.Throwable -> Lb7
            r3.<init>(r2, r7)     // Catch: java.lang.Throwable -> Lb7
        L8e:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto La9
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> Lb7
            r4 = r7
            xhss.ᲀᛴᛳᲁ r4 = (xhss.EnumC0858) r4     // Catch: java.lang.Throwable -> Lb7
            int r4 = r4.f2774     // Catch: java.lang.Throwable -> Lb7
            r4 = r4 & r5
            if (r4 == 0) goto La2
            r4 = r1
            goto La3
        La2:
            r4 = r2
        La3:
            if (r4 == 0) goto L8e
            r0.add(r7)     // Catch: java.lang.Throwable -> Lb7
            goto L8e
        La9:
            java.util.Set r5 = xhss.AbstractC0713.m1245(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r5 = r6.mo112(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lb7
            r5.getClass()     // Catch: java.lang.Throwable -> Lb7
            goto Lbe
        Lb7:
            r5 = move-exception
            xhss.ᲈᛳᛱᲇ r6 = new xhss.ᲈᛳᛱᲇ
            r6.<init>(r5)
            r5 = r6
        Lbe:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r5 instanceof xhss.C1129
            if (r7 == 0) goto Lc5
            r5 = r6
        Lc5:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        Lc8:
            java.util.Set r6 = (java.util.Set) r6
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            if (r6 == 0) goto Ld5
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto Ld5
            goto Lef
        Ld5:
            java.util.Iterator r5 = r6.iterator()
        Ld9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lef
            java.lang.Object r6 = r5.next()
            xhss.ᲀᛴᛳᲁ r6 = (xhss.EnumC0858) r6
            int r0 = r7.getModifiers()
            int r6 = r6.f2774
            r6 = r6 & r0
            if (r6 == 0) goto Ld9
            r1 = r2
        Lef:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        Lf4:
            java.util.Set r6 = (java.util.Set) r6
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            if (r6 == 0) goto L101
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L101
            goto L11c
        L101:
            java.util.Iterator r5 = r6.iterator()
        L105:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L11c
            java.lang.Object r6 = r5.next()
            xhss.ᲀᛴᛳᲁ r6 = (xhss.EnumC0858) r6
            int r0 = r7.getModifiers()
            int r6 = r6.f2774
            r6 = r6 & r0
            if (r6 == 0) goto L11b
            goto L105
        L11b:
            r1 = r2
        L11c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L121:
            xhss.ᛷᛴᛲᛲ r6 = (xhss.InterfaceC0645) r6
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            java.lang.String r5 = r7.getName()     // Catch: java.lang.Throwable -> L133
            java.lang.Object r5 = r6.mo112(r5)     // Catch: java.lang.Throwable -> L133
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L133
            r5.booleanValue()     // Catch: java.lang.Throwable -> L133
            goto L13a
        L133:
            r5 = move-exception
            xhss.ᲈᛳᛱᲇ r6 = new xhss.ᲈᛳᛱᲇ
            r6.<init>(r5)
            r5 = r6
        L13a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r5 instanceof xhss.C1129
            if (r7 == 0) goto L141
            r5 = r6
        L141:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        L144:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Member r7 = (java.lang.reflect.Member) r7
            java.lang.String r5 = r7.getName()
            boolean r5 = xhss.AbstractC0007.m97(r5, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L155:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r6 = r7.isBridge()
            if (r6 != r5) goto L164
            goto L165
        L164:
            r1 = r2
        L165:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L16a:
            java.util.Set r6 = (java.util.Set) r6
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            java.lang.reflect.Type[] r5 = r7.getGenericExceptionTypes()
            java.util.List r5 = xhss.AbstractC0193.m454(r5)
            int r7 = r6.size()
            int r3 = r5.size()
            if (r7 == r3) goto L182
            r1 = r2
            goto L18c
        L182:
            java.util.Iterator r6 = r6.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L191
        L18c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L191:
            java.lang.Object r6 = r6.next()
            xhss.AbstractC0390.m786(r6)
            java.lang.Object r5 = r5.get(r2)
            java.lang.reflect.Type r5 = (java.lang.reflect.Type) r5
            throw r0
        L19f:
            java.util.Set r6 = (java.util.Set) r6
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            java.lang.reflect.TypeVariable[] r5 = r7.getTypeParameters()
            java.util.List r5 = xhss.AbstractC0193.m454(r5)
            int r7 = r6.size()
            int r3 = r5.size()
            if (r7 == r3) goto L1b6
            goto L1c1
        L1b6:
            java.util.Iterator r6 = r6.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L1c8
            r2 = r1
        L1c1:
            r5 = r2 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L1c8:
            java.lang.Object r6 = r6.next()
            xhss.AbstractC0390.m786(r6)
            java.lang.Object r5 = r5.get(r2)
            java.lang.reflect.Type r5 = (java.lang.reflect.Type) r5
            throw r0
        L1d6:
            java.util.Set r6 = (java.util.Set) r6
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            java.lang.reflect.TypeVariable[] r5 = r7.getTypeParameters()
            java.util.List r5 = xhss.AbstractC0193.m454(r5)
            int r7 = r6.size()
            int r3 = r5.size()
            if (r7 == r3) goto L1ee
            r1 = r2
            goto L1f8
        L1ee:
            java.util.Iterator r6 = r6.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L1fd
        L1f8:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L1fd:
            java.lang.Object r6 = r6.next()
            xhss.AbstractC0390.m786(r6)
            java.lang.Object r5 = r5.get(r2)
            java.lang.reflect.Type r5 = (java.lang.reflect.Type) r5
            throw r0
        L20b:
            xhss.ᛷᛴᛲᛲ r6 = (xhss.InterfaceC0645) r6
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            int r5 = r7.getParameterCount()     // Catch: java.lang.Throwable -> L221
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L221
            java.lang.Object r5 = r6.mo112(r5)     // Catch: java.lang.Throwable -> L221
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L221
            r5.booleanValue()     // Catch: java.lang.Throwable -> L221
            goto L228
        L221:
            r5 = move-exception
            xhss.ᲈᛳᛱᲇ r6 = new xhss.ᲈᛳᛱᲇ
            r6.<init>(r5)
            r5 = r6
        L228:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r5 instanceof xhss.C1129
            if (r7 == 0) goto L22f
            r5 = r6
        L22f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        L232:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            int r6 = r7.getParameterCount()
            if (r6 != r5) goto L241
            goto L242
        L241:
            r1 = r2
        L242:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L247:
            xhss.ᛷᛴᛲᛲ r6 = (xhss.InterfaceC0645) r6
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            java.lang.Class[] r5 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L25d
            java.util.List r5 = xhss.AbstractC0193.m454(r5)     // Catch: java.lang.Throwable -> L25d
            java.lang.Object r5 = r6.mo112(r5)     // Catch: java.lang.Throwable -> L25d
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L25d
            r5.booleanValue()     // Catch: java.lang.Throwable -> L25d
            goto L264
        L25d:
            r5 = move-exception
            xhss.ᲈᛳᛱᲇ r6 = new xhss.ᲈᛳᛱᲇ
            r6.<init>(r5)
            r5 = r6
        L264:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r5 instanceof xhss.C1129
            if (r7 == 0) goto L26b
            r5 = r6
        L26b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        L26e:
            xhss.ᛷᛴᛲᛲ r6 = (xhss.InterfaceC0645) r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class r5 = r7.getReturnType()     // Catch: java.lang.Throwable -> L280
            java.lang.Object r5 = r6.mo112(r5)     // Catch: java.lang.Throwable -> L280
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L280
            r5.booleanValue()     // Catch: java.lang.Throwable -> L280
            goto L287
        L280:
            r5 = move-exception
            xhss.ᲈᛳᛱᲇ r6 = new xhss.ᲈᛳᛱᲇ
            r6.<init>(r5)
            r5 = r6
        L287:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r5 instanceof xhss.C1129
            if (r7 == 0) goto L28e
            r5 = r6
        L28e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        L291:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            boolean r6 = r7.isVarArgs()
            if (r6 == r5) goto L2a0
            goto L2a1
        L2a0:
            r1 = r2
        L2a1:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L2a6:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            boolean r6 = r7.isVarArgs()
            if (r6 != r5) goto L2b5
            goto L2b6
        L2b5:
            r1 = r2
        L2b6:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L2bb:
            java.util.Set r6 = (java.util.Set) r6
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            java.lang.reflect.Type[] r5 = r7.getGenericParameterTypes()
            java.util.List r5 = xhss.AbstractC0193.m454(r5)
            int r7 = r6.size()
            int r3 = r5.size()
            if (r7 == r3) goto L2d2
            goto L2dd
        L2d2:
            java.util.Iterator r6 = r6.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L2e4
            r2 = r1
        L2dd:
            r5 = r2 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L2e4:
            java.lang.Object r6 = r6.next()
            xhss.AbstractC0390.m786(r6)
            java.lang.Object r5 = r5.get(r2)
            java.lang.reflect.Type r5 = (java.lang.reflect.Type) r5
            throw r0
        L2f2:
            java.util.Set r6 = (java.util.Set) r6
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            java.lang.reflect.Type[] r5 = r7.getGenericParameterTypes()
            java.util.List r5 = xhss.AbstractC0193.m454(r5)
            int r7 = r6.size()
            int r3 = r5.size()
            if (r7 == r3) goto L30a
            r1 = r2
            goto L314
        L30a:
            java.util.Iterator r6 = r6.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L319
        L314:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L319:
            java.lang.Object r6 = r6.next()
            xhss.AbstractC0390.m786(r6)
            java.lang.Object r5 = r5.get(r2)
            java.lang.reflect.Type r5 = (java.lang.reflect.Type) r5
            throw r0
        L327:
            java.util.Set r6 = (java.util.Set) r6
            java.lang.reflect.Executable r7 = (java.lang.reflect.Executable) r7
            java.lang.reflect.Type[] r5 = r7.getGenericExceptionTypes()
            java.util.List r5 = xhss.AbstractC0193.m454(r5)
            int r7 = r6.size()
            int r3 = r5.size()
            if (r7 == r3) goto L33e
            goto L349
        L33e:
            java.util.Iterator r6 = r6.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L350
            r2 = r1
        L349:
            r5 = r2 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L350:
            java.lang.Object r6 = r6.next()
            xhss.AbstractC0390.m786(r6)
            java.lang.Object r5 = r5.get(r2)
            java.lang.reflect.Type r5 = (java.lang.reflect.Type) r5
            throw r0
        L35e:
            xhss.ᛷᛴᛲᛲ r6 = (xhss.InterfaceC0645) r6
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.reflect.Type r5 = r7.getGenericType()
            java.lang.Object r5 = r6.mo112(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            return r5
        L370:
            if (r6 != 0) goto L378
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getGenericType()
            throw r0
        L378:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L37e:
            xhss.ᛷᛴᛲᛲ r6 = (xhss.InterfaceC0645) r6
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.Class r5 = r7.getType()
            java.lang.Object r5 = r6.mo112(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            return r5
        L390:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            xhss.ᛳᛵᲈᛲ r7 = (xhss.InterfaceC0281) r7
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L39d:
            xhss.ᛴᛵᛳᛵ r6 = (xhss.InterfaceC0362) r6
            xhss.ᛳᛵᲈᛲ r7 = (xhss.InterfaceC0281) r7
            xhss.ᛴᛵᛳᛵ r5 = r6.mo599(r7)
            return r5
        L3a6:
            xhss.ᛴᛵᛳᛵ r6 = (xhss.InterfaceC0362) r6
            xhss.ᛳᛵᲈᛲ r7 = (xhss.InterfaceC0281) r7
            xhss.ᛴᛵᛳᛵ r5 = r6.mo599(r7)
            return r5
        L3af:
            xhss.ᛴᛵᛳᛵ r6 = (xhss.InterfaceC0362) r6
            xhss.ᛳᛵᲈᛲ r7 = (xhss.InterfaceC0281) r7
            xhss.ᲇᲁᛵᲈ r5 = r7.getKey()
            xhss.ᛴᛵᛳᛵ r5 = r6.mo440(r5)
            xhss.ᲇᛷᲁᛷ r6 = xhss.C1059.f3421
            if (r5 != r6) goto L3c0
            goto L3e9
        L3c0:
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f972
            xhss.ᛳᛵᲈᛲ r1 = r5.mo442(r0)
            xhss.ᛲᛶᲇᲇ r1 = (xhss.AbstractC0180) r1
            if (r1 != 0) goto L3d1
            xhss.ᛳᛵᲈᲈ r6 = new xhss.ᛳᛵᲈᲈ
            r6.<init>(r5, r7)
        L3cf:
            r7 = r6
            goto L3e9
        L3d1:
            xhss.ᛴᛵᛳᛵ r5 = r5.mo440(r0)
            if (r5 != r6) goto L3de
            xhss.ᛳᛵᲈᲈ r5 = new xhss.ᛳᛵᲈᲈ
            r5.<init>(r7, r1)
            r7 = r5
            goto L3e9
        L3de:
            xhss.ᛳᛵᲈᲈ r6 = new xhss.ᛳᛵᲈᲈ
            xhss.ᛳᛵᲈᲈ r0 = new xhss.ᛳᛵᲈᲈ
            r0.<init>(r5, r7)
            r6.<init>(r0, r1)
            goto L3cf
        L3e9:
            return r7
        L3ea:
            java.lang.String r6 = (java.lang.String) r6
            xhss.ᛳᛵᲈᛲ r7 = (xhss.InterfaceC0281) r7
            int r5 = r6.length()
            if (r5 != 0) goto L3f9
            java.lang.String r5 = r7.toString()
            goto L40a
        L3f9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
        L40a:
            return r5
    }
}
