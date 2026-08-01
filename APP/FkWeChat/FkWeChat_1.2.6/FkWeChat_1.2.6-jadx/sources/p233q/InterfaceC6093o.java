package p233q;

/* JADX INFO: renamed from: q.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6093o {

    /* JADX INFO: renamed from: q.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC6093o {

        /* JADX INFO: renamed from: a */
        public static final a f19136a = new a();

        @Override // p233q.InterfaceC6093o
        /* JADX INFO: renamed from: a */
        public int mo24246a(int i10, int i11, int i12, int i13, int i14, int i15) {
            return (((i10 - i12) - i13) / 2) - (i11 / 2);
        }

        public String toString() {
            return "Center";
        }
    }

    /* JADX INFO: renamed from: q.o$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC6093o {

        /* JADX INFO: renamed from: a */
        public static final b f19137a = new b();

        @Override // p233q.InterfaceC6093o
        /* JADX INFO: renamed from: a */
        public int mo24246a(int i10, int i11, int i12, int i13, int i14, int i15) {
            return 0;
        }

        public String toString() {
            return "Start";
        }
    }

    /* JADX INFO: renamed from: a */
    int mo24246a(int i10, int i11, int i12, int i13, int i14, int i15);
}
