package androidx.appcompat.widget;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.TlsVersion;
import p007.C6152;
import p007.C6153;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Serializable f599;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f600;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f602;

    public C0140(StringBuilder sb, boolean z) {
        this.f599 = new StringBuilder();
        this.f601 = false;
        this.f600 = sb;
        this.f602 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m590(CharSequence charSequence) {
        StringBuilder sb = (StringBuilder) this.f600;
        if (this.f601) {
            this.f601 = false;
            sb.append((CharSequence) this.f599);
        }
        sb.append(charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m591() {
        StringBuilder sb = (StringBuilder) this.f599;
        int length = sb.length();
        if (length != 0) {
            sb.setLength(length - 2);
        } else {
            C5925.m11310(" Outdent() without matching Indent().");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m592() {
        boolean z = this.f602;
        StringBuilder sb = (StringBuilder) this.f600;
        if (!z) {
            sb.append((CharSequence) " ");
        } else {
            sb.append((CharSequence) " \t ");
            this.f602 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m593() {
        ((StringBuilder) this.f600).append((CharSequence) "\n");
        this.f601 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m594(C6153... c6153Arr) {
        if (!this.f602) {
            C5925.m11310("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(c6153Arr.length);
        for (C6153 c6153 : c6153Arr) {
            arrayList.add(c6153.f16921);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f602) {
            C5925.m11310("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f600 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C5925.m11310("At least one cipher suite is required");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6152 m595() {
        return new C6152(this.f602, this.f601, (String[]) this.f600, (String[]) this.f599);
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m596(TlsVersion... tlsVersionArr) {
        if (!this.f602) {
            C5925.m11310("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(tlsVersionArr.length);
        for (TlsVersion tlsVersion : tlsVersionArr) {
            arrayList.add(tlsVersion.javaName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f602) {
            C5925.m11310("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f599 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C5925.m11310("At least one TLS version is required");
        }
    }

    public C0140() {
        this.f602 = true;
    }
}
