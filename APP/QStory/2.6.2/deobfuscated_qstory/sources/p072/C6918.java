package p072;

import java.security.AccessControlException;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4614;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4635;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4683;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p077.C6971;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6918 implements InterfaceC4635 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final HashMap f18457;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean f18458;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String[] f18459;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String[] f18460;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public String[] f18461;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String[] f18462;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public KotlinClassHeader$Kind f18463;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f18464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f18465;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f18466;

    static {
        try {
            f18458 = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f18458 = false;
        }
        HashMap map = new HashMap();
        f18457 = map;
        map.put(AbstractC4683.m9317(new C4686("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader$Kind.CLASS);
        map.put(AbstractC4683.m9317(new C4686("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader$Kind.FILE_FACADE);
        map.put(AbstractC4683.m9317(new C4686("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader$Kind.MULTIFILE_CLASS);
        map.put(AbstractC4683.m9317(new C4686("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader$Kind.MULTIFILE_CLASS_PART);
        map.put(AbstractC4683.m9317(new C4686("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader$Kind.SYNTHETIC_CLASS);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4635
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC4642 mo988(C4687 c4687, C6971 c6971) {
        KotlinClassHeader$Kind kotlinClassHeader$Kind;
        C4686 c4686M9337 = c4687.m9337();
        if (c4686M9337.equals(AbstractC4614.f13481)) {
            return new C6920(this, 0);
        }
        if (c4686M9337.equals(AbstractC4614.f13485)) {
            return new C6920(this, 1);
        }
        if (f18458 || this.f18463 != null || (kotlinClassHeader$Kind = (KotlinClassHeader$Kind) f18457.get(c4687)) == null) {
            return null;
        }
        this.f18463 = kotlinClassHeader$Kind;
        return new C6920(this, 2);
    }
}
