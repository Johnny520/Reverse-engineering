package io.ktor.network.selector;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5094;
import kotlinx.coroutines.InterfaceC5447;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4000 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater[] f12251;
    private volatile InterfaceC5447 acceptHandlerReference;
    private volatile InterfaceC5447 connectHandlerReference;
    private volatile InterfaceC5447 readHandlerReference;
    private volatile InterfaceC5447 writeHandlerReference;

    static {
        InterfaceC5094 interfaceC5094;
        SelectInterest.Companion.getClass();
        SelectInterest[] selectInterestArr = SelectInterest.AllInterests;
        ArrayList arrayList = new ArrayList(selectInterestArr.length);
        for (SelectInterest selectInterest : selectInterestArr) {
            int i = AbstractC4001.f12252[selectInterest.ordinal()];
            if (i == 1) {
                interfaceC5094 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
                    public Object get(Object obj) {
                        return ((C4000) obj).readHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
                    public void set(Object obj, Object obj2) {
                        ((C4000) obj).readHandlerReference = (InterfaceC5447) obj2;
                    }
                };
            } else if (i == 2) {
                interfaceC5094 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
                    public Object get(Object obj) {
                        return ((C4000) obj).writeHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
                    public void set(Object obj, Object obj2) {
                        ((C4000) obj).writeHandlerReference = (InterfaceC5447) obj2;
                    }
                };
            } else if (i == 3) {
                interfaceC5094 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
                    public Object get(Object obj) {
                        return ((C4000) obj).acceptHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
                    public void set(Object obj, Object obj2) {
                        ((C4000) obj).acceptHandlerReference = (InterfaceC5447) obj2;
                    }
                };
            } else {
                if (i != 4) {
                    C4211.m8611();
                    return;
                }
                interfaceC5094 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$4
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
                    public Object get(Object obj) {
                        return ((C4000) obj).connectHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
                    public void set(Object obj, Object obj2) {
                        ((C4000) obj).connectHandlerReference = (InterfaceC5447) obj2;
                    }
                };
            }
            arrayList.add(AtomicReferenceFieldUpdater.newUpdater(C4000.class, InterfaceC5447.class, interfaceC5094.getName()));
        }
        f12251 = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
