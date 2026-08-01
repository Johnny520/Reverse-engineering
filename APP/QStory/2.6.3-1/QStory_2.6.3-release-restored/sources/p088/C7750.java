package p088;

import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5581;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7750 implements InterfaceC5475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7748 f18809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18810;

    public /* synthetic */ C7750(C7748 c7748, int i) {
        this.f18810 = i;
        this.f18809 = c7748;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1541(C5523 c5523, C5581 c5581) {
        int i = this.f18810;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1542() {
        int i = this.f18810;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final InterfaceC5476 mo1544(C5523 c5523) {
        int i = 0;
        int i2 = 1;
        switch (this.f18810) {
            case 0:
                String strM9894 = c5523.m9894();
                if ("d1".equals(strM9894)) {
                    return new C7751(this, i);
                }
                if ("d2".equals(strM9894)) {
                    return new C7751(this, i2);
                }
                return null;
            case 1:
                if ("b".equals(c5523.m9894())) {
                    return new C7751(this, 2);
                }
                return null;
            default:
                String strM98942 = c5523.m9894();
                if ("data".equals(strM98942) || "filePartClassNames".equals(strM98942)) {
                    return new C7749(this, i);
                }
                if ("strings".equals(strM98942)) {
                    return new C7749(this, i2);
                }
                return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1548(C5523 c5523, Object obj) {
        int i = this.f18810;
        C7748 c7748 = this.f18809;
        switch (i) {
            case 0:
                String strM9894 = c5523.m9894();
                if (!"k".equals(strM9894)) {
                    if (!"mv".equals(strM9894)) {
                        if (!"xs".equals(strM9894)) {
                            if (!"xi".equals(strM9894)) {
                                "pn".equals(strM9894);
                            } else if (obj instanceof Integer) {
                                c7748.f18805 = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                c7748.f18804 = str;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        c7748.f18806 = (int[]) obj;
                    }
                } else if (obj instanceof Integer) {
                    c7748.f18803 = KotlinClassHeader$Kind.getById(((Integer) obj).intValue());
                }
                break;
            case 1:
                break;
            default:
                String strM98942 = c5523.m9894();
                if (!"version".equals(strM98942)) {
                    if ("multifileClassName".equals(strM98942)) {
                        c7748.f18804 = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    c7748.f18806 = (int[]) obj;
                }
                break;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo1549(C5523 c5523, C5520 c5520, C5523 c55232) {
        int i = this.f18810;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC5475 mo1551(C5520 c5520, C5523 c5523) {
        switch (this.f18810) {
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m12778() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    private final void m12779() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    private final void m12780() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m12771(C5523 c5523, C5581 c5581) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m12772(C5523 c5523, C5581 c5581) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m12773(C5523 c5523, C5581 c5581) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m12774(C5523 c5523, Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    private final void m12775(C5523 c5523, C5520 c5520, C5523 c55232) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    private final void m12776(C5523 c5523, C5520 c5520, C5523 c55232) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    private final void m12777(C5523 c5523, C5520 c5520, C5523 c55232) {
    }
}
