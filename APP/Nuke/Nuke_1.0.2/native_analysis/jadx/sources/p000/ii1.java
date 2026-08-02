package p000;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ii1 {

    /* JADX INFO: renamed from: a */
    public long f4635a;

    /* JADX INFO: renamed from: b */
    public final SparseLongArray f4636b = new SparseLongArray();

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f4637c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public final ArrayList f4638d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final gd1 f4639e = new gd1();

    /* JADX INFO: renamed from: f */
    public int f4640f = -1;

    /* JADX INFO: renamed from: g */
    public int f4641g = -1;

    /* JADX INFO: renamed from: h */
    public boolean f4642h;

    /* JADX INFO: renamed from: i */
    public boolean f4643i;

    /* JADX INFO: renamed from: j */
    public rs1 f4644j;

    /* JADX INFO: renamed from: a */
    public final void m2353a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f4636b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.f4635a;
                this.f4635a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.f4635a;
            this.f4635a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f4637c.put(pointerId2, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2354b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f4640f && source == this.f4641g) {
            return;
        }
        this.f4640f = toolType;
        this.f4641g = source;
        this.f4637c.clear();
        this.f4636b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final dq1 m2355c(MotionEvent motionEvent, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f4637c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.f4636b.clear();
            sparseBooleanArray.clear();
            this.f4642h = false;
            this.f4643i = false;
            this.f4644j = null;
            return null;
        }
        m2354b(motionEvent);
        m2353a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.f4638d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.f4642h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.f4643i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                arrayList.add(m2356d(viewTreeObserverOnGlobalLayoutListenerC0045b7, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        } else {
            this.f4643i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.f4644j = new rs1((((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L));
            }
            arrayList.add(m2356d(viewTreeObserverOnGlobalLayoutListenerC0045b7, motionEvent, this.f4644j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f4642h = false;
            this.f4643i = false;
            this.f4644j = null;
        }
        m2357e(motionEvent);
        motionEvent.getEventTime();
        return new dq1(6, arrayList, motionEvent);
    }

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
    public final q12 m2356d(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, MotionEvent motionEvent, rs1 rs1Var, int i, boolean z) {
        long jValueAt;
        char c;
        long j;
        long jM477u;
        long j2;
        long jM461H;
        int toolType;
        int i2;
        int historySize;
        int i3;
        long jFloatToRawIntBits;
        float fFloatValue;
        int i4;
        long j3;
        Float fValueOf;
        int i5;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.f4636b;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j4 = this.f4635a;
            this.f4635a = 1 + j4;
            sparseLongArray.put(pointerId, j4);
            jValueAt = j4;
        }
        float pressure = motionEvent.getPressure(i);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32);
        if (i == 0) {
            if (rs1Var != null) {
                jM477u = rs1Var.f9744a;
                c = ' ';
                j = 4294967295L;
            } else {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(rawX);
                int iFloatToRawIntBits = Float.floatToRawIntBits(rawY);
                c = ' ';
                j = 4294967295L;
                jM477u = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
            }
            jM461H = viewTreeObserverOnGlobalLayoutListenerC0045b7.m461H(jM477u);
        } else {
            c = ' ';
            j = 4294967295L;
            if (Build.VERSION.SDK_INT < 29) {
                jM477u = viewTreeObserverOnGlobalLayoutListenerC0045b7.m477u(jFloatToRawIntBits2);
                j2 = jFloatToRawIntBits2;
                toolType = motionEvent.getToolType(i);
                if (toolType == 0) {
                    int i6 = 2;
                    if (toolType == 1) {
                        i2 = ((motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.f4642h || this.f4643i)) ? i6 : 1;
                    } else if (toolType != 2) {
                        if (toolType != 3) {
                            i6 = 4;
                            if (toolType != 4) {
                                i2 = 0;
                            }
                        }
                    } else {
                        i2 = 3;
                    }
                }
                ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                char c2 = c;
                i3 = 0;
                while (true) {
                    jFloatToRawIntBits = 0;
                    if (i3 < historySize) {
                        break;
                    }
                    float historicalX = motionEvent.getHistoricalX(i, i3);
                    float historicalY = motionEvent.getHistoricalY(i, i3);
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                        i5 = historySize;
                    } else {
                        long jFloatToRawIntBits4 = Float.floatToRawIntBits(historicalX);
                        int iFloatToRawIntBits2 = Float.floatToRawIntBits(historicalY);
                        i5 = historySize;
                        long j5 = (jFloatToRawIntBits4 << c2) | (((long) iFloatToRawIntBits2) & j);
                        long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                        float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                        fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                        float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                        if (Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 3) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3))) & j);
                        }
                        arrayList.add(new ts0(historicalEventTime, j5, fFloatValue2, jFloatToRawIntBits, j5));
                    }
                    i3++;
                    historySize = i5;
                }
                long jFloatToRawIntBits5 = motionEvent.getActionMasked() != 8 ? (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j) : 0L;
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29 && motionEvent.getClassification() == 5) {
                    float axisValue = motionEvent.getAxisValue(52, i);
                    fValueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    }
                }
                float f = fFloatValue;
                if (i4 >= 29 || motionEvent.getClassification() != 3) {
                    j3 = jFloatToRawIntBits2;
                } else {
                    j3 = jFloatToRawIntBits2;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j);
                }
                return new q12(jValueAt, motionEvent.getEventTime(), jM477u, j2, z, pressure, i2, this.f4637c.get(motionEvent.getPointerId(i), false), arrayList, jFloatToRawIntBits5, f, jFloatToRawIntBits, j3);
            }
            jM477u = rs1Var != null ? rs1Var.f9744a : (((long) Float.floatToRawIntBits(motionEvent.getRawX(i))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L);
            jM461H = viewTreeObserverOnGlobalLayoutListenerC0045b7.m461H(jM477u);
        }
        j2 = jM461H;
        toolType = motionEvent.getToolType(i);
        if (toolType == 0) {
        }
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        char c22 = c;
        i3 = 0;
        while (true) {
            jFloatToRawIntBits = 0;
            if (i3 < historySize) {
            }
            i3++;
            historySize = i5;
        }
        if (motionEvent.getActionMasked() != 8) {
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            float axisValue2 = motionEvent.getAxisValue(52, i);
            if (axisValue2 > 0.0f) {
            }
            if (fValueOf != null) {
            }
        }
        float f2 = fFloatValue;
        if (i4 >= 29) {
            j3 = jFloatToRawIntBits2;
        }
        return new q12(jValueAt, motionEvent.getEventTime(), jM477u, j2, z, pressure, i2, this.f4637c.get(motionEvent.getPointerId(i), false), arrayList2, jFloatToRawIntBits5, f2, jFloatToRawIntBits, j3);
    }

    /* JADX INFO: renamed from: e */
    public final void m2357e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f4637c;
        SparseLongArray sparseLongArray = this.f4636b;
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
