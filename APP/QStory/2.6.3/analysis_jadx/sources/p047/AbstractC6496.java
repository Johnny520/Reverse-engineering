package p047;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6496 implements InterfaceC6489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f17801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f17802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Method f17803;

    public AbstractC6496(Method method, List list) {
        this.f17803 = method;
        this.f17802 = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.f17801 = returnType;
    }

    @Override // p047.InterfaceC6489
    public final List getParameterTypes() {
        return this.f17802;
    }

    @Override // p047.InterfaceC6489
    public final Type getReturnType() {
        return this.f17801;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11999(Object[] objArr) {
        objArr.getClass();
        List list = this.f17802;
        if (list.size() == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(list.size());
        sb.append(" arguments, but ");
        C5925.m11310(AbstractC0053.m147(sb, " were provided.", objArr.length));
    }

    @Override // p047.InterfaceC6489
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ boolean mo11995() {
        return false;
    }

    @Override // p047.InterfaceC6489
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ Member mo11996() {
        return null;
    }
}
