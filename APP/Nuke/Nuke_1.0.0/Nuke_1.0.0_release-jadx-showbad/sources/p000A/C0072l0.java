package p000A;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C1937g;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import p001A0.C0102b;
import p007B0.C0173F;
import p013C0.C0236c;
import p014C1.C0240b;
import p027E4.C0330q;
import p041H0.C0550A0;
import p041H0.C0564I;
import p041H0.EnumC0621u;
import p047I0.C0761s0;
import p047I0.InterfaceC0686N0;
import p047I0.RunnableC0766v;
import p049I2.AbstractC0797o;
import p049I2.C0793k;
import p056K2.EnumC0880f;
import p078P1.C1147i;
import p078P1.InterfaceC1143e;
import p078P1.InterfaceC1144f;
import p088R1.C1201b;
import p088R1.C1214o;
import p088R1.C1218s;
import p088R1.C1222w;
import p088R1.InterfaceC1194D;
import p088R1.ThreadFactoryC1200a;
import p093S1.C1294f;
import p093S1.InterfaceC1289a;
import p095T.C1390u0;
import p095T.InterfaceC1339T0;
import p110W0.C1577b;
import p110W0.C1594s;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p118X3.C1713w;
import p121Y1.AbstractC1759t;
import p121Y1.C1733A;
import p121Y1.C1743d;
import p121Y1.C1753n;
import p125Z0.C1780a;
import p125Z0.C1781b;
import p136b0.AbstractC1848j;
import p136b0.AbstractC1851m;
import p136b0.C1839a;
import p136b0.C1850l;
import p142c2.C1892c;
import p148d2.C1972c;
import p148d2.InterfaceC1970a;
import p152e0.InterfaceC1998e;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p171h2.C2239f;
import p179i4.AbstractC2352g;
import p186k.AbstractC2415L;
import p186k.C2408E;
import p191k4.C2475a;
import p195l2.AbstractC2498b;
import p195l2.AbstractC2503g;
import p195l2.C2497a;
import p195l2.C2508l;
import p198m0.C2584o;
import p198m0.InterfaceC2581l;
import p200m2.InterfaceC2600a;
import p200m2.InterfaceC2601b;
import p208n4.C2709h;
import p208n4.C2715n;
import p208n4.C2716o;
import p208n4.InterfaceC2720s;
import p208n4.InterfaceC2721t;
import p208n4.InterfaceC2722u;
import p211o0.InterfaceC2760s;
import p215o4.C2804c;
import p215o4.C2805d;
import p222q0.C2901b;
import p223q1.InterfaceC2909c;

