package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: ki */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2148ki extends AbstractActivityC0833Ta implements InterfaceC0560N0 {

    /* JADX INFO: renamed from: u */
    public final C0132D2 f7513u;

    /* JADX INFO: renamed from: v */
    public final C1185ao f7514v;

    /* JADX INFO: renamed from: w */
    public boolean f7515w;

    /* JADX INFO: renamed from: x */
    public boolean f7516x;

    /* JADX INFO: renamed from: y */
    public boolean f7517y;

    public AbstractActivityC2148ki() {
        final AbstractActivityC1244c3 r1 = (AbstractActivityC1244c3) this;
        int r3 = 23;
        this.f7513u = new C0132D2(r3, new C2104ji(r1));
        this.f7514v = new C1185ao(this);
        this.f7517y = true;
        getSavedStateRegistry().m2898c("android:support:lifecycle", new C0361Ia(1, r1));
        final int r2 = 0;
        addOnConfigurationChangedListener(new C1546ii(r1, r2));
        final int r22 = 1;
        addOnNewIntentListener(new C1546ii(r1, r22));
        addOnContextAvailableListener(new C0404Ja(r1, r22));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4333a(AbstractC2805zi r7) {
        Iterator r72 = r7.f9494c.m4882t().iterator();
        boolean r0 = false;
    L4:
        if (r72.hasNext() == false) goto L22;
        AbstractComponentCallbacksC1503hi r1 = (AbstractComponentCallbacksC1503hi) r72.next();
        if (r1 == null) goto L4;
        C2104ji r2 = r1.f5328s;
        if (r2 != null) goto L11;
        AbstractActivityC1244c3 r22 = null;
    L12:
        if (r22 == null) goto L14;
        r0 = r0 | m4333a(r1.m2869c());
    L14:
        C0498Li r23 = r1.f5305N;
        EnumC0675Pn r4 = EnumC0675Pn.f2149c;
        EnumC0675Pn r6 = EnumC0675Pn.f2150d;
        if (r23 == null) goto L20;
        r23.m962b();
        if (r23.f1631d.f4064c.m1371a(r6) == false) goto L20;
        C1185ao r02 = r1.f5305N.f1631d;
        r02.m2275d("setCurrentState");
        r02.m2277f(r4);
        r0 = true;
    L20:
        if (r1.f5304M.f4064c.m1371a(r6) == false) goto L4;
        C1185ao r03 = r1.f5304M;
        r03.m2275d("setCurrentState");
        r03.m2277f(r4);
        r0 = true;
        goto L4
    L11:
        r22 = r2.f7404p;
        goto L12
    L22:
        return r0;
    }

    public final View dispatchFragmentsOnCreateView(View r2, String r3, Context r4, AttributeSet r5) {
        return ((C2104ji) this.f7513u.f328b).f7403o.f9497f.onCreateView(r2, r3, r4, r5);
    }

    @Override // android.app.Activity
    public void dump(String r10, FileDescriptor r11, PrintWriter r12, String[] r13) {
        super.dump(r10, r11, r12, r13);
        if (shouldDumpInternalState(r13) == true) goto L5;
        return;
    L5:
        r12.print(r10);
        r12.print("Local FragmentActivity ");
        r12.print(Integer.toHexString(System.identityHashCode(this)));
        r12.println(" State:");
        String r0 = r10 + "  ";
        r12.print(r0);
        r12.print("mCreated=");
        r12.print(this.f7515w);
        r12.print(" mResumed=");
        r12.print(this.f7516x);
        r12.print(" mStopped=");
        r12.print(this.f7517y);
        if (getApplication() == null) goto L32;
        C2709xE r1 = getViewModelStore();
        C2098jc r2 = C2098jc.f7385b;
        String r4 = C0719Qo.class.getCanonicalName();
        if (r4 == null) goto L31;
        String r42 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r4);
        AbstractC2580uE r5 = (AbstractC2580uE) r1.f9284a.get(r42);
        boolean r6 = C0719Qo.class.isInstance(r5);
        C0111Ci r8 = C0719Qo.f2303e;
        if (r6 == true) goto L19;
        C2557ts r52 = new C2557ts(r2);
        r52.m5044a(C1456gf.f5170n, r42);
        AbstractC2580uE r22 = r8.mo2563b(C0719Qo.class, r52);     // Catch: AbstractMethodError -> L15
    L14:
        r5 = r22;
        AbstractC2580uE r14 = (AbstractC2580uE) r1.f9284a.put(r42, r5);
        if (r14 == null) goto L19;
        r14.mo297b();
    L15:
        r22 = r8.mo171a(C0719Qo.class);
    L19:
        C0471Ky r15 = ((C0719Qo) r5).f2304d;
        if (r15.f1531c <= 0) goto L32;
        r12.print(r0);
        r12.println("Loaders:");
        if (r15.f1531c <= 0) goto L32;
        if (r15.f1530b[0] != null) goto L29;
        r12.print(r0);
        r12.print("  #");
        r12.print(r15.f1529a[0]);
        r12.print(": ");
        throw null;
    L29:
        throw new ClassCastException();
    L31:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    L32:
        ((C2104ji) this.f7513u.f328b).f7403o.m5424v(r10, r11, r12, r13);
    }

    public AbstractC2805zi getSupportFragmentManager() {
        return ((C2104ji) this.f7513u.f328b).f7403o;
    }

    @Deprecated
    public AbstractC0676Po getSupportLoaderManager() {
        return new C0761Ro(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
    L3:
        if (m4333a(getSupportFragmentManager()) == true) goto L3;
    }

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity
    public void onActivityResult(int r2, int r3, Intent r4) {
        this.f7513u.m248w();
        super.onActivityResult(r2, r3, r4);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC1503hi r1) {
    }

    @Override // p000.AbstractActivityC0833Ta, p000.AbstractActivityC0790Sa, android.app.Activity
    public void onCreate(Bundle r3) {
        super.onCreate(r3);
        this.f7514v.m2276e(EnumC0632On.ON_CREATE);
        C0025Ai r32 = ((C2104ji) this.f7513u.f328b).f7403o;
        r32.f9483F = false;
        r32.f9484G = false;
        r32.f9490M.f418i = false;
        r32.m5422t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View r2, String r3, Context r4, AttributeSet r5) {
        View r0 = dispatchFragmentsOnCreateView(r2, r3, r4, r5);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return super.onCreateView(r2, r3, r4, r5);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C2104ji) this.f7513u.f328b).f7403o.m5413k();
        this.f7514v.m2276e(EnumC0632On.ON_DESTROY);
    }

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, MenuItem r2) {
        if (super.onMenuItemSelected(r1, r2) == false) goto L7;
        return true;
    L7:
        if (r1 == 6) goto L9;
        return false;
    L9:
        return ((C2104ji) this.f7513u.f328b).f7403o.m5411i();
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
    public void onRequestPermissionsResult(int r2, String[] r3, int[] r4) {
        this.f7513u.m248w();
        super.onRequestPermissionsResult(r2, r3, r4);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0132D2 r0 = this.f7513u;
        r0.m248w();
        super.onResume();
        this.f7516x = true;
        ((C2104ji) r0.f328b).f7403o.m5427y(true);
    }

    public void onResumeFragments() {
        this.f7514v.m2276e(EnumC0632On.ON_RESUME);
        C0025Ai r0 = ((C2104ji) this.f7513u.f328b).f7403o;
        r0.f9483F = false;
        r0.f9484G = false;
        r0.f9490M.f418i = false;
        r0.m5422t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        C0132D2 r0 = this.f7513u;
        r0.m248w();
        C2104ji r02 = (C2104ji) r0.f328b;
        super.onStart();
        this.f7517y = false;
        if (this.f7515w == true) goto L5;
        this.f7515w = true;
        C0025Ai r2 = r02.f7403o;
        r2.f9483F = false;
        r2.f9484G = false;
        r2.f9490M.f418i = false;
        r2.m5422t(4);
    L5:
        r02.f7403o.m5427y(true);
        this.f7514v.m2276e(EnumC0632On.ON_START);
        C0025Ai r03 = r02.f7403o;
        r03.f9483F = false;
        r03.f9484G = false;
        r03.f9490M.f418i = false;
        r03.m5422t(5);
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
        C0025Ai r1 = ((C2104ji) this.f7513u.f328b).f7403o;
        r1.f9484G = true;
        r1.f9490M.f418i = true;
        r1.m5422t(4);
        this.f7514v.m2276e(EnumC0632On.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC1387ey r1) {
        setEnterSharedElementCallback(null);
    }

    public void setExitSharedElementCallback(AbstractC1387ey r1) {
        setExitSharedElementCallback(null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC1503hi r4, Intent r5, int r6, Bundle r7) {
        if (r6 != (-1)) goto L7;
        startActivityForResult(r5, -1, r7);
        return;
    L7:
        if (r4.f5328s == null) goto L22;
        AbstractC2805zi r1 = r4.m2872f();
        if (r1.f9478A == null) goto L15;
        r1.f9481D.addLast(new C2676wi(r4.f5314e, r6));
        if (r7 == null) goto L13;
        r5.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", r7);
    L13:
        r1.f9478A.m2318a(r5);
        return;
    L15:
        C2104ji r42 = r1.f9512u;
        if (r6 != (-1)) goto L19;
        r42.f7401m.startActivity(r5, r7);
        return;
    L19:
        r42.getClass();
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    L22:
        throw new IllegalStateException("Fragment " + r4 + " not attached to Activity");
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC1503hi r10, IntentSender r11, int r12, Intent r13, int r14, int r15, int r16, Bundle r17) {
        if (r12 != (-1)) goto L7;
        startIntentSenderForResult(r11, r12, r13, r14, r15, r16, r17);
        return;
    L7:
        if (r10.f5328s == null) goto L32;
        if (AbstractC2805zi.m5374G(2) == false) goto L11;
        r10.toString();
        Objects.toString(r11);
        Objects.toString(r13);
        Objects.toString(r17);
    L11:
        AbstractC2805zi r3 = r10.m2872f();
        if (r3.f9479B == null) goto L25;
        if (r17 == null) goto L20;
        if (r13 != null) goto L17;
        r13 = new Intent();
        r13.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
    L17:
        if (AbstractC2805zi.m5374G(2) == false) goto L19;
        r17.toString();
        r13.toString();
        Objects.toString(r10);
    L19:
        r13.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", r17);
    L20:
        C0372Il r4 = new C0372Il(r11, r13, r14, r15);
        r3.f9481D.addLast(new C2676wi(r10.f5314e, r12));
        if (AbstractC2805zi.m5374G(2) == false) goto L23;
        r10.toString();
    L23:
        r3.f9479B.m2318a(r4);
        return;
    L25:
        C2104ji r102 = r3.f9512u;
        if (r12 != (-1)) goto L29;
        r102.f7400l.startIntentSenderForResult(r11, r12, r13, r14, r15, r16, r17);
        return;
    L29:
        r102.getClass();
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    L32:
        throw new IllegalStateException("Fragment " + r10 + " not attached to Activity");
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
    public final void validateRequestPermissionsRequestCode(int r1) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String r2, Context r3, AttributeSet r4) {
        View r0 = dispatchFragmentsOnCreateView(null, r2, r3, r4);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return super.onCreateView(r2, r3, r4);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC1503hi r2, Intent r3, int r4) {
        startActivityFromFragment(r2, r3, r4, null);
    }
}
