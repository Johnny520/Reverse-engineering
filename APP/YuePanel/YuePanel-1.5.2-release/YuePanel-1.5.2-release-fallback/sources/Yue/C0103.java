package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0103 extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public static final java.lang.String f193 = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f194;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C0140 f195;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f196;

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public C0103(int r1, @Yue.InterfaceC4410 Yue.C0140 r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f194 = r1
            r0.f195 = r2
            r0.f196 = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@Yue.InterfaceC4410 android.view.View r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r2.f194
            r3.putInt(r0, r1)
            Yue.ۥ۟۟ۥۧ r0 = r2.f195
            int r1 = r2.f196
            r0.m716(r1, r3)
            return
    }
}
