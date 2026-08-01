package androidx.window.layout;

import android.os.Build;
import p050.AbstractC7176;
import p150.C8337;
import p150.C8340;
import p150.InterfaceC8338;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3427 implements InterfaceC3425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8338 f8121;

    public C3427() {
        this.f8121 = Build.VERSION.SDK_INT >= 34 ? C8337.f20721 : C8340.f20724;
        AbstractC7176.m12471(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
