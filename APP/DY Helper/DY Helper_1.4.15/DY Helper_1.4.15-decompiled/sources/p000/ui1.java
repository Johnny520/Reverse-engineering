package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ui1 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object f10844 = null;

    /* JADX INFO: renamed from: β */
    public static volatile android.content.Context f10845 = null;

    /* JADX INFO: renamed from: γ */
    public static volatile android.content.SharedPreferences f10846 = null;

    /* JADX INFO: renamed from: δ */
    public static volatile android.content.SharedPreferences f10847 = null;

    /* JADX INFO: renamed from: ε */
    public static volatile android.content.SharedPreferences f10848 = null;

    /* JADX INFO: renamed from: ζ */
    public static volatile java.lang.String f10849 = "";

    /* JADX INFO: renamed from: η */
    public static volatile java.lang.String f10850 = "";

    /* JADX INFO: renamed from: θ */
    public static volatile long f10851;

    /* JADX INFO: renamed from: ι */
    public static final java.util.concurrent.CopyOnWriteArrayList f10852 = null;

    /* JADX INFO: renamed from: κ */
    public static final java.util.concurrent.CopyOnWriteArrayList f10853 = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.ui1.f10844 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.ui1.f10852 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.ui1.f10853 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static boolean m5867() {
            android.content.SharedPreferences r0 = p000.ui1.f10846
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Β */
    public static void m5868(java.lang.String r5) {
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.ui1.f10853
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            a80 r1 = (p000.a80) r1
            r1.invoke(r5)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "config changed listener error: "
            java.lang.String r1 = p000.lz1.m3687(r2, r1)
            r2 = 4
            java.lang.String r3 = "r24d5e64064e1c279"
            r4 = 0
            p000.C0888ux.m5988(r3, r1, r4, r2, r4)
            goto L6
        L29:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public static void m5869(java.lang.String r5) {
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.ui1.f10852
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            a80 r1 = (p000.a80) r1
            r1.invoke(r5)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "profile listener error: "
            java.lang.String r1 = p000.lz1.m3687(r2, r1)
            r2 = 4
            java.lang.String r3 = "r24d5e64064e1c279"
            r4 = 0
            p000.C0888ux.m5988(r3, r1, r4, r2, r4)
            goto L6
        L29:
            return
    }

    /* JADX INFO: renamed from: Δ */
    public static android.content.SharedPreferences m5870(android.content.Context r1, java.lang.String r2) {
            r1.getClass()
            r2.getClass()
            r0 = 4
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: Ε */
    public static void m5871(java.lang.String r2, boolean r3) {
            r2.getClass()
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> L2e
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L2e
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)     // Catch: java.lang.Throwable -> L2e
            r0.apply()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "info_bar_enabled"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            android.content.SharedPreferences r0 = p000.ui1.f10846     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            android.content.SharedPreferences$Editor r3 = r0.putBoolean(r2, r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            r3.apply()     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r3 = move-exception
            goto L34
        L30:
            m5868(r2)     // Catch: java.lang.Throwable -> L2e
            return
        L34:
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "putBool 失败 ["
            java.lang.String r1 = "]: "
            java.lang.String r2 = p000.a12.m18(r0, r2, r1, r3)
            r3 = 4
            java.lang.String r0 = "r24d5e64064e1c279"
            r1 = 0
            p000.C0888ux.m5988(r0, r2, r1, r3, r1)
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public static void m5872(java.lang.String r2, float r3) {
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r3 = r0.putFloat(r2, r3)     // Catch: java.lang.Throwable -> L13
            r3.apply()     // Catch: java.lang.Throwable -> L13
            m5868(r2)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "putFloat 失败 ["
            java.lang.String r1 = "]: "
            java.lang.String r2 = p000.a12.m18(r0, r2, r1, r3)
            r3 = 4
            java.lang.String r0 = "r24d5e64064e1c279"
            r1 = 0
            p000.C0888ux.m5988(r0, r2, r1, r3, r1)
            return
    }

    /* JADX INFO: renamed from: Η */
    public static void m5873(java.lang.String r2, int r3) {
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r3 = r0.putInt(r2, r3)     // Catch: java.lang.Throwable -> L13
            r3.apply()     // Catch: java.lang.Throwable -> L13
            m5868(r2)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "putInt 失败 ["
            java.lang.String r1 = "]: "
            java.lang.String r2 = p000.a12.m18(r0, r2, r1, r3)
            r3 = 4
            java.lang.String r0 = "r24d5e64064e1c279"
            r1 = 0
            p000.C0888ux.m5988(r0, r2, r1, r3, r1)
            return
    }

    /* JADX INFO: renamed from: Θ */
    public static void m5874(long r1, java.lang.String r3) {
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r1 = r0.putLong(r3, r1)     // Catch: java.lang.Throwable -> L10
            r1.apply()     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "putLong 失败 ["
            java.lang.String r0 = "]: "
            java.lang.String r1 = p000.a12.m18(r2, r3, r0, r1)
            r2 = 4
            java.lang.String r3 = "r24d5e64064e1c279"
            r0 = 0
            p000.C0888ux.m5988(r3, r1, r0, r2, r0)
            return
    }

    /* JADX INFO: renamed from: Ι */
    public static void m5875(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> L19
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L19
            android.content.SharedPreferences$Editor r3 = r0.putString(r2, r3)     // Catch: java.lang.Throwable -> L19
            r3.apply()     // Catch: java.lang.Throwable -> L19
            m5868(r2)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "putString 失败 ["
            java.lang.String r1 = "]: "
            java.lang.String r2 = p000.a12.m18(r0, r2, r1, r3)
            r3 = 4
            java.lang.String r0 = "r24d5e64064e1c279"
            r1 = 0
            p000.C0888ux.m5988(r0, r2, r1, r3, r1)
            return
    }

    /* JADX INFO: renamed from: Κ */
    public static void m5876(java.lang.String r3) {
            r3.getClass()
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> L16
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L16
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L16
            r0.apply()     // Catch: java.lang.Throwable -> L16
            m5868(r3)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "remove 失败 ["
            java.lang.String r2 = "]: "
            java.lang.String r3 = p000.a12.m18(r1, r3, r2, r0)
            r0 = 4
            java.lang.String r1 = "r24d5e64064e1c279"
            r2 = 0
            p000.C0888ux.m5988(r1, r3, r2, r0, r2)
            return
    }

    /* JADX INFO: renamed from: Λ */
    public static void m5877(android.content.SharedPreferences r15) {
            if (r15 != 0) goto L4
            goto Lfa
        L4:
            java.lang.String r1 = "double_tap_menu_enabled"
            boolean r0 = r15.contains(r1)
            r2 = 4
            java.lang.String r3 = "r24d5e64064e1c279"
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L40
            boolean r0 = r15.getBoolean(r1, r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L21:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto L28
            r0 = r6
        L28:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L35
            java.lang.String r0 = "检测到旧版双击唤出菜单开关=true，已强制关闭"
            p000.C0888ux.m5988(r3, r0, r5, r2, r5)
        L35:
            android.content.SharedPreferences$Editor r0 = r15.edit()
            r0.getClass()
            r0.putBoolean(r1, r4)
            goto L41
        L40:
            r0 = r5
        L41:
            java.lang.String r13 = "底部区域"
            java.lang.String r14 = "右下区域"
            java.lang.String r6 = "左上区域"
            java.lang.String r7 = "顶部区域"
            java.lang.String r8 = "右上区域"
            java.lang.String r9 = "左侧互动区"
            java.lang.String r10 = "中间区域"
            java.lang.String r11 = "右侧互动区"
            java.lang.String r12 = "左下区域"
            java.lang.String[] r1 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14}
            java.lang.String r6 = "double_tap"
            java.lang.String r7 = "long_press"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}
            r7 = r4
        L60:
            r8 = 9
            if (r7 >= r8) goto Lf5
            r8 = r1[r7]
            r9 = r0
            r10 = r4
        L68:
            r0 = 2
            if (r10 >= r0) goto Lf0
            r0 = r6[r10]
            java.lang.String r11 = "gesture_"
            java.lang.String r12 = "_"
            java.lang.String r11 = p000.a12.m18(r11, r8, r12, r0)
            java.lang.String r0 = r15.getString(r11, r5)     // Catch: java.lang.Throwable -> L7a
            goto L81
        L7a:
            r0 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r0)
            r0 = r12
        L81:
            boolean r12 = r0 instanceof p000.eo1
            if (r12 == 0) goto L86
            r0 = r5
        L86:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L93
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            goto L94
        L93:
            r0 = r5
        L94:
            if (r0 == 0) goto Lec
            int r12 = r0.hashCode()
            r13 = -1433190089(0xffffffffaa934137, float:-2.6157697E-13)
            if (r12 == r13) goto Lbc
            r13 = -1195029678(0xffffffffb8c54b52, float:-9.4077215E-5)
            if (r12 == r13) goto Lb3
            r13 = 789348200(0x2f0c7f68, float:1.277819E-10)
            if (r12 == r13) goto Laa
            goto Lec
        Laa:
            java.lang.String r12 = "操作菜单"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto Lc5
            goto Lec
        Lb3:
            java.lang.String r12 = "module_menu"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto Lec
            goto Lc5
        Lbc:
            java.lang.String r12 = "operation_menu"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto Lc5
            goto Lec
        Lc5:
            if (r9 == 0) goto Lc9
        Lc7:
            r12 = r9
            goto Ld1
        Lc9:
            android.content.SharedPreferences$Editor r9 = r15.edit()
            r9.getClass()
            goto Lc7
        Ld1:
            java.lang.String r13 = "无"
            r9.putString(r11, r13)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r13 = "已清理旧版手势动作 "
            r9.<init>(r13)
            r9.append(r11)
            java.lang.String r11 = "="
            java.lang.String r13 = " -> 无"
            java.lang.String r0 = p000.AbstractC0602nx.m4133(r9, r11, r0, r13)
            p000.C0888ux.m5988(r3, r0, r5, r2, r5)
            r9 = r12
        Lec:
            int r10 = r10 + 1
            goto L68
        Lf0:
            int r7 = r7 + 1
            r0 = r9
            goto L60
        Lf5:
            if (r0 == 0) goto Lfa
            r0.apply()
        Lfa:
            return
    }

    /* JADX INFO: renamed from: Μ */
    public static void m5878(java.lang.String r3, java.lang.String r4, boolean r5) {
            java.lang.String r0 = "blacklist_blocked"
            r3.getClass()
            r4.getClass()
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences r1 = m5892()     // Catch: java.lang.Throwable -> L41
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "blacklist_uid"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)     // Catch: java.lang.Throwable -> L41
            android.content.SharedPreferences$Editor r5 = r1.putBoolean(r0, r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "blacklist_reason"
            android.content.SharedPreferences$Editor r4 = r5.putString(r1, r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "blacklist_checked_at"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L41
            android.content.SharedPreferences$Editor r4 = r4.putLong(r5, r1)     // Catch: java.lang.Throwable -> L41
            r4.apply()     // Catch: java.lang.Throwable -> L41
            m5868(r0)     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r5 = "saveBlacklistResult failed uid="
            java.lang.String r0 = ": "
            java.lang.String r3 = p000.a12.m18(r5, r3, r0, r4)
            r4 = 4
            java.lang.String r5 = "r24d5e64064e1c279"
            r0 = 0
            p000.C0888ux.m5988(r5, r3, r0, r4, r0)
            return
    }

    /* JADX INFO: renamed from: Ν */
    public static void m5879(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "setCurrentUid pending uid="
            r4.getClass()
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            boolean r1 = p000.q02.m4671(r4)
            if (r1 != 0) goto L51
            java.lang.String r1 = "0"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L1c
            goto L51
        L1c:
            java.lang.Object r1 = p000.ui1.f10844
            monitor-enter(r1)
            p000.ui1.f10850 = r4     // Catch: java.lang.Throwable -> L42
            android.content.Context r2 = p000.ui1.f10845     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L44
            java.lang.String r2 = "r24d5e64064e1c279"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L42
            r3.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = " source="
            r3.append(r0)     // Catch: java.lang.Throwable -> L42
            r3.append(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L42
            r0 = 4
            r3 = 0
            p000.C0888ux.m5988(r2, r5, r3, r0, r3)     // Catch: java.lang.Throwable -> L42
            r5 = 0
            goto L48
        L42:
            r4 = move-exception
            goto L4f
        L44:
            boolean r5 = m5880(r4, r5)     // Catch: java.lang.Throwable -> L42
        L48:
            monitor-exit(r1)
            if (r5 == 0) goto L51
            m5869(r4)
            return
        L4f:
            monitor-exit(r1)
            throw r4
        L51:
            return
    }

    /* JADX INFO: renamed from: Ξ */
    public static boolean m5880(java.lang.String r19, java.lang.String r20) {
            java.lang.CharSequence r0 = p000.q02.m4660(r19)
            java.lang.String r0 = r0.toString()
            boolean r1 = p000.q02.m4671(r0)
            r2 = 0
            if (r1 != 0) goto L17
            java.lang.String r1 = "0"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1b
        L17:
            r18 = r2
            goto L1d3
        L1b:
            android.content.Context r1 = p000.ui1.f10845
            if (r1 != 0) goto L20
            goto L17
        L20:
            java.lang.String r3 = p000.ui1.f10849
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2d
            android.content.SharedPreferences r3 = p000.ui1.f10847
            if (r3 == 0) goto L2d
            goto L17
        L2d:
            java.lang.String r3 = m5881(r0)
            android.content.SharedPreferences r1 = m5870(r1, r3)
            java.lang.CharSequence r4 = p000.q02.m4660(r0)
            java.lang.String r4 = r4.toString()
            boolean r5 = p000.q02.m4671(r4)
            r7 = 4
            java.lang.String r8 = "r24d5e64064e1c279"
            r9 = 0
            if (r5 == 0) goto L48
            goto L9e
        L48:
            java.lang.String r5 = "__dyhelper_schema_version"
            int r10 = r1.getInt(r5, r2)
            java.lang.String r11 = "__dyhelper_account_uid"
            java.lang.String r12 = ""
            java.lang.String r13 = r1.getString(r11, r12)
            if (r13 == 0) goto L61
            java.lang.CharSequence r13 = p000.q02.m4660(r13)
            java.lang.String r13 = r13.toString()
            goto L62
        L61:
            r13 = r9
        L62:
            if (r13 != 0) goto L65
            goto L66
        L65:
            r12 = r13
        L66:
            r13 = 2
            if (r10 < r13) goto La2
            boolean r10 = p000.q02.m4671(r12)
            if (r10 == 0) goto L7a
            android.content.SharedPreferences$Editor r10 = r1.edit()
            android.content.SharedPreferences$Editor r10 = r10.putString(r11, r4)
            r10.apply()
        L7a:
            boolean r10 = p000.q02.m4671(r12)
            if (r10 != 0) goto L9e
            boolean r10 = r12.equals(r4)
            if (r10 == 0) goto L87
            goto L9e
        L87:
            java.lang.String r10 = "账号配置文件 UID 不一致，重建。fileUid="
            java.lang.String r14 = " currentUid="
            java.lang.String r10 = p000.a12.m18(r10, r12, r14, r4)
            p000.C0888ux.m5988(r8, r10, r9, r7, r9)
            android.content.SharedPreferences$Editor r10 = r1.edit()
            android.content.SharedPreferences$Editor r10 = r10.clear()
            r10.apply()
            goto La2
        L9e:
            r19 = 1
            goto L18d
        La2:
            android.content.SharedPreferences r10 = p000.ui1.f10846
            if (r10 == 0) goto Lab
            java.util.Map r10 = r10.getAll()
            goto Lac
        Lab:
            r10 = r9
        Lac:
            if (r10 != 0) goto Lb0
            kz r10 = p000.C0493kz.f6332
        Lb0:
            android.content.SharedPreferences$Editor r12 = r1.edit()
            java.util.Set r14 = r10.entrySet()
            java.util.Iterator r14 = r14.iterator()
        Lbc:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L168
            java.lang.Object r15 = r14.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r16 = r15.getKey()
            r19 = 1
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r15 = r15.getValue()
            r6.getClass()
            java.lang.String r7 = "__dyhelper_"
            boolean r7 = p000.x02.m6485(r6, r7, r2)
            if (r7 != 0) goto L15c
            r12.getClass()
            boolean r7 = r15 instanceof java.lang.Boolean
            if (r7 == 0) goto Lf3
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r7 = r15.booleanValue()
            r12.putBoolean(r6, r7)
            goto L15c
        Lf3:
            boolean r7 = r15 instanceof java.lang.Integer
            if (r7 == 0) goto L101
            java.lang.Number r15 = (java.lang.Number) r15
            int r7 = r15.intValue()
            r12.putInt(r6, r7)
            goto L15c
        L101:
            boolean r7 = r15 instanceof java.lang.Long
            if (r7 == 0) goto L113
            java.lang.Number r15 = (java.lang.Number) r15
            r17 = r10
            long r9 = r15.longValue()
            r12.putLong(r6, r9)
        L110:
            r18 = r2
            goto L160
        L113:
            r17 = r10
            boolean r9 = r15 instanceof java.lang.Float
            if (r9 == 0) goto L123
            java.lang.Number r15 = (java.lang.Number) r15
            float r9 = r15.floatValue()
            r12.putFloat(r6, r9)
            goto L110
        L123:
            boolean r9 = r15 instanceof java.lang.String
            if (r9 == 0) goto L12d
            java.lang.String r15 = (java.lang.String) r15
            r12.putString(r6, r15)
            goto L110
        L12d:
            boolean r9 = r15 instanceof java.util.Set
            if (r9 == 0) goto L110
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r15.iterator()
        L13c:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L152
            java.lang.Object r15 = r10.next()
            r18 = r2
            boolean r2 = r15 instanceof java.lang.String
            if (r2 == 0) goto L14f
            r9.add(r15)
        L14f:
            r2 = r18
            goto L13c
        L152:
            r18 = r2
            java.util.Set r2 = p000.AbstractC0984xh.m6671(r9)
            r12.putStringSet(r6, r2)
            goto L160
        L15c:
            r18 = r2
            r17 = r10
        L160:
            r10 = r17
            r2 = r18
            r7 = 4
            r9 = 0
            goto Lbc
        L168:
            r17 = r10
            r19 = 1
            android.content.SharedPreferences$Editor r2 = r12.putInt(r5, r13)
            android.content.SharedPreferences$Editor r2 = r2.putString(r11, r4)
            boolean r4 = r17.isEmpty()
            r4 = r4 ^ 1
            java.lang.String r5 = "__dyhelper_migrated_from_legacy"
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r5, r4)
            java.lang.String r4 = "__dyhelper_migrated_at"
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r2.putLong(r4, r5)
            r2.apply()
        L18d:
            m5877(r1)
            p000.ui1.f10849 = r0
            p000.ui1.f10847 = r1
            long r1 = p000.ui1.f10851
            r4 = 1
            long r1 = r1 + r4
            p000.ui1.f10851 = r1
            android.content.SharedPreferences r1 = p000.ui1.f10848
            if (r1 == 0) goto L1b0
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L1b0
            java.lang.String r2 = "last_uid"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r0)
            if (r1 == 0) goto L1b0
            r1.apply()
        L1b0:
            long r1 = p000.ui1.f10851
            java.lang.String r4 = " file="
            java.lang.String r5 = " source="
            java.lang.String r6 = "当前账号配置已切换 uid="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r6, r0, r4, r3, r5)
            r3 = r20
            r0.append(r3)
            java.lang.String r3 = " generation="
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r7 = 0
            p000.C0888ux.m5988(r8, r0, r7, r1, r7)
            return r19
        L1d3:
            return r18
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m5881(java.lang.String r5) {
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        L12:
            if (r2 >= r1) goto L2c
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 != 0) goto L26
            r4 = 95
            if (r3 == r4) goto L26
            r4 = 45
            if (r3 != r4) goto L29
        L26:
            r0.append(r3)
        L29:
            int r2 = r2 + 1
            goto L12
        L2c:
            java.lang.String r5 = r0.toString()
            boolean r0 = p000.q02.m4671(r5)
            if (r0 == 0) goto L38
            java.lang.String r5 = "unknown"
        L38:
            java.lang.String r0 = "dyhelper_prefs_uid_"
            java.lang.String r5 = r0.concat(r5)
            return r5
    }

    /* JADX INFO: renamed from: β */
    public static void m5882(p000.a80 r1) {
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.ui1.f10853
            r0.add(r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static p000.si1 m5883() {
            java.lang.Object r1 = p000.ui1.f10844
            monitor-enter(r1)
            android.content.Context r2 = p000.ui1.f10845     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            if (r2 != 0) goto L1d
            si1 r3 = new si1     // Catch: java.lang.Throwable -> L1a
            jz r5 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "PrefsManager 未初始化"
            java.util.List r8 = p000.AbstractC1021yh.m6896(r2)     // Catch: java.lang.Throwable -> L1a
            r4 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1a
            goto Lc5
        L1a:
            r0 = move-exception
            goto L10c
        L1d:
            java.util.LinkedHashSet r3 = m5885(r2)     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L1a
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L1a
            r9 = r0
            r10 = r9
        L2c:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L1a
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences r0 = m5870(r2, r6)     // Catch: java.lang.Throwable -> L68
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L68
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.commit()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L4e
            int r9 = r9 + 1
            goto L62
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            r0.append(r6)     // Catch: java.lang.Throwable -> L68
            java.lang.String r7 = ": clear commit=false"
            r0.append(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L68
            r4.add(r0)     // Catch: java.lang.Throwable -> L68
        L62:
            int r0 = m5884(r2, r6, r4)     // Catch: java.lang.Throwable -> L68
            int r10 = r10 + r0
            goto L2c
        L68:
            r0 = move-exception
            java.lang.String r7 = r0.getMessage()     // Catch: java.lang.Throwable -> L1a
            if (r7 != 0) goto L77
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = r0.getName()     // Catch: java.lang.Throwable -> L1a
        L77:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r0.append(r6)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = ": "
            r0.append(r6)     // Catch: java.lang.Throwable -> L1a
            r0.append(r7)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1a
            r4.add(r0)     // Catch: java.lang.Throwable -> L1a
            goto L2c
        L8f:
            java.lang.String r0 = "dyhelper_prefs"
            android.content.SharedPreferences r0 = m5870(r2, r0)     // Catch: java.lang.Throwable -> L1a
            p000.ui1.f10846 = r0     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = "dyhelper_prefs_meta"
            android.content.SharedPreferences r0 = m5870(r2, r0)     // Catch: java.lang.Throwable -> L1a
            p000.ui1.f10848 = r0     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences r0 = p000.ui1.f10846     // Catch: java.lang.Throwable -> L1a
            p000.ui1.f10847 = r0     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = ""
            p000.ui1.f10849 = r0     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = ""
            p000.ui1.f10850 = r0     // Catch: java.lang.Throwable -> L1a
            long r5 = p000.ui1.f10851     // Catch: java.lang.Throwable -> L1a
            r7 = 1
            long r5 = r5 + r7
            p000.ui1.f10851 = r5     // Catch: java.lang.Throwable -> L1a
            si1 r6 = new si1     // Catch: java.lang.Throwable -> L1a
            boolean r7 = r4.isEmpty()     // Catch: java.lang.Throwable -> L1a
            java.util.List r8 = p000.AbstractC0984xh.m6666(r3)     // Catch: java.lang.Throwable -> L1a
            java.util.List r11 = p000.AbstractC0984xh.m6666(r4)     // Catch: java.lang.Throwable -> L1a
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            r3 = r6
        Lc5:
            monitor-exit(r1)
            if (r0 == 0) goto Ld2
            java.lang.String r0 = ""
            m5869(r0)
            java.lang.String r0 = "*"
            m5868(r0)
        Ld2:
            java.lang.String r0 = "r24d5e64064e1c279"
            boolean r1 = r3.f9925
            int r2 = r3.f9927
            int r4 = r3.f9928
            java.util.List r5 = r3.f9929
            int r5 = r5.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "已执行全量用户配置清除 success="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = ", prefs="
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = ", deleted="
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = ", failures="
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            r2 = 4
            r4 = 0
            p000.C0888ux.m5988(r0, r1, r4, r2, r4)
            return r3
        L10c:
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: δ */
    public static int m5884(android.content.Context r3, java.lang.String r4, java.util.ArrayList r5) {
            r3.getClass()
            java.io.File r0 = new java.io.File
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            java.lang.String r3 = r3.dataDir
            java.lang.String r1 = "shared_prefs"
            r0.<init>(r3, r1)
            java.io.File r3 = new java.io.File
            java.lang.String r1 = ".xml"
            java.lang.String r1 = r4.concat(r1)
            r3.<init>(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".xml.bak"
            java.lang.String r4 = r4.concat(r2)
            r1.<init>(r0, r4)
            java.io.File[] r3 = new java.io.File[]{r3, r1}
            java.util.List r3 = p000.AbstractC1021yh.m6897(r3)
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L33:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r3.next()
            java.io.File r0 = (java.io.File) r0
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L33
            boolean r1 = r0.delete()     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L4e
            int r4 = r4 + 1
            goto L33
        L4e:
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r2.<init>()     // Catch: java.lang.Throwable -> L67
            r2.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = ": delete=false"
            r2.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L67
            r5.add(r1)     // Catch: java.lang.Throwable -> L67
            goto L33
        L67:
            r1 = move-exception
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = r1.getMessage()
            if (r2 != 0) goto L7a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = r1.getName()
        L7a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r5.add(r0)
            goto L33
        L92:
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.LinkedHashSet m5885(android.content.Context r8) {
            r8.getClass()
            java.lang.String r0 = "dyhelper_spark_records"
            java.lang.String r1 = "dy_titlebar_hidden_buttons"
            java.lang.String r2 = "dyhelper_prefs"
            java.lang.String r3 = "dyhelper_prefs_meta"
            java.lang.String r4 = "dyhelper_beta"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.LinkedHashSet r0 = p000.g81.m2280(r0)
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()
            java.lang.String r8 = r8.dataDir
            java.lang.String r2 = "shared_prefs"
            r1.<init>(r8, r2)
            java.io.File[] r8 = r1.listFiles()     // Catch: java.lang.Throwable -> L27
            goto L2e
        L27:
            r8 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r8)
            r8 = r1
        L2e:
            boolean r1 = r8 instanceof p000.eo1
            r2 = 0
            if (r1 == 0) goto L34
            r8 = r2
        L34:
            java.io.File[] r8 = (java.io.File[]) r8
            if (r8 == 0) goto L70
            int r1 = r8.length
            r3 = 0
            r4 = r3
        L3b:
            if (r4 >= r1) goto L70
            r5 = r8[r4]
            java.lang.String r5 = r5.getName()
            r5.getClass()
            java.lang.String r6 = ".xml"
            boolean r7 = p000.x02.m6479(r5, r6, r3)
            if (r7 == 0) goto L53
            java.lang.String r5 = p000.q02.m4679(r5, r6)
            goto L61
        L53:
            java.lang.String r6 = ".xml.bak"
            boolean r7 = p000.x02.m6479(r5, r6, r3)
            if (r7 == 0) goto L60
            java.lang.String r5 = p000.q02.m4679(r5, r6)
            goto L61
        L60:
            r5 = r2
        L61:
            if (r5 != 0) goto L64
            goto L6d
        L64:
            boolean r6 = p000.ln0.m3608(r5)
            if (r6 == 0) goto L6d
            r0.add(r5)
        L6d:
            int r4 = r4 + 1
            goto L3b
        L70:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m5886() {
            java.lang.Object r0 = p000.ui1.f10844
            monitor-enter(r0)
            android.content.Context r1 = p000.ui1.f10845     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto Lae
            java.util.LinkedHashSet r2 = m5885(r1)     // Catch: java.lang.Throwable -> L5b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5b
        L14:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L61
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5b
            android.content.SharedPreferences r5 = m5870(r1, r4)     // Catch: java.lang.Throwable -> L5b
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r6.<init>()     // Catch: java.lang.Throwable -> L5b
            java.util.Map r5 = r5.getAll()     // Catch: java.lang.Throwable -> L5b
            r5.getClass()     // Catch: java.lang.Throwable -> L5b
            java.util.TreeMap r7 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L5b
            java.util.Set r5 = r7.entrySet()     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5b
        L3d:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L5d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L5b
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L5b
            org.json.JSONObject r7 = p000.v71.m6035(r7)     // Catch: java.lang.Throwable -> L5b
            r6.put(r8, r7)     // Catch: java.lang.Throwable -> L5b
            goto L3d
        L5b:
            r1 = move-exception
            goto Lb6
        L5d:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L5b
            goto L14
        L61:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "format"
            java.lang.String r4 = "dyhelper_user_prefs"
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "format_version"
            r4 = 1
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "exported_at"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "current_uid"
            java.lang.String r4 = m5890()     // Catch: java.lang.Throwable -> L5b
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "current_profile"
            java.lang.String r4 = m5890()     // Catch: java.lang.Throwable -> L5b
            boolean r4 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L94
            java.lang.String r4 = "dyhelper_prefs"
            goto L9c
        L94:
            java.lang.String r4 = m5890()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = m5881(r4)     // Catch: java.lang.Throwable -> L5b
        L9c:
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "prefs"
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L5b
            r2 = 2
            java.lang.String r1 = r1.toString(r2)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            r1.getClass()
            return r1
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "PrefsManager 未初始化"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        Lb6:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: η */
    public static boolean m5887(java.lang.String r2, boolean r3) {
            r2.getClass()
            java.lang.String r0 = "info_bar_enabled"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L24
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.getBoolean(r2, r3)     // Catch: java.lang.Throwable -> L2d
            android.content.SharedPreferences r1 = p000.ui1.f10846     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L1b
            boolean r3 = r1.getBoolean(r2, r3)     // Catch: java.lang.Throwable -> L2d
        L1b:
            if (r0 != 0) goto L22
            if (r3 == 0) goto L20
            goto L22
        L20:
            r2 = 0
            return r2
        L22:
            r2 = 1
            return r2
        L24:
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r0.getBoolean(r2, r3)     // Catch: java.lang.Throwable -> L2d
            return r2
        L2d:
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public static float m5888(java.lang.String r2) {
            java.lang.String r0 = "comment_control_"
            java.lang.String r1 = "_alpha"
            java.lang.String r2 = p000.lz1.m3674(r0, r2, r1)
            r0 = 100
            android.content.SharedPreferences r1 = m5892()     // Catch: java.lang.Throwable -> L13
            int r2 = r1.getInt(r2, r0)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r2 = r0
        L14:
            r1 = 0
            int r2 = p000.j81.m2906(r2, r1, r0)
            float r2 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.String m5889(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "comment_control_"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "_color"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "#FFFFFFFF"
            java.lang.String r2 = m5893(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.String m5890() {
            java.lang.String r0 = p000.ui1.f10849
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto La
            java.lang.String r0 = p000.ui1.f10850
        La:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static float m5891(java.lang.String r1, float r2) {
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> L9
            float r1 = r0.getFloat(r1, r2)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            return r2
    }

    /* JADX INFO: renamed from: μ */
    public static android.content.SharedPreferences m5892() {
            android.content.SharedPreferences r0 = p000.ui1.f10847
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = p000.ui1.f10850
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L1b
            android.content.Context r1 = p000.ui1.f10845
            if (r1 == 0) goto L1b
            java.lang.String r1 = "lazy-prefs"
            m5879(r0, r1)
            android.content.SharedPreferences r0 = p000.ui1.f10847
            if (r0 == 0) goto L1b
            return r0
        L1b:
            android.content.SharedPreferences r0 = p000.ui1.f10846
            if (r0 == 0) goto L20
            return r0
        L20:
            java.lang.String r0 = "r31210fee90a2f55c"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.String m5893(java.lang.String r1, java.lang.String r2) {
            r1.getClass()
            android.content.SharedPreferences r0 = m5892()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto Le
            goto Lf
        Le:
            return r1
        Lf:
            return r2
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m5894() {
            java.lang.String r5 = "collect"
            java.lang.String r6 = "share"
            java.lang.String r0 = "avatar"
            java.lang.String r1 = "follow"
            java.lang.String r2 = "color_ring"
            java.lang.String r3 = "digg"
            java.lang.String r4 = "comment"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1d
            goto L35
        L1d:
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = m5904(r1)
            if (r1 == 0) goto L21
            r0 = 1
            return r0
        L35:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static p000.ti1 m5895(java.lang.String r14) {
            java.lang.String r0 = "配置文件不是有效 JSON: "
            java.lang.Object r1 = p000.ui1.f10844
            monitor-enter(r1)
            android.content.Context r2 = p000.ui1.f10845     // Catch: java.lang.Throwable -> L18
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L1b
            ti1 r14 = new ti1     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "PrefsManager 未初始化"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)     // Catch: java.lang.Throwable -> L18
            r14.<init>(r4, r4, r4, r0)     // Catch: java.lang.Throwable -> L18
            goto L209
        L18:
            r14 = move-exception
            goto L251
        L1b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r5.<init>(r14)     // Catch: java.lang.Throwable -> L21
            goto L27
        L21:
            r14 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L18
            r5.<init>(r14)     // Catch: java.lang.Throwable -> L18
        L27:
            java.lang.Throwable r14 = p000.fo1.m2190(r5)     // Catch: java.lang.Throwable -> L18
            if (r14 != 0) goto L1ed
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch: java.lang.Throwable -> L18
            java.lang.String r14 = "format"
            java.lang.String r14 = r5.optString(r14)     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "dyhelper_user_prefs"
            boolean r14 = p000.ln0.m3626(r14, r0)     // Catch: java.lang.Throwable -> L18
            if (r14 != 0) goto L4a
            ti1 r14 = new ti1     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "配置文件格式不匹配"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)     // Catch: java.lang.Throwable -> L18
            r14.<init>(r4, r4, r4, r0)     // Catch: java.lang.Throwable -> L18
            goto L209
        L4a:
            java.lang.String r14 = "prefs"
            org.json.JSONObject r14 = r5.optJSONObject(r14)     // Catch: java.lang.Throwable -> L18
            if (r14 != 0) goto L5f
            ti1 r14 = new ti1     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "配置文件缺少 prefs 数据"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)     // Catch: java.lang.Throwable -> L18
            r14.<init>(r4, r4, r4, r0)     // Catch: java.lang.Throwable -> L18
            goto L209
        L5f:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            java.util.Iterator r5 = r14.keys()     // Catch: java.lang.Throwable -> L18
            r5.getClass()     // Catch: java.lang.Throwable -> L18
            ss1 r5 = p000.us1.m5951(r5)     // Catch: java.lang.Throwable -> L18
            java.util.List r5 = p000.us1.m5948(r5)     // Catch: java.lang.Throwable -> L18
            java.util.List r5 = p000.AbstractC0984xh.m6657(r5)     // Catch: java.lang.Throwable -> L18
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L18
            r6 = r4
        L7c:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r7 == 0) goto L188
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L18
            r7.getClass()     // Catch: java.lang.Throwable -> L18
            boolean r8 = p000.ln0.m3608(r7)     // Catch: java.lang.Throwable -> L18
            if (r8 != 0) goto La6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r8.<init>()     // Catch: java.lang.Throwable -> L18
            r8.append(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = ": 非 DYHelper 配置文件，已跳过"
            r8.append(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L18
            r0.add(r7)     // Catch: java.lang.Throwable -> L18
            goto L7c
        La6:
            org.json.JSONObject r8 = r14.optJSONObject(r7)     // Catch: java.lang.Throwable -> L18
            if (r8 != 0) goto Lc1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r8.<init>()     // Catch: java.lang.Throwable -> L18
            r8.append(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = ": entries 不是对象"
            r8.append(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L18
            r0.add(r7)     // Catch: java.lang.Throwable -> L18
            goto L7c
        Lc1:
            android.content.SharedPreferences r9 = m5870(r2, r7)     // Catch: java.lang.Throwable -> L113
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch: java.lang.Throwable -> L113
            android.content.SharedPreferences$Editor r9 = r9.clear()     // Catch: java.lang.Throwable -> L113
            java.util.Iterator r10 = r8.keys()     // Catch: java.lang.Throwable -> L113
            r10.getClass()     // Catch: java.lang.Throwable -> L113
            ss1 r10 = p000.us1.m5951(r10)     // Catch: java.lang.Throwable -> L113
            java.util.List r10 = p000.us1.m5948(r10)     // Catch: java.lang.Throwable -> L113
            java.util.List r10 = p000.AbstractC0984xh.m6657(r10)     // Catch: java.lang.Throwable -> L113
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L113
        Le4:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L113
            if (r11 == 0) goto L141
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L113
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L113
            org.json.JSONObject r12 = r8.optJSONObject(r11)     // Catch: java.lang.Throwable -> L113
            if (r12 != 0) goto L115
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L113
            r12.<init>()     // Catch: java.lang.Throwable -> L113
            r12.append(r7)     // Catch: java.lang.Throwable -> L113
            java.lang.String r13 = "/"
            r12.append(r13)     // Catch: java.lang.Throwable -> L113
            r12.append(r11)     // Catch: java.lang.Throwable -> L113
            java.lang.String r11 = ": value 不是对象"
            r12.append(r11)     // Catch: java.lang.Throwable -> L113
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L113
            r0.add(r11)     // Catch: java.lang.Throwable -> L113
            goto Le4
        L113:
            r8 = move-exception
            goto L161
        L115:
            r9.getClass()     // Catch: java.lang.Throwable -> L113
            r11.getClass()     // Catch: java.lang.Throwable -> L113
            boolean r12 = p000.v71.m6044(r9, r11, r12)     // Catch: java.lang.Throwable -> L113
            if (r12 == 0) goto L124
            int r6 = r6 + 1
            goto Le4
        L124:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L113
            r12.<init>()     // Catch: java.lang.Throwable -> L113
            r12.append(r7)     // Catch: java.lang.Throwable -> L113
            java.lang.String r13 = "/"
            r12.append(r13)     // Catch: java.lang.Throwable -> L113
            r12.append(r11)     // Catch: java.lang.Throwable -> L113
            java.lang.String r11 = ": 不支持的值类型"
            r12.append(r11)     // Catch: java.lang.Throwable -> L113
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L113
            r0.add(r11)     // Catch: java.lang.Throwable -> L113
            goto Le4
        L141:
            boolean r8 = r9.commit()     // Catch: java.lang.Throwable -> L113
            if (r8 == 0) goto L14b
            int r4 = r4 + 1
            goto L7c
        L14b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L113
            r8.<init>()     // Catch: java.lang.Throwable -> L113
            r8.append(r7)     // Catch: java.lang.Throwable -> L113
            java.lang.String r9 = ": commit=false"
            r8.append(r9)     // Catch: java.lang.Throwable -> L113
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L113
            r0.add(r8)     // Catch: java.lang.Throwable -> L113
            goto L7c
        L161:
            java.lang.String r9 = r8.getMessage()     // Catch: java.lang.Throwable -> L18
            if (r9 != 0) goto L16f
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> L18
        L16f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r8.<init>()     // Catch: java.lang.Throwable -> L18
            r8.append(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = ": "
            r8.append(r7)     // Catch: java.lang.Throwable -> L18
            r8.append(r9)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L18
            r0.add(r7)     // Catch: java.lang.Throwable -> L18
            goto L7c
        L188:
            java.lang.String r14 = "dyhelper_prefs"
            android.content.SharedPreferences r14 = m5870(r2, r14)     // Catch: java.lang.Throwable -> L18
            p000.ui1.f10846 = r14     // Catch: java.lang.Throwable -> L18
            java.lang.String r14 = "dyhelper_prefs_meta"
            android.content.SharedPreferences r14 = m5870(r2, r14)     // Catch: java.lang.Throwable -> L18
            p000.ui1.f10848 = r14     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences r14 = p000.ui1.f10846     // Catch: java.lang.Throwable -> L18
            p000.ui1.f10847 = r14     // Catch: java.lang.Throwable -> L18
            java.lang.String r14 = ""
            p000.ui1.f10849 = r14     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences r14 = p000.ui1.f10848     // Catch: java.lang.Throwable -> L18
            if (r14 == 0) goto L1b7
            java.lang.String r2 = "last_uid"
            java.lang.String r5 = ""
            java.lang.String r14 = r14.getString(r2, r5)     // Catch: java.lang.Throwable -> L18
            if (r14 == 0) goto L1b7
            java.lang.CharSequence r14 = p000.q02.m4660(r14)     // Catch: java.lang.Throwable -> L18
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L18
            goto L1b8
        L1b7:
            r14 = r3
        L1b8:
            if (r14 != 0) goto L1bc
            java.lang.String r14 = ""
        L1bc:
            p000.ui1.f10850 = r14     // Catch: java.lang.Throwable -> L18
            java.lang.String r14 = p000.ui1.f10850     // Catch: java.lang.Throwable -> L18
            boolean r2 = p000.q02.m4671(r14)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L1cf
            java.lang.String r2 = "0"
            boolean r2 = r14.equals(r2)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L1cf
            goto L1d0
        L1cf:
            r14 = r3
        L1d0:
            if (r14 == 0) goto L1d7
            java.lang.String r2 = "import-user-prefs"
            m5880(r14, r2)     // Catch: java.lang.Throwable -> L18
        L1d7:
            long r7 = p000.ui1.f10851     // Catch: java.lang.Throwable -> L18
            r9 = 1
            long r7 = r7 + r9
            p000.ui1.f10851 = r7     // Catch: java.lang.Throwable -> L18
            ti1 r14 = new ti1     // Catch: java.lang.Throwable -> L18
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)     // Catch: java.lang.Throwable -> L18
            r14.<init>(r2, r4, r6, r0)     // Catch: java.lang.Throwable -> L18
            r4 = 1
            goto L209
        L1ed:
            ti1 r2 = new ti1     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = r14.getMessage()     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L1fd
            java.lang.Class r14 = r14.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = r14.getName()     // Catch: java.lang.Throwable -> L18
        L1fd:
            java.lang.String r14 = r0.concat(r5)     // Catch: java.lang.Throwable -> L18
            java.util.List r14 = p000.AbstractC1021yh.m6896(r14)     // Catch: java.lang.Throwable -> L18
            r2.<init>(r4, r4, r4, r14)     // Catch: java.lang.Throwable -> L18
            r14 = r2
        L209:
            monitor-exit(r1)
            if (r4 == 0) goto L218
            java.lang.String r0 = m5890()
            m5869(r0)
            java.lang.String r0 = "*"
            m5868(r0)
        L218:
            java.lang.String r0 = "r24d5e64064e1c279"
            boolean r1 = r14.f10391
            int r2 = r14.f10392
            int r4 = r14.f10393
            java.util.List r5 = r14.f10394
            int r5 = r5.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "已导入用户配置 success="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = ", prefs="
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = ", keys="
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = ", failures="
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            r2 = 4
            p000.C0888ux.m5988(r0, r1, r3, r2, r3)
            return r14
        L251:
            monitor-exit(r1)
            throw r14
    }

    /* JADX INFO: renamed from: π */
    public static void m5896(android.content.Context r2) {
            r2.getClass()
            java.lang.String r0 = r2.getPackageName()
            java.lang.String r1 = "com.example.dyhelper"
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L13
            m5897(r2)
            return
        L13:
            java.lang.String r0 = "宿主进程"
            m5898(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ρ */
    public static void m5897(android.content.Context r4) {
            r4.getClass()
            java.lang.String r0 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L17
            r1 = 2
            android.content.Context r0 = r4.createPackageContext(r0, r1)     // Catch: java.lang.Throwable -> L17
            r0.getClass()     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "模块进程 -> 宿主目录"
            m5898(r0, r1)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "宿主偏好初始化失败，回退模块目录: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            r1 = 4
            java.lang.String r2 = "r24d5e64064e1c279"
            r3 = 0
            p000.C0888ux.m5988(r2, r0, r3, r1, r3)
            java.lang.String r0 = "模块目录回退"
            m5898(r4, r0)
            return
    }

    /* JADX INFO: renamed from: σ */
    public static void m5898(android.content.Context r11, java.lang.String r12) {
            java.lang.String r0 = "init:"
            java.lang.String r1 = "SharedPreferences 初始化成功("
            java.lang.String r2 = ""
            java.lang.Object r3 = p000.ui1.f10844
            monitor-enter(r3)
            android.content.Context r4 = r11.getApplicationContext()     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L10
            goto L11
        L10:
            r11 = r4
        L11:
            android.content.Context r4 = p000.ui1.f10845     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            if (r4 == 0) goto L33
            java.lang.String r6 = r4.getPackageName()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = p000.jf0.m2957(r5)     // Catch: java.lang.Throwable -> L3e
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L3e
            if (r6 != 0) goto Lb3
            java.lang.String r6 = r11.getPackageName()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = p000.jf0.m2957(r5)     // Catch: java.lang.Throwable -> L3e
            boolean r5 = p000.ln0.m3626(r6, r5)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto Lb3
        L33:
            java.lang.String r5 = p000.ui1.f10849     // Catch: java.lang.Throwable -> L3e
            boolean r6 = p000.q02.m4671(r5)     // Catch: java.lang.Throwable -> L3e
            if (r6 == 0) goto L41
            java.lang.String r5 = p000.ui1.f10850     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r11 = move-exception
            goto Lec
        L41:
            boolean r6 = p000.q02.m4671(r5)     // Catch: java.lang.Throwable -> L3e
            r7 = 0
            if (r6 == 0) goto L5a
            android.content.SharedPreferences r5 = p000.ui1.f10848     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L55
            java.lang.String r6 = "last_uid"
            java.lang.String r8 = ""
            java.lang.String r5 = r5.getString(r6, r8)     // Catch: java.lang.Throwable -> L3e
            goto L56
        L55:
            r5 = r7
        L56:
            if (r5 != 0) goto L5a
            java.lang.String r5 = ""
        L5a:
            java.lang.CharSequence r5 = p000.q02.m4660(r5)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            r6 = 1
            r8 = 0
            if (r4 != 0) goto L71
            android.content.SharedPreferences r9 = p000.ui1.f10846     // Catch: java.lang.Throwable -> L3e
            if (r9 != 0) goto L71
            android.content.SharedPreferences r9 = p000.ui1.f10847     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L6f
            goto L71
        L6f:
            r9 = r8
            goto L72
        L71:
            r9 = r6
        L72:
            p000.ui1.f10845 = r11     // Catch: java.lang.Throwable -> L3e
            java.lang.String r10 = "dyhelper_prefs"
            android.content.SharedPreferences r10 = m5870(r11, r10)     // Catch: java.lang.Throwable -> L3e
            p000.ui1.f10846 = r10     // Catch: java.lang.Throwable -> L3e
            java.lang.String r10 = "dyhelper_prefs_meta"
            android.content.SharedPreferences r11 = m5870(r11, r10)     // Catch: java.lang.Throwable -> L3e
            p000.ui1.f10848 = r11     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L8e
            p000.ui1.f10847 = r7     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = ""
            p000.ui1.f10849 = r11     // Catch: java.lang.Throwable -> L3e
            p000.ui1.f10850 = r5     // Catch: java.lang.Throwable -> L3e
        L8e:
            android.content.SharedPreferences r11 = p000.ui1.f10846     // Catch: java.lang.Throwable -> L3e
            m5877(r11)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = "r24d5e64064e1c279"
            if (r9 == 0) goto L9a
            if (r4 == 0) goto L9a
            goto L9b
        L9a:
            r6 = r8
        L9b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            r4.append(r12)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "), replaced="
            r4.append(r1)     // Catch: java.lang.Throwable -> L3e
            r4.append(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            r4 = 4
            p000.C0888ux.m5988(r11, r1, r7, r4, r7)     // Catch: java.lang.Throwable -> L3e
        Lb3:
            java.lang.String r11 = p000.ui1.f10850     // Catch: java.lang.Throwable -> L3e
            boolean r1 = p000.q02.m4671(r11)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto Lcb
            android.content.SharedPreferences r11 = p000.ui1.f10848     // Catch: java.lang.Throwable -> L3e
            if (r11 == 0) goto Lc9
            java.lang.String r1 = "last_uid"
            java.lang.String r4 = ""
            java.lang.String r11 = r11.getString(r1, r4)     // Catch: java.lang.Throwable -> L3e
            if (r11 != 0) goto Lcb
        Lc9:
            java.lang.String r11 = ""
        Lcb:
            java.lang.CharSequence r11 = p000.q02.m4660(r11)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L3e
            boolean r1 = p000.q02.m4671(r11)     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto Le1
            java.lang.String r12 = r0.concat(r12)     // Catch: java.lang.Throwable -> L3e
            m5880(r11, r12)     // Catch: java.lang.Throwable -> L3e
            r2 = r11
        Le1:
            monitor-exit(r3)
            boolean r11 = p000.q02.m4671(r2)
            if (r11 != 0) goto Leb
            m5869(r2)
        Leb:
            return
        Lec:
            monitor-exit(r3)
            throw r11
    }

    /* JADX INFO: renamed from: τ */
    public static boolean m5899() {
            java.lang.String r0 = "clean_progress_bar_enabled"
            r1 = 0
            boolean r0 = m5887(r0, r1)
            if (r0 != 0) goto La
            goto L1c
        La:
            java.lang.String r0 = "clean_progress_bar_only_in_clean_mode"
            r2 = 1
            boolean r0 = m5887(r0, r2)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "clean_mode_enabled"
            boolean r0 = m5887(r0, r1)
            if (r0 == 0) goto L1c
            goto L1d
        L1c:
            return r1
        L1d:
            return r2
    }

    /* JADX INFO: renamed from: υ */
    public static boolean m5900(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "comment_control_"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "_color_enabled"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 0
            boolean r2 = m5887(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: φ */
    public static boolean m5901() {
            java.lang.String r0 = "comment_control_custom_enabled"
            r1 = 0
            boolean r0 = m5887(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public static boolean m5902(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "comment_control_"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "_visible"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 1
            boolean r2 = m5887(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ψ */
    public static boolean m5903() {
            java.lang.String r0 = "feed_follow_confirm_enabled"
            r1 = 0
            boolean r0 = m5887(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ω */
    public static boolean m5904(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "feed_right_control_hide_"
            java.lang.String r1 = r0.concat(r1)
            r0 = 0
            boolean r1 = m5887(r1, r0)
            return r1
    }
}
