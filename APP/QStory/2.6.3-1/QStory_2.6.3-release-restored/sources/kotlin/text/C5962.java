package kotlin.text;

import java.util.Iterator;
import kotlin.sequences.InterfaceC5959;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5962 implements InterfaceC5959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7383 f15019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CharSequence f15021;

    public C5962(CharSequence charSequence, int i, InterfaceC7383 interfaceC7383) {
        charSequence.getClass();
        this.f15021 = charSequence;
        this.f15020 = i;
        this.f15019 = interfaceC7383;
    }

    @Override // kotlin.sequences.InterfaceC5959
    public final Iterator iterator() {
        return new C5963(this);
    }
}
