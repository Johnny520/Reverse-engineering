package Yue;

import Yue.InterfaceC7144;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4152 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f717 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f8483 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f8484 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f8485 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f8486 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f8487 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f8488 = 1;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final InterfaceC4157 f718;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ */
    @InterfaceC7113(31)
    public static final class C0342 {
        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Pair<ContentInfo, ContentInfo> m1112(@InterfaceC6391 ContentInfo contentInfo, @InterfaceC6391 final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() != 1) {
                Objects.requireNonNull(predicate);
                Pair<ClipData, ClipData> pairM12022 = C4152.m12022(clip, new InterfaceC6749() { // from class: Yue.ۥ۟ۧۡۢ
                    @Override // Yue.InterfaceC6749
                    public final boolean test(Object obj) {
                        return predicate.test((ClipData.Item) obj);
                    }
                });
                return pairM12022.first == null ? Pair.create(null, contentInfo) : pairM12022.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairM12022.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairM12022.second).build());
            }
            boolean zTest = predicate.test(clip.getItemAt(0));
            ContentInfo contentInfo2 = zTest ? contentInfo : null;
            if (zTest) {
                contentInfo = null;
            }
            return Pair.create(contentInfo2, contentInfo);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC4154 {
        @InterfaceC6391
        C4152 build();

        /* JADX INFO: renamed from: ۥ */
        void mo1115(int i);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo1116(@InterfaceC6490 Bundle bundle);

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo12037(@InterfaceC6490 Uri uri);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo12038(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        void mo12039(@InterfaceC6391 ClipData clipData);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static final class C4156 implements InterfaceC4157 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final ContentInfo f723;

        public C4156(@InterfaceC6391 ContentInfo contentInfo) {
            this.f723 = C4150.m1109(C6740.m21415(contentInfo));
        }

        @Override // Yue.C4152.InterfaceC4157
        public int getSource() {
            return this.f723.getSource();
        }

        @InterfaceC6391
        public String toString() {
            return "ContentInfoCompat{" + this.f723 + "}";
        }

        @Override // Yue.C4152.InterfaceC4157
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public Uri mo1117() {
            return this.f723.getLinkUri();
        }

        @Override // Yue.C4152.InterfaceC4157
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public ClipData mo1118() {
            return this.f723.getClip();
        }

        @Override // Yue.C4152.InterfaceC4157
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int mo12040() {
            return this.f723.getFlags();
        }

        @Override // Yue.C4152.InterfaceC4157
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public ContentInfo mo12041() {
            return this.f723;
        }

        @Override // Yue.C4152.InterfaceC4157
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Bundle mo12042() {
            return this.f723.getExtras();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public interface InterfaceC4157 {
        int getSource();

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        Uri mo1117();

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        ClipData mo1118();

        /* JADX INFO: renamed from: ۥ۟۟ */
        int mo12040();

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        ContentInfo mo12041();

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        Bundle mo12042();
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C4158 implements InterfaceC4157 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final ClipData f724;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f725;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f8492;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public final Uri f8493;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public final Bundle f8494;

        public C4158(C4155 c4155) {
            this.f724 = (ClipData) C6740.m21415(c4155.f721);
            this.f725 = C6740.m21410(c4155.f722, 0, 5, "source");
            this.f8492 = C6740.m21414(c4155.f8489, 1);
            this.f8493 = c4155.f8490;
            this.f8494 = c4155.f8491;
        }

        @Override // Yue.C4152.InterfaceC4157
        public int getSource() {
            return this.f725;
        }

        @InterfaceC6391
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f724.getDescription());
            sb.append(", source=");
            sb.append(C4152.m12024(this.f725));
            sb.append(", flags=");
            sb.append(C4152.m1111(this.f8492));
            if (this.f8493 == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f8493.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f8494 != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }

        @Override // Yue.C4152.InterfaceC4157
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public Uri mo1117() {
            return this.f8493;
        }

        @Override // Yue.C4152.InterfaceC4157
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public ClipData mo1118() {
            return this.f724;
        }

        @Override // Yue.C4152.InterfaceC4157
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo12040() {
            return this.f8492;
        }

        @Override // Yue.C4152.InterfaceC4157
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public ContentInfo mo12041() {
            return null;
        }

        @Override // Yue.C4152.InterfaceC4157
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Bundle mo12042() {
            return this.f8494;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4159 {
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4160 {
    }

    public C4152(@InterfaceC6391 InterfaceC4157 interfaceC4157) {
        this.f718 = interfaceC4157;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static ClipData m1110(@InterfaceC6391 ClipDescription clipDescription, @InterfaceC6391 List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟ */
    public static String m1111(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Pair<ClipData, ClipData> m12022(@InterfaceC6391 ClipData clipData, @InterfaceC6391 InterfaceC6749<ClipData.Item> interfaceC6749) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (interfaceC6749.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create(null, clipData) : arrayList2 == null ? Pair.create(clipData, null) : Pair.create(m1110(clipData.getDescription(), arrayList), m1110(clipData.getDescription(), arrayList2));
    }

    @InterfaceC6391
    @InterfaceC7113(31)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Pair<ContentInfo, ContentInfo> m12023(@InterfaceC6391 ContentInfo contentInfo, @InterfaceC6391 Predicate<ClipData.Item> predicate) {
        return C0342.m1112(contentInfo, predicate);
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static String m12024(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @InterfaceC6391
    @InterfaceC7113(31)
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static C4152 m12025(@InterfaceC6391 ContentInfo contentInfo) {
        return new C4152(new C4156(contentInfo));
    }

    @InterfaceC6391
    public String toString() {
        return this.f718.toString();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ClipData m12026() {
        return this.f718.mo1118();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Bundle m12027() {
        return this.f718.mo12042();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m12028() {
        return this.f718.mo12040();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Uri m12029() {
        return this.f718.mo1117();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m12030() {
        return this.f718.getSource();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Pair<C4152, C4152> m12031(@InterfaceC6391 InterfaceC6749<ClipData.Item> interfaceC6749) {
        ClipData clipDataMo1118 = this.f718.mo1118();
        if (clipDataMo1118.getItemCount() == 1) {
            boolean zTest = interfaceC6749.test(clipDataMo1118.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        Pair<ClipData, ClipData> pairM12022 = m12022(clipDataMo1118, interfaceC6749);
        return pairM12022.first == null ? Pair.create(null, this) : pairM12022.second == null ? Pair.create(this, null) : Pair.create(new C0343(this).m1114((ClipData) pairM12022.first).m1113(), new C0343(this).m1114((ClipData) pairM12022.second).m1113());
    }

    @InterfaceC6391
    @InterfaceC7113(31)
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public ContentInfo m12032() {
        ContentInfo contentInfoMo12041 = this.f718.mo12041();
        Objects.requireNonNull(contentInfoMo12041);
        return C4150.m1109(contentInfoMo12041);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static final class C4153 implements InterfaceC4154 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final ContentInfo.Builder f720;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4153(@InterfaceC6391 ClipData clipData, int i) {
            this.f720 = C4167.m1125(clipData, i);
        }

        @Override // Yue.C4152.InterfaceC4154
        @InterfaceC6391
        public C4152 build() {
            return new C4152(new C4156(this.f720.build()));
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ */
        public void mo1115(int i) {
            this.f720.setSource(i);
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1116(@InterfaceC6490 Bundle bundle) {
            this.f720.setExtras(bundle);
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo12037(@InterfaceC6490 Uri uri) {
            this.f720.setLinkUri(uri);
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo12038(int i) {
            this.f720.setFlags(i);
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo12039(@InterfaceC6391 ClipData clipData) {
            this.f720.setClip(clipData);
        }

        public C4153(@InterfaceC6391 C4152 c4152) {
            C4169.m1127();
            this.f720 = C4168.m1126(c4152.m12032());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4155 implements InterfaceC4154 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public ClipData f721;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f722;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f8489;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public Uri f8490;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public Bundle f8491;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4155(@InterfaceC6391 ClipData clipData, int i) {
            this.f721 = clipData;
            this.f722 = i;
        }

        @Override // Yue.C4152.InterfaceC4154
        @InterfaceC6391
        public C4152 build() {
            return new C4152(new C4158(this));
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ */
        public void mo1115(int i) {
            this.f722 = i;
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1116(@InterfaceC6490 Bundle bundle) {
            this.f8491 = bundle;
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo12037(@InterfaceC6490 Uri uri) {
            this.f8490 = uri;
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo12038(int i) {
            this.f8489 = i;
        }

        @Override // Yue.C4152.InterfaceC4154
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo12039(@InterfaceC6391 ClipData clipData) {
            this.f721 = clipData;
        }

        public C4155(@InterfaceC6391 C4152 c4152) {
            this.f721 = c4152.m12026();
            this.f722 = c4152.m12030();
            this.f8489 = c4152.m12028();
            this.f8490 = c4152.m12029();
            this.f8491 = c4152.m12027();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟ */
    public static final class C0343 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final InterfaceC4154 f719;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0343(@InterfaceC6391 C4152 c4152) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f719 = new C4153(c4152);
            } else {
                this.f719 = new C4155(c4152);
            }
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C4152 m1113() {
            return this.f719.build();
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C0343 m1114(@InterfaceC6391 ClipData clipData) {
            this.f719.mo12039(clipData);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C0343 m12033(@InterfaceC6490 Bundle bundle) {
            this.f719.mo1116(bundle);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C0343 m12034(int i) {
            this.f719.mo12038(i);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C0343 m12035(@InterfaceC6490 Uri uri) {
            this.f719.mo12037(uri);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C0343 m12036(int i) {
            this.f719.mo1115(i);
            return this;
        }

        public C0343(@InterfaceC6391 ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f719 = new C4153(clipData, i);
            } else {
                this.f719 = new C4155(clipData, i);
            }
        }
    }
}
