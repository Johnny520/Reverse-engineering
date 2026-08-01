.class public Lcom/android/dx/cf/code/LineNumberList$Item;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/LineNumberList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Item"
.end annotation


# instance fields
.field private final lineNumber:I

.field private final startPc:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    if-ltz p2, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/android/dx/cf/code/LineNumberList$Item;->startPc:I

    .line 9
    .line 10
    iput p2, p0, Lcom/android/dx/cf/code/LineNumberList$Item;->lineNumber:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "lineNumber < 0"

    .line 14
    .line 15
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    const-string p0, "startPc < 0"

    .line 21
    .line 22
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method


# virtual methods
.method public getLineNumber()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/LineNumberList$Item;->lineNumber:I

    .line 2
    .line 3
    return p0
.end method

.method public getStartPc()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/LineNumberList$Item;->startPc:I

    .line 2
    .line 3
    return p0
.end method
