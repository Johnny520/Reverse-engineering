package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000f¨\u0006$"}, m16758d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "fillInIntent", _UrlKt.FRAGMENT_ENCODE_SET, "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "Ll8/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "Landroid/content/IntentSender;", "getIntentSender", "()Landroid/content/IntentSender;", "r", "Landroid/content/Intent;", "getFillInIntent", "()Landroid/content/Intent;", "s", "I", "getFlagsMask", "t", "getFlagsValues", "u", "b", "activity_release"}, m16759k = 1, m16760mv = {1, 8, 0}, m16762xi = 48)
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final IntentSender intentSender;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final Intent fillInIntent;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final int flagsMask;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int flagsValues;
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0346a();

    /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C0346a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        parcel.getClass();
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        parcelable.getClass();
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeParcelable(this.intentSender, flags);
        dest.writeParcelable(this.fillInIntent, flags);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        intentSender.getClass();
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i10;
        this.flagsValues = i11;
    }
}
