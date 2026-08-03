.class public final LYue/ۥۣ۠۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠۟۠$ۥ;,
        LYue/ۥۣ۠۟۠$ۥ۟۟;,
        LYue/ۥۣ۠۟۠$ۥ۟;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/view/DisplayCutout;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۥۣۡ;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;LYue/ۥ۠ۥۣۡ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p6    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    invoke-static/range {p1 .. p6}, LYue/ۥۣ۠۟۠;->ۥ(LYue/ۥ۠ۥۣۡ;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;LYue/ۥ۠ۥۣۡ;)Landroid/view/DisplayCutout;

    move-result-object p1

    invoke-direct {p0, p1}, LYue/ۥۣ۠۟۠;-><init>(Landroid/view/DisplayCutout;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Rect;Ljava/util/List;)V
    .locals 2
    .param p1    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2}, LYue/ۥۣ۠۟۠$ۥ;->ۥ(Landroid/graphics/Rect;Ljava/util/List;)Landroid/view/DisplayCutout;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1}, LYue/ۥۣ۠۟۠;-><init>(Landroid/view/DisplayCutout;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/DisplayCutout;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    return-void
.end method

.method public static ۥ(LYue/ۥ۠ۥۣۡ;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;LYue/ۥ۠ۥۣۡ;)Landroid/view/DisplayCutout;
    .locals 8
    .param p0    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p5    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object v2

    invoke-virtual {p5}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object v7

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v2 .. v7}, LYue/ۥۣ۠۟۠$ۥ۟۟;->ۥ(Landroid/graphics/Insets;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Insets;)Landroid/view/DisplayCutout;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p5, 0x1d

    if-lt v0, p5, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۢ()Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۣ۠۟۠$ۥ۟;->ۥ(Landroid/graphics/Insets;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/view/DisplayCutout;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 p5, 0x1c

    if-lt v0, p5, :cond_6

    new-instance p5, Landroid/graphics/Rect;

    iget v0, p0, LYue/ۥ۠ۥۣۡ;->ۥ:I

    iget v1, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    iget v2, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    iget p0, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    invoke-direct {p5, v0, v1, v2, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eqz p4, :cond_5

    invoke-virtual {p0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {p5, p0}, LYue/ۥۣ۠۟۠$ۥ;->ۥ(Landroid/graphics/Rect;Ljava/util/List;)Landroid/view/DisplayCutout;

    move-result-object p0

    return-object p0

    :cond_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۥۣ۟۟۟(Landroid/view/DisplayCutout;)LYue/ۥۣ۠۟۠;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۠۟۠;

    invoke-direct {v0, p0}, LYue/ۥۣ۠۟۠;-><init>(Landroid/view/DisplayCutout;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, LYue/ۥۣ۠۟۠;

    if-eq v1, v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LYue/ۥۣ۠۟۠;

    iget-object v0, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    iget-object p1, p1, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    invoke-static {v0, p1}, LYue/ۥۡۢۨ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, LYue/ۥۣ۠۟۟;->ۥ(Landroid/view/DisplayCutout;)I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DisplayCutoutCompat{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()Ljava/util/List;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    invoke-static {v0}, LYue/ۥۣ۠۟۠$ۥ;->ۥ۟(Landroid/view/DisplayCutout;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    invoke-static {v0}, LYue/ۥۣ۠۟۠$ۥ;->ۥ۟۟(Landroid/view/DisplayCutout;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    invoke-static {v0}, LYue/ۥۣ۠۟۠$ۥ;->ۥ۟۟۟(Landroid/view/DisplayCutout;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟۟()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    invoke-static {v0}, LYue/ۥۣ۠۟۠$ۥ;->ۥ۟۟۟۟(Landroid/view/DisplayCutout;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟۠()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    invoke-static {v0}, LYue/ۥۣ۠۟۠$ۥ;->ۥ۟۟۟۠(Landroid/view/DisplayCutout;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟ۡ()LYue/ۥ۠ۥۣۡ;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    invoke-static {v0}, LYue/ۥۣ۠۟۠$ۥ۟۟;->ۥ۟(Landroid/view/DisplayCutout;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟ۡ(Landroid/graphics/Insets;)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()Landroid/view/DisplayCutout;
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1c
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟۠;->ۥ:Landroid/view/DisplayCutout;

    return-object v0
.end method
