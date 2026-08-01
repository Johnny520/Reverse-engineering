.class Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/file/DebugInfoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PositionEntry"
.end annotation


# instance fields
.field public address:I

.field public line:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;->address:I

    .line 5
    .line 6
    iput p2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;->line:I

    .line 7
    .line 8
    return-void
.end method
