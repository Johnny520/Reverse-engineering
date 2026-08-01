package top.suzhelan.qstory.p015ui.activity;

import android.view.View;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.lazy.C1594;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import androidx.lifecycle.AbstractC3258;
import androidx.lifecycle.AbstractC3268;
import androidx.lifecycle.C3255;
import androidx.lifecycle.C3256;
import androidx.lifecycle.InterfaceC3238;
import androidx.lifecycle.InterfaceC3254;
import androidx.lifecycle.InterfaceC3260;
import io.ktor.client.plugins.api.C4718;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import p156.AbstractC8364;
import p176.AbstractC8465;
import p176.C8466;
import p303.AbstractC9234;
import p366.C9688;
import p367.AbstractC9690;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6793 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2077 f16507 = new C2077(1422673372, false, new C1594(25));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11896(SettingActivity settingActivity, C9688 c9688, InterfaceC2208 interfaceC2208, int i) {
        C3255 c3255M8822;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1408755109);
        AbstractC9234.m14531(2897);
        int i2 = (c2159.m2938(settingActivity) ? 4 : 2) | i | 16;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            c2159.m2901();
            AbstractC9234.m14531(2898);
            if ((i & 1) == 0 || c2159.m2913()) {
                AbstractC9234.m14531(2899);
                InterfaceC3254 interfaceC3254M5088 = (InterfaceC3254) c2159.m2943(AbstractC8364.f20761);
                if (interfaceC3254M5088 == null) {
                    c2159.m2952(1260197608);
                    interfaceC3254M5088 = AbstractC3268.m5088((View) c2159.m2943(AbstractC2670.f5677));
                } else {
                    c2159.m2952(1260196492);
                }
                c2159.m2937(false);
                if (interfaceC3254M5088 == null) {
                    C6755.m11871(AbstractC9234.m14531(2900));
                    return;
                }
                boolean z = interfaceC3254M5088 instanceof InterfaceC3238;
                AbstractC8465 defaultViewModelCreationExtras = z ? ((InterfaceC3238) interfaceC3254M5088).getDefaultViewModelCreationExtras() : C8466.f21070;
                InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C9688.class);
                AbstractC3258 abstractC3258M1519 = null;
                if (z) {
                    C3256 viewModelStore = interfaceC3254M5088.getViewModelStore();
                    InterfaceC3260 defaultViewModelProviderFactory = ((InterfaceC3238) interfaceC3254M5088).getDefaultViewModelProviderFactory();
                    viewModelStore.getClass();
                    defaultViewModelProviderFactory.getClass();
                    defaultViewModelCreationExtras.getClass();
                    c3255M8822 = new C3255(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                } else {
                    c3255M8822 = C4718.m8822(interfaceC3254M5088, null, 6);
                }
                interfaceC5925Mo9476.getClass();
                C1171 c1171 = (C1171) c3255M8822.f7411;
                String strMo9444 = interfaceC5925Mo9476.mo9444();
                if (strMo9444 != null) {
                    abstractC3258M1519 = c1171.m1519("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo9444), interfaceC5925Mo9476);
                } else {
                    C6755.m11869("Local and anonymous classes can not be ViewModels");
                }
                c9688 = (C9688) abstractC3258M1519;
            } else {
                c2159.m2899();
            }
            c2159.m2934();
            AbstractC9690.m15082(false, AbstractC2089.m2749(1371912813, new C6791(c9688, settingActivity), c2159), c2159, 384);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C6791(settingActivity, c9688, i);
        }
    }
}
