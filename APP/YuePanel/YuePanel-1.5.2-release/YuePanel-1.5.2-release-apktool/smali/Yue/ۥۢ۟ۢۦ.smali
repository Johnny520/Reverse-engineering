.class public final LYue/ۥۢ۟ۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢ۟ۢۦ$ۥ۟;,
        LYue/ۥۢ۟ۢۦ$ۥ۟۟;,
        LYue/ۥۢ۟ۢۦ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۢ۟ۢۦ$ۥ۟۟;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LYue/ۥۢ۟ۢۦ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥۢ۟ۢۦ$ۥ۟;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LYue/ۥۢ۟ۢۦ;->ۥ:LYue/ۥۢ۟ۢۦ$ۥ۟۟;

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, LYue/ۥۢ۟ۢۦ$ۥ;

    invoke-direct {v0, p1}, LYue/ۥۢ۟ۢۦ$ۥ;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LYue/ۥۢ۟ۢۦ;->ۥ:LYue/ۥۢ۟ۢۦ$ۥ۟۟;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 1
    .param p1    # Landroid/view/WindowInsetsController;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LYue/ۥۢ۟ۢۦ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥۢ۟ۢۦ$ۥ۟;-><init>(Landroid/view/WindowInsetsController;)V

    iput-object v0, p0, LYue/ۥۢ۟ۢۦ;->ۥ:LYue/ۥۢ۟ۢۦ$ۥ۟۟;

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۢۦ;->ۥ:LYue/ۥۢ۟ۢۦ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥۢ۟ۢۦ$ۥ۟۟;->ۥ()V

    return-void
.end method

.method public ۥ۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۢۦ;->ۥ:LYue/ۥۢ۟ۢۦ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥۢ۟ۢۦ$ۥ۟۟;->ۥ۟()V

    return-void
.end method
