package top.suzhelan.plugin.sdk.online.activity;

import android.os.Bundle;
import android.view.View;
import androidx.activity.AbstractC0894;
import androidx.activity.C0860;
import androidx.activity.C0863;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import com.bumptech.glide.load.engine.C3837;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import net.bytebuddy.description.method.MethodDescription;
import p180.C8494;
import p273.C9037;
import p277.AbstractC9077;
import p293.C9187;
import p352.C9620;
import p401.C9895;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m151d2 = {"Ltop/suzhelan/plugin/sdk/online/activity/PluginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/飘花落叶言子楪兰苏哲世;", "onCreate", "(Landroid/os/Bundle;)V", "", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;", "plugins", "updatePlugins", "(Ljava/util/List;)V", "", "message", "showError", "(Ljava/lang/String;)V", "online-plugin-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class PluginActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3058 onCreate$lambda$0(View view, C3058 c3058) {
        view.getClass();
        c3058.getClass();
        C8494 c8494Mo4612 = c3058.f6866.mo4612(519);
        c8494Mo4612.getClass();
        view.setPadding(c8494Mo4612.f21155, c8494Mo4612.f21154, c8494Mo4612.f21153, c8494Mo4612.f21152);
        return c3058;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = 0;
        AbstractC0894.m693(this, new C0860(0, 0, new C0863(i)), new C0860(AbstractC0894.f442, AbstractC0894.f441, new C0863(i)));
        setContentView(C0328R.layout.activity_plugin);
        View viewFindViewById = findViewById(C0328R.id.activity_plugin_root);
        C9620 c9620 = new C9620(10);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        AbstractC3026.m4564(viewFindViewById, c9620);
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        AbstractC4570.m8593(this);
        AbstractC9077.f23167 = DialogX$THEME.AUTO;
        AbstractC9077.f23168 = new C9187(1);
        C3837 c3837 = new C3837(this, 5);
        c3837.m7055();
        c3837.m7052();
    }

    public final void showError(String message) {
        message.getClass();
        C9037.m14288(message, "错误");
    }

    public final void updatePlugins(List<C9895> plugins) {
        plugins.getClass();
    }
}
