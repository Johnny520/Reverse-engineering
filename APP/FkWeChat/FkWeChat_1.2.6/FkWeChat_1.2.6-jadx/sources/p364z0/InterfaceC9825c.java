package p364z0;

import java.util.List;
import p036c9.InterfaceC1400a;
import p041d1.C1854d;
import p185m8.AbstractC5078f;

/* JADX INFO: renamed from: z0.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9825c extends List, InterfaceC9824b, InterfaceC1400a {

    /* JADX INFO: renamed from: z0.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5078f implements InterfaceC9825c {

        /* JADX INFO: renamed from: r */
        public final InterfaceC9825c f33181r;

        /* JADX INFO: renamed from: s */
        public final int f33182s;

        /* JADX INFO: renamed from: t */
        public final int f33183t;

        /* JADX INFO: renamed from: u */
        public int f33184u;

        public a(InterfaceC9825c interfaceC9825c, int i10, int i11) {
            this.f33181r = interfaceC9825c;
            this.f33182s = i10;
            this.f33183t = i11;
            C1854d.m6554c(i10, i11, interfaceC9825c.size());
            this.f33184u = i11 - i10;
        }

        @Override // p185m8.AbstractC5066b
        /* JADX INFO: renamed from: c */
        public int mo31c() {
            return this.f33184u;
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        public Object get(int i10) {
            C1854d.m6552a(i10, this.f33184u);
            return this.f33181r.get(this.f33182s + i10);
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        public InterfaceC9825c subList(int i10, int i11) {
            C1854d.m6554c(i10, i11, this.f33184u);
            InterfaceC9825c interfaceC9825c = this.f33181r;
            int i12 = this.f33182s;
            return new a(interfaceC9825c, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    default InterfaceC9825c subList(int i10, int i11) {
        return new a(this, i10, i11);
    }
}
