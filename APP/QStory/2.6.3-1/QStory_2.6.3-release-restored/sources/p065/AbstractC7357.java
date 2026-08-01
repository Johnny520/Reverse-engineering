package p065;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5247;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5672;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.C5743;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p050.AbstractC7176;
import p095.C7811;
import p095.C7816;
import p095.C7847;
import p114.C8069;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7816 f18260;

    static {
        C8069 c8069 = C8069.f19636;
        C5247 c5247 = new C5247(C8069.f19635, AbstractC7355.f18183, 1);
        ClassKind classKind = ClassKind.INTERFACE;
        C5523 c5523M9877 = AbstractC7355.f18196.f14041.m9877();
        C5672 c5672 = C5677.f14468;
        C7816 c7816 = new C7816(c5247, classKind, c5523M9877, c5672);
        Modality modality = Modality.ABSTRACT;
        if (modality == null) {
            C7816.m12863(6);
            throw null;
        }
        c7816.f19038 = modality;
        C5322 c5322 = AbstractC5321.f13461;
        if (c5322 == null) {
            C7816.m12863(9);
            throw null;
        }
        c7816.f19039 = c5322;
        List listM12487 = AbstractC7176.m12487(C7811.m12857(c7816, Variance.IN_VARIANCE, C5523.m9889("T"), 0, c5672));
        if (c7816.f19036 != null) {
            C5043.m9164(c7816.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listM12487);
        c7816.f19036 = arrayList;
        c7816.f19037 = new C5743(c7816, arrayList, c7816.f19035, c7816.f19034);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C7816.m12863(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C7847) ((InterfaceC5316) it.next())).f19130 = c7816.mo9584();
        }
        f18260 = c7816;
    }
}
