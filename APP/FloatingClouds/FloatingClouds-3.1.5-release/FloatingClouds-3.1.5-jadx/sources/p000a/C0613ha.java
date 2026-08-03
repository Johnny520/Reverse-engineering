package p000a;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Looper;
import android.widget.Switch;
import p000a.C0186K3;

/* JADX INFO: renamed from: a.ha */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0613ha implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0653jc f2272b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0803ra f2273c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0613ha(C0803ra c0803ra, C0653jc c0653jc) {
        this.f2271a = 14;
        this.f2273c = c0803ra;
        this.f2272b = c0653jc;
    }

    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        boolean z;
        AlertDialog alertDialogCreate;
        switch (this.f2271a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0653jc c0653jc = this.f2272b;
                c0653jc.f2420L = zBooleanValue;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc);
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc2 = this.f2272b;
                c0653jc2.f2426R = zBooleanValue2;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc2);
                break;
            case 2:
                String str = (String) obj;
                C0631i9.m1482e(str, "it");
                C0653jc c0653jc3 = this.f2272b;
                c0653jc3.getClass();
                c0653jc3.f2427S = str;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc3);
                break;
            case 3:
                String str2 = (String) obj;
                C0631i9.m1482e(str2, "it");
                C0653jc c0653jc4 = this.f2272b;
                c0653jc4.getClass();
                c0653jc4.f2428T = str2;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc4);
                break;
            case 4:
                String str3 = (String) obj;
                C0631i9.m1482e(str3, "it");
                C0653jc c0653jc5 = this.f2272b;
                c0653jc5.getClass();
                c0653jc5.f2429U = str3;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc5);
                break;
            case 5:
                String str4 = (String) obj;
                C0631i9.m1482e(str4, "it");
                C0653jc c0653jc6 = this.f2272b;
                c0653jc6.getClass();
                c0653jc6.f2430V = str4;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc6);
                break;
            case 6:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc7 = this.f2272b;
                c0653jc7.f2451u = zBooleanValue3;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc7);
                break;
            case 7:
                String str5 = (String) obj;
                C0631i9.m1482e(str5, "it");
                Integer numM2248C = C0959ze.m2248C(str5);
                int iIntValue = numM2248C != null ? numM2248C.intValue() : 3;
                C0653jc c0653jc8 = this.f2272b;
                c0653jc8.f2452v = iIntValue;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc8);
                break;
            case 8:
                String str6 = (String) obj;
                C0631i9.m1482e(str6, "it");
                Integer numM2248C2 = C0959ze.m2248C(str6);
                int iIntValue2 = numM2248C2 != null ? numM2248C2.intValue() : 500;
                C0653jc c0653jc9 = this.f2272b;
                c0653jc9.f2453w = iIntValue2;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc9);
                break;
            case 9:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc10 = this.f2272b;
                c0653jc10.f2454x = zBooleanValue4;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc10);
                break;
            case 10:
                String str7 = (String) obj;
                C0631i9.m1482e(str7, "it");
                Integer numM2248C3 = C0959ze.m2248C(str7);
                int iIntValue3 = numM2248C3 != null ? numM2248C3.intValue() : 800;
                C0653jc c0653jc11 = this.f2272b;
                c0653jc11.f2455y = iIntValue3;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc11);
                break;
            case 11:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc12 = this.f2272b;
                c0653jc12.f2422N = zBooleanValue5;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc12);
                break;
            case 12:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc13 = this.f2272b;
                c0653jc13.f2423O = zBooleanValue6;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc13);
                break;
            case 13:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc14 = this.f2272b;
                c0653jc14.f2449s = zBooleanValue7;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc14);
                break;
            case 14:
                boolean zBooleanValue8 = ((Boolean) obj).booleanValue();
                C0803ra c0803ra = this.f2273c;
                if (!c0803ra.f3176i) {
                    C0653jc c0653jc15 = this.f2272b;
                    c0653jc15.f2450t = zBooleanValue8;
                    C0803ra.m1863i(c0653jc15);
                    Switch r6 = c0803ra.f3175h;
                    if (r6 != null) {
                        C0186K3.f638a.getClass();
                        boolean z2 = C0186K3.a.m508i().f2450t && !C0915x8.m2203a();
                        if (r6.isChecked() != z2) {
                            c0803ra.f3176i = true;
                            r6.setChecked(z2);
                            c0803ra.f3176i = false;
                        }
                    }
                }
                break;
            case 15:
                boolean zBooleanValue9 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc16 = this.f2272b;
                c0653jc16.f2447q = zBooleanValue9;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc16);
                C0816s4 c0816s4 = C0816s4.f3220I;
                if (c0816s4 != null) {
                    ((Handler) c0816s4.f3231C.m625a()).post(new RunnableC0721n4(zBooleanValue9));
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0645j4(c0816s4, 2), 300L);
                }
                break;
            case 16:
                boolean zBooleanValue10 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc17 = this.f2272b;
                c0653jc17.f2444n = zBooleanValue10;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc17);
                break;
            case 17:
                C0653jc c0653jc18 = this.f2272b;
                C0803ra c0803ra2 = this.f2273c;
                c0653jc18.f2445o = ((Boolean) obj).booleanValue();
                c0803ra2.getClass();
                C0803ra.m1863i(c0653jc18);
                C0611h8 c0611h8 = C0611h8.f2258l;
                if (c0611h8 != null) {
                    c0611h8.m1464j();
                }
                break;
            case 18:
                boolean zBooleanValue11 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc19 = this.f2272b;
                c0653jc19.f2446p = zBooleanValue11;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc19);
                break;
            case 19:
                boolean zBooleanValue12 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc20 = this.f2272b;
                c0653jc20.f2431a = zBooleanValue12;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc20);
                break;
            case 20:
                boolean zBooleanValue13 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc21 = this.f2272b;
                c0653jc21.f2448r = zBooleanValue13;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc21);
                break;
            case 21:
                boolean zBooleanValue14 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc22 = this.f2272b;
                c0653jc22.f2421M = zBooleanValue14;
                C0803ra c0803ra3 = this.f2273c;
                c0803ra3.getClass();
                C0803ra.m1863i(c0653jc22);
                if (zBooleanValue14) {
                    C0186K3.f638a.getClass();
                    try {
                        z = C0186K3.a.m509j().getBoolean(C0186K3.f643f, false);
                    } catch (Throwable unused) {
                        z = false;
                    }
                    if (!z && (alertDialogCreate = new AlertDialog.Builder(c0803ra3.f3168a).setTitle("屏蔽微信热更新").setMessage("开启后微信热补丁将被拦截：\n\n• 代价：无法通过热补丁自修复\n• 收益：隐私Hook长期稳定").setPositiveButton("我已知晓", new DialogInterfaceOnClickListenerC0584g0(1)).setNegativeButton("关闭此功能", new DialogInterfaceOnClickListenerC0765pa(c0803ra3, 6)).setCancelable(false).create()) != null) {
                        alertDialogCreate.show();
                        c0803ra3.m1876o(alertDialogCreate);
                    }
                }
                break;
            case 22:
                boolean zBooleanValue15 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc23 = this.f2272b;
                c0653jc23.f2412D = zBooleanValue15;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc23);
                break;
            case 23:
                boolean zBooleanValue16 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc24 = this.f2272b;
                c0653jc24.f2418J = zBooleanValue16;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc24);
                break;
            case 24:
                int iIntValue4 = ((Integer) obj).intValue();
                C0653jc c0653jc25 = this.f2272b;
                c0653jc25.f2419K = iIntValue4;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc25);
                break;
            case 25:
                boolean zBooleanValue17 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc26 = this.f2272b;
                c0653jc26.f2414F = zBooleanValue17;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc26);
                break;
            case 26:
                int iIntValue5 = ((Integer) obj).intValue();
                C0653jc c0653jc27 = this.f2272b;
                c0653jc27.f2415G = iIntValue5;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc27);
                break;
            case 27:
                boolean zBooleanValue18 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc28 = this.f2272b;
                c0653jc28.f2416H = zBooleanValue18;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc28);
                break;
            case 28:
                int iIntValue6 = ((Integer) obj).intValue();
                C0653jc c0653jc29 = this.f2272b;
                c0653jc29.f2417I = iIntValue6;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc29);
                break;
            default:
                boolean zBooleanValue19 = ((Boolean) obj).booleanValue();
                C0653jc c0653jc30 = this.f2272b;
                c0653jc30.f2456z = zBooleanValue19;
                this.f2273c.getClass();
                C0803ra.m1863i(c0653jc30);
                break;
        }
        return C0413Wf.f1577a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0613ha(C0653jc c0653jc, C0803ra c0803ra, int i) {
        this.f2271a = i;
        this.f2272b = c0653jc;
        this.f2273c = c0803ra;
    }
}
