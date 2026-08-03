.class public LYue/ۥۢۤۦۢ$ۥ۟۟۟۠;
.super LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# instance fields
.field public final synthetic ۥ۟:LYue/ۥۢۤۦۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ;)V
    .locals 1

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟۠;->ۥ۟:LYue/ۥۢۤۦۢ;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;-><init>(LYue/ۥۢۤۦۢ;LYue/ۥۢۤۦۢ$ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟(I)Z
    .locals 1

    const/16 v0, 0x2000

    if-eq p1, v0, :cond_0

    const/16 v0, 0x1000

    if-ne p1, v0, :cond_1

    :cond_0
    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟۠;->ۥ۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۦ()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥ۟۟ۥۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟۟ۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟۠;->ۥ۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥ۟۟ۥۧ$ۥ;->ۥ۟۟۠ۢ:LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۧۦ(LYue/ۥ۟۟ۥۧ$ۥ;)Z

    sget-object v0, LYue/ۥ۟۟ۥۧ$ۥ;->ۥ۟۟۠ۡ:LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۧۦ(LYue/ۥ۟۟ۥۧ$ۥ;)Z

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۢۤ(Z)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۥ(I)Z
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۠;->ۥ۟(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public ۥ۟۟۟ۨ()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۠;->ۥ۟۟۟()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "androidx.viewpager.widget.ViewPager"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
