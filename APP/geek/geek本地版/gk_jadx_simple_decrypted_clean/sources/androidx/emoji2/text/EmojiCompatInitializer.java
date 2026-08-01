package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.a;
import defpackage.ap;
import defpackage.ei;
import defpackage.l0;
import defpackage.oq;
import defpackage.r5;
import defpackage.wk;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements ap {
    public EmojiCompatInitializer() {
    }

    @Override // defpackage.ap
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.ap
    public final Object b(Context r4) {
        wk r0 = new wk(new l0(r4));
        r0.a = 1;
        if (ei.j != null) goto L15;
        Object r1 = ei.i;
        monitor-enter(r1);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (ei.j != null) goto L11;
        ei.j = new ei(r0);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r1);     // Catch: Throwable -> L9
    L15:
        r5 r42 = r5.q(r4);
        r42.getClass();
        Object r12 = r5.f;
        monitor-enter(r12);
        Object r2 = ((HashMap) r42.b).get(ProcessLifecycleInitializer.class);     // Catch: Throwable -> L20
        if (r2 != null) goto L22;
        r2 = r42.f(ProcessLifecycleInitializer.class, new HashSet());     // Catch: Throwable -> L20
    L22:
        monitor-exit(r12);     // Catch: Throwable -> L20
        final a r43 = ((oq) r2).e();
        r43.a(new AnonymousClass1(this, r43));
        return Boolean.TRUE;
    L20:
        th = move-exception;
        throw th;
    }
}
