.class public final Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;
.super Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ۟۟:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟:Z

.field public final ۥ۟۟۟۟:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;LYue/ۥۣ۟ۨۧ;ZZ)V
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

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;

    move-result-object p2

    sget-object v0, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;->ۥ۟۟۠ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object p2

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getReenterTransition()Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getEnterTransition()Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object p2

    if-eqz p3, :cond_2

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getReturnTransition()Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getExitTransition()Ljava/lang/Object;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟:Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;

    move-result-object p2

    if-ne p2, v0, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getAllowReturnTransitionOverlap()Z

    move-result p2

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getAllowEnterTransitionOverlap()Z

    move-result p2

    goto :goto_1

    :cond_4
    const/4 p2, 0x1

    :goto_1
    iput-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟۟:Z

    if-eqz p4, :cond_6

    if-eqz p3, :cond_5

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getSharedElementReturnTransition()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getSharedElementEnterTransition()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    :goto_2
    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟۟۟:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ۥ۟۟۟۟()LYue/ۥۣ۠۟ۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۣ۠۟ۦ;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟۟۟:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۣ۠۟ۦ;

    move-result-object v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ۟()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned Transition "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " which uses a different Transition  type than its shared element transition "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟۟۟:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method public final ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۣ۠۟ۦ;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, LYue/ۥۣ۠۟ۤ;->ۥ۟:LYue/ۥۣ۠۟ۦ;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LYue/ۥۣ۠۟ۦ;->ۥ۟۟۟۟(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, LYue/ۥۣ۠۟ۤ;->ۥ۟۟:LYue/ۥۣ۠۟ۦ;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LYue/ۥۣ۠۟ۦ;->ۥ۟۟۟۟(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transition "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for fragment "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟;->ۥ۟()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid framework Transition or AndroidX Transition"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟ۡ()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟۟۟:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥۣ۟۟۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟۟۟:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۤ()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟$ۥ۟۟;->ۥ۟۟۟:Z

    return v0
.end method
