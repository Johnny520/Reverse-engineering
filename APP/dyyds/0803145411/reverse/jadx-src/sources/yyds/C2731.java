package yyds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲈᲀᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2731 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f13428 = true;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean f13429;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f13430;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Serializable f13431;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C2640 m4864() {
        return new C2640(this.f13428, this.f13429, (String[]) this.f13430, (String[]) this.f13431);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m4865(C1248... c1248Arr) {
        if (!this.f13428) {
            C0188.m798("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(c1248Arr.length);
        for (C1248 c1248 : c1248Arr) {
            arrayList.add(c1248.f5732);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f13428) {
            C0188.m798("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f13430 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C0188.m798("At least one cipher suite is required");
        }
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m4866(EnumC2365... enumC2365Arr) {
        if (!this.f13428) {
            C0188.m798("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(enumC2365Arr.length);
        for (EnumC2365 enumC2365 : enumC2365Arr) {
            arrayList.add(enumC2365.f11629);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f13428) {
            C0188.m798("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f13431 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C0188.m798("At least one TLS version is required");
        }
    }
}
