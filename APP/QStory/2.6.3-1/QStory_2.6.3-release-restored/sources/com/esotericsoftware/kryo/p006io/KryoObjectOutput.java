package com.esotericsoftware.kryo.p006io;

import com.esotericsoftware.kryo.Kryo;
import java.io.ObjectOutput;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class KryoObjectOutput extends KryoDataOutput implements ObjectOutput {
    private final Kryo kryo;

    public KryoObjectOutput(Kryo kryo, Output output) {
        super(output);
        this.kryo = kryo;
    }

    @Override // com.esotericsoftware.kryo.p006io.KryoDataOutput, java.lang.AutoCloseable
    public void close() {
        this.output.close();
    }

    @Override // java.io.ObjectOutput
    public void flush() {
        this.output.flush();
    }

    @Override // java.io.ObjectOutput
    public void writeObject(Object obj) {
        this.kryo.writeClassAndObject(this.output, obj);
    }
}
