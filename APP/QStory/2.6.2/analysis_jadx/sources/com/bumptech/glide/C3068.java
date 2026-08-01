package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.C0257;
import androidx.core.view.C2242;
import com.bumptech.glide.load.engine.C3003;
import com.bumptech.glide.load.engine.C3007;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.bumptech.glide.request.C3048;
import java.util.List;
import p075.C6957;
import p224.C7995;
import p232.C8064;
import p305.C8631;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3068 extends ContextWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C3059 f9810;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0257 f9811;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f9812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8631 f9813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6957 f9814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3003 f9815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2973 f9816;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2242 f9817;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3007 f9818;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f9819;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C3048 f9820;

    static {
        C3059 c3059 = new C3059();
        c3059.f9766 = C7995.f22090;
        f9810 = c3059;
    }

    public C3068(Context context, C2973 c2973, C8064 c8064, C6957 c6957, C8631 c8631, C0257 c0257, List list, C3007 c3007, C2242 c2242) {
        super(context.getApplicationContext());
        this.f9816 = c2973;
        this.f9814 = c6957;
        this.f9813 = c8631;
        this.f9812 = list;
        this.f9811 = c0257;
        this.f9818 = c3007;
        this.f9817 = c2242;
        this.f9819 = 4;
        this.f9815 = new C3003(c8064);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3066 m6897() {
        return (C3066) this.f9815.get();
    }
}
