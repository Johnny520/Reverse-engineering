package p000;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

/* JADX INFO: renamed from: ki */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2148ki extends AbstractActivityC0833Ta implements InterfaceC0560N0 {

    /* JADX INFO: renamed from: u */
    public final C0132D2 f7513u;

    /* JADX INFO: renamed from: w */
    public boolean f7515w;

    /* JADX INFO: renamed from: x */
    public boolean f7516x;

    /* JADX INFO: renamed from: v */
    public final C1185ao f7514v = new C1185ao(this);

    /* JADX INFO: renamed from: y */
    public boolean f7517y = true;

    public AbstractActivityC2148ki() {
        final AbstractActivityC1244c3 abstractActivityC1244c3 = (AbstractActivityC1244c3) this;
        this.f7513u = new C0132D2(23, new C2104ji(abstractActivityC1244c3));
        getSavedStateRegistry().m2898c("android:support:lifecycle", new C0361Ia(1, abstractActivityC1244c3));
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC2583ub() { // from class: ii
            @Override // p000.InterfaceC2583ub
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        abstractActivityC1244c3.f7513u.m248w();
                        break;
                    default:
                        abstractActivityC1244c3.f7513u.m248w();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new InterfaceC2583ub() { // from class: ii
            @Override // p000.InterfaceC2583ub
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        abstractActivityC1244c3.f7513u.m248w();
                        break;
                    default:
                        abstractActivityC1244c3.f7513u.m248w();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new C0404Ja(abstractActivityC1244c3, i2));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4333a(AbstractC2805zi abstractC2805zi) {
        boolean zM4333a = false;
        for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : abstractC2805zi.f9494c.m4882t()) {
            if (abstractComponentCallbacksC1503hi != null) {
                C2104ji c2104ji = abstractComponentCallbacksC1503hi.f5328s;
                if ((c2104ji == null ? null : c2104ji.f7404p) != null) {
                    zM4333a |= m4333a(abstractComponentCallbacksC1503hi.m2869c());
                }
                C0498Li c0498Li = abstractComponentCallbacksC1503hi.f5305N;
                EnumC0675Pn enumC0675Pn = EnumC0675Pn.f2149c;
                EnumC0675Pn enumC0675Pn2 = EnumC0675Pn.f2150d;
                if (c0498Li != null) {
                    c0498Li.m962b();
                    if (c0498Li.f1631d.f4064c.m1371a(enumC0675Pn2)) {
                        C1185ao c1185ao = abstractComponentCallbacksC1503hi.f5305N.f1631d;
                        c1185ao.m2275d("setCurrentState");
                        c1185ao.m2277f(enumC0675Pn);
                        zM4333a = true;
                    }
                }
                if (abstractComponentCallbacksC1503hi.f5304M.f4064c.m1371a(enumC0675Pn2)) {
                    C1185ao c1185ao2 = abstractComponentCallbacksC1503hi.f5304M;
                    c1185ao2.m2275d("setCurrentState");
                    c1185ao2.m2277f(enumC0675Pn);
                    zM4333a = true;
                }
            }
        }
        return zM4333a;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return ((C2104ji) this.f7513u.f328b).f7403o.f9497f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AbstractC2580uE abstractC2580uEMo171a;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f7515w);
            printWriter.print(" mResumed=");
            printWriter.print(this.f7516x);
            printWriter.print(" mStopped=");
            printWriter.print(this.f7517y);
            if (getApplication() != null) {
                C2709xE viewModelStore = getViewModelStore();
                C2098jc c2098jc = C2098jc.f7385b;
                String canonicalName = C0719Qo.class.getCanonicalName();
                if (canonicalName == null) {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
                AbstractC2580uE abstractC2580uE = (AbstractC2580uE) viewModelStore.f9284a.get(strConcat);
                boolean zIsInstance = C0719Qo.class.isInstance(abstractC2580uE);
                C0111Ci c0111Ci = C0719Qo.f2303e;
                if (!zIsInstance) {
                    C2557ts c2557ts = new C2557ts(c2098jc);
                    c2557ts.m5044a(C1456gf.f5170n, strConcat);
                    try {
                        abstractC2580uEMo171a = c0111Ci.mo2563b(C0719Qo.class, c2557ts);
                    } catch (AbstractMethodError unused) {
                        abstractC2580uEMo171a = c0111Ci.mo171a(C0719Qo.class);
                    }
                    abstractC2580uE = abstractC2580uEMo171a;
                    AbstractC2580uE abstractC2580uE2 = (AbstractC2580uE) viewModelStore.f9284a.put(strConcat, abstractC2580uE);
                    if (abstractC2580uE2 != null) {
                        abstractC2580uE2.mo297b();
                    }
                }
                C0471Ky c0471Ky = ((C0719Qo) abstractC2580uE).f2304d;
                if (c0471Ky.f1531c > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (c0471Ky.f1531c > 0) {
                        if (c0471Ky.f1530b[0] != null) {
                            throw new ClassCastException();
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(c0471Ky.f1529a[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            ((C2104ji) this.f7513u.f328b).f7403o.m5424v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC2805zi getSupportFragmentManager() {
        return ((C2104ji) this.f7513u.f328b).f7403o;
    }

    @Deprecated
    public AbstractC0676Po getSupportLoaderManager() {
        return new C0761Ro(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        while (m4333a(getSupportFragmentManager())) {
        }
    }

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f7513u.m248w();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
    }

    @Override // p000.AbstractActivityC0833Ta, p000.AbstractActivityC0790Sa, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7514v.m2276e(EnumC0632On.ON_CREATE);
        C0025Ai c0025Ai = ((C2104ji) this.f7513u.f328b).f7403o;
        c0025Ai.f9483F = false;
        c0025Ai.f9484G = false;
        c0025Ai.f9490M.f418i = false;
        c0025Ai.m5422t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C2104ji) this.f7513u.f328b).f7403o.m5413k();
        this.f7514v.m2276e(EnumC0632On.ON_DESTROY);
    }

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C2104ji) this.f7513u.f328b).f7403o.m5411i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f7516x = false;
        ((C2104ji) this.f7513u.f328b).f7403o.m5422t(5);
        this.f7514v.m2276e(EnumC0632On.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f7513u.m248w();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0132D2 c0132d2 = this.f7513u;
        c0132d2.m248w();
        super.onResume();
        this.f7516x = true;
        ((C2104ji) c0132d2.f328b).f7403o.m5427y(true);
    }

    public void onResumeFragments() {
        this.f7514v.m2276e(EnumC0632On.ON_RESUME);
        C0025Ai c0025Ai = ((C2104ji) this.f7513u.f328b).f7403o;
        c0025Ai.f9483F = false;
        c0025Ai.f9484G = false;
        c0025Ai.f9490M.f418i = false;
        c0025Ai.m5422t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        C0132D2 c0132d2 = this.f7513u;
        c0132d2.m248w();
        C2104ji c2104ji = (C2104ji) c0132d2.f328b;
        super.onStart();
        this.f7517y = false;
        if (!this.f7515w) {
            this.f7515w = true;
            C0025Ai c0025Ai = c2104ji.f7403o;
            c0025Ai.f9483F = false;
            c0025Ai.f9484G = false;
            c0025Ai.f9490M.f418i = false;
            c0025Ai.m5422t(4);
        }
        c2104ji.f7403o.m5427y(true);
        this.f7514v.m2276e(EnumC0632On.ON_START);
        C0025Ai c0025Ai2 = c2104ji.f7403o;
        c0025Ai2.f9483F = false;
        c0025Ai2.f9484G = false;
        c0025Ai2.f9490M.f418i = false;
        c0025Ai2.m5422t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f7513u.m248w();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f7517y = true;
        markFragmentsCreated();
        C0025Ai c0025Ai = ((C2104ji) this.f7513u.f328b).f7403o;
        c0025Ai.f9484G = true;
        c0025Ai.f9490M.f418i = true;
        c0025Ai.m5422t(4);
        this.f7514v.m2276e(EnumC0632On.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC1387ey abstractC1387ey) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(AbstractC1387ey abstractC1387ey) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (abstractComponentCallbacksC1503hi.f5328s == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC1503hi + " not attached to Activity");
        }
        AbstractC2805zi abstractC2805ziM2872f = abstractComponentCallbacksC1503hi.m2872f();
        if (abstractC2805ziM2872f.f9478A != null) {
            abstractC2805ziM2872f.f9481D.addLast(new C2676wi(abstractComponentCallbacksC1503hi.f5314e, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            abstractC2805ziM2872f.f9478A.m2318a(intent);
            return;
        }
        C2104ji c2104ji = abstractC2805ziM2872f.f9512u;
        if (i == -1) {
            c2104ji.f7401m.startActivity(intent, bundle);
        } else {
            c2104ji.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (abstractComponentCallbacksC1503hi.f5328s == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC1503hi + " not attached to Activity");
        }
        if (AbstractC2805zi.m5374G(2)) {
            abstractComponentCallbacksC1503hi.toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        AbstractC2805zi abstractC2805ziM2872f = abstractComponentCallbacksC1503hi.m2872f();
        if (abstractC2805ziM2872f.f9479B == null) {
            C2104ji c2104ji = abstractC2805ziM2872f.f9512u;
            if (i == -1) {
                c2104ji.f7400l.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                c2104ji.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (AbstractC2805zi.m5374G(2)) {
                bundle.toString();
                intent.toString();
                Objects.toString(abstractComponentCallbacksC1503hi);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C0372Il c0372Il = new C0372Il(intentSender, intent, i2, i3);
        abstractC2805ziM2872f.f9481D.addLast(new C2676wi(abstractComponentCallbacksC1503hi.f5314e, i));
        if (AbstractC2805zi.m5374G(2)) {
            abstractComponentCallbacksC1503hi.toString();
        }
        abstractC2805ziM2872f.f9479B.m2318a(c0372Il);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // p000.InterfaceC0560N0
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, Intent intent, int i) {
        startActivityFromFragment(abstractComponentCallbacksC1503hi, intent, i, (Bundle) null);
    }
}
