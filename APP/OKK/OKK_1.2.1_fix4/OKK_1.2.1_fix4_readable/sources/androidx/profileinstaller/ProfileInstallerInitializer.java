package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p034S.AbstractC0331k;
import p034S.RunnableC0328h;
import p041W.InterfaceC0415b;
import p089x0.C1121e;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0415b {
    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: a */
    public final List mo999a() {
        return Collections.emptyList();
    }

    @Override // p041W.InterfaceC0415b
    /* JADX INFO: renamed from: b */
    public final Object mo1000b(Context context) {
        AbstractC0331k.m749a(new RunnableC0328h(this, context.getApplicationContext(), 0));
        return new C1121e(10);
    }
}
