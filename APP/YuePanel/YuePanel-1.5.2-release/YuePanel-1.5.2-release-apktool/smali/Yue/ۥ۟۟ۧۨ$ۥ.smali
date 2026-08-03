.class public LYue/ۥ۟۟ۧۨ$ۥ;
.super LYue/ۥ۟۟ۧۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۧۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ۟۟:Landroid/app/ActivityOptions;


# direct methods
.method public constructor <init>(Landroid/app/ActivityOptions;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟۟ۧۨ;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟ۧۨ$ۥ;->ۥ۟۟:Landroid/app/ActivityOptions;

    return-void
.end method


# virtual methods
.method public ۥ()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۧۨ$ۥ;->ۥ۟۟:Landroid/app/ActivityOptions;

    invoke-static {v0}, LYue/ۥ۟۟ۧۨ$ۥ۟۟۟;->ۥ(Landroid/app/ActivityOptions;)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۤ(Landroid/app/PendingIntent;)V
    .locals 1
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟۟ۧۨ$ۥ;->ۥ۟۟:Landroid/app/ActivityOptions;

    invoke-static {v0, p1}, LYue/ۥ۟۟ۧۨ$ۥ۟۟;->ۥ۟۟(Landroid/app/ActivityOptions;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public ۥ۟۟۟ۥ(Landroid/graphics/Rect;)LYue/ۥ۟۟ۧۨ;
    .locals 2
    .param p1    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥ۟۟ۧۨ$ۥ;

    iget-object v1, p0, LYue/ۥ۟۟ۧۨ$ۥ;->ۥ۟۟:Landroid/app/ActivityOptions;

    invoke-static {v1, p1}, LYue/ۥ۟۟ۧۨ$ۥ۟۟۟;->ۥ۟(Landroid/app/ActivityOptions;Landroid/graphics/Rect;)Landroid/app/ActivityOptions;

    move-result-object p1

    invoke-direct {v0, p1}, LYue/ۥ۟۟ۧۨ$ۥ;-><init>(Landroid/app/ActivityOptions;)V

    return-object v0
.end method

.method public ۥ۟۟۟ۦ(Z)LYue/ۥ۟۟ۧۨ;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-ge v0, v1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥ۟۟ۧۨ$ۥ;

    iget-object v1, p0, LYue/ۥ۟۟ۧۨ$ۥ;->ۥ۟۟:Landroid/app/ActivityOptions;

    invoke-static {v1, p1}, LYue/ۥ۟۟ۧۨ$ۥ۟۟۟۟;->ۥ(Landroid/app/ActivityOptions;Z)Landroid/app/ActivityOptions;

    move-result-object p1

    invoke-direct {v0, p1}, LYue/ۥ۟۟ۧۨ$ۥ;-><init>(Landroid/app/ActivityOptions;)V

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۧۨ$ۥ;->ۥ۟۟:Landroid/app/ActivityOptions;

    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥ۟۟ۧۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۟۟ۧۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥ۟۟ۧۨ$ۥ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۟۟ۧۨ$ۥ;

    iget-object v0, p0, LYue/ۥ۟۟ۧۨ$ۥ;->ۥ۟۟:Landroid/app/ActivityOptions;

    iget-object p1, p1, LYue/ۥ۟۟ۧۨ$ۥ;->ۥ۟۟:Landroid/app/ActivityOptions;

    invoke-virtual {v0, p1}, Landroid/app/ActivityOptions;->update(Landroid/app/ActivityOptions;)V

    :cond_0
    return-void
.end method
