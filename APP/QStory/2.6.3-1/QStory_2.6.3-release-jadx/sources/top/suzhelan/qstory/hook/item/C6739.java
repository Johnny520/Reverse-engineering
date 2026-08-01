package top.suzhelan.qstory.hook.item;

import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XposedBridge;
import kotlin.Metadata;
import kotlin.Result;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6739 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Object objM9304constructorimpl;
        Object objM9304constructorimpl2;
        Class cls = Integer.TYPE;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        try {
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(2074));
            try {
                C7164 c7164M12413 = C7164.m12413(clsM12425);
                String strM14531 = AbstractC9234.m14531(2075);
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3964 = new Class[]{cls};
                c2080.f3962 = cls;
                objM9304constructorimpl = Result.m9304constructorimpl(XposedBridge.hookMethod(c7164M12413.m12414(), new C6745(22)));
            } catch (Throwable th) {
                objM9304constructorimpl = Result.m9304constructorimpl(new Result.Failure(th));
            }
            Result.m9307exceptionOrNullimpl(objM9304constructorimpl);
            try {
                C7164 c7164M124132 = C7164.m12413(clsM12425);
                String strM145312 = AbstractC9234.m14531(2076);
                C2080 c20802 = c7164M124132.f17803;
                c20802.f3963 = strM145312;
                c20802.f3964 = new Class[]{cls, cls};
                c20802.f3962 = cls;
                objM9304constructorimpl2 = Result.m9304constructorimpl(XposedBridge.hookMethod(c7164M124132.m12414(), new C6745(23)));
            } catch (Throwable th2) {
                objM9304constructorimpl2 = Result.m9304constructorimpl(new Result.Failure(th2));
            }
            Result.m9307exceptionOrNullimpl(objM9304constructorimpl2);
        } catch (Exception unused) {
        }
    }
}
