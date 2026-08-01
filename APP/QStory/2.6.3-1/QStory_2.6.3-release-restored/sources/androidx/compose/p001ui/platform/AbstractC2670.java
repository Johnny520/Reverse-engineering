package androidx.compose.p001ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.InterfaceC2203;
import androidx.compose.runtime.internal.C2088;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p227.C8766;
import p227.C8767;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2670 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2193 f5682 = new C2193(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        @Override // p068.InterfaceC7372
        public final Configuration invoke() {
            AbstractC2670.m4028("LocalConfiguration");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2169 f5681 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        @Override // p068.InterfaceC7372
        public final Context invoke() {
            AbstractC2670.m4028("LocalContext");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2193 f5680 = new C2193(new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResources$1
        @Override // p068.InterfaceC7387
        public final Resources invoke(InterfaceC2203 interfaceC2203) {
            C2193 c2193 = AbstractC2670.f5682;
            C2088 c2088 = (C2088) interfaceC2203;
            c2088.getClass();
            AbstractC2202.m3042(c2088, c2193);
            return ((Context) AbstractC2202.m3042((C2088) interfaceC2203, AbstractC2670.f5681)).getResources();
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2169 f5679 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        @Override // p068.InterfaceC7372
        public final C8767 invoke() {
            AbstractC2670.m4028("LocalImageVectorCache");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2169 f5678 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        @Override // p068.InterfaceC7372
        public final C8766 invoke() {
            AbstractC2670.m4028("LocalResourceIdCache");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2169 f5677 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        @Override // p068.InterfaceC7372
        public final View invoke() {
            AbstractC2670.m4028("LocalView");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m4028(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
