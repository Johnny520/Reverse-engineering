package p380;

import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import top.sacz.xphelper.exception.ReflectException;

/* JADX INFO: renamed from: 飘花落叶言苏楪世兰哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8998 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f25270;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Class f25271;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final HashMap f25266 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final HashMap f25265 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final HashMap f25267 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f25269 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f25268 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Member m14604() {
        m14606();
        if (this.f25269.isEmpty()) {
            return null;
        }
        return (Member) this.f25269.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Member m14605() {
        m14606();
        if (this.f25269.isEmpty()) {
            throw new ReflectException("can not find ".concat(mo14608()));
        }
        return (Member) this.f25269.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC8998 m14606() {
        Class cls;
        if (!this.f25268) {
            mo14607();
            if (this.f25269.isEmpty() && (cls = this.f25271) != Object.class) {
                Class superclass = cls.getSuperclass();
                this.f25271 = superclass;
                if (this.f25270 == null) {
                    this.f25270 = superclass.getName();
                }
                return m14606();
            }
            this.f25268 = true;
            Iterator it = this.f25269.iterator();
            while (it.hasNext()) {
                XposedHelpers.callMethod((Member) it.next(), "setAccessible", new Object[]{Boolean.TRUE});
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract AbstractC8998 mo14607();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract String mo14608();
}
