package p056f0;

import android.content.Context;
import de.robv.android.xposed.AbstractC0761c;
import java.lang.reflect.Field;
import p007D0.C0146l;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: f0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0816a0 implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f2966b;

    public /* synthetic */ C0816a0(int i2, Class cls) {
        this.f2965a = i2;
        this.f2966b = cls;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object obj) {
        switch (this.f2965a) {
            case 0:
                AbstractC0761c abstractC0761c = (AbstractC0761c) obj;
                AbstractC0307g.m703e(abstractC0761c, "it");
                AbstractC0358S.m904q(this.f2966b, "onBaseContextAttached", Context.class, abstractC0761c);
                return C0146l.f339a;
            case 1:
                AbstractC0761c abstractC0761c2 = (AbstractC0761c) obj;
                AbstractC0307g.m703e(abstractC0761c2, "it");
                Class cls = Long.TYPE;
                AbstractC0307g.m700b(cls);
                AbstractC0358S.m904q(this.f2966b, "onBaseContextAttached", Context.class, cls, cls, abstractC0761c2);
                return C0146l.f339a;
            default:
                Field field = (Field) obj;
                Class cls2 = this.f2966b;
                AbstractC0307g.m703e(cls2, "$plusClass");
                AbstractC0307g.m703e(field, "it");
                return Boolean.valueOf(cls2.isAssignableFrom(field.getType()));
        }
    }
}
