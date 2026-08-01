package p336x3;

import android.view.View;
import android.view.ViewParent;
import p010a9.InterfaceC0184l;
import p024b9.C1055q;
import sb.AbstractC7291q;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: x3.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9432w {

    /* JADX INFO: renamed from: x3.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final a f32035y = new a();

        public a() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ViewParent mo27m(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7282h m36702a(View view) {
        return AbstractC7291q.m28888p(view.getParent(), a.f32035y);
    }
}
