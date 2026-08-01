package p000;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class s10 {

    /* JADX INFO: renamed from: a */
    public final C0638q3 f5616a;

    /* JADX INFO: renamed from: b */
    public int f5617b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f5618c;

    /* JADX INFO: renamed from: d */
    public final GestureDetector f5619d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s10(Context context, C0638q3 c0638q3) {
        this.f5616a = c0638q3;
        this.f5619d = new GestureDetector(context, new r10(this));
    }
}
