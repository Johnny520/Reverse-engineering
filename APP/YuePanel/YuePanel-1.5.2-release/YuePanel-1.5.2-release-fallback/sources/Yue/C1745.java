package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
public final class C1745 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f5438 = 1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m8289(int r3, int r4) {
            if (r4 > r3) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Debug metadata version mismatch. Expected: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ", got "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ". Please update the Kotlin standard library."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.InterfaceC1744 m8290(Yue.AbstractC0730 r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<Yue.ۥۣ۟ۨۨ> r0 = Yue.InterfaceC1744.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            Yue.ۥۣ۟ۨۨ r1 = (Yue.InterfaceC1744) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m8291(Yue.AbstractC0730 r2) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "label"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L24
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Exception -> L24
            boolean r0 = r2 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L19
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L24
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L21
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L24
            goto L22
        L21:
            r2 = 0
        L22:
            int r2 = r2 - r1
            goto L25
        L24:
            r2 = -1
        L25:
            return r2
    }

    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC3421(name = "getSpilledVariableFieldMapping")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String[] m8292(@Yue.InterfaceC4418 Yue.AbstractC0730 r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            Yue.ۥۣ۟ۨۨ r0 = m8290(r7)
            if (r0 != 0) goto Ld
            r7 = 0
            return r7
        Ld:
            int r1 = r0.v()
            r2 = 1
            m8289(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r7 = m8291(r7)
            int[] r2 = r0.i()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L25:
            if (r5 >= r3) goto L40
            r6 = r2[r5]
            if (r6 != r7) goto L3d
            java.lang.String[] r6 = r0.s()
            r6 = r6[r5]
            r1.add(r6)
            java.lang.String[] r6 = r0.n()
            r6 = r6[r5]
            r1.add(r6)
        L3d:
            int r5 = r5 + 1
            goto L25
        L40:
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.Object[] r7 = r1.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            return r7
    }

    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC3421(name = "getStackTraceElement")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.StackTraceElement m8293(@Yue.InterfaceC4418 Yue.AbstractC0730 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥۣ۟ۨۨ r0 = m8290(r4)
            if (r0 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            r1 = 1
            int r2 = r0.v()
            m8289(r1, r2)
            int r1 = m8291(r4)
            if (r1 >= 0) goto L1d
            r1 = -1
            goto L23
        L1d:
            int[] r2 = r0.l()
            r1 = r2[r1]
        L23:
            Yue.ۥۣۡۡۤ r2 = Yue.C4261.f13153
            java.lang.String r4 = r2.m16528(r4)
            if (r4 != 0) goto L30
            java.lang.String r4 = r0.c()
            goto L48
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r4 = 47
            r2.append(r4)
            java.lang.String r4 = r0.c()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L48:
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.m()
            java.lang.String r0 = r0.f()
            r2.<init>(r4, r3, r0, r1)
            return r2
    }
}
