package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import p000.C0646P0;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0646P0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2084a;

    public /* synthetic */ C0646P0(int i) {
        this.f2084a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        InterfaceC1058Yk interfaceC1058Yk = null;
        switch (this.f2084a) {
            case 0:
                return new C0689Q0(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                C1307d4 c1307d4 = new C1307d4(parcel);
                c1307d4.f4757a = parcel.readByte() != 0;
                return c1307d4;
            case 2:
                return new C1527i5(parcel);
            case 3:
                return new C2084j5(parcel);
            case 4:
                return new C0136D6((C1469gs) parcel.readParcelable(C1469gs.class.getClassLoader()), (C1469gs) parcel.readParcelable(C1469gs.class.getClassLoader()), (C0019Ac) parcel.readParcelable(C0019Ac.class.getClassLoader()), (C1469gs) parcel.readParcelable(C1469gs.class.getClassLoader()), parcel.readInt());
            case 5:
                return new C0019Ac(parcel.readLong());
            case 6:
                C2676wi c2676wi = new C2676wi();
                c2676wi.f9236a = parcel.readString();
                c2676wi.f9237b = parcel.readInt();
                return c2676wi;
            case 7:
                C0068Bi c0068Bi = new C0068Bi();
                c0068Bi.f166e = null;
                c0068Bi.f167f = new ArrayList();
                c0068Bi.f168g = new ArrayList();
                c0068Bi.f162a = parcel.createStringArrayList();
                c0068Bi.f163b = parcel.createStringArrayList();
                c0068Bi.f164c = (C1527i5[]) parcel.createTypedArray(C1527i5.CREATOR);
                c0068Bi.f165d = parcel.readInt();
                c0068Bi.f166e = parcel.readString();
                c0068Bi.f167f = parcel.createStringArrayList();
                c0068Bi.f168g = parcel.createTypedArrayList(C2084j5.CREATOR);
                c0068Bi.f169h = parcel.createTypedArrayList(C2676wi.CREATOR);
                return c0068Bi;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return new C0283Gi(parcel);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return new C0372Il((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 10:
                C2154ko c2154ko = new C2154ko();
                c2154ko.f7531a = parcel.readInt();
                c2154ko.f7532b = parcel.readInt();
                c2154ko.f7533c = parcel.readInt() == 1;
                return c2154ko;
            case 11:
                C0635Oq c0635Oq = new C0635Oq(parcel);
                c0635Oq.f2032a = ((Integer) parcel.readValue(C0635Oq.class.getClassLoader())).intValue();
                return c0635Oq;
            case 12:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0646P0(12);

                    /* JADX INFO: renamed from: a */
                    public final int f3645a;

                    /* JADX INFO: renamed from: b */
                    public final MediaDescriptionCompat f3646b;

                    {
                        this.f3645a = parcel.readInt();
                        this.f3646b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f3645a + ", mDescription=" + this.f3646b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.f3645a);
                        this.f3646b.writeToParcel(parcel2, i);
                    }
                };
            case 13:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strM2285g = AbstractC1188ar.m2285g(mediaDescription);
                CharSequence charSequenceM2287i = AbstractC1188ar.m2287i(mediaDescription);
                CharSequence charSequenceM2286h = AbstractC1188ar.m2286h(mediaDescription);
                CharSequence charSequenceM2281c = AbstractC1188ar.m2281c(mediaDescription);
                Bitmap bitmapM2283e = AbstractC1188ar.m2283e(mediaDescription);
                Uri uriM2284f = AbstractC1188ar.m2284f(mediaDescription);
                Bundle bundleM2282d = AbstractC1188ar.m2282d(mediaDescription);
                if (bundleM2282d != null) {
                    bundleM2282d.setClassLoader(AbstractC1293cr.class.getClassLoader());
                    try {
                        bundleM2282d.isEmpty();
                    } catch (BadParcelableException unused) {
                        bundleM2282d = null;
                    }
                    break;
                }
                Uri uriM2354a = bundleM2282d != null ? (Uri) bundleM2282d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriM2354a == null) {
                    bundle = bundleM2282d;
                } else if (bundleM2282d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleM2282d.size() == 2) {
                    bundle = null;
                } else {
                    bundleM2282d.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleM2282d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleM2282d;
                }
                if (uriM2354a == null) {
                    uriM2354a = AbstractC1232br.m2354a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM2285g, charSequenceM2287i, charSequenceM2286h, charSequenceM2281c, bitmapM2283e, uriM2284f, bundle, uriM2354a);
                mediaDescriptionCompat.f3655i = mediaDescription;
                return mediaDescriptionCompat;
            case 14:
                return new MediaMetadataCompat(parcel);
            case 15:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0646P0(15);

                    /* JADX INFO: renamed from: a */
                    public final MediaDescriptionCompat f3659a;

                    /* JADX INFO: renamed from: b */
                    public final long f3660b;

                    {
                        this.f3659a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f3660b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f3659a + ", Id=" + this.f3660b + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.f3659a.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.f3660b);
                    }
                };
            case 16:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0646P0(16);

                    /* JADX INFO: renamed from: a */
                    public final Object f3662a = new Object();

                    /* JADX INFO: renamed from: b */
                    public final Object f3663b;

                    {
                        this.f3663b = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).f3663b;
                        Object obj3 = this.f3663b;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.f3663b;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable((Parcelable) this.f3663b, i);
                    }
                };
            case 17:
                return C1469gs.m2820a(parcel.readInt(), parcel.readInt());
            case 18:
                C0250Fs c0250Fs = new C0250Fs(parcel);
                c0250Fs.f817a = parcel.readInt();
                return c0250Fs;
            case 19:
                return new ParcelImpl(parcel);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f3664a = parcel.readInt();
                parcelableVolumeInfo.f3666c = parcel.readInt();
                parcelableVolumeInfo.f3667d = parcel.readInt();
                parcelableVolumeInfo.f3668e = parcel.readInt();
                parcelableVolumeInfo.f3665b = parcel.readInt();
                return parcelableVolumeInfo;
            case 21:
                return new PlaybackStateCompat(parcel);
            case 22:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 23:
                C0426Jw c0426Jw = new C0426Jw();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = BinderC0383Iw.f1316c;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC1058Yk.f3366a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1058Yk)) {
                        C1015Xk c1015Xk = new C1015Xk();
                        c1015Xk.f3223b = strongBinder;
                        interfaceC1058Yk = c1015Xk;
                    } else {
                        interfaceC1058Yk = (InterfaceC1058Yk) iInterfaceQueryLocalInterface;
                    }
                }
                c0426Jw.f1406a = interfaceC1058Yk;
                return c0426Jw;
            case 24:
                C0814Sy c0814Sy = new C0814Sy();
                c0814Sy.f2579a = parcel.readInt();
                c0814Sy.f2580b = parcel.readInt();
                c0814Sy.f2582d = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    c0814Sy.f2581c = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0814Sy;
            case 25:
                C0857Ty c0857Ty = new C0857Ty();
                c0857Ty.f2710a = parcel.readInt();
                c0857Ty.f2711b = parcel.readInt();
                int i3 = parcel.readInt();
                c0857Ty.f2712c = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    c0857Ty.f2713d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                c0857Ty.f2714e = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    c0857Ty.f2715f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0857Ty.f2717h = parcel.readInt() == 1;
                c0857Ty.f2718i = parcel.readInt() == 1;
                c0857Ty.f2719j = parcel.readInt() == 1;
                c0857Ty.f2716g = parcel.readArrayList(C0814Sy.class.getClassLoader());
                return c0857Ty;
            default:
                return new C0944Vz(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2084a) {
            case 0:
                return new C0689Q0[i];
            case 1:
                return new C1307d4[i];
            case 2:
                return new C1527i5[i];
            case 3:
                return new C2084j5[i];
            case 4:
                return new C0136D6[i];
            case 5:
                return new C0019Ac[i];
            case 6:
                return new C2676wi[i];
            case 7:
                return new C0068Bi[i];
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return new C0283Gi[i];
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return new C0372Il[i];
            case 10:
                return new C2154ko[i];
            case 11:
                return new C0635Oq[i];
            case 12:
                return new MediaBrowserCompat$MediaItem[i];
            case 13:
                return new MediaDescriptionCompat[i];
            case 14:
                return new MediaMetadataCompat[i];
            case 15:
                return new MediaSessionCompat$QueueItem[i];
            case 16:
                return new MediaSessionCompat$Token[i];
            case 17:
                return new C1469gs[i];
            case 18:
                return new C0250Fs[i];
            case 19:
                return new ParcelImpl[i];
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return new ParcelableVolumeInfo[i];
            case 21:
                return new PlaybackStateCompat[i];
            case 22:
                return new RatingCompat[i];
            case 23:
                return new C0426Jw[i];
            case 24:
                return new C0814Sy[i];
            case 25:
                return new C0857Ty[i];
            default:
                return new C0944Vz[i];
        }
    }
}
