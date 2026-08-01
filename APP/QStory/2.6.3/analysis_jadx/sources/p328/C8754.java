package p328;

import androidx.fragment.app.C2358;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4347;
import net.bytebuddy.description.method.MethodDescription;
import p010.C6191;
import p026.AbstractC6314;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世哲苏兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8754 extends AbstractC6314 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final HashSet f24672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public HashSet f24673;

    static {
        String[] strArr = {AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜"), AbstractC8405.m13972(2283)};
        HashSet hashSet = new HashSet(AbstractC4339.m8772(2));
        AbstractC4347.m8848(strArr, hashSet);
        f24672 = hashSet;
    }

    @Override // p026.AbstractC6314
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        String[] strArr = {AbstractC8405.m13972(858) + AbstractC6358.f17507.getPackageName()};
        HashSet hashSet = new HashSet(AbstractC4339.m8772(1));
        AbstractC4347.m8848(strArr, hashSet);
        this.f24673 = hashSet;
        try {
            XposedBridge.hookMethod(File.class.getDeclaredMethod(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵"), null), new C6191(new C2358(this, 28), 1));
        } catch (NoSuchMethodException unused) {
        }
    }
}
