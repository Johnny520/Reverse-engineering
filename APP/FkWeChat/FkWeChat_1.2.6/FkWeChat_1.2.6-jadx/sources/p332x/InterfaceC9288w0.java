package p332x;

import p263s.AbstractC6635e;

/* JADX INFO: renamed from: x.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9288w0 {

    /* JADX INFO: renamed from: a */
    public static final a f31768a = a.f31769a;

    /* JADX INFO: renamed from: x.w0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f31769a = new a();

        /* JADX INFO: renamed from: a */
        public final InterfaceC9288w0 m36129a(int i10) {
            if (!(i10 >= 0)) {
                AbstractC6635e.m26318a("pages should be greater than or equal to 0. You have used " + i10 + '.');
            }
            return new C9290x0(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    int mo36128a(int i10, int i11, float f10, int i12, int i13);
}
