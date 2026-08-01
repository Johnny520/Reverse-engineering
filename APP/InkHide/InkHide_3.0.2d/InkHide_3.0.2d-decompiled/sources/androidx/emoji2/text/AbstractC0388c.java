package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: androidx.emoji2.text.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0388c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Handler m760a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
