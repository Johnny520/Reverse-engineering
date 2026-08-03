.class public LYue/ۥ۟۠ۦۥ$ۥ۟۟;
.super LYue/ۥۢ۠۟ۥ$ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ۟۟ۢ۠:J = 0x100000000L

.field public static final ۥ۟۟ۢۡ:J = 0x200000000L


# instance fields
.field public ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e3\u06e2<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟ۢ۟:LYue/ۥۢ۟ۦ۠;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e6\u06e0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۠ۦۥ$ۥ۟۟;LYue/ۥ۟۠ۦۥ;Landroid/content/res/Resources;)V
    .locals 0
    .param p1    # LYue/ۥ۟۠ۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟۠ۦۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/content/res/Resources;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2, p3}, LYue/ۥۢ۠۟ۥ$ۥ;-><init>(LYue/ۥۢ۠۟ۥ$ۥ;LYue/ۥۢ۠۟ۥ;Landroid/content/res/Resources;)V

    if-eqz p1, :cond_0

    iget-object p2, p1, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    iput-object p2, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    iget-object p1, p1, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ۟:LYue/ۥۢ۟ۦ۠;

    iput-object p1, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ۟:LYue/ۥۢ۟ۦ۠;

    goto :goto_0

    :cond_0
    new-instance p1, LYue/ۥۣ۠ۨۢ;

    invoke-direct {p1}, LYue/ۥۣ۠ۨۢ;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    new-instance p1, LYue/ۥۢ۟ۦ۠;

    invoke-direct {p1}, LYue/ۥۢ۟ۦ۠;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ۟:LYue/ۥۢ۟ۦ۠;

    :goto_0
    return-void
.end method

.method public static ۥ۟۟ۡۦ(II)J
    .locals 2

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    or-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 1
    new-instance v0, LYue/ۥ۟۠ۦۥ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥ۟۠ۦۥ;-><init>(LYue/ۥ۟۠ۦۥ$ۥ۟۟;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 2
    new-instance v0, LYue/ۥ۟۠ۦۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۟۠ۦۥ;-><init>(LYue/ۥ۟۠ۦۥ$ۥ۟۟;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public ۥ۟۟۠ۥ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟۟()LYue/ۥۣ۠ۨۢ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    iget-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ۟:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v0}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۟۟()LYue/ۥۢ۟ۦ۠;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ۟:LYue/ۥۢ۟ۦ۠;

    return-void
.end method

.method public ۥ۟۟ۡۤ([ILandroid/graphics/drawable/Drawable;I)I
    .locals 0
    .param p1    # [I
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, LYue/ۥۢ۠۟ۥ$ۥ;->ۥ۟۟ۡۢ([ILandroid/graphics/drawable/Drawable;)I

    move-result p1

    iget-object p2, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ۟:LYue/ۥۢ۟ۦ۠;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۠۠(ILjava/lang/Object;)V

    return p1
.end method

.method public ۥ۟۟ۡۥ(IILandroid/graphics/drawable/Drawable;Z)I
    .locals 9
    .param p3    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p3}, LYue/ۥ۠۠۠ۦ$ۥ۟۟۟;->ۥ(Landroid/graphics/drawable/Drawable;)I

    move-result p3

    invoke-static {p1, p2}, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۡۦ(II)J

    move-result-wide v0

    if-eqz p4, :cond_0

    const-wide v2, 0x200000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    iget-object v4, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    int-to-long v5, p3

    or-long v7, v5, v2

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v4, v0, v1, v7}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟(JLjava/lang/Object;)V

    if-eqz p4, :cond_1

    invoke-static {p2, p1}, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۡۦ(II)J

    move-result-wide p1

    iget-object p4, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    const-wide v0, 0x100000000L

    or-long/2addr v0, v5

    or-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p4, p1, p2, v0}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟(JLjava/lang/Object;)V

    :cond_1
    return p3
.end method

.method public ۥ۟۟ۡۧ(I)I
    .locals 2

    const/4 v0, 0x0

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ۟:LYue/ۥۢ۟ۦ۠;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۟ۥ(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۡۨ([I)I
    .locals 0
    .param p1    # [I
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1}, LYue/ۥۢ۠۟ۥ$ۥ;->ۥۣ۟۟ۡ([I)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    sget-object p1, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-super {p0, p1}, LYue/ۥۢ۠۟ۥ$ۥ;->ۥۣ۟۟ۡ([I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟ۢ(II)I
    .locals 3

    invoke-static {p1, p2}, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۡۦ(II)J

    move-result-wide p1

    iget-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    const-wide/16 v1, -0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟ۥ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    long-to-int p1, p1

    return p1
.end method

.method public ۥ۟۟ۢ۟(II)Z
    .locals 3

    invoke-static {p1, p2}, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۡۦ(II)J

    move-result-wide p1

    iget-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    const-wide/16 v1, -0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟ۥ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    const-wide v0, 0x100000000L

    and-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟ۢ۠(II)Z
    .locals 3

    invoke-static {p1, p2}, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۡۦ(II)J

    move-result-wide p1

    iget-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۣ۠ۨۢ;

    const-wide/16 v1, -0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟ۥ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    const-wide v0, 0x200000000L

    and-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
