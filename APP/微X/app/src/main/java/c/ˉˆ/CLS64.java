// Decompiled by JEB v5.42.0.202606242140

package c.ˉˆ;

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
import c.ˊﹶ.CLS98;
import c.ˏי.CLS111;
import c.ˏי.CLS112;
import c.ˏי.CLS113;
import c.ˏᵎ.CLS139;
import c.ˏᵎ.CLS176;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS191;
import c.ˏᵎ.CLS194;
import c.ˏᵎ.CLS197;
import c.ˏᵎ.CLS224;
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

public class CLS64 {
    public final CLS191 FLD219;
    public final List FLD220;
    public boolean FLD221;
    public final Set FLD222;
    public ClassLoader FLD223;
    public final CLS194 FLD224;
    public final HashMap FLD225;
    public final HashMap FLD226;
    public boolean FLD227;
    public String FLD228;
    public final HashMap FLD229;
    public final CopyOnWriteArrayList FLD230;
    public final CLS139 FLD231;
    public static final CLS64 FLD232;
    public final HashMap FLD233;
    public final Set FLD234;

    static {
        CLS64.FLD232 = new CLS64();
    }

    public CLS64() {
        this.FLD221 = false;
        this.FLD227 = false;
        this.FLD220 = Collections.synchronizedList(new ArrayList());
        this.FLD230 = new CopyOnWriteArrayList();
        this.FLD225 = new HashMap();
        this.FLD231 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
        this.FLD234 = Collections.synchronizedSet(new HashSet());
        this.FLD222 = Collections.synchronizedSet(new HashSet());
        this.FLD219 = CLS191.MTH2830();
        this.FLD224 = CLS194.MTH2881();
        this.FLD226 = new HashMap();
        this.FLD233 = new HashMap();
        this.FLD229 = new HashMap();
    }

