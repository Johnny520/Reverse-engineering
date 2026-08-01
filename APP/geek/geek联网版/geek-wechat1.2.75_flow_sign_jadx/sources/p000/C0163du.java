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

/* JADX INFO: renamed from: du */
/* JADX INFO: loaded from: classes.dex */
public final class C0163du implements InterfaceC0945yw {

    /* JADX INFO: renamed from: a */
    public final Object f1432a;

    /* JADX INFO: renamed from: b */
    public int f1433b;

    /* JADX INFO: renamed from: c */
    public int f1434c;

    public C0163du(View view) {
        this.f1432a = view;
    }

    @Override // p000.InterfaceC0945yw
    /* JADX INFO: renamed from: e */
    public bd0 mo844e(View view, bd0 bd0Var) {
        View view2 = (View) this.f1432a;
        int i = bd0Var.f724a.mo2368f(7).f2572b;
        int i2 = this.f1433b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1434c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return bd0Var;
    }

    public C0163du(Context context, XmlResourceParser xmlResourceParser) {
        this.f1432a = new ArrayList();
        this.f1434c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0947yy.f5515g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1433b = typedArrayObtainStyledAttributes.getResourceId(index, this.f1433b);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1434c);
                this.f1434c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0888xc().m2679b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0163du(View view, int i, int i2) {
        this.f1433b = i;
        this.f1432a = view;
        this.f1434c = i2;
    }
}
