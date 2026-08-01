package kotlin.reflect.jvm.internal;

import androidx.collection.C0276;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4211;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5056 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ String f14597;

    public C5056(String str) {
        this.f14597 = str;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Class<?> cls;
        String strMo8901;
        String strMo89012;
        InterfaceC5092 interfaceC5092Mo8899 = ((InterfaceC5087) obj).mo8899();
        String str = this.f14597;
        if (interfaceC5092Mo8899 == null) {
            C4211.m8593(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
            return 0;
        }
        if (interfaceC5092Mo8899 instanceof InterfaceC5093) {
            strMo8901 = AbstractC3057.m6756((InterfaceC5093) interfaceC5092Mo8899).getName();
        } else {
            if (!(interfaceC5092Mo8899 instanceof AbstractC4394)) {
                cls = interfaceC5092Mo8899.getClass();
                C0276.m845(AbstractC4396.f12975.mo8917(cls), "Unknown upper bound classifier: ");
                return 0;
            }
            strMo8901 = ((AbstractC4394) interfaceC5092Mo8899).mo8901();
        }
        InterfaceC5092 interfaceC5092Mo88992 = ((InterfaceC5087) obj2).mo8899();
        if (interfaceC5092Mo88992 == null) {
            C4211.m8593(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
            return 0;
        }
        if (interfaceC5092Mo88992 instanceof InterfaceC5093) {
            strMo89012 = AbstractC3057.m6756((InterfaceC5093) interfaceC5092Mo88992).getName();
        } else {
            if (!(interfaceC5092Mo88992 instanceof AbstractC4394)) {
                cls = interfaceC5092Mo88992.getClass();
                C0276.m845(AbstractC4396.f12975.mo8917(cls), "Unknown upper bound classifier: ");
                return 0;
            }
            strMo89012 = ((AbstractC4394) interfaceC5092Mo88992).mo8901();
        }
        return AbstractC3056.m6717(strMo8901, strMo89012);
    }
}
