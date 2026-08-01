package p049;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4414;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4839;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.C4910;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p079.C6981;
import p079.C6986;
import p079.C7017;
import p098.C7239;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6527 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6986 f17919;

    static {
        C7239 c7239 = C7239.f19296;
        C4414 c4414 = new C4414(C7239.f19295, AbstractC6525.f17842, 1);
        ClassKind classKind = ClassKind.INTERFACE;
        C4690 c4690M9328 = AbstractC6525.f17855.f13692.m9328();
        C4839 c4839 = C4844.f14119;
        C6986 c6986 = new C6986(c4414, classKind, c4690M9328, c4839);
        Modality modality = Modality.ABSTRACT;
        if (modality == null) {
            C6986.m12277(6);
            throw null;
        }
        c6986.f18698 = modality;
        C4489 c4489 = AbstractC4488.f13112;
        if (c4489 == null) {
            C6986.m12277(9);
            throw null;
        }
        c6986.f18699 = c4489;
        List listM13660 = AbstractC8189.m13660(C6981.m12271(c6986, Variance.IN_VARIANCE, C4690.m9340("T"), 0, c4839));
        if (c6986.f18696 != null) {
            C4210.m8615(c6986.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listM13660);
        c6986.f18696 = arrayList;
        c6986.f18697 = new C4910(c6986, arrayList, c6986.f18695, c6986.f18694);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C6986.m12277(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C7017) ((InterfaceC4483) it.next())).f18790 = c6986.mo9035();
        }
        f17919 = c6986;
    }
}
