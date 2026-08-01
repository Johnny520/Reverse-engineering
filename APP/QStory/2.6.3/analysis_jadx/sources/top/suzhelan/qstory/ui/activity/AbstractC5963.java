package top.suzhelan.qstory.ui.activity;

import android.view.View;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.lazy.C0753;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.platform.AbstractC1835;
import androidx.lifecycle.AbstractC2425;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.C2422;
import androidx.lifecycle.C2423;
import androidx.lifecycle.InterfaceC2405;
import androidx.lifecycle.InterfaceC2421;
import androidx.lifecycle.InterfaceC2427;
import io.ktor.client.plugins.api.C3886;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5093;
import p140.AbstractC7535;
import p160.AbstractC7636;
import p160.C7637;
import p287.AbstractC8405;
import p350.C8859;
import p351.AbstractC8861;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5963 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1242 f16162 = new C1242(1422673372, false, new C0753(25));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11337(SettingActivity settingActivity, C8859 c8859, InterfaceC1373 interfaceC1373, int i) {
        C2422 c2422M8263;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1408755109);
        AbstractC8405.m13972(2897);
        int i2 = (c1324.m2378(settingActivity) ? 4 : 2) | i | 16;
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            c1324.m2341();
            AbstractC8405.m13972(2898);
            if ((i & 1) == 0 || c1324.m2353()) {
                AbstractC8405.m13972(2899);
                InterfaceC2421 interfaceC2421M4528 = (InterfaceC2421) c1324.m2383(AbstractC7535.f20416);
                if (interfaceC2421M4528 == null) {
                    c1324.m2392(1260197608);
                    interfaceC2421M4528 = AbstractC2435.m4528((View) c1324.m2383(AbstractC1835.f5332));
                } else {
                    c1324.m2392(1260196492);
                }
                c1324.m2377(false);
                if (interfaceC2421M4528 == null) {
                    C5925.m11312(AbstractC8405.m13972(2900));
                    return;
                }
                boolean z = interfaceC2421M4528 instanceof InterfaceC2405;
                AbstractC7636 defaultViewModelCreationExtras = z ? ((InterfaceC2405) interfaceC2421M4528).getDefaultViewModelCreationExtras() : C7637.f20725;
                InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C8859.class);
                AbstractC2425 abstractC2425M959 = null;
                if (z) {
                    C2423 viewModelStore = interfaceC2421M4528.getViewModelStore();
                    InterfaceC2427 defaultViewModelProviderFactory = ((InterfaceC2405) interfaceC2421M4528).getDefaultViewModelProviderFactory();
                    viewModelStore.getClass();
                    defaultViewModelProviderFactory.getClass();
                    defaultViewModelCreationExtras.getClass();
                    c2422M8263 = new C2422(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                } else {
                    c2422M8263 = C3886.m8263(interfaceC2421M4528, null, 6);
                }
                interfaceC5093Mo8917.getClass();
                C0325 c0325 = (C0325) c2422M8263.f7066;
                String strMo8885 = interfaceC5093Mo8917.mo8885();
                if (strMo8885 != null) {
                    abstractC2425M959 = c0325.m959("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8885), interfaceC5093Mo8917);
                } else {
                    C5925.m11310("Local and anonymous classes can not be ViewModels");
                }
                c8859 = (C8859) abstractC2425M959;
            } else {
                c1324.m2339();
            }
            c1324.m2374();
            AbstractC8861.m14523(false, AbstractC1254.m2189(1371912813, new C5961(c8859, settingActivity), c1324), c1324, 384);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C5961(settingActivity, c8859, i);
        }
    }
}
