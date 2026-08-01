package org.apache.commons.lang3.mutable;

import p369.InterfaceC8961;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class MutableByte extends Number implements Comparable<MutableByte>, InterfaceC8961 {
    private static final long serialVersionUID = -1585823265;
    private byte value;

    public MutableByte(Number number) {
        this.value = number.byteValue();
    }

    public void add(Number number) {
        this.value = (byte) (number.byteValue() + this.value);
    }

    public byte addAndGet(Number number) {
        byte bByteValue = (byte) (number.byteValue() + this.value);
        this.value = bByteValue;
        return bByteValue;
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return this.value;
    }

    public void decrement() {
        this.value = (byte) (this.value - 1);
    }

    public byte decrementAndGet() {
        byte b = (byte) (this.value - 1);
        this.value = b;
        return b;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableByte) && this.value == ((MutableByte) obj).byteValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return getValue();
    }

    public byte getAndAdd(Number number) {
        byte b = this.value;
        this.value = (byte) (number.byteValue() + b);
        return b;
    }

    public byte getAndDecrement() {
        byte b = this.value;
        this.value = (byte) (b - 1);
        return b;
    }

    public byte getAndIncrement() {
        byte b = this.value;
        this.value = (byte) (b + 1);
        return b;
    }

    @Override // p369.InterfaceC8961
    @Deprecated
    public Byte getValue() {
        return Byte.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }

    public void increment() {
        this.value = (byte) (this.value + 1);
    }

    public byte incrementAndGet() {
        byte b = (byte) (this.value + 1);
        this.value = b;
        return b;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public void setValue(Number number) {
        this.value = number.byteValue();
    }

    public void subtract(Number number) {
        this.value = (byte) (this.value - number.byteValue());
    }

    public Byte toByte() {
        return Byte.valueOf(byteValue());
    }

    public String toString() {
        return String.valueOf((int) this.value);
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableByte mutableByte) {
        return this.value - mutableByte.value;
    }

    public void setValue(byte b) {
        this.value = b;
    }

    public MutableByte(byte b) {
        this.value = b;
    }

    public void add(byte b) {
        this.value = (byte) (this.value + b);
    }

    public byte addAndGet(byte b) {
        byte b2 = (byte) (this.value + b);
        this.value = b2;
        return b2;
    }

    public byte getAndAdd(byte b) {
        byte b2 = this.value;
        this.value = (byte) (b + b2);
        return b2;
    }

    public void subtract(byte b) {
        this.value = (byte) (this.value - b);
    }

    public MutableByte() {
    }

    public MutableByte(String str) {
        this.value = Byte.parseByte(str);
    }
}
