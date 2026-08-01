package p005;

import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import lin.xposed.hook.util.qq.QQEnvTool;
import net.bytebuddy.description.method.MethodDescription;
import p024.AbstractC6309;
import p337.AbstractC8803;
import top.suzhelan.qstory.hook.item.C5954;

/* JADX INFO: renamed from: 飘花落叶言世兰哲蝶花舞.蝶恋花, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"L飘花落叶言世兰哲蝶花舞/蝶恋花;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "兰雨蝶梦凌", "", "苏雨花似柔情", "", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C6116 {
    public static final int $stable = 0;
    public static final C6116 INSTANCE = new C6116();

    private C6116() {
    }

    /* JADX INFO: renamed from: 兰雨蝶梦凌, reason: contains not printable characters */
    public static final boolean m11512() {
        Object obj = AbstractC6309.f17424.get(C5954.class);
        obj.getClass();
        return ((AbstractC8803) obj).mo11252(AbstractC3056.m6708());
    }

    /* JADX INFO: renamed from: 苏雨花似柔情, reason: contains not printable characters */
    public static final String m11513() {
        String currentUin = QQEnvTool.getCurrentUin();
        currentUin.getClass();
        return currentUin;
    }
}
