package p338x0;

import java.util.ArrayList;
import java.util.List;
import p000a.AbstractC0000a;
import p218og.C3143g;
import p304uf.C4329c;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: x0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5576f extends RuntimeException {

    /* JADX INFO: renamed from: g */
    public final C5571a f22703g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5576f(C5571a c5571a) {
        this.f22703g = c5571a;
        if (c5571a.f22697b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = c5571a.f22696a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            C5572b c5572b = (C5572b) list.get(i9);
            int i11 = c5572b.f22698a;
            int i12 = 0;
            while (true) {
                if (i12 >= 9) {
                    i12 = -1;
                    break;
                } else if (i11 == iArr[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
            if (!(i12 >= 0)) {
                if (c5572b.f22698a == 100) {
                    int i13 = i9 + 2;
                    if (i13 < size && ((C5572b) list.get(i13)).f22698a == 1000) {
                        break;
                    } else {
                        AbstractC4171r.m8434j1(arrayList);
                    }
                } else {
                    arrayList.add(c5572b);
                }
            }
            i9 = i10;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            stackTraceElementArr[i14] = new StackTraceElement("$$compose", "m$" + ((C5572b) arrayList.get(i14)).f22698a, "SourceFile", 1);
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
        C5571a c5571a = this.f22703g;
        if (!c5571a.f22697b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        C4329c c4329cM7E = AbstractC0000a.m7E();
        List list = c5571a.f22696a;
        list.getClass();
        C3143g c3143g = new C3143g(list);
        int size = c3143g.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C5572b) c3143g.get(i9)).getClass();
        }
        C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
        c4329cM90t.getClass();
        C3143g c3143g2 = new C3143g(c4329cM90t);
        int size2 = c3143g2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            String str = (String) c3143g2.get(i10);
            sb2.append("\tat ");
            sb2.append(str);
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
