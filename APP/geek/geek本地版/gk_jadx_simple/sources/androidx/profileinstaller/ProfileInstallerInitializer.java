package androidx.profileinstaller;

import android.content.Context;
import defpackage.ap;
import defpackage.b3;
import defpackage.iy;
import defpackage.ly;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements ap {
    public ProfileInstallerInitializer() {
    }

    @Override // defpackage.ap
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ap
    public final Object b(Context r2) {
        ly.a(new b3(this, r2.getApplicationContext()));
        return new iy(2);
    }
}
