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
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p116.InterfaceC7338;
import p116.InterfaceC7345;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder extends AbstractC2076 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC6558 f6137;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public InterfaceC6558 f6138;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C1619 f6139;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final View f6140;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC6558 f6141;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public InterfaceC7338 f6142;

    public ViewFactoryHolder(Context context, InterfaceC6558 interfaceC6558, AbstractC1372 abstractC1372, InterfaceC7345 interfaceC7345, int i, InterfaceC1801 interfaceC1801) {
        View view = (View) interfaceC6558.invoke(context);
        C1619 c1619 = new C1619();
        super(context, abstractC1372, i, c1619, view, interfaceC1801);
        this.f6140 = view;
        this.f6139 = c1619;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objMo1483 = interfaceC7345 != null ? interfaceC7345.mo1483(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo1483 instanceof SparseArray ? (SparseArray) objMo1483 : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC7345 != null) {
            setSavableRegistryEntry(interfaceC7345.mo1481(strValueOf, new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                {
                    super(0);
                }

                @Override // p052.InterfaceC6543
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
                    this.this$0.f6140.saveHierarchyState(sparseArray2);
                    return sparseArray2;
                }
            }));
        }
        InterfaceC6558 interfaceC65582 = AbstractC2084.f6182;
        this.f6141 = interfaceC65582;
        this.f6137 = interfaceC65582;
        this.f6138 = interfaceC65582;
    }

    private final void setSavableRegistryEntry(InterfaceC7338 interfaceC7338) {
        InterfaceC7338 interfaceC73382 = this.f6142;
        if (interfaceC73382 != null) {
            ((C0108) interfaceC73382).m403();
        }
        this.f6142 = interfaceC7338;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final void m3813(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    public final C1619 getDispatcher() {
        return this.f6139;
    }

    public final InterfaceC6558 getReleaseBlock() {
        return this.f6138;
    }

    public final InterfaceC6558 getResetBlock() {
        return this.f6137;
    }

    public /* bridge */ /* synthetic */ AbstractC1881 getSubCompositionView() {
        return null;
    }

    public final InterfaceC6558 getUpdateBlock() {
        return this.f6141;
    }

    public final void setReleaseBlock(InterfaceC6558 interfaceC6558) {
        this.f6138 = interfaceC6558;
        setRelease(new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3814invoke() {
                ViewFactoryHolder viewFactoryHolder = this.this$0;
                viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.f6140);
                ViewFactoryHolder.m3813(this.this$0);
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3814invoke();
                return C5176.f14739;
            }
        });
    }

    public final void setResetBlock(InterfaceC6558 interfaceC6558) {
        this.f6137 = interfaceC6558;
        setReset(new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3815invoke() {
                ViewFactoryHolder viewFactoryHolder = this.this$0;
                viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.f6140);
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3815invoke();
                return C5176.f14739;
            }
        });
    }

    public final void setUpdateBlock(InterfaceC6558 interfaceC6558) {
        this.f6141 = interfaceC6558;
        setUpdate(new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3816invoke() {
                ViewFactoryHolder viewFactoryHolder = this.this$0;
                viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.f6140);
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3816invoke();
                return C5176.f14739;
            }
        });
    }

    public View getViewRoot() {
        return this;
    }
}
