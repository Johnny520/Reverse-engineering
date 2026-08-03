package Yue;

import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3886 extends C3885 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final <T> List<T> m10807(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        return new C7166(list);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "asReversedMutable")
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final <T> List<T> m10808(@InterfaceC6399 List<T> list) {
        C5499.m17103(list, "<this>");
        return new C7165(list);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final int m10809(List<?> list, int i) {
        if (new C5458(0, C3880.m10737(list)).m16971(i)) {
            return C3880.m10737(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C5458(0, C3880.m10737(list)) + "].");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final int m10810(List<?> list, int i) {
        return C3880.m10737(list) - i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final int m10811(List<?> list, int i) {
        if (new C5458(0, list.size()).m16971(i)) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C5458(0, list.size()) + "].");
    }
}
