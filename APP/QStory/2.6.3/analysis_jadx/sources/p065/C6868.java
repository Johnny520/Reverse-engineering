package p065;

import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言世楪兰哲子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6868 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18310;

    public C6868(String str) {
        if (str != null) {
            this.f18310 = str;
        } else {
            m12091(7);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12088(C4688 c4688) {
        C4687 c4687 = c4688.f13699;
        String strReplace = c4688.f13698.f13696.f13693.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
        if (!c4687.f13696.m9314()) {
            strReplace = c4687.f13696.f13693.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        m12091(3);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6868 m12089(String str) {
        if (str != null) {
            return new C6868(str);
        }
        m12091(0);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C6868 m12090(C4687 c4687) {
        if (c4687 != null) {
            return new C6868(c4687.f13696.f13693.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        }
        m12091(4);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m12091(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C6868.m12091(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6868.class != obj.getClass()) {
            return false;
        }
        return this.f18310.equals(((C6868) obj).f18310);
    }

    public final int hashCode() {
        return this.f18310.hashCode();
    }

    public final String toString() {
        return this.f18310;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m12092() {
        String str = this.f18310;
        if (str != null) {
            return str;
        }
        m12091(10);
        throw null;
    }
}
