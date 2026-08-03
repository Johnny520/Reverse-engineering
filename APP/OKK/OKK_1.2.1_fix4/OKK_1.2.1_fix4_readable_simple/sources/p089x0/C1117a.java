package p089x0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1117a implements InterfaceC1119c {

    /* JADX INFO: renamed from: a */
    public final float f4283a;

    public C1117a(float r1) {
        this.f4283a = r1;
    }

    @Override // p089x0.InterfaceC1119c
    /* JADX INFO: renamed from: a */
    public final float mo2634a(RectF r1) {
        return this.f4283a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C1117a) == true) goto L9;
        return false;
    L9:
        if (this.f4283a != ((C1117a) r4).f4283a) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4283a)});
    }
}
