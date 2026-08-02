package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e2 extends yn0 implements in0 {
    public final /* synthetic */ int o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.o = i4;
    }

    /* JADX DEBUG: Class process forced to load method for inline: gd3.i(po2, io2, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable, int):qo2 */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:445:0x075d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:491:0x090a */
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
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        z22 z22Var;
        a83 a83Var;
        Object obj2;
        String string;
        Long lG0;
        String str;
        Object x92Var;
        String str2;
        Throwable thA;
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
        ev evVar;
        c51 c51Var;
        boolean z;
        c51 c51Var2;
        c51 c51Var3;
        c51 c51Var4;
        Integer numValueOf;
        int i = this.o;
        a83 a83Var2 = a83.a;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                kt ktVar = (kt) obj3;
                dk1 dk1Var = ktVar.I;
                if (zBooleanValue) {
                    ktVar.S0();
                } else if (ktVar.x != null) {
                    Object[] objArr = dk1Var.c;
                    long[] jArr = dk1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        p7.A(ktVar.A0(), null, new i2(ktVar, (z22) objArr[(i2 << 3) + i4], null, 0), 3);
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
                    z22 z22Var2 = ktVar.K;
                    if (z22Var2 != null) {
                        z22Var = null;
                        p7.A(ktVar.A0(), null, new i2(ktVar, z22Var2, false ? 1 : 0, 1), 3);
                    } else {
                        z22Var = null;
                    }
                    dk1Var.a();
                    ktVar.K = z22Var;
                }
                return a83Var2;
            case 1:
                md3 md3Var = (md3) obj;
                md3Var.getClass();
                ((ee) obj3).getClass();
                String str4 = ee.h;
                List list = md3Var.a;
                Object objR0 = du.r0(0, list);
                String str5 = objR0 instanceof String ? (String) objR0 : null;
                if (str5 == null) {
                    a83Var = a83Var2;
                } else {
                    Object objR02 = du.r0(1, list);
                    String str6 = objR02 instanceof String ? (String) objR02 : null;
                    if (str6 != null && str6.equals("sysmsg") && pv2.h0(str5, "revokemsg", false)) {
                        Map map = md3Var.b;
                        Object obj4 = map.get(".sysmsg.$type");
                        if (t11.l(obj4 != null ? obj4.toString() : null, "revokemsg") && (obj2 = map.get(".sysmsg.revokemsg.newmsgid")) != null && (string = obj2.toString()) != null && (lG0 = wv2.g0(string, 10)) != null) {
                            long jLongValue = lG0.longValue();
                            bd3 bd3VarM = dd3.m(yc3.k, "SELECT type, content, talker, createTime, lvbuffer,\n       msgId, msgSvrId, isSend, status\nFROM message\nWHERE msgSvrId = ?\nLIMIT 1", new String[]{String.valueOf(jLongValue)}, new e2(1, zi1.a, zi1.class, "invoke", "invoke(Landroid/database/Cursor;)Lnuke/module/wechat/data/MsgInfoBean;", 0, 0, 9));
                            cd3 cd3Var = cd3.o;
                            if (!(bd3VarM instanceof ad3)) {
                                if (!(bd3VarM instanceof zc3)) {
                                    c80.s();
                                }
                                return null;
                            }
                            bd3VarM = new ad3(cd3Var.j(((ad3) bd3VarM).a));
                            if (bd3VarM instanceof ad3) {
                                yi1 yi1Var = (yi1) ((ad3) bd3VarM).a;
                                if (yi1Var != null) {
                                    String str7 = yi1Var.c;
                                    if (yi1Var.a != 0) {
                                        hg3.f(str4, "Skipped outgoing revoke: msgSvrId=" + jLongValue);
                                        a83Var = a83Var2;
                                    } else {
                                        de deVarR = ee.r(null);
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
                                            o72 o72Var = ee.j;
                                            o72Var.getClass();
                                            Matcher matcher = ((Pattern) o72Var.i).matcher(string2);
                                            matcher.getClass();
                                            str = str7;
                                            try {
                                                kj1 kj1Var = !matcher.find(0) ? null : new kj1(matcher, string2);
                                                if (kj1Var == null || (str3 = (String) du.r0(2, kj1Var.x())) == null || (string3 = pv2.I0(str3).toString()) == null || string3.length() <= 0) {
                                                    string3 = null;
                                                }
                                                if (string3 != null) {
                                                    x92Var = ee.q(deVarR, string3, yi1Var, System.currentTimeMillis());
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
                                            thA = y92.a(x92Var);
                                            if (thA != null) {
                                            }
                                            return a83Var;
                                        }
                                        thA = y92.a(x92Var);
                                        if (thA != null) {
                                            String str8 = (String) x92Var;
                                            if (pv2.s0(str8)) {
                                                hg3.d(str4, "Skipped revoke interception because the system message is empty");
                                            } else {
                                                map.put(".sysmsg.$type", null);
                                                long j2 = yi1Var.i + 1;
                                                boolean zS0 = pv2.s0(str2);
                                                po2 po2Var = po2.k;
                                                if (zS0) {
                                                    ro2Var = gd3.i(po2Var, io2.h, "Talker is empty", str2, null, null, 48);
                                                    r243 = str2;
                                                } else if (pv2.s0(str8)) {
                                                    ro2Var = gd3.i(po2Var, io2.i, "System message content is empty", str2, null, null, 48);
                                                    r243 = str2;
                                                } else {
                                                    String str9 = str2;
                                                    try {
                                                        ContentValues contentValues = new ContentValues();
                                                        r24 = j2;
                                                        contentValues.put("msgid", (Long) 0L);
                                                        d3 d3Var = i52.h;
                                                        contentValues.put("msgSvrId", Long.valueOf(r24 + ((long) i52.h.a().nextInt())));
                                                        contentValues.put("type", (Integer) 10000);
                                                        contentValues.put("status", (Integer) 3);
                                                        contentValues.put("createTime", Long.valueOf((long) r24));
                                                        contentValues.put("talker", str9);
                                                        contentValues.put("content", str8);
                                                        xi1.d.getClass();
                                                        Object value = xi1.f.getValue();
                                                        value.getClass();
                                                        Object objC = dt.c((Class) value, new Object[0]);
                                                        sg1 sg1VarV = op0.y(objC).v();
                                                        sg1VarV.b();
                                                        sg1VarV.b = "convertFrom";
                                                        sg1VarV.i = new yb3(17);
                                                        ((zg1) du.o0(sg1VarV.c())).g0(contentValues, Boolean.TRUE);
                                                        hp2 hp2Var = hp2.d;
                                                        qg1.d.getClass();
                                                        Class cls = (Class) qg1.f.getValue();
                                                        hp2Var.getClass();
                                                        sg1 sg1VarV2 = op0.y(hp2.j(cls)).v();
                                                        sg1VarV2.b();
                                                        sg1VarV2.l = 0;
                                                        bj1.d.getClass();
                                                        Object value2 = bj1.f.getValue();
                                                        value2.getClass();
                                                        sg1VarV2.C = (Class) value2;
                                                        Object objG0 = ((zg1) du.o0(sg1VarV2.c())).g0(new Object[0]);
                                                        try {
                                                            if (objG0 == null) {
                                                                throw new IllegalStateException("MsgInfoStorage service is not initialized");
                                                            }
                                                            Method method = (Method) bj1.g.getValue();
                                                            ig1.a(method);
                                                            int parameterCount = method.getParameterCount();
                                                            try {
                                                                if (parameterCount == 1) {
                                                                    objInvoke = method.invoke(objG0, objC);
                                                                } else if (parameterCount == 2) {
                                                                    objInvoke = method.invoke(objG0, objC, Boolean.FALSE);
                                                                } else {
                                                                    if (parameterCount != 3) {
                                                                        throw new IllegalStateException(("Unsupported MsgInfoStorage insert parameter count: " + method.getParameterCount()).toString());
                                                                    }
                                                                    Boolean bool = Boolean.FALSE;
                                                                    objInvoke = method.invoke(objG0, objC, bool, bool);
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
                                                                    ro2Var = gd3.i(po2Var, io2.q, message, r242, null, th, 16);
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
                                                                ro2Var = gd3.i(po2Var, io2.q, message, r242, null, th, 16);
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
                                                    ro2Var = gd3.i(po2Var, io2.q, message, r242, null, th, 16);
                                                    r243 = r242;
                                                }
                                                ?? r13 = r243;
                                                if (ro2Var instanceof ro2) {
                                                    hg3.f(str4, "Blocked revoke: talker=" + r13 + ", msgSvrId=" + jLongValue + ", systemMsgId=" + ((lo2) ((ro2) ro2Var).a).d);
                                                } else {
                                                    if (!(ro2Var instanceof qo2)) {
                                                        c80.s();
                                                        return null;
                                                    }
                                                    hg3.d(str4, "Revoke was blocked, but system message insertion failed: ".concat(((qo2) ro2Var).a.c));
                                                }
                                            }
                                        } else {
                                            ee.d.getClass();
                                            hg3.d(str4, "Unable to build revoke system message: ".concat(fg1.Q(thA)));
                                        }
                                    }
                                    break;
                                }
                            } else {
                                a83Var = a83Var2;
                                if (!(bd3VarM instanceof zc3)) {
                                    c80.s();
                                    return null;
                                }
                                hg3.d(str4, "Unable to load revoked message " + jLongValue + ": " + ((zc3) bd3VarM).a.c);
                            }
                        }
                    }
                }
                return a83Var;
            case 2:
                ((n21) obj3).l((Throwable) obj);
                return a83Var2;
            case 3:
                return ((af2) obj3).c(obj);
            case 4:
                return ((af2) obj3).c(obj);
            case 5:
                return ((af2) obj3).c(obj);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                long j3 = ((rs1) obj).a;
                vy2 vy2Var = (vy2) obj3;
                vy2Var.getClass();
                zy2 zy2Var = (zy2) p40.p(vy2Var, az2.a);
                if (zy2Var != null) {
                    p7.A(vy2Var.A0(), null, new f2(vy2Var, j3, zy2Var, new uy2(vy2Var, j3), (t00) null), 3);
                }
                return a83Var2;
            case 7:
                ((oy2) obj3).b.a((in0) obj);
                return a83Var2;
            case 8:
                KeyEvent keyEvent = ((d51) obj).a;
                mz2 mz2Var = (mz2) obj3;
                e13 e13Var = mz2Var.f;
                boolean z2 = mz2Var.d;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    evVar = null;
                } else {
                    n40 n40Var = mz2Var.i;
                    n40Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        n40Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = n40Var.a;
                        if (num != null) {
                            n40Var.a = null;
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
                        evVar = new ev(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    }
                }
                if (evVar != null) {
                    if (z2) {
                        mz2Var.a(eu.O(evVar));
                        e13Var.a = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (qp0.C(keyEvent) == 2) {
                    mz2Var.j.getClass();
                    int iM = eu.M(keyEvent);
                    int i5 = rp0.o;
                    if (iM == 9) {
                        long jF = sp0.f(keyEvent.getKeyCode());
                        c51Var = b51.a(jF, b51.f) ? c51.X : b51.a(jF, b51.g) ? c51.Y : b51.a(jF, b51.d) ? c51.P : b51.a(jF, b51.e) ? c51.Q : null;
                        if (c51Var == null) {
                            n4 n4Var = s11.d;
                            int i6 = rp0.p;
                            int iM2 = eu.M(keyEvent);
                            long jF2 = sp0.f(keyEvent.getKeyCode());
                            boolean zA = b51.a(jF2, b51.s);
                            c51 c51Var5 = c51.a0;
                            c51 c51Var6 = c51.C;
                            if (!zA) {
                                c51Var2 = c51Var6;
                                c51Var3 = ((b51.a(jF2, b51.r) || b51.a(jF2, b51.E)) && (iM2 == 0 || iM2 == 8 || iM2 == 2 || iM2 == 10)) ? c51Var5 : null;
                            } else if (iM2 != 0 && iM2 != 8) {
                                int i7 = rp0.q;
                                if (iM2 == 12) {
                                    c51Var2 = c51Var6;
                                    c51Var3 = c51Var2;
                                } else {
                                    c51Var3 = (iM2 == 2 || iM2 == 10) ? c51.E : null;
                                    c51Var2 = c51Var6;
                                }
                            }
                            if (c51Var3 != null) {
                                c51Var = c51Var3;
                            } else {
                                int iM3 = eu.M(keyEvent);
                                c51 c51Var7 = c51.V;
                                c51 c51Var8 = c51.W;
                                if (iM3 == 10) {
                                    long jF3 = sp0.f(keyEvent.getKeyCode());
                                    c51Var3 = (b51.a(jF3, b51.f) || b51.a(jF3, b51.H)) ? c51.R : (b51.a(jF3, b51.g) || b51.a(jF3, b51.I)) ? c51.S : (b51.a(jF3, b51.d) || b51.a(jF3, b51.F)) ? c51.U : (b51.a(jF3, b51.e) || b51.a(jF3, b51.G)) ? c51.T : null;
                                    if (c51Var3 != null) {
                                        Object obj6 = n4Var.i;
                                        int iM4 = eu.M(keyEvent);
                                        c51 c51Var9 = c51.d0;
                                        if (iM4 == 10) {
                                            c51Var4 = b51.a(sp0.f(keyEvent.getKeyCode()), b51.o) ? c51Var9 : null;
                                        } else {
                                            c51 c51Var10 = c51.z;
                                            c51 c51Var11 = c51.B;
                                            c51 c51Var12 = c51.A;
                                            if (iM4 == 2) {
                                                long jF4 = sp0.f(keyEvent.getKeyCode());
                                                if (b51.a(jF4, b51.j) || b51.a(jF4, b51.x) || b51.a(jF4, b51.N)) {
                                                    c51Var4 = c51Var10;
                                                } else if (b51.a(jF4, b51.l)) {
                                                    c51Var4 = c51Var12;
                                                } else if (b51.a(jF4, b51.m)) {
                                                    c51Var4 = c51Var11;
                                                } else if (b51.a(jF4, b51.i)) {
                                                    c51Var4 = c51.I;
                                                } else if (!b51.a(jF4, b51.n)) {
                                                    if (b51.a(jF4, b51.o)) {
                                                        c51Var4 = c51.c0;
                                                    }
                                                }
                                            } else if (iM4 == 8) {
                                                long jF5 = sp0.f(keyEvent.getKeyCode());
                                                if (b51.a(jF5, b51.f) || b51.a(jF5, b51.H)) {
                                                    c51Var4 = c51.J;
                                                } else if (b51.a(jF5, b51.g) || b51.a(jF5, b51.I)) {
                                                    c51Var4 = c51.K;
                                                } else if (b51.a(jF5, b51.d) || b51.a(jF5, b51.F)) {
                                                    c51Var4 = c51.L;
                                                } else if (b51.a(jF5, b51.e) || b51.a(jF5, b51.G)) {
                                                    c51Var4 = c51.M;
                                                } else if (b51.a(jF5, b51.C) || b51.a(jF5, b51.L)) {
                                                    c51Var4 = c51.N;
                                                } else if (b51.a(jF5, b51.D) || b51.a(jF5, b51.M)) {
                                                    c51Var4 = c51.O;
                                                } else if (b51.a(jF5, b51.v) || b51.a(jF5, b51.J)) {
                                                    c51Var4 = c51Var7;
                                                } else if (b51.a(jF5, b51.w) || b51.a(jF5, b51.K)) {
                                                    c51Var4 = c51Var8;
                                                } else if (b51.a(jF5, b51.x) || b51.a(jF5, b51.N)) {
                                                }
                                            } else if (iM4 == 0) {
                                                long jF6 = sp0.f(keyEvent.getKeyCode());
                                                if (b51.a(jF6, b51.f) || b51.a(jF6, b51.H)) {
                                                    c51Var4 = c51.i;
                                                } else if (b51.a(jF6, b51.g) || b51.a(jF6, b51.I)) {
                                                    c51Var4 = c51.j;
                                                } else if (b51.a(jF6, b51.d) || b51.a(jF6, b51.F)) {
                                                    c51Var4 = c51.s;
                                                } else if (b51.a(jF6, b51.e) || b51.a(jF6, b51.G)) {
                                                    c51Var4 = c51.t;
                                                } else if (b51.a(jF6, b51.h)) {
                                                    c51Var4 = c51.u;
                                                } else if (b51.a(jF6, b51.C) || b51.a(jF6, b51.L)) {
                                                    c51Var4 = c51.v;
                                                } else if (b51.a(jF6, b51.D) || b51.a(jF6, b51.M)) {
                                                    c51Var4 = c51.w;
                                                } else if (b51.a(jF6, b51.v) || b51.a(jF6, b51.J)) {
                                                    c51Var4 = c51.o;
                                                } else if (b51.a(jF6, b51.w) || b51.a(jF6, b51.K)) {
                                                    c51Var4 = c51.p;
                                                } else if (b51.a(jF6, b51.r) || b51.a(jF6, b51.E)) {
                                                    c51Var4 = c51Var5;
                                                } else if (b51.a(jF6, b51.s)) {
                                                    c51Var4 = c51Var2;
                                                } else if (b51.a(jF6, b51.t)) {
                                                    c51Var4 = c51.D;
                                                } else if (!b51.a(jF6, b51.A)) {
                                                    if (!b51.a(jF6, b51.y)) {
                                                        if (!b51.a(jF6, b51.z)) {
                                                            if (b51.a(jF6, b51.p)) {
                                                                c51Var4 = c51.b0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        c51Var = c51Var4;
                                    }
                                } else if (iM3 == 2) {
                                    long jF7 = sp0.f(keyEvent.getKeyCode());
                                    if (b51.a(jF7, b51.f) || b51.a(jF7, b51.H)) {
                                        c51Var3 = c51.l;
                                    } else if (b51.a(jF7, b51.g) || b51.a(jF7, b51.I)) {
                                        c51Var3 = c51.k;
                                    } else if (b51.a(jF7, b51.d) || b51.a(jF7, b51.F)) {
                                        c51Var3 = c51.n;
                                    } else if (b51.a(jF7, b51.e) || b51.a(jF7, b51.G)) {
                                        c51Var3 = c51.m;
                                    } else if (b51.a(jF7, b51.k)) {
                                        c51Var3 = c51Var2;
                                    } else if (b51.a(jF7, b51.t)) {
                                        c51Var3 = c51.F;
                                    } else if (b51.a(jF7, b51.B)) {
                                        c51Var3 = c51.Z;
                                    }
                                    if (c51Var3 != null) {
                                    }
                                } else if (iM3 == 8) {
                                    long jF8 = sp0.f(keyEvent.getKeyCode());
                                    if (b51.a(jF8, b51.v) || b51.a(jF8, b51.J)) {
                                        c51Var3 = c51Var7;
                                    } else if (b51.a(jF8, b51.w) || b51.a(jF8, b51.K)) {
                                        c51Var3 = c51Var8;
                                    }
                                    if (c51Var3 != null) {
                                    }
                                } else {
                                    if (iM3 == 1 && b51.a(sp0.f(keyEvent.getKeyCode()), b51.t)) {
                                        c51Var3 = c51.H;
                                    }
                                    if (c51Var3 != null) {
                                    }
                                }
                            }
                        }
                        if (c51Var == null && (!c51Var.h || z2)) {
                            y62 y62Var = new y62();
                            y62Var.h = true;
                            m0 m0Var = new m0(c51Var, mz2Var, y62Var, 13);
                            k03 k03Var = mz2Var.c;
                            pz2 pz2Var = new pz2(k03Var, mz2Var.g, mz2Var.a.d(), e13Var);
                            m0Var.j(pz2Var);
                            boolean zB = f13.b(pz2Var.f, k03Var.b);
                            sd sdVar = pz2Var.g;
                            if (!zB || !t11.l(sdVar, k03Var.a)) {
                                mz2Var.k.j(k03.a(k03Var, sdVar, pz2Var.f, 4));
                            }
                            w73 w73Var = mz2Var.h;
                            if (w73Var != null) {
                                w73Var.e = true;
                            }
                            z = y62Var.h;
                        }
                    } else if (iM == 1) {
                        long jF9 = sp0.f(keyEvent.getKeyCode());
                        if (b51.a(jF9, b51.f)) {
                            c51Var = c51.q;
                        } else if (b51.a(jF9, b51.g)) {
                            c51Var = c51.r;
                        } else if (b51.a(jF9, b51.d)) {
                            c51Var = c51.x;
                        } else if (b51.a(jF9, b51.e)) {
                            c51Var = c51.y;
                        } else if (b51.a(jF9, b51.s)) {
                            c51Var = c51.G;
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
                int iG = p40.G(cursor, "isSend");
                int iG2 = p40.G(cursor, "status");
                String strV = p40.V(cursor, "talker");
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("lvbuffer");
                return new yi1(iG, iG2, strV, cursor.isNull(columnIndexOrThrow) ? null : cursor.getBlob(columnIndexOrThrow), p40.G(cursor, "type"), p40.N(cursor, "msgId"), 0L, p40.V(cursor, "content"), p40.N(cursor, "createTime"), p40.N(cursor, "msgSvrId"), 0, 0L, 7168);
        }
    }
}
