.class public final LYue/ۥۣ۟ۧۡ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۧۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۧۡ;)V
    .locals 2
    .param p1    # LYue/ۥۣ۟ۧۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۧۡ$ۥ۟۟;-><init>(LYue/ۥۣ۟ۧۡ;)V

    iput-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;-><init>(LYue/ۥۣ۟ۧۡ;)V

    iput-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 2
    .param p1    # Landroid/content/ClipData;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 7
    new-instance v0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;

    invoke-direct {v0, p1, p2}, LYue/ۥۣ۟ۧۡ$ۥ۟۟;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;

    invoke-direct {v0, p1, p2}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    :goto_0
    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥۣ۟ۧۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    invoke-interface {v0}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;->build()LYue/ۥۣ۟ۧۡ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟(Landroid/content/ClipData;)LYue/ۥۣ۟ۧۡ$ۥ۟;
    .locals 1
    .param p1    # Landroid/content/ClipData;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;->ۥ۟۟۟۟(Landroid/content/ClipData;)V

    return-object p0
.end method

.method public ۥ۟۟(Landroid/os/Bundle;)LYue/ۥۣ۟ۧۡ$ۥ۟;
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;->ۥ۟(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public ۥ۟۟۟(I)LYue/ۥۣ۟ۧۡ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;->ۥ۟۟۟(I)V

    return-object p0
.end method

.method public ۥ۟۟۟۟(Landroid/net/Uri;)LYue/ۥۣ۟ۧۡ$ۥ۟;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;->ۥ۟۟(Landroid/net/Uri;)V

    return-object p0
.end method

.method public ۥ۟۟۟۠(I)LYue/ۥۣ۟ۧۡ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟;->ۥ:LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;->ۥ(I)V

    return-object p0
.end method
