package com.kongzue.dialogx.util;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Interpolator;
import androidx.appcompat.app.RunnableC0062;
import com.kongzue.dialogx.util.views.C3758;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3764 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Interpolator f11708;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C3758 f11709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f11711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f11712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Handler f11713;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f11714;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f11715;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f11716;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f11717;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f11718;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3764 m8102(float f, float f2) {
        C3764 c3764 = new C3764();
        c3764.f11713 = new Handler(Looper.getMainLooper());
        c3764.f11710 = false;
        c3764.f11717 = 0;
        c3764.f11718 = 0;
        c3764.f11716 = 16;
        c3764.f11715 = f;
        c3764.f11714 = f2;
        return c3764;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8103() {
        if (this.f11710) {
            return;
        }
        this.f11710 = true;
        this.f11711 = System.currentTimeMillis();
        new Thread(new RunnableC0062(this, 10)).start();
    }
}
