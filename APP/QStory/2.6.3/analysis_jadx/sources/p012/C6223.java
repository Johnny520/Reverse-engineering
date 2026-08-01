package p012;

import com.bumptech.glide.AbstractC3056;
import kotlin.text.Regex;
import p004.C6099;
import p004.InterfaceC6110;
import p007.AbstractC6128;
import p007.C6144;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6223 extends AbstractC6128 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6099 f17152;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f17153;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17154;

    public C6223(String str, long j, C6099 c6099) {
        this.f17154 = str;
        this.f17153 = j;
        this.f17152 = c6099;
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6144 mo11165() {
        String str = this.f17154;
        if (str != null) {
            Regex regex = C6144.f16859;
            try {
                return AbstractC3056.m6711(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo11166() {
        return this.f17153;
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6110 mo11167() {
        return this.f17152;
    }
}
