package kotlin.reflect.jvm.internal.impl.p009km;

import com.bumptech.glide.AbstractC3898;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import p101.C7883;
import p101.C7888;
import p102.C7890;
import p102.InterfaceC7889;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5366 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C5371 f13548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C5366 f13549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5366 f13550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f13551 = new ArrayList(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC3898 f13552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f13553;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f13554;

    public C5366(int i) {
        this.f13553 = i;
        InterfaceC7889.f19305.getClass();
        List listM12937 = C7890.m12937();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM12937, 10));
        Iterator it = listM12937.iterator();
        while (it.hasNext()) {
            ((C7883) ((InterfaceC7889) it.next())).getClass();
            arrayList.add(new C7888());
        }
        this.f13554 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5366.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C5366 c5366 = (C5366) obj;
        return this.f13553 == c5366.f13553 && m9690().equals(c5366.m9690()) && AbstractC5227.m9466(this.f13551, c5366.f13551) && AbstractC5227.m9466(this.f13549, c5366.f13549) && AbstractC5227.m9466(this.f13550, c5366.f13550) && AbstractC5227.m9466(this.f13548, c5366.f13548) && AbstractC5227.m9466(this.f13554, c5366.f13554);
    }

    public final int hashCode() {
        return this.f13551.hashCode() + ((m9690().hashCode() + (this.f13553 * 31)) * 31);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3898 m9690() {
        AbstractC3898 abstractC3898 = this.f13552;
        if (abstractC3898 != null) {
            return abstractC3898;
        }
        AbstractC5227.m9467("classifier");
        throw null;
    }
}
