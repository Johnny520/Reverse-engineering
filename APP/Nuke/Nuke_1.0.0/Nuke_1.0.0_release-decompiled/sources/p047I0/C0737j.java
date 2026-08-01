package p047I0;

import android.content.ClipboardManager;
import android.content.Context;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: I0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0737j implements InterfaceC0747m0 {

    /* JADX INFO: renamed from: a */
    public final ClipboardManager f2315a;

    public C0737j(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC1665j.m2983c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f2315a = (ClipboardManager) systemService;
    }
}
