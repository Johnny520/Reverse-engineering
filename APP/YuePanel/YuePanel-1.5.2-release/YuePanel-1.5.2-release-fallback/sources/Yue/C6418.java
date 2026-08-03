package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6418 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Class<?>[] f22657 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Yue.C0573<java.lang.String, java.lang.reflect.Constructor<?>> f22658 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f22659;

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            Yue.C6418.f22657 = r0
            Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
            r0.<init>()
            Yue.C6418.f22658 = r0
            return
    }

    public C6418(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f22659 = r1
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C6418 m23676(@Yue.InterfaceC4410 android.content.Context r1) {
            Yue.ۥۢۢ۠ۥ r0 = new Yue.ۥۢۢ۠ۥ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m23677(android.util.AttributeSet r5, java.lang.Class<?> r6, java.lang.String r7) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "class"
            java.lang.String r0 = r5.getAttributeValue(r0, r1)
            if (r0 == 0) goto L63
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.reflect.Constructor<?>> r7 = Yue.C6418.f22658     // Catch: java.lang.Exception -> L43
            monitor-enter(r7)     // Catch: java.lang.Exception -> L43
            java.lang.Object r1 = r7.get(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            android.content.Context r2 = r4.f22659     // Catch: java.lang.Throwable -> L33
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L33
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Class r2 = r2.asSubclass(r6)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            java.lang.Class<?>[] r1 = Yue.C6418.f22657     // Catch: java.lang.Throwable -> L33
            java.lang.reflect.Constructor r1 = r2.getConstructor(r1)     // Catch: java.lang.Throwable -> L33
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L33
            r7.put(r0, r1)     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r5 = move-exception
            goto L41
        L35:
            android.content.Context r2 = r4.f22659     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5}     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = r1.newInstance(r5)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L33
            return r5
        L41:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L33
            throw r5     // Catch: java.lang.Exception -> L43
        L43:
            r5 = move-exception
            android.view.InflateException r7 = new android.view.InflateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not instantiate "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " class "
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            r7.<init>(r6, r5)
            throw r7
        L63:
            android.view.InflateException r5 = new android.view.InflateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            java.lang.String r7 = " tag must have a 'class' attribute"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.AbstractC6398 m23678(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, Yue.AbstractC6398 r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r7 = this;
            int r0 = r8.getDepth()
            boolean r1 = r10 instanceof Yue.C6438
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r10
            Yue.ۥۢۢۡۡ r1 = (Yue.C6438) r1
            goto Le
        Ld:
            r1 = r2
        Le:
            r3 = r2
        Lf:
            int r4 = r8.next()
            r5 = 3
            if (r4 != r5) goto L1c
            int r5 = r8.getDepth()
            if (r5 <= r0) goto L17d
        L1c:
            r5 = 1
            if (r4 == r5) goto L17d
            r5 = 2
            if (r4 == r5) goto L23
            goto Lf
        L23:
            java.lang.String r4 = r8.getName()
            java.lang.String r5 = "fade"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L38
            Yue.ۥ۠ۡۦۡ r3 = new Yue.ۥ۠ۡۦۡ
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        L38:
            java.lang.String r5 = "changeBounds"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L49
            Yue.ۥ۟ۤ۠ۢ r3 = new Yue.ۥ۟ۤ۠ۢ
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        L49:
            java.lang.String r5 = "slide"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L5a
            Yue.ۥۢ۟ۢ r3 = new Yue.ۥۢ۟ۢ
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        L5a:
            java.lang.String r5 = "explode"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L6b
            Yue.ۥ۠ۡۥۤ r3 = new Yue.ۥ۠ۡۥۤ
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        L6b:
            java.lang.String r5 = "changeImageTransform"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L7c
            Yue.ۥ۟ۤ۠ۤ r3 = new Yue.ۥ۟ۤ۠ۤ
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        L7c:
            java.lang.String r5 = "changeTransform"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L8d
            Yue.ۥ۟ۤ۠ۧ r3 = new Yue.ۥ۟ۤ۠ۧ
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        L8d:
            java.lang.String r5 = "changeClipBounds"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L9e
            Yue.ۥۣ۟ۤ۠ r3 = new Yue.ۥۣ۟ۤ۠
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        L9e:
            java.lang.String r5 = "autoTransition"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Laf
            Yue.ۥ۟ۢۤۡ r3 = new Yue.ۥ۟ۢۤۡ
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        Laf:
            java.lang.String r5 = "changeScroll"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Lc0
            Yue.ۥ۟ۤ۠ۦ r3 = new Yue.ۥ۟ۤ۠ۦ
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        Lc0:
            java.lang.String r5 = "transitionSet"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Ld0
            Yue.ۥۢۢۡۡ r3 = new Yue.ۥۢۢۡۡ
            android.content.Context r4 = r7.f22659
            r3.<init>(r4, r9)
            goto L13c
        Ld0:
            java.lang.String r5 = "transition"
            boolean r6 = r5.equals(r4)
            if (r6 == 0) goto Le1
            java.lang.Class<Yue.ۥۢۢ۟ۧ> r3 = Yue.AbstractC6398.class
            java.lang.Object r3 = r7.m23677(r9, r3, r5)
            Yue.ۥۢۢ۟ۧ r3 = (Yue.AbstractC6398) r3
            goto L13c
        Le1:
            java.lang.String r5 = "targets"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Led
            r7.m23680(r8, r9, r10)
            goto L13c
        Led:
            java.lang.String r5 = "arcMotion"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L10a
            if (r10 == 0) goto L102
            Yue.ۥ۟ۡۦۡ r4 = new Yue.ۥ۟ۡۦۡ
            android.content.Context r5 = r7.f22659
            r4.<init>(r5, r9)
            r10.setPathMotion(r4)
            goto L13c
        L102:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Invalid use of arcMotion element"
            r8.<init>(r9)
            throw r8
        L10a:
            java.lang.String r5 = "pathMotion"
            boolean r6 = r5.equals(r4)
            if (r6 == 0) goto L128
            if (r10 == 0) goto L120
            java.lang.Class<Yue.ۥۣۡۨۡ> r4 = Yue.AbstractC4708.class
            java.lang.Object r4 = r7.m23677(r9, r4, r5)
            Yue.ۥۣۡۨۡ r4 = (Yue.AbstractC4708) r4
            r10.setPathMotion(r4)
            goto L13c
        L120:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Invalid use of pathMotion element"
            r8.<init>(r9)
            throw r8
        L128:
            java.lang.String r5 = "patternPathMotion"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L162
            if (r10 == 0) goto L15a
            Yue.ۥۡۤ۟ۤ r4 = new Yue.ۥۡۤ۟ۤ
            android.content.Context r5 = r7.f22659
            r4.<init>(r5, r9)
            r10.setPathMotion(r4)
        L13c:
            if (r3 == 0) goto Lf
            boolean r4 = r8.isEmptyElementTag()
            if (r4 != 0) goto L147
            r7.m23678(r8, r9, r3)
        L147:
            if (r1 == 0) goto L14e
            r1.m23719(r3)
            goto Le
        L14e:
            if (r10 != 0) goto L152
            goto Lf
        L152:
            android.view.InflateException r8 = new android.view.InflateException
            java.lang.String r9 = "Could not add transition to another transition."
            r8.<init>(r9)
            throw r8
        L15a:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Invalid use of patternPathMotion element"
            r8.<init>(r9)
            throw r8
        L162:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r10.append(r0)
            java.lang.String r8 = r8.getName()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L17d:
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C6432 m23679(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, @Yue.InterfaceC4410 android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L54
        L12:
            r3 = 1
            if (r2 == r3) goto L54
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2b
            Yue.ۥۢۢ۠ۨ r1 = new Yue.ۥۢۢ۠ۨ
            r1.<init>()
            goto L5
        L2b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            if (r1 == 0) goto L39
            r4.m23683(r6, r5, r7, r1)
            goto L5
        L39:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L54:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m23680(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, @Yue.InterfaceC4410 Yue.AbstractC6398 r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r7 = this;
            int r0 = r8.getDepth()
        L4:
            int r1 = r8.next()
            r2 = 3
            if (r1 != r2) goto L11
            int r3 = r8.getDepth()
            if (r3 <= r0) goto Lb9
        L11:
            r3 = 1
            if (r1 == r3) goto Lb9
            r4 = 2
            if (r1 == r4) goto L18
            goto L4
        L18:
            java.lang.String r1 = r8.getName()
            java.lang.String r5 = "target"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L9e
            android.content.Context r1 = r7.f22659
            int[] r5 = Yue.C6019.f21786
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r9, r5)
            java.lang.String r5 = "targetId"
            r6 = 0
            int r5 = Yue.C6478.m23899(r1, r8, r5, r3, r6)
            if (r5 == 0) goto L39
            r10.addTarget(r5)
            goto L80
        L39:
            java.lang.String r5 = "excludeId"
            int r4 = Yue.C6478.m23899(r1, r8, r5, r4, r6)
            if (r4 == 0) goto L45
            r10.excludeTarget(r4, r3)
            goto L80
        L45:
            java.lang.String r4 = "targetName"
            r5 = 4
            java.lang.String r4 = Yue.C6478.m23900(r1, r8, r4, r5)
            if (r4 == 0) goto L52
            r10.addTarget(r4)
            goto L80
        L52:
            java.lang.String r4 = "excludeName"
            r5 = 5
            java.lang.String r4 = Yue.C6478.m23900(r1, r8, r4, r5)
            if (r4 == 0) goto L5f
            r10.excludeTarget(r4, r3)
            goto L80
        L5f:
            java.lang.String r4 = "excludeClass"
            java.lang.String r2 = Yue.C6478.m23900(r1, r8, r4, r2)
            if (r2 == 0) goto L71
            java.lang.Class r4 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L6f
            r10.excludeTarget(r4, r3)     // Catch: java.lang.ClassNotFoundException -> L6f
            goto L80
        L6f:
            r8 = move-exception
            goto L84
        L71:
            java.lang.String r3 = "targetClass"
            java.lang.String r2 = Yue.C6478.m23900(r1, r8, r3, r6)     // Catch: java.lang.ClassNotFoundException -> L6f
            if (r2 == 0) goto L80
            java.lang.Class r3 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L6f
            r10.addTarget(r3)     // Catch: java.lang.ClassNotFoundException -> L6f
        L80:
            r1.recycle()
            goto L4
        L84:
            r1.recycle()
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Could not create "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10, r8)
            throw r9
        L9e:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r10.append(r0)
            java.lang.String r8 = r8.getName()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        Lb9:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.AbstractC6398 m23681(int r5) {
            r4 = this;
            android.content.Context r0 = r4.f22659
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19 org.xmlpull.v1.XmlPullParserException -> L1b
            r1 = 0
            Yue.ۥۢۢ۟ۧ r0 = r4.m23678(r5, r0, r1)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19 org.xmlpull.v1.XmlPullParserException -> L1b
            r5.close()
            return r0
        L17:
            r0 = move-exception
            goto L49
        L19:
            r0 = move-exception
            goto L1d
        L1b:
            r0 = move-exception
            goto L3f
        L1d:
            android.view.InflateException r1 = new android.view.InflateException     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r5.getPositionDescription()     // Catch: java.lang.Throwable -> L17
            r2.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = ": "
            r2.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L17
            r2.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L3f:
            android.view.InflateException r1 = new android.view.InflateException     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L49:
            r5.close()
            throw r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C6432 m23682(int r4, @Yue.InterfaceC4410 android.view.ViewGroup r5) {
            r3 = this;
            android.content.Context r0 = r3.f22659
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r4 = r0.getXml(r4)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r4)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18 org.xmlpull.v1.XmlPullParserException -> L1a
            Yue.ۥۢۢ۠ۨ r5 = r3.m23679(r4, r0, r5)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18 org.xmlpull.v1.XmlPullParserException -> L1a
            r4.close()
            return r5
        L16:
            r5 = move-exception
            goto L4e
        L18:
            r5 = move-exception
            goto L1c
        L1a:
            r5 = move-exception
            goto L41
        L1c:
            android.view.InflateException r0 = new android.view.InflateException     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r4.getPositionDescription()     // Catch: java.lang.Throwable -> L16
            r1.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = ": "
            r1.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r5.getMessage()     // Catch: java.lang.Throwable -> L16
            r1.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            r0.initCause(r5)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L41:
            android.view.InflateException r0 = new android.view.InflateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r5.getMessage()     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            r0.initCause(r5)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L4e:
            r4.close()
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m23683(android.util.AttributeSet r7, org.xmlpull.v1.XmlPullParser r8, @Yue.InterfaceC4410 android.view.ViewGroup r9, Yue.C6432 r10) throws android.content.res.Resources.NotFoundException {
            r6 = this;
            android.content.Context r0 = r6.f22659
            int[] r1 = Yue.C6019.f21787
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            java.lang.String r0 = "transition"
            r1 = 2
            r2 = -1
            int r0 = Yue.C6478.m23899(r7, r8, r0, r1, r2)
            java.lang.String r1 = "fromScene"
            r3 = 0
            int r1 = Yue.C6478.m23899(r7, r8, r1, r3, r2)
            r3 = 0
            if (r1 >= 0) goto L1c
            r1 = r3
            goto L22
        L1c:
            android.content.Context r4 = r6.f22659
            Yue.ۥۡۧۤۥ r1 = Yue.C5508.m20729(r9, r1, r4)
        L22:
            java.lang.String r4 = "toScene"
            r5 = 1
            int r8 = Yue.C6478.m23899(r7, r8, r4, r5, r2)
            if (r8 >= 0) goto L2c
            goto L32
        L2c:
            android.content.Context r2 = r6.f22659
            Yue.ۥۡۧۤۥ r3 = Yue.C5508.m20729(r9, r8, r2)
        L32:
            if (r0 < 0) goto L5d
            Yue.ۥۢۢ۟ۧ r8 = r6.m23681(r0)
            if (r8 == 0) goto L5d
            if (r3 == 0) goto L46
            if (r1 != 0) goto L42
            r10.m23709(r3, r8)
            goto L5d
        L42:
            r10.m23708(r1, r3, r8)
            goto L5d
        L46:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "No toScene for transition ID "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5d:
            r7.recycle()
            return
    }
}
