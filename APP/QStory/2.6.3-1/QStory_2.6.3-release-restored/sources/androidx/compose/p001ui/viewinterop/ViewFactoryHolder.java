package androidx.compose.p001ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.input.nestedscroll.C2454;
import androidx.compose.p001ui.node.InterfaceC2636;
import androidx.compose.p001ui.platform.AbstractC2716;
import androidx.compose.runtime.AbstractC2207;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p132.InterfaceC8167;
import p132.InterfaceC8174;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder extends AbstractC2909 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC7387 f6482;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public InterfaceC7387 f6483;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C2454 f6484;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final View f6485;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC7387 f6486;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public InterfaceC8167 f6487;

    public ViewFactoryHolder(Context context, InterfaceC7387 interfaceC7387, AbstractC2207 abstractC2207, InterfaceC8174 interfaceC8174, int i, InterfaceC2636 interfaceC2636) {
        View view = (View) interfaceC7387.invoke(context);
        C2454 c2454 = new C2454();
        super(context, abstractC2207, i, c2454, view, interfaceC2636);
        this.f6485 = view;
        this.f6484 = c2454;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objMo2043 = interfaceC8174 != null ? interfaceC8174.mo2043(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo2043 instanceof SparseArray ? (SparseArray) objMo2043 : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC8174 != null) {
            setSavableRegistryEntry(interfaceC8174.mo2041(strValueOf, new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                {
                    super(0);
                }

                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
                    this.this$0.f6485.saveHierarchyState(sparseArray2);
                    return sparseArray2;
                }
            }));
        }
        InterfaceC7387 interfaceC73872 = AbstractC2917.f6527;
        this.f6486 = interfaceC73872;
        this.f6482 = interfaceC73872;
        this.f6483 = interfaceC73872;
    }

    private final void setSavableRegistryEntry(InterfaceC8167 interfaceC8167) {
        InterfaceC8167 interfaceC81672 = this.f6487;
        if (interfaceC81672 != null) {
            ((C0955) interfaceC81672).m963();
        }
        this.f6487 = interfaceC8167;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final void m4373(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    public final C2454 getDispatcher() {
        return this.f6484;
    }

    public final InterfaceC7387 getReleaseBlock() {
        return this.f6483;
    }

    public final InterfaceC7387 getResetBlock() {
        return this.f6482;
    }

    public /* bridge */ /* synthetic */ AbstractC2716 getSubCompositionView() {
        return null;
    }

    public final InterfaceC7387 getUpdateBlock() {
        return this.f6486;
    }

    public final void setReleaseBlock(InterfaceC7387 interfaceC7387) {
        this.f6483 = interfaceC7387;
        setRelease(new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4374invoke() {
                ViewFactoryHolder viewFactoryHolder = this.this$0;
                viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.f6485);
                ViewFactoryHolder.m4373(this.this$0);
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4374invoke();
                return C6008.f15084;
            }
        });
    }

    public final void setResetBlock(InterfaceC7387 interfaceC7387) {
        this.f6482 = interfaceC7387;
        setReset(new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4375invoke() {
                ViewFactoryHolder viewFactoryHolder = this.this$0;
                viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.f6485);
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4375invoke();
                return C6008.f15084;
            }
        });
    }

    public final void setUpdateBlock(InterfaceC7387 interfaceC7387) {
        this.f6486 = interfaceC7387;
        setUpdate(new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4376invoke() {
                ViewFactoryHolder viewFactoryHolder = this.this$0;
                viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.f6485);
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4376invoke();
                return C6008.f15084;
            }
        });
    }

    public View getViewRoot() {
        return this;
    }
}
