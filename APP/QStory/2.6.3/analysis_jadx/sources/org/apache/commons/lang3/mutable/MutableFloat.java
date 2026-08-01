package org.apache.commons.lang3.mutable;

import p369.InterfaceC8957;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MutableFloat extends Number implements Comparable<MutableFloat>, InterfaceC8957 {
    private static final long serialVersionUID = 5787169186L;
    private float value;

    public MutableFloat(Number number) {
        this.value = number.floatValue();
    }

    public void add(Number number) {
        this.value = number.floatValue() + this.value;
    }

    public float addAndGet(Number number) {
        float fFloatValue = number.floatValue() + this.value;
        this.value = fFloatValue;
        return fFloatValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableFloat mutableFloat) {
        return Float.compare(this.value, mutableFloat.value);
    }

    public void decrement() {
        this.value -= 1.0f;
    }

    public float decrementAndGet() {
        float f = this.value - 1.0f;
        this.value = f;
        return f;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableFloat) && Float.floatToIntBits(((MutableFloat) obj).value) == Float.floatToIntBits(this.value);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return getValue();
    }

    public float getAndAdd(Number number) {
        float f = this.value;
        this.value = number.floatValue() + f;
        return f;
    }

    public float getAndDecrement() {
        float f = this.value;
        this.value = f - 1.0f;
        return f;
    }

    public float getAndIncrement() {
        float f = this.value;
        this.value = 1.0f + f;
        return f;
    }

    @Override // p369.InterfaceC8957
    @Deprecated
    public Float getValue() {
        return Float.valueOf(this.value);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    public void increment() {
        this.value += 1.0f;
    }

    public float incrementAndGet() {
        float f = this.value + 1.0f;
        this.value = f;
        return f;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    public boolean isInfinite() {
        return Float.isInfinite(this.value);
    }

    public boolean isNaN() {
        return Float.isNaN(this.value);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.value;
    }

    public void setValue(Number number) {
        this.value = number.floatValue();
    }

    public void subtract(Number number) {
        this.value -= number.floatValue();
    }

    public Float toFloat() {
        return Float.valueOf(floatValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(float f) {
        this.value = f;
    }

    public MutableFloat(float f) {
        this.value = f;
    }

    public void add(float f) {
        this.value += f;
    }

    public float addAndGet(float f) {
        float f2 = this.value + f;
        this.value = f2;
        return f2;
    }

    public float getAndAdd(float f) {
        float f2 = this.value;
        this.value = f + f2;
        return f2;
    }

    public void subtract(float f) {
        this.value -= f;
    }

    public MutableFloat() {
    }

    public MutableFloat(String str) {
        this.value = Float.parseFloat(str);
    }
}
