package p396;

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
public abstract class AbstractC9827 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f25615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Class f25616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final HashMap f25611 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final HashMap f25610 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final HashMap f25612 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f25614 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f25613 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Member m15163() {
        m15165();
        if (this.f25614.isEmpty()) {
            return null;
        }
        return (Member) this.f25614.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Member m15164() {
        m15165();
        if (this.f25614.isEmpty()) {
            throw new ReflectException("can not find ".concat(mo15167()));
        }
        return (Member) this.f25614.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC9827 m15165() {
        Class cls;
        if (!this.f25613) {
            mo15166();
            if (this.f25614.isEmpty() && (cls = this.f25616) != Object.class) {
                Class superclass = cls.getSuperclass();
                this.f25616 = superclass;
                if (this.f25615 == null) {
                    this.f25615 = superclass.getName();
                }
                return m15165();
            }
            this.f25613 = true;
            Iterator it = this.f25614.iterator();
            while (it.hasNext()) {
                XposedHelpers.callMethod((Member) it.next(), "setAccessible", new Object[]{Boolean.TRUE});
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract AbstractC9827 mo15166();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract String mo15167();
}
