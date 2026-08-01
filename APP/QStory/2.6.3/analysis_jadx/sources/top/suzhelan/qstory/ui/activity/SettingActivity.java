package top.suzhelan.qstory.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.compose.AbstractC0007;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.layout.C0640;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.platform.RunnableC1898;
import androidx.core.view.AbstractC2216;
import androidx.core.view.AbstractC2267;
import androidx.core.view.C2215;
import bsh.C2633;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.C3252;
import com.google.gson.C3253;
import java.util.ArrayList;
import kotlin.C5176;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.view.C5549;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import net.bytebuddy.description.method.MethodDescription;
import p034.AbstractC6347;
import p257.C8208;
import p287.AbstractC8405;
import p335.AbstractC8789;
import p345.C8834;
import p348.InterfaceC8843;
import p355.RunnableC8889;
import p396.C9113;
import top.sacz.xphelper.activity.BaseComposeActivity;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Ltop/suzhelan/qstory/ui/activity/SettingActivity;", "Ltop/sacz/xphelper/activity/BaseComposeActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lkotlin/飘花落叶言子楪兰苏哲世;", "applyImmersiveSystemBars", "", "isDarkModeEnabled", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "hasFocus", "onWindowFocusChanged", "(Z)V", "Companion", "top/suzhelan/qstory/ui/activity/飘花落叶言子楪世苏兰哲", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class SettingActivity extends BaseComposeActivity {
    public static final int $stable = 8;
    public static final C5962 Companion = new C5962();
    private static boolean isSponsorDialog = true;

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImmersiveSystemBars() {
        AbstractC6347.m11925(this);
        AbstractC2267.m4230(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        boolean zIsDarkModeEnabled = isDarkModeEnabled();
        C2215 c2215 = new C2215(getWindow(), getWindow().getDecorView());
        boolean z = !zIsDarkModeEnabled;
        AbstractC2216 abstractC2216 = c2215.f6498;
        abstractC2216.mo4013(z);
        abstractC2216.mo4014(z);
    }

    private final boolean isDarkModeEnabled() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 onCreate$lambda$0(SettingActivity settingActivity, InterfaceC1373 interfaceC1373, int i) {
        AbstractC8405.m13972(2873);
        C1324 c1324 = (C1324) interfaceC1373;
        if (c1324.m2343(i & 1, (i & 3) != 2)) {
            AbstractC5963.m11337(settingActivity, null, c1324, 0);
        } else {
            c1324.m2339();
        }
        return C5176.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0() {
        Integer num = AbstractC3056.m6708().f24740;
        if (num != null && num.intValue() == 0 && isSponsorDialog) {
            C8834 c8834 = C8834.f24936;
            C3252 c3252 = new C3252();
            c3252.m7334();
            C3253 c3253M7335 = c3252.m7335();
            C0325 c0325 = new C0325(19);
            c0325.m971(AbstractC8405.m13972(2860));
            C8834.f24936.getClass();
            c0325.f1095 = C8834.m14491(false);
            ((ArrayList) c0325.f1094).add(new C9113(c3253M7335));
            Object objM548 = c0325.m970().m548(InterfaceC8843.class);
            AbstractC8405.m13972(2861);
            objM548.getClass();
            C8208 c8208 = new C8208();
            c8208.f22614 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜喵呜喵~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵喵呜~呜呜喵呜喵呜呜喵");
            c8208.mo13721();
            c8208.mo13720(false);
            c8208.mo13722(AbstractC8405.m13972(3140));
            c8208.mo13719(AbstractC8405.m13972(3141), new C5549(4));
            c8208.m13731();
            AbstractC8789.f24756.execute(new RunnableC8889(c8208, 0));
            isSponsorDialog = false;
        }
    }

    @Override // top.sacz.xphelper.activity.BaseComposeActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        applyImmersiveSystemBars();
        if (AbstractC3056.m6708().f24740.intValue() < 0) {
            System.exit(0);
            C2633.m5339(AbstractC8405.m13972(1275));
        } else {
            ItemUiInfoManager.init();
            AbstractC0007.m17(this, new C1242(-601330180, true, new C0640(this, 10)));
            getWindow().getDecorView().post(new RunnableC1107(this, 14));
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        applyImmersiveSystemBars();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1898(5), 500L);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            applyImmersiveSystemBars();
        }
    }
}
