package p183m6;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p196n6.InterfaceC5497b;
import p376zd.C9987e;

/* JADX INFO: renamed from: m6.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5055y implements InterfaceC5497b {

    /* JADX INFO: renamed from: a */
    public static final C5055y f15367a = new C5055y();

    @Override // p196n6.InterfaceC5497b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set mo20456a(byte[] bArr, int i10, int i11) {
        int i12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i11 > 0) {
            C5042l c5042l = new C5042l(bArr, i10);
            int i13 = i10 + i11;
            while (true) {
                i12 = c5042l.f15319c;
                if (i12 >= i13) {
                    break;
                }
                linkedHashSet.add(c5042l.m20362q(c5042l.m20364t()));
            }
            if (i12 != i13) {
                C9987e.m38645a("Invalid String set");
                return null;
            }
        }
        return linkedHashSet;
    }

    @Override // p196n6.InterfaceC5497b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] mo20457b(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        Iterator it = set.iterator();
        int iM20340u = 0;
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                iM20340u += 5;
                iArr[i10] = -1;
            } else {
                int iM20339s = C5042l.m20339s(str);
                strArr[i10] = str;
                iArr[i10] = iM20339s;
                iM20340u += C5042l.m20340u(iM20339s) + iM20339s;
            }
            i10++;
        }
        C5042l c5042l = new C5042l(iM20340u);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            c5042l.m20345E(i12);
            if (i12 >= 0) {
                c5042l.m20343C(strArr[i11]);
            }
        }
        return c5042l.f15318b;
    }

    @Override // p196n6.InterfaceC5497b
    public String tag() {
        return "StringSet";
    }
}
