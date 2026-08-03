package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0467Zf;
import p000a.C0842tb;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1282a implements Parcelable {
    public static final Parcelable.Creator<C1282a> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public final C0842tb f5680a;

    /* JADX INFO: renamed from: b */
    public final C0842tb f5681b;

    /* JADX INFO: renamed from: c */
    public final c f5682c;

    /* JADX INFO: renamed from: d */
    public final C0842tb f5683d;

    /* JADX INFO: renamed from: e */
    public final int f5684e;

    /* JADX INFO: renamed from: f */
    public final int f5685f;

    /* JADX INFO: renamed from: g */
    public final int f5686g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a */
    public class a implements Parcelable.Creator<C1282a> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C1282a createFromParcel(Parcel parcel) {
            return new C1282a((C0842tb) parcel.readParcelable(C0842tb.class.getClassLoader()), (C0842tb) parcel.readParcelable(C0842tb.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (C0842tb) parcel.readParcelable(C0842tb.class.getClassLoader()), parcel.readInt());
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C1282a[] newArray(int i) {
            return new C1282a[i];
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$b */
    public static final class b {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int f5687c = 0;

        /* JADX INFO: renamed from: a */
        public Long f5688a;

        /* JADX INFO: renamed from: b */
        public c f5689b;

        static {
            C0467Zf.m1135a(C0842tb.m1964k(1900, 0).f3317f);
            C0467Zf.m1135a(C0842tb.m1964k(2100, 11).f3317f);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$c */
    public interface c extends Parcelable {
        /* JADX INFO: renamed from: f */
        boolean mo3214f(long j);
    }

    public C1282a(C0842tb c0842tb, C0842tb c0842tb2, c cVar, C0842tb c0842tb3, int i) {
        Objects.requireNonNull(c0842tb, "start cannot be null");
        Objects.requireNonNull(c0842tb2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f5680a = c0842tb;
        this.f5681b = c0842tb2;
        this.f5683d = c0842tb3;
        this.f5684e = i;
        this.f5682c = cVar;
        if (c0842tb3 != null && c0842tb.f3312a.compareTo(c0842tb3.f3312a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0842tb3 != null && c0842tb3.f3312a.compareTo(c0842tb2.f3312a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > C0467Zf.m1139e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f5686g = c0842tb.m1967n(c0842tb2) + 1;
        this.f5685f = (c0842tb2.f3314c - c0842tb.f3314c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1282a)) {
            return false;
        }
        C1282a c1282a = (C1282a) obj;
        return this.f5680a.equals(c1282a.f5680a) && this.f5681b.equals(c1282a.f5681b) && Objects.equals(this.f5683d, c1282a.f5683d) && this.f5684e == c1282a.f5684e && this.f5682c.equals(c1282a.f5682c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5680a, this.f5681b, this.f5683d, Integer.valueOf(this.f5684e), this.f5682c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5680a, 0);
        parcel.writeParcelable(this.f5681b, 0);
        parcel.writeParcelable(this.f5683d, 0);
        parcel.writeParcelable(this.f5682c, 0);
        parcel.writeInt(this.f5684e);
    }
}
