package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p149.C8336;
import p149.InterfaceC8335;
import p183.C8527;
import p183.C8541;
import p183.C8542;
import p183.C8543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC8335 {
    @Override // p149.InterfaceC8335
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo4884(Context context) {
        Object objM13285;
        C8527 c8527 = new C8527(new C8541(context));
        c8527.f7655 = 1;
        if (C8542.f21262 == null) {
            synchronized (C8542.f21263) {
                try {
                    if (C8542.f21262 == null) {
                        C8542.f21262 = new C8542(c8527);
                    }
                } finally {
                }
            }
        }
        C8336 c8336M13284 = C8336.m13284(context);
        c8336M13284.getClass();
        synchronized (C8336.f20715) {
            try {
                objM13285 = c8336M13284.f20719.get(ProcessLifecycleInitializer.class);
                if (objM13285 == null) {
                    objM13285 = c8336M13284.m13285(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC3235 lifecycle = ((InterfaceC3221) objM13285).getLifecycle();
        lifecycle.mo5063(new C8543(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // p149.InterfaceC8335
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo4885() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
