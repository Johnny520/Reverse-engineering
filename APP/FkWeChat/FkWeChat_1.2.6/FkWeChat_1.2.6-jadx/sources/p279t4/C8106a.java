package p279t4;

import android.graphics.Rect;
import p024b9.AbstractC1061t;
import p268s4.C7185a;

/* JADX INFO: renamed from: t4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8106a {

    /* JADX INFO: renamed from: a */
    public final C7185a f27053a;

    /* JADX INFO: renamed from: b */
    public final float f27054b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8106a(Rect rect, float f10) {
        this(new C7185a(rect), f10);
        rect.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final Rect m31326a() {
        return this.f27053a.m28377a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1061t.m3842c(C8106a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C8106a c8106a = (C8106a) obj;
        return AbstractC1061t.m3842c(this.f27053a, c8106a.f27053a) && this.f27054b == c8106a.f27054b;
    }

    public int hashCode() {
        return (this.f27053a.hashCode() * 31) + Float.hashCode(this.f27054b);
    }

    public String toString() {
        return "WindowMetrics(_bounds=" + this.f27053a + ", density=" + this.f27054b + ')';
    }

    public C8106a(C7185a c7185a, float f10) {
        c7185a.getClass();
        this.f27053a = c7185a;
        this.f27054b = f10;
    }
}
