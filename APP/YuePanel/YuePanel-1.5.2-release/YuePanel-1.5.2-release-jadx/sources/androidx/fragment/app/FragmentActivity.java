package androidx.fragment.app;

import Yue.AbstractC5078;
import Yue.AbstractC5748;
import Yue.AbstractC7430;
import Yue.C3090;
import Yue.C5077;
import Yue.C6292;
import Yue.C6664;
import Yue.InterfaceC3139;
import Yue.InterfaceC3647;
import Yue.InterfaceC4144;
import Yue.InterfaceC4183;
import Yue.InterfaceC5086;
import Yue.InterfaceC5683;
import Yue.InterfaceC5922;
import Yue.InterfaceC6151;
import Yue.InterfaceC6165;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6549;
import Yue.InterfaceC6550;
import Yue.InterfaceC6551;
import Yue.InterfaceC6554;
import Yue.InterfaceC6556;
import Yue.InterfaceC6559;
import Yue.InterfaceC7235;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.LifecycleRegistry;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewModelStore;
import android.view.ViewModelStoreOwner;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.savedstate.C1794;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements C3090.InterfaceC3097, C3090.InterfaceC3099 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final LifecycleRegistry mFragmentLifecycleRegistry;
    final C5077 mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentActivity$ۥ */
    public class C1682 extends AbstractC5078<FragmentActivity> implements InterfaceC6550, InterfaceC6559, InterfaceC6554, InterfaceC6556, ViewModelStoreOwner, InterfaceC6549, InterfaceC3139, InterfaceC7235, InterfaceC5086, InterfaceC6151 {
        public C1682() {
            super(FragmentActivity.this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // Yue.InterfaceC6151
        public void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165) {
            FragmentActivity.this.addMenuProvider(interfaceC6165);
        }

        @Override // Yue.InterfaceC6550
        public void addOnConfigurationChangedListener(@InterfaceC6391 InterfaceC4144<Configuration> interfaceC4144) {
            FragmentActivity.this.addOnConfigurationChangedListener(interfaceC4144);
        }

        @Override // Yue.InterfaceC6554
        public void addOnMultiWindowModeChangedListener(@InterfaceC6391 InterfaceC4144<C6292> interfaceC4144) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(interfaceC4144);
        }

        @Override // Yue.InterfaceC6556
        public void addOnPictureInPictureModeChangedListener(@InterfaceC6391 InterfaceC4144<C6664> interfaceC4144) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(interfaceC4144);
        }

        @Override // Yue.InterfaceC6559
        public void addOnTrimMemoryListener(@InterfaceC6391 InterfaceC4144<Integer> interfaceC4144) {
            FragmentActivity.this.addOnTrimMemoryListener(interfaceC4144);
        }

        @Override // Yue.InterfaceC3139
        @InterfaceC6391
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // android.view.LifecycleOwner
        @InterfaceC6391
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // Yue.InterfaceC6549
        @InterfaceC6391
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // Yue.InterfaceC7235
        @InterfaceC6391
        public C1794 getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // android.view.ViewModelStoreOwner
        @InterfaceC6391
        public ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // Yue.InterfaceC6151
        public void invalidateMenu() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // Yue.InterfaceC6151
        public void removeMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165) {
            FragmentActivity.this.removeMenuProvider(interfaceC6165);
        }

        @Override // Yue.InterfaceC6550
        public void removeOnConfigurationChangedListener(@InterfaceC6391 InterfaceC4144<Configuration> interfaceC4144) {
            FragmentActivity.this.removeOnConfigurationChangedListener(interfaceC4144);
        }

        @Override // Yue.InterfaceC6554
        public void removeOnMultiWindowModeChangedListener(@InterfaceC6391 InterfaceC4144<C6292> interfaceC4144) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(interfaceC4144);
        }

        @Override // Yue.InterfaceC6556
        public void removeOnPictureInPictureModeChangedListener(@InterfaceC6391 InterfaceC4144<C6664> interfaceC4144) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(interfaceC4144);
        }

        @Override // Yue.InterfaceC6559
        public void removeOnTrimMemoryListener(@InterfaceC6391 InterfaceC4144<Integer> interfaceC4144) {
            FragmentActivity.this.removeOnTrimMemoryListener(interfaceC4144);
        }

        @Override // Yue.InterfaceC5086
        /* JADX INFO: renamed from: ۥ */
        public void mo1899(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // Yue.AbstractC5078, Yue.AbstractC5076
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ */
        public View mo15627(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // Yue.AbstractC5078, Yue.AbstractC5076
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo15628() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // Yue.AbstractC5078
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo15672(@InterfaceC6391 String str, @InterfaceC6490 FileDescriptor fileDescriptor, @InterfaceC6391 PrintWriter printWriter, @InterfaceC6490 String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // Yue.AbstractC5078
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public LayoutInflater mo15674() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // Yue.AbstractC5078
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public int mo15675() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // Yue.AbstractC5078
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo15676() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // Yue.AbstractC5078
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public boolean mo15678(@InterfaceC6391 Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // Yue.AbstractC5078
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public boolean mo15679(@InterfaceC6391 String str) {
            return C3090.m6317(FragmentActivity.this, str);
        }

        @Override // Yue.AbstractC5078
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo15683() {
            invalidateMenu();
        }

        /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟()Ljava/lang/Object; */
        @Override // Yue.AbstractC5078
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public FragmentActivity mo15673() {
            return FragmentActivity.this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // Yue.InterfaceC6151
        public void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner) {
            FragmentActivity.this.addMenuProvider(interfaceC6165, lifecycleOwner);
        }

        @Override // Yue.InterfaceC6151
        public void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.State state) {
            FragmentActivity.this.addMenuProvider(interfaceC6165, lifecycleOwner, state);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FragmentActivity() {
        this.mFragments = C5077.m1895(new C1682());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        m29719();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static boolean m29718(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zM29718 = false;
        for (Fragment fragment : fragmentManager.m29811()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zM29718 |= m29718(fragment.getChildFragmentManager(), state);
                }
                C8886 c8886 = fragment.mViewLifecycleOwner;
                if (c8886 != null && c8886.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.m30072(state);
                    zM29718 = true;
                }
                if (fragment.mLifecycleRegistry.getState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    zM29718 = true;
                }
            }
        }
        return zM29718;
    }

    @InterfaceC6490
    public final View dispatchFragmentsOnCreateView(@InterfaceC6490 View view, @InterfaceC6391 String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        return this.mFragments.m15659(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@InterfaceC6391 String str, @InterfaceC6490 FileDescriptor fileDescriptor, @InterfaceC6391 PrintWriter printWriter, @InterfaceC6490 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC5748.m17830(this).mo2426(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.m15656().m29785(str, fileDescriptor, printWriter, strArr);
        }
    }

    @InterfaceC6391
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.m15656();
    }

    @InterfaceC6391
    @Deprecated
    public AbstractC5748 getSupportLoaderManager() {
        return AbstractC5748.m17830(this);
    }

    public void markFragmentsCreated() {
        while (m29718(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC3647
    public void onActivityResult(int i, int i2, @InterfaceC6490 Intent intent) {
        this.mFragments.m15658();
        super.onActivityResult(i, i2, intent);
    }

    @InterfaceC5922
    @Deprecated
    public void onAttachFragment(@InterfaceC6391 Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@InterfaceC6490 Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.mFragments.m15632();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @InterfaceC6490
    public View onCreateView(@InterfaceC6490 View view, @InterfaceC6391 String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.m15634();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @InterfaceC6391 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.m15631(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m15640();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC3647
    public void onRequestPermissionsResult(int i, @InterfaceC6391 String[] strArr, @InterfaceC6391 int[] iArr) {
        this.mFragments.m15658();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m15658();
        super.onResume();
        this.mResumed = true;
        this.mFragments.m15652();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.mFragments.m15644();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m15658();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m15629();
        }
        this.mFragments.m15652();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.mFragments.m15645();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m15658();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m15646();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@InterfaceC6490 AbstractC7430 abstractC7430) {
        C3090.m6313(this, abstractC7430);
    }

    public void setExitSharedElementCallback(@InterfaceC6490 AbstractC7430 abstractC7430) {
        C3090.m6314(this, abstractC7430);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void startActivityFromFragment(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@InterfaceC6391 Fragment fragment, @InterfaceC6391 IntentSender intentSender, int i, @InterfaceC6490 Intent intent, int i2, int i3, int i4, @InterfaceC6490 Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C3090.m6319(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C3090.m6302(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        C3090.m6308(this);
    }

    public void supportStartPostponedEnterTransition() {
        C3090.m6320(this);
    }

    @Override // Yue.C3090.InterfaceC3099
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m29719() {
        getSavedStateRegistry().m30806(LIFECYCLE_TAG, new C1794.InterfaceC9000() { // from class: Yue.ۥۣ۠ۢۧ
            @Override // androidx.savedstate.C1794.InterfaceC9000
            public final Bundle saveState() {
                return this.f1256.m29720();
            }
        });
        addOnConfigurationChangedListener(new InterfaceC4144() { // from class: Yue.ۥ۠ۢۧۤ
            @Override // Yue.InterfaceC4144
            public final void accept(Object obj) {
                this.f12027.m29721((Configuration) obj);
            }
        });
        addOnNewIntentListener(new InterfaceC4144() { // from class: Yue.ۥ۠ۢۧۥ
            @Override // Yue.InterfaceC4144
            public final void accept(Object obj) {
                this.f12028.m29722((Intent) obj);
            }
        });
        addOnContextAvailableListener(new InterfaceC6551() { // from class: Yue.ۥ۠ۢۧۦ
            @Override // Yue.InterfaceC6551
            /* JADX INFO: renamed from: ۥ */
            public final void mo1013(Context context) {
                this.f1257.m29723(context);
            }
        });
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final /* synthetic */ Bundle m29720() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final /* synthetic */ void m29721(Configuration configuration) {
        this.mFragments.m15658();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m29722(Intent intent) {
        this.mFragments.m15658();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final /* synthetic */ void m29723(Context context) {
        this.mFragments.m1896(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void startActivityFromFragment(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Intent intent, int i, @InterfaceC6490 Bundle bundle) {
        if (i == -1) {
            C3090.m6318(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @InterfaceC6490
    public View onCreateView(@InterfaceC6391 String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @InterfaceC4183
    public FragmentActivity(@InterfaceC5683 int i) {
        super(i);
        this.mFragments = C5077.m1895(new C1682());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        m29719();
    }
}
