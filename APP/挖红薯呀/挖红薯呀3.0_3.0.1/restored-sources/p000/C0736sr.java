package p000;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: renamed from: sr */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0736sr implements InterfaceC0177em {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ s90 f5823d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0736sr(EmojiCompatInitializer emojiCompatInitializer, s90 s90Var) {
        this.f5823d = s90Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0177em
    /* JADX INFO: renamed from: c */
    public final void mo940c(x90 x90Var) {
        AbstractC0285hj.m1325a(Looper.getMainLooper()).postDelayed(new RunnableC0862vr(), 500L);
        this.f5823d.mo4015b(this);
    }
}
