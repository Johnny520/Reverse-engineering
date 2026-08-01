package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.Metadata(m114d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020X2\u00020\u00172\u00020\u007f2\u00030Ã\u0001:\u0006Ò\u0001Ó\u0001Ô\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\"J!\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b=\u0010>J(\u0010C\u001a\u00020@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001082\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u00060#j\u0002`$¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\bJ\u0010IJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u0002072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\rH\u0014¢\u0006\u0004\bU\u0010\"J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0010¢\u0006\u0004\bV\u0010+J\u0019\u0010Z\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010XH\u0004¢\u0006\u0004\bZ\u0010[JF\u0010d\u001a\u00020c2\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010]\u001a\u00020\u00012'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010eJ6\u0010d\u001a\u00020c2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010fJ\u0013\u0010g\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\bg\u0010\u001dJ\u000f\u0010h\u001a\u00020\u0001H\u0002¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\bj\u0010\u001dJ&\u0010m\u001a\u00020l2\u0014\u0010k\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110^H\u0082\b¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bo\u0010-J\u0019\u0010q\u001a\u00020\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bp\u0010(J\u001b\u0010s\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\br\u0010-J@\u0010t\u001a\u00020\t2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a2\u0006\u0010\\\u001a\u00020\u0001H\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010w\u001a\u00020/H\u0010¢\u0006\u0004\bv\u00101J\u001f\u0010x\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\bx\u0010yJ.\u0010{\u001a\u00020\u0011\"\n\b\u0000\u0010z\u0018\u0001*\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0082\b¢\u0006\u0004\b{\u0010yJ\u0019\u0010\\\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\\\u0010+J\u0019\u0010|\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b|\u0010\u0016J\u000f\u0010}\u001a\u00020\u0011H\u0014¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0081\u0001\u001a\u00020\u00112\u0007\u0010\u0080\u0001\u001a\u00020\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0014\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JI\u0010\u008c\u0001\u001a\u00020\u0011\"\u0005\b\u0000\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u00012\u001d\u0010k\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050^ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001JX\u0010\u0091\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0087\u0001JX\u0010\u0095\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0090\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\u0001¢\u0006\u0005\b\u0096\u0001\u0010iJ\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009a\u0001\u001a\u00020/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0011\u0010\u009c\u0001\u001a\u00020/H\u0007¢\u0006\u0005\b\u009c\u0001\u00101J\u0011\u0010\u009d\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u009d\u0001\u00101J$\u0010\u009e\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\"\u0010 \u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J(\u0010¢\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J&\u0010¤\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J-\u0010¦\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002072\u0006\u0010\u0018\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0082\u0010¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0019\u0010©\u0001\u001a\u0004\u0018\u000108*\u00030¨\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001f\u0010«\u0001\u001a\u00020\u0011*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0005\b«\u0001\u0010yJ&\u0010¬\u0001\u001a\u00060#j\u0002`$*\u00020\r2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020X0®\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010³\u0001\u001a\u0004\u0018\u00010\r8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010OR\u0016\u0010µ\u0001\u001a\u00020\u00018DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010iR\u0016\u0010·\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010iR\u0016\u0010¸\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010iR\u0013\u0010¹\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010iR\u0013\u0010º\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010iR\u0013\u0010»\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010iR\u0016\u0010¼\u0001\u001a\u00020\u00018TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010iR\u0019\u0010À\u0001\u001a\u0007\u0012\u0002\b\u00030½\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010Â\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010iR\u0015\u0010Æ\u0001\u001a\u00030Ã\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R.\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00198@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010LR\u001e\u0010Ï\u0001\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010>R\u001b\u0010Ð\u0001\u001a\u00020\u0001*\u0002038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Õ\u0001"}, m115d2 = {"Lkotlinx/coroutines/JobSupport;", "", "active", "<init>", "(Z)V", "", "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "", "rootCause", "", "exceptions", "", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "state", "afterCompletion", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "(Ljava/lang/Throwable;)V", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancelParent", "", "cancellationExceptionMessage", "()Ljava/lang/String;", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "message", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "exception", "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "Lkotlinx/coroutines/Job;", "parent", "initParentJob", "(Lkotlinx/coroutines/Job;)V", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "nameString$kotlinx_coroutines_core", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", "T", "notifyHandlers", "onCompletionInternal", "onStart", "()V", "Lkotlinx/coroutines/ParentJob;", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "start", "", "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public class JobSupport implements kotlinx.coroutines.Job, kotlinx.coroutines.ChildJob, kotlinx.coroutines.ParentJob, kotlinx.coroutines.selects.SelectClause0 {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile /* synthetic */ java.lang.Object _parentHandle;
    private volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m115d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class AwaitContinuation<T> extends kotlinx.coroutines.CancellableContinuationImpl<T> {
        private final kotlinx.coroutines.JobSupport job;

        public AwaitContinuation(kotlin.coroutines.Continuation<? super T> r2, kotlinx.coroutines.JobSupport r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                r1.job = r3
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job r4) {
                r3 = this;
                kotlinx.coroutines.JobSupport r0 = r3.job
                java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
                boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
                if (r1 == 0) goto L16
                r1 = r0
                kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
                java.lang.Throwable r1 = r1.getRootCause()
                if (r1 != 0) goto L14
                goto L16
            L14:
                r2 = 0
                return r1
            L16:
                boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
                if (r1 == 0) goto L20
                r1 = r0
                kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
                java.lang.Throwable r1 = r1.cause
                return r1
            L20:
                java.util.concurrent.CancellationException r1 = r4.getCancellationException()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                return r1
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected java.lang.String nameString() {
                r1 = this;
                java.lang.String r0 = "AwaitContinuation"
                return r0
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(m114d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m115d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class ChildCompletion extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.ChildHandleNode child;
        private final kotlinx.coroutines.JobSupport parent;
        private final java.lang.Object proposedUpdate;
        private final kotlinx.coroutines.JobSupport.Finishing state;

        public ChildCompletion(kotlinx.coroutines.JobSupport r1, kotlinx.coroutines.JobSupport.Finishing r2, kotlinx.coroutines.ChildHandleNode r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.state = r2
                r0.child = r3
                r0.proposedUpdate = r4
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r2) {
                r1 = this;
                r0 = r2
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r1.invoke2(r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable r5) {
                r4 = this;
                kotlinx.coroutines.JobSupport r0 = r4.parent
                kotlinx.coroutines.JobSupport$Finishing r1 = r4.state
                kotlinx.coroutines.ChildHandleNode r2 = r4.child
                java.lang.Object r3 = r4.proposedUpdate
                kotlinx.coroutines.JobSupport.access$continueCompleting(r0, r1, r2, r3)
                return
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(m114d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0018j\u0002`,2\u00020-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010 \"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\f¨\u0006+"}, m115d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/NodeList;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "exception", "", "addExceptionLocked", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allocateList", "()Ljava/util/ArrayList;", "proposedException", "", "sealLocked", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "value", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "exceptionsHolder", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class Finishing implements kotlinx.coroutines.Incomplete {
        private volatile /* synthetic */ java.lang.Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ java.lang.Object _rootCause;
        private final kotlinx.coroutines.NodeList list;

        public Finishing(kotlinx.coroutines.NodeList r2, boolean r3, java.lang.Throwable r4) {
                r1 = this;
                r1.<init>()
                r1.list = r2
                r1._isCompleting = r3
                r1._rootCause = r4
                r0 = 0
                r1._exceptionsHolder = r0
                return
        }

        private final java.util.ArrayList<java.lang.Throwable> allocateList() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 4
                r0.<init>(r1)
                return r0
        }

        private final java.lang.Object getExceptionsHolder() {
                r1 = this;
                java.lang.Object r0 = r1._exceptionsHolder
                return r0
        }

        private final void setExceptionsHolder(java.lang.Object r1) {
                r0 = this;
                r0._exceptionsHolder = r1
                return
        }

        public final void addExceptionLocked(java.lang.Throwable r6) {
                r5 = this;
                java.lang.Throwable r0 = r5.getRootCause()
                if (r0 != 0) goto La
                r5.setRootCause(r6)
                return
            La:
                if (r6 != r0) goto Ld
                return
            Ld:
                java.lang.Object r1 = r5.getExceptionsHolder()
                if (r1 != 0) goto L17
                r5.setExceptionsHolder(r6)
                goto L39
            L17:
                boolean r2 = r1 instanceof java.lang.Throwable
                if (r2 == 0) goto L2f
                if (r6 != r1) goto L1e
                return
            L1e:
                java.util.ArrayList r2 = r5.allocateList()
                r3 = r2
                r4 = 0
                r3.add(r1)
                r3.add(r6)
                r5.setExceptionsHolder(r2)
                goto L39
            L2f:
                boolean r2 = r1 instanceof java.util.ArrayList
                if (r2 == 0) goto L3a
                r2 = r1
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.add(r6)
            L39:
                return
            L3a:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "State is "
                java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r1)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // kotlinx.coroutines.Incomplete
        public kotlinx.coroutines.NodeList getList() {
                r1 = this;
                kotlinx.coroutines.NodeList r0 = r1.list
                return r0
        }

        public final java.lang.Throwable getRootCause() {
                r1 = this;
                java.lang.Object r0 = r1._rootCause
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                return r0
        }

        @Override // kotlinx.coroutines.Incomplete
        public boolean isActive() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCancelling() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCompleting() {
                r1 = this;
                int r0 = r1._isCompleting
                return r0
        }

        public final boolean isSealed() {
                r2 = this;
                java.lang.Object r0 = r2.getExceptionsHolder()
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final java.util.List<java.lang.Throwable> sealLocked(java.lang.Throwable r6) {
                r5 = this;
                java.lang.Object r0 = r5.getExceptionsHolder()
                if (r0 != 0) goto Lb
                java.util.ArrayList r1 = r5.allocateList()
                goto L20
            Lb:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L19
                java.util.ArrayList r1 = r5.allocateList()
                r2 = r1
                r3 = 0
                r2.add(r0)
                goto L20
            L19:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L44
                r1 = r0
                java.util.ArrayList r1 = (java.util.ArrayList) r1
            L20:
                r0 = r1
                java.lang.Throwable r1 = r5.getRootCause()
                if (r1 != 0) goto L28
                goto L2e
            L28:
                r2 = r1
                r3 = 0
                r4 = 0
                r0.add(r4, r2)
            L2e:
                if (r6 == 0) goto L39
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
                if (r2 != 0) goto L39
                r0.add(r6)
            L39:
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                r5.setExceptionsHolder(r2)
                r2 = r0
                java.util.List r2 = (java.util.List) r2
                return r2
            L44:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "State is "
                java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        public final void setCompleting(boolean r1) {
                r0 = this;
                r0._isCompleting = r1
                return
        }

        public final void setRootCause(java.lang.Throwable r1) {
                r0 = this;
                r0._rootCause = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Finishing[cancelling="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.isCancelling()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", completing="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.isCompleting()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", rootCause="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Throwable r1 = r2.getRootCause()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", exceptions="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.getExceptionsHolder()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", list="
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.NodeList r1 = r2.getList()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.JobSupport> r2 = kotlinx.coroutines.JobSupport.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.JobSupport._state$FU = r0
            return
    }

    public JobSupport(boolean r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto La
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            goto Le
        La:
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_NEW$p()
        Le:
            r1._state = r0
            r0 = 0
            r1._parentHandle = r0
            return
    }

    public static final /* synthetic */ java.lang.Object access$awaitSuspend(kotlinx.coroutines.JobSupport r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r1.awaitSuspend(r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String access$cancellationExceptionMessage(kotlinx.coroutines.JobSupport r1) {
            java.lang.String r0 = r1.cancellationExceptionMessage()
            return r0
    }

    public static final /* synthetic */ void access$continueCompleting(kotlinx.coroutines.JobSupport r0, kotlinx.coroutines.JobSupport.Finishing r1, kotlinx.coroutines.ChildHandleNode r2, java.lang.Object r3) {
            r0.continueCompleting(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.Object access$joinSuspend(kotlinx.coroutines.JobSupport r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r1.joinSuspend(r2)
            return r0
    }

    private final boolean addLastAtomic(java.lang.Object r7, kotlinx.coroutines.NodeList r8, kotlinx.coroutines.JobNode r9) {
            r6 = this;
            r0 = r8
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
            r3 = 0
            kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1 r4 = new kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            r5 = r9
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
            r4.<init>(r5, r6, r7)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r4
            r2 = r4
        L12:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r0.getPrevNode()
            r4 = r9
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            int r4 = r3.tryCondAddNext(r4, r0, r2)
            switch(r4) {
                case 1: goto L24;
                case 2: goto L22;
                default: goto L21;
            }
        L21:
            goto L12
        L22:
            r4 = 0
            goto L25
        L24:
            r4 = 1
        L25:
            return r4
    }

    private final void addSuppressedExceptions(java.lang.Throwable r8, java.util.List<? extends java.lang.Throwable> r9) {
            r7 = this;
            int r0 = r9.size()
            r1 = 1
            if (r0 > r1) goto L8
            return
        L8:
            int r0 = r9.size()
            r1 = 0
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>(r0)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r0 = java.util.Collections.newSetFromMap(r2)
            r1 = 0
            boolean r2 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r2 != 0) goto L22
            r2 = r8
            goto L26
        L22:
            java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r8)
        L26:
            r1 = r2
            java.util.Iterator r2 = r9.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r4 = 0
            boolean r5 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r5 != 0) goto L40
            r5 = r3
            goto L44
        L40:
            java.lang.Throwable r5 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r3)
        L44:
            r4 = r5
            if (r4 == r8) goto L2b
            if (r4 == r1) goto L2b
            boolean r5 = r4 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L2b
            boolean r5 = r0.add(r4)
            if (r5 == 0) goto L2b
            r5 = r8
            r6 = 0
            kotlin.ExceptionsKt.addSuppressed(r5, r4)
            goto L2b
        L59:
            return
    }

    private final java.lang.Object awaitSuspend(kotlin.coroutines.Continuation<java.lang.Object> r7) {
            r6 = this;
            r0 = r7
            r1 = 0
            kotlinx.coroutines.JobSupport$AwaitContinuation r2 = new kotlinx.coroutines.JobSupport$AwaitContinuation
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3, r6)
            r2.initCancellability()
            r3 = r2
            kotlinx.coroutines.CancellableContinuation r3 = (kotlinx.coroutines.CancellableContinuation) r3
            kotlinx.coroutines.ResumeAwaitOnCompletion r4 = new kotlinx.coroutines.ResumeAwaitOnCompletion
            r5 = r2
            kotlinx.coroutines.CancellableContinuationImpl r5 = (kotlinx.coroutines.CancellableContinuationImpl) r5
            r4.<init>(r5)
            kotlinx.coroutines.CompletionHandlerBase r4 = (kotlinx.coroutines.CompletionHandlerBase) r4
            r5 = 0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlinx.coroutines.DisposableHandle r4 = r6.invokeOnCompletion(r4)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r3, r4)
            java.lang.Object r0 = r2.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L32
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L32:
            return r0
    }

    private final java.lang.Object cancelMakeCompleting(java.lang.Object r10) {
            r9 = this;
            r0 = r9
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r4 == 0) goto L33
            boolean r4 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r4 == 0) goto L1a
            r4 = r2
            kotlinx.coroutines.JobSupport$Finishing r4 = (kotlinx.coroutines.JobSupport.Finishing) r4
            boolean r4 = r4.isCompleting()
            if (r4 == 0) goto L1a
            goto L33
        L1a:
            kotlinx.coroutines.CompletedExceptionally r4 = new kotlinx.coroutines.CompletedExceptionally
            java.lang.Throwable r5 = r9.createCauseException(r10)
            r6 = 2
            r7 = 0
            r8 = 0
            r4.<init>(r5, r8, r6, r7)
            java.lang.Object r5 = r9.tryMakeCompleting(r2, r4)
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r5 == r6) goto L31
            return r5
        L31:
            goto L2
        L33:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r4
    }

    private final boolean cancelParent(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.isScopedCoroutine()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            kotlinx.coroutines.ChildHandle r2 = r4.getParentHandle$kotlinx_coroutines_core()
            if (r2 == 0) goto L20
            kotlinx.coroutines.NonDisposableHandle r3 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r2 != r3) goto L15
            goto L20
        L15:
            boolean r3 = r2.childCancelled(r5)
            if (r3 != 0) goto L1f
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
        L20:
            return r0
    }

    private final void completeStateFinalization(kotlinx.coroutines.Incomplete r6, java.lang.Object r7) {
            r5 = this;
            kotlinx.coroutines.ChildHandle r0 = r5.getParentHandle$kotlinx_coroutines_core()
            if (r0 != 0) goto L7
            goto L14
        L7:
            r1 = 0
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.ChildHandle r2 = (kotlinx.coroutines.ChildHandle) r2
            r5.setParentHandle$kotlinx_coroutines_core(r2)
        L14:
            boolean r0 = r7 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L1d
            r0 = r7
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != 0) goto L21
            goto L23
        L21:
            java.lang.Throwable r1 = r0.cause
        L23:
            r0 = r1
            boolean r1 = r6 instanceof kotlinx.coroutines.JobNode
            if (r1 == 0) goto L59
        L29:
            r1 = r6
            kotlinx.coroutines.JobNode r1 = (kotlinx.coroutines.JobNode) r1     // Catch: java.lang.Throwable -> L30
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L30
            goto L63
        L30:
            r1 = move-exception
            kotlinx.coroutines.CompletionHandlerException r2 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in completion handler "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = " for "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r5.handleOnCompletionException$kotlinx_coroutines_core(r2)
            goto L63
        L59:
            kotlinx.coroutines.NodeList r1 = r6.getList()
            if (r1 != 0) goto L60
            goto L63
        L60:
            r5.notifyCompletion(r1, r0)
        L63:
            return
    }

    private final void continueCompleting(kotlinx.coroutines.JobSupport.Finishing r3, kotlinx.coroutines.ChildHandleNode r4, java.lang.Object r5) {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L19
            r0 = 0
            java.lang.Object r1 = r2.getState$kotlinx_coroutines_core()
            if (r1 != r3) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L19:
            r0 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.ChildHandleNode r0 = r2.nextChild(r0)
            if (r0 == 0) goto L29
            boolean r1 = r2.tryWaitForChild(r3, r0, r5)
            if (r1 == 0) goto L29
            return
        L29:
            java.lang.Object r1 = r2.finalizeFinishingState(r3, r5)
            r2.afterCompletion(r1)
            return
    }

    private final java.lang.Throwable createCauseException(java.lang.Object r7) {
            r6 = this;
            if (r7 != 0) goto L5
            r0 = 1
            goto L7
        L5:
            boolean r0 = r7 instanceof java.lang.Throwable
        L7:
            if (r0 == 0) goto L21
            r0 = r7
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L2c
            r0 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r4 = access$cancellationExceptionMessage(r6)
            r5 = r6
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r3.<init>(r4, r1, r5)
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L2c
        L21:
            if (r7 == 0) goto L2d
            r0 = r7
            kotlinx.coroutines.ParentJob r0 = (kotlinx.coroutines.ParentJob) r0
            java.util.concurrent.CancellationException r0 = r0.getChildJobCancellationCause()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L2c:
            return r0
        L2d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(kotlinx.coroutines.JobSupport r2, java.lang.String r3, java.lang.Throwable r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L1e
            r6 = r5 & 1
            if (r6 == 0) goto L7
            r3 = 0
        L7:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r4 = 0
        Lc:
            r5 = 0
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            if (r3 != 0) goto L16
            java.lang.String r0 = access$cancellationExceptionMessage(r2)
            goto L17
        L16:
            r0 = r3
        L17:
            r1 = r2
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            r6.<init>(r0, r4, r1)
            return r6
        L1e:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Super calls with default arguments not supported in this target, function: defaultCancellationException"
            r5.<init>(r6)
            throw r5
    }

    private final java.lang.Object finalizeFinishingState(kotlinx.coroutines.JobSupport.Finishing r10, java.lang.Object r11) {
            r9 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            r0 = 0
            java.lang.Object r3 = r9.getState$kotlinx_coroutines_core()
            if (r3 != r10) goto L11
            r0 = r1
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1b:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L2f
            r0 = 0
            boolean r3 = r10.isSealed()
            if (r3 != 0) goto L29
            goto L2f
        L29:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L2f:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L43
            r0 = 0
            boolean r0 = r10.isCompleting()
            if (r0 == 0) goto L3d
            goto L43
        L3d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L43:
            boolean r0 = r11 instanceof kotlinx.coroutines.CompletedExceptionally
            r3 = 0
            if (r0 == 0) goto L4c
            r0 = r11
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto L4d
        L4c:
            r0 = r3
        L4d:
            if (r0 != 0) goto L51
            r0 = r3
            goto L53
        L51:
            java.lang.Throwable r0 = r0.cause
        L53:
            r4 = 0
            r5 = 0
            monitor-enter(r10)
            r6 = 0
            boolean r7 = r10.isCancelling()     // Catch: java.lang.Throwable -> Lc9
            r4 = r7
            java.util.List r7 = r10.sealLocked(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Throwable r8 = r9.getFinalRootCause(r10, r7)     // Catch: java.lang.Throwable -> Lc9
            if (r8 == 0) goto L69
            r9.addSuppressedExceptions(r8, r7)     // Catch: java.lang.Throwable -> Lc9
        L69:
            monitor-exit(r10)
            r5 = r8
            if (r5 != 0) goto L71
            goto L73
        L71:
            if (r5 != r0) goto L75
        L73:
            r6 = r11
            goto L7b
        L75:
            kotlinx.coroutines.CompletedExceptionally r6 = new kotlinx.coroutines.CompletedExceptionally
            r7 = 2
            r6.<init>(r5, r2, r7, r3)
        L7b:
            r3 = r6
            if (r5 == 0) goto L9f
            boolean r6 = r9.cancelParent(r5)
            if (r6 != 0) goto L8c
            boolean r6 = r9.handleJobException(r5)
            if (r6 == 0) goto L8b
            goto L8c
        L8b:
            r1 = r2
        L8c:
            if (r1 == 0) goto L9f
            if (r3 == 0) goto L97
            r2 = r3
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            r2.makeHandled()
            goto L9f
        L97:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            r2.<init>(r6)
            throw r2
        L9f:
            if (r4 != 0) goto La4
            r9.onCancelling(r5)
        La4:
            r9.onCompletionInternal(r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
            java.lang.Object r2 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r3)
            boolean r1 = androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r9, r10, r2)
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto Lc2
            r2 = 0
            if (r1 == 0) goto Lbc
            goto Lc2
        Lbc:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        Lc2:
            r2 = r10
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            r9.completeStateFinalization(r2, r3)
            return r3
        Lc9:
            r1 = move-exception
            monitor-exit(r10)
            throw r1
    }

    private final kotlinx.coroutines.ChildHandleNode firstChild(kotlinx.coroutines.Incomplete r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.ChildHandleNode
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L1a
            kotlinx.coroutines.NodeList r0 = r3.getList()
            if (r0 != 0) goto L13
            goto L1b
        L13:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.ChildHandleNode r1 = r2.nextChild(r0)
            goto L1b
        L1a:
            r1 = r0
        L1b:
            return r1
    }

    private final java.lang.Throwable getExceptionOrNull(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            java.lang.Throwable r1 = r0.cause
        Lf:
            return r1
    }

    private final java.lang.Throwable getFinalRootCause(kotlinx.coroutines.JobSupport.Finishing r12, java.util.List<? extends java.lang.Throwable> r13) {
            r11 = this;
            boolean r0 = r13.isEmpty()
            r1 = 0
            if (r0 == 0) goto L20
            boolean r0 = r12.isCancelling()
            if (r0 == 0) goto L1f
            r0 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r4 = access$cancellationExceptionMessage(r11)
            r5 = r11
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r3.<init>(r4, r1, r5)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            return r3
        L1f:
            return r1
        L20:
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 0
            java.util.Iterator r3 = r0.iterator()
        L28:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r6 = 0
            boolean r7 = r5 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L28
            goto L3c
        L3b:
            r4 = r1
        L3c:
            r0 = r4
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L42
            return r0
        L42:
            r2 = 0
            java.lang.Object r3 = r13.get(r2)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r4 = r3 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L76
            r4 = r13
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L55:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            r9 = 0
            if (r8 == r3) goto L6b
            boolean r10 = r8 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r10 == 0) goto L6b
            r10 = 1
            goto L6c
        L6b:
            r10 = r2
        L6c:
            if (r10 == 0) goto L55
            r1 = r7
            goto L71
        L70:
        L71:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L76
            return r1
        L76:
            return r3
    }

    private final kotlinx.coroutines.NodeList getOrPromoteCancellingList(kotlinx.coroutines.Incomplete r3) {
            r2 = this;
            kotlinx.coroutines.NodeList r0 = r3.getList()
            if (r0 != 0) goto L30
        L7:
            boolean r0 = r3 instanceof kotlinx.coroutines.Empty
            if (r0 == 0) goto L11
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            goto L30
        L11:
            boolean r0 = r3 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L20
            r0 = r3
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
            r2.promoteSingleToNodeList(r0)
            r0 = 0
            r1 = r0
            kotlinx.coroutines.NodeList r1 = (kotlinx.coroutines.NodeList) r1
            goto L30
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "State should have list: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L30:
            return r0
    }

    private final boolean isCancelling(kotlinx.coroutines.Incomplete r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r0 == 0) goto Lf
            r0 = r2
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            boolean r0 = r0.isCancelling()
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    private final boolean joinInternal() {
            r5 = this;
            r0 = r5
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r4 != 0) goto Le
            r4 = 0
            return r4
        Le:
            int r4 = r5.startInternal(r2)
            if (r4 < 0) goto L16
            r4 = 1
            return r4
        L16:
            goto L2
    }

    private final java.lang.Object joinSuspend(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            r8 = this;
            r0 = 0
            r1 = r9
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
            kotlinx.coroutines.ResumeOnCompletion r6 = new kotlinx.coroutines.ResumeOnCompletion
            r7 = r4
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r6.<init>(r7)
            kotlinx.coroutines.CompletionHandlerBase r6 = (kotlinx.coroutines.CompletionHandlerBase) r6
            r7 = 0
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            kotlinx.coroutines.DisposableHandle r6 = r8.invokeOnCompletion(r6)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r4, r6)
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L36
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r9)
        L36:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L3e
            return r1
        L3e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final java.lang.Void loopOnState(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r3) {
            r2 = this;
            r0 = 0
        L1:
            java.lang.Object r1 = r2.getState$kotlinx_coroutines_core()
            r3.invoke(r1)
            goto L1
    }

    private final java.lang.Object makeCancelling(java.lang.Object r15) {
            r14 = this;
            r0 = 0
            r1 = r14
            r2 = 0
        L3:
            java.lang.Object r3 = r1.getState$kotlinx_coroutines_core()
            r4 = 0
            boolean r5 = r3 instanceof kotlinx.coroutines.JobSupport.Finishing
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L6e
            r5 = 0
            monitor-enter(r3)
            r8 = 0
            r9 = r3
            kotlinx.coroutines.JobSupport$Finishing r9 = (kotlinx.coroutines.JobSupport.Finishing) r9     // Catch: java.lang.Throwable -> L6b
            boolean r9 = r9.isSealed()     // Catch: java.lang.Throwable -> L6b
            if (r9 == 0) goto L22
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r3)
            return r6
        L22:
            r9 = r3
            kotlinx.coroutines.JobSupport$Finishing r9 = (kotlinx.coroutines.JobSupport.Finishing) r9     // Catch: java.lang.Throwable -> L6b
            boolean r9 = r9.isCancelling()     // Catch: java.lang.Throwable -> L6b
            if (r15 != 0) goto L2d
            if (r9 != 0) goto L42
        L2d:
            if (r0 != 0) goto L3a
            java.lang.Throwable r10 = r14.createCauseException(r15)     // Catch: java.lang.Throwable -> L6b
            r11 = r10
            r12 = 0
            r0 = r11
            r13 = r10
            r10 = r0
            r0 = r13
            goto L3b
        L3a:
            r10 = r0
        L3b:
            r11 = r3
            kotlinx.coroutines.JobSupport$Finishing r11 = (kotlinx.coroutines.JobSupport.Finishing) r11     // Catch: java.lang.Throwable -> L68
            r11.addExceptionLocked(r0)     // Catch: java.lang.Throwable -> L68
            r0 = r10
        L42:
            r10 = r3
            kotlinx.coroutines.JobSupport$Finishing r10 = (kotlinx.coroutines.JobSupport.Finishing) r10     // Catch: java.lang.Throwable -> L6b
            java.lang.Throwable r10 = r10.getRootCause()     // Catch: java.lang.Throwable -> L6b
            r11 = r10
            r12 = 0
            if (r9 != 0) goto L4e
            r7 = 1
        L4e:
            if (r7 == 0) goto L51
            r6 = r10
        L51:
            monitor-exit(r3)
            r5 = r6
            if (r5 != 0) goto L57
            goto L63
        L57:
            r6 = r5
            r7 = 0
            r8 = r3
            kotlinx.coroutines.JobSupport$Finishing r8 = (kotlinx.coroutines.JobSupport.Finishing) r8
            kotlinx.coroutines.NodeList r8 = r8.getList()
            r14.notifyCancelling(r8, r6)
        L63:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r6
        L68:
            r6 = move-exception
            r0 = r10
            goto L6c
        L6b:
            r6 = move-exception
        L6c:
            monitor-exit(r3)
            throw r6
        L6e:
            boolean r5 = r3 instanceof kotlinx.coroutines.Incomplete
            if (r5 == 0) goto Lc4
            if (r0 != 0) goto L7f
            java.lang.Throwable r5 = r14.createCauseException(r15)
            r8 = r5
            r9 = 0
            r0 = r8
            r13 = r5
            r5 = r0
            r0 = r13
            goto L80
        L7f:
            r5 = r0
        L80:
            r8 = r3
            kotlinx.coroutines.Incomplete r8 = (kotlinx.coroutines.Incomplete) r8
            boolean r8 = r8.isActive()
            if (r8 == 0) goto L99
            r6 = r3
            kotlinx.coroutines.Incomplete r6 = (kotlinx.coroutines.Incomplete) r6
            boolean r6 = r14.tryMakeCancelling(r6, r0)
            if (r6 == 0) goto L97
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r6
        L97:
            goto Lb0
        L99:
            kotlinx.coroutines.CompletedExceptionally r8 = new kotlinx.coroutines.CompletedExceptionally
            r9 = 2
            r8.<init>(r0, r7, r9, r6)
            java.lang.Object r6 = r14.tryMakeCompleting(r3, r8)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r6 == r7) goto Lb4
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r6 != r7) goto Lb3
        Lb0:
            r0 = r5
            goto L3
        Lb3:
            return r6
        Lb4:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Cannot happen in "
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r3)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Lc4:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            return r5
    }

    private final kotlinx.coroutines.JobNode makeNode(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r6, boolean r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L16
            boolean r1 = r6 instanceof kotlinx.coroutines.JobCancellingNode
            if (r1 == 0) goto La
            r0 = r6
            kotlinx.coroutines.JobCancellingNode r0 = (kotlinx.coroutines.JobCancellingNode) r0
        La:
            if (r0 != 0) goto L13
            kotlinx.coroutines.InvokeOnCancelling r0 = new kotlinx.coroutines.InvokeOnCancelling
            r0.<init>(r6)
            kotlinx.coroutines.JobCancellingNode r0 = (kotlinx.coroutines.JobCancellingNode) r0
        L13:
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
            goto L41
        L16:
            boolean r1 = r6 instanceof kotlinx.coroutines.JobNode
            if (r1 == 0) goto L1e
            r1 = r6
            kotlinx.coroutines.JobNode r1 = (kotlinx.coroutines.JobNode) r1
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 != 0) goto L23
            goto L38
        L23:
            r0 = r1
            r2 = 0
            boolean r3 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r3 == 0) goto L37
            r3 = 0
            boolean r4 = r0 instanceof kotlinx.coroutines.JobCancellingNode
            if (r4 != 0) goto L31
            goto L37
        L31:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L37:
            r0 = r1
        L38:
            if (r0 != 0) goto L41
            kotlinx.coroutines.InvokeOnCompletion r0 = new kotlinx.coroutines.InvokeOnCompletion
            r0.<init>(r6)
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
        L41:
            r0.setJob(r5)
            return r0
    }

    private final kotlinx.coroutines.ChildHandleNode nextChild(kotlinx.coroutines.internal.LockFreeLinkedListNode r3) {
            r2 = this;
            r0 = r3
        L1:
            boolean r1 = r0.isRemoved()
            if (r1 == 0) goto Lc
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getPrevNode()
            goto L1
        Lc:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r1 = r0.isRemoved()
            if (r1 == 0) goto L18
            goto Lc
        L18:
            boolean r1 = r0 instanceof kotlinx.coroutines.ChildHandleNode
            if (r1 == 0) goto L20
            r1 = r0
            kotlinx.coroutines.ChildHandleNode r1 = (kotlinx.coroutines.ChildHandleNode) r1
            return r1
        L20:
            boolean r1 = r0 instanceof kotlinx.coroutines.NodeList
            if (r1 == 0) goto Lc
            r1 = 0
            return r1
    }

    private final void notifyCancelling(kotlinx.coroutines.NodeList r17, java.lang.Throwable r18) {
            r16 = this;
            r1 = r16
            r2 = r18
            r1.onCancelling(r2)
            r3 = r16
            r4 = 0
            r0 = 0
            r5 = r17
            kotlinx.coroutines.internal.LockFreeLinkedListHead r5 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r5
            r6 = 0
            java.lang.Object r7 = r5.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r7 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r7
            r8 = r7
            r7 = r0
        L18:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r5)
            if (r0 != 0) goto L6e
            boolean r0 = r8 instanceof kotlinx.coroutines.JobCancellingNode
            if (r0 == 0) goto L69
            r9 = r8
            kotlinx.coroutines.JobNode r9 = (kotlinx.coroutines.JobNode) r9
            r10 = 0
            r9.invoke(r2)     // Catch: java.lang.Throwable -> L2b
            goto L68
        L2b:
            r0 = move-exception
            r11 = r0
            r0 = r11
            r11 = r7
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            if (r11 != 0) goto L35
            r11 = 0
            goto L3d
        L35:
            r12 = r11
            r13 = 0
            r14 = r12
            r15 = 0
            kotlin.ExceptionsKt.addSuppressed(r14, r0)
        L3d:
            if (r11 != 0) goto L68
            r11 = r3
            kotlinx.coroutines.JobSupport r11 = (kotlinx.coroutines.JobSupport) r11
            r12 = 0
            kotlinx.coroutines.CompletionHandlerException r13 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Exception in completion handler "
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.StringBuilder r14 = r14.append(r9)
            java.lang.String r15 = " for "
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.StringBuilder r14 = r14.append(r11)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14, r0)
            r7 = r13
        L68:
        L69:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r8 = r8.getNextNode()
            goto L18
        L6e:
            r0 = r7
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L75
            goto L79
        L75:
            r5 = 0
            r3.handleOnCompletionException$kotlinx_coroutines_core(r0)
        L79:
            r1.cancelParent(r2)
            return
    }

    private final void notifyCompletion(kotlinx.coroutines.NodeList r16, java.lang.Throwable r17) {
            r15 = this;
            r1 = r15
            r2 = 0
            r0 = 0
            r3 = r16
            kotlinx.coroutines.internal.LockFreeLinkedListHead r3 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r3
            r4 = 0
            java.lang.Object r5 = r3.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
            r6 = r5
            r5 = r0
        L10:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
            if (r0 != 0) goto L6a
            boolean r0 = r6 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L63
            r7 = r6
            kotlinx.coroutines.JobNode r7 = (kotlinx.coroutines.JobNode) r7
            r8 = 0
            r9 = r17
            r7.invoke(r9)     // Catch: java.lang.Throwable -> L25
            goto L62
        L25:
            r0 = move-exception
            r10 = r0
            r0 = r10
            r10 = r5
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 != 0) goto L2f
            r10 = 0
            goto L37
        L2f:
            r11 = r10
            r12 = 0
            r13 = r11
            r14 = 0
            kotlin.ExceptionsKt.addSuppressed(r13, r0)
        L37:
            if (r10 != 0) goto L62
            r10 = r1
            kotlinx.coroutines.JobSupport r10 = (kotlinx.coroutines.JobSupport) r10
            r11 = 0
            kotlinx.coroutines.CompletionHandlerException r12 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Exception in completion handler "
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r7)
            java.lang.String r14 = " for "
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r10)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13, r0)
            r5 = r12
        L62:
            goto L65
        L63:
            r9 = r17
        L65:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = r6.getNextNode()
            goto L10
        L6a:
            r9 = r17
            r0 = r5
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L72
            goto L76
        L72:
            r3 = 0
            r1.handleOnCompletionException$kotlinx_coroutines_core(r0)
        L76:
            return
    }

    private final /* synthetic */ <T extends kotlinx.coroutines.JobNode> void notifyHandlers(kotlinx.coroutines.NodeList r14, java.lang.Throwable r15) {
            r13 = this;
            r0 = 0
            r1 = 0
            r2 = r14
            kotlinx.coroutines.internal.LockFreeLinkedListHead r2 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r2
            r3 = 0
            java.lang.Object r4 = r2.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
        Lc:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            if (r5 != 0) goto L6b
            r5 = 3
            java.lang.String r6 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r5, r6)
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode
            if (r5 == 0) goto L66
            r5 = r4
            kotlinx.coroutines.JobNode r5 = (kotlinx.coroutines.JobNode) r5
            r6 = 0
            r5.invoke(r15)     // Catch: java.lang.Throwable -> L25
            goto L65
        L25:
            r7 = move-exception
            r8 = r1
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            if (r8 != 0) goto L2d
            r8 = 0
            goto L3a
        L2d:
            r9 = r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r10 = 0
            r11 = r9
            r12 = 0
            kotlin.ExceptionsKt.addSuppressed(r11, r7)
            r9 = r8
            java.lang.Throwable r9 = (java.lang.Throwable) r9
        L3a:
            if (r8 != 0) goto L65
            r8 = r13
            kotlinx.coroutines.JobSupport r8 = (kotlinx.coroutines.JobSupport) r8
            r9 = 0
            kotlinx.coroutines.CompletionHandlerException r10 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Exception in completion handler "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r5)
            java.lang.String r12 = " for "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r8)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11, r7)
            r1 = r10
        L65:
        L66:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.getNextNode()
            goto Lc
        L6b:
            r2 = r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 != 0) goto L72
            goto L78
        L72:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = 0
            r13.handleOnCompletionException$kotlinx_coroutines_core(r2)
        L78:
            return
    }

    private final void promoteEmptyToNodeList(kotlinx.coroutines.Empty r4) {
            r3 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            boolean r1 = r4.isActive()
            if (r1 == 0) goto Lf
            r1 = r0
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            goto L16
        Lf:
            kotlinx.coroutines.InactiveNodeList r1 = new kotlinx.coroutines.InactiveNodeList
            r1.<init>(r0)
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.JobSupport._state$FU
            androidx.concurrent.futures.C0110xc40028dd.m9m(r2, r3, r4, r1)
            return
    }

    private final void promoteSingleToNodeList(kotlinx.coroutines.JobNode r3) {
            r2 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r3.addOneIfEmpty(r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r3.getNextNode()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
            androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r2, r3, r0)
            return
    }

    private final int startInternal(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.Empty
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L23
            r0 = r5
            kotlinx.coroutines.Empty r0 = (kotlinx.coroutines.Empty) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L12
            return r3
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            kotlinx.coroutines.Empty r3 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            boolean r0 = androidx.concurrent.futures.C0110xc40028dd.m9m(r0, r4, r5, r3)
            if (r0 != 0) goto L1f
            return r1
        L1f:
            r4.onStart()
            return r2
        L23:
            boolean r0 = r5 instanceof kotlinx.coroutines.InactiveNodeList
            if (r0 == 0) goto L3b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            r3 = r5
            kotlinx.coroutines.InactiveNodeList r3 = (kotlinx.coroutines.InactiveNodeList) r3
            kotlinx.coroutines.NodeList r3 = r3.getList()
            boolean r0 = androidx.concurrent.futures.C0110xc40028dd.m9m(r0, r4, r5, r3)
            if (r0 != 0) goto L37
            return r1
        L37:
            r4.onStart()
            return r2
        L3b:
            return r3
    }

    private final java.lang.String stateString(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L20
            r0 = r3
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            boolean r0 = r0.isCancelling()
            if (r0 == 0) goto L13
            java.lang.String r1 = "Cancelling"
            goto L3a
        L13:
            r0 = r3
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            boolean r0 = r0.isCompleting()
            if (r0 == 0) goto L1f
            java.lang.String r1 = "Completing"
            goto L3a
        L1f:
            goto L3a
        L20:
            boolean r0 = r3 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto L31
            r0 = r3
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L2e
            goto L3a
        L2e:
            java.lang.String r1 = "New"
            goto L3a
        L31:
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L38
            java.lang.String r1 = "Cancelled"
            goto L3a
        L38:
            java.lang.String r1 = "Completed"
        L3a:
            return r1
    }

    public static /* synthetic */ java.util.concurrent.CancellationException toCancellationException$default(kotlinx.coroutines.JobSupport r0, java.lang.Throwable r1, java.lang.String r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 1
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            java.util.concurrent.CancellationException r0 = r0.toCancellationException(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: toCancellationException"
            r0.<init>(r1)
            throw r0
    }

    private final boolean tryFinalizeSimpleState(kotlinx.coroutines.Incomplete r5, java.lang.Object r6) {
            r4 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            r0 = 0
            boolean r3 = r5 instanceof kotlinx.coroutines.Empty
            if (r3 != 0) goto L14
            boolean r3 = r5 instanceof kotlinx.coroutines.JobNode
            if (r3 == 0) goto L12
            goto L14
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L18
            goto L1e
        L18:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1e:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L30
            r0 = 0
            boolean r3 = r6 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 != 0) goto L2a
            goto L30
        L2a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L30:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r6)
            boolean r0 = androidx.concurrent.futures.C0110xc40028dd.m9m(r0, r4, r5, r3)
            if (r0 != 0) goto L3d
            return r1
        L3d:
            r0 = 0
            r4.onCancelling(r0)
            r4.onCompletionInternal(r6)
            r4.completeStateFinalization(r5, r6)
            return r2
    }

    private final boolean tryMakeCancelling(kotlinx.coroutines.Incomplete r5, java.lang.Throwable r6) {
            r4 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L12
            r0 = 0
            boolean r1 = r5 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 != 0) goto Lc
            goto L12
        Lc:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L12:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L26
            r0 = 0
            boolean r0 = r5.isActive()
            if (r0 == 0) goto L20
            goto L26
        L20:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L26:
            kotlinx.coroutines.NodeList r0 = r4.getOrPromoteCancellingList(r5)
            r1 = 0
            if (r0 != 0) goto L2e
            return r1
        L2e:
            kotlinx.coroutines.JobSupport$Finishing r2 = new kotlinx.coroutines.JobSupport$Finishing
            r2.<init>(r0, r1, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.JobSupport._state$FU
            boolean r3 = androidx.concurrent.futures.C0110xc40028dd.m9m(r3, r4, r5, r2)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r4.notifyCancelling(r0, r6)
            r1 = 1
            return r1
    }

    private final java.lang.Object tryMakeCompleting(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r0
        L9:
            boolean r0 = r2 instanceof kotlinx.coroutines.Empty
            if (r0 != 0) goto L11
            boolean r0 = r2 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L28
        L11:
            boolean r0 = r2 instanceof kotlinx.coroutines.ChildHandleNode
            if (r0 != 0) goto L28
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 != 0) goto L28
            r0 = r2
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            boolean r0 = r1.tryFinalizeSimpleState(r0, r3)
            if (r0 == 0) goto L23
            return r3
        L23:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r0
        L28:
            r0 = r2
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            java.lang.Object r0 = r1.tryMakeCompletingSlowPath(r0, r3)
            return r0
    }

    private final java.lang.Object tryMakeCompletingSlowPath(kotlinx.coroutines.Incomplete r13, java.lang.Object r14) {
            r12 = this;
            kotlinx.coroutines.NodeList r0 = r12.getOrPromoteCancellingList(r13)
            if (r0 != 0) goto Lb
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r0
        Lb:
            boolean r1 = r13 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L14
            r1 = r13
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            goto L15
        L14:
            r1 = r2
        L15:
            r3 = 0
            if (r1 != 0) goto L1d
            kotlinx.coroutines.JobSupport$Finishing r1 = new kotlinx.coroutines.JobSupport$Finishing
            r1.<init>(r0, r3, r2)
        L1d:
            r4 = 0
            r5 = 0
            monitor-enter(r1)
            r6 = 0
            boolean r7 = r1.isCompleting()     // Catch: java.lang.Throwable -> L99
            if (r7 == 0) goto L2d
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()     // Catch: java.lang.Throwable -> L99
            monitor-exit(r1)
            return r2
        L2d:
            r7 = 1
            r1.setCompleting(r7)     // Catch: java.lang.Throwable -> L99
            if (r1 == r13) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.JobSupport._state$FU     // Catch: java.lang.Throwable -> L99
            boolean r8 = androidx.concurrent.futures.C0110xc40028dd.m9m(r8, r12, r13, r1)     // Catch: java.lang.Throwable -> L99
            if (r8 != 0) goto L41
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()     // Catch: java.lang.Throwable -> L99
            monitor-exit(r1)
            return r2
        L41:
            boolean r8 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L99
            if (r8 == 0) goto L55
            r8 = 0
            boolean r9 = r1.isSealed()     // Catch: java.lang.Throwable -> L99
            if (r9 != 0) goto L4f
            goto L55
        L4f:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L99
            r2.<init>()     // Catch: java.lang.Throwable -> L99
            throw r2     // Catch: java.lang.Throwable -> L99
        L55:
            boolean r8 = r1.isCancelling()     // Catch: java.lang.Throwable -> L99
            boolean r9 = r14 instanceof kotlinx.coroutines.CompletedExceptionally     // Catch: java.lang.Throwable -> L99
            if (r9 == 0) goto L61
            r9 = r14
            kotlinx.coroutines.CompletedExceptionally r9 = (kotlinx.coroutines.CompletedExceptionally) r9     // Catch: java.lang.Throwable -> L99
            goto L62
        L61:
            r9 = r2
        L62:
            if (r9 != 0) goto L65
            goto L6b
        L65:
            r10 = 0
            java.lang.Throwable r11 = r9.cause     // Catch: java.lang.Throwable -> L99
            r1.addExceptionLocked(r11)     // Catch: java.lang.Throwable -> L99
        L6b:
            java.lang.Throwable r9 = r1.getRootCause()     // Catch: java.lang.Throwable -> L99
            r10 = r9
            r11 = 0
            if (r8 != 0) goto L74
            r3 = r7
        L74:
            if (r3 == 0) goto L77
            r2 = r9
        L77:
            r4 = r2
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L99
            monitor-exit(r1)
            if (r4 != 0) goto L80
            goto L85
        L80:
            r2 = r4
            r3 = 0
            r12.notifyCancelling(r0, r2)
        L85:
            kotlinx.coroutines.ChildHandleNode r2 = r12.firstChild(r13)
            if (r2 == 0) goto L94
            boolean r3 = r12.tryWaitForChild(r1, r2, r14)
            if (r3 == 0) goto L94
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            return r3
        L94:
            java.lang.Object r3 = r12.finalizeFinishingState(r1, r14)
            return r3
        L99:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private final boolean tryWaitForChild(kotlinx.coroutines.JobSupport.Finishing r9, kotlinx.coroutines.ChildHandleNode r10, java.lang.Object r11) {
            r8 = this;
            r0 = r10
        L1:
            kotlinx.coroutines.ChildJob r1 = r0.childJob
            r2 = r1
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlinx.coroutines.JobSupport$ChildCompletion r1 = new kotlinx.coroutines.JobSupport$ChildCompletion
            r1.<init>(r8, r9, r0, r11)
            kotlinx.coroutines.CompletionHandlerBase r1 = (kotlinx.coroutines.CompletionHandlerBase) r1
            r3 = 0
            r5 = r1
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r6 = 1
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.DisposableHandle r1 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r1 == r2) goto L20
            r0 = 1
            return r0
        L20:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.ChildHandleNode r0 = r8.nextChild(r0)
            if (r0 != 0) goto L2a
            r0 = 0
            return r0
        L2a:
            goto L1
    }

    protected void afterCompletion(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob r7) {
            r6 = this;
            r0 = r6
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlinx.coroutines.ChildHandleNode r1 = new kotlinx.coroutines.ChildHandleNode
            r1.<init>(r7)
            kotlinx.coroutines.CompletionHandlerBase r1 = (kotlinx.coroutines.CompletionHandlerBase) r1
            r2 = 0
            r3 = r1
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r4 = 2
            r5 = 0
            r1 = 1
            r2 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            return r0
    }

    public final java.lang.Object awaitInternal$kotlinx_coroutines_core(kotlin.coroutines.Continuation<java.lang.Object> r7) {
            r6 = this;
        L1:
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L2a
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            r2 = 0
            boolean r3 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r3 == 0) goto L29
            r3 = r7
            r4 = 0
            boolean r5 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r5 != 0) goto L21
            throw r1
        L21:
            r5 = r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r5 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r5
            java.lang.Throwable r5 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r1, r5)
            throw r5
        L29:
            throw r1
        L2a:
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r1
        L2f:
            int r1 = r6.startInternal(r0)
            if (r1 < 0) goto L1
            java.lang.Object r0 = r6.awaitSuspend(r7)
            return r0
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlinx.coroutines.Job.DefaultImpls.cancel(r0)
            return
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(java.util.concurrent.CancellationException r7) {
            r6 = this;
            if (r7 != 0) goto L14
            r0 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r4 = access$cancellationExceptionMessage(r6)
            r5 = r6
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r3.<init>(r4, r1, r5)
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
            goto L15
        L14:
            r3 = r7
        L15:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r6.cancelInternal(r3)
            return
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r8) {
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L5
            goto L9
        L5:
            java.util.concurrent.CancellationException r1 = toCancellationException$default(r7, r8, r1, r0, r1)
        L9:
            if (r1 != 0) goto L1d
            r1 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r5 = access$cancellationExceptionMessage(r7)
            r6 = r7
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            r4.<init>(r5, r2, r6)
            r1 = r4
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        L1d:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r7.cancelInternal(r1)
            return r0
    }

    public final boolean cancelCoroutine(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelImpl$kotlinx_coroutines_core(r2)
            return r0
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(java.lang.Object r4) {
            r3 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            boolean r1 = r3.getOnCancelComplete$kotlinx_coroutines_core()
            r2 = 1
            if (r1 == 0) goto L14
            java.lang.Object r0 = r3.cancelMakeCompleting(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r1) goto L14
            return r2
        L14:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r3.makeCancelling(r4)
        L1e:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L26
            goto L37
        L26:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r1) goto L2b
            goto L37
        L2b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            if (r0 != r1) goto L33
            r2 = 0
            goto L37
        L33:
            r3.afterCompletion(r0)
        L37:
            return r2
    }

    public void cancelInternal(java.lang.Throwable r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    protected java.lang.String cancellationExceptionMessage() {
            r1 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    public boolean childCancelled(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r2.cancelImpl$kotlinx_coroutines_core(r3)
            if (r0 == 0) goto L13
            boolean r0 = r2.getHandlesException$kotlinx_coroutines_core()
            if (r0 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public final kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core(java.lang.String r5, java.lang.Throwable r6) {
            r4 = this;
            r0 = 0
            kotlinx.coroutines.JobCancellationException r1 = new kotlinx.coroutines.JobCancellationException
            if (r5 != 0) goto La
            java.lang.String r2 = access$cancellationExceptionMessage(r4)
            goto Lb
        La:
            r2 = r5
        Lb:
            r3 = r4
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            r1.<init>(r2, r6, r3)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            java.lang.Object r0 = kotlinx.coroutines.Job.DefaultImpls.fold(r0, r2, r3)
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r2) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlin.coroutines.CoroutineContext$Element r0 = kotlinx.coroutines.Job.DefaultImpls.get(r0, r2)
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final java.util.concurrent.CancellationException getCancellationException() {
            r5 = this;
            java.lang.Object r0 = r5.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r2 = "Job is still new or active: "
            r3 = 0
            if (r1 == 0) goto L34
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            java.lang.Throwable r1 = r1.getRootCause()
            if (r1 != 0) goto L15
            goto L23
        L15:
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r5)
            java.lang.String r4 = " is cancelling"
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r4)
            java.util.concurrent.CancellationException r3 = r5.toCancellationException(r1, r3)
        L23:
            if (r3 == 0) goto L26
            goto L5c
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L34:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L5d
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L47
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            r2 = 1
            java.util.concurrent.CancellationException r3 = toCancellationException$default(r5, r1, r3, r2, r3)
            goto L5c
        L47:
            kotlinx.coroutines.JobCancellationException r1 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r2 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r5)
            java.lang.String r4 = " has completed normally"
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r4)
            r4 = r5
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            r1.<init>(r2, r3, r4)
            r3 = r1
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L5c:
            return r3
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.ParentJob
    public java.util.concurrent.CancellationException getChildJobCancellationCause() {
            r5 = this;
            java.lang.Object r0 = r5.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L12
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            java.lang.Throwable r1 = r1.getRootCause()
            goto L21
        L12:
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L1c
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            goto L21
        L1c:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L40
            r1 = r2
        L21:
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L29
            r2 = r1
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L29:
            if (r2 != 0) goto L3f
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r3 = "Parent job is "
            java.lang.String r4 = r5.stateString(r0)
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r4)
            r4 = r5
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            r2.<init>(r3, r1, r4)
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L3f:
            return r2
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot be cancelling child in this state: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.Job
    public final kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
            r2 = this;
            kotlinx.coroutines.JobSupport$children$1 r0 = new kotlinx.coroutines.JobSupport$children$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r0)
            return r0
    }

    public final java.lang.Object getCompletedInternal$kotlinx_coroutines_core() {
            r3 = this;
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L11
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r1
        L11:
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            throw r1
        L17:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This job has not completed yet"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    protected final java.lang.Throwable getCompletionCause() {
            r3 = this;
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r2 = "Job is still new or active: "
            if (r1 == 0) goto L22
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            java.lang.Throwable r1 = r1.getRootCause()
            if (r1 == 0) goto L14
            goto L31
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L22:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L32
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L30
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    protected final boolean getCompletionCauseHandled() {
            r3 = this;
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            r1 = 0
            boolean r2 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r2 == 0) goto L14
            r2 = r0
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            boolean r2 = r2.getHandled()
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    public final java.lang.Throwable getCompletionExceptionOrNull() {
            r3 = this;
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto Ld
            java.lang.Throwable r1 = r3.getExceptionOrNull(r0)
            return r1
        Ld:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This job has not completed yet"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
            r1 = this;
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            return r0
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectClause0 r0 = (kotlinx.coroutines.selects.SelectClause0) r0
            return r0
    }

    public final kotlinx.coroutines.ChildHandle getParentHandle$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            return r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r5 = this;
            r0 = r5
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 != 0) goto Lb
            return r2
        Lb:
            r4 = r2
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r5)
            goto L2
    }

    protected boolean handleJobException(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable r1) {
            r0 = this;
            throw r1
    }

    protected final void initParentJob(kotlinx.coroutines.Job r3) {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L19
            r0 = 0
            kotlinx.coroutines.ChildHandle r1 = r2.getParentHandle$kotlinx_coroutines_core()
            if (r1 != 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L19:
            if (r3 != 0) goto L23
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            r2.setParentHandle$kotlinx_coroutines_core(r0)
            return
        L23:
            r3.start()
            r0 = r2
            kotlinx.coroutines.ChildJob r0 = (kotlinx.coroutines.ChildJob) r0
            kotlinx.coroutines.ChildHandle r0 = r3.attachChild(r0)
            r2.setParentHandle$kotlinx_coroutines_core(r0)
            boolean r1 = r2.isCompleted()
            if (r1 == 0) goto L41
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.ChildHandle r1 = (kotlinx.coroutines.ChildHandle) r1
            r2.setParentHandle$kotlinx_coroutines_core(r1)
        L41:
            return
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            kotlinx.coroutines.DisposableHandle r0 = r2.invokeOnCompletion(r0, r1, r3)
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean r17, boolean r18, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r19) {
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r19
            kotlinx.coroutines.JobNode r4 = r1.makeNode(r3, r2)
            r5 = r16
            r6 = 0
        Ld:
            java.lang.Object r7 = r5.getState$kotlinx_coroutines_core()
            r8 = 0
            boolean r0 = r7 instanceof kotlinx.coroutines.Empty
            if (r0 == 0) goto L35
            r0 = r7
            kotlinx.coroutines.Empty r0 = (kotlinx.coroutines.Empty) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L2d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            boolean r0 = androidx.concurrent.futures.C0110xc40028dd.m9m(r0, r1, r7, r4)
            if (r0 == 0) goto Lab
            r0 = r4
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
        L2d:
            r0 = r7
            kotlinx.coroutines.Empty r0 = (kotlinx.coroutines.Empty) r0
            r1.promoteEmptyToNodeList(r0)
            goto Lab
        L35:
            boolean r0 = r7 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto Lae
            r0 = r7
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            kotlinx.coroutines.NodeList r9 = r0.getList()
            if (r9 != 0) goto L53
            if (r7 == 0) goto L4b
            r0 = r7
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
            r1.promoteSingleToNodeList(r0)
            goto Lab
        L4b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r0.<init>(r10)
            throw r0
        L53:
            r10 = 0
            r0 = 0
            kotlinx.coroutines.NonDisposableHandle r11 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r2 == 0) goto L92
            boolean r0 = r7 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r0 == 0) goto L92
            r12 = 0
            monitor-enter(r7)
            r0 = 0
            r13 = r7
            kotlinx.coroutines.JobSupport$Finishing r13 = (kotlinx.coroutines.JobSupport.Finishing) r13     // Catch: java.lang.Throwable -> L8f
            java.lang.Throwable r13 = r13.getRootCause()     // Catch: java.lang.Throwable -> L8f
            r10 = r13
            if (r10 == 0) goto L7a
            r13 = r19
            r14 = 0
            boolean r15 = r13 instanceof kotlinx.coroutines.ChildHandleNode     // Catch: java.lang.Throwable -> L8f
            if (r15 == 0) goto L8a
            r13 = r7
            kotlinx.coroutines.JobSupport$Finishing r13 = (kotlinx.coroutines.JobSupport.Finishing) r13     // Catch: java.lang.Throwable -> L8f
            boolean r13 = r13.isCompleting()     // Catch: java.lang.Throwable -> L8f
            if (r13 != 0) goto L8a
        L7a:
            boolean r13 = r1.addLastAtomic(r7, r9, r4)     // Catch: java.lang.Throwable -> L8f
            if (r13 != 0) goto L82
            monitor-exit(r7)
            goto Ld
        L82:
            if (r10 != 0) goto L89
            r13 = r4
            kotlinx.coroutines.DisposableHandle r13 = (kotlinx.coroutines.DisposableHandle) r13     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r7)
            return r13
        L89:
            r11 = r4
        L8a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r7)
            goto L92
        L8f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L92:
            if (r10 == 0) goto La1
            if (r18 == 0) goto L9d
            r0 = r10
            r12 = r19
            r13 = 0
            r12.invoke(r0)
        L9d:
            r0 = r11
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
        La1:
            boolean r0 = r1.addLastAtomic(r7, r9, r4)
            if (r0 == 0) goto Lab
            r0 = r4
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
        Lab:
            goto Ld
        Lae:
            if (r18 == 0) goto Lc6
            boolean r0 = r7 instanceof kotlinx.coroutines.CompletedExceptionally
            r9 = 0
            if (r0 == 0) goto Lb9
            r0 = r7
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto Lba
        Lb9:
            r0 = r9
        Lba:
            if (r0 != 0) goto Lbd
            goto Lbf
        Lbd:
            java.lang.Throwable r9 = r0.cause
        Lbf:
            r0 = r9
            r9 = r19
            r10 = 0
            r9.invoke(r0)
        Lc6:
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L13
            r1 = r0
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            boolean r1 = r1.isActive()
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L18
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            boolean r1 = r1.isCancelling()
            if (r1 == 0) goto L16
            goto L18
        L16:
            r1 = 0
            goto L19
        L18:
            r1 = 1
        L19:
            return r1
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.Incomplete
            r0 = r0 ^ 1
            return r0
    }

    public final boolean isCompletedExceptionally() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            return r0
    }

    protected boolean isScopedCoroutine() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r2 = this;
            boolean r0 = r2.joinInternal()
            if (r0 != 0) goto L10
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L10:
            java.lang.Object r0 = r2.joinSuspend(r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L1b
            return r0
        L1b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(java.lang.Object r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            java.lang.Object r4 = r7.tryMakeCompleting(r2, r8)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r4 != r5) goto L15
            r5 = 0
            return r5
        L15:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            r6 = 1
            if (r4 != r5) goto L1b
            return r6
        L1b:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r4 != r5) goto L22
            goto L2
        L22:
            r7.afterCompletion(r4)
            return r6
    }

    public final java.lang.Object makeCompletingOnce$kotlinx_coroutines_core(java.lang.Object r9) {
            r8 = this;
            r0 = r8
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            java.lang.Object r4 = r8.tryMakeCompleting(r2, r9)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r4 == r5) goto L1b
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r4 != r5) goto L1a
            goto L2
        L1a:
            return r4
        L1b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Job "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r7 = " is already complete or completing, but is being completed with "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.Throwable r7 = r8.getExceptionOrNull(r9)
            r5.<init>(r6, r7)
            throw r5
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r2) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Job.DefaultImpls.minusKey(r0, r2)
            return r0
    }

    public java.lang.String nameString$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.String r0 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r1)
            return r0
    }

    protected void onCancelling(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    protected void onCompletionInternal(java.lang.Object r1) {
            r0 = this;
            return
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(kotlinx.coroutines.ParentJob r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r2)
            return r0
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public kotlinx.coroutines.Job plus(kotlinx.coroutines.Job r2) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r2)
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectClause0
    public final <R> void registerSelectClause0(kotlinx.coroutines.selects.SelectInstance<? super R> r7, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r8) {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            boolean r4 = r7.isSelected()
            if (r4 == 0) goto Lf
            return
        Lf:
            boolean r4 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r4 != 0) goto L21
            boolean r4 = r7.trySelect()
            if (r4 == 0) goto L20
            kotlin.coroutines.Continuation r4 = r7.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r8, r4)
        L20:
            return
        L21:
            int r4 = r6.startInternal(r2)
            if (r4 != 0) goto L39
            kotlinx.coroutines.SelectJoinOnCompletion r4 = new kotlinx.coroutines.SelectJoinOnCompletion
            r4.<init>(r7, r8)
            kotlinx.coroutines.CompletionHandlerBase r4 = (kotlinx.coroutines.CompletionHandlerBase) r4
            r5 = 0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlinx.coroutines.DisposableHandle r4 = r6.invokeOnCompletion(r4)
            r7.disposeOnSelect(r4)
            return
        L39:
            goto L2
    }

    public final <T, R> void registerSelectClause1Internal$kotlinx_coroutines_core(kotlinx.coroutines.selects.SelectInstance<? super R> r7, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r8) {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            boolean r4 = r7.isSelected()
            if (r4 == 0) goto Lf
            return
        Lf:
            boolean r4 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r4 != 0) goto L32
            boolean r4 = r7.trySelect()
            if (r4 == 0) goto L31
            boolean r4 = r2 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r4 == 0) goto L26
            r4 = r2
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            java.lang.Throwable r4 = r4.cause
            r7.resumeSelectWithException(r4)
            goto L31
        L26:
            java.lang.Object r4 = kotlinx.coroutines.JobSupportKt.unboxState(r2)
            kotlin.coroutines.Continuation r5 = r7.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r8, r4, r5)
        L31:
            return
        L32:
            int r4 = r6.startInternal(r2)
            if (r4 != 0) goto L4a
            kotlinx.coroutines.SelectAwaitOnCompletion r4 = new kotlinx.coroutines.SelectAwaitOnCompletion
            r4.<init>(r7, r8)
            kotlinx.coroutines.CompletionHandlerBase r4 = (kotlinx.coroutines.CompletionHandlerBase) r4
            r5 = 0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlinx.coroutines.DisposableHandle r4 = r6.invokeOnCompletion(r4)
            r7.disposeOnSelect(r4)
            return
        L4a:
            goto L2
    }

    public final void removeNode$kotlinx_coroutines_core(kotlinx.coroutines.JobNode r7) {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.JobNode
            if (r4 == 0) goto L1f
            if (r2 == r7) goto L10
            return
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.JobSupport._state$FU
            kotlinx.coroutines.Empty r5 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r6, r2, r5)
            if (r4 == 0) goto L1d
            return
        L1d:
            goto L2
        L1f:
            boolean r4 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r4 == 0) goto L30
            r4 = r2
            kotlinx.coroutines.Incomplete r4 = (kotlinx.coroutines.Incomplete) r4
            kotlinx.coroutines.NodeList r4 = r4.getList()
            if (r4 == 0) goto L2f
            r7.mo10219remove()
        L2f:
            return
        L30:
            return
    }

    public final <T, R> void selectAwaitCompletion$kotlinx_coroutines_core(kotlinx.coroutines.selects.SelectInstance<? super R> r9, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r10) {
            r8 = this;
            java.lang.Object r0 = r8.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L11
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            r9.resumeSelectWithException(r1)
            goto L20
        L11:
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            kotlin.coroutines.Continuation r4 = r9.getCompletion()
            r6 = 4
            r7 = 0
            r5 = 0
            r2 = r10
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r2, r3, r4, r5, r6, r7)
        L20:
            return
    }

    public final void setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.ChildHandle r1) {
            r0 = this;
            r0._parentHandle = r1
            return
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
            r5 = this;
            r0 = r5
            r1 = 0
        L2:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core()
            r3 = 0
            int r4 = r5.startInternal(r2)
            switch(r4) {
                case 0: goto L13;
                case 1: goto L11;
                default: goto L10;
            }
        L10:
            goto L2
        L11:
            r4 = 1
            return r4
        L13:
            r4 = 0
            return r4
    }

    protected final java.util.concurrent.CancellationException toCancellationException(java.lang.Throwable r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L8
            r0 = r6
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L20
            r0 = r5
            r1 = 0
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            if (r7 != 0) goto L16
            java.lang.String r3 = access$cancellationExceptionMessage(r0)
            goto L17
        L16:
            r3 = r7
        L17:
            r4 = r0
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            r2.<init>(r3, r6, r4)
            r0 = r2
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        L20:
            return r0
    }

    public final java.lang.String toDebugString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString$kotlinx_coroutines_core()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.getState$kotlinx_coroutines_core()
            java.lang.String r1 = r2.stateString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.toDebugString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
