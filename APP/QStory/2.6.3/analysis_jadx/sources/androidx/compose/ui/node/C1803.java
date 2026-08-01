package androidx.compose.ui.node;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.snapshots.C1275;
import androidx.compose.runtime.snapshots.C1278;
import java.util.Arrays;
import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1275 f5274;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f5273 = new InterfaceC6558() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3243()) {
                C1748.m3220(c1748, false, 7);
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6558 f5272 = new InterfaceC6558() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3243()) {
                C1748.m3224(c1748, false, 7);
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6558 f5271 = new InterfaceC6558() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3243()) {
                c1748.m3245();
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6558 f5270 = new InterfaceC6558() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3243()) {
                c1748.m3225(false);
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6558 f5269 = new InterfaceC6558() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3243()) {
                c1748.m3225(false);
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f5276 = new InterfaceC6558() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3243()) {
                c1748.m3228(false);
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f5275 = new InterfaceC6558() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        public final void invoke(C1748 c1748) {
            if (c1748.m3243()) {
                c1748.m3228(false);
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1748) obj);
            return C5176.f14739;
        }
    };

    public C1803(InterfaceC6558 interfaceC6558) {
        this.f5274 = new C1275(interfaceC6558);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3412() {
        C1275 c1275 = this.f5274;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = new InterfaceC6558() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // p052.InterfaceC6558
            public final Boolean invoke(Object obj) {
                obj.getClass();
                return Boolean.valueOf(!((InterfaceC1804) obj).mo3255());
            }
        };
        synchronized (c1275.f3715) {
            try {
                C1224 c1224 = c1275.f3708;
                int i = c1224.f3520;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    Object[] objArr = c1224.f3521;
                    if (i2 < i) {
                        C1278 c1278 = (C1278) objArr[i2];
                        c1278.m2253(ownerSnapshotObserver$clearInvalidObservations$1);
                        if (!c1278.f3727.m761()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = c1224.f3521;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    } else {
                        int i4 = i - i3;
                        Arrays.fill(objArr, i4, i, (Object) null);
                        c1224.f3520 = i4;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
