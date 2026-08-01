package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import p395.InterfaceC9132;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class Registration {
    private final int id;
    private InterfaceC9132 instantiator;
    private Serializer serializer;
    private final Class type;
    private final boolean typeNameAscii;

    public Registration(Class cls, Serializer serializer, int i) {
        if (cls == null) {
            C5919.m11249("type cannot be null.");
            throw null;
        }
        if (serializer == null) {
            C5919.m11249("serializer cannot be null.");
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

    public InterfaceC9132 getInstantiator() {
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

    public void setInstantiator(InterfaceC9132 interfaceC9132) {
        if (interfaceC9132 != null) {
            this.instantiator = interfaceC9132;
        } else {
            C5919.m11249("instantiator cannot be null.");
        }
    }

    public void setSerializer(Serializer serializer) {
        if (serializer == null) {
            C5919.m11249("serializer cannot be null.");
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
