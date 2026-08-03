package com.tendcloud.tenddata;

import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ai */
/* JADX INFO: loaded from: classes.dex */
public class C0027ai {

    /* JADX INFO: renamed from: a */
    public static final Queue<String> f165a;

    static {
        LinkedList linkedList = new LinkedList();
        f165a = linkedList;
        linkedList.add(C0019aa.f72c);
        linkedList.add(C0019aa.f73d);
        linkedList.add(C0019aa.f74e);
    }

    /* JADX INFO: renamed from: a */
    public static String m112a() {
        return f165a.poll();
    }

    /* JADX INFO: renamed from: a */
    public static URL m113a(URL url, String str) {
        return C0122o.m687b() ? url : new URL(url.getProtocol(), str, url.getPort(), url.getFile());
    }

    /* JADX INFO: renamed from: a */
    public static void m114a(String str) {
        Queue<String> queue = f165a;
        if (queue.contains(str)) {
            C0115h.eForInternal("host existed...");
        } else {
            queue.add(str);
        }
    }
}
