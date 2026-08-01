package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4540 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4541 f11867 = new C4541();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8517(C4541 c4541) {
        if (!c4541.f11873.isEmpty()) {
            C4541 c45412 = this.f11867;
            if (c45412.f11873 == null) {
                c45412.f11873 = new C4262();
            }
            this.f11867.f11873.addAll(c4541.f11873);
        }
        if (!c4541.f11872.isEmpty()) {
            C4541 c45413 = this.f11867;
            if (c45413.f11872 == null) {
                c45413.f11872 = new C4445();
            }
            this.f11867.f11872.addAll(c4541.f11872);
        }
        if (!c4541.f11871.isEmpty()) {
            C4541 c45414 = this.f11867;
            if (c45414.f11871 == null) {
                c45414.f11871 = new C4262();
            }
            this.f11867.f11871.addAll(c4541.f11871);
        }
        if (!c4541.f11870.isEmpty()) {
            C4541 c45415 = this.f11867;
            if (c45415.f11870 == null) {
                c45415.f11870 = new ArrayList();
            }
            this.f11867.f11870.addAll(c4541.f11870);
        }
        if (c4541.f11869.isEmpty()) {
            return;
        }
        C4541 c45416 = this.f11867;
        if (c45416.f11869 == null) {
            c45416.f11869 = new ArrayList();
        }
        this.f11867.f11869.addAll(c4541.f11869);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4540 clone() {
        C4541 c4541 = new C4541();
        if (this.f11867.f11873 == null) {
            c4541.f11873 = null;
        } else {
            c4541.f11873 = new C4262(this.f11867.f11873, true);
        }
        if (this.f11867.f11872 == null) {
            c4541.f11872 = null;
        } else {
            c4541.f11872 = new C4445(this.f11867.f11872, true);
        }
        if (this.f11867.f11871 == null) {
            c4541.f11871 = null;
        } else {
            c4541.f11871 = new C4262(this.f11867.f11871, true);
        }
        if (this.f11867.f11870 == null) {
            c4541.f11870 = null;
        } else {
            c4541.f11870 = new ArrayList(this.f11867.f11870);
        }
        if (this.f11867.f11869 == null) {
            c4541.f11869 = null;
        } else {
            c4541.f11869 = new ArrayList(this.f11867.f11869);
        }
        C4540 c4540 = new C4540();
        c4540.f11867 = c4541;
        return c4540;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4541 m8519() {
        C4541 c4541 = new C4541();
        if (this.f11867.f11873 == null) {
            c4541.f11873 = C4262.f11437;
        } else {
            c4541.f11873 = new C4262(this.f11867.f11873, false);
        }
        if (this.f11867.f11872 == null) {
            c4541.f11872 = C4445.f11594;
        } else {
            c4541.f11872 = new C4445(this.f11867.f11872, false);
        }
        if (this.f11867.f11871 == null) {
            c4541.f11871 = C4262.f11437;
        } else {
            c4541.f11871 = new C4262(this.f11867.f11871, false);
        }
        if (this.f11867.f11870 == null) {
            c4541.f11870 = Collections.EMPTY_LIST;
        } else {
            c4541.f11870 = Collections.unmodifiableList(new ArrayList(this.f11867.f11870));
        }
        if (this.f11867.f11869 == null) {
            c4541.f11869 = Collections.EMPTY_LIST;
            return c4541;
        }
        c4541.f11869 = Collections.unmodifiableList(new ArrayList(this.f11867.f11869));
        return c4541;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8520(ByteString byteString) {
        C4541 c4541 = this.f11867;
        if (c4541.f11870 == null) {
            c4541.f11870 = new ArrayList();
        }
        this.f11867.f11870.add(byteString);
    }
}
