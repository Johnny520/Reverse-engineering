package p252r3;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.concurrent.ConcurrentHashMap;
import p292u3.AbstractC8503f;

/* JADX INFO: renamed from: r3.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6482m {

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap f20361a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: r3.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements b {
        public a() {
        }

        @Override // p252r3.AbstractC6482m.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo25680a(AbstractC8503f.b bVar) {
            return bVar.m32750e();
        }

        @Override // p252r3.AbstractC6482m.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo25681b(AbstractC8503f.b bVar) {
            return bVar.m32751f();
        }
    }

    /* JADX INFO: renamed from: r3.m$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo25680a(Object obj);

        /* JADX INFO: renamed from: b */
        boolean mo25681b(Object obj);
    }

    /* JADX INFO: renamed from: b */
    public static Object m25677b(Object[] objArr, int i10, b bVar) {
        return m25678c(objArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    /* JADX INFO: renamed from: c */
    public static Object m25678c(Object[] objArr, int i10, boolean z10, b bVar) {
        Object obj = null;
        int i11 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.mo25680a(obj2) - i10) * 2) + (bVar.mo25681b(obj2) == z10 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract Typeface mo25660a(Context context, CancellationSignal cancellationSignal, AbstractC8503f.b[] bVarArr, int i10);

    /* JADX INFO: renamed from: d */
    public AbstractC8503f.b m25679d(AbstractC8503f.b[] bVarArr, int i10) {
        return (AbstractC8503f.b) m25677b(bVarArr, i10, new a());
    }
}
