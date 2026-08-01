package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.p006io.Input;
import com.esotericsoftware.kryo.p006io.Output;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface ClassResolver {
    Registration getRegistration(int i);

    Registration getRegistration(Class cls);

    Registration readClass(Input input);

    Registration register(Registration registration);

    Registration registerImplicit(Class cls);

    void reset();

    void setKryo(Kryo kryo);

    Registration unregister(int i);

    Registration writeClass(Output output, Class cls);
}
