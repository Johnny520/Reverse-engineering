package p153;

import androidx.collection.C0268;
import androidx.collection.C0283;
import com.bumptech.glide.load.engine.ThreadFactoryC2997;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7603 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0283 f20619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f20620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ThreadPoolExecutor f20621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0268 f20622 = new C0268(16);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2997(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f20621 = threadPoolExecutor;
        f20620 = new Object();
        f20619 = new C0283(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        throw r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p153.C7596 m12828(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            androidx.collection.飘花落叶言子楪兰苏哲世 r0 = p153.AbstractC7603.f20622
            java.lang.String r1 = "getFontSync"
            p251.AbstractC8175.m13651(r1)
            java.lang.Object r1 = r0.m832(r8)     // Catch: java.lang.Throwable -> Lb5
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto L18
            飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏 r8 = new 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        L18:
            com.google.android.flexbox.飘花落叶言子楪世哲苏兰 r10 = p153.AbstractC7600.m12827(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab java.lang.Throwable -> Lb5
            java.util.List r1 = r10.f9902     // Catch: java.lang.Throwable -> Lb5
            int r10 = r10.f9903     // Catch: java.lang.Throwable -> Lb5
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2b
            if (r10 == r2) goto L29
        L27:
            r10 = r3
            goto L4c
        L29:
            r10 = -2
            goto L4c
        L2b:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb5
            飘花落叶言子哲世楪苏兰.飘花落叶言子楪苏世兰哲[] r10 = (p153.C7602[]) r10     // Catch: java.lang.Throwable -> Lb5
            if (r10 == 0) goto L4b
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb5
            if (r5 != 0) goto L37
            goto L4b
        L37:
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb5
            r6 = r4
        L39:
            if (r6 >= r5) goto L49
            r7 = r10[r6]     // Catch: java.lang.Throwable -> Lb5
            int r7 = r7.f20613     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto L46
            if (r7 >= 0) goto L44
            goto L27
        L44:
            r10 = r7
            goto L4c
        L46:
            int r6 = r6 + 1
            goto L39
        L49:
            r10 = r4
            goto L4c
        L4b:
            r10 = r2
        L4c:
            if (r10 == 0) goto L57
            飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏 r8 = new 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        L57:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lb5
            if (r10 <= r2) goto L79
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb5
            r2 = 29
            if (r10 < r2) goto L79
            飘花落叶言世子哲苏兰楪.飘花落叶言子楪世苏哲兰 r10 = p164.AbstractC7663.f20803     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            p251.AbstractC8175.m13651(r10)     // Catch: java.lang.Throwable -> Lb5
            飘花落叶言世子哲苏兰楪.飘花落叶言子楪世苏哲兰 r10 = p164.AbstractC7663.f20803     // Catch: java.lang.Throwable -> L74
            android.graphics.Typeface r9 = r10.mo12071(r9, r1, r11)     // Catch: java.lang.Throwable -> L74
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
            goto L8f
        L74:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
            throw r8     // Catch: java.lang.Throwable -> Lb5
        L79:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb5
            飘花落叶言子哲世楪苏兰.飘花落叶言子楪苏世兰哲[] r10 = (p153.C7602[]) r10     // Catch: java.lang.Throwable -> Lb5
            飘花落叶言世子哲苏兰楪.飘花落叶言子楪世苏哲兰 r1 = p164.AbstractC7663.f20803     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            p251.AbstractC8175.m13651(r1)     // Catch: java.lang.Throwable -> Lb5
            飘花落叶言世子哲苏兰楪.飘花落叶言子楪世苏哲兰 r1 = p164.AbstractC7663.f20803     // Catch: java.lang.Throwable -> La6
            android.graphics.Typeface r9 = r1.mo12072(r9, r10, r11)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
        L8f:
            if (r9 == 0) goto L9d
            r0.m831(r8, r9)     // Catch: java.lang.Throwable -> Lb5
            飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏 r8 = new 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        L9d:
            飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏 r8 = new 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        La6:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
            throw r8     // Catch: java.lang.Throwable -> Lb5
        Lab:
            飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏 r8 = new 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏     // Catch: java.lang.Throwable -> Lb5
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        Lb5:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p153.AbstractC7603.m12828(java.lang.String, android.content.Context, java.util.List, int):飘花落叶言子哲世楪苏兰.飘花落叶言子楪世兰哲苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m12829(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C7599) list.get(i2)).f20607);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
