package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
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

    public /* synthetic */ CallableC0712Qh(String str, Context context, Object obj, int i, int i2) {
        this.f2286a = i2;
        this.f2287b = str;
        this.f2288c = context;
        this.f2290e = obj;
        this.f2289d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2286a) {
            case 0:
                Object[] objArr = {(C0583Nh) this.f2290e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return AbstractC0840Th.m1662b(this.f2287b, this.f2288c, Collections.unmodifiableList(arrayList), this.f2289d);
            default:
                try {
                    return AbstractC0840Th.m1662b(this.f2287b, this.f2288c, (ArrayList) this.f2290e, this.f2289d);
                } catch (Throwable unused) {
                    return new C0797Sh(-3);
                }
        }
    }
}
