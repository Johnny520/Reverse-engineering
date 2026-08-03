.class public final LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۦۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/content/res/Resources;

.field public final ۥ۟:Landroid/content/res/Resources$Theme;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V
    .locals 0
    .param p1    # Landroid/content/res/Resources;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources$Theme;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;->ۥ:Landroid/content/res/Resources;

    iput-object p2, p0, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;->ۥ۟:Landroid/content/res/Resources$Theme;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;

    if-eq v3, v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;

    iget-object v2, p0, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;->ۥ:Landroid/content/res/Resources;

    iget-object v3, p1, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;->ۥ:Landroid/content/res/Resources;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;->ۥ۟:Landroid/content/res/Resources$Theme;

    iget-object p1, p1, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;->ۥ۟:Landroid/content/res/Resources$Theme;

    invoke-static {v2, p1}, LYue/ۥۡۢۨ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;->ۥ:Landroid/content/res/Resources;

    iget-object v1, p0, LYue/ۥۡۦۦۣ$ۥ۟۟۟۟;->ۥ۟:Landroid/content/res/Resources$Theme;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢۨ;->ۥ۟([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
