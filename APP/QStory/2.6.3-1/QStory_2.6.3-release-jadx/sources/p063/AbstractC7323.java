package p063;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.vector.C2397;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5179;
import p050.AbstractC7176;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7323 implements InterfaceC7318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f18141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f18142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f18143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Member f18144;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC7323(Member member, Type type, Class cls, Type[] typeArr) {
        List listM9405;
        this.f18144 = member;
        this.f18143 = type;
        this.f18142 = cls;
        if (cls != null) {
            C2397 c2397 = new C2397(2);
            c2397.m3401(cls);
            c2397.m3399(typeArr);
            ArrayList arrayList = c2397.f4945;
            listM9405 = AbstractC7176.m12490(arrayList.toArray(new Type[arrayList.size()]));
            listM9405 = listM9405 == null ? AbstractC5179.m9405(typeArr) : listM9405;
        }
        this.f18141 = listM9405;
    }

    @Override // p063.InterfaceC7318
    public final List getParameterTypes() {
        return this.f18141;
    }

    @Override // p063.InterfaceC7318
    public final Type getReturnType() {
        return this.f18143;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12556(Object obj) {
        if (obj == null || !this.f18144.getDeclaringClass().isInstance(obj)) {
            C6755.m11869("An object member requires the object instance passed as the first argument.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo12557(Object[] objArr) {
        objArr.getClass();
        List list = this.f18141;
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
    public final Member mo12555() {
        return this.f18144;
    }
}
