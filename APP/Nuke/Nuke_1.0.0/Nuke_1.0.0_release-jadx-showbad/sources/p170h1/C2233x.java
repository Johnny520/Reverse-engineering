package p170h1;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import p000A.C0072l0;
import p001A0.C0105e;
import p041H0.InterfaceC0614q0;
import p047I0.AbstractC0713b;
import p095T.C1379p;
import p112W2.InterfaceC1601c;
import p152e0.InterfaceC1998e;
import p152e0.InterfaceC1999f;

/* JADX INFO: renamed from: h1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2233x extends AbstractC2218i {

    /* JADX INFO: renamed from: D */
    public final View f7288D;

    /* JADX INFO: renamed from: E */
    public final C0105e f7289E;

    /* JADX INFO: renamed from: F */
    public InterfaceC1998e f7290F;

    /* JADX INFO: renamed from: G */
    public InterfaceC1601c f7291G;

    /* JADX INFO: renamed from: H */
    public InterfaceC1601c f7292H;

    /* JADX INFO: renamed from: I */
    public InterfaceC1601c f7293I;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2233x(Context context, InterfaceC1601c interfaceC1601c, C1379p c1379p, InterfaceC1999f interfaceC1999f, int i5, InterfaceC0614q0 interfaceC0614q0) {
        View view = (View) interfaceC1601c.mo1h(context);
        C0105e c0105e = new C0105e();
        super(context, c1379p, i5, c0105e, view, interfaceC0614q0);
        this.f7288D = view;
        this.f7289E = c0105e;
        setClipChildren(false);
        String strValueOf = String.valueOf(i5);
        Object objMo1277c = interfaceC1999f != null ? interfaceC1999f.mo1277c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo1277c instanceof SparseArray ? (SparseArray) objMo1277c : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC1999f != null) {
            setSavableRegistryEntry(interfaceC1999f.mo1278d(strValueOf, new C2217h(this, 2)));
        }
        C2211b c2211b = C2211b.f7207i;
        this.f7291G = c2211b;
        this.f7292H = c2211b;
        this.f7293I = c2211b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m4035h(C2233x c2233x) {
        c2233x.setSavableRegistryEntry(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setSavableRegistryEntry(InterfaceC1998e interfaceC1998e) {
        InterfaceC1998e interfaceC1998e2 = this.f7290F;
        if (interfaceC1998e2 != null) {
            ((C0072l0) interfaceC1998e2).m96B();
        }
        this.f7290F = interfaceC1998e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0105e getDispatcher() {
        return this.f7289E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1601c getReleaseBlock() {
        return this.f7293I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1601c getResetBlock() {
        return this.f7292H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ /* synthetic */ AbstractC0713b getSubCompositionView() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1601c getUpdateBlock() {
        return this.f7291G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReleaseBlock(InterfaceC1601c interfaceC1601c) {
        this.f7293I = interfaceC1601c;
        setRelease(new C2217h(this, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setResetBlock(InterfaceC1601c interfaceC1601c) {
        this.f7292H = interfaceC1601c;
        setReset(new C2217h(this, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpdateBlock(InterfaceC1601c interfaceC1601c) {
        this.f7291G = interfaceC1601c;
        setUpdate(new C2217h(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
