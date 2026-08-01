.class public final Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "ParametersMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nParametersMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParametersMatcher.kt\norg/luckypray/dexkit/query/matchers/ParametersMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1547#2:209\n1618#2,3:210\n1#3:213\n*S KotlinDebug\n*F\n+ 1 ParametersMatcher.kt\norg/luckypray/dexkit/query/matchers/ParametersMatcher\n*L\n201#1:209\n201#1:210,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0008\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\u0008\u00030\u0016J$\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J%\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u0010\u0010\u0014\u001a\u00020\u00002\u0008\u0010!\u001a\u0004\u0018\u00010\u000cJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\u0008\u0008\u0002\u0010\"\u001a\u00020\u00042\u0008\u0008\u0002\u0010#\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0004J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0014J\u0016\u0010+\u001a\u00020\u00002\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0,R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR2\u0010\r\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0018\u00010\u000b2\u0010\u0010\n\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\n\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006."
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;",
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
        "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;",
        "paramsMatcher",
        "getParamsMatcher",
        "()Ljava/util/List;",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "rangeMatcher",
        "getRangeMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "add",
        "clazz",
        "Ljava/lang/Class;",
        "typeName",
        "",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "matcher",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "countMax",
        "countMin",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "params",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;


# instance fields
.field private paramsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method private final add(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 188
    .local v1, "$i$a$-also-ParametersMatcher$add$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 189
    nop

    .line 187
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$add$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 189
    return-object v0
.end method

.method public static synthetic add$default(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 0

    .line 161
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 163
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 161
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 164
    const/4 p3, 0x0

    .line 161
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic count$default(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 0

    .line 109
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final add(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 3
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 178
    .local v1, "$i$a$-also-ParametersMatcher$add$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 179
    nop

    .line 177
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$add$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 179
    return-object v0
.end method

.method public final add(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add$default(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add$default(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 3
    .param p1, "typeName"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 166
    .local v1, "$i$a$-also-ParametersMatcher$add$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 167
    nop

    .line 165
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$add$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 167
    return-object v0
.end method

.method public final add(Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 3
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .line 145
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 146
    .local v1, "$i$a$-also-ParametersMatcher$add$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->paramsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->paramsMatcher:Ljava/util/List;

    .line 147
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->paramsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    nop

    .line 145
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 148
    return-object v0
.end method

.method public final count(I)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 72
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 73
    .local v1, "$i$a$-also-ParametersMatcher$count$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 74
    nop

    .line 72
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$count$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 74
    return-object v0
.end method

.method public final count(II)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 109
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 110
    .local v1, "$i$a$-also-ParametersMatcher$count$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 111
    nop

    .line 109
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$count$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 111
    return-object v0
.end method

.method public final count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 97
    .local v1, "$i$a$-also-ParametersMatcher$count$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(Lkotlin/ranges/IntRange;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 98
    nop

    .line 96
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$count$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 98
    return-object v0
.end method

.method public final count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 2
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 85
    .local v1, "$i$a$-also-ParametersMatcher$count$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 86
    nop

    .line 84
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$count$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 86
    return-object v0
.end method

.method public final countMax(I)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 4
    .param p1, "max"    # I

    .line 133
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 134
    .local v1, "$i$a$-also-ParametersMatcher$countMax$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 135
    nop

    .line 133
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$countMax$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 135
    return-object v0
.end method

.method public final countMin(I)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 4
    .param p1, "min"    # I

    .line 121
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 122
    .local v1, "$i$a$-also-ParametersMatcher$countMin$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const v3, 0x7fffffff

    invoke-direct {v2, p1, v3}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 123
    nop

    .line 121
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$countMin$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 123
    return-object v0
.end method

.method public final synthetic getCount()I
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 46
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getParamsMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->paramsMatcher:Ljava/util/List;

    return-object v0
.end method

.method public final getRangeMatcher()Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 1

    .line 35
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 12
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    sget-object v0, Lorg/luckypray/dexkit/schema/-ParametersMatcher;->Companion:Lorg/luckypray/dexkit/schema/-ParametersMatcher$Companion;

    .line 200
    nop

    .line 201
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->paramsMatcher:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 209
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

    .line 210
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 211
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    .local v9, "it":Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    const/4 v10, 0x0

    .line 201
    .local v10, "$i$a$-map-ParametersMatcher$innerBuild$root$1":I
    if-eqz v9, :cond_0

    move-object v11, v9

    check-cast v11, Lorg/luckypray/dexkit/query/base/BaseQuery;

    goto :goto_1

    :cond_0
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;

    invoke-direct {v11}, Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;-><init>()V

    check-cast v11, Lorg/luckypray/dexkit/query/base/BaseQuery;

    :goto_1
    invoke-static {v11, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v11

    .end local v9    # "it":Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;
    .end local v10    # "$i$a$-map-ParametersMatcher$innerBuild$root$1":I
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 211
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 210
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 212
    :cond_1
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 209
    nop

    .line 201
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v1

    .line 202
    if-eqz v1, :cond_2

    .line 201
    nop

    .line 202
    nop

    .line 213
    nop

    .local v1, "it":[I
    const/4 v3, 0x0

    .line 202
    .local v3, "$i$a$-let-ParametersMatcher$innerBuild$root$2":I
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v1

    .line 201
    .end local v1    # "it":[I
    .end local v3    # "$i$a$-let-ParametersMatcher$innerBuild$root$2":I
    goto :goto_2

    .line 202
    :cond_2
    move v1, v2

    .line 203
    :goto_2
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    if-eqz v3, :cond_3

    check-cast v3, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v3, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    .line 199
    :cond_3
    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-ParametersMatcher$Companion;->createParametersMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;II)I

    move-result v0

    .line 205
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 206
    return v0
.end method

.method public final params(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .locals 3
    .param p1, "params"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    const/4 v1, 0x0

    .line 61
    .local v1, "$i$a$-also-ParametersMatcher$params$1":I
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->paramsMatcher:Ljava/util/List;

    .line 62
    nop

    .line 60
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;
    .end local v1    # "$i$a$-also-ParametersMatcher$params$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 62
    return-object v0
.end method

.method public final synthetic setCount(I)V
    .locals 0
    .param p1, "value"    # I

    .line 49
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;

    .line 50
    return-void
.end method
