.class public final Lorg/luckypray/dexkit/query/FieldMatcherList;
.super Ljava/util/ArrayList;
.source "MatcherCollections.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IQuery;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        ">;",
        "Lorg/luckypray/dexkit/query/base/IQuery;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMatcherCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatcherCollections.kt\norg/luckypray/dexkit/query/FieldMatcherList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n1#2:310\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0005B\u000f\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\u0015\u0008\u0016\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n\u00a2\u0006\u0002\u0010\u000bJ%\u0010\u000c\u001a\u00020\u00002\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0008\u0010H\u0087\u0008\u00f8\u0001\u0000J$\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017H\u0007J\u0012\u0010\u0018\u001a\u00020\u00002\n\u0010\u0019\u001a\u0006\u0012\u0002\u0008\u00030\u001aJ$\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u001c"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/FieldMatcherList;",
        "Ljava/util/ArrayList;",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "Lkotlin/collections/ArrayList;",
        "Lorg/luckypray/dexkit/query/base/IQuery;",
        "()V",
        "initialCapacity",
        "",
        "(I)V",
        "elements",
        "",
        "(Ljava/util/Collection;)V",
        "add",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "addForName",
        "name",
        "",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "addForType",
        "clazz",
        "Ljava/lang/Class;",
        "typeName",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "initialCapacity"    # I

    .line 64
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            ">;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method private final add(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/FieldMatcherList;
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
            "Lorg/luckypray/dexkit/query/FieldMatcherList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/FieldMatcherList;
    const/4 v1, 0x0

    .line 128
    .local v1, "$i$a$-also-FieldMatcherList$add$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/FieldMatcherList;->add(Ljava/lang/Object;)Z

    .line 129
    nop

    .line 127
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FieldMatcherList;
    .end local v1    # "$i$a$-also-FieldMatcherList$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    .line 129
    return-object v0
.end method

.method public static synthetic addForName$default(Lorg/luckypray/dexkit/query/FieldMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/FieldMatcherList;
    .locals 0

    .line 113
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 115
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 113
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 116
    const/4 p3, 0x0

    .line 113
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/FieldMatcherList;->addForName(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/FieldMatcherList;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addForType$default(Lorg/luckypray/dexkit/query/FieldMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/FieldMatcherList;
    .locals 0

    .line 80
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 82
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 80
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 83
    const/4 p3, 0x0

    .line 80
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/FieldMatcherList;->addForType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/FieldMatcherList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addForName(Ljava/lang/String;)Lorg/luckypray/dexkit/query/FieldMatcherList;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/FieldMatcherList;->addForName$default(Lorg/luckypray/dexkit/query/FieldMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/FieldMatcherList;

    move-result-object v0

    return-object v0
.end method

.method public final addForName(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/FieldMatcherList;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/FieldMatcherList;->addForName$default(Lorg/luckypray/dexkit/query/FieldMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/FieldMatcherList;

    move-result-object v0

    return-object v0
.end method

.method public final addForName(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/FieldMatcherList;
    .locals 5
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/FieldMatcherList;
    const/4 v1, 0x0

    .line 118
    .local v1, "$i$a$-also-FieldMatcherList$addForName$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 310
    move-object v3, v2

    .local v3, "$this$addForName_u24lambda_u245_u24lambda_u244":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v4, 0x0

    .line 118
    .local v4, "$i$a$-apply-FieldMatcherList$addForName$1$1":I
    invoke-virtual {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .end local v3    # "$this$addForName_u24lambda_u245_u24lambda_u244":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v4    # "$i$a$-apply-FieldMatcherList$addForName$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/FieldMatcherList;->add(Ljava/lang/Object;)Z

    .line 119
    nop

    .line 117
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FieldMatcherList;
    .end local v1    # "$i$a$-also-FieldMatcherList$addForName$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    .line 119
    return-object v0
.end method

.method public final addForType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/FieldMatcherList;
    .locals 5
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/FieldMatcherList;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/FieldMatcherList;
    const/4 v1, 0x0

    .line 97
    .local v1, "$i$a$-also-FieldMatcherList$addForType$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 310
    move-object v3, v2

    .local v3, "$this$addForType_u24lambda_u243_u24lambda_u242":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v4, 0x0

    .line 97
    .local v4, "$i$a$-apply-FieldMatcherList$addForType$2$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .end local v3    # "$this$addForType_u24lambda_u243_u24lambda_u242":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v4    # "$i$a$-apply-FieldMatcherList$addForType$2$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/FieldMatcherList;->add(Ljava/lang/Object;)Z

    .line 98
    nop

    .line 96
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FieldMatcherList;
    .end local v1    # "$i$a$-also-FieldMatcherList$addForType$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    .line 98
    return-object v0
.end method

.method public final addForType(Ljava/lang/String;)Lorg/luckypray/dexkit/query/FieldMatcherList;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/FieldMatcherList;->addForType$default(Lorg/luckypray/dexkit/query/FieldMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/FieldMatcherList;

    move-result-object v0

    return-object v0
.end method

.method public final addForType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/FieldMatcherList;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/FieldMatcherList;->addForType$default(Lorg/luckypray/dexkit/query/FieldMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/FieldMatcherList;

    move-result-object v0

    return-object v0
.end method

.method public final addForType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/FieldMatcherList;
    .locals 5
    .param p1, "typeName"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/FieldMatcherList;
    const/4 v1, 0x0

    .line 85
    .local v1, "$i$a$-also-FieldMatcherList$addForType$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 310
    move-object v3, v2

    .local v3, "$this$addForType_u24lambda_u241_u24lambda_u240":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v4, 0x0

    .line 85
    .local v4, "$i$a$-apply-FieldMatcherList$addForType$1$1":I
    invoke-virtual {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .end local v3    # "$this$addForType_u24lambda_u241_u24lambda_u240":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v4    # "$i$a$-apply-FieldMatcherList$addForType$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/FieldMatcherList;->add(Ljava/lang/Object;)Z

    .line 86
    nop

    .line 84
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FieldMatcherList;
    .end local v1    # "$i$a$-also-FieldMatcherList$addForType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FieldMatcherList;

    .line 86
    return-object v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 62
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FieldMatcherList;->contains(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Z

    move-result v0

    return v0
.end method

.method public bridge contains(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 62
    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge getSize()I
    .locals 1

    .line 62
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 62
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FieldMatcherList;->indexOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)I

    move-result v0

    return v0
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 62
    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 62
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FieldMatcherList;->lastIndexOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)I

    move-result v0

    return v0
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 62
    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1
    .param p1, "index"    # I

    .line 62
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FieldMatcherList;->removeAt(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 62
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FieldMatcherList;->remove(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Z

    move-result v0

    return v0
.end method

.method public bridge remove(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 62
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1
    .param p1, "p0"    # I

    .line 62
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object v0
.end method

.method public final bridge size()I
    .locals 1

    .line 62
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/FieldMatcherList;->getSize()I

    move-result v0

    return v0
.end method
