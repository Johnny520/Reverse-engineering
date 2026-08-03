package androidx.fragment.app;

import Yue.AbstractC5076;
import Yue.C8365;
import Yue.DialogC4065;
import Yue.InterfaceC3647;
import Yue.InterfaceC5683;
import Yue.InterfaceC5922;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.C9041ViewTreeViewModelStoreOwner;
import android.view.LayoutInflater;
import android.view.LifecycleOwner;
import android.view.Observer;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC8871 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;

    @InterfaceC6490
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private Observer<LifecycleOwner> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ */
    public class RunnableC1693 implements Runnable {
        public RunnableC1693() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogInterfaceOnCancelListenerC8871.this.mOnDismissListener.onDismiss(DialogInterfaceOnCancelListenerC8871.this.mDialog);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ۟ */
    public class DialogInterfaceOnCancelListenerC1694 implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC1694() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@InterfaceC6490 DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC8871.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC8871 dialogInterfaceOnCancelListenerC8871 = DialogInterfaceOnCancelListenerC8871.this;
                dialogInterfaceOnCancelListenerC8871.onCancel(dialogInterfaceOnCancelListenerC8871.mDialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public class DialogInterfaceOnDismissListenerC8872 implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC8872() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@InterfaceC6490 DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC8871.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC8871 dialogInterfaceOnCancelListenerC8871 = DialogInterfaceOnCancelListenerC8871.this;
                dialogInterfaceOnCancelListenerC8871.onDismiss(dialogInterfaceOnCancelListenerC8871.mDialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public class C8873 implements Observer<LifecycleOwner> {
        public C8873() {
        }

        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // android.view.Observer
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public void onChanged(LifecycleOwner lifecycleOwner) {
            if (lifecycleOwner == null || !DialogInterfaceOnCancelListenerC8871.this.mShowsDialog) {
                return;
            }
            View viewRequireView = DialogInterfaceOnCancelListenerC8871.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC8871.this.mDialog != null) {
                if (FragmentManager.m29739(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC8871.this.mDialog);
                }
                DialogInterfaceOnCancelListenerC8871.this.mDialog.setContentView(viewRequireView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8874 extends AbstractC5076 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AbstractC5076 f29705;

        public C8874(AbstractC5076 abstractC5076) {
            this.f29705 = abstractC5076;
        }

        @Override // Yue.AbstractC5076
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ */
        public View mo15627(int i) {
            return this.f29705.mo15628() ? this.f29705.mo15627(i) : DialogInterfaceOnCancelListenerC8871.this.onFindViewById(i);
        }

        @Override // Yue.AbstractC5076
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo15628() {
            return this.f29705.mo15628() || DialogInterfaceOnCancelListenerC8871.this.onHasView();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogInterfaceOnCancelListenerC8871() {
        this.mDismissRunnable = new RunnableC1693();
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC1694();
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC8872();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C8873();
        this.mDialogCreated = false;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC6391
    public AbstractC5076 createFragmentContainer() {
        return new C8874(super.createFragmentContainer());
    }

    public void dismiss() {
        m29959(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        m29959(true, false, false);
    }

    @InterfaceC5922
    public void dismissNow() {
        m29959(false, false, true);
    }

    @InterfaceC6490
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @InterfaceC7651
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5922
    @Deprecated
    public void onActivityCreated(@InterfaceC6490 Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5922
    public void onAttach(@InterfaceC6391 Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@InterfaceC6391 DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5922
    public void onCreate(@InterfaceC6490 Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @InterfaceC6391
    @InterfaceC5922
    public Dialog onCreateDialog(@InterfaceC6490 Bundle bundle) {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC4065(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5922
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5922
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @InterfaceC3647
    public void onDismiss(@InterfaceC6391 DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m29959(true, true, false);
    }

    @InterfaceC6490
    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC6391
    public LayoutInflater onGetLayoutInflater(@InterfaceC6490 Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            m29960(bundle);
            if (FragmentManager.m29739(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (FragmentManager.m29739(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.mShowsDialog) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5922
    public void onSaveInstanceState(@InterfaceC6391 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5922
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            android.view.View.set(decorView, this);
            C9041ViewTreeViewModelStoreOwner.set(decorView, this);
            C8365.m4339(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5922
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC5922
    public void onViewStateRestored(@InterfaceC6490 Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, @InterfaceC6490 Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @InterfaceC6391
    public final DialogC4065 requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof DialogC4065) {
            return (DialogC4065) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    @InterfaceC6391
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, @InterfaceC7651 int i2) {
        if (FragmentManager.m29739(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2);
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@InterfaceC6391 Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void show(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6490 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC8885 abstractC8885M29749 = fragmentManager.m29749();
        abstractC8885M29749.m30066(true);
        abstractC8885M29749.m30045(this, str);
        abstractC8885M29749.mo29904();
    }

    public void showNow(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6490 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC8885 abstractC8885M29749 = fragmentManager.m29749();
        abstractC8885M29749.m30066(true);
        abstractC8885M29749.m30045(this, str);
        abstractC8885M29749.mo29906();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m29959(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z3) {
                getParentFragmentManager().m29849(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().m29846(this.mBackStackId, 1, z);
            }
            this.mBackStackId = -1;
            return;
        }
        AbstractC8885 abstractC8885M29749 = getParentFragmentManager().m29749();
        abstractC8885M29749.m30066(true);
        abstractC8885M29749.mo29912(this);
        if (z3) {
            abstractC8885M29749.mo29906();
        } else if (z) {
            abstractC8885M29749.mo29905();
        } else {
            abstractC8885M29749.mo29904();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m29960(@InterfaceC6490 Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    public int show(@InterfaceC6391 AbstractC8885 abstractC8885, @InterfaceC6490 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC8885.m30045(this, str);
        this.mViewDestroyed = false;
        int iMo29904 = abstractC8885.mo29904();
        this.mBackStackId = iMo29904;
        return iMo29904;
    }

    public DialogInterfaceOnCancelListenerC8871(@InterfaceC5683 int i) {
        super(i);
        this.mDismissRunnable = new RunnableC1693();
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC1694();
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC8872();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C8873();
        this.mDialogCreated = false;
    }
}
