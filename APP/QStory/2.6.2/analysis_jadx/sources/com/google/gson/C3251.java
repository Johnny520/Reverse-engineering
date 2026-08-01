package com.google.gson;

import com.google.gson.internal.C3221;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import p270.AbstractC8270;
import p270.C8271;
import p271.AbstractC8321;
import p271.AbstractC8326;
import p271.C8278;
import p271.C8320;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ToNumberPolicy f10922;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ToNumberPolicy f10923;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ArrayDeque f10924;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f10925;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f10926;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Strictness f10927;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f10928;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f10929;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C3244 f10930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3221 f10921 = C3221.f10867;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LongSerializationPolicy f10920 = LongSerializationPolicy.DEFAULT;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final FieldNamingPolicy f10919 = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f10918 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f10917 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f10916 = new ArrayList();

    public C3251() {
        C3244 c3244 = C3252.f10934;
        this.f10926 = 2;
        this.f10925 = 2;
        this.f10929 = true;
        this.f10930 = C3252.f10934;
        this.f10927 = null;
        this.f10928 = true;
        this.f10923 = C3252.f10931;
        this.f10922 = C3252.f10933;
        this.f10924 = new ArrayDeque();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7347() {
        Strictness strictness = Strictness.LENIENT;
        Objects.requireNonNull(strictness);
        this.f10927 = strictness;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3252 m7348() {
        C8278 c8278;
        C8278 c82782;
        ArrayList arrayList = this.f10917;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10916;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = AbstractC8270.f22895;
        int i = this.f10926;
        int i2 = this.f10925;
        if (i != 2 || i2 != 2) {
            C8320 c8320 = new C8320(AbstractC8321.f22955, i, i2);
            C8278 c82783 = AbstractC8326.f22973;
            C8278 c82784 = new C8278(Date.class, c8320, 0);
            if (z) {
                C8271 c8271 = AbstractC8270.f22893;
                c8271.getClass();
                c8278 = new C8278(c8271.f22956, new C8320(c8271, i, i2), 0);
                C8271 c82712 = AbstractC8270.f22894;
                c82712.getClass();
                c82782 = new C8278(c82712.f22956, new C8320(c82712, i, i2), 0);
            } else {
                c8278 = null;
                c82782 = null;
            }
            arrayList3.add(c82784);
            if (z) {
                arrayList3.add(c8278);
                arrayList3.add(c82782);
            }
        }
        return new C3252(this.f10921, this.f10919, new HashMap(this.f10918), this.f10929, this.f10930, this.f10927, this.f10928, this.f10920, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f10923, this.f10922, new ArrayList(this.f10924));
    }
}
