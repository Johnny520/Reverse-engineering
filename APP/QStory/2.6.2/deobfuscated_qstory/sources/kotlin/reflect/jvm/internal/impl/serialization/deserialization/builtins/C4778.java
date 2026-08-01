package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import androidx.compose.animation.core.C0325;
import androidx.core.view.C2242;
import io.ktor.client.plugins.api.C3885;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C4475;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4814;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import p049.AbstractC6525;
import p049.InterfaceC6522;
import p080.InterfaceC7020;
import p080.InterfaceC7022;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4778 implements InterfaceC6522 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4776 f13917 = new C4776();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4475 m9520(C4844 c4844, InterfaceC4485 interfaceC4485, Iterable iterable, InterfaceC7020 interfaceC7020, InterfaceC7022 interfaceC7022, boolean z) {
        interfaceC4485.getClass();
        iterable.getClass();
        interfaceC7020.getClass();
        interfaceC7022.getClass();
        Set<C4686> set = AbstractC6525.f17851;
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f13917);
        set.getClass();
        ArrayList arrayList = new ArrayList();
        for (C4686 c4686 : set) {
            C4779.f13918.getClass();
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.invoke((Object) C4779.m9521(c4686));
            C4777 c4777M13668 = inputStream != null ? AbstractC8189.m13668(c4686, c4844, interfaceC4485, inputStream) : null;
            if (c4777M13668 != null) {
                arrayList.add(c4777M13668);
            }
        }
        C4475 c4475 = new C4475(arrayList);
        C0325 c0325 = new C0325(c4844, interfaceC4485);
        C2242 c2242 = new C2242(c4475, 23);
        C4779 c4779 = C4779.f13918;
        C4832 c4832 = new C4832(c4844, interfaceC4485, c2242, new C4814(interfaceC4485, c0325, c4779), c4475, iterable, c0325, interfaceC7022, interfaceC7020, c4779.f19302, null, new C3885(c4844, EmptyList.INSTANCE), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C4777) it.next()).m9519(c4832);
        }
        return c4475;
    }
}
