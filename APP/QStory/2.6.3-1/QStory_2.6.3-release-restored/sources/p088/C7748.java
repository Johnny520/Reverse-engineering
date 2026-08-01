package p088;

import java.security.AccessControlException;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5447;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5468;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5516;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import p093.C7801;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7748 implements InterfaceC5468 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final HashMap f18797;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean f18798;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String[] f18799;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String[] f18800;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public String[] f18801;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String[] f18802;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public KotlinClassHeader$Kind f18803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f18804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f18805;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f18806;

    static {
        try {
            f18798 = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f18798 = false;
        }
        HashMap map = new HashMap();
        f18797 = map;
        map.put(AbstractC5516.m9866(new C5519("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader$Kind.CLASS);
        map.put(AbstractC5516.m9866(new C5519("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader$Kind.FILE_FACADE);
        map.put(AbstractC5516.m9866(new C5519("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader$Kind.MULTIFILE_CLASS);
        map.put(AbstractC5516.m9866(new C5519("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader$Kind.MULTIFILE_CLASS_PART);
        map.put(AbstractC5516.m9866(new C5519("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader$Kind.SYNTHETIC_CLASS);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5468
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC5475 mo1550(C5520 c5520, C7801 c7801) {
        KotlinClassHeader$Kind kotlinClassHeader$Kind;
        C5519 c5519M9886 = c5520.m9886();
        if (c5519M9886.equals(AbstractC5447.f13830)) {
            return new C7750(this, 0);
        }
        if (c5519M9886.equals(AbstractC5447.f13834)) {
            return new C7750(this, 1);
        }
        if (f18798 || this.f18803 != null || (kotlinClassHeader$Kind = (KotlinClassHeader$Kind) f18797.get(c5520)) == null) {
            return null;
        }
        this.f18803 = kotlinClassHeader$Kind;
        return new C7750(this, 2);
    }
}
