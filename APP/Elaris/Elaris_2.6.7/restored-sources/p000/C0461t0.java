package p000;

import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: t0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0461t0 {

    /* JADX INFO: renamed from: a */
    public final long f871a;

    /* JADX INFO: renamed from: b */
    public final int f872b;

    /* JADX INFO: renamed from: c */
    public final Serializable f873c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0461t0(int i) {
        this.f873c = new LinkedHashMap(16, 0.75f, true);
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.f871a = 60000L;
        this.f872b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m994b(String str, int i) {
        if ((i != 1 && i != 2) || str == null || str.length() == 0) {
            return "";
        }
        return i + "|" + str + "#";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m995f(long j, String str) {
        return "sender#" + j + "#" + str.length() + "#" + str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m996a(long j, String str) {
        if (str != null) {
            if (str.length() != 0) {
                Long l = (Long) ((LinkedHashMap) this.f873c).get(str);
                if (l != null && j >= l.longValue() && j - l.longValue() < this.f871a) {
                    return false;
                }
                ((LinkedHashMap) this.f873c).put(str, Long.valueOf(j));
                while (((LinkedHashMap) this.f873c).size() > this.f872b) {
                    Iterator it = ((LinkedHashMap) this.f873c).entrySet().iterator();
                    String str2 = it.hasNext() ? (String) ((Map.Entry) it.next()).getKey() : null;
                    if (str2 == null) {
                        break;
                    }
                    ((LinkedHashMap) this.f873c).remove(str2);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public int m997c(long j, String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f873c;
        C0445s0 c0445s0 = (C0445s0) concurrentHashMap.get(str);
        if (c0445s0 == null) {
            return 0;
        }
        long j2 = c0445s0.f816a;
        if (j >= j2 && j - j2 <= this.f871a) {
            return c0445s0.f817b;
        }
        concurrentHashMap.remove(str, c0445s0);
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public int m998d(int i, String str, long j, long j2, long j3, String str2, long j4) {
        int i2;
        int i3;
        int iM1040B = 0;
        if (i != 1 && i != 2) {
            return 0;
        }
        long j5 = (j3 >= 0 || j3 < -2147483648L) ? j3 : j3 & 4294967295L;
        String strM994b = m994b(str, i);
        if (strM994b.length() > 0) {
            String strConcat = strM994b.concat("id#");
            if (j2 <= 0) {
                i2 = 0;
            } else {
                iM1040B = m997c(j4, strConcat + j2);
                i2 = 0;
            }
            iM1040B = AbstractC0486u9.m1040B(i2, iM1040B);
            int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i4 <= 0 || j5 <= 0) {
                i3 = i4;
            } else {
                i3 = i4;
                iM1040B = AbstractC0486u9.m1040B(iM1040B, m997c(j4, strM994b.concat("sig#" + j + "#" + j5)));
            }
            if (i3 > 0 && str2.length() > 0) {
                iM1040B = AbstractC0486u9.m1040B(iM1040B, m997c(j4, strM994b.concat(m995f(j, str2))));
            }
        }
        if (j2 > 0) {
            iM1040B = AbstractC0486u9.m1040B(iM1040B, m997c(j4, "id#" + i + "#" + j2));
        }
        if (j <= 0 || j5 <= 0) {
            return iM1040B;
        }
        return AbstractC0486u9.m1040B(iM1040B, m997c(j4, "sig#" + i + "#" + j + "#" + j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m999e(int i, String str, long j, long j2, long j3, String str2, int i2, long j4) {
        int iM1071x;
        long j5;
        int i3;
        if ((i == 1 || i == 2) && (iM1071x = AbstractC0486u9.m1071x(i2)) != 0) {
            long j6 = (j3 >= 0 || j3 < -2147483648L) ? j3 : j3 & 4294967295L;
            String strM994b = m994b(str, i);
            if (strM994b.length() > 0) {
                String strConcat = strM994b.concat("id#");
                if (j2 > 0) {
                    j5 = 0;
                    ((ConcurrentHashMap) this.f873c).put(strConcat + j2, new C0445s0(j4, iM1071x));
                } else {
                    j5 = 0;
                }
                int i4 = (j > j5 ? 1 : (j == j5 ? 0 : -1));
                if (i4 <= 0 || j6 <= j5) {
                    i3 = i4;
                } else {
                    i3 = i4;
                    ((ConcurrentHashMap) this.f873c).put(strM994b.concat("sig#" + j + "#" + j6), new C0445s0(j4, iM1071x));
                }
                if (i3 > 0 && str2 != null && str2.length() > 0) {
                    ((ConcurrentHashMap) this.f873c).put(strM994b.concat(m995f(j, str2)), new C0445s0(j4, iM1071x));
                }
            } else {
                j5 = 0;
            }
            if (j2 > j5) {
                ((ConcurrentHashMap) this.f873c).put("id#" + i + "#" + j2, new C0445s0(j4, iM1071x));
            }
            if (j > j5 && j6 > j5) {
                ((ConcurrentHashMap) this.f873c).put("sig#" + i + "#" + j + "#" + j6, new C0445s0(j4, iM1071x));
            }
            synchronized (this) {
                try {
                    if (((ConcurrentHashMap) this.f873c).size() <= this.f872b) {
                        return;
                    }
                    for (Map.Entry entry : ((ConcurrentHashMap) this.f873c).entrySet()) {
                        C0445s0 c0445s0 = (C0445s0) entry.getValue();
                        if (c0445s0 != null) {
                            long j7 = c0445s0.f816a;
                            if (!(j4 >= j7 && j4 - j7 <= this.f871a)) {
                            }
                        }
                        ((ConcurrentHashMap) this.f873c).remove(entry.getKey(), c0445s0);
                    }
                    while (((ConcurrentHashMap) this.f873c).size() > this.f872b) {
                        String str3 = null;
                        long j8 = Long.MAX_VALUE;
                        for (Map.Entry entry2 : ((ConcurrentHashMap) this.f873c).entrySet()) {
                            C0445s0 c0445s02 = (C0445s0) entry2.getValue();
                            if (c0445s02 != null) {
                                long j9 = c0445s02.f816a;
                                if (j9 < j8) {
                                    str3 = (String) entry2.getKey();
                                    j8 = j9;
                                }
                            }
                        }
                        if (str3 == null) {
                            return;
                        } else {
                            ((ConcurrentHashMap) this.f873c).remove(str3);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C0461t0() {
        this.f873c = new ConcurrentHashMap();
        this.f871a = 31536000000L;
        this.f872b = 12288;
    }

    public C0461t0(File file, long j, long j2, int i) {
        this.f873c = file;
        this.f871a = Math.max(0L, j);
        Math.max(0L, j2);
        this.f872b = Math.max(1, i);
    }
}
