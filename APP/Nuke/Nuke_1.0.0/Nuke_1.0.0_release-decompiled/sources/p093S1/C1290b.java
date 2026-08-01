package p093S1;

/* JADX INFO: renamed from: S1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1290b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4622a;

    /* JADX INFO: renamed from: a */
    public final int m2377a(Object obj) {
        switch (this.f4622a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2378b() {
        switch (this.f4622a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m2379c() {
        switch (this.f4622a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
