package com.google.protobuf;

import bsh.C2632;
import java.util.Iterator;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4696;
import kotlin.reflect.jvm.internal.impl.protobuf.C4715;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰苏子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3411 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f11069;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f11070;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11071;

    public C3411(AbstractC4709 abstractC4709) {
        this.f11071 = 1;
        this.f11069 = new Stack();
        while (abstractC4709 instanceof C4696) {
            C4696 c4696 = (C4696) abstractC4709;
            ((Stack) this.f11069).push(c4696);
            abstractC4709 = c4696.f13749;
        }
        this.f11070 = (C4715) abstractC4709;
    }

    public boolean equals(Object obj) {
        switch (this.f11071) {
            case 0:
                return ((Iterator) this.f11070).equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11071) {
            case 0:
                return ((Iterator) this.f11070).hasNext();
            default:
                return ((C4715) this.f11070) != null;
        }
    }

    public int hashCode() {
        switch (this.f11071) {
            case 0:
                return ((Iterator) this.f11070).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11071) {
            case 0:
                return ((Iterator) this.f11070).next();
            default:
                return m7526();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11071) {
            case 0:
                ((InterfaceC3369) this.f11069).mo7492();
                ((Iterator) this.f11070).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String toString() {
        switch (this.f11071) {
            case 0:
                return ((Iterator) this.f11070).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4715 m7526() {
        Stack stack = (Stack) this.f11069;
        C4715 c4715 = (C4715) this.f11070;
        C4715 c47152 = null;
        if (c4715 == null) {
            C2632.m5291();
            return null;
        }
        while (true) {
            if (!stack.isEmpty()) {
                AbstractC4709 abstractC4709 = ((C4696) stack.pop()).f13745;
                while (abstractC4709 instanceof C4696) {
                    C4696 c4696 = (C4696) abstractC4709;
                    stack.push(c4696);
                    abstractC4709 = c4696.f13749;
                }
                C4715 c47153 = (C4715) abstractC4709;
                if (c47153.f13780.length != 0) {
                    c47152 = c47153;
                    break;
                }
            } else {
                break;
            }
        }
        this.f11070 = c47152;
        return c4715;
    }

    public C3411(InterfaceC3369 interfaceC3369, Iterator it) {
        this.f11071 = 0;
        this.f11069 = interfaceC3369;
        this.f11070 = it;
    }
}
