package androidx.compose.animation.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.InterfaceC2191;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p068.InterfaceC7383;
import p215.AbstractC8691;
import p215.C8692;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1164 implements InterfaceC1168, InterfaceC2191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f1415;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f1416;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f1417;

    public C1164(Context context, XmlResourceParser xmlResourceParser) {
        this.f1416 = new ArrayList();
        this.f1415 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC8691.f21870);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1417 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1417);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1415);
                this.f1415 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C8692().m13780((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo1500(int i, int i2, int i3) {
        int i4 = this.f1415 == 0 ? this.f1417 : 0;
        ((InterfaceC2191) this.f1416).mo1500(i + i4, i2 + i4, i3);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo1501() {
        ((InterfaceC2191) this.f1416).mo1501();
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo1502(Object obj) {
        this.f1415++;
        ((InterfaceC2191) this.f1416).mo1502(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo1503(int i, Object obj) {
        ((InterfaceC2191) this.f1416).mo1503(i + (this.f1415 == 0 ? this.f1417 : 0), obj);
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public AbstractC1189 mo1003(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return ((C1171) this.f1416).mo1003(j, abstractC1189, abstractC11892, abstractC11893);
    }

    @Override // androidx.compose.animation.core.InterfaceC1168
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int mo1504() {
        return this.f1417;
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public AbstractC1189 mo1006(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return ((C1171) this.f1416).mo1006(j, abstractC1189, abstractC11892, abstractC11893);
    }

    @Override // androidx.compose.animation.core.InterfaceC1168
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int mo1505() {
        return this.f1415;
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo1506() {
        if (this.f1415 <= 0) {
            AbstractC2209.m3067("OffsetApplier up called with no corresponding down");
        }
        this.f1415--;
        ((InterfaceC2191) this.f1416).mo1506();
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo1507(int i, int i2) {
        ((InterfaceC2191) this.f1416).mo1507(i + (this.f1415 == 0 ? this.f1417 : 0), i2);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Object mo1508() {
        return ((InterfaceC2191) this.f1416).mo1508();
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo1509(Object obj, InterfaceC7383 interfaceC7383) {
        ((InterfaceC2191) this.f1416).mo1509(obj, interfaceC7383);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo1510(int i, Object obj) {
        ((InterfaceC2191) this.f1416).mo1510(i + (this.f1415 == 0 ? this.f1417 : 0), obj);
    }

    public C1164() {
        this.f1416 = new C1164[256];
        this.f1417 = 0;
        this.f1415 = 0;
    }

    public C1164(int i, int i2, InterfaceC1181 interfaceC1181) {
        this.f1417 = i;
        this.f1415 = i2;
        this.f1416 = new C1171(new C1153(i, i2, interfaceC1181));
    }
}
