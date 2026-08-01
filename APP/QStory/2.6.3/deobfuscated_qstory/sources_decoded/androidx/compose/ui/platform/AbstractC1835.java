package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.InterfaceC1368;
import androidx.compose.runtime.internal.C1253;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p211.C7937;
import p211.C7938;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1835 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1358 f5337 = new C1358(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        @Override // p052.InterfaceC6543
        public final Configuration invoke() {
            AbstractC1835.m3468("LocalConfiguration");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1334 f5336 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        @Override // p052.InterfaceC6543
        public final Context invoke() {
            AbstractC1835.m3468("LocalContext");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1358 f5335 = new C1358(new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResources$1
        @Override // p052.InterfaceC6558
        public final Resources invoke(InterfaceC1368 interfaceC1368) {
            C1358 c1358 = AbstractC1835.f5337;
            C1253 c1253 = (C1253) interfaceC1368;
            c1253.getClass();
            AbstractC1367.m2482(c1253, c1358);
            return ((Context) AbstractC1367.m2482((C1253) interfaceC1368, AbstractC1835.f5336)).getResources();
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1334 f5334 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        @Override // p052.InterfaceC6543
        public final C7938 invoke() {
            AbstractC1835.m3468("LocalImageVectorCache");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1334 f5333 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        @Override // p052.InterfaceC6543
        public final C7937 invoke() {
            AbstractC1835.m3468("LocalResourceIdCache");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1334 f5332 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        @Override // p052.InterfaceC6543
        public final View invoke() {
            AbstractC1835.m3468("LocalView");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3468(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
