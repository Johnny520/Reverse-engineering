// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

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
public class CLS189 {
    public static class CLS186 {
        public String FLD884;
        public byte[] FLD885;
        public int FLD886;
        public String FLD887;

        public CLS186(byte[] arr_b, String s) {
            this.FLD886 = 200;
            this.FLD885 = arr_b;
            this.FLD884 = s;
        }

        public CLS186(byte[] arr_b, String s, int v, String s1) {
            this(arr_b, s);
            this.FLD886 = v;
            this.FLD887 = s1;
        }

        public boolean MTH3106() {
            return this.FLD885 == null;
        }
    }

    public interface CLS187 {
        void MTH3107(CLS186 arg1);
    }

    public class CLS188 extends AsyncTask {
        public CLS187 FLD888;
        public String FLD889;
        public final ArrayList FLD890;
        public String FLD891;
        public final CLS189 FLD892;
        public int FLD893;

        public CLS188(CLS187 ˆʾ$ˆٴ0) {
            this.FLD890 = new ArrayList();
            this.FLD893 = 200;
            this.FLD888 = ˆʾ$ˆٴ0;
        }

        @Override  // android.os.AsyncTask
        public Object doInBackground(Object[] arr_object) {
            return this.MTH3112(((Void[])arr_object));
        }

        @Override  // android.os.AsyncTask
        public void onPostExecute(Object object0) {
            this.MTH3111(((CLS186)object0));
        }

        public void MTH3111(CLS186 ˆʾ$ʻᵢ0) {
            CLS187 ˆʾ$ˆٴ0 = this.FLD888;
            if(ˆʾ$ˆٴ0 != null) {
                try {
                    ˆʾ$ˆٴ0.MTH3107(ˆʾ$ʻᵢ0);
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3254(this.FLD891);
                    CLS204.MTH3257(throwable0);
                }
            }
        }

