package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.InterfaceC0112q;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p162l3.C2455i;
import p162l3.C2456j;
import p162l3.C2458l;
import p162l3.C2465s;
import p341x3.C5688a;
import p341x3.InterfaceC5689b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC5689b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p341x3.InterfaceC5689b
    /* JADX INFO: renamed from: a */
    public final List mo506a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p341x3.InterfaceC5689b
    /* JADX INFO: renamed from: b */
    public final Object mo507b(Context context) {
        Object objM10243b;
        C2465s c2465s = new C2465s(new C2458l(context));
        c2465s.f8090b = 1;
        if (C2455i.f8061k == null) {
            synchronized (C2455i.f8060j) {
                try {
                    if (C2455i.f8061k == null) {
                        C2455i.f8061k = new C2455i(c2465s);
                    }
                } finally {
                }
            }
        }
        C5688a c5688aM10241c = C5688a.m10241c(context);
        c5688aM10241c.getClass();
        synchronized (C5688a.f23145e) {
            try {
                objM10243b = c5688aM10241c.f23146a.get(ProcessLifecycleInitializer.class);
                if (objM10243b == null) {
                    objM10243b = c5688aM10241c.m10243b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0114s c0114sMo550f = ((InterfaceC0112q) objM10243b).mo550f();
        c0114sMo550f.m552a(new C2456j(this, c0114sMo550f));
        return Boolean.TRUE;
    }
}
