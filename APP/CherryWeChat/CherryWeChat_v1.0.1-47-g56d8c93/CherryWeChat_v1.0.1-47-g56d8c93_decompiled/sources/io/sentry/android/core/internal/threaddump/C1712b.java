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
import java.nio.BufferUnderflowException;
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
    public static final Pattern f6186f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: g */
    public static final Pattern f6187g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: h */
    public static final Pattern f6188h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* JADX INFO: renamed from: i */
    public static final Pattern f6189i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* JADX INFO: renamed from: j */
    public static final Pattern f6190j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: k */
    public static final Pattern f6191k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l */
    public static final Pattern f6192l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: m */
    public static final Pattern f6193m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n */
    public static final Pattern f6194n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: o */
    public static final Pattern f6195o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: p */
    public static final Pattern f6196p = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: q */
    public static final Pattern f6197q = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6198a;

    /* JADX INFO: renamed from: b */
    public final boolean f6199b;

    /* JADX INFO: renamed from: c */
    public final C2002t f6200c;

    /* JADX INFO: renamed from: d */
    public final HashMap f6201d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f6202e = new ArrayList();

    public C1712b(C2046v2 c2046v2, boolean z) {
        this.f6198a = c2046v2;
        this.f6199b = z;
        this.f6200c = new C2002t(c2046v2, 2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3886a(C1976z c1976z, C1828b2 c1828b2) {
        Map map = c1976z.f7068j;
        if (map == null) {
            map = new HashMap();
        }
        C1828b2 c1828b22 = (C1828b2) map.get(c1828b2.f6606b);
        if (c1828b22 != null) {
            c1828b22.f6605a = Math.max(c1828b22.f6605a, c1828b2.f6605a);
        } else {
            String str = c1828b2.f6606b;
            C1828b2 c1828b23 = new C1828b2();
            c1828b23.f6605a = c1828b2.f6605a;
            c1828b23.f6606b = str;
            c1828b23.f6607c = c1828b2.f6607c;
            c1828b23.f6608d = c1828b2.f6608d;
            c1828b23.f6609e = c1828b2.f6609e;
            c1828b23.f6610f = AbstractC1856a.m4045A(c1828b2.f6610f);
            map.put(str, c1828b23);
        }
        c1976z.f7068j = map;
    }

    /* JADX INFO: renamed from: b */
    public static Long m3887b(Matcher matcher, int i) {
        String strGroup = matcher.group(i);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3888c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017e, code lost:
    
        r30 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017e A[EDGE_INSN: B:138:0x017e->B:53:0x017e BREAK  A[LOOP:1: B:48:0x0168->B:124:0x0440], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ec  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3889d(C1540ib c1540ib) {
        int i;
        Pattern pattern;
        String str;
        Matcher matcher;
        Pattern pattern2;
        Matcher matcher2;
        String str2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        Matcher matcher11;
        String str3;
        Integer numValueOf;
        C1540ib c1540ib2 = c1540ib;
        int i2 = c1540ib2.f5436b;
        Pattern pattern3 = f6186f;
        String str4 = "";
        Matcher matcher12 = pattern3.matcher("");
        Pattern pattern4 = f6187g;
        Matcher matcher13 = pattern4.matcher("");
        while (c1540ib2.f5437c < i2) {
            C1711a c1711aM2955a = c1540ib2.m2955a();
            String str5 = "Internal error while parsing thread dump.";
            C2046v2 c2046v2 = this.f6198a;
            if (c1711aM2955a == null) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str6 = c1711aM2955a.f6185a;
            if (m3888c(matcher12, str6) || m3888c(matcher13, str6)) {
                c1540ib2.f5437c--;
                C1976z c1976z = new C1976z();
                Matcher matcher14 = pattern3.matcher(str4);
                Matcher matcher15 = pattern4.matcher(str4);
                if (c1540ib2.f5437c >= i2) {
                    i = i2;
                    pattern = pattern3;
                    str = str4;
                    matcher = matcher12;
                    pattern2 = pattern4;
                    matcher2 = matcher13;
                    c1976z = null;
                    if (c1976z != null) {
                        this.f6202e.add(c1976z);
                    }
                } else {
                    C1711a c1711aM2955a2 = c1540ib2.m2955a();
                    if (c1711aM2955a2 == null) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                    } else {
                        String str7 = c1711aM2955a2.f6185a;
                        if (m3888c(matcher14, str7)) {
                            Long lM3887b = m3887b(matcher14, 4);
                            if (lM3887b == null) {
                                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                            } else {
                                c1976z.f7059a = lM3887b;
                                c1976z.f7061c = matcher14.group(1);
                                String strGroup = matcher14.group(5);
                                if (strGroup != null) {
                                    if (strGroup.contains(" ")) {
                                        c1976z.f7062d = strGroup.substring(0, strGroup.indexOf(32));
                                    } else {
                                        c1976z.f7062d = strGroup;
                                    }
                                }
                                str2 = c1976z.f7061c;
                                if (str2 != null) {
                                    boolean zEquals = str2.equals("main");
                                    c1976z.f7066h = Boolean.valueOf(zEquals);
                                    c1976z.f7063e = Boolean.valueOf(zEquals);
                                    c1976z.f7064f = Boolean.valueOf(zEquals && !this.f6199b);
                                }
                                ArrayList arrayList = new ArrayList();
                                Matcher matcher16 = f6188h.matcher(str4);
                                matcher3 = f6189i.matcher(str4);
                                Matcher matcher17 = f6190j.matcher(str4);
                                Matcher matcher18 = f6191k.matcher(str4);
                                pattern = pattern3;
                                Matcher matcher19 = f6193m.matcher(str4);
                                matcher = matcher12;
                                Matcher matcher20 = f6192l.matcher(str4);
                                pattern2 = pattern4;
                                Matcher matcher21 = f6195o.matcher(str4);
                                matcher2 = matcher13;
                                matcher4 = f6194n.matcher(str4);
                                matcher5 = f6196p.matcher(str4);
                                str = str4;
                                matcher6 = f6197q.matcher(str4);
                                C1974x c1974x = null;
                                while (true) {
                                    if (c1540ib2.f5437c >= i2) {
                                        break;
                                    }
                                    C1711a c1711aM2955a3 = c1540ib2.m2955a();
                                    if (c1711aM2955a3 == null) {
                                        c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, str5, new Object[0]);
                                        break;
                                    }
                                    String str8 = c1711aM2955a3.f6185a;
                                    boolean zM3888c = m3888c(matcher3, str8);
                                    C2002t c2002t = this.f6200c;
                                    i = i2;
                                    String str9 = str5;
                                    if (zM3888c) {
                                        c1974x = new C1974x();
                                        matcher7 = matcher4;
                                        String str10 = matcher3.group(1) + "." + matcher3.group(2);
                                        c1974x.f7038f = str10;
                                        c1974x.f7037e = matcher3.group(3);
                                        c1974x.f7036d = matcher3.group(4);
                                        String strGroup2 = matcher3.group(5);
                                        if (strGroup2 == null || strGroup2.length() == 0) {
                                            numValueOf = null;
                                            c1974x.f7039g = numValueOf;
                                            c1974x.f7043k = c2002t.m4156c(str10);
                                            arrayList.add(c1974x);
                                            matcher8 = matcher3;
                                        } else {
                                            int i3 = Integer.parseInt(strGroup2);
                                            numValueOf = Integer.valueOf(i3);
                                            if (i3 < 0) {
                                            }
                                            c1974x.f7039g = numValueOf;
                                            c1974x.f7043k = c2002t.m4156c(str10);
                                            arrayList.add(c1974x);
                                            matcher8 = matcher3;
                                        }
                                        matcher5 = matcher10;
                                        matcher6 = matcher11;
                                        matcher3 = matcher8;
                                        i2 = i;
                                        str5 = str9;
                                        matcher4 = matcher9;
                                        c1540ib2 = c1540ib;
                                    } else {
                                        matcher7 = matcher4;
                                        if (m3888c(matcher16, str8)) {
                                            C1974x c1974x2 = new C1974x();
                                            c1974x2.f7044l = matcher16.group(3);
                                            c1974x2.f7037e = matcher16.group(6);
                                            String strGroup3 = matcher16.group(7);
                                            c1974x2.f7039g = (strGroup3 == null || strGroup3.length() == 0) ? null : Integer.valueOf(Integer.parseInt(strGroup3));
                                            c1974x2.f7049q = "0x" + matcher16.group(2);
                                            c1974x2.f7046n = "native";
                                            String strGroup4 = matcher16.group(8);
                                            if (strGroup4 == null) {
                                                str3 = null;
                                                if (str3 == null) {
                                                    HashMap map = this.f6201d;
                                                    if (map.containsKey(str3)) {
                                                        matcher8 = matcher3;
                                                    } else {
                                                        DebugImage debugImage = new DebugImage();
                                                        debugImage.setDebugId(str3);
                                                        debugImage.setType("elf");
                                                        matcher8 = matcher3;
                                                        debugImage.setCodeFile(matcher16.group(4));
                                                        debugImage.setCodeId(strGroup4);
                                                        map.put(str3, debugImage);
                                                    }
                                                    c1974x2.f7050r = "rel:".concat(str3);
                                                } else {
                                                    matcher8 = matcher3;
                                                }
                                                arrayList.add(c1974x2);
                                                c1974x = null;
                                            } else {
                                                try {
                                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10" + strGroup4, 16).toByteArray());
                                                    byteBufferWrap.get();
                                                    str3 = String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
                                                } catch (NumberFormatException | BufferUnderflowException unused) {
                                                    str3 = null;
                                                }
                                                if (str3 == null) {
                                                }
                                                arrayList.add(c1974x2);
                                                c1974x = null;
                                            }
                                            matcher5 = matcher10;
                                            matcher6 = matcher11;
                                            matcher3 = matcher8;
                                            i2 = i;
                                            str5 = str9;
                                            matcher4 = matcher9;
                                            c1540ib2 = c1540ib;
                                        } else {
                                            matcher8 = matcher3;
                                            if (m3888c(matcher17, str8)) {
                                                c1974x = new C1974x();
                                                String str11 = matcher17.group(1) + "." + matcher17.group(2);
                                                c1974x.f7038f = str11;
                                                c1974x.f7037e = matcher17.group(3);
                                                c1974x.f7043k = c2002t.m4156c(str11);
                                                c1974x.f7045m = Boolean.TRUE;
                                                arrayList.add(c1974x);
                                            } else if (m3888c(matcher18, str8)) {
                                                if (c1974x != null) {
                                                    C1828b2 c1828b2 = new C1828b2();
                                                    c1828b2.f6605a = 1;
                                                    c1828b2.f6606b = matcher18.group(1);
                                                    c1828b2.f6607c = matcher18.group(2);
                                                    c1828b2.f6608d = matcher18.group(3);
                                                    c1974x.f7054v = c1828b2;
                                                    m3886a(c1976z, c1828b2);
                                                }
                                            } else if (m3888c(matcher19, str8)) {
                                                if (c1974x != null) {
                                                    C1828b2 c1828b22 = new C1828b2();
                                                    c1828b22.f6605a = 2;
                                                    c1828b22.f6606b = matcher19.group(1);
                                                    c1828b22.f6607c = matcher19.group(2);
                                                    c1828b22.f6608d = matcher19.group(3);
                                                    c1974x.f7054v = c1828b22;
                                                    m3886a(c1976z, c1828b22);
                                                }
                                            } else if (m3888c(matcher20, str8)) {
                                                if (c1974x != null) {
                                                    C1828b2 c1828b23 = new C1828b2();
                                                    c1828b23.f6605a = 4;
                                                    c1828b23.f6606b = matcher20.group(1);
                                                    c1828b23.f6607c = matcher20.group(2);
                                                    c1828b23.f6608d = matcher20.group(3);
                                                    c1974x.f7054v = c1828b23;
                                                    m3886a(c1976z, c1828b23);
                                                }
                                            } else if (!m3888c(matcher21, str8)) {
                                                matcher9 = matcher7;
                                                if (!m3888c(matcher9, str8)) {
                                                    matcher10 = matcher5;
                                                    if (!m3888c(matcher10, str8)) {
                                                        if (str8.length() == 0) {
                                                            break;
                                                        }
                                                        matcher11 = matcher6;
                                                        if (m3888c(matcher11, str8)) {
                                                            break;
                                                        }
                                                        matcher5 = matcher10;
                                                        matcher6 = matcher11;
                                                        matcher3 = matcher8;
                                                        i2 = i;
                                                        str5 = str9;
                                                        matcher4 = matcher9;
                                                        c1540ib2 = c1540ib;
                                                    } else if (c1974x != null) {
                                                        C1828b2 c1828b24 = new C1828b2();
                                                        c1828b24.f6605a = 8;
                                                        c1974x.f7054v = c1828b24;
                                                        m3886a(c1976z, c1828b24);
                                                    }
                                                } else {
                                                    if (c1974x != null) {
                                                        C1828b2 c1828b25 = new C1828b2();
                                                        c1828b25.f6605a = 8;
                                                        c1828b25.f6606b = matcher9.group(1);
                                                        c1828b25.f6607c = matcher9.group(2);
                                                        c1828b25.f6608d = matcher9.group(3);
                                                        c1974x.f7054v = c1828b25;
                                                        m3886a(c1976z, c1828b25);
                                                    }
                                                    matcher10 = matcher5;
                                                }
                                                matcher11 = matcher6;
                                                matcher5 = matcher10;
                                                matcher6 = matcher11;
                                                matcher3 = matcher8;
                                                i2 = i;
                                                str5 = str9;
                                                matcher4 = matcher9;
                                                c1540ib2 = c1540ib;
                                            } else if (c1974x != null) {
                                                C1828b2 c1828b26 = new C1828b2();
                                                c1828b26.f6605a = 8;
                                                c1828b26.f6606b = matcher21.group(1);
                                                c1828b26.f6607c = matcher21.group(2);
                                                c1828b26.f6608d = matcher21.group(3);
                                                c1828b26.f6609e = m3887b(matcher21, 4);
                                                c1974x.f7054v = c1828b26;
                                                m3886a(c1976z, c1828b26);
                                            }
                                        }
                                    }
                                    matcher10 = matcher5;
                                    matcher11 = matcher6;
                                    matcher9 = matcher7;
                                    matcher5 = matcher10;
                                    matcher6 = matcher11;
                                    matcher3 = matcher8;
                                    i2 = i;
                                    str5 = str9;
                                    matcher4 = matcher9;
                                    c1540ib2 = c1540ib;
                                }
                                Collections.reverse(arrayList);
                                C1975y c1975y = new C1975y(arrayList);
                                c1975y.f7057c = Boolean.TRUE;
                                c1976z.f7067i = c1975y;
                            }
                        } else {
                            if (m3888c(matcher15, str7)) {
                                Long lM3887b2 = m3887b(matcher15, 3);
                                if (lM3887b2 == null) {
                                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                } else {
                                    c1976z.f7059a = lM3887b2;
                                    c1976z.f7061c = matcher15.group(1);
                                }
                            }
                            str2 = c1976z.f7061c;
                            if (str2 != null) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Matcher matcher162 = f6188h.matcher(str4);
                            matcher3 = f6189i.matcher(str4);
                            Matcher matcher172 = f6190j.matcher(str4);
                            Matcher matcher182 = f6191k.matcher(str4);
                            pattern = pattern3;
                            Matcher matcher192 = f6193m.matcher(str4);
                            matcher = matcher12;
                            Matcher matcher202 = f6192l.matcher(str4);
                            pattern2 = pattern4;
                            Matcher matcher212 = f6195o.matcher(str4);
                            matcher2 = matcher13;
                            matcher4 = f6194n.matcher(str4);
                            matcher5 = f6196p.matcher(str4);
                            str = str4;
                            matcher6 = f6197q.matcher(str4);
                            C1974x c1974x3 = null;
                            while (true) {
                                if (c1540ib2.f5437c >= i2) {
                                }
                                matcher5 = matcher10;
                                matcher6 = matcher11;
                                matcher3 = matcher8;
                                i2 = i;
                                str5 = str9;
                                matcher4 = matcher9;
                                c1540ib2 = c1540ib;
                            }
                            Collections.reverse(arrayList2);
                            C1975y c1975y2 = new C1975y(arrayList2);
                            c1975y2.f7057c = Boolean.TRUE;
                            c1976z.f7067i = c1975y2;
                        }
                        if (c1976z != null) {
                        }
                    }
                    i = i2;
                    pattern = pattern3;
                    str = str4;
                    matcher = matcher12;
                    pattern2 = pattern4;
                    matcher2 = matcher13;
                    c1976z = null;
                    if (c1976z != null) {
                    }
                }
            } else {
                i = i2;
                pattern = pattern3;
                str = str4;
                matcher = matcher12;
                pattern2 = pattern4;
                matcher2 = matcher13;
            }
            c1540ib2 = c1540ib;
            pattern3 = pattern;
            matcher12 = matcher;
            pattern4 = pattern2;
            matcher13 = matcher2;
            str4 = str;
            i2 = i;
        }
    }
}
