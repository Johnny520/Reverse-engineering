package androidx.recyclerview.widget;

import Yue.C3055;
import Yue.C6193;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC8919 implements RecyclerView.AbstractC8934.InterfaceC1753 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f30008 = "StaggeredGridLManager";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final boolean f30009 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f30010 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f30011 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f30012 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @Deprecated
    public static final int f30013 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f30014 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f30015 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final float f30016 = 0.33333334f;

    /* JADX INFO: renamed from: ۥ۟ */
    public C8943[] f3905;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public AbstractC8987 f30017;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public AbstractC8987 f30018;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f30019;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f30020;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6391
    public final C8982 f30021;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public BitSet f30024;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean f30029;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean f30030;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C8942 f30031;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int f30032;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int[] f30037;

    /* JADX INFO: renamed from: ۥ */
    public int f3904 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f30022 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f30023 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f30025 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f30026 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C8940 f30027 = new C8940();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int f30028 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Rect f30033 = new Rect();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C1755 f30034 = new C1755();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f30035 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f30036 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final Runnable f30038 = new RunnableC1754();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ۥ */
    public class RunnableC1754 implements Runnable {
        public RunnableC1754() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m30403();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ۥ۟ */
    public class C1755 {

        /* JADX INFO: renamed from: ۥ */
        public int f3906;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3907;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f30040;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f30041;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f30042;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int[] f30043;

        public C1755() {
            m30452();
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4950() {
            this.f3907 = this.f30040 ? StaggeredGridLayoutManager.this.f30017.mo30705() : StaggeredGridLayoutManager.this.f30017.mo30710();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4951(int i) {
            if (this.f30040) {
                this.f3907 = StaggeredGridLayoutManager.this.f30017.mo30705() - i;
            } else {
                this.f3907 = StaggeredGridLayoutManager.this.f30017.mo30710() + i;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30452() {
            this.f3906 = -1;
            this.f3907 = Integer.MIN_VALUE;
            this.f30040 = false;
            this.f30041 = false;
            this.f30042 = false;
            int[] iArr = this.f30043;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30453(C8943[] c8943Arr) {
            int length = c8943Arr.length;
            int[] iArr = this.f30043;
            if (iArr == null || iArr.length < length) {
                this.f30043 = new int[StaggeredGridLayoutManager.this.f3905.length];
            }
            for (int i = 0; i < length; i++) {
                this.f30043[i] = c8943Arr[i].m30488(Integer.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ۥ۟۟, reason: contains not printable characters */
    public static class C8939 extends RecyclerView.C8922 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f30045 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C8943 f30046;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f30047;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8939(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int m30454() {
            C8943 c8943 = this.f30046;
            if (c8943 == null) {
                return -1;
            }
            return c8943.f30066;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean m30455() {
            return this.f30047;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m30456(boolean z) {
            this.f30047 = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8939(int i, int i2) {
            super(i, i2);
        }

        public C8939(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C8939(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C8939(RecyclerView.C8922 c8922) {
            super(c8922);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @SuppressLint({"BanParcelableUsage"})
    public static class C8942 implements Parcelable {
        public static final Parcelable.Creator<C8942> CREATOR = new C1757();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f30053;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f30054;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f30055;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int[] f30056;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f30057;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int[] f30058;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public List<C8940.C1756> f30059;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public boolean f30060;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public boolean f30061;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public boolean f30062;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ۥ۟۟۟۟$ۥ */
        public static class C1757 implements Parcelable.Creator<C8942> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8942 createFromParcel(Parcel parcel) {
                return new C8942(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8942[] newArray(int i) {
                return new C8942[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8942() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f30053);
            parcel.writeInt(this.f30054);
            parcel.writeInt(this.f30055);
            if (this.f30055 > 0) {
                parcel.writeIntArray(this.f30056);
            }
            parcel.writeInt(this.f30057);
            if (this.f30057 > 0) {
                parcel.writeIntArray(this.f30058);
            }
            parcel.writeInt(this.f30060 ? 1 : 0);
            parcel.writeInt(this.f30061 ? 1 : 0);
            parcel.writeInt(this.f30062 ? 1 : 0);
            parcel.writeList(this.f30059);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4957() {
            this.f30056 = null;
            this.f30055 = 0;
            this.f30053 = -1;
            this.f30054 = -1;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4958() {
            this.f30056 = null;
            this.f30055 = 0;
            this.f30057 = 0;
            this.f30058 = null;
            this.f30059 = null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8942(Parcel parcel) {
            this.f30053 = parcel.readInt();
            this.f30054 = parcel.readInt();
            int i = parcel.readInt();
            this.f30055 = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.f30056 = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.f30057 = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f30058 = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f30060 = parcel.readInt() == 1;
            this.f30061 = parcel.readInt() == 1;
            this.f30062 = parcel.readInt() == 1;
            this.f30059 = parcel.readArrayList(C8940.C1756.class.getClassLoader());
        }

        public C8942(C8942 c8942) {
            this.f30055 = c8942.f30055;
            this.f30053 = c8942.f30053;
            this.f30054 = c8942.f30054;
            this.f30056 = c8942.f30056;
            this.f30057 = c8942.f30057;
            this.f30058 = c8942.f30058;
            this.f30060 = c8942.f30060;
            this.f30061 = c8942.f30061;
            this.f30062 = c8942.f30062;
            this.f30059 = c8942.f30059;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C8943 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f30063 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ۥ */
        public ArrayList<View> f3910 = new ArrayList<>();

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3911 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f30064 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f30065 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int f30066;

        public C8943(int i) {
            this.f30066 = i;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4961(View view) {
            C8939 c8939M30486 = m30486(view);
            c8939M30486.f30046 = this;
            this.f3910.add(view);
            this.f30064 = Integer.MIN_VALUE;
            if (this.f3910.size() == 1) {
                this.f3911 = Integer.MIN_VALUE;
            }
            if (c8939M30486.m30306() || c8939M30486.m30305()) {
                this.f30065 += StaggeredGridLayoutManager.this.f30017.mo30701(view);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4962(boolean z, int i) {
            int iM30484 = z ? m30484(Integer.MIN_VALUE) : m30488(Integer.MIN_VALUE);
            m30472();
            if (iM30484 == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iM30484 >= StaggeredGridLayoutManager.this.f30017.mo30705()) {
                if (z || iM30484 <= StaggeredGridLayoutManager.this.f30017.mo30710()) {
                    if (i != Integer.MIN_VALUE) {
                        iM30484 += i;
                    }
                    this.f30064 = iM30484;
                    this.f3911 = iM30484;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30470() {
            C8940.C1756 c1756M30460;
            ArrayList<View> arrayList = this.f3910;
            View view = arrayList.get(arrayList.size() - 1);
            C8939 c8939M30486 = m30486(view);
            this.f30064 = StaggeredGridLayoutManager.this.f30017.mo30700(view);
            if (c8939M30486.f30047 && (c1756M30460 = StaggeredGridLayoutManager.this.f30027.m30460(c8939M30486.m4931())) != null && c1756M30460.f30050 == 1) {
                this.f30064 += c1756M30460.m4954(this.f30066);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30471() {
            C8940.C1756 c1756M30460;
            View view = this.f3910.get(0);
            C8939 c8939M30486 = m30486(view);
            this.f3911 = StaggeredGridLayoutManager.this.f30017.mo30703(view);
            if (c8939M30486.f30047 && (c1756M30460 = StaggeredGridLayoutManager.this.f30027.m30460(c8939M30486.m4931())) != null && c1756M30460.f30050 == -1) {
                this.f3911 -= c1756M30460.m4954(this.f30066);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30472() {
            this.f3910.clear();
            m30489();
            this.f30065 = 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int m30473() {
            return StaggeredGridLayoutManager.this.f30022 ? m30481(this.f3910.size() - 1, -1, true) : m30481(0, this.f3910.size(), true);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int m30474() {
            return StaggeredGridLayoutManager.this.f30022 ? m30480(this.f3910.size() - 1, -1, true) : m30480(0, this.f3910.size(), true);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int m30475() {
            return StaggeredGridLayoutManager.this.f30022 ? m30481(this.f3910.size() - 1, -1, false) : m30481(0, this.f3910.size(), false);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int m30476() {
            return StaggeredGridLayoutManager.this.f30022 ? m30481(0, this.f3910.size(), true) : m30481(this.f3910.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int m30477() {
            return StaggeredGridLayoutManager.this.f30022 ? m30480(0, this.f3910.size(), true) : m30480(this.f3910.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int m30478() {
            return StaggeredGridLayoutManager.this.f30022 ? m30481(0, this.f3910.size(), false) : m30481(this.f3910.size() - 1, -1, false);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int m30479(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iMo30710 = StaggeredGridLayoutManager.this.f30017.mo30710();
            int iMo30705 = StaggeredGridLayoutManager.this.f30017.mo30705();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3910.get(i);
                int iMo30703 = StaggeredGridLayoutManager.this.f30017.mo30703(view);
                int iMo30700 = StaggeredGridLayoutManager.this.f30017.mo30700(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iMo30703 >= iMo30705 : iMo30703 > iMo30705;
                if (!z3 ? iMo30700 > iMo30710 : iMo30700 >= iMo30710) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iMo30703 >= iMo30710 && iMo30700 <= iMo30705) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iMo30703 < iMo30710 || iMo30700 > iMo30705) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int m30480(int i, int i2, boolean z) {
            return m30479(i, i2, false, false, z);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int m30481(int i, int i2, boolean z) {
            return m30479(i, i2, z, true, false);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int m30482() {
            return this.f30065;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int m30483() {
            int i = this.f30064;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m30470();
            return this.f30064;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int m30484(int i) {
            int i2 = this.f30064;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3910.size() == 0) {
                return i;
            }
            m30470();
            return this.f30064;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public View m30485(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3910.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3910.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f30022 && staggeredGridLayoutManager.getPosition(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f30022 && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3910.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3910.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f30022 && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f30022 && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public C8939 m30486(View view) {
            return (C8939) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int m30487() {
            int i = this.f3911;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m30471();
            return this.f3911;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int m30488(int i) {
            int i2 = this.f3911;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3910.size() == 0) {
                return i;
            }
            m30471();
            return this.f3911;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public void m30489() {
            this.f3911 = Integer.MIN_VALUE;
            this.f30064 = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public void m30490(int i) {
            int i2 = this.f3911;
            if (i2 != Integer.MIN_VALUE) {
                this.f3911 = i2 + i;
            }
            int i3 = this.f30064;
            if (i3 != Integer.MIN_VALUE) {
                this.f30064 = i3 + i;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public void m30491() {
            int size = this.f3910.size();
            View viewRemove = this.f3910.remove(size - 1);
            C8939 c8939M30486 = m30486(viewRemove);
            c8939M30486.f30046 = null;
            if (c8939M30486.m30306() || c8939M30486.m30305()) {
                this.f30065 -= StaggeredGridLayoutManager.this.f30017.mo30701(viewRemove);
            }
            if (size == 1) {
                this.f3911 = Integer.MIN_VALUE;
            }
            this.f30064 = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public void m30492() {
            View viewRemove = this.f3910.remove(0);
            C8939 c8939M30486 = m30486(viewRemove);
            c8939M30486.f30046 = null;
            if (this.f3910.size() == 0) {
                this.f30064 = Integer.MIN_VALUE;
            }
            if (c8939M30486.m30306() || c8939M30486.m30305()) {
                this.f30065 -= StaggeredGridLayoutManager.this.f30017.mo30701(viewRemove);
            }
            this.f3911 = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public void m30493(View view) {
            C8939 c8939M30486 = m30486(view);
            c8939M30486.f30046 = this;
            this.f3910.add(0, view);
            this.f3911 = Integer.MIN_VALUE;
            if (this.f3910.size() == 1) {
                this.f30064 = Integer.MIN_VALUE;
            }
            if (c8939M30486.m30306() || c8939M30486.m30305()) {
                this.f30065 += StaggeredGridLayoutManager.this.f30017.mo30701(view);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public void m30494(int i) {
            this.f3911 = i;
            this.f30064 = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC8919.C8921 properties = RecyclerView.AbstractC8919.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f3889);
        m30443(properties.f3890);
        setReverseLayout(properties.f29961);
        this.f30021 = new C8982();
        m30407();
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f30019 == 1) ? 1 : Integer.MIN_VALUE : this.f30019 == 0 ? 1 : Integer.MIN_VALUE : this.f30019 == 1 ? -1 : Integer.MIN_VALUE : this.f30019 == 0 ? -1 : Integer.MIN_VALUE : (this.f30019 != 1 && isLayoutRTL()) ? -1 : 1 : (this.f30019 != 1 && isLayoutRTL()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    private int m30392(RecyclerView.C8935 c8935) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C8990.m5005(c8935, this.f30017, m30412(!this.f30036), m30411(!this.f30036), this, this.f30036);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    private int m30393(RecyclerView.C8935 c8935) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C8990.m5006(c8935, this.f30017, m30412(!this.f30036), m30411(!this.f30036), this, this.f30036, this.f30023);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    private int m30394(RecyclerView.C8935 c8935) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C8990.m30725(c8935, this.f30017, m30412(!this.f30036), m30411(!this.f30036), this, this.f30036);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    private void m30395(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.f30033);
        C8939 c8939 = (C8939) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c8939).leftMargin;
        Rect rect = this.f30033;
        int iM30451 = m30451(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c8939).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c8939).topMargin;
        Rect rect2 = this.f30033;
        int iM304512 = m30451(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c8939).bottomMargin + rect2.bottom);
        if (z ? shouldReMeasureChild(view, iM30451, iM304512, c8939) : shouldMeasureChild(view, iM30451, iM304512, c8939)) {
            view.measure(iM30451, iM304512);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    private void m30396() {
        if (this.f30019 == 1 || !isLayoutRTL()) {
            this.f30023 = this.f30022;
        } else {
            this.f30023 = !this.f30022;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f30031 == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean canScrollHorizontally() {
        return this.f30019 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean canScrollVertically() {
        return this.f30019 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean checkLayoutParams(RecyclerView.C8922 c8922) {
        return c8922 instanceof C8939;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C8935 c8935, RecyclerView.AbstractC8919.InterfaceC8920 interfaceC8920) {
        int iM30484;
        int iM30488;
        if (this.f30019 != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        m30435(i, c8935);
        int[] iArr = this.f30037;
        if (iArr == null || iArr.length < this.f3904) {
            this.f30037 = new int[this.f3904];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3904; i4++) {
            C8982 c8982 = this.f30021;
            if (c8982.f30308 == -1) {
                iM30484 = c8982.f30310;
                iM30488 = this.f3905[i4].m30488(iM30484);
            } else {
                iM30484 = this.f3905[i4].m30484(c8982.f30311);
                iM30488 = this.f30021.f30311;
            }
            int i5 = iM30484 - iM30488;
            if (i5 >= 0) {
                this.f30037[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.f30037, 0, i3);
        for (int i6 = 0; i6 < i3 && this.f30021.m4996(c8935); i6++) {
            interfaceC8920.mo4929(this.f30021.f30307, this.f30037[i6]);
            C8982 c89822 = this.f30021;
            c89822.f30307 += c89822.f30308;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollExtent(RecyclerView.C8935 c8935) {
        return m30392(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollOffset(RecyclerView.C8935 c8935) {
        return m30393(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollRange(RecyclerView.C8935 c8935) {
        return m30394(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8934.InterfaceC1753
    public PointF computeScrollVectorForPosition(int i) {
        int iM30402 = m30402(i);
        PointF pointF = new PointF();
        if (iM30402 == 0) {
            return null;
        }
        if (this.f30019 == 0) {
            pointF.x = iM30402;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM30402;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollExtent(RecyclerView.C8935 c8935) {
        return m30392(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollOffset(RecyclerView.C8935 c8935) {
        return m30393(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollRange(RecyclerView.C8935 c8935) {
        return m30394(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public RecyclerView.C8922 generateDefaultLayoutParams() {
        return this.f30019 == 0 ? new C8939(-2, -1) : new C8939(-1, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public RecyclerView.C8922 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C8939(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int getColumnCountForAccessibility(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        return this.f30019 == 1 ? this.f3904 : super.getColumnCountForAccessibility(c8929, c8935);
    }

    public int getOrientation() {
        return this.f30019;
    }

    public boolean getReverseLayout() {
        return this.f30022;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int getRowCountForAccessibility(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        return this.f30019 == 0 ? this.f3904 : super.getRowCountForAccessibility(c8929, c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean isAutoMeasureEnabled() {
        return this.f30028 != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f3904; i2++) {
            this.f3905[i2].m30490(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f3904; i2++) {
            this.f3905[i2].m30490(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C8929 c8929) {
        super.onDetachedFromWindow(recyclerView, c8929);
        removeCallbacks(this.f30038);
        for (int i = 0; i < this.f3904; i++) {
            this.f3905[i].m30472();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    @InterfaceC6490
    public View onFocusSearchFailed(View view, int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        View viewFindContainingItemView;
        View viewM30485;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m30396();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        C8939 c8939 = (C8939) viewFindContainingItemView.getLayoutParams();
        boolean z = c8939.f30047;
        C8943 c8943 = c8939.f30046;
        int iM30422 = iConvertFocusDirectionToLayoutDirection == 1 ? m30422() : m30420();
        m30448(iM30422, c8935);
        m30442(iConvertFocusDirectionToLayoutDirection);
        C8982 c8982 = this.f30021;
        c8982.f30307 = c8982.f30308 + iM30422;
        c8982.f3974 = (int) (this.f30017.mo30711() * 0.33333334f);
        C8982 c89822 = this.f30021;
        c89822.f30312 = true;
        c89822.f3973 = false;
        m30408(c8929, c89822, c8935);
        this.f30029 = this.f30023;
        if (!z && (viewM30485 = c8943.m30485(iM30422, iConvertFocusDirectionToLayoutDirection)) != null && viewM30485 != viewFindContainingItemView) {
            return viewM30485;
        }
        if (m30434(iConvertFocusDirectionToLayoutDirection)) {
            for (int i2 = this.f3904 - 1; i2 >= 0; i2--) {
                View viewM304852 = this.f3905[i2].m30485(iM30422, iConvertFocusDirectionToLayoutDirection);
                if (viewM304852 != null && viewM304852 != viewFindContainingItemView) {
                    return viewM304852;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f3904; i3++) {
                View viewM304853 = this.f3905[i3].m30485(iM30422, iConvertFocusDirectionToLayoutDirection);
                if (viewM304853 != null && viewM304853 != viewFindContainingItemView) {
                    return viewM304853;
                }
            }
        }
        boolean z2 = (this.f30022 ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z) {
            View viewFindViewByPosition = findViewByPosition(z2 ? c8943.m30474() : c8943.m30477());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (m30434(iConvertFocusDirectionToLayoutDirection)) {
            for (int i4 = this.f3904 - 1; i4 >= 0; i4--) {
                if (i4 != c8943.f30066) {
                    View viewFindViewByPosition2 = findViewByPosition(z2 ? this.f3905[i4].m30474() : this.f3905[i4].m30477());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f3904; i5++) {
                View viewFindViewByPosition3 = findViewByPosition(z2 ? this.f3905[i5].m30474() : this.f3905[i5].m30477());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM30412 = m30412(false);
            View viewM30411 = m30411(false);
            if (viewM30412 == null || viewM30411 == null) {
                return;
            }
            int position = getPosition(viewM30412);
            int position2 = getPosition(viewM30411);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, View view, C3055 c3055) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C8939)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c3055);
            return;
        }
        C8939 c8939 = (C8939) layoutParams;
        if (this.f30019 == 0) {
            c3055.m6060(C3055.C3060.m6143(c8939.m30454(), c8939.f30047 ? this.f3904 : 1, -1, -1, false, false));
        } else {
            c3055.m6060(C3055.C3060.m6143(-1, -1, c8939.m30454(), c8939.f30047 ? this.f3904 : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m30429(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f30027.m4953();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m30429(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m30429(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m30429(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onLayoutChildren(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        m30433(c8929, c8935, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onLayoutCompleted(RecyclerView.C8935 c8935) {
        super.onLayoutCompleted(c8935);
        this.f30025 = -1;
        this.f30026 = Integer.MIN_VALUE;
        this.f30031 = null;
        this.f30034.m30452();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C8942) {
            this.f30031 = (C8942) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public Parcelable onSaveInstanceState() {
        int iM30488;
        int iMo30710;
        int[] iArr;
        if (this.f30031 != null) {
            return new C8942(this.f30031);
        }
        C8942 c8942 = new C8942();
        c8942.f30060 = this.f30022;
        c8942.f30061 = this.f30029;
        c8942.f30062 = this.f30030;
        C8940 c8940 = this.f30027;
        if (c8940 == null || (iArr = c8940.f3908) == null) {
            c8942.f30057 = 0;
        } else {
            c8942.f30058 = iArr;
            c8942.f30057 = iArr.length;
            c8942.f30059 = c8940.f3909;
        }
        if (getChildCount() > 0) {
            c8942.f30053 = this.f30029 ? m30422() : m30420();
            c8942.f30054 = m30413();
            int i = this.f3904;
            c8942.f30055 = i;
            c8942.f30056 = new int[i];
            for (int i2 = 0; i2 < this.f3904; i2++) {
                if (this.f30029) {
                    iM30488 = this.f3905[i2].m30484(Integer.MIN_VALUE);
                    if (iM30488 != Integer.MIN_VALUE) {
                        iMo30710 = this.f30017.mo30705();
                        iM30488 -= iMo30710;
                    }
                } else {
                    iM30488 = this.f3905[i2].m30488(Integer.MIN_VALUE);
                    if (iM30488 != Integer.MIN_VALUE) {
                        iMo30710 = this.f30017.mo30710();
                        iM30488 -= iMo30710;
                    }
                }
                c8942.f30056[i2] = iM30488;
            }
        } else {
            c8942.f30053 = -1;
            c8942.f30054 = -1;
            c8942.f30055 = 0;
        }
        return c8942;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            m30403();
        }
    }

    public int scrollBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m30435(i, c8935);
        int iM30408 = m30408(c8929, this.f30021, c8935);
        if (this.f30021.f3974 >= iM30408) {
            i = i < 0 ? -iM30408 : iM30408;
        }
        this.f30017.mo30716(-i);
        this.f30029 = this.f30023;
        C8982 c8982 = this.f30021;
        c8982.f3974 = 0;
        m30437(c8929, c8982);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int scrollHorizontallyBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        return scrollBy(i, c8929, c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void scrollToPosition(int i) {
        C8942 c8942 = this.f30031;
        if (c8942 != null && c8942.f30053 != i) {
            c8942.m4957();
        }
        this.f30025 = i;
        this.f30026 = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        C8942 c8942 = this.f30031;
        if (c8942 != null) {
            c8942.m4957();
        }
        this.f30025 = i;
        this.f30026 = i2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int scrollVerticallyBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        return scrollBy(i, c8929, c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f30019 == 1) {
            iChooseSize2 = RecyclerView.AbstractC8919.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.AbstractC8919.chooseSize(i, (this.f30020 * this.f3904) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC8919.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.AbstractC8919.chooseSize(i2, (this.f30020 * this.f3904) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.f30019) {
            return;
        }
        this.f30019 = i;
        AbstractC8987 abstractC8987 = this.f30017;
        this.f30017 = this.f30018;
        this.f30018 = abstractC8987;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        C8942 c8942 = this.f30031;
        if (c8942 != null && c8942.f30060 != z) {
            c8942.f30060 = z;
        }
        this.f30022 = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C8935 c8935, int i) {
        C8983 c8983 = new C8983(recyclerView.getContext());
        c8983.setTargetPosition(i);
        startSmoothScroll(c8983);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean supportsPredictiveItemAnimations() {
        return this.f30031 == null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30397(View view) {
        for (int i = this.f3904 - 1; i >= 0; i--) {
            this.f3905[i].m4961(view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30398(C1755 c1755) {
        C8942 c8942 = this.f30031;
        int i = c8942.f30055;
        if (i > 0) {
            if (i == this.f3904) {
                for (int i2 = 0; i2 < this.f3904; i2++) {
                    this.f3905[i2].m30472();
                    C8942 c89422 = this.f30031;
                    int iMo30705 = c89422.f30056[i2];
                    if (iMo30705 != Integer.MIN_VALUE) {
                        iMo30705 += c89422.f30061 ? this.f30017.mo30705() : this.f30017.mo30710();
                    }
                    this.f3905[i2].m30494(iMo30705);
                }
            } else {
                c8942.m4958();
                C8942 c89423 = this.f30031;
                c89423.f30053 = c89423.f30054;
            }
        }
        C8942 c89424 = this.f30031;
        this.f30030 = c89424.f30062;
        setReverseLayout(c89424.f30060);
        m30396();
        C8942 c89425 = this.f30031;
        int i3 = c89425.f30053;
        if (i3 != -1) {
            this.f30025 = i3;
            c1755.f30040 = c89425.f30061;
        } else {
            c1755.f30040 = this.f30023;
        }
        if (c89425.f30057 > 1) {
            C8940 c8940 = this.f30027;
            c8940.f3908 = c89425.f30058;
            c8940.f3909 = c89425.f30059;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m30399() {
        int iM30484 = this.f3905[0].m30484(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3904; i++) {
            if (this.f3905[i].m30484(Integer.MIN_VALUE) != iM30484) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m30400() {
        int iM30488 = this.f3905[0].m30488(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3904; i++) {
            if (this.f3905[i].m30488(Integer.MIN_VALUE) != iM30488) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m30401(View view, C8939 c8939, C8982 c8982) {
        if (c8982.f30309 == 1) {
            if (c8939.f30047) {
                m30397(view);
                return;
            } else {
                c8939.f30046.m4961(view);
                return;
            }
        }
        if (c8939.f30047) {
            m30436(view);
        } else {
            c8939.f30046.m30493(view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int m30402(int i) {
        if (getChildCount() == 0) {
            return this.f30023 ? 1 : -1;
        }
        return (i < m30420()) != this.f30023 ? -1 : 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m30403() {
        int iM30420;
        int iM30422;
        if (getChildCount() == 0 || this.f30028 == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f30023) {
            iM30420 = m30422();
            iM30422 = m30420();
        } else {
            iM30420 = m30420();
            iM30422 = m30422();
        }
        if (iM30420 == 0 && m30430() != null) {
            this.f30027.m4953();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f30035) {
            return false;
        }
        int i = this.f30023 ? -1 : 1;
        int i2 = iM30422 + 1;
        C8940.C1756 c1756M30459 = this.f30027.m30459(iM30420, i2, i, true);
        if (c1756M30459 == null) {
            this.f30035 = false;
            this.f30027.m30458(i2);
            return false;
        }
        C8940.C1756 c1756M304592 = this.f30027.m30459(iM30420, c1756M30459.f30049, i * (-1), true);
        if (c1756M304592 == null) {
            this.f30027.m30458(c1756M30459.f30049);
        } else {
            this.f30027.m30458(c1756M304592.f30049 + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m30404(C8943 c8943) {
        if (this.f30023) {
            if (c8943.m30483() < this.f30017.mo30705()) {
                ArrayList<View> arrayList = c8943.f3910;
                return !c8943.m30486(arrayList.get(arrayList.size() - 1)).f30047;
            }
        } else if (c8943.m30487() > this.f30017.mo30710()) {
            return !c8943.m30486(c8943.f3910.get(0)).f30047;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final C8940.C1756 m30405(int i) {
        C8940.C1756 c1756 = new C8940.C1756();
        c1756.f30051 = new int[this.f3904];
        for (int i2 = 0; i2 < this.f3904; i2++) {
            c1756.f30051[i2] = i - this.f3905[i2].m30484(i);
        }
        return c1756;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final C8940.C1756 m30406(int i) {
        C8940.C1756 c1756 = new C8940.C1756();
        c1756.f30051 = new int[this.f3904];
        for (int i2 = 0; i2 < this.f3904; i2++) {
            c1756.f30051[i2] = this.f3905[i2].m30488(i) - i;
        }
        return c1756;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m30407() {
        this.f30017 = AbstractC8987.m5004(this, this.f30019);
        this.f30018 = AbstractC8987.m5004(this, 1 - this.f30019);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int m30408(RecyclerView.C8929 c8929, C8982 c8982, RecyclerView.C8935 c8935) {
        C8943 c8943M30427;
        int iMo30701;
        int i;
        int iMo307012;
        int iMo307013;
        boolean z;
        ?? r9 = 0;
        this.f30024.set(0, this.f3904, true);
        int i2 = this.f30021.f30313 ? c8982.f30309 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c8982.f30309 == 1 ? c8982.f30311 + c8982.f3974 : c8982.f30310 - c8982.f3974;
        m30444(c8982.f30309, i2);
        int iMo30705 = this.f30023 ? this.f30017.mo30705() : this.f30017.mo30710();
        ?? r0 = false;
        while (c8982.m4996(c8935) && (this.f30021.f30313 || !this.f30024.isEmpty())) {
            View viewM4997 = c8982.m4997(c8929);
            C8939 c8939 = (C8939) viewM4997.getLayoutParams();
            int iM4931 = c8939.m4931();
            int iM30461 = this.f30027.m30461(iM4931);
            ?? r3 = iM30461 == -1 ? 1 : r9;
            if (r3 != 0) {
                c8943M30427 = c8939.f30047 ? this.f3905[r9] : m30427(c8982);
                this.f30027.m30468(iM4931, c8943M30427);
            } else {
                c8943M30427 = this.f3905[iM30461];
            }
            C8943 c8943 = c8943M30427;
            c8939.f30046 = c8943;
            if (c8982.f30309 == 1) {
                addView(viewM4997);
            } else {
                addView(viewM4997, r9);
            }
            m30432(viewM4997, c8939, r9);
            if (c8982.f30309 == 1) {
                int iM30423 = c8939.f30047 ? m30423(iMo30705) : c8943.m30484(iMo30705);
                int iMo307014 = this.f30017.mo30701(viewM4997) + iM30423;
                if (r3 != 0 && c8939.f30047) {
                    C8940.C1756 c1756M30405 = m30405(iM30423);
                    c1756M30405.f30050 = -1;
                    c1756M30405.f30049 = iM4931;
                    this.f30027.m4952(c1756M30405);
                }
                i = iMo307014;
                iMo30701 = iM30423;
            } else {
                int iM30426 = c8939.f30047 ? m30426(iMo30705) : c8943.m30488(iMo30705);
                iMo30701 = iM30426 - this.f30017.mo30701(viewM4997);
                if (r3 != 0 && c8939.f30047) {
                    C8940.C1756 c1756M30406 = m30406(iM30426);
                    c1756M30406.f30050 = 1;
                    c1756M30406.f30049 = iM4931;
                    this.f30027.m4952(c1756M30406);
                }
                i = iM30426;
            }
            if (c8939.f30047 && c8982.f30308 == -1) {
                if (r3 != 0) {
                    this.f30035 = true;
                } else {
                    if (!(c8982.f30309 == 1 ? m30399() : m30400())) {
                        C8940.C1756 c1756M30460 = this.f30027.m30460(iM4931);
                        if (c1756M30460 != null) {
                            c1756M30460.f30052 = true;
                        }
                        this.f30035 = true;
                    }
                }
            }
            m30401(viewM4997, c8939, c8982);
            if (isLayoutRTL() && this.f30019 == 1) {
                int iMo307052 = c8939.f30047 ? this.f30018.mo30705() : this.f30018.mo30705() - (((this.f3904 - 1) - c8943.f30066) * this.f30020);
                iMo307013 = iMo307052;
                iMo307012 = iMo307052 - this.f30018.mo30701(viewM4997);
            } else {
                int iMo30710 = c8939.f30047 ? this.f30018.mo30710() : (c8943.f30066 * this.f30020) + this.f30018.mo30710();
                iMo307012 = iMo30710;
                iMo307013 = this.f30018.mo30701(viewM4997) + iMo30710;
            }
            if (this.f30019 == 1) {
                layoutDecoratedWithMargins(viewM4997, iMo307012, iMo30701, iMo307013, i);
            } else {
                layoutDecoratedWithMargins(viewM4997, iMo30701, iMo307012, i, iMo307013);
            }
            if (c8939.f30047) {
                m30444(this.f30021.f30309, i2);
            } else {
                m30450(c8943, this.f30021.f30309, i2);
            }
            m30437(c8929, this.f30021);
            if (!this.f30021.f30312 || !viewM4997.hasFocusable()) {
                z = false;
            } else if (c8939.f30047) {
                this.f30024.clear();
                z = false;
            } else {
                z = false;
                this.f30024.set(c8943.f30066, false);
            }
            r9 = z;
            r0 = true;
        }
        ?? r32 = r9;
        if (r0 == false) {
            m30437(c8929, this.f30021);
        }
        int iMo307102 = this.f30021.f30309 == -1 ? this.f30017.mo30710() - m30426(this.f30017.mo30710()) : m30423(this.f30017.mo30705()) - this.f30017.mo30705();
        return iMo307102 > 0 ? Math.min(c8982.f3974, iMo307102) : r32 == true ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int[] m30409(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3904];
        } else if (iArr.length < this.f3904) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3904 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f3904; i++) {
            iArr[i] = this.f3905[i].m30473();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int m30410(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public View m30411(boolean z) {
        int iMo30710 = this.f30017.mo30710();
        int iMo30705 = this.f30017.mo30705();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo30703 = this.f30017.mo30703(childAt);
            int iMo30700 = this.f30017.mo30700(childAt);
            if (iMo30700 > iMo30710 && iMo30703 < iMo30705) {
                if (iMo30700 <= iMo30705 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public View m30412(boolean z) {
        int iMo30710 = this.f30017.mo30710();
        int iMo30705 = this.f30017.mo30705();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iMo30703 = this.f30017.mo30703(childAt);
            if (this.f30017.mo30700(childAt) > iMo30710 && iMo30703 < iMo30705) {
                if (iMo30703 >= iMo30710 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int m30413() {
        View viewM30411 = this.f30023 ? m30411(true) : m30412(true);
        if (viewM30411 == null) {
            return -1;
        }
        return getPosition(viewM30411);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int[] m30414(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3904];
        } else if (iArr.length < this.f3904) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3904 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f3904; i++) {
            iArr[i] = this.f3905[i].m30475();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int[] m30415(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3904];
        } else if (iArr.length < this.f3904) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3904 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f3904; i++) {
            iArr[i] = this.f3905[i].m30476();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int m30416(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int[] m30417(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3904];
        } else if (iArr.length < this.f3904) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3904 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f3904; i++) {
            iArr[i] = this.f3905[i].m30478();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m30418(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, boolean z) {
        int iMo30705;
        int iM30423 = m30423(Integer.MIN_VALUE);
        if (iM30423 != Integer.MIN_VALUE && (iMo30705 = this.f30017.mo30705() - iM30423) > 0) {
            int i = iMo30705 - (-scrollBy(-iMo30705, c8929, c8935));
            if (!z || i <= 0) {
                return;
            }
            this.f30017.mo30716(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m30419(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, boolean z) {
        int iMo30710;
        int iM30426 = m30426(Integer.MAX_VALUE);
        if (iM30426 != Integer.MAX_VALUE && (iMo30710 = iM30426 - this.f30017.mo30710()) > 0) {
            int iScrollBy = iMo30710 - scrollBy(iMo30710, c8929, c8935);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f30017.mo30716(-iScrollBy);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public int m30420() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public int m30421() {
        return this.f30028;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int m30422() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final int m30423(int i) {
        int iM30484 = this.f3905[0].m30484(i);
        for (int i2 = 1; i2 < this.f3904; i2++) {
            int iM304842 = this.f3905[i2].m30484(i);
            if (iM304842 > iM30484) {
                iM30484 = iM304842;
            }
        }
        return iM30484;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final int m30424(int i) {
        int iM30488 = this.f3905[0].m30488(i);
        for (int i2 = 1; i2 < this.f3904; i2++) {
            int iM304882 = this.f3905[i2].m30488(i);
            if (iM304882 > iM30488) {
                iM30488 = iM304882;
            }
        }
        return iM30488;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final int m30425(int i) {
        int iM30484 = this.f3905[0].m30484(i);
        for (int i2 = 1; i2 < this.f3904; i2++) {
            int iM304842 = this.f3905[i2].m30484(i);
            if (iM304842 < iM30484) {
                iM30484 = iM304842;
            }
        }
        return iM30484;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final int m30426(int i) {
        int iM30488 = this.f3905[0].m30488(i);
        for (int i2 = 1; i2 < this.f3904; i2++) {
            int iM304882 = this.f3905[i2].m30488(i);
            if (iM304882 < iM30488) {
                iM30488 = iM304882;
            }
        }
        return iM30488;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final C8943 m30427(C8982 c8982) {
        int i;
        int i2;
        int i3;
        if (m30434(c8982.f30309)) {
            i2 = this.f3904 - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.f3904;
            i2 = 0;
            i3 = 1;
        }
        C8943 c8943 = null;
        if (c8982.f30309 == 1) {
            int iMo30710 = this.f30017.mo30710();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                C8943 c89432 = this.f3905[i2];
                int iM30484 = c89432.m30484(iMo30710);
                if (iM30484 < i4) {
                    c8943 = c89432;
                    i4 = iM30484;
                }
                i2 += i3;
            }
            return c8943;
        }
        int iMo30705 = this.f30017.mo30705();
        int i5 = Integer.MIN_VALUE;
        while (i2 != i) {
            C8943 c89433 = this.f3905[i2];
            int iM30488 = c89433.m30488(iMo30705);
            if (iM30488 > i5) {
                c8943 = c89433;
                i5 = iM30488;
            }
            i2 += i3;
        }
        return c8943;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int m30428() {
        return this.f3904;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m30429(int i, int i2, int i3) {
        int i4;
        int i5;
        int iM30422 = this.f30023 ? m30422() : m30420();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                this.f30027.m30462(i5);
                if (i3 != 1) {
                    this.f30027.m30464(i, i2);
                } else if (i3 == 2) {
                    this.f30027.m30465(i, i2);
                } else if (i3 == 8) {
                    this.f30027.m30465(i, 1);
                    this.f30027.m30464(i2, 1);
                }
                if (i4 > iM30422) {
                    return;
                }
                if (i5 <= (this.f30023 ? m30420() : m30422())) {
                    requestLayout();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        this.f30027.m30462(i5);
        if (i3 != 1) {
        }
        if (i4 > iM30422) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View m30430() {
        int i;
        int childCount = getChildCount();
        int i2 = childCount - 1;
        BitSet bitSet = new BitSet(this.f3904);
        bitSet.set(0, this.f3904, true);
        byte b = (this.f30019 == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f30023) {
            childCount = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < childCount ? 1 : -1;
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            C8939 c8939 = (C8939) childAt.getLayoutParams();
            if (bitSet.get(c8939.f30046.f30066)) {
                if (m30404(c8939.f30046)) {
                    return childAt;
                }
                bitSet.clear(c8939.f30046.f30066);
            }
            if (!c8939.f30047 && (i = i2 + i3) != childCount) {
                View childAt2 = getChildAt(i);
                if (this.f30023) {
                    int iMo30700 = this.f30017.mo30700(childAt);
                    int iMo307002 = this.f30017.mo30700(childAt2);
                    if (iMo30700 < iMo307002) {
                        return childAt;
                    }
                    if (iMo30700 == iMo307002) {
                        if ((c8939.f30046.f30066 - ((C8939) childAt2.getLayoutParams()).f30046.f30066 < 0) != (b < 0)) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iMo30703 = this.f30017.mo30703(childAt);
                    int iMo307032 = this.f30017.mo30703(childAt2);
                    if (iMo30703 > iMo307032) {
                        return childAt;
                    }
                    if (iMo30703 != iMo307032) {
                        continue;
                    }
                }
            }
            i2 += i3;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void m30431() {
        this.f30027.m4953();
        requestLayout();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m30432(View view, C8939 c8939, boolean z) {
        if (c8939.f30047) {
            if (this.f30019 == 1) {
                m30395(view, this.f30032, RecyclerView.AbstractC8919.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c8939).height, true), z);
                return;
            } else {
                m30395(view, RecyclerView.AbstractC8919.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c8939).width, true), this.f30032, z);
                return;
            }
        }
        if (this.f30019 == 1) {
            m30395(view, RecyclerView.AbstractC8919.getChildMeasureSpec(this.f30020, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) c8939).width, false), RecyclerView.AbstractC8919.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c8939).height, true), z);
        } else {
            m30395(view, RecyclerView.AbstractC8919.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c8939).width, true), RecyclerView.AbstractC8919.getChildMeasureSpec(this.f30020, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c8939).height, false), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m30433(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, boolean z) {
        C8942 c8942;
        C1755 c1755 = this.f30034;
        if (!(this.f30031 == null && this.f30025 == -1) && c8935.m30375() == 0) {
            removeAndRecycleAllViews(c8929);
            c1755.m30452();
            return;
        }
        boolean z2 = true;
        boolean z3 = (c1755.f30042 && this.f30025 == -1 && this.f30031 == null) ? false : true;
        if (z3) {
            c1755.m30452();
            if (this.f30031 != null) {
                m30398(c1755);
            } else {
                m30396();
                c1755.f30040 = this.f30023;
            }
            m30447(c8935, c1755);
            c1755.f30042 = true;
        }
        if (this.f30031 == null && this.f30025 == -1 && (c1755.f30040 != this.f30029 || isLayoutRTL() != this.f30030)) {
            this.f30027.m4953();
            c1755.f30041 = true;
        }
        if (getChildCount() > 0 && ((c8942 = this.f30031) == null || c8942.f30055 < 1)) {
            if (c1755.f30041) {
                for (int i = 0; i < this.f3904; i++) {
                    this.f3905[i].m30472();
                    int i2 = c1755.f3907;
                    if (i2 != Integer.MIN_VALUE) {
                        this.f3905[i].m30494(i2);
                    }
                }
            } else if (z3 || this.f30034.f30043 == null) {
                for (int i3 = 0; i3 < this.f3904; i3++) {
                    this.f3905[i3].m4962(this.f30023, c1755.f3907);
                }
                this.f30034.m30453(this.f3905);
            } else {
                for (int i4 = 0; i4 < this.f3904; i4++) {
                    C8943 c8943 = this.f3905[i4];
                    c8943.m30472();
                    c8943.m30494(this.f30034.f30043[i4]);
                }
            }
        }
        detachAndScrapAttachedViews(c8929);
        this.f30021.f3973 = false;
        this.f30035 = false;
        m30449(this.f30018.mo30711());
        m30448(c1755.f3906, c8935);
        if (c1755.f30040) {
            m30442(-1);
            m30408(c8929, this.f30021, c8935);
            m30442(1);
            C8982 c8982 = this.f30021;
            c8982.f30307 = c1755.f3906 + c8982.f30308;
            m30408(c8929, c8982, c8935);
        } else {
            m30442(1);
            m30408(c8929, this.f30021, c8935);
            m30442(-1);
            C8982 c89822 = this.f30021;
            c89822.f30307 = c1755.f3906 + c89822.f30308;
            m30408(c8929, c89822, c8935);
        }
        m30440();
        if (getChildCount() > 0) {
            if (this.f30023) {
                m30418(c8929, c8935, true);
                m30419(c8929, c8935, false);
            } else {
                m30419(c8929, c8935, true);
                m30418(c8929, c8935, false);
            }
        }
        if (!z || c8935.m30381() || this.f30028 == 0 || getChildCount() <= 0 || (!this.f30035 && m30430() == null)) {
            z2 = false;
        } else {
            removeCallbacks(this.f30038);
            if (!m30403()) {
            }
        }
        if (c8935.m30381()) {
            this.f30034.m30452();
        }
        this.f30029 = c1755.f30040;
        this.f30030 = isLayoutRTL();
        if (z2) {
            this.f30034.m30452();
            m30433(c8929, c8935, false);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final boolean m30434(int i) {
        if (this.f30019 == 0) {
            return (i == -1) != this.f30023;
        }
        return ((i == -1) == this.f30023) == isLayoutRTL();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m30435(int i, RecyclerView.C8935 c8935) {
        int iM30420;
        int i2;
        if (i > 0) {
            iM30420 = m30422();
            i2 = 1;
        } else {
            iM30420 = m30420();
            i2 = -1;
        }
        this.f30021.f3973 = true;
        m30448(iM30420, c8935);
        m30442(i2);
        C8982 c8982 = this.f30021;
        c8982.f30307 = iM30420 + c8982.f30308;
        c8982.f3974 = Math.abs(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m30436(View view) {
        for (int i = this.f3904 - 1; i >= 0; i--) {
            this.f3905[i].m30493(view);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m30437(RecyclerView.C8929 c8929, C8982 c8982) {
        if (!c8982.f3973 || c8982.f30313) {
            return;
        }
        if (c8982.f3974 == 0) {
            if (c8982.f30309 == -1) {
                m30438(c8929, c8982.f30311);
                return;
            } else {
                m30439(c8929, c8982.f30310);
                return;
            }
        }
        if (c8982.f30309 != -1) {
            int iM30425 = m30425(c8982.f30311) - c8982.f30311;
            m30439(c8929, iM30425 < 0 ? c8982.f30310 : Math.min(iM30425, c8982.f3974) + c8982.f30310);
        } else {
            int i = c8982.f30310;
            int iM30424 = i - m30424(i);
            m30438(c8929, iM30424 < 0 ? c8982.f30311 : c8982.f30311 - Math.min(iM30424, c8982.f3974));
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m30438(RecyclerView.C8929 c8929, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f30017.mo30703(childAt) < i || this.f30017.mo30714(childAt) < i) {
                return;
            }
            C8939 c8939 = (C8939) childAt.getLayoutParams();
            if (c8939.f30047) {
                for (int i2 = 0; i2 < this.f3904; i2++) {
                    if (this.f3905[i2].f3910.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3904; i3++) {
                    this.f3905[i3].m30491();
                }
            } else if (c8939.f30046.f3910.size() == 1) {
                return;
            } else {
                c8939.f30046.m30491();
            }
            removeAndRecycleView(childAt, c8929);
        }
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final void m30439(RecyclerView.C8929 c8929, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f30017.mo30700(childAt) > i || this.f30017.mo30713(childAt) > i) {
                return;
            }
            C8939 c8939 = (C8939) childAt.getLayoutParams();
            if (c8939.f30047) {
                for (int i2 = 0; i2 < this.f3904; i2++) {
                    if (this.f3905[i2].f3910.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3904; i3++) {
                    this.f3905[i3].m30492();
                }
            } else if (c8939.f30046.f3910.size() == 1) {
                return;
            } else {
                c8939.f30046.m30492();
            }
            removeAndRecycleView(childAt, c8929);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final void m30440() {
        if (this.f30018.mo30708() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float fMo30701 = this.f30018.mo30701(childAt);
            if (fMo30701 >= fMax) {
                if (((C8939) childAt.getLayoutParams()).m30455()) {
                    fMo30701 = (fMo30701 * 1.0f) / this.f3904;
                }
                fMax = Math.max(fMax, fMo30701);
            }
        }
        int i2 = this.f30020;
        int iRound = Math.round(fMax * this.f3904);
        if (this.f30018.mo30708() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f30018.mo30711());
        }
        m30449(iRound);
        if (this.f30020 == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C8939 c8939 = (C8939) childAt2.getLayoutParams();
            if (!c8939.f30047) {
                if (isLayoutRTL() && this.f30019 == 1) {
                    int i4 = this.f3904;
                    int i5 = c8939.f30046.f30066;
                    childAt2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f30020) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = c8939.f30046.f30066;
                    int i7 = this.f30020 * i6;
                    int i8 = i6 * i2;
                    if (this.f30019 == 1) {
                        childAt2.offsetLeftAndRight(i7 - i8);
                    } else {
                        childAt2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public void m30441(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.f30028) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f30028 = i;
        requestLayout();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final void m30442(int i) {
        C8982 c8982 = this.f30021;
        c8982.f30309 = i;
        c8982.f30308 = this.f30023 != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m30443(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f3904) {
            m30431();
            this.f3904 = i;
            this.f30024 = new BitSet(this.f3904);
            this.f3905 = new C8943[this.f3904];
            for (int i2 = 0; i2 < this.f3904; i2++) {
                this.f3905[i2] = new C8943(i2);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final void m30444(int i, int i2) {
        for (int i3 = 0; i3 < this.f3904; i3++) {
            if (!this.f3905[i3].f3910.isEmpty()) {
                m30450(this.f3905[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final boolean m30445(RecyclerView.C8935 c8935, C1755 c1755) {
        c1755.f3906 = this.f30029 ? m30416(c8935.m30375()) : m30410(c8935.m30375());
        c1755.f3907 = Integer.MIN_VALUE;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public boolean m30446(RecyclerView.C8935 c8935, C1755 c1755) {
        int i;
        if (!c8935.m30381() && (i = this.f30025) != -1) {
            if (i >= 0 && i < c8935.m30375()) {
                C8942 c8942 = this.f30031;
                if (c8942 == null || c8942.f30053 == -1 || c8942.f30055 < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f30025);
                    if (viewFindViewByPosition != null) {
                        c1755.f3906 = this.f30023 ? m30422() : m30420();
                        if (this.f30026 != Integer.MIN_VALUE) {
                            if (c1755.f30040) {
                                c1755.f3907 = (this.f30017.mo30705() - this.f30026) - this.f30017.mo30700(viewFindViewByPosition);
                            } else {
                                c1755.f3907 = (this.f30017.mo30710() + this.f30026) - this.f30017.mo30703(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f30017.mo30701(viewFindViewByPosition) > this.f30017.mo30711()) {
                            c1755.f3907 = c1755.f30040 ? this.f30017.mo30705() : this.f30017.mo30710();
                            return true;
                        }
                        int iMo30703 = this.f30017.mo30703(viewFindViewByPosition) - this.f30017.mo30710();
                        if (iMo30703 < 0) {
                            c1755.f3907 = -iMo30703;
                            return true;
                        }
                        int iMo30705 = this.f30017.mo30705() - this.f30017.mo30700(viewFindViewByPosition);
                        if (iMo30705 < 0) {
                            c1755.f3907 = iMo30705;
                            return true;
                        }
                        c1755.f3907 = Integer.MIN_VALUE;
                    } else {
                        int i2 = this.f30025;
                        c1755.f3906 = i2;
                        int i3 = this.f30026;
                        if (i3 == Integer.MIN_VALUE) {
                            c1755.f30040 = m30402(i2) == 1;
                            c1755.m4950();
                        } else {
                            c1755.m4951(i3);
                        }
                        c1755.f30041 = true;
                    }
                } else {
                    c1755.f3907 = Integer.MIN_VALUE;
                    c1755.f3906 = this.f30025;
                }
                return true;
            }
            this.f30025 = -1;
            this.f30026 = Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m30447(RecyclerView.C8935 c8935, C1755 c1755) {
        if (m30446(c8935, c1755) || m30445(c8935, c1755)) {
            return;
        }
        c1755.m4950();
        c1755.f3906 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final void m30448(int i, RecyclerView.C8935 c8935) {
        int iMo30711;
        int iMo307112;
        int iM30378;
        C8982 c8982 = this.f30021;
        boolean z = false;
        c8982.f3974 = 0;
        c8982.f30307 = i;
        if (!isSmoothScrolling() || (iM30378 = c8935.m30378()) == -1) {
            iMo30711 = 0;
            iMo307112 = 0;
        } else {
            if (this.f30023 == (iM30378 < i)) {
                iMo30711 = this.f30017.mo30711();
                iMo307112 = 0;
            } else {
                iMo307112 = this.f30017.mo30711();
                iMo30711 = 0;
            }
        }
        if (getClipToPadding()) {
            this.f30021.f30310 = this.f30017.mo30710() - iMo307112;
            this.f30021.f30311 = this.f30017.mo30705() + iMo30711;
        } else {
            this.f30021.f30311 = this.f30017.mo30704() + iMo30711;
            this.f30021.f30310 = -iMo307112;
        }
        C8982 c89822 = this.f30021;
        c89822.f30312 = false;
        c89822.f3973 = true;
        if (this.f30017.mo30708() == 0 && this.f30017.mo30704() == 0) {
            z = true;
        }
        c89822.f30313 = z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m30449(int i) {
        this.f30020 = i / this.f3904;
        this.f30032 = View.MeasureSpec.makeMeasureSpec(i, this.f30018.mo30708());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final void m30450(C8943 c8943, int i, int i2) {
        int iM30482 = c8943.m30482();
        if (i == -1) {
            if (c8943.m30487() + iM30482 <= i2) {
                this.f30024.set(c8943.f30066, false);
            }
        } else if (c8943.m30483() - iM30482 >= i2) {
            this.f30024.set(c8943.f30066, false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final int m30451(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public RecyclerView.C8922 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C8939((ViewGroup.MarginLayoutParams) layoutParams) : new C8939(layoutParams);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ۥ۟۟۟, reason: contains not printable characters */
    public static class C8940 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f30048 = 10;

        /* JADX INFO: renamed from: ۥ */
        public int[] f3908;

        /* JADX INFO: renamed from: ۥ۟ */
        public List<C1756> f3909;

        /* JADX INFO: renamed from: ۥ */
        public void m4952(C1756 c1756) {
            if (this.f3909 == null) {
                this.f3909 = new ArrayList();
            }
            int size = this.f3909.size();
            for (int i = 0; i < size; i++) {
                C1756 c17562 = this.f3909.get(i);
                if (c17562.f30049 == c1756.f30049) {
                    this.f3909.remove(i);
                }
                if (c17562.f30049 >= c1756.f30049) {
                    this.f3909.add(i, c1756);
                    return;
                }
            }
            this.f3909.add(c1756);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4953() {
            int[] iArr = this.f3908;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3909 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30457(int i) {
            int[] iArr = this.f3908;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f3908 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m30469(i)];
                this.f3908 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3908;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m30458(int i) {
            List<C1756> list = this.f3909;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3909.get(size).f30049 >= i) {
                        this.f3909.remove(size);
                    }
                }
            }
            return m30462(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C1756 m30459(int i, int i2, int i3, boolean z) {
            List<C1756> list = this.f3909;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1756 c1756 = this.f3909.get(i4);
                int i5 = c1756.f30049;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || c1756.f30050 == i3 || (z && c1756.f30052))) {
                    return c1756;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C1756 m30460(int i) {
            List<C1756> list = this.f3909;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1756 c1756 = this.f3909.get(size);
                if (c1756.f30049 == i) {
                    return c1756;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int m30461(int i) {
            int[] iArr = this.f3908;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int m30462(int i) {
            int[] iArr = this.f3908;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int iM30463 = m30463(i);
            if (iM30463 == -1) {
                int[] iArr2 = this.f3908;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f3908.length;
            }
            int i2 = iM30463 + 1;
            Arrays.fill(this.f3908, i, i2, -1);
            return i2;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final int m30463(int i) {
            if (this.f3909 == null) {
                return -1;
            }
            C1756 c1756M30460 = m30460(i);
            if (c1756M30460 != null) {
                this.f3909.remove(c1756M30460);
            }
            int size = this.f3909.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (this.f3909.get(i2).f30049 >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            C1756 c1756 = this.f3909.get(i2);
            this.f3909.remove(i2);
            return c1756.f30049;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m30464(int i, int i2) {
            int[] iArr = this.f3908;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m30457(i3);
            int[] iArr2 = this.f3908;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f3908, i, i3, -1);
            m30466(i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m30465(int i, int i2) {
            int[] iArr = this.f3908;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m30457(i3);
            int[] iArr2 = this.f3908;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f3908;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m30467(i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m30466(int i, int i2) {
            List<C1756> list = this.f3909;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1756 c1756 = this.f3909.get(size);
                int i3 = c1756.f30049;
                if (i3 >= i) {
                    c1756.f30049 = i3 + i2;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m30467(int i, int i2) {
            List<C1756> list = this.f3909;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                C1756 c1756 = this.f3909.get(size);
                int i4 = c1756.f30049;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f3909.remove(size);
                    } else {
                        c1756.f30049 = i4 - i2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m30468(int i, C8943 c8943) {
            m30457(i);
            this.f3908[i] = c8943.f30066;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int m30469(int i) {
            int length = this.f3908.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ۥ۟۟۟$ۥ */
        @SuppressLint({"BanParcelableUsage"})
        public static class C1756 implements Parcelable {
            public static final Parcelable.Creator<C1756> CREATOR = new C8941();

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f30049;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f30050;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int[] f30051;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public boolean f30052;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ۥ۟۟۟$ۥ$ۥ, reason: contains not printable characters */
            public static class C8941 implements Parcelable.Creator<C1756> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
                public C1756 createFromParcel(Parcel parcel) {
                    return new C1756(parcel);
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
                public C1756[] newArray(int i) {
                    return new C1756[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C1756(Parcel parcel) {
                this.f30049 = parcel.readInt();
                this.f30050 = parcel.readInt();
                this.f30052 = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.f30051 = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f30049 + ", mGapDir=" + this.f30050 + ", mHasUnwantedGapAfter=" + this.f30052 + ", mGapPerSpan=" + Arrays.toString(this.f30051) + C6193.f1885;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f30049);
                parcel.writeInt(this.f30050);
                parcel.writeInt(this.f30052 ? 1 : 0);
                int[] iArr = this.f30051;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f30051);
                }
            }

            /* JADX INFO: renamed from: ۥ */
            public int m4954(int i) {
                int[] iArr = this.f30051;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public C1756() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f30019 = i2;
        m30443(i);
        this.f30021 = new C8982();
        m30407();
    }
}
