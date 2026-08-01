package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8516 extends C8524 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC8494 f23657;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC8494 f23658;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC8494 f23659;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC8494 f23660;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC8494 f23661;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC8494 f23662;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC8494 f23663;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC8494 f23664;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC8494 f23665;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC8494 f23666;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC8494 f23667;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC8494 f23668;

    public C8516(Class cls, String str, String str2, long j, List list) {
        super(cls, str, str2, j, list);
        this.f23664 = (AbstractC8494) list.get(0);
        this.f23667 = (AbstractC8494) list.get(1);
        this.f23668 = (AbstractC8494) list.get(2);
        this.f23665 = (AbstractC8494) list.get(3);
        this.f23666 = (AbstractC8494) list.get(4);
        this.f23662 = (AbstractC8494) list.get(5);
        this.f23661 = (AbstractC8494) list.get(6);
        this.f23660 = (AbstractC8494) list.get(7);
        this.f23659 = (AbstractC8494) list.get(8);
        this.f23658 = (AbstractC8494) list.get(9);
        this.f23657 = (AbstractC8494) list.get(10);
        this.f23663 = (AbstractC8494) list.get(11);
    }

    @Override // p291.C8524, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final AbstractC8494 mo14091(long j) {
        AbstractC8494 abstractC8494 = this.f23664;
        if (j == abstractC8494.f23600) {
            return abstractC8494;
        }
        AbstractC8494 abstractC84942 = this.f23667;
        if (j == abstractC84942.f23600) {
            return abstractC84942;
        }
        AbstractC8494 abstractC84943 = this.f23668;
        if (j == abstractC84943.f23600) {
            return abstractC84943;
        }
        AbstractC8494 abstractC84944 = this.f23665;
        if (j == abstractC84944.f23600) {
            return abstractC84944;
        }
        AbstractC8494 abstractC84945 = this.f23666;
        if (j == abstractC84945.f23600) {
            return abstractC84945;
        }
        AbstractC8494 abstractC84946 = this.f23662;
        if (j == abstractC84946.f23600) {
            return abstractC84946;
        }
        AbstractC8494 abstractC84947 = this.f23661;
        if (j == abstractC84947.f23600) {
            return abstractC84947;
        }
        AbstractC8494 abstractC84948 = this.f23660;
        if (j == abstractC84948.f23600) {
            return abstractC84948;
        }
        AbstractC8494 abstractC84949 = this.f23659;
        if (j == abstractC84949.f23600) {
            return abstractC84949;
        }
        AbstractC8494 abstractC849410 = this.f23658;
        if (j == abstractC849410.f23600) {
            return abstractC849410;
        }
        AbstractC8494 abstractC849411 = this.f23657;
        if (j == abstractC849411.f23600) {
            return abstractC849411;
        }
        AbstractC8494 abstractC849412 = this.f23663;
        if (j == abstractC849412.f23600) {
            return abstractC849412;
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
        this.f23664.mo13999(abstractC2897, obj);
        this.f23667.mo13999(abstractC2897, obj);
        this.f23668.mo13999(abstractC2897, obj);
        this.f23665.mo13999(abstractC2897, obj);
        this.f23666.mo13999(abstractC2897, obj);
        this.f23662.mo13999(abstractC2897, obj);
        this.f23661.mo13999(abstractC2897, obj);
        this.f23660.mo13999(abstractC2897, obj);
        this.f23659.mo13999(abstractC2897, obj);
        this.f23658.mo13999(abstractC2897, obj);
        this.f23657.mo13999(abstractC2897, obj);
        this.f23663.mo13999(abstractC2897, obj);
        abstractC2897.mo5994();
    }
}
