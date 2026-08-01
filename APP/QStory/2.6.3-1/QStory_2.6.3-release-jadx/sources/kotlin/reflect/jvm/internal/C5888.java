package kotlin.reflect.jvm.internal;

import androidx.collection.C1123;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5888 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ String f14942;

    public C5888(String str) {
        this.f14942 = str;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Class<?> cls;
        String strMo9460;
        String strMo94602;
        InterfaceC5924 interfaceC5924Mo9458 = ((InterfaceC5919) obj).mo9458();
        String str = this.f14942;
        if (interfaceC5924Mo9458 == null) {
            C5043.m9152(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
            return 0;
        }
        if (interfaceC5924Mo9458 instanceof InterfaceC5925) {
            strMo9460 = AbstractC3889.m7316((InterfaceC5925) interfaceC5924Mo9458).getName();
        } else {
            if (!(interfaceC5924Mo9458 instanceof AbstractC5226)) {
                cls = interfaceC5924Mo9458.getClass();
                C1123.m1405(AbstractC5228.f13320.mo9476(cls), "Unknown upper bound classifier: ");
                return 0;
            }
            strMo9460 = ((AbstractC5226) interfaceC5924Mo9458).mo9460();
        }
        InterfaceC5924 interfaceC5924Mo94582 = ((InterfaceC5919) obj2).mo9458();
        if (interfaceC5924Mo94582 == null) {
            C5043.m9152(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
            return 0;
        }
        if (interfaceC5924Mo94582 instanceof InterfaceC5925) {
            strMo94602 = AbstractC3889.m7316((InterfaceC5925) interfaceC5924Mo94582).getName();
        } else {
            if (!(interfaceC5924Mo94582 instanceof AbstractC5226)) {
                cls = interfaceC5924Mo94582.getClass();
                C1123.m1405(AbstractC5228.f13320.mo9476(cls), "Unknown upper bound classifier: ");
                return 0;
            }
            strMo94602 = ((AbstractC5226) interfaceC5924Mo94582).mo9460();
        }
        return AbstractC3888.m7277(strMo9460, strMo94602);
    }
}
