package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: e2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0151e2 extends yn0 implements in0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2296o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0151e2(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f2296o = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e0 A[PHI: r5
  0x01e0: PHI (r5v79 c51) = (r5v31 c51), (r5v62 c51) binds: [B:96:0x01de, B:176:0x030d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v20 */
    /* JADX WARN: Type inference failed for: r24v21 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7, types: [long] */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.StringBuilder] */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        z22 z22Var;
        a83 a83Var;
        Object obj2;
        String string;
        Long lM6015g0;
        String str;
        Object x92Var;
        String str2;
        Throwable thM6237a;
        ?? r24;
        Throwable th;
        ?? r242;
        Throwable cause;
        String message;
        Object objInvoke;
        ?? r243;
        Object ro2Var;
        String string2;
        String string3;
        String str3;
        C0180ev c0180ev;
        c51 c51Var;
        boolean z;
        c51 c51Var2;
        c51 c51Var3;
        c51 c51Var4;
        Integer numValueOf;
        int i = this.f2296o;
        a83 a83Var2 = a83.f116a;
        Object obj3 = this.f963i;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0399kt c0399kt = (C0399kt) obj3;
                dk1 dk1Var = c0399kt.f5752I;
                if (zBooleanValue) {
                    c0399kt.m2737S0();
                } else if (c0399kt.f5761x != null) {
                    Object[] objArr = dk1Var.f2088c;
                    long[] jArr = dk1Var.f2086a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        AbstractC0570p7.m3745A(c0399kt.m5255A0(), null, new C0299i2(c0399kt, (z22) objArr[(i2 << 3) + i4], null, 0), 3);
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    z22 z22Var2 = c0399kt.f5754K;
                    if (z22Var2 != null) {
                        z22Var = null;
                        AbstractC0570p7.m3745A(c0399kt.m5255A0(), null, new C0299i2(c0399kt, z22Var2, false ? 1 : 0, 1), 3);
                    } else {
                        z22Var = null;
                    }
                    dk1Var.m1046a();
                    c0399kt.f5754K = z22Var;
                }
                return a83Var2;
            case 1:
                md3 md3Var = (md3) obj;
                md3Var.getClass();
                ((C0163ee) obj3).getClass();
                String str4 = C0163ee.f2410h;
                List list = md3Var.f6580a;
                Object objM1162r0 = AbstractC0142du.m1162r0(0, list);
                String str5 = objM1162r0 instanceof String ? (String) objM1162r0 : null;
                if (str5 == null) {
                    a83Var = a83Var2;
                } else {
                    Object objM1162r02 = AbstractC0142du.m1162r0(1, list);
                    String str6 = objM1162r02 instanceof String ? (String) objM1162r02 : null;
                    if (str6 != null && str6.equals("sysmsg") && pv2.m3995h0(str5, "revokemsg", false)) {
                        Map map = md3Var.f6581b;
                        Object obj4 = map.get(".sysmsg.$type");
                        if (t11.m5086l(obj4 != null ? obj4.toString() : null, "revokemsg") && (obj2 = map.get(".sysmsg.revokemsg.newmsgid")) != null && (string = obj2.toString()) != null && (lM6015g0 = wv2.m6015g0(string, 10)) != null) {
                            long jLongValue = lM6015g0.longValue();
                            bd3 bd3VarM1005m = dd3.m1005m(yc3.f13411k, "SELECT type, content, talker, createTime, lvbuffer,\n       msgId, msgSvrId, isSend, status\nFROM message\nWHERE msgSvrId = ?\nLIMIT 1", new String[]{String.valueOf(jLongValue)}, new C0151e2(1, zi1.f13919a, zi1.class, "invoke", "invoke(Landroid/database/Cursor;)Lnuke/module/wechat/data/MsgInfoBean;", 0, 0, 9));
                            cd3 cd3Var = cd3.f1491o;
                            if (!(bd3VarM1005m instanceof ad3)) {
                                if (!(bd3VarM1005m instanceof zc3)) {
                                    c80.m675s();
                                }
                                return null;
                            }
                            bd3VarM1005m = new ad3(cd3Var.mo5j(((ad3) bd3VarM1005m).f163a));
                            if (bd3VarM1005m instanceof ad3) {
                                yi1 yi1Var = (yi1) ((ad3) bd3VarM1005m).f163a;
                                if (yi1Var != null) {
                                    String str7 = yi1Var.f13470c;
                                    if (yi1Var.f13468a != 0) {
                                        hg3.m2168f(str4, "Skipped outgoing revoke: msgSvrId=" + jLongValue);
                                        a83Var = a83Var2;
                                    } else {
                                        C0127de c0127deM1342r = C0163ee.m1342r(null);
                                        try {
                                            Object obj5 = map.get(".sysmsg.revokemsg.replacemsg");
                                            string2 = obj5 != null ? obj5.toString() : null;
                                            if (string2 == null) {
                                                string2 = "";
                                            }
                                            a83Var = a83Var2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            a83Var = a83Var2;
                                        }
                                        try {
                                            o72 o72Var = C0163ee.f2412j;
                                            o72Var.getClass();
                                            Matcher matcher = ((Pattern) o72Var.f7574i).matcher(string2);
                                            matcher.getClass();
                                            str = str7;
                                            try {
                                                kj1 kj1Var = !matcher.find(0) ? null : new kj1(matcher, string2);
                                                if (kj1Var == null || (str3 = (String) AbstractC0142du.m1162r0(2, kj1Var.m2715x())) == null || (string3 = pv2.m3993I0(str3).toString()) == null || string3.length() <= 0) {
                                                    string3 = null;
                                                }
                                                if (string3 != null) {
                                                    x92Var = C0163ee.m1341q(c0127deM1342r, string3, yi1Var, System.currentTimeMillis());
                                                    str2 = str;
                                                    break;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                x92Var = new x92(th);
                                                str2 = str;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str = str7;
                                            x92Var = new x92(th);
                                            str2 = str;
                                            thM6237a = y92.m6237a(x92Var);
                                            if (thM6237a != null) {
                                            }
                                            return a83Var;
                                        }
                                        thM6237a = y92.m6237a(x92Var);
                                        if (thM6237a != null) {
                                            String str8 = (String) x92Var;
                                            if (pv2.m4006s0(str8)) {
                                                hg3.m2166d(str4, "Skipped revoke interception because the system message is empty");
                                            } else {
                                                map.put(".sysmsg.$type", null);
                                                long j2 = yi1Var.f13476i + 1;
                                                boolean zM4006s0 = pv2.m4006s0(str2);
                                                po2 po2Var = po2.f8427k;
                                                if (zM4006s0) {
                                                    ro2Var = gd3.m1836i(po2Var, io2.f4716h, "Talker is empty", str2, null, null, 48);
                                                    r243 = str2;
                                                } else if (pv2.m4006s0(str8)) {
                                                    ro2Var = gd3.m1836i(po2Var, io2.f4717i, "System message content is empty", str2, null, null, 48);
                                                    r243 = str2;
                                                } else {
                                                    String str9 = str2;
                                                    try {
                                                        ContentValues contentValues = new ContentValues();
                                                        r24 = j2;
                                                        contentValues.put("msgid", (Long) 0L);
                                                        AbstractC0116d3 abstractC0116d3 = i52.f4282h;
                                                        contentValues.put("msgSvrId", Long.valueOf(r24 + ((long) i52.f4282h.mo935a().nextInt())));
                                                        contentValues.put("type", (Integer) 10000);
                                                        contentValues.put("status", (Integer) 3);
                                                        contentValues.put("createTime", Long.valueOf((long) r24));
                                                        contentValues.put("talker", str9);
                                                        contentValues.put("content", str8);
                                                        xi1.f13042d.getClass();
                                                        Object value = xi1.f13044f.getValue();
                                                        value.getClass();
                                                        Object objM1142c = AbstractC0141dt.m1142c((Class) value, new Object[0]);
                                                        sg1 sg1VarM3244v = op0.m3602y(objM1142c).m3244v();
                                                        sg1VarM3244v.m6411b();
                                                        sg1VarM3244v.f13871b = "convertFrom";
                                                        sg1VarM3244v.f10117i = new yb3(17);
                                                        ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0(contentValues, Boolean.TRUE);
                                                        hp2 hp2Var = hp2.f4103d;
                                                        qg1.f8960d.getClass();
                                                        Class cls = (Class) qg1.f8962f.getValue();
                                                        hp2Var.getClass();
                                                        sg1 sg1VarM3244v2 = op0.m3602y(hp2.m2227j(cls)).m3244v();
                                                        sg1VarM3244v2.m6411b();
                                                        sg1VarM3244v2.f10120l = 0;
                                                        bj1.f895d.getClass();
                                                        Object value2 = bj1.f897f.getValue();
                                                        value2.getClass();
                                                        sg1VarM3244v2.f10113C = (Class) value2;
                                                        Object objM6415g0 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v2.m4863c())).m6415g0(new Object[0]);
                                                        try {
                                                            if (objM6415g0 == null) {
                                                                throw new IllegalStateException("MsgInfoStorage service is not initialized");
                                                            }
                                                            Method method = (Method) bj1.f898g.getValue();
                                                            ig1.m2344a(method);
                                                            int parameterCount = method.getParameterCount();
                                                            try {
                                                                if (parameterCount == 1) {
                                                                    objInvoke = method.invoke(objM6415g0, objM1142c);
                                                                } else if (parameterCount == 2) {
                                                                    objInvoke = method.invoke(objM6415g0, objM1142c, Boolean.FALSE);
                                                                } else {
                                                                    if (parameterCount != 3) {
                                                                        throw new IllegalStateException(("Unsupported MsgInfoStorage insert parameter count: " + method.getParameterCount()).toString());
                                                                    }
                                                                    Boolean bool = Boolean.FALSE;
                                                                    objInvoke = method.invoke(objM6415g0, objM1142c, bool, bool);
                                                                }
                                                                Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
                                                                if (number == null) {
                                                                    throw new IllegalStateException("MsgInfoStorage insert returned no message id");
                                                                }
                                                                try {
                                                                    lo2 lo2Var = new lo2(str9, str8, r24, number.longValue());
                                                                    r243 = str9;
                                                                    ro2Var = new ro2(lo2Var);
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    r24 = str9;
                                                                    th = th;
                                                                    r242 = r24;
                                                                    cause = th;
                                                                    while (cause.getCause() != null) {
                                                                    }
                                                                    message = cause.getMessage();
                                                                    if (message == null) {
                                                                    }
                                                                    ro2Var = gd3.m1836i(po2Var, io2.f4725q, message, r242, null, th, 16);
                                                                    r243 = r242;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                r242 = str9;
                                                                cause = th;
                                                                while (cause.getCause() != null) {
                                                                    cause = cause.getCause();
                                                                    cause.getClass();
                                                                }
                                                                message = cause.getMessage();
                                                                if (message == null) {
                                                                }
                                                                ro2Var = gd3.m1836i(po2Var, io2.f4725q, message, r242, null, th, 16);
                                                                r243 = r242;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        r24 = str9;
                                                    }
                                                    th = th;
                                                    r242 = r24;
                                                    cause = th;
                                                    while (cause.getCause() != null && cause.getCause() != cause) {
                                                        cause = cause.getCause();
                                                        cause.getClass();
                                                    }
                                                    message = cause.getMessage();
                                                    if (message == null) {
                                                        message = th.getClass().getSimpleName();
                                                    }
                                                    ro2Var = gd3.m1836i(po2Var, io2.f4725q, message, r242, null, th, 16);
                                                    r243 = r242;
                                                }
                                                ?? r13 = r243;
                                                if (ro2Var instanceof ro2) {
                                                    hg3.m2168f(str4, "Blocked revoke: talker=" + r13 + ", msgSvrId=" + jLongValue + ", systemMsgId=" + ((lo2) ((ro2) ro2Var).f9664a).f6232d);
                                                } else {
                                                    if (!(ro2Var instanceof qo2)) {
                                                        c80.m675s();
                                                        return null;
                                                    }
                                                    hg3.m2166d(str4, "Revoke was blocked, but system message insertion failed: ".concat(((qo2) ro2Var).f9058a.f5132c));
                                                }
                                            }
                                        } else {
                                            C0163ee.f2406d.getClass();
                                            hg3.m2166d(str4, "Unable to build revoke system message: ".concat(fg1.m1624Q(thM6237a)));
                                        }
                                    }
                                    break;
                                }
                            } else {
                                a83Var = a83Var2;
                                if (!(bd3VarM1005m instanceof zc3)) {
                                    c80.m675s();
                                    return null;
                                }
                                hg3.m2166d(str4, "Unable to load revoked message " + jLongValue + ": " + ((zc3) bd3VarM1005m).f13836a.f12966c);
                            }
                        }
                    }
                }
                return a83Var;
            case 2:
                ((n21) obj3).mo1215l((Throwable) obj);
                return a83Var2;
            case 3:
                return ((af2) obj3).m149c(obj);
            case 4:
                return ((af2) obj3).m149c(obj);
            case 5:
                return ((af2) obj3).m149c(obj);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                long j3 = ((rs1) obj).f9744a;
                vy2 vy2Var = (vy2) obj3;
                vy2Var.getClass();
                zy2 zy2Var = (zy2) p40.m3733p(vy2Var, az2.f456a);
                if (zy2Var != null) {
                    AbstractC0570p7.m3745A(vy2Var.m5255A0(), null, new C0188f2(vy2Var, j3, zy2Var, new uy2(vy2Var, j3), (t00) null), 3);
                }
                return a83Var2;
            case 7:
                ((oy2) obj3).f7886b.m2925a((in0) obj);
                return a83Var2;
            case 8:
                KeyEvent keyEvent = ((d51) obj).f1868a;
                mz2 mz2Var = (mz2) obj3;
                e13 e13Var = mz2Var.f6939f;
                boolean z2 = mz2Var.f6937d;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    c0180ev = null;
                } else {
                    n40 n40Var = mz2Var.f6942i;
                    n40Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        n40Var.f6984a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = n40Var.f6984a;
                        if (num != null) {
                            n40Var.f6984a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        c0180ev = new C0180ev(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    }
                }
                if (c0180ev != null) {
                    if (z2) {
                        mz2Var.m3222a(AbstractC0179eu.m1434O(c0180ev));
                        e13Var.f2295a = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (qp0.m4222C(keyEvent) == 2) {
                    mz2Var.f6943j.getClass();
                    int iM1432M = AbstractC0179eu.m1432M(keyEvent);
                    int i5 = rp0.f9683o;
                    if (iM1432M == 9) {
                        long jM4938f = sp0.m4938f(keyEvent.getKeyCode());
                        c51Var = b51.m440a(jM4938f, b51.f586f) ? c51.f1178X : b51.m440a(jM4938f, b51.f587g) ? c51.f1179Y : b51.m440a(jM4938f, b51.f584d) ? c51.f1170P : b51.m440a(jM4938f, b51.f585e) ? c51.f1171Q : null;
                        if (c51Var == null) {
                            C0485n4 c0485n4 = s11.f9864d;
                            int i6 = rp0.f9684p;
                            int iM1432M2 = AbstractC0179eu.m1432M(keyEvent);
                            long jM4938f2 = sp0.m4938f(keyEvent.getKeyCode());
                            boolean zM440a = b51.m440a(jM4938f2, b51.f599s);
                            c51 c51Var5 = c51.f1181a0;
                            c51 c51Var6 = c51.f1157C;
                            if (!zM440a) {
                                c51Var2 = c51Var6;
                                c51Var3 = ((b51.m440a(jM4938f2, b51.f598r) || b51.m440a(jM4938f2, b51.f570E)) && (iM1432M2 == 0 || iM1432M2 == 8 || iM1432M2 == 2 || iM1432M2 == 10)) ? c51Var5 : null;
                            } else if (iM1432M2 != 0 && iM1432M2 != 8) {
                                int i7 = rp0.f9685q;
                                if (iM1432M2 == 12) {
                                    c51Var2 = c51Var6;
                                    c51Var3 = c51Var2;
                                } else {
                                    c51Var3 = (iM1432M2 == 2 || iM1432M2 == 10) ? c51.f1159E : null;
                                    c51Var2 = c51Var6;
                                }
                            }
                            if (c51Var3 != null) {
                                c51Var = c51Var3;
                            } else {
                                int iM1432M3 = AbstractC0179eu.m1432M(keyEvent);
                                c51 c51Var7 = c51.f1176V;
                                c51 c51Var8 = c51.f1177W;
                                if (iM1432M3 == 10) {
                                    long jM4938f3 = sp0.m4938f(keyEvent.getKeyCode());
                                    c51Var3 = (b51.m440a(jM4938f3, b51.f586f) || b51.m440a(jM4938f3, b51.f573H)) ? c51.f1172R : (b51.m440a(jM4938f3, b51.f587g) || b51.m440a(jM4938f3, b51.f574I)) ? c51.f1173S : (b51.m440a(jM4938f3, b51.f584d) || b51.m440a(jM4938f3, b51.f571F)) ? c51.f1175U : (b51.m440a(jM4938f3, b51.f585e) || b51.m440a(jM4938f3, b51.f572G)) ? c51.f1174T : null;
                                    if (c51Var3 != null) {
                                        Object obj6 = c0485n4.f6983i;
                                        int iM1432M4 = AbstractC0179eu.m1432M(keyEvent);
                                        c51 c51Var9 = c51.f1184d0;
                                        if (iM1432M4 == 10) {
                                            c51Var4 = b51.m440a(sp0.m4938f(keyEvent.getKeyCode()), b51.f595o) ? c51Var9 : null;
                                        } else {
                                            c51 c51Var10 = c51.f1203z;
                                            c51 c51Var11 = c51.f1156B;
                                            c51 c51Var12 = c51.f1155A;
                                            if (iM1432M4 == 2) {
                                                long jM4938f4 = sp0.m4938f(keyEvent.getKeyCode());
                                                if (b51.m440a(jM4938f4, b51.f590j) || b51.m440a(jM4938f4, b51.f604x) || b51.m440a(jM4938f4, b51.f579N)) {
                                                    c51Var4 = c51Var10;
                                                } else if (b51.m440a(jM4938f4, b51.f592l)) {
                                                    c51Var4 = c51Var12;
                                                } else if (b51.m440a(jM4938f4, b51.f593m)) {
                                                    c51Var4 = c51Var11;
                                                } else if (b51.m440a(jM4938f4, b51.f589i)) {
                                                    c51Var4 = c51.f1163I;
                                                } else if (!b51.m440a(jM4938f4, b51.f594n)) {
                                                    if (b51.m440a(jM4938f4, b51.f595o)) {
                                                        c51Var4 = c51.f1183c0;
                                                    }
                                                }
                                            } else if (iM1432M4 == 8) {
                                                long jM4938f5 = sp0.m4938f(keyEvent.getKeyCode());
                                                if (b51.m440a(jM4938f5, b51.f586f) || b51.m440a(jM4938f5, b51.f573H)) {
                                                    c51Var4 = c51.f1164J;
                                                } else if (b51.m440a(jM4938f5, b51.f587g) || b51.m440a(jM4938f5, b51.f574I)) {
                                                    c51Var4 = c51.f1165K;
                                                } else if (b51.m440a(jM4938f5, b51.f584d) || b51.m440a(jM4938f5, b51.f571F)) {
                                                    c51Var4 = c51.f1166L;
                                                } else if (b51.m440a(jM4938f5, b51.f585e) || b51.m440a(jM4938f5, b51.f572G)) {
                                                    c51Var4 = c51.f1167M;
                                                } else if (b51.m440a(jM4938f5, b51.f568C) || b51.m440a(jM4938f5, b51.f577L)) {
                                                    c51Var4 = c51.f1168N;
                                                } else if (b51.m440a(jM4938f5, b51.f569D) || b51.m440a(jM4938f5, b51.f578M)) {
                                                    c51Var4 = c51.f1169O;
                                                } else if (b51.m440a(jM4938f5, b51.f602v) || b51.m440a(jM4938f5, b51.f575J)) {
                                                    c51Var4 = c51Var7;
                                                } else if (b51.m440a(jM4938f5, b51.f603w) || b51.m440a(jM4938f5, b51.f576K)) {
                                                    c51Var4 = c51Var8;
                                                } else if (b51.m440a(jM4938f5, b51.f604x) || b51.m440a(jM4938f5, b51.f579N)) {
                                                }
                                            } else if (iM1432M4 == 0) {
                                                long jM4938f6 = sp0.m4938f(keyEvent.getKeyCode());
                                                if (b51.m440a(jM4938f6, b51.f586f) || b51.m440a(jM4938f6, b51.f573H)) {
                                                    c51Var4 = c51.f1186i;
                                                } else if (b51.m440a(jM4938f6, b51.f587g) || b51.m440a(jM4938f6, b51.f574I)) {
                                                    c51Var4 = c51.f1187j;
                                                } else if (b51.m440a(jM4938f6, b51.f584d) || b51.m440a(jM4938f6, b51.f571F)) {
                                                    c51Var4 = c51.f1196s;
                                                } else if (b51.m440a(jM4938f6, b51.f585e) || b51.m440a(jM4938f6, b51.f572G)) {
                                                    c51Var4 = c51.f1197t;
                                                } else if (b51.m440a(jM4938f6, b51.f588h)) {
                                                    c51Var4 = c51.f1198u;
                                                } else if (b51.m440a(jM4938f6, b51.f568C) || b51.m440a(jM4938f6, b51.f577L)) {
                                                    c51Var4 = c51.f1199v;
                                                } else if (b51.m440a(jM4938f6, b51.f569D) || b51.m440a(jM4938f6, b51.f578M)) {
                                                    c51Var4 = c51.f1200w;
                                                } else if (b51.m440a(jM4938f6, b51.f602v) || b51.m440a(jM4938f6, b51.f575J)) {
                                                    c51Var4 = c51.f1192o;
                                                } else if (b51.m440a(jM4938f6, b51.f603w) || b51.m440a(jM4938f6, b51.f576K)) {
                                                    c51Var4 = c51.f1193p;
                                                } else if (b51.m440a(jM4938f6, b51.f598r) || b51.m440a(jM4938f6, b51.f570E)) {
                                                    c51Var4 = c51Var5;
                                                } else if (b51.m440a(jM4938f6, b51.f599s)) {
                                                    c51Var4 = c51Var2;
                                                } else if (b51.m440a(jM4938f6, b51.f600t)) {
                                                    c51Var4 = c51.f1158D;
                                                } else if (!b51.m440a(jM4938f6, b51.f566A)) {
                                                    if (!b51.m440a(jM4938f6, b51.f605y)) {
                                                        if (!b51.m440a(jM4938f6, b51.f606z)) {
                                                            if (b51.m440a(jM4938f6, b51.f596p)) {
                                                                c51Var4 = c51.f1182b0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        c51Var = c51Var4;
                                    }
                                } else if (iM1432M3 == 2) {
                                    long jM4938f7 = sp0.m4938f(keyEvent.getKeyCode());
                                    if (b51.m440a(jM4938f7, b51.f586f) || b51.m440a(jM4938f7, b51.f573H)) {
                                        c51Var3 = c51.f1189l;
                                    } else if (b51.m440a(jM4938f7, b51.f587g) || b51.m440a(jM4938f7, b51.f574I)) {
                                        c51Var3 = c51.f1188k;
                                    } else if (b51.m440a(jM4938f7, b51.f584d) || b51.m440a(jM4938f7, b51.f571F)) {
                                        c51Var3 = c51.f1191n;
                                    } else if (b51.m440a(jM4938f7, b51.f585e) || b51.m440a(jM4938f7, b51.f572G)) {
                                        c51Var3 = c51.f1190m;
                                    } else if (b51.m440a(jM4938f7, b51.f591k)) {
                                        c51Var3 = c51Var2;
                                    } else if (b51.m440a(jM4938f7, b51.f600t)) {
                                        c51Var3 = c51.f1160F;
                                    } else if (b51.m440a(jM4938f7, b51.f567B)) {
                                        c51Var3 = c51.f1180Z;
                                    }
                                    if (c51Var3 != null) {
                                    }
                                } else if (iM1432M3 == 8) {
                                    long jM4938f8 = sp0.m4938f(keyEvent.getKeyCode());
                                    if (b51.m440a(jM4938f8, b51.f602v) || b51.m440a(jM4938f8, b51.f575J)) {
                                        c51Var3 = c51Var7;
                                    } else if (b51.m440a(jM4938f8, b51.f603w) || b51.m440a(jM4938f8, b51.f576K)) {
                                        c51Var3 = c51Var8;
                                    }
                                    if (c51Var3 != null) {
                                    }
                                } else {
                                    if (iM1432M3 == 1 && b51.m440a(sp0.m4938f(keyEvent.getKeyCode()), b51.f600t)) {
                                        c51Var3 = c51.f1162H;
                                    }
                                    if (c51Var3 != null) {
                                    }
                                }
                            }
                        }
                        if (c51Var == null && (!c51Var.f1204h || z2)) {
                            y62 y62Var = new y62();
                            y62Var.f13324h = true;
                            C0444m0 c0444m0 = new C0444m0(c51Var, mz2Var, y62Var, 13);
                            k03 k03Var = mz2Var.f6936c;
                            pz2 pz2Var = new pz2(k03Var, mz2Var.f6940g, mz2Var.f6934a.m5146d(), e13Var);
                            c0444m0.mo5j(pz2Var);
                            boolean zM1493b = f13.m1493b(pz2Var.f8654f, k03Var.f5297b);
                            C0690sd c0690sd = pz2Var.f8655g;
                            if (!zM1493b || !t11.m5086l(c0690sd, k03Var.f5296a)) {
                                mz2Var.f6944k.mo5j(k03.m2598a(k03Var, c0690sd, pz2Var.f8654f, 4));
                            }
                            w73 w73Var = mz2Var.f6941h;
                            if (w73Var != null) {
                                w73Var.f12390e = true;
                            }
                            z = y62Var.f13324h;
                        }
                    } else if (iM1432M == 1) {
                        long jM4938f9 = sp0.m4938f(keyEvent.getKeyCode());
                        if (b51.m440a(jM4938f9, b51.f586f)) {
                            c51Var = c51.f1194q;
                        } else if (b51.m440a(jM4938f9, b51.f587g)) {
                            c51Var = c51.f1195r;
                        } else if (b51.m440a(jM4938f9, b51.f584d)) {
                            c51Var = c51.f1201x;
                        } else if (b51.m440a(jM4938f9, b51.f585e)) {
                            c51Var = c51.f1202y;
                        } else if (b51.m440a(jM4938f9, b51.f599s)) {
                            c51Var = c51.f1161G;
                        }
                        if (c51Var == null) {
                        }
                        if (c51Var == null) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                Cursor cursor = (Cursor) obj;
                cursor.getClass();
                ((zi1) obj3).getClass();
                int iM3697G = p40.m3697G(cursor, "isSend");
                int iM3697G2 = p40.m3697G(cursor, "status");
                String strM3711V = p40.m3711V(cursor, "talker");
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("lvbuffer");
                return new yi1(iM3697G, iM3697G2, strM3711V, cursor.isNull(columnIndexOrThrow) ? null : cursor.getBlob(columnIndexOrThrow), p40.m3697G(cursor, "type"), p40.m3704N(cursor, "msgId"), 0L, p40.m3711V(cursor, "content"), p40.m3704N(cursor, "createTime"), p40.m3704N(cursor, "msgSvrId"), 0, 0L, 7168);
        }
    }
}
