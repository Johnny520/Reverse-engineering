package androidx.appcompat.widget;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.TlsVersion;
import p023.C6981;
import p023.C6982;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Serializable f944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f947;

    public C0987(StringBuilder sb, boolean z) {
        this.f944 = new StringBuilder();
        this.f946 = false;
        this.f945 = sb;
        this.f947 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m1150(CharSequence charSequence) {
        StringBuilder sb = (StringBuilder) this.f945;
        if (this.f946) {
            this.f946 = false;
            sb.append((CharSequence) this.f944);
        }
        sb.append(charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m1151() {
        StringBuilder sb = (StringBuilder) this.f944;
        int length = sb.length();
        if (length != 0) {
            sb.setLength(length - 2);
        } else {
            C6755.m11869(" Outdent() without matching Indent().");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m1152() {
        boolean z = this.f947;
        StringBuilder sb = (StringBuilder) this.f945;
        if (!z) {
            sb.append((CharSequence) " ");
        } else {
            sb.append((CharSequence) " \t ");
            this.f947 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m1153() {
        ((StringBuilder) this.f945).append((CharSequence) "\n");
        this.f946 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m1154(C6982... c6982Arr) {
        if (!this.f947) {
            C6755.m11869("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(c6982Arr.length);
        for (C6982 c6982 : c6982Arr) {
            arrayList.add(c6982.f17266);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f947) {
            C6755.m11869("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f945 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C6755.m11869("At least one cipher suite is required");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6981 m1155() {
        return new C6981(this.f947, this.f946, (String[]) this.f945, (String[]) this.f944);
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m1156(TlsVersion... tlsVersionArr) {
        if (!this.f947) {
            C6755.m11869("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(tlsVersionArr.length);
        for (TlsVersion tlsVersion : tlsVersionArr) {
            arrayList.add(tlsVersion.javaName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f947) {
            C6755.m11869("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f944 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C6755.m11869("At least one TLS version is required");
        }
    }

    public C0987() {
        this.f947 = true;
    }
}
