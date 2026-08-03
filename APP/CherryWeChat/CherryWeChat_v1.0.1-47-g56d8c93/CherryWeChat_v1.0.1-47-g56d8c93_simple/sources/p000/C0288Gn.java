package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Gn */
/* JADX INFO: loaded from: classes.dex */
public final class C0288Gn implements InterfaceC2506sk {

    /* JADX INFO: renamed from: b */
    public final Map f933b;

    /* JADX INFO: renamed from: c */
    public volatile Map f934c;

    public C0288Gn(Map r1) {
        this.f933b = Collections.unmodifiableMap(r1);
    }

    @Override // p000.InterfaceC2506sk
    /* JADX INFO: renamed from: a */
    public final Map mo573a() {
        if (this.f934c != null) goto L15;
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L6:
        if (this.f934c != null) goto L10;
        this.f934c = Collections.unmodifiableMap(m574b());     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
    L15:
        return this.f934c;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m574b() {
        HashMap r0 = new HashMap();
        Iterator r1 = this.f933b.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L16;
        Map.Entry r2 = (Map.Entry) r1.next();
        List r3 = (List) r2.getValue();
        StringBuilder r4 = new StringBuilder();
        int r5 = r3.size();
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L13;
        String r7 = ((C0245Fn) r3.get(r6)).f801a;
        if (TextUtils.isEmpty(r7) == true) goto L12;
        r4.append(r7);
        if (r6 == (r3.size() - 1)) goto L12;
        r4.append(',');
    L12:
        r6 = r6 + 1;
        goto L6
    L13:
        String r32 = r4.toString();
        if (TextUtils.isEmpty(r32) == true) goto L4;
        r0.put((String) r2.getKey(), r32);
        goto L4
    L16:
        return r0;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0288Gn) == true) goto L5;
        return false;
    L5:
        return this.f933b.equals(((C0288Gn) r2).f933b);
    }

    public final int hashCode() {
        return this.f933b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f933b + '}';
    }
}
