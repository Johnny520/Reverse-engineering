// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.os.AsyncTask;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONObject;

public final class CLS423 {
    public interface CLS420 {
        void MTH6065(CLS422 arg1);
    }

    public final class CLS421 extends AsyncTask {
        public final CLS420 FLD4064;
        public final CLS423 FLD4065;
        public int FLD4066;
        public String FLD4067;
        public String FLD4068;

        public CLS421(CLS420 ˊⁱ$ˆٴ0) {
            new ArrayList();
            this.FLD4066 = 200;
            this.FLD4064 = ˊⁱ$ˆٴ0;
        }

        @Override  // android.os.AsyncTask
        public final Object doInBackground(Object[] arr_object) {
            Void[] arr_void = (Void[])arr_object;
            CLS423 ˊⁱ0 = CLS423.this;
            byte[] arr_b = null;
            try {
                ˊⁱ0.getClass();
                List list0 = ˊⁱ0.FLD4075;
                if(list0 != null && !((ArrayList)list0).isEmpty()) {
                    if(ˊⁱ0.FLD4086) {
                        list0 = Arrays.asList(((String[])((ArrayList)list0).toArray(new String[0])));
                        Collections.shuffle(list0);
                    }
                    for(Object object0: list0) {
                        arr_b = this.MTH6069(((String)object0));
                        if(arr_b != null) {
                            return new CLS422(arr_b, this.FLD4066, this.FLD4068);
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                ArrayList arrayList0 = ˊⁱ0.FLD4082;
                if(!arrayList0.isEmpty()) {
                    Iterator iterator1 = arrayList0.iterator();
                    while(true) {
                    label_19:
                        if(!iterator1.hasNext()) {
                            break;
                        }
                        Object object1 = iterator1.next();
                        for(Object object2: ((ArrayList)object1)) {
                            arr_b = this.MTH6069(((String)object2));
                            if(arr_b == null) {
                                continue;
                            }
                            return new CLS422(arr_b, this.FLD4066, this.FLD4068);
                        }
                    }
                }
                return new CLS422(null, this.FLD4066, this.FLD4068);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return new CLS422(arr_b, this.FLD4066, this.FLD4068);
            }
            goto label_19;
        }

        @Override  // android.os.AsyncTask
        public final void onPostExecute(Object object0) {
            CLS422 ˊⁱ$ᵔʾ0 = (CLS422)object0;
            CLS420 ˊⁱ$ˆٴ0 = this.FLD4064;
            if(ˊⁱ$ˆٴ0 != null) {
                try {
                    ˊⁱ$ˆٴ0.MTH6065(ˊⁱ$ᵔʾ0);
                }
                catch(Throwable throwable0) {
                    CLS412.MTH5995(this.FLD4067);
                    CLS27.MTH893(throwable0);
                }
            }
        }

        // 此方法包含解密的字符串
        public final byte[] MTH6069(String s) {
            HttpURLConnection httpURLConnection0;
            CLS423 ˊⁱ0 = CLS423.this;
            this.FLD4067 = s.trim();
            CLS412.MTH5995(("retrieveResult url: " + s));
            try {
                if(TextUtils.isEmpty(s) || s.startsWith("#")) {
                    return null;
                }
                HashMap hashMap0 = ˊⁱ0.FLD4080;
                if(ˊⁱ0.FLD4078.equals("GET") && !hashMap0.isEmpty()) {
                    s = s + "?" + CLS423.MTH6074(ˊⁱ0, hashMap0);
                }
                URL uRL0 = new URL(s);
                if(TextUtils.isEmpty(ˊⁱ0.FLD4081)) {
                    httpURLConnection0 = TextUtils.isEmpty(ˊⁱ0.FLD4084) ? null : ((HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(ˊⁱ0.FLD4084, ˊⁱ0.FLD4077))));
                }
                else {
                    httpURLConnection0 = (HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ˊⁱ0.FLD4081, ˊⁱ0.FLD4079)));
                }
                if(httpURLConnection0 == null) {
                    httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                }
                httpURLConnection0.setReadTimeout(ˊⁱ0.FLD4072);
                httpURLConnection0.setConnectTimeout(ˊⁱ0.FLD4076);
                httpURLConnection0.setRequestMethod(ˊⁱ0.FLD4078);
                httpURLConnection0.setRequestProperty("User-Agent", "Mozilla/5.0 ( compatible ) ");
                httpURLConnection0.setRequestProperty("Accept", "*/*");
                HashMap hashMap1 = ˊⁱ0.FLD4083;
                if(!hashMap1.isEmpty()) {
                    for(Object object0: hashMap1.keySet()) {
                        httpURLConnection0.setRequestProperty(((String)object0), ((String)hashMap1.get(((String)object0))));
                    }
                }
                if(ˊⁱ0.FLD4078.equals("POST")) {
                    httpURLConnection0.setDoInput(true);
                    httpURLConnection0.setDoOutput(true);
                    OutputStream outputStream0 = httpURLConnection0.getOutputStream();
                    BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(outputStream0, StandardCharsets.UTF_8));
                    if(!hashMap0.isEmpty()) {
                        bufferedWriter0.write(CLS423.MTH6074(ˊⁱ0, hashMap0));
                    }
                    if(!TextUtils.isEmpty(ˊⁱ0.FLD4073)) {
                        bufferedWriter0.write(ˊⁱ0.FLD4073);
                    }
                    JSONObject jSONObject0 = ˊⁱ0.FLD4074;
                    if(jSONObject0 != null) {
                        bufferedWriter0.write(jSONObject0.toString());
                    }
                    bufferedWriter0.flush();
                    bufferedWriter0.close();
                    outputStream0.close();
                    httpURLConnection0.connect();
                }
                int v = httpURLConnection0.getResponseCode();
                this.FLD4066 = v;
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
                if(ˊⁱ0.FLD4085) {
                    return arr_b1;
                }
                String s1 = new String(arr_b1);
                if(!TextUtils.isEmpty(s1) && !s1.contains("<!DOCTYPE html") && !s1.contains("<script") && !s1.contains("<!doctype") && !s1.contains("<html") && !CLS502.MTH6930(CLS27.MTH882("http_post_check"), s1)) {
                    return arr_b1;
                }
            }
            catch(Throwable throwable0) {
                CLS412.MTH5995(s);
                CLS27.MTH906(throwable0.getMessage());
                this.FLD4068 = throwable0.getMessage();
            }
            return null;
        }
    }

    public static final class CLS422 {
        public final byte[] FLD4069;
        public final String FLD4070;
        public final int FLD4071;

        public CLS422(byte[] arr_b, int v, String s) {
            this.FLD4069 = arr_b;
            this.FLD4071 = v;
            this.FLD4070 = s;
        }

        // 去混淆评级： 中等(50)
        // 此方法包含解密的字符串
        public final String MTH6071() {
            return this.FLD4069 == null ? new String(this.FLD4069) : "";
        }
    }

    public int FLD4072;
    public String FLD4073;
    public JSONObject FLD4074;
    public final ArrayList FLD4075;
    public int FLD4076;
    public int FLD4077;
    public String FLD4078;
    public int FLD4079;
    public final HashMap FLD4080;
    public String FLD4081;
    public final ArrayList FLD4082;
    public final HashMap FLD4083;
    public String FLD4084;
    public boolean FLD4085;
    public final boolean FLD4086;

    // 此方法包含解密的字符串
    public CLS423() {
        this.FLD4072 = 30000;
        this.FLD4076 = 5000;
        this.FLD4075 = new ArrayList();
        this.FLD4082 = new ArrayList();
        this.FLD4080 = new HashMap();
        this.FLD4083 = new HashMap();
        this.FLD4078 = "GET";
        this.FLD4086 = true;
        this.FLD4085 = false;
    }

    // 此方法包含解密的字符串
    public CLS423(String s) {
        if(CLS502.MTH6934(s, new String[]{";"})) {
            List list0 = Arrays.asList(s.split(";"));
            if(list0 != null && !list0.isEmpty()) {
                ArrayList arrayList0 = this.FLD4075;
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: list0) {
                    String s1 = (String)object0;
                    if(!arrayList1.contains(s1) && !this.MTH6075(s1)) {
                        arrayList1.add(s1);
                    }
                }
                arrayList0.addAll(arrayList1);
            }
        }
        else if(!TextUtils.isEmpty(s) && !this.MTH6075(s)) {
            this.FLD4075.add(s);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH6074(CLS423 ˊⁱ0, HashMap hashMap0) {
        ˊⁱ0.getClass();
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
            CLS27.MTH893(throwable0);
        }
        return stringBuilder0.toString();
    }

    public final boolean MTH6075(String s) {
        if(this.FLD4075.contains(s)) {
            return true;
        }
        for(Object object0: this.FLD4082) {
            if(((ArrayList)object0).contains(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final void MTH6076(String s, String s1) {
        this.FLD4080.put(s, s1);
    }

    public final void MTH6077(String s, String s1) {
        this.FLD4083.put(s, s1);
    }

    public final void MTH6078(CLS420 ˊⁱ$ˆٴ0) {
        new CLS421(this, ˊⁱ$ˆٴ0).execute(new Void[0]);
    }
}

