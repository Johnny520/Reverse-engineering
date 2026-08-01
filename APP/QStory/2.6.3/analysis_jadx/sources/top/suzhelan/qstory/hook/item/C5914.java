package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedHelpers;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5914 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1762));
            C5915 c5915 = new C5915(0);
            XposedHelpers.findAndHookMethod(clsM11866, AbstractC8405.m13972(1763), new Object[]{String.class, Boolean.TYPE, c5915});
            XposedHelpers.findAndHookMethod(clsM11866, AbstractC8405.m13972(1764), new Object[]{String.class, c5915});
        } catch (Exception unused) {
        }
        try {
            XposedHelpers.findAndHookMethod(AbstractC6337.m11866(AbstractC8405.m13972(1765)), AbstractC8405.m13972(1769), new Object[]{AbstractC6337.m11866(AbstractC8405.m13972(1766)), AbstractC6337.m11866(AbstractC8405.m13972(1767)), AbstractC6337.m11866(AbstractC8405.m13972(1768)), new C5915(1)});
        } catch (Exception unused2) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1761);
    }
}
