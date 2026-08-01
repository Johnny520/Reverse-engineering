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
import bsh.C2632;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.C3251;
import com.google.gson.C3252;
import java.util.ArrayList;
import kotlin.C5175;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.view.C5548;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import net.bytebuddy.description.method.MethodDescription;
import p257.C8207;
import p331.C8799;
import p335.AbstractC8804;
import p342.C8821;
import p348.InterfaceC8861;
import p349.C8865;
import p352.RunnableC8872;
import p398.C9152;
import top.sacz.xphelper.activity.BaseComposeActivity;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Ltop/suzhelan/qstory/ui/activity/SettingActivity;", "Ltop/sacz/xphelper/activity/BaseComposeActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lkotlin/飘花落叶言子楪兰苏哲世;", "applyImmersiveSystemBars", "", "isDarkModeEnabled", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "hasFocus", "onWindowFocusChanged", "(Z)V", "Companion", "top/suzhelan/qstory/ui/activity/飘花落叶言子楪世苏兰哲", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class SettingActivity extends BaseComposeActivity {
    public static final int $stable = 8;
    public static final C5956 Companion = new C5956();
    private static boolean isSponsorDialog = true;

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImmersiveSystemBars() {
        AbstractC3055.m6621(this);
        AbstractC2267.m4220(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        boolean zIsDarkModeEnabled = isDarkModeEnabled();
        C2215 c2215 = new C2215(getWindow(), getWindow().getDecorView());
        boolean z = !zIsDarkModeEnabled;
        AbstractC2216 abstractC2216 = c2215.f6497;
        abstractC2216.mo4003(z);
        abstractC2216.mo4004(z);
    }

    private final boolean isDarkModeEnabled() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 onCreate$lambda$0(SettingActivity settingActivity, InterfaceC1373 interfaceC1373, int i) {
        AbstractC3056.m6668(-3937273026580841895L);
        C1324 c1324 = (C1324) interfaceC1373;
        if (c1324.m2333(i & 1, (i & 3) != 2)) {
            AbstractC5957.m11277(settingActivity, null, c1324, 0);
        } else {
            c1324.m2329();
        }
        return C5175.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0() {
        C8799 c8799 = new C8799();
        c8799.f24761 = AbstractC3056.m6668(-3937561652678100391L);
        c8799.f24760 = AbstractC3056.m6668(-3937706809687803303L);
        int i = 0;
        c8799.f24759 = 0;
        c8799.f24758 = AbstractC3056.m6668(-3937706809687803303L);
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, AbstractC3056.m6668(-3937706766738130343L));
        if (c87992 != null) {
            c8799 = c87992;
        }
        Integer num = c8799.f24759;
        if (num != null && num.intValue() == 0 && isSponsorDialog) {
            C8865 c8865 = C8865.f24976;
            C3251 c3251 = new C3251();
            c3251.m7347();
            C3252 c3252M7348 = c3251.m7348();
            C0325 c0325 = new C0325(19);
            c0325.m971(AbstractC3056.m6668(-3937274572769068455L));
            C8865.f24976.getClass();
            c0325.f1095 = C8865.m14511(false);
            ((ArrayList) c0325.f1094).add(new C9152(c3252M7348));
            Object objM547 = c0325.m970().m547(InterfaceC8861.class);
            AbstractC3056.m6668(-3937274383790507431L);
            objM547.getClass();
            C8207 c8207 = new C8207();
            c8207.f22615 = AbstractC3056.m6668(-3937326790981453223L);
            c8207.mo13704();
            c8207.mo13703(false);
            c8207.mo13705(AbstractC3056.m6668(-3937326700787140007L));
            c8207.mo13702(AbstractC3056.m6668(-3937326464563938727L), new C5548(4));
            c8207.m13714();
            AbstractC8804.f24777.execute(new RunnableC8872(c8207, i));
            isSponsorDialog = false;
        }
    }

    @Override // top.sacz.xphelper.activity.BaseComposeActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        applyImmersiveSystemBars();
        C8799 c8799 = new C8799();
        c8799.f24761 = AbstractC3056.m6668(-3937561652678100391L);
        c8799.f24760 = AbstractC3056.m6668(-3937706809687803303L);
        c8799.f24759 = 0;
        c8799.f24758 = AbstractC3056.m6668(-3937706809687803303L);
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, AbstractC3056.m6668(-3937706766738130343L));
        if (c87992 != null) {
            c8799 = c87992;
        }
        if (c8799.f24759.intValue() < 0) {
            System.exit(0);
            C2632.m5294(AbstractC3056.m6668(-3937692378597688743L));
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
