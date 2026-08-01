.class public final Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
.super Ljava/util/ArrayList;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/QueryComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
        ">;",
        "Lorg/luckypray/dexkit/query/base/QueryComponent;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Ljava/lang/Byte;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addByte(B)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p1, Ljava/lang/Short;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addShort(S)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addInt(I)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    instance-of v0, p1, Ljava/lang/Long;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addLong(J)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addFloat(F)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    instance-of v0, p1, Ljava/lang/Double;

    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->addDouble(D)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;

    .line 73
    .line 74
    .line 75
    :cond_5
    return-object p0
.end method

.method public final synthetic add(Lsw;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final addByte(B)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createByte(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final addDouble(D)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final addFloat(F)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final addInt(I)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createInt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final addLong(J)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createLong(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final addShort(S)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createShort(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->contains(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge contains(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)Z
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public bridge getSize()I
    .locals 0

    .line 1
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->indexOf(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)I
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->lastIndexOf(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)I
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->removeAt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->remove(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge remove(Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;)Z
    .locals 0

    .line 15
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 6
    .line 7
    return-object p0
.end method

.method public final bridge size()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
