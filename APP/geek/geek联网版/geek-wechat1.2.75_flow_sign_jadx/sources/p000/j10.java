package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j10 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f2646a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f2647b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f2648c = new Object();

    /* JADX INFO: renamed from: a */
    public static Typeface m1563a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m1564b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m1564b(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, p000.AbstractC0498mu r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j10.m1564b(android.content.Context, int, android.util.TypedValue, int, mu, boolean, boolean):android.graphics.Typeface");
    }
}