        public CLS186 MTH3112(Void[] arr_void) {
            byte[] arr_b = null;
            try {
                if(CLS189.this.FLD906) {
                    if(CLS189.this.FLD898 != null && !CLS189.this.FLD898.isEmpty()) {
                        for(Object object0: CLS189.this.FLD898) {
                            String s = (String)object0;
                            byte[] arr_b1 = this.MTH3113(s);
                            if(arr_b1 != null) {
                                if(arr_b == null) {
                                    arr_b = arr_b1;
                                }
                                CLS186 ˆʾ$ʻᵢ0 = new CLS186(arr_b1, s, this.FLD893, this.FLD889);
                                this.FLD890.add(ˆʾ$ʻᵢ0);
                            }
                        }
                    }
                    if(!CLS189.this.FLD894.isEmpty() && arr_b == null) {
                        Iterator iterator1 = CLS189.this.FLD894.iterator();
                        while(true) {
                        label_16:
                            if(!iterator1.hasNext()) {
                                return new CLS186(arr_b, this.FLD891, this.FLD893, this.FLD889);
                            }
                            Object object1 = iterator1.next();
                            for(Object object2: ((ArrayList)object1)) {
                                String s1 = (String)object2;
                                byte[] arr_b2 = this.MTH3113(s1);
                                if(arr_b2 != null) {
                                    if(arr_b == null) {
                                        arr_b = arr_b2;
                                    }
                                    CLS186 ˆʾ$ʻᵢ1 = new CLS186(arr_b2, s1, this.FLD893, this.FLD889);
                                    this.FLD890.add(ˆʾ$ʻᵢ1);
                                }
                            }
                        }
                    }
                }
                else {
                    goto label_31;
                }
                return new CLS186(arr_b, this.FLD891, this.FLD893, this.FLD889);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
                return new CLS186(arr_b, this.FLD891, this.FLD893, this.FLD889);
            }
            goto label_16;
            try {
            label_31:
                if(CLS189.this.FLD898 != null && !CLS189.this.FLD898.isEmpty()) {
                    for(Object object3: CLS189.this.MTH3128(CLS189.this.FLD898)) {
                        String s2 = (String)object3;
                        arr_b = this.MTH3113(s2);
                        if(arr_b != null) {
                            return new CLS186(arr_b, s2, this.FLD893, this.FLD889);
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                if(!CLS189.this.FLD894.isEmpty()) {
                    Iterator iterator4 = CLS189.this.FLD894.iterator();
                    while(true) {
                    label_42:
                        if(!iterator4.hasNext()) {
                            break;
                        }
                        Object object4 = iterator4.next();
                        for(Object object5: ((ArrayList)object4)) {
                            String s3 = (String)object5;
                            arr_b = this.MTH3113(s3);
                            if(arr_b == null) {
                                continue;
                            }
                            return new CLS186(arr_b, s3, this.FLD893, this.FLD889);
                        }
                    }
                }
                return new CLS186(arr_b, this.FLD891, this.FLD893, this.FLD889);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
                return new CLS186(arr_b, this.FLD891, this.FLD893, this.FLD889);
            }
            goto label_42;
        }

        // 此方法包含解密的字符串
        public final byte[] MTH3113(String s) {
            HttpURLConnection httpURLConnection0;
            this.FLD891 = s.trim();
            CLS204.MTH3254(("\uD8E3etrieveResult url: " + s));
            try {
                if(!TextUtils.isEmpty(s) && !s.startsWith("\uD8E3")) {
                    if(CLS189.this.FLD896.equals("\uD8E3ET") && !CLS189.this.FLD905.isEmpty()) {
                        s = s + "\uD8E3" + CLS189.this.MTH3136(CLS189.this.FLD905);
                    }
                    URL uRL0 = new URL(s);
                    if(TextUtils.isEmpty(CLS189.this.FLD904)) {
                        httpURLConnection0 = TextUtils.isEmpty(CLS189.this.FLD897) ? null : ((HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(CLS189.this.FLD897, CLS189.this.FLD902))));
                    }
                    else {
                        httpURLConnection0 = (HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(CLS189.this.FLD904, CLS189.this.FLD900)));
                    }
                    if(httpURLConnection0 == null) {
                        httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                    }
                    httpURLConnection0.setReadTimeout(CLS189.this.FLD899);
                    httpURLConnection0.setConnectTimeout(CLS189.this.FLD895);
                    httpURLConnection0.setRequestMethod(CLS189.this.FLD896);
                    httpURLConnection0.setRequestProperty("\uD8E3ser-Agent", "\uD8E3ozilla/5.0 ( compatible ) ");
                    httpURLConnection0.setRequestProperty("\uD8E3ccept", "\uD8E3/*");
                    if(!CLS189.this.FLD909.isEmpty()) {
                        for(Object object0: CLS189.this.FLD909.keySet()) {
                            httpURLConnection0.setRequestProperty(((String)object0), ((String)CLS189.this.FLD909.get(((String)object0))));
                        }
                    }
                    if(CLS189.this.FLD896.equals("\uD8E3OST")) {
                        httpURLConnection0.setDoInput(true);
                        httpURLConnection0.setDoOutput(true);
                        OutputStream outputStream0 = httpURLConnection0.getOutputStream();
                        BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(outputStream0, StandardCharsets.UTF_8));
                        if(!CLS189.this.FLD905.isEmpty()) {
                            bufferedWriter0.write(CLS189.this.MTH3136(CLS189.this.FLD905));
                        }
                        if(!TextUtils.isEmpty(CLS189.this.FLD901)) {
                            bufferedWriter0.write(CLS189.this.FLD901);
                        }
                        if(CLS189.this.FLD903 != null) {
                            bufferedWriter0.write(CLS189.this.FLD903.toString());
                        }
                        bufferedWriter0.flush();
                        bufferedWriter0.close();
                        outputStream0.close();
                        httpURLConnection0.connect();
                    }
                    int v = httpURLConnection0.getResponseCode();
                    this.FLD893 = v;
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
                    if(!CLS189.this.FLD907) {
                        String s1 = new String(arr_b1);
                        if(TextUtils.isEmpty(s1) || s1.contains("\uD8E3!DOCTYPE html") || s1.contains("\uD8E3script") || s1.contains("\uD8E3!doctype") || s1.contains("\uD8E3html") || CLS170.MTH3008("", s1)) {
                            CLS204.MTH3254(("\uD8E3kipped: " + s));
                            CLS204.MTH3254(("\uD8E3es: " + s1));
                            return null;
                        }
                    }
                    return arr_b1;
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3254(s);
                CLS204.MTH3252(throwable0.getMessage());
                this.FLD889 = throwable0.getMessage();
            }
            return null;
        }
    }

