package p000;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class zb0 {

    /* JADX INFO: renamed from: a */
    public final WindowId f5533a;

    public zb0(ViewGroup viewGroup) {
        this.f5533a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zb0) && ((zb0) obj).f5533a.equals(this.f5533a);
    }

    public final int hashCode() {
        return this.f5533a.hashCode();
    }
}
