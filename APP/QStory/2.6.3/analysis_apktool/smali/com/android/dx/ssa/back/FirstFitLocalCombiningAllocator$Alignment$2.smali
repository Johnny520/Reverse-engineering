.class final enum Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Alignment$2;
.super Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Alignment;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Alignment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Alignment;-><init>(Ljava/lang/String;ILcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public nextClearBit(Ljava/util/BitSet;I)I
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/util/BitSet;->nextClearBit(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    :goto_0
    invoke-static {p0}, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;->access$100(I)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    add-int/lit8 p0, p0, 0x1

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/util/BitSet;->nextClearBit(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return p0
.end method
