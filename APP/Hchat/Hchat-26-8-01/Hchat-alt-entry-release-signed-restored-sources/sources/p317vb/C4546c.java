package p317vb;

import be.C0285i;
import ca.C0532s;
import java.util.ArrayList;

/* JADX INFO: renamed from: vb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4546c {

    /* JADX INFO: renamed from: a */
    public static final C4546c f15001a = new C4546c();

    /* JADX INFO: renamed from: b */
    public static final ArrayList f15002b = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m8971a(InterfaceC4544a interfaceC4544a) {
        String strMo4983a = interfaceC4544a.mo4983a();
        ArrayList arrayList = f15002b;
        if (strMo4983a != null) {
            arrayList.removeIf(new C0285i(new C0532s(strMo4983a, 20), 29));
        }
        arrayList.add(interfaceC4544a);
    }
}
