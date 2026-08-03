package p000a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AbstractC1235e;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: a.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0944z implements TextInputLayout.InterfaceC1314e, AbstractC1235e.g {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f3556f;

    /* JADX INFO: renamed from: b */
    public static int m2222b(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: c */
    public static String m2223c(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: d */
    public static String m2224d(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m2745B());
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m2225e(String str, int i) {
        return str + i;
    }

    /* JADX INFO: renamed from: f */
    public static String m2226f(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: g */
    public static String m2227g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: h */
    public static String m2228h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static StringBuilder m2229i(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m2230j(String str, int i) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = C0631i9.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sbM2229i = m2229i("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbM2229i.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbM2229i.toString());
            C0631i9.m1483f(nullPointerException, C0631i9.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m2231k(String str, String str2) {
        return str + str2;
    }

    @Override // androidx.transition.AbstractC1235e.g
    /* JADX INFO: renamed from: a */
    public void mo2232a(AbstractC1235e.f fVar, AbstractC1235e abstractC1235e, boolean z) {
        switch (this.f3556f) {
            case 15:
                fVar.mo3026a(abstractC1235e);
                break;
            case 16:
                fVar.m3063b(abstractC1235e);
                break;
            case 17:
                fVar.mo3021e(abstractC1235e);
                break;
            case 18:
                fVar.mo3020c();
                break;
            default:
                fVar.mo3023g();
                break;
        }
    }
}
