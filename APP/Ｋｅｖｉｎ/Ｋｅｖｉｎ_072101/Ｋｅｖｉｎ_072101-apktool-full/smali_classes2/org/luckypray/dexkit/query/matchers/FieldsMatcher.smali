.class public final Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "FieldsMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/FieldsMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFieldsMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldsMatcher.kt\norg/luckypray/dexkit/query/matchers/FieldsMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,242:1\n1#2:243\n1547#3:244\n1618#3,3:245\n*S KotlinDebug\n*F\n+ 1 FieldsMatcher.kt\norg/luckypray/dexkit/query/matchers/FieldsMatcher\n*L\n234#1:244\n234#1:245,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000cJ%\u0010\u001a\u001a\u00020\u00002\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\u0002\u0008\u001fH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"J\u0012\u0010#\u001a\u00020\u00002\n\u0010$\u001a\u0006\u0012\u0002\u0008\u00030%J$\u0010#\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\"2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\'2\u0008\u0008\u0002\u0010(\u001a\u00020)H\u0007J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\u0008\u0008\u0002\u0010*\u001a\u00020\u00042\u0008\u0008\u0002\u0010+\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0016J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u0014\u00100\u001a\u00020\u00002\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u000c01J\u0010\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u000204H\u0014J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR.\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\n\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00066"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;",
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
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "fieldsMatcher",
        "getFieldsMatcher",
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
        "matcher",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "addForName",
        "name",
        "",
        "addForType",
        "clazz",
        "Ljava/lang/Class;",
        "typeName",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "countMax",
        "countMin",
        "fields",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher$Companion;


# instance fields
.field private fieldsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 43
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 33
    return-void
.end method

