.class public final LYue/ۥۡۡ۠ۥ$ۥ;
.super LYue/ۥ۟ۢۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۢۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(IILjava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۥ$ۥ;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۢۦ;->ۥ۟(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(I)LYue/ۥۡۡ۠ۥ;
    .locals 1

    new-instance v0, LYue/ۥۡۡ۠ۥ;

    invoke-direct {v0}, LYue/ۥۡۡ۠ۥ;-><init>()V

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۡ۠ۥ$ۥ;->ۥ۟۟۟ۢ(LYue/ۥۡۡ۠ۥ;I)LYue/ۥۡۡ۠ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥۡۡ۠ۥ;I)LYue/ۥۡۡ۠ۥ;
    .locals 1

    invoke-virtual {p0, p2}, LYue/ۥ۟ۢۦ;->ۥ(I)I

    move-result p2

    iget-object v0, p0, LYue/ۥ۟ۢۦ;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    invoke-static {p2, v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟۠ۧ(ILjava/nio/ByteBuffer;)I

    move-result p2

    iget-object v0, p0, LYue/ۥ۟ۢۦ;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟۠ۥ(ILjava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۥ;

    move-result-object p1

    return-object p1
.end method
