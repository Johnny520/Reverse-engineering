package p100;

import androidx.compose.animation.core.C1171;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5261;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5262;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC5402;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p034.AbstractC7082;
import p093.C7797;
import p099.C7870;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7875 implements InterfaceC5402 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f19266 = {new PropertyReference1Impl(C7875.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC5261 f19267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5679 f19268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5294 f19269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5519 f19270;

    public C7875(C1171 c1171, C5262 c5262, C5519 c5519) {
        InterfaceC5294 interfaceC5294M12843;
        c1171.getClass();
        C7870 c7870 = (C7870) c1171.f1440;
        c5519.getClass();
        this.f19270 = c5519;
        if (c5262 != null) {
            c7870.f19257.getClass();
            interfaceC5294M12843 = C7797.m12843(c5262);
        } else {
            interfaceC5294M12843 = InterfaceC5294.f13436;
        }
        this.f19269 = interfaceC5294M12843;
        C5677 c5677 = c7870.f19239;
        C5860 c5860 = new C5860(c1171, 24, this);
        c5677.getClass();
        this.f19268 = new C5679(c5677, c5860);
        this.f19267 = c5262 != null ? (AbstractC5261) AbstractC5176.m9375(c5262.m9532()) : null;
    }

    @Override // p062.InterfaceC7307
    public final AbstractC5714 getType() {
        Object objM12308 = AbstractC7082.m12308(this.f19268, f19266[0]);
        objM12308.getClass();
        return (AbstractC5710) objM12308;
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Map mo9735() {
        return AbstractC5171.m9335();
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5294 mo9736() {
        return this.f19269;
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5519 mo9737() {
        return this.f19270;
    }
}
