package top.suzhelan.qstory.p015ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.compose.AbstractC0854;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.layout.C1481;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.compose.p001ui.platform.RunnableC2733;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import androidx.core.view.AbstractC3049;
import androidx.core.view.AbstractC3100;
import androidx.core.view.C3048;
import bsh.C3466;
import com.bumptech.glide.AbstractC3888;
import com.google.gson.C4084;
import com.google.gson.C4085;
import java.util.ArrayList;
import kotlin.C6008;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.view.C6380;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import net.bytebuddy.description.method.MethodDescription;
import p050.AbstractC7176;
import p273.C9037;
import p303.AbstractC9234;
import p351.AbstractC9618;
import p361.C9663;
import p364.InterfaceC9672;
import p371.RunnableC9718;
import p412.C9942;
import top.sacz.xphelper.activity.BaseComposeActivity;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m151d2 = {"Ltop/suzhelan/qstory/ui/activity/SettingActivity;", "Ltop/sacz/xphelper/activity/BaseComposeActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lkotlin/飘花落叶言子楪兰苏哲世;", "applyImmersiveSystemBars", "", "isDarkModeEnabled", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "hasFocus", "onWindowFocusChanged", "(Z)V", "Companion", "top/suzhelan/qstory/ui/activity/飘花落叶言子楪世苏兰哲", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class SettingActivity extends BaseComposeActivity {
    public static final int $stable = 8;
    public static final C6792 Companion = new C6792();
    private static boolean isSponsorDialog = true;

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImmersiveSystemBars() {
        AbstractC7176.m12484(this);
        AbstractC3100.m4790(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        boolean zIsDarkModeEnabled = isDarkModeEnabled();
        C3048 c3048 = new C3048(getWindow(), getWindow().getDecorView());
        boolean z = !zIsDarkModeEnabled;
        AbstractC3049 abstractC3049 = c3048.f6843;
        abstractC3049.mo4573(z);
        abstractC3049.mo4574(z);
    }

    private final boolean isDarkModeEnabled() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 onCreate$lambda$0(SettingActivity settingActivity, InterfaceC2208 interfaceC2208, int i) {
        AbstractC9234.m14531(2873);
        C2159 c2159 = (C2159) interfaceC2208;
        if (c2159.m2903(i & 1, (i & 3) != 2)) {
            AbstractC6793.m11896(settingActivity, null, c2159, 0);
        } else {
            c2159.m2899();
        }
        return C6008.f15084;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0() {
        Integer num = AbstractC3888.m7268().f25085;
        if (num != null && num.intValue() == 0 && isSponsorDialog) {
            C9663 c9663 = C9663.f25281;
            C4084 c4084 = new C4084();
            c4084.m7893();
            C4085 c4085M7894 = c4084.m7894();
            C1171 c1171 = new C1171(19);
            c1171.m1531(AbstractC9234.m14531(2860));
            C9663.f25281.getClass();
            c1171.f1440 = C9663.m15050(false);
            ((ArrayList) c1171.f1439).add(new C9942(c4085M7894));
            Object objM1108 = c1171.m1530().m1108(InterfaceC9672.class);
            AbstractC9234.m14531(2861);
            objM1108.getClass();
            C9037 c9037 = new C9037();
            c9037.f22959 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜呜喵呜喵~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵喵呜~呜呜喵呜喵呜呜喵");
            c9037.mo14280();
            c9037.mo14279(false);
            c9037.mo14281(AbstractC9234.m14531(3140));
            c9037.mo14278(AbstractC9234.m14531(3141), new C6380(4));
            c9037.m14290();
            AbstractC9618.f25101.execute(new RunnableC9718(c9037, 0));
            isSponsorDialog = false;
        }
    }

    @Override // top.sacz.xphelper.activity.BaseComposeActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        applyImmersiveSystemBars();
        if (AbstractC3888.m7268().f25085.intValue() < 0) {
            System.exit(0);
            C3466.m5899(AbstractC9234.m14531(1275));
        } else {
            ItemUiInfoManager.init();
            AbstractC0854.m577(this, new C2077(-601330180, true, new C1481(this, 10)));
            getWindow().getDecorView().post(new RunnableC1945(this, 14));
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        applyImmersiveSystemBars();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2733(5), 500L);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            applyImmersiveSystemBars();
        }
    }
}
