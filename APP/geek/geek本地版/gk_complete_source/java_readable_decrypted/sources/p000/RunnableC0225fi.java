package p000;

import android.content.Context;
import com.github.megatronking.stringfog.Base64;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.TagExecutor;
import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: fi */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0225fi implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1967c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1968d;

    public /* synthetic */ RunnableC0225fi(Object obj, Object obj2, Object obj3, int i) {
        this.f1965a = i;
        this.f1966b = obj;
        this.f1967c = obj2;
        this.f1968d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objectField;
        String string;
        switch (this.f1965a) {
            case Base64.DEFAULT /* 0 */:
                C0431l0 c0431l0 = (C0431l0) this.f1966b;
                AbstractC0346ip abstractC0346ip = (AbstractC0346ip) this.f1967c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1968d;
                try {
                    C0859wk c0859wkM43g = a80.m43g((Context) c0431l0.f2980b);
                    if (c0859wkM43g == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0822vk c0822vk = (C0822vk) ((InterfaceC0152di) c0859wkM43g.f144b);
                    synchronized (c0822vk.f4863d) {
                        c0822vk.f4865f = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC0152di) c0859wkM43g.f144b).mo943e(new C0262gi(abstractC0346ip, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0346ip.mo1276F(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case Base64.NO_PADDING /* 1 */:
                ClassLoader classLoader = (ClassLoader) this.f1966b;
                Object obj = this.f1967c;
                String str = (String) this.f1968d;
                C0309hs c0309hs = C0309hs.f2299a;
                AbstractC0346ip.m1500l(obj);
                try {
                    Object objectField2 = XposedHelpers.getObjectField(obj, pb0.f3821z);
                    String str2 = objectField2 instanceof String ? (String) objectField2 : null;
                    if (str2 != null && (objectField = XposedHelpers.getObjectField(obj, pb0.f3694B)) != null && (string = objectField.toString()) != null) {
                        int intField = XposedHelpers.getIntField(obj, pb0.f3697C);
                        Object objectField3 = XposedHelpers.getObjectField(obj, pb0.f3691A);
                        String str3 = objectField3 instanceof String ? (String) objectField3 : null;
                        String str4 = str3 == null ? "" : str3;
                        String str5 = (String) C0309hs.f2301c.get(str2);
                        String str6 = str5 == null ? "" : str5;
                        Class clsFindClassIfExists = XposedHelpers.findClassIfExists(pb0.f3785n, classLoader);
                        if (clsFindClassIfExists == null) {
                            return;
                        }
                        Object[] objArr = (Object[]) pb0.f3741X0.m1579c(str2, Integer.valueOf(intField), string, str4, str6, str);
                        if (objArr.length == 0) {
                            return;
                        }
                        Object objNewInstance = XposedHelpers.newInstance(clsFindClassIfExists, Arrays.copyOf(objArr, objArr.length));
                        AbstractC0346ip.m1500l(objNewInstance);
                        C0309hs.m1372e(classLoader, objNewInstance);
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                ((TagExecutor) this.f1966b).lambda$start$0((Runnable) this.f1967c, (String) this.f1968d);
                return;
        }
    }
}
