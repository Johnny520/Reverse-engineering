package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements in0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [af.d(java.lang.Object, java.lang.Object):java.lang.Object, cj.<init>(sd, m13, java.util.List, e70, xl0):void, fs.a(org.luckypray.dexkit.DexKitBridge):void, he.a(org.luckypray.dexkit.DexKitBridge):void, s11.o(s62, px, int):void, t11.e(g33, px, int):void, te.a(java.lang.String, uh1, px, int):void, te.j(p1, px, int):void, v.j(java.lang.Object):java.lang.Object, w.j(java.lang.Object):java.lang.Object] */
    public /* synthetic */ w(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        Class cls;
        Integer asInteger;
        Object x92Var;
        Object x92Var2;
        Context context;
        String strB0;
        Object x92Var3;
        gh ghVar;
        Object x92Var4;
        int i = this.h;
        int i2 = 6;
        cls = Button.class;
        int i3 = 2;
        boolean zContains = true;
        boolean zContains2 = true;
        Object x92Var5 = null;
        jo2 jo2Var = null;
        final int i4 = 0;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                hd3 hd3Var = (hd3) obj;
                hd3Var.getClass();
                b0 b0Var = b0.d;
                yi1 yi1Var = hd3Var.a;
                b0Var.getClass();
                final by0 by0VarL0 = te.l0(yi1Var);
                if (by0VarL0 != null) {
                    AIChatConfig aIChatConfigQ = b0.q();
                    if (b0.r(aIChatConfigQ) && aIChatConfigQ.allowsTalker(by0VarL0.a) && b0.j.a(by0VarL0.d)) {
                        final long j = b0.k.get();
                        b0.l.execute(new Runnable() { // from class: y
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i4;
                                Object x92Var6 = a83.a;
                                long j2 = j;
                                by0 by0Var = by0VarL0;
                                switch (i5) {
                                    case 0:
                                        b0 b0Var2 = b0.d;
                                        try {
                                            b0Var2.getClass();
                                            b0.s(by0Var, j2);
                                        } catch (Throwable th) {
                                            x92Var6 = new x92(th);
                                        }
                                        Throwable thA = y92.a(x92Var6);
                                        if (thA != null) {
                                            b0Var2.getClass();
                                            hg3.d(b0.h, "AI chat processing failed: ".concat(fg1.Q(thA)));
                                        }
                                        break;
                                    default:
                                        jr jrVar = jr.d;
                                        try {
                                            jrVar.getClass();
                                            jr.r(by0Var, j2);
                                        } catch (Throwable th2) {
                                            x92Var6 = new x92(th2);
                                        }
                                        Throwable thA2 = y92.a(x92Var6);
                                        if (thA2 != null) {
                                            jrVar.getClass();
                                            hg3.d(jr.h, "Auto reply processing failed: ".concat(fg1.Q(thA2)));
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
                return a83Var;
            case 1:
                Context context2 = (Context) obj;
                context2.getClass();
                ImageView imageView = new ImageView(context2);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            case 2:
                Context context3 = (Context) obj;
                context3.getClass();
                ImageView imageView2 = new ImageView(context3);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView2;
            case 3:
                uh1 uh1Var = p4.a;
                return a83Var;
            case 4:
                return Boolean.valueOf(!(((od) obj) instanceof vw1));
            case 5:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object objN0 = mg.n0(0, jg3Var.a());
                String str = objN0 instanceof String ? (String) objN0 : null;
                if (str != null) {
                    Object objN02 = mg.n0(1, jg3Var.a());
                    String str2 = objN02 instanceof String ? (String) objN02 : null;
                    if (str2 != null && str.equals("SnsInfo") && pv2.h0(str2, "UPDATE SnsInfo SET sourceType = sourceType & -3 where", true)) {
                        ae.d.getClass();
                        hg3.f(ae.h, "Blocked deletion cleanup for a cached moment");
                        jg3Var.b(Boolean.TRUE);
                    }
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                jg3 jg3Var2 = (jg3) obj;
                ae aeVar = ae.d;
                jg3Var2.getClass();
                Object objN03 = mg.n0(0, jg3Var2.a());
                String str3 = objN03 instanceof String ? (String) objN03 : null;
                if (str3 != null && str3.equals("SnsInfo")) {
                    Object objN04 = mg.n0(1, jg3Var2.a());
                    ContentValues contentValues = objN04 instanceof ContentValues ? (ContentValues) objN04 : null;
                    if (contentValues != null && (asInteger = contentValues.getAsInteger("sourceType")) != null && asInteger.intValue() == 0) {
                        contentValues.put("sourceType", (Integer) 2);
                        aeVar.getClass();
                        String str4 = ae.h;
                        byte[] asByteArray = contentValues.getAsByteArray("content");
                        if (asByteArray != null) {
                            try {
                                Constructor declaredConstructor = ((Class) ae.j.getValue()).getDeclaredConstructor(null);
                                declaredConstructor.getClass();
                                ig1.a(declaredConstructor);
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                sg1 sg1VarV = op0.y(objNewInstance).v();
                                sg1VarV.b();
                                sg1VarV.b = "parseFrom";
                                sg1VarV.d(byte[].class);
                                Object objG0 = ((zg1) du.o0(sg1VarV.c())).g0(asByteArray);
                                if (objG0 != null) {
                                    objNewInstance = objG0;
                                }
                                hi0 hi0VarR = op0.y(objNewInstance).r();
                                hi0VarR.b();
                                hi0VarR.b = "ContentDesc";
                                pi0 pi0Var = (pi0) du.o0(hi0VarR.c());
                                Object objG02 = pi0Var.g0();
                                String str5 = objG02 instanceof String ? (String) objG02 : null;
                                if (str5 != null) {
                                    try {
                                        context = up0.i;
                                    } catch (Throwable th) {
                                        x92Var2 = new x92(th);
                                    }
                                    if (context == null) {
                                        t11.S("hostContext");
                                        throw null;
                                    }
                                    x92Var2 = context.getString(R.string.anti_moments_revoke_marker);
                                    boolean z = x92Var2 instanceof x92;
                                    Object obj2 = x92Var2;
                                    if (z) {
                                        obj2 = "(已删除)";
                                    }
                                    String str6 = (String) obj2;
                                    if (!wv2.d0(str5, str6, false)) {
                                        String strConcat = str6.concat(str5);
                                        pi0Var.R();
                                        pi0Var.j.set(pi0Var.i, strConcat);
                                    }
                                    sg1 sg1VarV2 = op0.y(objNewInstance).v();
                                    sg1VarV2.b();
                                    sg1VarV2.b = "toByteArray";
                                    sg1VarV2.l = 0;
                                    sg1VarV2.C = byte[].class;
                                    Object objG03 = ((zg1) du.o0(sg1VarV2.c())).g0(new Object[0]);
                                    byte[] bArr = objG03 instanceof byte[] ? (byte[]) objG03 : null;
                                    if (bArr != null) {
                                        contentValues.put("content", bArr);
                                        hg3.f(str4, "Marked a deleted moment for display");
                                    }
                                }
                                x92Var = a83Var;
                            } catch (Throwable th2) {
                                x92Var = new x92(th2);
                            }
                            Throwable thA = y92.a(x92Var);
                            if (thA != null) {
                                hg3.d(str4, "Unable to mark deleted moment: ".concat(fg1.Q(thA)));
                            }
                        }
                    }
                }
                return a83Var;
            case 7:
                jg3 jg3Var3 = (jg3) obj;
                jg3Var3.getClass();
                Object objN05 = mg.n0(0, jg3Var3.a());
                String str7 = objN05 instanceof String ? (String) objN05 : null;
                if (str7 != null) {
                    ae.d.getClass();
                    if (pv2.h0(str7, "SnsInfo", true)) {
                        strB0 = wv2.b0(wv2.b0(wv2.b0(str7, "(sourceType & 2 != 0 )  AND", ""), "(sourceType & 2 != 0 )", "(1=1)"), "(sourceType in (8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))", "(sourceType in (0,2,4,6,8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))");
                        if (pv2.h0(strB0, "WHERE SnsInfo.userName=", true)) {
                            strB0 = wv2.b0(strB0, "(snsId >=", "(1=1 or snsId >=");
                        }
                    } else {
                        strB0 = str7;
                    }
                    if (!strB0.equals(str7)) {
                        jg3Var3.a()[0] = strB0;
                        ae.h.getClass();
                    }
                }
                return a83Var;
            case 8:
                jg3 jg3Var4 = (jg3) obj;
                jg3Var4.getClass();
                jg3Var4.b(null);
                return a83Var;
            case 9:
                yg1 yg1Var = (yg1) obj;
                yg1Var.getClass();
                yg1Var.h0("doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s");
                return a83Var;
            case 10:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.c0(new w(9));
                return a83Var;
            case 11:
                Class<?> cls2 = (Class) obj;
                cls2.getClass();
                return Boolean.valueOf(cls.isAssignableFrom(cls2));
            case 12:
                hd3 hd3Var2 = (hd3) obj;
                hd3Var2.getClass();
                hh hhVar = hh.d;
                yi1 yi1Var2 = hd3Var2.a;
                hhVar.getClass();
                String str8 = hh.h;
                Set set = hh.k;
                int i5 = yi1Var2.e;
                String str9 = yi1Var2.c;
                if (set.contains(Integer.valueOf(i5)) && yi1Var2.a == 0) {
                    ch chVarS = hh.s();
                    boolean z2 = chVarS.c;
                    Set set2 = z2 ? chVarS.d : chVarS.e;
                    if (z2) {
                        zContains = set2.contains(str9);
                    } else if (set2.contains(str9)) {
                        zContains = false;
                    }
                    if (zContains) {
                        try {
                            x92Var3 = hh.w(yi1Var2, chVarS.b);
                        } catch (Throwable th3) {
                            x92Var3 = new x92(th3);
                        }
                        Throwable thA2 = y92.a(x92Var3);
                        if (thA2 == null) {
                            gh ghVar2 = (gh) x92Var3;
                            if (ghVar2 != null) {
                                String str10 = ghVar2.a;
                                if (hh.j.putIfAbsent(str10, ghVar2) == null) {
                                    String str11 = ghVar2.c;
                                    int i6 = ghVar2.i;
                                    StringBuilder sbO = vi0.o("Detected red packet: sendId=", str10, ", talker=", str11, ", mode=");
                                    sbO.append(i6);
                                    hg3.f(str8, sbO.toString());
                                    ea3.b("NukeReceiveRedPacket", new r1(5, chVarS, ghVar2));
                                }
                            }
                        } else {
                            hg3.d(str8, "Parse red packet failed: ".concat(fg1.Q(thA2)));
                        }
                    } else {
                        hg3.f(str8, "Skipping red packet from " + str9 + ": " + (z2 ? "not in whitelist" : "in blacklist"));
                    }
                    break;
                }
                return a83Var;
            case 13:
                jg3 jg3Var5 = (jg3) obj;
                jg3Var5.getClass();
                Object objN06 = mg.n0(2, jg3Var5.a());
                JSONObject jSONObject = objN06 instanceof JSONObject ? (JSONObject) objN06 : null;
                if (jSONObject != null) {
                    hh.d.getClass();
                    String strOptString = jSONObject.optString("sendId");
                    strOptString.getClass();
                    if (!pv2.s0(strOptString)) {
                        ConcurrentHashMap concurrentHashMap = hh.j;
                        gh ghVar3 = (gh) concurrentHashMap.get(strOptString);
                        if (ghVar3 != null && ghVar3.i != 0) {
                            String strOptString2 = jSONObject.optString("timingIdentifier");
                            strOptString2.getClass();
                            if (pv2.s0(strOptString2)) {
                                concurrentHashMap.remove(strOptString, ghVar3);
                                hg3.d(hh.h, "Receive request returned no timingIdentifier: sendId=".concat(strOptString));
                            } else if (ghVar3.j.compareAndSet(false, true)) {
                                ea3.b("NukeOpenRedPacket", new s1(strOptString, ghVar3, strOptString2, i3));
                            }
                        }
                    }
                }
                return a83Var;
            case 14:
                jg3 jg3Var6 = (jg3) obj;
                jg3Var6.getClass();
                Object objN07 = mg.n0(2, jg3Var6.a());
                JSONObject jSONObject2 = objN07 instanceof JSONObject ? (JSONObject) objN07 : null;
                if (jSONObject2 != null) {
                    hh.d.getClass();
                    String str12 = hh.h;
                    String strOptString3 = jSONObject2.optString("sendId");
                    strOptString3.getClass();
                    if (!pv2.s0(strOptString3) && (ghVar = (gh) hh.j.remove(strOptString3)) != null) {
                        int iOptInt = jSONObject2.optInt("retcode", -1);
                        int iOptInt2 = jSONObject2.optInt("receiveStatus", -1);
                        if (iOptInt == 0 && iOptInt2 == 2) {
                            int iOptInt3 = jSONObject2.optInt("amount", 0);
                            hg3.f(str12, "Red packet received: sendId=" + strOptString3 + ", amount=" + iOptInt3);
                            if (iOptInt3 > 0) {
                                fh fhVar = hh.s().f;
                                boolean z3 = fhVar.a;
                                String str13 = fhVar.b;
                                if (z3 && !pv2.s0(str13)) {
                                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iOptInt3, 2);
                                    String plainString = (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString();
                                    plainString.getClass();
                                    so2 so2VarL = gd3.l(ghVar.c, wv2.b0(str13, "$amount", plainString));
                                    if (!(so2VarL instanceof ro2)) {
                                        if (!(so2VarL instanceof qo2)) {
                                            c80.s();
                                            return null;
                                        }
                                        jo2Var = ((qo2) so2VarL).a;
                                    }
                                    if (jo2Var != null) {
                                        hg3.g(6, str12, "Red packet auto reply failed: ".concat(jo2Var.c));
                                    }
                                }
                            }
                        } else {
                            hg3.f(str12, "Red packet was not received: sendId=" + strOptString3 + ", retCode=" + iOptInt + ", receiveStatus=" + iOptInt2);
                        }
                    }
                }
                return a83Var;
            case 15:
                jg3 jg3Var7 = (jg3) obj;
                hh hhVar2 = hh.d;
                jg3Var7.getClass();
                Object obj3 = jg3Var7.a.thisObject;
                Activity activity = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity != null) {
                    hhVar2.getClass();
                    Intent intent = activity.getIntent();
                    if (intent != null && intent.getBooleanExtra("Nuke.AutoReceiveRedPacket.ClickReceive", false) && !intent.getBooleanExtra("Nuke.AutoReceiveRedPacket.ClickReceiveScheduled", false)) {
                        try {
                            hi0 hi0VarR2 = op0.y(activity).r();
                            hi0VarR2.b();
                            hi0VarR2.h = new w(11);
                            Object objG04 = ((pi0) du.o0(hi0VarR2.c())).g0();
                            if (objG04 instanceof Button) {
                                x92Var5 = (Button) objG04;
                            }
                        } catch (Throwable th4) {
                            x92Var5 = new x92(th4);
                        }
                        Throwable thA3 = y92.a(x92Var5);
                        if (thA3 == null) {
                            Button button = (Button) x92Var5;
                            if (button != null) {
                                intent.putExtra("Nuke.AutoReceiveRedPacket.ClickReceiveScheduled", true);
                                button.post(new zg(activity, button, 8, i4));
                            }
                        } else {
                            hg3.d(hh.h, "Resolve red packet open button failed: ".concat(fg1.Q(thA3)));
                        }
                    }
                    break;
                }
                return a83Var;
            case 16:
                Context context4 = (Context) obj;
                context4.getClass();
                ImageView imageView3 = new ImageView(context4);
                imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView3;
            case 17:
                hd3 hd3Var3 = (hd3) obj;
                hd3Var3.getClass();
                ii iiVar = ii.d;
                yi1 yi1Var3 = hd3Var3.a;
                iiVar.getClass();
                String str14 = ii.h;
                int i7 = yi1Var3.e;
                String str15 = yi1Var3.c;
                if (i7 == 419430449 && yi1Var3.a == 0) {
                    di diVarR = ii.r();
                    boolean z4 = diVarR.b;
                    Set set3 = z4 ? diVarR.c : diVarR.d;
                    if (z4) {
                        zContains2 = set3.contains(str15);
                    } else if (set3.contains(str15)) {
                        zContains2 = false;
                    }
                    if (zContains2) {
                        try {
                            x92Var4 = ii.s(yi1Var3);
                        } catch (Throwable th5) {
                            x92Var4 = new x92(th5);
                        }
                        Throwable thA4 = y92.a(x92Var4);
                        if (thA4 == null) {
                            hi hiVar = (hi) x92Var4;
                            if (hiVar != null) {
                                String str16 = hiVar.d;
                                String strA = ed3.a();
                                if (!pv2.s0(strA) && t11.l(hiVar.c, strA)) {
                                    hg3.f(str14, "Skipping outgoing transfer: transferId=".concat(hiVar.b));
                                } else if (!pv2.s0(strA) && !pv2.s0(str16) && !str16.equals(strA)) {
                                    hg3.f(str14, "Skipping transfer addressed to ".concat(str16));
                                } else if (ii.j.add(hiVar.a())) {
                                    ea3.b("NukeReceiveTransferMoney", new r1(i2, diVarR, hiVar));
                                }
                            }
                        } else {
                            hg3.d(str14, "Parse transfer failed: ".concat(fg1.Q(thA4)));
                        }
                    } else {
                        hg3.f(str14, "Skipping transfer from " + str15 + ": " + (z4 ? "not in whitelist" : "in blacklist"));
                    }
                    break;
                }
                return a83Var;
            case 18:
                Context context5 = (Context) obj;
                context5.getClass();
                ImageView imageView4 = new ImageView(context5);
                imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView4;
            case 19:
                jg3 jg3Var8 = (jg3) obj;
                jg3Var8.getClass();
                Object obj4 = jg3Var8.a.thisObject;
                obj4.getClass();
                hi0 hi0VarR3 = op0.y(obj4).r();
                Class<Button> clsA = p40.A(d72.a(cls));
                hi0VarR3.g = clsA != null ? clsA : Button.class;
                Object objG05 = ((pi0) du.o0(hi0VarR3.c())).g0();
                objG05.getClass();
                ((Button) objG05).callOnClick();
                return a83Var;
            case AIChatConfig.MaxContextRounds /* 20 */:
                int i8 = ik.a;
                return a83Var;
            case 21:
                jg3 jg3Var9 = (jg3) obj;
                jg3Var9.getClass();
                jg3Var9.b(Boolean.FALSE);
                return a83Var;
            case 22:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.t = mg.t0(new String[]{"com.tencent.mm.app"});
                yg1 yg1Var2 = new yg1();
                yg1Var2.j0("de.robv.android.xposed.XposedBridge");
                dj0Var2.u = yg1Var2;
                return a83Var;
            case 23:
                ((t61) obj).a();
                return a83Var;
            case 24:
                return a83Var;
            case 25:
                yy1 yy1Var = (yy1) obj;
                tu2 tu2Var = r7.b;
                yy1Var.getClass();
                if (((Context) op0.w(yy1Var, tu2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return xm.b;
                }
                vm.a.getClass();
                return um.c;
            case 26:
                jg3 jg3Var10 = (jg3) obj;
                jg3Var10.getClass();
                Object obj5 = jg3Var10.a()[0];
                obj5.getClass();
                Object obj6 = jg3Var10.a.thisObject;
                obj6.getClass();
                View view = (View) obj6;
                if (wv2.d0((String) obj5, "https://jiazhang.qq.com/healthy/dist/faceRecognition/game_no.html?", false)) {
                    view.setTranslationX(99999.0f);
                    view.setTranslationY(99999.0f);
                    view.setScaleX(0.01f);
                    view.setScaleY(0.01f);
                }
                return a83Var;
            case 27:
                hd3 hd3Var4 = (hd3) obj;
                hd3Var4.getClass();
                jr jrVar = jr.d;
                yi1 yi1Var4 = hd3Var4.a;
                jrVar.getClass();
                final by0 by0VarL02 = te.l0(yi1Var4);
                if (by0VarL02 != null && jr.j.a(by0VarL02.d)) {
                    final long j2 = jr.l.get();
                    ExecutorService executorService = jr.m;
                    final int i9 = true ? 1 : 0;
                    executorService.execute(new Runnable() { // from class: y
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i52 = i9;
                            Object x92Var6 = a83.a;
                            long j22 = j2;
                            by0 by0Var = by0VarL02;
                            switch (i52) {
                                case 0:
                                    b0 b0Var2 = b0.d;
                                    try {
                                        b0Var2.getClass();
                                        b0.s(by0Var, j22);
                                    } catch (Throwable th6) {
                                        x92Var6 = new x92(th6);
                                    }
                                    Throwable thA5 = y92.a(x92Var6);
                                    if (thA5 != null) {
                                        b0Var2.getClass();
                                        hg3.d(b0.h, "AI chat processing failed: ".concat(fg1.Q(thA5)));
                                    }
                                    break;
                                default:
                                    jr jrVar2 = jr.d;
                                    try {
                                        jrVar2.getClass();
                                        jr.r(by0Var, j22);
                                    } catch (Throwable th22) {
                                        x92Var6 = new x92(th22);
                                    }
                                    Throwable thA22 = y92.a(x92Var6);
                                    if (thA22 != null) {
                                        jrVar2.getClass();
                                        hg3.d(jr.h, "Auto reply processing failed: ".concat(fg1.Q(thA22)));
                                    }
                                    break;
                            }
                        }
                    });
                }
                return a83Var;
            case 28:
                jg3 jg3Var11 = (jg3) obj;
                jg3Var11.getClass();
                Activity activity2 = up0.k;
                if (activity2 != null) {
                    activity2.runOnUiThread(new m2(4, jg3Var11));
                    return a83Var;
                }
                t11.S("hostAct");
                throw null;
            default:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.t = mg.t0(new String[]{"com.tencent.mm.ui.chatting.viewitems"});
                at atVar = new at();
                atVar.d0("MicroMsg.ChattingItemContainer");
                cj0Var.u = atVar;
                return a83Var;
        }
    }
}
