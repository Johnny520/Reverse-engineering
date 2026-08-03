package p267s1;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import p057e1.C0807b;
import p069f.C0952p;
import p227p4.C3315t;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: s1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3897h {

    /* JADX INFO: renamed from: a */
    public long f12772a;

    /* JADX INFO: renamed from: b */
    public final SparseLongArray f12773b = new SparseLongArray();

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f12774c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public final ArrayList f12775d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final C0952p f12776e = new C0952p();

    /* JADX INFO: renamed from: f */
    public int f12777f = -1;

    /* JADX INFO: renamed from: g */
    public int f12778g = -1;

    /* JADX INFO: renamed from: h */
    public boolean f12779h;

    /* JADX INFO: renamed from: i */
    public boolean f12780i;

    /* JADX INFO: renamed from: j */
    public C0807b f12781j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8085a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f12773b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j3 = this.f12772a;
                this.f12772a = 1 + j3;
                sparseLongArray.put(pointerId, j3);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j4 = this.f12772a;
            this.f12772a = 1 + j4;
            sparseLongArray.put(pointerId2, j4);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f12774c.put(pointerId2, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8086b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f12777f && source == this.f12778g) {
            return;
        }
        this.f12777f = toolType;
        this.f12778g = source;
        this.f12774c.clear();
        this.f12773b.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C3315t m8087c(MotionEvent motionEvent, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f12774c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.f12773b.clear();
            sparseBooleanArray.clear();
            this.f12779h = false;
            this.f12780i = false;
            this.f12781j = null;
            return null;
        }
        m8086b(motionEvent);
        m8085a(motionEvent);
        boolean z9 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z10 = actionMasked == 8;
        if (z9) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.f12775d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z11 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z12 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z11 || z12) {
                this.f12779h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.f12780i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i9 = 0;
            while (i9 < pointerCount) {
                arrayList.add(m8088d(viewTreeObserverOnGlobalLayoutListenerC5934t, motionEvent, null, i9, (z9 || i9 == actionIndex || (z10 && motionEvent.getButtonState() == 0)) ? false : true));
                i9++;
            }
        } else {
            this.f12780i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.f12781j = new C0807b((((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32));
            }
            arrayList.add(m8088d(viewTreeObserverOnGlobalLayoutListenerC5934t, motionEvent, this.f12781j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f12779h = false;
            this.f12780i = false;
            this.f12781j = null;
        }
        m8089e(motionEvent);
        motionEvent.getEventTime();
        return new C3315t(arrayList, 7, motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0182 A[EDGE_INSN: B:84:0x0182->B:62:0x0182 BREAK  A[LOOP:0: B:43:0x00ea->B:61:0x0179], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3916v m8088d(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, MotionEvent motionEvent, C0807b c0807b, int i9, boolean z9) {
        long jValueAt;
        char c10;
        long j3;
        long jM10665w;
        long j4;
        long jM10651J;
        int toolType;
        int i10;
        int historySize;
        int i11;
        long jFloatToRawIntBits;
        float fFloatValue;
        int i12;
        long j5;
        Float fValueOf;
        int i13;
        int pointerId = motionEvent.getPointerId(i9);
        SparseLongArray sparseLongArray = this.f12773b;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j10 = this.f12772a;
            this.f12772a = 1 + j10;
            sparseLongArray.put(pointerId, j10);
            jValueAt = j10;
        }
        float pressure = motionEvent.getPressure(i9);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i9))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i9))) << 32);
        if (i9 == 0) {
            if (c0807b != null) {
                jM10665w = c0807b.f2414a;
                c10 = ' ';
                j3 = 4294967295L;
            } else {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(rawX);
                int iFloatToRawIntBits = Float.floatToRawIntBits(rawY);
                c10 = ' ';
                j3 = 4294967295L;
                jM10665w = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
            }
            jM10651J = viewTreeObserverOnGlobalLayoutListenerC5934t.m10651J(jM10665w);
        } else {
            c10 = ' ';
            j3 = 4294967295L;
            if (Build.VERSION.SDK_INT < 29) {
                jM10665w = viewTreeObserverOnGlobalLayoutListenerC5934t.m10665w(jFloatToRawIntBits2);
                j4 = jFloatToRawIntBits2;
                toolType = motionEvent.getToolType(i9);
                if (toolType == 0) {
                    int i14 = 2;
                    if (toolType == 1) {
                        i10 = ((motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.f12779h || this.f12780i)) ? i14 : 1;
                    } else if (toolType != 2) {
                        if (toolType != 3) {
                            i14 = 4;
                            if (toolType != 4) {
                                i10 = 0;
                            }
                        }
                    } else {
                        i10 = 3;
                    }
                }
                ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                char c11 = c10;
                i11 = 0;
                while (true) {
                    jFloatToRawIntBits = 0;
                    if (i11 < historySize) {
                        break;
                    }
                    float historicalX = motionEvent.getHistoricalX(i9, i11);
                    float historicalY = motionEvent.getHistoricalY(i9, i11);
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                        i13 = historySize;
                    } else {
                        long jFloatToRawIntBits4 = Float.floatToRawIntBits(historicalX);
                        int iFloatToRawIntBits2 = Float.floatToRawIntBits(historicalY);
                        i13 = historySize;
                        long j11 = (jFloatToRawIntBits4 << c11) | (((long) iFloatToRawIntBits2) & j3);
                        long historicalEventTime = motionEvent.getHistoricalEventTime(i11);
                        float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i9, i11);
                        fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                        float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                        if (Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 3) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i9, i11))) << c11) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i9, i11))) & j3);
                        }
                        arrayList.add(new C3887c(historicalEventTime, j11, fFloatValue2, jFloatToRawIntBits, j11));
                    }
                    i11++;
                    historySize = i13;
                }
                long jFloatToRawIntBits5 = motionEvent.getActionMasked() != 8 ? (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c11) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j3) : 0L;
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29 && motionEvent.getClassification() == 5) {
                    float axisValue = motionEvent.getAxisValue(52, i9);
                    fValueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    }
                }
                float f3 = fFloatValue;
                if (i12 >= 29 || motionEvent.getClassification() != 3) {
                    j5 = jFloatToRawIntBits2;
                } else {
                    j5 = jFloatToRawIntBits2;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i9))) << c11) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i9))) & j3);
                }
                return new C3916v(jValueAt, motionEvent.getEventTime(), jM10665w, j4, z9, pressure, i10, this.f12774c.get(motionEvent.getPointerId(i9), false), arrayList, jFloatToRawIntBits5, f3, jFloatToRawIntBits, j5);
            }
            jM10665w = c0807b != null ? c0807b.f2414a : (((long) Float.floatToRawIntBits(motionEvent.getRawX(i9))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(i9))) & 4294967295L);
            jM10651J = viewTreeObserverOnGlobalLayoutListenerC5934t.m10651J(jM10665w);
        }
        j4 = jM10651J;
        toolType = motionEvent.getToolType(i9);
        if (toolType == 0) {
        }
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        char c112 = c10;
        i11 = 0;
        while (true) {
            jFloatToRawIntBits = 0;
            if (i11 < historySize) {
            }
            i11++;
            historySize = i13;
        }
        if (motionEvent.getActionMasked() != 8) {
        }
        i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            float axisValue2 = motionEvent.getAxisValue(52, i9);
            if (axisValue2 > 0.0f) {
            }
            if (fValueOf != null) {
            }
        }
        float f32 = fFloatValue;
        if (i12 >= 29) {
            j5 = jFloatToRawIntBits2;
        }
        return new C3916v(jValueAt, motionEvent.getEventTime(), jM10665w, j4, z9, pressure, i10, this.f12774c.get(motionEvent.getPointerId(i9), false), arrayList2, jFloatToRawIntBits5, f32, jFloatToRawIntBits, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m8089e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f12774c;
        SparseLongArray sparseLongArray = this.f12773b;
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
                int i9 = 0;
                while (true) {
                    if (i9 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i9) == iKeyAt) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
    }
}
