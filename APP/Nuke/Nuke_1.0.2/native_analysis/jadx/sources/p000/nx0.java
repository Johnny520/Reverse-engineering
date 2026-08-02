package p000;

import android.app.Activity;
import android.widget.TextView;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nx0 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7361h;

    public /* synthetic */ nx0(int i, x81 x81Var) {
        this.f7361h = 13;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f7361h;
        z = true;
        boolean z = true;
        int i2 = 0;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                yg1 yg1Var = (yg1) obj;
                yg1Var.getClass();
                yg1.m6269c0(yg1Var, 25);
                if (yg1Var.f13449x == null) {
                    yg1Var.f13449x = new ix1();
                }
                ix1 ix1Var = yg1Var.f13449x;
                ix1Var.getClass();
                C0566p3 c0566p3 = new C0566p3(true ? 1 : 0);
                c0566p3.f7956u = 4;
                c0566p3.f7957v = 5;
                ix1Var.f4828u = c0566p3;
                yg1Var.m6275h0("send_mid_size", "send_hevc_mid_size");
                break;
            case 1:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.m1030c0(new nx0(i2));
                break;
            case 2:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object obj2 = jg3Var.f5028a.thisObject;
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
                C0105ct c0105ct = (C0105ct) obj;
                c0105ct.getClass();
                C0105ct.m885a(c0105ct, "JsonPrimitive", new p31(new C0146dy(28)));
                C0105ct.m885a(c0105ct, "JsonNull", new p31(new C0146dy(29)));
                C0105ct.m885a(c0105ct, "JsonLiteral", new p31(new n31(i2)));
                C0105ct.m885a(c0105ct, "JsonObject", new p31(new n31(true ? 1 : 0)));
                C0105ct.m885a(c0105ct, "JsonArray", new p31(new n31(2)));
                break;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                j31 j31Var = (j31) entry.getValue();
                StringBuilder sb = new StringBuilder();
                mv2.m3212a(sb, str);
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
                dj0Var2.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui.base.preference"});
                yg1 yg1Var2 = new yg1();
                yg1Var2.m6276i0(0);
                Class cls = Void.TYPE;
                cls.getClass();
                yg1Var2.m6273f0(cls);
                yg1Var2.m6271d0(1);
                yg1Var2.m6272e0(CharSequence.class);
                dj0Var2.f2078u = yg1Var2;
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
                p40 p40Var = ib1Var.f4521p;
                if (p40Var instanceof ib1) {
                }
                break;
            case 19:
                ib1 ib1Var2 = (ib1) obj;
                ib1Var2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ib1Var2.f4519n);
                sb2.append('=');
                sb2.append(ib1Var2.f4520o);
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                dj0Var3.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.plugin.luckymoney.model"});
                yg1 yg1Var3 = new yg1();
                yg1Var3.m6277j0("MicroMsg.LuckyMoneyUtil", "exception:%s");
                dj0Var3.f2078u = yg1Var3;
                break;
            case 21:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                C0030at c0030at = new C0030at();
                c0030at.m272d0("mCoreAccount not initialized!");
                cj0Var.f1585u = c0030at;
                break;
            case 22:
                C0030at c0030at2 = (C0030at) obj;
                c0030at2.getClass();
                c0030at2.m272d0("MicroMsg.MMKernel", "Kernel not null, has initialized.");
                break;
            case 23:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                yg1 yg1Var4 = new yg1();
                nx0 nx0Var = new nx0(22);
                C0030at c0030at3 = new C0030at();
                nx0Var.mo5j(c0030at3);
                yg1Var4.f13447v = c0030at3;
                yg1.m6269c0(yg1Var4, 9);
                yg1Var4.m6271d0(0);
                yg1Var4.m6277j0("mCoreStorage not initialized!");
                dj0Var4.f2078u = yg1Var4;
                break;
            case 24:
                ((Long) obj).getClass();
                break;
            case 25:
                Member memberMo534b = ((wf1) obj).mo534b();
                memberMo534b.getClass();
                break;
            case 26:
                break;
            case 27:
                C0030at c0030at4 = (C0030at) obj;
                c0030at4.getClass();
                yg1 yg1Var5 = new yg1();
                yg1Var5.m6274g0("onCreate");
                ah1 ah1Var = c0030at4.f372v;
                if (ah1Var == null) {
                    ah1Var = new ah1();
                }
                c0030at4.f372v = ah1Var;
                List arrayList = ah1Var.f202t;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ah1Var.f202t = arrayList;
                arrayList.add(yg1Var5);
                yg1 yg1Var6 = new yg1();
                yg1Var6.m6274g0("onAccountReleased");
                ah1 ah1Var2 = c0030at4.f372v;
                if (ah1Var2 == null) {
                    ah1Var2 = new ah1();
                }
                c0030at4.f372v = ah1Var2;
                List arrayList2 = ah1Var2.f202t;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ah1Var2.f202t = arrayList2;
                arrayList2.add(yg1Var6);
                break;
            case 28:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                cj0Var2.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.plugin.messenger.foundation"});
                cj0Var2.m845c0(new nx0(27));
                break;
            default:
                jg3 jg3Var2 = (jg3) obj;
                jg3Var2.getClass();
                Object obj3 = jg3Var2.f5028a.thisObject;
                obj3.getClass();
                TextView textView = (TextView) obj3;
                Object obj4 = jg3Var2.m2496a()[0];
                CharSequence charSequence = obj4 instanceof CharSequence ? (CharSequence) obj4 : null;
                if (charSequence != null) {
                    di1.f2063d.getClass();
                    if (pv2.m3995h0(charSequence, "个朋友", false)) {
                        o72 o72Var = di1.f2069j;
                        if (((Pattern) o72Var.f7574i).matcher(charSequence).find() && pv2.m3995h0(tp0.m5374y(), "com.tencent.mm.ui.contact", false)) {
                            int i3 = di1.m1029q().f1571a;
                            if (i3 != -1) {
                                textView.setVisibility(0);
                                Object[] objArrM2496a = jg3Var2.m2496a();
                                String string = charSequence.toString();
                                if (i3 < 0) {
                                    i3 = 0;
                                }
                                String strValueOf = String.valueOf(i3);
                                string.getClass();
                                strValueOf.getClass();
                                String strReplaceFirst = ((Pattern) o72Var.f7574i).matcher(string).replaceFirst(strValueOf);
                                strReplaceFirst.getClass();
                                objArrM2496a[0] = strReplaceFirst;
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

    public /* synthetic */ nx0(int i) {
        this.f7361h = i;
    }
}
