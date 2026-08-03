.class public Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۣ۟ۨۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;LYue/ۥۣ۟ۨۧ;)V
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    iput-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ۟:LYue/ۥۣ۟ۨۧ;

    return-void
.end method


# virtual methods
.method public final ۥ()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ۟:LYue/ۥۣ۟ۨۧ;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟۠(LYue/ۥۣ۟ۨۧ;)V

    return-void
.end method

.method public final ۥ۟()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥۣ۟ۨۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ۟:LYue/ۥۣ۟ۨۧ;

    return-object v0
.end method

.method public final ۥ۟۟۟()Z
    .locals 3

    sget-object v0, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;->ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    invoke-virtual {v1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    const-string v2, "operation.fragment.mView"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟$ۥ;->ۥ(Landroid/view/View;)Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    invoke-virtual {v1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;

    move-result-object v1

    if-eq v0, v1, :cond_1

    sget-object v2, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;->ۥ۟۟۠ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;

    if-eq v0, v2, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
