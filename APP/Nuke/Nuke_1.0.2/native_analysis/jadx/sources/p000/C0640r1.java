package p000;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.p003ui.HomeActivity;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0640r1 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9312h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f9313i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f9314j;

    public /* synthetic */ C0640r1(int i, Object obj, Object obj2) {
        this.f9312h = i;
        this.f9313i = obj;
        this.f9314j = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6a() {
        List listM1168x0;
        long jM6170a;
        String[] strArrNames;
        ks1 ks1Var = null;
        xv0VarArr = null;
        xv0[] xv0VarArr = null;
        switch (this.f9312h) {
            case 0:
                ((xk1) this.f9314j).setValue(new rh0(vi0.m5690i("https://github.com/", pv2.m3993I0(((C0564p1) this.f9313i).f7922c).toString())));
                return a83.f116a;
            case 1:
                ((o72) this.f9313i).f7574i = ((xm0) this.f9314j).mo6a();
                return a83.f116a;
            case 2:
                ((InterfaceC0212fq) this.f9313i).mo2225s(this.f9314j);
                return a83.f116a;
            case 3:
                ((in0) this.f9313i).mo5j(((C0473mt) this.f9314j).m3202l());
                return a83.f116a;
            case 4:
                ((in0) this.f9313i).mo5j(c73.m662a((c73) this.f9314j, 0, 0, !r7.f1223c, null, 11));
                return a83.f116a;
            case 5:
                C0091ch c0091ch = (C0091ch) this.f9313i;
                C0240gh c0240gh = (C0240gh) this.f9314j;
                String str = c0240gh.f3513a;
                String str2 = C0277hh.f4008h;
                ConcurrentHashMap concurrentHashMap = C0277hh.f4010j;
                C0277hh c0277hh = C0277hh.f4004d;
                try {
                    long j = c0091ch.f1534a;
                    if (j > 0) {
                        Thread.sleep(j);
                    }
                    if (concurrentHashMap.get(str) == c0240gh) {
                        if (c0240gh.f3521i == 0) {
                            c0277hh.getClass();
                            C0277hh.m2177v(c0240gh);
                        } else {
                            c0277hh.getClass();
                            Object objM2173r = C0277hh.m2173r(c0240gh);
                            bn1.f944d.getClass();
                            Object objInvoke = ((Method) bn1.f948h.getValue()).invoke(bn1.f947g.getValue(), objM2173r);
                            objInvoke.getClass();
                            if (!((Boolean) objInvoke).booleanValue()) {
                                concurrentHashMap.remove(str, c0240gh);
                                hg3.m2166d(str2, "WeChat rejected receive request: sendId=" + str);
                            }
                        }
                    }
                } catch (Throwable th) {
                    concurrentHashMap.remove(str, c0240gh);
                    c0277hh.getClass();
                    hg3.m2166d(str2, "Start red packet receive failed: ".concat(fg1.m1624Q(th)));
                }
                return a83.f116a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                C0131di c0131di = (C0131di) this.f9313i;
                C0278hi c0278hi = (C0278hi) this.f9314j;
                ConcurrentHashMap.KeySetView keySetView = C0314ii.f4627j;
                C0314ii c0314ii = C0314ii.f4621d;
                String str3 = C0314ii.f4625h;
                try {
                    long j2 = c0131di.f2057a;
                    if (j2 > 0) {
                        Thread.sleep(j2);
                    }
                    c0314ii.getClass();
                    Object objM2348q = C0314ii.m2348q(c0278hi);
                    String str4 = c0278hi.f4024b;
                    bn1.f944d.getClass();
                    Object objInvoke2 = ((Method) bn1.f948h.getValue()).invoke(bn1.f947g.getValue(), objM2348q);
                    objInvoke2.getClass();
                    if (((Boolean) objInvoke2).booleanValue()) {
                        hg3.m2168f(str3, "Transfer confirm request queued: transferId=" + str4 + ", payer=" + c0278hi.f4025c + ", amount=" + c0278hi.f4028f);
                        C0314ii.m2351t(c0278hi, c0131di.f2061e);
                    } else {
                        keySetView.remove(c0278hi.m2192a());
                        hg3.m2166d(str3, "WeChat rejected transfer confirm request: ".concat(str4));
                    }
                } catch (Throwable th2) {
                    keySetView.remove(c0278hi.m2192a());
                    c0314ii.getClass();
                    hg3.m2166d(str3, "Confirm transfer failed: ".concat(fg1.m1624Q(th2)));
                }
                return a83.f116a;
            case 7:
                ((C0710sw) this.f9313i).f10385j = (xm0) this.f9314j;
                return a83.f116a;
            case 8:
                C0500nj c0500nj = (C0500nj) this.f9313i;
                t61 t61Var = (t61) this.f9314j;
                c0500nj.f7173B = c0500nj.f7175w.mo248a(t61Var.f10581h.mo3280d(), t61Var.getLayoutDirection(), t61Var);
                return a83.f116a;
            case 9:
                k03 k03Var = (k03) this.f9313i;
                xk1 xk1Var = (xk1) this.f9314j;
                if (!f13.m1493b(k03Var.f5297b, ((k03) xk1Var.getValue()).f5297b) || !t11.m5086l(k03Var.f5298c, ((k03) xk1Var.getValue()).f5298c)) {
                    xk1Var.setValue(k03Var);
                }
                return a83.f116a;
            case 10:
                ((xk1) this.f9314j).setValue(new C0971zq(AbstractC0933yr.m6317f(), (String) this.f9313i, true, EnumC0250gr.f3670i, be0.f819h, true, EnumC0176er.f2563i, fe0.f2918h, EnumC0323ir.f4751i, "", 1000, 0L, 0L, true));
                return a83.f116a;
            case 11:
                Long l = (Long) this.f9313i;
                in0 in0Var = (in0) this.f9314j;
                if (l != null) {
                    in0Var.mo5j(l);
                }
                return a83.f116a;
            case 12:
                C0110cy c0110cy = (C0110cy) this.f9313i;
                Object obj = this.f9314j;
                go0 go0Var = c0110cy.f1774h;
                qr2 qr2Var = go0Var.f3618c;
                pr2 pr2VarM4274c = qr2Var.m4274c();
                int i = 0;
                while (i < qr2Var.f9133i) {
                    try {
                        if (pr2VarM4274c.m3959l(i)) {
                            Object objM3961n = pr2VarM4274c.m3961n(i);
                            if (objM3961n != obj) {
                                lo0 lo0Var = objM3961n instanceof lo0 ? (lo0) objM3961n : null;
                                if ((lo0Var != null ? lo0Var.f6226a : null) == obj) {
                                }
                            }
                            ks1 ks1Var2 = new ks1(i, null);
                            pr2VarM4274c.m3950c();
                            ks1Var = ks1Var2;
                            if (ks1Var != null) {
                                int i2 = ks1Var.f5741a;
                                Integer num = ks1Var.f5742b;
                                pr2 pr2VarM4274c2 = qr2Var.m4274c();
                                try {
                                    ArrayList arrayListM3760P = AbstractC0570p7.m3760P(pr2VarM4274c2, i2, num);
                                    pr2VarM4274c2.m3950c();
                                    listM1168x0 = AbstractC0142du.m1168x0(arrayListM3760P, go0Var.m1949E());
                                } finally {
                                }
                            } else {
                                listM1168x0 = be0.f819h;
                            }
                            return new C0182ex(listM1168x0, go0Var.f3597C);
                        }
                        int[] iArr = pr2VarM4274c.f8516b;
                        int i3 = i + 1;
                        int iM4990b = (i3 < pr2VarM4274c.f8517c ? iArr[(i3 * 5) + 4] : pr2VarM4274c.f8519e) - sr2.m4990b(iArr, i);
                        for (int i4 = 0; i4 < iM4990b; i4++) {
                            Object objM3955h = pr2VarM4274c.m3955h(i, i4);
                            if (objM3955h != obj) {
                                lo0 lo0Var2 = objM3955h instanceof lo0 ? (lo0) objM3955h : null;
                                if ((lo0Var2 != null ? lo0Var2.f6226a : null) != obj) {
                                }
                            }
                            ks1Var = new ks1(i, Integer.valueOf(i4));
                            if (ks1Var != null) {
                            }
                            return new C0182ex(listM1168x0, go0Var.f3597C);
                        }
                        i = i3;
                    } finally {
                    }
                }
                if (ks1Var != null) {
                }
                return new C0182ex(listM1168x0, go0Var.f3597C);
            case 13:
                return new z01(tp0.m5346J(((ry2) this.f9313i).mo1767h((c61) ((xm0) this.f9314j).mo6a())));
            case 14:
                ((xy2) this.f9313i).f13239d.mo5j((cz2) this.f9314j);
                return a83.f116a;
            case 15:
                zf0 zf0Var = (zf0) this.f9313i;
                String str5 = (String) this.f9314j;
                Enum[] enumArr = zf0Var.f13868a;
                wf0 wf0Var = new wf0(str5, enumArr.length);
                for (Enum r0 : enumArr) {
                    wf0Var.m359l(r0.name(), false);
                }
                return wf0Var;
            case 16:
                ((o72) this.f9313i).f7574i = p40.m3733p((ul0) this.f9314j, qz1.f9295a);
                return a83.f116a;
            case 17:
                return HomeActivity.onCreate$lambda$0$17$0$0$4$0((HomeActivity) this.f9313i, (xk1) this.f9314j);
            case 18:
                ((in0) this.f9313i).mo5j(new C0600q0((kx1) this.f9314j, 5));
                return a83.f116a;
            case 19:
                qv0 qv0Var = (qv0) this.f9313i;
                xv0 xv0Var = (xv0) this.f9314j;
                try {
                    qv0Var.f9186h.mo3451c(xv0Var);
                    break;
                } catch (IOException e) {
                    zz1 zz1Var = zz1.f14161a;
                    zz1.f14161a.mo715g("Http2Connection.Listener failure for " + qv0Var.f9188j, 4, e);
                    try {
                        xv0Var.m6184c(cg0.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return a83.f116a;
            case AIChatConfig.MaxContextRounds /* 20 */:
                C0867x0 c0867x0 = (C0867x0) this.f9313i;
                xp2 xp2Var = (xp2) this.f9314j;
                o72 o72Var = new o72();
                qv0 qv0Var2 = (qv0) c0867x0.f12748j;
                synchronized (qv0Var2.f9183D) {
                    synchronized (qv0Var2) {
                        try {
                            xp2 xp2Var2 = qv0Var2.f9203y;
                            xp2 xp2Var3 = new xp2();
                            xp2Var2.getClass();
                            for (int i5 = 0; i5 < 10; i5++) {
                                if (((1 << i5) & xp2Var2.f13107a) != 0) {
                                    xp2Var3.m6171b(i5, xp2Var2.f13108b[i5]);
                                }
                            }
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (((1 << i6) & xp2Var.f13107a) != 0) {
                                    xp2Var3.m6171b(i6, xp2Var.f13108b[i6]);
                                }
                            }
                            o72Var.f7574i = xp2Var3;
                            jM6170a = ((long) xp2Var3.m6170a()) - ((long) xp2Var2.m6170a());
                            if (jM6170a != 0 && !qv0Var2.f9187i.isEmpty()) {
                                xv0VarArr = (xv0[]) qv0Var2.f9187i.values().toArray(new xv0[0]);
                            }
                            xp2 xp2Var4 = (xp2) o72Var.f7574i;
                            xp2Var4.getClass();
                            qv0Var2.f9203y = xp2Var4;
                            hy2.m2234b(qv0Var2.f9195q, qv0Var2.f9188j + " onSettings", new C0640r1(21, qv0Var2, o72Var));
                        } finally {
                        }
                    }
                    try {
                        qv0Var2.f9183D.m6347b((xp2) o72Var.f7574i);
                    } catch (IOException e2) {
                        cg0 cg0Var = cg0.PROTOCOL_ERROR;
                        qv0Var2.m4281b(cg0Var, cg0Var, e2);
                    }
                    break;
                }
                if (xv0VarArr != null) {
                    int length = xv0VarArr.length;
                    while (i < length) {
                        xv0 xv0Var2 = xv0VarArr[i];
                        synchronized (xv0Var2) {
                            xv0Var2.f13185l += jM6170a;
                            if (jM6170a > 0) {
                                xv0Var2.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return a83.f116a;
            case 21:
                qv0 qv0Var3 = (qv0) this.f9313i;
                qv0Var3.f9186h.mo3642a(qv0Var3, (xp2) ((o72) this.f9314j).f7574i);
                return a83.f116a;
            case 22:
                yo2 yo2Var = (yo2) this.f9313i;
                u21 u21Var = (u21) this.f9314j;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                f31 f31Var = u21Var.f11072a;
                sp0.m4915N(u21Var, yo2Var);
                int iMo252d = yo2Var.mo252d();
                for (int i7 = 0; i7 < iMo252d; i7++) {
                    List listMo255i = yo2Var.mo255i(i7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listMo255i) {
                        if (obj2 instanceof y31) {
                            arrayList.add(obj2);
                        }
                    }
                    y31 y31Var = (y31) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (y31Var != null && (strArrNames = y31Var.names()) != null) {
                        for (String str6 : strArrNames) {
                            String str7 = t11.m5086l(yo2Var.mo251c(), cp2.f1664g) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str6)) {
                                throw new h31(AbstractC0570p7.m3783s(-1, "The suggested name '" + str6 + "' for " + str7 + ' ' + yo2Var.mo253e(i7) + " is already one of the names for " + str7 + ' ' + yo2Var.mo253e(((Number) we1.m5875p0(str6, linkedHashMap)).intValue()) + " in " + yo2Var, null, null, null));
                            }
                            linkedHashMap.put(str6, Integer.valueOf(i7));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? ce0.f1492h : linkedHashMap;
            case 23:
                return new g91((fc2) this.f9313i, ce0.f1492h, (dc2) this.f9314j);
            case 24:
                C0043b5 c0043b5 = (C0043b5) this.f9313i;
                c62 c62Var = (c62) this.f9314j;
                if (((C0885xg) c0043b5.f562i).get() == 0) {
                    c62Var.mo6a();
                }
                return a83.f116a;
            case 25:
                ((in0) this.f9313i).mo5j(this.f9314j);
                return a83.f116a;
            case 26:
                ((C0940yw) this.f9313i).f13637k = (mn0) this.f9314j;
                return a83.f116a;
            case 27:
                sk1 sk1Var = (sk1) this.f9313i;
                C0220fy c0220fy = (C0220fy) this.f9314j;
                Object[] objArr = sk1Var.f10175b;
                long[] jArr = sk1Var.f10174a;
                int length2 = jArr.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j3 = jArr[i8];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j3) < 128) {
                                    c0220fy.m1755z(objArr[(i8 << 3) + i10]);
                                }
                                j3 >>= 8;
                            }
                            if (i9 == 8) {
                                if (i8 != length2) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                return a83.f116a;
            case 28:
                ((xk1) this.f9314j).setValue(((cq1) this.f9313i).f1675a);
                return a83.f116a;
            default:
                Context context = (Context) this.f9313i;
                TextClassification textClassification = (TextClassification) this.f9314j;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e3) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e3);
                    }
                    break;
                } else {
                    activity.send();
                }
                return a83.f116a;
        }
    }
}
