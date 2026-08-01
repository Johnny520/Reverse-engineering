.class public final Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "OpCodesMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOpCodesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1547#2:350\n1618#2,3:351\n1547#2:358\n1618#2,3:359\n11328#3:354\n11663#3,3:355\n1#4:362\n*S KotlinDebug\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher\n*L\n137#1:350\n137#1:351,3\n341#1:358\n341#1:359,3\n149#1:354\n149#1:355,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B+\u0008\u0017\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB%\u0008\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0014J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\u0003\u001a\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\"\u00a2\u0006\u0002\u0010#J\u0014\u0010\u0003\u001a\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u0019\u0010$\u001a\u00020\u00002\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\"\u00a2\u0006\u0002\u0010&J\u0014\u0010$\u001a\u00020\u00002\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0005J\u001a\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\'\u001a\u00020\u00052\u0008\u0008\u0002\u0010(\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\tJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u0005R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R4\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\t@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00058G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006."
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "()V",
        "opCodes",
        "",
        "",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
        "opCodeSize",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V",
        "",
        "([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V",
        "<set-?>",
        "getMatchType",
        "()Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
        "setMatchType",
        "(Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)V",
        "getOpCodes",
        "()Ljava/util/Collection;",
        "setOpCodes",
        "(Ljava/util/Collection;)V",
        "rangeMatcher",
        "getRangeMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "value",
        "size",
        "getSize",
        "()I",
        "setSize",
        "(I)V",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "",
        "([Ljava/lang/Integer;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;",
        "opNames",
        "",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "sizeMax",
        "sizeMin",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;


# instance fields
.field private matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

.field private opCodes:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 43
    sget-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 60
    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;)V"
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

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            ")V"
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

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V
    .locals 1
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
            ")V"
        }
    .end annotation

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 43
    sget-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 78
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->opCodes:Ljava/util/Collection;

    .line 79
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 80
    iput-object p3, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 81
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 73
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 75
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 73
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 76
    const/4 p3, 0x0

    .line 73
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V

    .line 81
    return-void
.end method

.method public constructor <init>([I)V
    .locals 7

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;)V
    .locals 7

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

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V
    .locals 1
    .param p1, "opCodes"    # [I
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .param p3, "opCodeSize"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 43
    sget-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 99
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->opCodes:Ljava/util/Collection;

    .line 100
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 101
    iput-object p3, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 102
    return-void
.end method

