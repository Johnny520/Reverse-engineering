.class public LYue/ۥۢ۠۟ۥ$ۥ;
.super LYue/ۥ۠۠۠ۦ$ۥ۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۠۟ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ۟۟ۡۨ:[[I


# direct methods
.method public constructor <init>(LYue/ۥۢ۠۟ۥ$ۥ;LYue/ۥۢ۠۟ۥ;Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LYue/ۥ۠۠۠ۦ$ۥ۟۟۟;-><init>(LYue/ۥ۠۠۠ۦ$ۥ۟۟۟;LYue/ۥ۠۠۠ۦ;Landroid/content/res/Resources;)V

    if-eqz p1, :cond_0

    iget-object p1, p1, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    iput-object p1, p0, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠۠۠ۦ$ۥ۟۟۟;->ۥ۟۟۟ۡ()I

    move-result p1

    new-array p1, p1, [[I

    iput-object p1, p0, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    :goto_0
    return-void
.end method


# virtual methods
.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 1
    new-instance v0, LYue/ۥۢ۠۟ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥۢ۠۟ۥ;-><init>(LYue/ۥۢ۠۟ۥ$ۥ;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 2
    new-instance v0, LYue/ۥۢ۠۟ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۢ۠۟ۥ;-><init>(LYue/ۥۢ۠۟ۥ$ۥ;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public ۥ۟۟۠ۡ(II)V
    .locals 2

    invoke-super {p0, p1, p2}, LYue/ۥ۠۠۠ۦ$ۥ۟۟۟;->ۥ۟۟۠ۡ(II)V

    new-array p2, p2, [[I

    iget-object v0, p0, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    const/4 v1, 0x0

    invoke-static {v0, v1, p2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p2, p0, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    return-void
.end method

.method public ۥ۟۟۠ۥ()V
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    array-length v1, v0

    new-array v1, v1, [[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v2, p0, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, [I->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    iput-object v1, p0, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    return-void
.end method

.method public ۥ۟۟ۡۢ([ILandroid/graphics/drawable/Drawable;)I
    .locals 1

    invoke-virtual {p0, p2}, LYue/ۥ۠۠۠ۦ$ۥ۟۟۟;->ۥ(Landroid/graphics/drawable/Drawable;)I

    move-result p2

    iget-object v0, p0, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    aput-object p1, v0, p2

    return p2
.end method

.method public ۥۣ۟۟ۡ([I)I
    .locals 4

    iget-object v0, p0, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۨ:[[I

    invoke-virtual {p0}, LYue/ۥ۠۠۠ۦ$ۥ۟۟۟;->ۥۣ۟۟۟()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-static {v3, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v3

    if-eqz v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method
