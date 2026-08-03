package p000a;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: a.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0811s implements InterfaceC0892w4 {

    /* JADX INFO: renamed from: a */
    public final float f3203a;

    public C0811s(float f) {
        this.f3203a = f;
    }

    @Override // p000a.InterfaceC0892w4
    /* JADX INFO: renamed from: a */
    public final float mo1073a(RectF rectF) {
        return this.f3203a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0811s) && this.f3203a == ((C0811s) obj).f3203a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3203a)});
    }
}
