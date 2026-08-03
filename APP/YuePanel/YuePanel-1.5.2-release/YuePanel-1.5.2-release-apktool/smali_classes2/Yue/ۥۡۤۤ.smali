.class public LYue/ۥۡۤۤ;
.super LYue/ۥ۟ۧۥۦ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۧ:LYue/ۥۣۣۡۢ;

    invoke-direct {p0, v0}, LYue/ۥ۟ۧۥۦ;-><init>(LYue/ۥۣۣۡۢ;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۤۡ۠;)V
    .locals 1

    .line 2
    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۧ:LYue/ۥۣۣۡۢ;

    invoke-direct {p0, v0}, LYue/ۥ۟ۧۥۦ;-><init>(LYue/ۥۣۣۡۢ;)V

    .line 3
    invoke-virtual {p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۦ(Ljava/nio/ByteBuffer;)V

    return-void
.end method
