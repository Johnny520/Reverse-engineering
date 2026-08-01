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
import p000.AbstractC0961zb;
import p000.C0188ei;
import p000.C0431l0;
import p000.C0659r5;
import p000.C0859wk;
import p000.InterfaceC0039ap;
import p000.InterfaceC0568oq;
import p000.InterfaceC0817vf;
import p000.RunnableC0299hi;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0039ap {
    @Override // p000.InterfaceC0039ap
    /* JADX INFO: renamed from: a */
    public final List mo249a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p000.InterfaceC0039ap
    /* JADX INFO: renamed from: b */
    public final Object mo250b(Context context) {
        Object objM2227f;
        C0859wk c0859wk = new C0859wk(new C0431l0(context));
        c0859wk.f143a = 1;
        if (C0188ei.f1777j == null) {
            synchronized (C0188ei.f1776i) {
                try {
                    if (C0188ei.f1777j == null) {
                        C0188ei.f1777j = new C0188ei(c0859wk);
                    }
                } finally {
                }
            }
        }
        C0659r5 c0659r5M2218q = C0659r5.m2218q(context);
        c0659r5M2218q.getClass();
        synchronized (C0659r5.f4206f) {
            try {
                objM2227f = ((HashMap) c0659r5M2218q.f4209b).get(ProcessLifecycleInitializer.class);
                if (objM2227f == null) {
                    objM2227f = c0659r5M2218q.m2227f(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final C0036a c0036aMo120e = ((InterfaceC0568oq) objM2227f).mo120e();
        c0036aMo120e.m274a(new InterfaceC0817vf(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // p000.InterfaceC0817vf
            /* JADX INFO: renamed from: a */
            public final void mo251a() {
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0961zb.m2799a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0299hi(), 500L);
                c0036aMo120e.m279f(this);
            }
        });
        return Boolean.TRUE;
    }
}
