package p393;

import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import top.sacz.xphelper.exception.ReflectException;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f25513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Class f25514;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final HashMap f25509 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final HashMap f25508 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final HashMap f25510 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f25512 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f25511 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Member m14685() {
        m14687();
        if (this.f25512.isEmpty()) {
            return null;
        }
        return (Member) this.f25512.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Member m14686() {
        m14687();
        if (this.f25512.isEmpty()) {
            throw new ReflectException("can not find ".concat(mo14652()));
        }
        return (Member) this.f25512.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC9126 m14687() {
        Class cls;
        if (!this.f25511) {
            mo14651();
            if (this.f25512.isEmpty() && (cls = this.f25514) != Object.class) {
                Class superclass = cls.getSuperclass();
                this.f25514 = superclass;
                if (this.f25513 == null) {
                    this.f25513 = superclass.getName();
                }
                return m14687();
            }
            this.f25511 = true;
            Iterator it = this.f25512.iterator();
            while (it.hasNext()) {
                XposedHelpers.callMethod((Member) it.next(), "setAccessible", new Object[]{Boolean.TRUE});
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract AbstractC9126 mo14651();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract String mo14652();
}
