package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.C0038;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import yyds.AbstractC0983;
import yyds.C0331;
import yyds.C0644;
import yyds.C0991;
import yyds.C1483;
import yyds.InterfaceC1283;
import yyds.InterfaceC2159;
import yyds.InterfaceC2345;
import yyds.RunnableC1128;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1283 {
    @Override // yyds.InterfaceC1283
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final List mo116() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // yyds.InterfaceC1283
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object mo117(Context context) {
        Object objM1560;
        C0991 c0991 = new C0991(new C1483(context));
        c0991.f1828 = 1;
        if (C0331.f1745 == null) {
            synchronized (C0331.f1744) {
                try {
                    if (C0331.f1745 == null) {
                        C0331.f1745 = new C0331(c0991);
                    }
                } finally {
                }
            }
        }
        C0644 c0644M1547 = C0644.m1547(context);
        c0644M1547.getClass();
        synchronized (C0644.f3095) {
            try {
                objM1560 = ((HashMap) c0644M1547.f3099).get(ProcessLifecycleInitializer.class);
                if (objM1560 == null) {
                    objM1560 = c0644M1547.m1560(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final C0038 c0038Mo14 = ((InterfaceC2345) objM1560).mo14();
        c0038Mo14.m122(new InterfaceC2159(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // yyds.InterfaceC2159
            /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
            public final void mo118() {
                AbstractC0983.m2139(Looper.getMainLooper()).postDelayed(new RunnableC1128(1), 500L);
                c0038Mo14.m126(this);
            }
        });
        return Boolean.TRUE;
    }
}
