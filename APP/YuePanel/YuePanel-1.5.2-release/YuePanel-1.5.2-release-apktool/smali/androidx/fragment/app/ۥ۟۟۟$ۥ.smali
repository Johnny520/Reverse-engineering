.class public final Landroidx/fragment/app/ۥ۟۟۟$ۥ;
.super Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ۟۟:Z

.field public ۥ۟۟۟:Z

.field public ۥ۟۟۟۟:Landroidx/fragment/app/ۥ۟۟۟۠$ۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;LYue/ۥۣ۟ۨۧ;Z)V
    .locals 1
    .param p1    # Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۨۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "operation"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signal"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;-><init>(Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;LYue/ۥۣ۟ۨۧ;)V

    iput-boolean p3, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ;->ۥ۟۟:Z

    return-void
.end method


# virtual methods
.method public final ۥ۟۟۟۟(Landroid/content/Context;)Landroidx/fragment/app/ۥ۟۟۟۠$ۥ;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ;->ۥ۟۟۟۟:Landroidx/fragment/app/ۥ۟۟۟۠$ۥ;

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ۟()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ۟()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;

    move-result-object v1

    sget-object v2, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;->ۥ۟۟۠ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ;->ۥ۟۟:Z

    invoke-static {p1, v0, v1, v2}, Landroidx/fragment/app/ۥ۟۟۟۠;->ۥ۟(Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Landroidx/fragment/app/ۥ۟۟۟۠$ۥ;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ;->ۥ۟۟۟۟:Landroidx/fragment/app/ۥ۟۟۟۠$ۥ;

    iput-boolean v3, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ;->ۥ۟۟۟:Z

    :goto_1
    return-object p1
.end method
