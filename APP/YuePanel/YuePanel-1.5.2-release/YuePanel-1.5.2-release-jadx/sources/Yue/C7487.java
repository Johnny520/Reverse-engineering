package Yue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7487 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ۟$ۥ */
    @InterfaceC4313(m1272c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m1273f = "SlidingWindow.kt", m1274i = {0, 0, 0, 2, 2, 3, 3}, m1275l = {34, 40, 49, 55, 58}, m1276m = "invokeSuspend", m1277n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, m1278s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class C1275<T> extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super List<? extends T>>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22655;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f22656;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f22657;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f22658;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public /* synthetic */ Object f22659;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ int f22660;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ int f22661;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final /* synthetic */ Iterator<T> f22662;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final /* synthetic */ boolean f22663;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public final /* synthetic */ boolean f22664;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Iterator<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1275(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, InterfaceC4199<? super C1275> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22660 = i;
            this.f22661 = i2;
            this.f22662 = it;
            this.f22663 = z;
            this.f22664 = z2;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C1275 c1275 = new C1275(this.f22660, this.f22661, this.f22662, this.f22663, this.f22664, interfaceC4199);
            c1275.f22659 = obj;
            return c1275;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0118 -> B:59:0x011b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0146 -> B:72:0x0149). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            C7177 c7177;
            Iterator<T> it;
            AbstractC7328 abstractC7328;
            AbstractC7328 abstractC73282;
            int i;
            ArrayList arrayList;
            Iterator<T> it2;
            int i2;
            C7177 c71772;
            AbstractC7328 abstractC73283;
            Object objM17142 = C5508.m17142();
            int i3 = this.f22658;
            if (i3 == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC73284 = (AbstractC7328) this.f22659;
                int iM21668 = C7007.m21668(this.f22660, 1024);
                int i4 = this.f22661 - this.f22660;
                if (i4 < 0) {
                    c7177 = new C7177(iM21668);
                    it = this.f22662;
                    abstractC7328 = abstractC73284;
                    while (it.hasNext()) {
                    }
                    if (this.f22664) {
                    }
                    return C8107.f3222;
                }
                abstractC73282 = abstractC73284;
                i = 0;
                arrayList = new ArrayList(iM21668);
                it2 = this.f22662;
                i2 = i4;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                    this.f22659 = null;
                    this.f22655 = null;
                    this.f22656 = null;
                    this.f22658 = 2;
                    if (abstractC73282.mo3574(arrayList, this) == objM17142) {
                    }
                }
                return C8107.f3222;
            }
            if (i3 == 1) {
                i2 = this.f22657;
                it2 = (Iterator) this.f22656;
                arrayList = (ArrayList) this.f22655;
                abstractC73282 = (AbstractC7328) this.f22659;
                C7149.m22422(obj);
                i = i2;
                if (this.f22663) {
                    arrayList = new ArrayList(this.f22660);
                } else {
                    arrayList.clear();
                }
                i2 = i;
                while (it2.hasNext()) {
                    T next = it2.next();
                    if (i > 0) {
                        i--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == this.f22660) {
                            this.f22659 = abstractC73282;
                            this.f22655 = arrayList;
                            this.f22656 = it2;
                            this.f22657 = i2;
                            this.f22658 = 1;
                            if (abstractC73282.mo3574(arrayList, this) == objM17142) {
                                return objM17142;
                            }
                            i = i2;
                            if (this.f22663) {
                            }
                            i2 = i;
                            while (it2.hasNext()) {
                            }
                        }
                    }
                }
                if ((!arrayList.isEmpty()) && (this.f22664 || arrayList.size() == this.f22660)) {
                    this.f22659 = null;
                    this.f22655 = null;
                    this.f22656 = null;
                    this.f22658 = 2;
                    if (abstractC73282.mo3574(arrayList, this) == objM17142) {
                        return objM17142;
                    }
                }
                return C8107.f3222;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    it = (Iterator) this.f22656;
                    c7177 = (C7177) this.f22655;
                    abstractC7328 = (AbstractC7328) this.f22659;
                    C7149.m22422(obj);
                    c7177.m22458(this.f22661);
                    while (it.hasNext()) {
                        c7177.m22454(it.next());
                        if (c7177.m22457()) {
                            int size = c7177.size();
                            int i5 = this.f22660;
                            if (size >= i5) {
                                RandomAccess arrayList2 = this.f22663 ? c7177 : new ArrayList(c7177);
                                this.f22659 = abstractC7328;
                                this.f22655 = c7177;
                                this.f22656 = it;
                                this.f22658 = 3;
                                if (abstractC7328.mo3574(arrayList2, this) == objM17142) {
                                    return objM17142;
                                }
                                c7177.m22458(this.f22661);
                                while (it.hasNext()) {
                                }
                            } else {
                                c7177 = c7177.m22455(i5);
                            }
                        }
                    }
                    if (this.f22664) {
                        c71772 = c7177;
                        abstractC73283 = abstractC7328;
                        if (c71772.size() <= this.f22661) {
                        }
                    }
                    return C8107.f3222;
                }
                if (i3 == 4) {
                    c71772 = (C7177) this.f22655;
                    abstractC73283 = (AbstractC7328) this.f22659;
                    C7149.m22422(obj);
                    c71772.m22458(this.f22661);
                    if (c71772.size() <= this.f22661) {
                        RandomAccess arrayList3 = this.f22663 ? c71772 : new ArrayList(c71772);
                        this.f22659 = abstractC73283;
                        this.f22655 = c71772;
                        this.f22656 = null;
                        this.f22658 = 4;
                        if (abstractC73283.mo3574(arrayList3, this) == objM17142) {
                            return objM17142;
                        }
                        c71772.m22458(this.f22661);
                        if (c71772.size() <= this.f22661) {
                            if (!c71772.isEmpty()) {
                                this.f22659 = null;
                                this.f22655 = null;
                                this.f22656 = null;
                                this.f22658 = 5;
                                if (abstractC73283.mo3574(c71772, this) == objM17142) {
                                    return objM17142;
                                }
                            }
                            return C8107.f3222;
                        }
                    }
                } else if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C7149.m22422(obj);
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super List<? extends T>> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C1275) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ۟$ۥ۟ */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    public static final class C1276<T> implements InterfaceC7326<List<? extends T>> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC7326 f2910;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ int f2911;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ int f22665;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ boolean f22666;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ boolean f22667;

        public C1276(InterfaceC7326 interfaceC7326, int i, int i2, boolean z, boolean z2) {
            this.f2910 = interfaceC7326;
            this.f2911 = i;
            this.f22665 = i2;
            this.f22666 = z;
            this.f22667 = z2;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<List<? extends T>> iterator() {
            return C7487.m3681(this.f2910.iterator(), this.f2911, this.f22665, this.f22666, this.f22667);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final void m3680(int i, int i2) {
        String str;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> Iterator<List<T>> m3681(@InterfaceC6399 Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        C5499.m17103(it, "iterator");
        return !it.hasNext() ? C4631.f9943 : C7330.m3576(new C1275(i, i2, it, z2, z, null));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC7326<List<T>> m23442(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i, int i2, boolean z, boolean z2) {
        C5499.m17103(interfaceC7326, "<this>");
        m3680(i, i2);
        return new C1276(interfaceC7326, i, i2, z, z2);
    }
}
