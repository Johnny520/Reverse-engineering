package androidx.compose.foundation.text;

import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2847;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f3095;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Long f3096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f3097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1800 f3098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1800 f3099;

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2440(C2847 c2847) {
        C1800 c1800;
        C2902 c2902 = c2847.f6292;
        this.f3095 = false;
        C1800 c18002 = this.f3099;
        if (c2847.equals(c18002 != null ? c18002.f3086 : null)) {
            return;
        }
        String str = c2902.f6474;
        C1800 c18003 = this.f3099;
        boolean zM9466 = AbstractC5227.m9466(str, c18003 != null ? c18003.f3086.f6292.f6474 : null);
        C1800 c18004 = this.f3099;
        if (zM9466) {
            if (c18004 != null) {
                c18004.f3086 = c2847;
                return;
            }
            return;
        }
        this.f3099 = new C1800(c18004, c2847);
        this.f3098 = null;
        int length = c2902.f6474.length() + this.f3097;
        this.f3097 = length;
        if (length > 100000) {
            C1800 c18005 = this.f3099;
            if ((c18005 != null ? c18005.f3087 : null) == null) {
                return;
            }
            while (true) {
                if (c18005 == null) {
                    c1800 = null;
                } else {
                    C1800 c18006 = c18005.f3087;
                    if (c18006 != null) {
                        c1800 = c18006.f3087;
                    }
                }
                if (c1800 == null) {
                    break;
                } else {
                    c18005 = c18005.f3087;
                }
            }
            if (c18005 != null) {
                c18005.f3087 = null;
            }
        }
    }
}
