package p082;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2905;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.renderer.C4732;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851;
import kotlin.text.AbstractC5144;
import org.slf4j.Marker;
import p034.AbstractC6347;
import p079.AbstractC6989;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7035 extends AbstractC4896 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7035(AbstractC4878 abstractC4878, AbstractC4878 abstractC48782) {
        super(abstractC4878, abstractC48782);
        abstractC4878.getClass();
        abstractC48782.getClass();
        InterfaceC4851.f14133.m9598(abstractC4878, abstractC48782);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static final String m12371(String str, String str2) {
        if (!AbstractC5144.m10163(str, '<')) {
            return str;
        }
        return AbstractC5144.m10157(str, '<') + '<' + str2 + '>' + AbstractC5144.m10142(str, '>');
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static final ArrayList m12372(C4744 c4744, AbstractC4882 abstractC4882) throws IOException {
        List<AbstractC4870> listMo9726 = abstractC4882.mo9726();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listMo9726, 10));
        for (AbstractC4870 abstractC4870 : listMo9726) {
            abstractC4870.getClass();
            StringBuilder sb = new StringBuilder();
            AbstractC4344.m8809(AbstractC6347.m11928(abstractC4870), sb, ", ", null, null, new C4732(c4744, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4882 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        AbstractC4878 abstractC4878 = this.f14216;
        abstractC4878.getClass();
        AbstractC4878 abstractC48782 = this.f14217;
        abstractC48782.getClass();
        return new C7035(abstractC4878, abstractC48782);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4896, kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7254 mo9724() {
        InterfaceC4477 interfaceC4477Mo9211 = mo9722().mo9211();
        AbstractC6989 abstractC6989 = interfaceC4477Mo9211 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9211 : null;
        if (abstractC6989 == null) {
            C0276.m845(mo9722().mo9211(), "Incorrect classifier: ");
            return null;
        }
        InterfaceC7254 interfaceC7254Mo12309 = abstractC6989.mo12309(new C7029());
        interfaceC7254Mo12309.getClass();
        return interfaceC7254Mo12309;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4896
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final String mo9835(C4744 c4744, C4744 c47442) throws IOException {
        AbstractC4878 abstractC4878 = this.f14216;
        String strM9486 = c4744.m9486(abstractC4878);
        AbstractC4878 abstractC48782 = this.f14217;
        String strM94862 = c4744.m9486(abstractC48782);
        if (c47442.f13892.m9442()) {
            return "raw (" + strM9486 + ".." + strM94862 + ')';
        }
        if (abstractC48782.mo9726().isEmpty()) {
            return c4744.m9469(strM9486, strM94862, AbstractC2905.m6317(this));
        }
        ArrayList arrayListM12372 = m12372(c4744, abstractC4878);
        ArrayList arrayListM123722 = m12372(c4744, abstractC48782);
        String strM8810 = AbstractC4344.m8810(arrayListM12372, ", ", null, null, C7036.f18880, 30);
        ArrayList<Pair> arrayListM8821 = AbstractC4344.m8821(arrayListM12372, arrayListM123722);
        if (arrayListM8821.isEmpty()) {
            strM94862 = m12371(strM94862, strM8810);
        } else {
            for (Pair pair : arrayListM8821) {
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                if (!AbstractC4395.m8907(str, AbstractC5144.m10147(str2, "out ")) && !str2.equals(Marker.ANY_MARKER)) {
                    break;
                }
            }
            strM94862 = m12371(strM94862, strM8810);
        }
        String strM12371 = m12371(strM9486, strM8810);
        return strM12371.equals(strM94862) ? strM12371 : c4744.m9469(strM12371, strM94862, AbstractC2905.m6317(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4896
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4878 mo9836() {
        return this.f14216;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4914 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        AbstractC4878 abstractC4878 = this.f14216;
        abstractC4878.getClass();
        AbstractC4878 abstractC48782 = this.f14217;
        abstractC48782.getClass();
        return new C7035(abstractC4878, abstractC48782);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC4914 mo9731(boolean z) {
        return new C7035(this.f14216.mo9731(z), this.f14217.mo9731(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4914 mo9770(C4874 c4874) {
        c4874.getClass();
        return new C7035(this.f14216.mo9770(c4874), this.f14217.mo9770(c4874));
    }
}
