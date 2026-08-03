.class public LYue/ۥ۠ۦ۟ۤ;
.super LYue/ۥ۠ۦ۠۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۦۣ۟;


# annotations
.annotation build LYue/ۥۡۥۤ۠;
.end annotation


# instance fields
.field public final ۥ۟۟۠ۤ:Z


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦ۟ۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥ۠ۦ۠۟;-><init>(Z)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۦ(LYue/ۥ۠ۦ۟ۡ;)V

    invoke-virtual {p0}, LYue/ۥ۠ۦ۟ۤ;->ۥ۟۠۟ۧ()Z

    move-result p1

    iput-boolean p1, p0, LYue/ۥ۠ۦ۟ۤ;->ۥ۟۟۠ۤ:Z

    return-void
.end method


# virtual methods
.method public complete()Z
    .locals 1

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p0, v0}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟(Ljava/lang/Throwable;)Z
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    new-instance v0, LYue/ۥ۟ۦۣۢ;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, LYue/ۥ۟ۦۣۢ;-><init>(Ljava/lang/Throwable;ZILYue/ۥ۟ۨۥۢ;)V

    invoke-virtual {p0, v0}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟ۦ۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۦ۟ۤ;->ۥ۟۟۠ۤ:Z

    return v0
.end method

.method public ۥ۟۟ۦ۠()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۥ۟۠۟ۧ()Z
    .locals 4

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۢ()LYue/ۥ۟ۤۥۨ;

    move-result-object v0

    instance-of v1, v0, LYue/ۥ۟ۤۦ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥ۟ۤۦ;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦ۟()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۢ()LYue/ۥ۟ۤۥۨ;

    move-result-object v0

    instance-of v3, v0, LYue/ۥ۟ۤۦ;

    if-eqz v3, :cond_3

    check-cast v0, LYue/ۥ۟ۤۦ;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_4
    :goto_2
    return v1
.end method
