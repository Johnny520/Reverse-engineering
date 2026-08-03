package io.sentry.android.core.internal.threaddump;

import io.sentry.C1828b2;
import io.sentry.C2002t;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1974x;
import io.sentry.protocol.C1975y;
import io.sentry.protocol.C1976z;
import io.sentry.protocol.DebugImage;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.C1540ib;

/* JADX INFO: renamed from: io.sentry.android.core.internal.threaddump.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1712b {

    /* JADX INFO: renamed from: f */
    public static final Pattern f6186f = null;

    /* JADX INFO: renamed from: g */
    public static final Pattern f6187g = null;

    /* JADX INFO: renamed from: h */
    public static final Pattern f6188h = null;

    /* JADX INFO: renamed from: i */
    public static final Pattern f6189i = null;

    /* JADX INFO: renamed from: j */
    public static final Pattern f6190j = null;

    /* JADX INFO: renamed from: k */
    public static final Pattern f6191k = null;

    /* JADX INFO: renamed from: l */
    public static final Pattern f6192l = null;

    /* JADX INFO: renamed from: m */
    public static final Pattern f6193m = null;

    /* JADX INFO: renamed from: n */
    public static final Pattern f6194n = null;

    /* JADX INFO: renamed from: o */
    public static final Pattern f6195o = null;

    /* JADX INFO: renamed from: p */
    public static final Pattern f6196p = null;

    /* JADX INFO: renamed from: q */
    public static final Pattern f6197q = null;

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6198a;

    /* JADX INFO: renamed from: b */
    public final boolean f6199b;

    /* JADX INFO: renamed from: c */
    public final C2002t f6200c;

    /* JADX INFO: renamed from: d */
    public final HashMap f6201d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f6202e;

    static {
        f6186f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
        f6187g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
        f6188h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
        f6189i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
        f6190j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
        f6191k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
        f6192l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
        f6193m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
        f6194n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
        f6195o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
        f6196p = Pattern.compile(" *- waiting to lock an unknown object");
        f6197q = Pattern.compile("\\s+");
    }

    public C1712b(C2046v2 r2, boolean r3) {
        this.f6198a = r2;
        this.f6199b = r3;
        this.f6200c = new C2002t(r2, 2);
        this.f6201d = new HashMap();
        this.f6202e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m3886a(C1976z r4, C1828b2 r5) {
        Map r0 = r4.f7068j;
        if (r0 != null) goto L5;
        r0 = new HashMap();
    L5:
        C1828b2 r1 = (C1828b2) r0.get(r5.f6606b);
        if (r1 == null) goto L8;
        r1.f6605a = Math.max(r1.f6605a, r5.f6605a);
    L9:
        r4.f7068j = r0;
        return;
    L8:
        String r12 = r5.f6606b;
        C1828b2 r2 = new C1828b2();
        r2.f6605a = r5.f6605a;
        r2.f6606b = r12;
        r2.f6607c = r5.f6607c;
        r2.f6608d = r5.f6608d;
        r2.f6609e = r5.f6609e;
        r2.f6610f = AbstractC1856a.m4045A(r5.f6610f);
        r0.put(r12, r2);
        goto L9
    }

    /* JADX INFO: renamed from: b */
    public static Long m3887b(Matcher r0, int r1) {
        String r02 = r0.group(r1);
        if (r02 != null) goto L5;
        return null;
    L5:
        if (r02.length() != 0) goto L8;
        return null;
    L8:
        return Long.valueOf(Long.parseLong(r02));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3888c(Matcher r0, String r1) {
        r0.reset(r1);
        return r0.matches();
    }

    /* JADX INFO: renamed from: d */
    public final void m3889d(C1540ib r39) {
        C1540ib r1 = r39;
        int r2 = r1.f5436b;
        Pattern r3 = f6186f;
        String r4 = "";
        Matcher r5 = r3.matcher("");
        Pattern r6 = f6187g;
        Matcher r7 = r6.matcher("");
    L4:
        if (r1.f5437c >= r2) goto L129;
        C1711a r8 = r1.m2955a();
        String r10 = "Internal error while parsing thread dump.";
        C2046v2 r11 = this.f6198a;
        if (r8 == null) goto L7;
        String r82 = r8.f6185a;
        if (m3888c(r5, r82) == false) goto L12;
    L15:
        r1.f5437c--;
        C1976z r83 = new C1976z();
        Matcher r13 = r3.matcher(r4);
        Matcher r14 = r6.matcher(r4);
        if (r1.f5437c >= r2) goto L20;
        C1711a r15 = r1.m2955a();
        if (r15 != null) goto L21;
        r11.getLogger().mo3680e(EnumC1657a2.WARNING, "Internal error while parsing thread dump.", new Object[0]);
        goto L20
    L21:
        String r152 = r15.f6185a;
        if (m3888c(r13, r152) == false) goto L33;
        Long r142 = m3887b(r13, 4);
        if (r142 != null) goto L26;
        r11.getLogger().mo3680e(EnumC1657a2.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
        goto L20
    L26:
        r83.f7059a = r142;
        r83.f7061c = r13.group(1);
        String r132 = r13.group(5);
        if (r132 != null) goto L29;
    L38:
        String r12 = r83.f7061c;
        if (r12 == null) goto L47;
        boolean r122 = r12.equals("main");
        r83.f7066h = Boolean.valueOf(r122);
        r83.f7063e = Boolean.valueOf(r122);
        if (r122 == true) goto L43;
    L45:
        boolean r123 = false;
    L46:
        r83.f7064f = Boolean.valueOf(r123);
        goto L47
    L43:
        if (this.f6199b == true) goto L45;
        r123 = true;
    L47:
        ArrayList r124 = new ArrayList();
        Matcher r133 = f6188h.matcher(r4);
        Matcher r143 = f6189i.matcher(r4);
        Matcher r153 = f6190j.matcher(r4);
        Matcher r9 = f6191k.matcher(r4);
        Pattern r21 = r3;
        Matcher r32 = f6193m.matcher(r4);
        Matcher r22 = r5;
        Matcher r52 = f6192l.matcher(r4);
        Pattern r23 = r6;
        Matcher r62 = f6195o.matcher(r4);
        Matcher r24 = r7;
        Matcher r72 = f6194n.matcher(r4);
        Matcher r26 = f6196p.matcher(r4);
        String r27 = r4;
        Matcher r28 = f6197q.matcher(r4);
        C1974x r42 = null;
    L49:
        if (r1.f5437c >= r2) goto L53;
        C1711a r112 = r1.m2955a();
        if (r112 == null) goto L52;
        String r113 = r112.f6185a;
        boolean r29 = m3888c(r143, r113);
        C2002t r16 = this.f6200c;
        int r30 = r2;
        String r31 = r10;
        if (r29 == false) goto L67;
        r42 = new C1974x();
        Matcher r292 = r72;
        String r25 = r143.group(1) + "." + r143.group(2);
        r42.f7038f = r25;
        r42.f7037e = r143.group(3);
        r42.f7036d = r143.group(4);
        String r102 = r143.group(5);
        if (r102 != null) goto L59;
    L64:
        Integer r114 = null;
    L65:
        r42.f7039g = r114;
        r42.f7043k = r16.m4156c(r25);
        r124.add(r42);
        Matcher r19 = r143;
    L66:
        Matcher r210 = r26;
        Matcher r73 = r28;
        Matcher r17 = r292;
    L124:
        r26 = r210;
        r28 = r73;
        r143 = r19;
        r2 = r30;
        r10 = r31;
        r72 = r17;
        r1 = r39;
        goto L49
    L59:
        if (r102.length() == 0) goto L64;
        int r103 = Integer.parseInt(r102);
        r114 = Integer.valueOf(r103);
        if (r103 < 0) goto L64;
    L67:
        r292 = r72;
        if (m3888c(r133, r113) == false) goto L89;
        C1974x r18 = new C1974x();
        r18.f7044l = r133.group(3);
        r18.f7037e = r133.group(6);
        String r211 = r133.group(7);
        if (r211 != null) goto L72;
    L75:
        Integer r212 = null;
    L76:
        r18.f7039g = r212;
        r18.f7049q = "0x" + r133.group(2);
        r18.f7046n = "native";
        String r213 = r133.group(8);
        if (r213 != null) goto L131;
    L78:
        String r43 = null;
    L81:
        if (r43 == null) goto L87;
        HashMap r74 = this.f6201d;
        if (r74.containsKey(r43) == true) goto L85;
        DebugImage r104 = new DebugImage();
        r104.setDebugId(r43);
        r104.setType("elf");
        r19 = r143;
        r104.setCodeFile(r133.group(4));
        r104.setCodeId(r213);
        r74.put(r43, r104);
    L86:
        r18.f7050r = "rel:".concat(r43);
    L88:
        r124.add(r18);
        r42 = null;
        goto L66
    L85:
        r19 = r143;
        goto L86
    L87:
        r19 = r143;
        goto L88
    L131:
        ByteBuffer r44 = ByteBuffer.wrap(new BigInteger("10" + r213, 16).toByteArray());     // Catch: Throwable -> L130
        r44.get();     // Catch: Throwable -> L130
        r43 = String.format("%08x-%04x-%04x-%04x-%04x%08x", new Object[]{Integer.valueOf(r44.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(r44.getShort()), Short.valueOf(r44.getShort()), Short.valueOf(r44.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(r44.getShort()), Integer.valueOf(r44.getInt())});     // Catch: Throwable -> L130
    L72:
        if (r211.length() == 0) goto L75;
        r212 = Integer.valueOf(Integer.parseInt(r211));
        goto L76
    L89:
        r19 = r143;
        if (m3888c(r153, r113) == false) goto L93;
        r42 = new C1974x();
        String r214 = r153.group(1) + "." + r153.group(2);
        r42.f7038f = r214;
        r42.f7037e = r153.group(3);
        r42.f7043k = r16.m4156c(r214);
        r42.f7045m = Boolean.TRUE;
        r124.add(r42);
        goto L66
    L93:
        if (m3888c(r9, r113) == false) goto L97;
        if (r42 == null) goto L66;
        C1828b2 r110 = new C1828b2();
        r110.f6605a = 1;
        r110.f6606b = r9.group(1);
        r110.f6607c = r9.group(2);
        r110.f6608d = r9.group(3);
        r42.f7054v = r110;
        m3886a(r83, r110);
        goto L66
    L97:
        if (m3888c(r32, r113) == false) goto L101;
        if (r42 == null) goto L66;
        C1828b2 r111 = new C1828b2();
        r111.f6605a = 2;
        r111.f6606b = r32.group(1);
        r111.f6607c = r32.group(2);
        r111.f6608d = r32.group(3);
        r42.f7054v = r111;
        m3886a(r83, r111);
        goto L66
    L101:
        if (m3888c(r52, r113) == false) goto L105;
        if (r42 == null) goto L66;
        C1828b2 r115 = new C1828b2();
        r115.f6605a = 4;
        r115.f6606b = r52.group(1);
        r115.f6607c = r52.group(2);
        r115.f6608d = r52.group(3);
        r42.f7054v = r115;
        m3886a(r83, r115);
        goto L66
    L105:
        if (m3888c(r62, r113) == false) goto L108;
        if (r42 == null) goto L66;
        C1828b2 r116 = new C1828b2();
        r116.f6605a = 8;
        r116.f6606b = r62.group(1);
        r116.f6607c = r62.group(2);
        r116.f6608d = r62.group(3);
        r116.f6609e = m3887b(r62, 4);
        r42.f7054v = r116;
        m3886a(r83, r116);
        goto L66
    L108:
        r17 = r292;
        if (m3888c(r17, r113) == false) goto L115;
        if (r42 == null) goto L112;
        C1828b2 r117 = new C1828b2();
        r117.f6605a = 8;
        r117.f6606b = r17.group(1);
        r117.f6607c = r17.group(2);
        r117.f6608d = r17.group(3);
        r42.f7054v = r117;
        m3886a(r83, r117);
    L112:
        r210 = r26;
    L113:
        r73 = r28;
        goto L124
    L115:
        r210 = r26;
        if (m3888c(r210, r113) == false) goto L120;
        if (r42 == null) goto L113;
        C1828b2 r118 = new C1828b2();
        r118.f6605a = 8;
        r42.f7054v = r118;
        m3886a(r83, r118);
        goto L113
    L120:
        if (r113.length() == 0) goto L125;
        r73 = r28;
        if (m3888c(r73, r113) == false) goto L124;
    L125:
        Collections.reverse(r124);
        C1975y r119 = new C1975y(r124);
        r119.f7057c = Boolean.TRUE;
        r83.f7067i = r119;
    L126:
        if (r83 == null) goto L128;
        this.f6202e.add(r83);
    L128:
        r1 = r39;
        r3 = r21;
        r5 = r22;
        r6 = r23;
        r7 = r24;
        r4 = r27;
        r2 = r30;
        goto L4
    L52:
        r11.getLogger().mo3680e(EnumC1657a2.WARNING, r10, new Object[0]);
    L53:
        r30 = r2;
        goto L125
    L29:
        if (r132.contains(" ") == false) goto L31;
        r83.f7062d = r132.substring(0, r132.indexOf(32));
        goto L38
    L31:
        r83.f7062d = r132;
        goto L38
    L33:
        if (m3888c(r14, r152) == false) goto L38;
        Long r154 = m3887b(r14, 3);
        if (r154 != null) goto L37;
        r11.getLogger().mo3680e(EnumC1657a2.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
        goto L20
    L37:
        r83.f7059a = r154;
        r83.f7061c = r14.group(1);
    L20:
        r30 = r2;
        r21 = r3;
        r27 = r4;
        r22 = r5;
        r23 = r6;
        r24 = r7;
        r83 = null;
        goto L126
    L12:
        if (m3888c(r7, r82) == true) goto L15;
        r30 = r2;
        r21 = r3;
        r27 = r4;
        r22 = r5;
        r23 = r6;
        r24 = r7;
        goto L128
    L7:
        r11.getLogger().mo3680e(EnumC1657a2.WARNING, "Internal error while parsing thread dump.", new Object[0]);
        return;
    }
}
