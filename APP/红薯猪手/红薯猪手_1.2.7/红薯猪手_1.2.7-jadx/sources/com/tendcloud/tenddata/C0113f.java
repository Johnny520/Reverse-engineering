package com.tendcloud.tenddata;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tendcloud.tenddata.C0120m;

/* JADX INFO: renamed from: com.tendcloud.tenddata.f */
/* JADX INFO: loaded from: classes.dex */
public class C0113f {

    /* JADX INFO: renamed from: e */
    public static final Parcelable.Creator<C0113f> f491e = new Parcelable.Creator<C0113f>() { // from class: com.tendcloud.tenddata.f.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C0113f createFromParcel(Parcel parcel) {
            try {
                return new C0113f(parcel);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C0113f[] newArray(int i) {
            try {
                return new C0113f[i];
            } catch (Throwable unused) {
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public boolean f492a;

    /* JADX INFO: renamed from: b */
    public int f493b;

    /* JADX INFO: renamed from: c */
    public final String f494c;

    /* JADX INFO: renamed from: d */
    public final int f495d;

    /* JADX INFO: renamed from: f */
    private final C0120m.a f496f;

    public C0113f(int i) {
        int uid;
        this.f495d = i;
        this.f494c = m511a(i);
        C0120m.a aVar = C0120m.a.get(i);
        this.f496f = aVar;
        C0120m.d dVarM515d = m515d();
        if (aVar != null) {
            try {
                C0120m.b group = aVar.getGroup("cpuacct");
                String str = aVar.getGroup("cpu").group;
                if (str != null) {
                    this.f492a = !str.contains("bg_non_interactive");
                    if (group.group.split("/").length > 1) {
                        uid = Integer.parseInt(group.group.split("/")[1].replace("uid_", ""));
                        this.f493b = uid;
                    } else if (dVarM515d == null) {
                        return;
                    }
                } else if (dVarM515d == null) {
                    return;
                }
                uid = dVarM515d.getUid();
                this.f493b = uid;
            } catch (Throwable unused) {
                if (dVarM515d != null) {
                    this.f493b = dVarM515d.getUid();
                }
            }
        }
    }

    public C0113f(Parcel parcel) {
        this.f494c = parcel.readString();
        this.f495d = parcel.readInt();
        this.f496f = (C0120m.a) parcel.readParcelable(C0120m.a.class.getClassLoader());
        this.f492a = parcel.readByte() != 0;
    }

    /* JADX INFO: renamed from: a */
    public static String m511a(int i) {
        String strTrim = null;
        try {
            strTrim = C0120m.readFile(String.format("/proc/%d/cmdline", Integer.valueOf(i))).trim();
            if (TextUtils.isEmpty(strTrim)) {
                return C0120m.c.get(i).getComm();
            }
        } catch (Throwable unused) {
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: a */
    public String m512a() {
        try {
            return this.f494c.split(":")[0];
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public String m513b() {
        try {
            if (this.f494c.split(":").length <= 1) {
                return "";
            }
            return ":" + this.f494c.split(":")[1];
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public C0120m.a m514c() {
        return this.f496f;
    }

    /* JADX INFO: renamed from: d */
    public final C0120m.d m515d() {
        try {
            return C0120m.d.get(this.f495d);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public C0120m.c m516e() {
        try {
            return C0120m.c.get(this.f495d);
        } catch (Throwable unused) {
            return null;
        }
    }
}
