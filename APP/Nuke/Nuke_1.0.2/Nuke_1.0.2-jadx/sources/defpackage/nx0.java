package defpackage;

import android.app.Activity;
import android.widget.TextView;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nx0 implements in0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [n4.B(n4, int):i81] */
    public /* synthetic */ nx0(int i, x81 x81Var) {
        this.h = 13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:bt:IGET), 61, (wrap:java.lang.Object:IGET) */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        z = true;
        boolean z = true;
        int i2 = 0;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                yg1 yg1Var = (yg1) obj;
                yg1Var.getClass();
                yg1.c0(yg1Var, 25);
                if (yg1Var.x == null) {
                    yg1Var.x = new ix1();
                }
                ix1 ix1Var = yg1Var.x;
                ix1Var.getClass();
                p3 p3Var = new p3(true ? 1 : 0);
                p3Var.u = 4;
                p3Var.v = 5;
                ix1Var.u = p3Var;
                yg1Var.h0("send_mid_size", "send_hevc_mid_size");
                break;
            case 1:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.c0(new nx0(i2));
                break;
            case 2:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object obj2 = jg3Var.a.thisObject;
                obj2.getClass();
                ((Activity) obj2).getIntent().putExtra("max_limit_num", 999);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                break;
            case 7:
                break;
            case 8:
                char cCharValue2 = ((Character) obj).charValue();
                break;
            case 9:
                ct ctVar = (ct) obj;
                ctVar.getClass();
                ct.a(ctVar, "JsonPrimitive", new p31(new dy(28)));
                ct.a(ctVar, "JsonNull", new p31(new dy(29)));
                ct.a(ctVar, "JsonLiteral", new p31(new n31(i2)));
                ct.a(ctVar, "JsonObject", new p31(new n31(true ? 1 : 0)));
                ct.a(ctVar, "JsonArray", new p31(new n31(2)));
                break;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                j31 j31Var = (j31) entry.getValue();
                StringBuilder sb = new StringBuilder();
                mv2.a(sb, str);
                sb.append(':');
                sb.append(j31Var);
                break;
            case 11:
                ((Integer) obj).getClass();
                break;
            case 12:
                List list = (List) obj;
                break;
            case 13:
                break;
            case 14:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.t = mg.t0(new String[]{"com.tencent.mm.ui.base.preference"});
                yg1 yg1Var2 = new yg1();
                yg1Var2.i0(0);
                Class cls = Void.TYPE;
                cls.getClass();
                yg1Var2.f0(cls);
                yg1Var2.d0(1);
                yg1Var2.e0(CharSequence.class);
                dj0Var2.u = yg1Var2;
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                ib1 ib1Var = (ib1) obj;
                ib1Var.getClass();
                p40 p40Var = ib1Var.p;
                if (p40Var instanceof ib1) {
                }
                break;
            case 19:
                ib1 ib1Var2 = (ib1) obj;
                ib1Var2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ib1Var2.n);
                sb2.append('=');
                sb2.append(ib1Var2.o);
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                dj0Var3.t = mg.t0(new String[]{"com.tencent.mm.plugin.luckymoney.model"});
                yg1 yg1Var3 = new yg1();
                yg1Var3.j0("MicroMsg.LuckyMoneyUtil", "exception:%s");
                dj0Var3.u = yg1Var3;
                break;
            case 21:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                at atVar = new at();
                atVar.d0("mCoreAccount not initialized!");
                cj0Var.u = atVar;
                break;
            case 22:
                at atVar2 = (at) obj;
                atVar2.getClass();
                atVar2.d0("MicroMsg.MMKernel", "Kernel not null, has initialized.");
                break;
            case 23:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                yg1 yg1Var4 = new yg1();
                nx0 nx0Var = new nx0(22);
                at atVar3 = new at();
                nx0Var.j(atVar3);
                yg1Var4.v = atVar3;
                yg1.c0(yg1Var4, 9);
                yg1Var4.d0(0);
                yg1Var4.j0("mCoreStorage not initialized!");
                dj0Var4.u = yg1Var4;
                break;
            case 24:
                ((Long) obj).getClass();
                break;
            case 25:
                Member memberB = ((wf1) obj).b();
                memberB.getClass();
                break;
            case 26:
                break;
            case 27:
                at atVar4 = (at) obj;
                atVar4.getClass();
                yg1 yg1Var5 = new yg1();
                yg1Var5.g0("onCreate");
                ah1 ah1Var = atVar4.v;
                if (ah1Var == null) {
                    ah1Var = new ah1();
                }
                atVar4.v = ah1Var;
                List arrayList = ah1Var.t;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ah1Var.t = arrayList;
                arrayList.add(yg1Var5);
                yg1 yg1Var6 = new yg1();
                yg1Var6.g0("onAccountReleased");
                ah1 ah1Var2 = atVar4.v;
                if (ah1Var2 == null) {
                    ah1Var2 = new ah1();
                }
                atVar4.v = ah1Var2;
                List arrayList2 = ah1Var2.t;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ah1Var2.t = arrayList2;
                arrayList2.add(yg1Var6);
                break;
            case 28:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                cj0Var2.t = mg.t0(new String[]{"com.tencent.mm.plugin.messenger.foundation"});
                cj0Var2.c0(new nx0(27));
                break;
            default:
                jg3 jg3Var2 = (jg3) obj;
                jg3Var2.getClass();
                Object obj3 = jg3Var2.a.thisObject;
                obj3.getClass();
                TextView textView = (TextView) obj3;
                Object obj4 = jg3Var2.a()[0];
                CharSequence charSequence = obj4 instanceof CharSequence ? (CharSequence) obj4 : null;
                if (charSequence != null) {
                    di1.d.getClass();
                    if (pv2.h0(charSequence, "个朋友", false)) {
                        o72 o72Var = di1.j;
                        if (((Pattern) o72Var.i).matcher(charSequence).find() && pv2.h0(tp0.y(), "com.tencent.mm.ui.contact", false)) {
                            int i3 = di1.q().a;
                            if (i3 != -1) {
                                textView.setVisibility(0);
                                Object[] objArrA = jg3Var2.a();
                                String string = charSequence.toString();
                                if (i3 < 0) {
                                    i3 = 0;
                                }
                                String strValueOf = String.valueOf(i3);
                                string.getClass();
                                strValueOf.getClass();
                                String strReplaceFirst = ((Pattern) o72Var.i).matcher(string).replaceFirst(strValueOf);
                                strReplaceFirst.getClass();
                                objArrA[0] = strReplaceFirst;
                            } else {
                                textView.setVisibility(8);
                            }
                        }
                    }
                }
                break;
        }
        return a83Var;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a2.r(java.lang.Object):java.lang.Object, b03.<init>(w73):void, b2.r(java.lang.Object):java.lang.Object, be1.a(org.luckypray.dexkit.DexKitBridge):void, ce1.a(org.luckypray.dexkit.DexKitBridge):void, d41.toString():java.lang.String, d91.<clinit>():void, dp1.r(java.lang.Object):java.lang.Object, h50.r(java.lang.Object):java.lang.Object, nx0.j(java.lang.Object):java.lang.Object, o31.<clinit>():void, ox0.a(org.luckypray.dexkit.DexKitBridge):void, pg1.a(org.luckypray.dexkit.DexKitBridge):void, q91.a(org.luckypray.dexkit.DexKitBridge):void, s81.a(s81, java.lang.String, kw, int):void, t91.<init>(iz2, b62, bt2):void, tl.i(ng, zf1, yf1):bj0, u91.<init>(android.view.View, j9, sz0):void, zd1.a(org.luckypray.dexkit.DexKitBridge):void, zh.j(java.lang.Object):java.lang.Object] */
    public /* synthetic */ nx0(int i) {
        this.h = i;
    }
}
