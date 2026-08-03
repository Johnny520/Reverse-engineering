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

    public C0082Bw(Resources resources, Resources.Theme theme) {
        this.f190a = resources;
        this.f191b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0082Bw.class == obj.getClass()) {
            C0082Bw c0082Bw = (C0082Bw) obj;
            if (this.f190a.equals(c0082Bw.f190a) && Objects.equals(this.f191b, c0082Bw.f191b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f190a, this.f191b);
    }
}
