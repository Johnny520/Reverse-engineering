package p000;

import android.app.Activity;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.Adapter;
import android.widget.AdapterView;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.List;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.p003ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ml2 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6718h;

    public /* synthetic */ ml2(int i) {
        this.f6718h = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0258  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        Integer num;
        Adapter adapter;
        Object x92Var;
        Object x92Var2;
        int i = 8;
        hx1 hx1Var = null;
        boolean z = true;
        z = true;
        switch (this.f6718h) {
            case 0:
                return new nl2(((Integer) obj).intValue());
            case 1:
                return Boolean.valueOf(!false);
            case 2:
                rs1 rs1Var = (rs1) obj;
                long j = rs1Var.f9744a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new C0383kd(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & rs1Var.f9744a))) : in2.f4704a;
            case 3:
                C0383kd c0383kd = (C0383kd) obj;
                return new rs1((((long) Float.floatToRawIntBits(c0383kd.f5461b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0383kd.f5460a)) << 32));
            case 4:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                yg1 yg1Var = new yg1();
                yg1.m6269c0(yg1Var, 8);
                yg1Var.m6272e0(Class.class);
                yg1Var.m6275h0("calling getService(...)");
                a83 a83Var = a83.f116a;
                dj0Var.f2078u = yg1Var;
                return a83Var;
            case 5:
                Activity activity = (Activity) obj;
                activity.getClass();
                activity.startActivity(new Intent(activity, (Class<?>) HomeActivity.class));
                return a83.f116a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                jg3 jg3Var = (jg3) obj;
                a83 a83Var2 = a83.f116a;
                jg3Var.getClass();
                AdapterView adapterView = (AdapterView) jg3Var.m2496a()[0];
                if (adapterView != null && (num = (Integer) jg3Var.m2496a()[2]) != null && (adapter = adapterView.getAdapter()) != null) {
                    sg1 sg1VarM3244v = op0.m3602y(adapter).m3244v();
                    sg1VarM3244v.f13871b = "getItem";
                    sg1VarM3244v.m6411b();
                    Object objM6415g0 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0(num);
                    if (objM6415g0 != null && t11.m5086l(objM6415g0.toString(), "Nuke")) {
                        Activity activity2 = up0.f11403k;
                        if (activity2 == null) {
                            t11.m5067S("hostAct");
                            throw null;
                        }
                        Activity activity3 = up0.f11403k;
                        if (activity3 == null) {
                            t11.m5067S("hostAct");
                            throw null;
                        }
                        activity2.startActivity(new Intent(activity3, (Class<?>) HomeActivity.class));
                        jg3Var.m2497b(null);
                    }
                }
                return a83Var2;
            case 7:
                C0030at c0030at = (C0030at) obj;
                c0030at.getClass();
                c0030at.m272d0("", "activity", "context", "intent");
                ml2 ml2Var = new ml2(i);
                yg1 yg1Var2 = new yg1();
                ml2Var.mo5j(yg1Var2);
                ah1 ah1Var = c0030at.f372v;
                if (ah1Var == null) {
                    ah1Var = new ah1();
                }
                c0030at.f372v = ah1Var;
                List arrayList = ah1Var.f202t;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ah1Var.f202t = arrayList;
                arrayList.add(yg1Var2);
                C0030at c0030at2 = new C0030at();
                C0030at.m270b0(c0030at2, "com.tencent.mm.plugin.newtips.model", 4);
                a83 a83Var3 = a83.f116a;
                k11 k11Var = c0030at.f371u;
                if (k11Var == null) {
                    k11Var = new k11();
                }
                c0030at.f371u = k11Var;
                List arrayList2 = k11Var.f5318t;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                k11Var.f5318t = arrayList2;
                arrayList2.add(c0030at2);
                return a83Var3;
            case 8:
                yg1 yg1Var3 = (yg1) obj;
                yg1Var3.getClass();
                yg1Var3.f13445t = new lv2("<init>", 5);
                ix1 ix1Var = new ix1();
                ix1Var.f4827t = new ArrayList(be0.f819h);
                String str = new String[]{"androidx.appcompat.app.AppCompatActivity"}[0];
                if (str != null) {
                    hx1Var = new hx1();
                    C0030at c0030at3 = new C0030at();
                    c0030at3.f370t = new lv2(str, 5);
                    hx1Var.f4167t = c0030at3;
                }
                List arrayList3 = ix1Var.f4827t;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                ix1Var.f4827t = arrayList3;
                arrayList3.add(hx1Var);
                yg1Var3.f13449x = ix1Var;
                return a83.f116a;
            case 9:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.m845c0(new ml2(7));
                return a83.f116a;
            case 10:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                C0030at c0030at4 = new C0030at();
                c0030at4.m272d0("MicroMsg.SettingDataFactory");
                a83 a83Var4 = a83.f116a;
                cj0Var2.f1585u = c0030at4;
                return a83Var4;
            case 11:
                cj0 cj0Var3 = (cj0) obj;
                cj0Var3.getClass();
                C0030at c0030at5 = new C0030at();
                c0030at5.m272d0("SettingLocation(parentGroup=");
                a83 a83Var5 = a83.f116a;
                cj0Var3.f1585u = c0030at5;
                return a83Var5;
            case 12:
                yg1 yg1Var4 = (yg1) obj;
                yg1Var4.getClass();
                C0030at c0030at6 = new C0030at();
                c0030at6.m272d0("List has more than one element.", "List is empty.");
                a83 a83Var6 = a83.f116a;
                yg1Var4.f13447v = c0030at6;
                yg1Var4.m6276i0(0, 1);
                yg1Var4.m6277j0("<this>");
                yg1Var4.m6272e0(Iterable.class);
                yg1Var4.m6273f0(List.class);
                ml2 ml2Var2 = new ml2(13);
                ah1 ah1Var2 = new ah1();
                ml2Var2.mo5j(ah1Var2);
                yg1Var4.f13444A = ah1Var2;
                return a83Var6;
            case 13:
                ah1 ah1Var3 = (ah1) obj;
                ah1Var3.getClass();
                yg1 yg1Var5 = new yg1();
                yg1Var5.m6274g0("size");
                a83 a83Var7 = a83.f116a;
                List arrayList4 = ah1Var3.f202t;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                ah1Var3.f202t = arrayList4;
                arrayList4.add(yg1Var5);
                yg1 yg1Var6 = new yg1();
                yg1Var6.m6274g0("get");
                List arrayList5 = ah1Var3.f202t;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                ah1Var3.f202t = arrayList5;
                arrayList5.add(yg1Var6);
                yg1 yg1Var7 = new yg1();
                yg1Var7.m6274g0("iterator");
                List arrayList6 = ah1Var3.f202t;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                ah1Var3.f202t = arrayList6;
                arrayList6.add(yg1Var7);
                yg1 yg1Var8 = new yg1();
                yg1Var8.m6274g0("next");
                List arrayList7 = ah1Var3.f202t;
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                }
                ah1Var3.f202t = arrayList7;
                arrayList7.add(yg1Var8);
                return a83Var7;
            case 14:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.m1030c0(new ml2(12));
                return a83.f116a;
            case 15:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                yg1 yg1Var9 = new yg1();
                C0030at c0030at7 = new C0030at();
                c0030at7.f370t = new lv2("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo", 5);
                yg1Var9.f13447v = c0030at7;
                yg1Var9.m6271d0(0);
                yg1Var9.m6273f0(Integer.class);
                a83 a83Var8 = a83.f116a;
                dj0Var3.f2078u = yg1Var9;
                return a83Var8;
            case 16:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                yg1 yg1Var10 = new yg1();
                wp2.f12607d.getClass();
                yg1Var10.m6270b0(wp2.m5950j());
                Class cls = Integer.TYPE;
                cls.getClass();
                yg1Var10.m6273f0(cls);
                yg1Var10.m6271d0(0);
                yg1Var10.m6276i0(1);
                a83 a83Var9 = a83.f116a;
                dj0Var4.f2078u = yg1Var10;
                return a83Var9;
            case 17:
                dj0 dj0Var5 = (dj0) obj;
                dj0Var5.getClass();
                yg1 yg1Var11 = new yg1();
                wp2.f12607d.getClass();
                yg1Var11.m6270b0(wp2.m5950j());
                yg1Var11.m6277j0("SettingGroup_Main_Other_Plugin");
                a83 a83Var10 = a83.f116a;
                dj0Var5.f2078u = yg1Var11;
                return a83Var10;
            case 18:
                dj0 dj0Var6 = (dj0) obj;
                dj0Var6.getClass();
                yg1 yg1Var12 = new yg1();
                yg1Var12.m6277j0("MicroMsg.ResourceHelper", "get string, resId %d, but context is null");
                a83 a83Var11 = a83.f116a;
                dj0Var6.f2078u = yg1Var12;
                return a83Var11;
            case 19:
                ml2 ml2Var3 = ds2.f2179a;
                return a83.f116a;
            case AIChatConfig.MaxContextRounds /* 20 */:
                dj0 dj0Var7 = (dj0) obj;
                dj0Var7.getClass();
                dj0Var7.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.plugin.sns.storage"});
                yg1 yg1Var13 = new yg1();
                yg1Var13.m6271d0(2);
                yg1Var13.m6277j0("com.tencent.mm.plugin.sns.storage.SnsSqliteDB", "execSQL");
                a83 a83Var12 = a83.f116a;
                dj0Var7.f2078u = yg1Var13;
                return a83Var12;
            case 21:
                yg1 yg1Var14 = (yg1) obj;
                yg1Var14.getClass();
                yg1Var14.m6271d0(2);
                yg1Var14.m6275h0("com.tencent.mm.plugin.sns.storage.SnsSqliteDB", "rawQuery");
                return a83.f116a;
            case 22:
                dj0 dj0Var8 = (dj0) obj;
                dj0Var8.getClass();
                dj0Var8.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.plugin.sns.storage"});
                dj0Var8.m1030c0(new ml2(21));
                return a83.f116a;
            case 23:
                dj0 dj0Var9 = (dj0) obj;
                dj0Var9.getClass();
                dj0Var9.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.plugin.sns.storage"});
                yg1 yg1Var15 = new yg1();
                yg1Var15.m6277j0("com.tencent.mm.plugin.sns.storage.SnsSqliteDB", "update");
                a83 a83Var13 = a83.f116a;
                dj0Var9.f2078u = yg1Var15;
                return a83Var13;
            case 24:
                v41[] v41VarArr = xn2.f13086a;
                yn2 yn2Var = vn2.f12070m;
                v41 v41Var = xn2.f13086a[5];
                ((zn2) obj).mo1533a(yn2Var, Boolean.TRUE);
                return a83.f116a;
            case 25:
                return a83.f116a;
            case 26:
                jg3 jg3Var2 = (jg3) obj;
                a83 a83Var14 = a83.f116a;
                jg3Var2.getClass();
                bx2.f1067d.getClass();
                Class cls2 = (Class) bx2.f1073j.getValue();
                XC_MethodHook.MethodHookParam methodHookParam = jg3Var2.f5028a;
                if (cls2.isInstance(methodHookParam.thisObject)) {
                    Object obj2 = methodHookParam.thisObject;
                    obj2.getClass();
                    View view = (View) obj2;
                    Object obj3 = jg3Var2.m2496a()[0];
                    MotionEvent motionEvent = obj3 instanceof MotionEvent ? (MotionEvent) obj3 : null;
                    if (motionEvent != null) {
                        Object tag = view.getTag(R.id.swipe_to_delete_conversation_state);
                        ax2 ax2Var = tag instanceof ax2 ? (ax2) tag : null;
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0) {
                            view.animate().cancel();
                            view.setTranslationX(0.0f);
                            view.setTag(R.id.swipe_to_delete_conversation_state, new ax2(motionEvent.getRawX(), motionEvent.getRawY(), ViewConfiguration.get(view.getContext()).getScaledTouchSlop()));
                        } else if (actionMasked == 1) {
                            if (ax2Var != null) {
                                view.setTag(R.id.swipe_to_delete_conversation_state, null);
                                if (ax2Var.f441d) {
                                    float rawX = motionEvent.getRawX() - ax2Var.f438a;
                                    float fMax = Math.max(ax2Var.f440c * 4.0f, view.getResources().getDisplayMetrics().density * 72.0f);
                                    if (motionEvent.getActionMasked() != 1 || rawX > (-fMax)) {
                                        view.animate().translationX(0.0f).setDuration(180L).start();
                                    } else {
                                        view.animate().translationX(-view.getWidth()).setDuration(200L).withEndAction(new ct2(view, true ? 1 : 0)).start();
                                    }
                                }
                                if (z) {
                                    jg3Var2.m2497b(Boolean.TRUE);
                                }
                            }
                        } else if (actionMasked == 2) {
                            if (ax2Var != null) {
                                float rawX2 = motionEvent.getRawX() - ax2Var.f438a;
                                float rawY = motionEvent.getRawY() - ax2Var.f439b;
                                if (!ax2Var.f441d && rawX2 < 0.0f && Math.abs(rawX2) > ax2Var.f440c && Math.abs(rawX2) > Math.abs(rawY)) {
                                    ax2Var.f441d = true;
                                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                                    motionEventObtain.setAction(3);
                                    try {
                                        ig3.m2347b(jg3Var2, motionEventObtain);
                                        motionEventObtain.recycle();
                                        ViewParent parent = view.getParent();
                                        if (parent != null) {
                                            parent.requestDisallowInterceptTouchEvent(true);
                                        }
                                    } catch (Throwable th) {
                                        motionEventObtain.recycle();
                                        throw th;
                                    }
                                }
                                if (ax2Var.f441d) {
                                    view.setTranslationX(Math.min(0.0f, rawX2));
                                }
                                z = ax2Var.f441d;
                            }
                            if (z) {
                            }
                        } else if (actionMasked != 3) {
                        }
                        z = false;
                        if (z) {
                        }
                    }
                }
                return a83Var14;
            case 27:
                jg3 jg3Var3 = (jg3) obj;
                jg3Var3.getClass();
                Object obj4 = jg3Var3.f5028a.thisObject;
                if (obj4 != null) {
                    try {
                        hi0 hi0VarM3241r = op0.m3602y(obj4).m3241r();
                        fx2.f3163d.getClass();
                        hi0VarM3241r.f4030g = (Class) fx2.f3171l.getValue();
                        x92Var = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0();
                    } catch (Throwable th2) {
                        x92Var = new x92(th2);
                    }
                    Throwable thM6237a = y92.m6237a(x92Var);
                    if (thM6237a != null) {
                        fx2.f3163d.getClass();
                        hg3.m2166d(fx2.f3167h, "Unable to resolve ChatFooter: ".concat(fg1.m1624Q(thM6237a)));
                    }
                    fx2.f3169j = x92Var instanceof x92 ? null : x92Var;
                    break;
                }
                return a83.f116a;
            case 28:
                jg3 jg3Var4 = (jg3) obj;
                jg3Var4.getClass();
                Object obj5 = jg3Var4.f5028a.thisObject;
                View view2 = obj5 instanceof View ? (View) obj5 : null;
                if (view2 != null) {
                    view2.setClickable(true);
                }
                return a83.f116a;
            default:
                jg3 jg3Var5 = (jg3) obj;
                jg3Var5.getClass();
                Object objM3099n0 = AbstractC0460mg.m3099n0(0, jg3Var5.m2496a());
                if (objM3099n0 != null) {
                    C0361js.f5188d.getClass();
                    View viewM2556j = C0361js.m2556j(objM3099n0);
                    if (viewM2556j != null) {
                        Object objM3099n02 = AbstractC0460mg.m3099n0(1, jg3Var5.m2496a());
                        Integer num2 = objM3099n02 instanceof Integer ? (Integer) objM3099n02 : null;
                        if (num2 != null) {
                            int iIntValue = num2.intValue();
                            Object obj6 = jg3Var5.f5028a.thisObject;
                            if (obj6 != null) {
                                try {
                                    hi0 hi0VarM3241r2 = op0.m3602y(obj6).m3241r();
                                    hi0VarM3241r2.f4030g = List.class;
                                    Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r2.m2194c())).m3867g0();
                                    x92Var2 = objM3867g0 instanceof List ? (List) objM3867g0 : null;
                                } catch (Throwable th3) {
                                    x92Var2 = new x92(th3);
                                }
                                List list = (List) (x92Var2 instanceof x92 ? null : x92Var2);
                                if (list != null) {
                                    viewM2556j.setTag(R.id.swipe_to_quote_message_info, AbstractC0142du.m1162r0(iIntValue, list));
                                }
                            }
                        }
                    }
                    break;
                }
                return a83.f116a;
        }
    }
}
