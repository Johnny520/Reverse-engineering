package defpackage;

/* JADX INFO: renamed from: ᛵᛳᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0849 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1929 f3872 = null;

    static {
            ᲁᲁᛷᲈ r0 = new ᲁᲁᛷᲈ
            r1 = 1
            r0.<init>(r1)
            defpackage.AbstractC0849.f3872 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final boolean m1778(defpackage.C1380 r4, java.util.Set r5, java.lang.reflect.Executable r6) {
            java.lang.reflect.AnnotatedType r6 = r6.getAnnotatedReturnType()
            java.lang.annotation.Annotation[] r6 = r6.getAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            r3 = r6[r2]
            ᛲᲀᲈᛳ r3 = defpackage.AbstractC1533.m2778(r3)
            java.lang.Class r3 = r3.mo1084()
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L22:
            boolean r4 = m1785(r5, r0, r4)
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final boolean m1779(defpackage.C1380 r4, java.util.Set r5, java.lang.reflect.Executable r6) {
            java.lang.reflect.AnnotatedType r6 = r6.getAnnotatedReceiverType()
            java.lang.annotation.Annotation[] r6 = r6.getAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            r3 = r6[r2]
            ᛲᲀᲈᛳ r3 = defpackage.AbstractC1533.m2778(r3)
            java.lang.Class r3 = r3.mo1084()
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L22:
            boolean r4 = m1785(r5, r0, r4)
            r4 = r4 ^ 1
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final boolean m1780(defpackage.C1380 r0, java.util.Set r1, java.lang.reflect.Executable r2) {
            java.lang.reflect.AnnotatedType[] r2 = r2.getAnnotatedParameterTypes()
            java.lang.reflect.AnnotatedElement[] r2 = (java.lang.reflect.AnnotatedElement[]) r2
            java.util.List r2 = m1787(r2)
            boolean r0 = m1785(r1, r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final boolean m1781(defpackage.C1380 r4, java.util.Set r5, java.lang.reflect.Executable r6) {
            java.lang.reflect.AnnotatedType r6 = r6.getAnnotatedReturnType()
            java.lang.annotation.Annotation[] r6 = r6.getAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            r3 = r6[r2]
            ᛲᲀᲈᛳ r3 = defpackage.AbstractC1533.m2778(r3)
            java.lang.Class r3 = r3.mo1084()
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L22:
            boolean r4 = m1785(r5, r0, r4)
            r4 = r4 ^ 1
            return r4
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static java.lang.Class m1782(java.lang.Object r3, defpackage.C1380 r4, java.lang.String r5) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r3 = (java.lang.Class) r3
            goto L4e
        L7:
            boolean r0 = r3 instanceof defpackage.C0355
            if (r0 == 0) goto L14
            ᛲᲀᲈᛳ r3 = (defpackage.C0355) r3
            ᲇᲇᛲᲈ r3 = (defpackage.InterfaceC2139) r3
            java.lang.Class r3 = r3.mo1084()
            goto L4e
        L14:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L46
            int r0 = r4.f6021
            java.lang.Class r4 = r4.f6023
            r1 = 2
            r2 = 1
            if (r0 != r2) goto L2b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class r3 = defpackage.AbstractC0350.m1060(r3, r4, r1)
            goto L4e
        L2b:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class r3 = defpackage.AbstractC0350.m1058(r3, r4, r1)
            if (r3 != 0) goto L4e
            java.lang.Class<ᲁᛲᲇᲁ> r3 = defpackage.C1825.class
            ᛲᲀᲈᛳ r4 = defpackage.AbstractC1168.m2249(r3)
            java.lang.Class r4 = defpackage.AbstractC1533.m2785(r4)
            if (r4 != 0) goto L44
            goto L4e
        L44:
            r3 = r4
            goto L4e
        L46:
            boolean r4 = r3 instanceof defpackage.C1027
            if (r4 == 0) goto L83
            java.lang.Class r3 = r3.getClass()
        L4e:
            java.lang.Class<ᛶᛲᲇ> r4 = defpackage.C1027.class
            ᛲᲀᲈᛳ r0 = defpackage.AbstractC1168.m2249(r4)
            java.lang.Class r0 = defpackage.AbstractC1533.m2785(r0)
            if (r0 != 0) goto L5b
            goto L5c
        L5b:
            r4 = r0
        L5c:
            boolean r4 = defpackage.AbstractC0498.m1280(r3, r4)
            if (r4 == 0) goto L82
            if (r5 != 0) goto L65
            goto L82
        L65:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "VagueType is not supported for \""
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = "\"."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L82:
            return r3
        L83:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported type: "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = ", supported types are Class, KClass, String and VagueType."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static final boolean m1783(defpackage.C1380 r0, java.util.Set r1, java.lang.reflect.Executable r2) {
            java.lang.reflect.AnnotatedType[] r2 = r2.getAnnotatedExceptionTypes()
            java.lang.reflect.AnnotatedElement[] r2 = (java.lang.reflect.AnnotatedElement[]) r2
            java.util.List r2 = m1787(r2)
            boolean r0 = m1785(r1, r2, r0)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static void m1784(defpackage.AbstractC0992 r19, defpackage.C1380 r20) {
            r1 = r19
            r2 = r20
            java.lang.String r3 = " (Kotlin reflection is not available)"
            boolean r0 = r2.f6022
            java.lang.Class r4 = r2.f6023
            java.lang.String r5 = ""
            if (r0 == 0) goto L11
            java.lang.String r6 = " (Also tried for superclass)"
            goto L12
        L11:
            r6 = r5
        L12:
            if (r0 != 0) goto L18
            java.lang.String r0 = "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. "
        L16:
            r7 = r0
            goto L1b
        L18:
            java.lang.String r0 = "Check if the conditions are correct and valid, and try again. "
            goto L16
        L1b:
            java.lang.String r0 = "-+"
            java.lang.String r8 = "+-"
            java.lang.String r9 = "-"
            java.util.Map r11 = r1.mo1884()     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r12.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L53
        L32:
            boolean r13 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r13 == 0) goto L8a
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Throwable -> L53
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch: java.lang.Throwable -> L53
            java.lang.Object r14 = r13.getKey()     // Catch: java.lang.Throwable -> L53
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L53
            java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Throwable -> L53
            if (r13 != 0) goto L4c
        L4a:
            r13 = 0
            goto L6f
        L4c:
            boolean r15 = r13 instanceof defpackage.InterfaceC0769     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto L58
            java.lang.String r13 = "(Runtime Condition)"
            goto L6f
        L53:
            r0 = move-exception
            r18 = r4
            goto L1a6
        L58:
            boolean r15 = r13 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto L6b
            r15 = r13
            java.util.Collection r15 = (java.util.Collection) r15     // Catch: java.lang.Throwable -> L53
            boolean r15 = r15.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto L66
            goto L4a
        L66:
            java.lang.String r13 = defpackage.C1027.m1980(r13)     // Catch: java.lang.Throwable -> L53
            goto L6f
        L6b:
            java.lang.String r13 = defpackage.C1027.m1980(r13)     // Catch: java.lang.Throwable -> L53
        L6f:
            if (r13 == 0) goto L7a
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L53
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r3, r5)     // Catch: java.lang.Throwable -> L53
            goto L7b
        L7a:
            r13 = 0
        L7b:
            if (r13 == 0) goto L83
            kotlin.Pair r15 = new kotlin.Pair     // Catch: java.lang.Throwable -> L53
            r15.<init>(r14, r13)     // Catch: java.lang.Throwable -> L53
            goto L84
        L83:
            r15 = 0
        L84:
            if (r15 == 0) goto L32
            r12.add(r15)     // Catch: java.lang.Throwable -> L53
            goto L32
        L8a:
            boolean r11 = r12.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L98
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L53
            r18 = r4
            goto L1ac
        L98:
            java.util.Iterator r11 = r12.iterator()     // Catch: java.lang.Throwable -> L53
            boolean r13 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r13 == 0) goto L19e
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Throwable -> L53
            kotlin.Pair r13 = (kotlin.Pair) r13     // Catch: java.lang.Throwable -> L53
            java.lang.Object r13 = r13.getFirst()     // Catch: java.lang.Throwable -> L53
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L53
            int r13 = m1794(r13)     // Catch: java.lang.Throwable -> L53
        Lb2:
            boolean r14 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r14 == 0) goto Lcc
            java.lang.Object r14 = r11.next()     // Catch: java.lang.Throwable -> L53
            kotlin.Pair r14 = (kotlin.Pair) r14     // Catch: java.lang.Throwable -> L53
            java.lang.Object r14 = r14.getFirst()     // Catch: java.lang.Throwable -> L53
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L53
            int r14 = m1794(r14)     // Catch: java.lang.Throwable -> L53
            if (r13 >= r14) goto Lb2
            r13 = r14
            goto Lb2
        Lcc:
            java.util.Iterator r11 = r12.iterator()     // Catch: java.lang.Throwable -> L53
            boolean r14 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r14 == 0) goto L196
            java.lang.Object r14 = r11.next()     // Catch: java.lang.Throwable -> L53
            kotlin.Pair r14 = (kotlin.Pair) r14     // Catch: java.lang.Throwable -> L53
            java.lang.Object r14 = r14.getSecond()     // Catch: java.lang.Throwable -> L53
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L53
            int r14 = m1794(r14)     // Catch: java.lang.Throwable -> L53
        Le6:
            boolean r15 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto L100
            java.lang.Object r15 = r11.next()     // Catch: java.lang.Throwable -> L53
            kotlin.Pair r15 = (kotlin.Pair) r15     // Catch: java.lang.Throwable -> L53
            java.lang.Object r15 = r15.getSecond()     // Catch: java.lang.Throwable -> L53
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L53
            int r15 = m1794(r15)     // Catch: java.lang.Throwable -> L53
            if (r14 >= r15) goto Le6
            r14 = r15
            goto Le6
        L100:
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> L53
            java.lang.String r11 = defpackage.AbstractC0651.m1485(r11, r3, r5)     // Catch: java.lang.Throwable -> L53
            int r15 = m1794(r11)     // Catch: java.lang.Throwable -> L53
            int r16 = r13 + r14
            int r16 = r16 + 3
            int r15 = r15 - r16
            if (r15 >= 0) goto L115
            r15 = 0
        L115:
            int r14 = r14 + r15
            java.lang.String r15 = defpackage.AbstractC0651.m1484(r13, r9)     // Catch: java.lang.Throwable -> L53
            java.lang.String r10 = defpackage.AbstractC0651.m1484(r14, r9)     // Catch: java.lang.Throwable -> L53
            r18 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L194
            r4.<init>()     // Catch: java.lang.Throwable -> L194
            r4.append(r8)     // Catch: java.lang.Throwable -> L194
            r4.append(r15)     // Catch: java.lang.Throwable -> L194
            java.lang.String r15 = "-+-"
            r4.append(r15)     // Catch: java.lang.Throwable -> L194
            r4.append(r10)     // Catch: java.lang.Throwable -> L194
            r4.append(r0)     // Catch: java.lang.Throwable -> L194
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L194
            int r10 = r13 + r14
            int r10 = r10 + 3
            java.lang.String r9 = defpackage.AbstractC0651.m1484(r10, r9)     // Catch: java.lang.Throwable -> L194
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L194
            r15.<init>()     // Catch: java.lang.Throwable -> L194
            r15.append(r8)     // Catch: java.lang.Throwable -> L194
            r15.append(r9)     // Catch: java.lang.Throwable -> L194
            r15.append(r0)     // Catch: java.lang.Throwable -> L194
            java.lang.String r0 = r15.toString()     // Catch: java.lang.Throwable -> L194
            java.lang.String r8 = m1788(r10, r11)     // Catch: java.lang.Throwable -> L194
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L194
            r9.<init>()     // Catch: java.lang.Throwable -> L194
            java.lang.String r10 = "| "
            r9.append(r10)     // Catch: java.lang.Throwable -> L194
            r9.append(r8)     // Catch: java.lang.Throwable -> L194
            java.lang.String r8 = " |"
            r9.append(r8)     // Catch: java.lang.Throwable -> L194
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L194
            java.lang.String r9 = "\n"
            ᛸᛵᛸᲀ r10 = new ᛸᛵᛸᲀ     // Catch: java.lang.Throwable -> L194
            r10.<init>(r13, r14)     // Catch: java.lang.Throwable -> L194
            r17 = 30
            r14 = 0
            r15 = 0
            r13 = r9
            r16 = r10
            java.lang.String r9 = defpackage.AbstractC1107.m2125(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L194
            java.lang.String[] r0 = new java.lang.String[]{r0, r8, r4, r9, r4}     // Catch: java.lang.Throwable -> L194
            java.util.List r8 = defpackage.AbstractC0425.m1186(r0)     // Catch: java.lang.Throwable -> L194
            java.lang.String r9 = "\n"
            r12 = 0
            r13 = 62
            r10 = 0
            r11 = 0
            java.lang.String r0 = defpackage.AbstractC1107.m2125(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L194
            goto L1ac
        L194:
            r0 = move-exception
            goto L1a6
        L196:
            r18 = r4
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L194
            r0.<init>()     // Catch: java.lang.Throwable -> L194
            throw r0     // Catch: java.lang.Throwable -> L194
        L19e:
            r18 = r4
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L194
            r0.<init>()     // Catch: java.lang.Throwable -> L194
            throw r0     // Catch: java.lang.Throwable -> L194
        L1a6:
            ᛴᛸᛲᲀ r4 = new ᛴᛸᛲᲀ
            r4.<init>(r0)
            r0 = r4
        L1ac:
            java.lang.String r4 = r18.toString()
            java.lang.String r3 = defpackage.AbstractC0651.m1485(r4, r3, r5)
            java.lang.String r4 = "\nFailed to build condition table."
            java.lang.String r3 = r3.concat(r4)
            boolean r4 = r0 instanceof defpackage.C0723
            if (r4 == 0) goto L1bf
            r0 = r3
        L1bf:
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r1 instanceof defpackage.C1085
            java.lang.String r4 = "Unsupported condition type: "
            java.lang.String r5 = "\nSuggestion: "
            java.lang.String r8 = ".\n"
            if (r3 == 0) goto L1e6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "No method found matching the condition for current class"
            r9.<init>(r10)
            r9.append(r6)
            r9.append(r8)
            r9.append(r0)
            r9.append(r5)
            r9.append(r7)
            java.lang.String r0 = r9.toString()
            goto L211
        L1e6:
            boolean r9 = r1 instanceof defpackage.C1282
            if (r9 == 0) goto L1f3
            java.lang.String r5 = "No constructor found matching the condition for current class.\n"
            java.lang.String r6 = "\nSuggestion: Constructors are not inherited from superclass, check if the conditions are correct and valid, and try again. "
            java.lang.String r0 = defpackage.AbstractC0225.m817(r5, r0, r6)
            goto L211
        L1f3:
            boolean r9 = r1 instanceof defpackage.C0930
            if (r9 == 0) goto L256
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "No field found matching the condition for current class"
            r9.<init>(r10)
            r9.append(r6)
            r9.append(r8)
            r9.append(r0)
            r9.append(r5)
            r9.append(r7)
            java.lang.String r0 = r9.toString()
        L211:
            int r2 = r2.f6021
            r5 = 1
            if (r2 != r5) goto L244
            java.lang.String r2 = "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.3 ======\n"
            if (r3 != 0) goto L23a
            boolean r3 = r1 instanceof defpackage.C1282
            if (r3 != 0) goto L230
            boolean r3 = r1 instanceof defpackage.C0930
            if (r3 != 0) goto L226
            defpackage.C2264.m3681(r1, r4)
            return
        L226:
            java.lang.NoSuchFieldException r1 = new java.lang.NoSuchFieldException
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r0)
            goto L243
        L230:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r0)
            goto L243
        L23a:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r0)
        L243:
            throw r1
        L244:
            r1 = 2
            if (r2 != r1) goto L255
            ᛲᲈᛶᲈ r1 = defpackage.AbstractC2298.f9721
            java.lang.CharSequence r0 = defpackage.AbstractC1347.m2521(r0)
            java.lang.String r0 = r0.toString()
            r1 = 0
            defpackage.AbstractC2298.m3729(r0, r1)
        L255:
            return
        L256:
            defpackage.C2264.m3681(r1, r4)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static boolean m1785(java.util.Collection r6, java.util.List r7, defpackage.C1380 r8) {
            int r0 = r6.size()
            int r1 = r7.size()
            r2 = 0
            if (r0 == r1) goto Lc
            goto L42
        Lc:
            java.util.Iterator r6 = r6.iterator()
            r0 = r2
        L11:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r6.next()
            int r3 = r0 + 1
            java.lang.Object r0 = r7.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            r4 = 0
            java.lang.Class r1 = m1782(r1, r8, r4)
            java.lang.Class<ᛶᛲᲇ> r4 = defpackage.C1027.class
            ᛲᲀᲈᛳ r5 = defpackage.AbstractC1168.m2249(r4)
            java.lang.Class r5 = defpackage.AbstractC1533.m2785(r5)
            if (r5 != 0) goto L35
            goto L36
        L35:
            r4 = r5
        L36:
            boolean r4 = defpackage.AbstractC0498.m1280(r1, r4)
            if (r4 != 0) goto L43
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L43
        L42:
            return r2
        L43:
            r0 = r3
            goto L11
        L45:
            r6 = 1
            return r6
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final boolean m1786(defpackage.C1380 r0, java.util.Set r1, java.lang.reflect.Executable r2) {
            java.lang.reflect.AnnotatedType[] r2 = r2.getAnnotatedParameterTypes()
            java.lang.reflect.AnnotatedElement[] r2 = (java.lang.reflect.AnnotatedElement[]) r2
            java.util.List r2 = m1787(r2)
            boolean r0 = m1785(r1, r2, r0)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.util.List m1787(java.lang.reflect.AnnotatedElement[] r8) {
            int r0 = r8.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L11
            r4 = r8[r2]
            java.lang.annotation.Annotation[] r4 = r4.getAnnotations()
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L11:
            if (r3 != 0) goto L16
            ᲀᛶᲇ r8 = defpackage.C1698.f7558
            return r8
        L16:
            ᛱᲇᲀᛲ r0 = defpackage.AbstractC0425.m1189()
            int r2 = r8.length
            r3 = r1
        L1c:
            if (r3 >= r2) goto L3b
            r4 = r8[r3]
            java.lang.annotation.Annotation[] r4 = r4.getAnnotations()
            int r5 = r4.length
            r6 = r1
        L26:
            if (r6 >= r5) goto L38
            r7 = r4[r6]
            ᛲᲀᲈᛳ r7 = defpackage.AbstractC1533.m2778(r7)
            java.lang.Class r7 = r7.mo1084()
            r0.add(r7)
            int r6 = r6 + 1
            goto L26
        L38:
            int r3 = r3 + 1
            goto L1c
        L3b:
            ᛱᲇᲀᛲ r8 = defpackage.AbstractC0425.m1197(r0)
            return r8
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.lang.String m1788(int r1, java.lang.String r2) {
            int r0 = m1794(r2)
            int r1 = r1 - r0
            if (r1 <= 0) goto L1a
            java.lang.String r0 = " "
            java.lang.String r1 = defpackage.AbstractC0651.m1484(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
        L1a:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C1273 m1789(defpackage.C0954 r4, defpackage.AbstractC0992 r5, defpackage.C1380 r6) {
            java.lang.String r0 = r5.f4431
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r2 = 25
            r1.<init>(r2)
            java.lang.String r2 = "name"
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r2, r0, r1)
            ᛳᛶᛱᛷ r0 = r5.f4429
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r2 = 26
            r1.<init>(r2)
            java.lang.String r2 = "nameCondition"
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r0 = r5.f4428
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r2 = 27
            r1.<init>(r2)
            java.lang.String r2 = "modifiers"
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r0 = r5.f4427
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r2 = 28
            r1.<init>(r2)
            java.lang.String r2 = "modifiersNot"
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r2, r0, r1)
            ᲇᲈᛱᛸ r0 = new ᲇᲈᛱᛸ
            r1 = 29
            r0.<init>(r1)
            java.lang.String r1 = "modifiersCondition"
            r2 = 0
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r1, r2, r0)
            ᛷᛸᲁᛱ r0 = new ᛷᛸᲁᛱ
            r1 = 0
            r0.<init>(r1)
            java.lang.String r1 = "isSynthetic"
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r1, r2, r0)
            ᛷᛸᲁᛱ r0 = new ᛷᛸᲁᛱ
            r1 = 1
            r0.<init>(r1)
            java.lang.String r1 = "isSyntheticNot"
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r1, r2, r0)
            java.util.LinkedHashSet r0 = r5.f4432
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r3 = 15
            r1.<init>(r6, r3)
            java.lang.String r3 = "annotations"
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r5 = r5.f4433
            ᛵᲀᲀᲇ r0 = new ᛵᲀᲀᲇ
            r1 = 16
            r0.<init>(r6, r1)
            java.lang.String r1 = "annotationsNot"
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r1, r5, r0)
            ᛷᛸᲁᛱ r5 = new ᛷᛸᲁᛱ
            r0 = 2
            r5.<init>(r0)
            java.lang.String r0 = "genericString"
            ᛷᛵᛵᛶ r4 = m1796(r4, r6, r0, r2, r5)
            return r4
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final boolean m1790(defpackage.C1380 r4, java.util.Set r5, java.lang.reflect.Executable r6) {
            java.lang.reflect.AnnotatedType r6 = r6.getAnnotatedReceiverType()
            java.lang.annotation.Annotation[] r6 = r6.getAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            r3 = r6[r2]
            ᛲᲀᲈᛳ r3 = defpackage.AbstractC1533.m2778(r3)
            java.lang.Class r3 = r3.mo1084()
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L22:
            boolean r4 = m1785(r5, r0, r4)
            return r4
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final boolean m1791(defpackage.C1380 r0, java.util.Set r1, java.lang.reflect.Executable r2) {
            java.lang.reflect.AnnotatedType[] r2 = r2.getAnnotatedExceptionTypes()
            java.lang.reflect.AnnotatedElement[] r2 = (java.lang.reflect.AnnotatedElement[]) r2
            java.util.List r2 = m1787(r2)
            boolean r0 = m1785(r1, r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static java.lang.annotation.Annotation[] m1792(java.lang.reflect.Member r1) {
            boolean r0 = r1 instanceof java.lang.reflect.AnnotatedElement
            if (r0 == 0) goto Lb
            java.lang.reflect.AnnotatedElement r1 = (java.lang.reflect.AnnotatedElement) r1
            java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
            return r1
        Lb:
            java.lang.String r0 = "Unsupported member type: "
            defpackage.C2264.m3681(r1, r0)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static java.util.List m1793(defpackage.AbstractC0992 r3, defpackage.C1380 r4, java.lang.Class r5, defpackage.InterfaceC0598 r6) {
            ᲀᛶᲇ r0 = defpackage.C1698.f7558
            if (r5 == 0) goto L39
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            ᛲᲀᲈᛳ r2 = defpackage.AbstractC1168.m2249(r1)
            java.lang.Class r2 = defpackage.AbstractC1533.m2785(r2)
            if (r2 != 0) goto L11
            goto L12
        L11:
            r1 = r2
        L12:
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L19
            goto L39
        L19:
            java.lang.Object r1 = r6.mo617(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L36
            boolean r1 = r4.f6022
            if (r1 == 0) goto L32
            java.lang.Class r5 = r5.getSuperclass()
            java.util.List r0 = m1793(r3, r4, r5, r6)
            goto L35
        L32:
            m1784(r3, r4)
        L35:
            r1 = r0
        L36:
            java.util.List r1 = (java.util.List) r1
            return r1
        L39:
            m1784(r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final int m1794(java.lang.String r7) {
            r0 = 0
            r2 = 0
        L3:
            int r3 = r7.length()
            if (r2 >= r3) goto L1d
            char r3 = r7.charAt(r2)
            long r3 = (long) r3
            r5 = 127(0x7f, double:6.27E-322)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L17
            r3 = 2
            goto L19
        L17:
            r3 = 1
        L19:
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L3
        L1d:
            int r7 = (int) r0
            return r7
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static java.util.List m1795(defpackage.C1282 r6, defpackage.C1380 r7) {
            r7.getClass()
            java.lang.Class r0 = r7.f6023
            r1 = 0
            java.lang.reflect.Constructor[] r0 = r0.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b
            r2.<init>()     // Catch: java.lang.Throwable -> L1b
            int r3 = r0.length     // Catch: java.lang.Throwable -> L1b
            r4 = r1
        L11:
            if (r4 >= r3) goto L25
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L1d
            r2.add(r5)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            int r4 = r4 + 1
            goto L11
        L20:
            ᛴᛸᛲᲀ r2 = new ᛴᛸᛲᲀ
            r2.<init>(r0)
        L25:
            java.lang.Throwable r0 = defpackage.C2165.m3569(r2)
            if (r0 == 0) goto L45
            ᛲᲈᛶᲈ r3 = defpackage.AbstractC2298.f9721
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to get declared constructors in "
            r3.<init>(r4)
            ᲁᲁᛷᲈ r4 = defpackage.AbstractC0849.f3872
            r3.append(r4)
            java.lang.String r4 = " because got an exception."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.AbstractC2298.m3729(r3, r0)
        L45:
            boolean r0 = r2 instanceof defpackage.C0723
            r3 = 0
            if (r0 == 0) goto L4b
            r2 = r3
        L4b:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L51
            ᲀᛶᲇ r2 = defpackage.C1698.f7558
        L51:
            ᛵᲀᛱᲈ r0 = new ᛵᲀᛱᲈ
            r0.<init>(r1, r2)
            ᛷᛵᛵᛶ r0 = m1789(r0, r6, r7)
            ᛷᛵᛵᛶ r6 = m1797(r0, r6, r7)
            java.lang.Class<java.lang.reflect.Constructor> r0 = java.lang.reflect.Constructor.class
            ᛲᲀᲈᛳ r2 = defpackage.AbstractC1168.m2249(r0)
            java.lang.Class<java.lang.reflect.Method> r4 = java.lang.reflect.Method.class
            ᛲᲀᲈᛳ r4 = defpackage.AbstractC1168.m2249(r4)
            boolean r4 = r2.equals(r4)
            r5 = 2
            if (r4 == 0) goto L7c
            ᛱᲈᛳᲁ r0 = new ᛱᲈᛳᲁ
            r0.<init>(r7, r1)
            ᛱᛷᛷᛲ r7 = new ᛱᛷᛷᛲ
            r7.<init>(r6, r0, r5)
            goto La8
        L7c:
            ᛲᲀᲈᛳ r0 = defpackage.AbstractC1168.m2249(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L92
            ᛱᲈᛳᲁ r0 = new ᛱᲈᛳᲁ
            r1 = 1
            r0.<init>(r7, r1)
            ᛱᛷᛷᛲ r7 = new ᛱᛷᛷᛲ
            r7.<init>(r6, r0, r5)
            goto La8
        L92:
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            ᛲᲀᲈᛳ r0 = defpackage.AbstractC1168.m2249(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lad
            ᛱᲈᛳᲁ r0 = new ᛱᲈᛳᲁ
            r0.<init>(r7, r5)
            ᛱᛷᛷᛲ r7 = new ᛱᛷᛷᛲ
            r7.<init>(r6, r0, r5)
        La8:
            java.util.List r6 = defpackage.AbstractC0591.m1392(r7)
            return r6
        Lad:
            java.lang.String r7 = "Unsupported member type: "
            defpackage.C2264.m3681(r6, r7)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static defpackage.C1273 m1796(defpackage.InterfaceC1152 r6, defpackage.C1380 r7, java.lang.String r8, java.lang.Object r9, defpackage.InterfaceC2087 r10) {
            ᛸᲈᛶᲁ r0 = new ᛸᲈᛶᲁ
            r5 = 1
            r3 = r7
            r4 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            ᛷᛵᛵᛶ r7 = new ᛷᛵᛵᛶ
            r8 = 1
            r7.<init>(r6, r8, r0)
            return r7
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static defpackage.C1273 m1797(defpackage.C1273 r7, defpackage.AbstractC1178 r8, defpackage.C1380 r9) {
            java.util.ArrayList r0 = r8.f5335
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 0
            r1.<init>(r9, r2)
            java.lang.String r2 = "parameters"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.ArrayList r0 = r8.f5338
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 7
            r1.<init>(r9, r2)
            java.lang.String r2 = "parametersNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            ᲇᲈᛱᛸ r0 = new ᲇᲈᛱᛸ
            r1 = 18
            r0.<init>(r1)
            java.lang.String r1 = "parametersCondition"
            r2 = 0
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r1, r2, r0)
            java.lang.Integer r0 = r8.f5337
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r3 = 19
            r1.<init>(r3)
            java.lang.String r3 = "parameterCount"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r3, r0, r1)
            ᲇᲈᛱᛸ r0 = new ᲇᲈᛱᛸ
            r1 = 20
            r0.<init>(r1)
            java.lang.String r1 = "parameterCountCondition"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r1, r2, r0)
            java.util.LinkedHashSet r0 = r8.f5346
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r3 = 21
            r1.<init>(r3)
            java.lang.String r3 = "typeParameters"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r3, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5336
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r3 = 22
            r1.<init>(r3)
            java.lang.String r3 = "typeParametersNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r3, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5344
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r3 = 13
            r1.<init>(r9, r3)
            java.lang.String r4 = "exceptionTypes"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r4, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5347
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r4 = 14
            r1.<init>(r9, r4)
            java.lang.String r5 = "exceptionTypesNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r5, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5341
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r5 = 23
            r1.<init>(r5)
            java.lang.String r5 = "genericExceptionTypes"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r5, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5354
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r5 = 12
            r1.<init>(r5)
            java.lang.String r6 = "genericExceptionTypesNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r6, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5351
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r1.<init>(r3)
            java.lang.String r3 = "genericParameters"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r3, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5352
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r1.<init>(r4)
            java.lang.String r3 = "genericParametersNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r3, r0, r1)
            ᲇᲈᛱᛸ r0 = new ᲇᲈᛱᛸ
            r1 = 15
            r0.<init>(r1)
            java.lang.String r1 = "isVarArgs"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r1, r2, r0)
            ᲇᲈᛱᛸ r0 = new ᲇᲈᛱᛸ
            r1 = 16
            r0.<init>(r1)
            java.lang.String r1 = "isVarArgsNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r1, r2, r0)
            java.util.ArrayList r0 = r8.f5342
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 1
            r1.<init>(r9, r2)
            java.lang.String r2 = "parameterAnnotations"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.ArrayList r0 = r8.f5340
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 3
            r1.<init>(r9, r2)
            java.lang.String r2 = "parameterAnnotationsNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5339
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 4
            r1.<init>(r9, r2)
            java.lang.String r2 = "annotatedReturnType"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5345
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 5
            r1.<init>(r9, r2)
            java.lang.String r2 = "annotatedReturnTypeNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5348
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 6
            r1.<init>(r9, r2)
            java.lang.String r2 = "annotatedReceiverType"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5349
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 8
            r1.<init>(r9, r2)
            java.lang.String r2 = "annotatedReceiverTypeNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5355
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 9
            r1.<init>(r9, r2)
            java.lang.String r2 = "annotatedParameterTypes"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5353
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 10
            r1.<init>(r9, r2)
            java.lang.String r2 = "annotatedParameterTypesNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.LinkedHashSet r0 = r8.f5350
            ᛵᲀᲀᲇ r1 = new ᛵᲀᲀᲇ
            r2 = 11
            r1.<init>(r9, r2)
            java.lang.String r2 = "annotatedExceptionTypes"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r2, r0, r1)
            java.util.LinkedHashSet r8 = r8.f5343
            ᛵᲀᲀᲇ r0 = new ᛵᲀᲀᲇ
            r0.<init>(r9, r5)
            java.lang.String r1 = "annotatedExceptionTypesNot"
            ᛷᛵᛵᛶ r7 = m1796(r7, r9, r1, r8, r0)
            return r7
    }
}
