package com.alibaba.fastjson2;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.alibaba.fastjson2.reader.AbstractC2761;
import com.android.dx.cf.code.SimException;
import com.google.android.material.textfield.InterfaceC3174;
import com.google.gson.JsonIOException;
import com.google.gson.internal.InterfaceC3237;
import com.google.gson.internal.LinkedTreeMap;
import com.typesafe.config.ConfigException;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p222.InterfaceC7986;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2941 implements InterfaceC7986, InterfaceC3174, InterfaceC3237 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9315;

    public /* synthetic */ C2941(int i) {
        this.f9315 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m6332(Object obj, Object obj2) {
        throw new SimException("expected type " + obj + ((Object) " but found ") + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m6333(AbstractC2761 abstractC2761, Throwable th) {
        throw new JSONException("set " + ((Object) abstractC2761.toString()) + ((Object) " error"), th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m6334(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m6335(int i, int i2, String str) {
        throw new JSONException(str + i + ((Object) ", char ") + ((char) i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m6336() {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m6337(Object obj, String str) {
        throw new ConfigException.BugOrBroken(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m6338(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m6339(String str, Object obj, Object obj2, Object obj3) {
        throw new JSONException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m6340(String str, Object obj, int i, int i2) {
        throw new JSONException(str + obj + ((Object) ", offset ") + i + ((Object) "/") + i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static /* synthetic */ void m6341(String str, Object obj, Object obj2, Object obj3) {
        throw new ConfigException.BugOrBroken(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static /* synthetic */ void m6342(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m6343(String str, Object obj, Throwable th) {
        throw new JSONException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* synthetic */ void m6344(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m6345(Object obj, String str, Object obj2) {
        throw new NumberFormatException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m6346(Object obj, String str) {
        throw new JSONException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m6347(String str, int i, Object obj, int i2) {
        throw new RuntimeException(str + i + obj + i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m6348(String str, int i, Object obj, int i2, Object obj2, int i3) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + obj2 + i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m6349(Object obj, StringBuilder sb) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m6350(String str) {
        throw new ConfigException.BugOrBroken(str);
    }

    @Override // p222.InterfaceC7986
    public Object get() {
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.gson.internal.InterfaceC3237
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo4472() {
        switch (this.f9315) {
            case 17:
                return new LinkedTreeMap();
            case 18:
                return new LinkedHashMap();
            case 19:
                return new TreeMap();
            case 20:
                return new ConcurrentHashMap();
            case 21:
                return new ConcurrentSkipListMap();
            case 22:
                return new ArrayList();
            case 23:
                return new LinkedHashSet();
            case 24:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }
}
