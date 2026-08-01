// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.os.AsyncTask;
import android.text.TextUtils;
import d.יʻ.CLS69;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

public final class CLS21 {
    public interface CLS17 {
        void MTH446(CLS20 arg1);
    }

    public interface CLS18 {
    }

    public final class CLS19 extends AsyncTask {
        public final CLS18 FLD65;
        public final CLS21 FLD66;
        public final ArrayList FLD67;
        public String FLD68;
        public final CLS17 FLD69;

        public CLS19(CLS17 ʾﹶ$יʻ0) {
            this.FLD67 = new ArrayList();
            this.FLD69 = ʾﹶ$יʻ0;
        }

        public CLS19(CLS171 ﹶʿ0) {
            this.FLD67 = new ArrayList();
            this.FLD65 = ﹶʿ0;
        }

        // 此方法包含解密的字符串
        @Override  // android.os.AsyncTask
        public final Object doInBackground(Object[] arr_object) {
            Void[] arr_void = (Void[])arr_object;
            CLS21 ʾﹶ0 = CLS21.this;
            byte[] arr_b = null;
            ArrayList arrayList0 = ʾﹶ0.FLD72;
            List list0 = ʾﹶ0.FLD75;
            try {
                if(ʾﹶ0.FLD74) {
                    ArrayList arrayList1 = this.FLD67;
                    if(list0 != null && !((ArrayList)list0).isEmpty()) {
                        for(Object object0: ((ArrayList)list0)) {
                            String s = (String)object0;
                            byte[] arr_b1 = this.MTH452(s);
                            if(arr_b1 != null) {
                                if(arr_b == null) {
                                    arr_b = arr_b1;
                                }
                                arrayList1.add(new CLS20(arr_b1, s));
                            }
                        }
                    }
                    CLS13.MTH434(("results: " + arrayList1));
                    if(!arrayList0.isEmpty() && arrayList1.isEmpty()) {
                        CLS13.MTH434("alt url check");
                        Iterator iterator1 = arrayList0.iterator();
                        while(true) {
                        label_22:
                            if(!iterator1.hasNext()) {
                                return new CLS20(arr_b, this.FLD68);
                            }
                            Object object1 = iterator1.next();
                            for(Object object2: ((ArrayList)object1)) {
                                String s1 = (String)object2;
                                byte[] arr_b2 = this.MTH452(s1);
                                if(arr_b2 != null) {
                                    if(arr_b == null) {
                                        arr_b = arr_b2;
                                    }
                                    arrayList1.add(new CLS20(arr_b2, s1));
                                }
                            }
                        }
                    }
                }
                else {
                    goto label_36;
                }
                return new CLS20(arr_b, this.FLD68);
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
                return new CLS20(arr_b, this.FLD68);
            }
            goto label_22;
            try {
            label_36:
                if(list0 != null && !((ArrayList)list0).isEmpty()) {
                    if(ʾﹶ0.FLD78) {
                        list0 = Arrays.asList(((String[])((ArrayList)list0).toArray(new String[0])));
                        Collections.shuffle(list0);
                    }
                    for(Object object3: list0) {
                        String s2 = (String)object3;
                        arr_b = this.MTH452(s2);
                        if(arr_b != null) {
                            return new CLS20(arr_b, s2);
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                if(!arrayList0.isEmpty()) {
                    Iterator iterator4 = arrayList0.iterator();
                    while(true) {
                    label_50:
                        if(!iterator4.hasNext()) {
                            break;
                        }
                        Object object4 = iterator4.next();
                        for(Object object5: ((ArrayList)object4)) {
                            String s3 = (String)object5;
                            arr_b = this.MTH452(s3);
                            if(arr_b == null) {
                                continue;
                            }
                            return new CLS20(arr_b, s3);
                        }
                    }
                }
                return new CLS20(arr_b, this.FLD68);
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
                return new CLS20(arr_b, this.FLD68);
            }
            goto label_50;
        }

        @Override  // android.os.AsyncTask
        public final void onPostExecute(Object object0) {
            CLS20 ʾﹶ$ⁱٴ0 = (CLS20)object0;
            try {
                CLS17 ʾﹶ$יʻ0 = this.FLD69;
                if(ʾﹶ$יʻ0 != null) {
                    ʾﹶ$יʻ0.MTH446(ʾﹶ$ⁱٴ0);
                }
                CLS18 ʾﹶ$ᐧי0 = this.FLD65;
                if(ʾﹶ$ᐧי0 != null) {
                    ((CLS171)ʾﹶ$ᐧי0).MTH707(this.FLD67);
                }
            }
            catch(Throwable throwable0) {
                CLS13.MTH434(this.FLD68);
                CLS69.MTH797(throwable0);
            }
        }

        // 此方法包含解密的字符串
        public final byte[] MTH451(String s) {
            boolean z;
            CLS21 ʾﹶ0 = CLS21.this;
            this.FLD68 = s.trim();
            CLS13.MTH434(("retrieveResultSecure url: " + s));
            try {
                if(!TextUtils.isEmpty(s) && !s.startsWith("#")) {
                    HttpsURLConnection httpsURLConnection0 = (HttpsURLConnection)new URL(s).openConnection();
                    httpsURLConnection0.setReadTimeout(30000);
                    httpsURLConnection0.setConnectTimeout(5000);
                    httpsURLConnection0.setRequestMethod(ʾﹶ0.FLD73);
                    httpsURLConnection0.setRequestProperty("User-Agent", "Mozilla/5.0 ( compatible ) ");
                    httpsURLConnection0.setRequestProperty("Accept", "*/*");
                    HashMap hashMap0 = ʾﹶ0.FLD76;
                    if(!hashMap0.isEmpty()) {
                        for(Object object0: hashMap0.keySet()) {
                            httpsURLConnection0.setRequestProperty(((String)object0), ((String)hashMap0.get(((String)object0))));
                        }
                    }
                    if(ʾﹶ0.FLD73.equals("POST")) {
                        httpsURLConnection0.setDoInput(true);
                        httpsURLConnection0.setDoOutput(true);
                        OutputStream outputStream0 = httpsURLConnection0.getOutputStream();
                        BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(outputStream0, StandardCharsets.UTF_8));
                        bufferedWriter0.write(CLS21.MTH461(ʾﹶ0, ʾﹶ0.FLD77));
                        bufferedWriter0.flush();
                        bufferedWriter0.close();
                        outputStream0.close();
                        httpsURLConnection0.connect();
                    }
                    if(httpsURLConnection0.getResponseCode() != 200) {
                        return null;
                    }
                    InputStream inputStream0 = httpsURLConnection0.getInputStream();
                    byte[] arr_b = new byte[0x400];
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    while(true) {
                        int v = inputStream0.read(arr_b);
                        z = false;
                        if(v == -1) {
                            break;
                        }
                        byteArrayOutputStream0.write(arr_b, 0, v);
                    }
                    byteArrayOutputStream0.flush();
                    byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                    byteArrayOutputStream0.close();
                    inputStream0.close();
                    httpsURLConnection0.disconnect();
                    String s1 = new String(arr_b1);
                    if(!TextUtils.isEmpty(s1) && !s1.contains("<!DOCTYPE html") && !s1.contains("<script") && !s1.contains("<!doctype") && !s1.contains("<html")) {
                        String s2 = CLS69.MTH806("http_post_check");
                        if(!TextUtils.isEmpty(s2)) {
                            Pattern pattern0 = Pattern.compile(s2, 2);
                            if(pattern0 != null) {
                                z = pattern0.matcher(s1).find();
                            }
                        }
                        if(!z) {
                            return arr_b1;
                        }
                    }
                    CLS13.MTH434(("skipped: " + s1));
                }
            }
            catch(Throwable throwable0) {
                CLS13.MTH434(s);
                CLS69.MTH809(throwable0.getMessage());
            }
            return null;
        }

        // 此方法包含解密的字符串
        public final byte[] MTH452(String s) {
            boolean z;
            CLS21 ʾﹶ0 = CLS21.this;
            this.FLD68 = s.trim();
            CLS13.MTH434(("retrieveResult url: " + s));
            try {
                if(!TextUtils.isEmpty(s) && !s.startsWith("#")) {
                    HashMap hashMap0 = ʾﹶ0.FLD77;
                    if(ʾﹶ0.FLD73.equals("GET") && !hashMap0.isEmpty()) {
                        s = s + "?" + CLS21.MTH461(ʾﹶ0, hashMap0);
                    }
                    if(s.startsWith("https")) {
                        return this.MTH451(s);
                    }
                    HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL(s).openConnection();
                    httpURLConnection0.setReadTimeout(30000);
                    httpURLConnection0.setConnectTimeout(5000);
                    httpURLConnection0.setRequestMethod(ʾﹶ0.FLD73);
                    httpURLConnection0.setRequestProperty("User-Agent", "Mozilla/5.0 ( compatible ) ");
                    httpURLConnection0.setRequestProperty("Accept", "*/*");
                    HashMap hashMap1 = ʾﹶ0.FLD76;
                    if(!hashMap1.isEmpty()) {
                        for(Object object0: hashMap1.keySet()) {
                            httpURLConnection0.setRequestProperty(((String)object0), ((String)hashMap1.get(((String)object0))));
                        }
                    }
                    if(ʾﹶ0.FLD73.equals("POST")) {
                        httpURLConnection0.setDoInput(true);
                        httpURLConnection0.setDoOutput(true);
                        OutputStream outputStream0 = httpURLConnection0.getOutputStream();
                        BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(outputStream0, StandardCharsets.UTF_8));
                        bufferedWriter0.write(CLS21.MTH461(ʾﹶ0, hashMap0));
                        bufferedWriter0.flush();
                        bufferedWriter0.close();
                        outputStream0.close();
                        httpURLConnection0.connect();
                    }
                    if(httpURLConnection0.getResponseCode() != 200) {
                        return null;
                    }
                    InputStream inputStream0 = httpURLConnection0.getInputStream();
                    byte[] arr_b = new byte[0x400];
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    while(true) {
                        int v = inputStream0.read(arr_b);
                        z = false;
                        if(v == -1) {
                            break;
                        }
                        byteArrayOutputStream0.write(arr_b, 0, v);
                    }
                    byteArrayOutputStream0.flush();
                    byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                    byteArrayOutputStream0.close();
                    inputStream0.close();
                    httpURLConnection0.disconnect();
                    String s1 = new String(arr_b1);
                    if(!TextUtils.isEmpty(s1) && !s1.contains("<!DOCTYPE html") && !s1.contains("<script") && !s1.contains("<!doctype") && !s1.contains("<html")) {
                        String s2 = CLS69.MTH806("http_post_check");
                        if(!TextUtils.isEmpty(s2)) {
                            Pattern pattern0 = Pattern.compile(s2, 2);
                            if(pattern0 != null) {
                                z = pattern0.matcher(s1).find();
                            }
                        }
                        if(!z) {
                            return arr_b1;
                        }
                    }
                    CLS13.MTH434(("skipped: " + s1));
                }
            }
            catch(Throwable throwable0) {
                CLS13.MTH434(s);
                CLS69.MTH809(throwable0.getMessage());
            }
            return null;
        }
    }