    public final boolean MTH1051(String s, String s1, ClassLoader classLoader0) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && classLoader0 != null) {
            if(this.FLD225.containsKey(s)) {
                return true;
            }
            Class class0 = CLS112.MTH1625(s1, classLoader0);
            if(class0 != null) {
                this.FLD225.put(s, class0);
                return true;
            }
        }
        return false;
    }

    public void MTH1052() {
        CLS70.MTH1131().MTH1152(((CLS69)() -> {
            if(this.FLD227) {
                return;
            }
            this.MTH1064();
            this.FLD227 = this.MTH1076();
        }));
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public final boolean MTH1053(String s) {
        return s.contains("#") ? CLS197.MTH2926(String.valueOf(((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2120()), s.substring(s.indexOf("#") + 1, s.lastIndexOf("#")).split(",")) : true;
    }

    public final Object[] MTH1054(ClassLoader classLoader0, String[] arr_s, int v, int v1) {
        int v2 = v1 - v;
        Object[] arr_object = new Object[v2];
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_object[v3] = this.MTH1055(arr_s[v3 + v], classLoader0);
        }
        return arr_object;
    }

    // 此方法包含解密的字符串
    public final Object MTH1055(String s, ClassLoader classLoader0) {
        String s1;
        Object object0;
        if(this.FLD229.containsKey(s)) {
            return this.FLD229.get(s);
        }
        if(TextUtils.isEmpty(s)) {
            object0 = "";
        }
        else if(s.startsWith("#")) {
            s1 = this.MTH1069(s);
            object0 = CLS112.MTH1613(s1, classLoader0);
            if(object0 == null) {
                object0 = s1;
            }
        }
        else if(s.startsWith("!")) {
            object0 = this.MTH1060(s.substring(1).trim());
        }
        else if(s.startsWith("@")) {
            s1 = s.substring(1).trim();
            object0 = CLS112.MTH1613(s1, classLoader0);
            if(object0 == null) {
                object0 = s1;
            }
        }
        else if(s.startsWith("+")) {
            object0 = s.substring(1).trim();
            s1 = this.MTH1061(((String)object0));
            if(s1 != null) {
                object0 = s1;
            }
        }
        else {
            object0 = s.trim();
        }
        this.FLD229.put(s, object0);
        return object0;
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public final Object MTH1056(JSONObject jSONObject0) {
        public class CLS418 extends XpMethodHook {
            public final String FLD213;
            public final String FLD214;
            public final String FLD215;
            public final CLS64 FLD216;
            public final String FLD217;
            public final String FLD218;

            public CLS418(String s, String s1, String s2, String s3, String s4) {
                this.FLD217 = s;
                this.FLD218 = s1;
                this.FLD213 = s2;
                this.FLD215 = s3;
                this.FLD214 = s4;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // com.android.xc.Wrapper.XpMethodHook
            public void afterHookedMethod(Object object0) {
                if(CLS64.this.FLD221) {
                    return;
                }
                try {
                    if(!TextUtils.isEmpty(this.FLD215)) {
                        if(this.FLD215.contains(",")) {
                            String[] arr_s = this.FLD215.split(",");
                            for(int v = 0; v < arr_s.length; ++v) {
                                CLS64.this.FLD224.MTH2872(arr_s[v].trim(), new Object[]{object0});
                            }
                        }
                        else {
                            CLS64.this.FLD224.MTH2872(this.FLD215, new Object[]{object0});
                        }
                    }
                    if(!TextUtils.isEmpty(this.FLD214)) {
                        if(!this.FLD214.contains(",")) {
                            CLS64.this.FLD224.MTH2869(this.FLD214, new Object[]{object0});
                            return;
                        }
                        String[] arr_s1 = this.FLD214.split(",");
                        for(int v1 = 0; true; ++v1) {
                            if(v1 >= arr_s1.length) {
                                return;
                            }
                            CLS64.this.FLD224.MTH2869(arr_s1[v1].trim(), new Object[]{object0});
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
                if(CLS64.this.FLD221) {
                    return;
                }
                try {
                    if(!TextUtils.isEmpty(this.FLD217)) {
                        if(this.FLD217.contains(",")) {
                            String[] arr_s = this.FLD217.split(",");
                            for(int v = 0; v < arr_s.length; ++v) {
                                CLS64.this.FLD224.MTH2872(arr_s[v].trim(), new Object[]{object0});
                            }
                        }
                        else {
                            CLS64.this.FLD224.MTH2872(this.FLD217, new Object[]{object0});
                        }
                    }
                    if(!TextUtils.isEmpty(this.FLD218)) {
                        if(this.FLD218.contains(",")) {
                            String[] arr_s1 = this.FLD218.split(",");
                            for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                                CLS64.this.FLD224.MTH2869(arr_s1[v1].trim(), new Object[]{object0});
                            }
                        }
                        else {
                            CLS64.this.FLD224.MTH2869(this.FLD218, new Object[]{object0});
                        }
                    }
                    if(!TextUtils.isEmpty(this.FLD213)) {
                        CLS113 ﾞⁱ0 = new CLS113(object0);
                        switch(this.FLD213) {
                            case "f": {
                                boolean0 = Boolean.FALSE;
                                break;
                            }
                            case "n": {
                                ﾞⁱ0.MTH1637(null);
                                boolean0 = Integer.valueOf(this.FLD213);
                                break;
                            }
                            case "t": {
                                boolean0 = Boolean.TRUE;
                                break;
                            }
                            default: {
                                boolean0 = Integer.valueOf(this.FLD213);
                                break;
                            }
                        }
                        ﾞⁱ0.MTH1637(boolean0);
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
        }

        String s = jSONObject0.has("be") ? jSONObject0.optString("be").trim() : "";
        String s1 = jSONObject0.has("be_a") ? jSONObject0.optString("be_a").trim() : "";
        String s2 = jSONObject0.has("s") ? jSONObject0.optString("s").trim() : "";
        String s3 = jSONObject0.has("ae") ? jSONObject0.optString("ae").trim() : "";
        return jSONObject0.has("ae_a") ? CLS111.MTH1590(new CLS418(this, s, s1, s2, s3, jSONObject0.optString("ae_a").trim())) : CLS111.MTH1590(new CLS418(this, s, s1, s2, s3, ""));
    }

    public String MTH1057() {
        return this.FLD228;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1058(String s) {
        if(TextUtils.isEmpty(s)) {
            return true;
        }
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v].trim();
            if(s1.startsWith("#e_")) {
                if(!TextUtils.isEmpty(this.MTH1069(s1.substring(3)))) {
                    return false;
                }
            }
            else if(s1.startsWith("#ne_")) {
                if(TextUtils.isEmpty(this.MTH1069(s1.substring(4)))) {
                    return false;
                }
            }
            else if(s1.endsWith("taichi")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1565()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1565()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("edxp")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1559()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1559()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("magicxp")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1566()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1566()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("xpatch")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1570()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1570()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("spatch_")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1588()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1588()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("sandhook")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1549()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1549()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("lsp")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1569()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1569()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("opatch")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1552()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1552()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("lspatch")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1571()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1571()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("ttpatch")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1572()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1572()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("sandvxp_")) {
                if(this.MTH1053(s1)) {
                    if(s1.startsWith("!")) {
                        if(CLS111.MTH1561()) {
                            return false;
                        }
                    }
                    else if(!CLS111.MTH1561()) {
                        return false;
                    }
                }
            }
            else if(s1.endsWith("vxp") && this.MTH1053(s1)) {
                if(s1.startsWith("!")) {
                    if(CLS111.MTH1564()) {
                        return false;
                    }
                }
                else if(!CLS111.MTH1564()) {
                    return false;
                }
            }
        }
        return true;
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    public void MTH1059(ClassLoader classLoader0, Context context0, boolean z) {
        if(this.FLD220.isEmpty()) {
            return;
        }
        for(Object object0: this.FLD220) {
            JSONObject jSONObject0 = (JSONObject)object0;
            try {
                if(this.FLD222.contains(jSONObject0) || jSONObject0.has("d") && !z) {
                    continue;
                }
                String s = jSONObject0.has("p") ? jSONObject0.optString("p").trim() : "";
                if(TextUtils.isEmpty(s)) {
                    continue;
                }
                int v = 0;
                String s1 = jSONObject0.has("c") ? jSONObject0.optString("c") : "";
                if(!TextUtils.isEmpty(s1)) {
                    String[] arr_s = s1.split(";");
                    int v1 = arr_s.length;
                    int v2 = 0;
                    while(v2 < v1) {
                        String s2 = arr_s[v2].trim();
                        if(!TextUtils.isEmpty(s2)) {
                            if(s2.startsWith("#")) {
                                s2 = this.MTH1069(s2);
                            }
                            if(!this.MTH1051(s, s2, classLoader0)) {
                                goto label_21;
                            }
                            goto label_39;
                        }
                    label_21:
                        ++v2;
                    }
                    goto label_25;
                }
                else if(!this.MTH1051(s, CLS98.MTH1289(s), classLoader0)) {
                label_25:
                    if(context0 == null) {
                        continue;
                    }
                    String s3 = jSONObject0.has("l") ? jSONObject0.optString("l") : "";
                    if(TextUtils.isEmpty(s3)) {
                        continue;
                    }
                    String[] arr_s1 = s3.split(";");
                    int v3 = arr_s1.length;
                    while(v < v3) {
                        String s4 = arr_s1[v].trim();
                        if(!TextUtils.isEmpty(s4)) {
                            if(s4.startsWith("#")) {
                                s4 = this.MTH1069(s4);
                            }
                            if(!this.MTH1051(s, CLS112.MTH1624(context0, s4), classLoader0)) {
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
                this.FLD222.add(jSONObject0);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final Class MTH1060(String s) {
        if(s.equals("null")) {
            return null;
        }
        Class class0 = (Class)this.FLD226.get(s);
        if(class0 != null) {
            return class0;
        }
        try {
            Class class1 = Class.forName(s);
            this.FLD226.put(s, class1);
            return class1;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    public Class MTH1061(String s) {
        return this.FLD225.containsKey(s) || this.MTH1051(s, CLS98.MTH1289(s), this.FLD223) ? ((Class)this.FLD225.get(s)) : null;
    }

    public CLS64 MTH1062(ClassLoader classLoader0) {
        this.FLD223 = classLoader0;
        return this;
    }

    public boolean MTH1063(String s) {
        return this.FLD225.containsKey(s);
    }

    // 去混淆评级： 低(39)
    // 此方法包含解密的字符串
    public final void MTH1064() {
        this.FLD226.put("int", Integer.TYPE);
        this.FLD226.put("double", Double.TYPE);
        this.FLD226.put("float", Float.TYPE);
        this.FLD226.put("long", Long.TYPE);
        this.FLD226.put("boolean", Boolean.TYPE);
        this.FLD226.put("intent", Intent.class);
        this.FLD226.put("view", View.class);
        this.FLD226.put("bundle", Bundle.class);
        this.FLD226.put("menuitem", MenuItem.class);
        this.FLD226.put("byte", Byte.TYPE);
        this.FLD226.put("byte[]", byte[].class);
        this.FLD226.put("menu", Menu.class);
        this.FLD226.put("contextmenu", ContextMenu.class);
        this.FLD226.put("charsequence", CharSequence.class);
        this.FLD226.put("context", Context.class);
        this.FLD226.put("string", String.class);
        this.FLD226.put("string[]", String[].class);
        this.FLD226.put("object", Object.class);
        this.FLD226.put("object[]", Object[].class);
        this.FLD226.put("contentvalues", ContentValues.class);
        this.FLD226.put("void", Void.TYPE);
        this.FLD226.put("message", Message.class);
        this.FLD226.put("file", File.class);
        this.FLD226.put("classloader", ClassLoader.class);
        this.FLD226.put("list", List.class);
        this.FLD226.put("application", Application.class);
        this.FLD226.put("pathclassloader", PathClassLoader.class);
        this.FLD226.put("cursor", Cursor.class);
        this.FLD226.put("contextmenuinfo", ContextMenu.ContextMenuInfo.class);
        this.FLD226.put("keyevent", KeyEvent.class);
        this.FLD226.put("menuinflater", MenuInflater.class);
        this.FLD226.put("map", Map.class);
        this.FLD226.put("jsonobject", JSONObject.class);
        this.FLD226.put("uri", Uri.class);
        this.FLD226.put("activity", Activity.class);
        this.FLD226.put("linearlayout", LinearLayout.class);
        this.FLD226.put("arraylist", ArrayList.class);
        this.FLD226.put("viewgroup", ViewGroup.class);
        this.FLD226.put("adapterview", AdapterView.class);
        this.FLD226.put("drawable", Drawable.class);
        this.FLD226.put("resources", Resources.class);
        this.FLD226.put("attributeset", AttributeSet.class);
        this.FLD226.put("bitmap", Bitmap.class);
        this.FLD226.put("motionevent", MotionEvent.class);
        this.FLD226.put("view.onclicklistener", View.OnClickListener.class);
        this.FLD226.put("editable", Editable.class);
    }

    // 检测为 Lambda 实现
    public void MTH1065() [...]

    public Class MTH1066(String s) {
        if(this.FLD225.containsKey(s)) {
            return (Class)this.FLD225.get(s);
        }
        try {
            Class class0 = CLS111.MTH1560(s, this.FLD223);
            if(class0 != null) {
                this.FLD225.put(s, class0);
                return class0;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2710(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public void MTH1067() {
        this.MTH1065();
        if(this.FLD230.isEmpty()) {
            return;
        }
        for(Object object0: this.FLD230) {
            JSONObject jSONObject0 = (JSONObject)object0;
            if(jSONObject0.optBoolean("sm")) {
                try {
                    this.MTH1071(jSONObject0, this.FLD223, false);
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }
    }

    public void MTH1068() {
        this.FLD221 = true;
    }

    // 此方法包含解密的字符串
    public final String MTH1069(String s) {
        String s3;
        if(s.startsWith("#")) {
            s = s.substring(1);
        }
        String s1 = s.trim();
        if(this.FLD233.containsKey(s1)) {
            return (String)this.FLD233.get(s1);
        }
        if(s1.contains("|")) {
            int v = s1.indexOf("|");
            String s2 = s1.substring(v + 1).trim();
            if(s2.startsWith("#")) {
                s2 = CLS98.MTH1289(s2.substring(1));
            }
            s3 = CLS98.MTH1332(s1.substring(0, v).trim(), s2);
        }
        else {
            s3 = CLS98.MTH1289(s1);
        }
        this.FLD233.put(s1, s3);
        return s3;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1070(String s) {
        switch(s) {
            case "af": {
                return this.FLD219.MTH2835();
            }
            case "mf": {
                return this.FLD219.MTH2839();
            }
            case "sf": {
                return this.FLD219.MTH2840();
            }
            default: {
                return false;
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1071(JSONObject jSONObject0, ClassLoader classLoader0, boolean z) {
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
        if(jSONObject0.has("d") && !z) {
            return;
        }
        if(jSONObject0.has("f")) {
            String s = jSONObject0.optString("f");
            if(!TextUtils.isEmpty(s) && !this.FLD219.MTH2828(s.trim())) {
                return;
            }
        }
        if(jSONObject0.has("l")) {
            String s1 = jSONObject0.optString("l");
            if(!TextUtils.isEmpty(s1) && !this.MTH1070(s1)) {
                return;
            }
        }
        if(jSONObject0.has("c")) {
            String s2 = jSONObject0.optString("c");
            if(!this.MTH1058(s2)) {
                CLS185.MTH2710(("hook: " + jSONObject0));
                CLS185.MTH2710(("skipped on condition: " + s2));
                return;
            }
        }
        Object object0 = this.MTH1056(jSONObject0);
        if(object0 == null) {
            return;
        }
        boolean z1 = jSONObject0.has("sc") && jSONObject0.optBoolean("sc");
        String s3 = jSONObject0.has("ch") ? jSONObject0.optString("ch") : "";
        if(!TextUtils.isEmpty(s3)) {
            if(this.FLD234.contains(s3)) {
                return;
            }
            String[] arr_s = s3.split(";");
            int v = 0;
            while(v < arr_s.length) {
                String[] arr_s1 = arr_s[v].split(",");
                String s4 = arr_s1[0].trim();
                if(s4.startsWith("#")) {
                    s4 = this.MTH1069(s4);
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
                    if(s4.startsWith("+")) {
                        class0 = this.MTH1061(s4.substring(1));
                        if(class0 != null) {
                            s5 = s4;
                            class1 = class0;
                            goto label_51;
                        }
                        v1 = v;
                        goto label_59;
                    }
                    else if(s4.startsWith("!")) {
                        class0 = this.MTH1060(s4.substring(1));
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
                    if(!CLS112.MTH1631(z1, s5, classLoader0, this.MTH1073(classLoader0, arr_s1, 1, arr_s1.length, object0))) {
                        goto label_59;
                    }
                }
                else {
                    v1 = v;
                    if(CLS112.MTH1606(z1, class1, classLoader0, this.MTH1073(classLoader0, arr_s1, 1, arr_s1.length, object0))) {
                        this.FLD234.add(s3);
                        return;
                    }
                    goto label_59;
                }
                this.FLD234.add(s3);
                return;
            label_59:
                v = v1 + 1;
            }
            return;
        }
        String s6 = jSONObject0.has("cha") ? jSONObject0.optString("cha") : "";
        if(!TextUtils.isEmpty(s6)) {
            if(this.FLD234.contains(s6)) {
                return;
            }
            String[] arr_s2 = s6.split(";");
            int v2 = 0;
            while(v2 < arr_s2.length) {
                String s7 = arr_s2[v2].split(",")[0].trim();
                if(s7.startsWith("#")) {
                    s7 = this.MTH1069(s7);
                    if(!TextUtils.isEmpty(s7)) {
                        class2 = null;
                        goto label_84;
                    }
                }
                else if(s7.startsWith("+")) {
                    class2 = this.MTH1061(s7.substring(1));
                    if(class2 != null) {
                        goto label_84;
                    }
                }
                else if(s7.startsWith("!")) {
                    class2 = this.MTH1060(s7.substring(1));
                    if(class2 != null) {
                        goto label_84;
                    }
                }
                else {
                    class2 = null;
                label_84:
                    if(class2 != null) {
                        if(CLS112.MTH1626(z1, class2, object0)) {
                            this.FLD234.add(s6);
                            return;
                        }
                        goto label_90;
                    }
                    else if(CLS112.MTH1632(z1, s7, classLoader0, object0)) {
                    }
                    else {
                        goto label_90;
                    }
                    this.FLD234.add(s6);
                    return;
                }
            label_90:
                ++v2;
            }
            return;
        }
        boolean z2 = false;
        String s8 = jSONObject0.has("mh") ? jSONObject0.optString("mh") : "";
        if(!TextUtils.isEmpty(s8)) {
            if(this.FLD234.contains(s8)) {
                return;
            }
            String[] arr_s3 = s8.split(";");
            int v3 = arr_s3.length;
            int v4 = 0;
            while(v4 < v3) {
                String[] arr_s4 = arr_s3[v4].split(",");
                if(arr_s4.length >= 2) {
                    String s9 = arr_s4[0].trim();
                    if(s9.startsWith("#")) {
                        s9 = this.MTH1069(s9);
                        if(!TextUtils.isEmpty(s9)) {
                            s10 = s9;
                            class3 = null;
                            goto label_123;
                        }
                    }
                    else if(s9.startsWith("+")) {
                        class3 = this.MTH1061(s9.substring(1));
                        if(class3 != null) {
                            s10 = s9;
                            goto label_123;
                        }
                    }
                    else if(s9.startsWith("!")) {
                        class3 = this.MTH1060(s9.substring(1));
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
                        if(s11.startsWith("#")) {
                            s11 = this.MTH1069(s11);
                        }
                        if(class3 == null) {
                            v5 = v4;
                            v6 = v3;
                            if(!CLS112.MTH1593(z1, s10, classLoader0, s11, this.MTH1073(classLoader0, arr_s4, 2, arr_s4.length, object0))) {
                                goto label_139;
                            }
                        }
                        else {
                            v5 = v4;
                            v6 = v3;
                            if(CLS112.MTH1629(z1, class3, s11, this.MTH1073(classLoader0, arr_s4, 2, arr_s4.length, object0))) {
                                this.FLD234.add(s8);
                                z2 = true;
                                break;
                            }
                            goto label_139;
                        }
                        this.FLD234.add(s8);
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
            String s12 = jSONObject0.has("mha") ? jSONObject0.optString("mha") : "";
            if(!TextUtils.isEmpty(s12)) {
                if(this.FLD234.contains(s12)) {
                    return;
                }
                String[] arr_s5 = s12.split(",");
                if(arr_s5.length < 2) {
                    return;
                }
                String s13 = arr_s5[0].trim();
                if(s13.startsWith("#")) {
                    s13 = this.MTH1069(s13);
                    if(TextUtils.isEmpty(s13)) {
                        return;
                    }
                    class4 = null;
                }
                else if(s13.startsWith("+")) {
                    class4 = this.MTH1061(s13.substring(1));
                    if(class4 == null) {
                        return;
                    }
                }
                else if(s13.startsWith("!")) {
                    class4 = this.MTH1060(s13.substring(1));
                    if(class4 == null) {
                        return;
                    }
                }
                else {
                    class4 = null;
                }
                String s14 = arr_s5[1].trim();
                if(s14.startsWith("#")) {
                    s14 = this.MTH1069(s14);
                }
                if(class4 != null) {
                    if(CLS112.MTH1610(z1, class4, s14, object0)) {
                        this.FLD234.add(s12);
                        z2 = true;
                    }
                }
                else if(CLS112.MTH1627(z1, s13, classLoader0, s14, object0)) {
                    this.FLD234.add(s12);
                    z2 = true;
                }
            }
        }
        if(!z2) {
            String s15 = jSONObject0.has("ml") ? jSONObject0.optString("ml") : "";
            if(TextUtils.isEmpty(s15) || this.FLD234.contains(s15)) {
                return;
            }
            String[] arr_s6 = s15.split(";");
            int v7 = 0;
            while(v7 < arr_s6.length) {
                String[] arr_s7 = arr_s6[v7].split(",");
                int v8 = Integer.parseInt(arr_s7[0].trim());
                String s16 = arr_s7[1].trim();
                if(s16.startsWith("#")) {
                    s16 = this.MTH1069(s16);
                    if(!TextUtils.isEmpty(s16)) {
                        class5 = null;
                        goto label_202;
                    }
                }
                else if(s16.startsWith("+")) {
                    Class class6 = this.MTH1061(s16.substring(1));
                    if(class6 != null) {
                        class5 = class6;
                        goto label_202;
                    }
                }
                else if(s16.startsWith("!")) {
                    class5 = this.MTH1060(s16.substring(1));
                    if(class5 != null) {
                        goto label_202;
                    }
                }
                else {
                    class5 = null;
                label_202:
                    String s17 = arr_s7[2].trim();
                    if(s17.startsWith("#")) {
                        s17 = this.MTH1069(s17);
                    }
                    else if(s17.equals("null")) {
                        s17 = null;
                    }
                    Object object1 = arr_s7.length <= 3 ? null : this.MTH1055(arr_s7[3].trim(), classLoader0);
                    if(arr_s7.length <= 4) {
                        method0 = class5 == null ? CLS112.MTH1622(s16, classLoader0, v8, s17, object1, new Object[0]) : CLS112.MTH1600(class5, v8, s17, object1, new Object[0]);
                    }
                    else if(class5 == null) {
                        method0 = CLS112.MTH1622(s16, classLoader0, v8, s17, object1, this.MTH1054(classLoader0, arr_s7, 4, arr_s7.length));
                    }
                    else {
                        method0 = CLS112.MTH1600(class5, v8, s17, object1, this.MTH1054(classLoader0, arr_s7, 4, arr_s7.length));
                    }
                    if(CLS112.MTH1599(z1, method0, object0)) {
                        this.FLD234.add(s15);
                        return;
                    }
                }
                ++v7;
            }
        }
    }

    public static CLS64 MTH1072() {
        return CLS64.FLD232;
    }

    public final Object[] MTH1073(ClassLoader classLoader0, String[] arr_s, int v, int v1, Object object0) {
        int v2 = v1 - v;
        Object[] arr_object = new Object[v2 + 1];
        arr_object[v2] = object0;
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_object[v3] = this.MTH1055(arr_s[v3 + v], classLoader0);
        }
        return arr_object;
    }

    public void MTH1075(ClassLoader classLoader0, boolean z) {
        this.MTH1065();
        if(this.FLD230.isEmpty()) {
            return;
        }
        for(Object object0: this.FLD230) {
            JSONObject jSONObject0 = (JSONObject)object0;
            try {
                this.MTH1071(jSONObject0, classLoader0, z);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public boolean MTH1076() {
        if(!CLS176.MTH2570(new File("", CLS224.MTH3090(("H_" + this.FLD231.MTH2109()))))) {
            return false;
        }
        String s = (String)CLS98.MTH1336(140, new Object[0]);
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        this.FLD220.clear();
        this.FLD230.clear();
        this.FLD234.clear();
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            if(jSONObject0.has("c")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("c");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                    this.FLD220.add(jSONObject1);
                }
            }
            if(jSONObject0.has("m")) {
                JSONArray jSONArray1 = jSONObject0.getJSONArray("m");
                for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                    JSONObject jSONObject2 = jSONArray1.getJSONObject(v1);
                    this.FLD230.add(jSONObject2);
                }
            }
            this.FLD228 = jSONObject0.optString("VERSION");
            return true;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public HashMap MTH1077() {
        return this.FLD225;
    }
}

