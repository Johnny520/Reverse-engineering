package com.kongzue.dialogx.util;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Interpolator;
import androidx.appcompat.app.RunnableC0909;
import com.kongzue.dialogx.util.views.C4591;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4597 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Interpolator f12058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C4591 f12059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f12060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f12061;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f12062;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Handler f12063;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f12064;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f12065;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f12066;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f12067;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f12068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4597 m8648(float f, float f2) {
        C4597 c4597 = new C4597();
        c4597.f12063 = new Handler(Looper.getMainLooper());
        c4597.f12060 = false;
        c4597.f12067 = 0;
        c4597.f12068 = 0;
        c4597.f12066 = 16;
        c4597.f12065 = f;
        c4597.f12064 = f2;
        return c4597;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8649() {
        if (this.f12060) {
            return;
        }
        this.f12060 = true;
        this.f12061 = System.currentTimeMillis();
        new Thread(new RunnableC0909(this, 10)).start();
    }
}
