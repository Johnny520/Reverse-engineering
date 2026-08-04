package yyds;

import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛱᛸᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0185 {

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static final List f1087 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f1091;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final View f1093;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public AbstractC0359 f1095;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public WeakReference f1096;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public C1213 f1097;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f1102 = -1;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f1105 = -1;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f1092 = -1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f1104 = -1;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public AbstractC0185 f1098 = null;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public AbstractC0185 f1089 = null;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public ArrayList f1101 = null;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public List f1099 = null;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f1100 = 0;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C2808 f1090 = null;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean f1088 = false;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f1094 = 0;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int f1103 = -1;

    public AbstractC0185(View view) {
        if (view != null) {
            this.f1093 = view;
        } else {
            C0188.m798("itemView may not be null");
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1102 + " id=-1, oldPos=" + this.f1105 + ", pLpos:" + this.f1104);
        if (m783()) {
            sb.append(" scrap ");
            sb.append(this.f1088 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m780()) {
            sb.append(" invalid");
        }
        if (!m786()) {
            sb.append(" unbound");
        }
        if ((this.f1091 & 2) != 0) {
            sb.append(" update");
        }
        if (m774()) {
            sb.append(" removed");
        }
        if (m785()) {
            sb.append(" ignored");
        }
        if (m781()) {
            sb.append(" tmpDetached");
        }
        if (!m772()) {
            sb.append(" not recyclable(" + this.f1100 + ")");
        }
        if ((this.f1091 & 512) != 0 || m780()) {
            sb.append(" undefined adapter position");
        }
        if (this.f1093.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void m771() {
        if (C1213.f5511 && m781()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f1091 = 0;
        this.f1102 = -1;
        this.f1105 = -1;
        this.f1104 = -1;
        this.f1100 = 0;
        this.f1098 = null;
        this.f1089 = null;
        ArrayList arrayList = this.f1101;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f1091 &= -1025;
        this.f1094 = 0;
        this.f1103 = -1;
        C1213.m2410(this);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean m772() {
        if ((this.f1091 & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        return !this.f1093.hasTransientState();
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m773(int i, boolean z) {
        if (this.f1105 == -1) {
            this.f1105 = this.f1102;
        }
        int i2 = this.f1104;
        if (i2 == -1) {
            i2 = this.f1102;
            this.f1104 = i2;
        }
        if (z) {
            this.f1104 = i2 + i;
        }
        this.f1102 += i;
        View view = this.f1093;
        if (view.getLayoutParams() != null) {
            ((C2526) view.getLayoutParams()).f12450 = true;
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean m774() {
        return (this.f1091 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final List m775() {
        ArrayList arrayList;
        return ((this.f1091 & 1024) != 0 || (arrayList = this.f1101) == null || arrayList.size() == 0) ? f1087 : this.f1099;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m776(int i) {
        this.f1091 = i | this.f1091;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m777(boolean z) {
        int i = this.f1100;
        int i2 = z ? i - 1 : i + 1;
        this.f1100 = i2;
        if (i2 < 0) {
            this.f1100 = 0;
            if (C1213.f5511) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.f1091 |= 16;
        } else if (z && i2 == 0) {
            this.f1091 &= -17;
        }
        if (C1213.f5512) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m778() {
        C1213 c1213 = this.f1097;
        if (c1213 == null) {
            return -1;
        }
        return c1213.m2422(this);
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final boolean m779() {
        return (this.f1091 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean m780() {
        return (this.f1091 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean m781() {
        return (this.f1091 & 256) != 0;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final boolean m782() {
        return (this.f1091 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final boolean m783() {
        return this.f1090 != null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int m784() {
        C1213 c1213;
        AbstractC0359 adapter;
        int iM2422;
        if (this.f1095 == null || (c1213 = this.f1097) == null || (adapter = c1213.getAdapter()) == null || (iM2422 = this.f1097.m2422(this)) == -1 || this.f1095 != adapter) {
            return -1;
        }
        return iM2422;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final boolean m785() {
        return (this.f1091 & 128) != 0;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean m786() {
        return (this.f1091 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m787() {
        int i = this.f1104;
        return i == -1 ? this.f1102 : i;
    }
}
