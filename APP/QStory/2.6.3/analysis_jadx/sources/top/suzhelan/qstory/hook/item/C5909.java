package top.suzhelan.qstory.hook.item;

import androidx.compose.runtime.internal.C1245;
import de.robv.android.xposed.XposedBridge;
import kotlin.Metadata;
import kotlin.Result;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5909 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Object objM8745constructorimpl;
        Object objM8745constructorimpl2;
        Class cls = Integer.TYPE;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(2074));
            try {
                C6335 c6335M11854 = C6335.m11854(clsM11866);
                String strM13972 = AbstractC8405.m13972(2075);
                C1245 c1245 = c6335M11854.f17458;
                c1245.f3618 = strM13972;
                c1245.f3619 = new Class[]{cls};
                c1245.f3617 = cls;
                objM8745constructorimpl = Result.m8745constructorimpl(XposedBridge.hookMethod(c6335M11854.m11855(), new C5915(22)));
            } catch (Throwable th) {
                objM8745constructorimpl = Result.m8745constructorimpl(new Result.Failure(th));
            }
            Result.m8748exceptionOrNullimpl(objM8745constructorimpl);
            try {
                C6335 c6335M118542 = C6335.m11854(clsM11866);
                String strM139722 = AbstractC8405.m13972(2076);
                C1245 c12452 = c6335M118542.f17458;
                c12452.f3618 = strM139722;
                c12452.f3619 = new Class[]{cls, cls};
                c12452.f3617 = cls;
                objM8745constructorimpl2 = Result.m8745constructorimpl(XposedBridge.hookMethod(c6335M118542.m11855(), new C5915(23)));
            } catch (Throwable th2) {
                objM8745constructorimpl2 = Result.m8745constructorimpl(new Result.Failure(th2));
            }
            Result.m8748exceptionOrNullimpl(objM8745constructorimpl2);
        } catch (Exception unused) {
        }
    }
}
