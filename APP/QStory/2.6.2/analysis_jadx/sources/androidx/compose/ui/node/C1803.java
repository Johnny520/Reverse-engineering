package androidx.compose.ui.node;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.snapshots.C1275;
import androidx.compose.runtime.snapshots.C1278;
import java.util.Arrays;
import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1275 f5273;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f5272 = new InterfaceC6557() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3233()) {
                C1748.m3210(c1748, false, 7);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6557 f5271 = new InterfaceC6557() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3233()) {
                C1748.m3214(c1748, false, 7);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6557 f5270 = new InterfaceC6557() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3233()) {
                c1748.m3235();
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6557 f5269 = new InterfaceC6557() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3233()) {
                c1748.m3215(false);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6557 f5268 = new InterfaceC6557() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3233()) {
                c1748.m3215(false);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f5275 = new InterfaceC6557() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3233()) {
                c1748.m3218(false);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f5274 = new InterfaceC6557() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3233()) {
                c1748.m3218(false);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5175.f14739;
        }
    };

    public C1803(InterfaceC6557 interfaceC6557) {
        this.f5273 = new C1275(interfaceC6557);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3402() {
        C1275 c1275 = this.f5273;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = new InterfaceC6557() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // p052.InterfaceC6557
            public final Boolean invoke(Object obj) {
                obj.getClass();
                return Boolean.valueOf(!((InterfaceC1804) obj).mo3245());
            }
        };
        synchronized (c1275.f3714) {
            try {
                C1224 c1224 = c1275.f3707;
                int i = c1224.f3519;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    Object[] objArr = c1224.f3520;
                    if (i2 < i) {
                        C1278 c1278 = (C1278) objArr[i2];
                        c1278.m2243(ownerSnapshotObserver$clearInvalidObservations$1);
                        if (!c1278.f3726.m760()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = c1224.f3520;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    } else {
                        int i4 = i - i3;
                        Arrays.fill(objArr, i4, i, (Object) null);
                        c1224.f3519 = i4;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
