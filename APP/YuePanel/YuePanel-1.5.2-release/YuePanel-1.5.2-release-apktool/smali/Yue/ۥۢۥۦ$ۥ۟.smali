.class public final LYue/ۥۢۥۦ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟۟;

    invoke-direct {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟۟;-><init>()V

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟;

    invoke-direct {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟;-><init>()V

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟;

    invoke-direct {v0}, LYue/ۥۢۥۦ$ۥ۟۟;-><init>()V

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    :goto_0
    return-void
.end method

.method public constructor <init>(LYue/ۥۢۥۦ;)V
    .locals 2
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 8
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟۟;

    invoke-direct {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟۟;-><init>(LYue/ۥۢۥۦ;)V

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 9
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟;

    invoke-direct {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟;-><init>(LYue/ۥۢۥۦ;)V

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    goto :goto_0

    .line 10
    :cond_1
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟;

    invoke-direct {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟;-><init>(LYue/ۥۢۥۦ;)V

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    :goto_0
    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟()LYue/ۥۢۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟(LYue/ۥۣ۠۟۠;)LYue/ۥۢۥۦ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥۣ۠۟۠;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟۟(LYue/ۥۣ۠۟۠;)V

    return-object p0
.end method

.method public ۥ۟۟(ILYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;
    .locals 1
    .param p2    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟۟۟(ILYue/ۥ۠ۥۣۡ;)V

    return-object p0
.end method

.method public ۥ۟۟۟(ILYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;
    .locals 1
    .param p2    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟۟۟۟(ILYue/ۥ۠ۥۣۡ;)V

    return-object p0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟۟۟۠(LYue/ۥ۠ۥۣۡ;)V

    return-object p0
.end method

.method public ۥ۟۟۟۠(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟۟۟ۡ(LYue/ۥ۠ۥۣۡ;)V

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟۟۟ۢ(LYue/ۥ۠ۥۣۡ;)V

    return-object p0
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥۣ۟۟۟(LYue/ۥ۠ۥۣۡ;)V

    return-object p0
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟۟۟ۤ(LYue/ۥ۠ۥۣۡ;)V

    return-object p0
.end method

.method public ۥ۟۟۟ۤ(IZ)LYue/ۥۢۥۦ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟۠;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۥۦ$ۥ۟۟۟۠;->ۥ۟۟۟ۥ(IZ)V

    return-object p0
.end method
