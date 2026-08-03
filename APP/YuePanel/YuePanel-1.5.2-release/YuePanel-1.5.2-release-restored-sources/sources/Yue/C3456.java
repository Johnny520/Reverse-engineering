package Yue;

import Yue.C4483;
import Yue.C7003;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3456 implements Iterable<C3454>, Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final char f5584 = '/';

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String f5585 = "data-";

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f5586 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f5587 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f5588 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String f5589 = "";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f5590 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String[] f5591 = new String[3];

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Object[] f5592 = new Object[3];

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ$ۥ */
    public class C0141 implements Iterator<C3454> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f5593;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f5594 = 0;

        public C0141() {
            this.f5593 = C3456.this.f5590;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m530();
            while (this.f5594 < C3456.this.f5590 && C3456.m9185(C3456.this.f5591[this.f5594])) {
                this.f5594++;
            }
            return this.f5594 < C3456.this.f5590;
        }

        @Override // java.util.Iterator
        public void remove() {
            C3456 c3456 = C3456.this;
            int i = this.f5594 - 1;
            this.f5594 = i;
            c3456.m9211(i);
            this.f5593--;
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m530() {
            if (C3456.this.f5590 != this.f5593) {
                throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
            }
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C3454 next() {
            m530();
            if (this.f5594 >= C3456.this.f5590) {
                throw new NoSuchElementException();
            }
            C3456 c3456 = C3456.this;
            String[] strArr = c3456.f5591;
            int i = this.f5594;
            C3454 c3454 = new C3454(strArr[i], (String) c3456.f5592[i], c3456);
            this.f5594++;
            return c3454;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ$ۥ۟ */
    public static class C0142 extends AbstractMap<String, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final C3456 f5596;

        /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ۟, reason: contains not printable characters */
        public class C3458 extends AbstractSet<Map.Entry<String, String>> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C3458() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<String, String>> iterator() {
                return new C3457(C0142.this, null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i = 0;
                while (new C3457(C0142.this, null).hasNext()) {
                    i++;
                }
                return i;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥ۟ۢ۠ۤ$ۥ۟) A[MD:(Yue.ۥ۟ۢ۠ۤ$ۥ۟):void (m)] (LINE:2) call: Yue.ۥ۟ۢ۠ۤ.ۥ۟.ۥ۟.<init>(Yue.ۥ۟ۢ۠ۤ$ۥ۟):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public /* synthetic */ C3458(C0142 c0142, C0141 c0141) {
                this();
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥ۟ۢ۠ۤ) A[MD:(Yue.ۥ۟ۢ۠ۤ):void (m)] (LINE:1) call: Yue.ۥ۟ۢ۠ۤ.ۥ۟.<init>(Yue.ۥ۟ۢ۠ۤ):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0142(C3456 c3456, C0141 c0141) {
            this(c3456);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return new C3458(this, null);
        }

        /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public String put(String str, String str2) {
            String strM9183 = C3456.m9183(str);
            String strM9195 = this.f5596.m9200(strM9183) ? this.f5596.m9195(strM9183) : null;
            this.f5596.m9208(strM9183, str2);
            return strM9195;
        }

        /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ, reason: contains not printable characters */
        public class C3457 implements Iterator<Map.Entry<String, String>> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Iterator<C3454> f5597;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public C3454 f5598;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C3457() {
                this.f5597 = C0142.this.f5596.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                while (this.f5597.hasNext()) {
                    C3454 next = this.f5597.next();
                    this.f5598 = next;
                    if (next.m9139()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                C0142.this.f5596.m9212(this.f5598.getKey());
            }

            /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public Map.Entry<String, String> next() {
                return new C3454(this.f5598.getKey().substring(5), this.f5598.getValue());
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥ۟ۢ۠ۤ$ۥ۟) A[MD:(Yue.ۥ۟ۢ۠ۤ$ۥ۟):void (m)] (LINE:3) call: Yue.ۥ۟ۢ۠ۤ.ۥ۟.ۥ.<init>(Yue.ۥ۟ۢ۠ۤ$ۥ۟):void type: THIS */
            public /* synthetic */ C3457(C0142 c0142, C0141 c0141) {
                this();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0142(C3456 c3456) {
            this.f5596 = c3456;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static String m9182(Object obj) {
        return obj == null ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static String m9183(String str) {
        return f5585 + str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static String m9184(String str) {
        return '/' + str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static boolean m9185(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3456 c3456 = (C3456) obj;
        if (this.f5590 != c3456.f5590) {
            return false;
        }
        for (int i = 0; i < this.f5590; i++) {
            int iM9204 = c3456.m9204(this.f5591[i]);
            if (iM9204 == -1) {
                return false;
            }
            Object obj2 = this.f5592[i];
            Object obj3 = c3456.f5592[iM9204];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.f5590 * 31) + Arrays.hashCode(this.f5591)) * 31) + Arrays.hashCode(this.f5592);
    }

    public boolean isEmpty() {
        return this.f5590 == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<C3454> iterator() {
        return new C0141();
    }

    public int size() {
        return this.f5590;
    }

    public String toString() {
        return m9202();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C3456 m9186(String str, String str2) {
        m9188(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m9187(C3456 c3456) {
        if (c3456.size() == 0) {
            return;
        }
        m9191(this.f5590 + c3456.f5590);
        boolean z = this.f5590 != 0;
        for (C3454 c3454 : c3456) {
            if (z) {
                m9207(c3454);
            } else {
                m9186(c3454.getKey(), c3454.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m9188(String str, Object obj) {
        m9191(this.f5590 + 1);
        String[] strArr = this.f5591;
        int i = this.f5590;
        strArr[i] = str;
        this.f5592[i] = obj;
        this.f5590 = i + 1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public List<C3454> m9189() {
        ArrayList arrayList = new ArrayList(this.f5590);
        for (int i = 0; i < this.f5590; i++) {
            if (!m9185(this.f5591[i])) {
                arrayList.add(new C3454(this.f5591[i], (String) this.f5592[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C3454 m9190(String str) {
        int iM9204 = m9204(str);
        if (iM9204 == -1) {
            return null;
        }
        return new C3454(str, m9182(this.f5592[iM9204]), this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m9191(int i) {
        C8159.m26903(i >= this.f5590);
        String[] strArr = this.f5591;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f5590 * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f5591 = (String[]) Arrays.copyOf(strArr, i);
        this.f5592 = Arrays.copyOf(this.f5592, i);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3456 clone() {
        try {
            C3456 c3456 = (C3456) super.clone();
            c3456.f5590 = this.f5590;
            c3456.f5591 = (String[]) Arrays.copyOf(this.f5591, this.f5590);
            c3456.f5592 = Arrays.copyOf(this.f5592, this.f5590);
            return c3456;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Map<String, String> m9193() {
        return new C0142(this, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m9194(C6616 c6616) {
        String str;
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean zM20993 = c6616.m20993();
        int i2 = 0;
        while (i < this.f5591.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.f5591;
                if (i4 >= strArr.length || (str = strArr[i4]) == null) {
                    break;
                }
                if (!zM20993 || !strArr[i].equals(str)) {
                    if (!zM20993) {
                        String[] strArr2 = this.f5591;
                        if (strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                            i2++;
                            m9211(i4);
                            i4--;
                        }
                    }
                }
                i4++;
            }
            i = i3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public String m9195(String str) {
        int iM9204 = m9204(str);
        return iM9204 == -1 ? "" : m9182(this.f5592[iM9204]);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String m9196(String str) {
        int iM9205 = m9205(str);
        return iM9205 == -1 ? "" : m9182(this.f5592[iM9205]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Map<String, C7003.C1135> m9197() {
        return (Map) m9216(C7429.f2877);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m9198(String str) {
        int iM9204 = m9204(str);
        return (iM9204 == -1 || this.f5592[iM9204] == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m9199(String str) {
        int iM9205 = m9205(str);
        return (iM9205 == -1 || this.f5592[iM9205] == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m9200(String str) {
        return m9204(str) != -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m9201(String str) {
        return m9205(str) != -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public String m9202() {
        StringBuilder sbM3765 = C7615.m3765();
        try {
            m9203(sbM3765, new C4483("").m13001());
            return C7615.m23825(sbM3765);
        } catch (IOException e) {
            throw new C7370(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m9203(Appendable appendable, C4483.C0414 c0414) throws IOException {
        String strM9127;
        int i = this.f5590;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m9185(this.f5591[i2]) && (strM9127 = C3454.m9127(this.f5591[i2], c0414.m13028())) != null) {
                C3454.m9129(strM9127, (String) this.f5592[i2], appendable.append(' '), c0414);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m9204(String str) {
        C8159.m26910(str);
        for (int i = 0; i < this.f5590; i++) {
            if (str.equals(this.f5591[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final int m9205(String str) {
        C8159.m26910(str);
        for (int i = 0; i < this.f5590; i++) {
            if (str.equalsIgnoreCase(this.f5591[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m9206() {
        for (int i = 0; i < this.f5590; i++) {
            if (!m9185(this.f5591[i])) {
                String[] strArr = this.f5591;
                strArr[i] = C6396.m2839(strArr[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public C3456 m9207(C3454 c3454) {
        C8159.m26910(c3454);
        m9208(c3454.getKey(), c3454.getValue());
        c3454.f5575 = this;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public C3456 m9208(String str, String str2) {
        C8159.m26910(str);
        int iM9204 = m9204(str);
        if (iM9204 != -1) {
            this.f5592[iM9204] = str2;
        } else {
            m9186(str, str2);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public C3456 m9209(String str, boolean z) {
        if (z) {
            m9210(str, null);
        } else {
            m9212(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m9210(String str, String str2) {
        int iM9205 = m9205(str);
        if (iM9205 == -1) {
            m9186(str, str2);
            return;
        }
        this.f5592[iM9205] = str2;
        if (this.f5591[iM9205].equals(str)) {
            return;
        }
        this.f5591[iM9205] = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m9211(int i) {
        C8159.m26901(i >= this.f5590);
        int i2 = (this.f5590 - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f5591;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.f5592;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.f5590 - 1;
        this.f5590 = i4;
        this.f5591[i4] = null;
        this.f5592[i4] = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m9212(String str) {
        int iM9204 = m9204(str);
        if (iM9204 != -1) {
            m9211(iM9204);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m9213(String str) {
        int iM9205 = m9205(str);
        if (iM9205 != -1) {
            m9211(iM9205);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public C7003.C1135 m9214(String str) {
        Map<String, C7003.C1135> mapM9197;
        C7003.C1135 c1135;
        return (!m9200(str) || (mapM9197 = m9197()) == null || (c1135 = mapM9197.get(str)) == null) ? C7003.C1135.f21147 : c1135;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public C3456 m9215(String str, Object obj) {
        C8159.m26910(str);
        m9217().put(str, obj);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public Object m9216(String str) {
        C8159.m26910(str);
        if (m9200(C7429.f2876)) {
            return m9217().get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public Map<String, Object> m9217() {
        int iM9204 = m9204(C7429.f2876);
        if (iM9204 != -1) {
            return (Map) this.f5592[iM9204];
        }
        HashMap map = new HashMap();
        m9188(C7429.f2876, map);
        return map;
    }
}
