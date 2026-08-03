package androidx.fragment.app;

import Yue.InterfaceC6391;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class C8865 implements Parcelable {
    public static final Parcelable.Creator<C8865> CREATOR = new C1690();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final List<String> f29688;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final List<C1689> f29689;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟$ۥ */
    public class C1690 implements Parcelable.Creator<C8865> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C8865 createFromParcel(Parcel parcel) {
            return new C8865(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C8865[] newArray(int i) {
            return new C8865[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8865(List<String> list, List<C1689> list2) {
        this.f29688 = list;
        this.f29689 = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
        parcel.writeStringList(this.f29688);
        parcel.writeTypedList(this.f29689);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public List<C1688> m4831(@InterfaceC6391 FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap map2 = new HashMap(this.f29688.size());
        for (String str : this.f29688) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                map2.put(fragment.mWho, fragment);
            } else {
                Bundle bundleM30039 = fragmentManager.m29810().m30039(str, null);
                if (bundleM30039 != null) {
                    ClassLoader classLoader = fragmentManager.m29812().m15670().getClassLoader();
                    Fragment fragmentM4848 = ((C8881) bundleM30039.getParcelable("state")).m4848(fragmentManager.m29809(), classLoader);
                    fragmentM4848.mSavedFragmentState = bundleM30039;
                    if (bundleM30039.getBundle(C8882.f29747) == null) {
                        fragmentM4848.mSavedFragmentState.putBundle(C8882.f29747, new Bundle());
                    }
                    Bundle bundle = bundleM30039.getBundle(C8882.f29752);
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentM4848.setArguments(bundle);
                    map2.put(fragmentM4848.mWho, fragmentM4848);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C1689> it = this.f29689.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m29926(fragmentManager, map2));
        }
        return arrayList;
    }

    public C8865(@InterfaceC6391 Parcel parcel) {
        this.f29688 = parcel.createStringArrayList();
        this.f29689 = parcel.createTypedArrayList(C1689.CREATOR);
    }
}
