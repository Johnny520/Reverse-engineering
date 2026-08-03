package com.abc.core.runtime;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import com.abc.core.features.ConfigStore;
import com.abc.core.features.VirtualLocationHook;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0139e;
import p007D0.C0146l;
import p009E0.AbstractC0182m;
import p026N0.AbstractC0270k;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0431p;

/* JADX INFO: renamed from: f0.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0843v implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3047c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3048d;

    public /* synthetic */ C0843v(Object r1, Object r2, Object r3, int r4) {
        this.f3045a = r4;
        this.f3046b = r1;
        this.f3047c = r2;
        this.f3048d = r3;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        int r02 = 0;
        C0146l r4 = C0146l.f339a;
        Object r5 = this.f3048d;
        Object r6 = this.f3047c;
        Object r7 = this.f3046b;
        switch(this.f3045a) {
            case 0: goto L83;
            case 1: goto L50;
            case 2: goto L38;
            default: goto L4;
        };
    L4:
        EnumC0796G r72 = (EnumC0796G) r7;
        AbstractC0307g.m703e(r72, "$cat");
        List r62 = (List) r6;
        AbstractC0307g.m703e(r62, "$sections");
        Map r52 = (Map) r5;
        AbstractC0307g.m703e(r52, "$countLabels");
        Iterator r1 = r62.iterator();
    L6:
        if (r1.hasNext() == false) goto L10;
        Object r2 = r1.next();
        if (((C0139e) r2).f328a != r72) goto L6;
    L11:
        C0139e r22 = (C0139e) r2;
        if (r22 == null) goto L37;
        List r12 = (List) r22.f329b;
        if (r12 == null) goto L37;
        if (r12.isEmpty() == true) goto L29;
        Iterator r23 = r12.iterator();
    L21:
        if (r23.hasNext() == false) goto L29;
        C0797H r63 = (C0797H) r23.next();
        ConfigStore r8 = ConfigStore.f2048a;
        if (ConfigStore.m1661c(r63.f2894c, r63.f2895d) == false) goto L21;
        r02 = r02 + 1;
        if (r02 >= 0) goto L21;
        AbstractC0182m.m557i0();
        throw null;
    L29:
        TextView r24 = (TextView) r52.get(r72);
        if (r24 == null) goto L37;
        r24.setText(r02 + " / " + r12.size() + " 已开启");
        if (r02 <= 0) goto L35;
        int r03 = SettingsUiBuilder.f2942j;
    L36:
        r24.setTextColor(r03);
        goto L37
    L35:
        r03 = SettingsUiBuilder.f2940h;
    L37:
        return r4;
    L10:
        r2 = null;
        goto L11
    L38:
        Activity r04 = (Activity) r7;
        AbstractC0307g.m703e(r04, "$host");
        C0798I r64 = (C0798I) r6;
        AbstractC0307g.m703e(r64, "$lat");
        C0798I r53 = (C0798I) r5;
        AbstractC0307g.m703e(r53, "$lon");
        C0139e r13 = VirtualLocationHook.f1854a.m1495b(r04);
        Double r25 = AbstractC0431p.m1024y0(r64.f2899b.getText().toString());
        if (r25 == null) goto L42;
        double r26 = r25.doubleValue();
    L41:
        double r65 = r26;
        Double r27 = AbstractC0431p.m1024y0(r53.f2899b.getText().toString());
        if (r27 == null) goto L47;
        double r14 = r27.doubleValue();
    L48:
        VirtualLocationHook.m1494i(true, r65, r14, r04, false);
        SettingsUiBuilder r15 = SettingsUiBuilder.f2933a;
        SettingsUiBuilder.m2105z(r04, "已保存坐标并激活");
        return r4;
    L47:
        r14 = ((Number) r13.f329b).doubleValue();
        goto L48
    L42:
        r26 = ((Number) r13.f328a).doubleValue();
        goto L41
    L50:
        Activity r122 = (Activity) r7;
        AbstractC0307g.m703e(r122, "$host");
        C0798I r66 = (C0798I) r6;
        AbstractC0307g.m703e(r66, "$lat");
        C0798I r54 = (C0798I) r5;
        AbstractC0307g.m703e(r54, "$lon");
        SettingsUiBuilder r16 = SettingsUiBuilder.f2933a;
        C0139e r17 = VirtualLocationHook.f1854a.m1495b(r122);
        EditText r28 = r66.f2899b;
        Double r3 = AbstractC0431p.m1024y0(r28.getText().toString());
        if (r3 == null) goto L53;
        double r67 = r3.doubleValue();
    L54:
        EditText r32 = r54.f2899b;
        Double r55 = AbstractC0431p.m1024y0(r32.getText().toString());
        if (r55 == null) goto L57;
        double r82 = r55.doubleValue();
    L58:
        VirtualLocationHook.m1494i(true, r67, r82, r122, false);
        r122.startActivityForResult(new Intent(r122, Class.forName("com.tencent.mm.plugin.location.ui.RedirectUI", false, r122.getClassLoader())).putExtra("map_view_type", 8), 44039);     // Catch: Throwable -> L64
        SettingsUiBuilder.m2105z(r122, "请在地图上选择位置");     // Catch: Throwable -> L64
        if (r122.isFinishing() == true) goto L63;
        r122.getWindow().getDecorView().postDelayed(new RunnableC0845x(r28, r32, r122, 0), 500);     // Catch: Throwable -> L64
    L63:
        Object r05 = r4;
    L67:
        if (AbstractC0141g.m465a(r05) == null) goto L82;
        VirtualLocationHook r06 = VirtualLocationHook.f1854a;
        File r18 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_request");
        File r33 = r18.getParentFile();     // Catch: Throwable -> L72
        if (r33 == null) goto L74;
        r33.mkdirs();     // Catch: Throwable -> L72
    L74:
        AbstractC0270k.m693j0(r18, "ts=" + System.currentTimeMillis() + "\n", AbstractC0416a.f921a);     // Catch: Throwable -> L72
    L88:
        new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_result").delete();     // Catch: Throwable -> L79
    L81:
        SettingsUiBuilder.m2105z(r122, "已发送选点请求，请在微信中确认");
    L79:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L72:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L82:
        return r4;
    L64:
        th = move-exception;
        r05 = AbstractC0040p.m116u(th);
        goto L67
    L57:
        r82 = ((Number) r17.f329b).doubleValue();
        goto L58
    L53:
        r67 = ((Number) r17.f328a).doubleValue();
        goto L54
    L83:
        Activity r73 = (Activity) r7;
        AbstractC0307g.m703e(r73, "$host");
        C0798I r68 = (C0798I) r6;
        AbstractC0307g.m703e(r68, "$lat");
        C0798I r56 = (C0798I) r5;
        AbstractC0307g.m703e(r56, "$lon");
        VirtualLocationHook r07 = VirtualLocationHook.f1854a;
        C0139e r08 = VirtualLocationHook.m1493h(r73);
        SettingsUiBuilder r19 = SettingsUiBuilder.f2933a;
        if (r08 != null) goto L86;
        SettingsUiBuilder.m2105z(r73, "无法获取当前位置，请开启系统定位权限");
    L87:
        return r4;
    L86:
        r68.f2899b.setText(VirtualLocationHook.m1488c(((Number) r08.f328a).doubleValue()));
        r56.f2899b.setText(VirtualLocationHook.m1488c(((Number) r08.f329b).doubleValue()));
        SettingsUiBuilder.m2105z(r73, "已自动填入");
        goto L87
    }
}
