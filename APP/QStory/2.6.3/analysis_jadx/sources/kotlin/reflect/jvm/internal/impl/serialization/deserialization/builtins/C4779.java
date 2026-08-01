package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import androidx.compose.animation.core.C0325;
import androidx.core.view.C2242;
import io.ktor.client.plugins.api.C3886;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4815;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p049.AbstractC6526;
import p049.InterfaceC6523;
import p080.InterfaceC7021;
import p080.InterfaceC7023;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4779 implements InterfaceC6523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4777 f13921 = new C4777();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4476 m9510(C4845 c4845, InterfaceC4486 interfaceC4486, Iterable iterable, InterfaceC7021 interfaceC7021, InterfaceC7023 interfaceC7023, boolean z) {
        interfaceC4486.getClass();
        iterable.getClass();
        interfaceC7021.getClass();
        interfaceC7023.getClass();
        Set<C4687> set = AbstractC6526.f17847;
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f13921);
        set.getClass();
        ArrayList arrayList = new ArrayList();
        for (C4687 c4687 : set) {
            C4780.f13922.getClass();
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.invoke((Object) C4780.m9511(c4687));
            C4778 c4778M9891 = inputStream != null ? AbstractC4922.m9891(c4687, c4845, interfaceC4486, inputStream) : null;
            if (c4778M9891 != null) {
                arrayList.add(c4778M9891);
            }
        }
        C4476 c4476 = new C4476(arrayList);
        C0325 c0325 = new C0325(c4845, interfaceC4486);
        C2242 c2242 = new C2242(c4476, 23);
        C4780 c4780 = C4780.f13922;
        C4833 c4833 = new C4833(c4845, interfaceC4486, c2242, new C4815(interfaceC4486, c0325, c4780), c4476, iterable, c0325, interfaceC7023, interfaceC7021, c4780.f19297, null, new C3886(c4845, EmptyList.INSTANCE), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C4778) it.next()).m9509(c4833);
        }
        return c4476;
    }
}
