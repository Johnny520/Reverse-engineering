package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r1 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r1(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        List listX0;
        long jA;
        String[] strArrNames;
        ks1 ks1Var = null;
        xv0VarArr = null;
        xv0[] xv0VarArr = null;
        switch (this.h) {
            case 0:
                ((xk1) this.j).setValue(new rh0(vi0.i("https://github.com/", pv2.I0(((p1) this.i).c).toString())));
                return a83.a;
            case 1:
                ((o72) this.i).i = ((xm0) this.j).a();
                return a83.a;
            case 2:
                ((fq) this.i).s(this.j);
                return a83.a;
            case 3:
                ((in0) this.i).j(((mt) this.j).l());
                return a83.a;
            case 4:
                ((in0) this.i).j(c73.a((c73) this.j, 0, 0, !r7.c, null, 11));
                return a83.a;
            case 5:
                ch chVar = (ch) this.i;
                gh ghVar = (gh) this.j;
                String str = ghVar.a;
                String str2 = hh.h;
                ConcurrentHashMap concurrentHashMap = hh.j;
                hh hhVar = hh.d;
                try {
                    long j = chVar.a;
                    if (j > 0) {
                        Thread.sleep(j);
                    }
                    if (concurrentHashMap.get(str) == ghVar) {
                        if (ghVar.i == 0) {
                            hhVar.getClass();
                            hh.v(ghVar);
                        } else {
                            hhVar.getClass();
                            Object objR = hh.r(ghVar);
                            bn1.d.getClass();
                            Object objInvoke = ((Method) bn1.h.getValue()).invoke(bn1.g.getValue(), objR);
                            objInvoke.getClass();
                            if (!((Boolean) objInvoke).booleanValue()) {
                                concurrentHashMap.remove(str, ghVar);
                                hg3.d(str2, "WeChat rejected receive request: sendId=" + str);
                            }
                        }
                    }
                } catch (Throwable th) {
                    concurrentHashMap.remove(str, ghVar);
                    hhVar.getClass();
                    hg3.d(str2, "Start red packet receive failed: ".concat(fg1.Q(th)));
                }
                return a83.a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                di diVar = (di) this.i;
                hi hiVar = (hi) this.j;
                ConcurrentHashMap.KeySetView keySetView = ii.j;
                ii iiVar = ii.d;
                String str3 = ii.h;
                try {
                    long j2 = diVar.a;
                    if (j2 > 0) {
                        Thread.sleep(j2);
                    }
                    iiVar.getClass();
                    Object objQ = ii.q(hiVar);
                    String str4 = hiVar.b;
                    bn1.d.getClass();
                    Object objInvoke2 = ((Method) bn1.h.getValue()).invoke(bn1.g.getValue(), objQ);
                    objInvoke2.getClass();
                    if (((Boolean) objInvoke2).booleanValue()) {
                        hg3.f(str3, "Transfer confirm request queued: transferId=" + str4 + ", payer=" + hiVar.c + ", amount=" + hiVar.f);
                        ii.t(hiVar, diVar.e);
                    } else {
                        keySetView.remove(hiVar.a());
                        hg3.d(str3, "WeChat rejected transfer confirm request: ".concat(str4));
                    }
                } catch (Throwable th2) {
                    keySetView.remove(hiVar.a());
                    iiVar.getClass();
                    hg3.d(str3, "Confirm transfer failed: ".concat(fg1.Q(th2)));
                }
                return a83.a;
            case 7:
                ((sw) this.i).j = (xm0) this.j;
                return a83.a;
            case 8:
                nj njVar = (nj) this.i;
                t61 t61Var = (t61) this.j;
                njVar.B = njVar.w.a(t61Var.h.d(), t61Var.getLayoutDirection(), t61Var);
                return a83.a;
            case 9:
                k03 k03Var = (k03) this.i;
                xk1 xk1Var = (xk1) this.j;
                if (!f13.b(k03Var.b, ((k03) xk1Var.getValue()).b) || !t11.l(k03Var.c, ((k03) xk1Var.getValue()).c)) {
                    xk1Var.setValue(k03Var);
                }
                return a83.a;
            case 10:
                ((xk1) this.j).setValue(new zq(yr.f(), (String) this.i, true, gr.i, be0.h, true, er.i, fe0.h, ir.i, "", 1000, 0L, 0L, true));
                return a83.a;
            case 11:
                Long l = (Long) this.i;
                in0 in0Var = (in0) this.j;
                if (l != null) {
                    in0Var.j(l);
                }
                return a83.a;
            case 12:
                cy cyVar = (cy) this.i;
                Object obj = this.j;
                go0 go0Var = cyVar.h;
                qr2 qr2Var = go0Var.c;
                pr2 pr2VarC = qr2Var.c();
                int i = 0;
                while (i < qr2Var.i) {
                    try {
                        if (pr2VarC.l(i)) {
                            Object objN = pr2VarC.n(i);
                            if (objN != obj) {
                                lo0 lo0Var = objN instanceof lo0 ? (lo0) objN : null;
                                if ((lo0Var != null ? lo0Var.a : null) == obj) {
                                }
                            }
                            ks1 ks1Var2 = new ks1(i, null);
                            pr2VarC.c();
                            ks1Var = ks1Var2;
                            if (ks1Var != null) {
                                int i2 = ks1Var.a;
                                Integer num = ks1Var.b;
                                pr2 pr2VarC2 = qr2Var.c();
                                try {
                                    ArrayList arrayListP = p7.P(pr2VarC2, i2, num);
                                    pr2VarC2.c();
                                    listX0 = du.x0(arrayListP, go0Var.E());
                                } finally {
                                }
                            } else {
                                listX0 = be0.h;
                            }
                            return new ex(listX0, go0Var.C);
                        }
                        int[] iArr = pr2VarC.b;
                        int i3 = i + 1;
                        int iB = (i3 < pr2VarC.c ? iArr[(i3 * 5) + 4] : pr2VarC.e) - sr2.b(iArr, i);
                        for (int i4 = 0; i4 < iB; i4++) {
                            Object objH = pr2VarC.h(i, i4);
                            if (objH != obj) {
                                lo0 lo0Var2 = objH instanceof lo0 ? (lo0) objH : null;
                                if ((lo0Var2 != null ? lo0Var2.a : null) != obj) {
                                }
                            }
                            ks1Var = new ks1(i, Integer.valueOf(i4));
                            if (ks1Var != null) {
                            }
                            return new ex(listX0, go0Var.C);
                        }
                        i = i3;
                    } finally {
                    }
                }
                if (ks1Var != null) {
                }
                return new ex(listX0, go0Var.C);
            case 13:
                return new z01(tp0.J(((ry2) this.i).h((c61) ((xm0) this.j).a())));
            case 14:
                ((xy2) this.i).d.j((cz2) this.j);
                return a83.a;
            case 15:
                zf0 zf0Var = (zf0) this.i;
                String str5 = (String) this.j;
                Enum[] enumArr = zf0Var.a;
                wf0 wf0Var = new wf0(str5, enumArr.length);
                for (Enum r0 : enumArr) {
                    wf0Var.l(r0.name(), false);
                }
                return wf0Var;
            case 16:
                ((o72) this.i).i = p40.p((ul0) this.j, qz1.a);
                return a83.a;
            case 17:
                return HomeActivity.onCreate$lambda$0$17$0$0$4$0((HomeActivity) this.i, (xk1) this.j);
            case 18:
                ((in0) this.i).j(new q0((kx1) this.j, 5));
                return a83.a;
            case 19:
                qv0 qv0Var = (qv0) this.i;
                xv0 xv0Var = (xv0) this.j;
                try {
                    qv0Var.h.c(xv0Var);
                    break;
                } catch (IOException e) {
                    zz1 zz1Var = zz1.a;
                    zz1.a.g("Http2Connection.Listener failure for " + qv0Var.j, 4, e);
                    try {
                        xv0Var.c(cg0.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return a83.a;
            case AIChatConfig.MaxContextRounds /* 20 */:
                x0 x0Var = (x0) this.i;
                xp2 xp2Var = (xp2) this.j;
                o72 o72Var = new o72();
                qv0 qv0Var2 = (qv0) x0Var.j;
                synchronized (qv0Var2.D) {
                    synchronized (qv0Var2) {
                        try {
                            xp2 xp2Var2 = qv0Var2.y;
                            xp2 xp2Var3 = new xp2();
                            xp2Var2.getClass();
                            for (int i5 = 0; i5 < 10; i5++) {
                                if (((1 << i5) & xp2Var2.a) != 0) {
                                    xp2Var3.b(i5, xp2Var2.b[i5]);
                                }
                            }
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (((1 << i6) & xp2Var.a) != 0) {
                                    xp2Var3.b(i6, xp2Var.b[i6]);
                                }
                            }
                            o72Var.i = xp2Var3;
                            jA = ((long) xp2Var3.a()) - ((long) xp2Var2.a());
                            if (jA != 0 && !qv0Var2.i.isEmpty()) {
                                xv0VarArr = (xv0[]) qv0Var2.i.values().toArray(new xv0[0]);
                            }
                            xp2 xp2Var4 = (xp2) o72Var.i;
                            xp2Var4.getClass();
                            qv0Var2.y = xp2Var4;
                            hy2.b(qv0Var2.q, qv0Var2.j + " onSettings", new r1(21, qv0Var2, o72Var));
                        } finally {
                        }
                    }
                    try {
                        qv0Var2.D.b((xp2) o72Var.i);
                    } catch (IOException e2) {
                        cg0 cg0Var = cg0.PROTOCOL_ERROR;
                        qv0Var2.b(cg0Var, cg0Var, e2);
                    }
                    break;
                }
                if (xv0VarArr != null) {
                    int length = xv0VarArr.length;
                    while (i < length) {
                        xv0 xv0Var2 = xv0VarArr[i];
                        synchronized (xv0Var2) {
                            xv0Var2.l += jA;
                            if (jA > 0) {
                                xv0Var2.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return a83.a;
            case 21:
                qv0 qv0Var3 = (qv0) this.i;
                qv0Var3.h.a(qv0Var3, (xp2) ((o72) this.j).i);
                return a83.a;
            case 22:
                yo2 yo2Var = (yo2) this.i;
                u21 u21Var = (u21) this.j;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                f31 f31Var = u21Var.a;
                sp0.N(u21Var, yo2Var);
                int iD = yo2Var.d();
                for (int i7 = 0; i7 < iD; i7++) {
                    List listI = yo2Var.i(i7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listI) {
                        if (obj2 instanceof y31) {
                            arrayList.add(obj2);
                        }
                    }
                    y31 y31Var = (y31) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (y31Var != null && (strArrNames = y31Var.names()) != null) {
                        for (String str6 : strArrNames) {
                            String str7 = t11.l(yo2Var.c(), cp2.g) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str6)) {
                                throw new h31(p7.s(-1, "The suggested name '" + str6 + "' for " + str7 + ' ' + yo2Var.e(i7) + " is already one of the names for " + str7 + ' ' + yo2Var.e(((Number) we1.p0(str6, linkedHashMap)).intValue()) + " in " + yo2Var, null, null, null));
                            }
                            linkedHashMap.put(str6, Integer.valueOf(i7));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? ce0.h : linkedHashMap;
            case 23:
                return new g91((fc2) this.i, ce0.h, (dc2) this.j);
            case 24:
                b5 b5Var = (b5) this.i;
                c62 c62Var = (c62) this.j;
                if (((xg) b5Var.i).get() == 0) {
                    c62Var.a();
                }
                return a83.a;
            case 25:
                ((in0) this.i).j(this.j);
                return a83.a;
            case 26:
                ((yw) this.i).k = (mn0) this.j;
                return a83.a;
            case 27:
                sk1 sk1Var = (sk1) this.i;
                fy fyVar = (fy) this.j;
                Object[] objArr = sk1Var.b;
                long[] jArr = sk1Var.a;
                int length2 = jArr.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j3 = jArr[i8];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j3) < 128) {
                                    fyVar.z(objArr[(i8 << 3) + i10]);
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
                return a83.a;
            case 28:
                ((xk1) this.j).setValue(((cq1) this.i).a);
                return a83.a;
            default:
                Context context = (Context) this.i;
                TextClassification textClassification = (TextClassification) this.j;
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
                return a83.a;
        }
    }
}