/* JADX INFO: renamed from: A.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0072l0 implements InterfaceC2721t, InterfaceC1970a, InterfaceC1998e, InterfaceC2909c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f306d;

    /* JADX INFO: renamed from: e */
    public Object f307e;

    /* JADX INFO: renamed from: f */
    public Object f308f;

    /* JADX INFO: renamed from: g */
    public Object f309g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0072l0(Object obj, Object obj2, Object obj3, int i5) {
        this.f306d = i5;
        this.f307e = obj;
        this.f308f = obj2;
        this.f309g = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public void m96B() {
        C2408E c2408e = (C2408E) this.f307e;
        String str = (String) this.f308f;
        List list = (List) c2408e.m4276k(str);
        if (list != null) {
            list.remove((InterfaceC1599a) this.f309g);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c2408e.m4278m(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p223q1.InterfaceC2909c
    /* JADX INFO: renamed from: a */
    public boolean mo97a(Object obj) {
        if (obj instanceof InterfaceC2601b) {
            ((InterfaceC2601b) obj).mo2253b().f8275a = true;
        }
        switch (((C2475a) this.f308f).f7966d) {
            case 5:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C0793k) this.f309g).mo97a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p148d2.InterfaceC1970a
    /* JADX INFO: renamed from: b */
    public InterfaceC1194D mo98b(InterfaceC1194D interfaceC1194D, C1147i c1147i) {
        Drawable drawable = (Drawable) interfaceC1194D.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0236c) this.f308f).mo98b(C1743d.m3099b((InterfaceC1289a) this.f307e, ((BitmapDrawable) drawable).getBitmap()), c1147i);
        }
        if (drawable instanceof C1892c) {
            return ((C1972c) this.f309g).mo98b(interfaceC1194D, c1147i);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p223q1.InterfaceC2909c
    /* JADX INFO: renamed from: c */
    public Object mo99c() {
        Object objMo99c = ((C0793k) this.f309g).mo99c();
        if (objMo99c == null) {
            objMo99c = ((InterfaceC2600a) this.f307e).mo67f();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objMo99c.getClass());
            }
        }
        if (objMo99c instanceof InterfaceC2601b) {
            ((InterfaceC2601b) objMo99c).mo2253b().f8275a = false;
        }
        return objMo99c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public synchronized void m100d(InterfaceC1144f interfaceC1144f, C1222w c1222w) {
        C1201b c1201b = (C1201b) ((HashMap) this.f307e).put(interfaceC1144f, new C1201b(interfaceC1144f, c1222w, (ReferenceQueue) this.f308f));
        if (c1201b != null) {
            c1201b.f3948c = null;
            c1201b.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m101e(C0564I c0564i, EnumC0621u enumC0621u) {
        C0066i0 c0066i0 = (C0066i0) this.f307e;
        C0066i0 c0066i02 = (C0066i0) this.f308f;
        C0066i0 c0066i03 = (C0066i0) this.f309g;
        int iOrdinal = enumC0621u.ordinal();
        if (iOrdinal == 0) {
            c0066i0.m65d(c0564i);
            c0066i03.m65d(c0564i);
            return;
        }
        if (iOrdinal == 1) {
            c0066i02.m65d(c0564i);
            c0066i03.m65d(c0564i);
            return;
        }
        if (iOrdinal == 2) {
            if (c0564i.f1719l != null) {
                c0066i03.m65d(c0564i);
                return;
            } else {
                c0066i0.m65d(c0564i);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new C0330q();
        }
        if (c0564i.f1719l != null) {
            c0066i03.m65d(c0564i);
        } else {
            c0066i02.m65d(c0564i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m102f(C1201b c1201b) {
        InterfaceC1194D interfaceC1194D;
        synchronized (this) {
            ((HashMap) this.f307e).remove(c1201b.f3946a);
            if (c1201b.f3947b && (interfaceC1194D = c1201b.f3948c) != null) {
                ((C1214o) this.f309g).m2294e(c1201b.f3946a, new C1222w(interfaceC1194D, true, false, c1201b.f3946a, (C1214o) this.f309g));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public boolean m103g(C0564I c0564i) {
        return !(c0564i.f1719l == null) && (((C0550A0) ((C0066i0) this.f307e).f297e).contains(c0564i) || ((C0550A0) ((C0066i0) this.f308f).f297e).contains(c0564i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public Bitmap m104h(BitmapFactory.Options options) throws Throwable {
        switch (this.f306d) {
            case 10:
                return AbstractC1759t.m3135b(new C2497a(AbstractC2498b.m4440c((ByteBuffer) this.f307e)), options, this);
            case 11:
                C1733A c1733a = (C1733A) ((C1937g) this.f307e).f6571e;
                c1733a.reset();
                return AbstractC1759t.m3135b(c1733a, options, this);
            default:
                FileDescriptor fileDescriptor = ((C1937g) this.f309g).m3600e().getFileDescriptor();
                int i5 = Build.VERSION.SDK_INT;
                Bitmap bitmapM3137d = null;
                if (i5 == 34) {
                    if (((i5 == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC1759t.f6052b.get()).booleanValue() : false) && AbstractC1759t.m3136c(this)) {
                        Bitmap.Config config = options.inPreferredConfig;
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        AbstractC2503g.m4443a("", config == config2);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            if (bitmapDecodeFileDescriptor == null) {
                                if (bitmapDecodeFileDescriptor != null) {
                                }
                                options.inPreferredConfig = config2;
                                return bitmapM3137d;
                            }
                            try {
                                bitmapM3137d = AbstractC1759t.m3137d(bitmapDecodeFileDescriptor);
                            } catch (Throwable th) {
                                th = th;
                                bitmapM3137d = bitmapDecodeFileDescriptor;
                                if (bitmapM3137d != null) {
                                    bitmapM3137d.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                            break;
                            bitmapDecodeFileDescriptor.recycle();
                            options.inPreferredConfig = config2;
                            return bitmapM3137d;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public Object m105i() {
        long jM3313b = AbstractC1848j.m3313b();
        if (jM3313b == AbstractC1851m.f6272a) {
            return this.f309g;
        }
        C1850l c1850l = (C1850l) ((AtomicReference) this.f307e).get();
        int iM3323a = c1850l.m3323a(jM3313b);
        if (iM3323a >= 0) {
            return c1850l.f6271c[iM3323a];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public InterfaceC2760s m106j() {
        return ((C2901b) this.f309g).f9184d.f9182c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public C1781b m107k() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C1577b) this.f309g)) {
            try {
                C1781b c1781b = (C1781b) this.f308f;
                if (c1781b != null && localeList == ((LocaleList) this.f307e)) {
                    return c1781b;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(new C1780a(localeList.get(i5)));
                }
                C1781b c1781b2 = new C1781b(arrayList);
                this.f307e = localeList;
                this.f308f = c1781b2;
                return c1781b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public ImageHeaderParser$ImageType m108l() throws Throwable {
        switch (this.f306d) {
            case 10:
                return AbstractC1922d.m3439v((List) this.f308f, AbstractC2498b.m4440c((ByteBuffer) this.f307e));
            case 11:
                List list = (List) this.f309g;
                C1733A c1733a = (C1733A) ((C1937g) this.f307e).f6571e;
                c1733a.reset();
                return AbstractC1922d.m3438u(list, c1733a, (C1294f) this.f308f);
            default:
                List list2 = (List) this.f308f;
                C1937g c1937g = (C1937g) this.f309g;
                C1294f c1294f = (C1294f) this.f307e;
                int size = list2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    InterfaceC1143e interfaceC1143e = (InterfaceC1143e) list2.get(i5);
                    C1733A c1733a2 = null;
                    try {
                        C1733A c1733a3 = new C1733A(new FileInputStream(c1937g.m3600e().getFileDescriptor()), c1294f);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2197e = interfaceC1143e.mo2197e(c1733a3);
                            c1733a3.m3091c();
                            c1937g.m3600e();
                            if (imageHeaderParser$ImageTypeMo2197e != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo2197e;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c1733a2 = c1733a3;
                            if (c1733a2 != null) {
                                c1733a2.m3091c();
                            }
                            c1937g.m3600e();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public C0074m0 m109m() {
        C0074m0 c0074m0 = (C0074m0) this.f308f;
        if (c0074m0 != null) {
            return c0074m0;
        }
        AbstractC1665j.m2991k("keyboardActions");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public long m110n() {
        return ((C2901b) this.f309g).f9184d.f9183d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[INVOKE, IGET] complete}, expected: {[INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: o */
    public boolean m111o() throws Throwable {
        switch (this.f306d) {
            case 10:
                List list = (List) this.f308f;
                ByteBuffer byteBufferM4440c = AbstractC2498b.m4440c((ByteBuffer) this.f307e);
                C1294f c1294f = (C1294f) this.f309g;
                if (byteBufferM4440c == null) {
                    return false;
                }
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    try {
                        if (((InterfaceC1143e) list.get(i5)).mo2195c(byteBufferM4440c, c1294f)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 11:
                List list2 = (List) this.f309g;
                C1733A c1733a = (C1733A) ((C1937g) this.f307e).f6571e;
                c1733a.reset();
                C1294f c1294f2 = (C1294f) this.f308f;
                c1733a.mark(5242880);
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    try {
                        boolean zMo2198f = ((InterfaceC1143e) list2.get(i6)).mo2198f(c1733a, c1294f2);
                        c1733a.reset();
                        if (zMo2198f) {
                            return true;
                        }
                    } catch (Throwable th) {
                        c1733a.reset();
                        throw th;
                    }
                }
                return false;
            default:
                List list3 = (List) this.f308f;
                C1937g c1937g = (C1937g) this.f309g;
                C1294f c1294f3 = (C1294f) this.f307e;
                int size3 = list3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    InterfaceC1143e interfaceC1143e = (InterfaceC1143e) list3.get(i7);
                    C1733A c1733a2 = null;
                    try {
                        C1733A c1733a3 = new C1733A(new FileInputStream(c1937g.m3600e().getFileDescriptor()), c1294f3);
                        try {
                            boolean zMo2198f2 = interfaceC1143e.mo2198f(c1733a3, c1294f3);
                            c1733a3.m3091c();
                            c1937g.m3600e();
                            if (zMo2198f2) {
                                return true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c1733a2 = c1733a3;
                            if (c1733a2 != null) {
                                c1733a2.m3091c();
                            }
                            c1937g.m3600e();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2721t
    /* JADX INFO: renamed from: p */
    public InterfaceC2720s mo47p() {
        return (C2715n) this.f309g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2721t
    /* JADX INFO: renamed from: q */
    public InterfaceC2722u mo48q() {
        return (C2716o) this.f308f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public boolean m112r() {
        return !(((C0550A0) ((C0066i0) this.f307e).f297e).isEmpty() && ((C0550A0) ((C0066i0) this.f309g).f297e).isEmpty() && ((C0550A0) ((C0066i0) this.f308f).f297e).isEmpty());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public boolean m113s() {
        if (((InterfaceC1339T0) this.f307e).getValue() != this.f309g) {
            return true;
        }
        C0072l0 c0072l0 = (C0072l0) this.f308f;
        return c0072l0 != null && c0072l0.m113s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public boolean m114t(int i5) {
        InterfaceC0686N0 interfaceC0686N0;
        if (i5 == 7 || i5 == 2 || i5 == 6 || i5 == 5 || i5 == 3 || i5 == 4) {
            m109m();
        } else if (i5 != 1 && i5 != 0) {
            throw new IllegalStateException("invalid ImeAction");
        }
        if (i5 == 6) {
            InterfaceC2581l interfaceC2581l = (InterfaceC2581l) this.f309g;
            if (interfaceC2581l != null) {
                ((C2584o) interfaceC2581l).m4532g(1, true);
                return true;
            }
            AbstractC1665j.m2991k("focusManager");
            throw null;
        }
        if (i5 != 5) {
            if (i5 != 7 || (interfaceC0686N0 = (InterfaceC0686N0) this.f307e) == null) {
                return false;
            }
            ((C0761s0) interfaceC0686N0).m1273a();
            return true;
        }
        InterfaceC2581l interfaceC2581l2 = (InterfaceC2581l) this.f309g;
        if (interfaceC2581l2 != null) {
            ((C2584o) interfaceC2581l2).m4532g(2, true);
            return true;
        }
        AbstractC1665j.m2991k("focusManager");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public void m115u(Object obj) {
        long jM3313b = AbstractC1848j.m3313b();
        if (jM3313b == AbstractC1851m.f6272a) {
            this.f309g = obj;
            return;
        }
        synchronized (this.f308f) {
            C1850l c1850l = (C1850l) ((AtomicReference) this.f307e).get();
            int iM3323a = c1850l.m3323a(jM3313b);
            if (iM3323a < 0) {
                ((AtomicReference) this.f307e).set(c1850l.m3324b(jM3313b, obj));
            } else {
                c1850l.f6271c[iM3323a] = obj;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public void m116v(InterfaceC2760s interfaceC2760s) {
        ((C2901b) this.f309g).f9184d.f9182c = interfaceC2760s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public void m117w(InterfaceC2007c interfaceC2007c) {
        ((C2901b) this.f309g).f9184d.f9180a = interfaceC2007c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public void m118x(EnumC2017m enumC2017m) {
        ((C2901b) this.f309g).f9184d.f9181b = enumC2017m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public void m119y(long j5) {
        ((C2901b) this.f309g).f9184d.f9183d = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0072l0(C1390u0 c1390u0) {
        this.f306d = 7;
        this.f307e = new C1839a(0);
        this.f308f = new C0240b(5);
        this.f309g = new C0073m(12, this, c1390u0);
    }

    public C0072l0(C0173F c0173f) {
        this.f306d = 17;
        this.f307e = c0173f;
        this.f308f = AbstractC2352g.m4199l((C2805d) c0173f.f614g);
        C2804c c2804c = (C2804c) c0173f.f615h;
        AbstractC1665j.m2985e(c2804c, "<this>");
        this.f309g = new C2715n(c2804c);
    }

    public C0072l0(InterfaceC0686N0 interfaceC0686N0) {
        this.f306d = 0;
        this.f307e = interfaceC0686N0;
    }

    public C0072l0(View view) {
        this.f306d = 8;
        this.f307e = view;
        this.f308f = AbstractC0797o.m1395t(EnumC0880f.f2767e, new C0102b(9, this));
        this.f309g = new C1753n(view);
    }

    public C0072l0(C2901b c2901b) {
        this.f306d = 21;
        this.f309g = c2901b;
        this.f307e = new C1753n(21, this);
    }

    public C0072l0(int i5) {
        this.f306d = i5;
        switch (i5) {
            case 3:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC1200a());
                this.f307e = new HashMap();
                this.f308f = new ReferenceQueue();
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0766v(2, this));
                break;
            case 5:
                break;
            case 9:
                String string = UUID.randomUUID().toString();
                AbstractC1665j.m2984d(string, "toString(...)");
                C2709h c2709h = C2709h.f8630g;
                this.f307e = C2475a.m4416e(string);
                this.f308f = C1713w.f5884f;
                this.f309g = new ArrayList();
                break;
            case 13:
                this.f309g = new C1577b(11);
                break;
            case 15:
                this.f307e = new WeakHashMap();
                this.f308f = new WeakHashMap();
                this.f309g = new WeakHashMap();
                break;
            case 16:
                this.f307e = new AtomicReference(AbstractC1848j.f6257b);
                this.f308f = new Object();
                break;
            case 23:
                long[] jArr = AbstractC2415L.f7816a;
                this.f307e = new C2408E();
                break;
            default:
                this.f307e = new C0066i0(5);
                this.f308f = new C0066i0(5);
                this.f309g = new C0066i0(5);
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    private final void m94A() {
    }

    /* JADX INFO: renamed from: z */
    private final void m95z() {
    }

    public C0072l0(C0793k c0793k, InterfaceC2600a interfaceC2600a, C2475a c2475a) {
        this.f306d = 20;
        this.f309g = c0793k;
        this.f307e = interfaceC2600a;
        this.f308f = c2475a;
    }

    public C0072l0(C1594s c1594s, C0072l0 c0072l0) {
        this.f306d = 14;
        this.f307e = c1594s;
        this.f308f = c0072l0;
        this.f309g = c1594s.f5520d;
    }

    public C0072l0(C2508l c2508l, ArrayList arrayList, C1294f c1294f) {
        this.f306d = 11;
        AbstractC2503g.m4445c(c1294f, "Argument must not be null");
        this.f308f = c1294f;
        AbstractC2503g.m4445c(arrayList, "Argument must not be null");
        this.f309g = arrayList;
        this.f307e = new C1937g(c2508l, c1294f);
    }

    public C0072l0(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C1294f c1294f) {
        this.f306d = 12;
        AbstractC2503g.m4445c(c1294f, "Argument must not be null");
        this.f307e = c1294f;
        AbstractC2503g.m4445c(arrayList, "Argument must not be null");
        this.f308f = arrayList;
        this.f309g = new C1937g(parcelFileDescriptor);
    }

    public C0072l0(C1214o c1214o, C2239f c2239f, C1218s c1218s) {
        this.f306d = 6;
        this.f309g = c1214o;
        this.f308f = c2239f;
        this.f307e = c1218s;
    }
}
