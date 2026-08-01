package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.C0257;
import androidx.core.view.C2242;
import com.bumptech.glide.load.engine.C3004;
import com.bumptech.glide.load.engine.C3008;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.request.C3049;
import java.util.List;
import p075.C6958;
import p224.C7996;
import p232.C8065;
import p305.C8623;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3069 extends ContextWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C3060 f9815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0257 f9816;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f9817;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8623 f9818;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6958 f9819;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3004 f9820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2974 f9821;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2242 f9822;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3008 f9823;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f9824;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C3049 f9825;

    static {
        C3060 c3060 = new C3060();
        c3060.f9775 = C7996.f22087;
        f9815 = c3060;
    }

    public C3069(Context context, C2974 c2974, C8065 c8065, C6958 c6958, C8623 c8623, C0257 c0257, List list, C3008 c3008, C2242 c2242) {
        super(context.getApplicationContext());
        this.f9821 = c2974;
        this.f9819 = c6958;
        this.f9818 = c8623;
        this.f9817 = list;
        this.f9816 = c0257;
        this.f9823 = c3008;
        this.f9822 = c2242;
        this.f9824 = 4;
        this.f9820 = new C3004(c8065);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3067 m6884() {
        return (C3067) this.f9820.get();
    }
}
