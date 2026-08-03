.class public LYue/ۥۣ۟ۧ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟:Landroid/os/Handler;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LYue/ۥۣ۟ۧ۟;->ۥ:LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;

    .line 6
    invoke-static {}, LYue/ۥۣ۟ۧ۠;->ۥ()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۧ۟;->ۥ۟:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;Landroid/os/Handler;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Handler;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۣ۟ۧ۟;->ۥ:LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;

    .line 3
    iput-object p2, p0, LYue/ۥۣ۟ۧ۟;->ۥ۟:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final ۥ(I)V
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۟ۧ۟;->ۥ:LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;

    iget-object v1, p0, LYue/ۥۣ۟ۧ۟;->ۥ۟:Landroid/os/Handler;

    new-instance v2, LYue/ۥۣ۟ۧ۟$ۥ۟;

    invoke-direct {v2, p0, v0, p1}, LYue/ۥۣ۟ۧ۟$ۥ۟;-><init>(LYue/ۥۣ۟ۧ۟;LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public ۥ۟(LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Typeface;

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۧ۟;->ۥ۟۟(Landroid/graphics/Typeface;)V

    goto :goto_0

    :cond_0
    iget p1, p1, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ۟:I

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۧ۟;->ۥ(I)V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟(Landroid/graphics/Typeface;)V
    .locals 3
    .param p1    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۧ۟;->ۥ:LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;

    iget-object v1, p0, LYue/ۥۣ۟ۧ۟;->ۥ۟:Landroid/os/Handler;

    new-instance v2, LYue/ۥۣ۟ۧ۟$ۥ;

    invoke-direct {v2, p0, v0, p1}, LYue/ۥۣ۟ۧ۟$ۥ;-><init>(LYue/ۥۣ۟ۧ۟;LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;Landroid/graphics/Typeface;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
