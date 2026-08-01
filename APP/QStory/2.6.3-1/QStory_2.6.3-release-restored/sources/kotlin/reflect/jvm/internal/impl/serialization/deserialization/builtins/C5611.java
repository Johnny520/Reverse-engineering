package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import androidx.compose.animation.core.C1171;
import androidx.core.view.C3075;
import io.ktor.client.plugins.api.C4718;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C5308;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5647;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p065.AbstractC7355;
import p065.InterfaceC7352;
import p096.InterfaceC7850;
import p096.InterfaceC7852;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5611 implements InterfaceC7352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5609 f14266 = new C5609();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5308 m10069(C5677 c5677, InterfaceC5318 interfaceC5318, Iterable iterable, InterfaceC7850 interfaceC7850, InterfaceC7852 interfaceC7852, boolean z) {
        interfaceC5318.getClass();
        iterable.getClass();
        interfaceC7850.getClass();
        interfaceC7852.getClass();
        Set<C5519> set = AbstractC7355.f18192;
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f14266);
        set.getClass();
        ArrayList arrayList = new ArrayList();
        for (C5519 c5519 : set) {
            C5612.f14267.getClass();
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.invoke((Object) C5612.m10070(c5519));
            C5610 c5610M10450 = inputStream != null ? AbstractC5754.m10450(c5519, c5677, interfaceC5318, inputStream) : null;
            if (c5610M10450 != null) {
                arrayList.add(c5610M10450);
            }
        }
        C5308 c5308 = new C5308(arrayList);
        C1171 c1171 = new C1171(c5677, interfaceC5318);
        C3075 c3075 = new C3075(c5308, 23);
        C5612 c5612 = C5612.f14267;
        C5665 c5665 = new C5665(c5677, interfaceC5318, c3075, new C5647(interfaceC5318, c1171, c5612), c5308, iterable, c1171, interfaceC7852, interfaceC7850, c5612.f19642, null, new C4718(c5677, EmptyList.INSTANCE), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C5610) it.next()).m10068(c5665);
        }
        return c5308;
    }
}
