package com.kongzue.dialogx.util;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Interpolator;
import androidx.appcompat.app.RunnableC0062;
import com.kongzue.dialogx.util.views.C3759;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3765 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Interpolator f11713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C3759 f11714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f11716;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f11717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Handler f11718;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f11719;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f11720;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f11721;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f11722;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f11723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3765 m8089(float f, float f2) {
        C3765 c3765 = new C3765();
        c3765.f11718 = new Handler(Looper.getMainLooper());
        c3765.f11715 = false;
        c3765.f11722 = 0;
        c3765.f11723 = 0;
        c3765.f11721 = 16;
        c3765.f11720 = f;
        c3765.f11719 = f2;
        return c3765;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8090() {
        if (this.f11715) {
            return;
        }
        this.f11715 = true;
        this.f11716 = System.currentTimeMillis();
        new Thread(new RunnableC0062(this, 10)).start();
    }
}
