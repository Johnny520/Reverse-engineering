package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1737 {
    public C1737() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m8249(android.view.ViewGroup.LayoutParams r7, java.lang.String r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ") "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = "  "
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " >>>>>>>>>>>>>>>>>>. dump "
            r2.append(r3)
            r2.append(r0)
            r2.append(r8)
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.getName()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.println(r8)
            java.lang.Class r8 = r7.getClass()
            java.lang.reflect.Field[] r8 = r8.getFields()
            r1 = 0
        L67:
            int r2 = r8.length
            if (r1 >= r2) goto Lae
            r2 = r8[r1]
            java.lang.Object r3 = r2.get(r7)     // Catch: java.lang.IllegalAccessException -> Lab
            java.lang.String r2 = r2.getName()     // Catch: java.lang.IllegalAccessException -> Lab
            java.lang.String r4 = "To"
            boolean r4 = r2.contains(r4)     // Catch: java.lang.IllegalAccessException -> Lab
            if (r4 != 0) goto L7d
            goto Lab
        L7d:
            java.lang.String r4 = r3.toString()     // Catch: java.lang.IllegalAccessException -> Lab
            java.lang.String r5 = "-1"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.IllegalAccessException -> Lab
            if (r4 == 0) goto L8a
            goto Lab
        L8a:
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> Lab
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Lab
            r5.<init>()     // Catch: java.lang.IllegalAccessException -> Lab
            r5.append(r0)     // Catch: java.lang.IllegalAccessException -> Lab
            java.lang.String r6 = "       "
            r5.append(r6)     // Catch: java.lang.IllegalAccessException -> Lab
            r5.append(r2)     // Catch: java.lang.IllegalAccessException -> Lab
            java.lang.String r2 = " "
            r5.append(r2)     // Catch: java.lang.IllegalAccessException -> Lab
            r5.append(r3)     // Catch: java.lang.IllegalAccessException -> Lab
            java.lang.String r2 = r5.toString()     // Catch: java.lang.IllegalAccessException -> Lab
            r4.println(r2)     // Catch: java.lang.IllegalAccessException -> Lab
        Lab:
            int r1 = r1 + 1
            goto L67
        Lae:
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = " <<<<<<<<<<<<<<<<< dump "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.println(r8)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m8250(android.view.ViewGroup r11, java.lang.String r12) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ") "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = "  "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r1 = r11.getChildCount()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            java.lang.String r12 = " children "
            r3.append(r12)
            r3.append(r1)
            java.lang.String r12 = r3.toString()
            r2.println(r12)
            r12 = 0
            r2 = r12
        L59:
            if (r2 >= r1) goto Ld7
            android.view.View r3 = r11.getChildAt(r2)
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r6 = "     "
            r5.append(r6)
            java.lang.String r6 = m8259(r3)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.println(r5)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            java.lang.Class r4 = r3.getClass()
            java.lang.reflect.Field[] r4 = r4.getFields()
            r5 = r12
        L89:
            int r6 = r4.length
            if (r5 >= r6) goto Ld4
            r6 = r4[r5]
            java.lang.Object r7 = r6.get(r3)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r8 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r9 = "To"
            boolean r8 = r8.contains(r9)     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 != 0) goto L9f
            goto Ld1
        L9f:
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r9 = "-1"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 == 0) goto Lac
            goto Ld1
        Lac:
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Ld1
            r9.<init>()     // Catch: java.lang.IllegalAccessException -> Ld1
            r9.append(r0)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r10 = "       "
            r9.append(r10)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r6 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Ld1
            r9.append(r6)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r6 = " "
            r9.append(r6)     // Catch: java.lang.IllegalAccessException -> Ld1
            r9.append(r7)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r6 = r9.toString()     // Catch: java.lang.IllegalAccessException -> Ld1
            r8.println(r6)     // Catch: java.lang.IllegalAccessException -> Ld1
        Ld1:
            int r5 = r5 + 1
            goto L89
        Ld4:
            int r2 = r2 + 1
            goto L59
        Ld7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m8251(java.lang.Object r11) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Class r1 = r11.getClass()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = "------------- "
            r3.append(r4)
            java.lang.String r5 = r1.getName()
            r3.append(r5)
            java.lang.String r5 = " --------------------"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            java.lang.reflect.Field[] r2 = r1.getFields()
            r3 = 0
        L5d:
            int r6 = r2.length
            if (r3 >= r6) goto Le0
            r6 = r2[r3]
            java.lang.Object r7 = r6.get(r11)     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r8 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r9 = "layout_constraint"
            boolean r8 = r8.startsWith(r9)     // Catch: java.lang.IllegalAccessException -> Ldc
            if (r8 != 0) goto L73
            goto Ldc
        L73:
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.IllegalAccessException -> Ldc
            if (r8 == 0) goto L84
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r9 = "-1"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ldc
            if (r8 == 0) goto L84
            goto Ldc
        L84:
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.IllegalAccessException -> Ldc
            if (r8 == 0) goto L95
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r9 = "0"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ldc
            if (r8 == 0) goto L95
            goto Ldc
        L95:
            boolean r8 = r7 instanceof java.lang.Float     // Catch: java.lang.IllegalAccessException -> Ldc
            if (r8 == 0) goto La6
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r9 = "1.0"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ldc
            if (r8 == 0) goto La6
            goto Ldc
        La6:
            boolean r8 = r7 instanceof java.lang.Float     // Catch: java.lang.IllegalAccessException -> Ldc
            if (r8 == 0) goto Lb7
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r9 = "0.5"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ldc
            if (r8 == 0) goto Lb7
            goto Ldc
        Lb7:
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Ldc
            r9.<init>()     // Catch: java.lang.IllegalAccessException -> Ldc
            r9.append(r0)     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r10 = "    "
            r9.append(r10)     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r6 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Ldc
            r9.append(r6)     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r6 = " "
            r9.append(r6)     // Catch: java.lang.IllegalAccessException -> Ldc
            r9.append(r7)     // Catch: java.lang.IllegalAccessException -> Ldc
            java.lang.String r6 = r9.toString()     // Catch: java.lang.IllegalAccessException -> Ldc
            r8.println(r6)     // Catch: java.lang.IllegalAccessException -> Ldc
        Ldc:
            int r3 = r3 + 1
            goto L5d
        Le0:
            java.io.PrintStream r11 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r1.getSimpleName()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            r11.println(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m8252(android.view.MotionEvent r5) {
            int r5 = r5.getAction()
            java.lang.Class<android.view.MotionEvent> r0 = android.view.MotionEvent.class
            java.lang.reflect.Field[] r0 = r0.getFields()
            r1 = 0
        Lb:
            int r2 = r0.length
            if (r1 >= r2) goto L35
            r2 = r0[r1]
            int r3 = r2.getModifiers()     // Catch: java.lang.IllegalAccessException -> L32
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L32
            java.lang.Class r3 = r2.getType()     // Catch: java.lang.IllegalAccessException -> L32
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.IllegalAccessException -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L32
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 != r5) goto L32
            java.lang.String r5 = r2.getName()     // Catch: java.lang.IllegalAccessException -> L32
            return r5
        L32:
            int r1 = r1 + 1
            goto Lb
        L35:
            java.lang.String r5 = "---"
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m8253(int r2) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r2 = r2 + 2
            r2 = r0[r2]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".("
            r0.append(r1)
            java.lang.String r1 = r2.getFileName()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r2 = r2.getLineNumber()
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.String m8254() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r2 = r0.getLineNumber()
            r1.append(r2)
            java.lang.String r2 = ") "
            r1.append(r2)
            java.lang.String r0 = r0.getMethodName()
            r1.append(r0)
            java.lang.String r0 = "()"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.String m8255() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.String m8256() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 2
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m8257(android.content.Context r1, int r2) {
            r0 = -1
            if (r2 == r0) goto Lc
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = r1.getResourceEntryName(r2)     // Catch: java.lang.Exception -> Lf
            return r1
        Lc:
            java.lang.String r1 = "UNKNOWN"
            return r1
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "?"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static java.lang.String m8258(android.content.Context r5, int[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r0.<init>()     // Catch: java.lang.Exception -> L25
            int r1 = r6.length     // Catch: java.lang.Exception -> L25
            r0.append(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "["
            r0.append(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L25
            r1 = 0
        L13:
            int r2 = r6.length     // Catch: java.lang.Exception -> L25
            if (r1 >= r2) goto L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r2.<init>()     // Catch: java.lang.Exception -> L25
            r2.append(r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = " "
            if (r1 != 0) goto L27
            java.lang.String r3 = ""
            goto L28
        L25:
            r5 = move-exception
            goto L74
        L27:
            r3 = r0
        L28:
            r2.append(r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L25
            android.content.res.Resources r3 = r5.getResources()     // Catch: java.lang.Exception -> L25 android.content.res.Resources.NotFoundException -> L3a
            r4 = r6[r1]     // Catch: java.lang.Exception -> L25 android.content.res.Resources.NotFoundException -> L3a
            java.lang.String r0 = r3.getResourceEntryName(r4)     // Catch: java.lang.Exception -> L25 android.content.res.Resources.NotFoundException -> L3a
            goto L50
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r3.<init>()     // Catch: java.lang.Exception -> L25
            java.lang.String r4 = "? "
            r3.append(r4)     // Catch: java.lang.Exception -> L25
            r4 = r6[r1]     // Catch: java.lang.Exception -> L25
            r3.append(r4)     // Catch: java.lang.Exception -> L25
            r3.append(r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L25
        L50:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r3.<init>()     // Catch: java.lang.Exception -> L25
            r3.append(r2)     // Catch: java.lang.Exception -> L25
            r3.append(r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L25
            int r1 = r1 + 1
            goto L13
        L62:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r5.<init>()     // Catch: java.lang.Exception -> L25
            r5.append(r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r6 = "]"
            r5.append(r6)     // Catch: java.lang.Exception -> L25
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L25
            return r5
        L74:
            java.lang.String r6 = "DEBUG"
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r6, r5)
            java.lang.String r5 = "UNKNOWN"
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.lang.String m8259(android.view.View r1) {
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Exception -> L11
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L11
            int r1 = r1.getId()     // Catch: java.lang.Exception -> L11
            java.lang.String r1 = r0.getResourceEntryName(r1)     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            java.lang.String r1 = "UNKNOWN"
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.lang.String m8260(Yue.C4273 r1, int r2) {
            r0 = -1
            if (r2 != r0) goto L6
            java.lang.String r1 = "UNDEFINED"
            return r1
        L6:
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceEntryName(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m8261(java.lang.String r6, java.lang.String r7, int r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            int r8 = java.lang.Math.min(r8, r1)
            java.lang.String r1 = " "
            r3 = r1
        L13:
            if (r2 > r8) goto L74
            r4 = r0[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ".("
            r4.append(r5)
            r5 = r0[r2]
            java.lang.String r5 = r5.getFileName()
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            r5 = r0[r2]
            int r5 = r5.getLineNumber()
            r4.append(r5)
            java.lang.String r5 = ") "
            r4.append(r5)
            r5 = r0[r2]
            java.lang.String r5 = r5.getMethodName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r1)
            java.lang.String r3 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r3)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = r5.toString()
            android.util.Log.v(r6, r4)
            int r2 = r2 + 1
            goto L13
        L74:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m8262(java.lang.String r7, int r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            int r8 = java.lang.Math.min(r8, r1)
            java.lang.String r1 = " "
            r3 = r1
        L13:
            if (r2 > r8) goto L6d
            r4 = r0[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ".("
            r4.append(r5)
            r5 = r0[r2]
            java.lang.String r5 = r5.getFileName()
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            r5 = r0[r2]
            int r5 = r5.getLineNumber()
            r4.append(r5)
            java.lang.String r5 = ") "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r1)
            java.lang.String r3 = r5.toString()
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r3)
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
            r5.println(r4)
            int r2 = r2 + 1
            goto L13
        L6d:
            return
    }
}
