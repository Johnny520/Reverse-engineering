package kotlin.reflect.jvm.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.KVisibility;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4975 implements InterfaceC5088 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5184 f14361;

    public AbstractC4975(InterfaceC6543 interfaceC6543) {
        this.f14361 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, interfaceC6543);
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final Object call(Object... objArr) {
        objArr.getClass();
        return m9963().call(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final Object callBy(Map map) {
        map.getClass();
        return m9963().callBy(map);
    }

    public final boolean equals(Object obj) {
        return AbstractC4395.m8907(m9963(), obj);
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        return m9963().getAnnotations();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final String getName() {
        return m9963().getName();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getParameters() {
        return m9963().getParameters();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final InterfaceC5087 getReturnType() {
        return m9963().getReturnType();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getTypeParameters() {
        return m9963().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final KVisibility getVisibility() {
        return m9963().getVisibility();
    }

    public final int hashCode() {
        return m9963().hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isAbstract() {
        return m9963().isAbstract();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final boolean isConst() {
        return m9963().isConst();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isFinal() {
        return m9963().isFinal();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final boolean isLateinit() {
        return m9963().isLateinit();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isOpen() {
        return m9963().isOpen();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isSuspend() {
        return m9963().isSuspend();
    }

    public final String toString() {
        return m9963().toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5088 m9963() {
        return (InterfaceC5088) this.f14361.getValue();
    }
}
