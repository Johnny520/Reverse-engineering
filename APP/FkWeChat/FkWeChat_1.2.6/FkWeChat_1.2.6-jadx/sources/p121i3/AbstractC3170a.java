package p121i3;

import android.content.Context;
import p136j3.C3591b;
import p136j3.InterfaceC3590a;

/* JADX INFO: renamed from: i3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3170a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC3175e m11960a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        InterfaceC3590a interfaceC3590aM13436b = C3591b.f9979a.m13436b(f10);
        if (interfaceC3590aM13436b == null) {
            interfaceC3590aM13436b = new C3192v(f10);
        }
        return new C3178h(f11, f10, interfaceC3590aM13436b);
    }
}
