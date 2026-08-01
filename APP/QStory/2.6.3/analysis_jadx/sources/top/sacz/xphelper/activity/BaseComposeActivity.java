package top.sacz.xphelper.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p382.C9000;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ltop/sacz/xphelper/activity/BaseComposeActivity;", "Landroidx/activity/ComponentActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/lang/ClassLoader;", "getClassLoader", "()Ljava/lang/ClassLoader;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/飘花落叶言子楪兰苏哲世;", "onRestoreInstanceState", "(Landroid/os/Bundle;)V", "onCreate", "L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世哲苏兰;", "mLoader", "L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世哲苏兰;", "xphelper_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseComposeActivity extends ComponentActivity {
    private final C9000 mLoader;

    public BaseComposeActivity() {
        ClassLoader classLoader = BaseComposeActivity.class.getClassLoader();
        classLoader.getClass();
        this.mLoader = new C9000(classLoader);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        return this.mLoader;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC3056.m6687(this);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        savedInstanceState.getClass();
        Bundle bundle = savedInstanceState.getBundle("android:viewHierarchyState");
        if (bundle != null) {
            bundle.setClassLoader(this.mLoader);
        }
        super.onRestoreInstanceState(savedInstanceState);
    }
}
