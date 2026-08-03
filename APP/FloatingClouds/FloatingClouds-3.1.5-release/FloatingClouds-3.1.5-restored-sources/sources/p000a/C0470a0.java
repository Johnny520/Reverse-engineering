package p000a;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

/* JADX INFO: renamed from: a.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0470a0 extends AbstractC0433Y<Intent, C0397W> {
    @Override // p000a.AbstractC0433Y
    /* JADX INFO: renamed from: a */
    public final Intent mo1077a(Context context, Parcelable parcelable) {
        Intent intent = (Intent) parcelable;
        C0631i9.m1482e(intent, "input");
        return intent;
    }

    @Override // p000a.AbstractC0433Y
    /* JADX INFO: renamed from: c */
    public final Object mo1079c(Intent intent, int i) {
        return new C0397W(intent, i);
    }
}
