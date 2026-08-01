.class public final Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
.super Ljava/util/ArrayList;
.source "MatcherCollections.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IQuery;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
        ">;",
        "Lorg/luckypray/dexkit/query/base/IQuery;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0005B\u000f\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\u0015\u0008\u0016\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ%\u0010\u000c\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0008\u0012H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u001e\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u001f"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;",
        "Ljava/util/ArrayList;",
        "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
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
        "number",
        "",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "addByte",
        "value",
        "",
        "addDouble",
        "",
        "addFloat",
        "",
        "addInt",
        "addLong",
        "",
        "addShort",
        "",
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

    .line 149
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "initialCapacity"    # I

    .line 150
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
            "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
            ">;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method private final add(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    const/4 v1, 0x0

    .line 251
    .local v1, "$i$a$-also-NumberEncodeValueMatcherList$add$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->add(Ljava/lang/Object;)Z

    .line 252
    nop

    .line 250
    .end local v0    # "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcherList$add$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 252
    return-object v0
.end method


# virtual methods
.method public final add(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 4
    .param p1, "number"    # Ljava/lang/Number;

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    const/4 v1, 0x0

    .line 162
    .local v1, "$i$a$-also-NumberEncodeValueMatcherList$add$1":I
    nop

    .line 163
    instance-of v2, p1, Ljava/lang/Byte;

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addByte(B)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    goto :goto_0

    .line 164
    :cond_0
    instance-of v2, p1, Ljava/lang/Short;

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addShort(S)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    goto :goto_0

    .line 165
    :cond_1
    instance-of v2, p1, Ljava/lang/Integer;

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addInt(I)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    goto :goto_0

    .line 166
    :cond_2
    instance-of v2, p1, Ljava/lang/Long;

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addLong(J)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    goto :goto_0

    .line 167
    :cond_3
    instance-of v2, p1, Ljava/lang/Float;

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addFloat(F)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    goto :goto_0

    .line 168
    :cond_4
    instance-of v2, p1, Ljava/lang/Double;

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addDouble(D)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 170
    :cond_5
    :goto_0
    nop

    .line 161
    .end local v0    # "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcherList$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 170
    return-object v0
.end method

.method public final addByte(B)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 3
    .param p1, "value"    # B

    .line 180
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    const/4 v1, 0x0

    .line 181
    .local v1, "$i$a$-also-NumberEncodeValueMatcherList$addByte$1":I
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createByte(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->add(Ljava/lang/Object;)Z

    .line 182
    nop

    .line 180
    .end local v0    # "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcherList$addByte$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 182
    return-object v0
.end method

.method public final addDouble(D)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 3
    .param p1, "value"    # D

    .line 240
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    const/4 v1, 0x0

    .line 241
    .local v1, "$i$a$-also-NumberEncodeValueMatcherList$addDouble$1":I
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->add(Ljava/lang/Object;)Z

    .line 242
    nop

    .line 240
    .end local v0    # "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcherList$addDouble$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 242
    return-object v0
.end method

.method public final addFloat(F)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 3
    .param p1, "value"    # F

    .line 228
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    const/4 v1, 0x0

    .line 229
    .local v1, "$i$a$-also-NumberEncodeValueMatcherList$addFloat$1":I
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->add(Ljava/lang/Object;)Z

    .line 230
    nop

    .line 228
    .end local v0    # "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcherList$addFloat$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 230
    return-object v0
.end method

.method public final addInt(I)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 3
    .param p1, "value"    # I

    .line 204
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    const/4 v1, 0x0

    .line 205
    .local v1, "$i$a$-also-NumberEncodeValueMatcherList$addInt$1":I
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createInt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->add(Ljava/lang/Object;)Z

    .line 206
    nop

    .line 204
    .end local v0    # "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcherList$addInt$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 206
    return-object v0
.end method

.method public final addLong(J)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 3
    .param p1, "value"    # J

    .line 216
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    const/4 v1, 0x0

    .line 217
    .local v1, "$i$a$-also-NumberEncodeValueMatcherList$addLong$1":I
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createLong(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->add(Ljava/lang/Object;)Z

    .line 218
    nop

    .line 216
    .end local v0    # "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcherList$addLong$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 218
    return-object v0
.end method

.method public final addShort(S)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 3
    .param p1, "value"    # S

    .line 192
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    const/4 v1, 0x0

    .line 193
    .local v1, "$i$a$-also-NumberEncodeValueMatcherList$addShort$1":I
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createShort(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->add(Ljava/lang/Object;)Z

    .line 194
    nop

    .line 192
    .end local v0    # "it":Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcherList$addShort$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 194
    return-object v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 148
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->contains(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)Z

    move-result v0

    return v0
.end method

.method public bridge contains(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 148
    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge getSize()I
    .locals 1

    .line 148
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 148
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->indexOf(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)I

    move-result v0

    return v0
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 148
    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 148
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->lastIndexOf(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)I

    move-result v0

    return v0
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 148
    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .param p1, "index"    # I

    .line 148
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->removeAt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 148
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->remove(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)Z

    move-result v0

    return v0
.end method

.method public bridge remove(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 148
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .param p1, "p0"    # I

    .line 148
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    return-object v0
.end method

.method public final bridge size()I
    .locals 1

    .line 148
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->getSize()I

    move-result v0

    return v0
.end method
