package retrofit2;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.vector.C1562;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.C5554;
import p003.AbstractC6089;
import p007.AbstractC6133;
import p007.C6142;
import p007.C6144;
import p007.C6145;
import p007.C6148;
import p007.C6149;
import p007.C6151;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5759 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1562 f15775;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1245 f15776 = new C1245(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6148 f15777;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f15778;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6149 f15779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15780;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f15781;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6144 f15782;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public AbstractC6133 f15783;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0108 f15784;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C4871 f15785;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final char[] f15774 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Pattern f15773 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    public C5759(String str, C6149 c6149, String str2, C6151 c6151, C6144 c6144, boolean z, boolean z2, boolean z3) {
        this.f15780 = str;
        this.f15779 = c6149;
        this.f15778 = str2;
        this.f15782 = c6144;
        this.f15781 = z;
        if (c6151 != null) {
            this.f15775 = c6151.m11549();
        } else {
            this.f15775 = new C1562(6, false);
        }
        if (z2) {
            this.f15785 = new C4871(4);
            return;
        }
        if (z3) {
            C0108 c0108 = new C0108(18);
            this.f15784 = c0108;
            C6144 c61442 = C6142.f16821;
            c61442.getClass();
            if (c61442.f16861.equals("multipart")) {
                c0108.f320 = c61442;
            } else {
                C5554.m10872(c61442, "multipart != ");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11144(String str, String str2, boolean z) {
        C6148 c6148;
        String str3 = this.f15778;
        if (str3 != null) {
            C6149 c6149 = this.f15779;
            c6149.getClass();
            try {
                c6148 = new C6148(0);
                c6148.m11538(c6149, str3);
            } catch (IllegalArgumentException unused) {
                c6148 = null;
            }
            this.f15777 = c6148;
            if (c6148 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(c6149);
                C5554.m10876(sb, ", Relative: ", this.f15778);
                return;
            }
            this.f15778 = null;
        }
        C6148 c61482 = this.f15777;
        if (!z) {
            c61482.m11537(str, str2);
            return;
        }
        c61482.getClass();
        str.getClass();
        if (((ArrayList) c61482.f16878) == null) {
            c61482.f16878 = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) c61482.f16878;
        arrayList.getClass();
        arrayList.add(AbstractC6089.m11448(0, 0, str, " \"'<>#&=", 83));
        ArrayList arrayList2 = (ArrayList) c61482.f16878;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? AbstractC6089.m11448(0, 0, str2, " \"'<>#&=", 83) : null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11145(C6151 c6151, AbstractC6133 abstractC6133) {
        C0108 c0108 = this.f15784;
        c0108.getClass();
        abstractC6133.getClass();
        if (c6151.m11551("Content-Type") != null) {
            C5925.m11310("Unexpected header: Content-Type");
        } else if (c6151.m11551("Content-Length") != null) {
            C5925.m11310("Unexpected header: Content-Length");
        } else {
            ((ArrayList) c0108.f318).add(new C6145(c6151, abstractC6133));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11146(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = C6144.f16859;
                this.f15782 = AbstractC3056.m6711(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC0053.m157("Malformed content type: ", str2), e);
            }
        }
        C1562 c1562 = this.f15775;
        if (!z) {
            c1562.m2840(str, str2);
            return;
        }
        c1562.getClass();
        str.getClass();
        str2.getClass();
        AbstractC7739.m13058(str);
        AbstractC7739.m13082(c1562, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11147(String str, String str2, boolean z) {
        C4871 c4871 = this.f15785;
        if (z) {
            c4871.getClass();
            str.getClass();
            ((ArrayList) c4871.f14164).add(AbstractC6089.m11447(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) c4871.f14165).add(AbstractC6089.m11447(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        c4871.getClass();
        str.getClass();
        ((ArrayList) c4871.f14164).add(AbstractC6089.m11447(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) c4871.f14165).add(AbstractC6089.m11447(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }
}
