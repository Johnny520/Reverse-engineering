package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ml2 implements in0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ds2.<clinit>():void, gp2.a(org.luckypray.dexkit.DexKitBridge):void, h50.r(java.lang.Object):java.lang.Object, in2.<clinit>():void, ml2.j(java.lang.Object):java.lang.Object, nl2.<clinit>():void, nw2.g(java.lang.Object, java.lang.Object):java.lang.Object, ul2.<clinit>():void, us2.a(org.luckypray.dexkit.DexKitBridge):void, vs2.a(org.luckypray.dexkit.DexKitBridge):void, ws2.a(org.luckypray.dexkit.DexKitBridge):void] */
    public /* synthetic */ ml2(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0258  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        Integer num;
        Adapter adapter;
        Object x92Var;
        Object x92Var2;
        int i = 8;
        hx1 hx1Var = null;
        boolean z = true;
        z = true;
        switch (this.h) {
            case 0:
                return new nl2(((Integer) obj).intValue());
            case 1:
                return Boolean.valueOf(!false);
            case 2:
                rs1 rs1Var = (rs1) obj;
                long j = rs1Var.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new kd(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & rs1Var.a))) : in2.a;
            case 3:
                kd kdVar = (kd) obj;
                return new rs1((((long) Float.floatToRawIntBits(kdVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(kdVar.a)) << 32));
            case 4:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                yg1 yg1Var = new yg1();
                yg1.c0(yg1Var, 8);
                yg1Var.e0(Class.class);
                yg1Var.h0("calling getService(...)");
                a83 a83Var = a83.a;
                dj0Var.u = yg1Var;
                return a83Var;
            case 5:
                Activity activity = (Activity) obj;
                activity.getClass();
                activity.startActivity(new Intent(activity, (Class<?>) HomeActivity.class));
                return a83.a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                jg3 jg3Var = (jg3) obj;
                a83 a83Var2 = a83.a;
                jg3Var.getClass();
                AdapterView adapterView = (AdapterView) jg3Var.a()[0];
                if (adapterView != null && (num = (Integer) jg3Var.a()[2]) != null && (adapter = adapterView.getAdapter()) != null) {
                    sg1 sg1VarV = op0.y(adapter).v();
                    sg1VarV.b = "getItem";
                    sg1VarV.b();
                    Object objG0 = ((zg1) du.o0(sg1VarV.c())).g0(num);
                    if (objG0 != null && t11.l(objG0.toString(), "Nuke")) {
                        Activity activity2 = up0.k;
                        if (activity2 == null) {
                            t11.S("hostAct");
                            throw null;
                        }
                        Activity activity3 = up0.k;
                        if (activity3 == null) {
                            t11.S("hostAct");
                            throw null;
                        }
                        activity2.startActivity(new Intent(activity3, (Class<?>) HomeActivity.class));
                        jg3Var.b(null);
                    }
                }
                return a83Var2;
            case 7:
                at atVar = (at) obj;
                atVar.getClass();
                atVar.d0("", "activity", "context", "intent");
                ml2 ml2Var = new ml2(i);
                yg1 yg1Var2 = new yg1();
                ml2Var.j(yg1Var2);
                ah1 ah1Var = atVar.v;
                if (ah1Var == null) {
                    ah1Var = new ah1();
                }
                atVar.v = ah1Var;
                List arrayList = ah1Var.t;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ah1Var.t = arrayList;
                arrayList.add(yg1Var2);
                at atVar2 = new at();
                at.b0(atVar2, "com.tencent.mm.plugin.newtips.model", 4);
                a83 a83Var3 = a83.a;
                k11 k11Var = atVar.u;
                if (k11Var == null) {
                    k11Var = new k11();
                }
                atVar.u = k11Var;
                List arrayList2 = k11Var.t;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                k11Var.t = arrayList2;
                arrayList2.add(atVar2);
                return a83Var3;
            case 8:
                yg1 yg1Var3 = (yg1) obj;
                yg1Var3.getClass();
                yg1Var3.t = new lv2("<init>", 5);
                ix1 ix1Var = new ix1();
                ix1Var.t = new ArrayList(be0.h);
                String str = new String[]{"androidx.appcompat.app.AppCompatActivity"}[0];
                if (str != null) {
                    hx1Var = new hx1();
                    at atVar3 = new at();
                    atVar3.t = new lv2(str, 5);
                    hx1Var.t = atVar3;
                }
                List arrayList3 = ix1Var.t;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                ix1Var.t = arrayList3;
                arrayList3.add(hx1Var);
                yg1Var3.x = ix1Var;
                return a83.a;
            case 9:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.c0(new ml2(7));
                return a83.a;
            case 10:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                at atVar4 = new at();
                atVar4.d0("MicroMsg.SettingDataFactory");
                a83 a83Var4 = a83.a;
                cj0Var2.u = atVar4;
                return a83Var4;
            case 11:
                cj0 cj0Var3 = (cj0) obj;
                cj0Var3.getClass();
                at atVar5 = new at();
                atVar5.d0("SettingLocation(parentGroup=");
                a83 a83Var5 = a83.a;
                cj0Var3.u = atVar5;
                return a83Var5;
            case 12:
                yg1 yg1Var4 = (yg1) obj;
                yg1Var4.getClass();
                at atVar6 = new at();
                atVar6.d0("List has more than one element.", "List is empty.");
                a83 a83Var6 = a83.a;
                yg1Var4.v = atVar6;
                yg1Var4.i0(0, 1);
                yg1Var4.j0("<this>");
                yg1Var4.e0(Iterable.class);
                yg1Var4.f0(List.class);
                ml2 ml2Var2 = new ml2(13);
                ah1 ah1Var2 = new ah1();
                ml2Var2.j(ah1Var2);
                yg1Var4.A = ah1Var2;
                return a83Var6;
            case 13:
                ah1 ah1Var3 = (ah1) obj;
                ah1Var3.getClass();
                yg1 yg1Var5 = new yg1();
                yg1Var5.g0("size");
                a83 a83Var7 = a83.a;
                List arrayList4 = ah1Var3.t;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                ah1Var3.t = arrayList4;
                arrayList4.add(yg1Var5);
                yg1 yg1Var6 = new yg1();
                yg1Var6.g0("get");
                List arrayList5 = ah1Var3.t;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                ah1Var3.t = arrayList5;
                arrayList5.add(yg1Var6);
                yg1 yg1Var7 = new yg1();
                yg1Var7.g0("iterator");
                List arrayList6 = ah1Var3.t;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                ah1Var3.t = arrayList6;
                arrayList6.add(yg1Var7);
                yg1 yg1Var8 = new yg1();
                yg1Var8.g0("next");
                List arrayList7 = ah1Var3.t;
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                }
                ah1Var3.t = arrayList7;
                arrayList7.add(yg1Var8);
                return a83Var7;
            case 14:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.c0(new ml2(12));
                return a83.a;
            case 15:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                yg1 yg1Var9 = new yg1();
                at atVar7 = new at();
                atVar7.t = new lv2("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo", 5);
                yg1Var9.v = atVar7;
                yg1Var9.d0(0);
                yg1Var9.f0(Integer.class);
                a83 a83Var8 = a83.a;
                dj0Var3.u = yg1Var9;
                return a83Var8;
            case 16:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                yg1 yg1Var10 = new yg1();
                wp2.d.getClass();
                yg1Var10.b0(wp2.j());
                Class cls = Integer.TYPE;
                cls.getClass();
                yg1Var10.f0(cls);
                yg1Var10.d0(0);
                yg1Var10.i0(1);
                a83 a83Var9 = a83.a;
                dj0Var4.u = yg1Var10;
                return a83Var9;
            case 17:
                dj0 dj0Var5 = (dj0) obj;
                dj0Var5.getClass();
                yg1 yg1Var11 = new yg1();
                wp2.d.getClass();
                yg1Var11.b0(wp2.j());
                yg1Var11.j0("SettingGroup_Main_Other_Plugin");
                a83 a83Var10 = a83.a;
                dj0Var5.u = yg1Var11;
                return a83Var10;
            case 18:
                dj0 dj0Var6 = (dj0) obj;
                dj0Var6.getClass();
                yg1 yg1Var12 = new yg1();
                yg1Var12.j0("MicroMsg.ResourceHelper", "get string, resId %d, but context is null");
                a83 a83Var11 = a83.a;
                dj0Var6.u = yg1Var12;
                return a83Var11;
            case 19:
                ml2 ml2Var3 = ds2.a;
                return a83.a;
            case AIChatConfig.MaxContextRounds /* 20 */:
                dj0 dj0Var7 = (dj0) obj;
                dj0Var7.getClass();
                dj0Var7.t = mg.t0(new String[]{"com.tencent.mm.plugin.sns.storage"});
                yg1 yg1Var13 = new yg1();
                yg1Var13.d0(2);
                yg1Var13.j0("com.tencent.mm.plugin.sns.storage.SnsSqliteDB", "execSQL");
                a83 a83Var12 = a83.a;
                dj0Var7.u = yg1Var13;
                return a83Var12;
            case 21:
                yg1 yg1Var14 = (yg1) obj;
                yg1Var14.getClass();
                yg1Var14.d0(2);
                yg1Var14.h0("com.tencent.mm.plugin.sns.storage.SnsSqliteDB", "rawQuery");
                return a83.a;
            case 22:
                dj0 dj0Var8 = (dj0) obj;
                dj0Var8.getClass();
                dj0Var8.t = mg.t0(new String[]{"com.tencent.mm.plugin.sns.storage"});
                dj0Var8.c0(new ml2(21));
                return a83.a;
            case 23:
                dj0 dj0Var9 = (dj0) obj;
                dj0Var9.getClass();
                dj0Var9.t = mg.t0(new String[]{"com.tencent.mm.plugin.sns.storage"});
                yg1 yg1Var15 = new yg1();
                yg1Var15.j0("com.tencent.mm.plugin.sns.storage.SnsSqliteDB", "update");
                a83 a83Var13 = a83.a;
                dj0Var9.u = yg1Var15;
                return a83Var13;
            case 24:
                v41[] v41VarArr = xn2.a;
                yn2 yn2Var = vn2.m;
                v41 v41Var = xn2.a[5];
                ((zn2) obj).a(yn2Var, Boolean.TRUE);
                return a83.a;
            case 25:
                return a83.a;
            case 26:
                jg3 jg3Var2 = (jg3) obj;
                a83 a83Var14 = a83.a;
                jg3Var2.getClass();
                bx2.d.getClass();
                Class cls2 = (Class) bx2.j.getValue();
                XC_MethodHook.MethodHookParam methodHookParam = jg3Var2.a;
                if (cls2.isInstance(methodHookParam.thisObject)) {
                    Object obj2 = methodHookParam.thisObject;
                    obj2.getClass();
                    View view = (View) obj2;
                    Object obj3 = jg3Var2.a()[0];
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
                                if (ax2Var.d) {
                                    float rawX = motionEvent.getRawX() - ax2Var.a;
                                    float fMax = Math.max(ax2Var.c * 4.0f, view.getResources().getDisplayMetrics().density * 72.0f);
                                    if (motionEvent.getActionMasked() != 1 || rawX > (-fMax)) {
                                        view.animate().translationX(0.0f).setDuration(180L).start();
                                    } else {
                                        view.animate().translationX(-view.getWidth()).setDuration(200L).withEndAction(new ct2(view, true ? 1 : 0)).start();
                                    }
                                }
                                if (z) {
                                    jg3Var2.b(Boolean.TRUE);
                                }
                            }
                        } else if (actionMasked == 2) {
                            if (ax2Var != null) {
                                float rawX2 = motionEvent.getRawX() - ax2Var.a;
                                float rawY = motionEvent.getRawY() - ax2Var.b;
                                if (!ax2Var.d && rawX2 < 0.0f && Math.abs(rawX2) > ax2Var.c && Math.abs(rawX2) > Math.abs(rawY)) {
                                    ax2Var.d = true;
                                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                                    motionEventObtain.setAction(3);
                                    try {
                                        ig3.b(jg3Var2, motionEventObtain);
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
                                if (ax2Var.d) {
                                    view.setTranslationX(Math.min(0.0f, rawX2));
                                }
                                z = ax2Var.d;
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
                Object obj4 = jg3Var3.a.thisObject;
                if (obj4 != null) {
                    try {
                        hi0 hi0VarR = op0.y(obj4).r();
                        fx2.d.getClass();
                        hi0VarR.g = (Class) fx2.l.getValue();
                        x92Var = ((pi0) du.o0(hi0VarR.c())).g0();
                    } catch (Throwable th2) {
                        x92Var = new x92(th2);
                    }
                    Throwable thA = y92.a(x92Var);
                    if (thA != null) {
                        fx2.d.getClass();
                        hg3.d(fx2.h, "Unable to resolve ChatFooter: ".concat(fg1.Q(thA)));
                    }
                    fx2.j = x92Var instanceof x92 ? null : x92Var;
                    break;
                }
                return a83.a;
            case 28:
                jg3 jg3Var4 = (jg3) obj;
                jg3Var4.getClass();
                Object obj5 = jg3Var4.a.thisObject;
                View view2 = obj5 instanceof View ? (View) obj5 : null;
                if (view2 != null) {
                    view2.setClickable(true);
                }
                return a83.a;
            default:
                jg3 jg3Var5 = (jg3) obj;
                jg3Var5.getClass();
                Object objN0 = mg.n0(0, jg3Var5.a());
                if (objN0 != null) {
                    js.d.getClass();
                    View viewJ = js.j(objN0);
                    if (viewJ != null) {
                        Object objN02 = mg.n0(1, jg3Var5.a());
                        Integer num2 = objN02 instanceof Integer ? (Integer) objN02 : null;
                        if (num2 != null) {
                            int iIntValue = num2.intValue();
                            Object obj6 = jg3Var5.a.thisObject;
                            if (obj6 != null) {
                                try {
                                    hi0 hi0VarR2 = op0.y(obj6).r();
                                    hi0VarR2.g = List.class;
                                    Object objG02 = ((pi0) du.o0(hi0VarR2.c())).g0();
                                    x92Var2 = objG02 instanceof List ? (List) objG02 : null;
                                } catch (Throwable th3) {
                                    x92Var2 = new x92(th3);
                                }
                                List list = (List) (x92Var2 instanceof x92 ? null : x92Var2);
                                if (list != null) {
                                    viewJ.setTag(R.id.swipe_to_quote_message_info, du.r0(iIntValue, list));
                                }
                            }
                        }
                    }
                    break;
                }
                return a83.a;
        }
    }
}
