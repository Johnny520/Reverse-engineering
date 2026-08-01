package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4686 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4691 f13689 = C4691.m9333("<root>");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public transient C4691 f13690;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public transient C4686 f13691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public transient C4687 f13692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13693;

    static {
        Pattern.compile("\\.").getClass();
    }

    public C4686(String str, C4687 c4687) {
        str.getClass();
        this.f13693 = str;
        this.f13692 = c4687;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final List m9311(C4686 c4686) {
        if (c4686.m9314()) {
            return new ArrayList();
        }
        List listM9311 = m9311(c4686.m9312());
        listM9311.add(c4686.m9318());
        return listM9311;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4686) {
            return AbstractC4395.m8907(this.f13693, ((C4686) obj).f13693);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13693.hashCode();
    }

    public final String toString() {
        if (!m9314()) {
            return this.f13693;
        }
        String strM9335 = f13689.m9335();
        strM9335.getClass();
        return strM9335;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4686 m9312() {
        C4686 c4686 = this.f13691;
        if (c4686 != null) {
            return c4686;
        }
        if (m9314()) {
            C5925.m11311("root");
            return null;
        }
        m9315();
        C4686 c46862 = this.f13691;
        c46862.getClass();
        return c46862;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m9313() {
        return this.f13692 != null || AbstractC5144.m10171(this.f13693, '<', 0, 6) < 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m9314() {
        return this.f13693.length() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9315() {
        String str = this.f13693;
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
            this.f13690 = C4691.m9331(str.substring(length + 1));
            this.f13691 = new C4686(str.substring(0, length));
        } else {
            this.f13690 = C4691.m9331(str);
            this.f13691 = C4687.f13694.f13696;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 m9316(C4691 c4691) {
        String strM9335;
        c4691.getClass();
        if (m9314()) {
            strM9335 = c4691.m9335();
        } else {
            strM9335 = this.f13693 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c4691.m9335();
        }
        strM9335.getClass();
        return new C4686(strM9335, this, c4691);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m9317(C4691 c4691) {
        c4691.getClass();
        if (!m9314()) {
            String str = this.f13693;
            int iM10171 = AbstractC5144.m10171(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 0, 6);
            if (iM10171 == -1) {
                iM10171 = str.length();
            }
            int i = iM10171;
            String strM9335 = c4691.m9335();
            strM9335.getClass();
            if (i == strM9335.length() && AbstractC5139.m10132(0, 0, i, this.f13693, strM9335, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4691 m9318() {
        C4691 c4691 = this.f13690;
        if (c4691 != null) {
            return c4691;
        }
        if (m9314()) {
            C5925.m11311("root");
            return null;
        }
        m9315();
        C4691 c46912 = this.f13690;
        c46912.getClass();
        return c46912;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4687 m9319() {
        C4687 c4687 = this.f13692;
        if (c4687 != null) {
            return c4687;
        }
        C4687 c46872 = new C4687(this);
        this.f13692 = c46872;
        return c46872;
    }

    public C4686(String str) {
        this.f13693 = str;
    }

    public C4686(String str, C4686 c4686, C4691 c4691) {
        this.f13693 = str;
        this.f13691 = c4686;
        this.f13690 = c4691;
    }
}
