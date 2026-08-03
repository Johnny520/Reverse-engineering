package p000;

import android.os.Parcel;
import android.os.Parcelable;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: p */
/* JADX INFO: loaded from: classes.dex */
public final class C2342p implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8221a;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f8221a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC2393q.f8396b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C1124a6(parcel, classLoader);
            case 2:
                return new C1530i8(parcel, classLoader);
            case 3:
                return new C0920Vb(parcel, classLoader);
            case 4:
                return new C1459gi(parcel, classLoader);
            case 5:
                return new C0205Eq(parcel, classLoader);
            case 6:
                return new C2775yv(parcel, classLoader);
            case 7:
                return new C2254my(parcel, classLoader);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return new C2705xA(parcel, classLoader);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return new C2491sB(parcel, classLoader);
            default:
                return new C0187EE(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f8221a) {
            case 0:
                return new AbstractC2393q[i];
            case 1:
                return new C1124a6[i];
            case 2:
                return new C1530i8[i];
            case 3:
                return new C0920Vb[i];
            case 4:
                return new C1459gi[i];
            case 5:
                return new C0205Eq[i];
            case 6:
                return new C2775yv[i];
            case 7:
                return new C2254my[i];
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return new C2705xA[i];
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return new C2491sB[i];
            default:
                return new C0187EE[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8221a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC2393q.f8396b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C1124a6(parcel, null);
            case 2:
                return new C1530i8(parcel, null);
            case 3:
                return new C0920Vb(parcel, null);
            case 4:
                return new C1459gi(parcel, null);
            case 5:
                return new C0205Eq(parcel, null);
            case 6:
                return new C2775yv(parcel, null);
            case 7:
                return new C2254my(parcel, null);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return new C2705xA(parcel, null);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return new C2491sB(parcel, null);
            default:
                return new C0187EE(parcel, null);
        }
    }
}
