package o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.StackTraceElement[] f9469a = null;

    static {
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            o.d.f9469a = r0
            return
    }

    public static final y1.x0 a(i2.g r21) {
            r0 = r21
            y1.x0 r1 = new y1.x0
            java.util.ArrayList r2 = r0.f6315i
            tf.t r3 = tf.t.f13167g
            if (r2 != 0) goto Lc
            r4 = r3
            goto Ld
        Lc:
            r4 = r2
        Ld:
            java.lang.String r0 = r0.f6314h
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L17
            goto L17f
        L17:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            o.a r0 = new o.a
            r0.<init>()
            android.os.Parcel r5 = android.os.Parcel.obtain()
            r0.f9467a = r5
            if (r2 != 0) goto L2a
            r2 = r3
        L2a:
            int r3 = r2.size()
            r6 = 0
        L2f:
            if (r6 >= r3) goto L17d
            java.lang.Object r7 = r2.get(r6)
            i2.e r7 = (i2.e) r7
            java.lang.Object r8 = r7.f6288a
            i2.f0 r8 = (i2.f0) r8
            int r9 = r7.f6289b
            int r7 = r7.f6290c
            android.os.Parcel r10 = r0.f9467a
            r10.recycle()
            android.os.Parcel r10 = android.os.Parcel.obtain()
            r0.f9467a = r10
            t2.o r10 = r8.f6298a
            long r11 = r8.f6309l
            long r13 = r8.f6305h
            r15 = r6
            long r5 = r8.f6299b
            r16 = r2
            r17 = r3
            long r2 = r10.b()
            r18 = r9
            long r9 = f1.w.f3131g
            boolean r2 = f1.w.c(r2, r9)
            r3 = 1
            if (r2 != 0) goto L77
            r0.c(r3)
            t2.o r2 = r8.f6298a
            r19 = r4
            long r3 = r2.b()
            android.os.Parcel r2 = r0.f9467a
            r2.writeLong(r3)
            goto L79
        L77:
            r19 = r4
        L79:
            long r2 = u2.o.f13359c
            boolean r4 = u2.o.a(r5, r2)
            r20 = r4
            r4 = 2
            if (r20 != 0) goto L8a
            r0.c(r4)
            r0.e(r5)
        L8a:
            m2.k r5 = r8.f6300c
            r6 = 3
            if (r5 == 0) goto L99
            r0.c(r6)
            int r5 = r5.f8701g
            android.os.Parcel r6 = r0.f9467a
            r6.writeInt(r5)
        L99:
            m2.i r5 = r8.f6301d
            if (r5 == 0) goto Lae
            int r5 = r5.f8694a
            r6 = 4
            r0.c(r6)
            if (r5 != 0) goto La7
        La5:
            r6 = 0
            goto Lab
        La7:
            r6 = 1
            if (r5 != r6) goto La5
            r6 = 1
        Lab:
            r0.c(r6)
        Lae:
            m2.j r5 = r8.f6302e
            if (r5 == 0) goto Lcd
            int r5 = r5.f8695a
            r6 = 5
            r0.c(r6)
            if (r5 != 0) goto Lbc
        Lba:
            r4 = 0
            goto Lca
        Lbc:
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r6) goto Lc3
            r4 = 1
            goto Lca
        Lc3:
            r6 = 1
            if (r5 != r6) goto Lc7
            goto Lca
        Lc7:
            if (r5 != r4) goto Lba
            r4 = 3
        Lca:
            r0.c(r4)
        Lcd:
            java.lang.String r4 = r8.f6304g
            if (r4 == 0) goto Lda
            r5 = 6
            r0.c(r5)
            android.os.Parcel r5 = r0.f9467a
            r5.writeString(r4)
        Lda:
            boolean r2 = u2.o.a(r13, r2)
            if (r2 != 0) goto Le7
            r2 = 7
            r0.c(r2)
            r0.e(r13)
        Le7:
            t2.a r2 = r8.f6306i
            if (r2 == 0) goto Lf5
            float r2 = r2.f12994a
            r3 = 8
            r0.c(r3)
            r0.d(r2)
        Lf5:
            t2.p r2 = r8.f6307j
            if (r2 == 0) goto L108
            r3 = 9
            r0.c(r3)
            float r3 = r2.f13022a
            r0.d(r3)
            float r2 = r2.f13023b
            r0.d(r2)
        L108:
            boolean r2 = f1.w.c(r11, r9)
            if (r2 != 0) goto L118
            r2 = 10
            r0.c(r2)
            android.os.Parcel r2 = r0.f9467a
            r2.writeLong(r11)
        L118:
            t2.l r2 = r8.f6310m
            if (r2 == 0) goto L128
            r3 = 11
            r0.c(r3)
            int r2 = r2.f13018a
            android.os.Parcel r3 = r0.f9467a
            r3.writeInt(r2)
        L128:
            f1.q0 r2 = r8.f6311n
            if (r2 == 0) goto L159
            r3 = 12
            r0.c(r3)
            long r3 = r2.f3109a
            android.os.Parcel r5 = r0.f9467a
            r5.writeLong(r3)
            long r3 = r2.f3110b
            r5 = 32
            long r5 = r3 >> r5
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r0.d(r5)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r0.d(r3)
            float r2 = r2.f3111c
            r0.d(r2)
        L159:
            android.text.Annotation r2 = new android.text.Annotation
            android.os.Parcel r3 = r0.f9467a
            byte[] r3 = r3.marshall()
            r4 = 0
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)
            java.lang.String r5 = "androidx.compose.text.SpanStyle"
            r2.<init>(r5, r3)
            r3 = 33
            r6 = r18
            r5 = r19
            r5.setSpan(r2, r6, r7, r3)
            int r6 = r15 + 1
            r4 = r5
            r2 = r16
            r3 = r17
            goto L2f
        L17d:
            r5 = r4
            r0 = r5
        L17f:
            java.lang.String r2 = "plain text"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r2, r0)
            r1.<init>(r0)
            return r1
    }
}
