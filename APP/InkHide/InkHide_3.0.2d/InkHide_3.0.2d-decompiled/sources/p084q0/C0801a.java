package p084q0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p001A0.C0026a;
import p001A0.C0051x;
import p005C0.C0070d;
import p009E0.C0106f;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p077m0.C0764b;
import p086r0.C0938s;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;

/* JADX INFO: renamed from: q0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0801a implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2668a;

    /* JADX INFO: renamed from: b */
    public Object f2669b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0801a(int i2) {
        this.f2668a = i2;
        switch (i2) {
            case 1:
                break;
            default:
                this.f2669b = new C0106f(new C0026a(27));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1468a(C0801a c0801a, XC_MethodHook.MethodHookParam methodHookParam) {
        c0801a.getClass();
        AbstractC0731a.m1384a("set empty for " + methodHookParam.thisObject, "hook method args:", methodHookParam.args, "fragment arguments:", AbstractC0514f.f1622b.mo1012c(methodHookParam.thisObject, "getArguments", new Object[0]));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m1469b(C0801a c0801a, Object obj) {
        c0801a.getClass();
        Activity activity = (Activity) AbstractC0514f.f1622b.mo1012c(obj, "getActivity", new Object[0]);
        if (activity == null) {
            AbstractC0731a.m1387d("Not attach Activity for ", obj);
            return false;
        }
        Intent intent = activity.getIntent();
        AbstractC0731a.m1384a(activity, activity.getIntent().getExtras());
        String stringExtra = intent.getStringExtra("detail_username");
        C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2443s()) {
            return false;
        }
        if (stringExtra != null && !AbstractC0307q.m534d0(stringExtra)) {
            return c0808h.f2685b.contains(stringExtra);
        }
        AbstractC0731a.m1387d("chatUser is null or blank");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021a A[PHI: r6
  0x021a: PHI (r6v9 java.lang.String) = 
  (r6v7 java.lang.String)
  (r6v7 java.lang.String)
  (r6v8 java.lang.String)
  (r6v8 java.lang.String)
  (r6v8 java.lang.String)
  (r6v7 java.lang.String)
 binds: [B:116:0x0222, B:118:0x0226, B:121:0x022d, B:131:0x023e, B:129:0x023b, B:112:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017e  */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String str;
        switch (this.f2668a) {
            case 0:
                ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
                AbstractC0223g.m418e(classLoader, "classLoader");
                Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d(AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.wcdb.database.SQLiteDatabase"), new C0026a(26));
                AbstractC0223g.m417d(methodArrMo1013d, "findMethodsByExactPredicate(...)");
                for (Method method : methodArrMo1013d) {
                    AbstractC0514f.m1027d(method, new C0070d(1, this));
                }
                break;
            default:
                Class clsM1427a = C0764b.m1427a("com.tencent.mm.view.activity.ImageQueryMainUI");
                if (clsM1427a != null) {
                    AbstractC0514f.m1025b(C0764b.m1427a("com.tencent.mm.ui.chatting.BaseChattingUIFragment"), "onCreate", Bundle.class, new C0938s(this, 0));
                    AbstractC0514f.m1025b(C0764b.m1427a("com.tencent.mm.ui.chatting.BaseChattingUIFragment"), "onDestroy", new C0938s(this, 1));
                    AbstractC0514f.m1025b(clsM1427a, "onCreate", Bundle.class, new C0938s(this, 2));
                }
                int iM2494p = AbstractC1135r.m2494p();
                String name = "D";
                if (2300 <= iM2494p && iM2494p < 2361) {
                    str = "k";
                } else if (2360 > iM2494p || iM2494p >= 2481) {
                    String str2 = "z";
                    if ((2480 > iM2494p || iM2494p >= 2503) && iM2494p != 2589) {
                        if (2502 <= iM2494p && iM2494p < 2522) {
                            str2 = "A";
                        } else if (iM2494p == 2560) {
                            str2 = "B";
                        } else if (iM2494p == 2600 || iM2494p == 2720 || iM2494p == 2800 || iM2494p == 2841) {
                            str2 = "y";
                        } else if (iM2494p == 2701) {
                            str2 = "K";
                        } else if (iM2494p != 2740 && iM2494p != 2860) {
                            str = iM2494p == 3060 ? "D" : "l";
                        }
                        str = str2;
                    } else {
                        str = str2;
                    }
                }
                ClassLoader classLoader2 = context.getClassLoader();
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Method methodMo1010a = AbstractC0514f.f1622b.mo1010a("com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", classLoader2, str, cls, cls2);
                Class cls3 = Void.TYPE;
                if (methodMo1010a == null) {
                    ClassLoader classLoader3 = AbstractC0503h.m991x().getClassLoader();
                    AbstractC0223g.m418e(classLoader3, "classLoader");
                    Method[] methodArrMo1016g = AbstractC0514f.f1622b.mo1016g(AbstractC0514f.f1622b.mo1021l(classLoader3, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI"), cls3, cls, cls2);
                    if (methodArrMo1016g.length >= 1) {
                        methodMo1010a = methodArrMo1016g[0];
                    }
                    AbstractC0731a.m1387d(AbstractC1135r.m2493o(), "guess MediaHistoryListUI empty method is ", methodMo1010a);
                }
                if (methodMo1010a != null) {
                    AbstractC0514f.m1027d(methodMo1010a, new C0051x(5));
                }
                Method methodMo1011b = null;
                if (AbstractC1135r.m2494p() > 2480) {
                    int i2 = -1;
                    if (AbstractC1135r.f3833e == -1) {
                        try {
                            i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                        } catch (Exception e2) {
                            AbstractC0731a.m1385b(e2);
                        }
                        AbstractC1135r.f3833e = i2;
                    }
                    int i3 = AbstractC1135r.f3833e;
                    String str3 = (2502 > i3 || i3 >= 2741) ? i3 == 3060 ? "com.tencent.mm.ui.chatting.presenter.l2" : "com.tencent.mm.ui.chatting.presenter.j1" : "com.tencent.mm.ui.chatting.presenter.k1";
                    ClassLoader classLoader4 = AbstractC0503h.m991x().getClassLoader();
                    AbstractC0223g.m418e(classLoader4, "classLoader");
                    Method[] methodArrMo1016g2 = AbstractC0514f.f1622b.mo1016g(AbstractC0514f.f1622b.mo1021l(classLoader4, str3), cls3, cls, cls2);
                    if (methodArrMo1016g2 == null) {
                        AbstractC0731a.m1387d("can not find presenter for setEmptyDetailHistoryUIForGallery8044");
                    } else if (!(methodArrMo1016g2.length == 0)) {
                        AbstractC0514f.m1027d(methodArrMo1016g2[0], new C0938s(this, 6));
                    }
                } else {
                    int iM2494p2 = AbstractC1135r.m2494p();
                    String str4 = (2140 > iM2494p2 || iM2494p2 >= 2361) ? (2360 > iM2494p2 || iM2494p2 >= 2481) ? null : "l" : "k";
                    Method methodMo1010a2 = str4 != null ? AbstractC0514f.f1622b.mo1010a("com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI", context.getClassLoader(), str4, cls, cls2) : null;
                    if (methodMo1010a2 == null) {
                        ClassLoader classLoader5 = AbstractC0503h.m991x().getClassLoader();
                        AbstractC0223g.m418e(classLoader5, "classLoader");
                        Method[] methodArrMo1016g3 = AbstractC0514f.f1622b.mo1016g(AbstractC0514f.f1622b.mo1021l(classLoader5, "com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI"), cls3, cls, cls2);
                        AbstractC0223g.m415b(methodArrMo1016g3);
                        if (methodArrMo1016g3.length != 0) {
                            methodMo1010a2 = methodArrMo1016g3[0];
                        }
                        AbstractC0731a.m1387d(AbstractC1135r.m2493o(), "guess MediaHistoryGalleryUI empty method is ", methodMo1010a2);
                    }
                    AbstractC0514f.m1027d(methodMo1010a2, new C0051x(4));
                }
                int iM2494p3 = AbstractC1135r.m2494p();
                if (iM2494p3 == 2300) {
                    name = "N";
                } else if (iM2494p3 == 2320) {
                    name = "O";
                } else {
                    String str5 = "P";
                    if (iM2494p3 == 2340) {
                        name = AbstractC1135r.m2495q().equals("8.0.35") ? str5 : "R";
                    } else if (iM2494p3 != 2360 && iM2494p3 != 2429) {
                        str5 = "Q";
                        if (iM2494p3 != 2380) {
                            if (iM2494p3 != 2400) {
                                if ((2420 > iM2494p3 || iM2494p3 >= 2442) && iM2494p3 != 2480) {
                                    if (2441 > iM2494p3 || iM2494p3 >= 2461) {
                                        if (2502 > iM2494p3 || iM2494p3 >= 2561) {
                                            if (iM2494p3 == 2589) {
                                                name = "G";
                                            } else if (iM2494p3 == 2600) {
                                                name = "F";
                                            } else if (iM2494p3 != 2701) {
                                                if (2720 <= iM2494p3 && iM2494p3 < 2801) {
                                                    name = "I";
                                                } else if (iM2494p3 != 2841) {
                                                    name = iM2494p3 == 2860 ? "V" : iM2494p3 == 3060 ? "w0" : null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                AbstractC0731a.m1384a("setEmptyActionBarTabPageUI method is :", name);
                if (name != null) {
                    ClassLoader classLoader6 = AbstractC0503h.m991x().getClassLoader();
                    AbstractC0223g.m418e(classLoader6, "classLoader");
                    methodMo1011b = AbstractC0514f.f1622b.mo1011b(AbstractC0514f.f1622b.mo1021l(classLoader6, "com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment"), name, ArrayList.class);
                }
                if (methodMo1011b == null) {
                    ClassLoader classLoader7 = AbstractC0503h.m991x().getClassLoader();
                    AbstractC0223g.m418e(classLoader7, "classLoader");
                    Method[] methodArrMo1016g4 = AbstractC0514f.f1622b.mo1016g(AbstractC0514f.f1622b.mo1021l(classLoader7, "com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment"), cls3, ArrayList.class);
                    AbstractC0223g.m415b(methodArrMo1016g4);
                    if (methodArrMo1016g4.length != 0) {
                        methodMo1011b = methodArrMo1016g4[0];
                        name = methodMo1011b.getName();
                    }
                    AbstractC0731a.m1387d(AbstractC1135r.m2493o(), "guess setEmptyActionBarTabPageUI method:", methodMo1011b);
                }
                if (methodMo1011b == null) {
                    AbstractC0731a.m1387d(AbstractC1135r.m2493o(), "setEmptyActionBarTabPageUI is method null");
                } else {
                    AbstractC0514f.m1027d(methodMo1011b, new C0938s(this, 3));
                    if (name == null) {
                        AbstractC0731a.m1386c("setEmptyActionBarTabPageUI is null");
                    } else {
                        AbstractC0514f.m1026c("com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment", context.getClassLoader(), name, ArrayList.class, new C0938s(this, 4));
                        AbstractC0514f.m1026c("com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiImageResultFragment", context.getClassLoader(), "onCreateView", LayoutInflater.class, ViewGroup.class, Bundle.class, new C0938s(this, 5));
                    }
                }
                break;
        }
    }
}
