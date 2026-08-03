package okhttp3.internal.publicsuffix;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.AbstractC3015m;
import ng.C3007e;
import ng.InterfaceC3008f;
import ng.InterfaceC3012j;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = AbstractC0000a.m99x0("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<String> findMatchingRule(List<String> list) {
        String strBinarySearch;
        String strBinarySearch2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        String str = null;
        if (this.publicSuffixListBytes == null) {
            C2104o.m5276A("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i9 = 0; i9 < size; i9++) {
            String str2 = list.get(i9);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            bArr[i9] = bytes;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strBinarySearch = null;
                break;
            }
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                AbstractC1416l.m3831g("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch = companion.binarySearch(bArr2, bArr, i10);
            if (strBinarySearch != null) {
                break;
            }
            i10++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i11 = 0; i11 < length; i11++) {
                bArr3[i11] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    AbstractC1416l.m3831g("publicSuffixListBytes");
                    throw null;
                }
                strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i11);
                if (strBinarySearch2 != null) {
                    break;
                }
            }
            strBinarySearch2 = null;
        } else {
            strBinarySearch2 = null;
        }
        if (strBinarySearch2 != null) {
            int i12 = size - 1;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                Companion companion3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    AbstractC1416l.m3831g("publicSuffixExceptionListBytes");
                    throw null;
                }
                String strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i13);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
                i13++;
            }
        }
        if (str != null) {
            return AbstractC3149m.m6691F0("!".concat(str), new char[]{'.'}, 6);
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listM6691F0 = C4173t.f13710g;
        List<String> listM6691F02 = strBinarySearch != null ? AbstractC3149m.m6691F0(strBinarySearch, new char[]{'.'}, 6) : listM6691F0;
        if (strBinarySearch2 != null) {
            listM6691F0 = AbstractC3149m.m6691F0(strBinarySearch2, new char[]{'.'}, 6);
        }
        return listM6691F02.size() > listM6691F0.size() ? listM6691F02 : listM6691F0;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final void readTheList() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
                try {
                    byte[] byteArray = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    byte[] byteArray2 = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    AbstractC2043a.m5035i(bufferedSourceBuffer, null);
                    synchronized (this) {
                        byteArray.getClass();
                        this.publicSuffixListBytes = byteArray;
                        byteArray2.getClass();
                        this.publicSuffixExceptionListBytes = byteArray2;
                    }
                } finally {
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readTheListUninterruptibly() {
        boolean z9 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z9 = true;
                } catch (IOException e6) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e6);
                    if (!z9) {
                        return;
                    }
                }
            } finally {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<String> splitDomain(String str) {
        List<String> listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{'.'}, 6);
        return AbstractC1416l.m3825a(AbstractC4166m.m8393B1(listM6691F0), HttpUrl.FRAGMENT_ENCODE_SET) ? AbstractC4166m.m8420r1(1, listM6691F0) : listM6691F0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        str.getClass();
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        int i9 = size - size2;
        InterfaceC3012j interfaceC3012jM8415m1 = AbstractC4166m.m8415m1(splitDomain(str));
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i9 != 0) {
            interfaceC3012jM8415m1 = interfaceC3012jM8415m1 instanceof InterfaceC3008f ? ((InterfaceC3008f) interfaceC3012jM8415m1).mo6403b(i9) : new C3007e(interfaceC3012jM8415m1, i9, 0);
        }
        return AbstractC3015m.m6412V(interfaceC3012jM8415m1, ".", null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i9) {
            int i10;
            int iAnd;
            boolean z9;
            int iAnd2;
            int length = bArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = (i11 + length) / 2;
                while (i12 > -1 && bArr[i12] != 10) {
                    i12--;
                }
                int i13 = i12 + 1;
                int i14 = 1;
                while (true) {
                    i10 = i13 + i14;
                    if (bArr[i10] == 10) {
                        break;
                    }
                    i14++;
                }
                int i15 = i10 - i13;
                int i16 = i9;
                boolean z10 = false;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    if (z10) {
                        iAnd = 46;
                        z9 = false;
                    } else {
                        boolean z11 = z10;
                        iAnd = Util.and(bArr2[i16][i17], 255);
                        z9 = z11;
                    }
                    iAnd2 = iAnd - Util.and(bArr[i13 + i18], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i18++;
                    i17++;
                    if (i18 == i15) {
                        break;
                    }
                    if (bArr2[i16].length != i17) {
                        z10 = z9;
                    } else {
                        if (i16 == bArr2.length - 1) {
                            break;
                        }
                        i16++;
                        z10 = true;
                        i17 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i19 = i15 - i18;
                        int length2 = bArr2[i16].length - i17;
                        int length3 = bArr2.length;
                        for (int i20 = i16 + 1; i20 < length3; i20++) {
                            length2 += bArr2[i20].length;
                        }
                        if (length2 >= i19) {
                            if (length2 <= i19) {
                                Charset charset = StandardCharsets.UTF_8;
                                charset.getClass();
                                return new String(bArr, i13, i15, charset);
                            }
                        }
                    }
                    i11 = i10 + 1;
                }
                length = i12;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }
}
