package com.kongzue.dialogx;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.style.MaterialStyle;
import com.kongzue.dialogx.util.DialogListBuilder;
import com.kongzue.dialogx.util.InputInfo;
import com.kongzue.dialogx.util.TextInfo;

/* JADX INFO: loaded from: classes2.dex */
public class DialogX {
    public static boolean DEBUGMODE = true;
    public static final String ERROR_INIT_TIPS = "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki";
    public static boolean autoGC;
    public static TextInfo buttonTextInfo;
    public static String cancelButtonText;
    public static CharSequence defaultMessageDialogTitleText;
    public static CharSequence defaultTipDialogErrorText;
    public static CharSequence defaultTipDialogSuccessText;
    public static CharSequence defaultTipDialogWarningText;
    public static CharSequence defaultWaitDialogWaitingText;
    public static DialogLifecycleCallback<BaseDialog> dialogLifeCycleListener;
    public static int dialogMaxHeight;
    public static int dialogMaxWidth;
    public static int dialogMinHeight;
    public static int dialogMinWidth;
    public static InputInfo inputInfo;
    public static TextInfo menuTextInfo;
    public static TextInfo menuTitleInfo;
    public static TextInfo messageTextInfo;
    public static TextInfo okButtonTextInfo;
    public static TextInfo popTextInfo;
    public static TextInfo tipTextInfo;
    public static THEME tipTheme;
    public static TextInfo titleTextInfo;
    public static DialogXStyle globalStyle = MaterialStyle.style();
    public static THEME globalTheme = THEME.LIGHT;
    public static IMPL_MODE implIMPLMode = IMPL_MODE.VIEW;
    public static boolean autoShowInputKeyboard = true;
    public static boolean onlyOnePopTip = false;
    public static boolean onlyOnePopNotification = true;
    public static Integer backgroundColor = null;
    public static Integer tipBackgroundColor = null;
    public static Integer tipProgressColor = null;
    public static boolean cancelable = true;
    public static boolean cancelableTipDialog = false;
    public static long enterAnimDuration = -1;
    public static long exitAnimDuration = -1;
    public static boolean autoRunOnUIThread = true;
    public static boolean useHaptic = true;

    @Deprecated
    public static boolean useActivityLayoutTranslationNavigationBar = false;
    public static int bottomDialogNavbarColor = 0;
    public static int touchSlideTriggerThreshold = dip2px(35.0f);
    public static boolean globalHoverWindow = false;
    public static String[] unsupportedActivitiesPackageNames = {"com.bytedance.sdk.openadsdk.stub.activity", "com.mobile.auth.gatewayauth", "com.google.android.gms.ads"};
    public static int defaultMessageDialogBackgroundRadius = -1;
    public static int defaultBottomDialogBackgroundRadius = -1;
    public static int defaultFullScreenDialogBackgroundRadius = -1;
    public static int defaultWaitAndTipDialogBackgroundRadius = -1;
    public static int defaultPopMenuBackgroundRadius = -1;
    public static int defaultPopTipBackgroundRadius = -1;
    public static int defaultPopNotificationBackgroundRadius = -1;
    public static boolean enableImmersiveMode = true;
    public static boolean ignoreUnsafeInsetsHorizontal = false;

    public enum IMPL_MODE {
        VIEW,
        WINDOW,
        DIALOG_FRAGMENT,
        FLOATING_ACTIVITY
    }

    public enum THEME {
        LIGHT,
        DARK,
        AUTO
    }

    private static int dip2px(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void error(Object obj) {
        if (DEBUGMODE) {
            Log.e(">>>", obj.toString());
        }
    }

    public static void init(Context context) {
        if (context == null) {
            error(ERROR_INIT_TIPS);
        } else {
            BaseDialog.init(context);
        }
    }

    public static DialogListBuilder showDialogList(BaseDialog... baseDialogArr) {
        return DialogListBuilder.create(baseDialogArr).show();
    }
}
