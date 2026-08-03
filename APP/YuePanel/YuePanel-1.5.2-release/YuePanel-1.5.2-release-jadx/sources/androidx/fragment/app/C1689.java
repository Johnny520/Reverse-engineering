package androidx.fragment.app;

import Yue.InterfaceC6391;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.Lifecycle;
import androidx.fragment.app.AbstractC8885;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟ */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C1689 implements Parcelable {
    public static final Parcelable.Creator<C1689> CREATOR = new C8864();

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final String f29673 = "FragmentManager";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int[] f29674;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final ArrayList<String> f29675;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int[] f29676;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int[] f29677;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f29678;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final String f29679;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int f29680;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final int f29681;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final CharSequence f29682;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int f29683;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final CharSequence f29684;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final ArrayList<String> f29685;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final ArrayList<String> f29686;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final boolean f29687;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟$ۥ, reason: contains not printable characters */
    public class C8864 implements Parcelable.Creator<C1689> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C1689 createFromParcel(Parcel parcel) {
            return new C1689(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C1689[] newArray(int i) {
            return new C1689[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1689(C1688 c1688) {
        int size = c1688.f29792.size();
        this.f29674 = new int[size * 6];
        if (!c1688.f29798) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f29675 = new ArrayList<>(size);
        this.f29676 = new int[size];
        this.f29677 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC8885.C1704 c1704 = c1688.f29792.get(i2);
            int i3 = i + 1;
            this.f29674[i] = c1704.f3843;
            ArrayList<String> arrayList = this.f29675;
            Fragment fragment = c1704.f3844;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f29674;
            iArr[i3] = c1704.f29809 ? 1 : 0;
            iArr[i + 2] = c1704.f29810;
            iArr[i + 3] = c1704.f29811;
            int i4 = i + 5;
            iArr[i + 4] = c1704.f29812;
            i += 6;
            iArr[i4] = c1704.f29813;
            this.f29676[i2] = c1704.f29814.ordinal();
            this.f29677[i2] = c1704.f29815.ordinal();
        }
        this.f29678 = c1688.f29797;
        this.f29679 = c1688.f29800;
        this.f29680 = c1688.f29671;
        this.f29681 = c1688.f29801;
        this.f29682 = c1688.f29802;
        this.f29683 = c1688.f29803;
        this.f29684 = c1688.f29804;
        this.f29685 = c1688.f29805;
        this.f29686 = c1688.f29806;
        this.f29687 = c1688.f29807;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f29674);
        parcel.writeStringList(this.f29675);
        parcel.writeIntArray(this.f29676);
        parcel.writeIntArray(this.f29677);
        parcel.writeInt(this.f29678);
        parcel.writeString(this.f29679);
        parcel.writeInt(this.f29680);
        parcel.writeInt(this.f29681);
        TextUtils.writeToParcel(this.f29682, parcel, 0);
        parcel.writeInt(this.f29683);
        TextUtils.writeToParcel(this.f29684, parcel, 0);
        parcel.writeStringList(this.f29685);
        parcel.writeStringList(this.f29686);
        parcel.writeInt(this.f29687 ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4827(@InterfaceC6391 C1688 c1688) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f29674.length) {
                c1688.f29797 = this.f29678;
                c1688.f29800 = this.f29679;
                c1688.f29798 = true;
                c1688.f29801 = this.f29681;
                c1688.f29802 = this.f29682;
                c1688.f29803 = this.f29683;
                c1688.f29804 = this.f29684;
                c1688.f29805 = this.f29685;
                c1688.f29806 = this.f29686;
                c1688.f29807 = this.f29687;
                return;
            }
            AbstractC8885.C1704 c1704 = new AbstractC8885.C1704();
            int i3 = i + 1;
            c1704.f3843 = this.f29674[i];
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Instantiate " + c1688 + " op #" + i2 + " base fragment #" + this.f29674[i3]);
            }
            c1704.f29814 = Lifecycle.State.values()[this.f29676[i2]];
            c1704.f29815 = Lifecycle.State.values()[this.f29677[i2]];
            int[] iArr = this.f29674;
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            c1704.f29809 = z;
            int i5 = iArr[i4];
            c1704.f29810 = i5;
            int i6 = iArr[i + 3];
            c1704.f29811 = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            c1704.f29812 = i8;
            i += 6;
            int i9 = iArr[i7];
            c1704.f29813 = i9;
            c1688.f29793 = i5;
            c1688.f29794 = i6;
            c1688.f29795 = i8;
            c1688.f29796 = i9;
            c1688.m30047(c1704);
            i2++;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public C1688 m4828(@InterfaceC6391 FragmentManager fragmentManager) {
        C1688 c1688 = new C1688(fragmentManager);
        m4827(c1688);
        c1688.f29671 = this.f29680;
        for (int i = 0; i < this.f29675.size(); i++) {
            String str = this.f29675.get(i);
            if (str != null) {
                c1688.f29792.get(i).f3844 = fragmentManager.m29793(str);
            }
        }
        c1688.m29916(1);
        return c1688;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C1688 m29926(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Map<String, Fragment> map) {
        C1688 c1688 = new C1688(fragmentManager);
        m4827(c1688);
        for (int i = 0; i < this.f29675.size(); i++) {
            String str = this.f29675.get(i);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f29679 + " failed due to missing saved state for Fragment (" + str + ")");
                }
                c1688.f29792.get(i).f3844 = fragment;
            }
        }
        return c1688;
    }

    public C1689(Parcel parcel) {
        this.f29674 = parcel.createIntArray();
        this.f29675 = parcel.createStringArrayList();
        this.f29676 = parcel.createIntArray();
        this.f29677 = parcel.createIntArray();
        this.f29678 = parcel.readInt();
        this.f29679 = parcel.readString();
        this.f29680 = parcel.readInt();
        this.f29681 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f29682 = (CharSequence) creator.createFromParcel(parcel);
        this.f29683 = parcel.readInt();
        this.f29684 = (CharSequence) creator.createFromParcel(parcel);
        this.f29685 = parcel.createStringArrayList();
        this.f29686 = parcel.createStringArrayList();
        this.f29687 = parcel.readInt() != 0;
    }
}
