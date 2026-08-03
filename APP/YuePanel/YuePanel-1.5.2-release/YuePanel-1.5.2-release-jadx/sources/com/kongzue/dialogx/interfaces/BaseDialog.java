package com.kongzue.dialogx.interfaces;

import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.LifecycleRegistry;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.dialogs.WaitDialog;
import com.kongzue.dialogx.impl.ActivityLifecycleImpl;
import com.kongzue.dialogx.impl.DialogFragmentImpl;
import com.kongzue.dialogx.util.ActivityRunnable;
import com.kongzue.dialogx.util.DialogListBuilder;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import com.kongzue.dialogx.util.TextInfo;
import com.kongzue.dialogx.util.WindowUtil;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.wrapper.ModuleUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseDialog implements LifecycleOwner {
    private static WeakReference<Activity> activityWeakReference;
    static WeakReference<Handler> mMainHandler;
    private static List<BaseDialog> runningDialogList;
    private static Thread uiThread;
    private static Map<String, ActivityRunnable> waitRunDialogX;
    protected static WindowInsets windowInsets;
    protected boolean cancelable;
    protected Map<String, Object> data;

    @InterfaceC6490
    private DialogListBuilder dialogListBuilder;
    private WeakReference<View> dialogView;
    protected boolean dismissAnimFlag;
    protected boolean enableImmersiveMode;
    protected long enterAnimDuration;
    protected long exitAnimDuration;
    protected WeakReference<DialogXFloatingWindowActivity> floatingWindowActivity;
    protected boolean isHide;
    protected boolean isShow;
    protected int maxHeight;
    protected int maxWidth;
    protected int minHeight;
    protected int minWidth;
    protected DialogXRunnable onDismissRunnable;
    protected DialogXRunnable onShowRunnable;
    protected WeakReference<Activity> ownActivity;
    protected WeakReference<DialogFragmentImpl> ownDialogFragmentImpl;
    protected boolean preShow;
    private WeakReference<FrameLayout> rootFrameLayout;
    protected int isHapticFeedbackEnabled = -1;
    protected DialogX.IMPL_MODE dialogImplMode = DialogX.implIMPLMode;
    protected LifecycleRegistry lifecycle = new LifecycleRegistry(this);
    protected int thisOrderIndex = 0;
    protected Map<Integer, DialogXRunnable> dialogActionRunnableMap = new HashMap();
    protected int[] customDialogLayoutResId = new int[2];
    protected Integer backgroundColor = null;
    protected int[] screenPaddings = new int[4];
    protected DialogXStyle style = DialogX.globalStyle;
    protected DialogX.THEME theme = DialogX.globalTheme;
    protected boolean autoShowInputKeyboard = DialogX.autoShowInputKeyboard;

    /* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.BaseDialog$9 */
    public static /* synthetic */ class C25579 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE;

        static {
            int[] iArr = new int[DialogX.IMPL_MODE.values().length];
            $SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE = iArr;
            try {
                iArr[DialogX.IMPL_MODE.WINDOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE[DialogX.IMPL_MODE.DIALOG_FRAGMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE[DialogX.IMPL_MODE.FLOATING_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum BOOLEAN {
        TRUE,
        FALSE
    }

    public enum BUTTON_SELECT_RESULT {
        NONE,
        BUTTON_OK,
        BUTTON_CANCEL,
        BUTTON_OTHER
    }

    public BaseDialog() {
        this.enableImmersiveMode = true;
        this.cancelable = true;
        this.enterAnimDuration = -1L;
        this.exitAnimDuration = -1L;
        this.cancelable = DialogX.cancelable;
        this.enterAnimDuration = DialogX.enterAnimDuration;
        this.exitAnimDuration = DialogX.exitAnimDuration;
        this.enableImmersiveMode = DialogX.enableImmersiveMode;
    }

    private static void addDialogToRunningList(BaseDialog baseDialog) {
        if (runningDialogList == null) {
            runningDialogList = new CopyOnWriteArrayList();
        }
        runningDialogList.add(baseDialog);
    }

    public static void cleanAll() {
        if (runningDialogList != null) {
            for (BaseDialog baseDialog : new CopyOnWriteArrayList(runningDialogList)) {
                if (baseDialog.isShow()) {
                    baseDialog.shutdown();
                }
                baseDialog.cleanActivityContext();
                runningDialogList.remove(baseDialog);
            }
        }
    }

    public static void cleanContext() {
        WeakReference<Activity> weakReference = activityWeakReference;
        if (weakReference != null) {
            weakReference.clear();
        }
        activityWeakReference = null;
        m5092gc();
    }

    public static void dismiss(final View view) {
        if (view == null) {
            return;
        }
        final BaseDialog baseDialog = (BaseDialog) view.getTag();
        log(baseDialog.dialogKey() + ".dismiss");
        removeDialogToRunningList(baseDialog);
        WeakReference<View> weakReference = baseDialog.dialogView;
        if (weakReference != null) {
            weakReference.clear();
        }
        baseDialog.onDialogDismiss();
        int i = C25579.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE[baseDialog.dialogImplMode.ordinal()];
        if (i == 1) {
            WindowUtil.dismiss(view);
        } else if (i == 2) {
            WeakReference<DialogFragmentImpl> weakReference2 = baseDialog.ownDialogFragmentImpl;
            if (weakReference2 != null && weakReference2.get() != null) {
                baseDialog.ownDialogFragmentImpl.get().dismiss();
            }
        } else if (i != 3) {
            runOnMain(new Runnable() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.6
                @Override // java.lang.Runnable
                public void run() {
                    if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    } else if (baseDialog.getRootFrameLayout() == null) {
                        return;
                    } else {
                        baseDialog.getRootFrameLayout().removeView(view);
                    }
                    BaseDialog.requestDialogFocus();
                }
            }, true);
        } else {
            WeakReference<DialogXFloatingWindowActivity> weakReference3 = baseDialog.floatingWindowActivity;
            if (weakReference3 != null && weakReference3.get() != null) {
                FrameLayout decorView = getDecorView(baseDialog.floatingWindowActivity.get());
                if (decorView != null) {
                    decorView.removeView(view);
                }
                baseDialog.floatingWindowActivity.get().finish(baseDialog.dialogKey());
                requestDialogFocus();
            }
        }
        if (baseDialog.getDialogListBuilder() != null) {
            if (baseDialog.getDialogListBuilder().isEmpty()) {
                baseDialog.cleanDialogList();
            } else {
                baseDialog.getDialogListBuilder().showNext();
            }
        }
    }

    public static void error(Object obj) {
        if (DialogX.DEBUGMODE) {
            Log.e(">>>", obj.toString());
        }
    }

    /* JADX INFO: renamed from: gc */
    public static void m5092gc() {
        if (DialogX.autoGC) {
            System.gc();
        }
    }

    public static ActivityRunnable getActivityRunnable(String str) {
        if (str == null) {
            return null;
        }
        return waitRunDialogX.get(str);
    }

    public static Context getApplicationContext() {
        return ActivityLifecycleImpl.getApplicationContext();
    }

    @Deprecated
    public static Context getContext() {
        return getPrivateContext();
    }

    public static FrameLayout getDecorView(Activity activity) {
        if (activity == null || activity.getWindow() == null || !(activity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) activity.getWindow().getDecorView();
    }

    private static Handler getMainHandler() {
        WeakReference<Handler> weakReference = mMainHandler;
        if (weakReference != null && weakReference.get() != null) {
            return mMainHandler.get();
        }
        WeakReference<Handler> weakReference2 = new WeakReference<>(new Handler(Looper.getMainLooper()));
        mMainHandler = weakReference2;
        return weakReference2.get();
    }

    private static Context getPrivateContext() {
        Activity topActivity = getTopActivity();
        if (topActivity != null) {
            return topActivity;
        }
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        error("DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<BaseDialog> getRunningDialogList() {
        return runningDialogList == null ? new ArrayList() : new CopyOnWriteArrayList(runningDialogList);
    }

    private static FragmentManager getSupportFragmentManager(Activity activity) {
        if (activity instanceof AppCompatActivity) {
            return ((AppCompatActivity) activity).getSupportFragmentManager();
        }
        return null;
    }

    public static Activity getTopActivity() {
        WeakReference<Activity> weakReference = activityWeakReference;
        if (weakReference != null && weakReference.get() != null) {
            return activityWeakReference.get();
        }
        init(null);
        WeakReference<Activity> weakReference2 = activityWeakReference;
        if (weakReference2 != null && weakReference2.get() != null) {
            return activityWeakReference.get();
        }
        Activity topActivity = ActivityLifecycleImpl.getTopActivity();
        init(topActivity);
        return topActivity;
    }

    public static Thread getUiThread() {
        if (uiThread == null) {
            uiThread = Looper.getMainLooper().getThread();
        }
        return uiThread;
    }

    public static void init(Context context) {
        if (context == null) {
            context = ActivityLifecycleImpl.getTopActivity();
        }
        if (context instanceof Activity) {
            initActivityContext((Activity) context);
        }
        ActivityLifecycleImpl.init(context, new ActivityLifecycleImpl.onActivityResumeCallBack() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.1
            @Override // com.kongzue.dialogx.impl.ActivityLifecycleImpl.onActivityResumeCallBack
            public void getActivity(Activity activity) {
                BaseDialog.initActivityContext(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initActivityContext(Activity activity) {
        if (ActivityLifecycleImpl.isExemptActivities(activity)) {
            return;
        }
        try {
            uiThread = Looper.getMainLooper().getThread();
            activityWeakReference = new WeakReference<>(activity);
        } catch (Exception e) {
            e.printStackTrace();
            error("DialogX.init: 初始化异常，找不到Activity的根布局");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isActivityDestroyed(Activity activity) {
        return activity == 0 || activity.isFinishing() || activity.isDestroyed() || ((activity instanceof LifecycleOwner) && ((LifecycleOwner) activity).getLifecycle().getState() == Lifecycle.State.DESTROYED);
    }

    private boolean isActivityImplMode() {
        return getDialogImplMode() == DialogX.IMPL_MODE.VIEW || getDialogImplMode() == DialogX.IMPL_MODE.FLOATING_ACTIVITY || getDialogImplMode() == DialogX.IMPL_MODE.DIALOG_FRAGMENT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isNull(String str) {
        return str == null || str.trim().isEmpty() || "null".equals(str) || "(null)".equals(str);
    }

    public static void log(Object obj) {
        if (DialogX.DEBUGMODE) {
            Log.i(">>>", obj.toString());
        }
    }

    public static void onActivityResume(Activity activity) {
        if (runningDialogList != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(runningDialogList);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                BaseDialog baseDialog = (BaseDialog) copyOnWriteArrayList.get(size);
                if (baseDialog.getOwnActivity() == activity && baseDialog.isShow && baseDialog.getDialogView() != null) {
                    View viewFindViewById = baseDialog.getDialogView().findViewById(C2413R.id.box_root);
                    if (viewFindViewById instanceof DialogXBaseRelativeLayout) {
                        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) viewFindViewById;
                        if (dialogXBaseRelativeLayout.isBaseFocusable()) {
                            dialogXBaseRelativeLayout.requestFocusOnResume();
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public static WindowInsets publicWindowInsets() {
        return windowInsets;
    }

    public static void recycleDialog(Activity activity) {
        WeakReference<View> weakReference;
        WeakReference<DialogFragmentImpl> weakReference2;
        int i = C25579.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE[DialogX.implIMPLMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && runningDialogList != null) {
                    for (BaseDialog baseDialog : new CopyOnWriteArrayList(runningDialogList)) {
                        if (baseDialog.getOwnActivity() == activity) {
                            baseDialog.cleanActivityContext();
                            runningDialogList.remove(baseDialog);
                            if (baseDialog instanceof WaitDialog) {
                                ((WaitDialog) baseDialog).cleanInstance();
                            }
                        }
                    }
                }
            } else if (runningDialogList != null) {
                for (BaseDialog baseDialog2 : new CopyOnWriteArrayList(runningDialogList)) {
                    if (baseDialog2.getOwnActivity() == activity && (weakReference2 = baseDialog2.ownDialogFragmentImpl) != null && weakReference2.get() != null) {
                        baseDialog2.ownDialogFragmentImpl.get().dismiss();
                        if (baseDialog2 instanceof WaitDialog) {
                            ((WaitDialog) baseDialog2).cleanInstance();
                        }
                        runningDialogList.remove(baseDialog2);
                    }
                }
            }
        } else if (runningDialogList != null) {
            for (BaseDialog baseDialog3 : new CopyOnWriteArrayList(runningDialogList)) {
                if (baseDialog3.getOwnActivity() == activity && (weakReference = baseDialog3.dialogView) != null) {
                    WindowUtil.dismiss(weakReference.get());
                    if (baseDialog3 instanceof WaitDialog) {
                        ((WaitDialog) baseDialog3).cleanInstance();
                    }
                    runningDialogList.remove(baseDialog3);
                }
            }
        }
        if (activity == getTopActivity()) {
            cleanContext();
        }
    }

    private static void removeDialogToRunningList(BaseDialog baseDialog) {
        List<BaseDialog> list = runningDialogList;
        if (list != null) {
            list.remove(baseDialog);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requestDialogFocus() {
        if (runningDialogList != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(runningDialogList);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                BaseDialog baseDialog = (BaseDialog) copyOnWriteArrayList.get(size);
                if (baseDialog.getOwnActivity() == getTopActivity() && baseDialog.isShow && baseDialog.getDialogView() != null) {
                    View viewFindViewById = baseDialog.getDialogView().findViewById(C2413R.id.box_root);
                    if ((viewFindViewById instanceof DialogXBaseRelativeLayout) && ((DialogXBaseRelativeLayout) viewFindViewById).isBaseFocusable()) {
                        viewFindViewById.requestFocus();
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void runOnMain(Runnable runnable) {
        if (!DialogX.autoRunOnUIThread || (getUiThread() != null && Thread.currentThread() == getUiThread())) {
            runnable.run();
        } else {
            runOnMain(runnable, true);
        }
    }

    public static void runOnMainDelay(Runnable runnable, long j) {
        if (j < 0) {
            return;
        }
        if (!DialogX.autoRunOnUIThread) {
            runnable.run();
        }
        getMainHandler().postDelayed(runnable, j);
    }

    private void setOwnActivity(Activity activity) {
        this.ownActivity = new WeakReference<>(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void show(final View view) {
        final BaseDialog baseDialog;
        if (view == null || (baseDialog = (BaseDialog) view.getTag()) == null) {
            return;
        }
        if (baseDialog.isShow) {
            if (baseDialog.getDialogView() != null) {
                baseDialog.getDialogView().setVisibility(0);
                return;
            }
            error(((BaseDialog) view.getTag()).dialogKey() + "已处于显示状态，请勿重复执行 show() 指令。");
            return;
        }
        if (baseDialog.preShow(baseDialog)) {
            return;
        }
        baseDialog.dialogView = new WeakReference<>(view);
        StringBuilder sb = new StringBuilder();
        sb.append(baseDialog.dialogKey());
        sb.append(".show on ");
        sb.append(baseDialog.isActivityImplMode() ? baseDialog.getOwnActivity() : "window");
        log(sb.toString());
        addDialogToRunningList(baseDialog);
        int i = C25579.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE[baseDialog.dialogImplMode.ordinal()];
        if (i == 1) {
            WindowUtil.show(baseDialog.getOwnActivity(), view, !(baseDialog instanceof NoTouchInterface));
            return;
        }
        if (i == 2) {
            DialogFragmentImpl dialogFragmentImpl = new DialogFragmentImpl(baseDialog, view);
            dialogFragmentImpl.show(getSupportFragmentManager(baseDialog.getOwnActivity()), "DialogX");
            baseDialog.ownDialogFragmentImpl = new WeakReference<>(dialogFragmentImpl);
            return;
        }
        if (i != 3) {
            if (baseDialog.getRootFrameLayout() == null) {
                return;
            }
            runOnMain(new Runnable() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.3
                @Override // java.lang.Runnable
                public void run() {
                    if (view.getParent() != baseDialog.getRootFrameLayout()) {
                        if (view.getParent() != null) {
                            ((ViewGroup) view.getParent()).removeView(view);
                        }
                        baseDialog.getRootFrameLayout().addView(view);
                    } else {
                        BaseDialog.error(((BaseDialog) view.getTag()).dialogKey() + "已处于显示状态，请勿重复执行 show() 指令。");
                    }
                }
            });
            return;
        }
        if (waitRunDialogX == null) {
            waitRunDialogX = new HashMap();
        }
        waitRunDialogX.put(baseDialog.dialogKey(), new ActivityRunnable() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.2
            @Override // com.kongzue.dialogx.util.ActivityRunnable
            public void run(Activity activity) {
                BaseDialog.this.floatingWindowActivity = new WeakReference<>((DialogXFloatingWindowActivity) activity);
                BaseDialog.this.floatingWindowActivity.get().setFromActivity(BaseDialog.this.getOwnActivity());
                final FrameLayout decorView = BaseDialog.getDecorView(activity);
                if (decorView == null) {
                    return;
                }
                BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (view.getParent() != BaseDialog.this.getRootFrameLayout()) {
                            if (view.getParent() != null) {
                                ((ViewGroup) view.getParent()).removeView(view);
                            }
                            decorView.addView(view);
                        } else {
                            BaseDialog.error(((BaseDialog) view.getTag()).dialogKey() + "已处于显示状态，请勿重复执行 show() 指令。");
                        }
                    }
                });
            }
        });
        DialogXFloatingWindowActivity dialogXFloatingWindowActivity = DialogXFloatingWindowActivity.getDialogXFloatingWindowActivity();
        if (dialogXFloatingWindowActivity != null && dialogXFloatingWindowActivity.isSameFrom(baseDialog.getOwnActivity().hashCode())) {
            dialogXFloatingWindowActivity.showDialogX(baseDialog.dialogKey());
            return;
        }
        Intent intent = new Intent(getPrivateContext(), (Class<?>) DialogXFloatingWindowActivity.class);
        if (baseDialog.getOwnActivity() == null) {
            intent.addFlags(268435456);
        }
        intent.putExtra("dialogXKey", baseDialog.dialogKey());
        intent.putExtra("fromActivityUiStatus", (baseDialog.getOwnActivity() == null || getDecorView(baseDialog.getOwnActivity()) == null) ? 0 : getDecorView(baseDialog.getOwnActivity()).getSystemUiVisibility());
        intent.putExtra("from", getPrivateContext().hashCode());
        getPrivateContext().startActivity(intent);
        if (baseDialog.getOwnActivity() != null) {
            baseDialog.getOwnActivity().overridePendingTransition(0, 0);
        }
    }

    public static void useTextInfo(TextView textView, TextInfo textInfo) {
        if (textInfo == null || textView == null) {
            return;
        }
        if (textInfo.getFontSize() > 0) {
            textView.setTextSize(textInfo.getFontSizeComplexUnit(), textInfo.getFontSize());
        }
        if (textInfo.getFontColor() != 1) {
            textView.setTextColor(textInfo.getFontColor());
        }
        if (textInfo.getGravity() != -1) {
            textView.setGravity(textInfo.getGravity());
        }
        if (textInfo.isShowEllipsis()) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView.setEllipsize(null);
        }
        if (textInfo.getMaxLines() != -1) {
            textView.setMaxLines(textInfo.getMaxLines());
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        if (textInfo.getTypeface() != null) {
            textView.setTypeface(textInfo.getTypeface());
        }
        textView.getPaint().setFakeBoldText(textInfo.isBold());
    }

    public void beforeShow() {
        View currentFocus;
        this.preShow = true;
        this.dismissAnimFlag = false;
        setOwnActivity(getTopActivity());
        if (getOwnActivity() == null && isActivityImplMode()) {
            init(null);
            if (getOwnActivity() == null) {
                error("DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return;
            }
        }
        if (this.dialogImplMode != DialogX.IMPL_MODE.VIEW && (getOwnActivity() instanceof LifecycleOwner)) {
            ((LifecycleOwner) getOwnActivity()).getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.7
                @Override // android.view.LifecycleEventObserver
                public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        BaseDialog.recycleDialog(BaseDialog.this.getOwnActivity());
                    }
                }
            });
        }
        if ((this instanceof NoTouchInterface) || (currentFocus = getOwnActivity().getCurrentFocus()) == null) {
            return;
        }
        ((InputMethodManager) getOwnActivity().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
    }

    public void bindDismissWithLifecycleOwnerPrivate(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner == null) {
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.8
            @Override // android.view.LifecycleEventObserver
            public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner2, @InterfaceC6391 Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    BaseDialog.this.callDialogDismiss();
                    lifecycleOwner2.getLifecycle().removeObserver(this);
                }
            }
        });
    }

    public void bindFloatingActivity(DialogXFloatingWindowActivity dialogXFloatingWindowActivity) {
        this.floatingWindowActivity = new WeakReference<>(dialogXFloatingWindowActivity);
    }

    public abstract void callDialogDismiss();

    public void cleanActivityContext() {
        WeakReference<Activity> weakReference = this.ownActivity;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.dialogView = null;
        this.ownActivity = null;
    }

    public void cleanDialogList() {
        DialogListBuilder dialogListBuilder = this.dialogListBuilder;
        if (dialogListBuilder != null) {
            dialogListBuilder.clear();
        }
        this.dialogListBuilder = null;
    }

    public View createView(int i) {
        if (!isActivityImplMode()) {
            return ModuleUtil.getLayoutInflater(getApplicationContext()).inflate(i, (ViewGroup) null);
        }
        if (getOwnActivity() != null) {
            return ModuleUtil.getLayoutInflater(getOwnActivity()).inflate(i, (ViewGroup) null);
        }
        error("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    public abstract String dialogKey();

    public int dip2px(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getDialogView() != null) {
            return getDialogView().dispatchTouchEvent(motionEvent);
        }
        WeakReference<Activity> weakReference = this.ownActivity;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        return this.ownActivity.get().dispatchTouchEvent(motionEvent);
    }

    public List<View> findAllBlurView(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof BlurViewType) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                List<View> listFindAllBlurView = findAllBlurView(viewGroup.getChildAt(i));
                if (listFindAllBlurView != null) {
                    arrayList.addAll(listFindAllBlurView);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public int getColor(int i) {
        if (getApplicationContext() != null) {
            return getResources().getColor(i);
        }
        error("DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return C8273.f24692;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Integer getColorNullable(Integer num) {
        if (num == null) {
            return null;
        }
        return Integer.valueOf(getColor(num.intValue()));
    }

    public int getCustomDialogLayoutResId(boolean z) {
        return this.customDialogLayoutResId[!z ? 1 : 0];
    }

    public <T> T getData(String str) {
        Map<String, Object> map = this.data;
        if (map == null) {
            return null;
        }
        return (T) map.get(str);
    }

    public DialogX.IMPL_MODE getDialogImplMode() {
        return this.dialogImplMode;
    }

    @InterfaceC6490
    public DialogListBuilder getDialogListBuilder() {
        return this.dialogListBuilder;
    }

    public View getDialogView() {
        WeakReference<View> weakReference = this.dialogView;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Float getFloatStyleAttr(Float f) {
        if (f.floatValue() <= 0.0f) {
            return null;
        }
        return f;
    }

    public int getHighestOrderIndex() {
        if (getOwnActivity() != null && getDecorView(getOwnActivity()) != null) {
            return getDecorView(getOwnActivity()).getChildCount();
        }
        List<BaseDialog> list = runningDialogList;
        if (list == null) {
            return 1;
        }
        return list.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Integer getIntStyleAttr(Integer num) {
        if (num.intValue() <= 0) {
            return null;
        }
        return num;
    }

    @Override // android.view.LifecycleOwner
    @InterfaceC6391
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public int getMaxHeight() {
        int i = this.maxHeight;
        return i == 0 ? DialogX.dialogMaxHeight : i;
    }

    public int getMaxWidth() {
        int i = this.maxWidth;
        return i == 0 ? DialogX.dialogMaxWidth : i;
    }

    public int getMinHeight() {
        int i = this.minHeight;
        return i == 0 ? DialogX.dialogMinHeight : i;
    }

    public int getMinWidth() {
        int i = this.minWidth;
        return i == 0 ? DialogX.dialogMinWidth : i;
    }

    public Activity getOwnActivity() {
        WeakReference<Activity> weakReference = this.ownActivity;
        if (weakReference == null || weakReference.get() == null) {
            setOwnActivity(getTopActivity());
        }
        return this.ownActivity.get();
    }

    public Resources getResources() {
        return getOwnActivity() != null ? ModuleUtil.getContext(getOwnActivity()).getResources() : getApplicationContext() == null ? Resources.getSystem() : ModuleUtil.getContext(getApplicationContext()).getResources();
    }

    @InterfaceC6490
    public FrameLayout getRootFrameLayout() {
        FrameLayout decorView;
        Activity ownActivity = getOwnActivity();
        if (isActivityImplMode()) {
            if (ownActivity == null) {
                ownActivity = getTopActivity();
                if (ownActivity == null) {
                    error("DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    return null;
                }
                setOwnActivity(ownActivity);
            }
            decorView = getDecorView(ownActivity);
        } else {
            decorView = (FrameLayout) getDialogView().getParent();
        }
        if (decorView != null) {
            WeakReference<FrameLayout> weakReference = new WeakReference<>(decorView);
            this.rootFrameLayout = weakReference;
            return weakReference.get();
        }
        error("DialogX 错误：在 getRootFrameLayout() 时无法获 activity(" + ownActivity + ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    public String getString(int i) {
        if (getApplicationContext() != null) {
            return i == 0 ? "" : getResources().getString(i);
        }
        error("DialogX 未初始化(E6)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    public DialogXStyle getStyle() {
        return this.style;
    }

    public DialogX.THEME getTheme() {
        return this.theme;
    }

    public int getThisOrderIndex() {
        return this.thisOrderIndex;
    }

    public void haptic(View view) {
        if (view != null) {
            if (DialogX.useHaptic && this.isHapticFeedbackEnabled == -1) {
                view.performHapticFeedback(3);
            } else if (this.isHapticFeedbackEnabled == 1) {
                view.performHapticFeedback(3);
            }
        }
    }

    public void imeShow(EditText editText, boolean z) {
        if (getOwnActivity() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getOwnActivity().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(editText, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public abstract boolean isCancelable();

    public boolean isEnableImmersiveMode() {
        return this.enableImmersiveMode;
    }

    public boolean isHide() {
        return this.isHide;
    }

    public boolean isLightTheme() {
        DialogX.THEME theme = this.theme;
        return theme == DialogX.THEME.AUTO ? getApplicationContext() == null ? this.theme == DialogX.THEME.LIGHT : (getResources().getConfiguration().uiMode & 48) == 16 : theme == DialogX.THEME.LIGHT;
    }

    public boolean isPreShow() {
        return this.preShow;
    }

    public boolean isShow() {
        return this.isShow;
    }

    public void onDialogDismiss() {
        DialogXRunnable dialogXRunnable = this.onDismissRunnable;
        if (dialogXRunnable != null) {
            dialogXRunnable.run(this);
        }
    }

    public void onDialogInit() {
    }

    public void onDialogRefreshUI() {
    }

    public void onDialogShow() {
        DialogXRunnable dialogXRunnable = this.onShowRunnable;
        if (dialogXRunnable != null) {
            dialogXRunnable.run(this);
        }
    }

    public boolean preDismiss(BaseDialog baseDialog) {
        return false;
    }

    public boolean preShow(BaseDialog baseDialog) {
        return false;
    }

    public void refreshUI() {
    }

    public abstract void restartDialog();

    public boolean runAction(int i) {
        DialogXRunnable dialogXRunnable = this.dialogActionRunnableMap.get(Integer.valueOf(i));
        if (dialogXRunnable == null) {
            return false;
        }
        dialogXRunnable.run(this);
        return true;
    }

    public BaseDialog setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    public void setDialogListBuilder(@InterfaceC6391 DialogListBuilder dialogListBuilder) {
        this.dialogListBuilder = dialogListBuilder;
    }

    public void setDialogView(View view) {
        this.dialogView = new WeakReference<>(view);
    }

    public BaseDialog setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    public void setLifecycleState(Lifecycle.State state) {
        LifecycleRegistry lifecycleRegistry = this.lifecycle;
        if (lifecycleRegistry == null || state == null) {
            return;
        }
        try {
            lifecycleRegistry.setCurrentState(state);
        } catch (Exception unused) {
        }
    }

    public BaseDialog setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        return this;
    }

    public abstract <D extends BaseDialog> D show();

    public void showText(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (isNull(charSequence)) {
            textView.setVisibility(8);
            textView.setText("");
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    public abstract void shutdown();

    public void tintColor(View view, int i) {
        if (view == null) {
            return;
        }
        view.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static boolean isNull(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        return charSequence == null || strValueOf.trim().isEmpty() || "null".equals(strValueOf) || "(null)".equals(strValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Integer getColorNullable(Integer num, Integer num2) {
        return Integer.valueOf(getColor(num == null ? num2.intValue() : num.intValue()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Float getFloatStyleAttr(Float f, Float f2) {
        return f.floatValue() <= 0.0f ? f2 : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Integer getIntStyleAttr(Integer num, Integer num2) {
        return num.intValue() <= 0 ? num2 : num;
    }

    public static List<BaseDialog> getRunningDialogList(Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (BaseDialog baseDialog : runningDialogList) {
            if (baseDialog != null && baseDialog.isShow && baseDialog.getOwnActivity() == activity) {
                arrayList.add(baseDialog);
            }
        }
        return arrayList;
    }

    public static void runOnMain(Runnable runnable, boolean z) {
        getMainHandler().post(runnable);
    }

    public static void show(Activity activity, final View view) {
        if (activity == null || view == null) {
            return;
        }
        WeakReference<Activity> weakReference = activityWeakReference;
        if (weakReference == null || weakReference.get() == null || ActivityLifecycleImpl.getApplicationContext() == null) {
            init(activity.getApplicationContext());
        }
        final BaseDialog baseDialog = (BaseDialog) view.getTag();
        if (baseDialog != null) {
            baseDialog.setOwnActivity(activity);
            if (baseDialog.getDialogView() != null) {
                baseDialog.getDialogView().setVisibility(0);
            }
            if (baseDialog.isShow) {
                error(((BaseDialog) view.getTag()).dialogKey() + "已处于显示状态，请勿重复执行 show() 指令。");
                return;
            }
            if (activity.isDestroyed()) {
                error(((BaseDialog) view.getTag()).dialogKey() + ".show ERROR: activity is Destroyed.");
                return;
            }
            if (baseDialog.preShow(baseDialog)) {
                return;
            }
            baseDialog.dialogView = new WeakReference<>(view);
            log(baseDialog + ".show on " + activity);
            addDialogToRunningList(baseDialog);
            int i = C25579.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE[baseDialog.dialogImplMode.ordinal()];
            if (i == 1) {
                WindowUtil.show(activity, view, !(baseDialog instanceof NoTouchInterface));
                return;
            }
            if (i == 2) {
                DialogFragmentImpl dialogFragmentImpl = new DialogFragmentImpl(baseDialog, view);
                dialogFragmentImpl.show(getSupportFragmentManager(activity), "DialogX");
                baseDialog.ownDialogFragmentImpl = new WeakReference<>(dialogFragmentImpl);
                return;
            }
            if (i != 3) {
                final FrameLayout decorView = getDecorView(activity);
                if (decorView == null) {
                    return;
                }
                runOnMain(new Runnable() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (view.getParent() != baseDialog.getRootFrameLayout()) {
                            if (view.getParent() != null) {
                                ((ViewGroup) view.getParent()).removeView(view);
                            }
                            decorView.addView(view);
                        } else {
                            BaseDialog.error(((BaseDialog) view.getTag()).dialogKey() + "已处于显示状态，请勿重复执行 show() 指令。");
                        }
                    }
                });
                return;
            }
            if (waitRunDialogX == null) {
                waitRunDialogX = new HashMap();
            }
            waitRunDialogX.put(baseDialog.dialogKey(), new ActivityRunnable() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.4
                @Override // com.kongzue.dialogx.util.ActivityRunnable
                public void run(Activity activity2) {
                    BaseDialog.this.floatingWindowActivity = new WeakReference<>((DialogXFloatingWindowActivity) activity2);
                    BaseDialog.this.floatingWindowActivity.get().setFromActivity(BaseDialog.this.getOwnActivity());
                    final FrameLayout decorView2 = BaseDialog.getDecorView(activity2);
                    if (decorView2 == null) {
                        return;
                    }
                    BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (view.getParent() != BaseDialog.this.getRootFrameLayout()) {
                                if (view.getParent() != null) {
                                    ((ViewGroup) view.getParent()).removeView(view);
                                }
                                decorView2.addView(view);
                            } else {
                                BaseDialog.error(((BaseDialog) view.getTag()).dialogKey() + "已处于显示状态，请勿重复执行 show() 指令。");
                            }
                        }
                    });
                }
            });
            DialogXFloatingWindowActivity dialogXFloatingWindowActivity = DialogXFloatingWindowActivity.getDialogXFloatingWindowActivity();
            if (dialogXFloatingWindowActivity != null && dialogXFloatingWindowActivity.isSameFrom(activity.hashCode())) {
                dialogXFloatingWindowActivity.showDialogX(baseDialog.dialogKey());
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) DialogXFloatingWindowActivity.class);
            intent.putExtra("dialogXKey", baseDialog.dialogKey());
            intent.putExtra("from", activity.hashCode());
            intent.putExtra("fromActivityUiStatus", getDecorView(activity) == null ? 0 : getDecorView(activity).getSystemUiVisibility());
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }
}
