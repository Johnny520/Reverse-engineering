package p065;

import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言世楪兰哲子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6867 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18315;

    public C6867(String str) {
        if (str != null) {
            this.f18315 = str;
        } else {
            m12063(7);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12060(C4687 c4687) {
        C4686 c4686 = c4687.f13695;
        String strReplace = c4687.f13694.f13692.f13689.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
        if (!c4686.f13692.m9324()) {
            strReplace = c4686.f13692.f13689.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        m12063(3);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6867 m12061(String str) {
        if (str != null) {
            return new C6867(str);
        }
        m12063(0);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C6867 m12062(C4686 c4686) {
        if (c4686 != null) {
            return new C6867(c4686.f13692.f13689.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        }
        m12063(4);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m12063(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C6867.m12063(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6867.class != obj.getClass()) {
            return false;
        }
        return this.f18315.equals(((C6867) obj).f18315);
    }

    public final int hashCode() {
        return this.f18315.hashCode();
    }

    public final String toString() {
        return this.f18315;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m12064() {
        String str = this.f18315;
        if (str != null) {
            return str;
        }
        m12063(10);
        throw null;
    }
}
