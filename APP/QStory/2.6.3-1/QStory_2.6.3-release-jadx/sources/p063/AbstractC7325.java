package p063;

import androidx.activity.AbstractC0900;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7325 implements InterfaceC7318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f18146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f18147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Method f18148;

    public AbstractC7325(Method method, List list) {
        this.f18148 = method;
        this.f18147 = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.f18146 = returnType;
    }

    @Override // p063.InterfaceC7318
    public final List getParameterTypes() {
        return this.f18147;
    }

    @Override // p063.InterfaceC7318
    public final Type getReturnType() {
        return this.f18146;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12558(Object[] objArr) {
        objArr.getClass();
        List list = this.f18147;
        if (list.size() == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(list.size());
        sb.append(" arguments, but ");
        C6755.m11869(AbstractC0900.m707(sb, " were provided.", objArr.length));
    }

    @Override // p063.InterfaceC7318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ boolean mo12554() {
        return false;
    }

    @Override // p063.InterfaceC7318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ Member mo12555() {
        return null;
    }
}
