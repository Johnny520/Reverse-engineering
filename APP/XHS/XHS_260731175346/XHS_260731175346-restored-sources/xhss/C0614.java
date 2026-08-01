package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲈᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0614 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0547 f2109 = null;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static java.lang.reflect.Method f2110;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static java.lang.reflect.Method f2111;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0547 f2112 = null;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static java.lang.reflect.Method f2113;

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static boolean f2114;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static java.lang.Object f2115;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final xhss.C0924 f2116 = null;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static java.lang.reflect.Field f2117;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static java.lang.reflect.Method f2118;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static java.lang.Object f2119;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final xhss.C0924 f2120 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0547 f2121 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C0924 f2122 = null;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static java.lang.Object f2123;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static java.lang.Object f2124;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2125;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2126;

    static {
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "REMOVED_TASK"
            r2 = 2
            r0.<init>(r1, r2)
            xhss.C0614.f2109 = r0
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "CLOSED_EMPTY"
            r0.<init>(r1, r2)
            xhss.C0614.f2121 = r0
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "NO_THREAD_ELEMENTS"
            r0.<init>(r1, r2)
            xhss.C0614.f2112 = r0
            xhss.ᲁᛱᲀᛲ r0 = new xhss.ᲁᛱᲀᛲ
            r1 = 4
            r0.<init>(r1)
            xhss.C0614.f2122 = r0
            xhss.ᲁᛱᲀᛲ r0 = new xhss.ᲁᛱᲀᛲ
            r1 = 5
            r0.<init>(r1)
            xhss.C0614.f2120 = r0
            xhss.ᲁᛱᲀᛲ r0 = new xhss.ᲁᛱᲀᛲ
            r1 = 6
            r0.<init>(r1)
            xhss.C0614.f2116 = r0
            return
    }

    public /* synthetic */ C0614(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2126 = r1
            r0.f2125 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static final void m1058(java.lang.Object r1) {
            boolean r0 = r1 instanceof xhss.C1129
            if (r0 != 0) goto L5
            return
        L5:
            xhss.ᲈᛳᛱᲇ r1 = (xhss.C1129) r1
            java.lang.Throwable r1 = r1.f3646
            throw r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static java.util.ArrayList m1059(byte[] r3) {
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r0)
            r3.getInt()
            r3.getInt()
            int r1 = r3.getInt()
            byte[] r1 = new byte[r1]
            r3.get(r1)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r1)
            java.nio.ByteBuffer r3 = r3.order(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r3.getInt()
            int r2 = r3.position()
            int r2 = r2 + r1
            r3.position(r2)
            int r1 = r3.getInt()
            int r2 = r3.position()
            int r2 = r2 + r1
        L3b:
            int r1 = r3.position()
            if (r1 >= r2) goto L4e
            int r1 = r3.getInt()
            byte[] r1 = new byte[r1]
            r3.get(r1)
            r0.add(r1)
            goto L3b
        L4e:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L55
            return r0
        L55:
            java.lang.Exception r3 = new java.lang.Exception
            r0 = -34235646052421(0xffffe0dce47a77bb, double:NaN)
            java.lang.String r0 = "未找到证书"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static xhss.C0437 m1060(xhss.C0972 r26) {
            r0 = r26
            int r1 = r0.size()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L1a:
            if (r6 >= r1) goto L1b9
            java.lang.String r2 = xhss.AbstractC0694.m1204(r0, r6)
            r22 = 1
            java.lang.String r4 = xhss.AbstractC0694.m1219(r0, r6)
            java.lang.String r5 = "Cache-Control"
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L34
            if (r8 == 0) goto L32
        L30:
            r7 = 0
            goto L3d
        L32:
            r8 = r4
            goto L3d
        L34:
            java.lang.String r5 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L1ae
            goto L30
        L3d:
            r2 = 0
        L3e:
            int r5 = r4.length()
            if (r2 >= r5) goto L1ae
            int r5 = r4.length()
            r3 = r2
        L49:
            if (r3 >= r5) goto L61
            char r0 = r4.charAt(r3)
            r23 = r1
            java.lang.String r1 = "=,;"
            boolean r0 = xhss.AbstractC0120.m338(r1, r0)
            if (r0 == 0) goto L5a
            goto L67
        L5a:
            int r3 = r3 + 1
            r0 = r26
            r1 = r23
            goto L49
        L61:
            r23 = r1
            int r3 = r4.length()
        L67:
            java.lang.String r0 = r4.substring(r2, r3)
            java.lang.CharSequence r0 = xhss.AbstractC0120.m346(r0)
            java.lang.String r0 = r0.toString()
            int r1 = r4.length()
            if (r3 == r1) goto Lf6
            char r1 = r4.charAt(r3)
            r2 = 44
            if (r1 == r2) goto Lf6
            char r1 = r4.charAt(r3)
            r2 = 59
            if (r1 != r2) goto L8b
            goto Lf6
        L8b:
            int r3 = r3 + 1
            byte[] r1 = xhss.AbstractC0577.f2010
            int r1 = r4.length()
        L93:
            if (r3 >= r1) goto La5
            char r2 = r4.charAt(r3)
            r5 = 32
            if (r2 == r5) goto La2
            r5 = 9
            if (r2 == r5) goto La2
            goto La9
        La2:
            int r3 = r3 + 1
            goto L93
        La5:
            int r3 = r4.length()
        La9:
            int r1 = r4.length()
            if (r3 >= r1) goto Lc5
            char r1 = r4.charAt(r3)
            r2 = 34
            if (r1 != r2) goto Lc5
            int r3 = r3 + 1
            r1 = 4
            int r1 = xhss.AbstractC0120.m351(r4, r2, r3, r1)
            java.lang.String r2 = r4.substring(r3, r1)
            int r1 = r1 + 1
            goto Lfa
        Lc5:
            int r1 = r4.length()
            r2 = r3
        Lca:
            if (r2 >= r1) goto Le0
            char r5 = r4.charAt(r2)
            r24 = r1
            java.lang.String r1 = ",;"
            boolean r1 = xhss.AbstractC0120.m338(r1, r5)
            if (r1 == 0) goto Ldb
            goto Le4
        Ldb:
            int r2 = r2 + 1
            r1 = r24
            goto Lca
        Le0:
            int r2 = r4.length()
        Le4:
            java.lang.String r1 = r4.substring(r3, r2)
            java.lang.CharSequence r1 = xhss.AbstractC0120.m346(r1)
            java.lang.String r1 = r1.toString()
            r25 = r2
            r2 = r1
            r1 = r25
            goto Lfa
        Lf6:
            int r3 = r3 + 1
            r1 = r3
            r2 = 0
        Lfa:
            java.lang.String r3 = "no-cache"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L10b
            r0 = r26
            r2 = r1
            r9 = r22
        L107:
            r1 = r23
            goto L3e
        L10b:
            java.lang.String r3 = "no-store"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L119
            r0 = r26
            r2 = r1
            r10 = r22
            goto L107
        L119:
            java.lang.String r3 = "max-age"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L12a
            r3 = -1
            int r11 = xhss.AbstractC0577.m1042(r2, r3)
        L126:
            r0 = r26
            r2 = r1
            goto L107
        L12a:
            r3 = -1
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L138
            int r12 = xhss.AbstractC0577.m1042(r2, r3)
            goto L126
        L138:
            java.lang.String r3 = "private"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L146
            r0 = r26
            r2 = r1
            r13 = r22
            goto L107
        L146:
            java.lang.String r3 = "public"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L154
            r0 = r26
            r2 = r1
            r14 = r22
            goto L107
        L154:
            java.lang.String r3 = "must-revalidate"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L162
            r0 = r26
            r2 = r1
            r15 = r22
            goto L107
        L162:
            java.lang.String r3 = "max-stale"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L172
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r16 = xhss.AbstractC0577.m1042(r2, r0)
            goto L126
        L172:
            java.lang.String r3 = "min-fresh"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L180
            r3 = -1
            int r17 = xhss.AbstractC0577.m1042(r2, r3)
            goto L126
        L180:
            r3 = -1
            java.lang.String r2 = "only-if-cached"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L190
            r0 = r26
            r2 = r1
            r18 = r22
            goto L107
        L190:
            java.lang.String r2 = "no-transform"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L19f
            r0 = r26
            r2 = r1
            r19 = r22
            goto L107
        L19f:
            java.lang.String r2 = "immutable"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L126
            r0 = r26
            r2 = r1
            r20 = r22
            goto L107
        L1ae:
            r23 = r1
            r3 = -1
            int r6 = r6 + 1
            r0 = r26
            r1 = r23
            goto L1a
        L1b9:
            if (r7 != 0) goto L1be
            r21 = 0
            goto L1c0
        L1be:
            r21 = r8
        L1c0:
            xhss.ᛵᛱᛴᲁ r8 = new xhss.ᛵᛱᛴᲁ
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r8
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static void m1061(android.widget.TextView r2, int r3) {
            if (r3 < 0) goto L15
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L14
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L14:
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static void m1062(android.view.View r7, java.lang.String r8, int r9) {
            r0 = -245470727604293(0xffff20bee47a77bb, double:NaN)
        /* removed unused decoded string */ 
            if (r7 != 0) goto Lc
            goto L13a
        Lc:
            r0 = -245487907473477(0xffff20bae47a77bb, double:NaN)
            java.lang.String r0 = " "
            int r1 = r9 * 2
            java.lang.String r0 = xhss.AbstractC0226.m494(r0, r1)
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r7.getId()
            r3 = -1
            if (r2 == r3) goto Lb3
            android.content.res.Resources r2 = r7.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L99
            int r3 = r7.getId()     // Catch: android.content.res.Resources.NotFoundException -> L99
            java.lang.String r2 = r2.getResourceEntryName(r3)     // Catch: android.content.res.Resources.NotFoundException -> L99
            boolean r3 = r7 instanceof android.widget.TextView     // Catch: android.content.res.Resources.NotFoundException -> L99
            if (r3 == 0) goto L42
            r3 = r7
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: android.content.res.Resources.NotFoundException -> L99
            java.lang.CharSequence r3 = r3.getText()     // Catch: android.content.res.Resources.NotFoundException -> L99
            goto L4b
        L42:
            r3 = -245496497408069(0xffff20b8e47a77bb, double:NaN)
            java.lang.String r3 = ""     // Catch: android.content.res.Resources.NotFoundException -> L99
        L4b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L99
            r4.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5 = -245500792375365(0xffff20b7e47a77bb, double:NaN)
            java.lang.String r5 = "id="     // Catch: android.content.res.Resources.NotFoundException -> L99
            r4.append(r5)     // Catch: android.content.res.Resources.NotFoundException -> L99
            int r5 = r7.getId()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r4.append(r5)     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5 = -245517972244549(0xffff20b3e47a77bb, double:NaN)
            java.lang.String r5 = " name="     // Catch: android.content.res.Resources.NotFoundException -> L99
            r4.append(r5)     // Catch: android.content.res.Resources.NotFoundException -> L99
            r4.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5 = -245548037015621(0xffff20ace47a77bb, double:NaN)
            java.lang.String r2 = " desc="     // Catch: android.content.res.Resources.NotFoundException -> L99
            r4.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L99
            java.lang.CharSequence r2 = r7.getContentDescription()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r4.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5 = -245578101786693(0xffff20a5e47a77bb, double:NaN)
            java.lang.String r2 = " text="     // Catch: android.content.res.Resources.NotFoundException -> L99
            r4.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L99
            r4.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L99
            java.lang.String r2 = r4.toString()     // Catch: android.content.res.Resources.NotFoundException -> L99
            goto Lbc
        L99:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = -245608166557765(0xffff209ee47a77bb, double:NaN)
            java.lang.String r3 = "id="
            r2.<init>(r3)
            int r3 = r7.getId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto Lbc
        Lb3:
            r2 = -245625346426949(0xffff209ae47a77bb, double:NaN)
            java.lang.String r2 = "id=NO_ID"
        Lbc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -245664001132613(0xffff2091e47a77bb, double:NaN)
            java.lang.String r4 = "view "
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r1)
            r0 = -245689770936389(0xffff208be47a77bb, double:NaN)
            java.lang.String r0 = " ("
            r3.append(r0)
            r3.append(r2)
            r0 = 41
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = -278176903563333(0xffff02ffe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r1 = -278078119315525(0xffff0316e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            int r1 = r0.length()
            r2 = 0
            if (r1 != 0) goto L100
            goto L122
        L100:
            int r1 = r0.length()
            r3 = r2
        L105:
            if (r3 >= r1) goto L122
            int r4 = r3 + 2000
            if (r4 <= r1) goto L10c
            r4 = r1
        L10c:
            java.lang.String r3 = r0.substring(r3, r4)
            r5 = -278112479053893(0xffff030ee47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r5 = xhss.C1085.f3497
            r5.getClass()
            xhss.C1085.m1750(r3)
            r3 = r4
            goto L105
        L122:
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L13a
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r0 = r7.getChildCount()
        L12c:
            if (r2 >= r0) goto L13a
            android.view.View r1 = r7.getChildAt(r2)
            int r3 = r9 + 1
            m1062(r1, r8, r3)
            int r2 = r2 + 1
            goto L12c
        L13a:
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static long m1063(java.io.RandomAccessFile r4, long r5) {
            r0 = 32
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L6a
            r0 = 16
            long r0 = r5 - r0
            r4.seek(r0)
            r0 = 16
            byte[] r0 = new byte[r0]
            r4.readFully(r0)
            r1 = -33634350630981(0xffffe168e47a77bb, double:NaN)
            java.lang.String r1 = "APK Sig Block 42"
            java.nio.charset.Charset r2 = xhss.AbstractC0619.f2136
            byte[] r1 = r1.getBytes(r2)
            r2 = -33707365075013(0xffffe157e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L5b
            r0 = 24
            long r0 = r5 - r0
            r4.seek(r0)
            long r0 = m1068(r4)
            long r5 = r5 - r0
            r2 = 8
            long r5 = r5 - r2
            r4.seek(r5)
            long r2 = m1068(r4)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L4c
            return r5
        L4c:
            java.lang.Exception r4 = new java.lang.Exception
            r5 = -33883458734149(0xffffe12ee47a77bb, double:NaN)
            java.lang.String r5 = "apk signing block size mismatch"
            r4.<init>(r5)
            throw r4
        L5b:
            java.lang.Exception r4 = new java.lang.Exception
            r5 = -33767494617157(0xffffe149e47a77bb, double:NaN)
            java.lang.String r5 = "未找到APK Signing Block magic"
            r4.<init>(r5)
            throw r4
        L6a:
            java.lang.Exception r4 = new java.lang.Exception
            r5 = -33535566383173(0xffffe17fe47a77bb, double:NaN)
            java.lang.String r5 = "Central Directory偏移量太小"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static android.content.res.ColorStateList m1064(android.content.Context r8, int r9) {
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            xhss.ᛲᛲᛶᛳ r1 = new xhss.ᛲᛲᛶᛳ
            r1.<init>(r0, r8)
            java.lang.Object r2 = xhss.AbstractC0752.f2529
            monitor-enter(r2)
            java.util.WeakHashMap r3 = xhss.AbstractC0752.f2528     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            xhss.ᛲᛶᛵᲇ r5 = (xhss.C0175) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f696     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f697     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f697     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f698     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = xhss.AbstractC0752.f2530
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = xhss.AbstractC0815.m1377(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = xhss.AbstractC0752.f2529
            monitor-enter(r2)
            java.util.WeakHashMap r0 = xhss.AbstractC0752.f2528     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            xhss.ᛲᛶᛵᲇ r0 = new xhss.ᛲᛶᛵᲇ     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f594     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static final void m1065(xhss.InterfaceC0362 r2, java.lang.Object r3) {
            xhss.ᛶᛲᛷᛵ r0 = xhss.C0614.f2112
            if (r3 != r0) goto L5
            goto L13
        L5:
            boolean r0 = r3 instanceof xhss.C0947
            r1 = 0
            if (r0 == 0) goto L1b
            xhss.ᲁᛴᛷᛵ r3 = (xhss.C0947) r3
            xhss.ᛴᛴᛲᛵ[] r2 = r3.f3082
            int r0 = r2.length
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L14
        L13:
            return
        L14:
            r2 = r2[r0]
            java.lang.Object[] r2 = r3.f3083
            r2 = r2[r0]
            throw r1
        L1b:
            xhss.ᲁᛱᲀᛲ r3 = xhss.C0614.f2120
            java.lang.Object r2 = r2.mo598(r1, r3)
            r2.getClass()
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static android.view.View m1066(android.app.Activity r2, java.lang.String r3) {
            r0 = -246845117139013(0xffff1f7ee47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -246875181910085(0xffff1f77e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r0 = -246918131583045(0xffff1f6de47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᛶᛱᛳᲁ r0 = new xhss.ᛶᛱᛳᲁ
            r1 = 8
            r0.<init>(r3, r1)
            android.view.View r2 = m1067(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static native android.view.View m1067(android.view.View r0, xhss.C0535 r1);

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static long m1068(java.io.RandomAccessFile r2) {
            r0 = 8
            byte[] r0 = new byte[r0]
            r2.readFully(r0)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r0)
            long r0 = r2.getLong()
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final java.lang.Class m1069(xhss.C0078 r2) {
            xhss.ᛲᛵᲀᲈ r2 = (xhss.InterfaceC0162) r2
            java.lang.Class r2 = r2.mo236()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto Le
            goto L83
        Le:
            java.lang.String r0 = r2.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L7b;
                case 104431: goto L6f;
                case 3039496: goto L63;
                case 3052374: goto L57;
                case 3327612: goto L4b;
                case 3625364: goto L3f;
                case 64711720: goto L33;
                case 97526364: goto L27;
                case 109413500: goto L1b;
                default: goto L19;
            }
        L19:
            goto L83
        L1b:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L83
        L24:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L27:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L83
        L30:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L33:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            goto L83
        L3c:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L3f:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L83
        L48:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            return r2
        L4b:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L54
            goto L83
        L54:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L57:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L60
            goto L83
        L60:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            return r2
        L63:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6c
            goto L83
        L6c:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L6f:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L78
            goto L83
        L78:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L7b:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L84
        L83:
            return r2
        L84:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static android.view.View m1070(android.view.ViewGroup r5, xhss.InterfaceC0645 r6) {
            r0 = -244736288196677(0xffff2169e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -244766352967749(0xffff2162e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = 0
            int r1 = r5.getChildCount()
            xhss.ᛱᛲᲇᲀ r0 = xhss.AbstractC0473.m855(r0, r1)
            int r1 = r0.f3090
            int r0 = r0.f3091
            if (r1 > r0) goto L4a
        L1f:
            android.view.View r2 = r5.getChildAt(r1)
            r3 = -244809302640709(0xffff2158e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            java.lang.Object r3 = r6.mo112(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L38
            return r2
        L38:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L45
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = m1070(r2, r6)
            if (r2 == 0) goto L45
            return r2
        L45:
            if (r1 == r0) goto L4a
            int r1 = r1 + 1
            goto L1f
        L4a:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static android.view.View m1071(android.view.ViewGroup r4, java.lang.String r5) {
            r0 = -245427777931333(0xffff20c8e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            int r0 = r4.getChildCount()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L32
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L22
            return r2
        L22:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L2f
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = m1071(r2, r5)
            if (r2 == 0) goto L2f
            return r2
        L2f:
            int r1 = r1 + 1
            goto Ld
        L32:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public static final java.lang.Object m1072(xhss.InterfaceC0362 r1, java.lang.Object r2) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r2 != 0) goto Ld
            xhss.ᲁᛱᲀᛲ r2 = xhss.C0614.f2122
            java.lang.Object r2 = r1.mo598(r0, r2)
        Ld:
            if (r2 != r0) goto L12
            xhss.ᛶᛲᛷᛵ r1 = xhss.C0614.f2112
            return r1
        L12:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L28
            xhss.ᲁᛴᛷᛵ r0 = new xhss.ᲁᛴᛷᛵ
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            xhss.ᲁᛱᲀᛲ r2 = xhss.C0614.f2116
            java.lang.Object r1 = r1.mo598(r0, r2)
            return r1
        L28:
            r2.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static byte[] m1073(java.io.RandomAccessFile r10, long r11) {
            r10.seek(r11)
            long r11 = m1068(r10)
            r0 = 8
            long r11 = r11 - r0
            r2 = -34020897687621(0xffffe10ee47a77bb, double:NaN)
            java.lang.String r2 = "APK Sig Block 42"
            java.nio.charset.Charset r3 = xhss.AbstractC0619.f2136
            byte[] r2 = r2.getBytes(r3)
            r3 = -34093912131653(0xffffe0fde47a77bb, double:NaN)
        /* removed unused decoded string */ 
        L21:
            r3 = 24
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 <= 0) goto L86
            long r3 = r10.getFilePointer()
            r5 = 16
            byte[] r5 = new byte[r5]
            r10.readFully(r5)
            boolean r5 = java.util.Arrays.equals(r5, r2)
            if (r5 != 0) goto L86
            r10.seek(r3)
            long r3 = m1068(r10)
            r5 = 4
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L77
            int r7 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r7 > 0) goto L77
            r7 = 4
            byte[] r7 = new byte[r7]
            r10.readFully(r7)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r7 = r7.order(r8)
            int r7 = r7.getInt()
            long r5 = r3 - r5
            int r5 = (int) r5
            r6 = -262969152(0xfffffffff05368c0, float:-2.6171189E29)
            if (r7 != r6) goto L6b
            byte[] r11 = new byte[r5]
            r10.readFully(r11)
            return r11
        L6b:
            long r6 = r10.getFilePointer()
            long r8 = (long) r5
            long r6 = r6 + r8
            r10.seek(r6)
            long r3 = r3 + r0
            long r11 = r11 - r3
            goto L21
        L77:
            java.lang.Exception r10 = new java.lang.Exception
            r11 = -34154041673797(0xffffe0efe47a77bb, double:NaN)
            java.lang.String r11 = "无效的pair长度"
            r10.<init>(r11)
            throw r10
        L86:
            java.lang.Exception r10 = new java.lang.Exception
            r11 = -34196991346757(0xffffe0e5e47a77bb, double:NaN)
            java.lang.String r11 = "未找到v3签名块"
            r10.<init>(r11)
            throw r10
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static long m1074(java.io.RandomAccessFile r4) {
            long r0 = r4.length()
            r2 = 22
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L67
            r2 = 65557(0x10015, double:3.23895E-319)
            long r2 = java.lang.Math.min(r0, r2)
            long r0 = r0 - r2
            r4.seek(r0)
            int r0 = (int) r2
            byte[] r1 = new byte[r0]
            r4.readFully(r1)
            int r0 = r0 + (-22)
        L1d:
            r4 = -1
            if (r4 >= r0) goto L58
            r4 = r1[r0]
            r2 = 80
            if (r4 != r2) goto L55
            int r4 = r0 + 1
            r4 = r1[r4]
            r2 = 75
            if (r4 != r2) goto L55
            int r4 = r0 + 2
            r4 = r1[r4]
            r2 = 5
            if (r4 != r2) goto L55
            int r4 = r0 + 3
            r4 = r1[r4]
            r2 = 6
            if (r4 != r2) goto L55
            int r0 = r0 + 16
            r4 = 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r1, r0, r4)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r4 = r4.order(r0)
            int r4 = r4.getInt()
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
        L55:
            int r0 = r0 + (-1)
            goto L1d
        L58:
            java.lang.Exception r4 = new java.lang.Exception
            r0 = -33415307298885(0xffffe19be47a77bb, double:NaN)
            java.lang.String r0 = "未找到End of Central Directory"
            r4.<init>(r0)
            throw r4
        L67:
            java.lang.Exception r4 = new java.lang.Exception
            r0 = -33346587822149(0xffffe1abe47a77bb, double:NaN)
            java.lang.String r0 = "文件太小，不是有效的APK文件"
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static final java.lang.Class m1075(xhss.C0078 r1) {
            java.lang.Class r1 = r1.mo236()
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = r1.getName()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2056817302: goto L78;
                case -527879800: goto L6c;
                case -515992664: goto L60;
                case 155276373: goto L54;
                case 344809556: goto L48;
                case 398507100: goto L3c;
                case 398795216: goto L30;
                case 399092968: goto L24;
                case 761287205: goto L18;
                default: goto L16;
            }
        L16:
            goto L80
        L18:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L21
            goto L80
        L21:
            java.lang.Class r1 = java.lang.Double.TYPE
            return r1
        L24:
            java.lang.String r0 = "java.lang.Void"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
            goto L80
        L2d:
            java.lang.Class r1 = java.lang.Void.TYPE
            return r1
        L30:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L39
            goto L80
        L39:
            java.lang.Class r1 = java.lang.Long.TYPE
            return r1
        L3c:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L45
            goto L80
        L45:
            java.lang.Class r1 = java.lang.Byte.TYPE
            return r1
        L48:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L51
            goto L80
        L51:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            return r1
        L54:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5d
            goto L80
        L5d:
            java.lang.Class r1 = java.lang.Character.TYPE
            return r1
        L60:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L69
            goto L80
        L69:
            java.lang.Class r1 = java.lang.Short.TYPE
            return r1
        L6c:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L75
            goto L80
        L75:
            java.lang.Class r1 = java.lang.Float.TYPE
            return r1
        L78:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L82
        L80:
            r1 = 0
            return r1
        L82:
            java.lang.Class r1 = java.lang.Integer.TYPE
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static final void m1076(java.io.FileOutputStream r8, java.lang.String r9, java.nio.charset.Charset r10) {
            int r0 = r9.length()
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 >= r1) goto L10
            byte[] r9 = r9.getBytes(r10)
            r8.write(r9)
            return
        L10:
            java.nio.charset.CharsetEncoder r10 = r10.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r10 = r10.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r10 = r10.onUnmappableCharacter(r0)
            r0 = 8192(0x2000, float:1.148E-41)
            java.nio.CharBuffer r1 = java.nio.CharBuffer.allocate(r0)
            float r2 = r10.maxBytesPerChar()
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            int r0 = r0 * r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2 = 0
            r3 = r2
            r4 = r3
        L37:
            int r5 = r9.length()
            if (r3 >= r5) goto L94
            int r5 = 8192 - r4
            int r6 = r9.length()
            int r6 = r6 - r3
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r3 + r5
            char[] r7 = r1.array()
            r9.getChars(r3, r6, r7, r4)
            int r5 = r5 + r4
            r1.limit(r5)
            int r3 = r9.length()
            r4 = 1
            if (r6 != r3) goto L5e
            r3 = r4
            goto L5f
        L5e:
            r3 = r2
        L5f:
            java.nio.charset.CoderResult r3 = r10.encode(r1, r0, r3)
            boolean r3 = r3.isUnderflow()
            if (r3 == 0) goto L8f
            byte[] r3 = r0.array()
            int r5 = r0.position()
            r8.write(r3, r2, r5)
            int r3 = r1.position()
            int r5 = r1.limit()
            if (r3 == r5) goto L86
            char r3 = r1.get()
            r1.put(r2, r3)
            goto L87
        L86:
            r4 = r2
        L87:
            r1.clear()
            r0.clear()
            r3 = r6
            goto L37
        L8f:
            java.lang.String r8 = "Check failed."
            xhss.C0532.m950(r8)
        L94:
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final xhss.C0078 m1077(java.lang.annotation.Annotation r0) {
            java.lang.Class r0 = r0.annotationType()
            xhss.ᛱᛸᛷᛸ r0 = xhss.AbstractC0256.m565(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1078(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f2126
            r1 = 1677787152(0x64010010, float:9.518538E21)
            r2 = 300(0x12c, double:1.48E-321)
            r4 = 0
            java.lang.Object r6 = r11.f2125
            r7 = 2
            r8 = 0
            switch(r0) {
                case 0: goto Lf5;
                case 1: goto L8b;
                default: goto L10;
            }
        L10:
            xhss.ᛳᛴᛵ r12 = (xhss.C0259) r12
            xhss.ᲀᲀ r6 = (xhss.C0891) r6
            xhss.ᛳᛴᛵ r12 = r6.f2877
            android.app.Activity r0 = r12.m54()
            android.view.animation.Animation r0 = xhss.C0915.m1490(r0, r1)
            if (r0 != 0) goto L2f
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r6.f2872
            android.view.animation.Animation r1 = r1.getAnimation()
            if (r1 == 0) goto L2f
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r6.f2872
            android.view.animation.Animation r1 = r1.getAnimation()
            goto L30
        L2f:
            r1 = r0
        L30:
            if (r1 == 0) goto L3f
            long r9 = r1.getDuration()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L3b
            goto L3f
        L3b:
            long r2 = r1.getDuration()
        L3f:
            long r9 = r12.f85
            int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r12 < 0) goto L46
            r2 = r9
        L46:
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            r0.setInterpolator(r12)
            r0.setDuration(r2)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r12 = r6.f2872
            r12.startAnimation(r0)
            float[] r12 = new float[r7]
            r12 = {x0176: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofFloat(r12)
            r12.setDuration(r2)
            xhss.ᛳᲈᛶᛸ r0 = new xhss.ᛳᲈᛶᛸ
            r0.<init>(r11, r8)
            r12.addUpdateListener(r0)
            r12.start()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r11 = r6.f2871
            android.view.ViewPropertyAnimator r11 = r11.animate()
            android.view.ViewPropertyAnimator r11 = r11.setDuration(r2)
            r12 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r11 = r11.alpha(r12)
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            android.view.ViewPropertyAnimator r11 = r11.setInterpolator(r12)
            r12 = 0
            r11.setListener(r12)
            return
        L8b:
            xhss.ᛱᛴᛳᛴ r12 = (xhss.C0036) r12
            xhss.ᲁᛳᛵᛷ r6 = (xhss.C0935) r6
            xhss.ᛱᛴᛳᛴ r12 = r6.f3025
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r6.f3023
            xhss.ᛶᛵᲇᛸ r6 = r12.f95
            r6.getClass()
            xhss.ᛶᛵᲇᛸ r6 = r12.f95
            r6.getClass()
            xhss.ᛱᛴᛳᛴ r6 = r12.f225
            android.content.Context r6 = r6.f87
            if (r6 != 0) goto La7
            android.app.Activity r6 = r12.m54()
        La7:
            android.view.animation.Animation r1 = xhss.C0915.m1490(r6, r1)
            if (r1 != 0) goto Lb8
            android.view.animation.Animation r6 = r0.getAnimation()
            if (r6 == 0) goto Lb8
            android.view.animation.Animation r6 = r0.getAnimation()
            goto Lb9
        Lb8:
            r6 = r1
        Lb9:
            if (r6 == 0) goto Lc8
            long r9 = r6.getDuration()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto Lc4
            goto Lc8
        Lc4:
            long r2 = r6.getDuration()
        Lc8:
            long r9 = r12.f85
            int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r12 < 0) goto Lcf
            r2 = r9
        Lcf:
            r1.setDuration(r2)
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            r1.setInterpolator(r12)
            r0.startAnimation(r1)
            float[] r12 = new float[r7]
            r12 = {x017e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofFloat(r12)
            r12.setDuration(r2)
            xhss.ᛶᛷᛳᛸ r0 = new xhss.ᛶᛷᛳᛸ
            r0.<init>(r11, r8)
            r12.addUpdateListener(r0)
            r12.start()
            return
        Lf5:
            xhss.ᛵᲇᲀᛳ r12 = (xhss.C0523) r12
            xhss.ᛲᛵᛶᲁ r6 = (xhss.C0158) r6
            xhss.ᛵᲇᲀᛳ r0 = r6.f654
            long r9 = r0.f85
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 < 0) goto L102
            r2 = r9
        L102:
            android.widget.RelativeLayout r1 = r6.f640
            boolean r12 = r12.m934()
            if (r12 == 0) goto L10b
            goto L10e
        L10b:
            r1.setPadding(r8, r8, r8, r8)
        L10e:
            android.widget.FrameLayout r12 = r0.m57()
            if (r12 != 0) goto L120
            android.content.res.Resources r12 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.heightPixels
        L11e:
            float r12 = (float) r12
            goto L129
        L120:
            android.widget.FrameLayout r12 = r0.m57()
            int r12 = r12.getMeasuredHeight()
            goto L11e
        L129:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r6.f638
            android.graphics.Rect r0 = r0.getUnsafePlace()
            int r0 = r0.top
            float r0 = (float) r0
            r4 = 0
            float r0 = r0 + r4
            r6.f639 = r0
            float[] r4 = new float[r7]
            r4[r8] = r12
            r12 = 1
            r4[r12] = r0
            java.lang.String r0 = "y"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r1, r0, r4)
            r0.setDuration(r2)
            r0.setAutoCancel(r12)
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r1 = 1073741824(0x40000000, float:2.0)
            r12.<init>(r1)
            r0.setInterpolator(r12)
            r0.start()
            float[] r12 = new float[r7]
            r12 = {x0186: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofFloat(r12)
            r12.setDuration(r2)
            xhss.ᛴᲇᲀᛷ r0 = new xhss.ᛴᲇᲀᛷ
            r0.<init>(r8, r11)
            r12.addUpdateListener(r0)
            r12.start()
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1079(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f2126
            r1 = 1677787153(0x64010011, float:9.518539E21)
            java.lang.Object r2 = r8.f2125
            r3 = 1
            r4 = 2
            switch(r0) {
                case 0: goto Lb2;
                case 1: goto L68;
                default: goto Lc;
            }
        Lc:
            xhss.ᛳᛴᛵ r9 = (xhss.C0259) r9
            xhss.ᲀᲀ r2 = (xhss.C0891) r2
            xhss.ᛳᛴᛵ r9 = r2.f2877
            android.app.Activity r9 = r9.m54()
            if (r9 != 0) goto L1e
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r9 = r2.f2871
            android.content.Context r9 = r9.getContext()
        L1e:
            if (r9 != 0) goto L21
            goto L67
        L21:
            android.view.animation.Animation r9 = xhss.C0915.m1490(r9, r1)
            long r0 = r2.m1454(r9)
            r9.setDuration(r0)
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator
            r5.<init>()
            r9.setInterpolator(r5)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r5 = r2.f2872
            r5.startAnimation(r9)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r9 = r2.f2871
            android.view.ViewPropertyAnimator r9 = r9.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r9 = r9.alpha(r2)
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>()
            android.view.ViewPropertyAnimator r9 = r9.setInterpolator(r2)
            r9.setDuration(r0)
            float[] r9 = new float[r4]
            r9 = {x0102: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            r9.setDuration(r0)
            xhss.ᛳᲈᛶᛸ r0 = new xhss.ᛳᲈᛶᛸ
            r0.<init>(r8, r3)
            r9.addUpdateListener(r0)
            r9.start()
        L67:
            return
        L68:
            xhss.ᛱᛴᛳᛴ r9 = (xhss.C0036) r9
            xhss.ᲁᛳᛵᛷ r2 = (xhss.C0935) r2
            xhss.ᛱᛴᛳᛴ r9 = r2.f3025
            xhss.ᛶᛵᲇᛸ r0 = r9.f95
            r0.getClass()
            xhss.ᛶᛵᲇᛸ r0 = r9.f95
            r0.getClass()
            xhss.ᛱᛴᛳᛴ r0 = r9.f225
            android.content.Context r0 = r0.f87
            if (r0 != 0) goto L82
            android.app.Activity r0 = r9.m54()
        L82:
            android.view.animation.Animation r9 = xhss.C0915.m1490(r0, r1)
            long r0 = r2.m1534(r9)
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator
            r5.<init>()
            r9.setInterpolator(r5)
            r9.setDuration(r0)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.f3023
            r2.startAnimation(r9)
            float[] r9 = new float[r4]
            r9 = {x010a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            r9.setDuration(r0)
            xhss.ᛶᛷᛳᛸ r0 = new xhss.ᛶᛷᛳᛸ
            r0.<init>(r8, r3)
            r9.addUpdateListener(r0)
            r9.start()
            return
        Lb2:
            xhss.ᛵᲇᲀᛳ r9 = (xhss.C0523) r9
            xhss.ᛲᛵᛶᲁ r2 = (xhss.C0158) r2
            xhss.ᛵᲇᲀᛳ r9 = r2.f654
            long r0 = r9.f89
            r5 = -1
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 == 0) goto Lc1
            goto Lc3
        Lc1:
            r0 = 300(0x12c, double:1.48E-321)
        Lc3:
            android.widget.RelativeLayout r9 = r2.f640
            float r2 = r9.getY()
            int r5 = r9.getHeight()
            float r5 = (float) r5
            float[] r6 = new float[r4]
            r7 = 0
            r6[r7] = r2
            r6[r3] = r5
            java.lang.String r2 = "y"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r2, r6)
            r9.setDuration(r0)
            r9.start()
            float[] r9 = new float[r4]
            r9 = {x0112: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            r9.setDuration(r0)
            xhss.ᛴᲇᲀᛷ r0 = new xhss.ᛴᲇᲀᛷ
            r0.<init>(r3, r8)
            r9.addUpdateListener(r0)
            r9.start()
            return
    }
}
