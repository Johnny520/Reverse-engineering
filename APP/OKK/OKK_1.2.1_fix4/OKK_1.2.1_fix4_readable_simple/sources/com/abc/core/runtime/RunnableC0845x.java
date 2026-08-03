package com.abc.core.runtime;

import android.app.Activity;
import android.widget.EditText;
import com.abc.core.features.C0570A;
import com.abc.core.features.VirtualLocationHook;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0140f;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p040V0.C0401d;
import p040V0.C0402e;
import p040V0.C0403f;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0431p;

/* JADX INFO: renamed from: f0.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0845x implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EditText f3052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f3053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f3054c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3055d;

    public /* synthetic */ RunnableC0845x(EditText r1, EditText r2, Activity r3, int r4) {
        this.f3052a = r1;
        this.f3053b = r2;
        this.f3054c = r3;
        this.f3055d = r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    public final void run() {
        EditText r1 = this.f3052a;
        AbstractC0307g.m703e(r1, "$latIn");
        EditText r2 = this.f3053b;
        AbstractC0307g.m703e(r2, "$lonIn");
        Activity r3 = this.f3054c;
        AbstractC0307g.m703e(r3, "$host");
        VirtualLocationHook r4 = VirtualLocationHook.f1854a;
        File r5 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_result");
        C0139e r7 = null;
        if (r5.isFile() == true) goto L51;
    L39:
        SettingsUiBuilder r42 = SettingsUiBuilder.f2933a;
        if (r7 == null) goto L42;
        double r52 = ((Number) r7.f328a).doubleValue();
        double r72 = ((Number) r7.f329b).doubleValue();
        VirtualLocationHook r02 = VirtualLocationHook.f1854a;
        r1.setText(VirtualLocationHook.m1488c(r52));
        r2.setText(VirtualLocationHook.m1488c(r72));
        VirtualLocationHook.m1494i(true, r52, r72, r3, false);
        SettingsUiBuilder.m2105z(r3, "选点成功");
        return;
    L42:
        int r43 = this.f3055d + 1;
        if (r43 <= 40) goto L45;
        return;
    L45:
        if (r3.isFinishing() == true) goto L56;
        r3.getWindow().getDecorView().postDelayed(new RunnableC0845x(r1, r2, r3, r43), 500);
        return;
    L56:
        return;
    L51:
        C0402e r8 = new C0402e(new C0403f(AbstractC0425j.m1014S0(AbstractC0270k.m692i0(r5, AbstractC0416a.f921a)), new C0570A(26)), true, new C0570A(27));     // Catch: Throwable -> L10
        ?? r6 = new LinkedHashMap();     // Catch: Throwable -> L10
        C0401d r9 = new C0401d(r8);     // Catch: Throwable -> L10
    L6:
        if (r9.hasNext() == false) goto L12;
        String r82 = (String) r9.next();     // Catch: Throwable -> L10
        int r10 = AbstractC0425j.m1010O0(r82, '=', 0, false, 6);     // Catch: Throwable -> L10
        String r11 = r82.substring(0, r10);     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r11, "substring(...)");     // Catch: Throwable -> L10
        String r83 = r82.substring(r10 + 1);     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r83, "substring(...)");     // Catch: Throwable -> L10
        r6.put(r11, r83);     // Catch: Throwable -> L10
    L12:
        boolean r44 = r6 instanceof C0140f;
        ?? r62 = r6;
        if (r44 == false) goto L15;
        r62 = 0;
    L15:
        Map r63 = (Map) r62;
        if (r63 == null) goto L39;
        String r45 = (String) r63.get("lat");
        if (r45 == null) goto L39;
        Double r46 = AbstractC0431p.m1024y0(r45);
        if (r46 == null) goto L39;
        double r84 = r46.doubleValue();
        String r64 = (String) r63.get("lon");
        if (r64 == null) goto L39;
        Double r65 = AbstractC0431p.m1024y0(r64);
        if (r65 == null) goto L39;
        double r102 = r65.doubleValue();
        if ((-90.0d) > r84) goto L39;
        if (r84 > 90.0d) goto L39;
        if ((-180.0d) > r102) goto L39;
        if (r102 > 180.0d) goto L39;
        r5.delete();     // Catch: Throwable -> L36
    L38:
        r7 = new C0139e(r46, r65);
    L36:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L10:
        th = move-exception;
        r6 = AbstractC0040p.m116u(th);
        goto L12
    }
}
