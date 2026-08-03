package Yue;

import Yue.C5053;
import Yue.C5058;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8029 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3201 = "TypefaceCompatBaseImpl";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f23864 = 0;

    /* JADX INFO: renamed from: ۥ */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, C5053.C5055> f3202 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۤ$ۥ */
    public class C1409 implements InterfaceC8031<C5058.C5059> {
        public C1409() {
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;)I */
        @Override // Yue.C8029.InterfaceC8031
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int mo4046(C5058.C5059 c5059) {
            return c5059.m15586();
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Ljava/lang/Object;)Z */
        @Override // Yue.C8029.InterfaceC8031
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo4047(C5058.C5059 c5059) {
            return c5059.m15587();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۤ$ۥ۟ */
    public class C1410 implements InterfaceC8031<C5053.C5056> {
        public C1410() {
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;)I */
        @Override // Yue.C8029.InterfaceC8031
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int mo4046(C5053.C5056 c5056) {
            return c5056.m15572();
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Ljava/lang/Object;)Z */
        @Override // Yue.C8029.InterfaceC8031
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo4047(C5053.C5056 c5056) {
            return c5056.m15573();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۤ$ۥ۟۟, reason: contains not printable characters */
    public class C8030 implements InterfaceC8031<C5053.C5056> {
        public C8030() {
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;)I */
        @Override // Yue.C8029.InterfaceC8031
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int mo4046(C5053.C5056 c5056) {
            return c5056.m15572();
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Ljava/lang/Object;)Z */
        @Override // Yue.C8029.InterfaceC8031
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo4047(C5053.C5056 c5056) {
            return c5056.m15573();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۤ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC8031<T> {
        /* JADX INFO: renamed from: ۥ */
        int mo4046(T t);

        /* JADX INFO: renamed from: ۥ۟ */
        boolean mo4047(T t);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static <T> T m25377(T[] tArr, int i, InterfaceC8031<T> interfaceC8031) {
        return (T) m25378(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, interfaceC8031);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static <T> T m25378(T[] tArr, int i, boolean z, InterfaceC8031<T> interfaceC8031) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(interfaceC8031.mo4046(t2) - i) * 2) + (interfaceC8031.mo4047(t2) == z ? 0 : 1);
            if (t == null || i2 > iAbs) {
                t = t2;
                i2 = iAbs;
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static long m25379(@InterfaceC6490 Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e(f3201, "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e(f3201, "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4045(Typeface typeface, C5053.C5055 c5055) {
        long jM25379 = m25379(typeface);
        if (jM25379 != 0) {
            this.f3202.put(Long.valueOf(jM25379), c5055);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public Typeface mo4044(Context context, C5053.C5055 c5055, Resources resources, int i) {
        C5053.C5056 c5056M25381 = m25381(c5055, i);
        if (c5056M25381 == null) {
            return null;
        }
        Typeface typefaceM25341 = C8023.m25341(context, resources, c5056M25381.m1873(), c5056M25381.m1872(), 0, i);
        m4045(typefaceM25341, c5055);
        return typefaceM25341;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Typeface m25380(Context context, C5053.C5055 c5055, Resources resources, int i, boolean z) {
        C5053.C5056 c5056M25382 = m25382(c5055, i, z);
        if (c5056M25382 == null) {
            return null;
        }
        Typeface typefaceM25341 = C8023.m25341(context, resources, c5056M25382.m1873(), c5056M25382.m1872(), 0, 0);
        m4045(typefaceM25341, c5055);
        return typefaceM25341;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Typeface mo25351(Context context, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 C5058.C5059[] c5059Arr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (c5059Arr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(mo25375(c5059Arr, i).m15585());
            try {
                Typeface typefaceMo25374 = mo25374(context, inputStreamOpenInputStream);
                C8032.m4048(inputStreamOpenInputStream);
                return typefaceMo25374;
            } catch (IOException unused) {
                C8032.m4048(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                C8032.m4048(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Typeface mo25374(Context context, InputStream inputStream) {
        File fileM25392 = C8032.m25392(context);
        if (fileM25392 == null) {
            return null;
        }
        try {
            if (C8032.m25391(fileM25392, inputStream)) {
                return Typeface.createFromFile(fileM25392.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM25392.delete();
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Typeface mo25358(Context context, Resources resources, int i, String str, int i2) {
        File fileM25392 = C8032.m25392(context);
        if (fileM25392 == null) {
            return null;
        }
        try {
            if (C8032.m25390(fileM25392, resources, i)) {
                return Typeface.createFromFile(fileM25392.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM25392.delete();
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Typeface mo25352(@InterfaceC6391 Context context, @InterfaceC6391 Typeface typeface, int i, boolean z) {
        Typeface typefaceM4402;
        try {
            typefaceM4402 = C8426.m4402(this, context, typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceM4402 = null;
        }
        return typefaceM4402 == null ? typeface : typefaceM4402;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C5053.C5056 m25381(C5053.C5055 c5055, int i) {
        return (C5053.C5056) m25377(c5055.m1871(), i, new C1410());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C5053.C5056 m25382(C5053.C5055 c5055, int i, boolean z) {
        return (C5053.C5056) m25378(c5055.m1871(), i, z, new C8030());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public C5058.C5059 mo25375(C5058.C5059[] c5059Arr, int i) {
        return (C5058.C5059) m25377(c5059Arr, i, new C1409());
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C5053.C5055 m25383(Typeface typeface) {
        long jM25379 = m25379(typeface);
        if (jM25379 == 0) {
            return null;
        }
        return this.f3202.get(Long.valueOf(jM25379));
    }
}
