package p242t3;

import me.dartcv.nuke.BuildConfig;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1976d;
import p214o3.AbstractC2800c;

/* JADX INFO: renamed from: t3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3217f extends AbstractC2800c {

    /* JADX INFO: renamed from: d */
    public final String f10007d;

    public C3217f(String str) {
        super(str);
        this.f10007d = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f10007d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3217f(int i5, String str, String str2) {
        this(str);
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1665j.m2985e(str, "shortMessage");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((str2 == null || AbstractC1976d.m3637e0(str2)) ? "" : "\n".concat(str2));
                this(sb.toString());
                break;
            default:
                AbstractC1665j.m2985e(str, "fullMessage");
                AbstractC1665j.m2985e(str2, "shortMessage");
                break;
        }
    }
}
