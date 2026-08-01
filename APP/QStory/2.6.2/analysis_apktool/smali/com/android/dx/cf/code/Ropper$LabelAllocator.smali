.class Lcom/android/dx/cf/code/Ropper$LabelAllocator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Ropper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LabelAllocator"
.end annotation


# instance fields
.field nextAvailableLabel:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/cf/code/Ropper$LabelAllocator;->nextAvailableLabel:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getNextLabel()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/Ropper$LabelAllocator;->nextAvailableLabel:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/android/dx/cf/code/Ropper$LabelAllocator;->nextAvailableLabel:I

    .line 6
    .line 7
    return v0
.end method
