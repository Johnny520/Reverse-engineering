package io.ktor.network.selector;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5926;
import kotlinx.coroutines.InterfaceC6279;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4832 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater[] f12596;
    private volatile InterfaceC6279 acceptHandlerReference;
    private volatile InterfaceC6279 connectHandlerReference;
    private volatile InterfaceC6279 readHandlerReference;
    private volatile InterfaceC6279 writeHandlerReference;

    static {
        InterfaceC5926 interfaceC5926;
        SelectInterest.Companion.getClass();
        SelectInterest[] selectInterestArr = SelectInterest.AllInterests;
        ArrayList arrayList = new ArrayList(selectInterestArr.length);
        for (SelectInterest selectInterest : selectInterestArr) {
            int i = AbstractC4833.f12597[selectInterest.ordinal()];
            if (i == 1) {
                interfaceC5926 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
                    public Object get(Object obj) {
                        return ((C4832) obj).readHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
                    public void set(Object obj, Object obj2) {
                        ((C4832) obj).readHandlerReference = (InterfaceC6279) obj2;
                    }
                };
            } else if (i == 2) {
                interfaceC5926 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
                    public Object get(Object obj) {
                        return ((C4832) obj).writeHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
                    public void set(Object obj, Object obj2) {
                        ((C4832) obj).writeHandlerReference = (InterfaceC6279) obj2;
                    }
                };
            } else if (i == 3) {
                interfaceC5926 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
                    public Object get(Object obj) {
                        return ((C4832) obj).acceptHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
                    public void set(Object obj, Object obj2) {
                        ((C4832) obj).acceptHandlerReference = (InterfaceC6279) obj2;
                    }
                };
            } else {
                if (i != 4) {
                    C5043.m9170();
                    return;
                }
                interfaceC5926 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$4
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
                    public Object get(Object obj) {
                        return ((C4832) obj).connectHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
                    public void set(Object obj, Object obj2) {
                        ((C4832) obj).connectHandlerReference = (InterfaceC6279) obj2;
                    }
                };
            }
            arrayList.add(AtomicReferenceFieldUpdater.newUpdater(C4832.class, InterfaceC6279.class, interfaceC5926.getName()));
        }
        f12596 = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
