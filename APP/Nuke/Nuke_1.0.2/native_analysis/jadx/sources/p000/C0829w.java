package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: w */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0829w implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12237h;

    public /* synthetic */ C0829w(int i) {
        this.f12237h = i;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        Class cls;
        Integer asInteger;
        Object x92Var;
        Object x92Var2;
        Context context;
        String strM6010b0;
        Object x92Var3;
        C0240gh c0240gh;
        Object x92Var4;
        int i = this.f12237h;
        int i2 = 6;
        cls = Button.class;
        int i3 = 2;
        boolean zContains = true;
        boolean zContains2 = true;
        Object x92Var5 = null;
        jo2 jo2Var = null;
        final int i4 = 0;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                hd3 hd3Var = (hd3) obj;
                hd3Var.getClass();
                C0038b0 c0038b0 = C0038b0.f458d;
                yi1 yi1Var = hd3Var.f3962a;
                c0038b0.getClass();
                final by0 by0VarM5221l0 = AbstractC0731te.m5221l0(yi1Var);
                if (by0VarM5221l0 != null) {
                    AIChatConfig aIChatConfigM316q = C0038b0.m316q();
                    if (C0038b0.m317r(aIChatConfigM316q) && aIChatConfigM316q.allowsTalker(by0VarM5221l0.f1074a) && C0038b0.f464j.m6383a(by0VarM5221l0.f1077d)) {
                        final long j = C0038b0.f465k.get();
                        C0038b0.f466l.execute(new Runnable() { // from class: y
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i4;
                                Object x92Var6 = a83.f116a;
                                long j2 = j;
                                by0 by0Var = by0VarM5221l0;
                                switch (i5) {
                                    case 0:
                                        C0038b0 c0038b02 = C0038b0.f458d;
                                        try {
                                            c0038b02.getClass();
                                            C0038b0.m318s(by0Var, j2);
                                        } catch (Throwable th) {
                                            x92Var6 = new x92(th);
                                        }
                                        Throwable thM6237a = y92.m6237a(x92Var6);
                                        if (thM6237a != null) {
                                            c0038b02.getClass();
                                            hg3.m2166d(C0038b0.f462h, "AI chat processing failed: ".concat(fg1.m1624Q(thM6237a)));
                                        }
                                        break;
                                    default:
                                        C0360jr c0360jr = C0360jr.f5166d;
                                        try {
                                            c0360jr.getClass();
                                            C0360jr.m2548r(by0Var, j2);
                                        } catch (Throwable th2) {
                                            x92Var6 = new x92(th2);
                                        }
                                        Throwable thM6237a2 = y92.m6237a(x92Var6);
                                        if (thM6237a2 != null) {
                                            c0360jr.getClass();
                                            hg3.m2166d(C0360jr.f5170h, "Auto reply processing failed: ".concat(fg1.m1624Q(thM6237a2)));
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
                uh1 uh1Var = AbstractC0567p4.f7964a;
                return a83Var;
            case 4:
                return Boolean.valueOf(!(((InterfaceC0539od) obj) instanceof vw1));
            case 5:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object objM3099n0 = AbstractC0460mg.m3099n0(0, jg3Var.m2496a());
                String str = objM3099n0 instanceof String ? (String) objM3099n0 : null;
                if (str != null) {
                    Object objM3099n02 = AbstractC0460mg.m3099n0(1, jg3Var.m2496a());
                    String str2 = objM3099n02 instanceof String ? (String) objM3099n02 : null;
                    if (str2 != null && str.equals("SnsInfo") && pv2.m3995h0(str2, "UPDATE SnsInfo SET sourceType = sourceType & -3 where", true)) {
                        C0015ae.f164d.getClass();
                        hg3.m2168f(C0015ae.f168h, "Blocked deletion cleanup for a cached moment");
                        jg3Var.m2497b(Boolean.TRUE);
                    }
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                jg3 jg3Var2 = (jg3) obj;
                C0015ae c0015ae = C0015ae.f164d;
                jg3Var2.getClass();
                Object objM3099n03 = AbstractC0460mg.m3099n0(0, jg3Var2.m2496a());
                String str3 = objM3099n03 instanceof String ? (String) objM3099n03 : null;
                if (str3 != null && str3.equals("SnsInfo")) {
                    Object objM3099n04 = AbstractC0460mg.m3099n0(1, jg3Var2.m2496a());
                    ContentValues contentValues = objM3099n04 instanceof ContentValues ? (ContentValues) objM3099n04 : null;
                    if (contentValues != null && (asInteger = contentValues.getAsInteger("sourceType")) != null && asInteger.intValue() == 0) {
                        contentValues.put("sourceType", (Integer) 2);
                        c0015ae.getClass();
                        String str4 = C0015ae.f168h;
                        byte[] asByteArray = contentValues.getAsByteArray("content");
                        if (asByteArray != null) {
                            try {
                                Constructor declaredConstructor = ((Class) C0015ae.f170j.getValue()).getDeclaredConstructor(null);
                                declaredConstructor.getClass();
                                ig1.m2344a(declaredConstructor);
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                sg1 sg1VarM3244v = op0.m3602y(objNewInstance).m3244v();
                                sg1VarM3244v.m6411b();
                                sg1VarM3244v.f13871b = "parseFrom";
                                sg1VarM3244v.m4864d(byte[].class);
                                Object objM6415g0 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0(asByteArray);
                                if (objM6415g0 != null) {
                                    objNewInstance = objM6415g0;
                                }
                                hi0 hi0VarM3241r = op0.m3602y(objNewInstance).m3241r();
                                hi0VarM3241r.m6411b();
                                hi0VarM3241r.f13871b = "ContentDesc";
                                pi0 pi0Var = (pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c());
                                Object objM3867g0 = pi0Var.m3867g0();
                                String str5 = objM3867g0 instanceof String ? (String) objM3867g0 : null;
                                if (str5 != null) {
                                    try {
                                        context = up0.f11401i;
                                    } catch (Throwable th) {
                                        x92Var2 = new x92(th);
                                    }
                                    if (context == null) {
                                        t11.m5067S("hostContext");
                                        throw null;
                                    }
                                    x92Var2 = context.getString(R.string.anti_moments_revoke_marker);
                                    boolean z = x92Var2 instanceof x92;
                                    Object obj2 = x92Var2;
                                    if (z) {
                                        obj2 = "(已删除)";
                                    }
                                    String str6 = (String) obj2;
                                    if (!wv2.m6012d0(str5, str6, false)) {
                                        String strConcat = str6.concat(str5);
                                        pi0Var.m5328R();
                                        pi0Var.f8357j.set(pi0Var.f5866i, strConcat);
                                    }
                                    sg1 sg1VarM3244v2 = op0.m3602y(objNewInstance).m3244v();
                                    sg1VarM3244v2.m6411b();
                                    sg1VarM3244v2.f13871b = "toByteArray";
                                    sg1VarM3244v2.f10120l = 0;
                                    sg1VarM3244v2.f10113C = byte[].class;
                                    Object objM6415g02 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v2.m4863c())).m6415g0(new Object[0]);
                                    byte[] bArr = objM6415g02 instanceof byte[] ? (byte[]) objM6415g02 : null;
                                    if (bArr != null) {
                                        contentValues.put("content", bArr);
                                        hg3.m2168f(str4, "Marked a deleted moment for display");
                                    }
                                }
                                x92Var = a83Var;
                            } catch (Throwable th2) {
                                x92Var = new x92(th2);
                            }
                            Throwable thM6237a = y92.m6237a(x92Var);
                            if (thM6237a != null) {
                                hg3.m2166d(str4, "Unable to mark deleted moment: ".concat(fg1.m1624Q(thM6237a)));
                            }
                        }
                    }
                }
                return a83Var;
            case 7:
                jg3 jg3Var3 = (jg3) obj;
                jg3Var3.getClass();
                Object objM3099n05 = AbstractC0460mg.m3099n0(0, jg3Var3.m2496a());
                String str7 = objM3099n05 instanceof String ? (String) objM3099n05 : null;
                if (str7 != null) {
                    C0015ae.f164d.getClass();
                    if (pv2.m3995h0(str7, "SnsInfo", true)) {
                        strM6010b0 = wv2.m6010b0(wv2.m6010b0(wv2.m6010b0(str7, "(sourceType & 2 != 0 )  AND", ""), "(sourceType & 2 != 0 )", "(1=1)"), "(sourceType in (8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))", "(sourceType in (0,2,4,6,8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))");
                        if (pv2.m3995h0(strM6010b0, "WHERE SnsInfo.userName=", true)) {
                            strM6010b0 = wv2.m6010b0(strM6010b0, "(snsId >=", "(1=1 or snsId >=");
                        }
                    } else {
                        strM6010b0 = str7;
                    }
                    if (!strM6010b0.equals(str7)) {
                        jg3Var3.m2496a()[0] = strM6010b0;
                        C0015ae.f168h.getClass();
                    }
                }
                return a83Var;
            case 8:
                jg3 jg3Var4 = (jg3) obj;
                jg3Var4.getClass();
                jg3Var4.m2497b(null);
                return a83Var;
            case 9:
                yg1 yg1Var = (yg1) obj;
                yg1Var.getClass();
                yg1Var.m6275h0("doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s");
                return a83Var;
            case 10:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.m1030c0(new C0829w(9));
                return a83Var;
            case 11:
                Class<?> cls2 = (Class) obj;
                cls2.getClass();
                return Boolean.valueOf(cls.isAssignableFrom(cls2));
            case 12:
                hd3 hd3Var2 = (hd3) obj;
                hd3Var2.getClass();
                C0277hh c0277hh = C0277hh.f4004d;
                yi1 yi1Var2 = hd3Var2.f3962a;
                c0277hh.getClass();
                String str8 = C0277hh.f4008h;
                Set set = C0277hh.f4011k;
                int i5 = yi1Var2.f13472e;
                String str9 = yi1Var2.f13470c;
                if (set.contains(Integer.valueOf(i5)) && yi1Var2.f13468a == 0) {
                    C0091ch c0091chM2174s = C0277hh.m2174s();
                    boolean z2 = c0091chM2174s.f1536c;
                    Set set2 = z2 ? c0091chM2174s.f1537d : c0091chM2174s.f1538e;
                    if (z2) {
                        zContains = set2.contains(str9);
                    } else if (set2.contains(str9)) {
                        zContains = false;
                    }
                    if (zContains) {
                        try {
                            x92Var3 = C0277hh.m2178w(yi1Var2, c0091chM2174s.f1535b);
                        } catch (Throwable th3) {
                            x92Var3 = new x92(th3);
                        }
                        Throwable thM6237a2 = y92.m6237a(x92Var3);
                        if (thM6237a2 == null) {
                            C0240gh c0240gh2 = (C0240gh) x92Var3;
                            if (c0240gh2 != null) {
                                String str10 = c0240gh2.f3513a;
                                if (C0277hh.f4010j.putIfAbsent(str10, c0240gh2) == null) {
                                    String str11 = c0240gh2.f3515c;
                                    int i6 = c0240gh2.f3521i;
                                    StringBuilder sbM5696o = vi0.m5696o("Detected red packet: sendId=", str10, ", talker=", str11, ", mode=");
                                    sbM5696o.append(i6);
                                    hg3.m2168f(str8, sbM5696o.toString());
                                    ea3.m1315b("NukeReceiveRedPacket", new C0640r1(5, c0091chM2174s, c0240gh2));
                                }
                            }
                        } else {
                            hg3.m2166d(str8, "Parse red packet failed: ".concat(fg1.m1624Q(thM6237a2)));
                        }
                    } else {
                        hg3.m2168f(str8, "Skipping red packet from " + str9 + ": " + (z2 ? "not in whitelist" : "in blacklist"));
                    }
                    break;
                }
                return a83Var;
            case 13:
                jg3 jg3Var5 = (jg3) obj;
                jg3Var5.getClass();
                Object objM3099n06 = AbstractC0460mg.m3099n0(2, jg3Var5.m2496a());
                JSONObject jSONObject = objM3099n06 instanceof JSONObject ? (JSONObject) objM3099n06 : null;
                if (jSONObject != null) {
                    C0277hh.f4004d.getClass();
                    String strOptString = jSONObject.optString("sendId");
                    strOptString.getClass();
                    if (!pv2.m4006s0(strOptString)) {
                        ConcurrentHashMap concurrentHashMap = C0277hh.f4010j;
                        C0240gh c0240gh3 = (C0240gh) concurrentHashMap.get(strOptString);
                        if (c0240gh3 != null && c0240gh3.f3521i != 0) {
                            String strOptString2 = jSONObject.optString("timingIdentifier");
                            strOptString2.getClass();
                            if (pv2.m4006s0(strOptString2)) {
                                concurrentHashMap.remove(strOptString, c0240gh3);
                                hg3.m2166d(C0277hh.f4008h, "Receive request returned no timingIdentifier: sendId=".concat(strOptString));
                            } else if (c0240gh3.f3522j.compareAndSet(false, true)) {
                                ea3.m1315b("NukeOpenRedPacket", new C0678s1(strOptString, c0240gh3, strOptString2, i3));
                            }
                        }
                    }
                }
                return a83Var;
            case 14:
                jg3 jg3Var6 = (jg3) obj;
                jg3Var6.getClass();
                Object objM3099n07 = AbstractC0460mg.m3099n0(2, jg3Var6.m2496a());
                JSONObject jSONObject2 = objM3099n07 instanceof JSONObject ? (JSONObject) objM3099n07 : null;
                if (jSONObject2 != null) {
                    C0277hh.f4004d.getClass();
                    String str12 = C0277hh.f4008h;
                    String strOptString3 = jSONObject2.optString("sendId");
                    strOptString3.getClass();
                    if (!pv2.m4006s0(strOptString3) && (c0240gh = (C0240gh) C0277hh.f4010j.remove(strOptString3)) != null) {
                        int iOptInt = jSONObject2.optInt("retcode", -1);
                        int iOptInt2 = jSONObject2.optInt("receiveStatus", -1);
                        if (iOptInt == 0 && iOptInt2 == 2) {
                            int iOptInt3 = jSONObject2.optInt("amount", 0);
                            hg3.m2168f(str12, "Red packet received: sendId=" + strOptString3 + ", amount=" + iOptInt3);
                            if (iOptInt3 > 0) {
                                C0203fh c0203fh = C0277hh.m2174s().f1539f;
                                boolean z3 = c0203fh.f2998a;
                                String str13 = c0203fh.f2999b;
                                if (z3 && !pv2.m4006s0(str13)) {
                                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iOptInt3, 2);
                                    String plainString = (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString();
                                    plainString.getClass();
                                    so2 so2VarM1838l = gd3.m1838l(c0240gh.f3515c, wv2.m6010b0(str13, "$amount", plainString));
                                    if (!(so2VarM1838l instanceof ro2)) {
                                        if (!(so2VarM1838l instanceof qo2)) {
                                            c80.m675s();
                                            return null;
                                        }
                                        jo2Var = ((qo2) so2VarM1838l).f9058a;
                                    }
                                    if (jo2Var != null) {
                                        hg3.m2169g(6, str12, "Red packet auto reply failed: ".concat(jo2Var.f5132c));
                                    }
                                }
                            }
                        } else {
                            hg3.m2168f(str12, "Red packet was not received: sendId=" + strOptString3 + ", retCode=" + iOptInt + ", receiveStatus=" + iOptInt2);
                        }
                    }
                }
                return a83Var;
            case 15:
                jg3 jg3Var7 = (jg3) obj;
                C0277hh c0277hh2 = C0277hh.f4004d;
                jg3Var7.getClass();
                Object obj3 = jg3Var7.f5028a.thisObject;
                Activity activity = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity != null) {
                    c0277hh2.getClass();
                    Intent intent = activity.getIntent();
                    if (intent != null && intent.getBooleanExtra("Nuke.AutoReceiveRedPacket.ClickReceive", false) && !intent.getBooleanExtra("Nuke.AutoReceiveRedPacket.ClickReceiveScheduled", false)) {
                        try {
                            hi0 hi0VarM3241r2 = op0.m3602y(activity).m3241r();
                            hi0VarM3241r2.m6411b();
                            hi0VarM3241r2.f4031h = new C0829w(11);
                            Object objM3867g02 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r2.m2194c())).m3867g0();
                            if (objM3867g02 instanceof Button) {
                                x92Var5 = (Button) objM3867g02;
                            }
                        } catch (Throwable th4) {
                            x92Var5 = new x92(th4);
                        }
                        Throwable thM6237a3 = y92.m6237a(x92Var5);
                        if (thM6237a3 == null) {
                            Button button = (Button) x92Var5;
                            if (button != null) {
                                intent.putExtra("Nuke.AutoReceiveRedPacket.ClickReceiveScheduled", true);
                                button.post(new RunnableC0961zg(activity, button, 8, i4));
                            }
                        } else {
                            hg3.m2166d(C0277hh.f4008h, "Resolve red packet open button failed: ".concat(fg1.m1624Q(thM6237a3)));
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
                C0314ii c0314ii = C0314ii.f4621d;
                yi1 yi1Var3 = hd3Var3.f3962a;
                c0314ii.getClass();
                String str14 = C0314ii.f4625h;
                int i7 = yi1Var3.f13472e;
                String str15 = yi1Var3.f13470c;
                if (i7 == 419430449 && yi1Var3.f13468a == 0) {
                    C0131di c0131diM2349r = C0314ii.m2349r();
                    boolean z4 = c0131diM2349r.f2058b;
                    Set set3 = z4 ? c0131diM2349r.f2059c : c0131diM2349r.f2060d;
                    if (z4) {
                        zContains2 = set3.contains(str15);
                    } else if (set3.contains(str15)) {
                        zContains2 = false;
                    }
                    if (zContains2) {
                        try {
                            x92Var4 = C0314ii.m2350s(yi1Var3);
                        } catch (Throwable th5) {
                            x92Var4 = new x92(th5);
                        }
                        Throwable thM6237a4 = y92.m6237a(x92Var4);
                        if (thM6237a4 == null) {
                            C0278hi c0278hi = (C0278hi) x92Var4;
                            if (c0278hi != null) {
                                String str16 = c0278hi.f4026d;
                                String strM1340a = ed3.m1340a();
                                if (!pv2.m4006s0(strM1340a) && t11.m5086l(c0278hi.f4025c, strM1340a)) {
                                    hg3.m2168f(str14, "Skipping outgoing transfer: transferId=".concat(c0278hi.f4024b));
                                } else if (!pv2.m4006s0(strM1340a) && !pv2.m4006s0(str16) && !str16.equals(strM1340a)) {
                                    hg3.m2168f(str14, "Skipping transfer addressed to ".concat(str16));
                                } else if (C0314ii.f4627j.add(c0278hi.m2192a())) {
                                    ea3.m1315b("NukeReceiveTransferMoney", new C0640r1(i2, c0131diM2349r, c0278hi));
                                }
                            }
                        } else {
                            hg3.m2166d(str14, "Parse transfer failed: ".concat(fg1.m1624Q(thM6237a4)));
                        }
                    } else {
                        hg3.m2168f(str14, "Skipping transfer from " + str15 + ": " + (z4 ? "not in whitelist" : "in blacklist"));
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
                Object obj4 = jg3Var8.f5028a.thisObject;
                obj4.getClass();
                hi0 hi0VarM3241r3 = op0.m3602y(obj4).m3241r();
                Class<Button> clsM3691A = p40.m3691A(d72.m967a(cls));
                hi0VarM3241r3.f4030g = clsM3691A != null ? clsM3691A : Button.class;
                Object objM3867g03 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r3.m2194c())).m3867g0();
                objM3867g03.getClass();
                ((Button) objM3867g03).callOnClick();
                return a83Var;
            case AIChatConfig.MaxContextRounds /* 20 */:
                int i8 = AbstractC0316ik.f4659a;
                return a83Var;
            case 21:
                jg3 jg3Var9 = (jg3) obj;
                jg3Var9.getClass();
                jg3Var9.m2497b(Boolean.FALSE);
                return a83Var;
            case 22:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.app"});
                yg1 yg1Var2 = new yg1();
                yg1Var2.m6277j0("de.robv.android.xposed.XposedBridge");
                dj0Var2.f2078u = yg1Var2;
                return a83Var;
            case 23:
                ((t61) obj).m5125a();
                return a83Var;
            case 24:
                return a83Var;
            case 25:
                yy1 yy1Var = (yy1) obj;
                tu2 tu2Var = AbstractC0646r7.f9411b;
                yy1Var.getClass();
                if (((Context) op0.m3600w(yy1Var, tu2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC0891xm.f13077b;
                }
                InterfaceC0815vm.f12014a.getClass();
                return C0778um.f11360c;
            case 26:
                jg3 jg3Var10 = (jg3) obj;
                jg3Var10.getClass();
                Object obj5 = jg3Var10.m2496a()[0];
                obj5.getClass();
                Object obj6 = jg3Var10.f5028a.thisObject;
                obj6.getClass();
                View view = (View) obj6;
                if (wv2.m6012d0((String) obj5, "https://jiazhang.qq.com/healthy/dist/faceRecognition/game_no.html?", false)) {
                    view.setTranslationX(99999.0f);
                    view.setTranslationY(99999.0f);
                    view.setScaleX(0.01f);
                    view.setScaleY(0.01f);
                }
                return a83Var;
            case 27:
                hd3 hd3Var4 = (hd3) obj;
                hd3Var4.getClass();
                C0360jr c0360jr = C0360jr.f5166d;
                yi1 yi1Var4 = hd3Var4.f3962a;
                c0360jr.getClass();
                final by0 by0VarM5221l02 = AbstractC0731te.m5221l0(yi1Var4);
                if (by0VarM5221l02 != null && C0360jr.f5172j.m6383a(by0VarM5221l02.f1077d)) {
                    final long j2 = C0360jr.f5174l.get();
                    ExecutorService executorService = C0360jr.f5175m;
                    final int i9 = true ? 1 : 0;
                    executorService.execute(new Runnable() { // from class: y
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i52 = i9;
                            Object x92Var6 = a83.f116a;
                            long j22 = j2;
                            by0 by0Var = by0VarM5221l02;
                            switch (i52) {
                                case 0:
                                    C0038b0 c0038b02 = C0038b0.f458d;
                                    try {
                                        c0038b02.getClass();
                                        C0038b0.m318s(by0Var, j22);
                                    } catch (Throwable th6) {
                                        x92Var6 = new x92(th6);
                                    }
                                    Throwable thM6237a5 = y92.m6237a(x92Var6);
                                    if (thM6237a5 != null) {
                                        c0038b02.getClass();
                                        hg3.m2166d(C0038b0.f462h, "AI chat processing failed: ".concat(fg1.m1624Q(thM6237a5)));
                                    }
                                    break;
                                default:
                                    C0360jr c0360jr2 = C0360jr.f5166d;
                                    try {
                                        c0360jr2.getClass();
                                        C0360jr.m2548r(by0Var, j22);
                                    } catch (Throwable th22) {
                                        x92Var6 = new x92(th22);
                                    }
                                    Throwable thM6237a22 = y92.m6237a(x92Var6);
                                    if (thM6237a22 != null) {
                                        c0360jr2.getClass();
                                        hg3.m2166d(C0360jr.f5170h, "Auto reply processing failed: ".concat(fg1.m1624Q(thM6237a22)));
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
                Activity activity2 = up0.f11403k;
                if (activity2 != null) {
                    activity2.runOnUiThread(new RunnableC0446m2(4, jg3Var11));
                    return a83Var;
                }
                t11.m5067S("hostAct");
                throw null;
            default:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui.chatting.viewitems"});
                C0030at c0030at = new C0030at();
                c0030at.m272d0("MicroMsg.ChattingItemContainer");
                cj0Var.f1585u = c0030at;
                return a83Var;
        }
    }
}
