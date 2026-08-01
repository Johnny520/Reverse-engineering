.class Lcom/android/dx/command/dump/Args;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field basicBlocks:Z

.field debug:Z

.field dotDump:Z

.field method:Ljava/lang/String;

.field optimize:Z

.field rawBytes:Z

.field ropBlocks:Z

.field ssaBlocks:Z

.field ssaStep:Ljava/lang/String;

.field strictParse:Z

.field width:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/android/dx/command/dump/Args;->debug:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/android/dx/command/dump/Args;->rawBytes:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/android/dx/command/dump/Args;->basicBlocks:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/android/dx/command/dump/Args;->ropBlocks:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/android/dx/command/dump/Args;->ssaBlocks:Z

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-object v1, p0, Lcom/android/dx/command/dump/Args;->ssaStep:Ljava/lang/String;

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/android/dx/command/dump/Args;->optimize:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/android/dx/command/dump/Args;->strictParse:Z

    .line 21
    .line 22
    iput v0, p0, Lcom/android/dx/command/dump/Args;->width:I

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/android/dx/command/dump/Args;->dotDump:Z

    .line 25
    .line 26
    return-void
.end method
