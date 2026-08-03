.class public LYue/ۥۢۥۦ$ۥۣ۟۟۟;
.super LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1c
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥۣ۟۟۟;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۥۦ$ۥۣ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1, p2}, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;-><init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/WindowInsets;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;-><init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥۢۥۦ$ۥۣ۟۟۟;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥۢۥۦ$ۥۣ۟۟۟;

    iget-object v1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    iget-object v3, p1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥۣۡ;

    iget-object p1, p1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥۣۡ;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I

    move-result v0

    return v0
.end method

.method public ۥ()LYue/ۥۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-static {v0}, LYue/ۥۢۥۧۡ;->ۥ(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ(Landroid/view/WindowInsets;)LYue/ۥۢۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۠()LYue/ۥۣ۠۟۠;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-static {v0}, LYue/ۥۢۥۧ۠;->ۥ(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۠۟۠;->ۥۣ۟۟۟(Landroid/view/DisplayCutout;)LYue/ۥۣ۠۟۠;

    move-result-object v0

    return-object v0
.end method
