.class public final Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "MethodMatcher.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMethodMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1388:1\n1849#2:1389\n1850#2:1391\n1547#2:1396\n1618#2,3:1397\n1547#2:1404\n1618#2,3:1405\n1547#2:1412\n1618#2,3:1413\n1547#2:1420\n1618#2,3:1421\n1547#2:1424\n1618#2,3:1425\n1547#2:1428\n1618#2,3:1429\n1547#2:1432\n1618#2,3:1433\n1#3:1390\n13536#4,2:1392\n13536#4,2:1394\n11328#4:1400\n11663#4,3:1401\n11328#4:1408\n11663#4,3:1409\n11328#4:1416\n11663#4,3:1417\n*S KotlinDebug\n*F\n+ 1 MethodMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodMatcher\n*L\n526#1:1389\n526#1:1391\n871#1:1396\n871#1:1397,3\n899#1:1404\n899#1:1405,3\n1060#1:1412\n1060#1:1413,3\n1373#1:1420\n1373#1:1421,3\n1375#1:1424\n1375#1:1425,3\n1377#1:1428\n1377#1:1429,3\n1379#1:1432\n1379#1:1433,3\n559#1:1392,2\n579#1:1394,2\n887#1:1400\n887#1:1401,3\n911#1:1408\n911#1:1409,3\n1075#1:1416\n1075#1:1417,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00fa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0004\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00a6\u00012\u00020\u00012\u00020\u0002:\u0002\u00a6\u0001B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0003B\u000f\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0013\u0008\u0016\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u0008\u00a2\u0006\u0002\u0010\tB\u000f\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u000e\u0010f\u001a\u00020\u00002\u0006\u0010g\u001a\u00020hJ%\u0010f\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u0010\u0010m\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u000bH\u0007J\u0010\u0010m\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\u0000H\u0007J%\u0010m\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010p\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u000bJ\u000e\u0010p\u001a\u00020\u00002\u0006\u0010q\u001a\u00020\u0000J%\u0010p\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010r\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u000bJ\u000e\u0010t\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u000bJ\u000e\u0010t\u001a\u00020\u00002\u0006\u0010u\u001a\u00020\u0000J%\u0010t\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u0014\u0010v\u001a\u00020\u00002\u000c\u0010w\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010xJ&\u0010v\u001a\u00020\u00002\u0008\u0010w\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010y\u001a\u00020z2\u0008\u0008\u0002\u0010{\u001a\u00020|H\u0007J%\u0010v\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u0010\u0010v\u001a\u00020\u00002\u0008\u0010}\u001a\u0004\u0018\u00010\u0016J\u001c\u0010~\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0007J\u001e\u0010~\u001a\u00020\u00002\u0008\u0010\u0082\u0001\u001a\u00030\u0083\u00012\n\u0008\u0002\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0007J\u000f\u0010~\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020VJ%\u0010~\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u0010\u0010\u0084\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020ZJ%\u0010\u0086\u0001\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u000b2\u0008\u0008\u0002\u0010y\u001a\u00020z2\u0008\u0008\u0002\u0010{\u001a\u00020|H\u0007J\u000f\u0010\u0086\u0001\u001a\u00020\u00002\u0006\u0010s\u001a\u000200J\u0010\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020#J\u001d\u0010\u0087\u0001\u001a\u00020\u00002\t\u0008\u0002\u0010\u0089\u0001\u001a\u00020#2\t\u0008\u0002\u0010\u008a\u0001\u001a\u00020#J\u0011\u0010\u0087\u0001\u001a\u00020\u00002\u0008\u0010\u008b\u0001\u001a\u00030\u008c\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\u00002\u0008\u0010\u008b\u0001\u001a\u00030\u008d\u0001J\u0010\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008e\u0001\u001a\u00020\u000eJ&\u0010\u008e\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u0012\u0010\u008f\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020\u0012H\u0007J&\u0010\u008f\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u0010\u0010\u0090\u0001\u001a\u00020\u00002\u0007\u0010\u0090\u0001\u001a\u00020\u0012J&\u0010\u0090\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u0013\u0010\u001b\u001a\u00020\u00002\u000b\u0010\u0091\u0001\u001a\u0006\u0012\u0002\u0008\u00030xJ%\u0010\u001b\u001a\u00020\u00002\u0007\u0010\u0092\u0001\u001a\u00020\u000b2\u0008\u0008\u0002\u0010y\u001a\u00020z2\u0008\u0008\u0002\u0010{\u001a\u00020|H\u0007J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016J%\u0010\u001b\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\u0093\u0001\u001a\u00020#2\u0008\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0014J\u0010\u0010\u0096\u0001\u001a\u00020\u00002\u0007\u0010\u0096\u0001\u001a\u00020\u0012J&\u0010\u0096\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u001b\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\t\u0008\u0002\u0010y\u001a\u00030\u0097\u0001H\u0007J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020)J$\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000b2\u0008\u0008\u0002\u0010y\u001a\u00020z2\u0008\u0008\u0002\u0010{\u001a\u00020|H\u0007J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u000200J/\u00105\u001a\u00020\u00002\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020#042\t\u0008\u0002\u0010y\u001a\u00030\u0098\u00012\u000c\u0008\u0002\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0007J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020:J/\u0010>\u001a\u00020\u00002\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u000b042\t\u0008\u0002\u0010y\u001a\u00030\u0098\u00012\u000c\u0008\u0002\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0007J\u000f\u0010A\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020#J\u001c\u0010A\u001a\u00020\u00002\t\u0008\u0002\u0010\u0089\u0001\u001a\u00020#2\t\u0008\u0002\u0010\u008a\u0001\u001a\u00020#J\u0010\u0010A\u001a\u00020\u00002\u0008\u0010\u008b\u0001\u001a\u00030\u008c\u0001J\u0010\u0010A\u001a\u00020\u00002\u0008\u0010\u008b\u0001\u001a\u00030\u008d\u0001J\u0006\u0010D\u001a\u00020\u0000J-\u0010D\u001a\u00020\u00002\u001f\u0010D\u001a\u0011\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010x0\u009a\u0001\"\u0008\u0012\u0002\u0008\u0003\u0018\u00010x\u00a2\u0006\u0003\u0010\u009b\u0001J%\u0010D\u001a\u00020\u00002\u0017\u0010D\u001a\r\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u000b0\u009a\u0001\"\u0004\u0018\u00010\u000b\u00a2\u0006\u0003\u0010\u009c\u0001J\u0016\u0010D\u001a\u00020\u00002\u000e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b04J\u0010\u0010\u009d\u0001\u001a\u00020\u00002\u0007\u0010\u009d\u0001\u001a\u00020GJ&\u0010\u009d\u0001\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\u000f\u0010K\u001a\u00020\u00002\u0007\u0010\u009e\u0001\u001a\u00020\u000bJ\u0013\u0010P\u001a\u00020\u00002\u000b\u0010\u0091\u0001\u001a\u0006\u0012\u0002\u0008\u00030xJ%\u0010P\u001a\u00020\u00002\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\u0008\u0008\u0002\u0010y\u001a\u00020z2\u0008\u0008\u0002\u0010{\u001a\u00020|H\u0007J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010}\u001a\u00020\u0016J%\u0010P\u001a\u00020\u00002\u0017\u0010i\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J\"\u0010\u00a0\u0001\u001a\u00020\u00002\u0013\u0010a\u001a\u000b\u0012\u0006\u0008\u0001\u0012\u00020\u000b0\u009a\u0001\"\u00020\u000b\u00a2\u0006\u0003\u0010\u009c\u0001J\u0015\u0010\u00a0\u0001\u001a\u00020\u00002\u000c\u0010a\u001a\u0008\u0012\u0004\u0012\u00020\u000b04J\u0016\u0010\u00a1\u0001\u001a\u00020\u00002\r\u0010\u00a1\u0001\u001a\u0008\u0012\u0004\u0012\u00020V04J\'\u0010\u00a1\u0001\u001a\u00020\u00002\u0018\u0010i\u001a\u0014\u0012\u0005\u0012\u00030\u00a2\u0001\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J!\u0010[\u001a\u00020\u00002\u0013\u0010[\u001a\u000b\u0012\u0006\u0008\u0001\u0012\u00020Z0\u009a\u0001\"\u00020Z\u00a2\u0006\u0003\u0010\u00a3\u0001J\u0014\u0010[\u001a\u00020\u00002\u000c\u0010[\u001a\u0008\u0012\u0004\u0012\u00020Z04J\u000f\u0010[\u001a\u00020\u00002\u0007\u0010[\u001a\u00030\u00a4\u0001J&\u0010[\u001a\u00020\u00002\u0018\u0010i\u001a\u0014\u0012\u0005\u0012\u00030\u00a4\u0001\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000J!\u0010a\u001a\u00020\u00002\u0013\u0010a\u001a\u000b\u0012\u0006\u0008\u0001\u0012\u00020\u000b0\u009a\u0001\"\u00020\u000b\u00a2\u0006\u0003\u0010\u009c\u0001J*\u0010a\u001a\u00020\u00002\u000c\u0010a\u001a\u0008\u0012\u0004\u0012\u00020\u000b042\u0008\u0008\u0002\u0010y\u001a\u00020z2\u0008\u0008\u0002\u0010{\u001a\u00020|H\u0007J\u000f\u0010a\u001a\u00020\u00002\u0007\u0010a\u001a\u00030\u00a5\u0001J&\u0010a\u001a\u00020\u00002\u0018\u0010i\u001a\u0014\u0012\u0005\u0012\u00030\u00a5\u0001\u0012\u0004\u0012\u00020k0j\u00a2\u0006\u0002\u0008lH\u0087\u0008\u00f8\u0001\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\r\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\r\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R$\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u000cR$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001f\u0010\u001d\"\u0004\u0008 \u0010\u000cR\"\u0010!\u001a\u0004\u0018\u00010\u00122\u0008\u0010\r\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0015R$\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020#8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\"\u0010*\u001a\u0004\u0018\u00010)2\u0008\u0010\r\u001a\u0004\u0018\u00010)@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R$\u0010-\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008.\u0010\u001d\"\u0004\u0008/\u0010\u000cR\"\u00101\u001a\u0004\u0018\u0001002\u0008\u0010\r\u001a\u0004\u0018\u000100@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R0\u00105\u001a\u0008\u0012\u0004\u0012\u00020#042\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020#048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R\"\u0010;\u001a\u0004\u0018\u00010:2\u0008\u0010\r\u001a\u0004\u0018\u00010:@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010=R0\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u000b042\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000b048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008?\u00107\"\u0004\u0008@\u00109R$\u0010A\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020#8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008B\u0010&\"\u0004\u0008C\u0010(R4\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b042\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008E\u00107\"\u0004\u0008F\u00109R\"\u0010H\u001a\u0004\u0018\u00010G2\u0008\u0010\r\u001a\u0004\u0018\u00010G@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010JR$\u0010K\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008L\u0010\u001d\"\u0004\u0008M\u0010\u000cR\"\u0010N\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010\u001dR$\u0010P\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Q\u0010\u001d\"\u0004\u0008R\u0010\u000cR\"\u0010S\u001a\u0004\u0018\u00010\u00162\u0008\u0010\r\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010\u0019R.\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010YR0\u0010[\u001a\u0008\u0012\u0004\u0012\u00020Z042\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020Z048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\\\u00107\"\u0004\u0008]\u00109R.\u0010_\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010U2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010U@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u0010YR0\u0010a\u001a\u0008\u0012\u0004\u0012\u00020\u000b042\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000b048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008b\u00107\"\u0004\u0008c\u00109R.\u0010d\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010U2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010U@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008e\u0010Y\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u00a7\u0001"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "()V",
        "method",
        "Ljava/lang/reflect/Method;",
        "(Ljava/lang/reflect/Method;)V",
        "constructor",
        "Ljava/lang/reflect/Constructor;",
        "(Ljava/lang/reflect/Constructor;)V",
        "descriptor",
        "",
        "(Ljava/lang/String;)V",
        "<set-?>",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
        "annotationsMatcher",
        "getAnnotationsMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
        "callerMethodsMatcher",
        "getCallerMethodsMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "classMatcher",
        "getClassMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "value",
        "declaredClass",
        "getDeclaredClass",
        "()Ljava/lang/String;",
        "setDeclaredClass",
        "getDescriptor",
        "setDescriptor",
        "invokeMethodsMatcher",
        "getInvokeMethodsMatcher",
        "",
        "modifiers",
        "getModifiers",
        "()I",
        "setModifiers",
        "(I)V",
        "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;",
        "modifiersMatcher",
        "getModifiersMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;",
        "name",
        "getName",
        "setName",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "nameMatcher",
        "getNameMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "",
        "opCodes",
        "getOpCodes",
        "()Ljava/util/Collection;",
        "setOpCodes",
        "(Ljava/util/Collection;)V",
        "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;",
        "opCodesMatcher",
        "getOpCodesMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;",
        "opNames",
        "getOpNames",
        "setOpNames",
        "paramCount",
        "getParamCount",
        "setParamCount",
        "paramTypes",
        "getParamTypes",
        "setParamTypes",
        "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;",
        "paramsMatcher",
        "getParamsMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;",
        "protoShorty",
        "getProtoShorty",
        "setProtoShorty",
        "protoShortyMatcher",
        "getProtoShortyMatcher",
        "returnType",
        "getReturnType",
        "setReturnType",
        "returnTypeMatcher",
        "getReturnTypeMatcher",
        "",
        "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        "usingFieldsMatcher",
        "getUsingFieldsMatcher",
        "()Ljava/util/List;",
        "",
        "usingNumbers",
        "getUsingNumbers",
        "setUsingNumbers",
        "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
        "usingNumbersMatcher",
        "getUsingNumbersMatcher",
        "usingStrings",
        "getUsingStrings",
        "setUsingStrings",
        "usingStringsMatcher",
        "getUsingStringsMatcher",
        "addAnnotation",
        "annotation",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "addCall",
        "methodDescriptor",
        "callMethod",
        "addCaller",
        "callerMethod",
        "addEqString",
        "usingString",
        "addInvoke",
        "invokeMethod",
        "addParamType",
        "paramType",
        "Ljava/lang/Class;",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "type",
        "addUsingField",
        "fieldDescriptor",
        "usingType",
        "Lorg/luckypray/dexkit/query/enums/UsingType;",
        "usingField",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "addUsingNumber",
        "usingNumber",
        "addUsingString",
        "annotationCount",
        "count",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "annotations",
        "callMethods",
        "callerMethods",
        "clazz",
        "className",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "invokeMethods",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
        "opCodeSize",
        "",
        "([Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "params",
        "shorty",
        "typeName",
        "usingEqStrings",
        "usingFields",
        "Lorg/luckypray/dexkit/query/UsingFieldMatcherList;",
        "([Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;",
        "Lorg/luckypray/dexkit/query/StringMatcherList;",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;


