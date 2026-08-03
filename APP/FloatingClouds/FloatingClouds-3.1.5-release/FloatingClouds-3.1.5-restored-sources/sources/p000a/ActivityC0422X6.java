package p000a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0981a;
import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1119h;
import androidx.savedstate.C1224a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.AbstractC0553e7;

/* JADX INFO: renamed from: a.X6 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0422X6 extends ComponentActivity implements InterfaceC0361U {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C1119h mFragmentLifecycleRegistry;
    final C0440Y6 mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: renamed from: a.X6$a */
    public class a extends AbstractC0458Z6<ActivityC0422X6> implements InterfaceC0463Zb, InterfaceC0596gc, InterfaceC0501bc, InterfaceC0520cc, InterfaceC0127Gg, InterfaceC0445Yb, InterfaceC0546e0, InterfaceC0214Ld, InterfaceC0686l7, InterfaceC0426Xa {
        public a() {
            super(ActivityC0422X6.this);
        }

        @Override // p000a.InterfaceC0686l7
        /* JADX INFO: renamed from: a */
        public final void mo1066a(ComponentCallbacksC1100b componentCallbacksC1100b) {
            ActivityC0422X6.this.onAttachFragment(componentCallbacksC1100b);
        }

        @Override // p000a.InterfaceC0426Xa
        public final void addMenuProvider(InterfaceC0595gb interfaceC0595gb) {
            ActivityC0422X6.this.addMenuProvider(interfaceC0595gb);
        }

        @Override // p000a.InterfaceC0463Zb
        public final void addOnConfigurationChangedListener(InterfaceC0294Q3<Configuration> interfaceC0294Q3) {
            ActivityC0422X6.this.addOnConfigurationChangedListener(interfaceC0294Q3);
        }

        @Override // p000a.InterfaceC0501bc
        public final void addOnMultiWindowModeChangedListener(InterfaceC0294Q3<C0956zb> interfaceC0294Q3) {
            ActivityC0422X6.this.addOnMultiWindowModeChangedListener(interfaceC0294Q3);
        }

        @Override // p000a.InterfaceC0520cc
        public final void addOnPictureInPictureModeChangedListener(InterfaceC0294Q3<C0862uc> interfaceC0294Q3) {
            ActivityC0422X6.this.addOnPictureInPictureModeChangedListener(interfaceC0294Q3);
        }

        @Override // p000a.InterfaceC0596gc
        public final void addOnTrimMemoryListener(InterfaceC0294Q3<Integer> interfaceC0294Q3) {
            ActivityC0422X6.this.addOnTrimMemoryListener(interfaceC0294Q3);
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: c */
        public final View mo1067c(int i) {
            return ActivityC0422X6.this.findViewById(i);
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: f */
        public final boolean mo1068f() {
            Window window = ActivityC0422X6.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p000a.InterfaceC0546e0
        public final AbstractC0981a getActivityResultRegistry() {
            return ActivityC0422X6.this.getActivityResultRegistry();
        }

        @Override // p000a.InterfaceC0935y9
        public final AbstractC1116e getLifecycle() {
            return ActivityC0422X6.this.mFragmentLifecycleRegistry;
        }

        @Override // p000a.InterfaceC0445Yb
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return ActivityC0422X6.this.getOnBackPressedDispatcher();
        }

        @Override // p000a.InterfaceC0214Ld
        public final C1224a getSavedStateRegistry() {
            return ActivityC0422X6.this.getSavedStateRegistry();
        }

        @Override // p000a.InterfaceC0127Gg
        public final C0109Fg getViewModelStore() {
            return ActivityC0422X6.this.getViewModelStore();
        }

        @Override // p000a.InterfaceC0426Xa
        public final void removeMenuProvider(InterfaceC0595gb interfaceC0595gb) {
            ActivityC0422X6.this.removeMenuProvider(interfaceC0595gb);
        }

        @Override // p000a.InterfaceC0463Zb
        public final void removeOnConfigurationChangedListener(InterfaceC0294Q3<Configuration> interfaceC0294Q3) {
            ActivityC0422X6.this.removeOnConfigurationChangedListener(interfaceC0294Q3);
        }

        @Override // p000a.InterfaceC0501bc
        public final void removeOnMultiWindowModeChangedListener(InterfaceC0294Q3<C0956zb> interfaceC0294Q3) {
            ActivityC0422X6.this.removeOnMultiWindowModeChangedListener(interfaceC0294Q3);
        }

        @Override // p000a.InterfaceC0520cc
        public final void removeOnPictureInPictureModeChangedListener(InterfaceC0294Q3<C0862uc> interfaceC0294Q3) {
            ActivityC0422X6.this.removeOnPictureInPictureModeChangedListener(interfaceC0294Q3);
        }

        @Override // p000a.InterfaceC0596gc
        public final void removeOnTrimMemoryListener(InterfaceC0294Q3<Integer> interfaceC0294Q3) {
            ActivityC0422X6.this.removeOnTrimMemoryListener(interfaceC0294Q3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActivityC0422X6() {
        this.mFragments = new C0440Y6(new a());
        this.mFragmentLifecycleRegistry = new C1119h(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m3009c(LIFECYCLE_TAG, new C0023B3(1, this));
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC0294Q3(this) { // from class: a.W6

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ActivityC0422X6 f1545b;

            {
                this.f1545b = this;
            }

            @Override // p000a.InterfaceC0294Q3
            /* JADX INFO: renamed from: a */
            public final void mo747a(Object obj) {
                switch (i) {
                    case 0:
                        this.f1545b.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        this.f1545b.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new InterfaceC0294Q3(this) { // from class: a.W6

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ActivityC0422X6 f1545b;

            {
                this.f1545b = this;
            }

            @Override // p000a.InterfaceC0294Q3
            /* JADX INFO: renamed from: a */
            public final void mo747a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1545b.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        this.f1545b.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        addOnContextAvailableListener(new C0042C3(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.m2598f(AbstractC1116e.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m1098a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m1098a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        a aVar = this.mFragments.f1646a;
        aVar.f1725d.m1358b(aVar, aVar, null);
    }

    private static boolean markState(AbstractC0553e7 abstractC0553e7, AbstractC1116e.b bVar) {
        boolean zMarkState = false;
        for (ComponentCallbacksC1100b componentCallbacksC1100b : abstractC0553e7.f2060c.m27g()) {
            if (componentCallbacksC1100b != null) {
                a aVar = componentCallbacksC1100b.f4577u;
                if ((aVar == null ? null : ActivityC0422X6.this) != null) {
                    zMarkState |= markState(componentCallbacksC1100b.m2530c(), bVar);
                }
                C0781q7 c0781q7 = componentCallbacksC1100b.f4552P;
                AbstractC1116e.b bVar2 = AbstractC1116e.b.f4675d;
                if (c0781q7 != null) {
                    c0781q7.m1822b();
                    if (c0781q7.f3081d.f4681c.compareTo(bVar2) >= 0) {
                        componentCallbacksC1100b.f4552P.f3081d.m2600h(bVar);
                        zMarkState = true;
                    }
                }
                if (componentCallbacksC1100b.f4551O.f4681c.compareTo(bVar2) >= 0) {
                    componentCallbacksC1100b.f4551O.m2600h(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f1646a.f1725d.f2063f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
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
                new C0156I9(this, getViewModelStore()).m435a(str2, printWriter);
            }
            this.mFragments.f1646a.f1725d.m1382v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC0553e7 getSupportFragmentManager() {
        return this.mFragments.f1646a.f1725d;
    }

    @Deprecated
    public AbstractC0138H9 getSupportLoaderManager() {
        return new C0156I9(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC1116e.b.f4674c)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m1098a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC1100b componentCallbacksC1100b) {
    }

    @Override // androidx.activity.ComponentActivity, p000a.ActivityC0060D3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m2598f(AbstractC1116e.a.ON_CREATE);
        C0629i7 c0629i7 = this.mFragments.f1646a.f1725d;
        c0629i7.f2049G = false;
        c0629i7.f2050H = false;
        c0629i7.f2056N.f2494i = false;
        c0629i7.m1381u(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f1646a.f1725d.m1372l();
        this.mFragmentLifecycleRegistry.m2598f(AbstractC1116e.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f1646a.f1725d.m1370j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f1646a.f1725d.m1381u(5);
        this.mFragmentLifecycleRegistry.m2598f(AbstractC1116e.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m1098a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m1098a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f1646a.f1725d.m1386z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m2598f(AbstractC1116e.a.ON_RESUME);
        C0629i7 c0629i7 = this.mFragments.f1646a.f1725d;
        c0629i7.f2049G = false;
        c0629i7.f2050H = false;
        c0629i7.f2056N.f2494i = false;
        c0629i7.m1381u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m1098a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C0629i7 c0629i7 = this.mFragments.f1646a.f1725d;
            c0629i7.f2049G = false;
            c0629i7.f2050H = false;
            c0629i7.f2056N.f2494i = false;
            c0629i7.m1381u(4);
        }
        this.mFragments.f1646a.f1725d.m1386z(true);
        this.mFragmentLifecycleRegistry.m2598f(AbstractC1116e.a.ON_START);
        C0629i7 c0629i72 = this.mFragments.f1646a.f1725d;
        c0629i72.f2049G = false;
        c0629i72.f2050H = false;
        c0629i72.f2056N.f2494i = false;
        c0629i72.m1381u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m1098a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C0629i7 c0629i7 = this.mFragments.f1646a.f1725d;
        c0629i7.f2050H = true;
        c0629i7.f2056N.f2494i = true;
        c0629i7.m1381u(4);
        this.mFragmentLifecycleRegistry.m2598f(AbstractC1116e.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC0484ae abstractC0484ae) {
        C0325S.m899c(this, null);
    }

    public void setExitSharedElementCallback(AbstractC0484ae abstractC0484ae) {
        C0325S.m900d(this, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void startActivityFromFragment(ComponentCallbacksC1100b componentCallbacksC1100b, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (componentCallbacksC1100b.f4577u == null) {
            throw new IllegalStateException("Fragment " + componentCallbacksC1100b + " not attached to Activity");
        }
        AbstractC0553e7 abstractC0553e7M2533f = componentCallbacksC1100b.m2533f();
        if (abstractC0553e7M2533f.f2044B != null) {
            abstractC0553e7M2533f.f2047E.addLast(new AbstractC0553e7.g(componentCallbacksC1100b.f4561e, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            abstractC0553e7M2533f.f2044B.m1302a(intent);
            return;
        }
        a aVar = abstractC0553e7M2533f.f2079v;
        aVar.getClass();
        C0631i9.m1482e(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        aVar.f1723b.startActivity(intent, bundle);
    }

    @Deprecated
    public void startIntentSenderFromFragment(ComponentCallbacksC1100b componentCallbacksC1100b, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        Intent intent2 = intent;
        if (componentCallbacksC1100b.f4577u == null) {
            throw new IllegalStateException("Fragment " + componentCallbacksC1100b + " not attached to Activity");
        }
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Fragment " + componentCallbacksC1100b + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        AbstractC0553e7 abstractC0553e7M2533f = componentCallbacksC1100b.m2533f();
        if (abstractC0553e7M2533f.f2045C == null) {
            a aVar = abstractC0553e7M2533f.f2079v;
            aVar.getClass();
            C0631i9.m1482e(intentSender, "intent");
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            ActivityC0422X6 activityC0422X6 = aVar.f1722a;
            if (activityC0422X6 == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            activityC0422X6.startIntentSenderForResult(intentSender, i, intent2, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + componentCallbacksC1100b);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C0631i9.m1482e(intentSender, "intentSender");
        C0593g9 c0593g9 = new C0593g9(intentSender, intent2, i2, i3);
        abstractC0553e7M2533f.f2047E.addLast(new AbstractC0553e7.g(componentCallbacksC1100b.f4561e, i));
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Fragment " + componentCallbacksC1100b + "is launching an IntentSender for result ");
        }
        abstractC0553e7M2533f.f2045C.m1302a(c0593g9);
    }

    public void supportFinishAfterTransition() {
        C0325S.m897a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        C0325S.m898b(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0325S.m901e(this);
    }

    @Override // p000a.InterfaceC0361U
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public ActivityC0422X6(int i) {
        super(i);
        this.mFragments = new C0440Y6(new a());
        this.mFragmentLifecycleRegistry = new C1119h(this);
        this.mStopped = true;
        init();
    }

    public void startActivityFromFragment(ComponentCallbacksC1100b componentCallbacksC1100b, Intent intent, int i) {
        startActivityFromFragment(componentCallbacksC1100b, intent, i, (Bundle) null);
    }
}
