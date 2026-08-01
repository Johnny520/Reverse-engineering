package p095;

import com.bumptech.glide.AbstractC3888;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p034.AbstractC7082;
import p068.InterfaceC7372;
import p117.C8084;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7836 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7833 f19170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19171;

    public /* synthetic */ C7836(C7833 c7833, int i) {
        this.f19171 = i;
        this.f19170 = c7833;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f19171;
        C7833 c7833 = this.f19170;
        switch (i) {
            case 0:
                C7817 c7817 = c7833.f19160;
                c7817.m12864();
                C7846 c7846 = (C7846) c7817.f19041.getValue();
                C5519 c5519 = c7833.f19157;
                c7846.getClass();
                c5519.getClass();
                ArrayList arrayList = new ArrayList();
                c7846.mo9512(c5519, arrayList);
                return arrayList;
            case 1:
                C7817 c78172 = c7833.f19160;
                c78172.m12864();
                return Boolean.valueOf(AbstractC5323.m9640((C7846) c78172.f19041.getValue(), c7833.f19157));
            default:
                C5679 c5679 = c7833.f19158;
                InterfaceC5920[] interfaceC5920Arr = C7833.f19155;
                boolean zBooleanValue = ((Boolean) AbstractC7082.m12308(c5679, interfaceC5920Arr[1])).booleanValue();
                C5519 c55192 = c7833.f19157;
                C7817 c78173 = c7833.f19160;
                if (zBooleanValue) {
                    return C8084.f19681;
                }
                List list = (List) AbstractC7082.m12308(c7833.f19156, interfaceC5920Arr[0]);
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((InterfaceC5298) it.next()).mo9509());
                }
                return AbstractC3888.m7282("package view scope for " + c55192 + " in " + c78173.getName(), AbstractC5176.m9353(arrayList2, new C7809(c78173, c55192)));
        }
    }
}
