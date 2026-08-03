package p357y1;

import android.view.View;
import p069f.AbstractC0957r0;
import p069f.C0943k0;
import p099h.Hchat.R;
import p117i0.AbstractC1863o;

/* JADX INFO: renamed from: y1.v2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5945v2 {

    /* JADX INFO: renamed from: a */
    public static final C0943k0 f24167a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long[] jArr = AbstractC0957r0.f3015a;
        f24167a = new C0943k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final AbstractC1863o m10671a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC1863o) {
            return (AbstractC1863o) tag;
        }
        return null;
    }
}
