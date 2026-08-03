package fun.box001.internal.hookbackend.xposed;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0212a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f821a;

    public /* synthetic */ C0212a(int r1) {
        this.f821a = r1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r2) {
        switch(this.f821a) {
            case 0: goto L5;
            default: goto L7;
        };
    L5:
        Member r22 = (Member) r2;
        return new ArrayList();
    L7:
        Member r23 = (Member) r2;
        return new ArrayList();
    }
}
