package p049;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4415;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4840;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.C4911;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p034.AbstractC6347;
import p079.C6982;
import p079.C6987;
import p079.C7018;
import p098.C7240;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6987 f17915;

    static {
        C7240 c7240 = C7240.f19291;
        C4415 c4415 = new C4415(C7240.f19290, AbstractC6526.f17838, 1);
        ClassKind classKind = ClassKind.INTERFACE;
        C4691 c4691M9318 = AbstractC6526.f17851.f13696.m9318();
        C4840 c4840 = C4845.f14123;
        C6987 c6987 = new C6987(c4415, classKind, c4691M9318, c4840);
        Modality modality = Modality.ABSTRACT;
        if (modality == null) {
            C6987.m12304(6);
            throw null;
        }
        c6987.f18693 = modality;
        C4490 c4490 = AbstractC4489.f13116;
        if (c4490 == null) {
            C6987.m12304(9);
            throw null;
        }
        c6987.f18694 = c4490;
        List listM11928 = AbstractC6347.m11928(C6982.m12298(c6987, Variance.IN_VARIANCE, C4691.m9330("T"), 0, c4840));
        if (c6987.f18691 != null) {
            C4211.m8605(c6987.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listM11928);
        c6987.f18691 = arrayList;
        c6987.f18692 = new C4911(c6987, arrayList, c6987.f18690, c6987.f18689);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C6987.m12304(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C7018) ((InterfaceC4484) it.next())).f18785 = c6987.mo9025();
        }
        f17915 = c6987;
    }
}
