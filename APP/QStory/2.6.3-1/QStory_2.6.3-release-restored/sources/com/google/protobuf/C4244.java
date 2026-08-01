package com.google.protobuf;

import bsh.C3466;
import java.util.Iterator;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.C5529;
import kotlin.reflect.jvm.internal.impl.protobuf.C5548;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰苏子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4244 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f11419;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f11420;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11421;

    public C4244(AbstractC5542 abstractC5542) {
        this.f11421 = 1;
        this.f11419 = new Stack();
        while (abstractC5542 instanceof C5529) {
            C5529 c5529 = (C5529) abstractC5542;
            ((Stack) this.f11419).push(c5529);
            abstractC5542 = c5529.f14098;
        }
        this.f11420 = (C5548) abstractC5542;
    }

    public boolean equals(Object obj) {
        switch (this.f11421) {
            case 0:
                return ((Iterator) this.f11420).equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11421) {
            case 0:
                return ((Iterator) this.f11420).hasNext();
            default:
                return ((C5548) this.f11420) != null;
        }
    }

    public int hashCode() {
        switch (this.f11421) {
            case 0:
                return ((Iterator) this.f11420).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11421) {
            case 0:
                return ((Iterator) this.f11420).next();
            default:
                return m8072();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11421) {
            case 0:
                ((InterfaceC4202) this.f11419).mo8038();
                ((Iterator) this.f11420).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String toString() {
        switch (this.f11421) {
            case 0:
                return ((Iterator) this.f11420).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5548 m8072() {
        Stack stack = (Stack) this.f11419;
        C5548 c5548 = (C5548) this.f11420;
        C5548 c55482 = null;
        if (c5548 == null) {
            C3466.m5896();
            return null;
        }
        while (true) {
            if (!stack.isEmpty()) {
                AbstractC5542 abstractC5542 = ((C5529) stack.pop()).f14094;
                while (abstractC5542 instanceof C5529) {
                    C5529 c5529 = (C5529) abstractC5542;
                    stack.push(c5529);
                    abstractC5542 = c5529.f14098;
                }
                C5548 c55483 = (C5548) abstractC5542;
                if (c55483.f14129.length != 0) {
                    c55482 = c55483;
                    break;
                }
            } else {
                break;
            }
        }
        this.f11420 = c55482;
        return c5548;
    }

    public C4244(InterfaceC4202 interfaceC4202, Iterator it) {
        this.f11421 = 0;
        this.f11419 = interfaceC4202;
        this.f11420 = it;
    }
}
