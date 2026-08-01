package p360yb;

import java.util.List;
import p036c9.InterfaceC1400a;
import p052dc.C1946d;
import p185m8.AbstractC5078f;

/* JADX INFO: renamed from: yb.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9660c extends List, InterfaceC9659b, InterfaceC1400a {

    /* JADX INFO: renamed from: yb.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static InterfaceC9660c m37781a(InterfaceC9660c interfaceC9660c, int i10, int i11) {
            return new b(interfaceC9660c, i10, i11);
        }
    }

    /* JADX INFO: renamed from: yb.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5078f implements InterfaceC9660c {

        /* JADX INFO: renamed from: r */
        public final InterfaceC9660c f32893r;

        /* JADX INFO: renamed from: s */
        public final int f32894s;

        /* JADX INFO: renamed from: t */
        public final int f32895t;

        /* JADX INFO: renamed from: u */
        public int f32896u;

        public b(InterfaceC9660c interfaceC9660c, int i10, int i11) {
            interfaceC9660c.getClass();
            this.f32893r = interfaceC9660c;
            this.f32894s = i10;
            this.f32895t = i11;
            C1946d.m7055c(i10, i11, interfaceC9660c.size());
            this.f32896u = i11 - i10;
        }

        @Override // p185m8.AbstractC5066b
        /* JADX INFO: renamed from: c */
        public int mo31c() {
            return this.f32896u;
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InterfaceC9660c subList(int i10, int i11) {
            C1946d.m7055c(i10, i11, this.f32896u);
            InterfaceC9660c interfaceC9660c = this.f32893r;
            int i12 = this.f32894s;
            return new b(interfaceC9660c, i10 + i12, i12 + i11);
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        public Object get(int i10) {
            C1946d.m7053a(i10, this.f32896u);
            return this.f32893r.get(this.f32894s + i10);
        }
    }
}
