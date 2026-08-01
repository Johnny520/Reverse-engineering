package p000;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class ec0 {

    /* JADX INFO: renamed from: a */
    public final WindowId f1573a;

    public ec0(ViewGroup viewGroup) {
        this.f1573a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ec0) && ((ec0) obj).f1573a.equals(this.f1573a);
    }

    public final int hashCode() {
        return this.f1573a.hashCode();
    }
}
