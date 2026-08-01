package p047;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6495 implements InterfaceC6488 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f17805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f17806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Method f17807;

    public AbstractC6495(Method method, List list) {
        this.f17807 = method;
        this.f17806 = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.f17805 = returnType;
    }

    @Override // p047.InterfaceC6488
    public final List getParameterTypes() {
        return this.f17806;
    }

    @Override // p047.InterfaceC6488
    public final Type getReturnType() {
        return this.f17805;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11956(Object[] objArr) {
        objArr.getClass();
        List list = this.f17806;
        if (list.size() == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(list.size());
        sb.append(" arguments, but ");
        C5919.m11249(AbstractC0053.m147(sb, " were provided.", objArr.length));
    }

    @Override // p047.InterfaceC6488
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ boolean mo11952() {
        return false;
    }

    @Override // p047.InterfaceC6488
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ Member mo11953() {
        return null;
    }
}
