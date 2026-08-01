package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.collection.C0282;
import androidx.compose.animation.core.C0325;
import androidx.core.util.InterfaceC2188;
import androidx.lifecycle.C2386;
import androidx.lifecycle.C2423;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.C2941;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5092;
import lin.xposed.hook.javaplugin.C5553;
import p143.AbstractC7545;
import p143.C7542;
import p143.C7543;
import p160.C7636;
import p162.AbstractC7659;
import p172.InterfaceC7730;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C2386 mFragmentLifecycleRegistry;
    final C2317 mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = new C2317(new C2319(this));
        this.mFragmentLifecycleRegistry = new C2386(this, true);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m12732(LIFECYCLE_TAG, new C2335(this, 0));
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子楪兰哲苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ FragmentActivity f6873;

            {
                this.f6873 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i2 = i;
                FragmentActivity fragmentActivity = this.f6873;
                switch (i2) {
                    case 0:
                        fragmentActivity.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        fragmentActivity.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new InterfaceC2188(this) { // from class: androidx.fragment.app.飘花落叶言子楪兰哲苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ FragmentActivity f6873;

            {
                this.f6873 = this;
            }

            @Override // androidx.core.util.InterfaceC2188
            public final void accept(Object obj) {
                int i22 = i2;
                FragmentActivity fragmentActivity = this.f6873;
                switch (i22) {
                    case 0:
                        fragmentActivity.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        fragmentActivity.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC7730() { // from class: androidx.fragment.app.飘花落叶言子世楪苏哲兰
            @Override // p172.InterfaceC7730
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo165(ComponentActivity componentActivity) {
                this.f6820.lambda$init$3(componentActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.m4489(Lifecycle$Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m4405();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m4405();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        C2319 c2319 = this.mFragments.f6809;
        c2319.f6815.m4378(c2319, c2319, null);
    }

    private static boolean markState(AbstractC2313 abstractC2313, Lifecycle$State lifecycle$State) {
        boolean zMarkState = false;
        for (AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 : abstractC2313.f6783.m963()) {
            if (abstractComponentCallbacksC2338 != null) {
                C2319 c2319 = abstractComponentCallbacksC2338.f6896;
                if ((c2319 == null ? null : c2319.f6817) != null) {
                    zMarkState |= markState(abstractComponentCallbacksC2338.m4432(), lifecycle$State);
                }
                C2355 c2355 = abstractComponentCallbacksC2338.f6914;
                if (c2355 != null) {
                    c2355.m4466();
                    if (c2355.f6962.f7018.isAtLeast(Lifecycle$State.STARTED)) {
                        abstractComponentCallbacksC2338.f6914.f6962.m4495(lifecycle$State);
                        zMarkState = true;
                    }
                }
                if (abstractComponentCallbacksC2338.f6918.f7018.isAtLeast(Lifecycle$State.STARTED)) {
                    abstractComponentCallbacksC2338.f6918.m4495(lifecycle$State);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f6809.f6815.f6780.onCreateView(view, str, context, attributeSet);
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
                C2423 viewModelStore = getViewModelStore();
                viewModelStore.getClass();
                C7636 c7636 = C7636.f20730;
                c7636.getClass();
                C0325 c0325 = new C0325(viewModelStore, C7543.f20430, c7636);
                InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C7543.class);
                String strMo8895 = interfaceC5092Mo8927.mo8895();
                if (strMo8895 == null) {
                    C5919.m11249("Local and anonymous classes can not be ViewModels");
                    return;
                }
                C0282 c0282 = ((C7543) c0325.m958("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8895), interfaceC5092Mo8927)).f20431;
                if (c0282.f991 > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (c0282.f991 > 0) {
                        if (c0282.m856(0) != null) {
                            C2941.m6336();
                            return;
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(c0282.f992[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            this.mFragments.f6809.f6815.m4385(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC2313 getSupportFragmentManager() {
        return this.mFragments.f6809.f6815;
    }

    @Deprecated
    public AbstractC7545 getSupportLoaderManager() {
        return new C7542(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle$State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m4405();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m4489(Lifecycle$Event.ON_CREATE);
        C2309 c2309 = this.mFragments.f6809.f6815;
        c2309.f6778 = false;
        c2309.f6777 = false;
        c2309.f6767.f6762 = false;
        c2309.m4380(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f6809.f6815.m4394();
        this.mFragmentLifecycleRegistry.m4489(Lifecycle$Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f6809.f6815.m4396();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f6809.f6815.m4380(5);
        this.mFragmentLifecycleRegistry.m4489(Lifecycle$Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m4405();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m4405();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f6809.f6815.m4369(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m4489(Lifecycle$Event.ON_RESUME);
        C2309 c2309 = this.mFragments.f6809.f6815;
        c2309.f6778 = false;
        c2309.f6777 = false;
        c2309.f6767.f6762 = false;
        c2309.m4380(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m4405();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C2309 c2309 = this.mFragments.f6809.f6815;
            c2309.f6778 = false;
            c2309.f6777 = false;
            c2309.f6767.f6762 = false;
            c2309.m4380(4);
        }
        this.mFragments.f6809.f6815.m4369(true);
        this.mFragmentLifecycleRegistry.m4489(Lifecycle$Event.ON_START);
        C2309 c23092 = this.mFragments.f6809.f6815;
        c23092.f6778 = false;
        c23092.f6777 = false;
        c23092.f6767.f6762 = false;
        c23092.m4380(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m4405();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C2309 c2309 = this.mFragments.f6809.f6815;
        c2309.f6777 = true;
        c2309.f6767.f6762 = true;
        c2309.m4380(4);
        this.mFragmentLifecycleRegistry.m4489(Lifecycle$Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC7659 abstractC7659) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(AbstractC7659 abstractC7659) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (abstractComponentCallbacksC2338.f6896 == null) {
            C5553.m10826(abstractComponentCallbacksC2338, "Fragment ", " not attached to Activity");
            return;
        }
        AbstractC2313 abstractC2313M4449 = abstractComponentCallbacksC2338.m4449();
        if (abstractC2313M4449.f6771 != null) {
            abstractC2313M4449.f6768.addLast(new FragmentManager$LaunchedFragmentInfo(abstractComponentCallbacksC2338.f6900, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            abstractC2313M4449.f6771.m13018(intent);
            return;
        }
        C2319 c2319 = abstractC2313M4449.f6790;
        if (i == -1) {
            c2319.f6819.startActivity(intent, bundle);
        } else {
            c2319.getClass();
            C5919.m11250("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (abstractComponentCallbacksC2338.f6896 == null) {
            C5553.m10826(abstractComponentCallbacksC2338, "Fragment ", " not attached to Activity");
            return;
        }
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC2338 + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        AbstractC2313 abstractC2313M4449 = abstractComponentCallbacksC2338.m4449();
        if (abstractC2313M4449.f6770 == null) {
            C2319 c2319 = abstractC2313M4449.f6790;
            if (i == -1) {
                c2319.f6818.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                c2319.getClass();
                C5919.m11250("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (AbstractC2313.m4352(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + abstractComponentCallbacksC2338);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        intentSender.getClass();
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
        abstractC2313M4449.f6768.addLast(new FragmentManager$LaunchedFragmentInfo(abstractComponentCallbacksC2338.f6900, i));
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC2338 + "is launching an IntentSender for result ");
        }
        abstractC2313M4449.f6770.m13018(intentSenderRequest);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = new C2317(new C2319(this));
        this.mFragmentLifecycleRegistry = new C2386(this, true);
        this.mStopped = true;
        init();
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, Intent intent, int i) {
        startActivityFromFragment(abstractComponentCallbacksC2338, intent, i, (Bundle) null);
    }
}
