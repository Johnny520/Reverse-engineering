package com.tendcloud.tenddata;

import android.util.EventLogTags;
import java.util.HashMap;
import java.util.TreeSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cp */
/* JADX INFO: loaded from: classes.dex */
public class C0088cp {

    /* JADX INFO: renamed from: d */
    public static byte[] f407d;

    /* JADX INFO: renamed from: a */
    public static HashMap<String, String> f404a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static HashMap<String, String> f405b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static String f406c = "utf-8";

    /* JADX INFO: renamed from: e */
    private static volatile C0088cp f408e = null;

    static {
        try {
            C0132z.m785a().register(m440a());
        } catch (Throwable unused) {
        }
    }

    private C0088cp() {
        String strM771c = C0131y.m771c(C0020ab.f132g.getPackageName());
        if (C0020ab.f132g == null || strM771c == null) {
            f407d = "ab".getBytes();
        } else {
            f407d = strM771c.getBytes();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0088cp m440a() {
        if (f408e == null) {
            synchronized (C0088cp.class) {
                if (f408e == null) {
                    f408e = new C0088cp();
                }
            }
        }
        return f408e;
    }

    /* JADX INFO: renamed from: a */
    public TreeSet<C0089cq> m441a(AbstractC0018a abstractC0018a) {
        int size;
        TreeSet treeSet = new TreeSet();
        TreeSet<C0089cq> treeSetM463a = null;
        try {
            treeSetM463a = C0090cr.m454a().m463a(abstractC0018a, 100, (String) null);
            if (treeSetM463a != null && treeSetM463a.size() > 0) {
                for (C0089cq c0089cq : treeSetM463a) {
                    try {
                        c0089cq.writeData(C0131y.m769b(c0089cq.m450c(), f407d));
                    } catch (Throwable unused) {
                    }
                }
                treeSet.addAll(treeSetM463a);
                treeSetM463a.clear();
            }
            size = treeSetM463a == null ? 0 : treeSetM463a.size();
        } catch (Throwable unused2) {
        }
        synchronized (EventLogTags.class) {
            if (size < 100) {
                try {
                    TreeSet<C0089cq> treeSetM463a2 = C0090cr.m454a().m463a(abstractC0018a, 100 - size, abstractC0018a.getRootFolder());
                    if (treeSetM463a2 != null) {
                        try {
                            if (treeSetM463a2.size() > 0) {
                                for (C0089cq c0089cq2 : treeSetM463a2) {
                                    try {
                                        byte[] bArrM216b = C0037as.m216b(c0089cq2.m450c());
                                        if (bArrM216b != null && bArrM216b.length != 0) {
                                            c0089cq2.writeData(bArrM216b);
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    treeSetM463a = treeSetM463a2;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (treeSet.size() > 0 && treeSetM463a != null) {
                treeSetM463a.addAll(treeSet);
            }
            return treeSetM463a;
        }
    }

    public final synchronized void onTDEBEventDataStore(C0067bv c0067bv) {
        if (c0067bv == null) {
            return;
        }
        try {
            if (c0067bv.f352a.getMessageFormat().equals(AbstractC0018a.MF_JSON)) {
                if (c0067bv.f352a == null) {
                    return;
                }
                C0094cv c0094cv = new C0094cv(c0067bv.f353b, c0067bv.f354c);
                c0094cv.setData(c0067bv.f355d);
                JSONObject jSONObjectM507a = c0067bv.f352a.name().equals("BG") ? null : C0110dk.m504b().m507a(c0094cv, true, c0067bv.f352a, c0067bv.f356e);
                if (jSONObjectM507a == null) {
                } else {
                    C0090cr.m454a().m464a(new C0089cq(C0037as.m215a(jSONObjectM507a.toString().getBytes())), c0067bv);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void sendMessageFaild(AbstractC0018a abstractC0018a) {
        try {
            C0090cr.m454a().clearDataCache(abstractC0018a);
        } catch (Throwable unused) {
        }
    }

    public void sendMessageSuccess(AbstractC0018a abstractC0018a) {
        try {
            C0090cr.m454a().confirmRead(abstractC0018a);
        } catch (Throwable unused) {
        }
    }
}
