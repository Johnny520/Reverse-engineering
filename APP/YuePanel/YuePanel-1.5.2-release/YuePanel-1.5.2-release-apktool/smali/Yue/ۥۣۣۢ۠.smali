.class public final LYue/ۥۣۣۢ۠;
.super LYue/ۥ۟ۢۦ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۢۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(IILjava/nio/ByteBuffer;)LYue/ۥۣۣۢ۠;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۢۦ;->ۥ۟(IILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۣۢ۠ۧ;I)LYue/ۥۣۢ۠ۧ;
    .locals 1

    invoke-virtual {p0, p2}, LYue/ۥ۟ۢۦ;->ۥ(I)I

    move-result p2

    iget-object v0, p0, LYue/ۥ۟ۢۦ;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    invoke-static {p1, p2, v0}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۟ۥ(LYue/ۥۣۢ۠ۧ;ILjava/nio/ByteBuffer;)LYue/ۥۣۢ۠ۧ;

    move-result-object p1

    return-object p1
.end method
