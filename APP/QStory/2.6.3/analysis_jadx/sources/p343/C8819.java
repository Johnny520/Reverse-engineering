package p343;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;
import p018.AbstractC6253;
import p052.InterfaceC6558;
import p217.AbstractC7969;
import p315.C8663;
import p386.C9077;
import top.suzhelan.sticker.sdk.presenter.C5985;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8819 extends AbstractC7969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC6558 f24822;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f24823 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC6558 f24824;

    public C8819(C9077 c9077, C9077 c90772) {
        this.f24824 = c9077;
        this.f24822 = c90772;
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13455(Context context, ViewGroup viewGroup, int i) {
        switch (this.f24823) {
            case 0:
                View viewInflate = AbstractC6253.m11750(context).inflate(R.layout.item_online_sticker, viewGroup, false);
                viewInflate.getClass();
                return new C8663(viewInflate);
            default:
                View viewInflate2 = AbstractC6253.m11750(context).inflate(R.layout.item_message, viewGroup, false);
                viewInflate2.getClass();
                return new C8663(viewInflate2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo13457(androidx.recyclerview.widget.AbstractC2484 r20, int r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p343.C8819.mo13457(androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰, int, java.lang.Object):void");
    }

    public C8819(C5985 c5985) {
        c5985.getClass();
    }
}
