package p000;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ag0 {

    /* JADX INFO: renamed from: a */
    public long f157a;

    /* JADX INFO: renamed from: b */
    public final SparseLongArray f158b = new SparseLongArray();

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f159c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public final ArrayList f160d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ub0 f161e = new ub0();

    /* JADX INFO: renamed from: f */
    public int f162f = -1;

    /* JADX INFO: renamed from: g */
    public int f163g = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m168a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f158b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.f157a;
                this.f157a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.f157a;
            this.f157a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f159c.put(pointerId2, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m169b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f162f && source == this.f163g) {
            return;
        }
        this.f162f = toolType;
        this.f163g = source;
        this.f159c.clear();
        this.f158b.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0111d m170c(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        long jValueAt;
        long jFloatToRawIntBits;
        long jM4847D;
        int i;
        int historySize;
        int i2;
        ArrayList arrayList;
        long jFloatToRawIntBits2;
        int i3;
        char c;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f158b;
        SparseBooleanArray sparseBooleanArray = this.f159c;
        int i4 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        m169b(motionEvent);
        m168a(motionEvent);
        boolean z3 = true;
        boolean z4 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z5 = actionMasked == 8;
        if (z4) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList2 = this.f160d;
        arrayList2.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i5 = 0;
        while (i5 < pointerCount) {
            boolean z6 = (z4 || i5 == actionIndex || (z5 && motionEvent.getButtonState() == 0)) ? false : z3;
            int pointerId = motionEvent.getPointerId(i5);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                z = z4;
                z2 = z5;
            } else {
                z = z4;
                long j = this.f157a;
                z2 = z5;
                this.f157a = j + 1;
                sparseLongArray.put(pointerId, j);
                jValueAt = j;
            }
            float pressure = motionEvent.getPressure(i5);
            char c2 = ' ';
            long jM2930a = ok0.m2930a(i4, (((long) Float.floatToRawIntBits(motionEvent.getY(i5))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i5))) << 32));
            if (i5 == 0) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                jM4847D = viewTreeObserverOnGlobalLayoutListenerC0875w3.m4847D(jFloatToRawIntBits);
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawY(i5))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(i5))) << 32);
                jM4847D = viewTreeObserverOnGlobalLayoutListenerC0875w3.m4847D(jFloatToRawIntBits);
            }
            long j2 = jFloatToRawIntBits;
            long j3 = jM4847D;
            int toolType = motionEvent.getToolType(i5);
            if (toolType != 0) {
                if (toolType == 1) {
                    i = 1;
                } else if (toolType == 2) {
                    i = i4;
                } else if (toolType == i4) {
                    i = 2;
                } else if (toolType == 4) {
                    i = 4;
                }
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i2 = 0;
                while (i2 < historySize) {
                    float historicalX = motionEvent.getHistoricalX(i5, i2);
                    float historicalY = motionEvent.getHistoricalY(i5, i2);
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                        i3 = i2;
                        c = c2;
                    } else {
                        long jFloatToRawIntBits3 = Float.floatToRawIntBits(historicalX);
                        int iFloatToRawIntBits = Float.floatToRawIntBits(historicalY);
                        c = c2;
                        long j4 = (jFloatToRawIntBits3 << c) | (((long) iFloatToRawIntBits) & 4294967295L);
                        i3 = i2;
                        arrayList3.add(new C0448ly(motionEvent.getHistoricalEventTime(i3), j4, j4));
                    }
                    i2 = i3 + 1;
                    c2 = c;
                }
                char c3 = c2;
                if (motionEvent.getActionMasked() != 8) {
                    arrayList = arrayList3;
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c3) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L);
                } else {
                    arrayList = arrayList3;
                    jFloatToRawIntBits2 = 0;
                }
                arrayList2.add(new pr0(jValueAt, motionEvent.getEventTime(), j2, j3, z6, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList, jFloatToRawIntBits2, jM2930a));
                i5++;
                z4 = z;
                z5 = z2;
                i4 = 3;
                z3 = true;
            }
            i = 0;
            ArrayList arrayList32 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i2 = 0;
            while (i2 < historySize) {
            }
            char c32 = c2;
            if (motionEvent.getActionMasked() != 8) {
            }
            arrayList2.add(new pr0(jValueAt, motionEvent.getEventTime(), j2, j3, z6, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList, jFloatToRawIntBits2, jM2930a));
            i5++;
            z4 = z;
            z5 = z2;
            i4 = 3;
            z3 = true;
        }
        m171d(motionEvent);
        motionEvent.getEventTime();
        return new C0111d(17, arrayList2, motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m171d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f159c;
        SparseLongArray sparseLongArray = this.f158b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
