package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3707 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3708 f11517 = new C3708();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7971(C3708 c3708) {
        if (!c3708.f11523.isEmpty()) {
            C3708 c37082 = this.f11517;
            if (c37082.f11523 == null) {
                c37082.f11523 = new C3429();
            }
            this.f11517.f11523.addAll(c3708.f11523);
        }
        if (!c3708.f11522.isEmpty()) {
            C3708 c37083 = this.f11517;
            if (c37083.f11522 == null) {
                c37083.f11522 = new C3612();
            }
            this.f11517.f11522.addAll(c3708.f11522);
        }
        if (!c3708.f11521.isEmpty()) {
            C3708 c37084 = this.f11517;
            if (c37084.f11521 == null) {
                c37084.f11521 = new C3429();
            }
            this.f11517.f11521.addAll(c3708.f11521);
        }
        if (!c3708.f11520.isEmpty()) {
            C3708 c37085 = this.f11517;
            if (c37085.f11520 == null) {
                c37085.f11520 = new ArrayList();
            }
            this.f11517.f11520.addAll(c3708.f11520);
        }
        if (c3708.f11519.isEmpty()) {
            return;
        }
        C3708 c37086 = this.f11517;
        if (c37086.f11519 == null) {
            c37086.f11519 = new ArrayList();
        }
        this.f11517.f11519.addAll(c3708.f11519);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3707 clone() {
        C3708 c3708 = new C3708();
        if (this.f11517.f11523 == null) {
            c3708.f11523 = null;
        } else {
            c3708.f11523 = new C3429(this.f11517.f11523, true);
        }
        if (this.f11517.f11522 == null) {
            c3708.f11522 = null;
        } else {
            c3708.f11522 = new C3612(this.f11517.f11522, true);
        }
        if (this.f11517.f11521 == null) {
            c3708.f11521 = null;
        } else {
            c3708.f11521 = new C3429(this.f11517.f11521, true);
        }
        if (this.f11517.f11520 == null) {
            c3708.f11520 = null;
        } else {
            c3708.f11520 = new ArrayList(this.f11517.f11520);
        }
        if (this.f11517.f11519 == null) {
            c3708.f11519 = null;
        } else {
            c3708.f11519 = new ArrayList(this.f11517.f11519);
        }
        C3707 c3707 = new C3707();
        c3707.f11517 = c3708;
        return c3707;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3708 m7973() {
        C3708 c3708 = new C3708();
        if (this.f11517.f11523 == null) {
            c3708.f11523 = C3429.f11087;
        } else {
            c3708.f11523 = new C3429(this.f11517.f11523, false);
        }
        if (this.f11517.f11522 == null) {
            c3708.f11522 = C3612.f11244;
        } else {
            c3708.f11522 = new C3612(this.f11517.f11522, false);
        }
        if (this.f11517.f11521 == null) {
            c3708.f11521 = C3429.f11087;
        } else {
            c3708.f11521 = new C3429(this.f11517.f11521, false);
        }
        if (this.f11517.f11520 == null) {
            c3708.f11520 = Collections.EMPTY_LIST;
        } else {
            c3708.f11520 = Collections.unmodifiableList(new ArrayList(this.f11517.f11520));
        }
        if (this.f11517.f11519 == null) {
            c3708.f11519 = Collections.EMPTY_LIST;
            return c3708;
        }
        c3708.f11519 = Collections.unmodifiableList(new ArrayList(this.f11517.f11519));
        return c3708;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7974(ByteString byteString) {
        C3708 c3708 = this.f11517;
        if (c3708.f11520 == null) {
            c3708.f11520 = new ArrayList();
        }
        this.f11517.f11520.add(byteString);
    }
}
