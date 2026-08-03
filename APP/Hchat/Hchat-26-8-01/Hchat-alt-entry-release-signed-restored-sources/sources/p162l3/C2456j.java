package p162l3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.InterfaceC0097d;
import androidx.lifecycle.InterfaceC0112q;

/* JADX INFO: renamed from: l3.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2456j implements InterfaceC0097d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0114s f8071g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2456j(EmojiCompatInitializer emojiCompatInitializer, C0114s c0114s) {
        this.f8071g = c0114s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0097d
    /* JADX INFO: renamed from: a */
    public final void mo542a(InterfaceC0112q interfaceC0112q) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC2448b.m5844a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC2459m(), 500L);
        this.f8071g.m557f(this);
    }
}
