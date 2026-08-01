package p330;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.ComponentCallbacks2C3063;
import com.davemorrissey.labs.subscaleview.R;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p026.AbstractC6293;
import p035.AbstractC6340;
import p044.C6459;
import p144.C7546;
import p221.AbstractC7977;
import p221.C7975;
import p221.C7978;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8790 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final HashMap f24741 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m14444(Activity activity, boolean z) {
        PackageInfo packageInfo;
        HashMap map = f24741;
        C6459 c6459 = (C6459) map.get(activity);
        if (c6459 == null) {
            c6459 = new C6459();
            AbstractC3065.m6858(activity);
            map.put(activity, c6459);
        }
        AtomicBoolean atomicBoolean = c6459.f17728;
        if (!z) {
            if (atomicBoolean.getAndSet(false)) {
                c6459.f17727.removeViewImmediate(c6459.f17726);
                return;
            }
            return;
        }
        if (c6459.f17724 == null) {
            c6459.f17724 = activity;
        }
        if (c6459.f17727 == null) {
            c6459.f17727 = activity.getWindowManager();
        }
        if (c6459.f17725 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c6459.f17725 = layoutParams;
            layoutParams.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
            layoutParams.flags = 24;
            layoutParams.format = 1;
            layoutParams.gravity = 49;
            layoutParams.width = -1;
            layoutParams.height = AbstractC2904.m6267(c6459.f17724, 100.0f);
            c6459.f17725 = c6459.f17725;
        }
        if (c6459.f17726 == null) {
            c6459.f17726 = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.spring_festival_titile_bar, (ViewGroup) null, false);
            for (int i = 0; i < c6459.f17726.getChildCount(); i++) {
                View childAt = c6459.f17726.getChildAt(i);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    ComponentCallbacks2C3063 componentCallbacks2C3063M6720 = ComponentCallbacks2C3057.m6720(AbstractC6340.f17460);
                    Integer numValueOf = Integer.valueOf(R.drawable.chunjie_24);
                    C3061 c3061M6755 = componentCallbacks2C3063M6720.m6755(Drawable.class);
                    C3061 c3061M6741 = c3061M6755.m6741(numValueOf);
                    Context context = c3061M6755.f9780;
                    C3061 c3061 = (C3061) c3061M6741.m6562(context.getTheme());
                    ConcurrentHashMap concurrentHashMap = AbstractC7977.f22054;
                    String packageName = context.getPackageName();
                    ConcurrentHashMap concurrentHashMap2 = AbstractC7977.f22054;
                    InterfaceC8392 interfaceC8392 = (InterfaceC8392) concurrentHashMap2.get(packageName);
                    if (interfaceC8392 == null) {
                        try {
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                            packageInfo = null;
                        }
                        C7975 c7975 = new C7975(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                        InterfaceC8392 interfaceC83922 = (InterfaceC8392) concurrentHashMap2.putIfAbsent(packageName, c7975);
                        interfaceC8392 = interfaceC83922 == null ? c7975 : interfaceC83922;
                    }
                    ((C3061) ((C3061) c3061.m6560(new C7978(context.getResources().getConfiguration().uiMode & 48, interfaceC8392))).m6554()).m6744(imageView);
                }
            }
        }
        if (atomicBoolean.get()) {
            return;
        }
        c6459.f17727.addView(c6459.f17726, c6459.f17725);
        atomicBoolean.set(true);
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        m11802(Activity.class.getDeclaredMethod("onWindowFocusChanged", Boolean.TYPE), new C8791(this));
        m11803(Activity.class.getDeclaredMethod("onPause", null), new C7546(this, 28));
        m11803(Activity.class.getDeclaredMethod("onDestroy", null), new C7546(29));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "2024\u65b0\u5e74\u7eaa\u5ff5 (\u770b\u8d77\u6765\u6ca1\u4ec0\u4e48\u7528";
    }
}
