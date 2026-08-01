// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONObject;

@SuppressLint({"NewApi"})
public class CLS214 {
    public class CLS211 extends AsyncTask {
        public String FLD851;
        public String FLD852;
        public int FLD853;
        public final CLS214 FLD854;
        public final ArrayList FLD855;
        public CLS212 FLD856;

        public CLS211(CLS212 ᵢᵔ$ⁱˋ0) {
            this.FLD855 = new ArrayList();
            this.FLD853 = 200;
            this.FLD856 = ᵢᵔ$ⁱˋ0;
        }

        @Override  // android.os.AsyncTask
        public Object doInBackground(Object[] arr_object) {
            return this.MTH2994(((Void[])arr_object));
        }

        @Override  // android.os.AsyncTask
        public void onPostExecute(Object object0) {
            this.MTH2995(((CLS213)object0));
        }

        // 此方法包含解密的字符串
        public final byte[] MTH2993(String s) {
            HttpURLConnection httpURLConnection0;
            this.FLD851 = s.trim();
            CLS185.MTH2710(("retrieveResult url: " + s));
            try {
                if(!TextUtils.isEmpty(s) && !s.startsWith("#")) {
                    if(CLS214.this.FLD864.equals("GET") && !CLS214.this.FLD861.isEmpty()) {
                        s = s + "?" + CLS214.this.MTH3003(CLS214.this.FLD861);
                    }
                    URL uRL0 = new URL(s);
                    if(TextUtils.isEmpty(CLS214.this.FLD865)) {
                        httpURLConnection0 = TextUtils.isEmpty(CLS214.this.FLD870) ? null : ((HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(CLS214.this.FLD870, CLS214.this.FLD874))));
                    }
                    else {
                        httpURLConnection0 = (HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(CLS214.this.FLD865, CLS214.this.FLD869)));
                    }
                    if(httpURLConnection0 == null) {
                        httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                    }
                    httpURLConnection0.setReadTimeout(CLS214.this.FLD867);
                    httpURLConnection0.setConnectTimeout(CLS214.this.FLD863);
                    httpURLConnection0.setRequestMethod(CLS214.this.FLD864);
                    httpURLConnection0.setRequestProperty("User-Agent", "Mozilla/5.0 ( compatible ) ");
                    httpURLConnection0.setRequestProperty("Accept", "*/*");
                    if(!CLS214.this.FLD866.isEmpty()) {
                        for(Object object0: CLS214.this.FLD866.keySet()) {
                            httpURLConnection0.setRequestProperty(((String)object0), ((String)CLS214.this.FLD866.get(((String)object0))));
                        }
                    }
                    if(CLS214.this.FLD864.equals("POST")) {
                        httpURLConnection0.setDoInput(true);
                        httpURLConnection0.setDoOutput(true);
                        OutputStream outputStream0 = httpURLConnection0.getOutputStream();
                        BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(outputStream0, StandardCharsets.UTF_8));
                        if(!CLS214.this.FLD861.isEmpty()) {
                            bufferedWriter0.write(CLS214.this.MTH3003(CLS214.this.FLD861));
                        }
                        if(!TextUtils.isEmpty(CLS214.this.FLD862)) {
                            bufferedWriter0.write(CLS214.this.FLD862);
                        }
                        if(CLS214.this.FLD872 != null) {
                            bufferedWriter0.write(CLS214.this.FLD872.toString());
                        }
                        bufferedWriter0.flush();
                        bufferedWriter0.close();
                        outputStream0.close();
                        httpURLConnection0.connect();
                    }
                    int v = httpURLConnection0.getResponseCode();
                    this.FLD853 = v;
                    if(v != 200) {
                        return null;
                    }
                    InputStream inputStream0 = httpURLConnection0.getInputStream();
                    byte[] arr_b = new byte[0x400];
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    int v1;
                    while((v1 = inputStream0.read(arr_b)) != -1) {
                        byteArrayOutputStream0.write(arr_b, 0, v1);
                    }
                    byteArrayOutputStream0.flush();
                    byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                    byteArrayOutputStream0.close();
                    inputStream0.close();
                    httpURLConnection0.disconnect();
                    if(!CLS214.this.FLD871) {
                        String s1 = new String(arr_b1);
                        if(TextUtils.isEmpty(s1) || s1.contains("<!DOCTYPE html") || s1.contains("<script") || s1.contains("<!doctype") || s1.contains("<html") || CLS197.MTH2931("", s1)) {
                            CLS185.MTH2710(("skipped: " + s));
                            CLS185.MTH2710(("res: " + s1));
                            return null;
                        }
                    }
                    return arr_b1;
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2710(s);
                CLS185.MTH2711(throwable0.getMessage());
                this.FLD852 = throwable0.getMessage();
            }
            return null;
        }

        public CLS213 MTH2994(Void[] arr_void) {
            byte[] arr_b = null;
            try {
                if(CLS214.this.FLD875) {
                    if(CLS214.this.FLD873 != null && !CLS214.this.FLD873.isEmpty()) {
                        for(Object object0: CLS214.this.FLD873) {
                            String s = (String)object0;
                            byte[] arr_b1 = this.MTH2993(s);
                            if(arr_b1 != null) {
                                if(arr_b == null) {
                                    arr_b = arr_b1;
                                }
                                CLS213 ᵢᵔ$ﾞⁱ0 = new CLS213(arr_b1, s, this.FLD853, this.FLD852);
                                this.FLD855.add(ᵢᵔ$ﾞⁱ0);
                            }
                        }
                    }
                    if(!CLS214.this.FLD876.isEmpty() && arr_b == null) {
                        Iterator iterator1 = CLS214.this.FLD876.iterator();
                        while(true) {
                        label_16:
                            if(!iterator1.hasNext()) {
                                return new CLS213(arr_b, this.FLD851, this.FLD853, this.FLD852);
                            }
                            Object object1 = iterator1.next();
                            for(Object object2: ((ArrayList)object1)) {
                                String s1 = (String)object2;
                                byte[] arr_b2 = this.MTH2993(s1);
                                if(arr_b2 != null) {
                                    if(arr_b == null) {
                                        arr_b = arr_b2;
                                    }
                                    CLS213 ᵢᵔ$ﾞⁱ1 = new CLS213(arr_b2, s1, this.FLD853, this.FLD852);
                                    this.FLD855.add(ᵢᵔ$ﾞⁱ1);
                                }
                            }
                        }
                    }
                }
                else {
                    goto label_31;
                }
                return new CLS213(arr_b, this.FLD851, this.FLD853, this.FLD852);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
                return new CLS213(arr_b, this.FLD851, this.FLD853, this.FLD852);
            }
            goto label_16;
            try {
            label_31:
                if(CLS214.this.FLD873 != null && !CLS214.this.FLD873.isEmpty()) {
                    for(Object object3: CLS214.this.MTH3020(CLS214.this.FLD873)) {
                        String s2 = (String)object3;
                        arr_b = this.MTH2993(s2);
                        if(arr_b != null) {
                            return new CLS213(arr_b, s2, this.FLD853, this.FLD852);
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                if(!CLS214.this.FLD876.isEmpty()) {
                    Iterator iterator4 = CLS214.this.FLD876.iterator();
                    while(true) {
                    label_42:
                        if(!iterator4.hasNext()) {
                            break;
                        }
                        Object object4 = iterator4.next();
                        for(Object object5: ((ArrayList)object4)) {
                            String s3 = (String)object5;
                            arr_b = this.MTH2993(s3);
                            if(arr_b == null) {
                                continue;
                            }
                            return new CLS213(arr_b, s3, this.FLD853, this.FLD852);
                        }
                    }
                }
                return new CLS213(arr_b, this.FLD851, this.FLD853, this.FLD852);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
                return new CLS213(arr_b, this.FLD851, this.FLD853, this.FLD852);
            }
            goto label_42;
        }

        public void MTH2995(CLS213 ᵢᵔ$ﾞⁱ0) {
            CLS212 ᵢᵔ$ⁱˋ0 = this.FLD856;
            if(ᵢᵔ$ⁱˋ0 != null) {
                try {
                    ᵢᵔ$ⁱˋ0.MTH2996(ᵢᵔ$ﾞⁱ0);
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2710(this.FLD851);
                    CLS185.MTH2708(throwable0);
                }
            }
        }
    }

    public interface CLS212 {
        void MTH2996(CLS213 arg1);
    }

    public static class CLS213 {
        public int FLD857;
        public String FLD858;
        public byte[] FLD859;
        public String FLD860;

        public CLS213(byte[] arr_b, String s) {
            this.FLD857 = 200;
            this.FLD859 = arr_b;
            this.FLD860 = s;
        }

        public CLS213(byte[] arr_b, String s, int v, String s1) {
            this(arr_b, s);
            this.FLD857 = v;
            this.FLD858 = s1;
        }

        public boolean MTH2999() {
            return this.FLD859 == null;
        }
    }

    public final HashMap FLD861;
    public String FLD862;
    public int FLD863;
    public String FLD864;
    public String FLD865;
    public final HashMap FLD866;
    public int FLD867;
    public boolean FLD868;
    public int FLD869;
    public String FLD870;
    public boolean FLD871;
    public JSONObject FLD872;
    public final ArrayList FLD873;
    public int FLD874;
    public boolean FLD875;
    public final ArrayList FLD876;

    // 此方法包含解密的字符串
    public CLS214() {
        this.FLD867 = 30000;
        this.FLD863 = 5000;
        this.FLD873 = new ArrayList();
        this.FLD876 = new ArrayList();
        this.FLD861 = new HashMap();
        this.FLD866 = new HashMap();
        this.FLD864 = "GET";
        this.FLD868 = true;
        this.FLD875 = false;
        this.FLD871 = false;
    }

    public CLS214(Collection collection0) {
        this.MTH3016(collection0);
    }

    public CLS214 MTH3002(boolean z) {
        this.FLD875 = z;
        return this;
    }

    // 此方法包含解密的字符串
    public final String MTH3003(HashMap hashMap0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            boolean z = true;
            for(Object object0: hashMap0.entrySet()) {
                if(z) {
                    z = false;
                }
                else {
                    stringBuilder0.append("&");
                }
                stringBuilder0.append(URLEncoder.encode(((String)((Map.Entry)object0).getKey()), "UTF-8"));
                stringBuilder0.append("=");
                stringBuilder0.append(URLEncoder.encode(((String)((Map.Entry)object0).getValue()), "UTF-8"));
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return stringBuilder0.toString();
    }

    public final boolean MTH3006(String s) {
        if(this.FLD873.contains(s)) {
            return true;
        }
        for(Object object0: this.FLD876) {
            if(((ArrayList)object0).contains(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public CLS214 MTH3011(String s) {
        this.FLD864 = s.toUpperCase();
        return this;
    }

    public final ArrayList MTH3014(Collection collection0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            String s = (String)object0;
            if(!arrayList0.contains(s) && !this.MTH3006(s)) {
                arrayList0.add(s);
            }
        }
        return arrayList0;
    }

    public CLS214 MTH3016(Collection collection0) {
        if(collection0 != null && !collection0.isEmpty()) {
            ArrayList arrayList0 = this.MTH3014(collection0);
            this.FLD873.addAll(arrayList0);
        }
        return this;
    }

    public CLS214 MTH3017(String s, String s1) {
        this.FLD861.put(s, s1);
        return this;
    }

    public CLS214 MTH3018(String s) {
        if(!TextUtils.isEmpty(s) && !this.MTH3006(s)) {
            this.FLD873.add(s);
        }
        return this;
    }

    public final Collection MTH3020(Collection collection0) {
        if(!this.FLD868) {
            return collection0;
        }
        List list0 = Arrays.asList(((String[])collection0.toArray(new String[0])));
        Collections.shuffle(list0);
        return list0;
    }

    public CLS214 MTH3021(CLS212 ᵢᵔ$ⁱˋ0) {
        new CLS211(this, ᵢᵔ$ⁱˋ0).execute(new Void[0]);
        return this;
    }

    public CLS214 MTH3022(ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = this.MTH3014(arrayList0);
            this.FLD876.add(arrayList1);
        }
        return this;
    }

    public CLS214 MTH3028(boolean z) {
        this.FLD868 = z;
        return this;
    }
}

