package p000a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000a.C0186K3;
import p000a.C0816s4;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.m4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0702m4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f2648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2649c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IPlugin f2650d;

    public /* synthetic */ RunnableC0702m4(Object obj, boolean z, IPlugin iPlugin, int i) {
        this.f2647a = i;
        this.f2649c = obj;
        this.f2648b = z;
        this.f2650d = iPlugin;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM2206a;
        switch (this.f2647a) {
            case 0:
                C0816s4.a.C1338a c1338a = C0816s4.a.C1338a.f3260a;
                C0816s4.a.C1338a.EnumC1339a enumC1339a = (C0816s4.a.C1338a.EnumC1339a) this.f2649c;
                boolean zM1918a = C0816s4.a.C1338a.m1918a(enumC1339a);
                boolean z = this.f2648b;
                if (!zM1918a) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] toggleMute(" + z + ") STALE: expected=" + enumC1339a + " actual=" + c1338a}, 1));
                    break;
                } else {
                    if (z) {
                        C0186K3.f638a.getClass();
                        if (!C0186K3.a.m508i().f2447q) {
                        }
                    }
                    ClassLoader classLoader = ((C0816s4) this.f2650d).f3244k;
                    if (classLoader != null) {
                        C0086Eb.f268a.getClass();
                        C0186K3.f638a.getClass();
                        ArrayList arrayListM505f = C0186K3.a.m505f();
                        ArrayList<String> arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
                        Iterator it = arrayListM505f.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MaskItemBean) it.next()).getMaskId());
                        }
                        for (String str : arrayList) {
                            C0631i9.m1482e(str, "wxid");
                            try {
                                C0186K3.f638a.getClass();
                                if (C0186K3.a.m508i().f2448r) {
                                    C0908x1.m2194b("MuteService", "setMute START talker=" + str + " mute=" + z);
                                    if (C0086Eb.m210a(str, z)) {
                                        C0908x1.m2194b("MuteService", "setMute DB_OK talker=" + str + " mute=" + z);
                                    } else {
                                        C0908x1.m2197e("MuteService", "setMute DB failed, trying Java layer e01.e2");
                                        C0086Eb.m211b(str, z, classLoader);
                                    }
                                } else {
                                    C0908x1.m2194b("MuteService", "setMute skipped: hideMaskedMessageNotification disabled");
                                }
                                objM2206a = C0413Wf.f1577a;
                            } catch (Throwable th) {
                                objM2206a = C0920xd.m2206a(th);
                            }
                            Throwable thM2189a = C0901wd.m2189a(objM2206a);
                            if (thM2189a != null) {
                                C0908x1.m2193a("MuteService", "setMute FAILED talker=" + str + " mute=" + z, thM2189a);
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                int i = this.f2648b ? 0 : 8;
                View view = (View) this.f2649c;
                view.setVisibility(i);
                Context context = view.getContext();
                C0631i9.m1481d(context, "getContext(...)");
                ((C0874v5) this.f2650d).getClass();
                int iM2092e = C0874v5.m2092e(context);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iM2092e;
                    layoutParams.height = iM2092e;
                    view.setLayoutParams(layoutParams);
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                Context context2 = view.getContext();
                C0631i9.m1481d(context2, "getContext(...)");
                gradientDrawable.setColor(Color.parseColor((context2.getResources().getConfiguration().uiMode & 48) == 32 ? "#FF6B6B" : "#FA5151"));
                view.setBackground(gradientDrawable);
                break;
        }
    }
}
