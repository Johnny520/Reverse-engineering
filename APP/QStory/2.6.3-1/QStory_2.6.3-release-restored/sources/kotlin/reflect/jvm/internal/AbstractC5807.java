package kotlin.reflect.jvm.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.KVisibility;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5807 implements InterfaceC5920 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6016 f14706;

    public AbstractC5807(InterfaceC7372 interfaceC7372) {
        this.f14706 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, interfaceC7372);
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final Object call(Object... objArr) {
        objArr.getClass();
        return m10522().call(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final Object callBy(Map map) {
        map.getClass();
        return m10522().callBy(map);
    }

    public final boolean equals(Object obj) {
        return AbstractC5227.m9466(m10522(), obj);
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        return m10522().getAnnotations();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        return m10522().getName();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getParameters() {
        return m10522().getParameters();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final InterfaceC5919 getReturnType() {
        return m10522().getReturnType();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getTypeParameters() {
        return m10522().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final KVisibility getVisibility() {
        return m10522().getVisibility();
    }

    public final int hashCode() {
        return m10522().hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isAbstract() {
        return m10522().isAbstract();
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final boolean isConst() {
        return m10522().isConst();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isFinal() {
        return m10522().isFinal();
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final boolean isLateinit() {
        return m10522().isLateinit();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isOpen() {
        return m10522().isOpen();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isSuspend() {
        return m10522().isSuspend();
    }

    public final String toString() {
        return m10522().toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5920 m10522() {
        return (InterfaceC5920) this.f14706.getValue();
    }
}
