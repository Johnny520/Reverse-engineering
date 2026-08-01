package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4782;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4800;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import p079.AbstractC6988;
import p079.AbstractC6999;
import p083.C7040;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4595 extends AbstractC4893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6999 f13402;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4846 f13403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f13404 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4595(C4599 c4599) {
        this.f13402 = c4599;
        C0325 c0325 = c4599.f13421;
        super(((C7040) c0325.f1095).f18899);
        C4844 c4844 = ((C7040) c0325.f1095).f18899;
        C4596 c4596 = new C4596(c4599, 2);
        c4844.getClass();
        this.f13403 = new C4846(c4844, c4596);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    public final List getParameters() {
        switch (this.f13404) {
        }
        return (List) this.f13403.invoke();
    }

    public final String toString() {
        int i = this.f13404;
        AbstractC6999 abstractC6999 = this.f13402;
        switch (i) {
            case 0:
                String strM9345 = ((C4599) abstractC6999).getName().m9345();
                strM9345.getClass();
                return strM9345;
            default:
                String str = ((C4800) abstractC6999).getName().f13701;
                str.getClass();
                return str;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4460 mo9219() {
        switch (this.f13404) {
            case 0:
                return ((C7040) ((C4599) this.f13402).f13421.f1095).f18907;
            default:
                return C4460.f13085;
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
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection mo9220() {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4595.mo9220():java.util.Collection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4893, kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC4476 mo9221() {
        int i = this.f13404;
        AbstractC6999 abstractC6999 = this.f13402;
        switch (i) {
            case 0:
                return (C4599) abstractC6999;
            default:
                return (C4800) abstractC6999;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo9222() {
        switch (this.f13404) {
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4893
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC6988 mo9221() {
        int i = this.f13404;
        AbstractC6999 abstractC6999 = this.f13402;
        switch (i) {
            case 0:
                return (C4599) abstractC6999;
            default:
                return (C4800) abstractC6999;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4595(C4800 c4800) {
        this.f13402 = c4800;
        C4823 c4823 = c4800.f13990;
        super(c4823.f14058.f14088);
        C4844 c4844 = c4823.f14058.f14088;
        C4782 c4782 = new C4782(c4800, 6);
        c4844.getClass();
        this.f13403 = new C4846(c4844, c4782);
    }
}
