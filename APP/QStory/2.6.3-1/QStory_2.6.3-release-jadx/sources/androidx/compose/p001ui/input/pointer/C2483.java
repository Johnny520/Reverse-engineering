package androidx.compose.p001ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.appcompat.app.C0923;
import androidx.collection.C1110;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import java.util.ArrayList;
import p128.C8158;
import top.linl.dexparser.bean.DexMap;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2483 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f5185;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f5186;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f5188;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C8158 f5189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SparseLongArray f5184 = new SparseLongArray();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SparseBooleanArray f5183 = new SparseBooleanArray();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f5182 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1110 f5181 = new C1110((Object) null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f5180 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f5187 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3601(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f5183;
        SparseLongArray sparseLongArray = this.f5184;
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0182 A[EDGE_INSN: B:84:0x0182->B:62:0x0182 BREAK  A[LOOP:0: B:43:0x00ea->B:61:0x0179], SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2471 m3602(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, MotionEvent motionEvent, C8158 c8158, int i, boolean z) {
        long jValueAt;
        char c;
        long j;
        long jM4098;
        long j2;
        long jM4094;
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
        SparseLongArray sparseLongArray = this.f5184;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j4 = this.f5185;
            this.f5185 = 1 + j4;
            sparseLongArray.put(pointerId, j4);
            jValueAt = j4;
        }
        float pressure = motionEvent.getPressure(i);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32);
        if (i == 0) {
            if (c8158 != null) {
                jM4098 = c8158.f19886;
                c = ' ';
                j = 4294967295L;
            } else {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(rawX);
                int iFloatToRawIntBits = Float.floatToRawIntBits(rawY);
                c = ' ';
                j = 4294967295L;
                jM4098 = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
            }
            jM4094 = viewTreeObserverOnGlobalLayoutListenerC2719.m4094(jM4098);
        } else {
            c = ' ';
            j = 4294967295L;
            if (Build.VERSION.SDK_INT < 29) {
                jM4098 = viewTreeObserverOnGlobalLayoutListenerC2719.m4098(jFloatToRawIntBits2);
                j2 = jFloatToRawIntBits2;
                toolType = motionEvent.getToolType(i);
                if (toolType == 0) {
                    int i6 = 2;
                    if (toolType == 1) {
                        i2 = ((motionEvent.isFromSource(DexMap.TYPE_STRING_DATA_ITEM) || motionEvent.isFromSource(1048584)) && (!this.f5186 || this.f5188)) ? i6 : 1;
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
                        arrayList.add(new C2467(historicalEventTime, j5, fFloatValue2, jFloatToRawIntBits, j5));
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
                return new C2471(jValueAt, motionEvent.getEventTime(), jM4098, j2, z, pressure, i2, this.f5183.get(motionEvent.getPointerId(i), false), arrayList, jFloatToRawIntBits5, f, jFloatToRawIntBits, j3);
            }
            jM4098 = c8158 != null ? c8158.f19886 : (((long) Float.floatToRawIntBits(motionEvent.getRawX(i))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L);
            jM4094 = viewTreeObserverOnGlobalLayoutListenerC2719.m4094(jM4098);
        }
        j2 = jM4094;
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
        return new C2471(jValueAt, motionEvent.getEventTime(), jM4098, j2, z, pressure, i2, this.f5183.get(motionEvent.getPointerId(i), false), arrayList2, jFloatToRawIntBits5, f2, jFloatToRawIntBits, j3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0923 m3603(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, MotionEvent motionEvent) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f5183;
        if (actionMasked == 3 || actionMasked == 4) {
            this.f5184.clear();
            sparseBooleanArray.clear();
            this.f5186 = false;
            this.f5188 = false;
            this.f5189 = null;
            return null;
        }
        m3604(motionEvent);
        m3605(motionEvent);
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
        ArrayList arrayList = this.f5182;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(DexMap.TYPE_STRING_DATA_ITEM) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.f5186 = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.f5188 = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                arrayList.add(m3602(viewTreeObserverOnGlobalLayoutListenerC2719, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        } else {
            this.f5188 = true;
            if (motionEvent.getActionMasked() == 0) {
                this.f5189 = new C8158((((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L));
            }
            arrayList.add(m3602(viewTreeObserverOnGlobalLayoutListenerC2719, motionEvent, this.f5189, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f5186 = false;
            this.f5188 = false;
            this.f5189 = null;
        }
        m3601(motionEvent);
        motionEvent.getEventTime();
        return new C0923(arrayList, 5, motionEvent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3604(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f5180 && source == this.f5187) {
            return;
        }
        this.f5180 = toolType;
        this.f5187 = source;
        this.f5183.clear();
        this.f5184.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3605(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f5184;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.f5185;
                this.f5185 = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.f5185;
            this.f5185 = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f5183.put(pointerId2, true);
            }
        }
    }
}
