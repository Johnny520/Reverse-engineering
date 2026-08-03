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
    @Override // p000.InterfaceC2327ol
    /* JADX INFO: renamed from: a */
    public final List mo2164a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p000.InterfaceC2327ol
    /* JADX INFO: renamed from: b */
    public final Object mo2165b(Context context) {
        Object objM5208n;
        C0669Ph c0669Ph = new C0669Ph(new C0793Sd(context));
        c0669Ph.f2135b = 1;
        if (C2372pf.f8342k == null) {
            synchronized (C2372pf.f8341j) {
                try {
                    if (C2372pf.f8342k == null) {
                        C2372pf.f8342k = new C2372pf(c0669Ph);
                    }
                } finally {
                }
            }
        }
        C2656w4 c2656w4M5192u = C2656w4.m5192u(context);
        c2656w4M5192u.getClass();
        synchronized (C2656w4.f9193f) {
            try {
                objM5208n = ((HashMap) c2656w4M5192u.f9196b).get(ProcessLifecycleInitializer.class);
                if (objM5208n == null) {
                    objM5208n = c2656w4M5192u.m5208n(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0760Rn lifecycle = ((InterfaceC1061Yn) objM5208n).getLifecycle();
        lifecycle.mo1555a(new C2415qf(this, lifecycle));
        return Boolean.TRUE;
    }
}
