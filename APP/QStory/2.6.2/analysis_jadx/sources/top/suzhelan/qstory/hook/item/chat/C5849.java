package top.suzhelan.qstory.hook.item.chat;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import lin.xposed.hook.view.main.itemview.C5564;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰世苏哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5849 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937564551781025191L));
        String[] strArr = {AbstractC3056.m6668(-3937578192597157287L), AbstractC3056.m6668(-3937577870474610087L)};
        Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937563963370505639L));
        C6316 c6316M11826 = C6316.m11826(clsM118382);
        c6316M11826.f17409.f3616 = clsM11838;
        Method methodM11827 = c6316M11826.m11827();
        C6316 c6316M118262 = C6316.m11826(clsM118382);
        c6316M118262.f17409.f3616 = List.class;
        Method methodM118272 = c6316M118262.m11827();
        for (int i = 0; i < 2; i++) {
            C6316 c6316M11825 = C6316.m11825(strArr[i]);
            String name = methodM118272.getName();
            C1245 c1245 = c6316M11825.f17409;
            c1245.f3617 = name;
            c1245.f3616 = List.class;
            m11802(c6316M11825.m11827(), new C5564(methodM11827, clsM11838, this, 4));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937786928007742887L);
    }
}
