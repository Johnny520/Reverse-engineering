package p000a;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: a.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0775q1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f3063a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Typeface f3064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3065c;

    public RunnableC0775q1(TextView textView, Typeface typeface, int i) {
        this.f3063a = textView;
        this.f3064b = typeface;
        this.f3065c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3063a.setTypeface(this.f3064b, this.f3065c);
    }
}
