package p047;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6494 implements InterfaceC6489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f17796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f17797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f17798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Member f17799;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC6494(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f17799 = r1
            r0.f17798 = r2
            r0.f17797 = r3
            if (r3 == 0) goto L29
            androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世哲兰 r1 = new androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世哲兰
            r2 = 2
            r1.<init>(r2)
            r1.m2841(r3)
            r1.m2839(r4)
            java.util.ArrayList r1 = r1.f4600
            int r2 = r1.size()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.util.List r1 = p034.AbstractC6347.m11931(r1)
            if (r1 != 0) goto L2d
        L29:
            java.util.List r1 = kotlin.collections.AbstractC4347.m8846(r4)
        L2d:
            r0.f17796 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p047.AbstractC6494.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    @Override // p047.InterfaceC6489
    public final List getParameterTypes() {
        return this.f17796;
    }

    @Override // p047.InterfaceC6489
    public final Type getReturnType() {
        return this.f17798;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11997(Object obj) {
        if (obj == null || !this.f17799.getDeclaringClass().isInstance(obj)) {
            C5925.m11310("An object member requires the object instance passed as the first argument.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo11998(Object[] objArr) {
        objArr.getClass();
        List list = this.f17796;
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
    public final Member mo11996() {
        return this.f17799;
    }
}
