package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.Kryo;
import java.io.ObjectInput;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class KryoObjectInput extends KryoDataInput implements ObjectInput {
    private final Kryo kryo;

    public KryoObjectInput(Kryo kryo, Input input) {
        super(input);
        this.kryo = kryo;
    }

    @Override // java.io.ObjectInput
    public int available() {
        return 0;
    }

    @Override // com.esotericsoftware.kryo.io.KryoDataInput, java.lang.AutoCloseable
    public void close() {
        this.input.close();
    }

    @Override // java.io.ObjectInput
    public int read() {
        return this.input.read();
    }

    @Override // java.io.ObjectInput
    public Object readObject() {
        return this.kryo.readClassAndObject(this.input);
    }

    @Override // java.io.ObjectInput
    public long skip(long j) {
        return this.input.skip(j);
    }

    @Override // java.io.ObjectInput
    public int read(byte[] bArr) {
        return this.input.read(bArr);
    }

    @Override // java.io.ObjectInput
    public int read(byte[] bArr, int i, int i2) {
        return this.input.read(bArr, i, i2);
    }
}
