package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.compose.foundation.text.C1012;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4777;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4778;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4780;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4848;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p049.AbstractC6526;
import p052.InterfaceC6558;
import p077.C6971;
import p079.C6988;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4418 implements InterfaceC4475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4848 f13013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4833 f13014;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6988 f13015;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4845 f13016;

    public C4418(C4845 c4845, C6971 c6971, C6988 c6988) {
        this.f13016 = c4845;
        this.f13015 = c6988;
        this.f13013 = c4845.m9578(new C1012(this, 14));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4778 m8951(C4687 c4687) {
        InputStream inputStreamM9508;
        c4687.getClass();
        C4691 c4691 = AbstractC6526.f17852;
        c4691.getClass();
        if (c4687.f13696.m9317(c4691)) {
            C4780.f13922.getClass();
            inputStreamM9508 = C4777.m9508(C4780.m9511(c4687));
        } else {
            inputStreamM9508 = null;
        }
        if (inputStreamM9508 != null) {
            return AbstractC4922.m9891(c4687, this.f13016, this.f13015, inputStreamM9508);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo8952(C4687 c4687) {
        c4687.getClass();
        C4848 c4848 = this.f13013;
        return (c4848.m9584(c4687) ? (InterfaceC4466) c4848.invoke(c4687) : m8951(c4687)) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8953(C4687 c4687, ArrayList arrayList) throws Throwable {
        c4687.getClass();
        Object objInvoke = this.f13013.invoke(c4687);
        if (objInvoke != null) {
            arrayList.add(objInvoke);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Collection mo8954(C4687 c4687, InterfaceC6558 interfaceC6558) {
        c4687.getClass();
        return EmptySet.INSTANCE;
    }
}
