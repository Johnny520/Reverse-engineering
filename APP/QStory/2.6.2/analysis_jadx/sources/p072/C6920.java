package p072;

import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4748;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6920 implements InterfaceC4642 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6918 f18469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18470;

    public /* synthetic */ C6920(C6918 c6918, int i) {
        this.f18470 = i;
        this.f18469 = c6918;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo979(C4690 c4690, C4748 c4748) {
        int i = this.f18470;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo980() {
        int i = this.f18470;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC4643 mo983(C4690 c4690) {
        int i = 0;
        int i2 = 1;
        switch (this.f18470) {
            case 0:
                String strM9345 = c4690.m9345();
                if ("d1".equals(strM9345)) {
                    return new C6921(this, i);
                }
                if ("d2".equals(strM9345)) {
                    return new C6921(this, i2);
                }
                return null;
            case 1:
                if ("b".equals(c4690.m9345())) {
                    return new C6921(this, 2);
                }
                return null;
            default:
                String strM93452 = c4690.m9345();
                if ("data".equals(strM93452) || "filePartClassNames".equals(strM93452)) {
                    return new C6919(this, i);
                }
                if ("strings".equals(strM93452)) {
                    return new C6919(this, i2);
                }
                return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo987(C4690 c4690, Object obj) {
        int i = this.f18470;
        C6918 c6918 = this.f18469;
        switch (i) {
            case 0:
                String strM9345 = c4690.m9345();
                if (!"k".equals(strM9345)) {
                    if (!"mv".equals(strM9345)) {
                        if (!"xs".equals(strM9345)) {
                            if (!"xi".equals(strM9345)) {
                                "pn".equals(strM9345);
                            } else if (obj instanceof Integer) {
                                c6918.f18465 = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                c6918.f18464 = str;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        c6918.f18466 = (int[]) obj;
                    }
                } else if (obj instanceof Integer) {
                    c6918.f18463 = KotlinClassHeader$Kind.getById(((Integer) obj).intValue());
                }
                break;
            case 1:
                break;
            default:
                String strM93452 = c4690.m9345();
                if (!"version".equals(strM93452)) {
                    if ("multifileClassName".equals(strM93452)) {
                        c6918.f18464 = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    c6918.f18466 = (int[]) obj;
                }
                break;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC4642 mo989(C4687 c4687, C4690 c4690) {
        switch (this.f18470) {
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo990(C4690 c4690, C4687 c4687, C4690 c46902) {
        int i = this.f18470;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m12191() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    private final void m12192() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    private final void m12193() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m12184(C4690 c4690, C4748 c4748) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m12185(C4690 c4690, C4748 c4748) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m12186(C4690 c4690, C4748 c4748) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m12187(C4690 c4690, Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    private final void m12188(C4690 c4690, C4687 c4687, C4690 c46902) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    private final void m12189(C4690 c4690, C4687 c4687, C4690 c46902) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    private final void m12190(C4690 c4690, C4687 c4687, C4690 c46902) {
    }
}
