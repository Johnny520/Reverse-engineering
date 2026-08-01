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
import com.bumptech.glide.load.engine.C3005;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import net.bytebuddy.description.method.MethodDescription;
import p164.C7665;
import p257.C8208;
import p261.AbstractC8248;
import p277.C8358;
import p336.C8791;
import p385.C9066;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/activity/PluginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/飘花落叶言子楪兰苏哲世;", "onCreate", "(Landroid/os/Bundle;)V", "", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;", "plugins", "updatePlugins", "(Ljava/util/List;)V", "", "message", "showError", "(Ljava/lang/String;)V", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PluginActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C2225 onCreate$lambda$0(View view, C2225 c2225) {
        view.getClass();
        c2225.getClass();
        C7665 c7665Mo4052 = c2225.f6521.mo4052(519);
        c7665Mo4052.getClass();
        view.setPadding(c7665Mo4052.f20810, c7665Mo4052.f20809, c7665Mo4052.f20808, c7665Mo4052.f20807);
        return c2225;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = 0;
        AbstractC0047.m133(this, new C0013(0, 0, new C0016(i)), new C0013(AbstractC0047.f97, AbstractC0047.f96, new C0016(i)));
        setContentView(R.layout.activity_plugin);
        View viewFindViewById = findViewById(R.id.activity_plugin_root);
        C8791 c8791 = new C8791(10);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        AbstractC2193.m4004(viewFindViewById, c8791);
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        AbstractC3738.m8034(this);
        AbstractC8248.f22822 = DialogX$THEME.AUTO;
        AbstractC8248.f22823 = new C8358(1);
        C3005 c3005 = new C3005(this, 5);
        c3005.m6495();
        c3005.m6492();
    }

    public final void showError(String message) {
        message.getClass();
        C8208.m13729(message, "错误");
    }

    public final void updatePlugins(List<C9066> plugins) {
        plugins.getClass();
    }
}
