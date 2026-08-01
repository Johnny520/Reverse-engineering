package p006;

import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import lin.xposed.hook.util.qq.QQEnvTool;
import net.bytebuddy.description.method.MethodDescription;
import p024.AbstractC6291;
import p331.C8799;
import p336.AbstractC8805;
import p342.C8821;
import top.suzhelan.qstory.hook.item.C5951;

/* JADX INFO: renamed from: 飘花落叶言世兰哲蝶花舞.蝶恋花, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"L飘花落叶言世兰哲蝶花舞/蝶恋花;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "兰雨蝶梦凌", "", "苏雨花似柔情", "", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C6125 {
    public static final int $stable = 0;
    public static final C6125 INSTANCE = new C6125();

    private C6125() {
    }

    /* JADX INFO: renamed from: 兰雨蝶梦凌, reason: contains not printable characters */
    public static final boolean m11519() {
        Object obj = AbstractC6291.f17375.get(C5951.class);
        obj.getClass();
        AbstractC8805 abstractC8805 = (AbstractC8805) obj;
        C8799 c8799 = new C8799();
        c8799.f24761 = "0";
        c8799.f24760 = "\u672a\u540c\u6b65";
        c8799.f24759 = 0;
        c8799.f24758 = "\u672a\u540c\u6b65";
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, "user_info");
        if (c87992 != null) {
            c8799 = c87992;
        }
        return abstractC8805.mo11257(c8799);
    }

    /* JADX INFO: renamed from: 苏雨花似柔情, reason: contains not printable characters */
    public static final String m11520() {
        String currentUin = QQEnvTool.getCurrentUin();
        currentUin.getClass();
        return currentUin;
    }
}
