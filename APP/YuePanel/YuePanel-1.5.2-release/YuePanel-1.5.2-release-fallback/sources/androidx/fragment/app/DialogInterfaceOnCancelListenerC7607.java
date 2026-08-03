package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC7607 extends androidx.fragment.app.Fragment implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    private static final java.lang.String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final java.lang.String SAVED_CANCELABLE = "android:cancelable";
    private static final java.lang.String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final java.lang.String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final java.lang.String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final java.lang.String SAVED_STYLE = "android:style";
    private static final java.lang.String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;

    @Yue.InterfaceC4544
    private android.app.Dialog mDialog;
    private boolean mDialogCreated;
    private java.lang.Runnable mDismissRunnable;
    private boolean mDismissed;
    private android.os.Handler mHandler;
    private androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> mObserver;
    private android.content.DialogInterface.OnCancelListener mOnCancelListener;
    private android.content.DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ, reason: contains not printable characters */
    public class RunnableC7608 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 f29289;

        public RunnableC7608(androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 r1) {
                r0 = this;
                r0.f29289 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        public void run() {
                r2 = this;
                androidx.fragment.app.ۥ۟۟۟۟ r0 = r2.f29289
                android.content.DialogInterface$OnDismissListener r0 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$100(r0)
                androidx.fragment.app.ۥ۟۟۟۟ r1 = r2.f29289
                android.app.Dialog r1 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$000(r1)
                r0.onDismiss(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ۟, reason: contains not printable characters */
    public class DialogInterfaceOnCancelListenerC7609 implements android.content.DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 f29290;

        public DialogInterfaceOnCancelListenerC7609(androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 r1) {
                r0 = this;
                r0.f29290 = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        public void onCancel(@Yue.InterfaceC4544 android.content.DialogInterface r2) {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۟۟ r2 = r1.f29290
                android.app.Dialog r2 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$000(r2)
                if (r2 == 0) goto L11
                androidx.fragment.app.ۥ۟۟۟۟ r2 = r1.f29290
                android.app.Dialog r0 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$000(r2)
                r2.onCancel(r0)
            L11:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public class DialogInterfaceOnDismissListenerC7610 implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 f29291;

        public DialogInterfaceOnDismissListenerC7610(androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 r1) {
                r0 = this;
                r0.f29291 = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@Yue.InterfaceC4544 android.content.DialogInterface r2) {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۟۟ r2 = r1.f29291
                android.app.Dialog r2 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$000(r2)
                if (r2 == 0) goto L11
                androidx.fragment.app.ۥ۟۟۟۟ r2 = r1.f29291
                android.app.Dialog r0 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$000(r2)
                r2.onDismiss(r0)
            L11:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public class C7611 implements androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 f29292;

        public C7611(androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 r1) {
                r0 = this;
                r0.f29292 = r1
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.Observer
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        public /* bridge */ /* synthetic */ void onChanged(androidx.lifecycle.LifecycleOwner r1) {
                r0 = this;
                androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
                r0.m29336(r1)
                return
        }

        @android.annotation.SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29336(androidx.lifecycle.LifecycleOwner r3) {
                r2 = this;
                if (r3 == 0) goto L5b
                androidx.fragment.app.ۥ۟۟۟۟ r3 = r2.f29292
                boolean r3 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$200(r3)
                if (r3 == 0) goto L5b
                androidx.fragment.app.ۥ۟۟۟۟ r3 = r2.f29292
                android.view.View r3 = r3.requireView()
                android.view.ViewParent r0 = r3.getParent()
                if (r0 != 0) goto L53
                androidx.fragment.app.ۥ۟۟۟۟ r0 = r2.f29292
                android.app.Dialog r0 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$000(r0)
                if (r0 == 0) goto L5b
                r0 = 3
                boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
                if (r0 == 0) goto L49
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DialogFragment "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " setting the content view on "
                r0.append(r1)
                androidx.fragment.app.ۥ۟۟۟۟ r1 = r2.f29292
                android.app.Dialog r1 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$000(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.d(r1, r0)
            L49:
                androidx.fragment.app.ۥ۟۟۟۟ r0 = r2.f29292
                android.app.Dialog r0 = androidx.fragment.app.DialogInterfaceOnCancelListenerC7607.access$000(r0)
                r0.setContentView(r3)
                goto L5b
            L53:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "DialogFragment can not be attached to a container view"
                r3.<init>(r0)
                throw r3
            L5b:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C7612 extends Yue.AbstractC2762 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC2762 f29293;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 f29294;

        public C7612(androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 r1, Yue.AbstractC2762 r2) {
                r0 = this;
                r0.f29294 = r1
                r0.f29293 = r2
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC2762
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟ */
        public android.view.View mo12069(int r2) {
                r1 = this;
                Yue.ۥ۠ۢۧۧ r0 = r1.f29293
                boolean r0 = r0.mo12070()
                if (r0 == 0) goto Lf
                Yue.ۥ۠ۢۧۧ r0 = r1.f29293
                android.view.View r2 = r0.mo12069(r2)
                return r2
            Lf:
                androidx.fragment.app.ۥ۟۟۟۟ r0 = r1.f29294
                android.view.View r2 = r0.onFindViewById(r2)
                return r2
        }

        @Override // Yue.AbstractC2762
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo12070() {
                r1 = this;
                Yue.ۥ۠ۢۧۧ r0 = r1.f29293
                boolean r0 = r0.mo12070()
                if (r0 != 0) goto L13
                androidx.fragment.app.ۥ۟۟۟۟ r0 = r1.f29294
                boolean r0 = r0.onHasView()
                if (r0 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                return r0
        }
    }

    public DialogInterfaceOnCancelListenerC7607() {
            r2 = this;
            r2.<init>()
            androidx.fragment.app.ۥ۟۟۟۟$ۥ r0 = new androidx.fragment.app.ۥ۟۟۟۟$ۥ
            r0.<init>(r2)
            r2.mDismissRunnable = r0
            androidx.fragment.app.ۥ۟۟۟۟$ۥ۟ r0 = new androidx.fragment.app.ۥ۟۟۟۟$ۥ۟
            r0.<init>(r2)
            r2.mOnCancelListener = r0
            androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟ r0 = new androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟
            r0.<init>(r2)
            r2.mOnDismissListener = r0
            r0 = 0
            r2.mStyle = r0
            r2.mTheme = r0
            r1 = 1
            r2.mCancelable = r1
            r2.mShowsDialog = r1
            r1 = -1
            r2.mBackStackId = r1
            androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟ r1 = new androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟
            r1.<init>(r2)
            r2.mObserver = r1
            r2.mDialogCreated = r0
            return
    }

    public DialogInterfaceOnCancelListenerC7607(@Yue.InterfaceC3573 int r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.fragment.app.ۥ۟۟۟۟$ۥ r2 = new androidx.fragment.app.ۥ۟۟۟۟$ۥ
            r2.<init>(r1)
            r1.mDismissRunnable = r2
            androidx.fragment.app.ۥ۟۟۟۟$ۥ۟ r2 = new androidx.fragment.app.ۥ۟۟۟۟$ۥ۟
            r2.<init>(r1)
            r1.mOnCancelListener = r2
            androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟ r2 = new androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟
            r2.<init>(r1)
            r1.mOnDismissListener = r2
            r2 = 0
            r1.mStyle = r2
            r1.mTheme = r2
            r0 = 1
            r1.mCancelable = r0
            r1.mShowsDialog = r0
            r0 = -1
            r1.mBackStackId = r0
            androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟ r0 = new androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟
            r0.<init>(r1)
            r1.mObserver = r0
            r1.mDialogCreated = r2
            return
    }

    public static /* synthetic */ android.app.Dialog access$000(androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 r0) {
            android.app.Dialog r0 = r0.mDialog
            return r0
    }

    public static /* synthetic */ android.content.DialogInterface.OnDismissListener access$100(androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 r0) {
            android.content.DialogInterface$OnDismissListener r0 = r0.mOnDismissListener
            return r0
    }

    public static /* synthetic */ boolean access$200(androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 r0) {
            boolean r0 = r0.mShowsDialog
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC4410
    public Yue.AbstractC2762 createFragmentContainer() {
            r2 = this;
            Yue.ۥ۠ۢۧۧ r0 = super.createFragmentContainer()
            androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟۟ r1 = new androidx.fragment.app.ۥ۟۟۟۟$ۥ۟۟۟۟
            r1.<init>(r2, r0)
            return r1
    }

    public void dismiss() {
            r1 = this;
            r0 = 0
            r1.m29334(r0, r0, r0)
            return
    }

    public void dismissAllowingStateLoss() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.m29334(r0, r1, r1)
            return
    }

    @Yue.InterfaceC3875
    public void dismissNow() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.m29334(r0, r0, r1)
            return
    }

    @Yue.InterfaceC4544
    public android.app.Dialog getDialog() {
            r1 = this;
            android.app.Dialog r0 = r1.mDialog
            return r0
    }

    public boolean getShowsDialog() {
            r1 = this;
            boolean r0 = r1.mShowsDialog
            return r0
    }

    @Yue.InterfaceC6018
    public int getTheme() {
            r1 = this;
            int r0 = r1.mTheme
            return r0
    }

    public boolean isCancelable() {
            r1 = this;
            boolean r0 = r1.mCancelable
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onActivityCreated(@Yue.InterfaceC4544 android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            return
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC3875
    public void onAttach(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            super.onAttach(r2)
            androidx.lifecycle.LiveData r2 = r1.getViewLifecycleOwnerLiveData()
            androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> r0 = r1.mObserver
            r2.observeForever(r0)
            boolean r2 = r1.mShownByMe
            if (r2 != 0) goto L13
            r2 = 0
            r1.mDismissed = r2
        L13:
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@Yue.InterfaceC4410 android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC3875
    public void onCreate(@Yue.InterfaceC4544 android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r3.mHandler = r0
            int r0 = r3.mContainerId
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            r3.mShowsDialog = r0
            if (r4 == 0) goto L42
            java.lang.String r0 = "android:style"
            int r0 = r4.getInt(r0, r2)
            r3.mStyle = r0
            java.lang.String r0 = "android:theme"
            int r0 = r4.getInt(r0, r2)
            r3.mTheme = r0
            java.lang.String r0 = "android:cancelable"
            boolean r0 = r4.getBoolean(r0, r1)
            r3.mCancelable = r0
            java.lang.String r0 = "android:showsDialog"
            boolean r1 = r3.mShowsDialog
            boolean r0 = r4.getBoolean(r0, r1)
            r3.mShowsDialog = r0
            java.lang.String r0 = "android:backStackId"
            r1 = -1
            int r4 = r4.getInt(r0, r1)
            r3.mBackStackId = r4
        L42:
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC3875
    public android.app.Dialog onCreateDialog(@Yue.InterfaceC4544 android.os.Bundle r3) {
            r2 = this;
            r3 = 3
            boolean r3 = androidx.fragment.app.FragmentManager.m29090(r3)
            if (r3 == 0) goto L1d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "onCreateDialog called for DialogFragment "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r3)
        L1d:
            Yue.ۥ۟ۦۤۦ r3 = new Yue.ۥ۟ۦۤۦ
            android.content.Context r0 = r2.requireContext()
            int r1 = r2.getTheme()
            r3.<init>(r0, r1)
            return r3
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC3875
    public void onDestroyView() {
            r2 = this;
            super.onDestroyView()
            android.app.Dialog r0 = r2.mDialog
            if (r0 == 0) goto L21
            r1 = 1
            r2.mViewDestroyed = r1
            r1 = 0
            r0.setOnDismissListener(r1)
            android.app.Dialog r0 = r2.mDialog
            r0.dismiss()
            boolean r0 = r2.mDismissed
            if (r0 != 0) goto L1c
            android.app.Dialog r0 = r2.mDialog
            r2.onDismiss(r0)
        L1c:
            r2.mDialog = r1
            r0 = 0
            r2.mDialogCreated = r0
        L21:
            return
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC3875
    public void onDetach() {
            r2 = this;
            super.onDetach()
            boolean r0 = r2.mShownByMe
            if (r0 != 0) goto Le
            boolean r0 = r2.mDismissed
            if (r0 != 0) goto Le
            r0 = 1
            r2.mDismissed = r0
        Le:
            androidx.lifecycle.LiveData r0 = r2.getViewLifecycleOwnerLiveData()
            androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> r1 = r2.mObserver
            r0.removeObserver(r1)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @Yue.InterfaceC0907
    public void onDismiss(@Yue.InterfaceC4410 android.content.DialogInterface r2) {
            r1 = this;
            boolean r2 = r1.mViewDestroyed
            if (r2 != 0) goto L26
            r2 = 3
            boolean r2 = androidx.fragment.app.FragmentManager.m29090(r2)
            if (r2 == 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "onDismiss called for DialogFragment "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r2)
        L21:
            r2 = 0
            r0 = 1
            r1.m29334(r0, r0, r2)
        L26:
            return
    }

    @Yue.InterfaceC4544
    public android.view.View onFindViewById(int r2) {
            r1 = this;
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto L9
            android.view.View r2 = r0.findViewById(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC4410
    public android.view.LayoutInflater onGetLayoutInflater(@Yue.InterfaceC4544 android.os.Bundle r5) {
            r4 = this;
            android.view.LayoutInflater r0 = super.onGetLayoutInflater(r5)
            boolean r1 = r4.mShowsDialog
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L3f
            boolean r1 = r4.mCreatingDialog
            if (r1 == 0) goto L10
            goto L3f
        L10:
            r4.m29335(r5)
            boolean r5 = androidx.fragment.app.FragmentManager.m29090(r2)
            if (r5 == 0) goto L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = " from dialog context"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L32:
            android.app.Dialog r5 = r4.mDialog
            if (r5 == 0) goto L3e
            android.content.Context r5 = r5.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r5)
        L3e:
            return r0
        L3f:
            boolean r5 = androidx.fragment.app.FragmentManager.m29090(r2)
            if (r5 == 0) goto L83
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            boolean r1 = r4.mShowsDialog
            if (r1 != 0) goto L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mShowsDialog = false: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.util.Log.d(r3, r5)
            goto L83
        L6f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mCreatingDialog = true: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.util.Log.d(r3, r5)
        L83:
            return r0
    }

    public boolean onHasView() {
            r1 = this;
            boolean r0 = r1.mDialogCreated
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC3875
    public void onSaveInstanceState(@Yue.InterfaceC4410 android.os.Bundle r4) {
            r3 = this;
            super.onSaveInstanceState(r4)
            android.app.Dialog r0 = r3.mDialog
            if (r0 == 0) goto L16
            android.os.Bundle r0 = r0.onSaveInstanceState()
            java.lang.String r1 = "android:dialogShowing"
            r2 = 0
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "android:savedDialogState"
            r4.putBundle(r1, r0)
        L16:
            int r0 = r3.mStyle
            if (r0 == 0) goto L1f
            java.lang.String r1 = "android:style"
            r4.putInt(r1, r0)
        L1f:
            int r0 = r3.mTheme
            if (r0 == 0) goto L28
            java.lang.String r1 = "android:theme"
            r4.putInt(r1, r0)
        L28:
            boolean r0 = r3.mCancelable
            if (r0 != 0) goto L31
            java.lang.String r1 = "android:cancelable"
            r4.putBoolean(r1, r0)
        L31:
            boolean r0 = r3.mShowsDialog
            if (r0 != 0) goto L3a
            java.lang.String r1 = "android:showsDialog"
            r4.putBoolean(r1, r0)
        L3a:
            int r0 = r3.mBackStackId
            r1 = -1
            if (r0 == r1) goto L44
            java.lang.String r1 = "android:backStackId"
            r4.putInt(r1, r0)
        L44:
            return
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC3875
    public void onStart() {
            r2 = this;
            super.onStart()
            android.app.Dialog r0 = r2.mDialog
            if (r0 == 0) goto L20
            r1 = 0
            r2.mViewDestroyed = r1
            r0.show()
            android.app.Dialog r0 = r2.mDialog
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r2)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r2)
            Yue.C6920.m26786(r0, r2)
        L20:
            return
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC3875
    public void onStop() {
            r1 = this;
            super.onStop()
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto La
            r0.hide()
        La:
            return
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC3875
    public void onViewStateRestored(@Yue.InterfaceC4544 android.os.Bundle r2) {
            r1 = this;
            super.onViewStateRestored(r2)
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto L16
            if (r2 == 0) goto L16
            java.lang.String r0 = "android:savedDialogState"
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L16
            android.app.Dialog r0 = r1.mDialog
            r0.onRestoreInstanceState(r2)
        L16:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@Yue.InterfaceC4410 android.view.LayoutInflater r1, @Yue.InterfaceC4544 android.view.ViewGroup r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
            r0 = this;
            super.performCreateView(r1, r2, r3)
            android.view.View r1 = r0.mView
            if (r1 != 0) goto L1a
            android.app.Dialog r1 = r0.mDialog
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
            java.lang.String r1 = "android:savedDialogState"
            android.os.Bundle r1 = r3.getBundle(r1)
            if (r1 == 0) goto L1a
            android.app.Dialog r2 = r0.mDialog
            r2.onRestoreInstanceState(r1)
        L1a:
            return
    }

    @Yue.InterfaceC4410
    public final Yue.DialogC1432 requireComponentDialog() {
            r4 = this;
            android.app.Dialog r0 = r4.requireDialog()
            boolean r1 = r0 instanceof Yue.DialogC1432
            if (r1 == 0) goto Lb
            Yue.ۥ۟ۦۤۦ r0 = (Yue.DialogC1432) r0
            return r0
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DialogFragment "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4410
    public final android.app.Dialog requireDialog() {
            r3 = this;
            android.app.Dialog r0 = r3.getDialog()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DialogFragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " does not have a Dialog."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void setCancelable(boolean r2) {
            r1 = this;
            r1.mCancelable = r2
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto L9
            r0.setCancelable(r2)
        L9:
            return
    }

    public void setShowsDialog(boolean r1) {
            r0 = this;
            r0.mShowsDialog = r1
            return
    }

    public void setStyle(int r4, @Yue.InterfaceC6018 int r5) {
            r3 = this;
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r1 == 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting style and theme for DialogFragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " to "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L2d:
            r3.mStyle = r4
            if (r4 == r0) goto L34
            r0 = 3
            if (r4 != r0) goto L39
        L34:
            r4 = 16973913(0x1030059, float:2.406115E-38)
            r3.mTheme = r4
        L39:
            if (r5 == 0) goto L3d
            r3.mTheme = r5
        L3d:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setupDialog(@Yue.InterfaceC4410 android.app.Dialog r3, int r4) {
            r2 = this;
            r0 = 1
            if (r4 == r0) goto L15
            r1 = 2
            if (r4 == r1) goto L15
            r1 = 3
            if (r4 == r1) goto La
            goto L18
        La:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L15
            r1 = 24
            r4.addFlags(r1)
        L15:
            r3.requestWindowFeature(r0)
        L18:
            return
    }

    public int show(@Yue.InterfaceC4410 androidx.fragment.app.AbstractC7632 r3, @Yue.InterfaceC4544 java.lang.String r4) {
            r2 = this;
            r0 = 0
            r2.mDismissed = r0
            r1 = 1
            r2.mShownByMe = r1
            r3.m29437(r2, r4)
            r2.mViewDestroyed = r0
            int r3 = r3.mo29268()
            r2.mBackStackId = r3
            return r3
    }

    public void show(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r2, @Yue.InterfaceC4544 java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.mDismissed = r0
            r0 = 1
            r1.mShownByMe = r0
            androidx.fragment.app.ۥ۟۟۠۟ r2 = r2.m29100()
            r2.m29458(r0)
            r2.m29437(r1, r3)
            r2.mo29268()
            return
    }

    public void showNow(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r2, @Yue.InterfaceC4544 java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.mDismissed = r0
            r0 = 1
            r1.mShownByMe = r0
            androidx.fragment.app.ۥ۟۟۠۟ r2 = r2.m29100()
            r2.m29458(r0)
            r2.m29437(r1, r3)
            r2.mo29270()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m29334(boolean r4, boolean r5, boolean r6) {
            r3 = this;
            boolean r0 = r3.mDismissed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.mDismissed = r0
            r1 = 0
            r3.mShownByMe = r1
            android.app.Dialog r1 = r3.mDialog
            if (r1 == 0) goto L33
            r2 = 0
            r1.setOnDismissListener(r2)
            android.app.Dialog r1 = r3.mDialog
            r1.dismiss()
            if (r5 != 0) goto L33
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Handler r1 = r3.mHandler
            android.os.Looper r1 = r1.getLooper()
            if (r5 != r1) goto L2c
            android.app.Dialog r5 = r3.mDialog
            r3.onDismiss(r5)
            goto L33
        L2c:
            android.os.Handler r5 = r3.mHandler
            java.lang.Runnable r1 = r3.mDismissRunnable
            r5.post(r1)
        L33:
            r3.mViewDestroyed = r0
            int r5 = r3.mBackStackId
            if (r5 < 0) goto L52
            if (r6 == 0) goto L45
            androidx.fragment.app.FragmentManager r4 = r3.getParentFragmentManager()
            int r5 = r3.mBackStackId
            r4.m29200(r5, r0)
            goto L4e
        L45:
            androidx.fragment.app.FragmentManager r5 = r3.getParentFragmentManager()
            int r6 = r3.mBackStackId
            r5.m29197(r6, r0, r4)
        L4e:
            r4 = -1
            r3.mBackStackId = r4
            goto L6f
        L52:
            androidx.fragment.app.FragmentManager r5 = r3.getParentFragmentManager()
            androidx.fragment.app.ۥ۟۟۠۟ r5 = r5.m29100()
            r5.m29458(r0)
            r5.mo29276(r3)
            if (r6 == 0) goto L66
            r5.mo29270()
            goto L6f
        L66:
            if (r4 == 0) goto L6c
            r5.mo29269()
            goto L6f
        L6c:
            r5.mo29268()
        L6f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m29335(@Yue.InterfaceC4544 android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.mShowsDialog
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r3.mDialogCreated
            if (r0 != 0) goto L4f
            r0 = 0
            r1 = 1
            r3.mCreatingDialog = r1     // Catch: java.lang.Throwable -> L2c
            android.app.Dialog r4 = r3.onCreateDialog(r4)     // Catch: java.lang.Throwable -> L2c
            r3.mDialog = r4     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r3.mShowsDialog     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L46
            int r2 = r3.mStyle     // Catch: java.lang.Throwable -> L2c
            r3.setupDialog(r4, r2)     // Catch: java.lang.Throwable -> L2c
            android.content.Context r4 = r3.getContext()     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            android.app.Dialog r2 = r3.mDialog     // Catch: java.lang.Throwable -> L2c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L2c
            r2.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r4 = move-exception
            goto L4c
        L2e:
            android.app.Dialog r4 = r3.mDialog     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r3.mCancelable     // Catch: java.lang.Throwable -> L2c
            r4.setCancelable(r2)     // Catch: java.lang.Throwable -> L2c
            android.app.Dialog r4 = r3.mDialog     // Catch: java.lang.Throwable -> L2c
            android.content.DialogInterface$OnCancelListener r2 = r3.mOnCancelListener     // Catch: java.lang.Throwable -> L2c
            r4.setOnCancelListener(r2)     // Catch: java.lang.Throwable -> L2c
            android.app.Dialog r4 = r3.mDialog     // Catch: java.lang.Throwable -> L2c
            android.content.DialogInterface$OnDismissListener r2 = r3.mOnDismissListener     // Catch: java.lang.Throwable -> L2c
            r4.setOnDismissListener(r2)     // Catch: java.lang.Throwable -> L2c
            r3.mDialogCreated = r1     // Catch: java.lang.Throwable -> L2c
            goto L49
        L46:
            r4 = 0
            r3.mDialog = r4     // Catch: java.lang.Throwable -> L2c
        L49:
            r3.mCreatingDialog = r0
            goto L4f
        L4c:
            r3.mCreatingDialog = r0
            throw r4
        L4f:
            return
    }
}