# instance fields
.field private annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

.field private callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

.field private classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

.field private modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

.field private nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

.field private opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

.field private paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

.field private protoShortyMatcher:Ljava/lang/String;

.field private returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private usingFieldsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private usingNumbersMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private usingStringsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 75
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 86
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 87
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 1
    .param p1, "constructor"    # Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 82
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 83
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 1
    .param p1, "method"    # Ljava/lang/reflect/Method;

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 78
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 79
    return-void
.end method

.method private final addAnnotation(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1251
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1252
    .local v1, "$i$a$-also-MethodMatcher$addAnnotation$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1253
    nop

    .line 1251
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addAnnotation$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1253
    return-object v0
.end method

.method private final addCall(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "To avoid ambiguity, please use addCaller"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "addCaller { init() }"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1323
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1324
    .local v1, "$i$a$-also-MethodMatcher$addCall$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addCall(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1325
    nop

    .line 1323
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addCall$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1325
    return-object v0
.end method

.method private final addCaller(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1339
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1340
    .local v1, "$i$a$-also-MethodMatcher$addCaller$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addCaller(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1341
    nop

    .line 1339
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addCaller$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1341
    return-object v0
.end method

.method private final addInvoke(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1299
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1300
    .local v1, "$i$a$-also-MethodMatcher$addInvoke$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addInvoke(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1301
    nop

    .line 1299
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addInvoke$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1301
    return-object v0
.end method

.method private final addParamType(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1235
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1236
    .local v1, "$i$a$-also-MethodMatcher$addParamType$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addParamType(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1237
    nop

    .line 1235
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addParamType$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1237
    return-object v0
.end method

.method public static synthetic addParamType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 599
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 601
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 599
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 602
    const/4 p3, 0x0

    .line 599
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addParamType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final addUsingField(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1275
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1276
    .local v1, "$i$a$-also-MethodMatcher$addUsingField$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1277
    nop

    .line 1275
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addUsingField$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1277
    return-object v0
.end method

.method public static synthetic addUsingField$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1026
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addUsingField$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1006
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addUsingString$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 942
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 944
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 942
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 945
    const/4 p3, 0x0

    .line 942
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic annotationCount$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 778
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final annotations(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1243
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1244
    .local v1, "$i$a$-also-MethodMatcher$annotations$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1245
    nop

    .line 1243
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$annotations$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1245
    return-object v0
.end method

.method private final callMethods(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "To avoid ambiguity, please use callerMethods"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "callerMethods { init() }"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1311
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1312
    .local v1, "$i$a$-also-MethodMatcher$callMethods$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1313
    nop

    .line 1311
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$callMethods$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1313
    return-object v0
.end method

.method private final callerMethods(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1331
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1332
    .local v1, "$i$a$-also-MethodMatcher$callerMethods$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1333
    nop

    .line 1331
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$callerMethods$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1333
    return-object v0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/reflect/Constructor;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create(Ljava/lang/reflect/Constructor;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/reflect/Method;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create(Ljava/lang/reflect/Method;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method private final declaredClass(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1214
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1215
    .local v1, "$i$a$-also-MethodMatcher$declaredClass$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1216
    nop

    .line 1214
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$declaredClass$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1216
    return-object v0
.end method

.method public static synthetic declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 407
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 409
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 407
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 410
    const/4 p3, 0x0

    .line 407
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final invokeMethods(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1291
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1292
    .local v1, "$i$a$-also-MethodMatcher$invokeMethods$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1293
    nop

    .line 1291
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$invokeMethods$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1293
    return-object v0
.end method

.method public static synthetic modifiers$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 361
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 363
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 361
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 328
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 330
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 328
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 331
    const/4 p3, 0x0

    .line 328
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic opCodes$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 810
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 812
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 810
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 813
    const/4 p3, 0x0

    .line 810
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodes(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic opNames$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 831
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 833
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 831
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 834
    const/4 p3, 0x0

    .line 831
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic paramCount$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 690
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final params(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1230
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1231
    .local v1, "$i$a$-also-MethodMatcher$params$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->params(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1232
    nop

    .line 1230
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$params$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1232
    return-object v0
.end method

.method private final returnType(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1222
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1223
    .local v1, "$i$a$-also-MethodMatcher$returnType$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1224
    nop

    .line 1222
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$returnType$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1224
    return-object v0
.end method

.method public static synthetic returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 490
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 492
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 490
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 493
    const/4 p3, 0x0

    .line 490
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final usingFields(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/UsingFieldMatcherList;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1267
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1268
    .local v1, "$i$a$-also-MethodMatcher$usingFields$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFields(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1269
    nop

    .line 1267
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingFields$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1269
    return-object v0
.end method

.method private final usingNumbers(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1283
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1284
    .local v1, "$i$a$-also-MethodMatcher$usingNumbers$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbers(Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1285
    nop

    .line 1283
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingNumbers$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1285
    return-object v0
.end method

.method private final usingStrings(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/StringMatcherList;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1259
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1260
    .local v1, "$i$a$-also-MethodMatcher$usingStrings$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/StringMatcherList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/StringMatcherList;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1261
    nop

    .line 1259
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingStrings$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1261
    return-object v0
.end method

.method public static synthetic usingStrings$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 866
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 868
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 866
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 869
    const/4 p3, 0x0

    .line 866
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "annotation"    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 719
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 720
    .local v1, "$i$a$-also-MethodMatcher$addAnnotation$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 721
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 722
    nop

    .line 719
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addAnnotation$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 722
    return-object v0
.end method

.method public final addCall(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 4
    .param p1, "methodDescriptor"    # Ljava/lang/String;
    .annotation runtime Lkotlin/Deprecated;
        message = "To avoid ambiguity, please use addCaller"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "addCaller(methodDescriptor)"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "methodDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1159
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1160
    .local v1, "$i$a$-also-MethodMatcher$addCall$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1161
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v3, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1162
    nop

    .line 1159
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addCall$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1162
    return-object v0
.end method

.method public final addCall(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "callMethod"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .annotation runtime Lkotlin/Deprecated;
        message = "To avoid ambiguity, please use addCaller"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "addCaller(callMethod)"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "callMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1150
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1151
    .local v1, "$i$a$-also-MethodMatcher$addCall$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1152
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1153
    nop

    .line 1150
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addCall$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1153
    return-object v0
.end method

.method public final addCaller(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 4
    .param p1, "methodDescriptor"    # Ljava/lang/String;

    const-string v0, "methodDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1203
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1204
    .local v1, "$i$a$-also-MethodMatcher$addCaller$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1205
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v3, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1206
    nop

    .line 1203
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addCaller$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1206
    return-object v0
.end method

.method public final addCaller(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "callerMethod"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "callerMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1188
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1189
    .local v1, "$i$a$-also-MethodMatcher$addCaller$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1190
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1191
    nop

    .line 1188
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addCaller$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1191
    return-object v0
.end method

.method public final addEqString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .param p1, "usingString"    # Ljava/lang/String;

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 959
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 960
    .local v1, "$i$a$-also-MethodMatcher$addEqString$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 961
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    sget-object v4, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const/4 v5, 0x0

    invoke-direct {v3, p1, v4, v5}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 962
    nop

    .line 959
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addEqString$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 962
    return-object v0
.end method

.method public final addInvoke(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 4
    .param p1, "methodDescriptor"    # Ljava/lang/String;

    const-string v0, "methodDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1133
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1134
    .local v1, "$i$a$-also-MethodMatcher$addInvoke$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1135
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v3, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1136
    nop

    .line 1133
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addInvoke$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1136
    return-object v0
.end method

.method public final addInvoke(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "invokeMethod"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "invokeMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1118
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1119
    .local v1, "$i$a$-also-MethodMatcher$addInvoke$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1120
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1121
    nop

    .line 1118
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addInvoke$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1121
    return-object v0
.end method

.method public final addParamType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .param p1, "paramType"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    .line 618
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 619
    .local v1, "$i$a$-also-MethodMatcher$addParamType$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 620
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    .line 1390
    move-object v3, p1

    .local v3, "it":Ljava/lang/Class;
    const/4 v4, 0x0

    .line 620
    .local v4, "$i$a$-let-MethodMatcher$addParamType$2$1":I
    new-instance v5, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v5}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-virtual {v5, p1}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v3

    .end local v3    # "it":Ljava/lang/Class;
    .end local v4    # "$i$a$-let-MethodMatcher$addParamType$2$1":I
    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 621
    nop

    .line 618
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addParamType$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 621
    return-object v0
.end method

.method public final addParamType(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addParamType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addParamType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addParamType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addParamType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .param p1, "paramType"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 603
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 604
    .local v1, "$i$a$-also-MethodMatcher$addParamType$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 605
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    .line 1390
    move-object v3, p1

    .local v3, "it":Ljava/lang/String;
    const/4 v4, 0x0

    .line 605
    .local v4, "$i$a$-let-MethodMatcher$addParamType$1$1":I
    new-instance v5, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v5}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-virtual {v5, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v3

    .end local v3    # "it":Ljava/lang/String;
    .end local v4    # "$i$a$-let-MethodMatcher$addParamType$1$1":I
    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 606
    nop

    .line 603
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addParamType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 606
    return-object v0
.end method

.method public final addParamType(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .param p1, "type"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 631
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 632
    .local v1, "$i$a$-also-MethodMatcher$addParamType$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 633
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    .line 1390
    move-object v3, p1

    .local v3, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v4, 0x0

    .line 633
    .local v4, "$i$a$-let-MethodMatcher$addParamType$3$1":I
    new-instance v5, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v5}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-virtual {v5, v3}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v3

    .end local v3    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v4    # "$i$a$-let-MethodMatcher$addParamType$3$1":I
    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 634
    nop

    .line 631
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addParamType$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 634
    return-object v0
.end method

.method public final addUsingField(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    const-string v0, "fieldDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addUsingField(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7
    .param p1, "fieldDescriptor"    # Ljava/lang/String;
    .param p2, "usingType"    # Lorg/luckypray/dexkit/query/enums/UsingType;

    const-string v0, "fieldDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1026
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1027
    .local v1, "$i$a$-also-MethodMatcher$addUsingField$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 1028
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>()V

    move-object v4, v3

    .local v4, "$this$addUsingField_u24lambda_u2467_u24lambda_u2466":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v5, 0x0

    .line 1029
    .local v5, "$i$a$-apply-MethodMatcher$addUsingField$3$1":I
    new-instance v6, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v6, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 1030
    invoke-virtual {v4, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 1031
    nop

    .line 1028
    .end local v4    # "$this$addUsingField_u24lambda_u2467_u24lambda_u2466":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v5    # "$i$a$-apply-MethodMatcher$addUsingField$3$1":I
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1032
    nop

    .line 1026
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addUsingField$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1032
    return-object v0
.end method

.method public final addUsingField(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    const-string v0, "usingField"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingField$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addUsingField(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6
    .param p1, "usingField"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .param p2, "usingType"    # Lorg/luckypray/dexkit/query/enums/UsingType;

    const-string v0, "usingField"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1006
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1007
    .local v1, "$i$a$-also-MethodMatcher$addUsingField$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 1008
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>()V

    move-object v4, v3

    .local v4, "$this$addUsingField_u24lambda_u2465_u24lambda_u2464":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/4 v5, 0x0

    .line 1009
    .local v5, "$i$a$-apply-MethodMatcher$addUsingField$2$1":I
    invoke-virtual {v4, p1}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->field(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 1010
    invoke-virtual {v4, p2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;->usingType(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 1011
    nop

    .line 1008
    .end local v4    # "$this$addUsingField_u24lambda_u2465_u24lambda_u2464":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v5    # "$i$a$-apply-MethodMatcher$addUsingField$2$1":I
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1012
    nop

    .line 1006
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addUsingField$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1012
    return-object v0
.end method

.method public final addUsingField(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "usingField"    # Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    const-string v0, "usingField"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 989
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 990
    .local v1, "$i$a$-also-MethodMatcher$addUsingField$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 991
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 992
    nop

    .line 989
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addUsingField$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 992
    return-object v0
.end method

.method public final addUsingNumber(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 4
    .param p1, "usingNumber"    # Ljava/lang/Number;

    const-string v0, "usingNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1089
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1090
    .local v1, "$i$a$-also-MethodMatcher$addUsingNumber$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 1091
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1092
    nop

    .line 1089
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addUsingNumber$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1092
    return-object v0
.end method

.method public final addUsingString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingString$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addUsingString$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 4
    .param p1, "usingString"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 946
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 947
    .local v1, "$i$a$-also-MethodMatcher$addUsingString$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 948
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 949
    nop

    .line 946
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addUsingString$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 949
    return-object v0
.end method

.method public final addUsingString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "usingString"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 924
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 925
    .local v1, "$i$a$-also-MethodMatcher$addUsingString$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 926
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 927
    nop

    .line 924
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$addUsingString$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 927
    return-object v0
.end method

.method public final annotationCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 732
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 733
    .local v1, "$i$a$-also-MethodMatcher$annotationCount$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 734
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 735
    nop

    .line 732
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$annotationCount$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 735
    return-object v0
.end method

.method public final annotationCount(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 778
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 779
    .local v1, "$i$a$-also-MethodMatcher$annotationCount$4":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 780
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 781
    nop

    .line 778
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$annotationCount$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 781
    return-object v0
.end method

.method public final annotationCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 762
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 763
    .local v1, "$i$a$-also-MethodMatcher$annotationCount$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 764
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 765
    nop

    .line 762
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$annotationCount$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 765
    return-object v0
.end method

.method public final annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 747
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 748
    .local v1, "$i$a$-also-MethodMatcher$annotationCount$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 749
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 750
    nop

    .line 747
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$annotationCount$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 750
    return-object v0
.end method

.method public final annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "annotations"    # Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 705
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 706
    .local v1, "$i$a$-also-MethodMatcher$annotations$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 707
    nop

    .line 705
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$annotations$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 707
    return-object v0
.end method

.method public final callMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "callMethods"    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .annotation runtime Lkotlin/Deprecated;
        message = "To avoid ambiguity, please use callerMethods"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "callerMethods(callMethods)"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "callMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1142
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1143
    .local v1, "$i$a$-also-MethodMatcher$callMethods$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1144
    nop

    .line 1142
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$callMethods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1144
    return-object v0
.end method

.method public final callerMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "callerMethods"    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    const-string v0, "callerMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1174
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1175
    .local v1, "$i$a$-also-MethodMatcher$callerMethods$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1176
    nop

    .line 1174
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$callerMethods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1176
    return-object v0
.end method

.method public final declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 8
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 392
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 393
    .local v1, "$i$a$-also-MethodMatcher$declaredClass$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 394
    nop

    .line 392
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$declaredClass$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 394
    return-object v0
.end method

.method public final declaredClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 412
    .local v1, "$i$a$-also-MethodMatcher$declaredClass$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 413
    nop

    .line 411
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$declaredClass$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 413
    return-object v0
.end method

.method public final declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "declaredClass"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "declaredClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 378
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 379
    .local v1, "$i$a$-also-MethodMatcher$declaredClass$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 380
    nop

    .line 378
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$declaredClass$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 380
    return-object v0
.end method

.method public final descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 9
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    move-object v6, p0

    check-cast v6, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v6, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v7, 0x0

    .line 294
    .local v7, "$i$a$-also-MethodMatcher$descriptor$1":I
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    .line 295
    .local v8, "dexMethod":Lorg/luckypray/dexkit/wrap/DexMethod;
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 296
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexMethod;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 297
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexMethod;->getReturnTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 298
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexMethod;->getParamTypeNames()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 299
    nop

    .line 293
    .end local v6    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v7    # "$i$a$-also-MethodMatcher$descriptor$1":I
    .end local v8    # "dexMethod":Lorg/luckypray/dexkit/wrap/DexMethod;
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 299
    return-object v0
.end method

.method public final getAnnotationsMatcher()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1

    .line 60
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object v0
.end method

.method public final getCallerMethodsMatcher()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 72
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object v0
.end method

.method public final getClassMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1

    .line 52
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object v0
.end method

.method public final synthetic getDeclaredClass()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 148
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final synthetic getDescriptor()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 99
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getInvokeMethodsMatcher()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 70
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object v0
.end method

.method public final synthetic getModifiers()I
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 132
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getModifiersMatcher()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 1

    .line 50
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    return-object v0
.end method

.method public final synthetic getName()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 113
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getNameMatcher()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1

    .line 48
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object v0
.end method

.method public final synthetic getOpCodes()Ljava/util/Collection;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 231
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getOpCodesMatcher()Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 1

    .line 62
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    return-object v0
.end method

.method public final synthetic getOpNames()Ljava/util/Collection;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 246
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final synthetic getParamCount()I
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 215
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final synthetic getParamTypes()Ljava/util/Collection;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 201
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getParamsMatcher()Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 1

    .line 58
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    return-object v0
.end method

.method public final synthetic getProtoShorty()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 168
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getProtoShortyMatcher()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->protoShortyMatcher:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic getReturnType()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 184
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getReturnTypeMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1

    .line 56
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object v0
.end method

.method public final getUsingFieldsMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    return-object v0
.end method

.method public final synthetic getUsingNumbers()Ljava/util/Collection;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 262
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getUsingNumbersMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
            ">;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    return-object v0
.end method

.method public final synthetic getUsingStrings()Ljava/util/Collection;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 277
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getUsingStringsMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 24
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    const-string v1, "fbb"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1364
    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    .line 1365
    nop

    .line 1366
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-eqz v2, :cond_0

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v4, v2

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1367
    :goto_0
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    if-eqz v2, :cond_1

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v5, v2

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 1368
    :goto_1
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    if-eqz v2, :cond_2

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v6, v2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 1369
    :goto_2
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    if-eqz v2, :cond_3

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v7, v2

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    .line 1370
    :goto_3
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-eqz v2, :cond_4

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v8, v2

    goto :goto_4

    :cond_4
    const/4 v8, 0x0

    .line 1371
    :goto_4
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-eqz v2, :cond_5

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v9, v2

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    .line 1372
    :goto_5
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    if-eqz v2, :cond_6

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v10, v2

    goto :goto_6

    :cond_6
    const/4 v10, 0x0

    .line 1373
    :goto_6
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    const/16 v11, 0xa

    if-eqz v2, :cond_8

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 1420
    .local v12, "$i$f$map":I
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v2

    .local v14, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 1421
    .local v16, "$i$f$mapTo":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_7
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_7

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 1422
    .local v18, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v19, v18

    check-cast v19, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .local v19, "it":Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    const/16 v20, 0x0

    .line 1373
    .local v20, "$i$a$-map-MethodMatcher$innerBuild$root$1":I
    move-object/from16 v3, v19

    check-cast v3, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v3, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v3

    .end local v19    # "it":Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .end local v20    # "$i$a$-map-MethodMatcher$innerBuild$root$1":I
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 1422
    invoke-interface {v13, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1421
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_7

    .line 1423
    :cond_7
    nop

    .end local v13    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$mapTo":I
    move-object v3, v13

    check-cast v3, Ljava/util/List;

    .line 1420
    nop

    .line 1373
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$map":I
    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 1374
    if-eqz v2, :cond_8

    .line 1373
    nop

    .line 1374
    nop

    .line 1390
    nop

    .local v2, "it":[I
    const/4 v3, 0x0

    .line 1374
    .local v3, "$i$a$-let-MethodMatcher$innerBuild$root$2":I
    invoke-virtual {v15, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 1373
    .end local v2    # "it":[I
    .end local v3    # "$i$a$-let-MethodMatcher$innerBuild$root$2":I
    move v12, v2

    goto :goto_8

    .line 1374
    :cond_8
    const/4 v12, 0x0

    .line 1375
    :goto_8
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    if-eqz v2, :cond_a

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 1424
    .local v3, "$i$f$map":I
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .restart local v13    # "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v2

    .restart local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 1425
    .restart local v16    # "$i$f$mapTo":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_9
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_9

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 1426
    .restart local v18    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v19, v18

    check-cast v19, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .local v19, "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    const/16 v20, 0x0

    .line 1375
    .local v20, "$i$a$-map-MethodMatcher$innerBuild$root$3":I
    move-object/from16 v11, v19

    check-cast v11, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v11, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v11

    .end local v19    # "it":Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .end local v20    # "$i$a$-map-MethodMatcher$innerBuild$root$3":I
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 1426
    invoke-interface {v13, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1425
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    const/16 v11, 0xa

    goto :goto_9

    .line 1427
    :cond_9
    nop

    .end local v13    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$mapTo":I
    move-object v11, v13

    check-cast v11, Ljava/util/List;

    .line 1424
    nop

    .line 1375
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v11, Ljava/util/Collection;

    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 1376
    if-eqz v2, :cond_a

    .line 1375
    nop

    .line 1376
    nop

    .line 1390
    nop

    .local v2, "it":[I
    const/4 v3, 0x0

    .line 1376
    .local v3, "$i$a$-let-MethodMatcher$innerBuild$root$4":I
    invoke-virtual {v15, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 1375
    .end local v2    # "it":[I
    .end local v3    # "$i$a$-let-MethodMatcher$innerBuild$root$4":I
    move v11, v2

    goto :goto_a

    .line 1376
    :cond_a
    const/4 v11, 0x0

    .line 1377
    :goto_a
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    if-eqz v2, :cond_c

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 1428
    .local v3, "$i$f$map":I
    new-instance v13, Ljava/util/ArrayList;

    move/from16 v16, v3

    const/16 v14, 0xa

    .end local v3    # "$i$f$map":I
    .local v16, "$i$f$map":I
    invoke-static {v2, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v13

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v2

    .local v13, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 1429
    .local v14, "$i$f$mapTo":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_b
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_b

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 1430
    .restart local v18    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v19, v18

    check-cast v19, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .local v19, "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    const/16 v20, 0x0

    .line 1377
    .local v20, "$i$a$-map-MethodMatcher$innerBuild$root$5":I
    invoke-virtual/range {v19 .. v19}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->getType()Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual/range {v22 .. v22}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->getValue-w2LRezQ()B

    move-result v19

    move-object/from16 v20, v2

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v19    # "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .local v20, "$this$map$iv":Ljava/lang/Iterable;
    invoke-static/range {v19 .. v19}, Lkotlin/UByte;->box-impl(B)Lkotlin/UByte;

    move-result-object v2

    .line 1430
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1429
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v20

    goto :goto_b

    .line 1431
    .end local v20    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v2    # "$this$map$iv":Ljava/lang/Iterable;
    :cond_b
    move-object/from16 v20, v2

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v13    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$mapTo":I
    .restart local v20    # "$this$map$iv":Ljava/lang/Iterable;
    move-object v2, v3

    check-cast v2, Ljava/util/List;

    .line 1428
    nop

    .line 1377
    .end local v16    # "$i$f$map":I
    .end local v20    # "$this$map$iv":Ljava/lang/Iterable;
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/UCollectionsKt;->toUByteArray(Ljava/util/Collection;)[B

    move-result-object v2

    .line 1378
    nop

    .line 1377
    nop

    .line 1378
    nop

    .line 1390
    nop

    .local v2, "it":[B
    const/4 v3, 0x0

    .line 1378
    .local v3, "$i$a$-let-MethodMatcher$innerBuild$root$6":I
    sget-object v13, Lorg/luckypray/dexkit/schema/-MethodMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    invoke-virtual {v13, v15, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->createUsingNumbersTypeVector-VU-fvBY(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I

    move-result v2

    .line 1377
    .end local v2    # "it":[B
    .end local v3    # "$i$a$-let-MethodMatcher$innerBuild$root$6":I
    move v13, v2

    goto :goto_c

    .line 1378
    :cond_c
    const/4 v13, 0x0

    .line 1379
    :goto_c
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    if-eqz v2, :cond_e

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 1432
    .local v3, "$i$f$map":I
    new-instance v14, Ljava/util/ArrayList;

    move/from16 v16, v3

    const/16 v3, 0xa

    .end local v3    # "$i$f$map":I
    .restart local v16    # "$i$f$map":I
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v14

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v2

    .local v14, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 1433
    .local v17, "$i$f$mapTo":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_d
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_d

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .line 1434
    .local v19, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v19

    check-cast v20, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .local v20, "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    const/16 v21, 0x0

    .line 1379
    .local v21, "$i$a$-map-MethodMatcher$innerBuild$root$7":I
    move-object/from16 v22, v2

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .local v22, "$this$map$iv":Ljava/lang/Iterable;
    invoke-virtual/range {v20 .. v20}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->getValue()Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    move-result-object v2

    move-object/from16 v23, v14

    .end local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v23, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const-string v14, "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseQuery"

    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    .end local v20    # "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .end local v21    # "$i$a$-map-MethodMatcher$innerBuild$root$7":I
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 1434
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1433
    .end local v19    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v22

    move-object/from16 v14, v23

    goto :goto_d

    .line 1435
    .end local v22    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v23    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_d
    move-object/from16 v22, v2

    move-object/from16 v23, v14

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$mapTo":I
    .restart local v22    # "$this$map$iv":Ljava/lang/Iterable;
    move-object v2, v3

    check-cast v2, Ljava/util/List;

    .line 1432
    nop

    .line 1379
    .end local v16    # "$i$f$map":I
    .end local v22    # "$this$map$iv":Ljava/lang/Iterable;
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 1380
    if-eqz v2, :cond_e

    .line 1379
    nop

    .line 1380
    nop

    .line 1390
    nop

    .local v2, "it":[I
    const/4 v3, 0x0

    .line 1380
    .local v3, "$i$a$-let-MethodMatcher$innerBuild$root$8":I
    sget-object v14, Lorg/luckypray/dexkit/schema/-MethodMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;

    invoke-virtual {v14, v15, v2}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->createUsingNumbersVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v2

    .line 1379
    .end local v2    # "it":[I
    .end local v3    # "$i$a$-let-MethodMatcher$innerBuild$root$8":I
    move v14, v2

    goto :goto_e

    .line 1380
    :cond_e
    const/4 v14, 0x0

    .line 1381
    :goto_e
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-eqz v2, :cond_f

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move/from16 v16, v2

    goto :goto_f

    :cond_f
    const/16 v16, 0x0

    .line 1382
    :goto_f
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->callerMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-eqz v2, :cond_10

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v15}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move/from16 v17, v2

    goto :goto_10

    :cond_10
    const/16 v17, 0x0

    .line 1383
    :goto_10
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->protoShortyMatcher:Ljava/lang/String;

    if-eqz v2, :cond_11

    .line 1390
    nop

    .local v2, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 1383
    .local v3, "$i$a$-let-MethodMatcher$innerBuild$root$9":I
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v15, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v0

    .end local v2    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-let-MethodMatcher$innerBuild$root$9":I
    goto :goto_11

    :cond_11
    const/4 v0, 0x0

    .line 1364
    :goto_11
    move-object/from16 v2, p1

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v12

    move v12, v13

    move v13, v14

    move/from16 v14, v16

    move/from16 v15, v17

    move/from16 v16, v0

    invoke-virtual/range {v1 .. v16}, Lorg/luckypray/dexkit/schema/-MethodMatcher$Companion;->createMethodMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIIIIIIII)I

    move-result v0

    .line 1385
    .local v0, "root":I
    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 1386
    return v0
.end method

.method public final invokeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "invokeMethods"    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    const-string v0, "invokeMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1104
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1105
    .local v1, "$i$a$-also-MethodMatcher$invokeMethods$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->invokeMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 1106
    nop

    .line 1104
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$invokeMethods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1106
    return-object v0
.end method

.method public final modifiers(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "modifiers"    # I
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 365
    .local v1, "$i$a$-also-MethodMatcher$modifiers$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 366
    nop

    .line 364
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$modifiers$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 366
    return-object v0
.end method

.method public final modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "modifiers"    # Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    const-string v0, "modifiers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 347
    .local v1, "$i$a$-also-MethodMatcher$modifiers$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 348
    nop

    .line 346
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$modifiers$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 348
    return-object v0
.end method

.method public final name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 333
    .local v1, "$i$a$-also-MethodMatcher$name$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 334
    nop

    .line 332
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$name$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 334
    return-object v0
.end method

.method public final name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "name"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 312
    .local v1, "$i$a$-also-MethodMatcher$name$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 313
    nop

    .line 311
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$name$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 313
    return-object v0
.end method

.method public final opCodes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodes$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final opCodes(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodes$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final opCodes(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "opCodes"    # Ljava/util/Collection;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .param p3, "opCodeSize"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 814
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 815
    .local v1, "$i$a$-also-MethodMatcher$opCodes$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 816
    nop

    .line 814
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$opCodes$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 816
    return-object v0
.end method

.method public final opCodes(Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "opCodes"    # Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 793
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 794
    .local v1, "$i$a$-also-MethodMatcher$opCodes$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 795
    nop

    .line 793
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$opCodes$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 795
    return-object v0
.end method

.method public final opNames(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "opNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opNames$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final opNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "opNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opNames$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final opNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "opNames"    # Ljava/util/Collection;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .param p3, "opCodeSize"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "opNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 835
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 836
    .local v1, "$i$a$-also-MethodMatcher$opNames$1":I
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->createForOpNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodesMatcher:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 837
    nop

    .line 835
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$opNames$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 837
    return-object v0
.end method

.method public final paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 5
    .param p1, "count"    # I

    .line 644
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 645
    .local v1, "$i$a$-also-MethodMatcher$paramCount$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v2, :cond_0

    move-object v2, p0

    check-cast v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1390
    .local v2, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v3, 0x0

    .line 645
    .local v3, "$i$a$-let-MethodMatcher$paramCount$1$1":I
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    iput-object v4, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .end local v2    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v3    # "$i$a$-let-MethodMatcher$paramCount$1$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 646
    :cond_0
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 647
    nop

    .line 644
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$paramCount$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 647
    return-object v0
.end method

.method public final paramCount(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 5
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 690
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 691
    .local v1, "$i$a$-also-MethodMatcher$paramCount$4":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v2, :cond_0

    move-object v2, p0

    check-cast v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1390
    .local v2, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v3, 0x0

    .line 691
    .local v3, "$i$a$-let-MethodMatcher$paramCount$4$1":I
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    iput-object v4, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .end local v2    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v3    # "$i$a$-let-MethodMatcher$paramCount$4$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 692
    :cond_0
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 693
    nop

    .line 690
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$paramCount$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 693
    return-object v0
.end method

.method public final paramCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 5
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 674
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 675
    .local v1, "$i$a$-also-MethodMatcher$paramCount$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v2, :cond_0

    move-object v2, p0

    check-cast v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1390
    .local v2, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v3, 0x0

    .line 675
    .local v3, "$i$a$-let-MethodMatcher$paramCount$3$1":I
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    iput-object v4, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .end local v2    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v3    # "$i$a$-let-MethodMatcher$paramCount$3$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 676
    :cond_0
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 677
    nop

    .line 674
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$paramCount$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 677
    return-object v0
.end method

.method public final paramCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 5
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 659
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 660
    .local v1, "$i$a$-also-MethodMatcher$paramCount$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    if-nez v2, :cond_0

    move-object v2, p0

    check-cast v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1390
    .local v2, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v3, 0x0

    .line 660
    .local v3, "$i$a$-let-MethodMatcher$paramCount$2$1":I
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    iput-object v4, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .end local v2    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v3    # "$i$a$-let-MethodMatcher$paramCount$2$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 661
    :cond_0
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 662
    nop

    .line 659
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$paramCount$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 662
    return-object v0
.end method

.method public final paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 6

    .line 539
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 540
    .local v1, "$i$a$-also-MethodMatcher$paramTypes$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    move-object v3, v2

    .local v3, "$this$paramTypes_u24lambda_u2418_u24lambda_u2417":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v4, 0x0

    .line 541
    .local v4, "$i$a$-apply-MethodMatcher$paramTypes$2$1":I
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->params(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 542
    nop

    .line 540
    .end local v3    # "$this$paramTypes_u24lambda_u2418_u24lambda_u2417":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v4    # "$i$a$-apply-MethodMatcher$paramTypes$2$1":I
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 543
    nop

    .line 539
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$paramTypes$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 543
    return-object v0
.end method

.method public final paramTypes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 20
    .param p1, "paramTypes"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "paramTypes"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 523
    move-object v2, v0

    check-cast v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v2, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v3, 0x0

    .line 524
    .local v3, "$i$a$-also-MethodMatcher$paramTypes$1":I
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    move-object v5, v4

    .local v5, "$this$paramTypes_u24lambda_u2416_u24lambda_u2415":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v6, 0x0

    .line 525
    .local v6, "$i$a$-apply-MethodMatcher$paramTypes$1$1":I
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v5, v7}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->params(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 526
    move-object v7, v1

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 1389
    .local v8, "$i$f$forEach":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv":Ljava/lang/Object;
    move-object/from16 v17, v10

    check-cast v17, Ljava/lang/String;

    .local v17, "it":Ljava/lang/String;
    const/16 v18, 0x0

    .line 527
    .local v18, "$i$a$-forEach-MethodMatcher$paramTypes$1$1$1":I
    if-eqz v17, :cond_0

    .line 1390
    move-object/from16 v12, v17

    .local v12, "it":Ljava/lang/String;
    const/16 v19, 0x0

    .line 527
    .local v19, "$i$a$-let-MethodMatcher$paramTypes$1$1$1$1":I
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v11}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v11

    .end local v12    # "it":Ljava/lang/String;
    .end local v19    # "$i$a$-let-MethodMatcher$paramTypes$1$1$1$1":I
    goto :goto_1

    :cond_0
    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v5, v11}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 528
    nop

    .line 1389
    .end local v17    # "it":Ljava/lang/String;
    .end local v18    # "$i$a$-forEach-MethodMatcher$paramTypes$1$1$1":I
    nop

    .end local v10    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1391
    :cond_1
    nop

    .line 529
    .end local v7    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEach":I
    nop

    .line 524
    .end local v5    # "$this$paramTypes_u24lambda_u2416_u24lambda_u2415":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v6    # "$i$a$-apply-MethodMatcher$paramTypes$1$1":I
    iput-object v4, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 530
    nop

    .line 523
    .end local v2    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v3    # "$i$a$-also-MethodMatcher$paramTypes$1":I
    move-object v2, v0

    check-cast v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 530
    return-object v2
.end method

.method public final varargs paramTypes([Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 17
    .param p1, "paramTypes"    # [Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "paramTypes"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v1, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v3, 0x0

    .line 577
    .local v3, "$i$a$-also-MethodMatcher$paramTypes$4":I
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    move-object v5, v4

    .local v5, "$this$paramTypes_u24lambda_u2426_u24lambda_u2425":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v6, 0x0

    .line 578
    .local v6, "$i$a$-apply-MethodMatcher$paramTypes$4$1":I
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v5, v7}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->params(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 579
    move-object/from16 v7, p1

    .local v7, "$this$forEach$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1394
    .local v8, "$i$f$forEach":I
    array-length v9, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v11, v7, v10

    .local v11, "element$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it":Ljava/lang/Class;
    const/4 v13, 0x0

    .line 580
    .local v13, "$i$a$-forEach-MethodMatcher$paramTypes$4$1$1":I
    if-eqz v12, :cond_0

    .line 1390
    move-object v14, v12

    .local v14, "it":Ljava/lang/Class;
    const/4 v15, 0x0

    .line 580
    .local v15, "$i$a$-let-MethodMatcher$paramTypes$4$1$1$1":I
    move-object/from16 v16, v1

    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .local v16, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-virtual {v1, v14}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v1

    .end local v14    # "it":Ljava/lang/Class;
    .end local v15    # "$i$a$-let-MethodMatcher$paramTypes$4$1$1$1":I
    goto :goto_1

    .end local v16    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .restart local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    :cond_0
    move-object/from16 v16, v1

    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .restart local v16    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v5, v1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 581
    nop

    .line 1394
    .end local v12    # "it":Ljava/lang/Class;
    .end local v13    # "$i$a$-forEach-MethodMatcher$paramTypes$4$1$1":I
    nop

    .end local v11    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, v16

    goto :goto_0

    .line 1395
    .end local v16    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .restart local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    :cond_1
    move-object/from16 v16, v1

    .line 582
    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v7    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$forEach":I
    .restart local v16    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    nop

    .line 577
    .end local v5    # "$this$paramTypes_u24lambda_u2426_u24lambda_u2425":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v6    # "$i$a$-apply-MethodMatcher$paramTypes$4$1":I
    iput-object v4, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 583
    nop

    .line 576
    .end local v3    # "$i$a$-also-MethodMatcher$paramTypes$4":I
    .end local v16    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 583
    return-object v1
.end method

.method public final varargs paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 21
    .param p1, "paramTypes"    # [Ljava/lang/String;

    move-object/from16 v0, p0

    const-string v1, "paramTypes"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 556
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v1, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v3, 0x0

    .line 557
    .local v3, "$i$a$-also-MethodMatcher$paramTypes$3":I
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;-><init>()V

    move-object v5, v4

    .local v5, "$this$paramTypes_u24lambda_u2422_u24lambda_u2421":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v6, 0x0

    .line 558
    .local v6, "$i$a$-apply-MethodMatcher$paramTypes$3$1":I
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v5, v7}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->params(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 559
    move-object/from16 v7, p1

    .local v7, "$this$forEach$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1392
    .local v8, "$i$f$forEach":I
    array-length v9, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v11, v7, v10

    .local v11, "element$iv":Ljava/lang/Object;
    move-object/from16 v18, v11

    .local v18, "it":Ljava/lang/String;
    const/16 v19, 0x0

    .line 560
    .local v19, "$i$a$-forEach-MethodMatcher$paramTypes$3$1$1":I
    if-eqz v18, :cond_0

    .line 1390
    move-object/from16 v13, v18

    .local v13, "it":Ljava/lang/String;
    const/16 v20, 0x0

    .line 560
    .local v20, "$i$a$-let-MethodMatcher$paramTypes$3$1$1$1":I
    new-instance v12, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v12}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v12

    .end local v13    # "it":Ljava/lang/String;
    .end local v20    # "$i$a$-let-MethodMatcher$paramTypes$3$1$1$1":I
    goto :goto_1

    :cond_0
    const/4 v12, 0x0

    :goto_1
    invoke-virtual {v5, v12}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 561
    nop

    .line 1392
    .end local v18    # "it":Ljava/lang/String;
    .end local v19    # "$i$a$-forEach-MethodMatcher$paramTypes$3$1$1":I
    nop

    .end local v11    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 1393
    :cond_1
    nop

    .line 562
    .end local v7    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$forEach":I
    nop

    .line 557
    .end local v5    # "$this$paramTypes_u24lambda_u2422_u24lambda_u2421":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v6    # "$i$a$-apply-MethodMatcher$paramTypes$3$1":I
    iput-object v4, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 563
    nop

    .line 556
    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v3    # "$i$a$-also-MethodMatcher$paramTypes$3":I
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 563
    return-object v1
.end method

.method public final params(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "params"    # Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 508
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 509
    .local v1, "$i$a$-also-MethodMatcher$params$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramsMatcher:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 510
    nop

    .line 508
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$params$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 510
    return-object v0
.end method

.method public final protoShorty(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "shorty"    # Ljava/lang/String;

    const-string v0, "shorty"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 445
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 446
    .local v1, "$i$a$-also-MethodMatcher$protoShorty$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->protoShortyMatcher:Ljava/lang/String;

    .line 447
    nop

    .line 445
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$protoShorty$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 447
    return-object v0
.end method

.method public final returnType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 8
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 473
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 474
    .local v1, "$i$a$-also-MethodMatcher$returnType$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 475
    nop

    .line 473
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$returnType$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 475
    return-object v0
.end method

.method public final returnType(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final returnType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final returnType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "typeName"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 494
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 495
    .local v1, "$i$a$-also-MethodMatcher$returnType$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 496
    nop

    .line 494
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$returnType$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 496
    return-object v0
.end method

.method public final returnType(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2
    .param p1, "type"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 460
    .local v1, "$i$a$-also-MethodMatcher$returnType$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnTypeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 461
    nop

    .line 459
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$returnType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 461
    return-object v0
.end method

.method public final synthetic setDeclaredClass(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 152
    return-void
.end method

.method public final synthetic setDescriptor(Ljava/lang/String;)V
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 103
    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 2
    .param p1, "value"    # I

    .line 135
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 136
    return-void
.end method

.method public final synthetic setName(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 117
    return-void
.end method

.method public final setOpCodes(Ljava/util/Collection;)V
    .locals 7
    .param p1, "value"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opCodes$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 234
    return-void
.end method

.method public final setOpNames(Ljava/util/Collection;)V
    .locals 7
    .param p1, "value"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->opNames$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 249
    return-void
.end method

.method public final synthetic setParamCount(I)V
    .locals 0
    .param p1, "value"    # I

    .line 218
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 219
    return-void
.end method

.method public final synthetic setParamTypes(Ljava/util/Collection;)V
    .locals 1
    .param p1, "value"    # Ljava/util/Collection;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 205
    return-void
.end method

.method public final synthetic setProtoShorty(Ljava/lang/String;)V
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->protoShorty(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 172
    return-void
.end method

.method public final synthetic setReturnType(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 188
    return-void
.end method

.method public final setUsingNumbers(Ljava/util/Collection;)V
    .locals 1
    .param p1, "value"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Number;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbers(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 265
    return-void
.end method

.method public final synthetic setUsingStrings(Ljava/util/Collection;)V
    .locals 7
    .param p1, "value"    # Ljava/util/Collection;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 281
    return-void
.end method

.method public final usingEqStrings(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 14
    .param p1, "usingStrings"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 898
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 899
    .local v1, "$i$a$-also-MethodMatcher$usingEqStrings$1":I
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 1404
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 1405
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 1406
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 899
    .local v10, "$i$a$-map-MethodMatcher$usingEqStrings$1$1":I
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    sget-object v12, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const/4 v13, 0x0

    invoke-direct {v11, v9, v12, v13}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 1406
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-map-MethodMatcher$usingEqStrings$1$1":I
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1405
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1407
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 1404
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 899
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 900
    nop

    .line 898
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingEqStrings$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 900
    return-object v0
.end method

.method public final varargs usingEqStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 17
    .param p1, "usingStrings"    # [Ljava/lang/String;

    move-object/from16 v0, p0

    const-string v1, "usingStrings"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 910
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v1, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v3, 0x0

    .line 911
    .local v3, "$i$a$-also-MethodMatcher$usingEqStrings$2":I
    move-object/from16 v4, p1

    .local v4, "$this$map$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 1408
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    array-length v7, v4

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1409
    .local v8, "$i$f$mapTo":I
    array-length v9, v7

    const/4 v10, 0x0

    move v11, v10

    :goto_0
    if-ge v11, v9, :cond_0

    aget-object v12, v7, v11

    .line 1410
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 911
    .local v14, "$i$a$-map-MethodMatcher$usingEqStrings$2$1":I
    new-instance v15, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-object/from16 v16, v1

    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .local v16, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    sget-object v1, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-direct {v15, v13, v1, v10}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 1410
    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-MethodMatcher$usingEqStrings$2$1":I
    invoke-interface {v6, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1409
    nop

    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v16

    goto :goto_0

    .line 1411
    .end local v16    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .restart local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    :cond_0
    move-object/from16 v16, v1

    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$mapTo":I
    .restart local v16    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    move-object v1, v6

    check-cast v1, Ljava/util/List;

    .line 1408
    nop

    .end local v4    # "$this$map$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$map":I
    check-cast v1, Ljava/util/Collection;

    .line 911
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 912
    nop

    .line 910
    .end local v3    # "$i$a$-also-MethodMatcher$usingEqStrings$2":I
    .end local v16    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 912
    return-object v1
.end method

.method public final usingFields(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "usingFields"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "usingFields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 974
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 975
    .local v1, "$i$a$-also-MethodMatcher$usingFields$1":I
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingFieldsMatcher:Ljava/util/List;

    .line 976
    nop

    .line 974
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingFields$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 976
    return-object v0
.end method

.method public final usingNumbers(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 12
    .param p1, "usingNumbers"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Number;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "usingNumbers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1059
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1060
    .local v1, "$i$a$-also-MethodMatcher$usingNumbers$2":I
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 1412
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 1413
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 1414
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/Number;

    .local v9, "it":Ljava/lang/Number;
    const/4 v10, 0x0

    .line 1060
    .local v10, "$i$a$-map-MethodMatcher$usingNumbers$2$1":I
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v11}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v11, v9}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v9

    .line 1414
    .end local v9    # "it":Ljava/lang/Number;
    .end local v10    # "$i$a$-map-MethodMatcher$usingNumbers$2$1":I
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1413
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1415
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 1412
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 1060
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 1061
    nop

    .line 1059
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingNumbers$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1061
    return-object v0
.end method

.method public final usingNumbers(Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "usingNumbers"    # Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    const-string v0, "usingNumbers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1044
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1045
    .local v1, "$i$a$-also-MethodMatcher$usingNumbers$1":I
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 1046
    nop

    .line 1044
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingNumbers$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1046
    return-object v0
.end method

.method public final varargs usingNumbers([Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 13
    .param p1, "usingNumbers"    # [Ljava/lang/Number;

    const-string v0, "usingNumbers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1074
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 1075
    .local v1, "$i$a$-also-MethodMatcher$usingNumbers$3":I
    move-object v2, p1

    .local v2, "$this$map$iv":[Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1416
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v2

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1417
    .local v6, "$i$f$mapTo":I
    array-length v7, v5

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    aget-object v9, v5, v8

    .line 1418
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it":Ljava/lang/Number;
    const/4 v11, 0x0

    .line 1075
    .local v11, "$i$a$-map-MethodMatcher$usingNumbers$3$1":I
    new-instance v12, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v12}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v12, v10}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v10

    .line 1418
    .end local v10    # "it":Ljava/lang/Number;
    .end local v11    # "$i$a$-map-MethodMatcher$usingNumbers$3$1":I
    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1417
    nop

    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1419
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 1416
    nop

    .end local v2    # "$this$map$iv":[Ljava/lang/Object;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 1075
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingNumbersMatcher:Ljava/util/List;

    .line 1076
    nop

    .line 1074
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingNumbers$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 1076
    return-object v0
.end method

.method public final usingStrings(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 12
    .param p1, "usingStrings"    # Ljava/util/Collection;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            "Z)",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 870
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 871
    .local v1, "$i$a$-also-MethodMatcher$usingStrings$2":I
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 1396
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 1397
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 1398
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 871
    .local v10, "$i$a$-map-MethodMatcher$usingStrings$2$1":I
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v11, v9, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 1398
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-map-MethodMatcher$usingStrings$2$1":I
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1397
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1399
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 1396
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 871
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 872
    nop

    .line 870
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingStrings$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 872
    return-object v0
.end method

.method public final usingStrings(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 3
    .param p1, "usingStrings"    # Lorg/luckypray/dexkit/query/StringMatcherList;

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 849
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v1, 0x0

    .line 850
    .local v1, "$i$a$-also-MethodMatcher$usingStrings$1":I
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 851
    nop

    .line 849
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v1    # "$i$a$-also-MethodMatcher$usingStrings$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 851
    return-object v0
.end method

.method public final varargs usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 21
    .param p1, "usingStrings"    # [Ljava/lang/String;

    move-object/from16 v0, p0

    const-string v1, "usingStrings"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 886
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .local v1, "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    const/4 v3, 0x0

    .line 887
    .local v3, "$i$a$-also-MethodMatcher$usingStrings$3":I
    move-object/from16 v4, p1

    .local v4, "$this$map$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 1400
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    array-length v7, v4

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1401
    .local v8, "$i$f$mapTo":I
    array-length v9, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_0

    aget-object v17, v7, v10

    .line 1402
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v12, v17

    .local v12, "it":Ljava/lang/String;
    const/16 v18, 0x0

    .line 887
    .local v18, "$i$a$-map-MethodMatcher$usingStrings$3$1":I
    new-instance v15, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const/16 v16, 0x6

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v15

    move-object/from16 v20, v15

    move/from16 v15, v16

    move-object/from16 v16, v19

    invoke-direct/range {v11 .. v16}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1402
    .end local v12    # "it":Ljava/lang/String;
    .end local v18    # "$i$a$-map-MethodMatcher$usingStrings$3$1":I
    move-object/from16 v11, v20

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1401
    nop

    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 1403
    :cond_0
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$mapTo":I
    check-cast v6, Ljava/util/List;

    .line 1400
    nop

    .end local v4    # "$this$map$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$map":I
    check-cast v6, Ljava/util/Collection;

    .line 887
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    iput-object v4, v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 888
    nop

    .line 886
    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .end local v3    # "$i$a$-also-MethodMatcher$usingStrings$3":I
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 888
    return-object v1
.end method
