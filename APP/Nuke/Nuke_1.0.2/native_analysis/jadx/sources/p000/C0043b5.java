package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0100a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0043b5 implements ys2, n92, a22, tf2, nh2, ec2, rh2 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f561h;

    /* JADX INFO: renamed from: i */
    public Object f562i;

    /* JADX INFO: renamed from: j */
    public Object f563j;

    /* JADX INFO: renamed from: k */
    public Object f564k;

    public C0043b5(int i) {
        this.f561h = i;
        int i2 = 1;
        switch (i) {
            case 1:
                this.f564k = new ix2(i2);
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                break;
            case 7:
                this.f562i = new C0485n4(11);
                this.f563j = new C0485n4(11);
                this.f564k = new C0485n4(11);
                break;
            case 12:
                this.f562i = new rk1();
                break;
            case 21:
                String string = UUID.randomUUID().toString();
                string.getClass();
                C0505no c0505no = C0505no.f7266k;
                this.f562i = C0160eb.m1321z(string);
                this.f563j = uj1.f11325f;
                this.f564k = new ArrayList();
                break;
            case 25:
                long[] jArr = ed2.f2401a;
                this.f562i = new rk1();
                break;
            case 29:
                this.f562i = new AtomicReference(ci0.f1569y);
                this.f563j = new Object();
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0949z4(0));
                this.f562i = new HashMap();
                this.f563j = new ReferenceQueue();
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0910y4(1, this));
                break;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m409x(C0043b5 c0043b5, ph2 ph2Var, String str, String str2, Throwable th, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        c0043b5.getClass();
        Instant instant = ((Clock) c0043b5.f562i).instant();
        instant.getClass();
        c0043b5.mo419f(new qh2(instant, ph2Var, sh2.f10146i, str, str2, null, th));
    }

    /* JADX INFO: renamed from: A */
    public void m410A(Object obj) {
        long jM5656b = v93.m5656b();
        if (jM5656b == e23.f2300a) {
            this.f564k = obj;
            return;
        }
        synchronized (this.f563j) {
            b23 b23Var = (b23) ((AtomicReference) this.f562i).get();
            int iM360a = b23Var.m360a(jM5656b);
            if (iM360a < 0) {
                ((AtomicReference) this.f562i).set(b23Var.m361b(jM5656b, obj));
            } else {
                b23Var.f541c[iM360a] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m411B(InterfaceC0627qp interfaceC0627qp) {
        ((C0702sp) this.f564k).f10256h.f9667c = interfaceC0627qp;
    }

    /* JADX INFO: renamed from: C */
    public void m412C(e70 e70Var) {
        ((C0702sp) this.f564k).f10256h.f9665a = e70Var;
    }

    /* JADX INFO: renamed from: D */
    public void m413D(d61 d61Var) {
        ((C0702sp) this.f564k).f10256h.f9666b = d61Var;
    }

    /* JADX INFO: renamed from: E */
    public void m414E(long j) {
        ((C0702sp) this.f564k).f10256h.f9668d = j;
    }

    /* JADX INFO: renamed from: H */
    public void m415H() {
        rk1 rk1Var = (rk1) this.f562i;
        String str = (String) this.f563j;
        List list = (List) rk1Var.m4509k(str);
        if (list != null) {
            list.remove((xm0) this.f564k);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        rk1Var.m4511m(str, list);
    }

    @Override // p000.a22
    /* JADX INFO: renamed from: a */
    public boolean mo18a(Object obj) {
        if (obj instanceof th0) {
            ((th0) obj).mo1602c().f10375a = true;
        }
        switch (((C0160eb) this.f563j).f2378h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C0158e9) this.f564k).mo18a(obj);
    }

    @Override // p000.nh2
    /* JADX INFO: renamed from: b */
    public Object mo416b(lh2 lh2Var) {
        m437y(lh2Var.f6121a);
        return (Context) this.f564k;
    }

    @Override // p000.a22
    /* JADX INFO: renamed from: c */
    public Object mo19c() {
        Object objMo19c = ((C0158e9) this.f564k).mo19c();
        if (objMo19c == null) {
            objMo19c = ((sh0) this.f562i).mo2447k();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objMo19c.getClass());
            }
        }
        if (objMo19c instanceof th0) {
            ((th0) objMo19c).mo1602c().f10375a = false;
        }
        return objMo19c;
    }

    @Override // p000.nh2
    /* JADX INFO: renamed from: d */
    public Object mo417d(lh2 lh2Var) {
        m437y(lh2Var.f6121a);
        return (ClassLoader) this.f563j;
    }

    @Override // p000.nh2
    /* JADX INFO: renamed from: e */
    public Class mo418e(lh2 lh2Var, String str) throws ClassNotFoundException {
        str.getClass();
        m437y(lh2Var.f6121a);
        Class<?> cls = Class.forName(str, false, (ClassLoader) this.f563j);
        cls.getClass();
        return cls;
    }

    @Override // p000.rh2
    /* JADX INFO: renamed from: f */
    public void mo419f(qh2 qh2Var) {
        ((lq2) this.f564k).m2963p(qh2Var);
        try {
            ((rh2) this.f563j).mo419f(qh2Var);
        } catch (Exception unused) {
        }
    }

    @Override // p000.tf2
    /* JADX INFO: renamed from: g */
    public Object mo420g(String str, t00 t00Var) {
        return AbstractC0570p7.m3762R((c20) this.f562i, new u30(this, str, null, 1), t00Var);
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m421h(a51 a51Var, hf0 hf0Var) {
        C0006a5 c0006a5 = (C0006a5) ((HashMap) this.f562i).put(a51Var, new C0006a5(a51Var, hf0Var, (ReferenceQueue) this.f563j));
        if (c0006a5 != null) {
            c0006a5.f61c = null;
            c0006a5.clear();
        }
    }

    @Override // p000.n92
    /* JADX INFO: renamed from: i */
    public d92 mo422i(d92 d92Var, ov1 ov1Var) {
        Drawable drawable = (Drawable) d92Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0133dk) this.f563j).mo422i(C0022al.m188c((InterfaceC0965zk) this.f562i, ((BitmapDrawable) drawable).getBitmap()), ov1Var);
        }
        if (drawable instanceof yo0) {
            return ((C0160eb) this.f564k).mo422i(d92Var, ov1Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m423j(r61 r61Var, a21 a21Var) {
        C0485n4 c0485n4 = (C0485n4) this.f562i;
        C0485n4 c0485n42 = (C0485n4) this.f563j;
        C0485n4 c0485n43 = (C0485n4) this.f564k;
        int iOrdinal = a21Var.ordinal();
        if (iOrdinal == 0) {
            c0485n4.m3236h(r61Var);
            c0485n43.m3236h(r61Var);
            return;
        }
        if (iOrdinal == 1) {
            c0485n42.m3236h(r61Var);
            c0485n43.m3236h(r61Var);
            return;
        }
        if (iOrdinal == 2) {
            if (r61Var.f9391o != null) {
                c0485n43.m3236h(r61Var);
                return;
            } else {
                c0485n4.m3236h(r61Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            c80.m675s();
        } else if (r61Var.f9391o != null) {
            c0485n43.m3236h(r61Var);
        } else {
            c0485n42.m3236h(r61Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m424k(C0006a5 c0006a5) {
        d92 d92Var;
        synchronized (this) {
            ((HashMap) this.f562i).remove(c0006a5.f59a);
            if (c0006a5.f60b && (d92Var = c0006a5.f61c) != null) {
                ((bf0) this.f564k).m527f(c0006a5.f59a, new hf0(d92Var, true, false, c0006a5.f59a, (bf0) this.f564k));
            }
        }
    }

    @Override // p000.ys2
    /* JADX INFO: renamed from: l */
    public fr2 mo425l() {
        return (n52) this.f564k;
    }

    /* JADX INFO: renamed from: m */
    public boolean m426m(r61 r61Var) {
        return !(r61Var.f9391o == null) && (((gt2) ((C0485n4) this.f562i).f6983i).contains(r61Var) || ((gt2) ((C0485n4) this.f563j).f6983i).contains(r61Var));
    }

    @Override // p000.ys2
    /* JADX INFO: renamed from: n */
    public ht2 mo427n() {
        return (o52) this.f563j;
    }

    /* JADX INFO: renamed from: o */
    public Bitmap m428o(BitmapFactory.Options options) throws Throwable {
        switch (this.f561h) {
            case 14:
                return gf1.m1900r(new C0357jo(AbstractC0431lo.m2952c((ByteBuffer) this.f562i)), options, this);
            case 15:
                r62 r62Var = (r62) ((C0485n4) this.f562i).f6983i;
                r62Var.reset();
                return gf1.m1900r(r62Var, options, this);
            default:
                FileDescriptor fileDescriptor = ((C0100a) this.f564k).m871a().getFileDescriptor();
                Bitmap bitmapM1871S = null;
                if (Build.VERSION.SDK_INT != 34 || !AbstractC0691se.m4851v(options) || !gf1.m1854B(this)) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                Bitmap.Config config = options.inPreferredConfig;
                Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                fg1.m1640o("", config == config2);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (bitmapDecodeFileDescriptor == null) {
                        if (bitmapDecodeFileDescriptor != null) {
                        }
                        options.inPreferredConfig = config2;
                        return bitmapM1871S;
                    }
                    try {
                        bitmapM1871S = gf1.m1871S(bitmapDecodeFileDescriptor);
                    } catch (Throwable th) {
                        th = th;
                        bitmapM1871S = bitmapDecodeFileDescriptor;
                        if (bitmapM1871S != null) {
                            bitmapM1871S.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                    break;
                    bitmapDecodeFileDescriptor.recycle();
                    options.inPreferredConfig = config2;
                    return bitmapM1871S;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public Object m429p() {
        long jM5656b = v93.m5656b();
        if (jM5656b == e23.f2300a) {
            return this.f564k;
        }
        b23 b23Var = (b23) ((AtomicReference) this.f562i).get();
        int iM360a = b23Var.m360a(jM5656b);
        if (iM360a >= 0) {
            return b23Var.f541c[iM360a];
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC0627qp m430q() {
        return ((C0702sp) this.f564k).f10256h.f9667c;
    }

    /* JADX INFO: renamed from: r */
    public kc1 m431r() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((ix2) this.f564k)) {
            try {
                kc1 kc1Var = (kc1) this.f563j;
                if (kc1Var != null && localeList == ((LocaleList) this.f562i)) {
                    return kc1Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new jc1(localeList.get(i)));
                }
                kc1 kc1Var2 = new kc1(arrayList);
                this.f562i = localeList;
                this.f563j = kc1Var2;
                return kc1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public ImageHeaderParser$ImageType m432s() throws Throwable {
        switch (this.f561h) {
            case 14:
                return AbstractC0691se.m4821J((List) this.f563j, AbstractC0431lo.m2952c((ByteBuffer) this.f562i));
            case 15:
                List list = (List) this.f564k;
                r62 r62Var = (r62) ((C0485n4) this.f562i).f6983i;
                r62Var.reset();
                return AbstractC0691se.m4820I(list, r62Var, (td1) this.f563j);
            default:
                List list2 = (List) this.f563j;
                C0100a c0100a = (C0100a) this.f564k;
                td1 td1Var = (td1) this.f562i;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    kx0 kx0Var = (kx0) list2.get(i);
                    r62 r62Var2 = null;
                    try {
                        r62 r62Var3 = new r62(new FileInputStream(c0100a.m871a().getFileDescriptor()), td1Var);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2758f = kx0Var.mo2758f(r62Var3);
                            r62Var3.m4397c();
                            c0100a.m871a();
                            if (imageHeaderParser$ImageTypeMo2758f != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo2758f;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r62Var2 = r62Var3;
                            if (r62Var2 != null) {
                                r62Var2.m4397c();
                            }
                            c0100a.m871a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: t */
    public k51 m433t() {
        k51 k51Var = (k51) this.f563j;
        if (k51Var != null) {
            return k51Var;
        }
        t11.m5067S("keyboardActions");
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public long m434u() {
        return ((C0702sp) this.f564k).f10256h.f9668d;
    }

    /* JADX INFO: renamed from: v */
    public boolean m435v() {
        switch (this.f561h) {
            case 14:
                List list = (List) this.f563j;
                ByteBuffer byteBufferM2952c = AbstractC0431lo.m2952c((ByteBuffer) this.f562i);
                td1 td1Var = (td1) this.f564k;
                if (byteBufferM2952c == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((kx0) list.get(i)).mo2755c(byteBufferM2952c, td1Var)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 15:
                List list2 = (List) this.f564k;
                r62 r62Var = (r62) ((C0485n4) this.f562i).f6983i;
                r62Var.reset();
                td1 td1Var2 = (td1) this.f563j;
                r62Var.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        if (((kx0) list2.get(i2)).mo2757e(r62Var, td1Var2)) {
                            return true;
                        }
                    } finally {
                        r62Var.reset();
                    }
                }
                return false;
            default:
                List list3 = (List) this.f563j;
                C0100a c0100a = (C0100a) this.f564k;
                td1 td1Var3 = (td1) this.f562i;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    kx0 kx0Var = (kx0) list3.get(i3);
                    r62 r62Var2 = null;
                    try {
                        r62 r62Var3 = new r62(new FileInputStream(c0100a.m871a().getFileDescriptor()), td1Var3);
                        try {
                            boolean zMo2757e = kx0Var.mo2757e(r62Var3, td1Var3);
                            r62Var3.m4397c();
                            c0100a.m871a();
                            if (zMo2757e) {
                                return true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r62Var2 = r62Var3;
                            if (r62Var2 != null) {
                                r62Var2.m4397c();
                            }
                            c0100a.m871a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m436w() {
        return !(((gt2) ((C0485n4) this.f562i).f6983i).isEmpty() && ((gt2) ((C0485n4) this.f564k).f6983i).isEmpty() && ((gt2) ((C0485n4) this.f563j).f6983i).isEmpty());
    }

    /* JADX INFO: renamed from: y */
    public void m437y(String str) {
        boolean zContainsKey;
        kj1 kj1Var = (kj1) this.f562i;
        kj1Var.getClass();
        str.getClass();
        synchronized (kj1Var.f5595j) {
            zContainsKey = kj1Var.m2700D().containsKey(str);
        }
        if (!zContainsKey) {
            throw new eh2(12, "PERMISSION_DENIED", "Host runtime access has been revoked for this script.", null);
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m438z(int i) {
        bt2 bt2Var;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            m433t();
        } else if (i != 1 && i != 0) {
            C0676s.m4653l("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            yk0 yk0Var = (yk0) this.f564k;
            if (yk0Var != null) {
                ((bl0) yk0Var).m562g(1, true);
                return true;
            }
            t11.m5067S("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (bt2Var = (bt2) this.f562i) == null) {
                return false;
            }
            ((v60) bt2Var).m5625a();
            return true;
        }
        yk0 yk0Var2 = (yk0) this.f564k;
        if (yk0Var2 != null) {
            ((bl0) yk0Var2).m562g(2, true);
            return true;
        }
        t11.m5067S("focusManager");
        throw null;
    }

    /* JADX INFO: renamed from: F */
    private final void m407F() {
    }

    /* JADX INFO: renamed from: G */
    private final void m408G() {
    }

    public /* synthetic */ C0043b5(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f561h = i;
        this.f564k = obj;
        this.f562i = obj2;
        this.f563j = obj3;
    }

    public C0043b5(kj1 kj1Var, ClassLoader classLoader, Context context) {
        this.f561h = 24;
        kj1Var.getClass();
        this.f562i = kj1Var;
        this.f563j = classLoader;
        this.f564k = context;
    }

    public C0043b5(File file) {
        this.f561h = 13;
        c60 c60Var = o90.f7590a;
        t50 t50Var = t50.f10560j;
        t50Var.getClass();
        this.f562i = t50Var;
        this.f563j = file.getAbsoluteFile();
        this.f564k = AbstractC0691se.m4844o(new C0251gs(20));
    }

    public C0043b5(c62 c62Var) {
        this.f561h = 23;
        this.f562i = new C0885xg(0);
        this.f563j = new C0093cj(0);
        this.f564k = new C0640r1(24, this, c62Var);
    }

    public /* synthetic */ C0043b5(Object obj, Object obj2, Object obj3, int i) {
        this.f561h = i;
        this.f562i = obj;
        this.f563j = obj2;
        this.f564k = obj3;
    }

    public C0043b5(kj1 kj1Var) {
        this.f561h = 3;
        this.f562i = kj1Var;
        g60 g60Var = (g60) kj1Var.f5596k;
        g60Var.getClass();
        this.f563j = new o52(g60Var);
        f60 f60Var = (f60) kj1Var.f5597l;
        f60Var.getClass();
        this.f564k = new n52(f60Var);
    }

    public C0043b5(bt2 bt2Var) {
        this.f561h = 18;
        this.f562i = bt2Var;
    }

    public C0043b5(Clock clock, int i) {
        this.f561h = 28;
        if ((i & 1) != 0) {
            clock = Clock.systemUTC();
            clock.getClass();
        }
        c80 c80Var = C0700sn.f10213Q;
        this.f562i = clock;
        this.f563j = c80Var;
        lq2 lq2VarM3768d = AbstractC0570p7.m3768d(100, 256, EnumC0283hn.f4085i);
        this.f564k = lq2VarM3768d;
        new k52(lq2VarM3768d);
    }

    public C0043b5(C0043b5 c0043b5) {
        this.f561h = 2;
        C0058bk c0058bk = (C0058bk) c0043b5.f562i;
        int iM552h = c0058bk.m552h();
        this.f562i = new C0898xt[iM552h];
        this.f563j = new C0898xt[iM552h];
        this.f564k = new C0898xt[iM552h];
        int length = c0058bk.f5590i.length;
        for (int i = 0; i < length; i++) {
            C0964zj c0964zj = (C0964zj) c0058bk.m2693e(i);
            j01 j01Var = c0964zj.f13926b;
            int i2 = c0964zj.f13925a;
            ((C0898xt[]) this.f562i)[i2] = new C0898xt(((i01) j01Var.m2693e(0)).f4203i);
            kt2 kt2Var = j01Var.m2426h().f4203i;
            ((C0898xt[]) this.f563j)[i2] = new C0898xt(kt2Var);
            ((C0898xt[]) this.f564k)[i2] = new C0898xt(kt2Var);
        }
    }

    public C0043b5(C0058bk c0058bk) {
        this.f561h = 26;
        this.f562i = c0058bk;
        this.f563j = null;
        this.f564k = null;
    }

    public C0043b5(View view) {
        this.f561h = 17;
        this.f562i = view;
        this.f563j = AbstractC0570p7.m3746B(i91.f4498i, new C0159ea(11, this));
        this.f564k = new hh1(view);
    }

    public C0043b5(C0702sp c0702sp) {
        this.f561h = 4;
        this.f564k = c0702sp;
        this.f562i = new C0485n4(3, this);
    }

    public C0043b5(ye1 ye1Var, ArrayList arrayList, td1 td1Var) {
        this.f561h = 15;
        fg1.m1642q("Argument must not be null", td1Var);
        this.f563j = td1Var;
        fg1.m1642q("Argument must not be null", arrayList);
        this.f564k = arrayList;
        this.f562i = new C0485n4(ye1Var, td1Var);
    }

    public C0043b5(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, td1 td1Var) {
        this.f561h = 16;
        fg1.m1642q("Argument must not be null", td1Var);
        this.f562i = td1Var;
        fg1.m1642q("Argument must not be null", arrayList);
        this.f563j = arrayList;
        this.f564k = new C0100a(parcelFileDescriptor);
    }

    public C0043b5(bf0 bf0Var, yq2 yq2Var, ff0 ff0Var) {
        this.f561h = 10;
        this.f564k = bf0Var;
        this.f563j = yq2Var;
        this.f562i = ff0Var;
    }
}
