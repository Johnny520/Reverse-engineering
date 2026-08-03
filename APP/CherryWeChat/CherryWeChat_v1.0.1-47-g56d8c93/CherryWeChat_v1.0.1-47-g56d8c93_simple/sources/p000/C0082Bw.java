package p000;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: Bw */
/* JADX INFO: loaded from: classes.dex */
public final class C0082Bw {

    /* JADX INFO: renamed from: a */
    public final Resources f190a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f191b;

    public C0082Bw(Resources r1, Resources.Theme r2) {
        this.f190a = r1;
        this.f191b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (C0082Bw.class != r5.getClass()) goto L15;
        C0082Bw r52 = (C0082Bw) r5;
        if (this.f190a.equals(r52.f190a) == false) goto L15;
        if (Objects.equals(this.f191b, r52.f191b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f190a, this.f191b});
    }
}
