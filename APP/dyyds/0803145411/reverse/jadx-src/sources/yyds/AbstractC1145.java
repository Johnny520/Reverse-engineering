package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: yyds.ᛵᛷᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145 extends View {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public String f5243;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public HashMap f5244;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Context f5245;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public String f5246;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int[] f5247;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0411 f5248;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f5249;

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f5247, this.f5249);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f5246;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f5243;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f5246 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f5249 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m2332(str.substring(i));
                return;
            } else {
                m2332(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f5243 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f5249 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m2334(str.substring(i));
                return;
            } else {
                m2334(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f5246 = null;
        this.f5249 = 0;
        for (int i : iArr) {
            m2333(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f5246 == null) {
            m2333(i);
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m2331() {
        if (this.f5248 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1357) {
            ((C1357) layoutParams).f6262 = this.f5248;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2332(String str) {
        int identifier;
        HashMap map;
        Context context = this.f5245;
        if (str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        AbstractC1340 abstractC1340 = getParent() instanceof AbstractC1340 ? (AbstractC1340) getParent() : null;
        if (!isInEditMode() || abstractC1340 == null) {
            identifier = 0;
        } else {
            Object obj = (strTrim == null || (map = abstractC1340.f6212) == null || !map.containsKey(strTrim)) ? null : abstractC1340.f6212.get(strTrim);
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            }
        }
        if (identifier == 0 && abstractC1340 != null) {
            identifier = m2335(abstractC1340, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC2341.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, Name.MARK, context.getPackageName());
        }
        if (identifier != 0) {
            this.f5244.put(Integer.valueOf(identifier), strTrim);
            m2333(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2333(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f5249 + 1;
        int[] iArrCopyOf = this.f5247;
        if (i2 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f5247 = iArrCopyOf;
        }
        int i3 = this.f5249;
        iArrCopyOf[i3] = i;
        this.f5249 = i3 + 1;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2334(String str) {
        if (str.length() == 0 || this.f5245 == null) {
            return;
        }
        String strTrim = str.trim();
        AbstractC1340 abstractC1340 = getParent() instanceof AbstractC1340 ? (AbstractC1340) getParent() : null;
        if (abstractC1340 == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = abstractC1340.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = abstractC1340.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1357) && strTrim.equals(((C1357) layoutParams).f6276)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m2333(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m2335(AbstractC1340 abstractC1340, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f5245.getResources()) != null) {
            int childCount = abstractC1340.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = abstractC1340.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }
}
