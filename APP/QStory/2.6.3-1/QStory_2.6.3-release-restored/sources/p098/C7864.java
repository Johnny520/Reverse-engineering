package p098;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3738;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.renderer.C5564;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5683;
import kotlin.text.AbstractC5976;
import org.slf4j.Marker;
import p050.AbstractC7176;
import p095.AbstractC7818;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7864 extends AbstractC5728 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7864(AbstractC5710 abstractC5710, AbstractC5710 abstractC57102) {
        super(abstractC5710, abstractC57102);
        abstractC5710.getClass();
        abstractC57102.getClass();
        InterfaceC5683.f14478.m10157(abstractC5710, abstractC57102);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static final String m12930(String str, String str2) {
        if (!AbstractC5976.m10722(str, '<')) {
            return str;
        }
        return AbstractC5976.m10716(str, '<') + '<' + str2 + '>' + AbstractC5976.m10701(str, '>');
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static final ArrayList m12931(C5576 c5576, AbstractC5714 abstractC5714) throws IOException {
        List<AbstractC5702> listMo10285 = abstractC5714.mo10285();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo10285, 10));
        for (AbstractC5702 abstractC5702 : listMo10285) {
            abstractC5702.getClass();
            StringBuilder sb = new StringBuilder();
            AbstractC5176.m9368(AbstractC7176.m12487(abstractC5702), sb, ", ", null, null, new C5564(c5576, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC5714 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5710 abstractC5710 = this.f14561;
        abstractC5710.getClass();
        AbstractC5710 abstractC57102 = this.f14562;
        abstractC57102.getClass();
        return new C7864(abstractC5710, abstractC57102);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5728, kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC8083 mo10283() {
        InterfaceC5309 interfaceC5309Mo9770 = mo10281().mo9770();
        AbstractC7818 abstractC7818 = interfaceC5309Mo9770 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9770 : null;
        if (abstractC7818 == null) {
            C1123.m1405(mo10281().mo9770(), "Incorrect classifier: ");
            return null;
        }
        InterfaceC8083 interfaceC8083Mo12868 = abstractC7818.mo12868(new C7858());
        interfaceC8083Mo12868.getClass();
        return interfaceC8083Mo12868;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5728
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final String mo10394(C5576 c5576, C5576 c55762) throws IOException {
        AbstractC5710 abstractC5710 = this.f14561;
        String strM10045 = c5576.m10045(abstractC5710);
        AbstractC5710 abstractC57102 = this.f14562;
        String strM100452 = c5576.m10045(abstractC57102);
        if (c55762.f14237.m10001()) {
            return "raw (" + strM10045 + ".." + strM100452 + ')';
        }
        if (abstractC57102.mo10285().isEmpty()) {
            return c5576.m10028(strM10045, strM100452, AbstractC3738.m6877(this));
        }
        ArrayList arrayListM12931 = m12931(c5576, abstractC5710);
        ArrayList arrayListM129312 = m12931(c5576, abstractC57102);
        String strM9369 = AbstractC5176.m9369(arrayListM12931, ", ", null, null, C7865.f19225, 30);
        ArrayList<Pair> arrayListM9380 = AbstractC5176.m9380(arrayListM12931, arrayListM129312);
        if (arrayListM9380.isEmpty()) {
            strM100452 = m12930(strM100452, strM9369);
        } else {
            for (Pair pair : arrayListM9380) {
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                if (!AbstractC5227.m9466(str, AbstractC5976.m10706(str2, "out ")) && !str2.equals(Marker.ANY_MARKER)) {
                    break;
                }
            }
            strM100452 = m12930(strM100452, strM9369);
        }
        String strM12930 = m12930(strM10045, strM9369);
        return strM12930.equals(strM100452) ? strM12930 : c5576.m10028(strM12930, strM100452, AbstractC3738.m6877(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5728
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10395() {
        return this.f14561;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC5746 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5710 abstractC5710 = this.f14561;
        abstractC5710.getClass();
        AbstractC5710 abstractC57102 = this.f14562;
        abstractC57102.getClass();
        return new C7864(abstractC5710, abstractC57102);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC5746 mo10290(boolean z) {
        return new C7864(this.f14561.mo10290(z), this.f14562.mo10290(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC5746 mo10329(C5706 c5706) {
        c5706.getClass();
        return new C7864(this.f14561.mo10329(c5706), this.f14562.mo10329(c5706));
    }
}
