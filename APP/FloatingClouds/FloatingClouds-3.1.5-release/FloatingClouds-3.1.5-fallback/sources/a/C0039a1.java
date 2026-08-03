package a;

/* JADX INFO: renamed from: a.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0039a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.EditText f383a;
    public final a.K5 b;

    public C0039a1(android.widget.EditText r2) {
            r1 = this;
            r1.<init>()
            r1.f383a = r2
            a.K5 r0 = new a.K5
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public final android.text.method.KeyListener a(android.text.method.KeyListener r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L1f
            a.K5 r0 = r1.b
            a.K5$a r0 = r0.f150a
            r0.getClass()
            boolean r0 = r2 instanceof a.P5
            if (r0 == 0) goto L10
            return r2
        L10:
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            boolean r0 = r2 instanceof android.text.method.NumberKeyListener
            if (r0 == 0) goto L19
            return r2
        L19:
            a.P5 r0 = new a.P5
            r0.<init>(r2)
            return r0
        L1f:
            return r2
    }

    public final void b(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.EditText r0 = r3.f383a
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

    public final a.N5 c(android.view.inputmethod.InputConnection r3, android.view.inputmethod.EditorInfo r4) {
            r2 = this;
            a.K5 r0 = r2.b
            if (r3 != 0) goto L9
            r0.getClass()
            r3 = 0
            goto L1b
        L9:
            a.K5$a r0 = r0.f150a
            r0.getClass()
            boolean r1 = r3 instanceof a.N5
            if (r1 == 0) goto L13
            goto L1b
        L13:
            a.N5 r1 = new a.N5
            android.widget.EditText r0 = r0.f151a
            r1.<init>(r0, r3, r4)
            r3 = r1
        L1b:
            a.N5 r3 = (a.N5) r3
            return r3
    }

    public final void d(boolean r6) {
            r5 = this;
            a.K5 r0 = r5.b
            a.K5$a r0 = r0.f150a
            a.T5 r0 = r0.b
            boolean r1 = r0.c
            if (r1 == r6) goto L4c
            a.T5$a r1 = r0.b
            if (r1 == 0) goto L3b
            androidx.emoji2.text.c r1 = androidx.emoji2.text.c.a()
            a.T5$a r2 = r0.b
            r1.getClass()
            java.lang.String r3 = "initCallback cannot be null"
            a.C0282n9.h(r2, r3)
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.f892a
            java.util.concurrent.locks.Lock r4 = r3.writeLock()
            r4.lock()
            a.L1 r1 = r1.b     // Catch: java.lang.Throwable -> L32
            r1.remove(r2)     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.locks.Lock r1 = r3.writeLock()
            r1.unlock()
            goto L3b
        L32:
            r6 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            throw r6
        L3b:
            r0.c = r6
            if (r6 == 0) goto L4c
            androidx.emoji2.text.c r6 = androidx.emoji2.text.c.a()
            int r6 = r6.b()
            android.widget.EditText r0 = r0.f270a
            a.T5.a(r0, r6)
        L4c:
            return
    }
}
