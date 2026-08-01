package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class uv0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f10964 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.uv0.f10964 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.List m5958(java.lang.ClassLoader r4, boolean r5) {
            r4.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6231
            java.util.List r1 = p000.C0666ox.m4323(r0, r4)
            r2 = 1
            if (r1 == 0) goto L2d
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L2d
            java.util.Iterator r4 = r1.iterator()
        L1c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2c
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.setAccessible(r2)
            goto L1c
        L2c:
            return r1
        L2d:
            jz r1 = p000.C0450jz.f5672
            if (r5 == 0) goto L72
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.C0666ox.f8305
            boolean r5 = r5.get()
            if (r5 != 0) goto L3a
            goto L72
        L3a:
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r5 = p000.ln0.m3626(r5, r3)
            if (r5 == 0) goto L50
            java.lang.String r4 = "rf5644a5272eb2eef"
            java.lang.String r5 = "skip comment DexKit scan on main thread"
            p000.C0888ux.m5975(r4, r5)
            return r1
        L50:
            t20 r5 = new t20
            r1 = 14
            r5.<init>(r4, r1)
            java.lang.String r1 = "定位评论长按操作项列表入口"
            java.util.List r4 = p000.C0666ox.m4316(r0, r4, r1, r5)
            java.util.Iterator r5 = r4.iterator()
        L61:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r5.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.setAccessible(r2)
            goto L61
        L71:
            return r4
        L72:
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static java.util.List m5959(java.lang.ClassLoader r10, boolean r11) {
            r10.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6232
            java.util.List r1 = p000.C0666ox.m4323(r0, r10)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L16
            goto L17
        L16:
            r1 = r3
        L17:
            if (r1 == 0) goto L2e
            java.util.Iterator r10 = r1.iterator()
        L1d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L2d
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.setAccessible(r2)
            goto L1d
        L2d:
            return r1
        L2e:
            java.lang.String r1 = "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9BFDFAF7546DEFBE6F7A699FA0B4E1E231EAB579946FE2D2FA5C5B0B85A1F36EBFE6A126665CE055B3E4F9F2C8200D94DA2CD0520C73EF472A0B678E1F90F349"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r4 = "~781A9FBE2FBD8F61F657275D326874C55508DE7AC4D364B88930CC7C2AF8B2F6F1F42FB5723DCF19FDB169E3B07C1571F28AB7C03C50DB95F93145BAB7A004FEEA08CD9ED47324A2FC64074299E44EC1B9FF3E0358910EF4B9C33D8620934304D760AC"
            java.lang.String r4 = p000.jf0.m2957(r4)
            java.lang.String[] r1 = new java.lang.String[]{r1, r4}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L4b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r5 = p000.qe0.m4877(r10, r5)
            if (r5 == 0) goto L4b
            r4.add(r5)
            goto L4b
        L61:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L6a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lfc
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.reflect.Method[] r5 = r5.getDeclaredMethods()
            r5.getClass()
            ss1 r5 = p000.AbstractC0312g7.m2232(r5)
            sv0 r6 = new sv0
            r6.<init>(r2)
            y30 r7 = new y30
            r7.<init>(r5, r2, r6)
            sv0 r5 = new sv0
            r6 = 2
            r5.<init>(r6)
            y30 r6 = new y30
            r6.<init>(r7, r2, r5)
            gp0 r5 = new gp0
            r7 = 26
            r5.<init>(r7)
            y30 r7 = new y30
            r7.<init>(r6, r2, r5)
            gp0 r5 = new gp0
            r6 = 27
            r5.<init>(r6)
            t52 r5 = p000.us1.m5945(r7, r5)
            gp0 r6 = new gp0
            r7 = 28
            r6.<init>(r7)
            y30 r7 = new y30
            r7.<init>(r5, r2, r6)
            x30 r5 = new x30
            r5.<init>(r7)
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto Lc6
            r6 = r3
            goto Lf3
        Lc6:
            java.lang.Object r6 = r5.next()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto Ld1
            goto Lf3
        Ld1:
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.getClass()
            int r7 = m5961(r7)
        Ldb:
            java.lang.Object r8 = r5.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            r9.getClass()
            int r9 = m5961(r9)
            if (r7 >= r9) goto Led
            r6 = r8
            r7 = r9
        Led:
            boolean r8 = r5.hasNext()
            if (r8 != 0) goto Ldb
        Lf3:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L6a
            r1.add(r6)
            goto L6a
        Lfc:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L10a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L125
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r6 = m5962(r6)
            boolean r6 = r3.add(r6)
            if (r6 == 0) goto L10a
            r4.add(r5)
            goto L10a
        L125:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L133
            if (r11 == 0) goto L132
            java.lang.Object r10 = p000.C0666ox.f8297
            p000.C0666ox.m4327(r0, r4)
        L132:
            return r4
        L133:
            jz r1 = p000.C0450jz.f5672
            if (r11 == 0) goto L17a
            java.lang.Object r11 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.C0666ox.f8305
            boolean r11 = r11.get()
            if (r11 != 0) goto L142
            goto L17a
        L142:
            android.os.Looper r11 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r11 = p000.ln0.m3626(r11, r3)
            if (r11 == 0) goto L158
            java.lang.String r10 = "rf5644a5272eb2eef"
            java.lang.String r11 = "skip feed DexKit scan on main thread"
            p000.C0888ux.m5975(r10, r11)
            return r1
        L158:
            t20 r11 = new t20
            r1 = 13
            r11.<init>(r10, r1)
            java.lang.String r1 = "定位 Feed 长按面板分组 View 入口"
            java.util.List r10 = p000.C0666ox.m4316(r0, r10, r1, r11)
            java.util.Iterator r11 = r10.iterator()
        L169:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L179
            java.lang.Object r0 = r11.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.setAccessible(r2)
            goto L169
        L179:
            return r10
        L17a:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static int m5960(java.lang.reflect.Method r4, p000.tv0 r5) {
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Le
            r0 = 600(0x258, float:8.41E-43)
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class r3 = r4.getReturnType()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L1d
            int r0 = r0 + 800
        L1d:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r2 = r4.length
            r3 = 2
            if (r2 != r3) goto L27
            int r0 = r0 + 300
        L27:
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r1, r4)
            java.lang.Class r1 = (java.lang.Class) r1
            r2 = 0
            if (r1 == 0) goto L35
            java.lang.String r1 = r1.getName()
            goto L36
        L35:
            r1 = r2
        L36:
            java.lang.String r3 = r5.f10473
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L40
            int r0 = r0 + 1500
        L40:
            r1 = 1
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r1, r4)
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 == 0) goto L4d
            java.lang.String r2 = r4.getName()
        L4d:
            java.lang.String r4 = r5.f10474
            boolean r4 = p000.ln0.m3626(r2, r4)
            if (r4 == 0) goto L57
            int r0 = r0 + 1500
        L57:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static int m5961(java.lang.reflect.Method r3) {
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9BFDFAF7546DEFBE6F7A699FA0B4E1E231EAB579946FE2D2FA5C5B0B85A1F36EBFE6A126665CE055B3E4F9F2C8200D94DA2CD0520C73EF472A0B678E1F90F349"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            r0 = 1600(0x640, float:2.242E-42)
            goto L18
        L17:
            r0 = 0
        L18:
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "~781A9FBE2FBD8F61F657275D326874C55508DE7AC4D364B88930CC7C2AF8B2F6F1F42FB5723DCF19FDB169E3B07C1571F28AB7C03C50DB95F93145BAB7A004FEEA08CD9ED47324A2FC64074299E44EC1B9FF3E0358910EF4B9C33D8620934304D760AC"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2e
            int r0 = r0 + 1800
        L2e:
            int r1 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L3a
            int r0 = r0 + 300
        L3a:
            java.lang.Class[] r1 = r3.getParameterTypes()
            r1.getClass()
            int r1 = r1.length
            if (r1 != 0) goto L46
            int r0 = r0 + 400
        L46:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class r3 = r3.getReturnType()
            boolean r3 = r1.isAssignableFrom(r3)
            if (r3 == 0) goto L54
            int r0 = r0 + 800
        L54:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m5962(java.lang.reflect.Method r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            gp0 r2 = new gp0
            r3 = 29
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }
}
