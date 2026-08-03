package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(19)
public final class C2121 extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.widget.TextView f6671;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C2121.C2122 f6672;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۤ$ۥ, reason: contains not printable characters */
    public static class C2122 {
        public C2122() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m10006(@Yue.InterfaceC4410 android.view.inputmethod.InputConnection r1, @Yue.InterfaceC4410 android.text.Editable r2, @Yue.InterfaceC3281(from = 0) int r3, @Yue.InterfaceC3281(from = 0) int r4, boolean r5) {
                r0 = this;
                boolean r1 = androidx.emoji2.text.C7527.m28938(r1, r2, r3, r4, r5)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m10007(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                boolean r0 = androidx.emoji2.text.C7527.m28943()
                if (r0 == 0) goto Ld
                androidx.emoji2.text.ۥ۟۟ r0 = androidx.emoji2.text.C7527.m28937()
                r0.m28967(r2)
            Ld:
                return
        }
    }

    public C2121(@Yue.InterfaceC4410 android.widget.TextView r2, @Yue.InterfaceC4410 android.view.inputmethod.InputConnection r3, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r4) {
            r1 = this;
            Yue.ۥ۠۠ۦۤ$ۥ r0 = new Yue.ۥ۠۠ۦۤ$ۥ
            r0.<init>()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public C2121(@Yue.InterfaceC4410 android.widget.TextView r2, @Yue.InterfaceC4410 android.view.inputmethod.InputConnection r3, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r4, @Yue.InterfaceC4410 Yue.C2121.C2122 r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            r1.f6671 = r2
            r1.f6672 = r5
            r5.m10007(r4)
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int r7, int r8) {
            r6 = this;
            Yue.ۥ۠۠ۦۤ$ۥ r0 = r6.f6672
            android.text.Editable r2 = r6.m10005()
            r5 = 0
            r1 = r6
            r3 = r7
            r4 = r8
            boolean r0 = r0.m10006(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L19
            boolean r7 = super.deleteSurroundingText(r7, r8)
            if (r7 == 0) goto L17
            goto L19
        L17:
            r7 = 0
            goto L1a
        L19:
            r7 = 1
        L1a:
            return r7
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int r7, int r8) {
            r6 = this;
            Yue.ۥ۠۠ۦۤ$ۥ r0 = r6.f6672
            android.text.Editable r2 = r6.m10005()
            r5 = 1
            r1 = r6
            r3 = r7
            r4 = r8
            boolean r0 = r0.m10006(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L19
            boolean r7 = super.deleteSurroundingTextInCodePoints(r7, r8)
            if (r7 == 0) goto L17
            goto L19
        L17:
            r7 = 0
            goto L1a
        L19:
            r7 = 1
        L1a:
            return r7
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.text.Editable m10005() {
            r1 = this;
            android.widget.TextView r0 = r1.f6671
            android.text.Editable r0 = r0.getEditableText()
            return r0
    }
}
