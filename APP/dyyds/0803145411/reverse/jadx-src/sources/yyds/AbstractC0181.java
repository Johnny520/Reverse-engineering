package yyds;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.NativeUtil;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.ugc.aweme.ImageUrlStruct;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛱᛷᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0181 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0644 f1022;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static volatile Handler f1025;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static C0644 f1026;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final char[] f1023 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final char[] f1024 = new char[64];

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final char[] f1027 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Object obj = null;
        f1022 = new C0644(obj, obj, obj, 25);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static void m740(String str, String str2, Bitmap bitmap, int i, int i2) {
        int i3 = i * i2;
        int iM749 = m749(bitmap.getConfig()) * i3;
        int iM7492 = m749(bitmap.getConfig()) * bitmap.getWidth() * bitmap.getHeight();
        int i4 = iM7492 - iM749;
        int iM756 = m756(bitmap) - iM7492;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        int height = bitmap.getHeight() * bitmap.getWidth();
        String str3 = height > i3 ? "upscaled" : height < i3 ? "downscaled" : "no scaling";
        String str4 = "";
        String strM4014 = str2 == null ? "" : AbstractC2104.m4014(" (Strategy: ", str2, ")");
        if (iM756 > 0) {
            str4 = " [Pooled: +" + iM756 + " bytes buffer overhead]";
        }
        Log.d("GlideMemoryTracking", str + " [Device: " + Build.DEVICE + "]: Decoded bitmap [ID: " + iIdentityHashCode + "] " + str3 + strM4014 + " from [" + i + "x" + i2 + "] (" + iM749 + " bytes) to [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + iM7492 + " bytes). True cost: " + i4 + " bytes" + str4);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static ArrayList m741(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static int m742(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        C0188.m804(AbstractC0897.m1987(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Handler m743() {
        if (f1025 == null) {
            synchronized (AbstractC0181.class) {
                try {
                    if (f1025 == null) {
                        f1025 = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f1025;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m744() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        C0188.m798("You must call this method on the main thread");
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static long m745(long j) {
        short s = (short) (j & 65535);
        short s2 = (short) ((j >>> 16) & 65535);
        short s3 = (short) (s + s2);
        short s4 = (short) (s2 ^ s);
        return ((((long) ((short) ((s4 >>> 22) | (s4 << 10)))) | (((long) ((short) (((short) ((s3 >>> 23) | (s3 << 9))) + s))) << 16)) << 16) | ((long) ((short) (((short) (((short) ((s << 13) | (s >>> 19))) ^ s4)) ^ (s4 << 5))));
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static long m746(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C0188.m798("Cannot round NaN value.");
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v7, types: [yyds.ᛲᛱᛶᛸ] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m747(Context context, Aweme aweme, C2585 c2585, View view) {
        String str;
        LinearLayout linearLayout;
        String strM4687;
        UrlModel urlModel;
        String strM4341;
        if (AbstractC1426.m2900(context, view)) {
            C1509.f7142.getClass();
            Set set = (Set) C1509.f7206.m1579(C1509.f7179[203]);
            boolean zContains = set.contains(AbstractC2328.m4341(-208563184763758L));
            LinearLayout linearLayout2 = (LinearLayout) c2585.f12737;
            Button button = c2585.f12762;
            View view2 = c2585.f12740;
            LinearLayout linearLayout3 = c2585.f12736;
            LinearLayout linearLayout4 = c2585.f12735;
            View view3 = c2585.f12754;
            LinearLayout linearLayout5 = c2585.f12739;
            View view4 = c2585.f12761;
            LinearLayout linearLayout6 = (LinearLayout) c2585.f12755;
            View view5 = c2585.f12756;
            AbstractC2328.m4341(-208601839469422L);
            View view6 = c2585.f12751;
            AbstractC2328.m4341(-208657674044270L);
            m754(zContains, linearLayout2, view6);
            boolean zContains2 = set.contains(AbstractC2328.m4341(-208726393521006L));
            LinearLayout linearLayout7 = (LinearLayout) c2585.f12753;
            AbstractC2328.m4341(-208782228095854L);
            m754(zContains2, linearLayout7);
            boolean zContains3 = set.contains(AbstractC2328.m4341(-208850947572590L));
            AbstractC2328.m4341(-208889602278254L);
            AbstractC2328.m4341(-208945436853102L);
            View view7 = c2585.f12750;
            AbstractC2328.m4341(-208984091558766L);
            m754(zContains3, view5, linearLayout6, view7);
            boolean zContains4 = set.contains(AbstractC2328.m4341(-209052811035502L));
            LinearLayout linearLayout8 = (LinearLayout) c2585.f12733;
            AbstractC2328.m4341(-209100055675758L);
            View view8 = c2585.f12763;
            AbstractC2328.m4341(-209164480185198L);
            m754(zContains4, linearLayout8, view8);
            boolean zContains5 = set.contains(AbstractC2328.m4341(-209241789596526L));
            LinearLayout linearLayout9 = c2585.f12734;
            AbstractC2328.m4341(-209267559400302L);
            m754(zContains5, linearLayout9);
            AbstractC2328.m4341(-209327688942446L);
            AbstractC2328.m4341(-209370638615406L);
            m754(false, view4, linearLayout5);
            AbstractC2328.m4341(-209404998353774L);
            AbstractC2328.m4341(-209456537961326L);
            m754(false, view3, linearLayout4);
            boolean zContains6 = set.contains(AbstractC2328.m4341(-209499487634286L));
            AbstractC2328.m4341(-209525257438062L);
            AbstractC2328.m4341(-209585386980206L);
            m754(zContains6, linearLayout3, view2);
            if (set.contains(AbstractC2328.m4341(-209641221555054L))) {
                C2701 c2701 = C2701.f13261;
                String strM43412 = AbstractC2328.m4341(-209688466195310L);
                c2701.getClass();
                Object objM4795 = C2701.m4795(aweme, strM43412);
                TextView textView = c2585.f12746;
                Map map = C2609.f12814;
                textView.setText(C2609.m4690(C2701.m4795(objM4795, AbstractC2328.m4341(-209735710835566L))));
                c2585.f12742.setText(C2609.m4690(C2701.m4795(objM4795, AbstractC2328.m4341(-209782955475822L))));
                c2585.f12760.setText(C2609.m4690(C2701.m4795(objM4795, AbstractC2328.m4341(-209843085017966L))));
                ((TextView) c2585.f12759).setText(C2609.m4690(C2701.m4795(objM4795, AbstractC2328.m4341(-209903214560110L))));
            }
            Map map2 = C2609.f12814;
            String strM4682 = C2609.m4682(aweme);
            String strM4692 = C2609.m4692(aweme);
            ?? r15 = 0;
            r15 = 0;
            if (set.contains(AbstractC2328.m4341(-209954754167662L))) {
                str = strM4692;
                c2585.f12741.setText(C2609.m4686(aweme, null));
            } else {
                str = strM4692;
            }
            if (set.contains(AbstractC2328.m4341(-210010588742510L))) {
                linearLayout = linearLayout3;
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0219(aweme, c2585, r15, 14), 3);
            } else {
                linearLayout = linearLayout3;
            }
            if (!set.contains(AbstractC2328.m4341(-210049243448174L)) || str == null || AbstractC0473.m1313(str)) {
                AbstractC2328.m4341(-210075013251950L);
                AbstractC2328.m4341(-210135142794094L);
                m754(false, linearLayout, view2);
            } else {
                c2585.f12758.setOnClickListener(new ViewOnClickListenerC1374(context, 21, aweme));
            }
            if (set.contains(AbstractC2328.m4341(-210190977368942L))) {
                button.setOnClickListener(new ViewOnClickListenerC1192(strM4682, context, aweme, 25));
                button.setOnLongClickListener(new ViewOnLongClickListenerC0358(6, aweme));
            }
            AbstractC2328.m4341(-537162542646126L);
            String strM43413 = aweme.desc;
            if (strM43413 == null) {
                strM43413 = AbstractC2328.m4341(-537188312449902L);
            }
            if (!AbstractC0473.m1313(strM43413) && set.contains(AbstractC2328.m4341(-210216747172718L))) {
                TextView textView2 = c2585.f12757;
                textView2.setVisibility(0);
                textView2.setText(strM43413);
            }
            if (!AbstractC0473.m1313(strM43413) && set.contains(AbstractC2328.m4341(-210268286780270L)) && set.contains(AbstractC2328.m4341(-210319826387822L))) {
                Button button2 = c2585.f12748;
                AbstractC2328.m4341(-210392840831854L);
                button2.setVisibility(0);
                button2.setOnClickListener(new ViewOnClickListenerC2488(context, strM43413, 2));
            }
            if (set.contains(AbstractC2328.m4341(-210457265341294L))) {
                Integer num = aweme.duration;
                if (num != null) {
                    C1221.f5600.getClass();
                    strM4341 = C1221.m2479(num);
                } else {
                    strM4341 = null;
                }
                if (strM4341 == null) {
                    strM4341 = AbstractC2328.m4341(-210495920046958L);
                }
                if (AbstractC0473.m1313(strM4341)) {
                    AbstractC2328.m4341(-210500215014254L);
                    AbstractC2328.m4341(-210538869719918L);
                    m754(false, linearLayout6, view5);
                } else {
                    ((TextView) c2585.f12752).setText(strM4341);
                }
            }
            Video video = aweme.video;
            if (video != null && (urlModel = video.cover) != null) {
                r15 = urlModel.urlList;
            }
            boolean zContains7 = set.contains(AbstractC2328.m4341(-210594704294766L));
            C2340 c2340 = C2340.f11504;
            if (zContains7 && r15 != 0 && !r15.isEmpty()) {
                AbstractC2328.m4341(-210620474098542L);
                AbstractC2328.m4341(-210663423771502L);
                m754(true, view4, linearLayout5);
                C1327 c1327 = C1327.f6093;
                String strM2621 = C1327.m2621(r15);
                ImageView imageView = (ImageView) c2585.f12744;
                Context context2 = imageView.getContext();
                if (context2 == null || strM2621 == null) {
                    C2336.f11496.m4354(AbstractC2328.m4341(-581469425271662L) + context2 + AbstractC2328.m4341(-581516669911918L) + strM2621 + AbstractC2328.m4341(-581551029650286L) + imageView);
                } else {
                    C0472 c0472 = (C0472) ComponentCallbacks2C0040.m250(context2).m2500(context2).m4277(strM2621).m1786(c2340);
                    c0472.getClass();
                    ((C0472) c0472.m1789(C1268.f5845, new C0670())).m1283(imageView);
                }
                c2585.f12749.setOnClickListener(new ViewOnClickListenerC2488(context, strM2621, 3));
            }
            List list = aweme.images;
            C2701 c27012 = C2701.f13261;
            String strM43414 = AbstractC2328.m4341(-210697783509870L);
            c27012.getClass();
            Integer num2 = (Integer) C2701.m4794(aweme, strM43414);
            if (!set.contains(AbstractC2328.m4341(-210753618084718L)) || num2 == null || num2.intValue() < 0 || list == null || list.isEmpty()) {
                return;
            }
            AbstractC2328.m4341(-210813747626862L);
            AbstractC2328.m4341(-210865287234414L);
            m754(true, view3, linearLayout4);
            int size = list.size();
            TextView textView3 = c2585.f12738;
            if (size > 1) {
                textView3.setText("第" + (num2.intValue() + 1) + AbstractC2328.m4341(-210908236907374L));
            } else {
                textView3.setText(AbstractC2328.m4341(-210925416776558L));
            }
            ImageUrlStruct imageUrlStruct = (ImageUrlStruct) list.get(num2.intValue());
            List list2 = imageUrlStruct.urlList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                String str2 = (String) obj;
                if (AbstractC0473.m1301(str2, AbstractC2328.m4341(-210946891613038L), false) || AbstractC0473.m1301(str2, AbstractC2328.m4341(-210972661416814L), false) || AbstractC0473.m1301(str2, AbstractC2328.m4341(-210994136253294L), false)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                list2 = arrayList;
            }
            if (list2.isEmpty()) {
                Map map3 = C2609.f12814;
                strM4687 = C2609.m4687(imageUrlStruct.video);
            } else {
                strM4687 = (String) AbstractC1595.m3280(list2);
            }
            C0472 c04722 = (C0472) ComponentCallbacks2C0040.m250(context).m2500(context).m4277(strM4687).m1786(c2340);
            c04722.getClass();
            ((C0472) c04722.m1789(C1268.f5845, new C0670())).m1283(c2585.f12747);
            c2585.f12745.setOnClickListener(new ViewOnClickListenerC1192(imageUrlStruct, context, strM4687, 26));
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static int m748(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        C0188.m798("Cannot round NaN value.");
        return 0;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static int m749(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AbstractC2432.f11991[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static int m750(int i, Object obj) {
        return m752(obj == null ? 0 : obj.hashCode(), i);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static boolean m751(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static int m752(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static void m753(Context context, Aweme aweme) {
        AbstractC2328.m4341(-208404270973806L);
        AbstractC2328.m4341(-208438630712174L);
        final Activity topActivity = ActivityStack.getTopActivity();
        final int i = 1;
        AbstractC1426.m2898(topActivity, true);
        final int i2 = 0;
        View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.video_info_popup_layout, (ViewGroup) new RelativeLayout(context), false);
        int i3 = R.id.btn_copy_music;
        Button button = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_copy_music);
        if (button != null) {
            i3 = R.id.btn_copy_video;
            Button button2 = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_copy_video);
            if (button2 != null) {
                i3 = R.id.btn_video_cover;
                Button button3 = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_video_cover);
                if (button3 != null) {
                    i3 = R.id.copy_desc_button;
                    Button button4 = (Button) AbstractC1741.m3479(viewInflate, R.id.copy_desc_button);
                    if (button4 != null) {
                        i3 = R.id.cover_ll;
                        LinearLayout linearLayout = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.cover_ll);
                        if (linearLayout != null) {
                            i3 = R.id.cover_view;
                            View viewM3479 = AbstractC1741.m3479(viewInflate, R.id.cover_view);
                            if (viewM3479 != null) {
                                i3 = R.id.current_btn;
                                Button button5 = (Button) AbstractC1741.m3479(viewInflate, R.id.current_btn);
                                if (button5 != null) {
                                    i3 = R.id.current_iv;
                                    ImageView imageView = (ImageView) AbstractC1741.m3479(viewInflate, R.id.current_iv);
                                    if (imageView != null) {
                                        i3 = R.id.current_ll;
                                        LinearLayout linearLayout2 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.current_ll);
                                        if (linearLayout2 != null) {
                                            i3 = R.id.current_tv;
                                            TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.current_tv);
                                            if (textView != null) {
                                                i3 = R.id.current_view;
                                                View viewM34792 = AbstractC1741.m3479(viewInflate, R.id.current_view);
                                                if (viewM34792 != null) {
                                                    i3 = R.id.divider_duration;
                                                    View viewM34793 = AbstractC1741.m3479(viewInflate, R.id.divider_duration);
                                                    if (viewM34793 != null) {
                                                        i3 = R.id.divider_location;
                                                        View viewM34794 = AbstractC1741.m3479(viewInflate, R.id.divider_location);
                                                        if (viewM34794 != null) {
                                                            i3 = R.id.divider_music;
                                                            View viewM34795 = AbstractC1741.m3479(viewInflate, R.id.divider_music);
                                                            if (viewM34795 != null) {
                                                                i3 = R.id.divider_statistics;
                                                                View viewM34796 = AbstractC1741.m3479(viewInflate, R.id.divider_statistics);
                                                                if (viewM34796 != null) {
                                                                    i3 = R.id.img_cover_preview;
                                                                    ImageView imageView2 = (ImageView) AbstractC1741.m3479(viewInflate, R.id.img_cover_preview);
                                                                    if (imageView2 != null) {
                                                                        i3 = R.id.item_copy_music;
                                                                        LinearLayout linearLayout3 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.item_copy_music);
                                                                        if (linearLayout3 != null) {
                                                                            i3 = R.id.item_copy_video;
                                                                            LinearLayout linearLayout4 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.item_copy_video);
                                                                            if (linearLayout4 != null) {
                                                                                i3 = R.id.item_location;
                                                                                LinearLayout linearLayout5 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.item_location);
                                                                                if (linearLayout5 != null) {
                                                                                    i3 = R.id.item_publish_time;
                                                                                    LinearLayout linearLayout6 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.item_publish_time);
                                                                                    if (linearLayout6 != null) {
                                                                                        i3 = R.id.item_statistics;
                                                                                        LinearLayout linearLayout7 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.item_statistics);
                                                                                        if (linearLayout7 != null) {
                                                                                            i3 = R.id.item_time;
                                                                                            LinearLayout linearLayout8 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.item_time);
                                                                                            if (linearLayout8 != null) {
                                                                                                i3 = R.id.item_time_view;
                                                                                                View viewM34797 = AbstractC1741.m3479(viewInflate, R.id.item_time_view);
                                                                                                if (viewM34797 != null) {
                                                                                                    i3 = R.id.label_copy_music;
                                                                                                    if (((TextView) AbstractC1741.m3479(viewInflate, R.id.label_copy_music)) != null) {
                                                                                                        i3 = R.id.label_copy_video;
                                                                                                        if (((TextView) AbstractC1741.m3479(viewInflate, R.id.label_copy_video)) != null) {
                                                                                                            i3 = R.id.label_location;
                                                                                                            if (((TextView) AbstractC1741.m3479(viewInflate, R.id.label_location)) != null) {
                                                                                                                i3 = R.id.label_publish_time;
                                                                                                                if (((TextView) AbstractC1741.m3479(viewInflate, R.id.label_publish_time)) != null) {
                                                                                                                    i3 = R.id.label_time;
                                                                                                                    if (((TextView) AbstractC1741.m3479(viewInflate, R.id.label_time)) != null) {
                                                                                                                        LinearLayout linearLayout9 = (LinearLayout) viewInflate;
                                                                                                                        i3 = R.id.text_comment_count;
                                                                                                                        TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.text_comment_count);
                                                                                                                        if (textView2 != null) {
                                                                                                                            i3 = R.id.text_favorite_count;
                                                                                                                            TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.text_favorite_count);
                                                                                                                            if (textView3 != null) {
                                                                                                                                i3 = R.id.text_like_count;
                                                                                                                                TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.text_like_count);
                                                                                                                                if (textView4 != null) {
                                                                                                                                    i3 = R.id.text_location;
                                                                                                                                    TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.text_location);
                                                                                                                                    if (textView5 != null) {
                                                                                                                                        i3 = R.id.text_message;
                                                                                                                                        TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.text_message);
                                                                                                                                        if (textView6 != null) {
                                                                                                                                            i3 = R.id.text_publish_time;
                                                                                                                                            TextView textView7 = (TextView) AbstractC1741.m3479(viewInflate, R.id.text_publish_time);
                                                                                                                                            if (textView7 != null) {
                                                                                                                                                i3 = R.id.text_share_count;
                                                                                                                                                TextView textView8 = (TextView) AbstractC1741.m3479(viewInflate, R.id.text_share_count);
                                                                                                                                                if (textView8 != null) {
                                                                                                                                                    i3 = R.id.text_time;
                                                                                                                                                    TextView textView9 = (TextView) AbstractC1741.m3479(viewInflate, R.id.text_time);
                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                        C2585 c2585 = new C2585(linearLayout9, button, button2, button3, button4, linearLayout, viewM3479, button5, imageView, linearLayout2, textView, viewM34792, viewM34793, viewM34794, viewM34795, viewM34796, imageView2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, viewM34797, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                                                                                        AbstractC2328.m4341(-208464400515950L);
                                                                                                                                                        C2701.f13261.getClass();
                                                                                                                                                        C2701.m4793(linearLayout9);
                                                                                                                                                        C1509.f7142.getClass();
                                                                                                                                                        if (((Number) C1509.f7158.m1579(C1509.f7179[204])).intValue() == 0) {
                                                                                                                                                            C1188 c1188M2386 = C1188.m2386(context);
                                                                                                                                                            c1188M2386.f5451 = AbstractC2328.m4341(-208520235090798L);
                                                                                                                                                            c1188M2386.mo956();
                                                                                                                                                            c1188M2386.f5438 = new C2698(context, aweme, c2585, linearLayout9, 0);
                                                                                                                                                            c1188M2386.mo956();
                                                                                                                                                            c1188M2386.f5452 = 1;
                                                                                                                                                            c1188M2386.mo956();
                                                                                                                                                            c1188M2386.f405 = new InterfaceC0251() { // from class: yyds.ᲀᛲᲈᲀ
                                                                                                                                                                static {
                                                                                                                                                                    NativeUtil.classesInit0(93);
                                                                                                                                                                }

                                                                                                                                                                @Override // yyds.InterfaceC0251
                                                                                                                                                                /* JADX INFO: renamed from: ᛲᲈᲁ */
                                                                                                                                                                public final native void mo901(AbstractC0041 abstractC0041);
                                                                                                                                                            };
                                                                                                                                                            c1188M2386.m2389(context);
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        C0763 c0763M1709 = C0763.m1709(context);
                                                                                                                                                        c0763M1709.f3518 = AbstractC2328.m4341(-208541709927278L);
                                                                                                                                                        c0763M1709.mo1719();
                                                                                                                                                        c0763M1709.f3522 = new C2698(context, aweme, c2585, linearLayout9, 1);
                                                                                                                                                        c0763M1709.mo1719();
                                                                                                                                                        c0763M1709.f3533 = 1;
                                                                                                                                                        c0763M1709.mo1719();
                                                                                                                                                        c0763M1709.f405 = new InterfaceC0251() { // from class: yyds.ᲀᛲᲈᲀ
                                                                                                                                                            static {
                                                                                                                                                                NativeUtil.classesInit0(93);
                                                                                                                                                            }

                                                                                                                                                            @Override // yyds.InterfaceC0251
                                                                                                                                                            /* JADX INFO: renamed from: ᛲᲈᲁ */
                                                                                                                                                            public final native void mo901(AbstractC0041 abstractC0041);
                                                                                                                                                        };
                                                                                                                                                        c0763M1709.m1715(context);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C0188.m789(AbstractC2328.m4341(-1747888053584750L).concat(viewInflate.getResources().getResourceName(i3)));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final void m754(boolean z, View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static AbstractC0517 m755(C1942 c1942) {
        boolean z;
        try {
            try {
                c1942.m3744();
                z = false;
                try {
                    C0369.f1893.getClass();
                    return C0369.m1070(c1942);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return C0232.f1286;
                    }
                    throw new C1600(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (C0838 e3) {
            throw new C1600(e3);
        } catch (IOException e4) {
            throw new C1600(e4);
        } catch (NumberFormatException e5) {
            throw new C1600(e5);
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static int m756(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static boolean m757(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public abstract List mo662(String str, List list);
}
