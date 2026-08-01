package p046;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.types.C4898;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6483 implements InterfaceC6480 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4898 f17774;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6480 f17775;

    public C6483(InterfaceC6480 interfaceC6480, C4898 c4898) {
        this.f17775 = interfaceC6480;
        this.f17774 = c4898;
    }

    @Override // p046.InterfaceC6480
    public final boolean isEmpty() {
        InterfaceC6480 interfaceC6480 = this.f17775;
        if ((interfaceC6480 instanceof Collection) && ((Collection) interfaceC6480).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC6480.iterator();
        while (it.hasNext()) {
            C4686 c4686Mo9188 = ((InterfaceC6477) it.next()).mo9188();
            if (c4686Mo9188 != null && ((Boolean) this.f17774.invoke(c4686Mo9188)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f17775) {
            C4686 c4686Mo9188 = ((InterfaceC6477) obj).mo9188();
            if (c4686Mo9188 != null && ((Boolean) this.f17774.invoke(c4686Mo9188)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC6477 mo9527(C4686 c4686) {
        c4686.getClass();
        if (((Boolean) this.f17774.invoke(c4686)).booleanValue()) {
            return this.f17775.mo9527(c4686);
        }
        return null;
    }

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final boolean mo9528(C4686 c4686) {
        c4686.getClass();
        if (((Boolean) this.f17774.invoke(c4686)).booleanValue()) {
            return this.f17775.mo9528(c4686);
        }
        return false;
    }
}
