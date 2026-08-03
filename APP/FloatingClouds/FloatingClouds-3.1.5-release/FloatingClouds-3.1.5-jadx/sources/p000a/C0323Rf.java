package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0332S6;

/* JADX INFO: renamed from: a.Rf */
/* JADX INFO: loaded from: classes.dex */
public class C0323Rf {

    /* JADX INFO: renamed from: a.Rf$a */
    public class a implements b<C0350T6> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p000a.C0323Rf.b
        /* JADX INFO: renamed from: a */
        public final int mo893a(C0350T6 c0350t6) {
            return c0350t6.f1246c;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p000a.C0323Rf.b
        /* JADX INFO: renamed from: b */
        public final boolean mo894b(C0350T6 c0350t6) {
            return c0350t6.f1247d;
        }
    }

    /* JADX INFO: renamed from: a.Rf$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        int mo893a(T t);

        /* JADX INFO: renamed from: b */
        boolean mo894b(T t);
    }

    public C0323Rf() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public Typeface mo690a(Context context, C0332S6.c cVar, Resources resources, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public Typeface mo753b(Context context, C0350T6[] c0350t6Arr, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Typeface mo754c(Context context, Resources resources, int i, String str, int i2) {
        File fileM932d = C0341Sf.m932d(context);
        if (fileM932d == null) {
            return null;
        }
        try {
            if (C0341Sf.m930b(fileM932d, resources, i)) {
                return Typeface.createFromFile(fileM932d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM932d.delete();
        }
    }

    /* JADX INFO: renamed from: d */
    public C0350T6 mo853d(int i, C0350T6[] c0350t6Arr) {
        a aVar = new a();
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C0350T6 c0350t6 = null;
        int i3 = Integer.MAX_VALUE;
        for (C0350T6 c0350t62 : c0350t6Arr) {
            int iAbs = (Math.abs(aVar.mo893a(c0350t62) - i2) * 2) + (aVar.mo894b(c0350t62) == z ? 0 : 1);
            if (c0350t6 == null || i3 > iAbs) {
                c0350t6 = c0350t62;
                i3 = iAbs;
            }
        }
        return c0350t6;
    }
}
