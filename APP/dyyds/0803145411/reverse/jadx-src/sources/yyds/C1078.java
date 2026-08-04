package yyds;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: renamed from: yyds.ᛵᛴᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1078 implements InterfaceC2038 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f4965;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1941 f4966;

    public C1078(Context context, C1941 c1941) {
        this.f4965 = context.getApplicationContext();
        this.f4966 = c1941;
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo1202() {
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final void mo1203() {
        C1424 c1424M2890 = C1424.m2890(this.f4965);
        C1941 c1941 = this.f4966;
        synchronized (c1424M2890) {
            ((HashSet) c1424M2890.f6734).add(c1941);
            c1424M2890.m2894();
        }
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1204() {
        C1424 c1424M2890 = C1424.m2890(this.f4965);
        C1941 c1941 = this.f4966;
        synchronized (c1424M2890) {
            ((HashSet) c1424M2890.f6734).remove(c1941);
            if (c1424M2890.f6735 && ((HashSet) c1424M2890.f6734).isEmpty()) {
                C2115 c2115 = (C2115) c1424M2890.f6732;
                ((ConnectivityManager) ((C0716) c2115.f10456).get()).unregisterNetworkCallback((C0750) c2115.f10457);
                c1424M2890.f6735 = false;
            }
        }
    }
}
