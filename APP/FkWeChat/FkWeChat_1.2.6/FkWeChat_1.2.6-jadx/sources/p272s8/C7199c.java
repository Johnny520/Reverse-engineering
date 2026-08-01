package p272s8;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;
import p185m8.AbstractC5078f;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: s8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7199c extends AbstractC5078f implements InterfaceC7197a, RandomAccess, Serializable {

    /* JADX INFO: renamed from: r */
    public final Enum[] f23877r;

    public C7199c(Enum[] enumArr) {
        enumArr.getClass();
        this.f23877r = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new C7200d(this.f23877r);
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f23877r.length;
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m28438e((Enum) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m28438e(Enum r32) {
        r32.getClass();
        return ((Enum) AbstractC5106t.m20736h0(this.f23877r, r32.ordinal())) == r32;
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m28440o((Enum) obj);
        }
        return -1;
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC5078f.f15387q.m20521b(i10, this.f23877r.length);
        return this.f23877r[i10];
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m28441p((Enum) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public int m28440o(Enum r32) {
        r32.getClass();
        int iOrdinal = r32.ordinal();
        if (((Enum) AbstractC5106t.m20736h0(this.f23877r, iOrdinal)) == r32) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public int m28441p(Enum r12) {
        r12.getClass();
        return m28440o(r12);
    }
}
