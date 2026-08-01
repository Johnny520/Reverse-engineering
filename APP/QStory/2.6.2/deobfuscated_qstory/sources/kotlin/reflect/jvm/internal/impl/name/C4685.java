package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4685 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4690 f13685 = C4690.m9343("<root>");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public transient C4690 f13686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public transient C4685 f13687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public transient C4686 f13688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13689;

    static {
        Pattern.compile("\\.").getClass();
    }

    public C4685(String str, C4686 c4686) {
        str.getClass();
        this.f13689 = str;
        this.f13688 = c4686;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final List m9321(C4685 c4685) {
        if (c4685.m9324()) {
            return new ArrayList();
        }
        List listM9321 = m9321(c4685.m9322());
        listM9321.add(c4685.m9328());
        return listM9321;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4685) {
            return AbstractC4394.m8917(this.f13689, ((C4685) obj).f13689);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13689.hashCode();
    }

    public final String toString() {
        if (!m9324()) {
            return this.f13689;
        }
        String strM9345 = f13685.m9345();
        strM9345.getClass();
        return strM9345;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4685 m9322() {
        C4685 c4685 = this.f13687;
        if (c4685 != null) {
            return c4685;
        }
        if (m9324()) {
            C5919.m11250("root");
            return null;
        }
        m9325();
        C4685 c46852 = this.f13687;
        c46852.getClass();
        return c46852;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m9323() {
        return this.f13688 != null || AbstractC5143.m10151(this.f13689, '<', 0, 6) < 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m9324() {
        return this.f13689.length() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9325() {
        String str = this.f13689;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                break;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.f13686 = C4690.m9341(str.substring(length + 1));
            this.f13687 = new C4685(str.substring(0, length));
        } else {
            this.f13686 = C4690.m9341(str);
            this.f13687 = C4686.f13690.f13692;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4685 m9326(C4690 c4690) {
        String strM9345;
        c4690.getClass();
        if (m9324()) {
            strM9345 = c4690.m9345();
        } else {
            strM9345 = this.f13689 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c4690.m9345();
        }
        strM9345.getClass();
        return new C4685(strM9345, this, c4690);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m9327(C4690 c4690) {
        c4690.getClass();
        if (!m9324()) {
            String str = this.f13689;
            int iM10151 = AbstractC5143.m10151(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 0, 6);
            if (iM10151 == -1) {
                iM10151 = str.length();
            }
            int i = iM10151;
            String strM9345 = c4690.m9345();
            strM9345.getClass();
            if (i == strM9345.length() && AbstractC5138.m10127(0, 0, i, this.f13689, strM9345, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4690 m9328() {
        C4690 c4690 = this.f13686;
        if (c4690 != null) {
            return c4690;
        }
        if (m9324()) {
            C5919.m11250("root");
            return null;
        }
        m9325();
        C4690 c46902 = this.f13686;
        c46902.getClass();
        return c46902;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4686 m9329() {
        C4686 c4686 = this.f13688;
        if (c4686 != null) {
            return c4686;
        }
        C4686 c46862 = new C4686(this);
        this.f13688 = c46862;
        return c46862;
    }

    public C4685(String str) {
        this.f13689 = str;
    }

    public C4685(String str, C4685 c4685, C4690 c4690) {
        this.f13689 = str;
        this.f13687 = c4685;
        this.f13686 = c4690;
    }
}
