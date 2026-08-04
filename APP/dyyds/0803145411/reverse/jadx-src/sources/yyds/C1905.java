package yyds;

import android.content.ComponentName;
import android.widget.Toast;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛸᲇᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1905 implements InterfaceC1376 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f9641;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9642;

    public /* synthetic */ C1905(MainActivity mainActivity, boolean z) {
        this.f9641 = mainActivity;
        this.f9642 = z;
    }

    @Override // yyds.InterfaceC1376
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo912(AbstractC0041 abstractC0041) {
        Object c2658;
        MainActivity mainActivity = this.f9641;
        List list = MainActivity.f451;
        try {
            mainActivity.getPackageManager().setComponentEnabledSetting((ComponentName) mainActivity.f476.getValue(), this.f9642 ? 1 : 2, 1);
            c2658 = C2746.f13459;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            String strM4341 = AbstractC2328.m4341(-270848800490350L);
            String message = thM4249.getMessage();
            if (message == null) {
                message = AbstractC2328.m4341(-270891750163310L);
            }
            Toast.makeText(mainActivity, strM4341.concat(message), 0).show();
        }
        return false;
    }
}
