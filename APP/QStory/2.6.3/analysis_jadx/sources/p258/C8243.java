package p258;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p261.AbstractC8248;
import p305.C8623;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8243 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Application f22781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8243 f22782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13765(Context context, C8623 c8623) {
        if (context == null) {
            Application application = f22781;
            if (application != null) {
                m13765(application, c8623);
                return;
            }
            return;
        }
        Application application2 = (Application) context.getApplicationContext();
        if (application2 == null) {
            AbstractC4922 abstractC4922 = AbstractC8248.f22823;
            Log.e(">>>", "DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return;
        }
        f22781 = application2;
        C8243 c8243 = f22782;
        if (c8243 != null) {
            application2.unregisterActivityLifecycleCallbacks(c8243);
        }
        C8243 c82432 = new C8243();
        f22782 = c82432;
        application2.registerActivityLifecycleCallbacks(c82432);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Activity m13766() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap.size() < 1) {
                return null;
            }
            for (Object obj : arrayMap.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof DialogXFloatingWindowActivity) {
            return;
        }
        AbstractC3738.m8035(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (AbstractC3738.m8032() == activity) {
            WeakReference weakReference = AbstractC3738.f11576;
            if (weakReference != null) {
                weakReference.clear();
            }
            AbstractC3738.f11576 = null;
            AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        }
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC3738.m8026(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3738.m8026(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        if (Build.VERSION.SDK_INT < 29 || activity.isDestroyed() || activity.isFinishing() || (activity instanceof DialogXFloatingWindowActivity)) {
            return;
        }
        AbstractC3738.m8035(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean z;
        if (activity.isDestroyed() || activity.isFinishing() || ((z = activity instanceof DialogXFloatingWindowActivity))) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 && !activity.isDestroyed() && !activity.isFinishing() && !z) {
            AbstractC3738.m8035(activity);
        }
        if (AbstractC3738.f11579 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(AbstractC3738.f11579);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                AbstractC3738 abstractC3738 = (AbstractC3738) copyOnWriteArrayList.get(size);
                if (abstractC3738.m8058() == activity && abstractC3738.f11584 && abstractC3738.m8055() != null) {
                    View viewFindViewById = abstractC3738.m8055().findViewById(R.id.box_root);
                    if (viewFindViewById instanceof DialogXBaseRelativeLayout) {
                        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) viewFindViewById;
                        if (dialogXBaseRelativeLayout.f11633) {
                            View viewFindFocus = dialogXBaseRelativeLayout.findFocus();
                            if (viewFindFocus == null || viewFindFocus == dialogXBaseRelativeLayout) {
                                dialogXBaseRelativeLayout.requestFocus();
                                return;
                            } else {
                                viewFindFocus.requestFocus();
                                return;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (f22781 == null) {
            AbstractC3738.m8034(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
