package androidx.window.layout;

import android.os.Build;
import p034.AbstractC6347;
import p134.C7508;
import p134.C7511;
import p134.InterfaceC7509;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2594 implements InterfaceC2592 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7509 f7776;

    public C2594() {
        this.f7776 = Build.VERSION.SDK_INT >= 34 ? C7508.f20376 : C7511.f20379;
        AbstractC6347.m11912(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
