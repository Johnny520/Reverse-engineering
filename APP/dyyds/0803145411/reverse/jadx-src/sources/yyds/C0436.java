package yyds;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import yyds.C1787;

/* JADX INFO: renamed from: yyds.ᛲᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0436 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final List f2210;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final C0436 f2211;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final C2133 f2214;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final C2556 f2215;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C0738 f2216 = C0738.f3427;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final int f2212 = 1;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final int f2217 = 1;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final int f2213 = 2;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2175 f2221 = C2175.f10659;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int f2223 = f2212;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final HashMap f2222 = new HashMap();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f2224 = new ArrayList();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ArrayList f2226 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C0738 f2220 = f2216;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f2218 = f2217;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f2219 = f2213;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final ArrayDeque f2225 = new ArrayDeque();

    static {
        C2133 c2133 = new C2133(Collections.EMPTY_MAP, 17, Collections.EMPTY_LIST);
        f2214 = c2133;
        C2556 c2556 = new C2556(c2133);
        f2215 = c2556;
        C0436 c0436 = new C0436();
        f2211 = c0436;
        f2210 = c0436.m1226(c2133, c2556);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static List m1225(AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (abstractCollection.size() == 1) {
            return Collections.singletonList(abstractCollection instanceof List ? ((List) abstractCollection).get(0) : abstractCollection.iterator().next());
        }
        return Collections.unmodifiableList(Arrays.asList(abstractCollection.toArray()));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final List m1226(C2133 c2133, C2556 c2556) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC0193.f1141);
        int i = this.f2218;
        int i2 = 1;
        arrayList.add(i == 1 ? C2506.f12335 : new C1361(i));
        arrayList.add(this.f2221);
        ArrayList arrayList2 = this.f2224;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Collections.reverse(arrayList3);
            arrayList.addAll(arrayList3);
        }
        ArrayList arrayList4 = this.f2226;
        if (!arrayList4.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(arrayList4);
            Collections.reverse(arrayList5);
            arrayList.addAll(arrayList5);
        }
        List list = AbstractC0361.f1875;
        arrayList.add(AbstractC0193.f1131);
        arrayList.add(AbstractC0193.f1136);
        arrayList.add(AbstractC0193.f1147);
        arrayList.add(AbstractC0193.f1126);
        arrayList.add(AbstractC0193.f1146);
        C1674 c1674 = AbstractC0193.f1139;
        arrayList.add(new C2193(Long.TYPE, Long.class, c1674));
        arrayList.add(new C2193(Double.TYPE, Double.class, AbstractC0193.f1123));
        arrayList.add(new C2193(Float.TYPE, Float.class, AbstractC0193.f1140));
        int i3 = 0;
        int i4 = this.f2219;
        arrayList.add(i4 == 2 ? C0321.f1695 : new C0876(new C0321(i4), i3));
        arrayList.add(AbstractC0193.f1122);
        arrayList.add(AbstractC0193.f1125);
        arrayList.add(new C1484(AtomicLong.class, new C1233(c1674, 1).m4828(), i3));
        arrayList.add(new C1484(AtomicLongArray.class, new C1233(c1674, 0).m4828(), i3));
        arrayList.add(AbstractC0193.f1142);
        arrayList.add(AbstractC0193.f1121);
        arrayList.add(AbstractC0193.f1143);
        arrayList.add(AbstractC0193.f1129);
        arrayList.add(AbstractC0193.f1130);
        arrayList.add(AbstractC0193.f1145);
        arrayList.add(AbstractC0193.f1135);
        arrayList.add(AbstractC0193.f1138);
        arrayList.add(AbstractC0193.f1137);
        arrayList.add(AbstractC0193.f1127);
        arrayList.add(AbstractC0193.f1148);
        arrayList.add(AbstractC0193.f1124);
        arrayList.add(AbstractC0193.f1134);
        arrayList.add(AbstractC0193.f1132);
        arrayList.add(C2557.f12627);
        arrayList.add(AbstractC0193.f1133);
        C1787.C1789 c1789 = null;
        try {
            C2392 c2392 = C1787.f9026;
            ((C1787) ((InterfaceC0248) C1787.class.getDeclaredConstructor(null).newInstance(null))).getClass();
            c1789 = C1787.f9029;
        } catch (LinkageError | ReflectiveOperationException unused) {
        }
        if (c1789 != null) {
            arrayList.add(c1789);
        }
        arrayList.addAll(AbstractC0361.f1875);
        arrayList.add(C1425.f6736);
        arrayList.add(AbstractC0193.f1128);
        arrayList.add(new C1005(c2133, i3));
        arrayList.add(new C1005(c2133, i2));
        arrayList.add(c2556);
        arrayList.add(AbstractC0193.f1120);
        arrayList.add(new C0799(c2133, this.f2223, this.f2221, c2556, m1225(this.f2225)));
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }
}
