package p084;

import androidx.compose.animation.core.C0325;
import java.util.Map;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4429;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4430;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4570;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p018.AbstractC6253;
import p077.C6968;
import p083.C7041;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7046 implements InterfaceC4570 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f18921 = {new PropertyReference1Impl(C7046.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC4429 f18922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4847 f18923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4462 f18924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 f18925;

    public C7046(C0325 c0325, C4430 c4430, C4687 c4687) {
        InterfaceC4462 interfaceC4462M12284;
        c0325.getClass();
        C7041 c7041 = (C7041) c0325.f1095;
        c4687.getClass();
        this.f18925 = c4687;
        if (c4430 != null) {
            c7041.f18912.getClass();
            interfaceC4462M12284 = C6968.m12284(c4430);
        } else {
            interfaceC4462M12284 = InterfaceC4462.f13091;
        }
        this.f18924 = interfaceC4462M12284;
        C4845 c4845 = c7041.f18894;
        C5028 c5028 = new C5028(c0325, 24, this);
        c4845.getClass();
        this.f18923 = new C4847(c4845, c5028);
        this.f18922 = c4430 != null ? (AbstractC4429) AbstractC4344.m8816(c4430.m8973()) : null;
    }

    @Override // p046.InterfaceC6478
    public final AbstractC4882 getType() {
        Object objM11749 = AbstractC6253.m11749(this.f18923, f18921[0]);
        objM11749.getClass();
        return (AbstractC4878) objM11749;
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Map mo9176() {
        return AbstractC4339.m8776();
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4462 mo9177() {
        return this.f18924;
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4687 mo9178() {
        return this.f18925;
    }
}
