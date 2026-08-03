package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;

/* JADX INFO: renamed from: com.tendcloud.tenddata.g */
/* JADX INFO: loaded from: classes.dex */
public class C0114g {

    /* JADX INFO: renamed from: a */
    private static volatile C0114g f497a;

    /* JADX INFO: renamed from: b */
    private PackageInfo f498b = null;

    private C0114g() {
    }

    /* JADX INFO: renamed from: a */
    public static C0114g m517a() {
        if (f497a == null) {
            synchronized (C0114g.class) {
                if (f497a == null) {
                    f497a = new C0114g();
                }
            }
        }
        return f497a;
    }

    /* JADX INFO: renamed from: i */
    private synchronized boolean m518i(Context context) {
        boolean z;
        try {
            if (this.f498b == null) {
                this.f498b = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            }
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public String m519a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public int m520b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            if (m518i(context)) {
                return this.f498b.versionCode;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m521c(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            return !m518i(context) ? "unknown" : this.f498b.versionName;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: d */
    public long m522d(Context context) {
        if (context == null) {
            return -1L;
        }
        try {
            if (m518i(context) && C0131y.m754a(9)) {
                return this.f498b.firstInstallTime;
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: e */
    public long m523e(Context context) {
        if (context == null) {
            return -1L;
        }
        try {
            if (m518i(context) && C0131y.m754a(9)) {
                return this.f498b.lastUpdateTime;
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: f */
    public long m524f(Context context) {
        if (context == null) {
            return -1L;
        }
        try {
            return new File(context.getApplicationInfo().sourceDir).length();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: g */
    public String m525g(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (!m518i(context)) {
                return null;
            }
            Signature[] signatureArr = this.f498b.signatures;
            if (signatureArr.length < 1) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(signatureArr[0].toCharsString());
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public String m526h(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
