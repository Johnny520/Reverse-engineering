package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(19)
public class C2138 implements android.text.method.TransformationMethod {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final android.text.method.TransformationMethod f6725;

    public C2138(@Yue.InterfaceC4544 android.text.method.TransformationMethod r1) {
            r0 = this;
            r0.<init>()
            r0.f6725 = r1
            return
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(@Yue.InterfaceC4544 java.lang.CharSequence r2, @Yue.InterfaceC4410 android.view.View r3) {
            r1 = this;
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L7
            return r2
        L7:
            android.text.method.TransformationMethod r0 = r1.f6725
            if (r0 == 0) goto Lf
            java.lang.CharSequence r2 = r0.getTransformation(r2, r3)
        Lf:
            if (r2 == 0) goto L25
            androidx.emoji2.text.ۥ۟۟ r3 = androidx.emoji2.text.C7527.m28937()
            int r3 = r3.m28952()
            r0 = 1
            if (r3 == r0) goto L1d
            goto L25
        L1d:
            androidx.emoji2.text.ۥ۟۟ r3 = androidx.emoji2.text.C7527.m28937()
            java.lang.CharSequence r2 = r3.m28961(r2)
        L25:
            return r2
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View r7, java.lang.CharSequence r8, boolean r9, int r10, android.graphics.Rect r11) {
            r6 = this;
            android.text.method.TransformationMethod r0 = r6.f6725
            if (r0 == 0) goto Lc
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onFocusChanged(r1, r2, r3, r4, r5)
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.text.method.TransformationMethod m10053() {
            r1 = this;
            android.text.method.TransformationMethod r0 = r1.f6725
            return r0
    }
}
