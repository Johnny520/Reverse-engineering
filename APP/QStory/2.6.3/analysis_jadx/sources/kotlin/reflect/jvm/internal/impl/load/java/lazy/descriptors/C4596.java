package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4783;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4801;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4894;
import p079.AbstractC6989;
import p079.AbstractC7000;
import p083.C7041;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4596 extends AbstractC4894 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7000 f13406;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4847 f13407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f13408 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4596(C4600 c4600) {
        this.f13406 = c4600;
        C0325 c0325 = c4600.f13425;
        super(((C7041) c0325.f1095).f18894);
        C4845 c4845 = ((C7041) c0325.f1095).f18894;
        C4597 c4597 = new C4597(c4600, 2);
        c4845.getClass();
        this.f13407 = new C4847(c4845, c4597);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        switch (this.f13408) {
        }
        return (List) this.f13407.invoke();
    }

    public final String toString() {
        int i = this.f13408;
        AbstractC7000 abstractC7000 = this.f13406;
        switch (i) {
            case 0:
                String strM9335 = ((C4600) abstractC7000).getName().m9335();
                strM9335.getClass();
                return strM9335;
            default:
                String str = ((C4801) abstractC7000).getName().f13705;
                str.getClass();
                return str;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4461 mo9209() {
        switch (this.f13408) {
            case 0:
                return ((C7041) ((C4600) this.f13406).f13425.f1095).f18902;
            default:
                return C4461.f13089;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0258  */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection mo9210() {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4596.mo9210():java.util.Collection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4894, kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC4477 mo9211() {
        int i = this.f13408;
        AbstractC7000 abstractC7000 = this.f13406;
        switch (i) {
            case 0:
                return (C4600) abstractC7000;
            default:
                return (C4801) abstractC7000;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo9212() {
        switch (this.f13408) {
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4894
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC6989 mo9211() {
        int i = this.f13408;
        AbstractC7000 abstractC7000 = this.f13406;
        switch (i) {
            case 0:
                return (C4600) abstractC7000;
            default:
                return (C4801) abstractC7000;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4596(C4801 c4801) {
        this.f13406 = c4801;
        C4824 c4824 = c4801.f13994;
        super(c4824.f14062.f14092);
        C4845 c4845 = c4824.f14062.f14092;
        C4783 c4783 = new C4783(c4801, 6);
        c4845.getClass();
        this.f13407 = new C4847(c4845, c4783);
    }
}