.method private final add(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 221
    .local v1, "$i$a$-also-FieldsMatcher$add$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 222
    nop

    .line 220
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$add$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 222
    return-object v0
.end method

.method public static synthetic addForType$default(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 0

    .line 194
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 196
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 194
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 197
    const/4 p3, 0x0

    .line 194
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->addForType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic count$default(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final add(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 3
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 167
    .local v1, "$i$a$-also-FieldsMatcher$add$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->fieldsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->fieldsMatcher:Ljava/util/List;

    .line 168
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->fieldsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    nop

    .line 166
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 169
    return-object v0
.end method

.method public final addForName(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 10
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 180
    .local v1, "$i$a$-also-FieldsMatcher$addForName$1":I
    new-instance v8, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v8}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 243
    move-object v2, v8

    .local v2, "$this$addForName_u24lambda_u2410_u24lambda_u249":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v9, 0x0

    .line 180
    .local v9, "$i$a$-apply-FieldsMatcher$addForName$1$1":I
    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v2 .. v7}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .end local v2    # "$this$addForName_u24lambda_u2410_u24lambda_u249":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v9    # "$i$a$-apply-FieldsMatcher$addForName$1$1":I
    invoke-virtual {p0, v8}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 181
    nop

    .line 179
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$addForName$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 181
    return-object v0
.end method

.method public final addForType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 5
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 211
    .local v1, "$i$a$-also-FieldsMatcher$addForType$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 243
    move-object v3, v2

    .local v3, "$this$addForType_u24lambda_u2414_u24lambda_u2413":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v4, 0x0

    .line 211
    .local v4, "$i$a$-apply-FieldsMatcher$addForType$2$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .end local v3    # "$this$addForType_u24lambda_u2414_u24lambda_u2413":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v4    # "$i$a$-apply-FieldsMatcher$addForType$2$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 212
    nop

    .line 210
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$addForType$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 212
    return-object v0
.end method

.method public final addForType(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->addForType$default(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addForType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->addForType$default(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addForType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 5
    .param p1, "typeName"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 199
    .local v1, "$i$a$-also-FieldsMatcher$addForType$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 243
    move-object v3, v2

    .local v3, "$this$addForType_u24lambda_u2412_u24lambda_u2411":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v4, 0x0

    .line 199
    .local v4, "$i$a$-apply-FieldsMatcher$addForType$1$1":I
    invoke-virtual {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .end local v3    # "$this$addForType_u24lambda_u2412_u24lambda_u2411":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v4    # "$i$a$-apply-FieldsMatcher$addForType$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 200
    nop

    .line 198
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$addForType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 200
    return-object v0
.end method

.method public final count(I)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 93
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 94
    .local v1, "$i$a$-also-FieldsMatcher$count$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 95
    nop

    .line 93
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$count$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 95
    return-object v0
.end method

.method public final count(II)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 130
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 131
    .local v1, "$i$a$-also-FieldsMatcher$count$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 132
    nop

    .line 130
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$count$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 132
    return-object v0
.end method

.method public final count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 118
    .local v1, "$i$a$-also-FieldsMatcher$count$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(Lkotlin/ranges/IntRange;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 119
    nop

    .line 117
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$count$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 119
    return-object v0
.end method

.method public final count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 2
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 106
    .local v1, "$i$a$-also-FieldsMatcher$count$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 107
    nop

    .line 105
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$count$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 107
    return-object v0
.end method

.method public final countMax(I)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 4
    .param p1, "max"    # I

    .line 154
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 155
    .local v1, "$i$a$-also-FieldsMatcher$countMax$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 156
    nop

    .line 154
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$countMax$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 156
    return-object v0
.end method

.method public final countMin(I)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 4
    .param p1, "min"    # I

    .line 142
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 143
    .local v1, "$i$a$-also-FieldsMatcher$countMin$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const v3, 0x7fffffff

    invoke-direct {v2, p1, v3}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 144
    nop

    .line 142
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$countMin$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 144
    return-object v0
.end method

.method public final fields(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 3
    .param p1, "fields"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;"
        }
    .end annotation

    const-string v0, "fields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 70
    .local v1, "$i$a$-also-FieldsMatcher$fields$1":I
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->fieldsMatcher:Ljava/util/List;

    .line 71
    nop

    .line 69
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$fields$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 71
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

.method public final getFieldsMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->fieldsMatcher:Ljava/util/List;

    return-object v0
.end method

.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 1

    .line 43
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object v0
.end method

.method public final getRangeMatcher()Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 1

    .line 44
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 12
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    sget-object v0, Lorg/luckypray/dexkit/schema/-FieldsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-FieldsMatcher$Companion;

    .line 233
    nop

    .line 234
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->fieldsMatcher:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 244
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

    .line 245
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 246
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v9, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v10, 0x0

    .line 234
    .local v10, "$i$a$-map-FieldsMatcher$innerBuild$root$1":I
    move-object v11, v9

    check-cast v11, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v11, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v11

    .end local v9    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v10    # "$i$a$-map-FieldsMatcher$innerBuild$root$1":I
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 246
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 245
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 247
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 244
    nop

    .line 234
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v1

    .line 235
    if-eqz v1, :cond_1

    .line 234
    nop

    .line 235
    nop

    .line 243
    nop

    .local v1, "it":[I
    const/4 v3, 0x0

    .line 235
    .local v3, "$i$a$-let-FieldsMatcher$innerBuild$root$2":I
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v1

    .line 234
    .end local v1    # "it":[I
    .end local v3    # "$i$a$-let-FieldsMatcher$innerBuild$root$2":I
    goto :goto_1

    .line 235
    :cond_1
    move v1, v2

    .line 236
    :goto_1
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    move-result v3

    .line 237
    iget-object v4, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    if-eqz v4, :cond_2

    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v4, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    .line 232
    :cond_2
    invoke-virtual {v0, p1, v1, v3, v2}, Lorg/luckypray/dexkit/schema/-FieldsMatcher$Companion;->createFieldsMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IBI)I

    move-result v0

    .line 239
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 240
    return v0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 2
    .param p1, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    const/4 v1, 0x0

    .line 82
    .local v1, "$i$a$-also-FieldsMatcher$matchType$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 83
    nop

    .line 81
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .end local v1    # "$i$a$-also-FieldsMatcher$matchType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 83
    return-object v0
.end method

.method public final synthetic setCount(I)V
    .locals 0
    .param p1, "value"    # I

    .line 58
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 59
    return-void
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .param p1, "<set-?>"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method
