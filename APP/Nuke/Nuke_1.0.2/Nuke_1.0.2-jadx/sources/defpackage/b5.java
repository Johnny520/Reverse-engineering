package defpackage;

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
import com.bumptech.glide.load.data.a;
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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b5 implements ys2, n92, a22, tf2, nh2, ec2, rh2 {
    public final /* synthetic */ int h;
    public Object i;
    public Object j;
    public Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b5(int i) {
        this.h = i;
        int i2 = 1;
        switch (i) {
            case 1:
                this.k = new ix2(i2);
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                break;
            case 7:
                this.i = new n4(11);
                this.j = new n4(11);
                this.k = new n4(11);
                break;
            case 12:
                this.i = new rk1();
                break;
            case 21:
                String string = UUID.randomUUID().toString();
                string.getClass();
                no noVar = no.k;
                this.i = eb.z(string);
                this.j = uj1.f;
                this.k = new ArrayList();
                break;
            case 25:
                long[] jArr = ed2.a;
                this.i = new rk1();
                break;
            case 29:
                this.i = new AtomicReference(ci0.y);
                this.j = new Object();
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new z4(0));
                this.i = new HashMap();
                this.j = new ReferenceQueue();
                executorServiceNewSingleThreadExecutor.execute(new y4(1, this));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void x(b5 b5Var, ph2 ph2Var, String str, String str2, Throwable th, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        b5Var.getClass();
        Instant instant = ((Clock) b5Var.i).instant();
        instant.getClass();
        b5Var.f(new qh2(instant, ph2Var, sh2.i, str, str2, null, th));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A(Object obj) {
        long jB = v93.b();
        if (jB == e23.a) {
            this.k = obj;
            return;
        }
        synchronized (this.j) {
            b23 b23Var = (b23) ((AtomicReference) this.i).get();
            int iA = b23Var.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.i).set(b23Var.b(jB, obj));
            } else {
                b23Var.c[iA] = obj;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B(qp qpVar) {
        ((sp) this.k).h.c = qpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void C(e70 e70Var) {
        ((sp) this.k).h.a = e70Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void D(d61 d61Var) {
        ((sp) this.k).h.b = d61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void E(long j) {
        ((sp) this.k).h.d = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void H() {
        rk1 rk1Var = (rk1) this.i;
        String str = (String) this.j;
        List list = (List) rk1Var.k(str);
        if (list != null) {
            list.remove((xm0) this.k);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        rk1Var.m(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a22
    public boolean a(Object obj) {
        if (obj instanceof th0) {
            ((th0) obj).c().a = true;
        }
        switch (((eb) this.j).h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((e9) this.k).a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nh2
    public Object b(lh2 lh2Var) {
        y(lh2Var.a);
        return (Context) this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a22
    public Object c() {
        Object objC = ((e9) this.k).c();
        if (objC == null) {
            objC = ((sh0) this.i).k();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objC.getClass());
            }
        }
        if (objC instanceof th0) {
            ((th0) objC).c().a = false;
        }
        return objC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nh2
    public Object d(lh2 lh2Var) {
        y(lh2Var.a);
        return (ClassLoader) this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nh2
    public Class e(lh2 lh2Var, String str) throws ClassNotFoundException {
        str.getClass();
        y(lh2Var.a);
        Class<?> cls = Class.forName(str, false, (ClassLoader) this.j);
        cls.getClass();
        return cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rh2
    public void f(qh2 qh2Var) {
        ((lq2) this.k).p(qh2Var);
        try {
            ((rh2) this.j).f(qh2Var);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tf2
    public Object g(String str, t00 t00Var) {
        return p7.R((c20) this.i, new u30(this, str, null, 1), t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void h(a51 a51Var, hf0 hf0Var) {
        a5 a5Var = (a5) ((HashMap) this.i).put(a51Var, new a5(a51Var, hf0Var, (ReferenceQueue) this.j));
        if (a5Var != null) {
            a5Var.c = null;
            a5Var.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n92
    public d92 i(d92 d92Var, ov1 ov1Var) {
        Drawable drawable = (Drawable) d92Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((dk) this.j).i(al.c((zk) this.i, ((BitmapDrawable) drawable).getBitmap()), ov1Var);
        }
        if (drawable instanceof yo0) {
            return ((eb) this.k).i(d92Var, ov1Var);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j(r61 r61Var, a21 a21Var) {
        n4 n4Var = (n4) this.i;
        n4 n4Var2 = (n4) this.j;
        n4 n4Var3 = (n4) this.k;
        int iOrdinal = a21Var.ordinal();
        if (iOrdinal == 0) {
            n4Var.h(r61Var);
            n4Var3.h(r61Var);
            return;
        }
        if (iOrdinal == 1) {
            n4Var2.h(r61Var);
            n4Var3.h(r61Var);
            return;
        }
        if (iOrdinal == 2) {
            if (r61Var.o != null) {
                n4Var3.h(r61Var);
                return;
            } else {
                n4Var.h(r61Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            c80.s();
        } else if (r61Var.o != null) {
            n4Var3.h(r61Var);
        } else {
            n4Var2.h(r61Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(a5 a5Var) {
        d92 d92Var;
        synchronized (this) {
            ((HashMap) this.i).remove(a5Var.a);
            if (a5Var.b && (d92Var = a5Var.c) != null) {
                ((bf0) this.k).f(a5Var.a, new hf0(d92Var, true, false, a5Var.a, (bf0) this.k));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ys2
    public fr2 l() {
        return (n52) this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean m(r61 r61Var) {
        return !(r61Var.o == null) && (((gt2) ((n4) this.i).i).contains(r61Var) || ((gt2) ((n4) this.j).i).contains(r61Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ys2
    public ht2 n() {
        return (o52) this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Bitmap o(BitmapFactory.Options options) throws Throwable {
        switch (this.h) {
            case 14:
                return gf1.r(new jo(lo.c((ByteBuffer) this.i)), options, this);
            case 15:
                r62 r62Var = (r62) ((n4) this.i).i;
                r62Var.reset();
                return gf1.r(r62Var, options, this);
            default:
                FileDescriptor fileDescriptor = ((a) this.k).a().getFileDescriptor();
                Bitmap bitmapS = null;
                if (Build.VERSION.SDK_INT != 34 || !se.v(options) || !gf1.B(this)) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                Bitmap.Config config = options.inPreferredConfig;
                Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                fg1.o("", config == config2);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (bitmapDecodeFileDescriptor == null) {
                        if (bitmapDecodeFileDescriptor != null) {
                        }
                        options.inPreferredConfig = config2;
                        return bitmapS;
                    }
                    try {
                        bitmapS = gf1.S(bitmapDecodeFileDescriptor);
                    } catch (Throwable th) {
                        th = th;
                        bitmapS = bitmapDecodeFileDescriptor;
                        if (bitmapS != null) {
                            bitmapS.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                    break;
                    bitmapDecodeFileDescriptor.recycle();
                    options.inPreferredConfig = config2;
                    return bitmapS;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object p() {
        long jB = v93.b();
        if (jB == e23.a) {
            return this.k;
        }
        b23 b23Var = (b23) ((AtomicReference) this.i).get();
        int iA = b23Var.a(jB);
        if (iA >= 0) {
            return b23Var.c[iA];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qp q() {
        return ((sp) this.k).h.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kc1 r() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((ix2) this.k)) {
            try {
                kc1 kc1Var = (kc1) this.j;
                if (kc1Var != null && localeList == ((LocaleList) this.i)) {
                    return kc1Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new jc1(localeList.get(i)));
                }
                kc1 kc1Var2 = new kc1(arrayList);
                this.i = localeList;
                this.j = kc1Var2;
                return kc1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ImageHeaderParser$ImageType s() throws Throwable {
        switch (this.h) {
            case 14:
                return se.J((List) this.j, lo.c((ByteBuffer) this.i));
            case 15:
                List list = (List) this.k;
                r62 r62Var = (r62) ((n4) this.i).i;
                r62Var.reset();
                return se.I(list, r62Var, (td1) this.j);
            default:
                List list2 = (List) this.j;
                a aVar = (a) this.k;
                td1 td1Var = (td1) this.i;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    kx0 kx0Var = (kx0) list2.get(i);
                    r62 r62Var2 = null;
                    try {
                        r62 r62Var3 = new r62(new FileInputStream(aVar.a().getFileDescriptor()), td1Var);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeF = kx0Var.f(r62Var3);
                            r62Var3.c();
                            aVar.a();
                            if (imageHeaderParser$ImageTypeF != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeF;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r62Var2 = r62Var3;
                            if (r62Var2 != null) {
                                r62Var2.c();
                            }
                            aVar.a();
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
    public k51 t() {
        k51 k51Var = (k51) this.j;
        if (k51Var != null) {
            return k51Var;
        }
        t11.S("keyboardActions");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long u() {
        return ((sp) this.k).h.d;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, IGET]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean v() {
        switch (this.h) {
            case 14:
                List list = (List) this.j;
                ByteBuffer byteBufferC = lo.c((ByteBuffer) this.i);
                td1 td1Var = (td1) this.k;
                if (byteBufferC == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((kx0) list.get(i)).c(byteBufferC, td1Var)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 15:
                List list2 = (List) this.k;
                r62 r62Var = (r62) ((n4) this.i).i;
                r62Var.reset();
                td1 td1Var2 = (td1) this.j;
                r62Var.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        if (((kx0) list2.get(i2)).e(r62Var, td1Var2)) {
                            return true;
                        }
                    } finally {
                        r62Var.reset();
                    }
                }
                return false;
            default:
                List list3 = (List) this.j;
                a aVar = (a) this.k;
                td1 td1Var3 = (td1) this.i;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    kx0 kx0Var = (kx0) list3.get(i3);
                    r62 r62Var2 = null;
                    try {
                        r62 r62Var3 = new r62(new FileInputStream(aVar.a().getFileDescriptor()), td1Var3);
                        try {
                            boolean zE = kx0Var.e(r62Var3, td1Var3);
                            r62Var3.c();
                            aVar.a();
                            if (zE) {
                                return true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r62Var2 = r62Var3;
                            if (r62Var2 != null) {
                                r62Var2.c();
                            }
                            aVar.a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean w() {
        return !(((gt2) ((n4) this.i).i).isEmpty() && ((gt2) ((n4) this.k).i).isEmpty() && ((gt2) ((n4) this.j).i).isEmpty());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(String str) {
        boolean zContainsKey;
        kj1 kj1Var = (kj1) this.i;
        kj1Var.getClass();
        str.getClass();
        synchronized (kj1Var.j) {
            zContainsKey = kj1Var.D().containsKey(str);
        }
        if (!zContainsKey) {
            throw new eh2(12, "PERMISSION_DENIED", "Host runtime access has been revoked for this script.", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean z(int i) {
        bt2 bt2Var;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            t();
        } else if (i != 1 && i != 0) {
            s.l("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            yk0 yk0Var = (yk0) this.k;
            if (yk0Var != null) {
                ((bl0) yk0Var).g(1, true);
                return true;
            }
            t11.S("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (bt2Var = (bt2) this.i) == null) {
                return false;
            }
            ((v60) bt2Var).a();
            return true;
        }
        yk0 yk0Var2 = (yk0) this.k;
        if (yk0Var2 != null) {
            ((bl0) yk0Var2).g(2, true);
            return true;
        }
        t11.S("focusManager");
        throw null;
    }

    private final void F() {
    }

    private final void G() {
    }

    public /* synthetic */ b5(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.h = i;
        this.k = obj;
        this.i = obj2;
        this.j = obj3;
    }

    public b5(kj1 kj1Var, ClassLoader classLoader, Context context) {
        this.h = 24;
        kj1Var.getClass();
        this.i = kj1Var;
        this.j = classLoader;
        this.k = context;
    }

    public b5(File file) {
        this.h = 13;
        c60 c60Var = o90.a;
        t50 t50Var = t50.j;
        t50Var.getClass();
        this.i = t50Var;
        this.j = file.getAbsoluteFile();
        this.k = se.o(new gs(20));
    }

    public b5(c62 c62Var) {
        this.h = 23;
        this.i = new xg(0);
        this.j = new cj(0);
        this.k = new r1(24, this, c62Var);
    }

    public /* synthetic */ b5(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    public b5(kj1 kj1Var) {
        this.h = 3;
        this.i = kj1Var;
        g60 g60Var = (g60) kj1Var.k;
        g60Var.getClass();
        this.j = new o52(g60Var);
        f60 f60Var = (f60) kj1Var.l;
        f60Var.getClass();
        this.k = new n52(f60Var);
    }

    public b5(bt2 bt2Var) {
        this.h = 18;
        this.i = bt2Var;
    }

    public b5(Clock clock, int i) {
        this.h = 28;
        if ((i & 1) != 0) {
            clock = Clock.systemUTC();
            clock.getClass();
        }
        c80 c80Var = sn.Q;
        this.i = clock;
        this.j = c80Var;
        lq2 lq2VarD = p7.d(100, 256, hn.i);
        this.k = lq2VarD;
        new k52(lq2VarD);
    }

    public b5(b5 b5Var) {
        this.h = 2;
        bk bkVar = (bk) b5Var.i;
        int iH = bkVar.h();
        this.i = new xt[iH];
        this.j = new xt[iH];
        this.k = new xt[iH];
        int length = bkVar.i.length;
        for (int i = 0; i < length; i++) {
            zj zjVar = (zj) bkVar.e(i);
            j01 j01Var = zjVar.b;
            int i2 = zjVar.a;
            ((xt[]) this.i)[i2] = new xt(((i01) j01Var.e(0)).i);
            kt2 kt2Var = j01Var.h().i;
            ((xt[]) this.j)[i2] = new xt(kt2Var);
            ((xt[]) this.k)[i2] = new xt(kt2Var);
        }
    }

    public b5(bk bkVar) {
        this.h = 26;
        this.i = bkVar;
        this.j = null;
        this.k = null;
    }

    public b5(View view) {
        this.h = 17;
        this.i = view;
        this.j = p7.B(i91.i, new ea(11, this));
        this.k = new hh1(view);
    }

    public b5(sp spVar) {
        this.h = 4;
        this.k = spVar;
        this.i = new n4(3, this);
    }

    public b5(ye1 ye1Var, ArrayList arrayList, td1 td1Var) {
        this.h = 15;
        fg1.q("Argument must not be null", td1Var);
        this.j = td1Var;
        fg1.q("Argument must not be null", arrayList);
        this.k = arrayList;
        this.i = new n4(ye1Var, td1Var);
    }

    public b5(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, td1 td1Var) {
        this.h = 16;
        fg1.q("Argument must not be null", td1Var);
        this.i = td1Var;
        fg1.q("Argument must not be null", arrayList);
        this.j = arrayList;
        this.k = new a(parcelFileDescriptor);
    }

    public b5(bf0 bf0Var, yq2 yq2Var, ff0 ff0Var) {
        this.h = 10;
        this.k = bf0Var;
        this.j = yq2Var;
        this.i = ff0Var;
    }
}
