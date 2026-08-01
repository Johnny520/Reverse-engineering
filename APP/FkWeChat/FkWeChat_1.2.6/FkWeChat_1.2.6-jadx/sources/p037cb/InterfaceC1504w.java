package p037cb;

import java.util.List;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5995e;

/* JADX INFO: renamed from: cb.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1504w {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1504w f4450a = new a();

    /* JADX INFO: renamed from: cb.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC1504w {
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m5889c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p037cb.InterfaceC1504w
        /* JADX INFO: renamed from: a */
        public void mo5887a(InterfaceC5986b interfaceC5986b) {
            if (interfaceC5986b == null) {
                m5889c(2);
            }
        }

        @Override // p037cb.InterfaceC1504w
        /* JADX INFO: renamed from: b */
        public void mo5888b(InterfaceC5995e interfaceC5995e, List list) {
            if (interfaceC5995e == null) {
                m5889c(0);
            }
            if (list == null) {
                m5889c(1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo5887a(InterfaceC5986b interfaceC5986b);

    /* JADX INFO: renamed from: b */
    void mo5888b(InterfaceC5995e interfaceC5995e, List list);
}
