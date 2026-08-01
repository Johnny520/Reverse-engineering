package p073f2;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Settings;
import p024b9.AbstractC1043k;
import p117i.C3037a0;
import p250r1.C6455e;

/* JADX INFO: renamed from: f2.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2245i {

    /* JADX INFO: renamed from: a */
    public long f6174a;

    /* JADX INFO: renamed from: b */
    public final SparseLongArray f6175b = new SparseLongArray();

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f6176c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public final List f6177d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final C3037a0 f6178e = new C3037a0(0, 1, null);

    /* JADX INFO: renamed from: f */
    public int f6179f = -1;

    /* JADX INFO: renamed from: g */
    public int f6180g = -1;

    /* JADX INFO: renamed from: a */
    public final void m8143a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f6175b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f6175b;
                long j10 = this.f6174a;
                this.f6174a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f6175b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f6175b;
            long j11 = this.f6174a;
            this.f6174a = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f6176c.put(pointerId2, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8144b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f6179f && source == this.f6180g) {
            return;
        }
        this.f6179f = toolType;
        this.f6180g = source;
        this.f6176c.clear();
        this.f6175b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p029c2.C1308a m8145c(android.view.MotionEvent r28, p029c2.AbstractC1311d r29) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073f2.C2245i.m8145c(android.view.MotionEvent, c2.d):c2.a");
    }

    /* JADX INFO: renamed from: d */
    public final C2240f0 m8146d(MotionEvent motionEvent, InterfaceC2266s0 interfaceC2266s0) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f6175b.clear();
            this.f6176c.clear();
            return null;
        }
        m8144b(motionEvent);
        m8143a(motionEvent);
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.f6176c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f6177d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.f6177d.add(m8147e(interfaceC2266s0, motionEvent, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        m8151i(motionEvent);
        return new C2240f0(motionEvent.getEventTime(), this.f6177d, motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final C2242g0 m8147e(InterfaceC2266s0 interfaceC2266s0, MotionEvent motionEvent, int i10, boolean z10) {
        long jMo8254q;
        long jM8178a;
        int i11;
        long jM8149g = m8149g(motionEvent.getPointerId(i10));
        float pressure = motionEvent.getPressure(i10);
        char c10 = ' ';
        long j10 = 4294967295L;
        long jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(motionEvent.getY(i10))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i10))) << 32));
        long jM25553g = C6455e.m25553g(jM25551e, 0.0f, 0.0f, 3, null);
        if (i10 == 0) {
            jM8178a = C6455e.m25551e((((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32));
            jMo8254q = interfaceC2266s0.mo8254q(jM8178a);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jM8178a = C2251l.f6184a.m8178a(motionEvent, i10);
            jMo8254q = interfaceC2266s0.mo8254q(jM8178a);
        } else {
            long jMo8253g = interfaceC2266s0.mo8253g(jM25551e);
            jMo8254q = jM25551e;
            jM8178a = jMo8253g;
        }
        int toolType = motionEvent.getToolType(i10);
        int iM8251e = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? AbstractC2264r0.f6219a.m8251e() : AbstractC2264r0.f6219a.m8247a() : AbstractC2264r0.f6219a.m8248b() : AbstractC2264r0.f6219a.m8249c() : AbstractC2264r0.f6219a.m8250d() : AbstractC2264r0.f6219a.m8251e();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i12 = 0;
        while (i12 < historySize) {
            float historicalX = motionEvent.getHistoricalX(i10, i12);
            float historicalY = motionEvent.getHistoricalY(i10, i12);
            char c11 = c10;
            long j11 = j10;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                i11 = i12;
            } else {
                long jM25551e2 = C6455e.m25551e((((long) Float.floatToRawIntBits(historicalX)) << c11) | (((long) Float.floatToRawIntBits(historicalY)) & j11));
                i11 = i12;
                arrayList.add(new C2235d(motionEvent.getHistoricalEventTime(i11), jM25551e2, jM25551e2, null));
            }
            i12 = i11 + 1;
            c10 = c11;
            j10 = j11;
        }
        return new C2242g0(jM8149g, motionEvent.getEventTime(), jM8178a, jMo8254q, z10, pressure, iM8251e, this.f6176c.get(motionEvent.getPointerId(i10), false), arrayList, motionEvent.getActionMasked() == 8 ? C6455e.m25551e((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j10) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c10)) : C6455e.f20314b.m25569c(), jM25553g, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m8148f(int i10) {
        this.f6176c.delete(i10);
        this.f6175b.delete(i10);
    }

    /* JADX INFO: renamed from: g */
    public final long m8149g(int i10) {
        long jValueAt;
        int iIndexOfKey = this.f6175b.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f6175b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f6174a;
            this.f6174a = 1 + jValueAt;
            this.f6175b.put(i10, jValueAt);
        }
        return AbstractC2234c0.m8063a(jValueAt);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8150h(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m8151i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f6176c.get(pointerId, false)) {
                this.f6175b.delete(pointerId);
                this.f6176c.delete(pointerId);
            }
        }
        if (this.f6175b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f6175b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f6175b.keyAt(size);
                if (!m8150h(motionEvent, iKeyAt)) {
                    this.f6175b.removeAt(size);
                    this.f6176c.delete(iKeyAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f2.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final C10080a f6181b = new C10080a(null);

        /* JADX INFO: renamed from: a */
        public final long f6182a;

        public /* synthetic */ a(long j10) {
            this.f6182a = j10;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a m8152a(long j10) {
            return new a(j10);
        }

        /* JADX INFO: renamed from: c */
        public static long m8154c(long j10, long j11, boolean z10) {
            return m8153b(((j10 & 2147483647L) << 1) | (z10 ? 1L : 0L) | (((long) f6181b.m8165d((short) Float.intBitsToFloat((int) (j11 >> 32)), (short) Float.intBitsToFloat((int) (j11 & 4294967295L)))) << 32));
        }

        /* JADX INFO: renamed from: d */
        public static boolean m8155d(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).m8161j();
        }

        /* JADX INFO: renamed from: e */
        public static final boolean m8156e(long j10) {
            return (j10 & 1) != 0;
        }

        /* JADX INFO: renamed from: f */
        public static final long m8157f(long j10) {
            int i10 = (int) (j10 >>> 32);
            C10080a c10080a = f6181b;
            float fM8166e = c10080a.m8166e(i10);
            return C6455e.m25551e((((long) Float.floatToRawIntBits(c10080a.m8167f(i10))) & 4294967295L) | (Float.floatToRawIntBits(fM8166e) << 32));
        }

        /* JADX INFO: renamed from: g */
        public static final long m8158g(long j10) {
            return (j10 >> 1) & 2147483647L;
        }

        /* JADX INFO: renamed from: h */
        public static int m8159h(long j10) {
            return Long.hashCode(j10);
        }

        /* JADX INFO: renamed from: i */
        public static String m8160i(long j10) {
            return "IndirectPointerEventData(packedValue=" + j10 + ')';
        }

        public boolean equals(Object obj) {
            return m8155d(this.f6182a, obj);
        }

        public int hashCode() {
            return m8159h(this.f6182a);
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ long m8161j() {
            return this.f6182a;
        }

        public String toString() {
            return m8160i(this.f6182a);
        }

        /* JADX INFO: renamed from: f2.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10080a {
            public /* synthetic */ C10080a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: d */
            public final int m8165d(short s10, short s11) {
                return (s10 << 16) | (s11 & 65535);
            }

            /* JADX INFO: renamed from: e */
            public final short m8166e(int i10) {
                return (short) (i10 >>> 16);
            }

            /* JADX INFO: renamed from: f */
            public final short m8167f(int i10) {
                return (short) (i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }

            public C10080a() {
            }
        }

        /* JADX INFO: renamed from: b */
        public static long m8153b(long j10) {
            return j10;
        }
    }
}
