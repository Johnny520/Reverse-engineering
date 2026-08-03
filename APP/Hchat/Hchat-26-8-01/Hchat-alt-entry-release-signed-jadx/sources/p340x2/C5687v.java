package p340x2;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import p020b5.C0184c;
import p085fg.InterfaceC1231l;
import p117i0.C1828f0;
import p253r1.C3647d;
import p307v0.InterfaceC4365e;
import p307v0.InterfaceC4366f;
import p339x1.InterfaceC5641r1;
import p357y1.AbstractC5858a;

/* JADX INFO: renamed from: x2.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5687v extends AbstractC5673h {

    /* JADX INFO: renamed from: G */
    public final View f23138G;

    /* JADX INFO: renamed from: H */
    public final C3647d f23139H;

    /* JADX INFO: renamed from: I */
    public InterfaceC4365e f23140I;

    /* JADX INFO: renamed from: J */
    public InterfaceC1231l f23141J;

    /* JADX INFO: renamed from: K */
    public InterfaceC1231l f23142K;

    /* JADX INFO: renamed from: L */
    public InterfaceC1231l f23143L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5687v(Context context, InterfaceC1231l interfaceC1231l, C1828f0 c1828f0, InterfaceC4366f interfaceC4366f, int i9, InterfaceC5641r1 interfaceC5641r1) {
        View view = (View) interfaceC1231l.invoke(context);
        C3647d c3647d = new C3647d();
        super(context, c1828f0, i9, c3647d, view, interfaceC5641r1);
        this.f23138G = view;
        this.f23139H = c3647d;
        setClipChildren(false);
        String strValueOf = String.valueOf(i9);
        Object objMo8039d = interfaceC4366f != null ? interfaceC4366f.mo8039d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo8039d instanceof SparseArray ? (SparseArray) objMo8039d : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC4366f != null) {
            setSavableRegistryEntry(interfaceC4366f.mo8040e(strValueOf, new C5672g(this, 2)));
        }
        C5667b c5667b = C5667b.f23062k;
        this.f23141J = c5667b;
        this.f23142K = c5667b;
        this.f23143L = c5667b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m10240h(C5687v c5687v) {
        c5687v.setSavableRegistryEntry(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setSavableRegistryEntry(InterfaceC4365e interfaceC4365e) {
        InterfaceC4365e interfaceC4365e2 = this.f23140I;
        if (interfaceC4365e2 != null) {
            ((C0184c) interfaceC4365e2).m805Z();
        }
        this.f23140I = interfaceC4365e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C3647d getDispatcher() {
        return this.f23139H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1231l getReleaseBlock() {
        return this.f23143L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1231l getResetBlock() {
        return this.f23142K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ /* synthetic */ AbstractC5858a getSubCompositionView() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1231l getUpdateBlock() {
        return this.f23141J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReleaseBlock(InterfaceC1231l interfaceC1231l) {
        this.f23143L = interfaceC1231l;
        setRelease(new C5672g(this, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setResetBlock(InterfaceC1231l interfaceC1231l) {
        this.f23142K = interfaceC1231l;
        setReset(new C5672g(this, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpdateBlock(InterfaceC1231l interfaceC1231l) {
        this.f23141J = interfaceC1231l;
        setUpdate(new C5672g(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
