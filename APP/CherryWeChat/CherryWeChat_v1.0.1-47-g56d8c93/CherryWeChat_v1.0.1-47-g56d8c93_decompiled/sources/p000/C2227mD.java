package p000;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.UpdateInfo;

/* JADX INFO: renamed from: mD */
/* JADX INFO: loaded from: classes.dex */
public final class C2227mD {

    /* JADX INFO: renamed from: a */
    public static final C2227mD f7746a;

    /* JADX INFO: renamed from: b */
    public static final C1251cA f7747b;

    static {
        AbstractC0295Gu.m625r(-463568705157173L);
        AbstractC0295Gu.m625r(-463628834699317L);
        AbstractC0295Gu.m625r(-463706144110645L);
        f7746a = new C2227mD();
        f7747b = new C1251cA(new C1302d(26));
    }

    /* JADX INFO: renamed from: a */
    public static final UpdateInfo m4482a(C2227mD c2227mD, String str) {
        Object objM4550a;
        UpdateInfo updateInfo;
        c2227mD.getClass();
        Object objM4550a2 = null;
        try {
            C0029Am c0029Am = AbstractC2809zm.f9524a;
            c0029Am.getClass();
            objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(UpdateInfo.Companion.serializer()), str);
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-463087668820021L);
            AbstractC0425Jv.m881a(ApiResponse.class).m445b();
            AbstractC0295Gu.m625r(-463753388750901L);
            e.getMessage();
            objM4550a = null;
        }
        ApiResponse apiResponse = (ApiResponse) objM4550a;
        if (apiResponse != null && apiResponse.getCode() == 0 && (updateInfo = (UpdateInfo) apiResponse.getData()) != null) {
            return updateInfo;
        }
        try {
            C0029Am c0029Am2 = AbstractC2809zm.f9524a;
            c0029Am2.getClass();
            objM4550a2 = c0029Am2.m4550a(UpdateInfo.Companion.serializer(), str);
        } catch (Exception e2) {
            AbstractC0295Gu.m625r(-463770568620085L);
            AbstractC0425Jv.m881a(UpdateInfo.class).m445b();
            AbstractC0295Gu.m625r(-463886532737077L);
            e2.getMessage();
        }
        return (UpdateInfo) objM4550a2;
    }

    /* JADX INFO: renamed from: b */
    public static final void m4483b(C2227mD c2227mD, Context context, UpdateInfo updateInfo) {
        c2227mD.getClass();
        try {
            AlertDialog.Builder positiveButton = new AlertDialog.Builder(context, R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-463903712606261L)).setMessage(updateInfo.getReleaseNotes()).setPositiveButton(AbstractC0295Gu.m625r(-463929482410037L), new DialogInterfaceOnClickListenerC0448Kb(context, updateInfo));
            if (!updateInfo.getForceUpdate()) {
                positiveButton.setNeutralButton(AbstractC0295Gu.m625r(-463950957246517L), new DialogInterfaceOnClickListenerC0804So(1));
            }
            positiveButton.setCancelable(!updateInfo.getForceUpdate());
            AlertDialog alertDialogCreate = positiveButton.create();
            C1456gf.m2802T(alertDialogCreate, false);
            alertDialogCreate.show();
            if (updateInfo.getForceUpdate()) {
                alertDialogCreate.setOnDismissListener(new DialogInterfaceOnDismissListenerC0824T7(2, context));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4484c(Context context, boolean z) {
        C1498hd c1498hd = AbstractC1499he.f5282a;
        C2283nk c2283nk = AbstractC1106Zp.f3500a;
        C1419fm c1419fm = new C1419fm();
        c2283nk.getClass();
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1406fG.m2700Z(c2283nk, c1419fm)), new C2184lD(context, z, null), 3);
    }

    /* JADX INFO: renamed from: d */
    public static SharedPreferences m4485d() {
        Object value = f7747b.getValue();
        AbstractC0295Gu.m625r(-463362546726965L);
        return (SharedPreferences) value;
    }
}
