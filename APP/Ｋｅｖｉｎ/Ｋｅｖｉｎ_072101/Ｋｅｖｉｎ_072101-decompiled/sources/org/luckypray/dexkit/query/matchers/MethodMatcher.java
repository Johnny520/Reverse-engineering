package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: MethodMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ¦\u00012\u00020\u00012\u00020\u0002:\u0002¦\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0013\b\u0016\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010f\u001a\u00020\u00002\u0006\u0010g\u001a\u00020hJ%\u0010f\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u0010\u0010m\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u000bH\u0007J\u0010\u0010m\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\u0000H\u0007J%\u0010m\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u000e\u0010p\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u000bJ\u000e\u0010p\u001a\u00020\u00002\u0006\u0010q\u001a\u00020\u0000J%\u0010p\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u000e\u0010r\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u000bJ\u000e\u0010t\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u000bJ\u000e\u0010t\u001a\u00020\u00002\u0006\u0010u\u001a\u00020\u0000J%\u0010t\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u0014\u0010v\u001a\u00020\u00002\f\u0010w\u001a\b\u0012\u0002\b\u0003\u0018\u00010xJ&\u0010v\u001a\u00020\u00002\b\u0010w\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010y\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020|H\u0007J%\u0010v\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u0010\u0010v\u001a\u00020\u00002\b\u0010}\u001a\u0004\u0018\u00010\u0016J\u001c\u0010~\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020\u000b2\n\b\u0002\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0007J\u001e\u0010~\u001a\u00020\u00002\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\n\b\u0002\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0007J\u000f\u0010~\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020VJ%\u0010~\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u0010\u0010\u0084\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020ZJ%\u0010\u0086\u0001\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u000b2\b\b\u0002\u0010y\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020|H\u0007J\u000f\u0010\u0086\u0001\u001a\u00020\u00002\u0006\u0010s\u001a\u000200J\u0010\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020#J\u001d\u0010\u0087\u0001\u001a\u00020\u00002\t\b\u0002\u0010\u0089\u0001\u001a\u00020#2\t\b\u0002\u0010\u008a\u0001\u001a\u00020#J\u0011\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010\u008b\u0001\u001a\u00030\u008d\u0001J\u0010\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008e\u0001\u001a\u00020\u000eJ&\u0010\u008e\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u0012\u0010\u008f\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020\u0012H\u0007J&\u0010\u008f\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u0010\u0010\u0090\u0001\u001a\u00020\u00002\u0007\u0010\u0090\u0001\u001a\u00020\u0012J&\u0010\u0090\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u0013\u0010\u001b\u001a\u00020\u00002\u000b\u0010\u0091\u0001\u001a\u0006\u0012\u0002\b\u00030xJ%\u0010\u001b\u001a\u00020\u00002\u0007\u0010\u0092\u0001\u001a\u00020\u000b2\b\b\u0002\u0010y\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020|H\u0007J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016J%\u0010\u001b\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\u0093\u0001\u001a\u00020#2\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0014J\u0010\u0010\u0096\u0001\u001a\u00020\u00002\u0007\u0010\u0096\u0001\u001a\u00020\u0012J&\u0010\u0096\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u001b\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\t\b\u0002\u0010y\u001a\u00030\u0097\u0001H\u0007J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020)J$\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010y\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020|H\u0007J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u000200J/\u00105\u001a\u00020\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00020#042\t\b\u0002\u0010y\u001a\u00030\u0098\u00012\f\b\u0002\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0007J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020:J/\u0010>\u001a\u00020\u00002\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000b042\t\b\u0002\u0010y\u001a\u00030\u0098\u00012\f\b\u0002\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0007J\u000f\u0010A\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020#J\u001c\u0010A\u001a\u00020\u00002\t\b\u0002\u0010\u0089\u0001\u001a\u00020#2\t\b\u0002\u0010\u008a\u0001\u001a\u00020#J\u0010\u0010A\u001a\u00020\u00002\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001J\u0010\u0010A\u001a\u00020\u00002\b\u0010\u008b\u0001\u001a\u00030\u008d\u0001J\u0006\u0010D\u001a\u00020\u0000J-\u0010D\u001a\u00020\u00002\u001f\u0010D\u001a\u0011\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010x0\u009a\u0001\"\b\u0012\u0002\b\u0003\u0018\u00010x¢\u0006\u0003\u0010\u009b\u0001J%\u0010D\u001a\u00020\u00002\u0017\u0010D\u001a\r\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u009a\u0001\"\u0004\u0018\u00010\u000b¢\u0006\u0003\u0010\u009c\u0001J\u0016\u0010D\u001a\u00020\u00002\u000e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b04J\u0010\u0010\u009d\u0001\u001a\u00020\u00002\u0007\u0010\u009d\u0001\u001a\u00020GJ&\u0010\u009d\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\u000f\u0010K\u001a\u00020\u00002\u0007\u0010\u009e\u0001\u001a\u00020\u000bJ\u0013\u0010P\u001a\u00020\u00002\u000b\u0010\u0091\u0001\u001a\u0006\u0012\u0002\b\u00030xJ%\u0010P\u001a\u00020\u00002\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\b\b\u0002\u0010y\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020|H\u0007J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010}\u001a\u00020\u0016J%\u0010P\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J\"\u0010 \u0001\u001a\u00020\u00002\u0013\u0010a\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u000b0\u009a\u0001\"\u00020\u000b¢\u0006\u0003\u0010\u009c\u0001J\u0015\u0010 \u0001\u001a\u00020\u00002\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000b04J\u0016\u0010¡\u0001\u001a\u00020\u00002\r\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020V04J'\u0010¡\u0001\u001a\u00020\u00002\u0018\u0010i\u001a\u0014\u0012\u0005\u0012\u00030¢\u0001\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J!\u0010[\u001a\u00020\u00002\u0013\u0010[\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020Z0\u009a\u0001\"\u00020Z¢\u0006\u0003\u0010£\u0001J\u0014\u0010[\u001a\u00020\u00002\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z04J\u000f\u0010[\u001a\u00020\u00002\u0007\u0010[\u001a\u00030¤\u0001J&\u0010[\u001a\u00020\u00002\u0018\u0010i\u001a\u0014\u0012\u0005\u0012\u00030¤\u0001\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000J!\u0010a\u001a\u00020\u00002\u0013\u0010a\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u000b0\u009a\u0001\"\u00020\u000b¢\u0006\u0003\u0010\u009c\u0001J*\u0010a\u001a\u00020\u00002\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000b042\b\b\u0002\u0010y\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020|H\u0007J\u000f\u0010a\u001a\u00020\u00002\u0007\u0010a\u001a\u00030¥\u0001J&\u0010a\u001a\u00020\u00002\u0018\u0010i\u001a\u0014\u0012\u0005\u0012\u00030¥\u0001\u0012\u0004\u0012\u00020k0j¢\u0006\u0002\blH\u0087\bø\u0001\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\fR$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001d\"\u0004\b \u0010\fR\"\u0010!\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R$\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020#8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\r\u001a\u0004\u0018\u00010)@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R$\u0010-\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\fR\"\u00101\u001a\u0004\u0018\u0001002\b\u0010\r\u001a\u0004\u0018\u000100@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R0\u00105\u001a\b\u0012\u0004\u0012\u00020#042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020#048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u0004\u0018\u00010:2\b\u0010\r\u001a\u0004\u0018\u00010:@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R0\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000b042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u00107\"\u0004\b@\u00109R$\u0010A\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020#8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010&\"\u0004\bC\u0010(R4\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b042\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u00107\"\u0004\bF\u00109R\"\u0010H\u001a\u0004\u0018\u00010G2\b\u0010\r\u001a\u0004\u0018\u00010G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR$\u0010K\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010\u001d\"\u0004\bM\u0010\fR\"\u0010N\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u001dR$\u0010P\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010\u001d\"\u0004\bR\u0010\fR\"\u0010S\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0019R.\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR0\u0010[\u001a\b\u0012\u0004\u0012\u00020Z042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020Z048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u00107\"\u0004\b]\u00109R.\u0010_\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010U2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010U@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b`\u0010YR0\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000b042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u00107\"\u0004\bc\u00109R.\u0010d\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010U2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010U@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\be\u0010Y\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "()V", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "descriptor", "", "(Ljava/lang/String;)V", "<set-?>", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotationsMatcher", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "callerMethodsMatcher", "getCallerMethodsMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "classMatcher", "getClassMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "value", "declaredClass", "getDeclaredClass", "()Ljava/lang/String;", "setDeclaredClass", "getDescriptor", "setDescriptor", "invokeMethodsMatcher", "getInvokeMethodsMatcher", "", "modifiers", "getModifiers", "()I", "setModifiers", "(I)V", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiersMatcher", "getModifiersMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "name", "getName", "setName", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "nameMatcher", "getNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "", "opCodes", "getOpCodes", "()Ljava/util/Collection;", "setOpCodes", "(Ljava/util/Collection;)V", "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "opCodesMatcher", "getOpCodesMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "opNames", "getOpNames", "setOpNames", "paramCount", "getParamCount", "setParamCount", "paramTypes", "getParamTypes", "setParamTypes", "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "paramsMatcher", "getParamsMatcher", "()Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "protoShorty", "getProtoShorty", "setProtoShorty", "protoShortyMatcher", "getProtoShortyMatcher", "returnType", "getReturnType", "setReturnType", "returnTypeMatcher", "getReturnTypeMatcher", "", "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "usingFieldsMatcher", "getUsingFieldsMatcher", "()Ljava/util/List;", "", "usingNumbers", "getUsingNumbers", "setUsingNumbers", "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "usingNumbersMatcher", "getUsingNumbersMatcher", "usingStrings", "getUsingStrings", "setUsingStrings", "usingStringsMatcher", "getUsingStringsMatcher", "addAnnotation", "annotation", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "addCall", "methodDescriptor", "callMethod", "addCaller", "callerMethod", "addEqString", "usingString", "addInvoke", "invokeMethod", "addParamType", "paramType", "Ljava/lang/Class;", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "type", "addUsingField", "fieldDescriptor", "usingType", "Lorg/luckypray/dexkit/query/enums/UsingType;", "usingField", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "addUsingNumber", "usingNumber", "addUsingString", "annotationCount", "count", "min", "max", "range", "Lkotlin/ranges/IntRange;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "annotations", "callMethods", "callerMethods", "clazz", "className", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "invokeMethods", "Lorg/luckypray/dexkit/query/enums/MatchType;", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "opCodeSize", "", "([Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "params", "shorty", "typeName", "usingEqStrings", "usingFields", "Lorg/luckypray/dexkit/query/UsingFieldMatcherList;", "([Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class MethodMatcher extends org.luckypray.dexkit.query.base.BaseQuery implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher callerMethodsMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher classMatcher;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher invokeMethodsMatcher;
    private org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher modifiersMatcher;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher nameMatcher;
    private org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opCodesMatcher;
    private org.luckypray.dexkit.query.matchers.ParametersMatcher paramsMatcher;
    private java.lang.String protoShortyMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher returnTypeMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> usingFieldsMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> usingNumbersMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> usingStringsMatcher;

    /* JADX INFO: compiled from: MethodMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "constructor", "Ljava/lang/reflect/Constructor;", "method", "Ljava/lang/reflect/Method;", "descriptor", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.MethodMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>()
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.reflect.Constructor<?> r2) {
                r1 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.reflect.Method r2) {
                r1 = this;
                java.lang.String r0 = "method"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.MethodMatcher.Companion = r0
            return
    }

    public MethodMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public MethodMatcher(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.descriptor(r2)
            return
    }

    public MethodMatcher(java.lang.reflect.Constructor<?> r2) {
            r1 = this;
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            r1.descriptor(r0)
            return
    }

    public MethodMatcher(java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            r1.descriptor(r0)
            return
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher addAnnotation(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addAnnotation(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    @kotlin.Deprecated(message = "To avoid ambiguity, please use addCaller", replaceWith = @kotlin.ReplaceWith(expression = "addCaller { init() }", imports = {}))
    private final org.luckypray.dexkit.query.matchers.MethodMatcher addCall(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addCall(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher addCaller(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addCaller(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher addInvoke(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addInvoke(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addParamType(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addParamType$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addParamType(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.UsingFieldMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r2 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addUsingField(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addUsingField(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, org.luckypray.dexkit.query.matchers.FieldMatcher r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addUsingField(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addUsingString(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher annotations(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.annotations(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    @kotlin.Deprecated(message = "To avoid ambiguity, please use callerMethods", replaceWith = @kotlin.ReplaceWith(expression = "callerMethods { init() }", imports = {}))
    private final org.luckypray.dexkit.query.matchers.MethodMatcher callMethods(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.callMethods(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher callerMethods(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.callerMethods(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create() {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.create()
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.create(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.reflect.Constructor<?> r1) {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.create(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.reflect.Method r1) {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.create(r1)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.declaredClass(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.declaredClass(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher invokeMethods(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.invokeMethods(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher modifiers$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher name$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher opCodes$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.opCodes(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher opNames$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.opNames(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher paramCount$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.paramCount(r1, r2)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher params(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ParametersMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.params(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.returnType(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher returnType$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.returnType(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher usingFields(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.UsingFieldMatcherList, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.UsingFieldMatcherList r2 = new org.luckypray.dexkit.query.UsingFieldMatcherList
            r2.<init>()
            r4.invoke(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.usingFields(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.NumberEncodeValueMatcherList, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r2 = new org.luckypray.dexkit.query.NumberEncodeValueMatcherList
            r2.<init>()
            r4.invoke(r2)
            r3.usingNumbers(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.StringMatcherList, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.StringMatcherList r2 = new org.luckypray.dexkit.query.StringMatcherList
            r2.<init>()
            r4.invoke(r2)
            r3.usingStrings(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.usingStrings(r1, r2, r3)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r4) {
            r3 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        L12:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    @kotlin.Deprecated(message = "To avoid ambiguity, please use addCaller", replaceWith = @kotlin.ReplaceWith(expression = "addCaller(methodDescriptor)", imports = {}))
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addCall(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "methodDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.callerMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r4.callerMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.callerMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r3.<init>(r5)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    @kotlin.Deprecated(message = "To avoid ambiguity, please use addCaller", replaceWith = @kotlin.ReplaceWith(expression = "addCaller(callMethod)", imports = {}))
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addCall(org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
            r3 = this;
            java.lang.String r0 = "callMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.callerMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r3.callerMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.callerMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addCaller(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "methodDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.callerMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r4.callerMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.callerMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r3.<init>(r5)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addCaller(org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
            r3 = this;
            java.lang.String r0 = "callerMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.callerMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r3.callerMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.callerMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addEqString(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r6.usingStringsMatcher
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L14:
            r6.usingStringsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r6.usingStringsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r3 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r4 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r5 = 0
            r3.<init>(r7, r4, r5)
            r2.add(r3)
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addInvoke(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "methodDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.invokeMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r4.invokeMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.invokeMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r3.<init>(r5)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addInvoke(org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
            r3 = this;
            java.lang.String r0 = "invokeMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.invokeMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r3.invokeMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.invokeMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(java.lang.Class<?> r7) {
            r6 = this;
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r6.paramsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r2.<init>()
        Ld:
            r6.paramsMatcher = r2
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r6.paramsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            if (r7 == 0) goto L22
            r3 = r7
            r4 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r5 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r5.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r5.type(r7)
            goto L23
        L22:
            r3 = 0
        L23:
            r2.add(r3)
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(java.lang.String r7) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = addParamType$default(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = addParamType$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8, boolean r9) {
            r6 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r6.paramsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r2.<init>()
        L12:
            r6.paramsMatcher = r2
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r6.paramsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            if (r7 == 0) goto L27
            r3 = r7
            r4 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r5 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r5.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r5.type(r7, r8, r9)
            goto L28
        L27:
            r3 = 0
        L28:
            r2.add(r3)
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(org.luckypray.dexkit.query.matchers.ClassMatcher r7) {
            r6 = this;
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r6.paramsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r2.<init>()
        Ld:
            r6.paramsMatcher = r2
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r6.paramsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            if (r7 == 0) goto L22
            r3 = r7
            r4 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r5 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r5.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r5.type(r3)
            goto L23
        L22:
            r3 = 0
        L23:
            r2.add(r3)
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "fieldDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = addUsingField$default(r2, r3, r0, r1, r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(java.lang.String r8, org.luckypray.dexkit.query.enums.UsingType r9) {
            r7 = this;
            java.lang.String r0 = "fieldDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "usingType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2 = r7.usingFieldsMatcher
            if (r2 != 0) goto L19
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L19:
            r7.usingFieldsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2 = r7.usingFieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r3 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r3.<init>()
            r4 = r3
            r5 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r6 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r6.<init>(r8)
            r4.field(r6)
            r4.usingType(r9)
            r2.add(r3)
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(org.luckypray.dexkit.query.matchers.FieldMatcher r3) {
            r2 = this;
            java.lang.String r0 = "usingField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = addUsingField$default(r2, r3, r0, r1, r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(org.luckypray.dexkit.query.matchers.FieldMatcher r7, org.luckypray.dexkit.query.enums.UsingType r8) {
            r6 = this;
            java.lang.String r0 = "usingField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "usingType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2 = r6.usingFieldsMatcher
            if (r2 != 0) goto L19
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L19:
            r6.usingFieldsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2 = r6.usingFieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r3 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r3.<init>()
            r4 = r3
            r5 = 0
            r4.field(r7)
            r4.usingType(r8)
            r2.add(r3)
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r4) {
            r3 = this;
            java.lang.String r0 = "usingField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2 = r3.usingFieldsMatcher
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L14:
            r3.usingFieldsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2 = r3.usingFieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingNumber(java.lang.Number r5) {
            r4 = this;
            java.lang.String r0 = "usingNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r2 = r4.usingNumbersMatcher
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L14:
            r4.usingNumbersMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r2 = r4.usingNumbersMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r3 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r3.<init>()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r3 = r3.value(r5)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(java.lang.String r5, org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r4.usingStringsMatcher
            if (r2 != 0) goto L19
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L19:
            r4.usingStringsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r4.usingStringsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r3 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r3.<init>(r5, r6, r7)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(org.luckypray.dexkit.query.matchers.base.StringMatcher r4) {
            r3 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r3.usingStringsMatcher
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L14:
            r3.usingStringsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r3.usingStringsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        Ld:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        Ld:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4, r5)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        L12:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        L12:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.annotationsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    @kotlin.Deprecated(message = "To avoid ambiguity, please use callerMethods", replaceWith = @kotlin.ReplaceWith(expression = "callerMethods(callMethods)", imports = {}))
    public final org.luckypray.dexkit.query.matchers.MethodMatcher callMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "callMethods"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.callerMethodsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher callerMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "callerMethods"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.callerMethodsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r9)
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r2, r3, r4, r5, r6, r7)
            r8.classMatcher = r2
            r0 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r2.className(r4, r5, r6)
            r3.classMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            java.lang.String r0 = "declaredClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.classMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher descriptor(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r6 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r6
            r7 = 0
            org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
            r0.<init>(r10)
            r8 = r0
            java.lang.String r1 = r8.getName()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r9
            name$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r8.getClassName()
            declaredClass$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r8.getReturnTypeName()
            returnType$default(r0, r1, r2, r3, r4, r5)
            java.util.List r0 = r8.getParamTypeNames()
            java.util.Collection r0 = (java.util.Collection) r0
            r9.paramTypes(r0)
            r0 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getCallerMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.callerMethodsMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getClassMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.classMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDeclaredClass() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDescriptor() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getInvokeMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.invokeMethodsMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ int getModifiers() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher getModifiersMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = r1.modifiersMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getName() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getNameMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.nameMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getOpCodes() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher getOpCodesMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r1.opCodesMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getOpNames() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ int getParamCount() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getParamTypes() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher getParamsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getProtoShorty() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final java.lang.String getProtoShortyMatcher() {
            r1 = this;
            java.lang.String r0 = r1.protoShortyMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getReturnType() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getReturnTypeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.returnTypeMatcher
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> getUsingFieldsMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r0 = r1.usingFieldsMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getUsingNumbers() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> getUsingNumbersMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r0 = r1.usingNumbersMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getUsingStrings() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> getUsingStringsMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.usingStringsMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r25) {
            r24 = this;
            r0 = r24
            r15 = r25
            java.lang.String r1 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r1 = org.luckypray.dexkit.schema.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = r0.nameMatcher
            if (r2 == 0) goto L18
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r4 = r2
            goto L19
        L18:
            r4 = 0
        L19:
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2 = r0.modifiersMatcher
            if (r2 == 0) goto L25
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r5 = r2
            goto L26
        L25:
            r5 = 0
        L26:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.classMatcher
            if (r2 == 0) goto L32
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r6 = r2
            goto L33
        L32:
            r6 = 0
        L33:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.returnTypeMatcher
            if (r2 == 0) goto L3f
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r7 = r2
            goto L40
        L3f:
            r7 = 0
        L40:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r0.paramsMatcher
            if (r2 == 0) goto L4c
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r8 = r2
            goto L4d
        L4c:
            r8 = 0
        L4d:
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r0.annotationsMatcher
            if (r2 == 0) goto L59
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r9 = r2
            goto L5a
        L59:
            r9 = 0
        L5a:
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r2 = r0.opCodesMatcher
            if (r2 == 0) goto L66
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r10 = r2
            goto L67
        L66:
            r10 = 0
        L67:
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r0.usingStringsMatcher
            r11 = 10
            if (r2 == 0) goto Lb9
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r12 = 0
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r11)
            r13.<init>(r14)
            java.util.Collection r13 = (java.util.Collection) r13
            r14 = r2
            r16 = 0
            java.util.Iterator r17 = r14.iterator()
        L82:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto La2
            java.lang.Object r18 = r17.next()
            r19 = r18
            org.luckypray.dexkit.query.matchers.base.StringMatcher r19 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r19
            r20 = 0
            r3 = r19
            org.luckypray.dexkit.query.base.BaseQuery r3 = (org.luckypray.dexkit.query.base.BaseQuery) r3
            int r3 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r3, r15)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13.add(r3)
            goto L82
        La2:
            r3 = r13
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r3)
            if (r2 == 0) goto Lb9
        Lb2:
            r3 = 0
            int r2 = r15.createVectorOfTables(r2)
            r12 = r2
            goto Lba
        Lb9:
            r12 = 0
        Lba:
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2 = r0.usingFieldsMatcher
            if (r2 == 0) goto L10c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r11)
            r13.<init>(r14)
            java.util.Collection r13 = (java.util.Collection) r13
            r14 = r2
            r16 = 0
            java.util.Iterator r17 = r14.iterator()
        Ld3:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto Lf5
            java.lang.Object r18 = r17.next()
            r19 = r18
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r19 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r19
            r20 = 0
            r11 = r19
            org.luckypray.dexkit.query.base.BaseQuery r11 = (org.luckypray.dexkit.query.base.BaseQuery) r11
            int r11 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r11, r15)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.add(r11)
            r11 = 10
            goto Ld3
        Lf5:
            r11 = r13
            java.util.List r11 = (java.util.List) r11
            java.util.Collection r11 = (java.util.Collection) r11
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r11)
            if (r2 == 0) goto L10c
        L105:
            r3 = 0
            int r2 = r15.createVectorOfTables(r2)
            r11 = r2
            goto L10d
        L10c:
            r11 = 0
        L10d:
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r2 = r0.usingNumbersMatcher
            if (r2 == 0) goto L16a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r13 = new java.util.ArrayList
            r16 = r3
            r14 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r14)
            r13.<init>(r3)
            r3 = r13
            java.util.Collection r3 = (java.util.Collection) r3
            r13 = r2
            r14 = 0
            java.util.Iterator r17 = r13.iterator()
        L12a:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L151
            java.lang.Object r18 = r17.next()
            r19 = r18
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r19 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r19
            r20 = 0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r22 = r19.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r22)
            byte r19 = r22.m10392getValuew2LRezQ()
            r20 = r2
            kotlin.UByte r2 = kotlin.UByte.m8681boximpl(r19)
            r3.add(r2)
            r2 = r20
            goto L12a
        L151:
            r20 = r2
            r2 = r3
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            byte[] r2 = kotlin.collections.UCollectionsKt.toUByteArray(r2)
            r3 = 0
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r13 = org.luckypray.dexkit.schema.MethodMatcher.Companion
            int r2 = r13.m10446createUsingNumbersTypeVectorVUfvBY(r15, r2)
            r13 = r2
            goto L16b
        L16a:
            r13 = 0
        L16b:
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r2 = r0.usingNumbersMatcher
            if (r2 == 0) goto L1d4
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r14 = new java.util.ArrayList
            r16 = r3
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r14.<init>(r3)
            r3 = r14
            java.util.Collection r3 = (java.util.Collection) r3
            r14 = r2
            r17 = 0
            java.util.Iterator r18 = r14.iterator()
        L189:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L1b8
            java.lang.Object r19 = r18.next()
            r20 = r19
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r20 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r20
            r21 = 0
            r22 = r2
            org.luckypray.dexkit.query.base.INumberEncodeValue r2 = r20.getValue()
            r23 = r14
            java.lang.String r14 = "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseQuery"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r14)
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r2 = r22
            r14 = r23
            goto L189
        L1b8:
            r22 = r2
            r23 = r14
            r2 = r3
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r2)
            if (r2 == 0) goto L1d4
        L1cb:
            r3 = 0
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r14 = org.luckypray.dexkit.schema.MethodMatcher.Companion
            int r2 = r14.createUsingNumbersVector(r15, r2)
            r14 = r2
            goto L1d5
        L1d4:
            r14 = 0
        L1d5:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r0.invokeMethodsMatcher
            if (r2 == 0) goto L1e2
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r16 = r2
            goto L1e4
        L1e2:
            r16 = 0
        L1e4:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r0.callerMethodsMatcher
            if (r2 == 0) goto L1f1
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r17 = r2
            goto L1f3
        L1f1:
            r17 = 0
        L1f3:
            java.lang.String r2 = r0.protoShortyMatcher
            if (r2 == 0) goto L201
        L1f8:
            r3 = 0
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r15.createString(r0)
            goto L202
        L201:
            r0 = 0
        L202:
            r2 = r25
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r15 = r17
            r16 = r0
            int r0 = r1.createMethodMatcher(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r25
            r1.finish(r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher invokeMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "invokeMethods"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.invokeMethodsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = modifiers$default(r2, r3, r0, r1, r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher modifiers(int r4, org.luckypray.dexkit.query.enums.MatchType r5) {
            r3 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
            r2.<init>(r4, r5)
            r3.modifiersMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher modifiers(org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "modifiers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.modifiersMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = name$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = name$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r4, r5, r6)
            r3.nameMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(org.luckypray.dexkit.query.matchers.base.StringMatcher r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.nameMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(java.util.Collection<java.lang.Integer> r8) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = opCodes$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(java.util.Collection<java.lang.Integer> r8, org.luckypray.dexkit.query.enums.OpCodeMatchType r9) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = opCodes$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(java.util.Collection<java.lang.Integer> r4, org.luckypray.dexkit.query.enums.OpCodeMatchType r5, org.luckypray.dexkit.query.matchers.base.IntRange r6) {
            r3 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r2 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
            r2.<init>(r4, r5, r6)
            r3.opCodesMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r3) {
            r2 = this;
            java.lang.String r0 = "opCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.opCodesMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opNames(java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "opNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = opNames$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opNames(java.util.Collection<java.lang.String> r8, org.luckypray.dexkit.query.enums.OpCodeMatchType r9) {
            r7 = this;
            java.lang.String r0 = "opNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = opNames$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opNames(java.util.Collection<java.lang.String> r4, org.luckypray.dexkit.query.enums.OpCodeMatchType r5, org.luckypray.dexkit.query.matchers.base.IntRange r6) {
            r3 = this;
            java.lang.String r0 = "opNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r2 = r2.createForOpNames(r4, r5, r6)
            r3.opCodesMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(int r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r5.paramsMatcher
            if (r2 != 0) goto L15
            r2 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            r3 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r4 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r4.<init>()
            r5.paramsMatcher = r4
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L15:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r5.paramsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r6)
            r0 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(int r6, int r7) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r5.paramsMatcher
            if (r2 != 0) goto L15
            r2 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            r3 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r4 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r4.<init>()
            r5.paramsMatcher = r4
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L15:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r5.paramsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r6, r7)
            r0 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(kotlin.ranges.IntRange r6) {
            r5 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r5.paramsMatcher
            if (r2 != 0) goto L1a
            r2 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            r3 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r4 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r4.<init>()
            r5.paramsMatcher = r4
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L1a:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r5.paramsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r6)
            r0 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(org.luckypray.dexkit.query.matchers.base.IntRange r6) {
            r5 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r5.paramsMatcher
            if (r2 != 0) goto L1a
            r2 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            r3 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r4 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r4.<init>()
            r5.paramsMatcher = r4
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L1a:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r5.paramsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r6)
            r0 = r5
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes() {
            r6 = this;
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r5 = (java.util.Collection) r5
            r3.params(r5)
            r6.paramsMatcher = r2
            r0 = r6
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes(java.util.Collection<java.lang.String> r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "paramTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            r3 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r4 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r4.<init>()
            r5 = r4
            r6 = 0
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r7 = (java.util.Collection) r7
            r5.params(r7)
            r7 = r1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r8 = 0
            java.util.Iterator r9 = r7.iterator()
        L25:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L51
            java.lang.Object r10 = r9.next()
            r17 = r10
            java.lang.String r17 = (java.lang.String) r17
            r18 = 0
            if (r17 == 0) goto L4a
            r12 = r17
            r19 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r11 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r11.<init>()
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r11 = org.luckypray.dexkit.query.matchers.ParameterMatcher.type$default(r11, r12, r13, r14, r15, r16)
            goto L4b
        L4a:
            r11 = 0
        L4b:
            r5.add(r11)
            goto L25
        L51:
            r0.paramsMatcher = r4
            r2 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes(java.lang.Class<?>... r18) {
            r17 = this;
            r0 = r17
            java.lang.String r1 = "paramTypes"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r3 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r4 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r4.<init>()
            r5 = r4
            r6 = 0
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r7 = (java.util.Collection) r7
            r5.params(r7)
            r7 = r18
            r8 = 0
            int r9 = r7.length
            r10 = 0
        L22:
            if (r10 >= r9) goto L45
            r11 = r7[r10]
            r12 = r11
            r13 = 0
            if (r12 == 0) goto L38
            r14 = r12
            r15 = 0
            r16 = r1
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = r1.type(r14)
            goto L3b
        L38:
            r16 = r1
            r1 = 0
        L3b:
            r5.add(r1)
            int r10 = r10 + 1
            r1 = r16
            goto L22
        L45:
            r16 = r1
            r0.paramsMatcher = r4
            r1 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes(java.lang.String... r22) {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "paramTypes"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r3 = 0
            org.luckypray.dexkit.query.matchers.ParametersMatcher r4 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r4.<init>()
            r5 = r4
            r6 = 0
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r7 = (java.util.Collection) r7
            r5.params(r7)
            r7 = r22
            r8 = 0
            int r9 = r7.length
            r10 = 0
        L22:
            if (r10 >= r9) goto L49
            r11 = r7[r10]
            r18 = r11
            r19 = 0
            if (r18 == 0) goto L40
            r13 = r18
            r20 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r12 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r12.<init>()
            r16 = 6
            r17 = 0
            r14 = 0
            r15 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r12 = org.luckypray.dexkit.query.matchers.ParameterMatcher.type$default(r12, r13, r14, r15, r16, r17)
            goto L41
        L40:
            r12 = 0
        L41:
            r5.add(r12)
            int r10 = r10 + 1
            goto L22
        L49:
            r0.paramsMatcher = r4
            r1 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher params(org.luckypray.dexkit.query.matchers.ParametersMatcher r3) {
            r2 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.paramsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher protoShorty(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "shorty"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.protoShortyMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r9)
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r2, r3, r4, r5, r6, r7)
            r8.returnTypeMatcher = r2
            r0 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = returnType$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = returnType$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r2.className(r4, r5, r6)
            r3.returnTypeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2.returnTypeMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final /* synthetic */ void setDeclaredClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            declaredClass$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ void setDescriptor(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.descriptor(r2)
            return
    }

    public final /* synthetic */ void setModifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            modifiers$default(r2, r3, r0, r1, r0)
            return
    }

    public final /* synthetic */ void setName(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            name$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setOpCodes(java.util.Collection<java.lang.Integer> r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            opCodes$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setOpNames(java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            opNames$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ void setParamCount(int r1) {
            r0 = this;
            r0.paramCount(r1)
            return
    }

    public final /* synthetic */ void setParamTypes(java.util.Collection r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.paramTypes(r2)
            return
    }

    public final /* synthetic */ void setProtoShorty(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.protoShorty(r2)
            return
    }

    public final /* synthetic */ void setReturnType(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            returnType$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setUsingNumbers(java.util.Collection<? extends java.lang.Number> r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.usingNumbers(r2)
            return
    }

    public final /* synthetic */ void setUsingStrings(java.util.Collection r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            usingStrings$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingEqStrings(java.util.Collection<java.lang.String> r15) {
            r14 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = r14
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2 = r15
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L20:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3a
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r11 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r12 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r13 = 0
            r11.<init>(r9, r12, r13)
            r4.add(r11)
            goto L20
        L3a:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r14.usingStringsMatcher = r2
            r0 = r14
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingEqStrings(java.lang.String... r18) {
            r17 = this;
            r0 = r17
            java.lang.String r1 = "usingStrings"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r3 = 0
            r4 = r18
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r4.length
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r4
            r8 = 0
            int r9 = r7.length
            r10 = 0
            r11 = r10
        L1d:
            if (r11 >= r9) goto L35
            r12 = r7[r11]
            r13 = r12
            r14 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r15 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r16 = r1
            org.luckypray.dexkit.query.enums.StringMatchType r1 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r15.<init>(r13, r1, r10)
            r6.add(r15)
            int r11 = r11 + 1
            r1 = r16
            goto L1d
        L35:
            r16 = r1
            r1 = r6
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList(r1)
            r0.usingStringsMatcher = r1
            r1 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingFields(java.util.Collection<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r4) {
            r3 = this;
            java.lang.String r0 = "usingFields"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r3.usingFieldsMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(java.util.Collection<? extends java.lang.Number> r13) {
            r12 = this;
            java.lang.String r0 = "usingNumbers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2 = r13
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L20:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.Number r9 = (java.lang.Number) r9
            r10 = 0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r11 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r11.<init>()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r9 = r11.value(r9)
            r4.add(r9)
            goto L20
        L3b:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r12.usingNumbersMatcher = r2
            r0 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(org.luckypray.dexkit.query.NumberEncodeValueMatcherList r4) {
            r3 = this;
            java.lang.String r0 = "usingNumbers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2 = r4
            java.util.List r2 = (java.util.List) r2
            r3.usingNumbersMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(java.lang.Number... r14) {
            r13 = this;
            java.lang.String r0 = "usingNumbers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = r13
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2 = r14
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r2.length
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            int r7 = r5.length
            r8 = 0
        L17:
            if (r8 >= r7) goto L2d
            r9 = r5[r8]
            r10 = r9
            r11 = 0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r12 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r12.<init>()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r10 = r12.value(r10)
            r4.add(r10)
            int r8 = r8 + 1
            goto L17
        L2d:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r13.usingNumbersMatcher = r2
            r0 = r13
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(java.util.Collection<java.lang.String> r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(java.util.Collection<java.lang.String> r13, org.luckypray.dexkit.query.enums.StringMatchType r14, boolean r15) {
            r12 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2 = r13
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L25:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3c
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r11 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r11.<init>(r9, r14, r15)
            r4.add(r11)
            goto L25
        L3c:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r12.usingStringsMatcher = r2
            r0 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(org.luckypray.dexkit.query.StringMatcherList r4) {
            r3 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r1 = 0
            r2 = r4
            java.util.List r2 = (java.util.List) r2
            r3.usingStringsMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(java.lang.String... r22) {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "usingStrings"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r3 = 0
            r4 = r22
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r4.length
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r4
            r8 = 0
            int r9 = r7.length
            r10 = 0
        L1c:
            if (r10 >= r9) goto L3f
            r17 = r7[r10]
            r12 = r17
            r18 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r15 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r16 = 6
            r19 = 0
            r13 = 0
            r14 = 0
            r11 = r15
            r20 = r15
            r15 = r16
            r16 = r19
            r11.<init>(r12, r13, r14, r15, r16)
            r11 = r20
            r6.add(r11)
            int r10 = r10 + 1
            goto L1c
        L3f:
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List r4 = kotlin.collections.CollectionsKt.toMutableList(r6)
            r0.usingStringsMatcher = r4
            r1 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            return r1
    }
}
