package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u00072\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u0006\u0012\u0002\b\u00030\nH\u0001\u001a!\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0007\u001aZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a0\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010!\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001a+\u0010$\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001aT\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ai\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u0010 \u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001aT\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a$\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0001\u001aA\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u00101\u001a!\u00102\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u00103\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a`\u00104\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172(\u00106\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\n0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u00107\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a!\u0010:\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a)\u0010;\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a#\u0010<\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aZ\u0010=\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ao\u0010>\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u00106\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0001ø\u0001\u0000¢\u0006\u0002\u0010(\u001au\u0010?\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001729\u00106\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001a`\u0010@\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172$\u00106\u001a \b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a?\u0010A\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a?\u0010F\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a!\u0010G\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a$\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0007\u001a!\u0010I\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u0010J\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a0\u0010K\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a9\u0010M\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u00101\u001a;\u0010N\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010O\u001a\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0P\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aU\u0010O\u001a\u0002HS\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q\"\u0018\b\u0002\u0010S*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0015\u0012\u0006\b\u0000\u0012\u0002HQ0T*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\n2\u0006\u0010.\u001a\u0002HSH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010U\u001a'\u0010V\u001a\b\u0012\u0004\u0012\u0002H\u000e0W\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010X\u001a\b\u0012\u0004\u0012\u0002H\u000e0Y\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010Z\u001a\b\u0012\u0004\u0012\u0002H\u000e0[\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a.\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0]0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001a?\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H50R0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\nH\u0087\u0004\u001az\u0010^\u001a\b\u0012\u0004\u0012\u0002HQ0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u0010Q*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001726\u00106\u001a2\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(`\u0012\u0013\u0012\u0011H5¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(a\u0012\u0004\u0012\u0002HQ0\u0019H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, m115d2 = {"consumesAll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "channels", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", "any", "", "E", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumes", "count", "", "distinct", "distinctBy", "K", "context", "Lkotlin/coroutines/CoroutineContext;", "selector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "drop", "n", "dropWhile", "predicate", "elementAt", "index", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function3;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "filterNotNullTo", "C", "", "destination", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "first", "firstOrNull", "flatMap", "R", "transform", "indexOf", "element", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "single", "singleOrNull", "take", "takeWhile", "toChannel", "toCollection", "toMap", "", "V", "Lkotlin/Pair;", "M", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMutableList", "", "toMutableSet", "", "toSet", "", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", "a", "b", "kotlinx-coroutines-core"}, m116k = 5, m117mv = {1, 6, 0}, m119xi = 48, m120xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0}, m127l = {404}, m128m = "any", m129n = {"$this$consume$iv"}, m130s = {"L$0"})
    static final class C08381<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C08381(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08381> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.any(r0, r1)
                return r0
        }
    }



    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0}, m127l = {487}, m128m = "count", m129n = {"count", "$this$consume$iv$iv"}, m130s = {"L$0", "L$1"})
    static final class C08411<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08411(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08411> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.count(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, m115d2 = {"<anonymous>", "E", "it"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", m125f = "Deprecated.kt", m126i = {}, m127l = {}, m128m = "invokeSuspend", m129n = {}, m130s = {})
    static final class C08421<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super E>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        C08421(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08421> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1
                r0.<init>(r3)
                r0.L$0 = r2
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(E r3, kotlin.coroutines.Continuation<? super E> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08421) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r2.label
                switch(r0) {
                    case 0: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            L10:
                kotlin.ResultKt.throwOnFailure(r3)
                r0 = r2
                java.lang.Object r1 = r0.L$0
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "K", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1, 1, 2, 2, 2}, m127l = {387, 388, 390}, m128m = "invokeSuspend", m129n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, m130s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    static final class C08431<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> $selector;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_distinctBy;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;

        C08431(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08431> r4) {
                r1 = this;
                r1.$this_distinctBy = r2
                r1.$selector = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_distinctBy
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> r2 = r3.$selector
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08431) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                switch(r1) {
                    case 0: goto L57;
                    case 1: goto L40;
                    case 2: goto L25;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L11:
                r1 = r10
                java.lang.Object r2 = r1.L$3
                java.lang.Object r3 = r1.L$2
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$1
                java.util.HashSet r4 = (java.util.HashSet) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                goto Ld5
            L25:
                r1 = r10
                java.lang.Object r2 = r1.L$3
                java.lang.Object r3 = r1.L$2
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$1
                java.util.HashSet r4 = (java.util.HashSet) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto Lb1
            L40:
                r1 = r10
                java.lang.Object r2 = r1.L$2
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$1
                java.util.HashSet r3 = (java.util.HashSet) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto L8b
            L57:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_distinctBy
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
                r9 = r4
                r4 = r2
                r2 = r9
            L6d:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r4
                r1.L$1 = r3
                r1.L$2 = r2
                r6 = 0
                r1.L$3 = r6
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r2.hasNext(r5)
                if (r5 != r0) goto L83
                return r0
            L83:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r9
            L8b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Le7
                java.lang.Object r11 = r3.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> r6 = r2.$selector
                r2.L$0 = r5
                r2.L$1 = r4
                r2.L$2 = r3
                r2.L$3 = r11
                r7 = 2
                r2.label = r7
                java.lang.Object r6 = r6.invoke(r11, r2)
                if (r6 != r1) goto Lab
                return r1
            Lab:
                r9 = r3
                r3 = r11
                r11 = r6
                r6 = r5
                r5 = r4
                r4 = r9
            Lb1:
                boolean r7 = r5.contains(r11)
                if (r7 != 0) goto Le0
                r7 = r2
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r2.L$0 = r6
                r2.L$1 = r5
                r2.L$2 = r4
                r2.L$3 = r11
                r8 = 3
                r2.label = r8
                java.lang.Object r3 = r6.send(r3, r7)
                if (r3 != r1) goto Lcd
                return r1
            Lcd:
                r3 = r4
                r4 = r5
                r5 = r6
                r9 = r2
                r2 = r11
                r11 = r0
                r0 = r1
                r1 = r9
            Ld5:
                r6 = r4
                java.util.Collection r6 = (java.util.Collection) r6
                r6.add(r2)
                r2 = r3
                r3 = r4
                r4 = r5
                goto L6d
            Le0:
                r11 = r0
                r0 = r1
                r1 = r2
                r2 = r4
                r3 = r5
                r4 = r6
                goto L6d
            Le7:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", m125f = "Deprecated.kt", m126i = {0, 0, 1, 2}, m127l = {164, 169, 170}, m128m = "invokeSuspend", m129n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, m130s = {"L$0", "I$0", "L$0", "L$0"})
    static final class C08441<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* JADX INFO: renamed from: $n */
        final /* synthetic */ int f74$n;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_drop;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        C08441(int r2, kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08441> r4) {
                r1 = this;
                r1.f74$n = r2
                r1.$this_drop = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1
                int r1 = r3.f74$n
                kotlinx.coroutines.channels.ReceiveChannel<E> r2 = r3.$this_drop
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08441) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 1
                switch(r1) {
                    case 0: goto L48;
                    case 1: goto L33;
                    case 2: goto L20;
                    case 3: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L12:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                goto Le0
            L20:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r9
                goto Lbe
            L33:
                r1 = r8
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r9)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L83
            L48:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                int r4 = r1.f74$n
                if (r4 < 0) goto L56
                r4 = r2
                goto L57
            L56:
                r4 = 0
            L57:
                int r5 = r1.f74$n
                if (r4 == 0) goto Le4
                int r4 = r1.f74$n
                if (r4 <= 0) goto La0
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r1.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r7 = r5
                r5 = r3
                r3 = r4
                r4 = r7
            L69:
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r5
                r1.L$1 = r4
                r1.I$0 = r3
                r1.label = r2
                java.lang.Object r6 = r4.hasNext(r6)
                if (r6 != r0) goto L7b
                return r0
            L7b:
                r7 = r0
                r0 = r9
                r9 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L83:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9c
                r5.next()
                int r9 = r4 + (-1)
                if (r9 != 0) goto L94
                goto L9c
            L94:
                r4 = r5
                r5 = r6
                r7 = r3
                r3 = r9
                r9 = r0
                r0 = r1
                r1 = r7
                goto L69
            L9c:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r6
            La0:
                kotlinx.coroutines.channels.ReceiveChannel<E> r2 = r1.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()
            La6:
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r1.L$0 = r3
                r1.L$1 = r2
                r5 = 2
                r1.label = r5
                java.lang.Object r4 = r2.hasNext(r4)
                if (r4 != r0) goto Lb7
                return r0
            Lb7:
                r7 = r0
                r0 = r9
                r9 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r7
            Lbe:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Le1
                java.lang.Object r9 = r3.next()
                r5 = r2
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r2.L$0 = r4
                r2.L$1 = r3
                r6 = 3
                r2.label = r6
                java.lang.Object r9 = r4.send(r9, r5)
                if (r9 != r1) goto Ldb
                return r1
            Ldb:
                r9 = r0
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
            Le0:
                goto La6
            Le1:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            Le4:
                r0 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Requested element count "
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r4 = " is less than zero."
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.String r0 = r2.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", m125f = "Deprecated.kt", m126i = {0, 1, 1, 2, 3, 4}, m127l = {181, 182, 183, 187, 188}, m128m = "invokeSuspend", m129n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, m130s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    static final class C08451<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_dropWhile;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C08451(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08451> r4) {
                r1 = this;
                r1.$this_dropWhile = r2
                r1.$predicate = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_dropWhile
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08451) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 0
                switch(r1) {
                    case 0: goto L68;
                    case 1: goto L56;
                    case 2: goto L41;
                    case 3: goto L37;
                    case 4: goto L25;
                    case 5: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L12:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r5 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r2
                goto L113
            L25:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r5 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto Lf5
            L37:
                r1 = r9
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r10)
                goto Ld0
            L41:
                r1 = r9
                java.lang.Object r3 = r1.L$2
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto Lb1
            L56:
                r1 = r9
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r10)
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L8f
            L68:
                kotlin.ResultKt.throwOnFailure(r10)
                r1 = r9
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_dropWhile
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            L76:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r3
                r1.L$1 = r4
                r1.L$2 = r2
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r4.hasNext(r5)
                if (r5 != r0) goto L89
                return r0
            L89:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r3
                r3 = r1
                r1 = r8
            L8f:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Ldb
                java.lang.Object r10 = r4.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r6 = r3.$predicate
                r3.L$0 = r5
                r3.L$1 = r4
                r3.L$2 = r10
                r7 = 2
                r3.label = r7
                java.lang.Object r6 = r6.invoke(r10, r3)
                if (r6 != r1) goto Lad
                return r1
            Lad:
                r8 = r4
                r4 = r10
                r10 = r6
                r6 = r8
            Lb1:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto Ld5
                r10 = r3
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                r3.L$0 = r5
                r3.L$1 = r2
                r3.L$2 = r2
                r2 = 3
                r3.label = r2
                java.lang.Object r10 = r5.send(r4, r10)
                if (r10 != r1) goto Lcc
                return r1
            Lcc:
                r10 = r0
                r0 = r1
                r1 = r3
                r2 = r5
            Ld0:
                r3 = r1
                r5 = r2
                r1 = r0
                r0 = r10
                goto Ldb
            Ld5:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                r4 = r6
                goto L76
            Ldb:
                kotlinx.coroutines.channels.ReceiveChannel<E> r10 = r3.$this_dropWhile
                kotlinx.coroutines.channels.ChannelIterator r10 = r10.iterator()
            Le1:
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3.L$0 = r5
                r3.L$1 = r10
                r4 = 4
                r3.label = r4
                java.lang.Object r2 = r10.hasNext(r2)
                if (r2 != r1) goto Lf2
                return r1
            Lf2:
                r8 = r2
                r2 = r10
                r10 = r8
            Lf5:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L114
                java.lang.Object r10 = r2.next()
                r4 = r3
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r3.L$0 = r5
                r3.L$1 = r2
                r6 = 5
                r3.label = r6
                java.lang.Object r10 = r5.send(r10, r4)
                if (r10 != r1) goto L112
                return r1
            L112:
                r10 = r2
            L113:
                goto Le1
            L114:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 0}, m127l = {38}, m128m = "elementAt", m129n = {"$this$consume$iv", "index", "count"}, m130s = {"L$0", "I$0", "I$1"})
    static final class C08461<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C08461(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08461> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                r0 = 0
                r1 = r3
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r2 = 0
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.elementAt(r2, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 0}, m127l = {53}, m128m = "elementAtOrNull", m129n = {"$this$consume$iv", "index", "count"}, m130s = {"L$0", "I$0", "I$1"})
    static final class C08471<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C08471(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08471> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                r0 = 0
                r1 = r3
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r2 = 0
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.elementAtOrNull(r2, r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", m125f = "Deprecated.kt", m126i = {0, 1, 1, 2}, m127l = {198, 199, 199}, m128m = "invokeSuspend", m129n = {"$this$produce", "$this$produce", "e", "$this$produce"}, m130s = {"L$0", "L$0", "L$2", "L$0"})
    static final class C08481<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_filter;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C08481(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08481> r4) {
                r1 = this;
                r1.$this_filter = r2
                r1.$predicate = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_filter
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08481) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 0
                switch(r1) {
                    case 0: goto L48;
                    case 1: goto L36;
                    case 2: goto L20;
                    case 3: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L12:
                r1 = r9
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r10)
                goto Lb6
            L20:
                r1 = r9
                java.lang.Object r3 = r1.L$2
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L96
            L36:
                r1 = r9
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r10)
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L73
            L48:
                kotlin.ResultKt.throwOnFailure(r10)
                r1 = r9
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_filter
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
                r8 = r4
                r4 = r3
                r3 = r8
            L59:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r4
                r1.L$1 = r3
                r1.L$2 = r2
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r3.hasNext(r5)
                if (r5 != r0) goto L6c
                return r0
            L6c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L73:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Lbd
                java.lang.Object r10 = r4.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r6 = r3.$predicate
                r3.L$0 = r5
                r3.L$1 = r4
                r3.L$2 = r10
                r7 = 2
                r3.label = r7
                java.lang.Object r6 = r6.invoke(r10, r3)
                if (r6 != r1) goto L91
                return r1
            L91:
                r8 = r4
                r4 = r10
                r10 = r6
                r6 = r5
                r5 = r8
            L96:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Lb7
                r10 = r3
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                r3.L$0 = r6
                r3.L$1 = r5
                r3.L$2 = r2
                r7 = 3
                r3.label = r7
                java.lang.Object r10 = r6.send(r4, r10)
                if (r10 != r1) goto Lb1
                return r1
            Lb1:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                r4 = r6
            Lb6:
                goto L59
            Lb7:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                r4 = r6
                goto L59
            Lbd:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1, 1, 2, 2}, m127l = {211, 212, 212}, m128m = "invokeSuspend", m129n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, m130s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    static final class C08491<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_filterIndexed;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C08491(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08491> r4) {
                r1 = this;
                r1.$this_filterIndexed = r2
                r1.$predicate = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_filterIndexed
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08491) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 0
                switch(r1) {
                    case 0: goto L4d;
                    case 1: goto L38;
                    case 2: goto L22;
                    case 3: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L12:
                r1 = r11
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r12)
                goto Lc9
            L22:
                r1 = r11
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$2
                java.lang.Object r5 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r12)
                r8 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                goto La6
            L38:
                r1 = r11
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r12)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                goto L7d
            L4d:
                kotlin.ResultKt.throwOnFailure(r12)
                r1 = r11
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                r4 = 0
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r1.$this_filterIndexed
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r10 = r5
                r5 = r3
                r3 = r4
                r4 = r10
            L60:
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r5
                r1.L$1 = r4
                r1.L$2 = r2
                r1.I$0 = r3
                r7 = 1
                r1.label = r7
                java.lang.Object r6 = r4.hasNext(r6)
                if (r6 != r0) goto L75
                return r0
            L75:
                r10 = r0
                r0 = r12
                r12 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L7d:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Ld1
                java.lang.Object r12 = r5.next()
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r7 = r3.$predicate
                int r8 = r4 + 1
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
                r3.L$0 = r6
                r3.L$1 = r5
                r3.L$2 = r12
                r3.I$0 = r8
                r9 = 2
                r3.label = r9
                java.lang.Object r4 = r7.invoke(r4, r12, r3)
                if (r4 != r1) goto La3
                return r1
            La3:
                r10 = r4
                r4 = r12
                r12 = r10
            La6:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lca
                r12 = r3
                kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
                r3.L$0 = r6
                r3.L$1 = r5
                r3.L$2 = r2
                r3.I$0 = r8
                r7 = 3
                r3.label = r7
                java.lang.Object r12 = r6.send(r4, r12)
                if (r12 != r1) goto Lc3
                return r1
            Lc3:
                r12 = r0
                r0 = r1
                r1 = r3
                r4 = r5
                r5 = r6
                r3 = r8
            Lc9:
                goto L60
            Lca:
                r12 = r0
                r0 = r1
                r1 = r3
                r4 = r5
                r5 = r6
                r3 = r8
                goto L60
            Ld1:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "it"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", m125f = "Deprecated.kt", m126i = {}, m127l = {222}, m128m = "invokeSuspend", m129n = {}, m130s = {})
    static final class C08501<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        /* synthetic */ java.lang.Object L$0;
        int label;

        C08501(kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08501> r3) {
                r1 = this;
                r1.$predicate = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r1 = r2.$predicate
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
                r1 = this;
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(E r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08501) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                switch(r1) {
                    case 0: goto L19;
                    case 1: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L12:
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r6)
                r1 = r0
                r0 = r6
                goto L2c
            L19:
                kotlin.ResultKt.throwOnFailure(r6)
                r1 = r5
                java.lang.Object r3 = r1.L$0
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r4 = r1.$predicate
                r1.label = r2
                java.lang.Object r3 = r4.invoke(r3, r1)
                if (r3 != r0) goto L2a
                return r0
            L2a:
                r0 = r6
                r6 = r3
            L2c:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                r6 = r6 ^ r2
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "", "it"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", m125f = "Deprecated.kt", m126i = {}, m127l = {}, m128m = "invokeSuspend", m129n = {}, m130s = {})
    static final class C08511<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        C08511(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08511> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1
                r0.<init>(r3)
                r0.L$0 = r2
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
                r1 = this;
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(E r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08511) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r3.label
                switch(r0) {
                    case 0: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L10:
                kotlin.ResultKt.throwOnFailure(r4)
                r0 = r3
                java.lang.Object r1 = r0.L$0
                if (r1 == 0) goto L1a
                r2 = 1
                goto L1b
            L1a:
                r2 = 0
            L1b:
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0}, m127l = {487}, m128m = "filterNotNullTo", m129n = {"destination", "$this$consume$iv$iv"}, m130s = {"L$0", "L$1"})
    static final class C08521<E, C extends java.util.Collection<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08521(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08521> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNullTo(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1}, m127l = {487, 242}, m128m = "filterNotNullTo", m129n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, m130s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C08533<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08533(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08533> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNullTo(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0}, m127l = {65}, m128m = "first", m129n = {"$this$consume$iv", "iterator"}, m130s = {"L$0", "L$1"})
    static final class C08541<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C08541(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08541> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.first(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0}, m127l = {75}, m128m = "firstOrNull", m129n = {"$this$consume$iv", "iterator"}, m130s = {"L$0", "L$1"})
    static final class C08551<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C08551(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08551> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.firstOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", m125f = "Deprecated.kt", m126i = {0, 1, 2}, m127l = {321, 322, 322}, m128m = "invokeSuspend", m129n = {"$this$produce", "$this$produce", "$this$produce"}, m130s = {"L$0", "L$0", "L$0"})
    static final class C08561<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_flatMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        C08561(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08561> r4) {
                r1 = this;
                r1.$this_flatMap = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_flatMap
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08561) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                switch(r1) {
                    case 0: goto L44;
                    case 1: goto L32;
                    case 2: goto L1f;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L11:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                goto La4
            L1f:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r10
                goto L89
            L32:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r10
                goto L6d
            L44:
                kotlin.ResultKt.throwOnFailure(r10)
                r1 = r9
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.ReceiveChannel<E> r3 = r1.$this_flatMap
                kotlinx.coroutines.channels.ChannelIterator r3 = r3.iterator()
                r8 = r3
                r3 = r2
                r2 = r8
            L55:
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r1.L$0 = r3
                r1.L$1 = r2
                r5 = 1
                r1.label = r5
                java.lang.Object r4 = r2.hasNext(r4)
                if (r4 != r0) goto L66
                return r0
            L66:
                r8 = r0
                r0 = r10
                r10 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r8
            L6d:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto La5
                java.lang.Object r10 = r3.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> r5 = r2.$transform
                r2.L$0 = r4
                r2.L$1 = r3
                r6 = 2
                r2.label = r6
                java.lang.Object r10 = r5.invoke(r10, r2)
                if (r10 != r1) goto L89
                return r1
            L89:
                kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
                r5 = r4
                kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
                r6 = r2
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r2.L$0 = r4
                r2.L$1 = r3
                r7 = 3
                r2.label = r7
                java.lang.Object r10 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r10, r5, r6)
                if (r10 != r1) goto L9f
                return r1
            L9f:
                r10 = r0
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
            La4:
                goto L55
            La5:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 0}, m127l = {487}, m128m = "indexOf", m129n = {"element", "index", "$this$consume$iv$iv"}, m130s = {"L$0", "L$1", "L$2"})
    static final class C08571<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C08571(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08571> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.indexOf(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1, 1}, m127l = {97, 100}, m128m = "last", m129n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m130s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C08581<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08581(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08581> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.last(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 0, 0}, m127l = {487}, m128m = "lastIndexOf", m129n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, m130s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C08591<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        C08591(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08591> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.lastIndexOf(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1, 1}, m127l = {123, 126}, m128m = "lastOrNull", m129n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m130s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C08601<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08601(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08601> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.lastOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1, 2, 2}, m127l = {487, 333, 333}, m128m = "invokeSuspend", m129n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, m130s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    static final class C08611<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_map;
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;

        C08611(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08611> r4) {
                r1 = this;
                r1.$this_map = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_map
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08611) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                r17 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r1 = r17
                int r2 = r1.label
                switch(r2) {
                    case 0: goto L88;
                    case 1: goto L5f;
                    case 2: goto L31;
                    case 3: goto L13;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L13:
                r2 = r17
                r3 = r18
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r8 = r2.L$3
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                r9 = 0
                java.lang.Object r10 = r2.L$2
                kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
                java.lang.Object r11 = r2.L$1
                kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
                java.lang.Object r12 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
                kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L85
                goto L10f
            L31:
                r2 = r17
                r3 = r18
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r8 = r2.L$4
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                java.lang.Object r9 = r2.L$3
                kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
                r10 = 0
                java.lang.Object r11 = r2.L$2
                kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
                java.lang.Object r12 = r2.L$1
                kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
                java.lang.Object r13 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
                kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L59
                r14 = r13
                r13 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                goto Lf0
            L59:
                r0 = move-exception
                r9 = r10
                r10 = r11
                r12 = r13
                goto L12f
            L5f:
                r2 = r17
                r3 = r18
                r4 = 0
                r5 = 0
                r6 = 0
                java.lang.Object r7 = r2.L$3
                kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
                r9 = 0
                java.lang.Object r8 = r2.L$2
                r10 = r8
                kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
                java.lang.Object r8 = r2.L$1
                kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
                java.lang.Object r11 = r2.L$0
                r12 = r11
                kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
                kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L85
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                goto Lca
            L85:
                r0 = move-exception
                goto L12f
            L88:
                kotlin.ResultKt.throwOnFailure(r18)
                r2 = r17
                r3 = r18
                java.lang.Object r4 = r2.L$0
                r12 = r4
                kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r2.$this_map
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r2.$transform
                r6 = 0
                r10 = r4
                r4 = 0
                r9 = 0
                r7 = r10
                r8 = 0
                kotlinx.coroutines.channels.ChannelIterator r11 = r7.iterator()     // Catch: java.lang.Throwable -> L12c
                r7 = r11
                r16 = r5
                r5 = r4
                r4 = r6
                r6 = r8
                r8 = r16
            Lac:
                r2.L$0 = r12     // Catch: java.lang.Throwable -> L85
                r2.L$1 = r8     // Catch: java.lang.Throwable -> L85
                r2.L$2 = r10     // Catch: java.lang.Throwable -> L85
                r2.L$3 = r7     // Catch: java.lang.Throwable -> L85
                r11 = 1
                r2.label = r11     // Catch: java.lang.Throwable -> L85
                java.lang.Object r11 = r7.hasNext(r2)     // Catch: java.lang.Throwable -> L85
                if (r11 != r0) goto Lbe
                return r0
            Lbe:
                r16 = r4
                r4 = r3
                r3 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r16
            Lca:
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L125
                boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L125
                if (r3 == 0) goto L11a
                java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L125
                r13 = 0
                r2.L$0 = r12     // Catch: java.lang.Throwable -> L125
                r2.L$1 = r9     // Catch: java.lang.Throwable -> L125
                r2.L$2 = r11     // Catch: java.lang.Throwable -> L125
                r2.L$3 = r8     // Catch: java.lang.Throwable -> L125
                r2.L$4 = r12     // Catch: java.lang.Throwable -> L125
                r14 = 2
                r2.label = r14     // Catch: java.lang.Throwable -> L125
                java.lang.Object r14 = r9.invoke(r3, r2)     // Catch: java.lang.Throwable -> L125
                if (r14 != r0) goto Leb
                return r0
            Leb:
                r3 = r14
                r14 = r12
                r12 = r9
                r9 = r8
                r8 = r14
            Lf0:
                r2.L$0 = r14     // Catch: java.lang.Throwable -> L112
                r2.L$1 = r12     // Catch: java.lang.Throwable -> L112
                r2.L$2 = r11     // Catch: java.lang.Throwable -> L112
                r2.L$3 = r9     // Catch: java.lang.Throwable -> L112
                r15 = 0
                r2.L$4 = r15     // Catch: java.lang.Throwable -> L112
                r15 = 3
                r2.label = r15     // Catch: java.lang.Throwable -> L112
                java.lang.Object r3 = r8.send(r3, r2)     // Catch: java.lang.Throwable -> L112
                if (r3 != r0) goto L105
                return r0
            L105:
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r12
                r7 = r13
                r12 = r14
            L10f:
                r7 = r8
                r8 = r11
                goto Lac
            L112:
                r0 = move-exception
                r3 = r4
                r4 = r5
                r5 = r6
                r9 = r10
                r10 = r11
                r12 = r14
                goto L12f
            L11a:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L125
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r11, r10)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L125:
                r0 = move-exception
                r3 = r4
                r4 = r5
                r5 = r6
                r9 = r10
                r10 = r11
                goto L12f
            L12c:
                r0 = move-exception
                r5 = r4
                r4 = r6
            L12f:
                r6 = r0
                throw r0     // Catch: java.lang.Throwable -> L132
            L132:
                r0 = move-exception
                r7 = r0
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r10, r6)
                throw r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1, 2, 2}, m127l = {344, 345, 345}, m128m = "invokeSuspend", m129n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, m130s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    static final class C08621<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_mapIndexed;
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C08621(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08621> r4) {
                r1 = this;
                r1.$this_mapIndexed = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_mapIndexed
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08621) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                switch(r1) {
                    case 0: goto L51;
                    case 1: goto L3d;
                    case 2: goto L25;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L11:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r9 = r3
                r3 = r2
                r2 = r4
                r4 = r9
                goto Lbe
            L25:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$2
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto La3
            L3d:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r5 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto L7a
            L51:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                r3 = 0
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_mapIndexed
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            L60:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r1.L$1 = r4
                r1.I$0 = r3
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r4.hasNext(r5)
                if (r5 != r0) goto L73
                return r0
            L73:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r2
                r2 = r1
                r1 = r9
            L7a:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbf
                java.lang.Object r11 = r5.next()
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r2.$transform
                int r7 = r3 + 1
                java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
                r2.L$0 = r4
                r2.L$1 = r5
                r2.L$2 = r4
                r2.I$0 = r7
                r8 = 2
                r2.label = r8
                java.lang.Object r11 = r6.invoke(r3, r11, r2)
                if (r11 != r1) goto La0
                return r1
            La0:
                r3 = r4
                r4 = r5
                r5 = r3
            La3:
                r6 = r2
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r2.L$0 = r5
                r2.L$1 = r4
                r8 = 0
                r2.L$2 = r8
                r2.I$0 = r7
                r8 = 3
                r2.label = r8
                java.lang.Object r11 = r3.send(r11, r6)
                if (r11 != r1) goto Lb9
                return r1
            Lb9:
                r11 = r0
                r0 = r1
                r1 = r2
                r2 = r5
                r3 = r7
            Lbe:
                goto L60
            Lbf:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 0, 1, 1, 1, 1}, m127l = {420, 422}, m128m = "maxWith", m129n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, m130s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C08631<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C08631(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08631> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.maxWith(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 0, 1, 1, 1, 1}, m127l = {434, 436}, m128m = "minWith", m129n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, m130s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C08641<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C08641(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08641> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.minWith(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0}, m127l = {447}, m128m = "none", m129n = {"$this$consume$iv"}, m130s = {"L$0"})
    static final class C08651<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C08651(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08651> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.none(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\u008a@"}, m115d2 = {"<anonymous>", "E", "", "it"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", m125f = "Deprecated.kt", m126i = {}, m127l = {}, m128m = "invokeSuspend", m129n = {}, m130s = {})
    static final class C08661<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super E>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_requireNoNulls;
        /* synthetic */ java.lang.Object L$0;
        int label;

        C08661(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08661> r3) {
                r1 = this;
                r1.$this_requireNoNulls = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r2.$this_requireNoNulls
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(E r3, kotlin.coroutines.Continuation<? super E> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08661) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r5.label
                switch(r0) {
                    case 0: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L10:
                kotlin.ResultKt.throwOnFailure(r6)
                r0 = r5
                java.lang.Object r1 = r0.L$0
                if (r1 == 0) goto L19
                return r1
            L19:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "null element found in "
                java.lang.StringBuilder r3 = r3.append(r4)
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r0.$this_requireNoNulls
                java.lang.StringBuilder r3 = r3.append(r4)
                r4 = 46
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1}, m127l = {136, 139}, m128m = "single", m129n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, m130s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C08671<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C08671(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08671> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.single(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1}, m127l = {149, 152}, m128m = "singleOrNull", m129n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, m130s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C08681<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C08681(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08681> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.singleOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1}, m127l = {254, 255}, m128m = "invokeSuspend", m129n = {"$this$produce", "remaining", "$this$produce", "remaining"}, m130s = {"L$0", "I$0", "L$0", "I$0"})
    static final class C08691<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* JADX INFO: renamed from: $n */
        final /* synthetic */ int f75$n;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_take;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        C08691(int r2, kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08691> r4) {
                r1 = this;
                r1.f75$n = r2
                r1.$this_take = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1
                int r1 = r3.f75$n
                kotlinx.coroutines.channels.ReceiveChannel<E> r2 = r3.$this_take
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08691) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 1
                switch(r1) {
                    case 0: goto L37;
                    case 1: goto L22;
                    case 2: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L12:
                r1 = r10
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                goto L96
            L22:
                r1 = r10
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L71
            L37:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                int r4 = r1.f75$n
                if (r4 != 0) goto L46
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L46:
                int r4 = r1.f75$n
                if (r4 < 0) goto L4c
                r4 = r2
                goto L4d
            L4c:
                r4 = 0
            L4d:
                int r5 = r1.f75$n
                if (r4 == 0) goto La6
                int r4 = r1.f75$n
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r1.$this_take
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            L59:
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r3
                r1.L$1 = r5
                r1.I$0 = r4
                r1.label = r2
                java.lang.Object r6 = r5.hasNext(r6)
                if (r6 != r0) goto L6b
                return r0
            L6b:
                r9 = r0
                r0 = r11
                r11 = r6
                r6 = r3
                r3 = r1
                r1 = r9
            L71:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La3
                java.lang.Object r11 = r5.next()
                r7 = r3
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r3.L$0 = r6
                r3.L$1 = r5
                r3.I$0 = r4
                r8 = 2
                r3.label = r8
                java.lang.Object r11 = r6.send(r11, r7)
                if (r11 != r1) goto L90
                return r1
            L90:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                r5 = r6
            L96:
                int r3 = r3 + (-1)
                if (r3 != 0) goto L9e
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L9e:
                r9 = r4
                r4 = r3
                r3 = r5
                r5 = r9
                goto L59
            La3:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            La6:
                r0 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Requested element count "
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r4 = " is less than zero."
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.String r0 = r2.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", m125f = "Deprecated.kt", m126i = {0, 1, 1, 2}, m127l = {269, 270, 271}, m128m = "invokeSuspend", m129n = {"$this$produce", "$this$produce", "e", "$this$produce"}, m130s = {"L$0", "L$0", "L$2", "L$0"})
    static final class C08701<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_takeWhile;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C08701(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08701> r4) {
                r1 = this;
                r1.$this_takeWhile = r2
                r1.$predicate = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_takeWhile
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08701) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                switch(r1) {
                    case 0: goto L47;
                    case 1: goto L35;
                    case 2: goto L1f;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L11:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                goto Lb7
            L1f:
                r1 = r8
                java.lang.Object r2 = r1.L$2
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r9
                goto L93
            L35:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r9
                goto L70
            L47:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.ReceiveChannel<E> r3 = r1.$this_takeWhile
                kotlinx.coroutines.channels.ChannelIterator r3 = r3.iterator()
                r7 = r3
                r3 = r2
                r2 = r7
            L58:
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r1.L$0 = r3
                r1.L$1 = r2
                r5 = 1
                r1.label = r5
                java.lang.Object r4 = r2.hasNext(r4)
                if (r4 != r0) goto L69
                return r0
            L69:
                r7 = r0
                r0 = r9
                r9 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r7
            L70:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Lb8
                java.lang.Object r9 = r3.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r5 = r2.$predicate
                r2.L$0 = r4
                r2.L$1 = r3
                r2.L$2 = r9
                r6 = 2
                r2.label = r6
                java.lang.Object r5 = r5.invoke(r9, r2)
                if (r5 != r1) goto L8e
                return r1
            L8e:
                r7 = r3
                r3 = r9
                r9 = r5
                r5 = r4
                r4 = r7
            L93:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L9e
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            L9e:
                r9 = r2
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r2.L$0 = r5
                r2.L$1 = r4
                r6 = 0
                r2.L$2 = r6
                r6 = 3
                r2.label = r6
                java.lang.Object r9 = r5.send(r3, r9)
                if (r9 != r1) goto Lb2
                return r1
            Lb2:
                r9 = r0
                r0 = r1
                r1 = r2
                r2 = r4
                r3 = r5
            Lb7:
                goto L58
            Lb8:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1}, m127l = {487, 278}, m128m = "toChannel", m129n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, m130s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C08711<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08711(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08711> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0}, m127l = {487}, m128m = "toCollection", m129n = {"destination", "$this$consume$iv$iv"}, m130s = {"L$0", "L$1"})
    static final class C08721<E, C extends java.util.Collection<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08721(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08721> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toCollection(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m125f = "Deprecated.kt", m126i = {0, 0}, m127l = {487}, m128m = "toMap", m129n = {"destination", "$this$consume$iv$iv"}, m130s = {"L$0", "L$1"})
    static final class C08732<K, V, M extends java.util.Map<? super K, ? super V>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08732(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08732> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toMap(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", m125f = "Deprecated.kt", m126i = {0, 0, 1, 1}, m127l = {370, 371}, m128m = "invokeSuspend", m129n = {"$this$produce", "index", "$this$produce", "index"}, m130s = {"L$0", "I$0", "L$0", "I$0"})
    static final class C08741<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.collections.IndexedValue<? extends E>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_withIndex;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        C08741(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08741> r3) {
                r1 = this;
                r1.$this_withIndex = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r2.$this_withIndex
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.collections.IndexedValue<? extends E>> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08741) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                switch(r1) {
                    case 0: goto L3a;
                    case 1: goto L25;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L11:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r9 = r3
                r3 = r2
                r2 = r4
                r4 = r9
                goto L8d
            L25:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto L62
            L3a:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                r3 = 0
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_withIndex
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            L49:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r1.L$1 = r4
                r1.I$0 = r3
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r4.hasNext(r5)
                if (r5 != r0) goto L5c
                return r0
            L5c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r2
                r2 = r1
                r1 = r9
            L62:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L8e
                java.lang.Object r11 = r4.next()
                kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue
                int r7 = r3 + 1
                r6.<init>(r3, r11)
                r3 = r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r2.L$0 = r5
                r2.L$1 = r4
                r2.I$0 = r7
                r8 = 2
                r2.label = r8
                java.lang.Object r11 = r5.send(r6, r3)
                if (r11 != r1) goto L88
                return r1
            L88:
                r11 = r0
                r0 = r1
                r1 = r2
                r2 = r5
                r3 = r7
            L8d:
                goto L49
            L8e:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }


    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, m115d2 = {"<anonymous>", "", "E", "R", "V", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", m125f = "Deprecated.kt", m126i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, m127l = {487, 469, 471}, m128m = "invokeSuspend", m129n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, m130s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    static final class C08762<V> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super V>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<R> $other;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_zip;
        final /* synthetic */ kotlin.jvm.functions.Function2<E, R, V> $transform;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;

        C08762(kotlinx.coroutines.channels.ReceiveChannel<? extends R> r2, kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08762> r5) {
                r1 = this;
                r1.$other = r2
                r1.$this_zip = r3
                r1.$transform = r4
                r0 = 2
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2
                kotlinx.coroutines.channels.ReceiveChannel<R> r1 = r4.$other
                kotlinx.coroutines.channels.ReceiveChannel<E> r2 = r4.$this_zip
                kotlin.jvm.functions.Function2<E, R, V> r3 = r4.$transform
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super V> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08762) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                r17 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r1 = r17
                int r2 = r1.label
                r3 = 0
                switch(r2) {
                    case 0: goto L9a;
                    case 1: goto L6c;
                    case 2: goto L38;
                    case 3: goto L14;
                    default: goto Lc;
                }
            Lc:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L14:
                r2 = r17
                r4 = r18
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                java.lang.Object r9 = r2.L$4
                kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
                r10 = 0
                java.lang.Object r11 = r2.L$3
                kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
                java.lang.Object r12 = r2.L$2
                kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
                java.lang.Object r13 = r2.L$1
                kotlinx.coroutines.channels.ChannelIterator r13 = (kotlinx.coroutines.channels.ChannelIterator) r13
                java.lang.Object r14 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r14 = (kotlinx.coroutines.channels.ProducerScope) r14
                kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L97
                r1 = r10
                r10 = r12
                goto L14a
            L38:
                r2 = r17
                r4 = r18
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                java.lang.Object r9 = r2.L$5
                java.lang.Object r10 = r2.L$4
                kotlinx.coroutines.channels.ChannelIterator r10 = (kotlinx.coroutines.channels.ChannelIterator) r10
                java.lang.Object r11 = r2.L$3
                kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
                java.lang.Object r12 = r2.L$2
                kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
                java.lang.Object r13 = r2.L$1
                kotlinx.coroutines.channels.ChannelIterator r13 = (kotlinx.coroutines.channels.ChannelIterator) r13
                java.lang.Object r14 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r14 = (kotlinx.coroutines.channels.ProducerScope) r14
                kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L68
                r15 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r16 = r11
                r11 = r3
                r3 = r9
                r9 = r10
                r10 = r12
                r12 = r16
                goto L10e
            L68:
                r0 = move-exception
                r10 = r3
                goto L175
            L6c:
                r2 = r17
                r4 = r18
                r5 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r8 = r2.L$4
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                r10 = 0
                java.lang.Object r9 = r2.L$3
                kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
                r11 = r9
                java.lang.Object r9 = r2.L$2
                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                java.lang.Object r12 = r2.L$1
                r13 = r12
                kotlinx.coroutines.channels.ChannelIterator r13 = (kotlinx.coroutines.channels.ChannelIterator) r13
                java.lang.Object r12 = r2.L$0
                r14 = r12
                kotlinx.coroutines.channels.ProducerScope r14 = (kotlinx.coroutines.channels.ProducerScope) r14
                kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L97
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                goto Le6
            L97:
                r0 = move-exception
                goto L175
            L9a:
                kotlin.ResultKt.throwOnFailure(r18)
                r2 = r17
                r4 = r18
                java.lang.Object r5 = r2.L$0
                r14 = r5
                kotlinx.coroutines.channels.ProducerScope r14 = (kotlinx.coroutines.channels.ProducerScope) r14
                kotlinx.coroutines.channels.ReceiveChannel<R> r5 = r2.$other
                kotlinx.coroutines.channels.ChannelIterator r13 = r5.iterator()
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r2.$this_zip
                kotlin.jvm.functions.Function2<E, R, V> r6 = r2.$transform
                r7 = 0
                r11 = r5
                r5 = 0
                r10 = 0
                r8 = r11
                r9 = 0
                kotlinx.coroutines.channels.ChannelIterator r12 = r8.iterator()     // Catch: java.lang.Throwable -> L172
                r8 = r12
                r16 = r6
                r6 = r5
                r5 = r7
                r7 = r9
                r9 = r16
            Lc4:
                r2.L$0 = r14     // Catch: java.lang.Throwable -> L97
                r2.L$1 = r13     // Catch: java.lang.Throwable -> L97
                r2.L$2 = r9     // Catch: java.lang.Throwable -> L97
                r2.L$3 = r11     // Catch: java.lang.Throwable -> L97
                r2.L$4 = r8     // Catch: java.lang.Throwable -> L97
                r2.L$5 = r3     // Catch: java.lang.Throwable -> L97
                r12 = 1
                r2.label = r12     // Catch: java.lang.Throwable -> L97
                java.lang.Object r12 = r8.hasNext(r2)     // Catch: java.lang.Throwable -> L97
                if (r12 != r0) goto Lda
                return r0
            Lda:
                r16 = r5
                r5 = r4
                r4 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r16
            Le6:
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L16b
                boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L16b
                if (r4 == 0) goto L160
                java.lang.Object r4 = r9.next()     // Catch: java.lang.Throwable -> L16b
                r15 = 0
                r2.L$0 = r14     // Catch: java.lang.Throwable -> L16b
                r2.L$1 = r13     // Catch: java.lang.Throwable -> L16b
                r2.L$2 = r10     // Catch: java.lang.Throwable -> L16b
                r2.L$3 = r12     // Catch: java.lang.Throwable -> L16b
                r2.L$4 = r9     // Catch: java.lang.Throwable -> L16b
                r2.L$5 = r4     // Catch: java.lang.Throwable -> L16b
                r3 = 2
                r2.label = r3     // Catch: java.lang.Throwable -> L16b
                java.lang.Object r3 = r13.hasNext(r2)     // Catch: java.lang.Throwable -> L16b
                if (r3 != r0) goto L109
                return r0
            L109:
                r16 = r4
                r4 = r3
                r3 = r16
            L10e:
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L159
                boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L159
                if (r4 != 0) goto L121
                r3 = r11
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r11 = r12
                r10 = r3
                r3 = 0
                goto Lc4
            L121:
                r4 = r11
                java.lang.Object r11 = r13.next()     // Catch: java.lang.Throwable -> L152
                java.lang.Object r1 = r10.invoke(r3, r11)     // Catch: java.lang.Throwable -> L152
                r2.L$0 = r14     // Catch: java.lang.Throwable -> L152
                r2.L$1 = r13     // Catch: java.lang.Throwable -> L152
                r2.L$2 = r10     // Catch: java.lang.Throwable -> L152
                r2.L$3 = r12     // Catch: java.lang.Throwable -> L152
                r2.L$4 = r9     // Catch: java.lang.Throwable -> L152
                r18 = r3
                r3 = 0
                r2.L$5 = r3     // Catch: java.lang.Throwable -> L152
                r3 = 3
                r2.label = r3     // Catch: java.lang.Throwable -> L152
                java.lang.Object r1 = r14.send(r1, r2)     // Catch: java.lang.Throwable -> L152
                if (r1 != r0) goto L143
                return r0
            L143:
                r1 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r11 = r12
                r8 = r15
            L14a:
                r8 = r9
                r9 = r10
                r3 = 0
                r10 = r1
                r1 = r17
                goto Lc4
            L152:
                r0 = move-exception
                r10 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r11 = r12
                goto L175
            L159:
                r0 = move-exception
                r10 = r11
                r4 = r5
                r5 = r6
                r6 = r7
                r11 = r12
                goto L175
            L160:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L16b
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r12, r11)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L16b:
                r0 = move-exception
                r4 = r5
                r5 = r6
                r6 = r7
                r10 = r11
                r11 = r12
                goto L175
            L172:
                r0 = move-exception
                r6 = r5
                r5 = r7
            L175:
                r1 = r0
                throw r0     // Catch: java.lang.Throwable -> L178
            L178:
                r0 = move-exception
                r3 = r0
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r11, r1)
                throw r3
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.Continuation r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08381
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            r0.<init>(r9)
        L19:
            r9 = r0
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            r8 = 0
            r1 = 0
            java.lang.Object r2 = r9.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            r3 = 0
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L39
            r6 = r0
            goto L55
        L39:
            r1 = move-exception
            goto L5a
        L3b:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r8
            r8 = 0
            r3 = 0
            r4 = r2
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L59
            r9.L$0 = r2     // Catch: java.lang.Throwable -> L59
            r7 = 1
            r9.label = r7     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.hasNext(r9)     // Catch: java.lang.Throwable -> L59
            if (r6 != r1) goto L55
            return r1
        L55:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            return r6
        L59:
            r1 = move-exception
        L5a:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> L5d
        L5d:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            throw r1
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumes(kotlinx.coroutines.channels.ReceiveChannel<?> r1) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumes$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumes$1
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumesAll(kotlinx.coroutines.channels.ReceiveChannel<?>... r1) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumesAll$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumesAll$1
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r13, kotlin.coroutines.Continuation r14) {
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08411
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08411) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r14)
        L19:
            r14 = r0
            java.lang.Object r0 = r14.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r14.label
            r3 = 1
            switch(r2) {
                case 0: goto L4d;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2e:
            r13 = 0
            r2 = 0
            r4 = 0
            java.lang.Object r5 = r14.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            r6 = 0
            java.lang.Object r7 = r14.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r14.L$0
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L4a
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            goto L81
        L4a:
            r1 = move-exception
            goto Lb8
        L4d:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            r8 = r2
            r2 = 0
            r7 = r13
            r13 = 0
            r6 = 0
            r4 = r7
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r9 = r4.iterator()     // Catch: java.lang.Throwable -> Lb4
            r4 = r5
            r5 = r9
            r12 = r2
            r2 = r13
            r13 = r12
        L68:
            r14.L$0 = r8     // Catch: java.lang.Throwable -> L4a
            r14.L$1 = r7     // Catch: java.lang.Throwable -> L4a
            r14.L$2 = r5     // Catch: java.lang.Throwable -> L4a
            r14.label = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r9 = r5.hasNext(r14)     // Catch: java.lang.Throwable -> L4a
            if (r9 != r1) goto L77
            return r1
        L77:
            r12 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r12
        L81:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> Lab
            r10 = 0
            int r11 = r9.element     // Catch: java.lang.Throwable -> Lab
            int r11 = r11 + r3
            r9.element = r11     // Catch: java.lang.Throwable -> Lab
            r0 = r1
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            goto L68
        L9c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lab
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            int r13 = r9.element
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r13)
            return r13
        Lab:
            r0 = move-exception
            r2 = r4
            r6 = r7
            r7 = r8
            r8 = r9
            r12 = r1
            r1 = r0
            r0 = r12
            goto Lb8
        Lb4:
            r1 = move-exception
            r12 = r2
            r2 = r13
            r13 = r12
        Lb8:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinct(kotlinx.coroutines.channels.ReceiveChannel r3) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 1
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.distinctBy$default(r3, r1, r0, r2, r1)
            return r0
    }

    public static final <E, K> kotlinx.coroutines.channels.ReceiveChannel<E> distinctBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinctBy$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.distinctBy(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, kotlin.coroutines.CoroutineContext r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1
            r2 = 0
            r0.<init>(r10, r9, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r11
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.drop(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2 r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.dropWhile(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r13, int r14, kotlin.coroutines.Continuation r15) {
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08461
            if (r0 == 0) goto L14
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r15)
        L19:
            r15 = r0
            java.lang.Object r0 = r15.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r15.label
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            switch(r2) {
                case 0: goto L50;
                case 1: goto L31;
                default: goto L29;
            }
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            r13 = 0
            r14 = 0
            int r2 = r15.I$1
            int r5 = r15.I$0
            java.lang.Object r6 = r15.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r15.L$0
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            r8 = 0
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L4b
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r1
            r1 = r0
            goto L84
        L4b:
            r14 = move-exception
            r1 = r7
            r2 = r8
            goto Lf3
        L50:
            kotlin.ResultKt.throwOnFailure(r0)
            r5 = r14
            r14 = 0
            r2 = 0
            r6 = r13
            r7 = 0
            if (r5 < 0) goto Ld8
            r8 = 0
            kotlinx.coroutines.channels.ChannelIterator r9 = r6.iterator()     // Catch: java.lang.Throwable -> Ld2
            r6 = r9
            r11 = r7
            r7 = r13
            r13 = r14
            r14 = r11
            r12 = r8
            r8 = r2
            r2 = r12
        L69:
            r15.L$0 = r7     // Catch: java.lang.Throwable -> Lce
            r15.L$1 = r6     // Catch: java.lang.Throwable -> Lce
            r15.I$0 = r5     // Catch: java.lang.Throwable -> Lce
            r15.I$1 = r2     // Catch: java.lang.Throwable -> Lce
            r9 = 1
            r15.label = r9     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r9 = r6.hasNext(r15)     // Catch: java.lang.Throwable -> Lce
            if (r9 != r1) goto L7b
            return r1
        L7b:
            r11 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r11
        L84:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto La3
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> Lc6
            int r10 = r5 + 1
            if (r6 != r5) goto L9a
        L96:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
            return r0
        L9a:
            r0 = r8
            r8 = r9
            r5 = r6
            r6 = r7
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r10
            goto L69
        La3:
            r0 = r8
            r2 = r9
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r8.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r4 = r8.append(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lc0
            r7.<init>(r3)     // Catch: java.lang.Throwable -> Lc0
            throw r7     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r14 = move-exception
            r5 = r6
            r11 = r1
            r1 = r0
            r0 = r11
            goto Lf3
        Lc6:
            r14 = move-exception
            r0 = r8
            r2 = r9
            r5 = r6
            r11 = r1
            r1 = r0
            r0 = r11
            goto Lf3
        Lce:
            r14 = move-exception
            r1 = r7
            r2 = r8
            goto Lf3
        Ld2:
            r1 = move-exception
            r11 = r1
            r1 = r13
            r13 = r14
            r14 = r11
            goto Lf3
        Ld8:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> Ld2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld2
            r6.<init>()     // Catch: java.lang.Throwable -> Ld2
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Throwable -> Ld2
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> Ld2
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld2
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Ld2
            throw r1     // Catch: java.lang.Throwable -> Ld2
        Lf3:
            r2 = r14
            throw r14     // Catch: java.lang.Throwable -> Lf6
        Lf6:
            r14 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r2)
            throw r14
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r11, int r12, kotlin.coroutines.Continuation r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08471
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r13)
        L19:
            r13 = r0
            java.lang.Object r0 = r13.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r13.label
            r3 = 0
            switch(r2) {
                case 0: goto L4c;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2e:
            r11 = 0
            r12 = 0
            int r2 = r13.I$1
            int r4 = r13.I$0
            java.lang.Object r5 = r13.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r13.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L47
            r8 = r3
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            goto L82
        L47:
            r11 = move-exception
            r1 = r6
            r2 = r3
            goto Lb6
        L4c:
            kotlin.ResultKt.throwOnFailure(r0)
            r4 = r12
            r12 = 0
            r2 = r11
            r5 = 0
            if (r4 >= 0) goto L5e
        L5a:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r11, r3)
            return r3
        L5e:
            r6 = r3
            r7 = 0
            kotlinx.coroutines.channels.ChannelIterator r8 = r2.iterator()     // Catch: java.lang.Throwable -> Lb1
            r2 = r7
            r7 = r11
            r11 = r5
            r5 = r8
        L68:
            r13.L$0 = r7     // Catch: java.lang.Throwable -> Lad
            r13.L$1 = r5     // Catch: java.lang.Throwable -> Lad
            r13.I$0 = r4     // Catch: java.lang.Throwable -> Lad
            r13.I$1 = r2     // Catch: java.lang.Throwable -> Lad
            r8 = 1
            r13.label = r8     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r8 = r5.hasNext(r13)     // Catch: java.lang.Throwable -> Lad
            if (r8 != r1) goto L7a
            return r1
        L7a:
            r10 = r1
            r1 = r0
            r0 = r8
            r8 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r10
        L82:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La5
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto La0
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> La5
            int r9 = r4 + 1
            if (r5 != r4) goto L98
        L94:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            return r0
        L98:
            r0 = r8
            r4 = r5
            r5 = r6
            r6 = r0
            r0 = r1
            r1 = r2
            r2 = r9
            goto L68
        La0:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r8)
            return r3
        La5:
            r11 = move-exception
            r0 = r7
            r2 = r8
            r4 = r5
            r10 = r1
            r1 = r0
            r0 = r10
            goto Lb6
        Lad:
            r11 = move-exception
            r2 = r6
            r1 = r7
            goto Lb6
        Lb1:
            r1 = move-exception
            r2 = r6
            r10 = r1
            r1 = r11
            r11 = r10
        Lb6:
            r2 = r11
            throw r11     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r11 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r2)
            throw r11
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filter(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filter$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filter(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function3 r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterIndexed(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot(kotlinx.coroutines.channels.ReceiveChannel r2, kotlin.coroutines.CoroutineContext r3, kotlin.jvm.functions.Function2 r4) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1
            r1 = 0
            r0.<init>(r4, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filter(r2, r3, r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterNot(r0, r1, r2)
            return r0
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterNotNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 1
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filter$default(r3, r1, r0, r2, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r11, java.util.Collection r12, kotlin.coroutines.Continuation r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08521
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r13)
        L19:
            r13 = r0
            java.lang.Object r0 = r13.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r13.label
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2d:
            r11 = 0
            r12 = 0
            r2 = 0
            java.lang.Object r3 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r13.L$0
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L48
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto L7a
        L48:
            r1 = move-exception
            goto Laa
        L4b:
            kotlin.ResultKt.throwOnFailure(r0)
            r6 = r12
            r12 = 0
            r5 = r11
            r11 = 0
            r4 = 0
            r2 = r5
            r3 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> La6
            r2 = r3
            r3 = r7
            r10 = r12
            r12 = r11
            r11 = r10
        L61:
            r13.L$0 = r6     // Catch: java.lang.Throwable -> L48
            r13.L$1 = r5     // Catch: java.lang.Throwable -> L48
            r13.L$2 = r3     // Catch: java.lang.Throwable -> L48
            r7 = 1
            r13.label = r7     // Catch: java.lang.Throwable -> L48
            java.lang.Object r7 = r3.hasNext(r13)     // Catch: java.lang.Throwable -> L48
            if (r7 != r1) goto L71
            return r1
        L71:
            r10 = r1
            r1 = r0
            r0 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r10
        L7a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L95
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L9e
            r8 = r0
            r9 = 0
            if (r8 == 0) goto L8d
            r7.add(r8)     // Catch: java.lang.Throwable -> L9e
        L8d:
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L61
        L95:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9e
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        L9e:
            r0 = move-exception
            r4 = r5
            r5 = r6
            r6 = r7
            r10 = r1
            r1 = r0
            r0 = r10
            goto Laa
        La6:
            r1 = move-exception
            r10 = r12
            r12 = r11
            r11 = r10
        Laa:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Lad
        Lad:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r11, kotlinx.coroutines.channels.SendChannel r12, kotlin.coroutines.Continuation r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08533
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08533) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r13)
        L19:
            r13 = r0
            java.lang.Object r0 = r13.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r13.label
            switch(r2) {
                case 0: goto L60;
                case 1: goto L43;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2d:
            r11 = 0
            r12 = 0
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            r5 = 0
            java.lang.Object r6 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r13.L$0
            kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5d
            goto Lab
        L43:
            r11 = 0
            r12 = 0
            r2 = 0
            java.lang.Object r3 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r5 = 0
            java.lang.Object r4 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            r6 = r4
            java.lang.Object r4 = r13.L$0
            r7 = r4
            kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5d
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto L88
        L5d:
            r1 = move-exception
            goto Lc2
        L60:
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r12
            r12 = 0
            r6 = r11
            r11 = 0
            r5 = 0
            r2 = r6
            r3 = 0
            kotlinx.coroutines.channels.ChannelIterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> Lbe
            r10 = r12
            r12 = r11
            r11 = r10
        L74:
            r13.L$0 = r7     // Catch: java.lang.Throwable -> L5d
            r13.L$1 = r6     // Catch: java.lang.Throwable -> L5d
            r13.L$2 = r4     // Catch: java.lang.Throwable -> L5d
            r2 = 1
            r13.label = r2     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r2 = r4.hasNext(r13)     // Catch: java.lang.Throwable -> L5d
            if (r2 != r1) goto L84
            return r1
        L84:
            r10 = r1
            r1 = r0
            r0 = r2
            r2 = r10
        L88:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> Lb9
            r8 = 0
            if (r0 == 0) goto Lad
            r13.L$0 = r7     // Catch: java.lang.Throwable -> Lb9
            r13.L$1 = r6     // Catch: java.lang.Throwable -> Lb9
            r13.L$2 = r4     // Catch: java.lang.Throwable -> Lb9
            r9 = 2
            r13.label = r9     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r9 = r7.send(r0, r13)     // Catch: java.lang.Throwable -> Lb9
            if (r9 != r2) goto La7
            return r2
        La7:
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r8
        Lab:
            r3 = r2
            goto L74
        Lad:
            r0 = r1
            r1 = r2
            goto L74
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb9
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        Lb9:
            r0 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
            goto Lc2
        Lbe:
            r1 = move-exception
            r10 = r12
            r12 = r11
            r11 = r10
        Lc2:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08541
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            r0.<init>(r8)
        L19:
            r8 = r0
            java.lang.Object r0 = r8.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            switch(r2) {
                case 0: goto L41;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2d:
            r7 = 0
            r1 = 0
            java.lang.Object r2 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r3 = r8.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            r4 = 0
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3d
            r6 = r0
            goto L5f
        L3d:
            r1 = move-exception
            r2 = r3
            r3 = r4
            goto L7a
        L41:
            kotlin.ResultKt.throwOnFailure(r0)
            r3 = r7
            r7 = 0
            r4 = 0
            r2 = r3
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L77
            r2 = r6
            r8.L$0 = r3     // Catch: java.lang.Throwable -> L77
            r8.L$1 = r2     // Catch: java.lang.Throwable -> L77
            r6 = 1
            r8.label = r6     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r2.hasNext(r8)     // Catch: java.lang.Throwable -> L77
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r1 = r5
        L5f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L3d
            boolean r5 = r6.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L3d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r4)
            return r5
        L6f:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            throw r5     // Catch: java.lang.Throwable -> L3d
        L77:
            r1 = move-exception
            r2 = r3
            r3 = r4
        L7a:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08551
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            r0.<init>(r10)
        L19:
            r10 = r0
            java.lang.Object r0 = r10.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r10.label
            r3 = 0
            switch(r2) {
                case 0: goto L42;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2e:
            r9 = 0
            r1 = 0
            java.lang.Object r2 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r10.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3f
            r7 = r0
            r5 = r2
            r2 = r3
            goto L60
        L3f:
            r1 = move-exception
            r2 = r4
            goto L7b
        L42:
            kotlin.ResultKt.throwOnFailure(r0)
            r4 = r9
            r9 = 0
            r2 = 0
            r5 = r4
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L78
            r5 = r7
            r10.L$0 = r4     // Catch: java.lang.Throwable -> L78
            r10.L$1 = r5     // Catch: java.lang.Throwable -> L78
            r7 = 1
            r10.label = r7     // Catch: java.lang.Throwable -> L78
            java.lang.Object r7 = r5.hasNext(r10)     // Catch: java.lang.Throwable -> L78
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r1 = r6
        L60:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L72
            boolean r6 = r7.booleanValue()     // Catch: java.lang.Throwable -> L72
            if (r6 != 0) goto L6d
        L69:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r2)
            return r3
        L6d:
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L72
            goto L69
        L72:
            r1 = move-exception
            r3 = r4
            r8 = r3
            r3 = r2
            r2 = r8
            goto L7b
        L78:
            r1 = move-exception
            r3 = r2
            r2 = r4
        L7b:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2 r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.flatMap(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r18, java.lang.Object r19, kotlin.coroutines.Continuation r20) {
            r0 = r20
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08571
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08571) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r1.<init>(r0)
        L1b:
            r0 = r1
            java.lang.Object r2 = r1.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            switch(r3) {
                case 0: goto L54;
                case 1: goto L30;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L30:
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.Object r7 = r1.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r1.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r1.L$1
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref.IntRef) r9
            java.lang.Object r10 = r1.L$0
            r11 = 0
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Throwable -> L4f
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            goto L92
        L4f:
            r0 = move-exception
            r4 = r8
            r6 = r11
            goto L110
        L54:
            kotlin.ResultKt.throwOnFailure(r2)
            r3 = r18
            r10 = r19
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            r9 = r5
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r3
            r11 = 0
            kotlinx.coroutines.channels.ChannelIterator r12 = r8.iterator()     // Catch: java.lang.Throwable -> L10b
            r8 = r3
            r3 = r5
            r5 = r6
            r6 = r11
            r11 = r7
            r7 = r12
        L74:
            r1.L$0 = r10     // Catch: java.lang.Throwable -> L107
            r1.L$1 = r9     // Catch: java.lang.Throwable -> L107
            r1.L$2 = r8     // Catch: java.lang.Throwable -> L107
            r1.L$3 = r7     // Catch: java.lang.Throwable -> L107
            r1.label = r4     // Catch: java.lang.Throwable -> L107
            java.lang.Object r12 = r7.hasNext(r1)     // Catch: java.lang.Throwable -> L107
            if (r12 != r0) goto L85
            return r0
        L85:
            r16 = r3
            r3 = r2
            r2 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r16
        L92:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lfa
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lfa
            if (r2 == 0) goto Ldf
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Lfa
            r13 = r2
            r14 = 0
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r13)     // Catch: java.lang.Throwable -> Lfa
            if (r15 == 0) goto Lbf
            int r0 = r10.element     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch: java.lang.Throwable -> Lb0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r12)
            return r0
        Lb0:
            r0 = move-exception
            r4 = r9
            r2 = r12
            r7 = r11
            r9 = r10
            r10 = r7
            r16 = r6
            r6 = r2
            r2 = r3
            r3 = r5
            r5 = r16
            goto L110
        Lbf:
            r2 = r9
            r9 = r12
            int r12 = r10.element     // Catch: java.lang.Throwable -> Ld6
            int r12 = r12 + r4
            r10.element = r12     // Catch: java.lang.Throwable -> Ld6
            r16 = r8
            r8 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r16
            r17 = r11
            r11 = r9
            r9 = r10
            r10 = r17
            goto L74
        Ld6:
            r0 = move-exception
            r4 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            r9 = r10
            r10 = r11
            goto L110
        Ldf:
            r4 = r9
            r2 = r12
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lef
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r2)
            r0 = -1
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        Lef:
            r0 = move-exception
            r9 = r10
            r10 = r11
            r16 = r6
            r6 = r2
            r2 = r3
            r3 = r5
            r5 = r16
            goto L110
        Lfa:
            r0 = move-exception
            r4 = r9
            r2 = r12
            r9 = r10
            r10 = r11
            r16 = r6
            r6 = r2
            r2 = r3
            r3 = r5
            r5 = r16
            goto L110
        L107:
            r0 = move-exception
            r4 = r8
            r6 = r11
            goto L110
        L10b:
            r0 = move-exception
            r4 = r3
            r3 = r5
            r5 = r6
            r6 = r7
        L110:
            r6 = r0
            throw r0     // Catch: java.lang.Throwable -> L113
        L113:
            r0 = move-exception
            r7 = r0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r6)
            throw r7
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r10, kotlin.coroutines.Continuation r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08581
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r11)
        L19:
            r11 = r0
            java.lang.Object r0 = r11.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r11.label
            switch(r2) {
                case 0: goto L63;
                case 1: goto L4b;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2d:
            r10 = 0
            r2 = 0
            java.lang.Object r3 = r11.L$2
            java.lang.Object r4 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r11.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            r6 = 0
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L46
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto Laf
        L46:
            r1 = move-exception
            r2 = r5
            r3 = r6
            goto Le2
        L4b:
            r10 = 0
            r2 = 0
            java.lang.Object r3 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r11.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5e
            r6 = r0
            r8 = r5
            r5 = r2
            r2 = r8
            goto L83
        L5e:
            r1 = move-exception
            r3 = r4
            r2 = r5
            goto Le2
        L63:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r10
            r10 = 0
            r3 = 0
            r4 = r2
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> Le1
            r4 = r6
            r11.L$0 = r2     // Catch: java.lang.Throwable -> Le1
            r11.L$1 = r4     // Catch: java.lang.Throwable -> Le1
            r6 = 1
            r11.label = r6     // Catch: java.lang.Throwable -> Le1
            java.lang.Object r6 = r4.hasNext(r11)     // Catch: java.lang.Throwable -> Le1
            if (r6 != r1) goto L80
            return r1
        L80:
            r8 = r4
            r4 = r3
            r3 = r8
        L83:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lde
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lde
            if (r6 == 0) goto Ld6
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> Lde
            r8 = r5
            r5 = r2
            r2 = r8
            r9 = r4
            r4 = r3
            r3 = r6
            r6 = r9
        L96:
            r11.L$0 = r5     // Catch: java.lang.Throwable -> Ld2
            r11.L$1 = r4     // Catch: java.lang.Throwable -> Ld2
            r11.L$2 = r3     // Catch: java.lang.Throwable -> Ld2
            r7 = 2
            r11.label = r7     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r7 = r4.hasNext(r11)     // Catch: java.lang.Throwable -> Ld2
            if (r7 != r1) goto La6
            return r1
        La6:
            r8 = r1
            r1 = r0
            r0 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r8
        Laf:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> Lcb
            r4 = r6
            r6 = r7
            r8 = r3
            r3 = r0
            r0 = r1
            r1 = r2
            r2 = r8
            r9 = r5
            r5 = r4
            r4 = r9
            goto L96
        Lc6:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            return r4
        Lcb:
            r0 = move-exception
            r2 = r6
            r3 = r7
            r8 = r1
            r1 = r0
            r0 = r8
            goto Le2
        Ld2:
            r1 = move-exception
            r2 = r5
            r3 = r6
            goto Le2
        Ld6:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> Lde
            java.lang.String r6 = "ReceiveChannel is empty."
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lde
            throw r1     // Catch: java.lang.Throwable -> Lde
        Lde:
            r1 = move-exception
            r3 = r4
            goto Le2
        Le1:
            r1 = move-exception
        Le2:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> Le5
        Le5:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r18, java.lang.Object r19, kotlin.coroutines.Continuation r20) {
            r0 = r20
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08591
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08591) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r1.<init>(r0)
        L1b:
            r0 = r1
            java.lang.Object r2 = r1.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            switch(r3) {
                case 0: goto L57;
                case 1: goto L30;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L30:
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.Object r7 = r1.L$4
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            r8 = 0
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref.IntRef) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            java.lang.Object r12 = r1.L$0
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Throwable -> L54
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            goto La2
        L54:
            r0 = move-exception
            goto Lee
        L57:
            kotlin.ResultKt.throwOnFailure(r2)
            r3 = r18
            r12 = r19
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            r11 = r5
            r5 = -1
            r11.element = r5
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            r10 = r5
            r5 = 0
            r9 = r3
            r3 = 0
            r8 = 0
            r6 = r9
            r7 = 0
            kotlinx.coroutines.channels.ChannelIterator r13 = r6.iterator()     // Catch: java.lang.Throwable -> Le8
            r6 = r7
            r7 = r13
            r17 = r5
            r5 = r3
            r3 = r17
        L81:
            r1.L$0 = r12     // Catch: java.lang.Throwable -> L54
            r1.L$1 = r11     // Catch: java.lang.Throwable -> L54
            r1.L$2 = r10     // Catch: java.lang.Throwable -> L54
            r1.L$3 = r9     // Catch: java.lang.Throwable -> L54
            r1.L$4 = r7     // Catch: java.lang.Throwable -> L54
            r1.label = r4     // Catch: java.lang.Throwable -> L54
            java.lang.Object r13 = r7.hasNext(r1)     // Catch: java.lang.Throwable -> L54
            if (r13 != r0) goto L94
            return r0
        L94:
            r17 = r3
            r3 = r2
            r2 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r17
        La2:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lde
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lde
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Lde
            r14 = r2
            r15 = 0
            boolean r16 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r14)     // Catch: java.lang.Throwable -> Lde
            if (r16 == 0) goto Lba
            int r4 = r11.element     // Catch: java.lang.Throwable -> Lde
            r12.element = r4     // Catch: java.lang.Throwable -> Lde
        Lba:
            int r4 = r11.element     // Catch: java.lang.Throwable -> Lde
            r16 = 1
            int r4 = r4 + 1
            r11.element = r4     // Catch: java.lang.Throwable -> Lde
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r4 = r16
            goto L81
        Lcf:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lde
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r10, r9)
            int r0 = r12.element
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        Lde:
            r0 = move-exception
            r2 = r3
            r3 = r5
            r5 = r6
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            goto Lee
        Le8:
            r0 = move-exception
            r17 = r5
            r5 = r3
            r3 = r17
        Lee:
            r4 = r0
            throw r0     // Catch: java.lang.Throwable -> Lf1
        Lf1:
            r0 = move-exception
            r6 = r0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r4)
            throw r6
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r10, kotlin.coroutines.Continuation r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08601
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r11)
        L19:
            r11 = r0
            java.lang.Object r0 = r11.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r11.label
            r3 = 0
            switch(r2) {
                case 0: goto L5f;
                case 1: goto L49;
                case 2: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2e:
            r10 = 0
            r2 = 0
            java.lang.Object r4 = r11.L$2
            java.lang.Object r5 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L46
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto Lae
        L46:
            r10 = move-exception
            r1 = r6
            goto L5d
        L49:
            r2 = 0
            r10 = 0
            java.lang.Object r4 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r11.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5b
            r7 = r0
            r6 = r5
            r5 = r4
            r4 = r3
            goto L7f
        L5b:
            r10 = move-exception
            r1 = r5
        L5d:
            goto Le5
        L5f:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = 0
            r4 = 0
            r5 = r10
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> Le0
            r5 = r7
            r11.L$0 = r10     // Catch: java.lang.Throwable -> Le0
            r11.L$1 = r5     // Catch: java.lang.Throwable -> Le0
            r7 = 1
            r11.label = r7     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r7 = r5.hasNext(r11)     // Catch: java.lang.Throwable -> Le0
            if (r7 != r1) goto L7c
            return r1
        L7c:
            r8 = r6
            r6 = r10
            r10 = r8
        L7f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Ldb
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Ldb
            if (r7 != 0) goto L8c
        L88:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r3
        L8c:
            r3 = r6
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Ld7
            r8 = r6
            r6 = r3
            r3 = r4
            r4 = r8
        L95:
            r11.L$0 = r6     // Catch: java.lang.Throwable -> Ld4
            r11.L$1 = r5     // Catch: java.lang.Throwable -> Ld4
            r11.L$2 = r4     // Catch: java.lang.Throwable -> Ld4
            r7 = 2
            r11.label = r7     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r7 = r5.hasNext(r11)     // Catch: java.lang.Throwable -> Ld4
            if (r7 != r1) goto La5
            return r1
        La5:
            r8 = r1
            r1 = r0
            r0 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r8
        Lae:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lca
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> Lca
            r5 = r7
            r8 = r4
            r4 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r8
            r9 = r6
            r6 = r5
            r5 = r9
            goto L95
        Lc5:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            return r5
        Lca:
            r10 = move-exception
            r0 = r7
            r2 = r4
            r8 = r1
            r1 = r0
            r0 = r8
            r9 = r3
            r3 = r2
            r2 = r9
            goto Le5
        Ld4:
            r10 = move-exception
            r1 = r6
            goto Le5
        Ld7:
            r10 = move-exception
            r1 = r3
            r3 = r4
            goto Le5
        Ldb:
            r10 = move-exception
            r1 = r6
            r3 = r4
            goto L5d
        Le0:
            r1 = move-exception
            r3 = r4
            r8 = r1
            r1 = r10
            r10 = r8
        Le5:
            r3 = r10
            throw r10     // Catch: java.lang.Throwable -> Le8
        Le8:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r3)
            throw r10
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> map(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel map$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.map(r0, r1, r2)
            return r0
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapIndexed(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function3 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapIndexed(r1, r2, r3)
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNull(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapIndexedNotNull(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.map(r1, r2, r3)
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNull(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapNotNull(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r11, java.util.Comparator r12, kotlin.coroutines.Continuation r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08631
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            r0.<init>(r13)
        L19:
            r13 = r0
            java.lang.Object r0 = r13.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r13.label
            r3 = 0
            switch(r2) {
                case 0: goto L6b;
                case 1: goto L4f;
                case 2: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2e:
            r11 = 0
            r12 = 0
            java.lang.Object r2 = r13.L$3
            java.lang.Object r4 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r13.L$0
            java.util.Comparator r6 = (java.util.Comparator) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L4a
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto Lbe
        L4a:
            r11 = move-exception
            r1 = r5
            r2 = r3
            goto L100
        L4f:
            r12 = 0
            r11 = 0
            java.lang.Object r2 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            java.lang.Object r5 = r13.L$0
            r6 = r5
            java.util.Comparator r6 = (java.util.Comparator) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L66
            r7 = r0
            r5 = r4
            r4 = r2
            r2 = r3
            goto L8e
        L66:
            r11 = move-exception
            r1 = r4
            r2 = r3
            goto L100
        L6b:
            kotlin.ResultKt.throwOnFailure(r0)
            r6 = r12
            r12 = 0
            r2 = 0
            r4 = r11
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> Lfc
            r4 = r7
            r13.L$0 = r6     // Catch: java.lang.Throwable -> Lfc
            r13.L$1 = r11     // Catch: java.lang.Throwable -> Lfc
            r13.L$2 = r4     // Catch: java.lang.Throwable -> Lfc
            r7 = 1
            r13.label = r7     // Catch: java.lang.Throwable -> Lfc
            java.lang.Object r7 = r4.hasNext(r13)     // Catch: java.lang.Throwable -> Lfc
            if (r7 != r1) goto L8b
            return r1
        L8b:
            r9 = r5
            r5 = r11
            r11 = r9
        L8e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lf9
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lf9
            if (r7 != 0) goto L9a
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            return r3
        L9a:
            r3 = r5
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lf6
            r9 = r3
            r3 = r2
            r2 = r5
            r5 = r9
        La3:
            r13.L$0 = r6     // Catch: java.lang.Throwable -> Lf2
            r13.L$1 = r5     // Catch: java.lang.Throwable -> Lf2
            r13.L$2 = r4     // Catch: java.lang.Throwable -> Lf2
            r13.L$3 = r2     // Catch: java.lang.Throwable -> Lf2
            r7 = 2
            r13.label = r7     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r7 = r4.hasNext(r13)     // Catch: java.lang.Throwable -> Lf2
            if (r7 != r1) goto Lb5
            return r1
        Lb5:
            r9 = r1
            r1 = r0
            r0 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r9
        Lbe:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lea
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lea
            if (r0 == 0) goto Le5
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> Lea
            int r8 = r7.compare(r3, r0)     // Catch: java.lang.Throwable -> Lea
            if (r8 >= 0) goto Ldb
            r3 = r6
            r6 = r7
            r9 = r2
            r2 = r0
            r0 = r1
            r1 = r9
            r10 = r5
            r5 = r3
            r3 = r4
            r4 = r10
            goto La3
        Ldb:
            r0 = r6
            r6 = r7
            r9 = r5
            r5 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r9
            goto La3
        Le5:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r3
        Lea:
            r11 = move-exception
            r0 = r6
            r2 = r4
            r6 = r7
            r9 = r1
            r1 = r0
            r0 = r9
            goto L100
        Lf2:
            r11 = move-exception
            r2 = r3
            r1 = r5
            goto L100
        Lf6:
            r11 = move-exception
            r1 = r3
            goto L100
        Lf9:
            r11 = move-exception
            r1 = r5
            goto L100
        Lfc:
            r1 = move-exception
            r9 = r1
            r1 = r11
            r11 = r9
        L100:
            r2 = r11
            throw r11     // Catch: java.lang.Throwable -> L103
        L103:
            r11 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r2)
            throw r11
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r11, java.util.Comparator r12, kotlin.coroutines.Continuation r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08641
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r0.<init>(r13)
        L19:
            r13 = r0
            java.lang.Object r0 = r13.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r13.label
            r3 = 0
            switch(r2) {
                case 0: goto L6b;
                case 1: goto L4f;
                case 2: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2e:
            r11 = 0
            r12 = 0
            java.lang.Object r2 = r13.L$3
            java.lang.Object r4 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r13.L$0
            java.util.Comparator r6 = (java.util.Comparator) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L4a
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto Lbe
        L4a:
            r11 = move-exception
            r1 = r5
            r2 = r3
            goto L100
        L4f:
            r12 = 0
            r11 = 0
            java.lang.Object r2 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            java.lang.Object r5 = r13.L$0
            r6 = r5
            java.util.Comparator r6 = (java.util.Comparator) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L66
            r7 = r0
            r5 = r4
            r4 = r2
            r2 = r3
            goto L8e
        L66:
            r11 = move-exception
            r1 = r4
            r2 = r3
            goto L100
        L6b:
            kotlin.ResultKt.throwOnFailure(r0)
            r6 = r12
            r12 = 0
            r2 = 0
            r4 = r11
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> Lfc
            r4 = r7
            r13.L$0 = r6     // Catch: java.lang.Throwable -> Lfc
            r13.L$1 = r11     // Catch: java.lang.Throwable -> Lfc
            r13.L$2 = r4     // Catch: java.lang.Throwable -> Lfc
            r7 = 1
            r13.label = r7     // Catch: java.lang.Throwable -> Lfc
            java.lang.Object r7 = r4.hasNext(r13)     // Catch: java.lang.Throwable -> Lfc
            if (r7 != r1) goto L8b
            return r1
        L8b:
            r9 = r5
            r5 = r11
            r11 = r9
        L8e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lf9
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lf9
            if (r7 != 0) goto L9a
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            return r3
        L9a:
            r3 = r5
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lf6
            r9 = r3
            r3 = r2
            r2 = r5
            r5 = r9
        La3:
            r13.L$0 = r6     // Catch: java.lang.Throwable -> Lf2
            r13.L$1 = r5     // Catch: java.lang.Throwable -> Lf2
            r13.L$2 = r4     // Catch: java.lang.Throwable -> Lf2
            r13.L$3 = r2     // Catch: java.lang.Throwable -> Lf2
            r7 = 2
            r13.label = r7     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r7 = r4.hasNext(r13)     // Catch: java.lang.Throwable -> Lf2
            if (r7 != r1) goto Lb5
            return r1
        Lb5:
            r9 = r1
            r1 = r0
            r0 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r9
        Lbe:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lea
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lea
            if (r0 == 0) goto Le5
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> Lea
            int r8 = r7.compare(r3, r0)     // Catch: java.lang.Throwable -> Lea
            if (r8 <= 0) goto Ldb
            r3 = r6
            r6 = r7
            r9 = r2
            r2 = r0
            r0 = r1
            r1 = r9
            r10 = r5
            r5 = r3
            r3 = r4
            r4 = r10
            goto La3
        Ldb:
            r0 = r6
            r6 = r7
            r9 = r5
            r5 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r9
            goto La3
        Le5:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r3
        Lea:
            r11 = move-exception
            r0 = r6
            r2 = r4
            r6 = r7
            r9 = r1
            r1 = r0
            r0 = r9
            goto L100
        Lf2:
            r11 = move-exception
            r2 = r3
            r1 = r5
            goto L100
        Lf6:
            r11 = move-exception
            r1 = r3
            goto L100
        Lf9:
            r11 = move-exception
            r1 = r5
            goto L100
        Lfc:
            r1 = move-exception
            r9 = r1
            r1 = r11
            r11 = r9
        L100:
            r2 = r11
            throw r11     // Catch: java.lang.Throwable -> L103
        L103:
            r11 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r2)
            throw r11
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.Continuation r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08651
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            r0.<init>(r9)
        L19:
            r9 = r0
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            r3 = 1
            switch(r2) {
                case 0: goto L3d;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2e:
            r8 = 0
            r1 = 0
            java.lang.Object r2 = r9.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            r4 = 0
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3a
            r7 = r0
            goto L57
        L3a:
            r1 = move-exception
            r3 = r4
            goto L6b
        L3d:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r8
            r8 = 0
            r4 = 0
            r5 = r2
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L69
            r9.L$0 = r2     // Catch: java.lang.Throwable -> L69
            r9.label = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r7.hasNext(r9)     // Catch: java.lang.Throwable -> L69
            if (r7 != r1) goto L56
            return r1
        L56:
            r1 = r6
        L57:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r7.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r5 != 0) goto L60
            goto L61
        L60:
            r3 = 0
        L61:
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)     // Catch: java.lang.Throwable -> L3a
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r4)
            return r3
        L69:
            r1 = move-exception
            r3 = r4
        L6b:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> L6e
        L6e:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel requireNoNulls(kotlinx.coroutines.channels.ReceiveChannel r3) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 1
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.map$default(r3, r1, r0, r2, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel r10, kotlin.coroutines.Continuation r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08671
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08671) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            r0.<init>(r11)
        L19:
            r11 = r0
            java.lang.Object r0 = r11.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r11.label
            switch(r2) {
                case 0: goto L55;
                case 1: goto L41;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2d:
            r10 = 0
            r1 = 0
            java.lang.Object r2 = r11.L$1
            java.lang.Object r3 = r11.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            r4 = 0
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3c
            r7 = r0
            goto L95
        L3c:
            r1 = move-exception
            r2 = r3
            r3 = r4
            goto Lb3
        L41:
            r10 = 0
            r2 = 0
            java.lang.Object r3 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r11.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L51
            r6 = r0
            goto L78
        L51:
            r1 = move-exception
            r3 = r4
            r2 = r5
            goto Lb3
        L55:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r10
            r10 = 0
            r3 = 0
            r4 = r2
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> Lb2
            r4 = r6
            r11.L$0 = r2     // Catch: java.lang.Throwable -> Lb2
            r11.L$1 = r4     // Catch: java.lang.Throwable -> Lb2
            r6 = 1
            r11.label = r6     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r6 = r4.hasNext(r11)     // Catch: java.lang.Throwable -> Lb2
            if (r6 != r1) goto L72
            return r1
        L72:
            r8 = r5
            r5 = r2
            r2 = r8
            r9 = r4
            r4 = r3
            r3 = r9
        L78:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L51
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L51
            r11.L$0 = r5     // Catch: java.lang.Throwable -> L51
            r11.L$1 = r6     // Catch: java.lang.Throwable -> L51
            r7 = 2
            r11.label = r7     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r3.hasNext(r11)     // Catch: java.lang.Throwable -> L51
            if (r7 != r1) goto L92
            return r1
        L92:
            r1 = r2
            r3 = r5
            r2 = r6
        L95:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r7.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r5 != 0) goto La2
        L9e:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r4)
            return r2
        La2:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "ReceiveChannel has more than one element."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3c
            throw r5     // Catch: java.lang.Throwable -> L3c
        Laa:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "ReceiveChannel is empty."
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L51
            throw r1     // Catch: java.lang.Throwable -> L51
        Lb2:
            r1 = move-exception
        Lb3:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel r10, kotlin.coroutines.Continuation r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08681
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            r0.<init>(r11)
        L19:
            r11 = r0
            java.lang.Object r0 = r11.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r11.label
            r3 = 0
            switch(r2) {
                case 0: goto L5d;
                case 1: goto L41;
                case 2: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2e:
            r10 = 0
            r1 = 0
            java.lang.Object r2 = r11.L$1
            java.lang.Object r4 = r11.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3d
            r8 = r0
            r5 = r3
            goto La1
        L3d:
            r10 = move-exception
            r2 = r4
            goto Lc8
        L41:
            r10 = 0
            r2 = 0
            java.lang.Object r4 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r11.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L56
            r7 = r0
            r6 = r5
            r5 = r4
            r4 = r3
            r9 = r2
            r2 = r10
            r10 = r9
            goto L7e
        L56:
            r1 = move-exception
            r2 = r5
            r9 = r1
            r1 = r10
            r10 = r9
            goto Lc8
        L5d:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r10
            r10 = 0
            r4 = 0
            r5 = r2
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> Lc3
            r5 = r7
            r11.L$0 = r2     // Catch: java.lang.Throwable -> Lc3
            r11.L$1 = r5     // Catch: java.lang.Throwable -> Lc3
            r7 = 1
            r11.label = r7     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r7 = r5.hasNext(r11)     // Catch: java.lang.Throwable -> Lc3
            if (r7 != r1) goto L7a
            return r1
        L7a:
            r9 = r2
            r2 = r10
            r10 = r6
            r6 = r9
        L7e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lbc
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lbc
            if (r7 != 0) goto L8b
        L87:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r3
        L8b:
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> Lb7
            r11.L$0 = r6     // Catch: java.lang.Throwable -> Lb7
            r11.L$1 = r7     // Catch: java.lang.Throwable -> Lb7
            r8 = 2
            r11.label = r8     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r8 = r5.hasNext(r11)     // Catch: java.lang.Throwable -> Lb7
            if (r8 != r1) goto L9d
            return r1
        L9d:
            r1 = r2
            r5 = r4
            r4 = r6
            r2 = r7
        La1:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> Lb3
            boolean r6 = r8.booleanValue()     // Catch: java.lang.Throwable -> Lb3
            if (r6 == 0) goto Lae
        Laa:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            return r3
        Lae:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            return r2
        Lb3:
            r10 = move-exception
            r2 = r4
            r3 = r5
            goto Lc8
        Lb7:
            r10 = move-exception
            r1 = r2
            r3 = r4
            r2 = r6
            goto Lc8
        Lbc:
            r10 = move-exception
            r1 = r6
            r3 = r4
            r9 = r2
            r2 = r1
            r1 = r9
            goto Lc8
        Lc3:
            r1 = move-exception
            r3 = r4
            r9 = r1
            r1 = r10
            r10 = r9
        Lc8:
            r3 = r10
            throw r10     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            throw r10
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, kotlin.coroutines.CoroutineContext r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1
            r2 = 0
            r0.<init>(r10, r9, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r11
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.take(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2 r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.takeWhile(r0, r1, r2)
            return r0
    }

    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, C r12, kotlin.coroutines.Continuation<? super C> r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08711
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r13)
        L19:
            r13 = r0
            java.lang.Object r0 = r13.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r13.label
            switch(r2) {
                case 0: goto L60;
                case 1: goto L43;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2d:
            r11 = 0
            r12 = 0
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            r5 = 0
            java.lang.Object r6 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r13.L$0
            kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5d
            goto La9
        L43:
            r11 = 0
            r12 = 0
            r2 = 0
            java.lang.Object r3 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r5 = 0
            java.lang.Object r4 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            r6 = r4
            java.lang.Object r4 = r13.L$0
            r7 = r4
            kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5d
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto L88
        L5d:
            r1 = move-exception
            goto Lbd
        L60:
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r12
            r12 = 0
            r6 = r11
            r11 = 0
            r5 = 0
            r2 = r6
            r3 = 0
            kotlinx.coroutines.channels.ChannelIterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> Lb9
            r10 = r12
            r12 = r11
            r11 = r10
        L74:
            r13.L$0 = r7     // Catch: java.lang.Throwable -> L5d
            r13.L$1 = r6     // Catch: java.lang.Throwable -> L5d
            r13.L$2 = r4     // Catch: java.lang.Throwable -> L5d
            r2 = 1
            r13.label = r2     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r2 = r4.hasNext(r13)     // Catch: java.lang.Throwable -> L5d
            if (r2 != r1) goto L84
            return r1
        L84:
            r10 = r1
            r1 = r0
            r0 = r2
            r2 = r10
        L88:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> Lb4
            r8 = 0
            r13.L$0 = r7     // Catch: java.lang.Throwable -> Lb4
            r13.L$1 = r6     // Catch: java.lang.Throwable -> Lb4
            r13.L$2 = r4     // Catch: java.lang.Throwable -> Lb4
            r9 = 2
            r13.label = r9     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r9 = r7.send(r0, r13)     // Catch: java.lang.Throwable -> Lb4
            if (r9 != r2) goto La5
            return r2
        La5:
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r8
        La9:
            r3 = r2
            goto L74
        Lab:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb4
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        Lb4:
            r0 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
            goto Lbd
        Lb9:
            r1 = move-exception
            r10 = r12
            r12 = r11
            r11 = r10
        Lbd:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r2)
            throw r1
    }

    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, C r12, kotlin.coroutines.Continuation<? super C> r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08721
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08721) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r13)
        L19:
            r13 = r0
            java.lang.Object r0 = r13.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r13.label
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2d:
            r11 = 0
            r12 = 0
            r2 = 0
            java.lang.Object r3 = r13.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r13.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r13.L$0
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L48
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto L7a
        L48:
            r1 = move-exception
            goto La8
        L4b:
            kotlin.ResultKt.throwOnFailure(r0)
            r6 = r12
            r12 = 0
            r5 = r11
            r11 = 0
            r4 = 0
            r2 = r5
            r3 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> La4
            r2 = r3
            r3 = r7
            r10 = r12
            r12 = r11
            r11 = r10
        L61:
            r13.L$0 = r6     // Catch: java.lang.Throwable -> L48
            r13.L$1 = r5     // Catch: java.lang.Throwable -> L48
            r13.L$2 = r3     // Catch: java.lang.Throwable -> L48
            r7 = 1
            r13.label = r7     // Catch: java.lang.Throwable -> L48
            java.lang.Object r7 = r3.hasNext(r13)     // Catch: java.lang.Throwable -> L48
            if (r7 != r1) goto L71
            return r1
        L71:
            r10 = r1
            r1 = r0
            r0 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r10
        L7a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L93
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L9c
            r8 = r0
            r9 = 0
            r7.add(r8)     // Catch: java.lang.Throwable -> L9c
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L61
        L93:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9c
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        L9c:
            r0 = move-exception
            r4 = r5
            r5 = r6
            r6 = r7
            r10 = r1
            r1 = r0
            r0 = r10
            goto La8
        La4:
            r1 = move-exception
            r10 = r12
            r12 = r11
            r11 = r10
        La8:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Lab
        Lab:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            throw r1
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r13, M r14, kotlin.coroutines.Continuation<? super M> r15) {
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08732
            if (r0 == 0) goto L14
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08732) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r15)
        L19:
            r15 = r0
            java.lang.Object r0 = r15.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r15.label
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2d:
            r13 = 0
            r14 = 0
            r2 = 0
            java.lang.Object r3 = r15.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r15.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r15.L$0
            java.util.Map r6 = (java.util.Map) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L48
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto L7a
        L48:
            r1 = move-exception
            goto Lb2
        L4b:
            kotlin.ResultKt.throwOnFailure(r0)
            r6 = r14
            r14 = 0
            r5 = r13
            r13 = 0
            r4 = 0
            r2 = r5
            r3 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> Lae
            r2 = r3
            r3 = r7
            r12 = r14
            r14 = r13
            r13 = r12
        L61:
            r15.L$0 = r6     // Catch: java.lang.Throwable -> L48
            r15.L$1 = r5     // Catch: java.lang.Throwable -> L48
            r15.L$2 = r3     // Catch: java.lang.Throwable -> L48
            r7 = 1
            r15.label = r7     // Catch: java.lang.Throwable -> L48
            java.lang.Object r7 = r3.hasNext(r15)     // Catch: java.lang.Throwable -> L48
            if (r7 != r1) goto L71
            return r1
        L71:
            r12 = r1
            r1 = r0
            r0 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r12
        L7a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> La6
            r8 = r0
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch: java.lang.Throwable -> La6
            r9 = 0
            java.lang.Object r10 = r8.getFirst()     // Catch: java.lang.Throwable -> La6
            java.lang.Object r11 = r8.getSecond()     // Catch: java.lang.Throwable -> La6
            r7.put(r10, r11)     // Catch: java.lang.Throwable -> La6
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L61
        L9d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La6
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        La6:
            r0 = move-exception
            r4 = r5
            r5 = r6
            r6 = r7
            r12 = r1
            r1 = r0
            r0 = r12
            goto Lb2
        Lae:
            r1 = move-exception
            r12 = r14
            r14 = r13
            r13 = r12
        Lb2:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toMap(r1, r0, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMutableList(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toCollection(r1, r0, r2)
            return r0
    }

    public static final <E> java.lang.Object toMutableSet(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.Continuation<? super java.util.Set<E>> r2) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toCollection(r1, r0, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toSet(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toMutableSet(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1
            r2 = 0
            r0.<init>(r9, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.withIndex(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip(kotlinx.coroutines.channels.ReceiveChannel r7, kotlinx.coroutines.channels.ReceiveChannel r8) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$1 r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C08751.INSTANCE
            r4 = r0
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.zip$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final <E, R, V> kotlinx.coroutines.channels.ReceiveChannel<V> zip(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlinx.coroutines.channels.ReceiveChannel<? extends R> r10, kotlin.coroutines.CoroutineContext r11, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> r12) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            r0 = 2
            kotlinx.coroutines.channels.ReceiveChannel[] r0 = new kotlinx.coroutines.channels.ReceiveChannel[r0]
            r2 = 0
            r0[r2] = r9
            r2 = 1
            r0[r2] = r10
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumesAll(r0)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2
            r2 = 0
            r0.<init>(r10, r9, r12, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r11
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.zip(r0, r1, r2, r3)
            return r0
    }
}
