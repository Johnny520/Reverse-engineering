package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1057r;
import p172l8.AbstractC4693f;
import p172l8.C4711r;
import p172l8.InterfaceC4691e;
import p376zd.C10003m;
import p376zd.C10023w;
import p376zd.C9995i;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, m16758d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "T", "Lkotlin/Function1;", "Lzd/k;", "consumer", _UrlKt.FRAGMENT_ENCODE_SET, "sizeMapper", "consumeSource", "(Lokhttp3/ResponseBody;La9/l;La9/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lzd/k;", _UrlKt.FRAGMENT_ENCODE_SET, "bytes", "()[B", "Lzd/m;", "byteString", "()Lzd/m;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", _UrlKt.FRAGMENT_ENCODE_SET, "string", "()Ljava/lang/String;", "Ll8/i0;", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ResponseBody EMPTY;
    private Reader reader;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m16758d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lzd/k;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lzd/k;Ljava/nio/charset/Charset;)V", _UrlKt.FRAGMENT_ENCODE_SET, "cbuf", _UrlKt.FRAGMENT_ENCODE_SET, "off", "len", "read", "([CII)I", "Ll8/i0;", "close", "()V", "Lzd/k;", "Ljava/nio/charset/Charset;", _UrlKt.FRAGMENT_ENCODE_SET, "closed", "Z", "delegate", "Ljava/io/Reader;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final InterfaceC9999k source;

        public BomAwareReader(InterfaceC9999k interfaceC9999k, Charset charset) {
            interfaceC9999k.getClass();
            charset.getClass();
            this.source = interfaceC9999k;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            cbuf.getClass();
            if (this.closed) {
                C10023w.m38841a("Stream closed");
                return 0;
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.mo38683K0(), _UtilJvmKt.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, C10003m.f33583u, (MediaType) null, 1, (Object) null);
    }

    private final Charset charset() {
        return Internal.charsetOrUtf8(get$contentType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Throwable] */
    private final <T> T consumeSource(ResponseBody responseBody, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) throws IllegalAccessException, IOException, InvocationTargetException {
        ?? r72;
        long jContentLength = responseBody.get$contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        InterfaceC9999k interfaceC9999kSource = responseBody.get$this_asResponseBody();
        T t10 = null;
        try {
            Object objMo27m = interfaceC0184l.mo27m(interfaceC9999kSource);
            AbstractC1057r.m3834b(1);
            if (interfaceC9999kSource != null) {
                try {
                    interfaceC9999kSource.close();
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    this = this;
                    long r0 = r6.get$contentLength()
                    r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 > 0) goto L56
                    zd.k r6 = r6.get$this_asResponseBody()
                    r2 = 0
                    r3 = 1
                    java.lang.Object r7 = r7.mo27m(r6)     // Catch: java.lang.Throwable -> L26
                    p024b9.AbstractC1057r.m3834b(r3)
                    if (r6 == 0) goto L1f
                    r6.close()     // Catch: java.lang.Throwable -> L1e
                    goto L1f
                L1e:
                    r2 = move-exception
                L1f:
                    p024b9.AbstractC1057r.m3833a(r3)
                    r4 = r2
                    r2 = r7
                    r7 = r4
                    goto L37
                L26:
                    r7 = move-exception
                    p024b9.AbstractC1057r.m3834b(r3)
                    if (r6 == 0) goto L34
                    r6.close()     // Catch: java.lang.Throwable -> L30
                    goto L34
                L30:
                    r6 = move-exception
                    p172l8.AbstractC4693f.m18753a(r7, r6)
                L34:
                    p024b9.AbstractC1057r.m3833a(r3)
                L37:
                    if (r7 != 0) goto L55
                    java.lang.Object r6 = r8.mo27m(r2)
                    java.lang.Number r6 = (java.lang.Number) r6
                    int r6 = r6.intValue()
                    r7 = -1
                    int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                    if (r7 == 0) goto L54
                    long r7 = (long) r6
                    int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                    if (r7 != 0) goto L4f
                    goto L54
                L4f:
                    okhttp3.C5794l.m23286a(r0, r6)
                    r6 = 0
                    return r6
                L54:
                    return r2
                L55:
                    throw r7
                L56:
                    java.io.IOException r6 = new java.io.IOException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    java.lang.String r8 = "Cannot buffer entire body for content length: "
                    r7.<init>(r8)
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    r6.<init>(r7)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(okhttp3.ResponseBody, a9.l, a9.l):java.lang.Object");
            }

            public static final ResponseBody create(String str, MediaType mediaType) {
                return INSTANCE.create(str, mediaType);
            }

            public final InputStream byteStream() {
                return get$this_asResponseBody().mo38683K0();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r4v8 */
            public final C10003m byteString() throws IllegalAccessException, IOException, InvocationTargetException {
                long jContentLength = get$contentLength();
                if (jContentLength > 2147483647L) {
                    throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
                }
                InterfaceC9999k interfaceC9999kSource = get$this_asResponseBody();
                C10003m th = null;
                try {
                    C10003m c10003mMo38717l0 = interfaceC9999kSource.mo38717l0();
                    if (interfaceC9999kSource != null) {
                        try {
                            interfaceC9999kSource.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    th = th;
                    th = c10003mMo38717l0;
                } catch (Throwable th3) {
                    th = th3;
                    if (interfaceC9999kSource != null) {
                        try {
                            interfaceC9999kSource.close();
                        } catch (Throwable th4) {
                            AbstractC4693f.m18753a(th, th4);
                        }
                    }
                }
                if (th != 0) {
                    throw th;
                }
                int iM38765G = th.m38765G();
                if (jContentLength == -1 || jContentLength == iM38765G) {
                    return th;
                }
                C5794l.m23286a(jContentLength, iM38765G);
                return null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r4v8 */
            public final byte[] bytes() throws IllegalAccessException, IOException, InvocationTargetException {
                long jContentLength = get$contentLength();
                if (jContentLength > 2147483647L) {
                    throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
                }
                InterfaceC9999k interfaceC9999kSource = get$this_asResponseBody();
                byte[] th = null;
                try {
                    byte[] bArrMo38672C = interfaceC9999kSource.mo38672C();
                    if (interfaceC9999kSource != null) {
                        try {
                            interfaceC9999kSource.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    th = th;
                    th = bArrMo38672C;
                } catch (Throwable th3) {
                    th = th3;
                    if (interfaceC9999kSource != null) {
                        try {
                            interfaceC9999kSource.close();
                        } catch (Throwable th4) {
                            AbstractC4693f.m18753a(th, th4);
                        }
                    }
                }
                if (th != 0) {
                    throw th;
                }
                int length = th.length;
                if (jContentLength == -1 || jContentLength == length) {
                    return th;
                }
                C5794l.m23286a(jContentLength, length);
                return null;
            }

            public final Reader charStream() {
                Reader reader = this.reader;
                if (reader != null) {
                    return reader;
                }
                BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
                this.reader = bomAwareReader;
                return bomAwareReader;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                _UtilCommonKt.closeQuietly(get$this_asResponseBody());
            }

            /* JADX INFO: renamed from: contentLength */
            public abstract long get$contentLength();

            /* JADX INFO: renamed from: contentType */
            public abstract MediaType get$contentType();

            /* JADX INFO: renamed from: source */
            public abstract InterfaceC9999k get$this_asResponseBody();

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r2v5 */
            public final String string() throws IllegalAccessException, InvocationTargetException {
                InterfaceC9999k interfaceC9999kSource = get$this_asResponseBody();
                String th = null;
                try {
                    String string = interfaceC9999kSource.readString(_UtilJvmKt.readBomAsCharset(interfaceC9999kSource, charset()));
                    if (interfaceC9999kSource != null) {
                        try {
                            interfaceC9999kSource.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    th = th;
                    th = string;
                } catch (Throwable th3) {
                    th = th3;
                    if (interfaceC9999kSource != null) {
                        try {
                            interfaceC9999kSource.close();
                        } catch (Throwable th4) {
                            AbstractC4693f.m18753a(th, th4);
                        }
                    }
                }
                if (th == 0) {
                    return th;
                }
                throw th;
            }

            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            @Metadata(m16757d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u0017J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m16758d2 = {"Lokhttp3/ResponseBody$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", _UrlKt.FRAGMENT_ENCODE_SET, "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lzd/m;", "(Lzd/m;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lzd/k;", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", "(Lzd/k;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Lzd/m;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLzd/k;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                    this();
                }

                public static /* synthetic */ ResponseBody create$default(Companion companion, InterfaceC9999k interfaceC9999k, MediaType mediaType, long j10, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        mediaType = null;
                    }
                    if ((i10 & 2) != 0) {
                        j10 = -1;
                    }
                    return companion.create(interfaceC9999k, mediaType, j10);
                }

                public final ResponseBody create(String str, MediaType mediaType) {
                    str.getClass();
                    C4711r c4711rChooseCharset = Internal.chooseCharset(mediaType);
                    Charset charset = (Charset) c4711rChooseCharset.m18792a();
                    MediaType mediaType2 = (MediaType) c4711rChooseCharset.m18793b();
                    C9995i c9995iM38676F0 = new C9995i().m38676F0(str, charset);
                    return create(c9995iM38676F0, mediaType2, c9995iM38676F0.size());
                }

                private Companion() {
                }

                public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        mediaType = null;
                    }
                    return companion.create(bArr, mediaType);
                }

                public static /* synthetic */ ResponseBody create$default(Companion companion, C10003m c10003m, MediaType mediaType, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        mediaType = null;
                    }
                    return companion.create(c10003m, mediaType);
                }

                public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        mediaType = null;
                    }
                    return companion.create(str, mediaType);
                }

                public final ResponseBody create(byte[] bArr, MediaType mediaType) {
                    bArr.getClass();
                    return create(new C9995i().write(bArr), mediaType, bArr.length);
                }

                public final ResponseBody create(C10003m c10003m, MediaType mediaType) {
                    c10003m.getClass();
                    return create(new C9995i().mo38736y0(c10003m), mediaType, c10003m.m38765G());
                }

                public final ResponseBody create(final InterfaceC9999k interfaceC9999k, final MediaType mediaType, final long j10) {
                    interfaceC9999k.getClass();
                    return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                        @Override // okhttp3.ResponseBody
                        /* JADX INFO: renamed from: contentLength, reason: from getter */
                        public long get$contentLength() {
                            return j10;
                        }

                        @Override // okhttp3.ResponseBody
                        /* JADX INFO: renamed from: contentType, reason: from getter */
                        public MediaType get$contentType() {
                            return mediaType;
                        }

                        @Override // okhttp3.ResponseBody
                        /* JADX INFO: renamed from: source, reason: from getter */
                        public InterfaceC9999k get$this_asResponseBody() {
                            return interfaceC9999k;
                        }
                    };
                }

                @InterfaceC4691e
                public final ResponseBody create(MediaType contentType, String content) {
                    content.getClass();
                    return create(content, contentType);
                }

                @InterfaceC4691e
                public final ResponseBody create(MediaType contentType, byte[] content) {
                    content.getClass();
                    return create(content, contentType);
                }

                @InterfaceC4691e
                public final ResponseBody create(MediaType contentType, C10003m content) {
                    content.getClass();
                    return create(content, contentType);
                }

                @InterfaceC4691e
                public final ResponseBody create(MediaType contentType, long contentLength, InterfaceC9999k content) {
                    content.getClass();
                    return create(content, contentType, contentLength);
                }
            }

            @InterfaceC4691e
            public static final ResponseBody create(MediaType mediaType, long j10, InterfaceC9999k interfaceC9999k) {
                return INSTANCE.create(mediaType, j10, interfaceC9999k);
            }

            @InterfaceC4691e
            public static final ResponseBody create(MediaType mediaType, String str) {
                return INSTANCE.create(mediaType, str);
            }

            @InterfaceC4691e
            public static final ResponseBody create(MediaType mediaType, C10003m c10003m) {
                return INSTANCE.create(mediaType, c10003m);
            }

            @InterfaceC4691e
            public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
                return INSTANCE.create(mediaType, bArr);
            }

            public static final ResponseBody create(InterfaceC9999k interfaceC9999k, MediaType mediaType, long j10) {
                return INSTANCE.create(interfaceC9999k, mediaType, j10);
            }

            public static final ResponseBody create(C10003m c10003m, MediaType mediaType) {
                return INSTANCE.create(c10003m, mediaType);
            }

            public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
                return INSTANCE.create(bArr, mediaType);
            }
        }
