package retrofit2;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.runtime.internal.C2080;
import com.bumptech.glide.AbstractC3888;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.C6385;
import p019.AbstractC6918;
import p023.AbstractC6962;
import p023.C6971;
import p023.C6973;
import p023.C6974;
import p023.C6977;
import p023.C6978;
import p023.C6980;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2397 f16120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2080 f16121 = new C2080(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6977 f16122;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f16123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6978 f16124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16125;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f16126;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6973 f16127;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public AbstractC6962 f16128;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0955 f16129;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5703 f16130;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final char[] f16119 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Pattern f16118 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    public C6589(String str, C6978 c6978, String str2, C6980 c6980, C6973 c6973, boolean z, boolean z2, boolean z3) {
        this.f16125 = str;
        this.f16124 = c6978;
        this.f16123 = str2;
        this.f16127 = c6973;
        this.f16126 = z;
        if (c6980 != null) {
            this.f16120 = c6980.m12108();
        } else {
            this.f16120 = new C2397(6, false);
        }
        if (z2) {
            this.f16130 = new C5703(4);
            return;
        }
        if (z3) {
            C0955 c0955 = new C0955(18);
            this.f16129 = c0955;
            C6973 c69732 = C6971.f17166;
            c69732.getClass();
            if (c69732.f17206.equals("multipart")) {
                c0955.f665 = c69732;
            } else {
                C6385.m11431(c69732, "multipart != ");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11703(String str, String str2, boolean z) {
        C6977 c6977;
        String str3 = this.f16123;
        if (str3 != null) {
            C6978 c6978 = this.f16124;
            c6978.getClass();
            try {
                c6977 = new C6977(0);
                c6977.m12097(c6978, str3);
            } catch (IllegalArgumentException unused) {
                c6977 = null;
            }
            this.f16122 = c6977;
            if (c6977 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(c6978);
                C6385.m11435(sb, ", Relative: ", this.f16123);
                return;
            }
            this.f16123 = null;
        }
        C6977 c69772 = this.f16122;
        if (!z) {
            c69772.m12096(str, str2);
            return;
        }
        c69772.getClass();
        str.getClass();
        if (((ArrayList) c69772.f17223) == null) {
            c69772.f17223 = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) c69772.f17223;
        arrayList.getClass();
        arrayList.add(AbstractC6918.m12007(0, 0, str, " \"'<>#&=", 83));
        ArrayList arrayList2 = (ArrayList) c69772.f17223;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? AbstractC6918.m12007(0, 0, str2, " \"'<>#&=", 83) : null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11704(C6980 c6980, AbstractC6962 abstractC6962) {
        C0955 c0955 = this.f16129;
        c0955.getClass();
        abstractC6962.getClass();
        if (c6980.m12110("Content-Type") != null) {
            C6755.m11869("Unexpected header: Content-Type");
        } else if (c6980.m12110("Content-Length") != null) {
            C6755.m11869("Unexpected header: Content-Length");
        } else {
            ((ArrayList) c0955.f663).add(new C6974(c6980, abstractC6962));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11705(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = C6973.f17204;
                this.f16127 = AbstractC3888.m7271(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC0900.m717("Malformed content type: ", str2), e);
            }
        }
        C2397 c2397 = this.f16120;
        if (!z) {
            c2397.m3400(str, str2);
            return;
        }
        c2397.getClass();
        str.getClass();
        str2.getClass();
        AbstractC8568.m13617(str);
        AbstractC8568.m13641(c2397, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11706(String str, String str2, boolean z) {
        C5703 c5703 = this.f16130;
        if (z) {
            c5703.getClass();
            str.getClass();
            ((ArrayList) c5703.f14509).add(AbstractC6918.m12006(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) c5703.f14510).add(AbstractC6918.m12006(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        c5703.getClass();
        str.getClass();
        ((ArrayList) c5703.f14509).add(AbstractC6918.m12006(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) c5703.f14510).add(AbstractC6918.m12006(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }
}
