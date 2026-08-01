.class Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/file/DebugInfoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LocalEntry"
.end annotation


# instance fields
.field public address:I

.field public isStart:Z

.field public nameIndex:I

.field public reg:I

.field public signatureIndex:I

.field public typeIndex:I


# direct methods
.method public constructor <init>(IZIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->address:I

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    .line 7
    .line 8
    iput p3, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    .line 9
    .line 10
    iput p4, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    .line 11
    .line 12
    iput p5, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->typeIndex:I

    .line 13
    .line 14
    iput p6, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->signatureIndex:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->address:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "start"

    .line 12
    .line 13
    :goto_0
    move-object v2, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const-string v0, "end"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :goto_1
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->typeIndex:I

    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget p0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->signatureIndex:I

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string v0, "[%x %s v%d %04x %04x %04x]"

    .line 47
    .line 48
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
