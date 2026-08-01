package p007B0;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import p000A.C0038T0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p186k.C2433o;
import p204n0.C2683b;

/* JADX INFO: renamed from: B0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0197k {

    /* JADX INFO: renamed from: a */
    public long f679a;

    /* JADX INFO: renamed from: b */
    public final SparseLongArray f680b = new SparseLongArray();

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f681c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public final ArrayList f682d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final C2433o f683e = new C2433o();

    /* JADX INFO: renamed from: f */
    public int f684f = -1;

    /* JADX INFO: renamed from: g */
    public int f685g = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m300a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f680b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j5 = this.f679a;
                this.f679a = 1 + j5;
                sparseLongArray.put(pointerId, j5);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j6 = this.f679a;
            this.f679a = 1 + j6;
            sparseLongArray.put(pointerId2, j6);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f681c.put(pointerId2, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m301b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f684f && source == this.f685g) {
            return;
        }
        this.f684f = toolType;
        this.f685g = source;
        this.f681c.clear();
        this.f680b.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0038T0 m302c(MotionEvent motionEvent, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        boolean z5;
        boolean z6;
        long jValueAt;
        float f2;
        long j5;
        long jM1314t;
        long jM1300H;
        int toolType;
        int i5;
        int historySize;
        int i6;
        char c5;
        long jFloatToRawIntBits;
        int i7;
        C0197k c0197k = this;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = c0197k.f680b;
        SparseBooleanArray sparseBooleanArray = c0197k.f681c;
        int i8 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        m301b(motionEvent);
        m300a(motionEvent);
        boolean z7 = true;
        boolean z8 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z9 = actionMasked == 8;
        if (z8) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = c0197k.f682d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i9 = 0;
        while (i9 < pointerCount) {
            boolean z10 = (z8 || i9 == actionIndex || (z9 && motionEvent.getButtonState() == 0)) ? false : z7;
            int pointerId = motionEvent.getPointerId(i9);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                z5 = z8;
                z6 = z9;
            } else {
                z5 = z8;
                long j6 = c0197k.f679a;
                z6 = z9;
                c0197k.f679a = j6 + 1;
                sparseLongArray.put(pointerId, j6);
                jValueAt = j6;
            }
            float pressure = motionEvent.getPressure(i9);
            char c6 = ' ';
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i9))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i9))) << 32);
            long jM4643a = C2683b.m4643a(jFloatToRawIntBits2, 0.0f, i8);
            if (i9 == 0) {
                f2 = 0.0f;
                jM1314t = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                jM1300H = viewTreeObserverOnGlobalLayoutListenerC0772y2.m1300H(jM1314t);
            } else {
                f2 = 0.0f;
                if (Build.VERSION.SDK_INT >= 29) {
                    jM1314t = (((long) Float.floatToRawIntBits(motionEvent.getRawY(i9))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(i9))) << 32);
                    jM1300H = viewTreeObserverOnGlobalLayoutListenerC0772y2.m1300H(jM1314t);
                } else {
                    j5 = jFloatToRawIntBits2;
                    jM1314t = viewTreeObserverOnGlobalLayoutListenerC0772y2.m1314t(jFloatToRawIntBits2);
                    toolType = motionEvent.getToolType(i9);
                    if (toolType != 0) {
                        if (toolType == 1) {
                            i5 = 1;
                        } else if (toolType == 2) {
                            i5 = i8;
                        } else if (toolType == i8) {
                            i5 = 2;
                        } else if (toolType == 4) {
                            i5 = 4;
                        }
                        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i6 = 0;
                        while (i6 < historySize) {
                            float historicalX = motionEvent.getHistoricalX(i9, i6);
                            float historicalY = motionEvent.getHistoricalY(i9, i6);
                            char c7 = c6;
                            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                i7 = actionIndex;
                            } else {
                                i7 = actionIndex;
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(historicalX)) << c7) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L);
                                arrayList2.add(new C0189c(motionEvent.getHistoricalEventTime(i6), jFloatToRawIntBits3, jFloatToRawIntBits3));
                            }
                            i6++;
                            c6 = c7;
                            actionIndex = i7;
                        }
                        int i10 = actionIndex;
                        char c8 = c6;
                        if (motionEvent.getActionMasked() == 8) {
                            c5 = '\n';
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c8);
                        } else {
                            c5 = '\n';
                            jFloatToRawIntBits = 0;
                        }
                        arrayList.add(new C0211y(jValueAt, motionEvent.getEventTime(), jM1314t, j5, z10, pressure, i5, sparseBooleanArray.get(motionEvent.getPointerId(i9), false), arrayList2, jFloatToRawIntBits, jM4643a));
                        i9++;
                        i8 = 3;
                        z7 = true;
                        viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
                        z8 = z5;
                        z9 = z6;
                        actionIndex = i10;
                        c0197k = this;
                    }
                    i5 = 0;
                    ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i6 = 0;
                    while (i6 < historySize) {
                    }
                    int i102 = actionIndex;
                    char c82 = c6;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    arrayList.add(new C0211y(jValueAt, motionEvent.getEventTime(), jM1314t, j5, z10, pressure, i5, sparseBooleanArray.get(motionEvent.getPointerId(i9), false), arrayList22, jFloatToRawIntBits, jM4643a));
                    i9++;
                    i8 = 3;
                    z7 = true;
                    viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
                    z8 = z5;
                    z9 = z6;
                    actionIndex = i102;
                    c0197k = this;
                }
            }
            j5 = jM1300H;
            toolType = motionEvent.getToolType(i9);
            if (toolType != 0) {
            }
            i5 = 0;
            ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i6 = 0;
            while (i6 < historySize) {
            }
            int i1022 = actionIndex;
            char c822 = c6;
            if (motionEvent.getActionMasked() == 8) {
            }
            arrayList.add(new C0211y(jValueAt, motionEvent.getEventTime(), jM1314t, j5, z10, pressure, i5, sparseBooleanArray.get(motionEvent.getPointerId(i9), false), arrayList222, jFloatToRawIntBits, jM4643a));
            i9++;
            i8 = 3;
            z7 = true;
            viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
            z8 = z5;
            z9 = z6;
            actionIndex = i1022;
            c0197k = this;
        }
        m303d(motionEvent);
        motionEvent.getEventTime();
        return new C0038T0(1, arrayList, motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m303d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f681c;
        SparseLongArray sparseLongArray = this.f680b;
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
                int i5 = 0;
                while (true) {
                    if (i5 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i5) == iKeyAt) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
    }
}
