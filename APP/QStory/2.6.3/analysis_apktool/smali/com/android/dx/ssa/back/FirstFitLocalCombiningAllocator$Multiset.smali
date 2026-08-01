.class Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Multiset"
.end annotation


# instance fields
.field private final count:[I

.field private final reg:[I

.field private size:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-array v0, p1, [I

    .line 5
    .line 6
    iput-object v0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    .line 7
    .line 8
    new-array p1, p1, [I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public add(I)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    .line 3
    .line 4
    iget-object v2, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    aget v1, v2, v0

    .line 10
    .line 11
    if-ne v1, p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    .line 14
    .line 15
    aget p1, p0, v0

    .line 16
    .line 17
    add-int/2addr p1, v3

    .line 18
    aput p1, p0, v0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    aput p1, v2, v1

    .line 25
    .line 26
    iget-object p1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    .line 27
    .line 28
    aput v3, p1, v1

    .line 29
    .line 30
    add-int/2addr v1, v3

    .line 31
    iput v1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    .line 32
    .line 33
    return-void
.end method

.method public getAndRemoveHighestCount()I
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v0

    .line 4
    move v3, v1

    .line 5
    move v4, v3

    .line 6
    :goto_0
    iget v5, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    .line 7
    .line 8
    iget-object v6, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    .line 9
    .line 10
    if-ge v3, v5, :cond_1

    .line 11
    .line 12
    aget v5, v6, v3

    .line 13
    .line 14
    if-ge v4, v5, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    .line 17
    .line 18
    aget v0, v0, v3

    .line 19
    .line 20
    move v2, v0

    .line 21
    move v0, v3

    .line 22
    move v4, v5

    .line 23
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    aput v1, v6, v0

    .line 27
    .line 28
    return v2
.end method

.method public getSize()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    .line 2
    .line 3
    return p0
.end method
