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
    public static final C2227mD f7746a = null;

    /* JADX INFO: renamed from: b */
    public static final C1251cA f7747b = null;

    static {
        AbstractC0295Gu.m625r(-463568705157173L);
        AbstractC0295Gu.m625r(-463628834699317L);
        AbstractC0295Gu.m625r(-463706144110645L);
        f7746a = new C2227mD();
        f7747b = new C1251cA(new C1302d(26));
    }

    /* JADX INFO: renamed from: a */
    public static final UpdateInfo m4482a(C2227mD r3, String r4) {
        r3.getClass();
        Object r32 = null;
        C0029Am r0 = AbstractC2809zm.f9524a;     // Catch: Exception -> L5
        r0.getClass();     // Catch: Exception -> L5
        Object r02 = r0.m4550a(ApiResponse.Companion.serializer(UpdateInfo.Companion.serializer()), r4);     // Catch: Exception -> L5
    L7:
        ApiResponse r03 = (ApiResponse) r02;
        if (r03 != null) goto L10;
    L20:
        C0029Am r04 = AbstractC2809zm.f9524a;     // Catch: Exception -> L16
        r04.getClass();     // Catch: Exception -> L16
        r32 = r04.m4550a(UpdateInfo.Companion.serializer(), r4);     // Catch: Exception -> L16
    L19:
        return (UpdateInfo) r32;
    L16:
        e = move-exception;
        AbstractC0295Gu.m625r(-463770568620085L);
        AbstractC0425Jv.m881a(UpdateInfo.class).m445b();
        AbstractC0295Gu.m625r(-463886532737077L);
        e.getMessage();
        goto L19
    L10:
        if (r03.getCode() != 0) goto L20;
        UpdateInfo r05 = (UpdateInfo) r03.getData();
        if (r05 == null) goto L20;
        return r05;
    L5:
        e = move-exception;
        AbstractC0295Gu.m625r(-463087668820021L);
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();
        AbstractC0295Gu.m625r(-463753388750901L);
        e.getMessage();
        r02 = null;
        goto L7
    }

    /* JADX INFO: renamed from: b */
    public static final void m4483b(C2227mD r3, Context r4, UpdateInfo r5) {
        r3.getClass();
        AlertDialog.Builder r32 = new AlertDialog.Builder(r4, R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-463903712606261L)).setMessage(r5.getReleaseNotes()).setPositiveButton(AbstractC0295Gu.m625r(-463929482410037L), new DialogInterfaceOnClickListenerC0448Kb(r4, r5));     // Catch: Exception -> L10
        if (r5.getForceUpdate() == true) goto L6;
        r32.setNeutralButton(AbstractC0295Gu.m625r(-463950957246517L), new DialogInterfaceOnClickListenerC0804So(1));     // Catch: Exception -> L10
    L6:
        r32.setCancelable(!r5.getForceUpdate());     // Catch: Exception -> L10
        AlertDialog r33 = r32.create();     // Catch: Exception -> L10
        C1456gf.m2802T(r33, false);     // Catch: Exception -> L10
        r33.show();     // Catch: Exception -> L10
        if (r5.getForceUpdate() == false) goto L13;
        r33.setOnDismissListener(new DialogInterfaceOnDismissListenerC0824T7(2, r4));     // Catch: Exception -> L10
        return;
    L13:
        return;
    }

    /* JADX INFO: renamed from: c */
    public static void m4484c(Context r3, boolean r4) {
        C1498hd r0 = AbstractC1499he.f5282a;
        C2283nk r02 = AbstractC1106Zp.f3500a;
        C1419fm r1 = new C1419fm();
        r02.getClass();
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1406fG.m2700Z(r02, r1)), new C2184lD(r3, r4, null), 3);
    }

    /* JADX INFO: renamed from: d */
    public static SharedPreferences m4485d() {
        Object r0 = f7747b.getValue();
        AbstractC0295Gu.m625r(-463362546726965L);
        return (SharedPreferences) r0;
    }
}
