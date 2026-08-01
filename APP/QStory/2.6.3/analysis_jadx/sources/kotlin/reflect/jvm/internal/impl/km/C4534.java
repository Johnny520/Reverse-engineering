package kotlin.reflect.jvm.internal.impl.km;

import com.bumptech.glide.AbstractC3066;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import p085.C7054;
import p085.C7059;
import p086.C7061;
import p086.InterfaceC7060;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4534 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C4539 f13203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C4534 f13204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4534 f13205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f13206 = new ArrayList(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC3066 f13207;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f13208;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f13209;

    public C4534(int i) {
        this.f13208 = i;
        InterfaceC7060.f18960.getClass();
        List listM12378 = C7061.m12378();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM12378, 10));
        Iterator it = listM12378.iterator();
        while (it.hasNext()) {
            ((C7054) ((InterfaceC7060) it.next())).getClass();
            arrayList.add(new C7059());
        }
        this.f13209 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4534.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C4534 c4534 = (C4534) obj;
        return this.f13208 == c4534.f13208 && m9131().equals(c4534.m9131()) && AbstractC4395.m8907(this.f13206, c4534.f13206) && AbstractC4395.m8907(this.f13204, c4534.f13204) && AbstractC4395.m8907(this.f13205, c4534.f13205) && AbstractC4395.m8907(this.f13203, c4534.f13203) && AbstractC4395.m8907(this.f13209, c4534.f13209);
    }

    public final int hashCode() {
        return this.f13206.hashCode() + ((m9131().hashCode() + (this.f13208 * 31)) * 31);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3066 m9131() {
        AbstractC3066 abstractC3066 = this.f13207;
        if (abstractC3066 != null) {
            return abstractC3066;
        }
        AbstractC4395.m8908("classifier");
        throw null;
    }
}
