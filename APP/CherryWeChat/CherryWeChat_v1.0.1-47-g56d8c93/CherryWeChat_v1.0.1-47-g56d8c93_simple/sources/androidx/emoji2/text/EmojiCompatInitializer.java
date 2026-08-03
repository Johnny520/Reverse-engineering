package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC0760Rn;
import p000.C0669Ph;
import p000.C0793Sd;
import p000.C2372pf;
import p000.C2415qf;
import p000.C2656w4;
import p000.InterfaceC1061Yn;
import p000.InterfaceC2327ol;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC2327ol {
    public EmojiCompatInitializer() {
    }

    @Override // p000.InterfaceC2327ol
    /* JADX INFO: renamed from: a */
    public final List mo2164a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p000.InterfaceC2327ol
    /* JADX INFO: renamed from: b */
    public final Object mo2165b(Context r4) {
        C0669Ph r0 = new C0669Ph(new C0793Sd(r4));
        r0.f2135b = 1;
        if (C2372pf.f8342k != null) goto L15;
        Object r1 = C2372pf.f8341j;
        monitor-enter(r1);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (C2372pf.f8342k != null) goto L11;
        C2372pf.f8342k = new C2372pf(r0);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r1);     // Catch: Throwable -> L9
    L15:
        C2656w4 r42 = C2656w4.m5192u(r4);
        r42.getClass();
        Object r12 = C2656w4.f9193f;
        monitor-enter(r12);
        Object r2 = ((HashMap) r42.f9196b).get(ProcessLifecycleInitializer.class);     // Catch: Throwable -> L20
        if (r2 != null) goto L22;
        r2 = r42.m5208n(ProcessLifecycleInitializer.class, new HashSet());     // Catch: Throwable -> L20
    L22:
        monitor-exit(r12);     // Catch: Throwable -> L20
        AbstractC0760Rn r43 = ((InterfaceC1061Yn) r2).getLifecycle();
        r43.mo1555a(new C2415qf(this, r43));
        return Boolean.TRUE;
    L20:
        th = move-exception;
        throw th;
    }
}
