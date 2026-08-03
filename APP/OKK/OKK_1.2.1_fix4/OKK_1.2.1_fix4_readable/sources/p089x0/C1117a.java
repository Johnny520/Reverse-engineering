package p089x0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1117a implements InterfaceC1119c {

    /* JADX INFO: renamed from: a */
    public final float f4283a;

    public C1117a(float f2) {
        this.f4283a = f2;
    }

    @Override // p089x0.InterfaceC1119c
    /* JADX INFO: renamed from: a */
    public final float mo2634a(RectF rectF) {
        return this.f4283a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1117a) && this.f4283a == ((C1117a) obj).f4283a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4283a)});
    }
}
