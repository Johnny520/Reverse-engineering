package yyds;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: yyds.ᛲᛶᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0373 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0373 f1914;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Application f1915;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Application m1072() {
        Application application = f1915;
        if (application != null) {
            return application;
        }
        try {
            try {
                try {
                    return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
                } catch (Exception unused) {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    return (Application) cls.getDeclaredMethod("getApplication", null).invoke(cls.getDeclaredMethod("currentActivityThread", null).invoke(null, null), null);
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Activity m1073() {
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

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m1074(Context context, C0805 c0805) {
        if (context == null) {
            Application application = f1915;
            if (application != null) {
                m1074(application, c0805);
                return;
            }
            return;
        }
        Application application2 = (Application) context.getApplicationContext();
        if (application2 == null) {
            WeakReference weakReference = AbstractC1655.f8450;
            Log.e(">>>", "DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return;
        }
        f1915 = application2;
        C0373 c0373 = f1914;
        if (c0373 != null) {
            application2.unregisterActivityLifecycleCallbacks(c0373);
        }
        C0373 c03732 = new C0373();
        f1914 = c03732;
        application2.registerActivityLifecycleCallbacks(c03732);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof DialogXFloatingWindowActivity) {
            return;
        }
        AbstractC0041.m274(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (AbstractC0041.m264() == activity) {
            WeakReference weakReference = AbstractC0041.f393;
            if (weakReference != null) {
                weakReference.clear();
            }
            AbstractC0041.f393 = null;
            WeakReference weakReference2 = AbstractC1655.f8450;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        AbstractC0041.m271(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        if (activity.isDestroyed() || activity.isFinishing() || (activity instanceof DialogXFloatingWindowActivity)) {
            return;
        }
        AbstractC0041.m274(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity.isDestroyed() || activity.isFinishing() || (activity instanceof DialogXFloatingWindowActivity) || AbstractC0041.f392 == null) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(AbstractC0041.f392);
        for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
            AbstractC0041 abstractC0041 = (AbstractC0041) copyOnWriteArrayList.get(size);
            if (abstractC0041.m282() == activity && abstractC0041.f407 && abstractC0041.m279() != null) {
                View viewFindViewById = abstractC0041.m279().findViewById(R.id.box_root);
                if (viewFindViewById instanceof DialogXBaseRelativeLayout) {
                    DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) viewFindViewById;
                    if (dialogXBaseRelativeLayout.f421) {
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (f1915 == null) {
            AbstractC0041.m261(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
