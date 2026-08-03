package p308v1;

import java.io.Serializable;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: v1.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4408m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14676a;

    /* JADX INFO: renamed from: b */
    public final C4405l f14677b;

    /* JADX INFO: renamed from: c */
    public final C4405l f14678c;

    /* JADX INFO: renamed from: d */
    public final C4405l f14679d;

    /* JADX INFO: renamed from: e */
    public final C4405l f14680e;

    /* JADX INFO: renamed from: f */
    public final Serializable f14681f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: v1.m[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C4408m(C4408m[] c4408mArr) {
        this.f14676a = 0;
        this.f14681f = c4408mArr;
        int length = c4408mArr.length;
        C4405l[] c4405lArr = new C4405l[length];
        for (int i9 = 0; i9 < length; i9++) {
            c4405lArr[i9] = ((C4408m[]) this.f14681f)[i9].m8871b();
        }
        this.f14677b = new C4405l(1, new C4410m1(c4405lArr, 0));
        int length2 = ((C4408m[]) this.f14681f).length;
        C4405l[] c4405lArr2 = new C4405l[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            c4405lArr2[i10] = ((C4408m[]) this.f14681f)[i10].m8873d();
        }
        this.f14678c = new C4405l(0, new C4402k(c4405lArr2, 0));
        int length3 = ((C4408m[]) this.f14681f).length;
        C4405l[] c4405lArr3 = new C4405l[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            c4405lArr3[i11] = ((C4408m[]) this.f14681f)[i11].m8872c();
        }
        this.f14679d = new C4405l(1, new C4410m1(c4405lArr3, 1));
        int length4 = ((C4408m[]) this.f14681f).length;
        C4405l[] c4405lArr4 = new C4405l[length4];
        for (int i12 = 0; i12 < length4; i12++) {
            c4405lArr4[i12] = ((C4408m[]) this.f14681f)[i12].m8870a();
        }
        this.f14680e = new C4405l(0, new C4402k(c4405lArr4, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C4405l m8870a() {
        switch (this.f14676a) {
        }
        return this.f14680e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C4405l m8871b() {
        switch (this.f14676a) {
        }
        return this.f14677b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C4405l m8872c() {
        switch (this.f14676a) {
        }
        return this.f14679d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C4405l m8873d() {
        switch (this.f14676a) {
        }
        return this.f14678c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f14676a) {
            case 0:
                return AbstractC4165l.m8369F0((C4408m[]) this.f14681f, null, 57);
            default:
                return "RectRulers(" + ((String) this.f14681f) + ')';
        }
    }

    public C4408m(String str) {
        this.f14676a = 1;
        this.f14681f = str;
        this.f14677b = new C4405l(1, null);
        this.f14678c = new C4405l(0, null);
        this.f14679d = new C4405l(1, null);
        this.f14680e = new C4405l(0, null);
    }
}
