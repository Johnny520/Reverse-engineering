.class public LYue/ۥۢۡ۠ۢ;
.super LYue/ۥ۟ۨۢۤ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۤ:LYue/ۥۣۣۡۢ;

    invoke-direct {p0, v0}, LYue/ۥ۟ۨۢۤ;-><init>(LYue/ۥۣۣۡۢ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۤ()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    invoke-super {p0}, LYue/ۥ۟ۨۢۤ;->ۥ۟۟۟ۤ()V

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۤۤ۟;->ۥ۟(Ljava/nio/ByteBuffer;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۧۤ;

    const/16 v1, 0x3ef

    const-string v2, "Received text is no valid utf8 string!"

    invoke-direct {v0, v1, v2}, LYue/ۥ۠ۥۧۤ;-><init>(ILjava/lang/String;)V

    throw v0
.end method
