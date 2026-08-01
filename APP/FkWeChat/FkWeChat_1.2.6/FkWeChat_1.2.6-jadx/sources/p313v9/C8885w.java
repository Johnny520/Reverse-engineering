package p313v9;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import p081fa.InterfaceC2386n;
import p313v9.AbstractC8864e0;

/* JADX INFO: renamed from: v9.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8885w extends AbstractC8887y implements InterfaceC2386n {

    /* JADX INFO: renamed from: a */
    public final Field f29466a;

    public C8885w(Field field) {
        field.getClass();
        this.f29466a = field;
    }

    @Override // p081fa.InterfaceC2386n
    /* JADX INFO: renamed from: J */
    public boolean mo8633J() {
        return mo34023V().isEnumConstant();
    }

    @Override // p081fa.InterfaceC2386n
    /* JADX INFO: renamed from: R */
    public boolean mo8634R() {
        return false;
    }

    @Override // p313v9.AbstractC8887y
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Field mo34023V() {
        return this.f29466a;
    }

    @Override // p081fa.InterfaceC2386n
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public AbstractC8864e0 getType() {
        AbstractC8864e0.a aVar = AbstractC8864e0.f29430a;
        Type genericType = mo34023V().getGenericType();
        genericType.getClass();
        return aVar.m34024a(genericType);
    }
}
