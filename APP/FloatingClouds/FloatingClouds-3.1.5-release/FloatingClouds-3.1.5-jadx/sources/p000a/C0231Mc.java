package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1051e;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.C1247R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.C0393Vd;

/* JADX INFO: renamed from: a.Mc */
/* JADX INFO: loaded from: classes.dex */
public class C0231Mc extends ConstraintLayout {

    /* JADX INFO: renamed from: q */
    public final RunnableC0221M2 f769q;

    /* JADX INFO: renamed from: r */
    public int f770r;

    /* JADX INFO: renamed from: s */
    public final C0354Ta f771s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0231Mc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0221M2 runnableC0221M2 = this.f769q;
            handler.removeCallbacks(runnableC0221M2);
            handler.post(runnableC0221M2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo622f() {
        C1051e c1051e = new C1051e();
        c1051e.m2427b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C1247R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(C1247R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f770r * 0.66f) : this.f770r;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                int i3 = C1247R.id.circle_center;
                HashMap<Integer, C1051e.a> map2 = c1051e.f4269c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C1051e.a());
                }
                C1051e.b bVar = map2.get(Integer.valueOf(id)).f4273d;
                bVar.f4334w = i3;
                bVar.f4335x = iRound;
                bVar.f4336y = size;
                size += 360.0f / list.size();
            }
        }
        c1051e.m2426a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo622f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0221M2 runnableC0221M2 = this.f769q;
            handler.removeCallbacks(runnableC0221M2);
            handler.post(runnableC0221M2);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f771s.m967k(ColorStateList.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0231Mc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C1247R.layout.material_radial_view_group, this);
        C0354Ta c0354Ta = new C0354Ta();
        this.f771s = c0354Ta;
        C0428Xc c0428Xc = new C0428Xc(0.5f);
        C0393Vd.a aVarM1026e = c0354Ta.f1310a.f1334a.m1026e();
        aVarM1026e.f1498e = c0428Xc;
        aVarM1026e.f1499f = c0428Xc;
        aVarM1026e.f1500g = c0428Xc;
        aVarM1026e.f1501h = c0428Xc;
        c0354Ta.setShapeAppearanceModel(aVarM1026e.m1028a());
        this.f771s.m967k(ColorStateList.valueOf(-1));
        C0354Ta c0354Ta2 = this.f771s;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        setBackground(c0354Ta2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.RadialViewGroup, i, 0);
        this.f770r = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f769q = new RunnableC0221M2(14, this);
        typedArrayObtainStyledAttributes.recycle();
    }
}
