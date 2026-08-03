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

    public /* synthetic */ C0708x0(Object obj, Object obj2, int i2) {
        this.f2227a = i2;
        this.f2228b = obj;
        this.f2229c = obj2;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        Object objM116u;
        switch (this.f2227a) {
            case 0:
                ClassLoader classLoader = (ClassLoader) this.f2228b;
                String str = (String) this.f2229c;
                AbstractC0307g.m703e(classLoader, "$classLoader");
                String str2 = HomeAvatarHook.f1734l;
                String str3 = null;
                if (!(!AbstractC0425j.m1013R0(str2)) || str2.equals("我")) {
                    str2 = null;
                }
                if (str2 == null) {
                    try {
                        AtomicReference atomicReference = AbstractC0567q.f1676a;
                        objM116u = AbstractC0567q.m1381d(HomeAvatarHook.f1727e, classLoader, str);
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    if (objM116u instanceof C0140f) {
                        objM116u = null;
                    }
                    String str4 = (String) objM116u;
                    if (str4 != null && (true ^ AbstractC0425j.m1013R0(str4))) {
                        str3 = str4;
                    }
                    if (str3 != null) {
                        break;
                    }
                }
                break;
            case 1:
                SeekBar seekBar = (SeekBar) this.f2228b;
                AbstractC0307g.m703e(seekBar, "$seek");
                TextView textView = (TextView) this.f2229c;
                AbstractC0307g.m703e(textView, "$valueLabel");
                SettingsUiBuilder settingsUiBuilder = SettingsUiBuilder.f2933a;
                C0709x1 c0709x1 = RoundAvatarHook.f2212b;
                seekBar.setProgress(AbstractC0040p.m111p((int) (((AbstractC0040p.m110o(0.36f, 0.05f, 0.5f) - 0.05f) * 100.0f) + 0.5f), 0, 45));
                textView.setText(SettingsUiBuilder.m2085e(0.36f));
                break;
            default:
                SeekBar seekBar2 = (SeekBar) this.f2228b;
                AbstractC0307g.m703e(seekBar2, "$seek");
                Activity activity = (Activity) this.f2229c;
                AbstractC0307g.m703e(activity, "$host");
                SettingsUiBuilder settingsUiBuilder2 = SettingsUiBuilder.f2933a;
                int progress = seekBar2.getProgress();
                C0709x1 c0709x12 = RoundAvatarHook.f2212b;
                float fM110o = AbstractC0040p.m110o((AbstractC0040p.m111p(progress, 0, 45) / 100.0f) + 0.05f, 0.05f, 0.5f);
                ConfigStore.f2048a.m1666f("round_avatar_radius", String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(fM110o)}, 1)), false);
                SettingsUiBuilder.m2105z(activity, "已保存圆度 " + fM110o);
                break;
        }
        return C0146l.f339a;
    }
}
