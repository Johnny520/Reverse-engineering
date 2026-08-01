package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import p088R1.C1213n;
import p088R1.C1214o;
import p093S1.C1294f;
import p110W0.C1577b;
import p121Y1.C1753n;
import p154e2.C2029h;
import p171h2.C2238e;
import p183j2.C2381b;
import p186k.C2423e;

/* JADX INFO: renamed from: com.bumptech.glide.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1927i extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    public static final C1919a f6536k;

    /* JADX INFO: renamed from: a */
    public final C1294f f6537a;

    /* JADX INFO: renamed from: b */
    public final C1213n f6538b;

    /* JADX INFO: renamed from: c */
    public final C1577b f6539c;

    /* JADX INFO: renamed from: d */
    public final C1577b f6540d;

    /* JADX INFO: renamed from: e */
    public final List f6541e;

    /* JADX INFO: renamed from: f */
    public final C2423e f6542f;

    /* JADX INFO: renamed from: g */
    public final C1214o f6543g;

    /* JADX INFO: renamed from: h */
    public final C1753n f6544h;

    /* JADX INFO: renamed from: i */
    public final int f6545i;

    /* JADX INFO: renamed from: j */
    public C2238e f6546j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1919a c1919a = new C1919a();
        c1919a.f6510d = C2381b.f7723a;
        f6536k = c1919a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1927i(Context context, C1294f c1294f, C2029h c2029h, C1577b c1577b, C1577b c1577b2, C2423e c2423e, List list, C1214o c1214o, C1753n c1753n) {
        super(context.getApplicationContext());
        this.f6537a = c1294f;
        this.f6539c = c1577b;
        this.f6540d = c1577b2;
        this.f6541e = list;
        this.f6542f = c2423e;
        this.f6543g = c1214o;
        this.f6544h = c1753n;
        this.f6545i = 4;
        this.f6538b = new C1213n(c2029h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1930l m3586a() {
        return (C1930l) this.f6538b.get();
    }
}
