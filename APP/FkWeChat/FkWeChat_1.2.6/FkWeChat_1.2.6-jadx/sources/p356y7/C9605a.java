package p356y7;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p228p8.AbstractC5971a;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: y7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9605a extends AbstractC5971a {

    /* JADX INFO: renamed from: s */
    public static final a f32701s = new a(null);

    /* JADX INFO: renamed from: r */
    public final String f32702r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9605a(String str) {
        super(f32701s);
        str.getClass();
        this.f32702r = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9605a) && AbstractC1061t.m3842c(this.f32702r, ((C9605a) obj).f32702r);
    }

    public int hashCode() {
        return this.f32702r.hashCode();
    }

    public String toString() {
        return "PluginName(" + this.f32702r + ')';
    }

    /* JADX INFO: renamed from: y7.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5980j.c {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
