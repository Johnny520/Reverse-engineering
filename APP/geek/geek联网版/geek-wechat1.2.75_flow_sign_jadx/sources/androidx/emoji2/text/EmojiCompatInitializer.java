package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0036a;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC0330ic;
import p000.C0262gi;
import p000.C0431l0;
import p000.C0658r5;
import p000.C0933yk;
import p000.InterfaceC0195ep;
import p000.InterfaceC0716sq;
import p000.InterfaceC0854wf;
import p000.RunnableC0375ji;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0195ep {
    @Override // p000.InterfaceC0195ep
    /* JADX INFO: renamed from: a */
    public final List mo234a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p000.InterfaceC0195ep
    /* JADX INFO: renamed from: b */
    public final Object mo235b(Context context) {
        Object objM2234f;
        C0933yk c0933yk = new C0933yk(new C0431l0(context));
        c0933yk.f896a = 1;
        if (C0262gi.f1988j == null) {
            synchronized (C0262gi.f1987i) {
                try {
                    if (C0262gi.f1988j == null) {
                        C0262gi.f1988j = new C0262gi(c0933yk);
                    }
                } finally {
                }
            }
        }
        C0658r5 c0658r5M2225q = C0658r5.m2225q(context);
        c0658r5M2225q.getClass();
        synchronized (C0658r5.f4061f) {
            try {
                objM2234f = ((HashMap) c0658r5M2225q.f4064b).get(ProcessLifecycleInitializer.class);
                if (objM2234f == null) {
                    objM2234f = c0658r5M2225q.m2234f(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final C0036a c0036aMo105e = ((InterfaceC0716sq) objM2234f).mo105e();
        c0036aMo105e.m259a(new InterfaceC0854wf(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // p000.InterfaceC0854wf
            /* JADX INFO: renamed from: a */
            public final void mo236a() {
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0330ic.m1501a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0375ji(), 500L);
                c0036aMo105e.m264f(this);
            }
        });
        return Boolean.TRUE;
    }
}
