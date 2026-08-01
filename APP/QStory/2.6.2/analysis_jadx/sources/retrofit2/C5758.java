package retrofit2;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.vector.C1562;
import com.bumptech.glide.AbstractC3065;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.C5553;
import p004.AbstractC6098;
import p015.AbstractC6206;
import p015.C6215;
import p015.C6217;
import p015.C6218;
import p015.C6221;
import p015.C6222;
import p015.C6224;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5758 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1562 f15775;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1245 f15776 = new C1245(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6221 f15777;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f15778;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6222 f15779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15780;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f15781;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6217 f15782;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public AbstractC6206 f15783;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0108 f15784;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C4870 f15785;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final char[] f15774 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Pattern f15773 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    public C5758(String str, C6222 c6222, String str2, C6224 c6224, C6217 c6217, boolean z, boolean z2, boolean z3) {
        this.f15780 = str;
        this.f15779 = c6222;
        this.f15778 = str2;
        this.f15782 = c6217;
        this.f15781 = z;
        if (c6224 != null) {
            this.f15775 = c6224.m11678();
        } else {
            this.f15775 = new C1562(6, false);
        }
        if (z2) {
            this.f15785 = new C4870(5);
            return;
        }
        if (z3) {
            C0108 c0108 = new C0108(19);
            this.f15784 = c0108;
            C6217 c62172 = C6215.f17060;
            c62172.getClass();
            if (c62172.f17100.equals("multipart")) {
                c0108.f320 = c62172;
            } else {
                C5553.m10815(c62172, "multipart != ");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11087(String str, String str2, boolean z) {
        C6221 c6221;
        String str3 = this.f15778;
        if (str3 != null) {
            C6222 c6222 = this.f15779;
            c6222.getClass();
            try {
                c6221 = new C6221(0);
                c6221.m11667(c6222, str3);
            } catch (IllegalArgumentException unused) {
                c6221 = null;
            }
            this.f15777 = c6221;
            if (c6221 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(c6222);
                C5553.m10819(sb, ", Relative: ", this.f15778);
                return;
            }
            this.f15778 = null;
        }
        C6221 c62212 = this.f15777;
        if (!z) {
            c62212.m11666(str, str2);
            return;
        }
        c62212.getClass();
        str.getClass();
        if (((ArrayList) c62212.f17117) == null) {
            c62212.f17117 = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) c62212.f17117;
        arrayList.getClass();
        arrayList.add(AbstractC6098.m11455(0, 0, str, " \"'<>#&=", 83));
        ArrayList arrayList2 = (ArrayList) c62212.f17117;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? AbstractC6098.m11455(0, 0, str2, " \"'<>#&=", 83) : null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11088(C6224 c6224, AbstractC6206 abstractC6206) {
        C0108 c0108 = this.f15784;
        c0108.getClass();
        abstractC6206.getClass();
        if (c6224.m11680("Content-Type") != null) {
            C5919.m11249("Unexpected header: Content-Type");
        } else if (c6224.m11680("Content-Length") != null) {
            C5919.m11249("Unexpected header: Content-Length");
        } else {
            ((ArrayList) c0108.f318).add(new C6218(c6224, abstractC6206));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11089(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = C6217.f17098;
                this.f15782 = AbstractC8189.m13679(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC0053.m152("Malformed content type: ", str2), e);
            }
        }
        C1562 c1562 = this.f15775;
        if (!z) {
            c1562.m2830(str, str2);
            return;
        }
        c1562.getClass();
        str.getClass();
        str2.getClass();
        AbstractC3065.m6819(str);
        AbstractC3065.m6839(c1562, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11090(String str, String str2, boolean z) {
        C4870 c4870 = this.f15785;
        if (z) {
            c4870.getClass();
            str.getClass();
            ((ArrayList) c4870.f14160).add(AbstractC6098.m11454(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) c4870.f14161).add(AbstractC6098.m11454(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        c4870.getClass();
        str.getClass();
        ((ArrayList) c4870.f14160).add(AbstractC6098.m11454(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) c4870.f14161).add(AbstractC6098.m11454(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }
}
