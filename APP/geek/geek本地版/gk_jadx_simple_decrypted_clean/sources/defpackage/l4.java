package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public abstract class l4 {
    public static void a(ViewTreeObserver r0, ViewTreeObserver.OnGlobalLayoutListener r1) {
        r0.removeOnGlobalLayoutListener(r1);
    }
}
