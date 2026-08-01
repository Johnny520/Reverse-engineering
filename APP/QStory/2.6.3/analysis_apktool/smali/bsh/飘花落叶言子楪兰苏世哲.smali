.class public final synthetic Lbsh/飘花落叶言子楪兰苏世哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, 0x1

    .line 10
    and-int/2addr p0, v0

    .line 11
    if-gtz p0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    and-int/lit8 p0, p0, 0x5

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    and-int/lit8 p0, p0, 0x7

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    and-int/lit8 p1, p1, 0x7

    .line 33
    .line 34
    if-ne p0, p1, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_1
    return v0

    .line 39
    :cond_2
    :goto_0
    const/4 p0, -0x1

    .line 40
    return p0
.end method
