// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.net.Uri;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import c.ʾˎ.CLS41;
import c.ˆﾞ.CLS48;
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.יⁱ.CLS257;
import c.ᴵˉ.CLS283;
import c.ᴵˉ.CLS594;
import c.ᴵˉ.CLS597;
import c.ﹶˆ.CLS341;
import c.ﹶˆ.CLS342;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS345;
import c.ﾞʿ.CLS367;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class CLS189 {
    public interface CLS188 {
    }

    public final ArrayList FLD774;
    public boolean FLD775;
    public boolean FLD776;
    public CLS367 FLD777;
    public boolean FLD778;
    public AlertDialog FLD779;
    public CLS367 FLD780;
    public CLS367 FLD781;
    public CLS594 FLD782;
    public CLS48 FLD783;
    public final WeakReference FLD784;
    public CLS597 FLD785;
    public final HashSet FLD786;

    public CLS189(Activity activity0) {
        this.FLD775 = false;
        this.FLD784 = new WeakReference(activity0);
        this.FLD774 = new ArrayList();
        this.FLD786 = new HashSet();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private boolean MTH2784(Activity activity0, AdapterView adapterView0, View view0, int v, long v1) [...]

    private void MTH2785(CLS367 ʾʻ0) {
        if(ʾʻ0.MTH5061()) {
            this.MTH2809(ʾʻ0);
            return;
        }
        CLS186.MTH2753(ʾʻ0);
    }

    private void MTH2786(CLS367 ʾʻ0) {
        CLS144.MTH2167(this.MTH2810(), ((CLS343)new CLS529(this, ʾʻ0)));
    }

    private void MTH2789() {
        this.MTH2812(this.FLD777);
    }

    // 此方法包含解密的字符串
    private void MTH2794(Activity activity0, CLS367 ʾʻ0, Object[] arr_object) {
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS283 ˉˎ0 = new CLS283(activity0, linearLayout0, menu0);
        ˉˎ0.MTH3648("select_all", ((CLS345)new CLS558(this))).MTH3648("inverse", ((CLS345)new CLS542(this)));
        if(this.FLD776) {
            ˉˎ0.MTH3648("share_all", ((CLS345)new CLS544(this))).MTH3648("share_selected", ((CLS345)new CLS553(this)));
        }
        if(this.FLD778) {
            ˉˎ0.MTH3648("delete_all", ((CLS345)new CLS564(this))).MTH3648("delete_selected", ((CLS345)new CLS484(this)));
        }
        ˉˎ0.MTH3650();
        this.FLD783 = new CLS48(activity0);
        CLS594 ʾᐧ0 = new CLS594(activity0);
        this.FLD782 = ʾᐧ0;
        ʾᐧ0.MTH3611();
        CLS597 ˉˆ0 = new CLS597(activity0);
        this.FLD785 = ˉˆ0;
        ˉˆ0.MTH3645(false);
        CLS144.MTH2191(linearLayout0, ((CLS341)this.FLD785), true);
        this.FLD782.MTH3610((AdapterView adapterView0, View view0, int v, long v1) -> // 此方法包含解密的字符串
        {
            CLS367 ʾʻ1;
            try {
                String s = ((ContentValues)this.FLD783.getItem(v)).getAsString("content");
                if(s.equals("|wx_prev_dir|")) {
                    CLS367 ʾʻ0 = this.FLD780;
                    if(ʾʻ0 != null) {
                        if(ʾʻ0.MTH5061()) {
                            ʾʻ1 = this.FLD780.MTH5051();
                            if(ʾʻ1 != null) {
                                this.FLD781 = this.FLD777;
                                this.FLD777 = ʾʻ1;
                                this.FLD780 = this.FLD777;
                                this.MTH2819();
                                return;
                            }
                        }
                        else {
                            CLS367 ʾʻ2 = this.FLD780.MTH5051();
                            if(ʾʻ2 != null) {
                                ʾʻ1 = ʾʻ2.MTH5051();
                                if(ʾʻ1 != null) {
                                    this.FLD781 = this.FLD777;
                                    this.FLD777 = ʾʻ1;
                                }
                            }
                        }
                    }
                    this.FLD780 = this.FLD777;
                }
                else {
                    CLS367 ʾʻ3 = CLS186.MTH2733(this.FLD777, s);
                    this.FLD780 = ʾʻ3;
                    this.FLD781 = this.FLD777;
                    if(ʾʻ3.MTH5061()) {
                        this.FLD777 = this.FLD780;
                    }
                }
                this.MTH2819();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        });
        this.FLD782.MTH3606((AdapterView adapterView0, View view0, int v, long v1) -> // 此方法包含解密的字符串
        {
            try {
                ContentValues contentValues0 = (ContentValues)this.FLD783.getItem(v);
                String s = contentValues0.getAsString("content");
                if(s.equals("|wx_prev_dir|")) {
                    return true;
                }
                CLS367 ʾʻ0 = CLS186.MTH2733(this.FLD777, s);
                CLS257 ﾞⁱ0 = new CLS257(activity0, ʾʻ0.MTH5055());
                if(this.MTH2802(contentValues0)) {
                    ﾞⁱ0.MTH3382("preview", ((CLS345)new CLS545(this, contentValues0)));
                }
                if(this.FLD776) {
                    ﾞⁱ0.MTH3382("share", ((CLS345)new CLS537(this, ʾʻ0)));
                }
                if(this.FLD778 && !ʾʻ0.MTH5061()) {
                    ﾞⁱ0.MTH3382("delete", ((CLS345)new CLS486(this, ʾʻ0)));
                }
                ﾞⁱ0.MTH3380();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
            return true;
        });
        this.FLD782.MTH3613(this.FLD783);
        CLS144.MTH2191(linearLayout0, ((CLS341)this.FLD782), true);
        this.FLD777 = ʾʻ0.MTH5061() ? ʾʻ0 : ʾʻ0.MTH5051();
        this.FLD780 = this.FLD777;
        this.MTH2819();
    }

    // 此方法包含解密的字符串
    private void MTH2797() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.FLD783.MTH910()) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(contentValues0.containsKey("uri_file")) {
                arrayList0.add(CLS186.MTH2736(contentValues0.getAsString("uri_file")));
            }
        }
        CLS186.MTH2727(arrayList0);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2799(CLS367 ʾʻ0) [...]

    // 检测为 Lambda 实现
    public static int MTH2800(CLS367 ʾʻ0, CLS367 ʾʻ1) [...]

    // 此方法包含解密的字符串
    public final boolean MTH2801(CLS367 ʾʻ0) {
        if(!this.FLD775 && !this.FLD786.contains("*")) {
            if(this.FLD786.isEmpty()) {
                return false;
            }
            if(!ʾʻ0.MTH5065()) {
                return false;
            }
            String s = ʾʻ0.MTH5055();
            int v = s.lastIndexOf(".");
            return v == -1 ? false : this.FLD786.contains(s.substring(v + 1));
        }
        return true;
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public final boolean MTH2802(ContentValues contentValues0) {
        return contentValues0.containsKey("img_uri") || contentValues0.containsKey("vid_uri") || contentValues0.containsKey("mp3_uri") || contentValues0.containsKey("gif_uri");
    }

    // 此方法包含解密的字符串
    private void MTH2803() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.FLD783.MTH910()) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(contentValues0.containsKey("uri_file")) {
                arrayList0.add(CLS186.MTH2736(contentValues0.getAsString("uri_file")));
            }
        }
        if(arrayList0.isEmpty()) {
            return;
        }
        CLS144.MTH2167(this.MTH2810(), ((CLS343)new CLS532(this, arrayList0)));
    }

    public void MTH2804() {
        this.FLD776 = true;
    }

    private void MTH2805() {
        this.MTH2809(this.FLD777);
    }

    private void MTH2806(ContentValues contentValues0) {
        this.MTH2817(contentValues0);
    }

    public void MTH2807() {
        this.FLD775 = true;
    }

    // 此方法包含解密的字符串
    private void MTH2808() {
        for(int v = 0; v < this.FLD783.getCount(); ++v) {
            ContentValues contentValues0 = (ContentValues)this.FLD783.getItem(v);
            if(contentValues0.containsKey("uri_file")) {
                CLS367 ʾʻ0 = CLS186.MTH2736(contentValues0.getAsString("uri_file"));
                if(ʾʻ0 != null && ʾʻ0.MTH5065()) {
                    this.FLD783.MTH904(contentValues0);
                }
            }
        }
        this.FLD783.notifyDataSetChanged();
    }

    public final void MTH2809(CLS367 ʾʻ0) {
        CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
        {
            if(CLS186.MTH2723(ʾʻ0)) {
                return;
            }
            File file0 = new File(this.MTH2810().getCacheDir(), CLS176.MTH2598(ʾʻ0.MTH5055(), "zip"));
            CLS219.MTH3064(ʾʻ0, file0);
            CLS176.MTH2588(file0);
            CLS176.MTH2582(file0);
        }));
    }

    public final Activity MTH2810() {
        return (Activity)this.FLD784.get();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2811(AdapterView adapterView0, View view0, int v, long v1) [...]

    public final void MTH2812(CLS367 ʾʻ0) {
        public class CLS530 implements CLS343 {
            public final CLS367 FLD769;
            public final CLS189 FLD770;

            public CLS530(CLS367 ʾʻ0) {
                this.FLD769 = ʾʻ0;
                super();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                CLS186.MTH2730(this.FLD769);
            }
        }

        if(CLS186.MTH2723(ʾʻ0)) {
            return;
        }
        CLS144.MTH2167(this.MTH2810(), ((CLS343)new CLS530(this, ʾʻ0)));
    }

    // 此方法包含解密的字符串
    public void MTH2813(CLS367 ʾʻ0, CLS188 יᵎ$ˈᴵ0) {
        public class CLS529 implements CLS343 {
            public final CLS367 FLD767;
            public final CLS189 FLD768;

            public CLS529(CLS367 ʾʻ0) {
                this.FLD767 = ʾʻ0;
                super();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                CLS186.MTH2730(this.FLD767);
            }
        }


        public class CLS531 implements CLS343 {
            public final CLS189 FLD771;

            public CLS531(CLS188 יᵎ$ˈᴵ0) {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
            }
        }


        public class CLS532 implements CLS343 {
            public final ArrayList FLD772;
            public final CLS189 FLD773;

            public CLS532(ArrayList arrayList0) {
                this.FLD772 = arrayList0;
                super();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                CLS186.MTH2724(this.FLD772);
            }
        }

        try {
            if(this.FLD779 != null && this.FLD779.isShowing()) {
                this.FLD779.dismiss();
            }
            Activity activity0 = this.MTH2810();
            this.FLD779 = CLS144.MTH2214(activity0, "", ((CLS342)new CLS527(this, activity0, ʾʻ0)), ((CLS343)new CLS531(this, יᵎ$ˈᴵ0)));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2817(ContentValues contentValues0) {
        long v;
        String s;
        Activity activity0;
        if(contentValues0.containsKey("img_uri")) {
            CLS159.MTH2265(this.MTH2810(), contentValues0.getAsString("content"), Uri.parse(contentValues0.getAsString("img_uri")));
            return;
        }
        boolean z = false;
        if(contentValues0.containsKey("vid_uri")) {
            z = true;
            activity0 = this.MTH2810();
            s = contentValues0.getAsString("content");
            v = -151822097808520L;
        }
        else if(contentValues0.containsKey("mp3_uri")) {
            z = true;
            activity0 = this.MTH2810();
            s = contentValues0.getAsString("content");
            v = -151993896500360L;
        }
        if(z) {
            CLS159.MTH2270(activity0, s, Uri.parse(contentValues0.getAsString(CLS41.MTH858(v))));
            return;
        }
        if(contentValues0.containsKey("gif_uri")) {
            CLS159.MTH2272(this.MTH2810(), contentValues0.getAsString("content"), Uri.parse(contentValues0.getAsString("gif_uri")));
        }
    }

    public void MTH2818() {
        this.FLD778 = true;
    }

    // 此方法包含解密的字符串
    public final void MTH2819() {
        String s2;
        String s1;
        try {
            if(this.FLD777 == null) {
                return;
            }
            this.FLD785.MTH3643("<b>" + this.FLD777.MTH5055() + "</b>");
            if(this.FLD781 != this.FLD777) {
                this.FLD783.MTH898();
                this.FLD774.clear();
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("content", "|wx_prev_dir|");
                contentValues0.put("desc", "< ---");
                this.FLD774.add(contentValues0);
                CLS367[] arr_ʾʻ = this.FLD777.MTH5060();
                if(arr_ʾʻ != null) {
                    ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_ʾʻ));
                    Collections.sort(arrayList0, (CLS367 ʾʻ0, CLS367 ʾʻ1) -> {
                        if(ʾʻ0.MTH5065() && ʾʻ1.MTH5065() || ʾʻ0.MTH5061() && ʾʻ1.MTH5061()) {
                            return ʾʻ0.MTH5055().toLowerCase().compareTo(ʾʻ1.MTH5055().toLowerCase());
                        }
                        if(ʾʻ0.MTH5061() && ʾʻ1.MTH5065()) {
                            return -1;
                        }
                        return !ʾʻ0.MTH5065() || !ʾʻ1.MTH5061() ? 0 : 1;
                    });
                    for(Object object0: arrayList0) {
                        CLS367 ʾʻ0 = (CLS367)object0;
                        boolean z = this.MTH2801(ʾʻ0);
                        if((ʾʻ0.MTH5061() || z) && (!ʾʻ0.MTH5061() || !CLS186.MTH2723(ʾʻ0))) {
                            String s = ʾʻ0.MTH5055();
                            ContentValues contentValues1 = new ContentValues();
                            contentValues1.put("content", s);
                            if(ʾʻ0.MTH5061()) {
                                contentValues1.put("desc", "<i>" + s + "</i>");
                                s1 = "uri_dir";
                            }
                            else {
                                contentValues1.put("desc", s);
                                s1 = "uri_file";
                            }
                            s2 = ʾʻ0.MTH5057().toString();
                            contentValues1.put(s1, s2);
                            if(z) {
                                String s3 = s.toLowerCase();
                                if(s3.endsWith(".mp3")) {
                                    contentValues1.put("mp3_uri", ʾʻ0.MTH5057().toString());
                                }
                                else if(s3.endsWith(".jpg") || s3.endsWith(".jpeg") || s3.endsWith(".png")) {
                                    contentValues1.put("img_uri", ʾʻ0.MTH5057().toString());
                                }
                                else if(s3.endsWith(".mp4")) {
                                    contentValues1.put("vid_uri", ʾʻ0.MTH5057().toString());
                                }
                                else if(s3.endsWith(".gif")) {
                                    contentValues1.put("gif_uri", ʾʻ0.MTH5057().toString());
                                }
                            }
                            this.FLD774.add(contentValues1);
                        }
                    }
                    this.FLD783.MTH906(this.FLD774);
                }
            }
            else if(this.FLD780 != null && this.FLD780.MTH5065()) {
                String s4 = this.FLD780.MTH5057().toString();
                for(Object object1: this.FLD774) {
                    ContentValues contentValues2 = (ContentValues)object1;
                    if(contentValues2.containsKey("uri_file") && s4.equals(contentValues2.getAsString("uri_file"))) {
                        this.FLD783.MTH890(contentValues2);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private void MTH2820() {
        ArrayList arrayList0 = this.FLD783.MTH910();
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(contentValues0.containsKey("uri_file")) {
                hashSet0.add(contentValues0.getAsString("uri_file"));
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: this.FLD774) {
            ContentValues contentValues1 = (ContentValues)object1;
            if(contentValues1.containsKey("uri_file")) {
                String s = contentValues1.getAsString("uri_file");
                CLS367 ʾʻ0 = CLS186.MTH2736(contentValues1.getAsString("uri_file"));
                if(ʾʻ0 != null && ʾʻ0.MTH5065() && !hashSet0.contains(s)) {
                    arrayList1.add(contentValues1);
                }
            }
        }
        this.FLD783.MTH898();
        this.FLD783.MTH902(arrayList1);
        this.FLD783.notifyDataSetChanged();
    }
}

