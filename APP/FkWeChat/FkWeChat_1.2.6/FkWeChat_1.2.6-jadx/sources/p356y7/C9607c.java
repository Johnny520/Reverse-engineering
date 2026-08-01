package p356y7;

import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p228p8.AbstractC5971a;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: y7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9607c extends AbstractC5971a {

    /* JADX INFO: renamed from: s */
    public static final a f32710s = new a(null);

    /* JADX INFO: renamed from: r */
    public final List f32711r;

    public /* synthetic */ C9607c(List list, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9607c) && AbstractC1061t.m3842c(this.f32711r, ((C9607c) obj).f32711r);
    }

    public int hashCode() {
        return this.f32711r.hashCode();
    }

    public String toString() {
        return "PluginsTrace(" + AbstractC5081g0.m20585s0(this.f32711r, null, null, null, 0, null, null, 63, null) + ')';
    }

    /* JADX INFO: renamed from: x */
    public final List m37576x() {
        return this.f32711r;
    }

    /* JADX INFO: renamed from: y7.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5980j.c {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9607c(List list) {
        super(f32710s);
        list.getClass();
        this.f32711r = list;
    }
}
