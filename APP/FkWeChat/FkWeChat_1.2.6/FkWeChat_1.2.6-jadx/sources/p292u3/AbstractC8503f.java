package p292u3;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.Collections;
import java.util.List;
import p252r3.AbstractC6477h;
import p320w3.AbstractC9170c;

/* JADX INFO: renamed from: u3.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8503f {

    /* JADX INFO: renamed from: u3.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Uri f28392a;

        /* JADX INFO: renamed from: b */
        public final int f28393b;

        /* JADX INFO: renamed from: c */
        public final int f28394c;

        /* JADX INFO: renamed from: d */
        public final boolean f28395d;

        /* JADX INFO: renamed from: e */
        public final int f28396e;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f28392a = (Uri) AbstractC9170c.m35614c(uri);
            this.f28393b = i10;
            this.f28394c = i11;
            this.f28395d = z10;
            this.f28396e = i12;
        }

        /* JADX INFO: renamed from: a */
        public static b m32746a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        /* JADX INFO: renamed from: b */
        public int m32747b() {
            return this.f28396e;
        }

        /* JADX INFO: renamed from: c */
        public int m32748c() {
            return this.f28393b;
        }

        /* JADX INFO: renamed from: d */
        public Uri m32749d() {
            return this.f28392a;
        }

        /* JADX INFO: renamed from: e */
        public int m32750e() {
            return this.f28394c;
        }

        /* JADX INFO: renamed from: f */
        public boolean m32751f() {
            return this.f28395d;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m32740a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return AbstractC6477h.m25659a(context, cancellationSignal, bVarArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public static a m32741b(Context context, CancellationSignal cancellationSignal, C8500c c8500c) {
        return AbstractC8499b.m32727e(context, AbstractC8502e.m32739a(new Object[]{c8500c}), cancellationSignal);
    }

    /* JADX INFO: renamed from: u3.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f28390a;

        /* JADX INFO: renamed from: b */
        public final List f28391b;

        public a(int i10, b[] bVarArr) {
            this.f28390a = i10;
            this.f28391b = Collections.singletonList(bVarArr);
        }

        /* JADX INFO: renamed from: a */
        public static a m32742a(int i10, List list) {
            return new a(i10, list);
        }

        /* JADX INFO: renamed from: b */
        public static a m32743b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        /* JADX INFO: renamed from: c */
        public b[] m32744c() {
            return (b[]) this.f28391b.get(0);
        }

        /* JADX INFO: renamed from: d */
        public int m32745d() {
            return this.f28390a;
        }

        public a(int i10, List list) {
            this.f28390a = i10;
            this.f28391b = list;
        }
    }
}
