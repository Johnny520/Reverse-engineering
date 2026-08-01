package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5908 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        try {
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937731930951517607L));
            C5909 c5909 = new C5909(0);
            XposedHelpers.findAndHookMethod(clsM11838, AbstractC3056.m6668(-3937731660368577959L), new Object[]{String.class, Boolean.TYPE, c5909});
            XposedHelpers.findAndHookMethod(clsM11838, AbstractC3056.m6668(-3937731587354133927L), new Object[]{String.class, c5909});
        } catch (Exception unused) {
        }
        try {
            XposedHelpers.findAndHookMethod(AbstractC6318.m11838(AbstractC3056.m6668(-3937731552994395559L)), AbstractC3056.m6668(-3937730990353679783L), new Object[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937731286706423207L)), AbstractC6318.m11838(AbstractC3056.m6668(-3937731192217142695L)), AbstractC6318.m11838(AbstractC3056.m6668(-3937731041893287335L)), new C5909(1)});
        } catch (Exception unused2) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937732111340144039L);
    }
}
