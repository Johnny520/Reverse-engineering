package p000;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: renamed from: qf */
/* JADX INFO: loaded from: classes.dex */
public final class C2415qf implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0760Rn f8473a;

    public C2415qf(EmojiCompatInitializer r1, AbstractC0760Rn r2) {
        this.f8473a = r2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1061Yn r4) {
        AbstractC1048Ya.m1998a(Looper.getMainLooper()).postDelayed(new RunnableC2501sf(0), 500);
        this.f8473a.mo1556b(this);
    }
}
