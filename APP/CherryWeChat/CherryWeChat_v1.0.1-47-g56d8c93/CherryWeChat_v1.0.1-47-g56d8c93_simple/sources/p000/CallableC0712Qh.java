package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Qh */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0712Qh implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2287b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f2288c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2289d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2290e;

    public /* synthetic */ CallableC0712Qh(String r1, Context r2, Object r3, int r4, int r5) {
        this.f2286a = r5;
        this.f2287b = r1;
        this.f2288c = r2;
        this.f2290e = r3;
        this.f2289d = r4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch(this.f2286a) {
            case 0: goto L8;
            default: goto L10;
        };
    L8:
        Object[] r0 = {(C0583Nh) this.f2290e};
        ArrayList r1 = new ArrayList(1);
        Object r02 = r0[0];
        Objects.requireNonNull(r02);
        r1.add(r02);
        List r03 = Collections.unmodifiableList(r1);
        int r12 = this.f2289d;
        return AbstractC0840Th.m1662b(this.f2287b, this.f2288c, r03, r12);
    L10:
        return AbstractC0840Th.m1662b(this.f2287b, this.f2288c, (ArrayList) this.f2290e, this.f2289d);
    L7:
        return new C0797Sh(-3);
    }
}
