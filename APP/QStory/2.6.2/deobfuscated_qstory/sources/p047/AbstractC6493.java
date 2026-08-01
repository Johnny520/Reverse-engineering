package p047;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6493 implements InterfaceC6488 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f17800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f17801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f17802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Member f17803;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC6493(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f17803 = r1
            r0.f17802 = r2
            r0.f17801 = r3
            if (r3 == 0) goto L29
            androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世哲兰 r1 = new androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世哲兰
            r2 = 2
            r1.<init>(r2)
            r1.m2831(r3)
            r1.m2829(r4)
            java.util.ArrayList r1 = r1.f4599
            int r2 = r1.size()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.util.List r1 = p253.AbstractC8189.m13659(r1)
            if (r1 != 0) goto L2d
        L29:
            java.util.List r1 = kotlin.collections.AbstractC4346.m8850(r4)
        L2d:
            r0.f17800 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p047.AbstractC6493.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    @Override // p047.InterfaceC6488
    public final List getParameterTypes() {
        return this.f17800;
    }

    @Override // p047.InterfaceC6488
    public final Type getReturnType() {
        return this.f17802;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11954(Object obj) {
        if (obj == null || !this.f17803.getDeclaringClass().isInstance(obj)) {
            C5919.m11249("An object member requires the object instance passed as the first argument.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo11955(Object[] objArr) {
        objArr.getClass();
        List list = this.f17800;
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
    public final Member mo11953() {
        return this.f17803;
    }
}
