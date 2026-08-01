package defpackage;

/* JADX INFO: renamed from: ᲀᛲᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1628 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final byte[] f7223 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final byte[] f7224 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final int[] f7225 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.lang.Object[] f7226 = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            defpackage.AbstractC1628.f7225 = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            defpackage.AbstractC1628.f7226 = r0
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x001a: FILL_ARRAY_DATA , data: [112, 114, 111, 0} // fill-array
            defpackage.AbstractC1628.f7224 = r1
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [112, 114, 109, 0} // fill-array
            defpackage.AbstractC1628.f7223 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static byte[] m2939(defpackage.C1067[] r8, byte[] r9) {
            int r0 = r8.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L30
            r4 = r8[r2]
            java.lang.String r5 = r4.f4753
            java.lang.String r6 = r4.f4754
            java.lang.String r5 = m2965(r5, r6, r9)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r6)
            int r5 = r5.length
            int r5 = r5 + 16
            int r6 = r4.f4750
            int r6 = r6 * 2
            int r6 = r6 + r5
            int r5 = r4.f4755
            int r6 = r6 + r5
            int r4 = r4.f4756
            int r4 = r4 * 2
            int r4 = r4 + 7
            r4 = r4 & (-8)
            int r4 = r4 / 8
            int r4 = r4 + r6
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L30:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            byte[] r2 = defpackage.AbstractC0069.f771
            boolean r2 = java.util.Arrays.equals(r9, r2)
            if (r2 == 0) goto L53
            int r2 = r8.length
        L3e:
            if (r1 >= r2) goto L72
            r4 = r8[r1]
            java.lang.String r5 = r4.f4753
            java.lang.String r6 = r4.f4754
            java.lang.String r5 = m2965(r5, r6, r9)
            m2963(r0, r4, r5)
            m2957(r0, r4)
            int r1 = r1 + 1
            goto L3e
        L53:
            int r2 = r8.length
            r4 = r1
        L55:
            if (r4 >= r2) goto L67
            r5 = r8[r4]
            java.lang.String r6 = r5.f4753
            java.lang.String r7 = r5.f4754
            java.lang.String r6 = m2965(r6, r7, r9)
            m2963(r0, r5, r6)
            int r4 = r4 + 1
            goto L55
        L67:
            int r9 = r8.length
        L68:
            if (r1 >= r9) goto L72
            r2 = r8[r1]
            m2957(r0, r2)
            int r1 = r1 + 1
            goto L68
        L72:
            int r8 = r0.size()
            if (r8 != r3) goto L7d
            byte[] r8 = r0.toByteArray()
            return r8
        L7d:
            int r8 = r0.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "The bytes saved do not match expectation. actual="
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = " expected="
            r9.append(r8)
            r9.append(r3)
            java.lang.String r8 = r9.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final defpackage.C2260 m2940(defpackage.InterfaceC0140 r9) {
            boolean r0 = r9 instanceof defpackage.C1395
            if (r0 != 0) goto Lb
            ᲈᛶᛳᛷ r0 = new ᲈᛶᛳᛷ
            r1 = 1
            r0.<init>(r1, r9)
            return r0
        Lb:
            r3 = r9
            ᛷᲇᲇᲇ r3 = (defpackage.C1395) r3
            ᛳᛴᛵᛱ r7 = defpackage.AbstractC1592.f7041
            long r0 = defpackage.C1395.f6052
        L12:
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            java.lang.Object r6 = r2.getObjectVolatile(r3, r0)
            r8 = 0
            if (r6 != 0) goto L20
            r2.putObjectVolatile(r3, r0, r7)
            r6 = r8
            goto L30
        L20:
            boolean r2 = r6 instanceof defpackage.C2260
            if (r2 == 0) goto L66
        L24:
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            long r4 = defpackage.C1395.f6052
            boolean r4 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r4 == 0) goto L5f
            ᲈᛶᛳᛷ r6 = (defpackage.C2260) r6
        L30:
            if (r6 == 0) goto L58
            long r0 = defpackage.C2260.f9596
            java.lang.Object r3 = r2.getObjectVolatile(r6, r0)
            boolean r4 = r3 instanceof defpackage.C1588
            if (r4 == 0) goto L46
            ᛸᲇᲁ r3 = (defpackage.C1588) r3
            java.lang.Object r3 = r3.f7029
            if (r3 == 0) goto L46
            r6.m3664()
            goto L54
        L46:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            long r4 = defpackage.C2260.f9594
            r2.putIntVolatile(r6, r4, r3)
            ᛳᛸᛲᛳ r3 = defpackage.C0522.f2577
            r2.putObjectVolatile(r6, r0, r3)
            r8 = r6
        L54:
            if (r8 != 0) goto L57
            goto L58
        L57:
            return r8
        L58:
            ᲈᛶᛳᛷ r0 = new ᲈᛶᛳᛷ
            r1 = 2
            r0.<init>(r1, r9)
            return r0
        L5f:
            java.lang.Object r2 = r2.getObjectVolatile(r3, r0)
            if (r2 == r6) goto L24
            goto L12
        L66:
            if (r6 == r7) goto L12
            boolean r2 = r6 instanceof java.lang.Throwable
            if (r2 == 0) goto L6d
            goto L12
        L6d:
            java.lang.String r9 = "Inconsistent state "
            defpackage.C2264.m3681(r6, r9)
            return r8
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public static void m2941(android.content.Context r19, defpackage.C2105 r20, defpackage.InterfaceC1781 r21) {
            r1 = r19
            r2 = -167658627964462(0xffff6783ef0961d2, double:NaN)
            r2 = -167692987702830(0xffff677bef0961d2, double:NaN)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r1)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r1)
            r3 = 1712062542(0x660c004e, float:1.6528423E23)
            r4 = 0
            android.view.View r0 = r0.inflate(r3, r2, r4)
            r2 = 1711866048(0x660900c0, float:1.6174451E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.Button r3 = (android.widget.Button) r3
            if (r3 == 0) goto L2ac
            r2 = 1711866082(0x660900e2, float:1.6174512E23)
            android.view.View r4 = defpackage.AbstractC1193.m2331(r0, r2)
            r6 = r4
            android.widget.Button r6 = (android.widget.Button) r6
            if (r6 == 0) goto L2ac
            r2 = 1711866442(0x6609024a, float:1.617516E23)
            android.view.View r4 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L2ac
            r2 = 1711866984(0x66090468, float:1.6176137E23)
            android.view.View r5 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L2ac
            r2 = 1711866994(0x66090472, float:1.6176155E23)
            android.view.View r7 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L2ac
            r2 = 1711867022(0x6609048e, float:1.6176206E23)
            android.view.View r8 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L2ac
            r2 = 1711867026(0x66090492, float:1.6176213E23)
            android.view.View r9 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L2ac
            r2 = 1711867038(0x6609049e, float:1.6176235E23)
            android.view.View r10 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L2ac
            r2 = 1711867050(0x660904aa, float:1.6176256E23)
            android.view.View r11 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L2ac
            r2 = 1711867051(0x660904ab, float:1.6176258E23)
            android.view.View r12 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L2ac
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13 = -167731642408494(0xffff6772ef0961d2, double:NaN)
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r13 = 1712259275(0x660f00cb, float:1.6882826E23)
            r2.<init>(r1, r13)
            android.app.AlertDialog$Builder r0 = r2.setView(r0)
            android.app.AlertDialog r2 = r0.create()
            r0 = 1
            r2.setCancelable(r0)
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto Lbc
            r13 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r13)
        Lbc:
            java.lang.String r0 = r20.m3528()
            r10.setText(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r13 = -167787476983342(0xffff6765ef0961d2, double:NaN)
            java.lang.String r10 = "UID: "
            r0.<init>(r10)
            java.lang.String r10 = r20.m3526()
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r12.setText(r0)
            ᛱᛵᛷᛱ r0 = r20.m3532()
            java.lang.String r0 = r0.f893
            r11.setText(r0)
            ᲈᛲᛵᲀ r0 = com.bumptech.glide.ComponentCallbacks2C0007.m234(r1)     // Catch: java.lang.Exception -> L112
            java.lang.String r10 = r20.m3531()     // Catch: java.lang.Exception -> L112
            ᲀᛷᛴᲀ r0 = r0.m3586(r10)     // Catch: java.lang.Exception -> L112
            ᲇᛴᛸᲇ r0 = r0.m3446()     // Catch: java.lang.Exception -> L112
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0     // Catch: java.lang.Exception -> L112
            ᲇᛴᛸᲇ r0 = r0.m3433()     // Catch: java.lang.Exception -> L112
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0     // Catch: java.lang.Exception -> L112
            ᛸᛶᛵᛲ r10 = defpackage.C1506.f6658     // Catch: java.lang.Exception -> L112
            ᲇᛴᛸᲇ r0 = r0.m3439(r10)     // Catch: java.lang.Exception -> L112
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0     // Catch: java.lang.Exception -> L112
            ᲇᛴᛸᲇ r0 = r0.m3447()     // Catch: java.lang.Exception -> L112
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0     // Catch: java.lang.Exception -> L112
            r0.m3097(r4)     // Catch: java.lang.Exception -> L112
            goto L13a
        L112:
            r0 = move-exception
            r10 = -167813246787118(0xffff675fef0961d2, double:NaN)
            java.lang.String r10 = "load avatar error"
            r13 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r13 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r11 = defpackage.C0346.f1773
            r11.getClass()
            defpackage.C0346.m1038(r10, r0)
            r0 = 1711800725(0x66080195, float:1.6056776E23)
            r4.setImageResource(r0)
        L13a:
            java.util.List r0 = defpackage.AbstractC2311.m3756()
            java.util.Iterator r0 = r0.iterator()
        L142:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L15e
            java.lang.Object r4 = r0.next()
            r10 = r4
            ᛲᛳᲈᛴ r10 = (defpackage.C0273) r10
            java.lang.String r10 = r10.m897()
            java.lang.String r11 = r20.m3529()
            boolean r10 = defpackage.AbstractC0498.m1280(r10, r11)
            if (r10 == 0) goto L142
            goto L15f
        L15e:
            r4 = 0
        L15f:
            ᛲᛳᲈᛴ r4 = (defpackage.C0273) r4
            if (r4 == 0) goto L16a
            java.lang.String r0 = r4.m900()
            if (r0 == 0) goto L16a
            goto L173
        L16a:
            r10 = -167890556198446(0xffff674def0961d2, double:NaN)
            java.lang.String r0 = "默认分组"
        L173:
            r8.setText(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = r20.m3530()
            r0.append(r4)
            r4 = 22825(0x5929, float:3.1985E-41)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r7.setText(r0)
            long r7 = r20.m3535()
            r10 = 0
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 <= 0) goto L245
            long r7 = r20.m3535()
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r7
            r15 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L1b3
            r7 = -167985045478958(0xffff6737ef0961d2, double:NaN)
            java.lang.String r0 = "刚刚"
            goto L24e
        L1b3:
            r17 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 >= 0) goto L1d5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r13 = r13 / r15
            r0.append(r13)
            r7 = -167997930380846(0xffff6734ef0961d2, double:NaN)
            java.lang.String r4 = "分钟前"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L24e
        L1d5:
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L1f7
            long r13 = r13 / r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r7 = -168015110250030(0xffff6730ef0961d2, double:NaN)
            java.lang.String r4 = "小时前"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L24e
        L1f7:
            r17 = 172800000(0xa4cb800, double:8.53745436E-316)
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 >= 0) goto L208
            r7 = -168032290119214(0xffff672cef0961d2, double:NaN)
            java.lang.String r0 = "昨天"
            goto L24e
        L208:
            r17 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 >= 0) goto L229
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r13 = r13 / r15
            r0.append(r13)
            r7 = -168045175021102(0xffff6729ef0961d2, double:NaN)
            java.lang.String r4 = "天前"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L24e
        L229:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r13 = -168058059922990(0xffff6726ef0961d2, double:NaN)
            java.lang.String r4 = "MM-dd HH:mm"
            java.util.Locale r13 = java.util.Locale.getDefault()
            r0.<init>(r4, r13)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r7)
            java.lang.String r0 = r0.format(r4)
            goto L24e
        L245:
            r7 = -167912031034926(0xffff6748ef0961d2, double:NaN)
            java.lang.String r0 = "从未"
        L24e:
            r9.setText(r0)
            long r7 = r20.m3533()
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 <= 0) goto L279
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r7 = -167924915936814(0xffff6745ef0961d2, double:NaN)
            java.lang.String r4 = "yyyy-MM-dd"
            java.util.Locale r7 = java.util.Locale.getDefault()
            r0.<init>(r4, r7)
            java.util.Date r4 = new java.util.Date
            long r7 = r20.m3533()
            r4.<init>(r7)
            java.lang.String r0 = r0.format(r4)
            goto L282
        L279:
            r7 = -167972160577070(0xffff673aef0961d2, double:NaN)
            java.lang.String r0 = "未知"
        L282:
            r5.setText(r0)
            ᲈᛳᛳ r0 = new ᲈᛳᛳ
            r4 = 8
            r0.<init>(r2, r4)
            r3.setOnClickListener(r0)
            ᲀᲇᛶ r0 = new ᲀᲇᛶ
            r5 = 4
            r4 = r21
            r3 = r2
            r2 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r6.setOnClickListener(r0)
            ᛳᛸᲇᲈ r0 = new ᛳᛸᲇᲈ
            r2 = 2
            r4 = r20
            r0.<init>(r4, r2, r1)
            r12.setOnLongClickListener(r0)
            r3.show()
            return
        L2ac:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r2)
            r1 = -1162441773194798(0xfffbdec3ef0961d2, double:NaN)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            defpackage.C2264.m3673(r0)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static defpackage.C2144 m2942(android.content.res.XmlResourceParser r5) {
            ᲇᲇᛴᲈ r0 = new ᲇᲇᛴᲈ
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            r5.getAttributeValue(r2, r1)
            java.lang.String r1 = "supportsPictureInPicture"
            r3 = 0
            r5.getAttributeBooleanValue(r2, r1, r3)
        L12:
            int r1 = r5.next()
            java.lang.String r2 = r5.getName()
            r3 = 3
            if (r1 != r3) goto L2e
            java.lang.String r3 = "activity"
            boolean r3 = defpackage.AbstractC1592.m2875(r3, r2)
            if (r3 != 0) goto L2d
            java.lang.String r3 = "activity-alias"
            boolean r3 = defpackage.AbstractC1592.m2875(r3, r2)
            if (r3 == 0) goto L2e
        L2d:
            return r0
        L2e:
            r3 = 2
            if (r1 != r3) goto L4c
            java.lang.String r4 = "intent-filter"
            boolean r4 = defpackage.AbstractC1592.m2875(r4, r2)
            if (r4 == 0) goto L4c
            java.util.ArrayList r1 = r0.f9117
            if (r1 != 0) goto L44
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f9117 = r1
        L44:
            ᲇᲇᛴᲈ r2 = m2948(r5)
            r1.add(r2)
            goto L12
        L4c:
            if (r1 != r3) goto L12
            java.lang.String r1 = "meta-data"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r2)
            if (r1 == 0) goto L12
            java.util.ArrayList r1 = r0.f9118
            if (r1 != 0) goto L61
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f9118 = r1
        L61:
            ᲈᛶᲁᛸ r2 = m2977(r5)
            r1.add(r2)
            goto L12
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final void m2943(defpackage.InterfaceC1661 r1, java.lang.String r2) {
            ᛲᛳᲇᛱ r1 = r1.mo892(r2)
            r1.mo530()     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            defpackage.AbstractC0209.m772(r1, r2)
            return
        Lc:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> Le
        Le:
            r0 = move-exception
            defpackage.AbstractC0209.m772(r1, r2)
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static byte[] m2944(java.io.FileInputStream r8, int r9, int r10) {
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public static byte[] m2945(byte[] r7, defpackage.C0513 r8) {
            int r0 = r7.length
            r1 = 8
            if (r0 >= r1) goto L7
            r7 = 0
            return r7
        L7:
            java.lang.String r0 = new java.lang.String
            r1 = 4
            java.nio.charset.Charset r2 = defpackage.AbstractC1422.f6219
            r3 = 0
            r0.<init>(r7, r3, r1, r2)
            r1 = -1149007115492910(0xfffbeafbef0961d2, double:NaN)
            java.lang.String r1 = "ALPH"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L48
            r4 = -1149028590329390(0xfffbeaf6ef0961d2, double:NaN)
            java.lang.String r2 = "VP8 "
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L2f
            goto L48
        L2f:
            r1 = -1149050065165870(0xfffbeaf1ef0961d2, double:NaN)
            java.lang.String r8 = "VP8L"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L43
            byte[] r7 = m2958(r7)
            return r7
        L43:
            byte[] r7 = m2958(r7)
            return r7
        L48:
            if (r1 == 0) goto Lf7
            r0 = 10
            byte[] r1 = new byte[r0]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r1)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r4)
            r5 = 16
            r2.put(r5)
            r2.put(r3)
            r2.put(r3)
            r2.put(r3)
            int r5 = r8.f2538
            r6 = 1
            int r5 = r5 - r6
            m2972(r2, r5)
            int r8 = r8.f2537
            int r8 = r8 - r6
            m2972(r2, r8)
            int r8 = r7.length
            int r8 = r8 % 2
            if (r8 == 0) goto L86
            byte[] r8 = new byte[r6]
            r8[r3] = r3
            int r2 = r7.length
            int r5 = r2 + 1
            byte[] r7 = java.util.Arrays.copyOf(r7, r5)
            java.lang.System.arraycopy(r8, r3, r7, r2, r6)
        L86:
            int r8 = r7.length
            r2 = 22
            int r2 = r2 + r8
            int r8 = r8 + 30
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r8 = r8.order(r4)
            r3 = -1149281993399854(0xfffbeabbef0961d2, double:NaN)
            java.lang.String r3 = "RIFF"
            java.nio.charset.Charset r4 = defpackage.AbstractC1422.f6221
            byte[] r3 = r3.getBytes(r4)
            r5 = -1149303468236334(0xfffbeab6ef0961d2, double:NaN)
            r8.put(r3)
            r8.putInt(r2)
            r2 = -1149363597778478(0xfffbeaa8ef0961d2, double:NaN)
            java.lang.String r2 = "WEBP"
            byte[] r2 = r2.getBytes(r4)
            r5 = -1149385072614958(0xfffbeaa3ef0961d2, double:NaN)
            r8.put(r2)
            r2 = -1149445202157102(0xfffbea95ef0961d2, double:NaN)
            java.lang.String r2 = "VP8X"
            byte[] r2 = r2.getBytes(r4)
            r3 = -1149466676993582(0xfffbea90ef0961d2, double:NaN)
            r8.put(r2)
            r8.putInt(r0)
            r8.put(r1)
            r8.put(r7)
            byte[] r7 = r8.array()
            r0 = -1149526806535726(0xfffbea82ef0961d2, double:NaN)
            return r7
        Lf7:
            byte[] r7 = m2958(r7)
            return r7
    }

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public static void m2946(java.io.ByteArrayOutputStream r10, int r11, defpackage.C1067 r12) {
            int r0 = r12.f4756
            r1 = r11 & (-2)
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 * r0
            int r1 = r1 + 7
            r1 = r1 & (-8)
            int r1 = r1 / 8
            byte[] r1 = new byte[r1]
            java.util.TreeMap r12 = r12.f4749
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L1b:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r12.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = 1
            r5 = 0
            r6 = r4
        L3e:
            r7 = 4
            if (r6 > r7) goto L1b
            if (r6 != r4) goto L46
        L43:
            int r6 = r6 << 1
            goto L3e
        L46:
            r7 = r6 & r11
            if (r7 != 0) goto L4b
            goto L43
        L4b:
            r7 = r6 & r2
            if (r7 != r6) goto L5e
            int r7 = r5 * r0
            int r7 = r7 + r3
            int r8 = r7 / 8
            r9 = r1[r8]
            int r7 = r7 % 8
            int r7 = r4 << r7
            r7 = r7 | r9
            byte r7 = (byte) r7
            r1[r8] = r7
        L5e:
            int r5 = r5 + 1
            goto L43
        L61:
            r10.write(r1)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static int[] m2947(java.io.ByteArrayInputStream r5, int r6) {
            int[] r0 = new int[r6]
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r6) goto L12
            r3 = 2
            long r3 = m2973(r5, r3)
            int r3 = (int) r3
            int r2 = r2 + r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static defpackage.C2144 m2948(android.content.res.XmlResourceParser r5) {
            ᲇᲇᛴᲈ r0 = new ᲇᲇᛴᲈ
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f9117 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f9118 = r1
        L13:
            int r1 = r5.next()
            java.lang.String r2 = r5.getName()
            r3 = 3
            if (r1 != r3) goto L27
            java.lang.String r3 = "intent-filter"
            boolean r3 = defpackage.AbstractC1592.m2875(r3, r2)
            if (r3 == 0) goto L27
            return r0
        L27:
            r3 = 2
            if (r1 == r3) goto L2b
            goto L13
        L2b:
            java.lang.String r1 = "action"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r2)
            java.lang.String r3 = "name"
            java.lang.String r4 = "http://schemas.android.com/apk/res/android"
            if (r1 == 0) goto L41
            java.util.ArrayList r1 = r0.f9117
            java.lang.String r2 = r5.getAttributeValue(r4, r3)
            r1.add(r2)
            goto L13
        L41:
            java.lang.String r1 = "category"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r2)
            if (r1 == 0) goto L13
            java.util.ArrayList r1 = r0.f9118
            java.lang.String r2 = r5.getAttributeValue(r4, r3)
            r1.add(r2)
            goto L13
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static byte[] m2949(java.io.InputStream r3, int r4) {
            byte[] r0 = new byte[r4]
            r1 = 0
        L3:
            if (r1 >= r4) goto L1a
            int r2 = r4 - r1
            int r2 = r3.read(r0, r1, r2)
            if (r2 < 0) goto Lf
            int r1 = r1 + r2
            goto L3
        Lf:
            java.lang.String r3 = "Not enough bytes to read: "
            java.lang.String r3 = defpackage.AbstractC1124.m2145(r4, r3)
            defpackage.C2264.m3676(r3)
            r3 = 0
            return r3
        L1a:
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public static int m2950(java.io.RandomAccessFile r2) {
            byte r0 = r2.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = r2.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = r2.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r2 = r2 << 16
            r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static void m2951(long r20, defpackage.C1569 r22, int r23, java.util.ArrayList r24, int r25, int r26, java.util.ArrayList r27) {
            r0 = r22
            r1 = r23
            r5 = r24
            r2 = r25
            r10 = r26
            r8 = r27
            java.lang.String r3 = "Failed requirement."
            if (r2 >= r10) goto L1a9
            r4 = r2
        L11:
            if (r4 >= r10) goto L26
            java.lang.Object r6 = r5.get(r4)
            ᛶᛸᛸᛶ r6 = (defpackage.C1128) r6
            int r6 = r6.mo2165()
            if (r6 < r1) goto L22
            int r4 = r4 + 1
            goto L11
        L22:
            defpackage.C2264.m3684(r3)
            return
        L26:
            java.lang.Object r3 = r24.get(r25)
            ᛶᛸᛸᛶ r3 = (defpackage.C1128) r3
            int r4 = r10 + (-1)
            java.lang.Object r4 = r5.get(r4)
            ᛶᛸᛸᛶ r4 = (defpackage.C1128) r4
            int r6 = r3.mo2165()
            if (r1 != r6) goto L53
            java.lang.Object r3 = r8.get(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r2 = r2 + 1
            java.lang.Object r6 = r5.get(r2)
            ᛶᛸᛸᛶ r6 = (defpackage.C1128) r6
            r19 = r6
            r6 = r2
            r2 = r3
            r3 = r19
            goto L55
        L53:
            r6 = r2
            r2 = -1
        L55:
            byte r7 = r3.mo2160(r1)
            byte r9 = r4.mo2160(r1)
            r14 = 2
            if (r7 == r9) goto L124
            int r3 = r6 + 1
            r4 = 1
        L64:
            if (r3 >= r10) goto L83
            int r7 = r3 + (-1)
            java.lang.Object r7 = r5.get(r7)
            ᛶᛸᛸᛶ r7 = (defpackage.C1128) r7
            byte r7 = r7.mo2160(r1)
            java.lang.Object r9 = r5.get(r3)
            ᛶᛸᛸᛶ r9 = (defpackage.C1128) r9
            byte r9 = r9.mo2160(r1)
            if (r7 == r9) goto L80
            int r4 = r4 + 1
        L80:
            int r3 = r3 + 1
            goto L64
        L83:
            r16 = -1
            r17 = 4
            long r11 = r0.f6928
            long r11 = r11 / r17
            long r11 = r11 + r20
            long r11 = r11 + r14
            int r3 = r4 * 2
            long r13 = (long) r3
            long r11 = r11 + r13
            r0.m2830(r4)
            r0.m2830(r2)
            r2 = r6
        L99:
            if (r2 >= r10) goto Lbd
            java.lang.Object r3 = r5.get(r2)
            ᛶᛸᛸᛶ r3 = (defpackage.C1128) r3
            byte r3 = r3.mo2160(r1)
            if (r2 == r6) goto Lb5
            int r4 = r2 + (-1)
            java.lang.Object r4 = r5.get(r4)
            ᛶᛸᛸᛶ r4 = (defpackage.C1128) r4
            byte r4 = r4.mo2160(r1)
            if (r3 == r4) goto Lba
        Lb5:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.m2830(r3)
        Lba:
            int r2 = r2 + 1
            goto L99
        Lbd:
            ᛸᲁᛵ r4 = new ᛸᲁᛵ
            r4.<init>()
            r7 = r6
        Lc3:
            if (r7 >= r10) goto L120
            java.lang.Object r2 = r5.get(r7)
            ᛶᛸᛸᛶ r2 = (defpackage.C1128) r2
            byte r2 = r2.mo2160(r1)
            int r3 = r7 + 1
            r6 = r3
        Ld2:
            if (r6 >= r10) goto Le4
            java.lang.Object r9 = r5.get(r6)
            ᛶᛸᛸᛶ r9 = (defpackage.C1128) r9
            byte r9 = r9.mo2160(r1)
            if (r2 == r9) goto Le1
            goto Le5
        Le1:
            int r6 = r6 + 1
            goto Ld2
        Le4:
            r6 = r10
        Le5:
            if (r3 != r6) goto L106
            int r2 = r1 + 1
            java.lang.Object r3 = r5.get(r7)
            ᛶᛸᛸᛶ r3 = (defpackage.C1128) r3
            int r3 = r3.mo2165()
            if (r2 != r3) goto L106
            java.lang.Object r2 = r8.get(r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.m2830(r2)
            r9 = r8
            r2 = r11
            r8 = r6
            goto L11c
        L106:
            long r2 = r4.f6928
            long r2 = r2 / r17
            long r2 = r2 + r11
            int r2 = (int) r2
            int r2 = r2 * (-1)
            r0.m2830(r2)
            int r5 = r1 + 1
            r9 = r8
            r2 = r11
            r8 = r6
            r6 = r24
            m2951(r2, r4, r5, r6, r7, r8, r9)
            r5 = r6
        L11c:
            r11 = r2
            r7 = r8
            r8 = r9
            goto Lc3
        L120:
            r0.m2836(r4)
            return
        L124:
            r9 = r8
            r16 = -1
            r17 = 4
            int r7 = r3.mo2165()
            int r8 = r4.mo2165()
            int r7 = java.lang.Math.min(r7, r8)
            r8 = 0
            r11 = r1
        L137:
            if (r11 >= r7) goto L148
            byte r12 = r3.mo2160(r11)
            byte r13 = r4.mo2160(r11)
            if (r12 != r13) goto L148
            int r8 = r8 + 1
            int r11 = r11 + 1
            goto L137
        L148:
            long r11 = r0.f6928
            long r11 = r11 / r17
            long r11 = r11 + r20
            long r11 = r11 + r14
            long r13 = (long) r8
            long r11 = r11 + r13
            r13 = 1
            long r11 = r11 + r13
            int r4 = -r8
            r0.m2830(r4)
            r0.m2830(r2)
            int r4 = r1 + r8
        L15d:
            if (r1 >= r4) goto L16b
            byte r2 = r3.mo2160(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.m2830(r2)
            int r1 = r1 + 1
            goto L15d
        L16b:
            int r1 = r6 + 1
            if (r1 != r10) goto L18f
            java.lang.Object r1 = r5.get(r6)
            ᛶᛸᛸᛶ r1 = (defpackage.C1128) r1
            int r1 = r1.mo2165()
            if (r4 != r1) goto L189
            java.lang.Object r1 = r9.get(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.m2830(r1)
            return
        L189:
            java.lang.String r0 = "Check failed."
            defpackage.C2264.m3676(r0)
            return
        L18f:
            ᛸᲁᛵ r3 = new ᛸᲁᛵ
            r3.<init>()
            long r1 = r3.f6928
            long r1 = r1 / r17
            long r1 = r1 + r11
            int r1 = (int) r1
            int r1 = r1 * (-1)
            r0.m2830(r1)
            r8 = r9
            r7 = r10
            r1 = r11
            m2951(r1, r3, r4, r5, r6, r7, r8)
            r0.m2836(r3)
            return
        L1a9:
            defpackage.C2264.m3684(r3)
            return
    }

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public static long m2952(java.io.RandomAccessFile r4) {
            byte r0 = r4.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = r4.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = r4.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r4 = r4.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r2 << 16
            r0 = r0 | r1
            int r4 = r4 << 24
            r4 = r4 | r0
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static defpackage.C1939 m2953(android.content.Context r11, int r12) {
            ᲁᲇᛱᲈ r0 = new ᲁᲇᛱᲈ
            r0.<init>()
            android.content.res.AssetManager r11 = r11.getAssets()
            java.lang.String r1 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r11 = r11.openXmlResourceParser(r12, r1)
        Lf:
            int r12 = r11.getEventType()     // Catch: java.lang.Throwable -> L34
            r1 = 2
            if (r12 == r1) goto L18
            goto L120
        L18:
            java.lang.String r12 = r11.getName()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "manifest"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = ""
            java.lang.String r3 = "package"
            r4 = 0
            if (r1 == 0) goto L37
            java.lang.String r1 = r11.getAttributeValue(r4, r3)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L30
            goto L31
        L30:
            r1 = r2
        L31:
            r0.f8445 = r1     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r12 = move-exception
            goto L12b
        L37:
            java.lang.String r1 = "uses-sdk"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            r5 = 0
            java.lang.String r6 = "http://schemas.android.com/apk/res/android"
            if (r1 == 0) goto L47
            java.lang.String r1 = "minSdkVersion"
            r11.getAttributeIntValue(r6, r1, r5)     // Catch: java.lang.Throwable -> L34
        L47:
            java.lang.String r1 = "uses-permission"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            java.lang.String r7 = "name"
            if (r1 != 0) goto L61
            java.lang.String r1 = "uses-permission-sdk-23"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L61
            java.lang.String r1 = "uses-permission-sdk-m"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L85
        L61:
            java.lang.Object r1 = r0.f8444     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L34
            ᛸᲈᛷᛳ r8 = new ᛸᲈᛷᛳ     // Catch: java.lang.Throwable -> L34
            r8.<init>()     // Catch: java.lang.Throwable -> L34
            r9 = 2147483647(0x7fffffff, float:NaN)
            r8.f7098 = r9     // Catch: java.lang.Throwable -> L34
            java.lang.String r10 = r11.getAttributeValue(r6, r7)     // Catch: java.lang.Throwable -> L34
            r8.f7097 = r10     // Catch: java.lang.Throwable -> L34
            java.lang.String r10 = "maxSdkVersion"
            int r9 = r11.getAttributeIntValue(r6, r10, r9)     // Catch: java.lang.Throwable -> L34
            r8.f7098 = r9     // Catch: java.lang.Throwable -> L34
            java.lang.String r9 = "usesPermissionFlags"
            r11.getAttributeIntValue(r6, r9, r5)     // Catch: java.lang.Throwable -> L34
            r1.add(r8)     // Catch: java.lang.Throwable -> L34
        L85:
            java.lang.String r1 = "queries"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r0.f8443     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r11.getAttributeValue(r4, r3)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L98
            r2 = r3
        L98:
            r1.add(r2)     // Catch: java.lang.Throwable -> L34
        L9b:
            java.lang.String r1 = "application"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto Lb5
            ᲁᲁᛴᲇ r1 = new ᲁᲁᛴᲇ     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            r11.getAttributeValue(r6, r7)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "requestLegacyExternalStorage"
            boolean r2 = r11.getAttributeBooleanValue(r6, r2, r5)     // Catch: java.lang.Throwable -> L34
            r1.f8365 = r2     // Catch: java.lang.Throwable -> L34
            r0.f8442 = r1     // Catch: java.lang.Throwable -> L34
        Lb5:
            java.lang.String r1 = "activity"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto Lc5
            java.lang.String r1 = "activity-alias"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto Ld0
        Lc5:
            java.lang.Object r1 = r0.f8446     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L34
            ᲇᲇᛴᲈ r2 = m2942(r11)     // Catch: java.lang.Throwable -> L34
            r1.add(r2)     // Catch: java.lang.Throwable -> L34
        Ld0:
            java.lang.String r1 = "service"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto Le3
            java.lang.Object r1 = r0.f8447     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L34
            ᲇᲇᛴᲈ r2 = m2971(r11)     // Catch: java.lang.Throwable -> L34
            r1.add(r2)     // Catch: java.lang.Throwable -> L34
        Le3:
            java.lang.String r1 = "receiver"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto Lf6
            java.lang.Object r1 = r0.f8441     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L34
            ᲇᲇᛴᲈ r2 = m2966(r11)     // Catch: java.lang.Throwable -> L34
            r1.add(r2)     // Catch: java.lang.Throwable -> L34
        Lf6:
            java.lang.String r1 = "meta-data"
            boolean r12 = defpackage.AbstractC1592.m2875(r1, r12)     // Catch: java.lang.Throwable -> L34
            if (r12 == 0) goto L120
            java.lang.Object r12 = r0.f8442     // Catch: java.lang.Throwable -> L34
            ᲁᲁᛴᲇ r12 = (defpackage.C1926) r12     // Catch: java.lang.Throwable -> L34
            if (r12 == 0) goto L120
            java.lang.Object r1 = r12.f8366     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L111
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            r12.f8366 = r1     // Catch: java.lang.Throwable -> L34
        L111:
            java.lang.Object r12 = r0.f8442     // Catch: java.lang.Throwable -> L34
            ᲁᲁᛴᲇ r12 = (defpackage.C1926) r12     // Catch: java.lang.Throwable -> L34
            java.lang.Object r12 = r12.f8366     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch: java.lang.Throwable -> L34
            ᲈᛶᲁᛸ r1 = m2977(r11)     // Catch: java.lang.Throwable -> L34
            r12.add(r1)     // Catch: java.lang.Throwable -> L34
        L120:
            int r12 = r11.next()     // Catch: java.lang.Throwable -> L34
            r1 = 1
            if (r12 != r1) goto Lf
            r11.close()
            return r0
        L12b:
            if (r11 == 0) goto L135
            r11.close()     // Catch: java.lang.Throwable -> L131
            goto L135
        L131:
            r11 = move-exception
            r12.addSuppressed(r11)
        L135:
            throw r12
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public static final void m2954(int r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error code: "
            java.lang.String r2 = defpackage.AbstractC1124.m2145(r2, r1)
            r0.<init>(r2)
            java.lang.String r2 = ", message: "
            java.lang.String r2 = r2.concat(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.database.SQLException r3 = new android.database.SQLException
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    public static void m2955(java.io.ByteArrayOutputStream r2, int r3) {
            long r0 = (long) r3
            r3 = 2
            m2964(r2, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final int m2956(long[] r4, int r5, long r6) {
            int r5 = r5 + (-1)
            r0 = 0
        L3:
            if (r0 > r5) goto L18
            int r1 = r0 + r5
            int r1 = r1 >>> 1
            r2 = r4[r1]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L12
            int r0 = r1 + 1
            goto L3
        L12:
            if (r2 <= 0) goto L17
            int r5 = r1 + (-1)
            goto L3
        L17:
            return r1
        L18:
            int r4 = ~r0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public static void m2957(java.io.ByteArrayOutputStream r8, defpackage.C1067 r9) {
            m2974(r8, r9)
            int r0 = r9.f4756
            int[] r1 = r9.f4748
            int r2 = r1.length
            r3 = 0
            r4 = r3
        La:
            if (r3 >= r2) goto L17
            r5 = r1[r3]
            int r4 = r5 - r4
            m2955(r8, r4)
            int r3 = r3 + 1
            r4 = r5
            goto La
        L17:
            int r1 = r0 * 2
            int r1 = r1 + 7
            r1 = r1 & (-8)
            int r1 = r1 / 8
            byte[] r1 = new byte[r1]
            java.util.TreeMap r9 = r9.f4749
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L2b:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 2
            r5 = 1
            if (r4 == 0) goto L5c
            int r4 = r3 / 8
            r6 = r1[r4]
            int r7 = r3 % 8
            int r7 = r5 << r7
            r6 = r6 | r7
            byte r6 = (byte) r6
            r1[r4] = r6
        L5c:
            r2 = r2 & 4
            if (r2 == 0) goto L2b
            int r3 = r3 + r0
            int r2 = r3 / 8
            r4 = r1[r2]
            int r3 = r3 % 8
            int r3 = r5 << r3
            r3 = r3 | r4
            byte r3 = (byte) r3
            r1[r2] = r3
            goto L2b
        L6e:
            r8.write(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public static byte[] m2958(byte[] r6) {
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 == 0) goto L15
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 0
            r1[r2] = r2
            int r3 = r6.length
            int r4 = r3 + 1
            byte[] r6 = java.util.Arrays.copyOf(r6, r4)
            java.lang.System.arraycopy(r1, r2, r6, r3, r0)
        L15:
            int r0 = r6.length
            int r1 = r0 + 4
            int r0 = r0 + 12
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r2)
            r2 = -1149071540002350(0xfffbeaecef0961d2, double:NaN)
            java.lang.String r2 = "RIFF"
            java.nio.charset.Charset r3 = defpackage.AbstractC1422.f6221
            byte[] r2 = r2.getBytes(r3)
            r4 = -1149093014838830(0xfffbeae7ef0961d2, double:NaN)
            r0.put(r2)
            r0.putInt(r1)
            r1 = -1149153144380974(0xfffbead9ef0961d2, double:NaN)
            java.lang.String r1 = "WEBP"
            byte[] r1 = r1.getBytes(r3)
            r2 = -1149174619217454(0xfffbead4ef0961d2, double:NaN)
            r0.put(r1)
            r0.put(r6)
            byte[] r6 = r0.array()
            r0 = -1149234748759598(0xfffbeac6ef0961d2, double:NaN)
            return r6
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public static final java.lang.Object m2959(long r3, defpackage.C1917 r5, defpackage.C1369 r6) {
            long r3 = defpackage.AbstractC0729.m1640(r3)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6c
            ᛶᛴᲀᛱ r0 = new ᛶᛴᲀᛱ
            r0.<init>(r3, r6)
            ᛱᛸᛲᲀ r3 = r0.f3779
            ᛳᛵᲈᛵ r3 = r3.mo663()
            ᲁᲁᛴᛸ r3 = defpackage.AbstractC0729.m1637(r3)
            long r1 = r0.f4699
            ᛳᛵᲈᛵ r4 = r0.f1569
            ᛵᛲᲇᲇ r3 = r3.mo573(r1, r0, r4)
            ᛶᛸᛱ r4 = new ᛶᛸᛱ
            r4.<init>(r3)
            r3 = 1
            defpackage.AbstractC0762.m1685(r0, r3, r4)
            defpackage.AbstractC1171.m2261(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r5.mo388(r0, r0)     // Catch: java.lang.Throwable -> L32
            goto L3a
        L32:
            r3 = move-exception
            ᛱᛸᛳᛱ r4 = new ᛱᛸᛳᛱ
            r5 = 0
            r4.<init>(r3, r5)
            r3 = r4
        L3a:
            ᛴᛵ r4 = defpackage.EnumC0670.f3246
            if (r3 != r4) goto L3f
            goto L6b
        L3f:
            java.lang.Object r5 = r0.m1438(r3)
            ᛳᛴᛵᛱ r6 = defpackage.AbstractC1754.f7747
            if (r5 != r6) goto L48
            goto L6b
        L48:
            boolean r4 = r5 instanceof defpackage.C0142
            if (r4 == 0) goto L66
            ᛱᛸᛳᛱ r5 = (defpackage.C0142) r5
            java.lang.Throwable r4 = r5.f1092
            boolean r5 = r4 instanceof defpackage.C1742
            if (r5 == 0) goto L65
            r5 = r4
            ᲀᲀᛶᲇ r5 = (defpackage.C1742) r5
            ᲇᛳᛸᛳ r5 = r5.f7707
            if (r5 != r0) goto L65
            boolean r4 = r3 instanceof defpackage.C0142
            if (r4 != 0) goto L60
            goto L6a
        L60:
            ᛱᛸᛳᛱ r3 = (defpackage.C0142) r3
            java.lang.Throwable r3 = r3.f1092
            throw r3
        L65:
            throw r4
        L66:
            java.lang.Object r3 = defpackage.AbstractC1754.m3154(r5)
        L6a:
            r4 = r3
        L6b:
            return r4
        L6c:
            ᲀᲀᛶᲇ r3 = new ᲀᲀᛶᲇ
            java.lang.String r4 = "Timed out immediately"
            r5 = 0
            r3.<init>(r4, r5)
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public static defpackage.C1067[] m2960(java.io.FileInputStream r7, byte[] r8, byte[] r9, defpackage.C1067[] r10) {
            byte[] r0 = defpackage.AbstractC0069.f776
            boolean r1 = java.util.Arrays.equals(r8, r0)
            r2 = 0
            java.lang.String r3 = "Unsupported meta version"
            java.lang.String r4 = "Content found after the end of file"
            r5 = 4
            if (r1 == 0) goto L5b
            byte[] r1 = defpackage.AbstractC0069.f774
            boolean r9 = java.util.Arrays.equals(r1, r9)
            if (r9 != 0) goto L55
            boolean r8 = java.util.Arrays.equals(r8, r0)
            if (r8 == 0) goto L51
            r8 = 1
            long r8 = m2973(r7, r8)
            int r8 = (int) r8
            long r0 = m2973(r7, r5)
            long r5 = m2973(r7, r5)
            int r9 = (int) r5
            int r0 = (int) r0
            byte[] r9 = m2944(r7, r9, r0)
            int r7 = r7.read()
            if (r7 > 0) goto L4d
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            r7.<init>(r9)
            ᛶᛵᛲᛶ[] r8 = m2967(r7, r8, r10)     // Catch: java.lang.Throwable -> L43
            r7.close()
            return r8
        L43:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r7 = move-exception
            r8.addSuppressed(r7)
        L4c:
            throw r8
        L4d:
            defpackage.C2264.m3676(r4)
            return r2
        L51:
            defpackage.C2264.m3676(r3)
            return r2
        L55:
            java.lang.String r7 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            defpackage.C2264.m3676(r7)
            return r2
        L5b:
            byte[] r0 = defpackage.AbstractC0069.f769
            boolean r8 = java.util.Arrays.equals(r8, r0)
            if (r8 == 0) goto L98
            r8 = 2
            long r0 = m2973(r7, r8)
            int r8 = (int) r0
            long r0 = m2973(r7, r5)
            long r5 = m2973(r7, r5)
            int r3 = (int) r5
            int r0 = (int) r0
            byte[] r0 = m2944(r7, r3, r0)
            int r7 = r7.read()
            if (r7 > 0) goto L94
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            r7.<init>(r0)
            ᛶᛵᛲᛶ[] r8 = m2969(r7, r9, r8, r10)     // Catch: java.lang.Throwable -> L8a
            r7.close()
            return r8
        L8a:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r7 = move-exception
            r8.addSuppressed(r7)
        L93:
            throw r8
        L94:
            defpackage.C2264.m3676(r4)
            return r2
        L98:
            defpackage.C2264.m3676(r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final int m2961(int r3, int r4, int[] r5) {
            int r3 = r3 + (-1)
            r0 = 0
        L3:
            if (r0 > r3) goto L16
            int r1 = r0 + r3
            int r1 = r1 >>> 1
            r2 = r5[r1]
            if (r2 >= r4) goto L10
            int r0 = r1 + 1
            goto L3
        L10:
            if (r2 <= r4) goto L15
            int r3 = r1 + (-1)
            goto L3
        L15:
            return r1
        L16:
            int r3 = ~r0
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0554 m2962(defpackage.InterfaceC0493 r2) {
            ᛳᲁᛳᛴ r0 = new ᛳᲁᛳᛴ
            ᛷᲈᲀ r1 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r1 = r2.mo970(r1)
            if (r1 == 0) goto Lb
            goto L13
        Lb:
            ᛵᲁᛴᛵ r1 = defpackage.AbstractC0762.m1684()
            ᛳᛵᲈᛵ r2 = r2.mo971(r1)
        L13:
            r0.<init>(r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public static void m2963(java.io.ByteArrayOutputStream r4, defpackage.C1067 r5, java.lang.String r6) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r0)
            int r1 = r1.length
            m2955(r4, r1)
            int r1 = r5.f4750
            m2955(r4, r1)
            int r1 = r5.f4755
            long r1 = (long) r1
            r3 = 4
            m2964(r4, r1, r3)
            long r1 = r5.f4752
            m2964(r4, r1, r3)
            int r5 = r5.f4756
            long r1 = (long) r5
            m2964(r4, r1, r3)
            byte[] r5 = r6.getBytes(r0)
            r4.write(r5)
            return
    }

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public static void m2964(java.io.OutputStream r6, long r7, int r9) {
            byte[] r0 = new byte[r9]
            r1 = 0
        L3:
            if (r1 >= r9) goto L13
            int r2 = r1 * 8
            long r2 = r7 >> r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        L13:
            r6.write(r0)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static java.lang.String m2965(java.lang.String r6, java.lang.String r7, byte[] r8) {
            byte[] r0 = defpackage.AbstractC0069.f770
            byte[] r1 = defpackage.AbstractC0069.f775
            boolean r2 = java.util.Arrays.equals(r8, r1)
            java.lang.String r3 = "!"
            java.lang.String r4 = ":"
            if (r2 == 0) goto Lf
            goto L15
        Lf:
            boolean r2 = java.util.Arrays.equals(r8, r0)
            if (r2 == 0) goto L17
        L15:
            r2 = r4
            goto L18
        L17:
            r2 = r3
        L18:
            int r5 = r6.length()
            if (r5 > 0) goto L34
            boolean r6 = r3.equals(r2)
            if (r6 == 0) goto L29
            java.lang.String r6 = r7.replace(r4, r3)
            return r6
        L29:
            boolean r6 = r4.equals(r2)
            if (r6 == 0) goto L87
            java.lang.String r6 = r7.replace(r3, r4)
            return r6
        L34:
            java.lang.String r5 = "classes.dex"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L3d
            return r6
        L3d:
            boolean r5 = r7.contains(r3)
            if (r5 != 0) goto L71
            boolean r5 = r7.contains(r4)
            if (r5 == 0) goto L4a
            goto L71
        L4a:
            java.lang.String r2 = ".apk"
            boolean r2 = r7.endsWith(r2)
            if (r2 == 0) goto L53
            goto L87
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            boolean r6 = java.util.Arrays.equals(r8, r1)
            if (r6 == 0) goto L5f
            goto L65
        L5f:
            boolean r6 = java.util.Arrays.equals(r8, r0)
            if (r6 == 0) goto L66
        L65:
            r3 = r4
        L66:
            r2.append(r3)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            return r6
        L71:
            boolean r6 = r3.equals(r2)
            if (r6 == 0) goto L7c
            java.lang.String r6 = r7.replace(r4, r3)
            return r6
        L7c:
            boolean r6 = r4.equals(r2)
            if (r6 == 0) goto L87
            java.lang.String r6 = r7.replace(r3, r4)
            return r6
        L87:
            return r7
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static defpackage.C2144 m2966(android.content.res.XmlResourceParser r5) {
            ᲇᲇᛴᲈ r0 = new ᲇᲇᛴᲈ
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            r5.getAttributeValue(r2, r1)
            java.lang.String r1 = "permission"
            r5.getAttributeValue(r2, r1)
        L11:
            int r1 = r5.next()
            java.lang.String r2 = r5.getName()
            r3 = 3
            if (r1 != r3) goto L25
            java.lang.String r3 = "receiver"
            boolean r3 = defpackage.AbstractC1592.m2875(r3, r2)
            if (r3 == 0) goto L25
            return r0
        L25:
            r3 = 2
            if (r1 != r3) goto L43
            java.lang.String r4 = "intent-filter"
            boolean r4 = defpackage.AbstractC1592.m2875(r4, r2)
            if (r4 == 0) goto L43
            java.util.ArrayList r1 = r0.f9117
            if (r1 != 0) goto L3b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f9117 = r1
        L3b:
            ᲇᲇᛴᲈ r2 = m2948(r5)
            r1.add(r2)
            goto L11
        L43:
            if (r1 != r3) goto L11
            java.lang.String r1 = "meta-data"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r2)
            if (r1 == 0) goto L11
            java.util.ArrayList r1 = r0.f9118
            if (r1 != 0) goto L58
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f9118 = r1
        L58:
            ᲈᛶᲁᛸ r2 = m2977(r5)
            r1.add(r2)
            goto L11
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static defpackage.C1067[] m2967(java.io.ByteArrayInputStream r9, int r10, defpackage.C1067[] r11) {
            int r0 = r9.available()
            r1 = 0
            if (r0 != 0) goto La
            ᛶᛵᛲᛶ[] r9 = new defpackage.C1067[r1]
            return r9
        La:
            int r0 = r11.length
            r2 = 0
            if (r10 != r0) goto L54
            java.lang.String[] r0 = new java.lang.String[r10]
            int[] r3 = new int[r10]
            r4 = r1
        L13:
            if (r4 >= r10) goto L32
            r5 = 2
            long r6 = m2973(r9, r5)
            int r6 = (int) r6
            long r7 = m2973(r9, r5)
            int r5 = (int) r7
            r3[r4] = r5
            java.lang.String r5 = new java.lang.String
            byte[] r6 = m2949(r9, r6)
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            r5.<init>(r6, r7)
            r0[r4] = r5
            int r4 = r4 + 1
            goto L13
        L32:
            if (r1 >= r10) goto L53
            r4 = r11[r1]
            java.lang.String r5 = r4.f4754
            r6 = r0[r1]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L4d
            r5 = r3[r1]
            r4.f4750 = r5
            int[] r5 = m2947(r9, r5)
            r4.f4748 = r5
            int r1 = r1 + 1
            goto L32
        L4d:
            java.lang.String r9 = "Order of dexfiles in metadata did not match baseline"
            defpackage.C2264.m3676(r9)
            return r2
        L53:
            return r11
        L54:
            java.lang.String r9 = "Mismatched number of dex files found in metadata"
            defpackage.C2264.m3676(r9)
            return r2
    }

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public static defpackage.C1067[] m2968(java.io.ByteArrayInputStream r19, java.lang.String r20, int r21) {
            r0 = r19
            r1 = r21
            int r2 = r0.available()
            r3 = 0
            if (r2 != 0) goto Le
            ᛶᛵᛲᛶ[] r0 = new defpackage.C1067[r3]
            return r0
        Le:
            ᛶᛵᛲᛶ[] r2 = new defpackage.C1067[r1]
            r4 = r3
        L11:
            r5 = 2
            if (r4 >= r1) goto L50
            long r6 = m2973(r0, r5)
            int r6 = (int) r6
            long r7 = m2973(r0, r5)
            int r14 = (int) r7
            r5 = 4
            long r7 = m2973(r0, r5)
            long r12 = m2973(r0, r5)
            long r9 = m2973(r0, r5)
            ᛶᛵᛲᛶ r5 = new ᛶᛵᛲᛶ
            java.lang.String r11 = new java.lang.String
            byte[] r6 = m2949(r0, r6)
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_8
            r11.<init>(r6, r15)
            int r15 = (int) r7
            int r6 = (int) r9
            int[] r7 = new int[r14]
            java.util.TreeMap r18 = new java.util.TreeMap
            r18.<init>()
            r10 = r20
            r9 = r5
            r16 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18)
            r2[r4] = r9
            int r4 = r4 + 1
            goto L11
        L50:
            r4 = r3
        L51:
            if (r4 >= r1) goto L11b
            r6 = r2[r4]
            int r7 = r0.available()
            int r8 = r6.f4755
            int r9 = r6.f4756
            java.util.TreeMap r10 = r6.f4749
            int r7 = r7 - r8
            r8 = r3
        L61:
            int r11 = r0.available()
            r12 = 7
            if (r11 <= r7) goto Lb4
            long r13 = m2973(r0, r5)
            int r11 = (int) r13
            int r8 = r8 + r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r10.put(r11, r14)
            long r14 = m2973(r0, r5)
            int r11 = (int) r14
        L7f:
            if (r11 <= 0) goto L61
            m2973(r0, r5)
            long r14 = m2973(r0, r13)
            int r14 = (int) r14
            r15 = 6
            if (r14 != r15) goto L90
        L8c:
            r15 = r3
            r16 = r4
            goto Lae
        L90:
            if (r14 != r12) goto L93
            goto L8c
        L93:
            if (r14 <= 0) goto L8c
            m2973(r0, r13)
            r15 = r3
            r16 = r4
            long r3 = m2973(r0, r13)
            int r3 = (int) r3
        La0:
            if (r3 <= 0) goto La8
            m2973(r0, r5)
            int r3 = r3 + (-1)
            goto La0
        La8:
            int r14 = r14 + (-1)
            r3 = r15
            r4 = r16
            goto L93
        Lae:
            int r11 = r11 + (-1)
            r3 = r15
            r4 = r16
            goto L7f
        Lb4:
            r15 = r3
            r16 = r4
            int r3 = r0.available()
            if (r3 != r7) goto L114
            int r3 = r6.f4750
            int[] r3 = m2947(r0, r3)
            r6.f4748 = r3
            int r3 = r9 * 2
            int r3 = r3 + r12
            r3 = r3 & (-8)
            int r3 = r3 / 8
            byte[] r3 = m2949(r0, r3)
            java.util.BitSet r3 = java.util.BitSet.valueOf(r3)
            r4 = r15
        Ld5:
            if (r4 >= r9) goto L10f
            boolean r6 = r3.get(r4)
            if (r6 == 0) goto Ldf
            r6 = r5
            goto Le0
        Ldf:
            r6 = r15
        Le0:
            int r7 = r4 + r9
            boolean r7 = r3.get(r7)
            if (r7 == 0) goto Lea
            r6 = r6 | 4
        Lea:
            if (r6 == 0) goto L10c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r10.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto Lfc
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
        Lfc:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            int r7 = r7.intValue()
            r6 = r6 | r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.put(r8, r6)
        L10c:
            int r4 = r4 + 1
            goto Ld5
        L10f:
            int r4 = r16 + 1
            r3 = r15
            goto L51
        L114:
            java.lang.String r0 = "Read too much data during profile line parse"
            defpackage.C2264.m3676(r0)
            r0 = 0
            return r0
        L11b:
            return r2
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public static defpackage.C1067[] m2969(java.io.ByteArrayInputStream r10, byte[] r11, int r12, defpackage.C1067[] r13) {
            int r0 = r10.available()
            r1 = 0
            if (r0 != 0) goto La
            ᛶᛵᛲᛶ[] r10 = new defpackage.C1067[r1]
            return r10
        La:
            int r0 = r13.length
            r2 = 0
            if (r12 != r0) goto L82
            r0 = r1
        Lf:
            if (r0 >= r12) goto L81
            r3 = 2
            m2973(r10, r3)
            long r4 = m2973(r10, r3)
            int r4 = (int) r4
            java.lang.String r5 = new java.lang.String
            byte[] r4 = m2949(r10, r4)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            r5.<init>(r4, r6)
            r4 = 4
            long r6 = m2973(r10, r4)
            long r3 = m2973(r10, r3)
            int r3 = (int) r3
            int r4 = r13.length
            if (r4 > 0) goto L34
        L32:
            r4 = r2
            goto L60
        L34:
            java.lang.String r4 = "!"
            int r4 = r5.indexOf(r4)
            if (r4 >= 0) goto L42
            java.lang.String r4 = ":"
            int r4 = r5.indexOf(r4)
        L42:
            if (r4 <= 0) goto L4b
            int r4 = r4 + 1
            java.lang.String r4 = r5.substring(r4)
            goto L4c
        L4b:
            r4 = r5
        L4c:
            r8 = r1
        L4d:
            int r9 = r13.length
            if (r8 >= r9) goto L32
            r9 = r13[r8]
            java.lang.String r9 = r9.f4754
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L5d
            r4 = r13[r8]
            goto L60
        L5d:
            int r8 = r8 + 1
            goto L4d
        L60:
            if (r4 == 0) goto L77
            r4.f4751 = r6
            int[] r5 = m2947(r10, r3)
            byte[] r6 = defpackage.AbstractC0069.f775
            boolean r6 = java.util.Arrays.equals(r11, r6)
            if (r6 == 0) goto L74
            r4.f4750 = r3
            r4.f4748 = r5
        L74:
            int r0 = r0 + 1
            goto Lf
        L77:
            java.lang.String r10 = "Missing profile key: "
            java.lang.String r10 = r10.concat(r5)
            defpackage.C2264.m3676(r10)
            return r2
        L81:
            return r13
        L82:
            java.lang.String r10 = "Mismatched number of dex files found in metadata"
            defpackage.C2264.m3676(r10)
            return r2
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public static int m2970(java.io.RandomAccessFile r1) {
            byte r0 = r1.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = r1.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r0
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static defpackage.C2144 m2971(android.content.res.XmlResourceParser r5) {
            ᲇᲇᛴᲈ r0 = new ᲇᲇᛴᲈ
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            r5.getAttributeValue(r2, r1)
            java.lang.String r1 = "permission"
            r5.getAttributeValue(r2, r1)
        L11:
            int r1 = r5.next()
            java.lang.String r2 = r5.getName()
            r3 = 3
            if (r1 != r3) goto L25
            java.lang.String r3 = "service"
            boolean r3 = defpackage.AbstractC1592.m2875(r3, r2)
            if (r3 == 0) goto L25
            return r0
        L25:
            r3 = 2
            if (r1 != r3) goto L43
            java.lang.String r4 = "intent-filter"
            boolean r4 = defpackage.AbstractC1592.m2875(r4, r2)
            if (r4 == 0) goto L43
            java.util.ArrayList r1 = r0.f9117
            if (r1 != 0) goto L3b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f9117 = r1
        L3b:
            ᲇᲇᛴᲈ r2 = m2948(r5)
            r1.add(r2)
            goto L11
        L43:
            if (r1 != r3) goto L11
            java.lang.String r1 = "meta-data"
            boolean r1 = defpackage.AbstractC1592.m2875(r1, r2)
            if (r1 == 0) goto L11
            java.util.ArrayList r1 = r0.f9118
            if (r1 != 0) goto L58
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f9118 = r1
        L58:
            ᲈᛶᲁᛸ r2 = m2977(r5)
            r1.add(r2)
            goto L11
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static void m2972(java.nio.ByteBuffer r1, int r2) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.put(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.put(r0)
            int r2 = r2 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r1.put(r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public static long m2973(java.io.InputStream r6, int r7) {
            byte[] r6 = m2949(r6, r7)
            r0 = 0
            r2 = 0
        L7:
            if (r2 >= r7) goto L15
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛱᛱ, reason: contains not printable characters */
    public static void m2974(java.io.ByteArrayOutputStream r4, defpackage.C1067 r5) {
            java.util.TreeMap r5 = r5.f4749
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        Lc:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r2 = r2 & 1
            if (r2 != 0) goto L31
            goto Lc
        L31:
            int r1 = r3 - r1
            m2955(r4, r1)
            m2955(r4, r0)
            r1 = r3
            goto Lc
        L3b:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0554 m2975() {
            ᛳᲁᛳᛴ r0 = new ᛳᲁᛳᛴ
            ᛸᛷᛱᛷ r1 = defpackage.AbstractC1754.m3149()
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r2 = defpackage.AbstractC1497.f6594
            ᛳᛵᲈᛵ r1 = defpackage.AbstractC0397.m1146(r1, r2)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static void m2976(defpackage.C0554 r3) {
            ᛳᛵᲈᛵ r0 = r3.f2727
            ᛷᲈᲀ r1 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r0 = r0.mo970(r1)
            ᲇᛳᛸᛳ r0 = (defpackage.InterfaceC2023) r0
            if (r0 == 0) goto L1c
            ᛴᛲᛵᛵ r0 = (defpackage.AbstractC0624) r0
            ᛷᛲᛷᛷ r3 = new ᛷᛲᛷᛷ
            java.lang.String r1 = r0.mo919()
            r2 = 0
            r3.<init>(r1, r2, r0)
            r0.m1435(r3)
            return
        L1c:
            java.lang.String r0 = "Scope cannot be cancelled because it does not have a job: "
            defpackage.C2264.m3681(r3, r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static defpackage.C2273 m2977(android.content.res.XmlResourceParser r4) {
            ᲈᛶᲁᛸ r0 = new ᲈᛶᲁᛸ
            r0.<init>()
            java.lang.String r1 = ""
            r0.f9620 = r1
            java.lang.String r1 = "name"
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r4.getAttributeValue(r2, r1)
            r0.f9620 = r1
            java.lang.String r1 = "value"
            java.lang.String r1 = r4.getAttributeValue(r2, r1)
            r0.f9621 = r1
            java.lang.String r1 = "resource"
            r3 = 0
            r4.getAttributeResourceValue(r2, r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public static defpackage.C1067[] m2978(java.io.FileInputStream r6, byte[] r7, java.lang.String r8) {
            byte[] r0 = defpackage.AbstractC0069.f772
            boolean r7 = java.util.Arrays.equals(r7, r0)
            r0 = 0
            if (r7 == 0) goto L41
            r7 = 1
            long r1 = m2973(r6, r7)
            int r7 = (int) r1
            r1 = 4
            long r2 = m2973(r6, r1)
            long r4 = m2973(r6, r1)
            int r1 = (int) r4
            int r2 = (int) r2
            byte[] r1 = m2944(r6, r1, r2)
            int r6 = r6.read()
            if (r6 > 0) goto L3b
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r1)
            ᛶᛵᛲᛶ[] r7 = m2968(r6, r8, r7)     // Catch: java.lang.Throwable -> L31
            r6.close()
            return r7
        L31:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r6 = move-exception
            r7.addSuppressed(r6)
        L3a:
            throw r7
        L3b:
            java.lang.String r6 = "Content found after the end of file"
            defpackage.C2264.m3676(r6)
            return r0
        L41:
            java.lang.String r6 = "Unsupported version"
            defpackage.C2264.m3676(r6)
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public static boolean m2979(java.io.ByteArrayOutputStream r19, byte[] r20, defpackage.C1067[] r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            byte[] r3 = defpackage.AbstractC0069.f775
            byte[] r4 = defpackage.AbstractC0069.f770
            byte[] r5 = defpackage.AbstractC0069.f774
            boolean r6 = java.util.Arrays.equals(r1, r5)
            r7 = 4
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L260
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 3
            r1.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            int r10 = r2.length     // Catch: java.lang.Throwable -> L63
            m2955(r6, r10)     // Catch: java.lang.Throwable -> L63
            r10 = 2
            r11 = r8
            r12 = r10
        L2c:
            int r13 = r2.length     // Catch: java.lang.Throwable -> L63
            if (r11 >= r13) goto L65
            r13 = r2[r11]     // Catch: java.lang.Throwable -> L63
            long r14 = r13.f4752     // Catch: java.lang.Throwable -> L63
            m2964(r6, r14, r7)     // Catch: java.lang.Throwable -> L63
            long r14 = r13.f4751     // Catch: java.lang.Throwable -> L63
            m2964(r6, r14, r7)     // Catch: java.lang.Throwable -> L63
            int r14 = r13.f4756     // Catch: java.lang.Throwable -> L63
            long r14 = (long) r14     // Catch: java.lang.Throwable -> L63
            m2964(r6, r14, r7)     // Catch: java.lang.Throwable -> L63
            java.lang.String r14 = r13.f4753     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = r13.f4754     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = m2965(r14, r13, r5)     // Catch: java.lang.Throwable -> L63
            int r12 = r12 + 14
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L63
            byte[] r15 = r13.getBytes(r14)     // Catch: java.lang.Throwable -> L63
            int r15 = r15.length     // Catch: java.lang.Throwable -> L63
            m2955(r6, r15)     // Catch: java.lang.Throwable -> L63
            int r12 = r12 + r15
            byte[] r13 = r13.getBytes(r14)     // Catch: java.lang.Throwable -> L63
            r6.write(r13)     // Catch: java.lang.Throwable -> L63
            int r11 = r11 + 1
            goto L2c
        L60:
            r1 = r0
            goto L257
        L63:
            r0 = move-exception
            goto L60
        L65:
            byte[] r5 = r6.toByteArray()     // Catch: java.lang.Throwable -> L63
            int r11 = r5.length     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = ", does not match actual size "
            java.lang.String r14 = "Expected size "
            if (r12 != r11) goto L23b
            ᲁᛵᛵᲇ r11 = new ᲁᛵᛵᲇ     // Catch: java.lang.Throwable -> L63
            r11.<init>(r9, r5, r8)     // Catch: java.lang.Throwable -> L63
            r6.close()
            r1.add(r11)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            r6 = r8
            r11 = r6
        L82:
            int r12 = r2.length     // Catch: java.lang.Throwable -> Lb5
            if (r6 >= r12) goto Lb7
            r12 = r2[r6]     // Catch: java.lang.Throwable -> Lb5
            m2955(r5, r6)     // Catch: java.lang.Throwable -> Lb5
            int r11 = r11 + 4
            int r15 = r12.f4750     // Catch: java.lang.Throwable -> Lb5
            m2955(r5, r15)     // Catch: java.lang.Throwable -> Lb5
            int r15 = r12.f4750     // Catch: java.lang.Throwable -> Lb5
            int r15 = r15 * r10
            int r11 = r11 + r15
            int[] r12 = r12.f4748     // Catch: java.lang.Throwable -> Lb5
            int r15 = r12.length     // Catch: java.lang.Throwable -> Lb5
            r17 = r8
        L9a:
            if (r8 >= r15) goto Lac
            r18 = r12[r8]     // Catch: java.lang.Throwable -> Lb5
            r20 = r10
            int r10 = r18 - r17
            m2955(r5, r10)     // Catch: java.lang.Throwable -> Lb5
            int r8 = r8 + 1
            r10 = r20
            r17 = r18
            goto L9a
        Lac:
            r20 = r10
            int r6 = r6 + 1
            r8 = 0
            goto L82
        Lb2:
            r1 = r0
            goto L232
        Lb5:
            r0 = move-exception
            goto Lb2
        Lb7:
            r20 = r10
            byte[] r6 = r5.toByteArray()     // Catch: java.lang.Throwable -> Lb5
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb5
            if (r11 != r8) goto L216
            ᲁᛵᛵᲇ r8 = new ᲁᛵᛵᲇ     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r3, r6, r9)     // Catch: java.lang.Throwable -> Lb5
            r5.close()
            r1.add(r8)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            r6 = 0
            r8 = 0
        Ld2:
            int r10 = r2.length     // Catch: java.lang.Throwable -> L136
            if (r6 >= r10) goto L150
            r10 = r2[r6]     // Catch: java.lang.Throwable -> L136
            java.util.TreeMap r11 = r10.f4749     // Catch: java.lang.Throwable -> L136
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> L136
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L136
            r12 = 0
        Le2:
            boolean r15 = r11.hasNext()     // Catch: java.lang.Throwable -> L136
            if (r15 == 0) goto Lfa
            java.lang.Object r15 = r11.next()     // Catch: java.lang.Throwable -> L136
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch: java.lang.Throwable -> L136
            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Throwable -> L136
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch: java.lang.Throwable -> L136
            int r15 = r15.intValue()     // Catch: java.lang.Throwable -> L136
            r12 = r12 | r15
            goto Le2
        Lfa:
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L136
            r11.<init>()     // Catch: java.lang.Throwable -> L136
            m2946(r11, r12, r10)     // Catch: java.lang.Throwable -> L145
            byte[] r15 = r11.toByteArray()     // Catch: java.lang.Throwable -> L145
            r11.close()     // Catch: java.lang.Throwable -> L136
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L136
            r11.<init>()     // Catch: java.lang.Throwable -> L136
            m2974(r11, r10)     // Catch: java.lang.Throwable -> L13a
            byte[] r10 = r11.toByteArray()     // Catch: java.lang.Throwable -> L13a
            r11.close()     // Catch: java.lang.Throwable -> L136
            m2955(r5, r6)     // Catch: java.lang.Throwable -> L136
            int r11 = r15.length     // Catch: java.lang.Throwable -> L136
            int r11 = r11 + 2
            int r3 = r10.length     // Catch: java.lang.Throwable -> L136
            int r11 = r11 + r3
            int r8 = r8 + 6
            r3 = r10
            long r9 = (long) r11     // Catch: java.lang.Throwable -> L136
            m2964(r5, r9, r7)     // Catch: java.lang.Throwable -> L136
            m2955(r5, r12)     // Catch: java.lang.Throwable -> L136
            r5.write(r15)     // Catch: java.lang.Throwable -> L136
            r5.write(r3)     // Catch: java.lang.Throwable -> L136
            int r8 = r8 + r11
            int r6 = r6 + 1
            r3 = 3
            r9 = 1
            goto Ld2
        L136:
            r0 = move-exception
            r1 = r0
            goto L20d
        L13a:
            r0 = move-exception
            r1 = r0
            r11.close()     // Catch: java.lang.Throwable -> L140
            goto L144
        L140:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L136
        L144:
            throw r1     // Catch: java.lang.Throwable -> L136
        L145:
            r0 = move-exception
            r1 = r0
            r11.close()     // Catch: java.lang.Throwable -> L14b
            goto L14f
        L14b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L136
        L14f:
            throw r1     // Catch: java.lang.Throwable -> L136
        L150:
            byte[] r2 = r5.toByteArray()     // Catch: java.lang.Throwable -> L136
            int r3 = r2.length     // Catch: java.lang.Throwable -> L136
            if (r8 != r3) goto L1f1
            ᲁᛵᛵᲇ r3 = new ᲁᛵᛵᲇ     // Catch: java.lang.Throwable -> L136
            r6 = 1
            r3.<init>(r7, r2, r6)     // Catch: java.lang.Throwable -> L136
            r5.close()
            r1.add(r3)
            int r2 = r1.size()
            int r2 = r2 * 16
            long r2 = (long) r2
            r5 = 12
            long r5 = r5 + r2
            int r2 = r1.size()
            long r2 = (long) r2
            m2964(r0, r2, r7)
            r2 = 0
        L176:
            int r3 = r1.size()
            if (r2 >= r3) goto L1da
            java.lang.Object r3 = r1.get(r2)
            ᲁᛵᛵᲇ r3 = (defpackage.C1858) r3
            int r8 = r3.f8104
            byte[] r9 = r3.f8105
            r10 = 0
            r12 = 1
            if (r8 == r12) goto L1a5
            r12 = r20
            r13 = 3
            if (r8 == r12) goto L1a2
            if (r8 == r13) goto L19f
            if (r8 == r7) goto L19c
            r14 = 5
            if (r8 != r14) goto L19a
            r14 = 4
            goto L1a9
        L19a:
            r0 = 0
            throw r0
        L19c:
            r14 = 3
            goto L1a9
        L19f:
            r14 = 2
            goto L1a9
        L1a2:
            r14 = 1
            goto L1a9
        L1a5:
            r12 = r20
            r13 = 3
            r14 = r10
        L1a9:
            m2964(r0, r14, r7)
            m2964(r0, r5, r7)
            boolean r3 = r3.f8103
            if (r3 == 0) goto L1c8
            int r3 = r9.length
            long r10 = (long) r3
            byte[] r3 = m2980(r9)
            r4.add(r3)
            int r8 = r3.length
            long r8 = (long) r8
            m2964(r0, r8, r7)
            m2964(r0, r10, r7)
            int r3 = r3.length
        L1c5:
            long r8 = (long) r3
            long r5 = r5 + r8
            goto L1d5
        L1c8:
            r4.add(r9)
            int r3 = r9.length
            long r14 = (long) r3
            m2964(r0, r14, r7)
            m2964(r0, r10, r7)
            int r3 = r9.length
            goto L1c5
        L1d5:
            int r2 = r2 + 1
            r20 = r12
            goto L176
        L1da:
            r8 = 0
        L1db:
            int r1 = r4.size()
            if (r8 >= r1) goto L1ed
            java.lang.Object r1 = r4.get(r8)
            byte[] r1 = (byte[]) r1
            r0.write(r1)
            int r8 = r8 + 1
            goto L1db
        L1ed:
            r18 = 1
            goto L386
        L1f1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L136
            r0.<init>()     // Catch: java.lang.Throwable -> L136
            r0.append(r14)     // Catch: java.lang.Throwable -> L136
            r0.append(r8)     // Catch: java.lang.Throwable -> L136
            r0.append(r13)     // Catch: java.lang.Throwable -> L136
            int r1 = r2.length     // Catch: java.lang.Throwable -> L136
            r0.append(r1)     // Catch: java.lang.Throwable -> L136
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L136
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L136
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L136
            throw r1     // Catch: java.lang.Throwable -> L136
        L20d:
            r5.close()     // Catch: java.lang.Throwable -> L211
            goto L215
        L211:
            r0 = move-exception
            r1.addSuppressed(r0)
        L215:
            throw r1
        L216:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5
            r0.append(r14)     // Catch: java.lang.Throwable -> Lb5
            r0.append(r11)     // Catch: java.lang.Throwable -> Lb5
            r0.append(r13)     // Catch: java.lang.Throwable -> Lb5
            int r1 = r6.length     // Catch: java.lang.Throwable -> Lb5
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb5
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb5
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb5
            throw r1     // Catch: java.lang.Throwable -> Lb5
        L232:
            r5.close()     // Catch: java.lang.Throwable -> L236
            goto L23a
        L236:
            r0 = move-exception
            r1.addSuppressed(r0)
        L23a:
            throw r1
        L23b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            r0.append(r14)     // Catch: java.lang.Throwable -> L63
            r0.append(r12)     // Catch: java.lang.Throwable -> L63
            r0.append(r13)     // Catch: java.lang.Throwable -> L63
            int r1 = r5.length     // Catch: java.lang.Throwable -> L63
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L63
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63
            throw r1     // Catch: java.lang.Throwable -> L63
        L257:
            r6.close()     // Catch: java.lang.Throwable -> L25b
            goto L25f
        L25b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L25f:
            throw r1
        L260:
            byte[] r5 = defpackage.AbstractC0069.f772
            boolean r6 = java.util.Arrays.equals(r1, r5)
            if (r6 == 0) goto L284
            byte[] r1 = m2939(r2, r5)
            int r2 = r2.length
            long r2 = (long) r2
            r6 = 1
            m2964(r0, r2, r6)
            int r2 = r1.length
            long r2 = (long) r2
            m2964(r0, r2, r7)
            byte[] r1 = m2980(r1)
            int r2 = r1.length
            long r2 = (long) r2
            m2964(r0, r2, r7)
            r0.write(r1)
            return r6
        L284:
            r6 = 1
            boolean r5 = java.util.Arrays.equals(r1, r4)
            if (r5 == 0) goto L2f8
            int r1 = r2.length
            long r8 = (long) r1
            m2964(r0, r8, r6)
            int r1 = r2.length
            r3 = 0
        L292:
            if (r3 >= r1) goto L1ed
            r5 = r2[r3]
            java.util.TreeMap r6 = r5.f4749
            int r6 = r6.size()
            int r6 = r6 * r7
            java.lang.String r8 = r5.f4753
            java.lang.String r9 = r5.f4754
            java.lang.String r8 = m2965(r8, r9, r4)
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r8.getBytes(r9)
            int r10 = r10.length
            m2955(r0, r10)
            int[] r10 = r5.f4748
            int r10 = r10.length
            m2955(r0, r10)
            long r10 = (long) r6
            m2964(r0, r10, r7)
            long r10 = r5.f4752
            m2964(r0, r10, r7)
            byte[] r6 = r8.getBytes(r9)
            r0.write(r6)
            java.util.TreeMap r6 = r5.f4749
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L2cf:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L2e7
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            m2955(r0, r8)
            r8 = 0
            m2955(r0, r8)
            goto L2cf
        L2e7:
            int[] r5 = r5.f4748
            int r6 = r5.length
            r8 = 0
        L2eb:
            if (r8 >= r6) goto L2f5
            r9 = r5[r8]
            m2955(r0, r9)
            int r8 = r8 + 1
            goto L2eb
        L2f5:
            int r3 = r3 + 1
            goto L292
        L2f8:
            byte[] r4 = defpackage.AbstractC0069.f771
            boolean r5 = java.util.Arrays.equals(r1, r4)
            if (r5 == 0) goto L31c
            byte[] r1 = m2939(r2, r4)
            int r2 = r2.length
            long r2 = (long) r2
            r6 = 1
            m2964(r0, r2, r6)
            int r2 = r1.length
            long r2 = (long) r2
            m2964(r0, r2, r7)
            byte[] r1 = m2980(r1)
            int r2 = r1.length
            long r2 = (long) r2
            m2964(r0, r2, r7)
            r0.write(r1)
            return r6
        L31c:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L387
            int r1 = r2.length
            m2955(r0, r1)
            int r1 = r2.length
            r8 = 0
        L328:
            if (r8 >= r1) goto L1ed
            r4 = r2[r8]
            java.lang.String r5 = r4.f4753
            java.util.TreeMap r6 = r4.f4749
            java.lang.String r9 = r4.f4754
            java.lang.String r5 = m2965(r5, r9, r3)
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r5.getBytes(r9)
            int r10 = r10.length
            m2955(r0, r10)
            int r10 = r6.size()
            m2955(r0, r10)
            int[] r10 = r4.f4748
            int r10 = r10.length
            m2955(r0, r10)
            long r10 = r4.f4752
            m2964(r0, r10, r7)
            byte[] r5 = r5.getBytes(r9)
            r0.write(r5)
            java.util.Set r5 = r6.keySet()
            java.util.Iterator r5 = r5.iterator()
        L361:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L375
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            m2955(r0, r6)
            goto L361
        L375:
            int[] r4 = r4.f4748
            int r5 = r4.length
            r6 = 0
        L379:
            if (r6 >= r5) goto L383
            r9 = r4[r6]
            m2955(r0, r9)
            int r6 = r6 + 1
            goto L379
        L383:
            int r8 = r8 + 1
            goto L328
        L386:
            return r18
        L387:
            r16 = 0
            return r16
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static byte[] m2980(byte[] r3) {
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = 1
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L1e
            r2.write(r3)     // Catch: java.lang.Throwable -> L20
            r2.close()     // Catch: java.lang.Throwable -> L1e
            r0.end()
            byte[] r3 = r1.toByteArray()
            return r3
        L1e:
            r3 = move-exception
            goto L2a
        L20:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch: java.lang.Throwable -> L1e
        L29:
            throw r3     // Catch: java.lang.Throwable -> L1e
        L2a:
            r0.end()
            throw r3
    }
}
