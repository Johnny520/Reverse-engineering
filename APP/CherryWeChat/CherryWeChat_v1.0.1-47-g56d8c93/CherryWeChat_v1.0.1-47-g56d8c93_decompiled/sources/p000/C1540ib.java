package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.sentry.android.core.internal.threaddump.C1711a;
import java.util.ArrayList;

/* JADX INFO: renamed from: ib */
/* JADX INFO: loaded from: classes.dex */
public final class C1540ib {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5435a;

    /* JADX INFO: renamed from: b */
    public final int f5436b;

    /* JADX INFO: renamed from: c */
    public int f5437c;

    public C1540ib(ArrayList arrayList) {
        this.f5435a = arrayList;
        this.f5436b = arrayList.size();
    }

    /* JADX INFO: renamed from: a */
    public C1711a m2955a() {
        int i = this.f5437c;
        if (i < 0 || i >= this.f5436b) {
            return null;
        }
        this.f5437c = i + 1;
        return (C1711a) this.f5435a.get(i);
    }

    public C1540ib(Context context, XmlResourceParser xmlResourceParser) {
        this.f5435a = new ArrayList();
        this.f5437c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0639Ou.f2042i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f5436b = typedArrayObtainStyledAttributes.getResourceId(index, this.f5436b);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5437c);
                this.f5437c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C2411qb().m4854b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