    public static final class CLS20 {
        public final String FLD70;
        public final byte[] FLD71;

        public CLS20(byte[] arr_b, String s) {
            this.FLD71 = arr_b;
            this.FLD70 = s;
        }

        public final boolean MTH454() {
            return this.FLD71 == null;
        }

        // 去混淆评级： 低(40)
        // 此方法包含解密的字符串
        public final String MTH455() {
            return this.MTH454() ? "" : new String(this.FLD71);
        }
    }

    public final ArrayList FLD72;
    public String FLD73;
    public boolean FLD74;
    public final ArrayList FLD75;
    public final HashMap FLD76;
    public final HashMap FLD77;
    public final boolean FLD78;

    // 此方法包含解密的字符串
    public CLS21() {
        this.FLD75 = new ArrayList();
        this.FLD72 = new ArrayList();
        this.FLD77 = new HashMap();
        this.FLD76 = new HashMap();
        this.FLD73 = "GET";
        this.FLD78 = true;
        this.FLD74 = false;
    }

    // 此方法包含解密的字符串
    public CLS21(String s) {
        if(s.contains(";")) {
            List list0 = Arrays.asList(s.split(";"));
            if(list0 != null && !list0.isEmpty()) {
                ArrayList arrayList0 = this.MTH460(list0);
                this.FLD75.addAll(arrayList0);
            }
        }
        else if(!TextUtils.isEmpty(s) && !this.MTH464(s)) {
            this.FLD75.add(s);
        }
    }

