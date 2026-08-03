package a;

/* JADX INFO: renamed from: a.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0058b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f407a;
    public final a.S5 b;

    public C0058b1(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r1.f407a = r2
            a.S5 r0 = new a.S5
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public final android.text.InputFilter[] a(android.text.InputFilter[] r2) {
            r1 = this;
            a.S5 r0 = r1.b
            a.S5$b r0 = r0.f256a
            android.text.InputFilter[] r2 = r0.a(r2)
            return r2
    }

    public final void b(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.TextView r0 = r3.f407a
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled     // Catch: java.lang.Throwable -> L1d
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            if (r5 == 0) goto L1f
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r4.getBoolean(r5, r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r5 = move-exception
            goto L26
        L1f:
            r4.recycle()
            r3.d(r0)
            return
        L26:
            r4.recycle()
            throw r5
    }

    public final void c(boolean r2) {
            r1 = this;
            a.S5 r0 = r1.b
            a.S5$b r0 = r0.f256a
            r0.c(r2)
            return
    }

    public final void d(boolean r2) {
            r1 = this;
            a.S5 r0 = r1.b
            a.S5$b r0 = r0.f256a
            r0.d(r2)
            return
    }
}
