package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.C0541o8;
import p000.C0699rr;
import p000.C0736sr;
import p000.C0780tv;
import p000.C0910x1;
import p000.s90;
import p000.t10;
import p000.x90;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements t10 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.t10
    /* JADX INFO: renamed from: a */
    public final List mo189a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.t10
    /* JADX INFO: renamed from: b */
    public final Object mo190b(Context context) {
        Object objM2800d;
        C0780tv c0780tv = new C0780tv(new C0910x1(context));
        c0780tv.f6053b = 1;
        if (C0699rr.f5539k == null) {
            synchronized (C0699rr.f5538j) {
                try {
                    if (C0699rr.f5539k == null) {
                        C0699rr.f5539k = new C0699rr(c0780tv);
                    }
                } finally {
                }
            }
        }
        C0541o8 c0541o8M2796g = C0541o8.m2796g(context);
        c0541o8M2796g.getClass();
        synchronized (C0541o8.f4479e) {
            try {
                objM2800d = ((HashMap) c0541o8M2796g.f4480a).get(ProcessLifecycleInitializer.class);
                if (objM2800d == null) {
                    objM2800d = c0541o8M2796g.m2800d(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        s90 lifecycle = ((x90) objM2800d).getLifecycle();
        lifecycle.mo4014a(new C0736sr(this, lifecycle));
        return Boolean.TRUE;
    }
}
