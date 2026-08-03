package p009E0;

import java.util.ArrayList;
import p007D0.C0146l;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;
import p036T0.C0340c;

/* JADX INFO: renamed from: E0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0170a extends AbstractC0308h implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f381b;

    public /* synthetic */ C0170a(int r1, Object r2) {
        this.f380a = r1;
        this.f381b = r2;
        super(1);
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r3) {
        switch(this.f380a) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        C0340c r32 = (C0340c) r3;
        AbstractC0307g.m703e(r32, "it");
        int r02 = r32.f658b + 1;
        int r33 = r32.f657a;
        return ((CharSequence) this.f381b).subSequence(r33, r02).toString();
    L6:
        String r34 = (String) r3;
        AbstractC0307g.m703e(r34, "it");
        ((ArrayList) this.f381b).add(r34);
        return C0146l.f339a;
    L9:
        if (r3 != ((AbstractC0175f) this.f381b)) goto L12;
        return "(this Collection)";
    L12:
        return String.valueOf(r3);
    }
}
