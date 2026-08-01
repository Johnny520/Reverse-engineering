package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;
import p085.C7053;
import p085.C7058;
import p086.C7060;
import p086.InterfaceC7059;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C4538 f13199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C4533 f13200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4533 f13201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f13202 = new ArrayList(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC6087 f13203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f13204;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f13205;

    public C4533(int i) {
        this.f13204 = i;
        InterfaceC7059.f18965.getClass();
        List listM12351 = C7060.m12351();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM12351, 10));
        Iterator it = listM12351.iterator();
        while (it.hasNext()) {
            ((C7053) ((InterfaceC7059) it.next())).getClass();
            arrayList.add(new C7058());
        }
        this.f13205 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4533.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C4533 c4533 = (C4533) obj;
        return this.f13204 == c4533.f13204 && m9141().equals(c4533.m9141()) && AbstractC4394.m8917(this.f13202, c4533.f13202) && AbstractC4394.m8917(this.f13200, c4533.f13200) && AbstractC4394.m8917(this.f13201, c4533.f13201) && AbstractC4394.m8917(this.f13199, c4533.f13199) && AbstractC4394.m8917(this.f13205, c4533.f13205);
    }

    public final int hashCode() {
        return this.f13202.hashCode() + ((m9141().hashCode() + (this.f13204 * 31)) * 31);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC6087 m9141() {
        AbstractC6087 abstractC6087 = this.f13203;
        if (abstractC6087 != null) {
            return abstractC6087;
        }
        AbstractC4394.m8918("classifier");
        throw null;
    }
}
