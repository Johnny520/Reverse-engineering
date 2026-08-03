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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0170a(int i2, Object obj) {
        super(1);
        this.f380a = i2;
        this.f381b = obj;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object obj) {
        switch (this.f380a) {
            case 0:
                return obj == ((AbstractC0175f) this.f381b) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                String str = (String) obj;
                AbstractC0307g.m703e(str, "it");
                ((ArrayList) this.f381b).add(str);
                return C0146l.f339a;
            default:
                C0340c c0340c = (C0340c) obj;
                AbstractC0307g.m703e(c0340c, "it");
                return ((CharSequence) this.f381b).subSequence(c0340c.f657a, c0340c.f658b + 1).toString();
        }
    }
}
