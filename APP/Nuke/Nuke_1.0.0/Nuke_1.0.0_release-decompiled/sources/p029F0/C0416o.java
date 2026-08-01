package p029F0;

import java.io.Serializable;
import p061L2.AbstractC0972l;

/* JADX INFO: renamed from: F0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0416o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1249a;

    /* JADX INFO: renamed from: b */
    public final C0414n f1250b;

    /* JADX INFO: renamed from: c */
    public final C0414n f1251c;

    /* JADX INFO: renamed from: d */
    public final C0414n f1252d;

    /* JADX INFO: renamed from: e */
    public final C0414n f1253e;

    /* JADX INFO: renamed from: f */
    public final Serializable f1254f;

    public C0416o(String str) {
        this.f1249a = 1;
        this.f1254f = str;
        this.f1250b = new C0414n(1, null);
        this.f1251c = new C0414n(0, null);
        this.f1252d = new C0414n(1, null);
        this.f1253e = new C0414n(0, null);
    }

    /* JADX INFO: renamed from: a */
    public final C0414n m676a() {
        switch (this.f1249a) {
        }
        return this.f1253e;
    }

    /* JADX INFO: renamed from: b */
    public final C0414n m677b() {
        switch (this.f1249a) {
        }
        return this.f1250b;
    }

    /* JADX INFO: renamed from: c */
    public final C0414n m678c() {
        switch (this.f1249a) {
        }
        return this.f1252d;
    }

    /* JADX INFO: renamed from: d */
    public final C0414n m679d() {
        switch (this.f1249a) {
        }
        return this.f1251c;
    }

    public final String toString() {
        switch (this.f1249a) {
            case 0:
                return AbstractC0972l.m2005c0((C0416o[]) this.f1254f, null, null, 57);
            default:
                String str = (String) this.f1254f;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0416o(C0416o[] c0416oArr) {
        this.f1249a = 0;
        this.f1254f = c0416oArr;
        int length = c0416oArr.length;
        C0414n[] c0414nArr = new C0414n[length];
        for (int i5 = 0; i5 < length; i5++) {
            c0414nArr[i5] = ((C0416o[]) this.f1254f)[i5].m677b();
        }
        this.f1250b = new C0414n(1, new C0421q0(c0414nArr, 0));
        int length2 = ((C0416o[]) this.f1254f).length;
        C0414n[] c0414nArr2 = new C0414n[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            c0414nArr2[i6] = ((C0416o[]) this.f1254f)[i6].m679d();
        }
        this.f1251c = new C0414n(0, new C0412m(c0414nArr2, 0));
        int length3 = ((C0416o[]) this.f1254f).length;
        C0414n[] c0414nArr3 = new C0414n[length3];
        for (int i7 = 0; i7 < length3; i7++) {
            c0414nArr3[i7] = ((C0416o[]) this.f1254f)[i7].m678c();
        }
        this.f1252d = new C0414n(1, new C0421q0(c0414nArr3, 1));
        int length4 = ((C0416o[]) this.f1254f).length;
        C0414n[] c0414nArr4 = new C0414n[length4];
        for (int i8 = 0; i8 < length4; i8++) {
            c0414nArr4[i8] = ((C0416o[]) this.f1254f)[i8].m676a();
        }
        this.f1253e = new C0414n(0, new C0412m(c0414nArr4, 1));
    }
}
