.class public LYue/ۥۡۦۧۦ$ۥ۟;
.super LYue/ۥ۠ۥ۟ۤ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۧۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟ۡ:LYue/ۥۡۦۧۦ;


# direct methods
.method public constructor <init>(LYue/ۥۡۦۧۦ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۦۧۦ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥۡۦۧۦ;

    invoke-direct {p0}, LYue/ۥ۠ۥ۟ۤ$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(ILandroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, LYue/ۥۡۦۧۦ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥۡۦۧۦ;

    iget-object v1, v0, LYue/ۥۡۦۧۦ;->ۥ۟۟۠ۤ:Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, LYue/ۥۡۦۧۦ$ۥ۟۟;

    invoke-direct {v2, v0, p1, p2}, LYue/ۥۡۦۧۦ$ۥ۟۟;-><init>(LYue/ۥۡۦۧۦ;ILandroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LYue/ۥۡۦۧۦ;->ۥ(ILandroid/os/Bundle;)V

    :goto_0
    return-void
.end method
