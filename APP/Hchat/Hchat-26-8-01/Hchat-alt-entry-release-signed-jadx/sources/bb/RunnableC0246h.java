package bb;

import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p011ab.C0042b;
import p024b9.C0220f;
import p024b9.RunnableC0217c;
import p080fb.AbstractC1184v0;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p183m8.C2813a;
import p210o8.C3086j;
import p218og.C3147k;
import p259r9.C3752d0;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: bb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0246h implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f664g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f665h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f666i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f667j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f668k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0246h(C3752d0 c3752d0, Object obj, String str, long j3) {
        this.f664g = 2;
        this.f665h = c3752d0;
        this.f667j = obj;
        this.f666i = str;
        this.f668k = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Constructor constructor;
        Object c3959f;
        boolean zBooleanValue;
        boolean z9;
        int i9 = this.f664g;
        long j3 = this.f668k;
        String str = this.f666i;
        Object obj = this.f667j;
        Object obj2 = this.f665h;
        switch (i9) {
            case 0:
                C0249k c0249k = (C0249k) obj2;
                String str2 = (String) obj;
                C0220f c0220f = c0249k.f676b;
                String str3 = this.f666i;
                long j4 = this.f668k;
                C0248j c0248j = new C0248j(c0249k, str2, str3, j4);
                Map map = c0220f.f538b;
                str3.getClass();
                str2.getClass();
                C3147k c3147k = C0250l.f693c;
                if (AbstractC1184v0.m3174A(str3) && c0220f.m911c() && (constructor = (Constructor) c0220f.f543g) != null) {
                    try {
                        Object objNewInstance = KavaReflector.newInstance(constructor, str3, str2);
                        if (objNewInstance != null) {
                            map.getClass();
                            map.put(objNewInstance, c0248j);
                            C2813a c2813aNetwork = WeChatApis.network();
                            z9 = c2813aNetwork != null && c2813aNetwork.f9079a.m6216j(objNewInstance);
                            if (!z9) {
                                map.remove(objNewInstance);
                            }
                        } else {
                            z9 = false;
                        }
                        c3959f = Boolean.valueOf(z9);
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        ((C0042b) c0220f.f541e).invoke("实名查询请求失败", thM8182b);
                        c3959f = Boolean.FALSE;
                    }
                    zBooleanValue = ((Boolean) c3959f).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    String strM989n = C0249k.m989n(str2, str3);
                    if (c0249k.m995f(j4, strM989n)) {
                        c0249k.m991b(j4, strM989n);
                        c0249k.f682h.remove(str3);
                        c0249k.m999l();
                        ConcurrentHashMap concurrentHashMap = c0249k.f684j;
                        String strM989n2 = C0249k.m989n(str2, str3);
                        ConcurrentHashMap concurrentHashMap2 = c0249k.f683i;
                        Integer num = (Integer) concurrentHashMap2.get(strM989n2);
                        int iIntValue = (num != null ? num.intValue() : 0) + 1;
                        concurrentHashMap2.put(strM989n2, Integer.valueOf(iIntValue));
                        if (iIntValue == 1) {
                            long jRandom = ((long) (Math.random() * 7000)) + 8000;
                            concurrentHashMap.put(strM989n2, Long.valueOf(System.currentTimeMillis() + jRandom));
                            C3086j c3086jTasks = WeChatApis.tasks();
                            if (c3086jTasks != null) {
                                c3086jTasks.m6555f("real_tail_retry_".concat(strM989n2), jRandom, new RunnableC0217c((Object) c0249k, strM989n2, (Object) str3, (Object) str2, 2));
                            }
                        } else {
                            concurrentHashMap.put(strM989n2, Long.valueOf(System.currentTimeMillis() + 60000));
                        }
                        c0249k.m997j();
                        break;
                    }
                }
                break;
            case 1:
                C0249k c0249k2 = (C0249k) obj2;
                String str4 = (String) obj;
                ConcurrentHashMap.KeySetView keySetView = c0249k2.f682h;
                try {
                    Thread.sleep(12000L);
                    break;
                } catch (Throwable unused) {
                }
                String strM989n3 = C0249k.m989n(str, str4);
                if (c0249k2.m995f(j3, strM989n3) && keySetView.contains(str4)) {
                    c0249k2.m991b(j3, strM989n3);
                    keySetView.remove(str4);
                    c0249k2.m999l();
                    String strM989n4 = C0249k.m989n(str, str4);
                    c0249k2.f683i.remove(strM989n4);
                    c0249k2.f684j.put(strM989n4, Long.valueOf(System.currentTimeMillis() + 6000));
                    c0249k2.m997j();
                    break;
                }
                break;
            default:
                C3752d0 c3752d0 = (C3752d0) obj2;
                c3752d0.m7822E0(obj, str);
                TextView textViewM7855y = c3752d0.m7855y(obj, j3);
                if (textViewM7855y != null) {
                    textViewM7855y.setText(str);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0246h(C0249k c0249k, String str, String str2, long j3, int i9) {
        this.f664g = i9;
        this.f665h = c0249k;
        this.f666i = str;
        this.f667j = str2;
        this.f668k = j3;
    }
}
