package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.Kryo;
import java.io.ObjectOutput;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class KryoObjectOutput extends KryoDataOutput implements ObjectOutput {
    private final Kryo kryo;

    public KryoObjectOutput(Kryo kryo, Output output) {
        super(output);
        this.kryo = kryo;
    }

    @Override // com.esotericsoftware.kryo.io.KryoDataOutput, java.lang.AutoCloseable
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
