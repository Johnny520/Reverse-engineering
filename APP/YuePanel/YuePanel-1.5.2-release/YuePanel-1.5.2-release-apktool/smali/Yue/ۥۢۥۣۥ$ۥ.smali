.class public final LYue/ۥۢۥۣۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠ۥۣۡ;

.field public final ۥ۟:LYue/ۥ۠ۥۣۡ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۥۣۡ;LYue/ۥ۠ۥۣۡ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ:LYue/ۥ۠ۥۣۡ;

    .line 3
    iput-object p2, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ۟:LYue/ۥ۠ۥۣۡ;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1
    .param p1    # Landroid/view/WindowInsetsAnimation$Bounds;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟ۥ(Landroid/view/WindowInsetsAnimation$Bounds;)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ:LYue/ۥ۠ۥۣۡ;

    .line 6
    invoke-static {p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥ۟۟۟ۤ(Landroid/view/WindowInsetsAnimation$Bounds;)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ۟:LYue/ۥ۠ۥۣۡ;

    return-void
.end method

.method public static ۥ۟۟۟۟(Landroid/view/WindowInsetsAnimation$Bounds;)LYue/ۥۢۥۣۥ$ۥ;
    .locals 1
    .param p0    # Landroid/view/WindowInsetsAnimation$Bounds;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    new-instance v0, LYue/ۥۢۥۣۥ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۢۥۣۥ$ۥ;-><init>(Landroid/view/WindowInsetsAnimation$Bounds;)V

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bounds{lower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ:LYue/ۥ۠ۥۣۡ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ۟:LYue/ۥ۠ۥۣۡ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ:LYue/ۥ۠ۥۣۡ;

    return-object v0
.end method

.method public ۥ۟()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ۟:LYue/ۥ۠ۥۣۡ;

    return-object v0
.end method

.method public ۥ۟۟(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۣۥ$ۥ;
    .locals 6
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۢۥۣۥ$ۥ;

    iget-object v1, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ:LYue/ۥ۠ۥۣۡ;

    iget v2, p1, LYue/ۥ۠ۥۣۡ;->ۥ:I

    iget v3, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    iget v4, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    iget v5, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    invoke-static {v1, v2, v3, v4, v5}, LYue/ۥۢۥۦ;->ۥ۟۟ۡ(LYue/ۥ۠ۥۣۡ;IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۢۥۣۥ$ۥ;->ۥ۟:LYue/ۥ۠ۥۣۡ;

    iget v3, p1, LYue/ۥ۠ۥۣۡ;->ۥ:I

    iget v4, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    iget v5, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    invoke-static {v2, v3, v4, v5, p1}, LYue/ۥۢۥۦ;->ۥ۟۟ۡ(LYue/ۥ۠ۥۣۡ;IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LYue/ۥۢۥۣۥ$ۥ;-><init>(LYue/ۥ۠ۥۣۡ;LYue/ۥ۠ۥۣۡ;)V

    return-object v0
.end method

.method public ۥ۟۟۟()Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    invoke-static {p0}, LYue/ۥۢۥۣۥ$ۥ۟۟۟;->ۥۣ۟۟۟(LYue/ۥۢۥۣۥ$ۥ;)Landroid/view/WindowInsetsAnimation$Bounds;

    move-result-object v0

    return-object v0
.end method
