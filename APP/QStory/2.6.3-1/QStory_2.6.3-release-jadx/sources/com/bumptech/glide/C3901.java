package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.C1104;
import androidx.core.view.C3075;
import com.bumptech.glide.load.engine.C3836;
import com.bumptech.glide.load.engine.C3840;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.request.C3881;
import java.util.List;
import p091.C7787;
import p240.C8825;
import p248.C8894;
import p321.C9452;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3901 extends ContextWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C3892 f10160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1104 f10161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f10162;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9452 f10163;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7787 f10164;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3836 f10165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3806 f10166;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C3075 f10167;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3840 f10168;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f10169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C3881 f10170;

    static {
        C3892 c3892 = new C3892();
        c3892.f10120 = C8825.f22432;
        f10160 = c3892;
    }

    public C3901(Context context, C3806 c3806, C8894 c8894, C7787 c7787, C9452 c9452, C1104 c1104, List list, C3840 c3840, C3075 c3075) {
        super(context.getApplicationContext());
        this.f10166 = c3806;
        this.f10164 = c7787;
        this.f10163 = c9452;
        this.f10162 = list;
        this.f10161 = c1104;
        this.f10168 = c3840;
        this.f10167 = c3075;
        this.f10169 = 4;
        this.f10165 = new C3836(c8894);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3899 m7444() {
        return (C3899) this.f10165.get();
    }
}
