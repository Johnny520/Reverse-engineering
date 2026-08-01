// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.net.Uri;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import c.ʽـ.CLS49;
import c.ʾˆ.CLS53;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS108;
import c.ˋﹳ.CLS111;
import c.ˋﹳ.CLS112;
import c.ˑʼ.CLS125;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.ٴˈ.CLS291;
import c.ٴˈ.CLS791;
import c.ٴˈ.CLS795;
import c.ٴˑ.CLS299;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class CLS218 {
    public interface CLS217 {
    }

    public final HashSet FLD1006;
    public boolean FLD1007;
    public CLS299 FLD1008;
    public final WeakReference FLD1009;
    public CLS299 FLD1010;
    public boolean FLD1011;
    public CLS53 FLD1012;
    public boolean FLD1013;
    public final ArrayList FLD1014;
    public CLS795 FLD1015;
    public CLS791 FLD1016;
    public CLS299 FLD1017;
    public AlertDialog FLD1018;

    public CLS218(Activity activity0) {
        this.FLD1011 = false;
        this.FLD1009 = new WeakReference(activity0);
        this.FLD1014 = new ArrayList();
        this.FLD1006 = new HashSet();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH3387(AdapterView adapterView0, View view0, int v, long v1) [...]

    // 此方法包含解密的字符串
    public final void MTH3388(ContentValues contentValues0) {
        long v;
        String s;
        Activity activity0;
        if(contentValues0.containsKey("\uD8E3mg_uri")) {
            CLS194.MTH3165(this.MTH3414(), contentValues0.getAsString("\uD8E3ontent"), Uri.parse(contentValues0.getAsString("\uD8E3mg_uri")));
            return;
        }
        boolean z = false;
        if(contentValues0.containsKey("\uD8E3id_uri")) {
            z = true;
            activity0 = this.MTH3414();
            s = contentValues0.getAsString("\uD8E3ontent");
            v = 0xFFFFBD6709FFCF7EL;
        }
        else if(contentValues0.containsKey("\uD8E3p3_uri")) {
            z = true;
            activity0 = this.MTH3414();
            s = contentValues0.getAsString("\uD8E3ontent");
            v = 0xFFFFBD4F09FFCF7EL;
        }
        if(z) {
            CLS194.MTH3166(activity0, s, Uri.parse(contentValues0.getAsString(CLS49.MTH1006(v))));
            return;
        }
        if(contentValues0.containsKey("\uD8E3if_uri")) {
            CLS194.MTH3168(this.MTH3414(), contentValues0.getAsString("\uD8E3ontent"), Uri.parse(contentValues0.getAsString("\uD8E3if_uri")));
        }
    }

    public final void MTH3390(CLS299 ـᵎ0) {
        CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
        {
            if(CLS243.MTH3647(ـᵎ0)) {
                return;
            }
            File file0 = new File(this.MTH3414().getCacheDir(), CLS262.MTH4042(ـᵎ0.MTH4378(), "\uD8E3ip"));
            CLS205.MTH3261(ـᵎ0, file0);
            CLS262.MTH4046(file0);
            CLS262.MTH4066(file0);
        }));
    }

    public final void MTH3393(CLS299 ـᵎ0) {
        public class CLS741 implements CLS111 {
            public final CLS218 FLD1004;
            public final CLS299 FLD1005;

            public CLS741(CLS299 ـᵎ0) {
                this.FLD1005 = ـᵎ0;
                super();
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                CLS243.MTH3621(this.FLD1005);
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }

        if(CLS243.MTH3647(ـᵎ0)) {
            return;
        }
        CLS258.MTH3804(this.MTH3414(), ((CLS111)new CLS741(this, ـᵎ0)));
    }

    // 此方法包含解密的字符串
    private void MTH3395() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.FLD1012.MTH1035()) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(contentValues0.containsKey("\uD8E3ri_file")) {
                arrayList0.add(CLS243.MTH3626(contentValues0.getAsString("\uD8E3ri_file")));
            }
        }
        CLS243.MTH3646(arrayList0);
    }

    // 此方法包含解密的字符串
    private void MTH3396() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.FLD1012.MTH1035()) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(contentValues0.containsKey("\uD8E3ri_file")) {
                arrayList0.add(CLS243.MTH3626(contentValues0.getAsString("\uD8E3ri_file")));
            }
        }
        if(arrayList0.isEmpty()) {
            return;
        }
        CLS258.MTH3804(this.MTH3414(), ((CLS111)new CLS738(this, arrayList0)));
    }

    private void MTH3398(ContentValues contentValues0) {
        this.MTH3388(contentValues0);
    }

    // 此方法包含解密的字符串
    private void MTH3399(Activity activity0, CLS299 ـᵎ0, Object[] arr_object) {
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS291 ᵔﹶ0 = new CLS291(activity0, linearLayout0, menu0);
        ᵔﹶ0.MTH4331("\uD8E3elect_all", ((CLS107)new CLS700(this))).MTH4331("\uD8E3nverse", ((CLS107)new CLS771(this)));
        if(this.FLD1007) {
            ᵔﹶ0.MTH4331("\uD8E3hare_all", ((CLS107)new CLS709(this))).MTH4331("\uD8E3hare_selected", ((CLS107)new CLS737(this)));
        }
        if(this.FLD1013) {
            ᵔﹶ0.MTH4331("\uD8E3elete_all", ((CLS107)new CLS782(this))).MTH4331("\uD8E3elete_selected", ((CLS107)new CLS701(this)));
        }
        ᵔﹶ0.MTH4328();
        this.FLD1012 = new CLS53(activity0);
        CLS791 ˋᵎ0 = new CLS791(activity0);
        this.FLD1016 = ˋᵎ0;
        ˋᵎ0.MTH4251();
        CLS795 יᴵ0 = new CLS795(activity0);
        this.FLD1015 = יᴵ0;
        יᴵ0.MTH4279(false);
        CLS258.MTH3813(linearLayout0, ((CLS108)this.FLD1015), true);
        this.FLD1016.MTH4244((AdapterView adapterView0, View view0, int v, long v1) -> // 此方法包含解密的字符串
        {
            CLS299 ـᵎ1;
            try {
                String s = ((ContentValues)this.FLD1012.getItem(v)).getAsString("\uD8E3ontent");
                if(s.equals("\uD8E3wx_prev_dir|")) {
                    CLS299 ـᵎ0 = this.FLD1010;
                    if(ـᵎ0 != null) {
                        if(ـᵎ0.MTH4376()) {
                            ـᵎ1 = this.FLD1010.MTH4374();
                            if(ـᵎ1 != null) {
                                this.FLD1017 = this.FLD1008;
                                this.FLD1008 = ـᵎ1;
                                this.FLD1010 = this.FLD1008;
                                this.MTH3424();
                                return;
                            }
                        }
                        else {
                            CLS299 ـᵎ2 = this.FLD1010.MTH4374();
                            if(ـᵎ2 != null) {
                                ـᵎ1 = ـᵎ2.MTH4374();
                                if(ـᵎ1 != null) {
                                    this.FLD1017 = this.FLD1008;
                                    this.FLD1008 = ـᵎ1;
                                }
                            }
                        }
                    }
                    this.FLD1010 = this.FLD1008;
                }
                else {
                    CLS299 ـᵎ3 = CLS243.MTH3610(this.FLD1008, s);
                    this.FLD1010 = ـᵎ3;
                    this.FLD1017 = this.FLD1008;
                    if(ـᵎ3.MTH4376()) {
                        this.FLD1008 = this.FLD1010;
                    }
                }
                this.MTH3424();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        });
        this.FLD1016.MTH4241((AdapterView adapterView0, View view0, int v, long v1) -> // 此方法包含解密的字符串
        {
            try {
                ContentValues contentValues0 = (ContentValues)this.FLD1012.getItem(v);
                String s = contentValues0.getAsString("\uD8E3ontent");
                if(s.equals("\uD8E3wx_prev_dir|")) {
                    return true;
                }
                CLS299 ـᵎ0 = CLS243.MTH3610(this.FLD1008, s);
                CLS125 ʻᵢ0 = new CLS125(activity0, ـᵎ0.MTH4378());
                if(this.MTH3411(contentValues0)) {
                    ʻᵢ0.MTH2414("\uD8E3review", ((CLS107)new CLS699(this, contentValues0)));
                }
                if(this.FLD1007) {
                    ʻᵢ0.MTH2414("\uD8E3hare", ((CLS107)new CLS723(this, ـᵎ0)));
                }
                if(this.FLD1013 && !ـᵎ0.MTH4376()) {
                    ʻᵢ0.MTH2414("\uD8E3elete", ((CLS107)new CLS767(this, ـᵎ0)));
                }
                ʻᵢ0.MTH2418();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
            return true;
        });
        this.FLD1016.MTH4246(this.FLD1012);
        CLS258.MTH3813(linearLayout0, ((CLS108)this.FLD1016), true);
        this.FLD1008 = ـᵎ0.MTH4376() ? ـᵎ0 : ـᵎ0.MTH4374();
        this.FLD1010 = this.FLD1008;
        this.MTH3424();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH3400(CLS299 ـᵎ0) [...]

    public void MTH3403() {
        this.FLD1013 = true;
    }

    private void MTH3404() {
        this.MTH3390(this.FLD1008);
    }

    // 此方法包含解密的字符串
    private void MTH3405() {
        ArrayList arrayList0 = this.FLD1012.MTH1035();
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(contentValues0.containsKey("\uD8E3ri_file")) {
                hashSet0.add(contentValues0.getAsString("\uD8E3ri_file"));
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: this.FLD1014) {
            ContentValues contentValues1 = (ContentValues)object1;
            if(contentValues1.containsKey("\uD8E3ri_file")) {
                String s = contentValues1.getAsString("\uD8E3ri_file");
                CLS299 ـᵎ0 = CLS243.MTH3626(contentValues1.getAsString("\uD8E3ri_file"));
                if(ـᵎ0 != null && ـᵎ0.MTH4381() && !hashSet0.contains(s)) {
                    arrayList1.add(contentValues1);
                }
            }
        }
        this.FLD1012.MTH1029();
        this.FLD1012.MTH1030(arrayList1);
        this.FLD1012.notifyDataSetChanged();
    }

    public void MTH3406() {
        this.FLD1007 = true;
    }

    // 此方法包含解密的字符串
    public void MTH3407(CLS299 ـᵎ0, CLS217 ˑٴ$ʿˊ0) {
        public class CLS738 implements CLS111 {
            public final CLS218 FLD999;
            public final ArrayList FLD1000;

            public CLS738(ArrayList arrayList0) {
                this.FLD1000 = arrayList0;
                super();
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                CLS243.MTH3629(this.FLD1000);
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }


        public class CLS739 implements CLS111 {
            public final CLS218 FLD1001;

            public CLS739(CLS217 ˑٴ$ʿˊ0) {
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }


        public class CLS740 implements CLS111 {
            public final CLS218 FLD1002;
            public final CLS299 FLD1003;

            public CLS740(CLS299 ـᵎ0) {
                this.FLD1003 = ـᵎ0;
                super();
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                CLS243.MTH3621(this.FLD1003);
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }

        try {
            if(this.FLD1018 != null && this.FLD1018.isShowing()) {
                this.FLD1018.dismiss();
            }
            Activity activity0 = this.MTH3414();
            this.FLD1018 = CLS258.MTH3793(activity0, "", ((CLS112)new CLS721(this, activity0, ـᵎ0)), ((CLS111)new CLS739(this, ˑٴ$ʿˊ0)));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH3410(CLS299 ـᵎ0) {
        if(!this.FLD1011 && !this.FLD1006.contains("\uD8E3")) {
            if(this.FLD1006.isEmpty()) {
                return false;
            }
            if(!ـᵎ0.MTH4381()) {
                return false;
            }
            String s = ـᵎ0.MTH4378();
            int v = s.lastIndexOf("\uD8E3");
            return v == -1 ? false : this.FLD1006.contains(s.substring(v + 1));
        }
        return true;
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public final boolean MTH3411(ContentValues contentValues0) {
        return contentValues0.containsKey("\uD8E3mg_uri") || contentValues0.containsKey("\uD8E3id_uri") || contentValues0.containsKey("\uD8E3p3_uri") || contentValues0.containsKey("\uD8E3if_uri");
    }

    private void MTH3413(CLS299 ـᵎ0) {
        CLS258.MTH3804(this.MTH3414(), ((CLS111)new CLS740(this, ـᵎ0)));
    }

    public final Activity MTH3414() {
        return (Activity)this.FLD1009.get();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private boolean MTH3416(Activity activity0, AdapterView adapterView0, View view0, int v, long v1) [...]

    // 检测为 Lambda 实现
    public static int MTH3418(CLS299 ـᵎ0, CLS299 ـᵎ1) [...]

    private void MTH3421() {
        this.MTH3393(this.FLD1008);
    }

    private void MTH3422(CLS299 ـᵎ0) {
        if(ـᵎ0.MTH4376()) {
            this.MTH3390(ـᵎ0);
            return;
        }
        CLS243.MTH3624(ـᵎ0);
    }

    public void MTH3423() {
        this.FLD1011 = true;
    }

    // 此方法包含解密的字符串
    public final void MTH3424() {
        String s2;
        String s1;
        try {
            if(this.FLD1008 == null) {
                return;
            }
            this.FLD1015.MTH4277("\uD8E3b>" + this.FLD1008.MTH4378() + "\uD8E3/b>");
            if(this.FLD1017 != this.FLD1008) {
                this.FLD1012.MTH1029();
                this.FLD1014.clear();
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("\uD8E3ontent", "\uD8E3wx_prev_dir|");
                contentValues0.put("\uD8E3esc", "\uD8E3 ---");
                this.FLD1014.add(contentValues0);
                CLS299[] arr_ـᵎ = this.FLD1008.MTH4387();
                if(arr_ـᵎ != null) {
                    ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_ـᵎ));
                    Collections.sort(arrayList0, (CLS299 ـᵎ0, CLS299 ـᵎ1) -> {
                        if(ـᵎ0.MTH4381() && ـᵎ1.MTH4381() || ـᵎ0.MTH4376() && ـᵎ1.MTH4376()) {
                            return ـᵎ0.MTH4378().toLowerCase().compareTo(ـᵎ1.MTH4378().toLowerCase());
                        }
                        if(ـᵎ0.MTH4376() && ـᵎ1.MTH4381()) {
                            return -1;
                        }
                        return !ـᵎ0.MTH4381() || !ـᵎ1.MTH4376() ? 0 : 1;
                    });
                    for(Object object0: arrayList0) {
                        CLS299 ـᵎ0 = (CLS299)object0;
                        boolean z = this.MTH3410(ـᵎ0);
                        if((ـᵎ0.MTH4376() || z) && (!ـᵎ0.MTH4376() || !CLS243.MTH3647(ـᵎ0))) {
                            String s = ـᵎ0.MTH4378();
                            ContentValues contentValues1 = new ContentValues();
                            contentValues1.put("\uD8E3ontent", s);
                            if(ـᵎ0.MTH4376()) {
                                contentValues1.put("\uD8E3esc", "\uD8E3i>" + s + "\uD8E3/i>");
                                s1 = "\uD8E3ri_dir";
                            }
                            else {
                                contentValues1.put("\uD8E3esc", s);
                                s1 = "\uD8E3ri_file";
                            }
                            s2 = ـᵎ0.MTH4379().toString();
                            contentValues1.put(s1, s2);
                            if(z) {
                                String s3 = s.toLowerCase();
                                if(s3.endsWith("\uD8E3mp3")) {
                                    contentValues1.put("\uD8E3p3_uri", ـᵎ0.MTH4379().toString());
                                }
                                else if(s3.endsWith("\uD8E3jpg") || s3.endsWith("\uD8E3jpeg") || s3.endsWith("\uD8E3png")) {
                                    contentValues1.put("\uD8E3mg_uri", ـᵎ0.MTH4379().toString());
                                }
                                else if(s3.endsWith("\uD8E3mp4")) {
                                    contentValues1.put("\uD8E3id_uri", ـᵎ0.MTH4379().toString());
                                }
                                else if(s3.endsWith("\uD8E3gif")) {
                                    contentValues1.put("\uD8E3if_uri", ـᵎ0.MTH4379().toString());
                                }
                            }
                            this.FLD1014.add(contentValues1);
                        }
                    }
                    this.FLD1012.MTH1047(this.FLD1014);
                }
            }
            else if(this.FLD1010 != null && this.FLD1010.MTH4381()) {
                String s4 = this.FLD1010.MTH4379().toString();
                for(Object object1: this.FLD1014) {
                    ContentValues contentValues2 = (ContentValues)object1;
                    if(contentValues2.containsKey("\uD8E3ri_file") && s4.equals(contentValues2.getAsString("\uD8E3ri_file"))) {
                        this.FLD1012.MTH1043(contentValues2);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private void MTH3425() {
        for(int v = 0; v < this.FLD1012.getCount(); ++v) {
            ContentValues contentValues0 = (ContentValues)this.FLD1012.getItem(v);
            if(contentValues0.containsKey("\uD8E3ri_file")) {
                CLS299 ـᵎ0 = CLS243.MTH3626(contentValues0.getAsString("\uD8E3ri_file"));
                if(ـᵎ0 != null && ـᵎ0.MTH4381()) {
                    this.FLD1012.MTH1038(contentValues0);
                }
            }
        }
        this.FLD1012.notifyDataSetChanged();
    }
}

