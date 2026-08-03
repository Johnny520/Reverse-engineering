package p046d6;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import okio.C3193a;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: d6.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0707d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static byte[] m1874a(ArrayDeque arrayDeque, int i9) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i9) {
            return bArr;
        }
        int length = i9 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i9);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i9 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m1875b(List list, List list2) {
        Iterator it = list2.iterator();
        for (Object obj : list) {
            if (!it.hasNext()) {
                return 1;
            }
            int iCompareTo = obj.toString().compareTo(it.next().toString());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return it.hasNext() ? -1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m1876c(Set set, Set set2) {
        int iCompare = Integer.compare(set.size(), set2.size());
        if (iCompare != 0) {
            return iCompare;
        }
        m1881h(set);
        m1881h(set2);
        Iterator it = set2.iterator();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            int iCompareTo = ((Comparable) it2.next()).compareTo((Comparable) it.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m1877d(int i9) {
        return (i9 & 240) >>> 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m1878e(List list, List list2) {
        return m1880g(new C0713j(list.iterator())).equals(m1880g(new C0713j(list2.iterator())));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m1879f(BufferedInputStream bufferedInputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            C3193a.m6820i("trying to read invalid offset/length range");
            return;
        }
        int i9 = 0;
        while (i9 < length) {
            int i10 = bufferedInputStream.read(bArr, i9, length - i9);
            if (i10 == -1) {
                break;
            } else {
                i9 += i10;
            }
        }
        if (i9 != bArr.length) {
            throw new EOFException(AbstractC2091b.m5163j(AbstractC0921a.m2257t(i9, "reached end of stream after reading ", " bytes; "), bArr.length, " bytes expected"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static ArrayList m1880g(Iterator it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m1881h(Collection collection) {
        Comparator comparator;
        if ((collection instanceof SortedSet) && ((comparator = ((SortedSet) collection).comparator()) == null || comparator.equals(C0708e.f2126h))) {
            return;
        }
        Collections.unmodifiableSortedSet(new C0705b(collection.toArray()));
    }
}
