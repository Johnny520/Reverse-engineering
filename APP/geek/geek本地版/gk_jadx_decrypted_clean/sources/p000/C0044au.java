package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: au */
/* JADX INFO: loaded from: classes.dex */
public final class C0044au implements InterfaceC0649qw {

    /* JADX INFO: renamed from: a */
    public final Object f681a;

    /* JADX INFO: renamed from: b */
    public int f682b;

    /* JADX INFO: renamed from: c */
    public int f683c;

    public C0044au(View view) {
        this.f681a = view;
    }

    @Override // p000.InterfaceC0649qw
    /* JADX INFO: renamed from: d */
    public wc0 mo474d(View view, wc0 wc0Var) {
        View view2 = (View) this.f681a;
        int i = wc0Var.f4955a.mo1932f(7).f1829b;
        int i2 = this.f682b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f683c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return wc0Var;
    }

    public C0044au(Context context, XmlResourceParser xmlResourceParser) {
        this.f681a = new ArrayList();
        this.f683c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0688ry.f4355g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f682b = typedArrayObtainStyledAttributes.getResourceId(index, this.f682b);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f683c);
                this.f683c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0554oc().m2010b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0044au(View view, int i, int i2) {
        this.f682b = i;
        this.f681a = view;
        this.f683c = i2;
    }
}
