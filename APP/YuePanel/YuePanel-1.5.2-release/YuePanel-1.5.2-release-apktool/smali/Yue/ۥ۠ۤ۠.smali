.class public LYue/ۥ۠ۤ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۦۢۦ;


# instance fields
.field public final ۥ:LYue/ۥۢ۠۟۟;

.field public ۥ۟:I

.field public ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:F

.field public ۥ۟۟۟ۡ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LYue/ۥۢ۠۟۟;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟:I

    iput v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۟:I

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۠:F

    iput-object p1, p0, LYue/ۥ۠ۤ۠;->ۥ:LYue/ۥۢ۠۟۟;

    return-void
.end method


# virtual methods
.method public apply()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

    iget v1, p0, LYue/ۥ۠ۤ۠;->ۥ۟:I

    invoke-virtual {v0, v1}, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠ۡ(I)V

    iget v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

    invoke-virtual {v1, v0}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۢۧ(I)V

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۟:I

    if-eq v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

    invoke-virtual {v1, v0}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۢۨ(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

    iget v1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۠:F

    invoke-virtual {v0, v1}, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠(F)V

    :goto_0
    return-void
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟ۡ:Ljava/lang/Object;

    return-object v0
.end method

.method public ۥ(LYue/ۥ۟ۧ۟ۢ;)V
    .locals 1

    instance-of v0, p1, LYue/ۥ۠ۤ۟ۧ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۠ۤ۟ۧ;

    iput-object p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

    :goto_0
    return-void
.end method

.method public ۥ۟(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟ۡ:Ljava/lang/Object;

    return-void
.end method

.method public ۥ۟۟()LYue/ۥ۟ۧ۟ۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۠ۤ۟ۧ;

    invoke-direct {v0}, LYue/ۥ۠ۤ۟ۧ;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟:LYue/ۥ۠ۤ۟ۧ;

    return-object v0
.end method

.method public ۥ۟۟۟(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟:I

    iget-object v0, p0, LYue/ۥ۠ۤ۠;->ۥ:LYue/ۥۢ۠۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢ۠۟۟;->ۥ۟۟۟۠(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۟:I

    const/4 p1, 0x0

    iput p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۠:F

    return-void
.end method

.method public ۥ۟۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟۟۠(F)V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟:I

    iput v0, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۟:I

    iput p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۠:F

    return-void
.end method

.method public ۥ۟۟۟ۡ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟:I

    return-void
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤ۠;->ۥ:LYue/ۥۢ۠۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢ۠۟۟;->ۥ۟۟۟۠(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟:I

    const/4 p1, -0x1

    iput p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۟:I

    const/4 p1, 0x0

    iput p1, p0, LYue/ۥ۠ۤ۠;->ۥ۟۟۟۠:F

    return-void
.end method
