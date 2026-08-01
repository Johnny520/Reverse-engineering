package p143c3;

import java.util.Iterator;
import me.dartcv.nuke.BuildConfig;
import p056K2.InterfaceC0877c;
import p061L2.C0958A;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p124Z.C1779c;

/* JADX INFO: renamed from: c3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1904f implements InterfaceC1905g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6473a;

    /* JADX INFO: renamed from: b */
    public final Object f6474b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0877c f6475c;

    public /* synthetic */ C1904f(Object obj, InterfaceC1601c interfaceC1601c, int i5) {
        this.f6473a = i5;
        this.f6474b = obj;
        this.f6475c = interfaceC1601c;
    }

    @Override // p143c3.InterfaceC1905g
    public final Iterator iterator() {
        switch (this.f6473a) {
            case 0:
                return new C1903e(this);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C1779c(this);
            case 2:
                return new C1910l(this);
            default:
                return new C0958A(this);
        }
    }

    public C1904f(CharSequence charSequence, InterfaceC1603e interfaceC1603e) {
        this.f6473a = 3;
        AbstractC1665j.m2985e(charSequence, "input");
        this.f6474b = charSequence;
        this.f6475c = interfaceC1603e;
    }
}
