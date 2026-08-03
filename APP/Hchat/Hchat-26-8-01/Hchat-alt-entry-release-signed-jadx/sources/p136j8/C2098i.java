package p136j8;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p068eh.AbstractC0921a;
import p218og.AbstractC3149m;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: j8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2098i {

    /* JADX INFO: renamed from: a */
    public final long f7019a;

    /* JADX INFO: renamed from: b */
    public final int f7020b;

    /* JADX INFO: renamed from: c */
    public final String f7021c;

    /* JADX INFO: renamed from: d */
    public final String f7022d;

    /* JADX INFO: renamed from: e */
    public final long f7023e;

    /* JADX INFO: renamed from: f */
    public final long f7024f;

    /* JADX INFO: renamed from: g */
    public final List f7025g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2098i(long j3, int i9, String str, String str2, long j4, long j5, List list) {
        this.f7019a = j3;
        this.f7020b = i9;
        this.f7021c = str;
        this.f7022d = str2;
        this.f7023e = j4;
        this.f7024f = j5;
        this.f7025g = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m5253a() {
        String strM9264h;
        ArrayList arrayList = new ArrayList();
        String string = AbstractC3149m.m6703R0(this.f7022d).toString();
        int i9 = 0;
        if (!(string.length() > 0)) {
            string = null;
        }
        if (string != null) {
            arrayList.add(string);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(m5254b());
        }
        long j3 = this.f7024f;
        if (j3 > 0) {
            arrayList.add(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(j3)));
        }
        long j4 = this.f7023e;
        if (j4 > 0) {
            if (j4 <= 0) {
                strM9264h = "0 B";
            } else {
                String[] strArr = {"B", "KB", "MB", "GB"};
                double d10 = j4;
                while (d10 >= 1024.0d && i9 < 3) {
                    d10 /= 1024.0d;
                    i9++;
                }
                strM9264h = AbstractC4855en.m9264h((d10 >= 100.0d || d10 % 1.0d == 0.0d) ? String.valueOf((int) d10) : String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1)), " ", strArr[i9]);
            }
            arrayList.add(strM9264h);
        }
        return AbstractC4166m.m8392A1(arrayList, " · ", null, null, null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m5254b() {
        int i9 = this.f7020b;
        if (i9 == 10) {
            return "笔记";
        }
        if (i9 == 14) {
            return "聊天记录";
        }
        if (i9 == 18) {
            return "笔记";
        }
        if (i9 == 19) {
            return "小程序";
        }
        switch (i9) {
            case 1:
                return "文字";
            case 2:
                return "图片";
            case 3:
                return "语音";
            case 4:
                return "视频";
            case 5:
                return "链接";
            case 6:
                return "位置";
            case 7:
                return "音乐";
            case 8:
                return "文件";
            default:
                return AbstractC0921a.m2249l(i9, "类型");
        }
    }
}
