package com.google.gson;

import com.google.gson.internal.C4054;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import p286.AbstractC9100;
import p286.C9101;
import p287.AbstractC9151;
import p287.AbstractC9156;
import p287.C9108;
import p287.C9150;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ToNumberPolicy f11272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ToNumberPolicy f11273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ArrayDeque f11274;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f11275;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f11276;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Strictness f11277;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f11278;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f11279;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C4077 f11280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4054 f11271 = C4054.f11217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LongSerializationPolicy f11270 = LongSerializationPolicy.DEFAULT;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final FieldNamingPolicy f11269 = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f11268 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f11267 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f11266 = new ArrayList();

    public C4084() {
        C4077 c4077 = C4085.f11284;
        this.f11276 = 2;
        this.f11275 = 2;
        this.f11279 = true;
        this.f11280 = C4085.f11284;
        this.f11277 = null;
        this.f11278 = true;
        this.f11273 = C4085.f11281;
        this.f11272 = C4085.f11283;
        this.f11274 = new ArrayDeque();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7893() {
        Strictness strictness = Strictness.LENIENT;
        Objects.requireNonNull(strictness);
        this.f11277 = strictness;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4085 m7894() {
        C9108 c9108;
        C9108 c91082;
        ArrayList arrayList = this.f11267;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11266;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = AbstractC9100.f23239;
        int i = this.f11276;
        int i2 = this.f11275;
        if (i != 2 || i2 != 2) {
            C9150 c9150 = new C9150(AbstractC9151.f23299, i, i2);
            C9108 c91083 = AbstractC9156.f23317;
            C9108 c91084 = new C9108(Date.class, c9150, 0);
            if (z) {
                C9101 c9101 = AbstractC9100.f23237;
                c9101.getClass();
                c9108 = new C9108(c9101.f23300, new C9150(c9101, i, i2), 0);
                C9101 c91012 = AbstractC9100.f23238;
                c91012.getClass();
                c91082 = new C9108(c91012.f23300, new C9150(c91012, i, i2), 0);
            } else {
                c9108 = null;
                c91082 = null;
            }
            arrayList3.add(c91084);
            if (z) {
                arrayList3.add(c9108);
                arrayList3.add(c91082);
            }
        }
        return new C4085(this.f11271, this.f11269, new HashMap(this.f11268), this.f11279, this.f11280, this.f11277, this.f11278, this.f11270, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f11273, this.f11272, new ArrayList(this.f11274));
    }
}
