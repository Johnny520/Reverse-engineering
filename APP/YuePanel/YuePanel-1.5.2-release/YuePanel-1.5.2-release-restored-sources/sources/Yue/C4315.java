package Yue;

import Yue.C7148;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4315 {
    private static volatile int installations = 0;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C4315 f820;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final String f821 = "Coroutine creation stacktrace";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final SimpleDateFormat f8857;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public static Thread f8858;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C4080<C0380<?>, Boolean> f8859;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final /* synthetic */ C4322 f8860;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f8861;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final ReentrantReadWriteLock f8862;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean f8863;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean f8864;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public static final InterfaceC5124<Boolean, C8107> f8865;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C4080<InterfaceC4246, C4310> f8866;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ */
    public static final class C0380<T> implements InterfaceC4199<T>, InterfaceC4246 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC4199<T> f8867;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final C4310 f8868;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6489
        public final InterfaceC4246 f8869;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0380(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199, @InterfaceC6399 C4310 c4310, @InterfaceC6489 InterfaceC4246 interfaceC4246) {
            this.f8867 = interfaceC4199;
            this.f8868 = c4310;
            this.f8869 = interfaceC4246;
        }

        @Override // Yue.InterfaceC4246
        @InterfaceC6489
        public InterfaceC4246 getCallerFrame() {
            InterfaceC4246 interfaceC4246 = this.f8869;
            if (interfaceC4246 != null) {
                return interfaceC4246.getCallerFrame();
            }
            return null;
        }

        @Override // Yue.InterfaceC4199
        @InterfaceC6399
        public InterfaceC4225 getContext() {
            return this.f8867.getContext();
        }

        @Override // Yue.InterfaceC4246
        @InterfaceC6489
        public StackTraceElement getStackTraceElement() {
            InterfaceC4246 interfaceC4246 = this.f8869;
            if (interfaceC4246 != null) {
                return interfaceC4246.getStackTraceElement();
            }
            return null;
        }

        @Override // Yue.InterfaceC4199
        public void resumeWith(@InterfaceC6399 Object obj) {
            C4315.f820.m12492(this);
            this.f8867.resumeWith(obj);
        }

        @InterfaceC6399
        public String toString() {
            return this.f8867.toString();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟ */
    public static final class C0381 extends AbstractC5673 implements InterfaceC5124<C0380<?>, C4309> {
        public C0381() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C4309 invoke(@InterfaceC6399 C0380<?> c0380) {
            InterfaceC4225 interfaceC4225M12447;
            if (C4315.f820.m12486(c0380) || (interfaceC4225M12447 = c0380.f8868.m12447()) == null) {
                return null;
            }
            return new C4309(c0380.f8868, interfaceC4225M12447);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟, reason: contains not printable characters */
    public static final class C4316<R> extends AbstractC5673 implements InterfaceC5124<C0380<?>, R> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<C0380<?>, InterfaceC4225, R> f8870;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥ۟ۨۤ۟$ۥ<?>, ? super Yue.ۥ۟ۧۦۥ, ? extends R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4316(InterfaceC5138<? super C0380<?>, ? super InterfaceC4225, ? extends R> interfaceC5138) {
            super(1);
            this.f8870 = interfaceC5138;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final R invoke(@InterfaceC6399 C0380<?> c0380) {
            InterfaceC4225 interfaceC4225M12447;
            if (C4315.f820.m12486(c0380) || (interfaceC4225M12447 = c0380.f8868.m12447()) == null) {
                return null;
            }
            return this.f8870.invoke(c0380, interfaceC4225M12447);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4317<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C4033.m11389(Long.valueOf(((C0380) t).f8868.f814), Long.valueOf(((C0380) t2).f8868.f814));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4318 extends AbstractC5673 implements InterfaceC5124<C0380<?>, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C4318 f8871 = new C4318();

        public C4318() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6399 C0380<?> c0380) {
            return Boolean.valueOf(!C4315.f820.m12486(c0380));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C4319<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C4033.m11389(Long.valueOf(((C0380) t).f8868.f814), Long.valueOf(((C0380) t2).f8868.f814));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C4320 extends AbstractC5673 implements InterfaceC5124<C0380<?>, C4327> {
        public C4320() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C4327 invoke(@InterfaceC6399 C0380<?> c0380) {
            InterfaceC4225 interfaceC4225M12447;
            if (C4315.f820.m12486(c0380) || (interfaceC4225M12447 = c0380.f8868.m12447()) == null) {
                return null;
            }
            return new C4327(c0380.f8868, interfaceC4225M12447);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C4321 extends AbstractC5673 implements InterfaceC5122<C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C4321 f8872 = new C4321();

        public C4321() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C4315.f8866.m11531();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Yue.ۥ۟ۨۤ۠] */
    static {
        C4315 c4315 = new C4315();
        f820 = c4315;
        f8857 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f8859 = new C4080<>(false, 1, null);
        final long j = 0;
        f8860 = new Object(j) { // from class: Yue.ۥ۟ۨۤ۠
            volatile long sequenceNumber;

            {
                this.sequenceNumber = j;
            }
        };
        f8862 = new ReentrantReadWriteLock();
        f8863 = true;
        f8864 = true;
        f8865 = c4315.m12481();
        f8866 = new C4080<>(true);
        f8861 = AtomicLongFieldUpdater.newUpdater(C4322.class, "sequenceNumber");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m12465(InterfaceC5542 interfaceC5542) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m12466(InterfaceC5542 interfaceC5542, Map<InterfaceC5542, C4310> map, StringBuilder sb, String str) {
        C4310 c4310 = map.get(interfaceC5542);
        if (c4310 != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) C3888.m10891(c4310.m12452());
            sb.append(str + m12480(interfaceC5542) + ", continuation is " + c4310.m12451() + " at line " + stackTraceElement + '\n');
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('\t');
            str = sb2.toString();
        } else if (!(interfaceC5542 instanceof C7242)) {
            sb.append(str + m12480(interfaceC5542) + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        }
        Iterator<InterfaceC5542> it = interfaceC5542.mo17159().iterator();
        while (it.hasNext()) {
            m12466(it.next(), map, sb, str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final <T> InterfaceC4199<T> m12467(InterfaceC4199<? super T> interfaceC4199, C7564 c7564) {
        if (!m12487()) {
            return interfaceC4199;
        }
        C0380<?> c0380 = new C0380<>(interfaceC4199, new C4310(interfaceC4199.getContext(), c7564, f8861.incrementAndGet(f8860)), c7564);
        C4080<C0380<?>, Boolean> c4080 = f8859;
        c4080.put(c0380, Boolean.TRUE);
        if (!m12487()) {
            c4080.clear();
        }
        return c0380;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m12468(@InterfaceC6399 PrintStream printStream) {
        synchronized (printStream) {
            f820.m12472(printStream);
            C8107 c8107 = C8107.f3222;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final List<C4309> m12469() {
        ReentrantReadWriteLock reentrantReadWriteLock = f8862;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            C4315 c4315 = f820;
            if (c4315.m12487()) {
                return C7342.m23081(C7342.m22990(C7342.m23063(C3888.m10833(c4315.m12479()), new C4317()), new C0381()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Object[] m12470() {
        String strM12188;
        List<C4309> listM12469 = m12469();
        int size = listM12469.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (C4309 c4309 : listM12469) {
            InterfaceC4225 interfaceC4225M1266 = c4309.m1266();
            C4238 c4238 = (C4238) interfaceC4225M1266.get(C4238.f8592);
            Long lValueOf = null;
            String strM12503 = (c4238 == null || (strM12188 = c4238.m12188()) == null) ? null : m12503(strM12188);
            AbstractC4232 abstractC4232 = (AbstractC4232) interfaceC4225M1266.get(AbstractC4232.Key);
            String strM125032 = abstractC4232 != null ? m12503(abstractC4232) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(strM12503);
            sb.append(",\n                    \"id\": ");
            C4237 c4237 = (C4237) interfaceC4225M1266.get(C4237.f8590);
            if (c4237 != null) {
                lValueOf = Long.valueOf(c4237.m12182());
            }
            sb.append(lValueOf);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(strM125032);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(c4309.m12444());
            sb.append(",\n                    \"state\": \"");
            sb.append(c4309.m12445());
            sb.append("\"\n                } \n                ");
            arrayList3.add(C7619.m23846(sb.toString()));
            arrayList2.add(c4309.m12442());
            arrayList.add(c4309.m12443());
        }
        String str = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + C3888.m10923(arrayList3, null, null, null, 0, null, null, 63, null) + ']';
        Object[] array = arrayList.toArray(new Thread[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Object[] array2 = arrayList2.toArray(new InterfaceC4246[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Object[] array3 = listM12469.toArray(new C4309[0]);
        if (array3 != null) {
            return new Object[]{str, array, array2, array3};
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final <R> List<R> m12471(InterfaceC5138<? super C0380<?>, ? super InterfaceC4225, ? extends R> interfaceC5138) {
        ReentrantReadWriteLock reentrantReadWriteLock = f8862;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            C4315 c4315 = f820;
            if (c4315.m12487()) {
                return C7342.m23081(C7342.m22990(C7342.m23063(C3888.m10833(c4315.m12479()), new C4317()), new C4316(interfaceC5138)));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            C5437.m16930(1);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m12472(PrintStream printStream) {
        ReentrantReadWriteLock reentrantReadWriteLock = f8862;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            C4315 c4315 = f820;
            if (!c4315.m12487()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            printStream.print("Coroutines dump " + f8857.format(Long.valueOf(System.currentTimeMillis())));
            for (C0380 c0380 : C7342.m23063(C7342.m22938(C3888.m10833(c4315.m12479()), C4318.f8871), new C4319())) {
                C4310 c4310 = c0380.f8868;
                List<StackTraceElement> listM12452 = c4310.m12452();
                C4315 c43152 = f820;
                List<StackTraceElement> listM12476 = c43152.m12476(c4310.m12451(), c4310.f8837, listM12452);
                printStream.print("\n\nCoroutine " + c0380.f8867 + ", state: " + ((C5499.m17094(c4310.m12451(), C4311.f816) && listM12476 == listM12452) ? c4310.m12451() + " (Last suspension stacktrace, not an actual stacktrace)" : c4310.m12451()));
                if (listM12452.isEmpty()) {
                    printStream.print("\n\tat " + C7565.m23675(f821));
                    c43152.m12491(printStream, c4310.m12449());
                } else {
                    c43152.m12491(printStream, listM12476);
                }
            }
            C8107 c8107 = C8107.f3222;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final List<C4327> m12473() {
        ReentrantReadWriteLock reentrantReadWriteLock = f8862;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            C4315 c4315 = f820;
            if (c4315.m12487()) {
                return C7342.m23081(C7342.m22990(C7342.m23063(C3888.m10833(c4315.m12479()), new C4317()), new C4320()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final List<StackTraceElement> m12474(@InterfaceC6399 C4309 c4309, @InterfaceC6399 List<StackTraceElement> list) {
        return m12476(c4309.m12445(), c4309.m12443(), list);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final String m12475(@InterfaceC6399 C4309 c4309) {
        List<StackTraceElement> listM12474 = m12474(c4309, c4309.m12446());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listM12474) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? m12503(fileName) : null);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(C7619.m23846(sb.toString()));
        }
        return TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + C3888.m10923(arrayList, null, null, null, 0, null, null, 63, null) + ']';
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final List<StackTraceElement> m12476(String str, Thread thread, List<StackTraceElement> list) {
        Object objM3438;
        if (!C5499.m17094(str, C4311.f816) || thread == null) {
            return list;
        }
        try {
            C7148.C1189 c1189 = C7148.f21560;
            objM3438 = C7148.m3438(thread.getStackTrace());
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        if (C7148.m22407(objM3438)) {
            objM3438 = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objM3438;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (C5499.m17094(stackTraceElement.getClassName(), C7565.f2946) && C5499.m17094(stackTraceElement.getMethodName(), "resumeWith") && C5499.m17094(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i++;
        }
        C6599<Integer, Integer> c6599M12477 = m12477(i, stackTraceElementArr, list);
        int iIntValue = c6599M12477.m3062().intValue();
        int iIntValue2 = c6599M12477.m3063().intValue();
        if (iIntValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i) - iIntValue) - 1) - iIntValue2);
        int i2 = i - iIntValue2;
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(stackTraceElementArr[i3]);
        }
        int size = list.size();
        for (int i4 = iIntValue + 1; i4 < size; i4++) {
            arrayList.add(list.get(i4));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final C6599<Integer, Integer> m12477(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i2 = 0; i2 < 3; i2++) {
            int iM12478 = f820.m12478((i - 1) - i2, stackTraceElementArr, list);
            if (iM12478 != -1) {
                return C8003.m4014(Integer.valueOf(iM12478), Integer.valueOf(i2));
            }
        }
        return C8003.m4014(-1, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int m12478(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) C3411.m7895(stackTraceElementArr, i);
        if (stackTraceElement == null) {
            return -1;
        }
        int i2 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (C5499.m17094(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && C5499.m17094(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && C5499.m17094(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final Set<C0380<?>> m12479() {
        return f8859.keySet();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final String m12480(InterfaceC5542 interfaceC5542) {
        return interfaceC5542 instanceof C5557 ? ((C5557) interfaceC5542).m17298() : interfaceC5542.toString();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final InterfaceC5124<Boolean, C8107> m12481() {
        Object objM3438;
        Object objNewInstance;
        try {
            C7148.C1189 c1189 = C7148.f21560;
            objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        if (objNewInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
        }
        objM3438 = C7148.m3438((InterfaceC5124) C8012.m25265(objNewInstance, 1));
        return (InterfaceC5124) (C7148.m22407(objM3438) ? null : objM3438);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m12482() {
        return f8864;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m12483() {
        return f8863;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final String m12484(@InterfaceC6399 InterfaceC5542 interfaceC5542) {
        ReentrantReadWriteLock reentrantReadWriteLock = f8862;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            C4315 c4315 = f820;
            if (!c4315.m12487()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            Set<C0380<?>> setM12479 = c4315.m12479();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setM12479) {
                if (((C0380) obj).f8867.getContext().get(InterfaceC5542.f13507) != null) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(C3881.m10756(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(C5553.m17213(((C0380) obj2).f8867.getContext()), ((C0380) obj2).f8868);
            }
            StringBuilder sb = new StringBuilder();
            f820.m12466(interfaceC5542, linkedHashMap, sb, "");
            String string = sb.toString();
            C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return string;
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m12485() {
        ReentrantReadWriteLock reentrantReadWriteLock = f8862;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            installations++;
            if (installations > 1) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            f820.m12500();
            if (C3177.f111.m248()) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            InterfaceC5124<Boolean, C8107> interfaceC5124 = f8865;
            if (interfaceC5124 != null) {
                interfaceC5124.invoke(Boolean.TRUE);
            }
            C8107 c8107 = C8107.f3222;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean m12486(C0380<?> c0380) {
        InterfaceC5542 interfaceC5542;
        InterfaceC4225 interfaceC4225M12447 = c0380.f8868.m12447();
        if (interfaceC4225M12447 == null || (interfaceC5542 = (InterfaceC5542) interfaceC4225M12447.get(InterfaceC5542.f13507)) == null || !interfaceC5542.mo17157()) {
            return false;
        }
        f8859.remove(c0380);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m12487() {
        return installations > 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m12488(StackTraceElement stackTraceElement) {
        return C7627.m24008(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final C0380<?> m12489(InterfaceC4199<?> interfaceC4199) {
        InterfaceC4246 interfaceC4246 = interfaceC4199 instanceof InterfaceC4246 ? (InterfaceC4246) interfaceC4199 : null;
        if (interfaceC4246 != null) {
            return m12490(interfaceC4246);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final C0380<?> m12490(InterfaceC4246 interfaceC4246) {
        while (!(interfaceC4246 instanceof C0380)) {
            interfaceC4246 = interfaceC4246.getCallerFrame();
            if (interfaceC4246 == null) {
                return null;
            }
        }
        return (C0380) interfaceC4246;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m12491(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m12492(C0380<?> c0380) {
        InterfaceC4246 interfaceC4246M12496;
        f8859.remove(c0380);
        InterfaceC4246 interfaceC4246M12450 = c0380.f8868.m12450();
        if (interfaceC4246M12450 == null || (interfaceC4246M12496 = m12496(interfaceC4246M12450)) == null) {
            return;
        }
        f8866.remove(interfaceC4246M12496);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final <T> InterfaceC4199<T> m12493(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        if (m12487() && m12489(interfaceC4199) == null) {
            return m12467(interfaceC4199, f8864 ? m12502(m12497(new Exception())) : null);
        }
        return interfaceC4199;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m12494(@InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        m12506(interfaceC4199, C4311.f816);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m12495(@InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        m12506(interfaceC4199, C4311.f8849);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final InterfaceC4246 m12496(InterfaceC4246 interfaceC4246) {
        do {
            interfaceC4246 = interfaceC4246.getCallerFrame();
            if (interfaceC4246 == null) {
                return null;
            }
        } while (interfaceC4246.getStackTraceElement() == null);
        return interfaceC4246;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final <T extends Throwable> List<StackTraceElement> m12497(T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (C5499.m17094(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length2 = i2;
            }
        }
        if (!f8863) {
            int i3 = length - i;
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 < i3) {
                arrayList.add(i4 == 0 ? C7565.m23675(f821) : stackTrace[i4 + i]);
                i4++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i) + 1);
        arrayList2.add(C7565.m23675(f821));
        while (true) {
            i++;
            while (i < length) {
                if (m12488(stackTrace[i])) {
                    arrayList2.add(stackTrace[i]);
                    int i5 = i + 1;
                    while (i5 < length && m12488(stackTrace[i5])) {
                        i5++;
                    }
                    int i6 = i5 - 1;
                    int i7 = i6;
                    while (i7 > i && stackTrace[i7].getFileName() == null) {
                        i7--;
                    }
                    if (i7 > i && i7 < i6) {
                        arrayList2.add(stackTrace[i7]);
                    }
                    arrayList2.add(stackTrace[i6]);
                    i = i5;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i]);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m12498(boolean z) {
        f8864 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m12499(boolean z) {
        f8863 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m12500() {
        f8858 = C7789.m24747(false, true, null, "Coroutines Debugger Cleaner", 0, C4321.f8872, 21, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m12501() throws InterruptedException {
        Thread thread = f8858;
        if (thread == null) {
            return;
        }
        f8858 = null;
        thread.interrupt();
        thread.join();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final C7564 m12502(List<StackTraceElement> list) {
        C7564 c7564 = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c7564 = new C7564(c7564, listIterator.previous());
            }
        }
        return c7564;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:char:SGET), r3v0, (wrap:char:SGET) */
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final String m12503(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(C8039.f3212);
        sb.append(obj);
        sb.append(C8039.f3212);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m12504() {
        ReentrantReadWriteLock reentrantReadWriteLock = f8862;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            C4315 c4315 = f820;
            if (!c4315.m12487()) {
                throw new IllegalStateException("Agent was not installed".toString());
            }
            installations--;
            if (installations != 0) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            c4315.m12501();
            f8859.clear();
            f8866.clear();
            if (C3177.f111.m248()) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            InterfaceC5124<Boolean, C8107> interfaceC5124 = f8865;
            if (interfaceC5124 != null) {
                interfaceC5124.invoke(Boolean.FALSE);
            }
            C8107 c8107 = C8107.f3222;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m12505(InterfaceC4246 interfaceC4246, String str) {
        ReentrantReadWriteLock.ReadLock lock = f8862.readLock();
        lock.lock();
        try {
            C4315 c4315 = f820;
            if (!c4315.m12487()) {
                lock.unlock();
                return;
            }
            C4080<InterfaceC4246, C4310> c4080 = f8866;
            C4310 c4310Remove = c4080.remove(interfaceC4246);
            if (c4310Remove == null) {
                C0380<?> c0380M12490 = c4315.m12490(interfaceC4246);
                if (c0380M12490 != null && (c4310Remove = c0380M12490.f8868) != null) {
                    InterfaceC4246 interfaceC4246M12450 = c4310Remove.m12450();
                    InterfaceC4246 interfaceC4246M12496 = interfaceC4246M12450 != null ? c4315.m12496(interfaceC4246M12450) : null;
                    if (interfaceC4246M12496 != null) {
                        c4080.remove(interfaceC4246M12496);
                    }
                }
                return;
            }
            c4310Remove.m12454(str, (InterfaceC4199) interfaceC4246);
            InterfaceC4246 interfaceC4246M124962 = c4315.m12496(interfaceC4246);
            if (interfaceC4246M124962 == null) {
                lock.unlock();
                return;
            }
            c4080.put(interfaceC4246M124962, c4310Remove);
            C8107 c8107 = C8107.f3222;
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final void m12506(InterfaceC4199<?> interfaceC4199, String str) {
        if (m12487()) {
            if (C5499.m17094(str, C4311.f816) && C5671.f13972.m17577(1, 3, 30)) {
                InterfaceC4246 interfaceC4246 = interfaceC4199 instanceof InterfaceC4246 ? (InterfaceC4246) interfaceC4199 : null;
                if (interfaceC4246 == null) {
                    return;
                }
                m12505(interfaceC4246, str);
                return;
            }
            C0380<?> c0380M12489 = m12489(interfaceC4199);
            if (c0380M12489 == null) {
                return;
            }
            m12507(c0380M12489, interfaceC4199, str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m12507(C0380<?> c0380, InterfaceC4199<?> interfaceC4199, String str) {
        ReentrantReadWriteLock.ReadLock lock = f8862.readLock();
        lock.lock();
        try {
            if (f820.m12487()) {
                c0380.f8868.m12454(str, interfaceC4199);
                C8107 c8107 = C8107.f3222;
            }
        } finally {
            lock.unlock();
        }
    }
}
