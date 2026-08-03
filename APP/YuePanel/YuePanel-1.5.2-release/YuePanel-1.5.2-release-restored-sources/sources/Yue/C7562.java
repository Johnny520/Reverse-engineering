package Yue;

import java.util.AbstractCollection;
import java.util.EmptyStackException;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7562 extends AbstractCollection {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Object[] f22858;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f22859;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7562() {
        this(15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        push(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Object[] objArr = this.f22858;
        while (true) {
            int i = this.f22859;
            if (i <= 0) {
                return;
            }
            int i2 = i - 1;
            this.f22859 = i2;
            objArr[i2] = null;
        }
    }

    public Object clone() {
        int i = this.f22859;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f22858, 0, objArr, 0, i);
        return new C7562(objArr, this.f22859);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f22859 == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        int i = this.f22859;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f22858, 0, objArr, 0, i);
        return new C3389(objArr);
    }

    public Object peek() {
        try {
            return this.f22858[this.f22859 - 1];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new EmptyStackException();
        }
    }

    public Object pop() {
        try {
            Object[] objArr = this.f22858;
            int i = this.f22859 - 1;
            this.f22859 = i;
            Object obj = objArr[i];
            objArr[i] = null;
            return obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (this.f22859 < 0) {
                this.f22859 = 0;
            }
            throw new EmptyStackException();
        }
    }

    public void push(Object obj) {
        if (this.f22859 == this.f22858.length) {
            m3732();
        }
        Object[] objArr = this.f22858;
        int i = this.f22859;
        this.f22859 = i + 1;
        objArr[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f22859;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3732() {
        int i = this.f22859;
        if (i == 0) {
            this.f22858 = new Object[1];
            return;
        }
        Object[] objArr = new Object[i * 2];
        System.arraycopy(this.f22858, 0, objArr, 0, i);
        this.f22858 = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7562(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.f22858 = new Object[i];
        this.f22859 = 0;
    }

    public C7562(Object[] objArr, int i) {
        this.f22858 = objArr;
        this.f22859 = i;
    }
}
