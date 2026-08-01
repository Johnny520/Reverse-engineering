package p163g0;

import com.bumptech.glide.AbstractC1924f;
import java.util.ArrayList;
import java.util.List;
import p061L2.C0986z;
import p065M2.C0999b;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: g0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2174f extends RuntimeException {

    /* JADX INFO: renamed from: d */
    public final C2169a f7134d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2174f(C2169a c2169a) {
        this.f7134d = c2169a;
        if (c2169a.m4006a()) {
            return;
        }
        ArrayList arrayListM3499k = AbstractC1924f.m3499k(c2169a);
        int size = arrayListM3499k.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i5 = 0; i5 < size; i5++) {
            stackTraceElementArr[i5] = new StackTraceElement("$$compose", "m$" + ((C2170b) arrayListM3499k.get(i5)).f7129a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        C2169a c2169a = this.f7134d;
        if (!c2169a.m4006a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        int i5 = 0;
        if (c2169a.m4006a()) {
            C0999b c0999bM4202o = AbstractC2352g.m4202o();
            List list = c2169a.f7128a;
            AbstractC1665j.m2985e(list, "<this>");
            C0986z c0986z = new C0986z(list);
            int iMo1974a = c0986z.mo1974a();
            for (int i6 = 0; i6 < iMo1974a; i6++) {
                ((C2170b) c0986z.get(i6)).getClass();
            }
            C0999b c0999bM4200m = AbstractC2352g.m4200m(c0999bM4202o);
            AbstractC1665j.m2985e(c0999bM4200m, "<this>");
            C0986z c0986z2 = new C0986z(c0999bM4200m);
            int iMo1974a2 = c0986z2.mo1974a();
            while (i5 < iMo1974a2) {
                String str = (String) c0986z2.get(i5);
                sb.append("\tat ");
                sb.append(str);
                sb.append('\n');
                i5++;
            }
        } else {
            ArrayList arrayListM3499k = AbstractC1924f.m3499k(c2169a);
            int size = arrayListM3499k.size();
            while (i5 < size) {
                C2170b c2170b = (C2170b) arrayListM3499k.get(i5);
                sb.append("\tat $$compose.m$");
                sb.append(c2170b.f7129a);
                sb.append("(SourceFile:1)\n");
                i5++;
            }
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }
}
