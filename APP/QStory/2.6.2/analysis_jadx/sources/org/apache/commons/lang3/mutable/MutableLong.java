package org.apache.commons.lang3.mutable;

import p369.InterfaceC8961;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class MutableLong extends Number implements Comparable<MutableLong>, InterfaceC8961 {
    private static final long serialVersionUID = 62986528375L;
    private long value;

    public MutableLong(Number number) {
        this.value = number.longValue();
    }

    public void add(Number number) {
        this.value = number.longValue() + this.value;
    }

    public long addAndGet(Number number) {
        long jLongValue = number.longValue() + this.value;
        this.value = jLongValue;
        return jLongValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableLong mutableLong) {
        long j = this.value;
        long j2 = mutableLong.value;
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public void decrement() {
        this.value--;
    }

    public long decrementAndGet() {
        long j = this.value - 1;
        this.value = j;
        return j;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableLong) && this.value == ((MutableLong) obj).longValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return getValue();
    }

    public long getAndAdd(Number number) {
        long j = this.value;
        this.value = number.longValue() + j;
        return j;
    }

    public long getAndDecrement() {
        long j = this.value;
        this.value = j - 1;
        return j;
    }

    public long getAndIncrement() {
        long j = this.value;
        this.value = 1 + j;
        return j;
    }

    @Override // p369.InterfaceC8961
    @Deprecated
    public Long getValue() {
        return Long.valueOf(this.value);
    }

    public int hashCode() {
        long j = this.value;
        return (int) (j ^ (j >>> 32));
    }

    public void increment() {
        this.value++;
    }

    public long incrementAndGet() {
        long j = this.value + 1;
        this.value = j;
        return j;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public void setValue(Number number) {
        this.value = number.longValue();
    }

    public void subtract(Number number) {
        this.value -= number.longValue();
    }

    public Long toLong() {
        return Long.valueOf(longValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(long j) {
        this.value = j;
    }

    public MutableLong(long j) {
        this.value = j;
    }

    public void add(long j) {
        this.value += j;
    }

    public long addAndGet(long j) {
        long j2 = this.value + j;
        this.value = j2;
        return j2;
    }

    public long getAndAdd(long j) {
        long j2 = this.value;
        this.value = j + j2;
        return j2;
    }

    public void subtract(long j) {
        this.value -= j;
    }

    public MutableLong() {
    }

    public MutableLong(String str) {
        this.value = Long.parseLong(str);
    }
}
