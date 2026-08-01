package p344;

import androidx.fragment.app.C3191;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5179;
import net.bytebuddy.description.method.MethodDescription;
import p026.C7020;
import p042.AbstractC7143;
import p052.AbstractC7187;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世哲苏兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C9583 extends AbstractC7143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final HashSet f25017;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public HashSet f25018;

    static {
        String[] strArr = {"QStory", "qs_config"};
        HashSet hashSet = new HashSet(AbstractC5171.m9331(2));
        AbstractC5179.m9407(strArr, hashSet);
        f25017 = hashSet;
    }

    @Override // p042.AbstractC7143
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        String[] strArr = {"/Android/data/" + AbstractC7187.f17852.getPackageName()};
        HashSet hashSet = new HashSet(AbstractC5171.m9331(1));
        AbstractC5179.m9407(strArr, hashSet);
        this.f25018 = hashSet;
        try {
            XposedBridge.hookMethod(File.class.getDeclaredMethod("list", null), new C7020(new C3191(this, 28), 1));
        } catch (NoSuchMethodException unused) {
        }
    }
}
