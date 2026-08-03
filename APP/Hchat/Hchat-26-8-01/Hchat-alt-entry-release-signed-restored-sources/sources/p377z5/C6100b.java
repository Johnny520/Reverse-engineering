package p377z5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p006a6.AbstractC0017a;
import p122i5.AbstractC1987b;

/* JADX INFO: renamed from: z5.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6100b extends AbstractC1987b {

    /* JADX INFO: renamed from: j */
    public final String f24617j;

    /* JADX INFO: renamed from: k */
    public final String f24618k;

    /* JADX INFO: renamed from: l */
    public final List f24619l;

    /* JADX INFO: renamed from: m */
    public final String f24620m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[LOOP:1: B:15:0x003a->B:17:0x0040, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6100b(String str, List list, String str2, String str3) {
        Iterator it;
        List listUnmodifiableList;
        this.f24617j = str;
        this.f24618k = str2;
        AbstractC0017a.f57a.getClass();
        if (list == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else if (list instanceof List) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((CharSequence) it2.next()) instanceof String)) {
                    it = list.iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        arrayList.add(((CharSequence) it.next()).toString());
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(list);
        } else {
            it = list.iterator();
            ArrayList arrayList2 = new ArrayList();
            while (it.hasNext()) {
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        this.f24619l = listUnmodifiableList;
        this.f24620m = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public static C6100b m10858i1(AbstractC1987b abstractC1987b) {
        if (abstractC1987b instanceof C6100b) {
            return (C6100b) abstractC1987b;
        }
        return new C6100b(abstractC1987b.mo4929f1(), abstractC1987b.mo4930g1(), abstractC1987b.getName(), abstractC1987b.mo4931h1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    /* JADX INFO: renamed from: f1 */
    public final String mo4929f1() {
        return this.f24617j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    /* JADX INFO: renamed from: g1 */
    public final List mo4930g1() {
        return this.f24619l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    public final String getName() {
        return this.f24618k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    /* JADX INFO: renamed from: h1 */
    public final String mo4931h1() {
        return this.f24620m;
    }
}
