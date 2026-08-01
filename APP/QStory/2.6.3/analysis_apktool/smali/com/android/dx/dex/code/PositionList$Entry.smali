.class public Lcom/android/dx/dex/code/PositionList$Entry;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/code/PositionList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation


# instance fields
.field private final address:I

.field private final position:Lcom/android/dx/rop/code/SourcePosition;


# direct methods
.method public constructor <init>(ILcom/android/dx/rop/code/SourcePosition;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/android/dx/dex/code/PositionList$Entry;->address:I

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/dex/code/PositionList$Entry;->position:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "position == null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :cond_1
    const-string p0, "address < 0"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method


# virtual methods
.method public getAddress()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/PositionList$Entry;->address:I

    .line 2
    .line 3
    return p0
.end method

.method public getPosition()Lcom/android/dx/rop/code/SourcePosition;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/PositionList$Entry;->position:Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    return-object p0
.end method