.method public synthetic constructor <init>([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 94
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 96
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 94
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 97
    const/4 p3, 0x0

    .line 94
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V

    .line 102
    return-void
.end method

.method public static final create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final varargs create([I)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->create([I)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->create([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createForOpNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->createForOpNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final varargs createForOpNames([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->createForOpNames([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createForOpNames([Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->createForOpNames([Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic size$default(Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 0

    .line 209
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->size(II)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .locals 1

    .line 43
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    return-object v0
.end method

.method public final getOpCodes()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->opCodes:Ljava/util/Collection;

    return-object v0
.end method

.method public final getRangeMatcher()Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 1

    .line 45
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object v0
.end method

.method public final synthetic getSize()I
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 54
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 11
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    sget-object v0, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;

    .line 340
    nop

    .line 341
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->opCodes:Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 358
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 359
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 360
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    .local v9, "it":I
    const/4 v10, 0x0

    .line 341
    .local v10, "$i$a$-map-OpCodesMatcher$innerBuild$root$1":I
    int-to-short v9, v9

    .end local v9    # "it":I
    .end local v10    # "$i$a$-map-OpCodesMatcher$innerBuild$root$1":I
    invoke-static {v9}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v9

    .line 360
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 359
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 361
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 358
    nop

    .line 341
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toShortArray(Ljava/util/Collection;)[S

    move-result-object v1

    .line 342
    if-eqz v1, :cond_1

    .line 341
    nop

    .line 342
    nop

    .line 362
    nop

    .local v1, "it":[S
    const/4 v3, 0x0

    .line 342
    .local v3, "$i$a$-let-OpCodesMatcher$innerBuild$root$2":I
    sget-object v4, Lorg/luckypray/dexkit/schema/-OpCodesMatcher;->Companion:Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;

    invoke-virtual {v4, p1, v1}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;->createOpCodesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[S)I

    move-result v1

    .line 341
    .end local v1    # "it":[S
    .end local v3    # "$i$a$-let-OpCodesMatcher$innerBuild$root$2":I
    goto :goto_1

    .line 342
    :cond_1
    move v1, v2

    .line 343
    :goto_1
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->getValue()B

    move-result v3

    .line 344
    iget-object v4, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    if-eqz v4, :cond_2

    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v4, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    .line 339
    :cond_2
    invoke-virtual {v0, p1, v1, v3, v2}, Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;->createOpCodesMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IBI)I

    move-result v0

    .line 346
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 347
    return v0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 2
    .param p1, "matchType"    # Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    const-string v0, "matchType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 161
    .local v1, "$i$a$-also-OpCodesMatcher$matchType$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 162
    nop

    .line 160
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$matchType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 162
    return-object v0
.end method

.method public final opCodes(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 2
    .param p1, "opCodes"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;"
        }
    .end annotation

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 113
    .local v1, "$i$a$-also-OpCodesMatcher$opCodes$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->opCodes:Ljava/util/Collection;

    .line 114
    nop

    .line 112
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$opCodes$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 114
    return-object v0
.end method

.method public final opCodes([Ljava/lang/Integer;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 3
    .param p1, "opCodes"    # [Ljava/lang/Integer;

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 125
    .local v1, "$i$a$-also-OpCodesMatcher$opCodes$2":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->opCodes:Ljava/util/Collection;

    .line 126
    nop

    .line 124
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$opCodes$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 126
    return-object v0
.end method

.method public final opNames(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 11
    .param p1, "opNames"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;"
        }
    .end annotation

    const-string v0, "opNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 137
    .local v1, "$i$a$-also-OpCodesMatcher$opNames$1":I
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 350
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

    .line 351
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 352
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 137
    .local v10, "$i$a$-map-OpCodesMatcher$opNames$1$1":I
    invoke-static {v9}, Lorg/luckypray/dexkit/util/OpCodeUtil;->getOpCode(Ljava/lang/String;)I

    move-result v9

    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-map-OpCodesMatcher$opNames$1$1":I
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 352
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 351
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 353
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 350
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 137
    iput-object v4, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->opCodes:Ljava/util/Collection;

    .line 138
    nop

    .line 136
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$opNames$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 138
    return-object v0
.end method

.method public final opNames([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 12
    .param p1, "opNames"    # [Ljava/lang/String;

    const-string v0, "opNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 149
    .local v1, "$i$a$-also-OpCodesMatcher$opNames$2":I
    move-object v2, p1

    .local v2, "$this$map$iv":[Ljava/lang/Object;
    const/4 v3, 0x0

    .line 354
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v2

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v6, 0x0

    .line 355
    .local v6, "$i$f$mapTo":I
    array-length v7, v5

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    aget-object v9, v5, v8

    .line 356
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 149
    .local v11, "$i$a$-map-OpCodesMatcher$opNames$2$1":I
    invoke-static {v10}, Lorg/luckypray/dexkit/util/OpCodeUtil;->getOpCode(Ljava/lang/String;)I

    move-result v10

    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-map-OpCodesMatcher$opNames$2$1":I
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 356
    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 355
    nop

    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 357
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 354
    nop

    .end local v2    # "$this$map$iv":[Ljava/lang/Object;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 149
    iput-object v4, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->opCodes:Ljava/util/Collection;

    .line 150
    nop

    .line 148
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$opNames$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 150
    return-object v0
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)V
    .locals 1
    .param p1, "<set-?>"    # Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    return-void
.end method

.method public final synthetic setOpCodes(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 37
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->opCodes:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSize(I)V
    .locals 0
    .param p1, "value"    # I

    .line 57
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->size(I)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 58
    return-void
.end method

.method public final size(I)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 3
    .param p1, "size"    # I

    .line 172
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 173
    .local v1, "$i$a$-also-OpCodesMatcher$size$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 174
    nop

    .line 172
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$size$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 174
    return-object v0
.end method

.method public final size(II)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 209
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 210
    .local v1, "$i$a$-also-OpCodesMatcher$size$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 211
    nop

    .line 209
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$size$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 211
    return-object v0
.end method

.method public final size(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 197
    .local v1, "$i$a$-also-OpCodesMatcher$size$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(Lkotlin/ranges/IntRange;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 198
    nop

    .line 196
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$size$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 198
    return-object v0
.end method

.method public final size(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 2
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 185
    .local v1, "$i$a$-also-OpCodesMatcher$size$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 186
    nop

    .line 184
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$size$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 186
    return-object v0
.end method

.method public final sizeMax(I)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 4
    .param p1, "max"    # I

    .line 230
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 231
    .local v1, "$i$a$-also-OpCodesMatcher$sizeMax$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 232
    nop

    .line 230
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$sizeMax$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 232
    return-object v0
.end method

.method public final sizeMin(I)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 4
    .param p1, "min"    # I

    .line 221
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    const/4 v1, 0x0

    .line 222
    .local v1, "$i$a$-also-OpCodesMatcher$sizeMin$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const v3, 0x7fffffff

    invoke-direct {v2, p1, v3}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 223
    nop

    .line 221
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .end local v1    # "$i$a$-also-OpCodesMatcher$sizeMin$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    .line 223
    return-object v0
.end method
