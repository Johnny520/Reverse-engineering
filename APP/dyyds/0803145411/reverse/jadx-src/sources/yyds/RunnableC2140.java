package yyds;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲀᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2140 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f10567;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10568;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Typeface f10569;

    public RunnableC2140(TextView textView, Typeface typeface, int i) {
        this.f10568 = textView;
        this.f10569 = typeface;
        this.f10567 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10568.setTypeface(this.f10569, this.f10567);
    }
}
