.class public final LYue/ۥ۠ۥۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۥۢۦ$ۥ;,
        LYue/ۥ۠ۥۢۦ$ۥ۟۟;,
        LYue/ۥ۠ۥۢۦ$ۥ۟;
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠ۥۢۦ$ۥ۟۟;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۥۢۦ$ۥ۟۟;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۥۢۦ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LYue/ۥ۠ۥۢۦ;->ۥ:LYue/ۥ۠ۥۢۦ$ۥ۟۟;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/content/ClipDescription;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LYue/ۥ۠ۥۢۦ$ۥ;

    invoke-direct {v0, p1, p2, p3}, LYue/ۥ۠ۥۢۦ$ۥ;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, LYue/ۥ۠ۥۢۦ;->ۥ:LYue/ۥ۠ۥۢۦ$ۥ۟۟;

    return-void
.end method

.method public static ۥ۟۟۟ۡ(Ljava/lang/Object;)LYue/ۥ۠ۥۢۦ;
    .locals 2
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۢۦ;

    new-instance v1, LYue/ۥ۠ۥۢۦ$ۥ;

    invoke-direct {v1, p0}, LYue/ۥ۠ۥۢۦ$ۥ;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۢۦ;-><init>(LYue/ۥ۠ۥۢۦ$ۥ۟۟;)V

    return-object v0
.end method


# virtual methods
.method public ۥ()Landroid/net/Uri;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۢۦ;->ۥ:LYue/ۥ۠ۥۢۦ$ۥ۟۟;

    invoke-interface {v0}, LYue/ۥ۠ۥۢۦ$ۥ۟۟;->ۥ۟()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()Landroid/content/ClipDescription;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۢۦ;->ۥ:LYue/ۥ۠ۥۢۦ$ۥ۟۟;

    invoke-interface {v0}, LYue/ۥ۠ۥۢۦ$ۥ۟۟;->ۥ۟۟۟()Landroid/content/ClipDescription;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()Landroid/net/Uri;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۢۦ;->ۥ:LYue/ۥ۠ۥۢۦ$ۥ۟۟;

    invoke-interface {v0}, LYue/ۥ۠ۥۢۦ$ۥ۟۟;->ۥ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۥۢۦ;->ۥ:LYue/ۥ۠ۥۢۦ$ۥ۟۟;

    invoke-interface {v0}, LYue/ۥ۠ۥۢۦ$ۥ۟۟;->ۥ۟۟۟۠()V

    return-void
.end method

.method public ۥ۟۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۥۢۦ;->ۥ:LYue/ۥ۠ۥۢۦ$ۥ۟۟;

    invoke-interface {v0}, LYue/ۥ۠ۥۢۦ$ۥ۟۟;->ۥ۟۟()V

    return-void
.end method

.method public ۥ۟۟۟۠()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۢۦ;->ۥ:LYue/ۥ۠ۥۢۦ$ۥ۟۟;

    invoke-interface {v0}, LYue/ۥ۠ۥۢۦ$ۥ۟۟;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
