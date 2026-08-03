package p083u;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: u.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1093l {

    /* JADX INFO: renamed from: a */
    public final Resources f4208a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f4209b;

    public C1093l(Resources r1, Resources.Theme r2) {
        this.f4208a = r1;
        this.f4209b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (C1093l.class != r5.getClass()) goto L17;
        C1093l r52 = (C1093l) r5;
        if (this.f4208a.equals(r52.f4208a) == false) goto L16;
        if (Objects.equals(this.f4209b, r52.f4209b) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f4208a, this.f4209b});
    }
}
