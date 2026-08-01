// Decompiled by JEB v5.42.0.202606242140

package c.יᴵ;

import android.app.Activity;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS100;
import c.ˋʿ.CLS102;
import c.ˋʿ.CLS98;
import c.ـˉ.CLS170;
import c.ـˉ.CLS181;
import c.ـˉ.CLS200;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS231;
import c.ـˉ.CLS262;
import com.android.xc.Wrapper.XpMethodHook;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class CLS147 {
    public final Set FLD679;
    public boolean FLD680;
    public final Set FLD681;
    public String FLD682;
    public final CLS231 FLD683;
    public final HashMap FLD684;
    public boolean FLD685;
    public final List FLD686;
    public static final CLS147 FLD687;
    public final CopyOnWriteArrayList FLD688;
    public ClassLoader FLD689;
    public final CLS200 FLD690;
    public final HashMap FLD691;
    public final HashMap FLD692;
    public final HashMap FLD693;
    public final CLS213 FLD694;

    static {
        CLS147.FLD687 = new CLS147();
    }

    public CLS147() {
        this.FLD680 = false;
        this.FLD685 = false;
        this.FLD686 = Collections.synchronizedList(new ArrayList());
        this.FLD688 = new CopyOnWriteArrayList();
        this.FLD684 = new HashMap();
        this.FLD683 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
        this.FLD679 = Collections.synchronizedSet(new HashSet());
        this.FLD681 = Collections.synchronizedSet(new HashSet());
        this.FLD690 = CLS200.MTH3224();
        this.FLD694 = CLS213.MTH3304();
        this.FLD693 = new HashMap();
        this.FLD691 = new HashMap();
        this.FLD692 = new HashMap();
    }

    // 此方法包含解密的字符串
    public final Object MTH2618(String s, ClassLoader classLoader0) {
        String s1;
        Object object0;
        if(this.FLD692.containsKey(s)) {
            return this.FLD692.get(s);
        }
        if(TextUtils.isEmpty(s)) {
            object0 = "";
        }
        else if(s.startsWith("\uD8E3")) {
            s1 = this.MTH2644(s);
            object0 = CLS100.MTH2112(s1, classLoader0);
            if(object0 == null) {
                object0 = s1;
            }
        }
        else if(s.startsWith("\uD8E3")) {
            object0 = this.MTH2623(s.substring(1).trim());
        }
        else if(s.startsWith("\uD8E3")) {
            s1 = s.substring(1).trim();
            object0 = CLS100.MTH2112(s1, classLoader0);
            if(object0 == null) {
                object0 = s1;
            }
        }
        else if(s.startsWith("\uD8E3")) {
            object0 = s.substring(1).trim();
            s1 = this.MTH2642(((String)object0));
            if(s1 != null) {
                object0 = s1;
            }
        }
        else {
            object0 = s.trim();
        }
        this.FLD692.put(s, object0);
        return object0;
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public final Object MTH2619(JSONObject jSONObject0) {
        public class CLS644 extends XpMethodHook {
            public final String FLD673;
            public final String FLD674;
            public final String FLD675;
            public final String FLD676;
            public final CLS147 FLD677;
            public final String FLD678;

            public CLS644(String s, String s1, String s2, String s3, String s4) {
                this.FLD675 = s;
                this.FLD673 = s1;
                this.FLD676 = s2;
                this.FLD678 = s3;
                this.FLD674 = s4;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                if(CLS147.this.FLD680) {
                    return;
                }
                try {
                    if(!TextUtils.isEmpty(this.FLD678)) {
                        if(this.FLD678.contains("\uD8E3")) {
                            String[] arr_s = this.FLD678.split("\uD8E3");
                            for(int v = 0; v < arr_s.length; ++v) {
                                CLS147.this.FLD694.MTH3320(arr_s[v].trim(), new Object[]{object0});
                            }
                        }
                        else {
                            CLS147.this.FLD694.MTH3320(this.FLD678, new Object[]{object0});
                        }
                    }
                    if(!TextUtils.isEmpty(this.FLD674)) {
                        if(!this.FLD674.contains("\uD8E3")) {
                            CLS147.this.FLD694.MTH3323(this.FLD674, new Object[]{object0});
                            return;
                        }
                        String[] arr_s1 = this.FLD674.split("\uD8E3");
                        for(int v1 = 0; true; ++v1) {
                            if(v1 >= arr_s1.length) {
                                return;
                            }
                            CLS147.this.FLD694.MTH3323(arr_s1[v1].trim(), new Object[]{object0});
                        }
                    }
                }
                catch(Throwable unused_ex) {
                }
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void beforeHookedMethod(Object object0) {
                Boolean boolean0;
                if(CLS147.this.FLD680) {
                    return;
                }
                try {
                    if(!TextUtils.isEmpty(this.FLD675)) {
                        if(this.FLD675.contains("\uD8E3")) {
                            String[] arr_s = this.FLD675.split("\uD8E3");
                            for(int v = 0; v < arr_s.length; ++v) {
                                CLS147.this.FLD694.MTH3320(arr_s[v].trim(), new Object[]{object0});
                            }
                        }
                        else {
                            CLS147.this.FLD694.MTH3320(this.FLD675, new Object[]{object0});
                        }
                    }
                    if(!TextUtils.isEmpty(this.FLD673)) {
                        if(this.FLD673.contains("\uD8E3")) {
                            String[] arr_s1 = this.FLD673.split("\uD8E3");
                            for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                                CLS147.this.FLD694.MTH3323(arr_s1[v1].trim(), new Object[]{object0});
                            }
                        }
                        else {
                            CLS147.this.FLD694.MTH3323(this.FLD673, new Object[]{object0});
                        }
                    }
                    if(!TextUtils.isEmpty(this.FLD676)) {
                        CLS98 ʻᵢ0 = new CLS98(object0);
                        String s = this.FLD676;
                        switch(s.hashCode()) {
                            case 102: {
                                boolean0 = s.equals("\uD8E3") ? Boolean.FALSE : Integer.valueOf(this.FLD676);
                                break;
                            }
                            case 110: {
                                if(s.equals("\uD8E3")) {
                                    ʻᵢ0.MTH2080(null);
                                }
                                boolean0 = Integer.valueOf(this.FLD676);
                                break;
                            }
                            case 0x74: {
                                boolean0 = s.equals("\uD8E3") ? Boolean.TRUE : Integer.valueOf(this.FLD676);
                                break;
                            }
                            default: {
                                boolean0 = Integer.valueOf(this.FLD676);
                            }
                        }
                        ʻᵢ0.MTH2080(boolean0);
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
        }

        String s = jSONObject0.has("\uD8E3e") ? jSONObject0.optString("\uD8E3e").trim() : "";
        String s1 = jSONObject0.has("\uD8E3e_a") ? jSONObject0.optString("\uD8E3e_a").trim() : "";
        String s2 = jSONObject0.has("\uD8E3") ? jSONObject0.optString("\uD8E3").trim() : "";
        String s3 = jSONObject0.has("\uD8E3e") ? jSONObject0.optString("\uD8E3e").trim() : "";
        return jSONObject0.has("\uD8E3e_a") ? CLS102.MTH2147(new CLS644(this, s, s1, s2, s3, jSONObject0.optString("\uD8E3e_a").trim())) : CLS102.MTH2147(new CLS644(this, s, s1, s2, s3, ""));
    }

    // 此方法包含解密的字符串
    public final void MTH2620(JSONObject jSONObject0, ClassLoader classLoader0, boolean z) {
        Method method0;
        Class class5;
        Class class4;
        int v6;
        int v5;
        Class class3;
        String s10;
        Class class2;
        int v1;
        Class class1;
        String s5;
        Class class0;
        if(jSONObject0.has("\uD8E3") && !z) {
            return;
        }
        if(jSONObject0.has("\uD8E3")) {
            String s = jSONObject0.optString("\uD8E3");
            if(!TextUtils.isEmpty(s) && !this.FLD690.MTH3230(s.trim())) {
                return;
            }
        }
        if(jSONObject0.has("\uD8E3")) {
            String s1 = jSONObject0.optString("\uD8E3");
            if(!TextUtils.isEmpty(s1) && !this.MTH2638(s1)) {
                return;
            }
        }
        if(jSONObject0.has("\uD8E3")) {
            String s2 = jSONObject0.optString("\uD8E3");
            if(!this.MTH2643(s2)) {
                CLS204.MTH3254(("\uD8E3ook: " + jSONObject0));
                CLS204.MTH3254(("\uD8E3kipped on condition: " + s2));
                return;
            }
        }
        Object object0 = this.MTH2619(jSONObject0);
        if(object0 == null) {
            return;
        }
        boolean z1 = jSONObject0.has("\uD8E3c") && jSONObject0.optBoolean("\uD8E3c");
        String s3 = jSONObject0.has("\uD8E3h") ? jSONObject0.optString("\uD8E3h") : "";
        if(!TextUtils.isEmpty(s3)) {
            if(this.FLD679.contains(s3)) {
                return;
            }
            String[] arr_s = s3.split("\uD8E3");
            int v = 0;
            while(v < arr_s.length) {
                String[] arr_s1 = arr_s[v].split("\uD8E3");
                String s4 = arr_s1[0].trim();
                if(s4.startsWith("\uD8E3")) {
                    s4 = this.MTH2644(s4);
                    if(TextUtils.isEmpty(s4)) {
                        v1 = v;
                        goto label_59;
                    }
                    else {
                        goto label_49;
                    }
                    goto label_33;
                }
                else {
                label_33:
                    if(s4.startsWith("\uD8E3")) {
                        class0 = this.MTH2642(s4.substring(1));
                        if(class0 != null) {
                            s5 = s4;
                            class1 = class0;
                            goto label_51;
                        }
                        v1 = v;
                        goto label_59;
                    }
                    else if(s4.startsWith("\uD8E3")) {
                        class0 = this.MTH2623(s4.substring(1));
                        if(class0 == null) {
                            v1 = v;
                            goto label_59;
                        }
                        else {
                            s5 = s4;
                            class1 = class0;
                            goto label_51;
                        }
                    }
                }
            label_49:
                s5 = s4;
                class1 = null;
            label_51:
                if(class1 == null) {
                    v1 = v;
                    if(!CLS100.MTH2131(z1, s5, classLoader0, this.MTH2632(classLoader0, arr_s1, 1, arr_s1.length, object0))) {
                        goto label_59;
                    }
                }
                else {
                    v1 = v;
                    if(CLS100.MTH2135(z1, class1, classLoader0, this.MTH2632(classLoader0, arr_s1, 1, arr_s1.length, object0))) {
                        this.FLD679.add(s3);
                        return;
                    }
                    goto label_59;
                }
                this.FLD679.add(s3);
                return;
            label_59:
                v = v1 + 1;
            }
            return;
        }
        String s6 = jSONObject0.has("\uD8E3ha") ? jSONObject0.optString("\uD8E3ha") : "";
        if(!TextUtils.isEmpty(s6)) {
            if(this.FLD679.contains(s6)) {
                return;
            }
            String[] arr_s2 = s6.split("\uD8E3");
            int v2 = 0;
            while(v2 < arr_s2.length) {
                String s7 = arr_s2[v2].split("\uD8E3")[0].trim();
                if(s7.startsWith("\uD8E3")) {
                    s7 = this.MTH2644(s7);
                    if(!TextUtils.isEmpty(s7)) {
                        class2 = null;
                        goto label_84;
                    }
                }
                else if(s7.startsWith("\uD8E3")) {
                    class2 = this.MTH2642(s7.substring(1));
                    if(class2 != null) {
                        goto label_84;
                    }
                }
                else if(s7.startsWith("\uD8E3")) {
                    class2 = this.MTH2623(s7.substring(1));
                    if(class2 != null) {
                        goto label_84;
                    }
                }
                else {
                    class2 = null;
                label_84:
                    if(class2 != null) {
                        if(CLS100.MTH2110(z1, class2, object0)) {
                            this.FLD679.add(s6);
                            return;
                        }
                        goto label_90;
                    }
                    else if(CLS100.MTH2103(z1, s7, classLoader0, object0)) {
                    }
                    else {
                        goto label_90;
                    }
                    this.FLD679.add(s6);
                    return;
                }
            label_90:
                ++v2;
            }
            return;
        }
        boolean z2 = false;
        String s8 = jSONObject0.has("\uD8E3h") ? jSONObject0.optString("\uD8E3h") : "";
        if(!TextUtils.isEmpty(s8)) {
            if(this.FLD679.contains(s8)) {
                return;
            }
            String[] arr_s3 = s8.split("\uD8E3");
            int v3 = arr_s3.length;
            int v4 = 0;
            while(v4 < v3) {
                String[] arr_s4 = arr_s3[v4].split("\uD8E3");
                if(arr_s4.length >= 2) {
                    String s9 = arr_s4[0].trim();
                    if(s9.startsWith("\uD8E3")) {
                        s9 = this.MTH2644(s9);
                        if(!TextUtils.isEmpty(s9)) {
                            s10 = s9;
                            class3 = null;
                            goto label_123;
                        }
                    }
                    else if(s9.startsWith("\uD8E3")) {
                        class3 = this.MTH2642(s9.substring(1));
                        if(class3 != null) {
                            s10 = s9;
                            goto label_123;
                        }
                    }
                    else if(s9.startsWith("\uD8E3")) {
                        class3 = this.MTH2623(s9.substring(1));
                        if(class3 != null) {
                            s10 = s9;
                            goto label_123;
                        }
                    }
                    else {
                        s10 = s9;
                        class3 = null;
                    label_123:
                        String s11 = arr_s4[1].trim();
                        if(s11.startsWith("\uD8E3")) {
                            s11 = this.MTH2644(s11);
                        }
                        if(class3 == null) {
                            v5 = v4;
                            v6 = v3;
                            if(!CLS100.MTH2104(z1, s10, classLoader0, s11, this.MTH2632(classLoader0, arr_s4, 2, arr_s4.length, object0))) {
                                goto label_139;
                            }
                        }
                        else {
                            v5 = v4;
                            v6 = v3;
                            if(CLS100.MTH2140(z1, class3, s11, this.MTH2632(classLoader0, arr_s4, 2, arr_s4.length, object0))) {
                                this.FLD679.add(s8);
                                z2 = true;
                                break;
                            }
                            goto label_139;
                        }
                        this.FLD679.add(s8);
                        z2 = true;
                        break;
                    }
                }
                v5 = v4;
                v6 = v3;
            label_139:
                v4 = v5 + 1;
                v3 = v6;
            }
        }
        if(!z2) {
            String s12 = jSONObject0.has("\uD8E3ha") ? jSONObject0.optString("\uD8E3ha") : "";
            if(!TextUtils.isEmpty(s12)) {
                if(this.FLD679.contains(s12)) {
                    return;
                }
                String[] arr_s5 = s12.split("\uD8E3");
                if(arr_s5.length < 2) {
                    return;
                }
                String s13 = arr_s5[0].trim();
                if(s13.startsWith("\uD8E3")) {
                    s13 = this.MTH2644(s13);
                    if(TextUtils.isEmpty(s13)) {
                        return;
                    }
                    class4 = null;
                }
                else if(s13.startsWith("\uD8E3")) {
                    class4 = this.MTH2642(s13.substring(1));
                    if(class4 == null) {
                        return;
                    }
                }
                else if(s13.startsWith("\uD8E3")) {
                    class4 = this.MTH2623(s13.substring(1));
                    if(class4 == null) {
                        return;
                    }
                }
                else {
                    class4 = null;
                }
                String s14 = arr_s5[1].trim();
                if(s14.startsWith("\uD8E3")) {
                    s14 = this.MTH2644(s14);
                }
                if(class4 != null) {
                    if(CLS100.MTH2134(z1, class4, s14, object0)) {
                        this.FLD679.add(s12);
                        z2 = true;
                    }
                }
                else if(CLS100.MTH2102(z1, s13, classLoader0, s14, object0)) {
                    this.FLD679.add(s12);
                    z2 = true;
                }
            }
        }
        if(!z2) {
            String s15 = jSONObject0.has("\uD8E3l") ? jSONObject0.optString("\uD8E3l") : "";
            if(TextUtils.isEmpty(s15) || this.FLD679.contains(s15)) {
                return;
            }
            String[] arr_s6 = s15.split("\uD8E3");
            int v7 = 0;
            while(v7 < arr_s6.length) {
                String[] arr_s7 = arr_s6[v7].split("\uD8E3");
                int v8 = Integer.parseInt(arr_s7[0].trim());
                String s16 = arr_s7[1].trim();
                if(s16.startsWith("\uD8E3")) {
                    s16 = this.MTH2644(s16);
                    if(!TextUtils.isEmpty(s16)) {
                        class5 = null;
                        goto label_202;
                    }
                }
                else if(s16.startsWith("\uD8E3")) {
                    Class class6 = this.MTH2642(s16.substring(1));
                    if(class6 != null) {
                        class5 = class6;
                        goto label_202;
                    }
                }
                else if(s16.startsWith("\uD8E3")) {
                    class5 = this.MTH2623(s16.substring(1));
                    if(class5 != null) {
                        goto label_202;
                    }
                }
                else {
                    class5 = null;
                label_202:
                    String s17 = arr_s7[2].trim();
                    if(s17.startsWith("\uD8E3")) {
                        s17 = this.MTH2644(s17);
                    }
                    else if(s17.equals("\uD8E3ull")) {
                        s17 = null;
                    }
                    Object object1 = arr_s7.length <= 3 ? null : this.MTH2618(arr_s7[3].trim(), classLoader0);
                    if(arr_s7.length <= 4) {
                        method0 = class5 == null ? CLS100.MTH2109(s16, classLoader0, v8, s17, object1, new Object[0]) : CLS100.MTH2107(class5, v8, s17, object1, new Object[0]);
                    }
                    else if(class5 == null) {
                        method0 = CLS100.MTH2109(s16, classLoader0, v8, s17, object1, this.MTH2627(classLoader0, arr_s7, 4, arr_s7.length));
                    }
                    else {
                        method0 = CLS100.MTH2107(class5, v8, s17, object1, this.MTH2627(classLoader0, arr_s7, 4, arr_s7.length));
                    }
                    if(CLS100.MTH2106(z1, method0, object0)) {
                        this.FLD679.add(s15);
                        return;
                    }
                }
                ++v7;
            }
        }
    }

    public CLS147 MTH2622(ClassLoader classLoader0) {
        this.FLD689 = classLoader0;
        return this;
    }

    // 此方法包含解密的字符串
    public final Class MTH2623(String s) {
        if(s.equals("\uD8E3ull")) {
            return null;
        }
        Class class0 = (Class)this.FLD693.get(s);
        if(class0 != null) {
            return class0;
        }
        try {
            Class class1 = Class.forName(s);
            this.FLD693.put(s, class1);
            return class1;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    public void MTH2624(ClassLoader classLoader0, Context context0, boolean z) {
        if(this.FLD686.isEmpty()) {
            return;
        }
        for(Object object0: this.FLD686) {
            JSONObject jSONObject0 = (JSONObject)object0;
            try {
                if(this.FLD681.contains(jSONObject0) || jSONObject0.has("\uD8E3") && !z) {
                    continue;
                }
                String s = jSONObject0.has("\uD8E3") ? jSONObject0.optString("\uD8E3").trim() : "";
                if(TextUtils.isEmpty(s)) {
                    continue;
                }
                int v = 0;
                String s1 = jSONObject0.has("\uD8E3") ? jSONObject0.optString("\uD8E3") : "";
                if(!TextUtils.isEmpty(s1)) {
                    String[] arr_s = s1.split("\uD8E3");
                    int v1 = arr_s.length;
                    int v2 = 0;
                    while(v2 < v1) {
                        String s2 = arr_s[v2].trim();
                        if(!TextUtils.isEmpty(s2)) {
                            if(s2.startsWith("\uD8E3")) {
                                s2 = this.MTH2644(s2);
                            }
                            if(!this.MTH2640(s, s2, classLoader0)) {
                                goto label_21;
                            }
                            goto label_39;
                        }
                    label_21:
                        ++v2;
                    }
                    goto label_25;
                }
                else if(!this.MTH2640(s, CLS95.MTH2004(s), classLoader0)) {
                label_25:
                    if(context0 == null) {
                        continue;
                    }
                    String s3 = jSONObject0.has("\uD8E3") ? jSONObject0.optString("\uD8E3") : "";
                    if(TextUtils.isEmpty(s3)) {
                        continue;
                    }
                    String[] arr_s1 = s3.split("\uD8E3");
                    int v3 = arr_s1.length;
                    while(v < v3) {
                        String s4 = arr_s1[v].trim();
                        if(!TextUtils.isEmpty(s4)) {
                            if(s4.startsWith("\uD8E3")) {
                                s4 = this.MTH2644(s4);
                            }
                            if(!this.MTH2640(s, CLS100.MTH2133(context0, s4), classLoader0)) {
                                goto label_36;
                            }
                            goto label_39;
                        }
                    label_36:
                        ++v;
                    }
                    continue;
                }
            label_39:
                this.FLD681.add(jSONObject0);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    // 去混淆评级： 低(39)
    // 此方法包含解密的字符串
    public final void MTH2625() {
        this.FLD693.put("\uD8E3nt", Integer.TYPE);
        this.FLD693.put("\uD8E3ouble", Double.TYPE);
        this.FLD693.put("\uD8E3loat", Float.TYPE);
        this.FLD693.put("\uD8E3ong", Long.TYPE);
        this.FLD693.put("\uD8E3oolean", Boolean.TYPE);
        this.FLD693.put("\uD8E3ntent", Intent.class);
        this.FLD693.put("\uD8E3iew", View.class);
        this.FLD693.put("\uD8E3undle", Bundle.class);
        this.FLD693.put("\uD8E3enuitem", MenuItem.class);
        this.FLD693.put("\uD8E3yte", Byte.TYPE);
        this.FLD693.put("\uD8E3yte[]", byte[].class);
        this.FLD693.put("\uD8E3enu", Menu.class);
        this.FLD693.put("\uD8E3ontextmenu", ContextMenu.class);
        this.FLD693.put("\uD8E3harsequence", CharSequence.class);
        this.FLD693.put("\uD8E3ontext", Context.class);
        this.FLD693.put("\uD8E3tring", String.class);
        this.FLD693.put("\uD8E3tring[]", String[].class);
        this.FLD693.put("\uD8E3bject", Object.class);
        this.FLD693.put("\uD8E3bject[]", Object[].class);
        this.FLD693.put("\uD8E3ontentvalues", ContentValues.class);
        this.FLD693.put("\uD8E3oid", Void.TYPE);
        this.FLD693.put("\uD8E3essage", Message.class);
        this.FLD693.put("\uD8E3ile", File.class);
        this.FLD693.put("\uD8E3lassloader", ClassLoader.class);
        this.FLD693.put("\uD8E3ist", List.class);
        this.FLD693.put("\uD8E3pplication", Application.class);
        this.FLD693.put("\uD8E3athclassloader", PathClassLoader.class);
        this.FLD693.put("\uD8E3ursor", Cursor.class);
        this.FLD693.put("\uD8E3ontextmenuinfo", ContextMenu.ContextMenuInfo.class);
        this.FLD693.put("\uD8E3eyevent", KeyEvent.class);
        this.FLD693.put("\uD8E3enuinflater", MenuInflater.class);
        this.FLD693.put("\uD8E3ap", Map.class);
        this.FLD693.put("\uD8E3sonobject", JSONObject.class);
        this.FLD693.put("\uD8E3ri", Uri.class);
        this.FLD693.put("\uD8E3ctivity", Activity.class);
        this.FLD693.put("\uD8E3inearlayout", LinearLayout.class);
        this.FLD693.put("\uD8E3rraylist", ArrayList.class);
        this.FLD693.put("\uD8E3iewgroup", ViewGroup.class);
        this.FLD693.put("\uD8E3dapterview", AdapterView.class);
        this.FLD693.put("\uD8E3rawable", Drawable.class);
        this.FLD693.put("\uD8E3esources", Resources.class);
        this.FLD693.put("\uD8E3ttributeset", AttributeSet.class);
        this.FLD693.put("\uD8E3itmap", Bitmap.class);
        this.FLD693.put("\uD8E3otionevent", MotionEvent.class);
        this.FLD693.put("\uD8E3iew.onclicklistener", View.OnClickListener.class);
        this.FLD693.put("\uD8E3ditable", Editable.class);
    }

    public boolean MTH2626(String s) {
        return this.FLD684.containsKey(s);
    }

    public final Object[] MTH2627(ClassLoader classLoader0, String[] arr_s, int v, int v1) {
        int v2 = v1 - v;
        Object[] arr_object = new Object[v2];
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_object[v3] = this.MTH2618(arr_s[v3 + v], classLoader0);
        }
        return arr_object;
    }

    public void MTH2628(ClassLoader classLoader0, boolean z) {
        this.MTH2634();
        if(this.FLD688.isEmpty()) {
            return;
        }
        for(Object object0: this.FLD688) {
            JSONObject jSONObject0 = (JSONObject)object0;
            try {
                this.MTH2620(jSONObject0, classLoader0, z);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    public void MTH2629() {
        this.FLD680 = true;
    }

    // 此方法包含解密的字符串
    public boolean MTH2630() {
        if(!CLS262.MTH4050(new File("", CLS181.MTH3088(("\uD8E3_" + this.FLD683.MTH3501()))))) {
            return false;
        }
        String s = (String)CLS95.MTH1982(140, new Object[0]);
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        this.FLD686.clear();
        this.FLD688.clear();
        this.FLD679.clear();
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            if(jSONObject0.has("\uD8E3")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("\uD8E3");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                    this.FLD686.add(jSONObject1);
                }
            }
            if(jSONObject0.has("\uD8E3")) {
                JSONArray jSONArray1 = jSONObject0.getJSONArray("\uD8E3");
                for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                    JSONObject jSONObject2 = jSONArray1.getJSONObject(v1);
                    this.FLD688.add(jSONObject2);
                }
            }
            this.FLD682 = jSONObject0.optString("\uD8E3ERSION");
            return true;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public void MTH2631() {
        this.MTH2634();
        if(this.FLD688.isEmpty()) {
            return;
        }
        for(Object object0: this.FLD688) {
            JSONObject jSONObject0 = (JSONObject)object0;
            if(jSONObject0.optBoolean("\uD8E3m")) {
                try {
                    this.MTH2620(jSONObject0, this.FLD689, false);
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }
    }

    public final Object[] MTH2632(ClassLoader classLoader0, String[] arr_s, int v, int v1, Object object0) {
        int v2 = v1 - v;
        Object[] arr_object = new Object[v2 + 1];
        arr_object[v2] = object0;
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_object[v3] = this.MTH2618(arr_s[v3 + v], classLoader0);
        }
        return arr_object;
    }

    public String MTH2633() {
        return this.FLD682;
    }

    // 检测为 Lambda 实现
    public void MTH2634() [...]

    public Class MTH2635(String s) {
        if(this.FLD684.containsKey(s)) {
            return (Class)this.FLD684.get(s);
        }
        try {
            Class class0 = CLS102.MTH2180(s, this.FLD689);
            if(class0 != null) {
                this.FLD684.put(s, class0);
                return class0;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3254(throwable0);
        }
        return null;
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public final boolean MTH2636(String s) {
        return s.contains("\uD8E3") ? CLS170.MTH3011(String.valueOf(((CLS231)CLS144.MTH2583().MTH2605(CLS231.class)).MTH3511()), s.substring(s.indexOf("\uD8E3") + 1, s.lastIndexOf("\uD8E3")).split("\uD8E3")) : true;
    }

    public void MTH2637() {
        CLS144.MTH2583().MTH2603(((CLS142)() -> {
            if(this.FLD685) {
                return;
            }
            this.MTH2625();
            this.FLD685 = this.MTH2630();
        }));
    }

    // 去混淆评级： 低(24)
    // 此方法包含解密的字符串
    public final boolean MTH2638(String s) {
        switch(s.hashCode()) {
            case 3109: {
                return s.equals("\uD8E3f") ? this.FLD690.MTH3229() : false;
            }
            case 0xD99: {
                return s.equals("\uD8E3f") ? this.FLD690.MTH3232() : false;
            }
            case 0xE53: {
                return s.equals("\uD8E3f") ? this.FLD690.MTH3238() : false;
            }
            default: {
                return false;
            }
        }
    }

    public HashMap MTH2639() {
        return this.FLD684;
    }

    public final boolean MTH2640(String s, String s1, ClassLoader classLoader0) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && classLoader0 != null) {
            if(this.FLD684.containsKey(s)) {
                return true;
            }
            Class class0 = CLS100.MTH2124(s1, classLoader0);
            if(class0 != null) {
                this.FLD684.put(s, class0);
                return true;
            }
        }
        return false;
    }

    public static CLS147 MTH2641() {
        return CLS147.FLD687;
    }

    // 去混淆评级： 低(20)
    public Class MTH2642(String s) {
        return this.FLD684.containsKey(s) || this.MTH2640(s, CLS95.MTH2004(s), this.FLD689) ? ((Class)this.FLD684.get(s)) : null;
    }

    // 此方法包含解密的字符串
    public final boolean MTH2643(String s) {
        if(TextUtils.isEmpty(s)) {
            return true;
        }
        String[] arr_s = s.split("\uD8E3");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v].trim();
            if(s1.startsWith("\uD8E3e_")) {
                if(!TextUtils.isEmpty(this.MTH2644(s1.substring(3)))) {
                    return false;
                }
            }
            else if(s1.startsWith("\uD8E3ne_")) {
                if(TextUtils.isEmpty(this.MTH2644(s1.substring(4)))) {
                    return false;
                }
            }
            else if(s1.endsWith("\uD8E3aichi")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2161()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2161()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3dxp")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2169()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2169()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3agicxp")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2160()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2160()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3patch")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2156()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2156()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3patch_")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2165()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2165()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3andhook")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2176()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2176()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3sp")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2171()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2171()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3patch")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2173()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2173()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3spatch")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2166()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2166()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3tpatch")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2164()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2164()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3andvxp_")) {
                if(this.MTH2636(s1)) {
                    if(s1.startsWith("\uD8E3")) {
                        if(CLS102.MTH2159()) {
                            return false;
                        }
                    }
                    else if(!CLS102.MTH2159()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("\uD8E3xp") && this.MTH2636(s1)) {
                if(s1.startsWith("\uD8E3")) {
                    if(CLS102.MTH2155()) {
                        return false;
                    }
                }
                else if(!CLS102.MTH2155()) {
                    return false;
                }
            }
        }
        return true;
    }

    // 此方法包含解密的字符串
    public final String MTH2644(String s) {
        String s3;
        if(s.startsWith("\uD8E3")) {
            s = s.substring(1);
        }
        String s1 = s.trim();
        if(this.FLD691.containsKey(s1)) {
            return (String)this.FLD691.get(s1);
        }
        if(s1.contains("\uD8E3")) {
            int v = s1.indexOf("\uD8E3");
            String s2 = s1.substring(v + 1).trim();
            if(s2.startsWith("\uD8E3")) {
                s2 = CLS95.MTH2004(s2.substring(1));
            }
            s3 = CLS95.MTH2012(s1.substring(0, v).trim(), s2);
        }
        else {
            s3 = CLS95.MTH2004(s1);
        }
        this.FLD691.put(s1, s3);
        return s3;
    }
}

