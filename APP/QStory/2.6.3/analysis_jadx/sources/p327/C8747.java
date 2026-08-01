package p327;

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
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.ComponentCallbacks2C3064;
import com.davemorrissey.labs.subscaleview.R;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p018.AbstractC6253;
import p026.AbstractC6311;
import p036.AbstractC6358;
import p044.C6460;
import p144.C7547;
import p221.AbstractC7978;
import p221.C7976;
import p221.C7979;
import p286.InterfaceC8393;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8747 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final HashMap f24661 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m14440(Activity activity, boolean z) {
        PackageInfo packageInfo;
        HashMap map = f24661;
        C6460 c6460 = (C6460) map.get(activity);
        if (c6460 == null) {
            c6460 = new C6460();
            AbstractC3056.m6687(activity);
            map.put(activity, c6460);
        }
        AtomicBoolean atomicBoolean = c6460.f17724;
        if (!z) {
            if (atomicBoolean.getAndSet(false)) {
                c6460.f17723.removeViewImmediate(c6460.f17722);
                return;
            }
            return;
        }
        if (c6460.f17720 == null) {
            c6460.f17720 = activity;
        }
        if (c6460.f17723 == null) {
            c6460.f17723 = activity.getWindowManager();
        }
        if (c6460.f17721 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c6460.f17721 = layoutParams;
            layoutParams.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
            layoutParams.flags = 24;
            layoutParams.format = 1;
            layoutParams.gravity = 49;
            layoutParams.width = -1;
            layoutParams.height = AbstractC6253.m11754(c6460.f17720, 100.0f);
            c6460.f17721 = c6460.f17721;
        }
        if (c6460.f17722 == null) {
            c6460.f17722 = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.spring_festival_titile_bar, (ViewGroup) null, false);
            for (int i = 0; i < c6460.f17722.getChildCount(); i++) {
                View childAt = c6460.f17722.getChildAt(i);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    ComponentCallbacks2C3064 componentCallbacks2C3064M6765 = ComponentCallbacks2C3058.m6765(AbstractC6358.f17507);
                    Integer numValueOf = Integer.valueOf(R.drawable.chunjie_24);
                    C3062 c3062M6800 = componentCallbacks2C3064M6765.m6800(Drawable.class);
                    C3062 c3062M6786 = c3062M6800.m6786(numValueOf);
                    Context context = c3062M6800.f9789;
                    C3062 c3062 = (C3062) c3062M6786.m6622(context.getTheme());
                    ConcurrentHashMap concurrentHashMap = AbstractC7978.f22051;
                    String packageName = context.getPackageName();
                    ConcurrentHashMap concurrentHashMap2 = AbstractC7978.f22051;
                    InterfaceC8393 interfaceC8393 = (InterfaceC8393) concurrentHashMap2.get(packageName);
                    if (interfaceC8393 == null) {
                        try {
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                            packageInfo = null;
                        }
                        C7976 c7976 = new C7976(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                        InterfaceC8393 interfaceC83932 = (InterfaceC8393) concurrentHashMap2.putIfAbsent(packageName, c7976);
                        interfaceC8393 = interfaceC83932 == null ? c7976 : interfaceC83932;
                    }
                    ((C3062) ((C3062) c3062.m6620(new C7979(context.getResources().getConfiguration().uiMode & 48, interfaceC8393))).m6614()).m6789(imageView);
                }
            }
        }
        if (atomicBoolean.get()) {
            return;
        }
        c6460.f17723.addView(c6460.f17722, c6460.f17721);
        atomicBoolean.set(true);
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        m11830(Activity.class.getDeclaredMethod(AbstractC8405.m13972(1153), Boolean.TYPE), new C2358(this, 27));
        m11831(Activity.class.getDeclaredMethod(AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵喵"), null), new C7547(this, 24));
        m11831(Activity.class.getDeclaredMethod(AbstractC8405.m13972(350), null), new C7547(25));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1155);
    }
}
