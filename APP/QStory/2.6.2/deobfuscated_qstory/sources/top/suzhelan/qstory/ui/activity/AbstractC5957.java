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
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.api.C3885;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5092;
import p140.AbstractC7534;
import p160.AbstractC7635;
import p160.C7636;
import p351.AbstractC8869;
import p354.C8891;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1242 f16153 = new C1242(1422673372, false, new C0753(25));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11277(SettingActivity settingActivity, C8891 c8891, InterfaceC1373 interfaceC1373, int i) {
        C2422 c2422M8277;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1408755109);
        "C(SettingRoute)N(activity,viewModel)113@4271L4204,113@4259L4216:SettingActivity.kt#itusog";
        int i2 = (c1324.m2368(settingActivity) ? 4 : 2) | i | 16;
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            c1324.m2331();
            "112@4243L11";
            if ((i & 1) == 0 || c1324.m2343()) {
                "CC(viewModel)N(viewModelStoreOwner,key,factory,extras)56@2573L7,67@2981L63:ViewModel.kt#3tja67";
                InterfaceC2421 interfaceC2421M4518 = (InterfaceC2421) c1324.m2373(AbstractC7534.f20421);
                if (interfaceC2421M4518 == null) {
                    c1324.m2382(1260197608);
                    interfaceC2421M4518 = AbstractC2435.m4518((View) c1324.m2373(AbstractC1835.f5331));
                } else {
                    c1324.m2382(1260196492);
                }
                c1324.m2367(false);
                if (interfaceC2421M4518 == null) {
                    C5919.m11251("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                boolean z = interfaceC2421M4518 instanceof InterfaceC2405;
                AbstractC7635 defaultViewModelCreationExtras = z ? ((InterfaceC2405) interfaceC2421M4518).getDefaultViewModelCreationExtras() : C7636.f20730;
                InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C8891.class);
                AbstractC2425 abstractC2425M958 = null;
                if (z) {
                    C2423 viewModelStore = interfaceC2421M4518.getViewModelStore();
                    InterfaceC2427 defaultViewModelProviderFactory = ((InterfaceC2405) interfaceC2421M4518).getDefaultViewModelProviderFactory();
                    viewModelStore.getClass();
                    defaultViewModelProviderFactory.getClass();
                    defaultViewModelCreationExtras.getClass();
                    c2422M8277 = new C2422(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                } else {
                    c2422M8277 = C3885.m8277(interfaceC2421M4518, null, 6);
                }
                interfaceC5092Mo8927.getClass();
                C0325 c0325 = (C0325) c2422M8277.f7065;
                String strMo8895 = interfaceC5092Mo8927.mo8895();
                if (strMo8895 != null) {
                    abstractC2425M958 = c0325.m958("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8895), interfaceC5092Mo8927);
                } else {
                    C5919.m11249("Local and anonymous classes can not be ViewModels");
                }
                c8891 = (C8891) abstractC2425M958;
            } else {
                c1324.m2329();
            }
            c1324.m2364();
            AbstractC8869.m14516(false, AbstractC1254.m2179(1371912813, new C5955(c8891, settingActivity), c1324), c1324, 384);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C5955(settingActivity, c8891, i);
        }
    }
}
