package com.kongzue.dialogx.impl;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import androidx.appcompat.widget.C1629;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityLifecycleImpl implements Application.ActivityLifecycleCallbacks {
    private static ActivityLifecycleImpl activityLifecycle;
    private static Application application;
    private onActivityResumeCallBack onActivityResumeCallBack;

    public interface onActivityResumeCallBack {
        void getActivity(Activity activity);
    }

    public ActivityLifecycleImpl(onActivityResumeCallBack onactivityresumecallback) {
        this.onActivityResumeCallBack = onactivityresumecallback;
    }

    private void callOnResume(Activity activity) {
        onActivityResumeCallBack onactivityresumecallback;
        if (activity.isDestroyed() || activity.isFinishing() || (activity instanceof DialogXFloatingWindowActivity) || (onactivityresumecallback = this.onActivityResumeCallBack) == null) {
            return;
        }
        onactivityresumecallback.getActivity(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Application getApplicationContext(Context context) {
        if (context != null) {
            return (Application) context.getApplicationContext();
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
                DialogX.error("DialogX.init: 初始化异常，请确保init方法内传入的Context是有效的。");
                return null;
            }
        } catch (Exception unused3) {
            return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
        }
    }

    public static Activity getTopActivity() {
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
                    Field declaredField3 = cls2.getDeclaredField(C1629.f26361);
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void init(Context context, onActivityResumeCallBack onactivityresumecallback) {
        if (context == null) {
            Application application2 = application;
            if (application2 != null) {
                init(application2, onactivityresumecallback);
                return;
            }
            return;
        }
        Application applicationContext = getApplicationContext(context);
        if (applicationContext == null) {
            DialogX.error("DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return;
        }
        application = applicationContext;
        ActivityLifecycleImpl activityLifecycleImpl = activityLifecycle;
        if (activityLifecycleImpl != null) {
            applicationContext.unregisterActivityLifecycleCallbacks(activityLifecycleImpl);
        }
        ActivityLifecycleImpl activityLifecycleImpl2 = new ActivityLifecycleImpl(onactivityresumecallback);
        activityLifecycle = activityLifecycleImpl2;
        applicationContext.registerActivityLifecycleCallbacks(activityLifecycleImpl2);
    }

    public static boolean isExemptActivities(Activity activity) {
        if (activity == null) {
            return true;
        }
        for (String str : DialogX.unsupportedActivitiesPackageNames) {
            if (activity.getClass().getName().contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@InterfaceC6391 Activity activity, @InterfaceC6490 Bundle bundle) {
        onActivityResumeCallBack onactivityresumecallback = this.onActivityResumeCallBack;
        if (onactivityresumecallback == null || (activity instanceof DialogXFloatingWindowActivity)) {
            return;
        }
        onactivityresumecallback.getActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@InterfaceC6391 Activity activity) {
        if (BaseDialog.getTopActivity() == activity) {
            BaseDialog.cleanContext();
        }
        if (Build.VERSION.SDK_INT < 29) {
            BaseDialog.recycleDialog(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@InterfaceC6391 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(@InterfaceC6391 Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            BaseDialog.recycleDialog(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(@InterfaceC6391 Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            callOnResume(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@InterfaceC6391 Activity activity) {
        if (activity.isDestroyed() || activity.isFinishing() || (activity instanceof DialogXFloatingWindowActivity)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            callOnResume(activity);
        }
        BaseDialog.onActivityResume(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@InterfaceC6391 Activity activity, @InterfaceC6391 Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@InterfaceC6391 Activity activity) {
        if (application == null) {
            BaseDialog.init(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@InterfaceC6391 Activity activity) {
    }

    public static Application getApplicationContext() {
        Application application2 = application;
        if (application2 != null) {
            return application2;
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
}
