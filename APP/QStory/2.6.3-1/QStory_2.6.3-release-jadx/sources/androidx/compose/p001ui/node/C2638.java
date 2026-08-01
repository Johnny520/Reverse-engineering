package androidx.compose.p001ui.node;

import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.snapshots.C2110;
import androidx.compose.runtime.snapshots.C2113;
import java.util.Arrays;
import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2638 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2110 f5619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f5618 = new InterfaceC7387() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        public final void invoke(C2583 c2583) {
            if (c2583.m3803()) {
                C2583.m3780(c2583, false, 7);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2583) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7387 f5617 = new InterfaceC7387() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        public final void invoke(C2583 c2583) {
            if (c2583.m3803()) {
                C2583.m3784(c2583, false, 7);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2583) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7387 f5616 = new InterfaceC7387() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        public final void invoke(C2583 c2583) {
            if (c2583.m3803()) {
                c2583.m3805();
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2583) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7387 f5615 = new InterfaceC7387() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        public final void invoke(C2583 c2583) {
            if (c2583.m3803()) {
                c2583.m3785(false);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2583) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC7387 f5614 = new InterfaceC7387() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        public final void invoke(C2583 c2583) {
            if (c2583.m3803()) {
                c2583.m3785(false);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2583) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f5621 = new InterfaceC7387() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        public final void invoke(C2583 c2583) {
            if (c2583.m3803()) {
                c2583.m3788(false);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2583) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f5620 = new InterfaceC7387() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        public final void invoke(C2583 c2583) {
            if (c2583.m3803()) {
                c2583.m3788(false);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2583) obj);
            return C6008.f15084;
        }
    };

    public C2638(InterfaceC7387 interfaceC7387) {
        this.f5619 = new C2110(interfaceC7387);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3972() {
        C2110 c2110 = this.f5619;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = new InterfaceC7387() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // p068.InterfaceC7387
            public final Boolean invoke(Object obj) {
                obj.getClass();
                return Boolean.valueOf(!((InterfaceC2639) obj).mo3815());
            }
        };
        synchronized (c2110.f4060) {
            try {
                C2059 c2059 = c2110.f4053;
                int i = c2059.f3865;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    Object[] objArr = c2059.f3866;
                    if (i2 < i) {
                        C2113 c2113 = (C2113) objArr[i2];
                        c2113.m2813(ownerSnapshotObserver$clearInvalidObservations$1);
                        if (!c2113.f4072.m1321()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = c2059.f3866;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    } else {
                        int i4 = i - i3;
                        Arrays.fill(objArr, i4, i, (Object) null);
                        c2059.f3865 = i4;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
