package io.sentry.internal.gestures;

import android.view.View;
import io.sentry.config.AbstractC1856a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.internal.gestures.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1903b {

    /* JADX INFO: renamed from: a */
    public final WeakReference f6783a;

    /* JADX INFO: renamed from: b */
    public final String f6784b;

    /* JADX INFO: renamed from: c */
    public final String f6785c;

    /* JADX INFO: renamed from: d */
    public final String f6786d;

    public C1903b(View r2, String r3, String r4) {
        this.f6783a = new WeakReference(r2);
        this.f6784b = r3;
        this.f6785c = r4;
        this.f6786d = "old_view_system";
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L18;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C1903b.class != r3.getClass()) goto L22;
        C1903b r32 = (C1903b) r3;
        if (AbstractC1856a.m4063i(this.f6784b, r32.f6784b) == true) goto L11;
        return false;
    L11:
        if (AbstractC1856a.m4063i(this.f6785c, r32.f6785c) == true) goto L13;
        return false;
    L13:
        if (AbstractC1856a.m4063i(null, null) == false) goto L21;
        return true;
    L21:
        return false;
    L22:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        String r0 = this.f6785c;
        return Arrays.hashCode(new Object[]{this.f6783a, r0, null});
    }
}
