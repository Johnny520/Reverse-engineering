package defpackage;

/* JADX INFO: renamed from: ᛳᲀᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0548 implements defpackage.InterfaceC0126 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static java.lang.Boolean f2710;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Object f2711;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f2712;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f2713;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Object f2714;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.Object f2715;

    public C0548() {
            r2 = this;
            r2.<init>()
            ᛸᛶᛱᛵ r0 = defpackage.C1500.f6607
            r2.f2715 = r0
            java.lang.String r0 = "GET"
            r2.f2712 = r0
            ᛳᲈᛳᛸ r0 = new ᛳᲈᛳᛸ
            r1 = 2
            r0.<init>(r1)
            r2.f2711 = r0
            return
    }

    public C0548(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2713 = r0
            r1.f2712 = r2
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static void m1335(android.app.Activity r3, java.util.List r4, defpackage.C0580 r5, defpackage.C1403 r6, defpackage.RunnableC1049 r7) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto La
            r7.run()
            return
        La:
            java.util.Iterator r0 = r4.iterator()
        Le:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            ᲁᛱᛲᛳ r1 = (defpackage.AbstractC1793) r1
            int r1 = r1.mo2345(r3)
            if (r1 != r2) goto L22
            goto Le
        L22:
            r0 = 2
            goto L25
        L24:
            r0 = r2
        L25:
            r6.getClass()
            ᲁᛷᛵ r1 = new ᲁᛷᛵ
            r1.<init>(r6, r3, r4, r7)
            if (r0 != r2) goto L35
            ᛴᛸᛵᛷ r3 = new ᛴᛸᛵᛷ
            r3.<init>()
            goto L3a
        L35:
            ᲁᛵᛴᲀ r3 = new ᲁᛵᛴᲀ
            r3.<init>()
        L3a:
            r6 = 65535(0xffff, float:9.1834E-41)
            int r6 = defpackage.AbstractC1871.m3277(r6)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r0 = "request_code"
            r7.putInt(r0, r6)
            boolean r6 = r4 instanceof java.util.ArrayList
            java.lang.String r0 = "request_permissions"
            if (r6 == 0) goto L57
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r7.putParcelableArrayList(r0, r4)
            goto L5f
        L57:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            r7.putParcelableArrayList(r0, r6)
        L5f:
            r3.setArguments(r7)
            r3.setRetainInstance(r2)
            ᲁᛷᛴᲇ r4 = r3.mo1652()
            r4.f8177 = r2
            ᲁᛷᛴᲇ r4 = r3.mo1652()
            r4.f8178 = r1
            java.lang.Object r4 = r5.f2856
            android.app.FragmentManager r4 = (android.app.FragmentManager) r4
            if (r4 != 0) goto L78
            goto L87
        L78:
            android.app.FragmentTransaction r4 = r4.beginTransaction()
            java.lang.String r5 = r3.toString()
            android.app.FragmentTransaction r3 = r4.add(r3, r5)
            r3.commitAllowingStateLoss()
        L87:
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public void m1336(java.lang.String r13) {
            r12 = this;
            r4 = 0
            r5 = 3
            r1 = 1
            r2 = 0
            java.lang.String r3 = "ws:"
            r0 = r13
            boolean r13 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r13 == 0) goto L19
            r13 = 3
            java.lang.String r13 = r0.substring(r13)
            java.lang.String r0 = "http:"
            java.lang.String r13 = r0.concat(r13)
            goto L33
        L19:
            r10 = 0
            r11 = 4
            r8 = 0
            java.lang.String r9 = "wss:"
            r6 = r0
            r7 = r1
            boolean r13 = r6.regionMatches(r7, r8, r9, r10, r11)
            if (r13 == 0) goto L32
            r13 = 4
            java.lang.String r13 = r0.substring(r13)
            java.lang.String r0 = "https:"
            java.lang.String r13 = r0.concat(r13)
            goto L33
        L32:
            r13 = r0
        L33:
            ᛱᛵᛴᛲ r0 = new ᛱᛵᛴᛲ
            r0.<init>()
            r1 = 0
            r0.m566(r1, r13)
            ᛳᛸᛲ r13 = r0.m568()
            r12.f2713 = r13
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public void m1337(java.lang.String r1) {
            r0 = this;
            java.lang.Object r0 = r0.f2711
            ᛳᲈᛳᛸ r0 = (defpackage.C0588) r0
            r0.m1387(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public void m1338(java.lang.String r3, defpackage.AbstractC1450 r4) {
            r2 = this;
            int r0 = r3.length()
            if (r0 <= 0) goto L5a
            java.lang.String r0 = "method "
            if (r4 != 0) goto L45
            java.lang.String r1 = "POST"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3b
            java.lang.String r1 = "PUT"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3b
            java.lang.String r1 = "PATCH"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3b
            java.lang.String r1 = "PROPPATCH"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3b
            java.lang.String r1 = "QUERY"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3b
            java.lang.String r1 = "REPORT"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3b
            goto L4b
        L3b:
            java.lang.String r2 = " must have a request body."
            java.lang.String r2 = defpackage.AbstractC0225.m817(r0, r3, r2)
            defpackage.C2264.m3678(r2)
            return
        L45:
            boolean r1 = defpackage.AbstractC0209.m775(r3)
            if (r1 == 0) goto L50
        L4b:
            r2.f2712 = r3
            r2.f2714 = r4
            return
        L50:
            java.lang.String r2 = " must not have a request body."
            java.lang.String r2 = defpackage.AbstractC0225.m817(r0, r3, r2)
            defpackage.C2264.m3678(r2)
            return
        L5a:
            java.lang.String r2 = "method.isEmpty() == true"
            defpackage.C2264.m3684(r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m1339(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.Object r0 = r0.f2711
            ᛳᲈᛳᛸ r0 = (defpackage.C0588) r0
            r0.m1386(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C0478 m1340() {
            r1 = this;
            ᛳᛵᛴᛴ r0 = new ᛳᛵᛴᛴ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m1341() {
            r6 = this;
            java.lang.Object r0 = r6.f2713
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r6.f2712
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r2 = defpackage.AbstractC1592.m2874(r0)
            if (r2 == 0) goto Lf
            return
        Lf:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r1.next()
            ᲁᛱᛲᛳ r4 = (defpackage.AbstractC1793) r4
            r5 = 0
            boolean r5 = r4.mo2347(r0, r5)
            if (r5 == 0) goto L3c
            r2.add(r4)
            goto L25
        L3c:
            r3.add(r4)
            goto L25
        L40:
            java.lang.Object r6 = r6.f2715
            ᛵᲇᲀᛵ r6 = (defpackage.InterfaceC0985) r6
            r6.mo1928(r3)
            ᛸᛳᲁᛳ r6 = new ᛸᛳᲁᛳ
            r1 = 1
            r6.<init>(r0, r1)
            r0 = 100
            android.os.Handler r2 = defpackage.AbstractC1710.f7613
            r2.postDelayed(r6, r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public void m1342(defpackage.InterfaceC0985 r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.Object r2 = r0.f2712
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f2711
            ᲀᛴᛱᛱ r3 = (defpackage.C1654) r3
            if (r3 != 0) goto L17
            ᲀᛴᛱᛱ r3 = new ᲀᛴᛱᛱ
            r4 = 18
            r3.<init>(r4)
            r0.f2711 = r3
        L17:
            java.lang.Object r3 = r0.f2714
            ᛷᲈᲀ r3 = (defpackage.C1403) r3
            if (r3 != 0) goto L26
            ᛷᲈᲀ r3 = new ᛷᲈᲀ
            r4 = 17
            r3.<init>(r4)
            r0.f2714 = r3
        L26:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.Object r4 = r0.f2713
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r6.<init>(r4)
            r4 = r2
        L30:
            boolean r5 = r4 instanceof android.app.Activity
            r10 = 0
            if (r5 == 0) goto L39
            android.app.Activity r4 = (android.app.Activity) r4
            r5 = r4
            goto L46
        L39:
            boolean r5 = r4 instanceof android.content.ContextWrapper
            if (r5 == 0) goto L45
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            if (r4 != 0) goto L30
        L45:
            r5 = r10
        L46:
            java.lang.Object r4 = r0.f2715
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r11 = 2
            r12 = 0
            r13 = 1
            if (r4 != 0) goto L67
            java.lang.Boolean r4 = defpackage.C0548.f2710
            if (r4 != 0) goto L65
            android.content.pm.ApplicationInfo r4 = r2.getApplicationInfo()
            int r4 = r4.flags
            r4 = r4 & r11
            if (r4 == 0) goto L5e
            r4 = r13
            goto L5f
        L5e:
            r4 = r12
        L5f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            defpackage.C0548.f2710 = r4
        L65:
            r0.f2715 = r4
        L67:
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L1ec
            if (r5 == 0) goto L201
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L1fb
            boolean r0 = r5.isDestroyed()
            if (r0 != 0) goto L1f5
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            android.content.res.AssetManager r4 = r2.getAssets()
            android.content.pm.ApplicationInfo r7 = r2.getApplicationInfo()     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.IllegalAccessException -> Lae java.lang.NoSuchMethodException -> Lb0
            int r7 = r7.targetSdkVersion     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.IllegalAccessException -> Lae java.lang.NoSuchMethodException -> Lb0
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.IllegalAccessException -> Lae java.lang.NoSuchMethodException -> Lb0
            java.lang.String r8 = "addAssetPath"
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.IllegalAccessException -> Lae java.lang.NoSuchMethodException -> Lb0
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r9)     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.IllegalAccessException -> Lae java.lang.NoSuchMethodException -> Lb0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.IllegalAccessException -> Lae java.lang.NoSuchMethodException -> Lb0
            java.lang.Object r0 = r7.invoke(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.IllegalAccessException -> Lae java.lang.NoSuchMethodException -> Lb0
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.IllegalAccessException -> Lae java.lang.NoSuchMethodException -> Lb0
            if (r0 == 0) goto Lbd
            int r0 = r0.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> Lac java.lang.IllegalAccessException -> Lae java.lang.NoSuchMethodException -> Lb0
            goto Lbe
        Lac:
            r0 = move-exception
            goto Lb2
        Lae:
            r0 = move-exception
            goto Lb6
        Lb0:
            r0 = move-exception
            goto Lba
        Lb2:
            r0.printStackTrace()
            goto Lbd
        Lb6:
            r0.printStackTrace()
            goto Lbd
        Lba:
            r0.printStackTrace()
        Lbd:
            r0 = r12
        Lbe:
            if (r0 != 0) goto Lc2
        Lc0:
            r7 = r10
            goto Ldd
        Lc2:
            ᲁᲇᛱᲈ r4 = defpackage.AbstractC1628.m2953(r2, r0)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r2.getPackageName()     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r7 = r4.f8445     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Ld5
            boolean r0 = defpackage.AbstractC1592.m2887(r0, r7)     // Catch: java.lang.Throwable -> Ld5
            if (r0 != 0) goto Ldc
            goto Lc0
        Ld5:
            r0 = move-exception
            goto Ld9
        Ld7:
            r0 = move-exception
            r4 = r10
        Ld9:
            r0.printStackTrace()
        Ldc:
            r7 = r4
        Ldd:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L1ef
            java.util.Iterator r14 = r6.iterator()
        Le7:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L1ec
            java.lang.Object r0 = r14.next()
            r4 = r0
            ᲁᛱᛲᛳ r4 = (defpackage.AbstractC1793) r4
            java.lang.Class r8 = r4.getClass()
            java.lang.String r9 = r8.getName()
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.NoSuchFieldException -> L107
            java.lang.String r15 = "CREATOR"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r15)     // Catch: java.lang.NoSuchFieldException -> L107
            goto L10c
        L107:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r10
        L10c:
            if (r0 == 0) goto L1e6
            java.lang.Object r15 = r0.get(r10)     // Catch: java.lang.Exception -> L1da
            r16 = r10
            boolean r10 = r15 instanceof android.os.Parcelable.Creator
            if (r10 == 0) goto L1b8
            java.lang.reflect.Type r0 = r0.getGenericType()
            boolean r10 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r10 == 0) goto L1ac
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r10 = r0.length
            if (r10 != r13) goto L1a0
            r0 = r0[r12]
            boolean r10 = r0 instanceof java.lang.Class
            if (r10 == 0) goto L194
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r8.isAssignableFrom(r0)
            if (r0 == 0) goto L194
            android.os.Parcelable$Creator r15 = (android.os.Parcelable.Creator) r15
            java.lang.Object[] r0 = r15.newArray(r12)
            if (r0 == 0) goto L188
            int r0 = r4.mo1981(r5)
            android.content.pm.ApplicationInfo r8 = r5.getApplicationInfo()
            int r8 = r8.targetSdkVersion
            if (r8 < r0) goto L163
            if (r7 == 0) goto L15d
            java.lang.Object r0 = r7.f8444
            r8 = r0
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.String r0 = r4.mo1205()
            ᛸᲈᛷᛳ r9 = defpackage.AbstractC1793.m3185(r0, r8)
            r4.mo1207(r5, r6, r7, r8, r9)
        L15d:
            r4.mo1204(r5, r6)
            r10 = r16
            goto Le7
        L163:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Request \""
            java.lang.String r3 = r4.mo1205()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r3)
            java.lang.String r2 = "\" permission, The targetSdkVersion SDK must be "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permission"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        L188:
            java.lang.String r0 = "The newArray method of the CREATOR field in this "
            java.lang.String r1 = " returns an empty value. This method cannot return an empty value"
            java.lang.String r0 = defpackage.AbstractC0225.m817(r0, r9, r1)
            defpackage.C2264.m3684(r0)
            return
        L194:
            java.lang.String r0 = "The generic type defined in the CREATOR field of this "
            java.lang.String r1 = " is incorrect"
            java.lang.String r0 = defpackage.AbstractC0225.m817(r0, r9, r1)
            defpackage.C2264.m3684(r0)
            return
        L1a0:
            java.lang.String r0 = "The number of generics defined in the CREATOR field of this "
            java.lang.String r1 = " can only be one"
            java.lang.String r0 = defpackage.AbstractC0225.m817(r0, r9, r1)
            defpackage.C2264.m3684(r0)
            return
        L1ac:
            java.lang.String r0 = "The generic type defined for the CREATOR field in this "
            java.lang.String r1 = " is empty"
            java.lang.String r0 = defpackage.AbstractC0225.m817(r0, r9, r1)
            defpackage.C2264.m3684(r0)
            return
        L1b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The CREATOR field in this "
            java.lang.String r2 = " is not of type "
            java.lang.Class<android.os.Parcelable$Creator> r3 = android.os.Parcelable.Creator.class
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r9)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L1da:
            java.lang.String r0 = "The CREATOR field in the "
            java.lang.String r1 = " has an access exception. Please modify CREATOR field with \"public static final\""
            java.lang.String r0 = defpackage.AbstractC0225.m817(r0, r9, r1)
            defpackage.C2264.m3684(r0)
            return
        L1e6:
            java.lang.String r0 = "This permission class does not define the CREATOR field"
            defpackage.C2264.m3684(r0)
            return
        L1ec:
            r16 = r10
            goto L207
        L1ef:
            java.lang.String r0 = "The requested permission cannot be empty"
            defpackage.C2264.m3684(r0)
            return
        L1f5:
            java.lang.String r0 = "The activity has been destroyed, please manually determine the status of the activity"
            defpackage.C2264.m3676(r0)
            return
        L1fb:
            java.lang.String r0 = "The activity has been finishing, please manually determine the status of the activity"
            defpackage.C2264.m3676(r0)
            return
        L201:
            java.lang.String r0 = "The instance of the context must be an activity object"
            defpackage.C2264.m3684(r0)
            return
        L207:
            boolean r0 = defpackage.AbstractC1592.m2874(r5)
            if (r0 == 0) goto L20f
            goto L436
        L20f:
            java.lang.Class<ᲈᲇᛱᛳ> r4 = defpackage.AbstractC2346.class
            monitor-enter(r4)
            r0 = -1
            r7 = r0
        L214:
            int r7 = r7 + r13
            int r8 = r6.size()     // Catch: java.lang.Throwable -> L256
            if (r7 >= r8) goto L259
            java.lang.Object r8 = r6.get(r7)     // Catch: java.lang.Throwable -> L256
            ᲁᛱᛲᛳ r8 = (defpackage.AbstractC1793) r8     // Catch: java.lang.Throwable -> L256
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L256
            int r10 = r8.mo1202()     // Catch: java.lang.Throwable -> L256
            if (r9 < r10) goto L22a
            goto L214
        L22a:
            java.util.List r8 = r8.mo1208()     // Catch: java.lang.Throwable -> L256
            if (r8 == 0) goto L214
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.lang.Throwable -> L256
            boolean r9 = r8.isEmpty()     // Catch: java.lang.Throwable -> L256
            if (r9 == 0) goto L239
            goto L214
        L239:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L256
        L23d:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L256
            if (r9 == 0) goto L214
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L256
            ᲁᛱᛲᛳ r9 = (defpackage.AbstractC1793) r9     // Catch: java.lang.Throwable -> L256
            boolean r10 = defpackage.AbstractC1592.m2877(r6, r9)     // Catch: java.lang.Throwable -> L256
            if (r10 == 0) goto L250
            goto L23d
        L250:
            int r7 = r7 + 1
            r6.add(r7, r9)     // Catch: java.lang.Throwable -> L256
            goto L23d
        L256:
            r0 = move-exception
            goto L438
        L259:
            monitor-exit(r4)
            boolean r2 = defpackage.AbstractC2346.m3849(r2, r6)
            if (r2 == 0) goto L269
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mo1928(r0)
            return
        L269:
            boolean r2 = r5 instanceof androidx.fragment.app.FragmentActivity
            if (r2 != 0) goto L437
            ᛳᲇᲇᛶ r2 = new ᛳᲇᲇᛶ
            android.app.FragmentManager r4 = r5.getFragmentManager()
            r2.<init>(r5, r4)
            ᛳᲀᲁᲈ r4 = new ᛳᲀᲁᲈ
            r4.<init>()
            r4.f2713 = r5
            r4.f2712 = r6
            r4.f2711 = r2
            r4.f2714 = r3
            r4.f2715 = r1
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L28d
            goto L436
        L28d:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r6.size()
            r2.<init>(r3)
            r3 = r12
        L2a0:
            int r7 = r6.size()
            if (r3 >= r7) goto L361
            java.lang.Object r7 = r6.get(r3)
            ᲁᛱᛲᛳ r7 = (defpackage.AbstractC1793) r7
            boolean r8 = defpackage.AbstractC1592.m2877(r2, r7)
            if (r8 == 0) goto L2b4
            goto L35d
        L2b4:
            r2.add(r7)
            boolean r8 = r7.mo2348(r5)
            if (r8 != 0) goto L2bf
            goto L35d
        L2bf:
            boolean r8 = r7.mo2347(r5, r13)
            if (r8 == 0) goto L2c7
            goto L35d
        L2c7:
            int r8 = r7.mo2345(r5)
            if (r8 != r11) goto L2da
            ᲁᛱᛲᛳ[] r7 = new defpackage.AbstractC1793[]{r7}
            java.util.ArrayList r7 = defpackage.AbstractC1592.m2881(r7)
            r1.add(r7)
            goto L35d
        L2da:
            java.lang.String r8 = r7.mo1201()
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L2f1
            ᲁᛱᛲᛳ[] r7 = new defpackage.AbstractC1793[]{r7}
            java.util.ArrayList r7 = defpackage.AbstractC1592.m2881(r7)
            r1.add(r7)
            goto L35d
        L2f1:
            r7 = r3
            r9 = r16
        L2f4:
            int r10 = r6.size()
            if (r7 >= r10) goto L330
            java.lang.Object r10 = r6.get(r7)
            ᲁᛱᛲᛳ r10 = (defpackage.AbstractC1793) r10
            java.lang.String r14 = r10.mo1201()
            boolean r14 = defpackage.AbstractC1592.m2875(r14, r8)
            if (r14 != 0) goto L30b
            goto L32d
        L30b:
            boolean r14 = r10.mo2348(r5)
            if (r14 != 0) goto L312
            goto L32d
        L312:
            boolean r14 = r10.mo2347(r5, r13)
            if (r14 == 0) goto L319
            goto L32d
        L319:
            if (r9 != 0) goto L320
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L320:
            r9.add(r10)
            boolean r14 = defpackage.AbstractC1592.m2877(r2, r10)
            if (r14 == 0) goto L32a
            goto L32d
        L32a:
            r2.add(r10)
        L32d:
            int r7 = r7 + 1
            goto L2f4
        L330:
            if (r9 == 0) goto L35d
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto L339
            goto L35d
        L339:
            boolean r7 = defpackage.AbstractC2346.m3849(r5, r9)
            if (r7 == 0) goto L340
            goto L35d
        L340:
            java.util.Iterator r7 = r9.iterator()
        L344:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L354
            java.lang.Object r8 = r7.next()
            ᲁᛱᛲᛳ r8 = (defpackage.AbstractC1793) r8
            r8.getClass()
            goto L344
        L354:
            boolean r7 = r9.isEmpty()
            if (r7 != 0) goto L35d
            r1.add(r9)
        L35d:
            int r3 = r3 + 1
            goto L2a0
        L361:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L36c
            r4.m1341()
            goto L436
        L36c:
            java.util.Iterator r19 = r1.iterator()
            r10 = r16
        L372:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L388
            if (r10 == 0) goto L380
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L388
        L380:
            java.lang.Object r1 = r19.next()
            r10 = r1
            java.util.List r10 = (java.util.List) r10
            goto L372
        L388:
            if (r10 == 0) goto L390
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L394
        L390:
            r18 = r4
            goto L433
        L394:
            java.lang.Object r1 = r4.f2713
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r4.f2711
            r21 = r2
            ᛳᲇᲇᛶ r21 = (defpackage.C0580) r21
            java.lang.Object r2 = r4.f2714
            r22 = r2
            ᛷᲈᲀ r22 = (defpackage.C1403) r22
            java.util.HashMap r2 = defpackage.AbstractC2002.f8650
            java.lang.Class<ᲇᛲᛷᛳ> r2 = defpackage.AbstractC2002.class
            monitor-enter(r2)
            int r3 = r1.getRequestedOrientation()     // Catch: java.lang.Throwable -> L3ec
            if (r3 == r0) goto L3b2
            monitor-exit(r2)
            goto L41e
        L3b2:
            android.content.res.Resources r0 = r1.getResources()     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            int r0 = r0.orientation     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            r3 = 3
            if (r0 == r13) goto L3f0
            if (r0 == r11) goto L3c2
            goto L41d
        L3c2:
            android.view.Display r0 = r1.getDisplay()     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            if (r0 != 0) goto L3ca
        L3c8:
            r13 = r12
            goto L3d3
        L3ca:
            int r0 = r0.getRotation()     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            if (r0 == r11) goto L3d3
            if (r0 == r3) goto L3d3
            goto L3c8
        L3d3:
            if (r13 == 0) goto L3d7
            r12 = 8
        L3d7:
            r1.setRequestedOrientation(r12)     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            java.util.HashMap r0 = defpackage.AbstractC2002.f8650     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            int r3 = r1.hashCode()     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            goto L41d
        L3ec:
            r0 = move-exception
            goto L431
        L3ee:
            r0 = move-exception
            goto L41a
        L3f0:
            android.view.Display r0 = r1.getDisplay()     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            if (r0 != 0) goto L3f7
            goto L401
        L3f7:
            int r0 = r0.getRotation()     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            if (r0 == r11) goto L400
            if (r0 == r3) goto L400
            goto L401
        L400:
            r12 = r13
        L401:
            if (r12 == 0) goto L405
            r13 = 9
        L405:
            r1.setRequestedOrientation(r13)     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            java.util.HashMap r0 = defpackage.AbstractC2002.f8650     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            int r3 = r1.hashCode()     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L3ec java.lang.IllegalStateException -> L3ee
            goto L41d
        L41a:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L3ec
        L41d:
            monitor-exit(r2)
        L41e:
            ᛶᛳᲇᛵ r17 = new ᛶᛳᲇᛵ
            r20 = r1
            r18 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r0 = r17
            r2 = r21
            r3 = r22
            m1335(r1, r10, r2, r3, r0)
            goto L436
        L431:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3ec
            throw r0
        L433:
            r18.m1341()
        L436:
            return
        L437:
            throw r16
        L438:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L256
            throw r0
    }
}
