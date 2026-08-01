package p069i;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: i.X */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0653X implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f2220a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Typeface f2221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2222c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0653X(TextView textView, Typeface typeface, int i2) {
        this.f2220a = textView;
        this.f2221b = typeface;
        this.f2222c = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f2220a.setTypeface(this.f2221b, this.f2222c);
    }
}
