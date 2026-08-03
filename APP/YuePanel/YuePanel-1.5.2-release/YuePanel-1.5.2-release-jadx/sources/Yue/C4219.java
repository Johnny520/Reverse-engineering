package Yue;

import Yue.C5375;
import Yue.InterfaceC4103;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4219 {

    /* JADX INFO: renamed from: ۥ */
    public static final Map<String, List<String>> f747 = Collections.unmodifiableMap(new HashMap());

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f748 = "; ";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f8574 = "Cookie";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f8575 = "Cookie2";

    /* JADX INFO: renamed from: ۥ */
    public static void m1182(C5375.C5377 c5377, HttpURLConnection httpURLConnection) throws IOException {
        HashSet hashSet;
        HashSet hashSet2;
        LinkedHashSet<String> linkedHashSetM12153 = m12153(c5377);
        HashSet hashSet3 = null;
        for (Map.Entry<String, List<String>> entry : c5377.m16707().get(m1183(c5377.f1459), f747).entrySet()) {
            List<String> value = entry.getValue();
            if (value != null && value.size() != 0) {
                String key = entry.getKey();
                if (f8574.equals(key)) {
                    hashSet = hashSet3;
                    hashSet2 = linkedHashSetM12153;
                } else if (f8575.equals(key)) {
                    hashSet2 = new HashSet();
                    hashSet = hashSet2;
                }
                hashSet2.addAll(value);
                hashSet3 = hashSet;
            }
        }
        if (linkedHashSetM12153.size() > 0) {
            httpURLConnection.addRequestProperty(f8574, C7615.m23819(linkedHashSetM12153, f748));
        }
        if (hashSet3 == null || hashSet3.size() <= 0) {
            return;
        }
        httpURLConnection.addRequestProperty(f8575, C7615.m23819(hashSet3, f748));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static URI m1183(URL url) throws IOException {
        try {
            return url.toURI();
        } catch (URISyntaxException e) {
            MalformedURLException malformedURLException = new MalformedURLException(e.getMessage());
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static LinkedHashSet<String> m12153(InterfaceC4103.InterfaceC4105 interfaceC4105) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (Map.Entry<String, String> entry : interfaceC4105.mo11650().entrySet()) {
            linkedHashSet.add(entry.getKey() + "=" + entry.getValue());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m12154(C5375.C5377 c5377, URL url, Map<String, List<String>> map) throws IOException {
        c5377.m16707().put(m1183(url), map);
    }
}
