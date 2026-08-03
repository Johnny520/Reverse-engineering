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

    public C1093l(Resources resources, Resources.Theme theme) {
        this.f4208a = resources;
        this.f4209b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1093l.class != obj.getClass()) {
            return false;
        }
        C1093l c1093l = (C1093l) obj;
        return this.f4208a.equals(c1093l.f4208a) && Objects.equals(this.f4209b, c1093l.f4209b);
    }

    public final int hashCode() {
        return Objects.hash(this.f4208a, this.f4209b);
    }
}