    public final ArrayList FLD894;
    public int FLD895;
    public String FLD896;
    public String FLD897;
    public final ArrayList FLD898;
    public int FLD899;
    public int FLD900;
    public String FLD901;
    public int FLD902;
    public JSONObject FLD903;
    public String FLD904;
    public final HashMap FLD905;
    public boolean FLD906;
    public boolean FLD907;
    public boolean FLD908;
    public final HashMap FLD909;

    // 此方法包含解密的字符串
    public CLS189() {
        this.FLD899 = 30000;
        this.FLD895 = 5000;
        this.FLD898 = new ArrayList();
        this.FLD894 = new ArrayList();
        this.FLD905 = new HashMap();
        this.FLD909 = new HashMap();
        this.FLD896 = "\uD8E3ET";
        this.FLD908 = true;
        this.FLD906 = false;
        this.FLD907 = false;
    }

    public CLS189(Collection collection0) {
        this.MTH3124(collection0);
    }

    public final ArrayList MTH3121(Collection collection0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            String s = (String)object0;
            if(!arrayList0.contains(s) && !this.MTH3143(s)) {
                arrayList0.add(s);
            }
        }
        return arrayList0;
    }

    public CLS189 MTH3123(String s) {
        this.FLD896 = s.toUpperCase();
        return this;
    }

    public CLS189 MTH3124(Collection collection0) {
        if(collection0 != null && !collection0.isEmpty()) {
            ArrayList arrayList0 = this.MTH3121(collection0);
            this.FLD898.addAll(arrayList0);
        }
        return this;
    }

    public final Collection MTH3128(Collection collection0) {
        if(!this.FLD908) {
            return collection0;
        }
        List list0 = Arrays.asList(((String[])collection0.toArray(new String[0])));
        Collections.shuffle(list0);
        return list0;
    }

    public CLS189 MTH3129(boolean z) {
        this.FLD908 = z;
        return this;
    }

    public CLS189 MTH3133(String s, String s1) {
        this.FLD905.put(s, s1);
        return this;
    }

    public CLS189 MTH3134(String s) {
        if(!TextUtils.isEmpty(s) && !this.MTH3143(s)) {
            this.FLD898.add(s);
        }
        return this;
    }

    // 此方法包含解密的字符串
    public final String MTH3136(HashMap hashMap0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            boolean z = true;
            for(Object object0: hashMap0.entrySet()) {
                if(z) {
                    z = false;
                }
                else {
                    stringBuilder0.append("\uD8E3");
                }
                stringBuilder0.append(URLEncoder.encode(((String)((Map.Entry)object0).getKey()), "\uD8E3TF-8"));
                stringBuilder0.append("\uD8E3");
                stringBuilder0.append(URLEncoder.encode(((String)((Map.Entry)object0).getValue()), "\uD8E3TF-8"));
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return stringBuilder0.toString();
    }

    public CLS189 MTH3137(ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = this.MTH3121(arrayList0);
            this.FLD894.add(arrayList1);
        }
        return this;
    }

    public CLS189 MTH3139(boolean z) {
        this.FLD906 = z;
        return this;
    }

    public final boolean MTH3143(String s) {
        if(this.FLD898.contains(s)) {
            return true;
        }
        for(Object object0: this.FLD894) {
            if(((ArrayList)object0).contains(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public CLS189 MTH3144(CLS187 ˆʾ$ˆٴ0) {
        new CLS188(this, ˆʾ$ˆٴ0).execute(new Void[0]);
        return this;
    }
}

