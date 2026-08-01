package p021D3;

import android.app.Activity;
import com.bumptech.glide.AbstractC1925g;
import org.luckypray.dexkit.DexKitBridge;
import p016C3.C0245b;
import p044H3.AbstractC0646a;
import p044H3.InterfaceC0647b;
import p056K2.AbstractC0885k;
import p056K2.C0887m;
import p056K2.C0891q;
import p070N3.C1021a;
import p113W3.AbstractC1609b;
import p117X2.AbstractC1665j;
import p117X2.C1673r;
import p117X2.C1674s;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: D3.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0269f implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f866d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0646a[] f867e;

    public /* synthetic */ RunnableC0269f(AbstractC0646a[] abstractC0646aArr, int i5) {
        this.f866d = i5;
        this.f867e = abstractC0646aArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM3229o;
        int i5 = this.f866d;
        int i6 = 1;
        int i7 = 0;
        AbstractC0646a[] abstractC0646aArr = this.f867e;
        switch (i5) {
            case 0:
                C0887m c0887m = C0274k.f881a;
                try {
                    C0274k.m470m();
                    if (C0274k.m459b()) {
                        C0274k.m471n(abstractC0646aArr);
                    } else {
                        Activity activity = AbstractC1785a.f6097c;
                        if (activity == null) {
                            AbstractC1665j.m2991k("hostAct");
                            throw null;
                        }
                        activity.runOnUiThread(new RunnableC0270g(i7, activity, abstractC0646aArr));
                        new Thread(new RunnableC0269f(abstractC0646aArr, i6)).start();
                    }
                    objM3229o = C0891q.f2780a;
                } catch (Throwable th) {
                    objM3229o = AbstractC1784a.m3229o(th);
                }
                Throwable thM1902a = AbstractC0885k.m1902a(objM3229o);
                if (thM1902a != null) {
                    AbstractC1925g.m3537n("NukeCore", "Nuke init failed: ".concat(AbstractC2352g.m4182E(thM1902a)));
                    return;
                }
                return;
            default:
                C0887m c0887m2 = C0274k.f881a;
                try {
                    C0274k.m479v("正在检查 Native 运行环境", Float.valueOf(0.02f));
                    C1673r c1673r = new C1673r();
                    c1673r.f5707d = -1;
                    C1674s c1674s = new C1674s();
                    c1674s.f5708d = -1L;
                    AbstractC1609b.m2858a(new C0264a(c1673r, c1674s));
                    C0274k.m479v("正在校验 Native 运行环境", Float.valueOf(0.32f));
                    C0274k.m481x(abstractC0646aArr);
                    C0274k.m479v("正在初始化 Dex 分析环境[0/" + abstractC0646aArr.length + "]", Float.valueOf(0.38f));
                    C0274k.m461d();
                    ClassLoader classLoader = AbstractC1785a.f6096b;
                    if (classLoader == null) {
                        AbstractC1665j.m2991k("hostClassLoader");
                        throw null;
                    }
                    try {
                        if (!Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoader)) {
                            throw new IllegalStateException("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                        }
                        DexKitBridge dexKitBridge = new DexKitBridge(classLoader);
                        int length = abstractC0646aArr.length;
                        int i8 = 0;
                        while (i7 < length) {
                            C1021a c1021a = abstractC0646aArr[i7];
                            i8++;
                            if (c1021a instanceof InterfaceC0647b) {
                                int length2 = abstractC0646aArr.length;
                                C0274k.m479v("正在初始化 Dex 分析[" + i8 + "/" + length2 + "]", Float.valueOf(((i8 / abstractC0646aArr.length) * 0.5f) + 0.4f));
                                try {
                                    c1021a.mo1121a(dexKitBridge);
                                } catch (Throwable th2) {
                                    C0274k.m476s(c1021a, "dex_find", th2, "Dex analysis failed");
                                    AbstractC1925g.m3537n(c1021a.mo1118c(), "Dex分析失败: " + AbstractC2352g.m4182E(th2));
                                }
                            }
                            i7++;
                        }
                        String strM464g = C0274k.m464g();
                        C0245b c0245bM466i = C0274k.m466i();
                        c0245bM466i.getClass();
                        AbstractC1665j.m2985e(strM464g, "value");
                        c0245bM466i.m451e("Dex_Cache_Sum_Sign", strM464g);
                        C0274k.m479v("Dex 分析完成，马上重启", Float.valueOf(1.0f));
                        Thread.sleep(2500L);
                        C0274k.m477t();
                        return;
                    } catch (ClassNotFoundException unused) {
                        throw new IllegalStateException("This method requires Android runtime");
                    }
                } catch (Throwable th3) {
                    AbstractC1925g.m3537n("NukeCore", "Dex analysis failed: ".concat(AbstractC2352g.m4182E(th3)));
                    C0274k.m479v("Dex analysis failed: ".concat(th3.getClass().getSimpleName()), null);
                    return;
                }
        }
    }
}
