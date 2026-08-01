package androidx.compose.animation.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.InterfaceC1356;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p052.InterfaceC6554;
import p199.AbstractC7862;
import p199.C7863;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0318 implements InterfaceC0322, InterfaceC1356 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f1070;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f1071;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f1072;

    public C0318(Context context, XmlResourceParser xmlResourceParser) {
        this.f1071 = new ArrayList();
        this.f1070 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC7862.f21525);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1072 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1072);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1070);
                this.f1070 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C7863().m13221((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo940(int i, int i2, int i3) {
        int i4 = this.f1070 == 0 ? this.f1072 : 0;
        ((InterfaceC1356) this.f1071).mo940(i + i4, i2 + i4, i3);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo941() {
        ((InterfaceC1356) this.f1071).mo941();
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo942(Object obj) {
        this.f1070++;
        ((InterfaceC1356) this.f1071).mo942(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo943(int i, Object obj) {
        ((InterfaceC1356) this.f1071).mo943(i + (this.f1070 == 0 ? this.f1072 : 0), obj);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public AbstractC0343 mo443(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return ((C0325) this.f1071).mo443(j, abstractC0343, abstractC03432, abstractC03433);
    }

    @Override // androidx.compose.animation.core.InterfaceC0322
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int mo944() {
        return this.f1072;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public AbstractC0343 mo446(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return ((C0325) this.f1071).mo446(j, abstractC0343, abstractC03432, abstractC03433);
    }

    @Override // androidx.compose.animation.core.InterfaceC0322
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int mo945() {
        return this.f1070;
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo946() {
        if (this.f1070 <= 0) {
            AbstractC1374.m2507("OffsetApplier up called with no corresponding down");
        }
        this.f1070--;
        ((InterfaceC1356) this.f1071).mo946();
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo947(int i, int i2) {
        ((InterfaceC1356) this.f1071).mo947(i + (this.f1070 == 0 ? this.f1072 : 0), i2);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Object mo948() {
        return ((InterfaceC1356) this.f1071).mo948();
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo949(Object obj, InterfaceC6554 interfaceC6554) {
        ((InterfaceC1356) this.f1071).mo949(obj, interfaceC6554);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo950(int i, Object obj) {
        ((InterfaceC1356) this.f1071).mo950(i + (this.f1070 == 0 ? this.f1072 : 0), obj);
    }

    public C0318() {
        this.f1071 = new C0318[256];
        this.f1072 = 0;
        this.f1070 = 0;
    }

    public C0318(int i, int i2, InterfaceC0335 interfaceC0335) {
        this.f1072 = i;
        this.f1070 = i2;
        this.f1071 = new C0325(new C0307(i, i2, interfaceC0335));
    }
}
