.class public final LYue/ۥ۠ۤۧۦ$ۥ۟۟$ۥ;
.super LYue/ۥ۠ۤۧۦ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۧۦ$ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۤۧۦ$ۥ۟۟;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(LYue/ۥ۠ۤۨ;)V
    .locals 2
    .param p1    # LYue/ۥ۠ۤۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "stream"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟ۡۡ:LYue/ۥ۠ۡ۠ۢ;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟(LYue/ۥ۠ۡ۠ۢ;Ljava/io/IOException;)V

    return-void
.end method
