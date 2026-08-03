package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import io.sentry.InterfaceC1651Z;
import io.sentry.android.replay.capture.AbstractC1767e;
import io.sentry.android.replay.capture.AbstractC1775m;
import io.sentry.android.replay.capture.C1770h;
import io.sentry.android.replay.capture.C1773k;
import io.sentry.android.replay.capture.C1779q;
import io.sentry.android.replay.util.InterfaceC1809i;
import io.sentry.android.replay.viewhierarchy.AbstractC1820f;
import io.sentry.android.replay.viewhierarchy.C1818d;
import io.sentry.android.replay.viewhierarchy.C1819e;
import io.sentry.config.AbstractC1856a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0073Bn;
import p000.C0208Et;
import p000.C0829TC;
import p000.C1514ht;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1799t extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6524c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6525d;

    public C1799t(ViewTreeObserverOnDrawListenerC1810v r1, ArrayList r2, Canvas r3) {
        this.f6523b = 0;
        this.f6524c = r1;
        this.f6525d = r3;
        super(1);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r18) {
        switch(this.f6523b) {
            case 0: goto L25;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        AbstractC1775m r1 = (AbstractC1775m) r18;
        C1779q r2 = (C1779q) this.f6524c;
        if ((r1 instanceof C1773k) == false) goto L7;
        C1773k.m3966a((C1773k) r1, r2.f6469s);
    L7:
        r2.m3957l(-1);
        AbstractC1856a.m4060f((File) this.f6525d);
        return C0829TC.f2620a;
    L9:
        AbstractC1775m r12 = (AbstractC1775m) r18;
        C1770h r22 = (C1770h) this.f6524c;
        ArrayList r3 = r22.f6458v;
        InterfaceC1651Z r23 = r22.f6455s;
        if (r3.isEmpty() == false) goto L12;
        Object r4 = null;
    L13:
        C1773k r42 = (C1773k) r4;
    L14:
        if (r42 == null) goto L21;
        C1773k.m3966a(r42, r23);
        if (r3.isEmpty() == false) goto L18;
        Object r43 = null;
    L19:
        r42 = (C1773k) r43;
        Thread.sleep(100);
        goto L14
    L18:
        r43 = r3.remove(0);
        goto L19
    L21:
        if ((r12 instanceof C1773k) == false) goto L24;
        C1773k r13 = (C1773k) r12;
        C1773k.m3966a(r13, r23);
        ((C1514ht) this.f6525d).mo90g(r13.f6459a.f7285u);
    L24:
        return C0829TC.f2620a;
    L12:
        r4 = r3.remove(0);
        goto L13
    L25:
        AbstractC1820f r14 = (AbstractC1820f) r18;
        ViewTreeObserverOnDrawListenerC1810v r24 = (ViewTreeObserverOnDrawListenerC1810v) this.f6524c;
        ?? r32 = r24.f6547g;
        Rect r44 = r14.f6587e;
        if (r14.f6586d == false) goto L69;
        if (r14.f6583a <= 0) goto L69;
        if (r14.f6584b <= 0) goto L69;
        if (r44 == null) goto L78;
        int r6 = 1;
        int r7 = 0;
        if ((r14 instanceof C1818d) == false) goto L36;
        List r15 = Collections.singletonList(r44);
        Bitmap r5 = r24.f6549i;
        Rect r8 = new Rect(r44);
        RectF r45 = new RectF(r8);
        ((Matrix) r24.f6551k.getValue()).mapRect(r45);
        r45.round(r8);
        ((Canvas) r24.f6550j.getValue()).drawBitmap(r5, r8, new Rect(0, 0, 1, 1), null);
        C0208Et r52 = new C0208Et(r15, Integer.valueOf(((Bitmap) r24.f6548h.getValue()).getPixel(0, 0)));
    L63:
        List r16 = (List) r52.f613a;
        ((Paint) r32.getValue()).setColor(((Number) r52.f614b).intValue());
        Canvas r46 = (Canvas) this.f6525d;
        Iterator r17 = r16.iterator();
    L65:
        if (r17.hasNext() == false) goto L67;
        r46.drawRoundRect(new RectF((Rect) r17.next()), 10.0f, 10.0f, (Paint) r32.getValue());
        goto L65
    L67:
        r24.f6542b.getReplayController().getClass();
        goto L69
    L36:
        int r82 = -16777216;
        if ((r14 instanceof C1819e) == false) goto L62;
        C1819e r19 = (C1819e) r14;
        InterfaceC1809i r53 = r19.f6579g;
        if (r53 == null) goto L43;
        Integer r9 = r53.mo3592c();
        if (r9 == null) goto L43;
    L42:
        r82 = r9.intValue();
    L46:
        int r92 = r19.f6581i;
        int r110 = r19.f6582j;
        if (r53 != null) goto L49;
        List r111 = Collections.singletonList(r44);
    L61:
        r52 = new C0208Et(r111, Integer.valueOf(r82));
        goto L63
    L49:
        ArrayList r10 = new ArrayList();
        int r11 = r53.mo3591b();
        int r122 = 0;
    L50:
        if (r122 >= r11) goto L60;
        int r132 = (int) r53.mo3595f(r122, r53.mo3590a(r122));
        int r142 = r53.mo3596g(r122);
        int r152 = r53.mo3593d(r122);
        int r162 = r152 - r142;
        if (r142 <= 0) goto L54;
        int r143 = r6;
    L55:
        int r144 = (int) r53.mo3595f(r122, r162 + r143);
        if (r144 != 0) goto L59;
        if (r152 <= 0) goto L59;
        r144 = ((int) r53.mo3595f(r122, r152 - 1)) + r6;
    L59:
        int r153 = r53.mo3594e(r122);
        int r163 = r53.mo3597h(r122);
        Rect r62 = new Rect();
        int r72 = (r44.left + r92) + r132;
        r62.left = r72;
        r62.right = (r144 - r132) + r72;
        int r73 = (r44.top + r110) + r153;
        r62.top = r73;
        r62.bottom = (r163 - r153) + r73;
        r10.add(r62);
        r122 = r122 + 1;
        r6 = 1;
        r7 = 0;
        goto L50
    L54:
        r143 = r7;
        goto L55
    L60:
        r111 = r10;
    L43:
        r9 = r19.f6580h;
        if (r9 == null) goto L46;
    L62:
        r52 = new C0208Et(Collections.singletonList(r44), -16777216);
        goto L63
    L78:
        return Boolean.FALSE;
    L69:
        return Boolean.TRUE;
    }

    public /* synthetic */ C1799t(AbstractC1767e r1, Serializable r2, int r3) {
        this.f6523b = r3;
        this.f6524c = r1;
        this.f6525d = r2;
        super(1);
    }
}
