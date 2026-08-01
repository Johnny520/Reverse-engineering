package io.ktor.network.selector;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5093;
import kotlinx.coroutines.InterfaceC5446;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3999 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater[] f12247;
    private volatile InterfaceC5446 acceptHandlerReference;
    private volatile InterfaceC5446 connectHandlerReference;
    private volatile InterfaceC5446 readHandlerReference;
    private volatile InterfaceC5446 writeHandlerReference;

    static {
        InterfaceC5093 interfaceC5093;
        SelectInterest.Companion.getClass();
        SelectInterest[] selectInterestArr = SelectInterest.AllInterests;
        ArrayList arrayList = new ArrayList(selectInterestArr.length);
        for (SelectInterest selectInterest : selectInterestArr) {
            int i = AbstractC4000.f12248[selectInterest.ordinal()];
            if (i == 1) {
                interfaceC5093 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
                    public Object get(Object obj) {
                        return ((C3999) obj).readHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
                    public void set(Object obj, Object obj2) {
                        ((C3999) obj).readHandlerReference = (InterfaceC5446) obj2;
                    }
                };
            } else if (i == 2) {
                interfaceC5093 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
                    public Object get(Object obj) {
                        return ((C3999) obj).writeHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
                    public void set(Object obj, Object obj2) {
                        ((C3999) obj).writeHandlerReference = (InterfaceC5446) obj2;
                    }
                };
            } else if (i == 3) {
                interfaceC5093 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
                    public Object get(Object obj) {
                        return ((C3999) obj).acceptHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
                    public void set(Object obj, Object obj2) {
                        ((C3999) obj).acceptHandlerReference = (InterfaceC5446) obj2;
                    }
                };
            } else {
                if (i != 4) {
                    C4210.m8621();
                    return;
                }
                interfaceC5093 = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$4
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
                    public Object get(Object obj) {
                        return ((C3999) obj).connectHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
                    public void set(Object obj, Object obj2) {
                        ((C3999) obj).connectHandlerReference = (InterfaceC5446) obj2;
                    }
                };
            }
            arrayList.add(AtomicReferenceFieldUpdater.newUpdater(C3999.class, InterfaceC5446.class, interfaceC5093.getName()));
        }
        f12247 = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
