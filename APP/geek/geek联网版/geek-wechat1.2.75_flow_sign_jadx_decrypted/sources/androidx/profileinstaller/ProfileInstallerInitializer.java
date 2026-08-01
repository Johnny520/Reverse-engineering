package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p000.AbstractC0724sy;
import p000.C0426kw;
import p000.InterfaceC0195ep;
import p000.RunnableC0054b3;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0195ep {
    @Override // p000.InterfaceC0195ep
    /* JADX INFO: renamed from: a */
    public final List mo234a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.InterfaceC0195ep
    /* JADX INFO: renamed from: b */
    public final Object mo235b(Context context) {
        AbstractC0724sy.m2384a(new RunnableC0054b3(this, context.getApplicationContext()));
        return new C0426kw(4);
    }
}
