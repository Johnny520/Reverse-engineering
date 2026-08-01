.class public final Lcom/android/dx/cf/code/LineNumberList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/code/LineNumberList$Item;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/android/dx/cf/code/LineNumberList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/LineNumberList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/LineNumberList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/cf/code/LineNumberList;->EMPTY:Lcom/android/dx/cf/code/LineNumberList;

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

.method public static concat(Lcom/android/dx/cf/code/LineNumberList;Lcom/android/dx/cf/code/LineNumberList;)Lcom/android/dx/cf/code/LineNumberList;
    .locals 6

    .line 1
    sget-object v0, Lcom/android/dx/cf/code/LineNumberList;->EMPTY:Lcom/android/dx/cf/code/LineNumberList;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    new-instance v2, Lcom/android/dx/cf/code/LineNumberList;

    .line 15
    .line 16
    add-int v3, v0, v1

    .line 17
    .line 18
    invoke-direct {v2, v3}, Lcom/android/dx/cf/code/LineNumberList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_0
    if-ge v4, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v4}, Lcom/android/dx/cf/code/LineNumberList;->get(I)Lcom/android/dx/cf/code/LineNumberList$Item;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v2, v4, v5}, Lcom/android/dx/cf/code/LineNumberList;->set(ILcom/android/dx/cf/code/LineNumberList$Item;)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    if-ge v3, v1, :cond_2

    .line 36
    .line 37
    add-int p0, v0, v3

    .line 38
    .line 39
    invoke-virtual {p1, v3}, Lcom/android/dx/cf/code/LineNumberList;->get(I)Lcom/android/dx/cf/code/LineNumberList$Item;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v2, p0, v4}, Lcom/android/dx/cf/code/LineNumberList;->set(ILcom/android/dx/cf/code/LineNumberList$Item;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    return-object v2
.end method


# virtual methods
.method public get(I)Lcom/android/dx/cf/code/LineNumberList$Item;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/cf/code/LineNumberList$Item;

    .line 6
    .line 7
    return-object p0
.end method

.method public pcToLine(I)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v3, v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Lcom/android/dx/cf/code/LineNumberList;->get(I)Lcom/android/dx/cf/code/LineNumberList$Item;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Lcom/android/dx/cf/code/LineNumberList$Item;->getStartPc()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-gt v5, p1, :cond_1

    .line 20
    .line 21
    if-le v5, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v4}, Lcom/android/dx/cf/code/LineNumberList$Item;->getLineNumber()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ne v5, p1, :cond_0

    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    move v2, v1

    .line 31
    move v1, v5

    .line 32
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return v2
.end method

.method public set(III)V
    .locals 1

    .line 13
    new-instance v0, Lcom/android/dx/cf/code/LineNumberList$Item;

    invoke-direct {v0, p2, p3}, Lcom/android/dx/cf/code/LineNumberList$Item;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    return-void
.end method

.method public set(ILcom/android/dx/cf/code/LineNumberList$Item;)V
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
