package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p000.AbstractC0465ly;
import p000.C0354iy;
import p000.InterfaceC0039ap;
import p000.RunnableC0054b3;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0039ap {
    @Override // p000.InterfaceC0039ap
    /* JADX INFO: renamed from: a */
    public final List mo249a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.InterfaceC0039ap
    /* JADX INFO: renamed from: b */
    public final Object mo250b(Context context) {
        AbstractC0465ly.m1767a(new RunnableC0054b3(this, context.getApplicationContext()));
        return new C0354iy(2);
    }
}
