package Yue;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class AbstractC2967 implements Parcelable {
    private final Parcelable mSuperState;
    public static final AbstractC2967 EMPTY_STATE = new C0007();
    public static final Parcelable.Creator<AbstractC2967> CREATOR = new C0008();

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟۠$ۥ */
    public class C0007 extends AbstractC2967 {
        public C0007() {
            super((C0007) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟۠$ۥ۟ */
    public class C0008 implements Parcelable.ClassLoaderCreator<AbstractC2967> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public AbstractC2967 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public AbstractC2967 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC2967.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public AbstractC2967[] newArray(int i) {
            return new AbstractC2967[i];
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟۟۠.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC2967(C0007 c0007) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @InterfaceC6490
    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC2967() {
        this.mSuperState = null;
    }

    public AbstractC2967(@InterfaceC6391 Parcelable parcelable) {
        if (parcelable != null) {
            this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC2967(@InterfaceC6391 Parcel parcel) {
        this(parcel, null);
    }

    public AbstractC2967(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.mSuperState = parcelable == null ? EMPTY_STATE : parcelable;
    }
}
