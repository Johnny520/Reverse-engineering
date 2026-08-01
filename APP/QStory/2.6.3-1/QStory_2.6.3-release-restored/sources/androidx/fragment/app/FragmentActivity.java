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
import androidx.collection.C1129;
import androidx.compose.animation.core.C1171;
import androidx.core.util.InterfaceC3021;
import androidx.lifecycle.C3219;
import androidx.lifecycle.C3256;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.C3775;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import lin.xposed.hook.javaplugin.C6385;
import p159.AbstractC8375;
import p159.C8372;
import p159.C8373;
import p176.C8466;
import p178.AbstractC8489;
import p188.InterfaceC8560;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C3219 mFragmentLifecycleRegistry;
    final C3150 mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = new C3150(new C3152(this));
        this.mFragmentLifecycleRegistry = new C3219(this, true);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m13320(LIFECYCLE_TAG, new C3168(this, 0));
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC3021(this) { // from class: androidx.fragment.app.飘花落叶言子楪兰哲苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ FragmentActivity f7219;

            {
                this.f7219 = this;
            }

            @Override // androidx.core.util.InterfaceC3021
            public final void accept(Object obj) {
                int i2 = i;
                FragmentActivity fragmentActivity = this.f7219;
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
        addOnNewIntentListener(new InterfaceC3021(this) { // from class: androidx.fragment.app.飘花落叶言子楪兰哲苏世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ FragmentActivity f7219;

            {
                this.f7219 = this;
            }

            @Override // androidx.core.util.InterfaceC3021
            public final void accept(Object obj) {
                int i22 = i2;
                FragmentActivity fragmentActivity = this.f7219;
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
        addOnContextAvailableListener(new InterfaceC8560() { // from class: androidx.fragment.app.飘花落叶言子世楪苏哲兰
            @Override // p188.InterfaceC8560
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo726(ComponentActivity componentActivity) {
                this.f7166.lambda$init$3(componentActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.m5059(Lifecycle$Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m4975();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m4975();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        C3152 c3152 = this.mFragments.f7155;
        c3152.f7165.m4948(c3152, c3152, null);
    }

    private static boolean markState(AbstractC3146 abstractC3146, Lifecycle$State lifecycle$State) {
        boolean zMarkState = false;
        for (AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 : abstractC3146.f7129.m1524()) {
            if (abstractComponentCallbacksC3171 != null) {
                C3152 c3152 = abstractComponentCallbacksC3171.f7242;
                if ((c3152 == null ? null : c3152.f7163) != null) {
                    zMarkState |= markState(abstractComponentCallbacksC3171.m5002(), lifecycle$State);
                }
                C3188 c3188 = abstractComponentCallbacksC3171.f7260;
                if (c3188 != null) {
                    c3188.m5036();
                    if (c3188.f7308.f7364.isAtLeast(Lifecycle$State.STARTED)) {
                        abstractComponentCallbacksC3171.f7260.f7308.m5065(lifecycle$State);
                        zMarkState = true;
                    }
                }
                if (abstractComponentCallbacksC3171.f7264.f7364.isAtLeast(Lifecycle$State.STARTED)) {
                    abstractComponentCallbacksC3171.f7264.m5065(lifecycle$State);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f7155.f7165.f7126.onCreateView(view, str, context, attributeSet);
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
                C3256 viewModelStore = getViewModelStore();
                viewModelStore.getClass();
                C8466 c8466 = C8466.f21070;
                c8466.getClass();
                C1171 c1171 = new C1171(viewModelStore, C8373.f20770, c8466);
                InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8373.class);
                String strMo9444 = interfaceC5925Mo9476.mo9444();
                if (strMo9444 == null) {
                    C6755.m11869("Local and anonymous classes can not be ViewModels");
                    return;
                }
                C1129 c1129 = ((C8373) c1171.m1519("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo9444), interfaceC5925Mo9476)).f20771;
                if (c1129.f1336 > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (c1129.f1336 > 0) {
                        if (c1129.m1417(0) != null) {
                            C3775.m6954();
                            return;
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(c1129.f1337[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            this.mFragments.f7155.f7165.m4955(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC3146 getSupportFragmentManager() {
        return this.mFragments.f7155.f7165;
    }

    @Deprecated
    public AbstractC8375 getSupportLoaderManager() {
        return new C8372(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle$State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m4975();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m5059(Lifecycle$Event.ON_CREATE);
        C3142 c3142 = this.mFragments.f7155.f7165;
        c3142.f7124 = false;
        c3142.f7123 = false;
        c3142.f7113.f7108 = false;
        c3142.m4950(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f7155.f7165.m4964();
        this.mFragmentLifecycleRegistry.m5059(Lifecycle$Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f7155.f7165.m4966();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f7155.f7165.m4950(5);
        this.mFragmentLifecycleRegistry.m5059(Lifecycle$Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m4975();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m4975();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f7155.f7165.m4939(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m5059(Lifecycle$Event.ON_RESUME);
        C3142 c3142 = this.mFragments.f7155.f7165;
        c3142.f7124 = false;
        c3142.f7123 = false;
        c3142.f7113.f7108 = false;
        c3142.m4950(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m4975();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C3142 c3142 = this.mFragments.f7155.f7165;
            c3142.f7124 = false;
            c3142.f7123 = false;
            c3142.f7113.f7108 = false;
            c3142.m4950(4);
        }
        this.mFragments.f7155.f7165.m4939(true);
        this.mFragmentLifecycleRegistry.m5059(Lifecycle$Event.ON_START);
        C3142 c31422 = this.mFragments.f7155.f7165;
        c31422.f7124 = false;
        c31422.f7123 = false;
        c31422.f7113.f7108 = false;
        c31422.m4950(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m4975();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C3142 c3142 = this.mFragments.f7155.f7165;
        c3142.f7123 = true;
        c3142.f7113.f7108 = true;
        c3142.m4950(4);
        this.mFragmentLifecycleRegistry.m5059(Lifecycle$Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC8489 abstractC8489) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(AbstractC8489 abstractC8489) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (abstractComponentCallbacksC3171.f7242 == null) {
            C6385.m11442(abstractComponentCallbacksC3171, "Fragment ", " not attached to Activity");
            return;
        }
        AbstractC3146 abstractC3146M5019 = abstractComponentCallbacksC3171.m5019();
        if (abstractC3146M5019.f7117 != null) {
            abstractC3146M5019.f7114.addLast(new FragmentManager$LaunchedFragmentInfo(abstractComponentCallbacksC3171.f7246, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            abstractC3146M5019.f7117.m13607(intent);
            return;
        }
        C3152 c3152 = abstractC3146M5019.f7136;
        if (i == -1) {
            c3152.f7161.startActivity(intent, bundle);
        } else {
            c3152.getClass();
            C6755.m11870("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (abstractComponentCallbacksC3171.f7242 == null) {
            C6385.m11442(abstractComponentCallbacksC3171, "Fragment ", " not attached to Activity");
            return;
        }
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC3171 + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        AbstractC3146 abstractC3146M5019 = abstractComponentCallbacksC3171.m5019();
        if (abstractC3146M5019.f7116 == null) {
            C3152 c3152 = abstractC3146M5019.f7136;
            if (i == -1) {
                c3152.f7162.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                c3152.getClass();
                C6755.m11870("Starting intent sender with a requestCode requires a FragmentActivity host");
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
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + abstractComponentCallbacksC3171);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        intentSender.getClass();
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
        abstractC3146M5019.f7114.addLast(new FragmentManager$LaunchedFragmentInfo(abstractComponentCallbacksC3171.f7246, i));
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC3171 + "is launching an IntentSender for result ");
        }
        abstractC3146M5019.f7116.m13607(intentSenderRequest);
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
    public void onAttachFragment(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = new C3150(new C3152(this));
        this.mFragmentLifecycleRegistry = new C3219(this, true);
        this.mStopped = true;
        init();
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, Intent intent, int i) {
        startActivityFromFragment(abstractComponentCallbacksC3171, intent, i, (Bundle) null);
    }
}
