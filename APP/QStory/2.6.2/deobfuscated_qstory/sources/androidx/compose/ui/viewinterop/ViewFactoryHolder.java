package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.C0108;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.ui.input.nestedscroll.C1619;
import androidx.compose.ui.node.InterfaceC1801;
import androidx.compose.ui.platform.AbstractC1881;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p116.InterfaceC7337;
import p116.InterfaceC7344;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder extends AbstractC2076 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC6557 f6136;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public InterfaceC6557 f6137;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C1619 f6138;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final View f6139;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC6557 f6140;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public InterfaceC7337 f6141;

    public ViewFactoryHolder(Context context, InterfaceC6557 interfaceC6557, AbstractC1372 abstractC1372, InterfaceC7344 interfaceC7344, int i, InterfaceC1801 interfaceC1801) {
        View view = (View) interfaceC6557.invoke(context);
        C1619 c1619 = new C1619();
        super(context, abstractC1372, i, c1619, view, interfaceC1801);
        this.f6139 = view;
        this.f6138 = c1619;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objMo1473 = interfaceC7344 != null ? interfaceC7344.mo1473(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo1473 instanceof SparseArray ? (SparseArray) objMo1473 : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC7344 != null) {
            setSavableRegistryEntry(interfaceC7344.mo1471(strValueOf, new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                {
                    super(0);
                }

                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
                    this.this$0.f6139.saveHierarchyState(sparseArray2);
                    return sparseArray2;
                }
            }));
        }
        InterfaceC6557 interfaceC65572 = AbstractC2084.f6181;
        this.f6140 = interfaceC65572;
        this.f6136 = interfaceC65572;
        this.f6137 = interfaceC65572;
    }

    private final void setSavableRegistryEntry(InterfaceC7337 interfaceC7337) {
        InterfaceC7337 interfaceC73372 = this.f6141;
        if (interfaceC73372 != null) {
            ((C0108) interfaceC73372).m402();
        }
        this.f6141 = interfaceC7337;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final void m3803(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    public final C1619 getDispatcher() {
        return this.f6138;
    }

    public final InterfaceC6557 getReleaseBlock() {
        return this.f6137;
    }

    public final InterfaceC6557 getResetBlock() {
        return this.f6136;
    }

    public /* bridge */ /* synthetic */ AbstractC1881 getSubCompositionView() {
        return null;
    }

    public final InterfaceC6557 getUpdateBlock() {
        return this.f6140;
    }

    public final void setReleaseBlock(InterfaceC6557 interfaceC6557) {
        this.f6137 = interfaceC6557;
        setRelease(new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3804invoke() {
                ViewFactoryHolder viewFactoryHolder = this.this$0;
                viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.f6139);
                ViewFactoryHolder.m3803(this.this$0);
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3804invoke();
                return C5175.f14739;
            }
        });
    }

    public final void setResetBlock(InterfaceC6557 interfaceC6557) {
        this.f6136 = interfaceC6557;
        setReset(new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3805invoke() {
                ViewFactoryHolder viewFactoryHolder = this.this$0;
                viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.f6139);
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3805invoke();
                return C5175.f14739;
            }
        });
    }

    public final void setUpdateBlock(InterfaceC6557 interfaceC6557) {
        this.f6140 = interfaceC6557;
        setUpdate(new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3806invoke() {
                ViewFactoryHolder viewFactoryHolder = this.this$0;
                viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.f6139);
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3806invoke();
                return C5175.f14739;
            }
        });
    }

    public View getViewRoot() {
        return this;
    }
}
