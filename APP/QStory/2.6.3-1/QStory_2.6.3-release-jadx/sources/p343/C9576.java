package p343;

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
import androidx.fragment.app.C3191;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.ComponentCallbacks2C3896;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p034.AbstractC7082;
import p042.AbstractC7140;
import p052.AbstractC7187;
import p060.C7289;
import p160.C8376;
import p237.AbstractC8807;
import p237.C8805;
import p237.C8808;
import p302.InterfaceC9222;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9576 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final HashMap f25006 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m14999(Activity activity, boolean z) {
        PackageInfo packageInfo;
        HashMap map = f25006;
        C7289 c7289 = (C7289) map.get(activity);
        if (c7289 == null) {
            c7289 = new C7289();
            AbstractC3888.m7247(activity);
            map.put(activity, c7289);
        }
        AtomicBoolean atomicBoolean = c7289.f18069;
        if (!z) {
            if (atomicBoolean.getAndSet(false)) {
                c7289.f18068.removeViewImmediate(c7289.f18067);
                return;
            }
            return;
        }
        if (c7289.f18065 == null) {
            c7289.f18065 = activity;
        }
        if (c7289.f18068 == null) {
            c7289.f18068 = activity.getWindowManager();
        }
        if (c7289.f18066 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c7289.f18066 = layoutParams;
            layoutParams.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
            layoutParams.flags = 24;
            layoutParams.format = 1;
            layoutParams.gravity = 49;
            layoutParams.width = -1;
            layoutParams.height = AbstractC7082.m12313(c7289.f18065, 100.0f);
            c7289.f18066 = c7289.f18066;
        }
        if (c7289.f18067 == null) {
            c7289.f18067 = (ViewGroup) LayoutInflater.from(activity).inflate(C0328R.layout.spring_festival_titile_bar, (ViewGroup) null, false);
            for (int i = 0; i < c7289.f18067.getChildCount(); i++) {
                View childAt = c7289.f18067.getChildAt(i);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    ComponentCallbacks2C3896 componentCallbacks2C3896M7325 = ComponentCallbacks2C3890.m7325(AbstractC7187.f17852);
                    Integer numValueOf = Integer.valueOf(C0328R.drawable.chunjie_24);
                    C3894 c3894M7360 = componentCallbacks2C3896M7325.m7360(Drawable.class);
                    C3894 c3894M7346 = c3894M7360.m7346(numValueOf);
                    Context context = c3894M7360.f10134;
                    C3894 c3894 = (C3894) c3894M7346.m7182(context.getTheme());
                    ConcurrentHashMap concurrentHashMap = AbstractC8807.f22396;
                    String packageName = context.getPackageName();
                    ConcurrentHashMap concurrentHashMap2 = AbstractC8807.f22396;
                    InterfaceC9222 interfaceC9222 = (InterfaceC9222) concurrentHashMap2.get(packageName);
                    if (interfaceC9222 == null) {
                        try {
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                            packageInfo = null;
                        }
                        C8805 c8805 = new C8805(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                        InterfaceC9222 interfaceC92222 = (InterfaceC9222) concurrentHashMap2.putIfAbsent(packageName, c8805);
                        interfaceC9222 = interfaceC92222 == null ? c8805 : interfaceC92222;
                    }
                    ((C3894) ((C3894) c3894.m7180(new C8808(context.getResources().getConfiguration().uiMode & 48, interfaceC9222))).m7174()).m7349(imageView);
                }
            }
        }
        if (atomicBoolean.get()) {
            return;
        }
        c7289.f18068.addView(c7289.f18067, c7289.f18066);
        atomicBoolean.set(true);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        m12389(Activity.class.getDeclaredMethod(AbstractC9234.m14531(1153), Boolean.TYPE), new C3191(this, 27));
        m12390(Activity.class.getDeclaredMethod(AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵喵"), null), new C8376(this, 24));
        m12390(Activity.class.getDeclaredMethod(AbstractC9234.m14531(350), null), new C8376(25));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1155);
    }
}
