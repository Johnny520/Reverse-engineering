package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0543t;
import androidx.lifecycle.InterfaceC0527d;
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
    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: a */
    public final List mo999a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo1000b(Context context) {
        m1195c(context);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c */
    public final void m1195c(Context context) {
        Object objM998b;
        C0493r c0493r = new C0493r(new C0095d(context));
        c0493r.f1389b = 1;
        if (C0485j.f1354k == null) {
            synchronized (C0485j.f1353j) {
                try {
                    if (C0485j.f1354k == null) {
                        C0485j.f1354k = new C0485j(c0493r);
                    }
                } finally {
                }
            }
        }
        C0414a c0414aM996c = C0414a.m996c(context);
        c0414aM996c.getClass();
        synchronized (C0414a.f917e) {
            try {
                objM998b = c0414aM996c.f918a.get(ProcessLifecycleInitializer.class);
                if (objM998b == null) {
                    objM998b = c0414aM996c.m998b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final C0543t c0543tMo1231d = ((InterfaceC0541r) objM998b).mo1231d();
        c0543tMo1231d.m1254a(new InterfaceC0527d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0527d
            /* JADX INFO: renamed from: a */
            public final void mo1196a() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0477b.m1197a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0488m(0), 500L);
                c0543tMo1231d.m1258e(this);
            }
        });
    }
}
