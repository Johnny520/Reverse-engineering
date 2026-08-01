package androidx.appcompat.widget;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.TlsVersion;
import p015.C6225;
import p015.C6226;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
    public void m589(CharSequence charSequence) {
        StringBuilder sb = (StringBuilder) this.f600;
        if (this.f601) {
            this.f601 = false;
            sb.append((CharSequence) this.f599);
        }
        sb.append(charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m590() {
        StringBuilder sb = (StringBuilder) this.f599;
        int length = sb.length();
        if (length != 0) {
            sb.setLength(length - 2);
        } else {
            C5919.m11249(" Outdent() without matching Indent().");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m591() {
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
    public void m592() {
        ((StringBuilder) this.f600).append((CharSequence) "\n");
        this.f601 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m593(C6226... c6226Arr) {
        if (!this.f602) {
            C5919.m11249("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(c6226Arr.length);
        for (C6226 c6226 : c6226Arr) {
            arrayList.add(c6226.f17160);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f602) {
            C5919.m11249("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f600 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C5919.m11249("At least one cipher suite is required");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6225 m594() {
        return new C6225(this.f602, this.f601, (String[]) this.f600, (String[]) this.f599);
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m595(TlsVersion... tlsVersionArr) {
        if (!this.f602) {
            C5919.m11249("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(tlsVersionArr.length);
        for (TlsVersion tlsVersion : tlsVersionArr) {
            arrayList.add(tlsVersion.javaName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f602) {
            C5919.m11249("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f599 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C5919.m11249("At least one TLS version is required");
        }
    }

    public C0140() {
        this.f602 = true;
    }
}
