package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import p411.InterfaceC9940;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Registration {

    /* JADX INFO: renamed from: id */
    private final int f287id;
    private InterfaceC9940 instantiator;
    private Serializer serializer;
    private final Class type;
    private final boolean typeNameAscii;

    public Registration(Class cls, Serializer serializer, int i) {
        if (cls == null) {
            C6755.m11869("type cannot be null.");
            throw null;
        }
        if (serializer == null) {
            C6755.m11869("serializer cannot be null.");
            throw null;
        }
        this.type = cls;
        this.serializer = serializer;
        this.f287id = i;
        this.typeNameAscii = Util.isAscii(cls.getName());
    }

    public int getId() {
        return this.f287id;
    }

    public InterfaceC9940 getInstantiator() {
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

    public void setInstantiator(InterfaceC9940 interfaceC9940) {
        if (interfaceC9940 != null) {
            this.instantiator = interfaceC9940;
        } else {
            C6755.m11869("instantiator cannot be null.");
        }
    }

    public void setSerializer(Serializer serializer) {
        if (serializer == null) {
            C6755.m11869("serializer cannot be null.");
            return;
        }
        this.serializer = serializer;
        if (Log.TRACE) {
            Log.trace("kryo", "Update registered serializer: " + this.type.getName() + " (" + serializer.getClass().getName() + ")");
        }
    }

    public String toString() {
        return "[" + this.f287id + ", " + Util.className(this.type) + "]";
    }
}
