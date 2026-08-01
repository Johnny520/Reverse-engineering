package io.ktor.network.sockets;

import java.util.HashMap;
import java.util.Map;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: io.ktor.network.sockets.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3447y {

    /* JADX INFO: renamed from: e */
    public static final b f9502e = new b(null);

    /* JADX INFO: renamed from: a */
    public final Map f9503a;

    /* JADX INFO: renamed from: b */
    public byte f9504b;

    /* JADX INFO: renamed from: c */
    public boolean f9505c;

    /* JADX INFO: renamed from: d */
    public boolean f9506d;

    /* JADX INFO: renamed from: io.ktor.network.sockets.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3447y {

        /* JADX INFO: renamed from: f */
        public int f9507f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(map, null);
            map.getClass();
            this.f9507f = 511;
        }

        /* JADX INFO: renamed from: h */
        public final int m12854h() {
            return this.f9507f;
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.sockets.y$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC3447y {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map map) {
            super(map, null);
            map.getClass();
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.sockets.y$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d extends AbstractC3447y {

        /* JADX INFO: renamed from: f */
        public int f9508f;

        /* JADX INFO: renamed from: g */
        public int f9509g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map map) {
            super(map, null);
            map.getClass();
            this.f9508f = -1;
            this.f9509g = -1;
        }

        @Override // io.ktor.network.sockets.AbstractC3447y
        /* JADX INFO: renamed from: a */
        public void mo12847a(AbstractC3447y abstractC3447y) {
            abstractC3447y.getClass();
            super.mo12847a(abstractC3447y);
            if (abstractC3447y instanceof d) {
                d dVar = (d) abstractC3447y;
                this.f9508f = dVar.f9508f;
                this.f9509g = dVar.f9509g;
            }
        }

        /* JADX INFO: renamed from: h */
        public final int m12856h() {
            return this.f9509g;
        }

        /* JADX INFO: renamed from: i */
        public final int m12857i() {
            return this.f9508f;
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.sockets.y$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends d {
    }

    public AbstractC3447y(Map map) {
        this.f9503a = map;
        this.f9504b = AbstractC3424c0.f9426a.m12801a();
    }

    /* JADX INFO: renamed from: a */
    public void mo12847a(AbstractC3447y abstractC3447y) {
        abstractC3447y.getClass();
        this.f9504b = abstractC3447y.f9504b;
        this.f9505c = abstractC3447y.f9505c;
        this.f9506d = abstractC3447y.f9506d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12848b() {
        return this.f9505c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12849c() {
        return this.f9506d;
    }

    /* JADX INFO: renamed from: d */
    public final byte m12850d() {
        return this.f9504b;
    }

    /* JADX INFO: renamed from: e */
    public final d m12851e() {
        d dVar = new d(new HashMap(this.f9503a));
        mo12847a(this);
        return dVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m12852f(boolean z10) {
        this.f9505c = z10;
    }

    /* JADX INFO: renamed from: g */
    public final a m12853g() {
        a aVar = new a(new HashMap(this.f9503a));
        aVar.mo12847a(this);
        return aVar;
    }

    /* JADX INFO: renamed from: io.ktor.network.sockets.y$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC3447y m12855a() {
            return new c(new HashMap());
        }

        public b() {
        }
    }

    public /* synthetic */ AbstractC3447y(Map map, AbstractC1043k abstractC1043k) {
        this(map);
    }
}
