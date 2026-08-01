package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import p395.InterfaceC9111;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Registration {
    private final int id;
    private InterfaceC9111 instantiator;
    private Serializer serializer;
    private final Class type;
    private final boolean typeNameAscii;

    public Registration(Class cls, Serializer serializer, int i) {
        if (cls == null) {
            C5925.m11310("type cannot be null.");
            throw null;
        }
        if (serializer == null) {
            C5925.m11310("serializer cannot be null.");
            throw null;
        }
        this.type = cls;
        this.serializer = serializer;
        this.id = i;
        this.typeNameAscii = Util.isAscii(cls.getName());
    }

    public int getId() {
        return this.id;
    }

    public InterfaceC9111 getInstantiator() {
        return this.instantiator;
    }

    public Serializer getSerializer() {
        return this.serializer;
    }

    public Class getType() {
        return this.type;
    }

    public boolean isTypeNameAscii() {
        return this.typeNameAscii;
    }

    public void setInstantiator(InterfaceC9111 interfaceC9111) {
        if (interfaceC9111 != null) {
            this.instantiator = interfaceC9111;
        } else {
            C5925.m11310("instantiator cannot be null.");
        }
    }

    public void setSerializer(Serializer serializer) {
        if (serializer == null) {
            C5925.m11310("serializer cannot be null.");
            return;
        }
        this.serializer = serializer;
        if (Log.TRACE) {
            Log.trace("kryo", "Update registered serializer: " + this.type.getName() + " (" + serializer.getClass().getName() + ")");
        }
    }

    public String toString() {
        return "[" + this.id + ", " + Util.className(this.type) + "]";
    }
}
