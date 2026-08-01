package p327;

import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4346;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p010.C6160;
import p026.AbstractC6296;
import p035.AbstractC6340;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世哲苏兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8772 extends AbstractC6296 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final HashSet f24708;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public HashSet f24709;

    static {
        String[] strArr = {"QStory", "qs_config"};
        HashSet hashSet = new HashSet(AbstractC4338.m8779(2));
        AbstractC4346.m8854(strArr, hashSet);
        f24708 = hashSet;
    }

    @Override // p026.AbstractC6296
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        String[] strArr = {AbstractC6136.m11557(-3937648509801727399L, new StringBuilder(), AbstractC6340.f17460.getPackageName())};
        HashSet hashSet = new HashSet(AbstractC4338.m8779(1));
        AbstractC4346.m8854(strArr, hashSet);
        this.f24709 = hashSet;
        try {
            XposedBridge.hookMethod(File.class.getDeclaredMethod("list", null), new C6160(new C2358(this, 27), 1));
        } catch (NoSuchMethodException unused) {
        }
    }
}
