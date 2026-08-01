package p222p2;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: renamed from: p2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5945e {

    /* JADX INFO: renamed from: a */
    public final Object f18861a;

    /* JADX INFO: renamed from: p2.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Bundle m23913a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        /* JADX INFO: renamed from: b */
        public static void m23914b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        /* JADX INFO: renamed from: c */
        public static void m23915c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        /* JADX INFO: renamed from: d */
        public static void m23916d(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        /* JADX INFO: renamed from: e */
        public static void m23917e(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
            viewStructure.setId(i10, str, str2, str3);
        }

        /* JADX INFO: renamed from: f */
        public static void m23918f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        /* JADX INFO: renamed from: g */
        public static void m23919g(ViewStructure viewStructure, float f10, int i10, int i11, int i12) {
            viewStructure.setTextStyle(f10, i10, i11, i12);
        }
    }

    public C5945e(ViewStructure viewStructure) {
        this.f18861a = viewStructure;
    }

    /* JADX INFO: renamed from: i */
    public static C5945e m23904i(ViewStructure viewStructure) {
        return new C5945e(viewStructure);
    }

    /* JADX INFO: renamed from: a */
    public Bundle m23905a() {
        return a.m23913a((ViewStructure) this.f18861a);
    }

    /* JADX INFO: renamed from: b */
    public void m23906b(String str) {
        a.m23914b((ViewStructure) this.f18861a, str);
    }

    /* JADX INFO: renamed from: c */
    public void m23907c(CharSequence charSequence) {
        a.m23915c((ViewStructure) this.f18861a, charSequence);
    }

    /* JADX INFO: renamed from: d */
    public void m23908d(int i10, int i11, int i12, int i13, int i14, int i15) {
        a.m23916d((ViewStructure) this.f18861a, i10, i11, i12, i13, i14, i15);
    }

    /* JADX INFO: renamed from: e */
    public void m23909e(int i10, String str, String str2, String str3) {
        a.m23917e((ViewStructure) this.f18861a, i10, str, str2, str3);
    }

    /* JADX INFO: renamed from: f */
    public void m23910f(CharSequence charSequence) {
        a.m23918f((ViewStructure) this.f18861a, charSequence);
    }

    /* JADX INFO: renamed from: g */
    public void m23911g(float f10, int i10, int i11, int i12) {
        a.m23919g((ViewStructure) this.f18861a, f10, i10, i11, i12);
    }

    /* JADX INFO: renamed from: h */
    public ViewStructure m23912h() {
        return (ViewStructure) this.f18861a;
    }
}
