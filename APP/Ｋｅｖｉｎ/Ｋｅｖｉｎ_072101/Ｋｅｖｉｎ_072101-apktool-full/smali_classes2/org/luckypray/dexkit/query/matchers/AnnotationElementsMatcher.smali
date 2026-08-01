.class public final Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "AnnotationElementsMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnnotationElementsMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationElementsMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1547#3:230\n1618#3,3:231\n*S KotlinDebug\n*F\n+ 1 AnnotationElementsMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher\n*L\n220#1:230\n220#1:231,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000cJ%\u0010\u001a\u001a\u00020\u00002\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u0002\u0008#H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\u0008\u0008\u0002\u0010$\u001a\u00020\u00042\u0008\u0008\u0002\u0010%\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\'J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0016J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u001f\u0010*\u001a\u00020\u00002\u0012\u0010*\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u000c0+\"\u00020\u000c\u00a2\u0006\u0002\u0010,J\u0014\u0010*\u001a\u00020\u00002\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u000c0-J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u000200H\u0014J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR.\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\n\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00062"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;",
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
        "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;",
        "elementsMatcher",
        "getElementsMatcher",
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
        "name",
        "",
        "matcher",
        "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "element",
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
        "elements",
        "",
        "([Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;",
        "",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher$Companion;


# instance fields
.field private elementsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 43
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 33
    return-void
.end method

.method private final add(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 207
    .local v1, "$i$a$-also-AnnotationElementsMatcher$add$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 208
    nop

    .line 206
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$add$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 208
    return-object v0
.end method

.method public static synthetic add$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 0

    .line 193
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->add(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic count$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 0

    .line 142
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final add(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->add$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 11
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "matcher"    # Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 194
    .local v1, "$i$a$-also-AnnotationElementsMatcher$add$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;-><init>()V

    move-object v9, v2

    .local v9, "$this$add_u24lambda_u2412_u24lambda_u2411":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v10, 0x0

    .line 195
    .local v10, "$i$a$-apply-AnnotationElementsMatcher$add$2$1":I
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v9

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 196
    if-eqz p2, :cond_0

    move-object v3, p2

    .line 229
    .local v3, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 196
    .local v4, "$i$a$-let-AnnotationElementsMatcher$add$2$1$1":I
    invoke-virtual {v9, v3}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 197
    .end local v3    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-let-AnnotationElementsMatcher$add$2$1$1":I
    :cond_0
    nop

    .line 194
    .end local v9    # "$this$add_u24lambda_u2412_u24lambda_u2411":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v10    # "$i$a$-apply-AnnotationElementsMatcher$add$2$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 198
    nop

    .line 193
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$add$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 198
    return-object v0
.end method

.method public final add(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 3
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 179
    .local v1, "$i$a$-also-AnnotationElementsMatcher$add$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->elementsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->elementsMatcher:Ljava/util/List;

    .line 180
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->elementsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    nop

    .line 178
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 181
    return-object v0
.end method

.method public final count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 105
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 106
    .local v1, "$i$a$-also-AnnotationElementsMatcher$count$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 107
    nop

    .line 105
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$count$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 107
    return-object v0
.end method

.method public final count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 142
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 143
    .local v1, "$i$a$-also-AnnotationElementsMatcher$count$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 144
    nop

    .line 142
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$count$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 144
    return-object v0
.end method

.method public final count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 130
    .local v1, "$i$a$-also-AnnotationElementsMatcher$count$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(Lkotlin/ranges/IntRange;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 131
    nop

    .line 129
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$count$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 131
    return-object v0
.end method

.method public final count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 2
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 118
    .local v1, "$i$a$-also-AnnotationElementsMatcher$count$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 119
    nop

    .line 117
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$count$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 119
    return-object v0
.end method

.method public final countMax(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 4
    .param p1, "max"    # I

    .line 166
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 167
    .local v1, "$i$a$-also-AnnotationElementsMatcher$countMax$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 168
    nop

    .line 166
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$countMax$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 168
    return-object v0
.end method

.method public final countMin(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 4
    .param p1, "min"    # I

    .line 154
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 155
    .local v1, "$i$a$-also-AnnotationElementsMatcher$countMin$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const v3, 0x7fffffff

    invoke-direct {v2, p1, v3}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 156
    nop

    .line 154
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$countMin$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 156
    return-object v0
.end method

.method public final elements(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 3
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 70
    .local v1, "$i$a$-also-AnnotationElementsMatcher$elements$1":I
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->elementsMatcher:Ljava/util/List;

    .line 71
    nop

    .line 69
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$elements$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 71
    return-object v0
.end method

.method public final varargs elements([Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 3
    .param p1, "elements"    # [Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 82
    .local v1, "$i$a$-also-AnnotationElementsMatcher$elements$2":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toMutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->elementsMatcher:Ljava/util/List;

    .line 83
    nop

    .line 81
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$elements$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 83
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

.method public final getElementsMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->elementsMatcher:Ljava/util/List;

    return-object v0
.end method

.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 1

    .line 43
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object v0
.end method

.method public final getRangeMatcher()Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 1

    .line 44
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 12
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    sget-object v0, Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher$Companion;

    .line 219
    nop

    .line 220
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->elementsMatcher:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 230
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

    .line 231
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 232
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v9, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v10, 0x0

    .line 220
    .local v10, "$i$a$-map-AnnotationElementsMatcher$innerBuild$root$1":I
    move-object v11, v9

    check-cast v11, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v11, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v11

    .end local v9    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v10    # "$i$a$-map-AnnotationElementsMatcher$innerBuild$root$1":I
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 232
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 231
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 233
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 230
    nop

    .line 220
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v1

    .line 221
    if-eqz v1, :cond_1

    .line 220
    nop

    .line 221
    nop

    .line 229
    nop

    .local v1, "it":[I
    const/4 v3, 0x0

    .line 221
    .local v3, "$i$a$-let-AnnotationElementsMatcher$innerBuild$root$2":I
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v1

    .line 220
    .end local v1    # "it":[I
    .end local v3    # "$i$a$-let-AnnotationElementsMatcher$innerBuild$root$2":I
    goto :goto_1

    .line 221
    :cond_1
    move v1, v2

    .line 222
    :goto_1
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    move-result v3

    .line 223
    iget-object v4, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    if-eqz v4, :cond_2

    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v4, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    .line 218
    :cond_2
    invoke-virtual {v0, p1, v1, v3, v2}, Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher$Companion;->createAnnotationElementsMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IBI)I

    move-result v0

    .line 225
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 226
    return v0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .locals 2
    .param p1, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    const/4 v1, 0x0

    .line 94
    .local v1, "$i$a$-also-AnnotationElementsMatcher$matchType$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 95
    nop

    .line 93
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementsMatcher$matchType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 95
    return-object v0
.end method

.method public final synthetic setCount(I)V
    .locals 0
    .param p1, "value"    # I

    .line 58
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;

    .line 59
    return-void
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .param p1, "<set-?>"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method
