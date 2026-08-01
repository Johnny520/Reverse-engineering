package top.suzhelan.qstory.hook.item;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import kotlin.Metadata;
import kotlin.Result;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏世兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5902 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Object objM8755constructorimpl;
        Object objM8755constructorimpl2;
        Class cls = Integer.TYPE;
        "classLoader";
        classLoader.getClass();
        try {
            Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.text.EmotcationConstants");
            try {
                C6316 c6316M11826 = C6316.m11826(clsM11838);
                String strM6668 = "getSingleEmoji";
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3618 = new Class[]{cls};
                c1245.f3616 = cls;
                objM8755constructorimpl = Result.m8755constructorimpl(XposedBridge.hookMethod(c6316M11826.m11827(), new C5909(22)));
            } catch (Throwable th) {
                objM8755constructorimpl = Result.m8755constructorimpl(new Result.Failure(th));
            }
            Result.m8758exceptionOrNullimpl(objM8755constructorimpl);
            try {
                C6316 c6316M118262 = C6316.m11826(clsM11838);
                String strM66682 = "getDoubleEmoji";
                C1245 c12452 = c6316M118262.f17409;
                c12452.f3617 = strM66682;
                c12452.f3618 = new Class[]{cls, cls};
                c12452.f3616 = cls;
                objM8755constructorimpl2 = Result.m8755constructorimpl(XposedBridge.hookMethod(c6316M118262.m11827(), new C5909(23)));
            } catch (Throwable th2) {
                objM8755constructorimpl2 = Result.m8755constructorimpl(new Result.Failure(th2));
            }
            Result.m8758exceptionOrNullimpl(objM8755constructorimpl2);
        } catch (Exception unused) {
        }
    }
}
