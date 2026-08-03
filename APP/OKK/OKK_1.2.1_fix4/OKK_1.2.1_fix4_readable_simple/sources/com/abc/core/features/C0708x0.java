package com.abc.core.features;

import android.app.Activity;
import android.widget.SeekBar;
import android.widget.TextView;
import com.abc.core.runtime.SettingsUiBuilder;
import com.abc.internal.probe.AbstractC0567q;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.x0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0708x0 implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2228b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2229c;

    public /* synthetic */ C0708x0(Object r1, Object r2, int r3) {
        this.f2227a = r3;
        this.f2228b = r1;
        this.f2229c = r2;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        switch(this.f2227a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        SeekBar r7 = (SeekBar) this.f2228b;
        AbstractC0307g.m703e(r7, "$seek");
        Activity r6 = (Activity) this.f2229c;
        AbstractC0307g.m703e(r6, "$host");
        SettingsUiBuilder r8 = SettingsUiBuilder.f2933a;
        int r72 = r7.getProgress();
        C0709x1 r82 = RoundAvatarHook.f2212b;
        float r1 = AbstractC0040p.m110o((AbstractC0040p.m111p(r72, 0, 45) / 100.0f) + 0.05f, 0.05f, 0.5f);
        ConfigStore.f2048a.m1666f("round_avatar_radius", String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(r1)}, 1)), false);
        SettingsUiBuilder.m2105z(r6, "已保存圆度 " + r1);
        return C0146l.f339a;
    L6:
        SeekBar r02 = (SeekBar) this.f2228b;
        AbstractC0307g.m703e(r02, "$seek");
        TextView r62 = (TextView) this.f2229c;
        AbstractC0307g.m703e(r62, "$valueLabel");
        SettingsUiBuilder r73 = SettingsUiBuilder.f2933a;
        C0709x1 r74 = RoundAvatarHook.f2212b;
        r02.setProgress(AbstractC0040p.m111p((int) (((AbstractC0040p.m110o(0.36f, 0.05f, 0.5f) - 0.05f) * 100.0f) + 0.5f), 0, 45));
        r62.setText(SettingsUiBuilder.m2085e(0.36f));
        return C0146l.f339a;
    L8:
        ClassLoader r12 = (ClassLoader) this.f2228b;
        String r2 = (String) this.f2229c;
        AbstractC0307g.m703e(r12, "$classLoader");
        String r3 = HomeAvatarHook.f1734l;
        String r63 = null;
        if ((!AbstractC0425j.m1013R0(r3)) == true) goto L11;
    L13:
        r3 = null;
    L14:
        if (r3 != null) goto L31;
        AtomicReference r32 = AbstractC0567q.f1676a;     // Catch: Throwable -> L17
        Object r13 = AbstractC0567q.m1381d(HomeAvatarHook.f1727e, r12, r2);     // Catch: Throwable -> L17
    L20:
        if ((r13 instanceof C0140f) == false) goto L22;
        r13 = null;
    L22:
        String r14 = (String) r13;
        if (r14 != null) goto L25;
    L27:
        if (r63 != null) goto L34;
        return "我";
    L34:
        return r63;
    L25:
        if ((true ^ AbstractC0425j.m1013R0(r14)) == false) goto L27;
        r63 = r14;
    L17:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
        goto L20
    L31:
        return r3;
    L11:
        if (r3.equals("我") == true) goto L13;
        goto L13
    }
}
