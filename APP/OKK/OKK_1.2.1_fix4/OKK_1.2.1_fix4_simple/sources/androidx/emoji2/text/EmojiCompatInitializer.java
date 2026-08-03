package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.C0543t;
import androidx.lifecycle.InterfaceC0541r;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p006D.C0095d;
import p041W.C0414a;
import p041W.InterfaceC0415b;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0415b {
    public EmojiCompatInitializer() {
    }

    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: a */
    public final List mo999a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo1000b(Context r1) {
        m1195c(r1);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c */
    public final void m1195c(Context r4) {
        C0493r r02 = new C0493r(new C0095d(r4));
        r02.f1389b = 1;
        if (C0485j.f1354k != null) goto L15;
        Object r1 = C0485j.f1353j;
        monitor-enter(r1);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (C0485j.f1354k != null) goto L11;
        C0485j.f1354k = new C0485j(r02);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r1);     // Catch: Throwable -> L9
    L15:
        C0414a r42 = C0414a.m996c(r4);
        r42.getClass();
        Object r12 = C0414a.f917e;
        monitor-enter(r12);
        Object r2 = r42.f918a.get(ProcessLifecycleInitializer.class);     // Catch: Throwable -> L20
        if (r2 != null) goto L22;
        r2 = r42.m998b(ProcessLifecycleInitializer.class, new HashSet());     // Catch: Throwable -> L20
    L22:
        monitor-exit(r12);     // Catch: Throwable -> L20
        final C0543t r43 = ((InterfaceC0541r) r2).mo1231d();
        r43.m1254a(new C04751(this, r43));
        return;
    L20:
        th = move-exception;
        throw th;
    }
}
