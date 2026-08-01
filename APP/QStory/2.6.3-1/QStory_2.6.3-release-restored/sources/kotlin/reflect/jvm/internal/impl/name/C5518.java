package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5518 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5523 f14034 = C5523.m9892("<root>");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public transient C5523 f14035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public transient C5518 f14036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public transient C5519 f14037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f14038;

    static {
        Pattern.compile("\\.").getClass();
    }

    public C5518(String str, C5519 c5519) {
        str.getClass();
        this.f14038 = str;
        this.f14037 = c5519;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final List m9870(C5518 c5518) {
        if (c5518.m9873()) {
            return new ArrayList();
        }
        List listM9870 = m9870(c5518.m9871());
        listM9870.add(c5518.m9877());
        return listM9870;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5518) {
            return AbstractC5227.m9466(this.f14038, ((C5518) obj).f14038);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14038.hashCode();
    }

    public final String toString() {
        if (!m9873()) {
            return this.f14038;
        }
        String strM9894 = f14034.m9894();
        strM9894.getClass();
        return strM9894;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5518 m9871() {
        C5518 c5518 = this.f14036;
        if (c5518 != null) {
            return c5518;
        }
        if (m9873()) {
            C6755.m11870("root");
            return null;
        }
        m9874();
        C5518 c55182 = this.f14036;
        c55182.getClass();
        return c55182;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m9872() {
        return this.f14037 != null || AbstractC5976.m10730(this.f14038, '<', 0, 6) < 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m9873() {
        return this.f14038.length() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9874() {
        String str = this.f14038;
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
            this.f14035 = C5523.m9890(str.substring(length + 1));
            this.f14036 = new C5518(str.substring(0, length));
        } else {
            this.f14035 = C5523.m9890(str);
            this.f14036 = C5519.f14039.f14041;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5518 m9875(C5523 c5523) {
        String strM9894;
        c5523.getClass();
        if (m9873()) {
            strM9894 = c5523.m9894();
        } else {
            strM9894 = this.f14038 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c5523.m9894();
        }
        strM9894.getClass();
        return new C5518(strM9894, this, c5523);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m9876(C5523 c5523) {
        c5523.getClass();
        if (!m9873()) {
            String str = this.f14038;
            int iM10730 = AbstractC5976.m10730(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 0, 6);
            if (iM10730 == -1) {
                iM10730 = str.length();
            }
            int i = iM10730;
            String strM9894 = c5523.m9894();
            strM9894.getClass();
            if (i == strM9894.length() && AbstractC5971.m10691(0, 0, i, this.f14038, strM9894, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5523 m9877() {
        C5523 c5523 = this.f14035;
        if (c5523 != null) {
            return c5523;
        }
        if (m9873()) {
            C6755.m11870("root");
            return null;
        }
        m9874();
        C5523 c55232 = this.f14035;
        c55232.getClass();
        return c55232;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5519 m9878() {
        C5519 c5519 = this.f14037;
        if (c5519 != null) {
            return c5519;
        }
        C5519 c55192 = new C5519(this);
        this.f14037 = c55192;
        return c55192;
    }

    public C5518(String str) {
        this.f14038 = str;
    }

    public C5518(String str, C5518 c5518, C5523 c5523) {
        this.f14038 = str;
        this.f14036 = c5518;
        this.f14035 = c5523;
    }
}
