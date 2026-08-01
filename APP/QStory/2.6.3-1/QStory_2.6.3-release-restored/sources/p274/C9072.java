package p274;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p277.AbstractC9077;
import p321.C9452;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9072 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Application f23126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9072 f23127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14324(Context context, C9452 c9452) {
        if (context == null) {
            Application application = f23126;
            if (application != null) {
                m14324(application, c9452);
                return;
            }
            return;
        }
        Application application2 = (Application) context.getApplicationContext();
        if (application2 == null) {
            AbstractC5754 abstractC5754 = AbstractC9077.f23168;
            Log.e(">>>", "DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return;
        }
        f23126 = application2;
        C9072 c9072 = f23127;
        if (c9072 != null) {
            application2.unregisterActivityLifecycleCallbacks(c9072);
        }
        C9072 c90722 = new C9072();
        f23127 = c90722;
        application2.registerActivityLifecycleCallbacks(c90722);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Activity m14325() {
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
        AbstractC4570.m8594(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (AbstractC4570.m8591() == activity) {
            WeakReference weakReference = AbstractC4570.f11921;
            if (weakReference != null) {
                weakReference.clear();
            }
            AbstractC4570.f11921 = null;
            AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        }
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC4570.m8585(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC4570.m8585(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        if (Build.VERSION.SDK_INT < 29 || activity.isDestroyed() || activity.isFinishing() || (activity instanceof DialogXFloatingWindowActivity)) {
            return;
        }
        AbstractC4570.m8594(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean z;
        if (activity.isDestroyed() || activity.isFinishing() || ((z = activity instanceof DialogXFloatingWindowActivity))) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 && !activity.isDestroyed() && !activity.isFinishing() && !z) {
            AbstractC4570.m8594(activity);
        }
        if (AbstractC4570.f11924 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(AbstractC4570.f11924);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                AbstractC4570 abstractC4570 = (AbstractC4570) copyOnWriteArrayList.get(size);
                if (abstractC4570.m8617() == activity && abstractC4570.f11929 && abstractC4570.m8614() != null) {
                    View viewFindViewById = abstractC4570.m8614().findViewById(C0328R.id.box_root);
                    if (viewFindViewById instanceof DialogXBaseRelativeLayout) {
                        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) viewFindViewById;
                        if (dialogXBaseRelativeLayout.f11978) {
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
        if (f23126 == null) {
            AbstractC4570.m8593(activity);
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
