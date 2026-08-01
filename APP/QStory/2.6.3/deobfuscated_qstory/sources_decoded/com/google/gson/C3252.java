package com.google.gson;

import com.google.gson.internal.C3222;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import p270.AbstractC8271;
import p270.C8272;
import p271.AbstractC8322;
import p271.AbstractC8327;
import p271.C8279;
import p271.C8321;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3252 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ToNumberPolicy f10927;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ToNumberPolicy f10928;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ArrayDeque f10929;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f10930;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f10931;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Strictness f10932;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f10933;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f10934;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C3245 f10935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3222 f10926 = C3222.f10872;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LongSerializationPolicy f10925 = LongSerializationPolicy.DEFAULT;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final FieldNamingPolicy f10924 = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f10923 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f10922 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f10921 = new ArrayList();

    public C3252() {
        C3245 c3245 = C3253.f10939;
        this.f10931 = 2;
        this.f10930 = 2;
        this.f10934 = true;
        this.f10935 = C3253.f10939;
        this.f10932 = null;
        this.f10933 = true;
        this.f10928 = C3253.f10936;
        this.f10927 = C3253.f10938;
        this.f10929 = new ArrayDeque();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7334() {
        Strictness strictness = Strictness.LENIENT;
        Objects.requireNonNull(strictness);
        this.f10932 = strictness;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3253 m7335() {
        C8279 c8279;
        C8279 c82792;
        ArrayList arrayList = this.f10922;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10921;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = AbstractC8271.f22894;
        int i = this.f10931;
        int i2 = this.f10930;
        if (i != 2 || i2 != 2) {
            C8321 c8321 = new C8321(AbstractC8322.f22954, i, i2);
            C8279 c82793 = AbstractC8327.f22972;
            C8279 c82794 = new C8279(Date.class, c8321, 0);
            if (z) {
                C8272 c8272 = AbstractC8271.f22892;
                c8272.getClass();
                c8279 = new C8279(c8272.f22955, new C8321(c8272, i, i2), 0);
                C8272 c82722 = AbstractC8271.f22893;
                c82722.getClass();
                c82792 = new C8279(c82722.f22955, new C8321(c82722, i, i2), 0);
            } else {
                c8279 = null;
                c82792 = null;
            }
            arrayList3.add(c82794);
            if (z) {
                arrayList3.add(c8279);
                arrayList3.add(c82792);
            }
        }
        return new C3253(this.f10926, this.f10924, new HashMap(this.f10923), this.f10934, this.f10935, this.f10932, this.f10933, this.f10925, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f10928, this.f10927, new ArrayList(this.f10929));
    }
}
