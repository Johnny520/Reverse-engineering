package p251r2;

import android.content.res.Resources;
import android.util.TypedValue;
import p117i.C3058h0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: r2.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6466d {

    /* JADX INFO: renamed from: a */
    public final C3058h0 f20344a = new C3058h0(0, 1, null);

    /* JADX INFO: renamed from: a */
    public final void m25640a() {
        synchronized (this) {
            this.f20344a.m11315g();
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final TypedValue m25641b(Resources resources, int i10) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.f20344a.m11449b(i10);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                this.f20344a.m11322n(i10, typedValue);
            }
        }
        return typedValue;
    }
}
