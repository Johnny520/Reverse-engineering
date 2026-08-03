package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0461 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.widget.EditText f1169;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C2112 f1170;

    public C0461(@Yue.InterfaceC4410 android.widget.EditText r3) {
            r2 = this;
            r2.<init>()
            r2.f1169 = r3
            Yue.ۥ۠۠ۦ۠ r0 = new Yue.ۥ۠۠ۦ۠
            r1 = 0
            r0.<init>(r3, r1)
            r2.f1170 = r0
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.text.method.KeyListener m1692(@Yue.InterfaceC4544 android.text.method.KeyListener r2) {
            r1 = this;
            boolean r0 = r1.m1693(r2)
            if (r0 == 0) goto Lc
            Yue.ۥ۠۠ۦ۠ r0 = r1.f1170
            android.text.method.KeyListener r2 = r0.m9989(r2)
        Lc:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m1693(android.text.method.KeyListener r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.text.method.NumberKeyListener
            r1 = r1 ^ 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m1694() {
            r1 = this;
            Yue.ۥ۠۠ۦ۠ r0 = r1.f1170
            boolean r0 = r0.m9991()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m1695(@Yue.InterfaceC4544 android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.EditText r0 = r3.f1169
            android.content.Context r0 = r0.getContext()
            int[] r1 = Yue.C5058.C5071.f17662
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = Yue.C5058.C5071.f17677     // Catch: java.lang.Throwable -> L1d
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            if (r5 == 0) goto L1f
            int r5 = Yue.C5058.C5071.f17677     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r4.getBoolean(r5, r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r5 = move-exception
            goto L26
        L1f:
            r4.recycle()
            r3.m1697(r0)
            return
        L26:
            r4.recycle()
            throw r5
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.view.inputmethod.InputConnection m1696(@Yue.InterfaceC4544 android.view.inputmethod.InputConnection r2, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r3) {
            r1 = this;
            Yue.ۥ۠۠ۦ۠ r0 = r1.f1170
            android.view.inputmethod.InputConnection r2 = r0.m9992(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m1697(boolean r2) {
            r1 = this;
            Yue.ۥ۠۠ۦ۠ r0 = r1.f1170
            r0.m9994(r2)
            return
    }
}
