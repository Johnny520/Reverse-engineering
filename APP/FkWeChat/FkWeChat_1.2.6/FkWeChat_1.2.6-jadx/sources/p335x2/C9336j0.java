package p335x2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import bsh.C1189h4;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import p172l8.C4711r;

/* JADX INFO: renamed from: x2.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9336j0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f31935a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f31936b;

    /* JADX INFO: renamed from: c */
    public final int f31937c;

    /* JADX INFO: renamed from: d */
    public float f31938d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f31939e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f31940f;

    /* JADX INFO: renamed from: g */
    public boolean f31941g;

    /* JADX INFO: renamed from: h */
    public CharSequence f31942h;

    public C9336j0(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f31935a = charSequence;
        this.f31936b = textPaint;
        this.f31937c = i10;
    }

    /* JADX INFO: renamed from: a */
    public static int m36397a(C4711r c4711r, C4711r c4711r2) {
        return (((Number) c4711r.m18796f()).intValue() - ((Number) c4711r.m18795e()).intValue()) - (((Number) c4711r2.m18796f()).intValue() - ((Number) c4711r2.m18795e()).intValue());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ float m36398g(C9336j0 c9336j0, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = c9336j0.m36402e().length();
        }
        return c9336j0.m36403f(i10, i11);
    }

    /* JADX INFO: renamed from: b */
    public final float m36399b() {
        BoringLayout.Metrics metricsM36401d = m36401d();
        float fCeil = metricsM36401d != null ? metricsM36401d.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(m36398g(this, 0, 0, 3, null));
        }
        return AbstractC9339k0.m36425d(fCeil, this.f31935a, this.f31936b) ? fCeil + 0.5f : fCeil;
    }

    /* JADX INFO: renamed from: c */
    public final float m36400c() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.f31936b.getTextLocale());
        CharSequence charSequence = this.f31935a;
        int i10 = 0;
        lineInstance.setText(new C9318d0(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: x2.i0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C9336j0.m36397a((C4711r) obj, (C4711r) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C4711r(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                C4711r c4711r = (C4711r) priorityQueue.peek();
                if (c4711r != null && ((Number) c4711r.m18796f()).intValue() - ((Number) c4711r.m18795e()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new C4711r(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            C1189h4.m4429a();
            return 0.0f;
        }
        C4711r c4711r2 = (C4711r) it.next();
        float fM36403f = m36403f(((Number) c4711r2.m18792a()).intValue(), ((Number) c4711r2.m18793b()).intValue());
        while (it.hasNext()) {
            C4711r c4711r3 = (C4711r) it.next();
            fM36403f = Math.max(fM36403f, m36403f(((Number) c4711r3.m18792a()).intValue(), ((Number) c4711r3.m18793b()).intValue()));
        }
        return fM36403f;
    }

    /* JADX INFO: renamed from: d */
    public final BoringLayout.Metrics m36401d() {
        if (!this.f31941g) {
            this.f31940f = C9338k.f31945a.m36421c(this.f31935a, this.f31936b, AbstractC9337j1.m36416k(this.f31937c));
            this.f31941g = true;
        }
        return this.f31940f;
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m36402e() {
        CharSequence charSequence = this.f31942h;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        boolean z10 = AbstractC9339k0.f31946a;
        CharSequence charSequence2 = this.f31935a;
        if (!z10) {
            return charSequence2;
        }
        CharSequence charSequenceM36426e = AbstractC9339k0.m36426e(charSequence2);
        this.f31942h = charSequenceM36426e;
        return charSequenceM36426e;
    }

    /* JADX INFO: renamed from: f */
    public final float m36403f(int i10, int i11) {
        return Layout.getDesiredWidth(m36402e(), i10, i11, this.f31936b);
    }

    /* JADX INFO: renamed from: h */
    public final float m36404h() {
        if (!Float.isNaN(this.f31938d)) {
            return this.f31938d;
        }
        float fM36399b = m36399b();
        this.f31938d = fM36399b;
        return fM36399b;
    }

    /* JADX INFO: renamed from: i */
    public final float m36405i() {
        if (!Float.isNaN(this.f31939e)) {
            return this.f31939e;
        }
        float fM36400c = m36400c();
        this.f31939e = fM36400c;
        return fM36400c;
    }
}
