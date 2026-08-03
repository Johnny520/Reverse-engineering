package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0462 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.widget.TextView f1171;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C2132 f1172;

    public C0462(@Yue.InterfaceC4410 android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r2.f1171 = r3
            Yue.ۥ۠۠ۧۡ r0 = new Yue.ۥ۠۠ۧۡ
            r1 = 0
            r0.<init>(r3, r1)
            r2.f1172 = r0
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.text.InputFilter[] m1698(@Yue.InterfaceC4410 android.text.InputFilter[] r2) {
            r1 = this;
            Yue.ۥ۠۠ۧۡ r0 = r1.f1172
            android.text.InputFilter[] r2 = r0.m10024(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m1699() {
            r1 = this;
            Yue.ۥ۠۠ۧۡ r0 = r1.f1172
            boolean r0 = r0.m10025()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m1700(@Yue.InterfaceC4544 android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.TextView r0 = r3.f1171
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
            r3.m1702(r0)
            return
        L26:
            r4.recycle()
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m1701(boolean r2) {
            r1 = this;
            Yue.ۥ۠۠ۧۡ r0 = r1.f1172
            r0.m10026(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m1702(boolean r2) {
            r1 = this;
            Yue.ۥ۠۠ۧۡ r0 = r1.f1172
            r0.m10027(r2)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.text.method.TransformationMethod m1703(@Yue.InterfaceC4544 android.text.method.TransformationMethod r2) {
            r1 = this;
            Yue.ۥ۠۠ۧۡ r0 = r1.f1172
            android.text.method.TransformationMethod r2 = r0.m10029(r2)
            return r2
    }
}
