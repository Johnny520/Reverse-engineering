package p130a1;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import p000A.C0072l0;
import p041H0.C0549A;
import p056K2.C0882h;
import p092S0.C1260M;
import p092S0.InterfaceC1281s;
import p096T0.C1402b;
import p096T0.C1405e;
import p110W0.InterfaceC1580e;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: a1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1791d implements InterfaceC1281s {

    /* JADX INFO: renamed from: a */
    public final String f6107a;

    /* JADX INFO: renamed from: b */
    public final C1260M f6108b;

    /* JADX INFO: renamed from: c */
    public final List f6109c;

    /* JADX INFO: renamed from: d */
    public final List f6110d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1580e f6111e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2007c f6112f;

    /* JADX INFO: renamed from: g */
    public final C1793f f6113g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f6114h;

    /* JADX INFO: renamed from: i */
    public final C1405e f6115i;

    /* JADX INFO: renamed from: j */
    public C0072l0 f6116j;

    /* JADX INFO: renamed from: k */
    public final int f6117k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0805 A[LOOP:6: B:395:0x0803->B:396:0x0805, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1791d(java.lang.String r42, p092S0.C1260M r43, java.util.List r44, java.util.List r45, p110W0.InterfaceC1580e r46, p153e1.InterfaceC2007c r47) {
        /*
            Method dump skipped, instruction units count: 2155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p130a1.C1791d.<init>(java.lang.String, S0.M, java.util.List, java.util.List, W0.e, e1.c):void");
    }

    @Override // p092S0.InterfaceC1281s
    /* JADX INFO: renamed from: a */
    public final float mo424a() {
        float f2;
        C1405e c1405e = this.f6115i;
        float f5 = c1405e.f5032e;
        TextPaint textPaint = c1405e.f5029b;
        if (!Float.isNaN(f5)) {
            return c1405e.f5032e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c1405e.f5028a;
        lineInstance.setText(new C1402b(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C0549A(2));
        int i5 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C0882h(Integer.valueOf(i5), Integer.valueOf(next)));
            } else {
                C0882h c0882h = (C0882h) priorityQueue.peek();
                if (c0882h != null && ((Number) c0882h.f2770e).intValue() - ((Number) c0882h.f2769d).intValue() < next - i5) {
                    priorityQueue.poll();
                    priorityQueue.add(new C0882h(Integer.valueOf(i5), Integer.valueOf(next)));
                }
            }
            i5 = next;
        }
        if (priorityQueue.isEmpty()) {
            f2 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C0882h c0882h2 = (C0882h) it.next();
            float desiredWidth = Layout.getDesiredWidth(c1405e.m2692b(), ((Number) c0882h2.f2769d).intValue(), ((Number) c0882h2.f2770e).intValue(), textPaint);
            while (it.hasNext()) {
                C0882h c0882h3 = (C0882h) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c1405e.m2692b(), ((Number) c0882h3.f2769d).intValue(), ((Number) c0882h3.f2770e).intValue(), textPaint));
            }
            f2 = desiredWidth;
        }
        c1405e.f5032e = f2;
        return f2;
    }

    @Override // p092S0.InterfaceC1281s
    /* JADX INFO: renamed from: b */
    public final boolean mo425b() {
        C0072l0 c0072l0 = this.f6116j;
        if (c0072l0 != null ? c0072l0.m113s() : false) {
            return true;
        }
        return AbstractC1796i.m3267a(this.f6108b) && Boolean.FALSE.booleanValue();
    }

    @Override // p092S0.InterfaceC1281s
    /* JADX INFO: renamed from: c */
    public final float mo426c() {
        return this.f6115i.m2693c();
    }
}
