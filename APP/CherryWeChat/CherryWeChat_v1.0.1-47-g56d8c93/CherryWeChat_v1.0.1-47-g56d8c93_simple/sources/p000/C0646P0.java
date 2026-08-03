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

/* JADX INFO: renamed from: P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0646P0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2084a;

    public /* synthetic */ C0646P0(int r1) {
        this.f2084a = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel r14) {
        boolean r1 = true;
        Intent r3 = null;
        InterfaceC1058Yk r32 = null;
        switch(this.f2084a) {
            case 0: goto L120;
            case 1: goto L114;
            case 2: goto L113;
            case 3: goto L111;
            case 4: goto L109;
            case 5: goto L107;
            case 6: goto L104;
            case 7: goto L102;
            case 8: goto L101;
            case 9: goto L99;
            case 10: goto L92;
            case 11: goto L90;
            case 12: goto L89;
            case 13: goto L63;
            case 14: goto L62;
            case 15: goto L60;
            case 16: goto L57;
            case 17: goto L56;
            case 18: goto L53;
            case 19: goto L52;
            case 20: goto L49;
            case 21: goto L48;
            case 22: goto L46;
            case 23: goto L34;
            case 24: goto L26;
            case 25: goto L6;
            default: goto L5;
        };
    L6:
        C0857Ty r0 = new C0857Ty();
        r0.f2710a = r14.readInt();
        r0.f2711b = r14.readInt();
        int r33 = r14.readInt();
        r0.f2712c = r33;
        if (r33 <= 0) goto L9;
        int[] r34 = new int[r33];
        r0.f2713d = r34;
        r14.readIntArray(r34);
    L9:
        int r35 = r14.readInt();
        r0.f2714e = r35;
        if (r35 <= 0) goto L13;
        int[] r36 = new int[r35];
        r0.f2715f = r36;
        r14.readIntArray(r36);
    L13:
        if (r14.readInt() != 1) goto L15;
        boolean r37 = true;
    L16:
        r0.f2717h = r37;
        if (r14.readInt() != 1) goto L19;
        boolean r38 = true;
    L20:
        r0.f2718i = r38;
        if (r14.readInt() == 1) goto L24;
        r1 = false;
    L24:
        r0.f2719j = r1;
        r0.f2716g = r14.readArrayList(C0814Sy.class.getClassLoader());
        return r0;
    L19:
        r38 = false;
        goto L20
    L15:
        r37 = false;
        goto L16
    L26:
        C0814Sy r02 = new C0814Sy();
        r02.f2579a = r14.readInt();
        r02.f2580b = r14.readInt();
        if (r14.readInt() == 1) goto L30;
        r1 = false;
    L30:
        r02.f2582d = r1;
        int r12 = r14.readInt();
        if (r12 <= 0) goto L33;
        int[] r13 = new int[r12];
        r02.f2581c = r13;
        r14.readIntArray(r13);
    L33:
        return r02;
    L34:
        C0426Jw r03 = new C0426Jw();
        IBinder r142 = r14.readStrongBinder();
        int r15 = BinderC0383Iw.f1316c;
        if (r142 == null) goto L43;
        IInterface r16 = r142.queryLocalInterface(InterfaceC1058Yk.f3366a);
        if (r16 != null) goto L40;
    L42:
        C1015Xk r39 = new C1015Xk();
        r39.f3223b = r142;
        r32 = r39;
        goto L43
    L40:
        if ((r16 instanceof InterfaceC1058Yk) == false) goto L42;
        r32 = (InterfaceC1058Yk) r16;
    L43:
        r03.f1406a = r32;
        return r03;
    L49:
        ParcelableVolumeInfo r04 = new ParcelableVolumeInfo();
        r04.f3664a = r14.readInt();
        r04.f3666c = r14.readInt();
        r04.f3667d = r14.readInt();
        r04.f3668e = r14.readInt();
        r04.f3665b = r14.readInt();
        return r04;
    L53:
        C0250Fs r05 = new C0250Fs(r14);
        r05.f817a = r14.readInt();
        return r05;
    L57:
        final Parcelable r143 = r14.readParcelable(null);
        return new MediaSessionCompat$Token(r143);
    L63:
        Object r144 = MediaDescription.CREATOR.createFromParcel(r14);
        if (r144 == null) goto L128;
        MediaDescription r145 = (MediaDescription) r144;
        String r5 = AbstractC1188ar.m2285g(r145);
        CharSequence r6 = AbstractC1188ar.m2287i(r145);
        CharSequence r7 = AbstractC1188ar.m2286h(r145);
        CharSequence r8 = AbstractC1188ar.m2281c(r145);
        Bitmap r9 = AbstractC1188ar.m2283e(r145);
        Uri r10 = AbstractC1188ar.m2284f(r145);
        Bundle r06 = AbstractC1188ar.m2282d(r145);
        if (r06 == null) goto L72;
        r06.setClassLoader(AbstractC1293cr.class.getClassLoader());
        r06.isEmpty();     // Catch: BadParcelableException -> L70
    L70:
        r06 = null;
    L72:
        if (r06 == null) goto L74;
        Uri r2 = (Uri) r06.getParcelable("android.support.v4.media.description.MEDIA_URI");
    L75:
        if (r2 != null) goto L77;
    L82:
        Bundle r11 = r06;
    L83:
        if (r2 != null) goto L86;
        r2 = AbstractC1232br.m2354a(r145);
    L86:
        MediaDescriptionCompat r4 = new MediaDescriptionCompat(r5, r6, r7, r8, r9, r10, r11, r2);
        r4.f3655i = r145;
        return r4;
    L77:
        if (r06.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") == true) goto L79;
    L81:
        r06.remove("android.support.v4.media.description.MEDIA_URI");
        r06.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        goto L82
    L79:
        if (r06.size() != 2) goto L81;
        r11 = null;
        goto L83
    L74:
        r2 = null;
        goto L75
    L128:
        return null;
    L90:
        C0635Oq r07 = new C0635Oq(r14);
        r07.f2032a = ((Integer) r14.readValue(C0635Oq.class.getClassLoader())).intValue();
        return r07;
    L92:
        C2154ko r08 = new C2154ko();
        r08.f7531a = r14.readInt();
        r08.f7532b = r14.readInt();
        if (r14.readInt() == 1) goto L96;
        r1 = false;
    L96:
        r08.f7533c = r1;
        return r08;
    L102:
        C0068Bi r09 = new C0068Bi();
        r09.f166e = null;
        r09.f167f = new ArrayList();
        r09.f168g = new ArrayList();
        r09.f162a = r14.createStringArrayList();
        r09.f163b = r14.createStringArrayList();
        r09.f164c = (C1527i5[]) r14.createTypedArray(C1527i5.CREATOR);
        r09.f165d = r14.readInt();
        r09.f166e = r14.readString();
        r09.f167f = r14.createStringArrayList();
        r09.f168g = r14.createTypedArrayList(C2084j5.CREATOR);
        r09.f169h = r14.createTypedArrayList(C2676wi.CREATOR);
        return r09;
    L104:
        C2676wi r010 = new C2676wi();
        r010.f9236a = r14.readString();
        r010.f9237b = r14.readInt();
        return r010;
    L114:
        C1307d4 r011 = new C1307d4(r14);
        if (r14.readByte() != 0) goto L118;
        r1 = false;
    L118:
        r011.f4757a = r1;
        return r011;
    L120:
        int r17 = r14.readInt();
        if (r14.readInt() == 0) goto L125;
        r3 = (Intent) Intent.CREATOR.createFromParcel(r14);
    L125:
        return new C0689Q0(r3, r17);
    L5:
        return new C0944Vz(r14);
    L46:
        return new RatingCompat(r14.readInt(), r14.readFloat());
    L48:
        return new PlaybackStateCompat(r14);
    L52:
        return new ParcelImpl(r14);
    L56:
        return C1469gs.m2820a(r14.readInt(), r14.readInt());
    L60:
        return new MediaSessionCompat$QueueItem(r14);
    L62:
        return new MediaMetadataCompat(r14);
    L89:
        return new MediaBrowserCompat$MediaItem(r14);
    L99:
        return new C0372Il((IntentSender) r14.readParcelable(IntentSender.class.getClassLoader()), (Intent) r14.readParcelable(Intent.class.getClassLoader()), r14.readInt(), r14.readInt());
    L101:
        return new C0283Gi(r14);
    L107:
        return new C0019Ac(r14.readLong());
    L109:
        return new C0136D6((C1469gs) r14.readParcelable(C1469gs.class.getClassLoader()), (C1469gs) r14.readParcelable(C1469gs.class.getClassLoader()), (C0019Ac) r14.readParcelable(C0019Ac.class.getClassLoader()), (C1469gs) r14.readParcelable(C1469gs.class.getClassLoader()), r14.readInt());
    L111:
        return new C2084j5(r14);
    L113:
        return new C1527i5(r14);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch(this.f2084a) {
            case 0: goto L57;
            case 1: goto L55;
            case 2: goto L53;
            case 3: goto L51;
            case 4: goto L49;
            case 5: goto L47;
            case 6: goto L45;
            case 7: goto L43;
            case 8: goto L41;
            case 9: goto L39;
            case 10: goto L37;
            case 11: goto L35;
            case 12: goto L33;
            case 13: goto L31;
            case 14: goto L29;
            case 15: goto L27;
            case 16: goto L25;
            case 17: goto L23;
            case 18: goto L21;
            case 19: goto L19;
            case 20: goto L17;
            case 21: goto L15;
            case 22: goto L13;
            case 23: goto L11;
            case 24: goto L9;
            case 25: goto L7;
            default: goto L5;
        };
    L5:
        return new C0944Vz[r2];
    L7:
        return new C0857Ty[r2];
    L9:
        return new C0814Sy[r2];
    L11:
        return new C0426Jw[r2];
    L13:
        return new RatingCompat[r2];
    L15:
        return new PlaybackStateCompat[r2];
    L17:
        return new ParcelableVolumeInfo[r2];
    L19:
        return new ParcelImpl[r2];
    L21:
        return new C0250Fs[r2];
    L23:
        return new C1469gs[r2];
    L25:
        return new MediaSessionCompat$Token[r2];
    L27:
        return new MediaSessionCompat$QueueItem[r2];
    L29:
        return new MediaMetadataCompat[r2];
    L31:
        return new MediaDescriptionCompat[r2];
    L33:
        return new MediaBrowserCompat$MediaItem[r2];
    L35:
        return new C0635Oq[r2];
    L37:
        return new C2154ko[r2];
    L39:
        return new C0372Il[r2];
    L41:
        return new C0283Gi[r2];
    L43:
        return new C0068Bi[r2];
    L45:
        return new C2676wi[r2];
    L47:
        return new C0019Ac[r2];
    L49:
        return new C0136D6[r2];
    L51:
        return new C2084j5[r2];
    L53:
        return new C1527i5[r2];
    L55:
        return new C1307d4[r2];
    L57:
        return new C0689Q0[r2];
    }
}
