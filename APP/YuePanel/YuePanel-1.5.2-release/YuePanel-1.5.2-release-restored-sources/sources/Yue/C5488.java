package Yue;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C5488 implements Parcelable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final IntentSender f13457;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public final Intent f13458;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f13459;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f13460;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C5490 f13456 = new C5490(null);

    @InterfaceC6399
    @InterfaceC5568
    public static final Parcelable.Creator<C5488> CREATOR = new C0775();

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ$ۥ */
    public static final class C0774 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final IntentSender f1539;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6489
        public Intent f1540;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f13461;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f13462;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC7157(EnumC3259.f5011)
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC5489 {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0774(@InterfaceC6399 IntentSender intentSender) {
            C5499.m17103(intentSender, "intentSender");
            this.f1539 = intentSender;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C5488 m2242() {
            return new C5488(this.f1539, this.f1540, this.f13461, this.f13462);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0774 m2243(@InterfaceC6489 Intent intent) {
            this.f1540 = intent;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C0774 m17076(int i, int i2) {
            this.f13462 = i;
            this.f13461 = i2;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: Illegal instructions before constructor call */
        public C0774(@InterfaceC6399 PendingIntent pendingIntent) {
            C5499.m17103(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            C5499.m17102(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ$ۥ۟ */
    public static final class C0775 implements Parcelable.Creator<C5488> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C5488 createFromParcel(@InterfaceC6399 Parcel parcel) {
            C5499.m17103(parcel, "inParcel");
            return new C5488(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C5488[] newArray(int i) {
            return new C5488[i];
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5490 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۥۦۣ.ۥ۟۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C5490(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public static /* synthetic */ void m2246() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C5490() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5488(@InterfaceC6399 IntentSender intentSender, @InterfaceC6489 Intent intent, int i, int i2) {
        C5499.m17103(intentSender, "intentSender");
        this.f13457 = intentSender;
        this.f13458 = intent;
        this.f13459 = i;
        this.f13460 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC6399 Parcel parcel, int i) {
        C5499.m17103(parcel, "dest");
        parcel.writeParcelable(this.f13457, i);
        parcel.writeParcelable(this.f13458, i);
        parcel.writeInt(this.f13459);
        parcel.writeInt(this.f13460);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final Intent m2240() {
        return this.f13458;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m2241() {
        return this.f13459;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m17074() {
        return this.f13460;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final IntentSender m17075() {
        return this.f13457;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.IntentSender)
  (wrap:android.content.Intent:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.content.Intent) : (r3v0 android.content.Intent))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(android.content.IntentSender, android.content.Intent, int, int):void (m)] (LINE:6) call: Yue.ۥ۠ۥۦۣ.<init>(android.content.IntentSender, android.content.Intent, int, int):void type: THIS */
    public /* synthetic */ C5488(IntentSender intentSender, Intent intent, int i, int i2, int i3, C4335 c4335) {
        this(intentSender, (i3 & 2) != 0 ? null : intent, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5488(@InterfaceC6399 Parcel parcel) {
        C5499.m17103(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        C5499.m17100(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
