package p107h9;

import android.content.Context;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p011ab.C0042b;
import p062e8.C0828b;
import p086fh.C1253k;
import p115hh.C1730o;
import p129ig.AbstractC2043a;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.C4173t;

/* JADX INFO: renamed from: h9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1627b {

    /* JADX INFO: renamed from: e */
    public static final List f5327e = AbstractC0000a.m101y0(new String[]{"MicroMsg.SLocationListener"}, new String[]{"MicroMsg.SLocationListenerWgs84"}, new String[]{"MicroMsg.DefaultTencentLocationManager", "[mlocationListener]error:%d, reason:%s"});

    /* JADX INFO: renamed from: a */
    public final C3742g f5328a;

    /* JADX INFO: renamed from: b */
    public final C0042b f5329b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f5330c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f5331d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1627b(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5328a = c3742g;
        this.f5329b = c0042b;
        this.f5330c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_fake_location_method_cache");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final ArrayList m4151a() {
        C0042b c0042b;
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f5328a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        SharedPreferences sharedPreferences = this.f5330c;
        List listM2090f = C0828b.m2090f(sharedPreferences, strM2091g, classLoader, "location_callbacks_v1");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2090f) {
            if (AbstractC2043a.m5025c((Method) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return arrayList;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = f5327e.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0042b = this.f5329b;
            if (!zHasNext) {
                break;
            }
            String[] strArr = (String[]) it.next();
            try {
                DexKitBridge dexKitBridge = c3742g.f12146d;
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.m3374r0((String[]) Arrays.copyOf(strArr, strArr.length));
                c0570e.f1764h = c1253k;
                c3959f = dexKitBridge.findMethod(c0570e);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c0042b.invoke("定位微信定位回调失败: ".concat(AbstractC4165l.m8369F0(strArr, null, 63)), thM8182b);
                c3959f = C4173t.f13710g;
            }
            Iterator it2 = ((List) c3959f).iterator();
            while (it2.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it2.next()).m4350r(classLoader);
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method == null || !AbstractC2043a.m5025c(method)) {
                    method = null;
                }
                if (method != null) {
                    linkedHashSet.add(method);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            if (hashSet.add(((Method) obj2).toGenericString())) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit.clear().putString("cache.key", strM2091g);
                }
                editorEdit.remove("location_callbacks_v1").apply();
            } catch (Throwable unused) {
            }
            c0042b.invoke("未找到微信定位回调方法", null);
        } else {
            C0828b.f2478a.m2097j(sharedPreferences, strM2091g, "location_callbacks_v1", arrayList2);
        }
        return arrayList2;
    }
}
