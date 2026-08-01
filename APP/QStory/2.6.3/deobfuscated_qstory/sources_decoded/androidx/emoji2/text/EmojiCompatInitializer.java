package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p133.C7507;
import p133.InterfaceC7506;
import p167.C7698;
import p167.C7712;
import p167.C7713;
import p167.C7714;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC7506 {
    @Override // p133.InterfaceC7506
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo4324(Context context) {
        Object objM12726;
        C7698 c7698 = new C7698(new C7712(context));
        c7698.f7310 = 1;
        if (C7713.f20917 == null) {
            synchronized (C7713.f20918) {
                try {
                    if (C7713.f20917 == null) {
                        C7713.f20917 = new C7713(c7698);
                    }
                } finally {
                }
            }
        }
        C7507 c7507M12725 = C7507.m12725(context);
        c7507M12725.getClass();
        synchronized (C7507.f20370) {
            try {
                objM12726 = c7507M12725.f20374.get(ProcessLifecycleInitializer.class);
                if (objM12726 == null) {
                    objM12726 = c7507M12725.m12726(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC2402 lifecycle = ((InterfaceC2388) objM12726).getLifecycle();
        lifecycle.mo4503(new C7714(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // p133.InterfaceC7506
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo4325() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
