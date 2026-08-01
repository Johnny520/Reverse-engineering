package p299ub;

import bsh.C1189h4;
import java.util.Iterator;
import p024b9.AbstractC1043k;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: ub.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8620f implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: v */
    public static final a f28679v = new a(null);

    /* JADX INFO: renamed from: q */
    public final CharSequence f28680q;

    /* JADX INFO: renamed from: r */
    public int f28681r;

    /* JADX INFO: renamed from: s */
    public int f28682s;

    /* JADX INFO: renamed from: t */
    public int f28683t;

    /* JADX INFO: renamed from: u */
    public int f28684u;

    public C8620f(CharSequence charSequence) {
        charSequence.getClass();
        this.f28680q = charSequence;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            C1189h4.m4429a();
            return null;
        }
        this.f28681r = 0;
        int i10 = this.f28683t;
        int i11 = this.f28682s;
        this.f28682s = this.f28684u + i10;
        return this.f28680q.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f28681r;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f28684u < 0) {
            this.f28681r = 2;
            return false;
        }
        int length = this.f28680q.length();
        int length2 = this.f28680q.length();
        for (int i13 = this.f28682s; i13 < length2; i13++) {
            char cCharAt = this.f28680q.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f28680q.length() && this.f28680q.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f28681r = 1;
                this.f28684u = i10;
                this.f28683t = length;
                return true;
            }
        }
        i10 = -1;
        this.f28681r = 1;
        this.f28684u = i10;
        this.f28683t = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ub.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
