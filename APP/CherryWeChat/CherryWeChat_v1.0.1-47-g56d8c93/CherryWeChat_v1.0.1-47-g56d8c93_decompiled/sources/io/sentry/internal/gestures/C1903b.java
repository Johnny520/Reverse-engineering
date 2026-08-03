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
    public final String f6786d = "old_view_system";

    public C1903b(View view, String str, String str2) {
        this.f6783a = new WeakReference(view);
        this.f6784b = str;
        this.f6785c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1903b.class != obj.getClass()) {
            return false;
        }
        C1903b c1903b = (C1903b) obj;
        return AbstractC1856a.m4063i(this.f6784b, c1903b.f6784b) && AbstractC1856a.m4063i(this.f6785c, c1903b.f6785c) && AbstractC1856a.m4063i(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6783a, this.f6785c, null});
    }
}
