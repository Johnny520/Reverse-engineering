package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p133.C7506;
import p133.InterfaceC7505;
import p167.C7697;
import p167.C7711;
import p167.C7712;
import p167.C7713;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC7505 {
    @Override // p133.InterfaceC7505
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo4314(Context context) {
        Object objM12697;
        C7697 c7697 = new C7697(new C7711(context));
        c7697.f7309 = 1;
        if (C7712.f20922 == null) {
            synchronized (C7712.f20923) {
                try {
                    if (C7712.f20922 == null) {
                        C7712.f20922 = new C7712(c7697);
                    }
                } finally {
                }
            }
        }
        C7506 c7506M12696 = C7506.m12696(context);
        c7506M12696.getClass();
        synchronized (C7506.f20375) {
            try {
                objM12697 = c7506M12696.f20379.get(ProcessLifecycleInitializer.class);
                if (objM12697 == null) {
                    objM12697 = c7506M12696.m12697(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC2402 lifecycle = ((InterfaceC2388) objM12697).getLifecycle();
        lifecycle.mo4493(new C7713(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // p133.InterfaceC7505
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo4315() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
