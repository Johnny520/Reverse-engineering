package p084;

import androidx.compose.animation.core.C0325;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4428;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4429;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4569;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p077.C6967;
import p083.C7040;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C7045 implements InterfaceC4569 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f18926 = {new PropertyReference1Impl(C7045.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC4428 f18927;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4846 f18928;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4461 f18929;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 f18930;

    public C7045(C0325 c0325, C4429 c4429, C4686 c4686) {
        InterfaceC4461 interfaceC4461M12257;
        c0325.getClass();
        C7040 c7040 = (C7040) c0325.f1095;
        c4686.getClass();
        this.f18930 = c4686;
        if (c4429 != null) {
            c7040.f18917.getClass();
            interfaceC4461M12257 = C6967.m12257(c4429);
        } else {
            interfaceC4461M12257 = InterfaceC4461.f13087;
        }
        this.f18929 = interfaceC4461M12257;
        C4844 c4844 = c7040.f18899;
        C5027 c5027 = new C5027(c0325, 24, this);
        c4844.getClass();
        this.f18928 = new C4846(c4844, c5027);
        this.f18927 = c4429 != null ? (AbstractC4428) AbstractC4343.m8826(c4429.m8983()) : null;
    }

    @Override // p046.InterfaceC6477
    public final AbstractC4881 getType() {
        Object objM14672 = AbstractC9124.m14672(this.f18928, f18926[0]);
        objM14672.getClass();
        return (AbstractC4877) objM14672;
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Map mo9186() {
        return AbstractC4338.m8781();
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4461 mo9187() {
        return this.f18929;
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4686 mo9188() {
        return this.f18930;
    }
}
