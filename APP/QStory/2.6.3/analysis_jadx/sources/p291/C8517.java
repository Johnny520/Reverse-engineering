package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8517 extends C8524 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC8494 f23669;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC8494 f23670;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC8494 f23671;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC8494 f23672;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC8494 f23673;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC8494 f23674;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC8494 f23675;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC8494 f23676;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC8494 f23677;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC8494 f23678;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC8494 f23679;

    public C8517(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f23675 = (AbstractC8494) list.get(0);
        this.f23678 = (AbstractC8494) list.get(1);
        this.f23679 = (AbstractC8494) list.get(2);
        this.f23676 = (AbstractC8494) list.get(3);
        this.f23677 = (AbstractC8494) list.get(4);
        this.f23674 = (AbstractC8494) list.get(5);
        this.f23673 = (AbstractC8494) list.get(6);
        this.f23672 = (AbstractC8494) list.get(7);
        this.f23671 = (AbstractC8494) list.get(8);
        this.f23670 = (AbstractC8494) list.get(9);
        this.f23669 = (AbstractC8494) list.get(10);
    }

    @Override // p291.C8524, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final AbstractC8494 mo14091(long j) {
        AbstractC8494 abstractC8494 = this.f23675;
        if (j == abstractC8494.f23600) {
            return abstractC8494;
        }
        AbstractC8494 abstractC84942 = this.f23678;
        if (j == abstractC84942.f23600) {
            return abstractC84942;
        }
        AbstractC8494 abstractC84943 = this.f23679;
        if (j == abstractC84943.f23600) {
            return abstractC84943;
        }
        AbstractC8494 abstractC84944 = this.f23676;
        if (j == abstractC84944.f23600) {
            return abstractC84944;
        }
        AbstractC8494 abstractC84945 = this.f23677;
        if (j == abstractC84945.f23600) {
            return abstractC84945;
        }
        AbstractC8494 abstractC84946 = this.f23674;
        if (j == abstractC84946.f23600) {
            return abstractC84946;
        }
        AbstractC8494 abstractC84947 = this.f23673;
        if (j == abstractC84947.f23600) {
            return abstractC84947;
        }
        AbstractC8494 abstractC84948 = this.f23672;
        if (j == abstractC84948.f23600) {
            return abstractC84948;
        }
        AbstractC8494 abstractC84949 = this.f23671;
        if (j == abstractC84949.f23600) {
            return abstractC84949;
        }
        AbstractC8494 abstractC849410 = this.f23670;
        if (j == abstractC849410.f23600) {
            return abstractC849410;
        }
        AbstractC8494 abstractC849411 = this.f23669;
        if (j == abstractC849411.f23600) {
            return abstractC849411;
        }
        return null;
    }

    @Override // p291.C8524, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        long j2 = j | this.f23718;
        long j3 = j2 | abstractC2897.f9178.f9153;
        boolean z = (JSONWriter$Feature.BeanToArray.mask & j3) != 0;
        if (abstractC2897.f9171) {
            if (z) {
                mo14018(abstractC2897, obj, type, j);
                return;
            } else {
                mo5678(abstractC2897, obj, obj2, type, j);
                return;
            }
        }
        if (z) {
            mo14019(abstractC2897, obj, obj2, type, j2);
            return;
        }
        if (!this.f23719) {
            if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j3) != 0) {
                m14101();
                throw null;
            }
            if ((JSONWriter$Feature.IgnoreNoneSerializable.mask & j3) != 0) {
                abstractC2897.mo5967();
                return;
            }
        }
        if (mo14097(abstractC2897)) {
            m14099(abstractC2897, obj, obj2, type, 0L);
            return;
        }
        abstractC2897.mo5997();
        if ((JSONWriter$Feature.WriteClassName.mask & j2) != 0 || abstractC2897.m6060(obj, j)) {
            m14100(abstractC2897);
        }
        this.f23675.mo13999(abstractC2897, obj);
        this.f23678.mo13999(abstractC2897, obj);
        this.f23679.mo13999(abstractC2897, obj);
        this.f23676.mo13999(abstractC2897, obj);
        this.f23677.mo13999(abstractC2897, obj);
        this.f23674.mo13999(abstractC2897, obj);
        this.f23673.mo13999(abstractC2897, obj);
        this.f23672.mo13999(abstractC2897, obj);
        this.f23671.mo13999(abstractC2897, obj);
        this.f23670.mo13999(abstractC2897, obj);
        this.f23669.mo13999(abstractC2897, obj);
        abstractC2897.mo5994();
    }
}
