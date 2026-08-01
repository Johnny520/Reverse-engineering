package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.InterfaceC0470e;
import androidx.lifecycle.InterfaceC0484s;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p004C.C0066j;
import p026N.C0215a;
import p026N.InterfaceC0216b;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0216b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p026N.InterfaceC0216b
    /* JADX INFO: renamed from: a */
    public final List mo409a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p026N.InterfaceC0216b
    /* JADX INFO: renamed from: b */
    public final Object mo410b(Context context) {
        Object objM408b;
        C0402q c0402q = new C0402q(new C0066j(context));
        c0402q.f1205b = 1;
        if (C0396k.f1174j == null) {
            synchronized (C0396k.f1173i) {
                try {
                    if (C0396k.f1174j == null) {
                        C0396k.f1174j = new C0396k(c0402q);
                    }
                } finally {
                }
            }
        }
        C0215a c0215aM406c = C0215a.m406c(context);
        c0215aM406c.getClass();
        synchronized (C0215a.f549e) {
            try {
                objM408b = c0215aM406c.f550a.get(ProcessLifecycleInitializer.class);
                if (objM408b == null) {
                    objM408b = c0215aM406c.m408b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final C0486u c0486uMo636c = ((InterfaceC0484s) objM408b).mo636c();
        c0486uMo636c.m927a(new InterfaceC0470e(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.lifecycle.InterfaceC0470e
            /* JADX INFO: renamed from: a */
            public final void mo736a(InterfaceC0484s interfaceC0484s) {
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0388c.m760a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0398m(), 500L);
                c0486uMo636c.m932f(this);
            }
        });
        return Boolean.TRUE;
    }
}
