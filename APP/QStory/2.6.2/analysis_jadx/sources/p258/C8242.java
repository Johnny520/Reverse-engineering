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
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;
import p033.AbstractC6325;
import p261.AbstractC8247;
import p305.C8631;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8242 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Application f22782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8242 f22783;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13748(Context context, C8631 c8631) {
        if (context == null) {
            Application application = f22782;
            if (application != null) {
                m13748(application, c8631);
                return;
            }
            return;
        }
        Application application2 = (Application) context.getApplicationContext();
        if (application2 == null) {
            AbstractC6325 abstractC6325 = AbstractC8247.f22824;
            Log.e(">>>", "DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return;
        }
        f22782 = application2;
        C8242 c8242 = f22783;
        if (c8242 != null) {
            application2.unregisterActivityLifecycleCallbacks(c8242);
        }
        C8242 c82422 = new C8242();
        f22783 = c82422;
        application2.registerActivityLifecycleCallbacks(c82422);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Activity m13749() {
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
        AbstractC3737.m8048(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (AbstractC3737.m8045() == activity) {
            WeakReference weakReference = AbstractC3737.f11571;
            if (weakReference != null) {
                weakReference.clear();
            }
            AbstractC3737.f11571 = null;
            AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        }
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC3737.m8039(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3737.m8039(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        if (Build.VERSION.SDK_INT < 29 || activity.isDestroyed() || activity.isFinishing() || (activity instanceof DialogXFloatingWindowActivity)) {
            return;
        }
        AbstractC3737.m8048(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean z;
        if (activity.isDestroyed() || activity.isFinishing() || ((z = activity instanceof DialogXFloatingWindowActivity))) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 && !activity.isDestroyed() && !activity.isFinishing() && !z) {
            AbstractC3737.m8048(activity);
        }
        if (AbstractC3737.f11574 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(AbstractC3737.f11574);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                AbstractC3737 abstractC3737 = (AbstractC3737) copyOnWriteArrayList.get(size);
                if (abstractC3737.m8071() == activity && abstractC3737.f11579 && abstractC3737.m8068() != null) {
                    View viewFindViewById = abstractC3737.m8068().findViewById(R.id.box_root);
                    if (viewFindViewById instanceof DialogXBaseRelativeLayout) {
                        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) viewFindViewById;
                        if (dialogXBaseRelativeLayout.f11628) {
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
        if (f22782 == null) {
            AbstractC3737.m8047(activity);
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
