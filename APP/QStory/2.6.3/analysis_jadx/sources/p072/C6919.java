package p072;

import java.security.AccessControlException;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4615;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4636;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4684;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import p077.C6972;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6919 implements InterfaceC4636 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final HashMap f18452;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean f18453;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String[] f18454;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String[] f18455;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public String[] f18456;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String[] f18457;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public KotlinClassHeader$Kind f18458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f18459;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f18460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f18461;

    static {
        try {
            f18453 = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f18453 = false;
        }
        HashMap map = new HashMap();
        f18452 = map;
        map.put(AbstractC4684.m9307(new C4687("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader$Kind.CLASS);
        map.put(AbstractC4684.m9307(new C4687("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader$Kind.FILE_FACADE);
        map.put(AbstractC4684.m9307(new C4687("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader$Kind.MULTIFILE_CLASS);
        map.put(AbstractC4684.m9307(new C4687("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader$Kind.MULTIFILE_CLASS_PART);
        map.put(AbstractC4684.m9307(new C4687("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader$Kind.SYNTHETIC_CLASS);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4636
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4643 mo990(C4688 c4688, C6972 c6972) {
        KotlinClassHeader$Kind kotlinClassHeader$Kind;
        C4687 c4687M9327 = c4688.m9327();
        if (c4687M9327.equals(AbstractC4615.f13485)) {
            return new C6921(this, 0);
        }
        if (c4687M9327.equals(AbstractC4615.f13489)) {
            return new C6921(this, 1);
        }
        if (f18453 || this.f18458 != null || (kotlinClassHeader$Kind = (KotlinClassHeader$Kind) f18452.get(c4688)) == null) {
            return null;
        }
        this.f18458 = kotlinClassHeader$Kind;
        return new C6921(this, 2);
    }
}
