package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n82 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.String[] f7460 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.String[] f7461 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.lang.Float[] f7462 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f7463 = null;

    static {
            java.lang.String r0 = "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE655C57CCE309ADC8A4139A41016AE18A503FB26697531CDD62D41999BFD01317DDC437FFE5EB3FE355E6AF23A1AED7"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~781E02ACA191AA7881FAB904866C710C60CECD854A3036618B6D5D6F175DAD3EFD4B46D1AD69FE7AB4113370FFCA99FF5F14F8092287C681D2574A668DA530C9DBBA1A7C9BFCEAE11FC4A9247F4D26781A04C60C7F731385AE08449AE46E2E5FB438"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p000.n82.f7460 = r0
            java.lang.String r0 = "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CEDAB515DCE2816D426A735BD613EB803E27DD20F86DC9230C10D9F6CC144E"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059C08CDF08276C16F4F93A63F901C16ED62E3D20F577E9D0206DA5E6C725E916340D32148573CC1BD2E"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r2 = "X.C1131250fQ2"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            p000.n82.f7461 = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 1061158912(0x3f400000, float:0.75)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            r0 = 1067450368(0x3fa00000, float:1.25)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            r0 = 1069547520(0x3fc00000, float:1.5)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = 1077936128(0x40400000, float:3.0)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r0)
            java.lang.Float[] r0 = new java.lang.Float[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            p000.n82.f7462 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.n82.f7463 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m4012() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L28
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            java.lang.String r5 = "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE655C57CCE309ADC8A4139A41016AE18A503FB26697531CDD62D41999BFD01317DDC437FFE5EB3FE355E6AF23A1AED7"
            java.lang.String r5 = p000.jf0.m2957(r5)
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L25
            r0 = 1
            return r0
        L25:
            int r3 = r3 + 1
            goto Lf
        L28:
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static final void m4013(java.lang.Object r10, java.lang.String r11) {
            java.lang.Class r0 = r10.getClass()
        L4:
            if (r0 == 0) goto L74
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L6f
            r4 = r1[r3]
            java.lang.Class r5 = r4.getType()
            java.lang.Class r6 = java.lang.Float.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L6c
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L6c
            float r5 = r4.getFloat(r10)     // Catch: java.lang.Throwable -> L6c
            r6 = 1036831949(0x3dcccccd, float:0.1)
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 > 0) goto L6c
            r6 = 1092616192(0x41200000, float:10.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L6c
            java.lang.String r6 = "rfe847aaa60ab2d90"
            java.lang.String r7 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r9 = "["
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c
            r8.append(r11)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r9 = "] "
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c
            r8.append(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = "."
            r8.append(r7)     // Catch: java.lang.Throwable -> L6c
            r8.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "="
            r8.append(r4)     // Catch: java.lang.Throwable -> L6c
            r8.append(r5)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            r5 = 4
            r7 = 0
            p000.C0888ux.m5988(r6, r4, r7, r5, r7)     // Catch: java.lang.Throwable -> L6c
        L6c:
            int r3 = r3 + 1
            goto Lf
        L6f:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L74:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m4014(p000.z81 r9) {
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = p000.n82.f7463
            java.lang.String r1 = "rfe847aaa60ab2d90"
            r2 = 4
            r3 = 0
            java.lang.Object r4 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "~791C379109EE249A17C75D97B08A46A1FBF5443CB34C0F44BBA61A1BA3C0B72730E4"
            java.lang.String r4 = p000.jf0.m2957(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.ClassLoader r5 = r9.f13011     // Catch: java.lang.Throwable -> L1c
            java.lang.Class r4 = p000.qe0.m4877(r5, r4)     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L1f
            java.lang.String r9 = "TTVideoEngine missing, native extended speed unavailable"
            p000.C0888ux.m5988(r1, r9, r3, r2, r3)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r9 = move-exception
            goto L99
        L1f:
            java.lang.String r5 = "~79141EF2EADECCC95F8E537CA438592001E160053AEBA1A3C5EB288EC33A55AA"
            java.lang.String r5 = p000.jf0.m2957(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.ClassLoader r6 = r9.f13011     // Catch: java.lang.Throwable -> L1c
            java.lang.Class r5 = p000.qe0.m4877(r6, r5)     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L33
            java.lang.String r9 = "PlaybackParams missing, native extended speed unavailable"
            p000.C0888ux.m5988(r1, r9, r3, r2, r3)     // Catch: java.lang.Throwable -> L1c
            return
        L33:
            java.lang.ClassLoader r9 = r9.f13011     // Catch: java.lang.Throwable -> L1c
            int r9 = java.lang.System.identityHashCode(r9)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = r5.getName()     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r8.<init>()     // Catch: java.lang.Throwable -> L1c
            r8.append(r9)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r9 = ":"
            r8.append(r9)     // Catch: java.lang.Throwable -> L1c
            r8.append(r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r9 = "#setPlaybackParams("
            r8.append(r9)     // Catch: java.lang.Throwable -> L1c
            r8.append(r7)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r9 = ")"
            r8.append(r9)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r9 = r8.toString()     // Catch: java.lang.Throwable -> L1c
            boolean r6 = r0.add(r9)     // Catch: java.lang.Throwable -> L1c
            if (r6 != 0) goto L69
            goto Lb0
        L69:
            java.lang.String r6 = "setPlaybackParams"
            py1 r7 = new py1     // Catch: java.lang.Throwable -> L7b
            r8 = 20
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r7}     // Catch: java.lang.Throwable -> L7b
            l01 r4 = p000.qe0.m4873(r4, r6, r5)     // Catch: java.lang.Throwable -> L7b
            goto L82
        L7b:
            r4 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L1c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1c
            r4 = r5
        L82:
            boolean r5 = r4 instanceof p000.eo1     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L8e
            r5 = r4
            l01 r5 = (p000.l01) r5     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "✅ TTVideoEngine native extended speed hook installed"
            p000.C0888ux.m5988(r1, r5, r3, r2, r3)     // Catch: java.lang.Throwable -> L1c
        L8e:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L95
            goto Lb0
        L95:
            r0.remove(r9)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L99:
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r9 = r9.getMessage()
            java.lang.String r4 = "TTVideoEngine native extended speed hook ERR: "
            java.lang.String r5 = ": "
            java.lang.String r9 = p000.a12.m18(r4, r0, r5, r9)
            p000.C0888ux.m5988(r1, r9, r3, r2, r3)
        Lb0:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m4015(java.lang.reflect.Method r1) {
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto Lb
            goto L29
        Lb:
            java.lang.Class[] r0 = r1.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L29
            java.lang.Class r1 = r1.getReturnType()
            boolean r0 = r1.isArray()
            if (r0 != 0) goto L27
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L29
        L27:
            r1 = 1
            return r1
        L29:
            r1 = 0
            return r1
    }
}
