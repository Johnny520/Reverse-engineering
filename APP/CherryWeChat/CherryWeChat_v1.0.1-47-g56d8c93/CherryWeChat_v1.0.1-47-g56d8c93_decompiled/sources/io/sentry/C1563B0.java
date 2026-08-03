package io.sentry;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import io.sentry.android.core.AbstractC1671N;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.C1676T;
import io.sentry.android.replay.util.InterfaceC1809i;
import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1869a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1961k;
import io.sentry.protocol.C1969s;
import io.sentry.protocol.C1975y;
import io.sentry.transport.C2022q;
import io.sentry.util.AbstractC2030b;
import io.sentry.util.C2032d;
import io.sentry.vendor.gson.stream.C2051c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p000.C0307H5;

/* JADX INFO: renamed from: io.sentry.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1563B0 implements InterfaceC1809i {

    /* JADX INFO: renamed from: a */
    public final Object f5600a;

    public /* synthetic */ C1563B0(Object obj) {
        this.f5600a = obj;
    }

    /* JADX INFO: renamed from: k */
    public static C1969s m3589k(Throwable th, C1961k c1961k, Long l, List list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        C1969s c1969s = new C1969s();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            C1975y c1975y = new C1975y(list);
            if (z) {
                c1975y.f7057c = Boolean.TRUE;
            }
            c1969s.f7008e = c1975y;
        }
        c1969s.f7007d = l;
        c1969s.f7004a = name;
        c1969s.f7009f = c1961k;
        c1969s.f7006c = name2;
        c1969s.f7005b = message;
        return c1969s;
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: a */
    public int mo3590a(int i) {
        return ((Layout) this.f5600a).getLineStart(i);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: b */
    public int mo3591b() {
        return ((Layout) this.f5600a).getLineCount();
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: c */
    public Integer mo3592c() {
        int i;
        Layout layout = (Layout) this.f5600a;
        if (!(layout.getText() instanceof Spanned)) {
            return null;
        }
        int i2 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), ForegroundColorSpan.class)) {
            int spanStart = ((Spanned) layout.getText()).getSpanStart(foregroundColorSpan);
            int spanEnd = ((Spanned) layout.getText()).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i = spanEnd - spanStart) > i2) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i2 = i;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(numValueOf.intValue() | (-16777216));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: d */
    public int mo3593d(int i) {
        return ((Layout) this.f5600a).getLineVisibleEnd(i);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: e */
    public int mo3594e(int i) {
        return ((Layout) this.f5600a).getLineTop(i);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: f */
    public float mo3595f(int i, int i2) {
        return ((Layout) this.f5600a).getPrimaryHorizontal(i2);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: g */
    public int mo3596g(int i) {
        return ((Layout) this.f5600a).getEllipsisCount(i);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: h */
    public int mo3597h(int i) {
        return ((Layout) this.f5600a).getLineBottom(i);
    }

    /* JADX INFO: renamed from: i */
    public void m3598i(AbstractC1671N abstractC1671N) {
        ((C1666I) this.f5600a).getClass();
        if (Build.VERSION.SDK_INT <= 28) {
            String callingPackage = abstractC1671N.getCallingPackage();
            String packageName = abstractC1671N.getContext().getPackageName();
            if (callingPackage == null || !callingPackage.equals(packageName)) {
                throw new SecurityException("Provider does not allow for granting of Uri permissions");
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3599j(Throwable th, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
        Thread threadCurrentThread;
        C1961k c1961k;
        boolean z;
        int iIncrementAndGet = atomicInteger.get();
        while (th != null && hashSet.add(th)) {
            if (str == null) {
                str = "chained";
            }
            if (th instanceof C1869a) {
                C1869a c1869a = (C1869a) th;
                C1961k c1961k2 = c1869a.f6704a;
                Throwable th2 = c1869a.f6705b;
                threadCurrentThread = c1869a.f6706c;
                z = c1869a.f6707d;
                th = th2;
                c1961k = c1961k2;
            } else {
                C1961k c1961k3 = new C1961k();
                threadCurrentThread = Thread.currentThread();
                c1961k = c1961k3;
                z = false;
            }
            arrayDeque.addFirst(m3589k(th, c1961k, Long.valueOf(threadCurrentThread.getId()), ((C2002t) this.f5600a).m4155b(th.getStackTrace(), Boolean.FALSE.equals(c1961k.f6957d)), z));
            if (c1961k.f6954a == null) {
                c1961k.f6954a = str;
            }
            if (atomicInteger.get() >= 0) {
                c1961k.f6962i = Integer.valueOf(iIncrementAndGet);
            }
            iIncrementAndGet = atomicInteger.incrementAndGet();
            c1961k.f6961h = Integer.valueOf(iIncrementAndGet);
            Throwable[] suppressed = th.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                for (Throwable th3 : suppressed) {
                    m3599j(th3, atomicInteger, hashSet, arrayDeque, "suppressed");
                }
            }
            th = th.getCause();
            str = null;
            atomicInteger = atomicInteger;
            hashSet = hashSet;
            arrayDeque = arrayDeque;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m3600l(C1901c c1901c, ILogger iLogger, Object obj) throws IOException {
        C2051c c2051c = (C2051c) c1901c.f6781b;
        if (obj == null) {
            c2051c.m4220l();
            return;
        }
        if (obj instanceof Character) {
            c1901c.m4115z(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            c1901c.m4115z((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            c1901c.m4100A(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            c1901c.m4114y((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                c1901c.m4115z(AbstractC1856a.m4073t((Date) obj));
                return;
            } catch (Exception e) {
                iLogger.mo3683r(EnumC1657a2.ERROR, "Error when serializing Date", e);
                c2051c.m4220l();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                c1901c.m4115z(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                iLogger.mo3683r(EnumC1657a2.ERROR, "Error when serializing TimeZone", e2);
                c2051c.m4220l();
                return;
            }
        }
        if (obj instanceof InterfaceC1567C0) {
            ((InterfaceC1567C0) obj).serialize(c1901c, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            m3601m(c1901c, iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            m3601m(c1901c, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            m3602n(c1901c, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            c1901c.m4115z(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = AbstractC2030b.f7215a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
            }
            m3601m(c1901c, iLogger, arrayList);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            c1901c.m4100A(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            c1901c.m4115z(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            c1901c.m4115z(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            c1901c.m4115z(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            c1901c.m4115z(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            m3602n(c1901c, iLogger, AbstractC2030b.m4174a((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            c1901c.m4115z(obj.toString());
            return;
        }
        try {
            m3600l(c1901c, iLogger, ((C0307H5) this.f5600a).m658b(iLogger, obj));
        } catch (Exception e3) {
            iLogger.mo3683r(EnumC1657a2.ERROR, "Failed serializing unknown object.", e3);
            c1901c.m4115z("[OBJECT]");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m3601m(C1901c c1901c, ILogger iLogger, Collection collection) throws IOException {
        C2051c c2051c = (C2051c) c1901c.f6781b;
        c2051c.m4223p();
        c2051c.m4217d();
        int i = c2051c.f7265c;
        int[] iArr = c2051c.f7264b;
        if (i == iArr.length) {
            c2051c.f7264b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = c2051c.f7264b;
        int i2 = c2051c.f7265c;
        c2051c.f7265c = i2 + 1;
        iArr2[i2] = 1;
        c2051c.f7263a.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m3600l(c1901c, iLogger, it.next());
        }
        c2051c.m4218f(1, 2, ']');
    }

    /* JADX INFO: renamed from: n */
    public void m3602n(C1901c c1901c, ILogger iLogger, Map map) throws IOException {
        c1901c.m4101h();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                c1901c.m4106p((String) obj);
                m3600l(c1901c, iLogger, map.get(obj));
            }
        }
        c1901c.m4102k();
    }

    public C1563B0(int i, boolean z) {
        switch (i) {
            case 4:
                this.f5600a = new Handler(Looper.getMainLooper());
                break;
            case 5:
            default:
                this.f5600a = new C1666I(C1611N0.f5797a);
                break;
            case 6:
                this.f5600a = new C2032d(new C1676T(3));
                break;
            case 7:
                this.f5600a = new C2022q();
                break;
        }
    }

    public C1563B0(int i) {
        this.f5600a = new C0307H5(i);
    }
}
