package p072;

import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4749;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6921 implements InterfaceC4643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6919 f18464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18465;

    public /* synthetic */ C6921(C6919 c6919, int i) {
        this.f18465 = i;
        this.f18464 = c6919;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo981(C4691 c4691, C4749 c4749) {
        int i = this.f18465;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo982() {
        int i = this.f18465;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final InterfaceC4644 mo984(C4691 c4691) {
        int i = 0;
        int i2 = 1;
        switch (this.f18465) {
            case 0:
                String strM9335 = c4691.m9335();
                if ("d1".equals(strM9335)) {
                    return new C6922(this, i);
                }
                if ("d2".equals(strM9335)) {
                    return new C6922(this, i2);
                }
                return null;
            case 1:
                if ("b".equals(c4691.m9335())) {
                    return new C6922(this, 2);
                }
                return null;
            default:
                String strM93352 = c4691.m9335();
                if ("data".equals(strM93352) || "filePartClassNames".equals(strM93352)) {
                    return new C6920(this, i);
                }
                if ("strings".equals(strM93352)) {
                    return new C6920(this, i2);
                }
                return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo988(C4691 c4691, Object obj) {
        int i = this.f18465;
        C6919 c6919 = this.f18464;
        switch (i) {
            case 0:
                String strM9335 = c4691.m9335();
                if (!"k".equals(strM9335)) {
                    if (!"mv".equals(strM9335)) {
                        if (!"xs".equals(strM9335)) {
                            if (!"xi".equals(strM9335)) {
                                "pn".equals(strM9335);
                            } else if (obj instanceof Integer) {
                                c6919.f18460 = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                c6919.f18459 = str;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        c6919.f18461 = (int[]) obj;
                    }
                } else if (obj instanceof Integer) {
                    c6919.f18458 = KotlinClassHeader$Kind.getById(((Integer) obj).intValue());
                }
                break;
            case 1:
                break;
            default:
                String strM93352 = c4691.m9335();
                if (!"version".equals(strM93352)) {
                    if ("multifileClassName".equals(strM93352)) {
                        c6919.f18459 = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    c6919.f18461 = (int[]) obj;
                }
                break;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo989(C4691 c4691, C4688 c4688, C4691 c46912) {
        int i = this.f18465;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC4643 mo991(C4688 c4688, C4691 c4691) {
        switch (this.f18465) {
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m12219() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    private final void m12220() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    private final void m12221() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m12212(C4691 c4691, C4749 c4749) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m12213(C4691 c4691, C4749 c4749) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m12214(C4691 c4691, C4749 c4749) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m12215(C4691 c4691, Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    private final void m12216(C4691 c4691, C4688 c4688, C4691 c46912) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    private final void m12217(C4691 c4691, C4688 c4688, C4691 c46912) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    private final void m12218(C4691 c4691, C4688 c4688, C4691 c46912) {
    }
}