    public CLS21(AbstractCollection abstractCollection0) {
        if(!abstractCollection0.isEmpty()) {
            ArrayList arrayList0 = this.MTH460(abstractCollection0);
            this.FLD75.addAll(arrayList0);
        }
    }

    public final void MTH459(HashSet hashSet0) {
        if(!hashSet0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(hashSet0);
            if(!arrayList0.isEmpty()) {
                ArrayList arrayList1 = this.MTH460(arrayList0);
                this.FLD72.add(arrayList1);
            }
        }
    }

    public final ArrayList MTH460(Collection collection0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            String s = (String)object0;
            if(!arrayList0.contains(s) && !this.MTH464(s)) {
                arrayList0.add(s);
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static String MTH461(CLS21 ʾﹶ0, HashMap hashMap0) {
        ʾﹶ0.getClass();
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
            CLS69.MTH797(throwable0);
        }
        return stringBuilder0.toString();
    }

    public final void MTH462(CLS17 ʾﹶ$יʻ0) {
        new CLS19(this, ʾﹶ$יʻ0).execute(new Void[0]);
    }

    public final void MTH463(String s, String s1) {
        this.FLD77.put(s, s1);
    }

    public final boolean MTH464(String s) {
        if(this.FLD75.contains(s)) {
            return true;
        }
        for(Object object0: this.FLD72) {
            if(((ArrayList)object0).contains(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

