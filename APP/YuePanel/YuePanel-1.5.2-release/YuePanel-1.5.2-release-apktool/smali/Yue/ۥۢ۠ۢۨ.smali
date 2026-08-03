.class public LYue/ۥۢ۠ۢۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:I

.field public ۥ۟:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LYue/ۥۢ۠ۢۨ;->ۥ۟(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public ۥ۟(ILjava/nio/ByteBuffer;)V
    .locals 0

    iput-object p2, p0, LYue/ۥۢ۠ۢۨ;->ۥ۟:Ljava/nio/ByteBuffer;

    if-eqz p2, :cond_0

    iput p1, p0, LYue/ۥۢ۠ۢۨ;->ۥ:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, LYue/ۥۢ۠ۢۨ;->ۥ:I

    :goto_0
    return-void
.end method
