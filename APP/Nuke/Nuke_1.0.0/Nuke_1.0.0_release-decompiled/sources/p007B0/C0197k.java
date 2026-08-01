package p007B0;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import p186k.C2433o;

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

    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000A.C0038T0 m302c(android.view.MotionEvent r46, p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y r47) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007B0.C0197k.m302c(android.view.MotionEvent, I0.y):A.T0");
    }

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
