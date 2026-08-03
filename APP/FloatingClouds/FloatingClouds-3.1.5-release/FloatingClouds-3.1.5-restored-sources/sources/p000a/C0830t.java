package p000a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import p000a.C0186K3;
import p000a.C0582fh;
import top.mmjz.floatingclouds.XposedEntry;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0830t implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3298b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0830t(int i, Object obj) {
        this.f3297a = i;
        this.f3298b = obj;
    }

    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.Object, java.util.List] */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        Object objM2206a;
        Class clsM13b;
        Field fieldM14c;
        String string;
        Object obj2;
        Window window;
        int i = 8;
        int i2 = 0;
        switch (this.f3297a) {
            case 0:
                return obj == ((AbstractC0849u) this.f3298b) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                Class cls = (Class) this.f3298b;
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                if (chain.getThisObject() != null) {
                    cls.isInstance(chain.getThisObject());
                }
                return objProceed;
            case 2:
                C0173J8 c0173j8 = (C0173J8) this.f3298b;
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                C0186K3.f638a.getClass();
                if (C0186K3.a.m511l() && !C0186K3.a.m510k() && C0186K3.a.m508i().f2449s && !C0186K3.a.m505f().isEmpty()) {
                    C0915x8 c0915x8 = C0915x8.f3530a;
                    if (!C0915x8.m2203a() && !C0816s4.f3217F) {
                        try {
                            Class clsM13b2 = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.chatting.ChattingUIProxy");
                            if (clsM13b2 != null && (clsM13b = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.chatting.BaseChattingUIFragment")) != null && (fieldM14c = C0002A1.m14c(clsM13b2, clsM13b)) != null) {
                                fieldM14c.setAccessible(true);
                                Object obj3 = fieldM14c.get(chain2.getThisObject());
                                if (obj3 != null) {
                                    Object objM12a = C0002A1.m12a(obj3, "getArguments", new Object[0]);
                                    Bundle bundle = objM12a instanceof Bundle ? (Bundle) objM12a : null;
                                    if (bundle != null && (string = bundle.getString("Chat_User")) != null && !C0034Be.m101P(string)) {
                                        ExecutorService executorService = C0582fh.f2149G;
                                        if (C0582fh.a.m1423a(string)) {
                                            Object objM12a2 = C0002A1.m12a(obj3, "getActivity", new Object[0]);
                                            Activity activity = objM12a2 instanceof Activity ? (Activity) objM12a2 : null;
                                            if (activity == null) {
                                                return null;
                                            }
                                            activity.finish();
                                            return null;
                                        }
                                    }
                                }
                            }
                            objM2206a = C0413Wf.f1577a;
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                        }
                        Throwable thM2189a = C0901wd.m2189a(objM2206a);
                        if (thM2189a != null) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"blockEnterChat: onEnterBegin error", thM2189a}, 2));
                        }
                        return chain2.proceed();
                    }
                    return chain2.proceed();
                }
                return chain2.proceed();
            case 3:
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                C0801r8 c0801r8 = (C0801r8) this.f3298b;
                C0186K3.f638a.getClass();
                if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2431a) {
                    return chain3.proceed();
                }
                Object objM19h = C0002A1.m19h(chain3.getThisObject(), "data");
                ArrayList arrayList = objM19h instanceof ArrayList ? (ArrayList) objM19h : null;
                if (arrayList == null) {
                    return chain3.proceed();
                }
                Object obj4 = chain3.getArgs().get(1);
                Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                if (num == null) {
                    return chain3.proceed();
                }
                int iIntValue = num.intValue();
                if (iIntValue < 0 || iIntValue >= arrayList.size()) {
                    return chain3.proceed();
                }
                Object obj5 = arrayList.get(iIntValue);
                if (obj5 == null) {
                    return chain3.proceed();
                }
                chain3.proceed();
                if (!c0801r8.m1861b(obj5) || (obj2 = chain3.getArgs().get(0)) == null) {
                    return null;
                }
                Object objM19h2 = C0002A1.m19h(obj2, "itemView");
                View view = objM19h2 instanceof View ? (View) objM19h2 : null;
                if (view == null) {
                    return null;
                }
                view.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    return null;
                }
                layoutParams.height = 0;
                layoutParams.width = 0;
                view.setLayoutParams(layoutParams);
                return null;
            case 4:
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                chain4.proceed();
                Object thisObject = chain4.getThisObject();
                Activity activity2 = thisObject instanceof Activity ? (Activity) thisObject : null;
                View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
                if (decorView != null) {
                    long[] jArr = {200, 600, 1200};
                    while (true) {
                        C0858u8 c0858u8 = (C0858u8) this.f3298b;
                        if (i2 < 3) {
                            decorView.postDelayed(new RunnableC0273P0(c0858u8, i, decorView), jArr[i2]);
                            i2++;
                        } else {
                            c0858u8.m1988c(decorView);
                        }
                    }
                }
                return null;
            case 5:
                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain5, "chain");
                Object objProceed2 = chain5.proceed();
                C0186K3.f638a.getClass();
                if (C0186K3.a.m511l() && C0186K3.a.m508i().f2434d) {
                    Object thisObject2 = chain5.getThisObject();
                    Activity activity3 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                    if (activity3 != null) {
                        C0009A8.m39c(activity3, this.f3298b);
                    }
                }
                return objProceed2;
            case 6:
                String str = (String) obj;
                Bundle extras = ((Intent) this.f3298b).getExtras();
                return str + "=" + (extras != null ? extras.get(str) : null);
            case 7:
                int iIntValue2 = ((Integer) obj).intValue();
                C0459Z7 c0459z7 = ((C0936ya) this.f3298b).f3546a;
                Matcher matcher = (Matcher) c0459z7.f1726a;
                C0574f9 c0574f9M749D = C0267Oc.m749D(matcher.start(iIntValue2), matcher.end(iIntValue2));
                if (c0574f9M749D.f1929a < 0) {
                    return null;
                }
                String strGroup = ((Matcher) c0459z7.f1726a).group(iIntValue2);
                C0631i9.m1481d(strGroup, "group(...)");
                return new C0898wa(strGroup, c0574f9M749D);
            case 8:
                C0578fd c0578fd = (C0578fd) obj;
                C0631i9.m1482e(c0578fd, "ctx");
                return C0052Cd.f184a.m139b((C0785qb) this.f3298b, c0578fd).f2209b;
            default:
                return XposedEntry.initWeChatHooks$lambda$0((XposedEntry) this.f3298b, (Executable) obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0830t(IPlugin iPlugin, Object obj, int i) {
        this.f3297a = i;
        this.f3298b = obj;
    }
}
