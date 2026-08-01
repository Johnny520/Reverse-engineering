package com.google.protobuf;

import bsh.C2633;
import java.util.Iterator;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4697;
import kotlin.reflect.jvm.internal.impl.protobuf.C4716;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰苏子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3412 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f11074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f11075;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11076;

    public C3412(AbstractC4710 abstractC4710) {
        this.f11076 = 1;
        this.f11074 = new Stack();
        while (abstractC4710 instanceof C4697) {
            C4697 c4697 = (C4697) abstractC4710;
            ((Stack) this.f11074).push(c4697);
            abstractC4710 = c4697.f13753;
        }
        this.f11075 = (C4716) abstractC4710;
    }

    public boolean equals(Object obj) {
        switch (this.f11076) {
            case 0:
                return ((Iterator) this.f11075).equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11076) {
            case 0:
                return ((Iterator) this.f11075).hasNext();
            default:
                return ((C4716) this.f11075) != null;
        }
    }

    public int hashCode() {
        switch (this.f11076) {
            case 0:
                return ((Iterator) this.f11075).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11076) {
            case 0:
                return ((Iterator) this.f11075).next();
            default:
                return m7513();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11076) {
            case 0:
                ((InterfaceC3370) this.f11074).mo7479();
                ((Iterator) this.f11075).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String toString() {
        switch (this.f11076) {
            case 0:
                return ((Iterator) this.f11075).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4716 m7513() {
        Stack stack = (Stack) this.f11074;
        C4716 c4716 = (C4716) this.f11075;
        C4716 c47162 = null;
        if (c4716 == null) {
            C2633.m5336();
            return null;
        }
        while (true) {
            if (!stack.isEmpty()) {
                AbstractC4710 abstractC4710 = ((C4697) stack.pop()).f13749;
                while (abstractC4710 instanceof C4697) {
                    C4697 c4697 = (C4697) abstractC4710;
                    stack.push(c4697);
                    abstractC4710 = c4697.f13753;
                }
                C4716 c47163 = (C4716) abstractC4710;
                if (c47163.f13784.length != 0) {
                    c47162 = c47163;
                    break;
                }
            } else {
                break;
            }
        }
        this.f11075 = c47162;
        return c4716;
    }

    public C3412(InterfaceC3370 interfaceC3370, Iterator it) {
        this.f11076 = 0;
        this.f11074 = interfaceC3370;
        this.f11075 = it;
    }
}
