.class public LYue/ۥۢۢ۠ۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Ljava/lang/String; = "TransitionBuilder"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(LYue/ۥۡۡۥۥ;IILandroidx/constraintlayout/widget/ۥ۟۟۟۠;ILandroidx/constraintlayout/widget/ۥ۟۟۟۠;)LYue/ۥۡۡۥۥ$ۥ۟;
    .locals 1

    new-instance v0, LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-direct {v0, p1, p0, p2, p4}, LYue/ۥۡۡۥۥ$ۥ۟;-><init>(ILYue/ۥۡۡۥۥ;II)V

    invoke-static {p0, v0, p3, p5}, LYue/ۥۢۢ۠ۤ;->ۥ۟(LYue/ۥۡۡۥۥ;LYue/ۥۡۡۥۥ$ۥ۟;Landroidx/constraintlayout/widget/ۥ۟۟۟۠;Landroidx/constraintlayout/widget/ۥ۟۟۟۠;)V

    return-object v0
.end method

.method public static ۥ۟(LYue/ۥۡۡۥۥ;LYue/ۥۡۡۥۥ$ۥ۟;Landroidx/constraintlayout/widget/ۥ۟۟۟۠;Landroidx/constraintlayout/widget/ۥ۟۟۟۠;)V
    .locals 1

    invoke-virtual {p1}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟ۡۥ()I

    move-result v0

    invoke-virtual {p1}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟ۡ()I

    move-result p1

    invoke-virtual {p0, v0, p2}, LYue/ۥۡۡۥۥ;->ۥۣ۟۟۟(ILandroidx/constraintlayout/widget/ۥ۟۟۟۠;)V

    invoke-virtual {p0, p1, p3}, LYue/ۥۡۡۥۥ;->ۥۣ۟۟۟(ILandroidx/constraintlayout/widget/ۥ۟۟۟۠;)V

    return-void
.end method

.method public static ۥ۟۟(LYue/ۥۡۡۥۣ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, LYue/ۥۡۡۥۥ;->ۥۣ۟۟ۨ(LYue/ۥۡۡۥۣ;)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, v0, LYue/ۥۡۡۥۥ;->ۥ۟۟:LYue/ۥۡۡۥۥ$ۥ۟;

    if-eqz p0, :cond_0

    invoke-virtual {v0}, LYue/ۥۡۡۥۥ;->ۥ۟۟۠()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Invalid motion layout. Motion Scene doesn\'t have any transition."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "MotionLayout doesn\'t have the right motion scene."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Invalid motion layout. Layout missing Motion Scene."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
