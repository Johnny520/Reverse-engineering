package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: classes.dex */
public final class C0169e implements InterfaceC0184ee {

    /* JADX INFO: renamed from: a */
    public final float f1464a;

    public C0169e(float f) {
        this.f1464a = f;
    }

    @Override // p000.InterfaceC0184ee
    /* JADX INFO: renamed from: a */
    public final float mo943a(RectF rectF) {
        return this.f1464a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0169e) && this.f1464a == ((C0169e) obj).f1464a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1464a)});
    }
}
