package androidx.lifecycle;

import android.view.View;
import p003a2.C0014a;
import p036c9.C0416a1;
import p080fb.AbstractC1184v0;
import p099h.Hchat.R;

/* JADX INFO: renamed from: androidx.lifecycle.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0098d0 {

    /* JADX INFO: renamed from: a */
    public static final C0014a f282a = new C0014a(3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0112q m543a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC0112q interfaceC0112q = tag instanceof InterfaceC0112q ? (InterfaceC0112q) tag : null;
            if (interfaceC0112q != null) {
                return interfaceC0112q;
            }
            Object objM3210t = AbstractC1184v0.m3210t(view);
            view = objM3210t instanceof View ? (View) objM3210t : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C0416a1 m544b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            C0416a1 c0416a1 = tag instanceof C0416a1 ? (C0416a1) tag : null;
            if (c0416a1 != null) {
                return c0416a1;
            }
            Object objM3210t = AbstractC1184v0.m3210t(view);
            view = objM3210t instanceof View ? (View) objM3210t : null;
        }
        return null;
    }
}
