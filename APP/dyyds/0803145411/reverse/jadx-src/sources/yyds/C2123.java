package yyds;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2123 implements InterfaceC0251, InterfaceC2208 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f10474;

    public /* synthetic */ C2123(MainActivity mainActivity) {
        this.f10474 = mainActivity;
    }

    @Override // yyds.InterfaceC0251
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public void mo901(AbstractC0041 abstractC0041) {
        List list = MainActivity.f451;
        this.f10474.m312();
    }

    @Override // yyds.InterfaceC2208
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public C2693 mo1441(View view, C2693 c2693) {
        List list = MainActivity.f451;
        AbstractC2328.m4341(-271609009701742L);
        AbstractC2328.m4341(-271630484538222L);
        C1870 c1870Mo2800 = c2693.f13242.mo2800(647);
        AbstractC2328.m4341(-271660549309294L);
        int i = c1870Mo2800.f9413;
        int i2 = c1870Mo2800.f9414;
        MainActivity mainActivity = this.f10474;
        view.setPadding(i, mainActivity.m315(8) + i2, c1870Mo2800.f9415, 0);
        mainActivity.f464 = c1870Mo2800.f9416;
        mainActivity.m319();
        return c2693;
    }
}
