package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3708 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3709 f11522 = new C3709();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7958(C3709 c3709) {
        if (!c3709.f11528.isEmpty()) {
            C3709 c37092 = this.f11522;
            if (c37092.f11528 == null) {
                c37092.f11528 = new C3430();
            }
            this.f11522.f11528.addAll(c3709.f11528);
        }
        if (!c3709.f11527.isEmpty()) {
            C3709 c37093 = this.f11522;
            if (c37093.f11527 == null) {
                c37093.f11527 = new C3613();
            }
            this.f11522.f11527.addAll(c3709.f11527);
        }
        if (!c3709.f11526.isEmpty()) {
            C3709 c37094 = this.f11522;
            if (c37094.f11526 == null) {
                c37094.f11526 = new C3430();
            }
            this.f11522.f11526.addAll(c3709.f11526);
        }
        if (!c3709.f11525.isEmpty()) {
            C3709 c37095 = this.f11522;
            if (c37095.f11525 == null) {
                c37095.f11525 = new ArrayList();
            }
            this.f11522.f11525.addAll(c3709.f11525);
        }
        if (c3709.f11524.isEmpty()) {
            return;
        }
        C3709 c37096 = this.f11522;
        if (c37096.f11524 == null) {
            c37096.f11524 = new ArrayList();
        }
        this.f11522.f11524.addAll(c3709.f11524);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3708 clone() {
        C3709 c3709 = new C3709();
        if (this.f11522.f11528 == null) {
            c3709.f11528 = null;
        } else {
            c3709.f11528 = new C3430(this.f11522.f11528, true);
        }
        if (this.f11522.f11527 == null) {
            c3709.f11527 = null;
        } else {
            c3709.f11527 = new C3613(this.f11522.f11527, true);
        }
        if (this.f11522.f11526 == null) {
            c3709.f11526 = null;
        } else {
            c3709.f11526 = new C3430(this.f11522.f11526, true);
        }
        if (this.f11522.f11525 == null) {
            c3709.f11525 = null;
        } else {
            c3709.f11525 = new ArrayList(this.f11522.f11525);
        }
        if (this.f11522.f11524 == null) {
            c3709.f11524 = null;
        } else {
            c3709.f11524 = new ArrayList(this.f11522.f11524);
        }
        C3708 c3708 = new C3708();
        c3708.f11522 = c3709;
        return c3708;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3709 m7960() {
        C3709 c3709 = new C3709();
        if (this.f11522.f11528 == null) {
            c3709.f11528 = C3430.f11092;
        } else {
            c3709.f11528 = new C3430(this.f11522.f11528, false);
        }
        if (this.f11522.f11527 == null) {
            c3709.f11527 = C3613.f11249;
        } else {
            c3709.f11527 = new C3613(this.f11522.f11527, false);
        }
        if (this.f11522.f11526 == null) {
            c3709.f11526 = C3430.f11092;
        } else {
            c3709.f11526 = new C3430(this.f11522.f11526, false);
        }
        if (this.f11522.f11525 == null) {
            c3709.f11525 = Collections.EMPTY_LIST;
        } else {
            c3709.f11525 = Collections.unmodifiableList(new ArrayList(this.f11522.f11525));
        }
        if (this.f11522.f11524 == null) {
            c3709.f11524 = Collections.EMPTY_LIST;
            return c3709;
        }
        c3709.f11524 = Collections.unmodifiableList(new ArrayList(this.f11522.f11524));
        return c3709;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7961(ByteString byteString) {
        C3709 c3709 = this.f11522;
        if (c3709.f11525 == null) {
            c3709.f11525 = new ArrayList();
        }
        this.f11522.f11525.add(byteString);
    }
}
