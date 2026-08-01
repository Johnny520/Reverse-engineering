.class public final Lcom/android/dx/cf/code/ByteCatchList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/code/ByteCatchList$Item;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/android/dx/cf/code/ByteCatchList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/ByteCatchList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/ByteCatchList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/cf/code/ByteCatchList;->EMPTY:Lcom/android/dx/cf/code/ByteCatchList;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static typeNotFound(Lcom/android/dx/cf/code/ByteCatchList$Item;[Lcom/android/dx/cf/code/ByteCatchList$Item;I)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getExceptionClass()Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    if-ge v1, p2, :cond_2

    .line 8
    .line 9
    aget-object v2, p1, v1

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getExceptionClass()Lcom/android/dx/rop/cst/CstType;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eq v2, p0, :cond_1

    .line 16
    .line 17
    sget-object v3, Lcom/android/dx/rop/cst/CstType;->OBJECT:Lcom/android/dx/rop/cst/CstType;

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    :goto_1
    return v0

    .line 26
    :cond_2
    const/4 p0, 0x1

    .line 27
    return p0
.end method


# virtual methods
.method public byteLength()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    mul-int/lit8 p0, p0, 0x8

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x2

    .line 8
    .line 9
    return p0
.end method

.method public get(I)Lcom/android/dx/cf/code/ByteCatchList$Item;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/cf/code/ByteCatchList$Item;

    .line 6
    .line 7
    return-object p0
.end method

.method public listFor(I)Lcom/android/dx/cf/code/ByteCatchList;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [Lcom/android/dx/cf/code/ByteCatchList$Item;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v3, v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Lcom/android/dx/cf/code/ByteCatchList;->get(I)Lcom/android/dx/cf/code/ByteCatchList$Item;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    invoke-virtual {v5, p1}, Lcom/android/dx/cf/code/ByteCatchList$Item;->covers(I)Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    invoke-static {v5, v1, v4}, Lcom/android/dx/cf/code/ByteCatchList;->typeNotFound(Lcom/android/dx/cf/code/ByteCatchList$Item;[Lcom/android/dx/cf/code/ByteCatchList$Item;I)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    aput-object v5, v1, v4

    .line 29
    .line 30
    add-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    if-nez v4, :cond_2

    .line 36
    .line 37
    sget-object p0, Lcom/android/dx/cf/code/ByteCatchList;->EMPTY:Lcom/android/dx/cf/code/ByteCatchList;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    new-instance p0, Lcom/android/dx/cf/code/ByteCatchList;

    .line 41
    .line 42
    invoke-direct {p0, v4}, Lcom/android/dx/cf/code/ByteCatchList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    :goto_1
    if-ge v2, v4, :cond_3

    .line 46
    .line 47
    aget-object p1, v1, v2

    .line 48
    .line 49
    invoke-virtual {p0, v2, p1}, Lcom/android/dx/cf/code/ByteCatchList;->set(ILcom/android/dx/cf/code/ByteCatchList$Item;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 56
    .line 57
    .line 58
    return-object p0
.end method

.method public set(IIIILcom/android/dx/rop/cst/CstType;)V
    .locals 1

    .line 13
    new-instance v0, Lcom/android/dx/cf/code/ByteCatchList$Item;

    invoke-direct {v0, p2, p3, p4, p5}, Lcom/android/dx/cf/code/ByteCatchList$Item;-><init>(IIILcom/android/dx/rop/cst/CstType;)V

    invoke-virtual {p0, p1, v0}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    return-void
.end method

.method public set(ILcom/android/dx/cf/code/ByteCatchList$Item;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const-string p0, "item == null"

    .line 8
    .line 9
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public toRopCatchList()Lcom/android/dx/rop/type/TypeList;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v1, Lcom/android/dx/rop/type/StdTypeList;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/android/dx/rop/type/StdTypeList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/android/dx/cf/code/ByteCatchList;->get(I)Lcom/android/dx/cf/code/ByteCatchList$Item;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getExceptionClass()Lcom/android/dx/rop/cst/CstType;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v1, v2, v3}, Lcom/android/dx/rop/type/StdTypeList;->set(ILcom/android/dx/rop/type/Type;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public toTargetList(I)Lcom/android/dx/util/IntList;
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    if-lt p1, v0, :cond_5

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_2

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object p0, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    new-instance v3, Lcom/android/dx/util/IntList;

    .line 27
    .line 28
    add-int v4, v2, v1

    .line 29
    .line 30
    invoke-direct {v3, v4}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    :goto_1
    if-ge v0, v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/android/dx/cf/code/ByteCatchList;->get(I)Lcom/android/dx/cf/code/ByteCatchList$Item;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getHandlerPc()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v3, v4}, Lcom/android/dx/util/IntList;->add(I)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    if-eqz v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {v3, p1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 52
    .line 53
    .line 54
    :cond_4
    invoke-virtual {v3}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :cond_5
    const-string p0, "noException < -1"

    .line 59
    .line 60
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method
