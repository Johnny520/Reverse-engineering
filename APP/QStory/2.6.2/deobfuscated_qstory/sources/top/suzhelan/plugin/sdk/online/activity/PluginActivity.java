package top.suzhelan.plugin.sdk.online.activity;

import android.os.Bundle;
import android.view.View;
import androidx.activity.AbstractC0047;
import androidx.activity.C0013;
import androidx.activity.C0016;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import com.bumptech.glide.load.engine.C3004;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p033.AbstractC6325;
import p164.C7664;
import p257.C8207;
import p257.C8226;
import p257.RunnableC8233;
import p261.AbstractC8247;
import p277.C8357;
import p319.C8684;
import p319.C8685;
import p330.C8796;
import p388.C9099;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/activity/PluginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/飘花落叶言子楪兰苏哲世;", "onCreate", "(Landroid/os/Bundle;)V", "", "L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲;", "plugins", "updatePlugins", "(Ljava/util/List;)V", "", "message", "showError", "(Ljava/lang/String;)V", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PluginActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C2225 onCreate$lambda$0(View view, C2225 c2225) {
        view.getClass();
        c2225.getClass();
        C7664 c7664Mo4042 = c2225.f6520.mo4042(519);
        c7664Mo4042.getClass();
        view.setPadding(c7664Mo4042.f20815, c7664Mo4042.f20814, c7664Mo4042.f20813, c7664Mo4042.f20812);
        return c2225;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = 0;
        AbstractC0047.m133(this, new C0013(0, 0, new C0016(i)), new C0013(AbstractC0047.f97, AbstractC0047.f96, new C0016(i)));
        setContentView(R.layout.activity_plugin);
        View viewFindViewById = findViewById(R.id.activity_plugin_root);
        C8796 c8796 = new C8796(12);
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        AbstractC2193.m3994(viewFindViewById, c8796);
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        AbstractC3737.m8047(this);
        AbstractC8247.f22823 = DialogX$THEME.AUTO;
        AbstractC8247.f22824 = new C8357(1);
        C3004 c3004 = new C3004(this, 5);
        C8226 c8226 = (C8226) c3004.f9535;
        c8226.f22707 = new C8684(c3004, (byte) 0);
        if (c8226.f22709 != null) {
            AbstractC3737.m8043(new RunnableC8233(c8226, i));
        }
        C8685 c8685 = new C8685(c3004, 4);
        c8226.f22701 = c8685;
        if (c8226.f11579) {
            c8685.mo8079(c8226.f22702);
        }
        c8226.m13733();
    }

    public final void showError(String message) {
        message.getClass();
        C8207.m13712(message, "错误");
    }

    public final void updatePlugins(List<C9099> plugins) {
        plugins.getClass();
    }
}
