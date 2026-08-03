package Yue;

import Yue.AbstractC7430;
import Yue.C3090;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3090 extends C4187 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static InterfaceC3098 f4610;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ */
    public class RunnableC0047 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ String[] f4611;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Activity f4612;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ int f4613;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC0047(String[] strArr, Activity activity, int i) {
            this.f4611 = strArr;
            this.f4612 = activity;
            this.f4613 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f4611.length];
            PackageManager packageManager = this.f4612.getPackageManager();
            String packageName = this.f4612.getPackageName();
            int length = this.f4611.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f4611[i], packageName);
            }
            ((InterfaceC3097) this.f4612).onRequestPermissionsResult(this.f4613, this.f4611, iArr);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟ */
    @InterfaceC7113(21)
    public static class C0048 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m181(Activity activity) {
            activity.finishAfterTransition();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m182(Activity activity) {
            activity.postponeEnterTransition();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m6321(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m6322(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m6323(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(22)
    public static class C3091 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Uri m183(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(23)
    public static class C3092 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m184(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m185(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m6324(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C3093 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <T> T m186(Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C3094 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Display m187(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m188(@InterfaceC6391 Activity activity, @InterfaceC6490 C5861 c5861, @InterfaceC6490 Bundle bundle) {
            activity.setLocusContext(c5861 == null ? null : c5861.m18149(), bundle);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static class C3095 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m189(@InterfaceC6391 Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @InterfaceC4482
        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m190(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7113(32)
    public static class C3096 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m191(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥۣ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC3097 {
        void onRequestPermissionsResult(int i, @InterfaceC6391 String[] strArr, @InterfaceC6391 int[] iArr);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC3098 {
        /* JADX INFO: renamed from: ۥ */
        boolean m192(@InterfaceC6391 Activity activity, @InterfaceC5459(from = 0) int i, int i2, @InterfaceC6490 Intent intent);

        /* JADX INFO: renamed from: ۥ۟ */
        boolean m193(@InterfaceC6391 Activity activity, @InterfaceC6391 String[] strArr, @InterfaceC5459(from = 0) int i);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC3099 {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC7113(21)
    public static class SharedElementCallbackC3100 extends SharedElementCallback {

        /* JADX INFO: renamed from: ۥ */
        public final AbstractC7430 f69;

        public SharedElementCallbackC3100(AbstractC7430 abstractC7430) {
            this.f69 = abstractC7430;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f69.m3624(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f69.m23263(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f69.m23264(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f69.m23265(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f69.m23266(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f69.m23267(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @InterfaceC7113(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f69.m23268(list, list2, new AbstractC7430.InterfaceC1258() { // from class: Yue.ۥ۟۟ۧۤ
                @Override // Yue.AbstractC7430.InterfaceC1258
                /* JADX INFO: renamed from: ۥ */
                public final void mo196() {
                    C3090.C3092.m184(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static void m6301(@InterfaceC6391 Activity activity) {
        activity.finishAffinity();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m6302(@InterfaceC6391 Activity activity) {
        C0048.m181(activity);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static InterfaceC3098 m6303() {
        return f4610;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static Uri m6304(@InterfaceC6391 Activity activity) {
        return C3091.m183(activity);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static boolean m6305(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static boolean m6306(@InterfaceC6391 Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return C3095.m189(activity);
        }
        if (i == 30) {
            return (C3094.m187(activity) == null || C3094.m187(activity).getDisplayId() == 0) ? false : true;
        }
        if (i == 29) {
            return (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ void m6307(Activity activity) {
        if (activity.isFinishing() || C3109.m6349(activity)) {
            return;
        }
        activity.recreate();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static void m6308(@InterfaceC6391 Activity activity) {
        C0048.m182(activity);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static void m6309(@InterfaceC6391 final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: Yue.ۥ۟۟ۧۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C3090.m6307(activity);
                }
            });
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static C4516 m6310(@InterfaceC6391 Activity activity, @InterfaceC6391 DragEvent dragEvent) {
        return C4516.m1439(activity, dragEvent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static void m6311(@InterfaceC6391 Activity activity, @InterfaceC6391 String[] strArr, @InterfaceC5459(from = 0) int i) {
        InterfaceC3098 interfaceC3098 = f4610;
        if (interfaceC3098 == null || !interfaceC3098.m193(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (TextUtils.isEmpty(strArr[i2])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            }
            if (activity instanceof InterfaceC3099) {
                ((InterfaceC3099) activity).validateRequestPermissionsRequestCode(i);
            }
            C3092.m185(activity, strArr, i);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static <T extends View> T m6312(@InterfaceC6391 Activity activity, @InterfaceC5411 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C3093.m186(activity, i);
        }
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static void m6313(@InterfaceC6391 Activity activity, @InterfaceC6490 AbstractC7430 abstractC7430) {
        C0048.m6321(activity, abstractC7430 != null ? new SharedElementCallbackC3100(abstractC7430) : null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static void m6314(@InterfaceC6391 Activity activity, @InterfaceC6490 AbstractC7430 abstractC7430) {
        C0048.m6322(activity, abstractC7430 != null ? new SharedElementCallbackC3100(abstractC7430) : null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static void m6315(@InterfaceC6391 Activity activity, @InterfaceC6490 C5861 c5861, @InterfaceC6490 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3094.m188(activity, c5861, bundle);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static void m6316(@InterfaceC6490 InterfaceC3098 interfaceC3098) {
        f4610 = interfaceC3098;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static boolean m6317(@InterfaceC6391 Activity activity, @InterfaceC6391 String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i >= 32 ? C3096.m191(activity, str) : i == 31 ? C3095.m190(activity, str) : C3092.m6324(activity, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static void m6318(@InterfaceC6391 Activity activity, @InterfaceC6391 Intent intent, int i, @InterfaceC6490 Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static void m6319(@InterfaceC6391 Activity activity, @InterfaceC6391 IntentSender intentSender, int i, @InterfaceC6490 Intent intent, int i2, int i3, int i4, @InterfaceC6490 Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m6320(@InterfaceC6391 Activity activity) {
        C0048.m6323(activity);
    }
}
