package p028;

import com.bumptech.glide.AbstractC3888;
import kotlin.text.Regex;
import p020.C6928;
import p020.InterfaceC6939;
import p023.AbstractC6957;
import p023.C6973;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7052 extends AbstractC6957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6928 f17497;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f17498;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17499;

    public C7052(String str, long j, C6928 c6928) {
        this.f17499 = str;
        this.f17498 = j;
        this.f17497 = c6928;
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6973 mo11724() {
        String str = this.f17499;
        if (str != null) {
            Regex regex = C6973.f17204;
            try {
                return AbstractC3888.m7271(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo11725() {
        return this.f17498;
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6939 mo11726() {
        return this.f17497;
    }
}
