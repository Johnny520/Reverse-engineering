package ca;

import android.content.Intent;
import gg.AbstractC1416l;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: ca.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0513c0 {

    /* JADX INFO: renamed from: a */
    public final Intent f1566a;

    /* JADX INFO: renamed from: b */
    public final String f1567b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0513c0(Intent intent, String str, int i9) {
        intent = (i9 & 1) != 0 ? null : intent;
        str = (i9 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f1566a = intent;
        this.f1567b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0513c0)) {
            return false;
        }
        C0513c0 c0513c0 = (C0513c0) obj;
        return AbstractC1416l.m3825a(this.f1566a, c0513c0.f1566a) && this.f1567b.equals(c0513c0.f1567b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Intent intent = this.f1566a;
        return this.f1567b.hashCode() + ((intent == null ? 0 : intent.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MomentsPreparation(intent=" + this.f1566a + ", error=" + this.f1567b + ")";
    }
}
