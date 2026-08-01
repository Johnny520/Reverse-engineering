.class public final Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "InterfacesMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInterfacesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterfacesMatcher.kt\norg/luckypray/dexkit/query/matchers/InterfacesMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n1#2:219\n1547#3:220\n1618#3,3:221\n*S KotlinDebug\n*F\n+ 1 InterfacesMatcher.kt\norg/luckypray/dexkit/query/matchers/InterfacesMatcher\n*L\n210#1:220\n210#1:221,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0008\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001fH\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000cJ%\u0010\u001a\u001a\u00020\u00002\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\u0002\u0008$H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\u0008\u0008\u0002\u0010%\u001a\u00020\u00042\u0008\u0008\u0002\u0010&\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0004J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020-H\u0014J\u0014\u0010.\u001a\u00020\u00002\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u000c0/J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR.\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\n\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00061"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "()V",
        "value",
        "",
        "count",
        "getCount",
        "()I",
        "setCount",
        "(I)V",
        "<set-?>",
        "",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "interfacesMatcher",
        "getInterfacesMatcher",
        "()Ljava/util/List;",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "matchType",
        "getMatchType",
        "()Lorg/luckypray/dexkit/query/enums/MatchType;",
        "setMatchType",
        "(Lorg/luckypray/dexkit/query/enums/MatchType;)V",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "rangeMatcher",
        "getRangeMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "add",
        "className",
        "",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "interfaceMatcher",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "countMax",
        "countMin",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "interfaces",
        "",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher$Companion;


# instance fields
.field private interfacesMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 43
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 33
    return-void
.end method

.method private final add(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 197
    .local v1, "$i$a$-also-InterfacesMatcher$add$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 198
    nop

    .line 196
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$add$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 198
    return-object v0
.end method

.method public static synthetic add$default(Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 0

    .line 182
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 184
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 182
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 185
    const/4 p3, 0x0

    .line 182
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic count$default(Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 0

    .line 130
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final add(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->add$default(Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->add$default(Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 5
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 187
    .local v1, "$i$a$-also-InterfacesMatcher$add$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    .line 219
    move-object v3, v2

    .local v3, "$this$add_u24lambda_u2410_u24lambda_u249":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v4, 0x0

    .line 187
    .local v4, "$i$a$-apply-InterfacesMatcher$add$2$1":I
    invoke-virtual {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .end local v3    # "$this$add_u24lambda_u2410_u24lambda_u249":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v4    # "$i$a$-apply-InterfacesMatcher$add$2$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 188
    nop

    .line 186
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$add$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 188
    return-object v0
.end method

.method public final add(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 3
    .param p1, "interfaceMatcher"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "interfaceMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 167
    .local v1, "$i$a$-also-InterfacesMatcher$add$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->interfacesMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->interfacesMatcher:Ljava/util/List;

    .line 168
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->interfacesMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    nop

    .line 166
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 169
    return-object v0
.end method

.method public final count(I)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 93
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 94
    .local v1, "$i$a$-also-InterfacesMatcher$count$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 95
    nop

    .line 93
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$count$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 95
    return-object v0
.end method

.method public final count(II)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 130
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 131
    .local v1, "$i$a$-also-InterfacesMatcher$count$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 132
    nop

    .line 130
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$count$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 132
    return-object v0
.end method

.method public final count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 118
    .local v1, "$i$a$-also-InterfacesMatcher$count$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(Lkotlin/ranges/IntRange;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 119
    nop

    .line 117
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$count$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 119
    return-object v0
.end method

.method public final count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 2
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 106
    .local v1, "$i$a$-also-InterfacesMatcher$count$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 107
    nop

    .line 105
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$count$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 107
    return-object v0
.end method

.method public final countMax(I)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 4
    .param p1, "max"    # I

    .line 154
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 155
    .local v1, "$i$a$-also-InterfacesMatcher$countMax$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 156
    nop

    .line 154
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$countMax$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 156
    return-object v0
.end method

.method public final countMin(I)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 4
    .param p1, "min"    # I

    .line 142
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 143
    .local v1, "$i$a$-also-InterfacesMatcher$countMin$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const v3, 0x7fffffff

    invoke-direct {v2, p1, v3}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 144
    nop

    .line 142
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$countMin$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 144
    return-object v0
.end method

.method public final synthetic getCount()I
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 55
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getInterfacesMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->interfacesMatcher:Ljava/util/List;

    return-object v0
.end method

.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 1

    .line 43
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object v0
.end method

.method public final getRangeMatcher()Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 1

    .line 44
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 12
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    sget-object v0, Lorg/luckypray/dexkit/schema/-InterfacesMatcher;->Companion:Lorg/luckypray/dexkit/schema/-InterfacesMatcher$Companion;

    .line 209
    nop

    .line 210
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->interfacesMatcher:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 220
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

    .line 221
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 222
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v9, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v10, 0x0

    .line 210
    .local v10, "$i$a$-map-InterfacesMatcher$innerBuild$root$1":I
    move-object v11, v9

    check-cast v11, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v11, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v11

    .end local v9    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v10    # "$i$a$-map-InterfacesMatcher$innerBuild$root$1":I
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 222
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 221
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 223
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 220
    nop

    .line 210
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v1

    .line 211
    if-eqz v1, :cond_1

    .line 210
    nop

    .line 211
    nop

    .line 219
    nop

    .local v1, "it":[I
    const/4 v3, 0x0

    .line 211
    .local v3, "$i$a$-let-InterfacesMatcher$innerBuild$root$2":I
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v1

    .line 210
    .end local v1    # "it":[I
    .end local v3    # "$i$a$-let-InterfacesMatcher$innerBuild$root$2":I
    goto :goto_1

    .line 211
    :cond_1
    move v1, v2

    .line 212
    :goto_1
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    move-result v3

    .line 213
    iget-object v4, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    if-eqz v4, :cond_2

    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v4, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    .line 208
    :cond_2
    invoke-virtual {v0, p1, v1, v3, v2}, Lorg/luckypray/dexkit/schema/-InterfacesMatcher$Companion;->createInterfacesMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IBI)I

    move-result v0

    .line 215
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 216
    return v0
.end method

.method public final interfaces(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 3
    .param p1, "interfaces"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;"
        }
    .end annotation

    const-string v0, "interfaces"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 70
    .local v1, "$i$a$-also-InterfacesMatcher$interfaces$1":I
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->interfacesMatcher:Ljava/util/List;

    .line 71
    nop

    .line 69
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$interfaces$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 71
    return-object v0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 2
    .param p1, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    const/4 v1, 0x0

    .line 82
    .local v1, "$i$a$-also-InterfacesMatcher$matchType$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 83
    nop

    .line 81
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .end local v1    # "$i$a$-also-InterfacesMatcher$matchType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 83
    return-object v0
.end method

.method public final synthetic setCount(I)V
    .locals 0
    .param p1, "value"    # I

    .line 58
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 59
    return-void
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .param p1, "<set-?>"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method
