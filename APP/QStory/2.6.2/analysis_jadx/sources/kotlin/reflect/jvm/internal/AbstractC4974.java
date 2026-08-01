package kotlin.reflect.jvm.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KVisibility;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4974 implements InterfaceC5087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5183 f14359;

    public AbstractC4974(InterfaceC6542 interfaceC6542) {
        this.f14359 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, interfaceC6542);
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final Object call(Object... objArr) {
        objArr.getClass();
        return m9966().call(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final Object callBy(Map map) {
        map.getClass();
        return m9966().callBy(map);
    }

    public final boolean equals(Object obj) {
        return AbstractC4394.m8917(m9966(), obj);
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        return m9966().getAnnotations();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getName() {
        return m9966().getName();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getParameters() {
        return m9966().getParameters();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final InterfaceC5086 getReturnType() {
        return m9966().getReturnType();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getTypeParameters() {
        return m9966().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final KVisibility getVisibility() {
        return m9966().getVisibility();
    }

    public final int hashCode() {
        return m9966().hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isAbstract() {
        return m9966().isAbstract();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final boolean isConst() {
        return m9966().isConst();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isFinal() {
        return m9966().isFinal();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final boolean isLateinit() {
        return m9966().isLateinit();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isOpen() {
        return m9966().isOpen();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isSuspend() {
        return m9966().isSuspend();
    }

    public final String toString() {
        return m9966().toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5087 m9966() {
        return (InterfaceC5087) this.f14359.getValue();
    }
}
