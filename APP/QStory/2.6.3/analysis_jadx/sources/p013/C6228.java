package p013;

import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4207;
import java.util.Collections;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.InterfaceC5093;
import kotlin.sequences.AbstractC5122;
import p034.AbstractC6347;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6228 extends AbstractC6347 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC6347 f17162;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f17163;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5093 f17164;

    public C6228(InterfaceC5093 interfaceC5093, Object obj, AbstractC6347 abstractC6347) {
        obj.getClass();
        abstractC6347.getClass();
        this.f17164 = interfaceC5093;
        this.f17163 = obj;
        this.f17162 = abstractC6347;
    }

    public final String toString() {
        List listM8783;
        List listM10110 = AbstractC5122.m10110(AbstractC5122.m10115(this, new C4207(25)));
        listM10110.getClass();
        if (listM10110.size() <= 1) {
            listM8783 = AbstractC4344.m8797(listM10110);
        } else {
            listM8783 = AbstractC4344.m8783(listM10110);
            Collections.reverse(listM8783);
        }
        return AbstractC4344.m8810(listM8783, null, "{", "}", new C4207(26), 25);
    }

    @Override // p034.AbstractC6347
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Object mo11691(InterfaceC5093 interfaceC5093) {
        return interfaceC5093.equals(this.f17164) ? AbstractC3057.m6756(interfaceC5093).cast(this.f17163) : this.f17162.mo11691(interfaceC5093);
    }

    @Override // p034.AbstractC6347
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final AbstractC6347 mo11692(InterfaceC5093 interfaceC5093, Object obj) {
        InterfaceC5093 interfaceC50932 = this.f17164;
        boolean zEquals = interfaceC5093.equals(interfaceC50932);
        AbstractC6347 abstractC6347 = this.f17162;
        if (!zEquals) {
            AbstractC6347 abstractC6347Mo11692 = abstractC6347.mo11692(interfaceC5093, null);
            if (abstractC6347Mo11692 != abstractC6347) {
                this = new C6228(interfaceC50932, this.f17163, abstractC6347Mo11692);
            }
            abstractC6347 = this;
        }
        return obj != null ? new C6228(interfaceC5093, obj, abstractC6347) : abstractC6347;
    }
}
