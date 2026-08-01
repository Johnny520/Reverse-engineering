.class public final Lcom/android/dx/dex/code/PositionList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/dex/code/PositionList$Entry;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/android/dx/dex/code/PositionList;

.field public static final IMPORTANT:I = 0x3

.field public static final LINES:I = 0x2

.field public static final NONE:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/dex/code/PositionList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/dex/code/PositionList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/dex/code/PositionList;->EMPTY:Lcom/android/dx/dex/code/PositionList;

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

.method public static make(Lcom/android/dx/dex/code/DalvInsnList;I)Lcom/android/dx/dex/code/PositionList;
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_8

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq p1, v1, :cond_1

    .line 7
    .line 8
    if-ne p1, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p0, "bogus howMuch"

    .line 12
    .line 13
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_1
    :goto_0
    sget-object v1, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    new-array v4, v3, [Lcom/android/dx/dex/code/PositionList$Entry;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    move-object v8, v1

    .line 28
    move v6, v5

    .line 29
    move v7, v6

    .line 30
    move v9, v7

    .line 31
    :goto_1
    if-ge v6, v3, :cond_6

    .line 32
    .line 33
    invoke-virtual {p0, v6}, Lcom/android/dx/dex/code/DalvInsnList;->get(I)Lcom/android/dx/dex/code/DalvInsn;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    instance-of v11, v10, Lcom/android/dx/dex/code/CodeAddress;

    .line 38
    .line 39
    if-eqz v11, :cond_2

    .line 40
    .line 41
    move v9, v0

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    invoke-virtual {v10}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-virtual {v11, v1}, Lcom/android/dx/rop/code/SourcePosition;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v12

    .line 51
    if-nez v12, :cond_5

    .line 52
    .line 53
    invoke-virtual {v11, v8}, Lcom/android/dx/rop/code/SourcePosition;->sameLine(Lcom/android/dx/rop/code/SourcePosition;)Z

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    if-eqz v12, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    if-ne p1, v2, :cond_4

    .line 61
    .line 62
    if-nez v9, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    new-instance v8, Lcom/android/dx/dex/code/PositionList$Entry;

    .line 66
    .line 67
    invoke-virtual {v10}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    invoke-direct {v8, v9, v11}, Lcom/android/dx/dex/code/PositionList$Entry;-><init>(ILcom/android/dx/rop/code/SourcePosition;)V

    .line 72
    .line 73
    .line 74
    aput-object v8, v4, v7

    .line 75
    .line 76
    add-int/lit8 v7, v7, 0x1

    .line 77
    .line 78
    move v9, v5

    .line 79
    move-object v8, v11

    .line 80
    :cond_5
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_6
    new-instance p0, Lcom/android/dx/dex/code/PositionList;

    .line 84
    .line 85
    invoke-direct {p0, v7}, Lcom/android/dx/dex/code/PositionList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    :goto_3
    if-ge v5, v7, :cond_7

    .line 89
    .line 90
    aget-object p1, v4, v5

    .line 91
    .line 92
    invoke-virtual {p0, v5, p1}, Lcom/android/dx/dex/code/PositionList;->set(ILcom/android/dx/dex/code/PositionList$Entry;)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v5, v5, 0x1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_7
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 99
    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_8
    sget-object p0, Lcom/android/dx/dex/code/PositionList;->EMPTY:Lcom/android/dx/dex/code/PositionList;

    .line 103
    .line 104
    return-object p0
.end method


# virtual methods
.method public get(I)Lcom/android/dx/dex/code/PositionList$Entry;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/dex/code/PositionList$Entry;

    .line 6
    .line 7
    return-object p0
.end method

.method public set(ILcom/android/dx/dex/code/PositionList$Entry;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
