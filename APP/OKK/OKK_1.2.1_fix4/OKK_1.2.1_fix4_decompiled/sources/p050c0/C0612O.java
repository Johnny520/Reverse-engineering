package p050c0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.O */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0612O implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0286l f1890b;

    public /* synthetic */ C0612O(InterfaceC0286l interfaceC0286l, int i2) {
        this.f1889a = i2;
        this.f1890b = interfaceC0286l;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f1889a) {
            case 0:
                InterfaceC0286l interfaceC0286l = this.f1890b;
                AbstractC0307g.m703e(interfaceC0286l, "$tmp0");
                return (C0622S) interfaceC0286l.invoke(obj);
            case 1:
                InterfaceC0286l interfaceC0286l2 = this.f1890b;
                AbstractC0307g.m703e(interfaceC0286l2, "$tmp0");
                return (C0622S) interfaceC0286l2.invoke(obj);
            case 2:
                InterfaceC0286l interfaceC0286l3 = this.f1890b;
                AbstractC0307g.m703e(interfaceC0286l3, "$tmp0");
                return (Field) interfaceC0286l3.invoke(obj);
            case 3:
                InterfaceC0286l interfaceC0286l4 = this.f1890b;
                AbstractC0307g.m703e(interfaceC0286l4, "$tmp0");
                return (Boolean) interfaceC0286l4.invoke(obj);
            case 4:
                InterfaceC0286l interfaceC0286l5 = this.f1890b;
                AbstractC0307g.m703e(interfaceC0286l5, "$tmp0");
                return (Method) interfaceC0286l5.invoke(obj);
            case 5:
                InterfaceC0286l interfaceC0286l6 = this.f1890b;
                AbstractC0307g.m703e(interfaceC0286l6, "$tmp0");
                return (Method) interfaceC0286l6.invoke(obj);
            case 6:
                InterfaceC0286l interfaceC0286l7 = this.f1890b;
                AbstractC0307g.m703e(interfaceC0286l7, "$tmp0");
                return (Field) interfaceC0286l7.invoke(obj);
            default:
                InterfaceC0286l interfaceC0286l8 = this.f1890b;
                AbstractC0307g.m703e(interfaceC0286l8, "$tmp0");
                return (CopyOnWriteArrayList) interfaceC0286l8.invoke(obj);
        }
    }
}
