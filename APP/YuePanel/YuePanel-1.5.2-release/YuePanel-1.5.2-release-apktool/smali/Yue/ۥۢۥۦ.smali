.class public LYue/ۥۢۥۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥۦ$ۥ۟۟۟ۥ;,
        LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;,
        LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;,
        LYue/ۥۢۥۦ$ۥۣ۟۟۟;,
        LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;,
        LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;,
        LYue/ۥۢۥۦ$ۥ۟۟۟ۧ;,
        LYue/ۥۢۥۦ$ۥ۟;,
        LYue/ۥۢۥۦ$ۥ;,
        LYue/ۥۢۥۦ$ۥ۟۟۟ۨ;,
        LYue/ۥۢۥۦ$ۥ۟۟۟۟;,
        LYue/ۥۢۥۦ$ۥ۟۟۟;,
        LYue/ۥۢۥۦ$ۥ۟۟;,
        LYue/ۥۢۥۦ$ۥ۟۟۟۠;
    }
.end annotation


# static fields
.field public static final ۥ۟:Ljava/lang/String; = "WindowInsetsCompat"

.field public static final ۥ۟۟:LYue/ۥۢۥۦ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# instance fields
.field public final ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۥ;->ۥ۟۟۠۠:LYue/ۥۢۥۦ;

    sput-object v0, LYue/ۥۢۥۦ;->ۥ۟۟:LYue/ۥۢۥۦ;

    goto :goto_0

    :cond_0
    sget-object v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥۢۥۦ;

    sput-object v0, LYue/ۥۢۥۦ;->ۥ۟۟:LYue/ۥۢۥۦ;

    :goto_0
    return-void
.end method

.method public constructor <init>(LYue/ۥۢۥۦ;)V
    .locals 2
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    .line 8
    iget-object p1, p1, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, LYue/ۥۢۥۦ$ۥ۟۟۟ۥ;

    if-eqz v1, :cond_0

    .line 10
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۥ;

    move-object v1, p1

    check-cast v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۥ;

    invoke-direct {v0, p0, v1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۥ;-><init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥ۟۟۟ۥ;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 11
    instance-of v1, p1, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;

    if-eqz v1, :cond_1

    .line 12
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;

    move-object v1, p1

    check-cast v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;

    invoke-direct {v0, p0, v1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;-><init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 13
    instance-of v0, p1, LYue/ۥۢۥۦ$ۥۣ۟۟۟;

    if-eqz v0, :cond_2

    .line 14
    new-instance v0, LYue/ۥۢۥۦ$ۥۣ۟۟۟;

    move-object v1, p1

    check-cast v1, LYue/ۥۢۥۦ$ۥۣ۟۟۟;

    invoke-direct {v0, p0, v1}, LYue/ۥۢۥۦ$ۥۣ۟۟۟;-><init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥۣ۟۟۟;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    goto :goto_0

    .line 15
    :cond_2
    instance-of v0, p1, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;

    if-eqz v0, :cond_3

    .line 16
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;

    move-object v1, p1

    check-cast v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;

    invoke-direct {v0, p0, v1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;-><init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    goto :goto_0

    .line 17
    :cond_3
    instance-of v0, p1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;

    if-eqz v0, :cond_4

    .line 18
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;

    move-object v1, p1

    check-cast v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;

    invoke-direct {v0, p0, v1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    goto :goto_0

    .line 19
    :cond_4
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-direct {v0, p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;-><init>(LYue/ۥۢۥۦ;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    .line 20
    :goto_0
    invoke-virtual {p1, p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟(LYue/ۥۢۥۦ;)V

    goto :goto_1

    .line 21
    :cond_5
    new-instance p1, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-direct {p1, p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;-><init>(LYue/ۥۢۥۦ;)V

    iput-object p1, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    :goto_1
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2
    .param p1    # Landroid/view/WindowInsets;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۥ;-><init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۤ;-><init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, LYue/ۥۢۥۦ$ۥۣ۟۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۥۦ$ۥۣ۟۟۟;-><init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    goto :goto_0

    .line 6
    :cond_2
    new-instance v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۢ;-><init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    :goto_0
    return-void
.end method

.method public static ۥ۟۟ۡ(LYue/ۥ۠ۥۣۡ;IIII)LYue/ۥ۠ۥۣۡ;
    .locals 5
    .param p0    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget v0, p0, LYue/ۥ۠ۥۣۡ;->ۥ:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۢ(Landroid/view/WindowInsets;)LYue/ۥۢۥۦ;
    .locals 1
    .param p0    # Landroid/view/WindowInsets;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ۟(Landroid/view/WindowInsets;Landroid/view/View;)LYue/ۥۢۥۦ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۢ۟(Landroid/view/WindowInsets;Landroid/view/View;)LYue/ۥۢۥۦ;
    .locals 1
    .param p0    # Landroid/view/WindowInsets;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    new-instance v0, LYue/ۥۢۥۦ;

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, LYue/ۥۢۥۦ;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۥ(Landroid/view/View;)LYue/ۥۢۥۦ;

    move-result-object p0

    invoke-virtual {v0, p0}, LYue/ۥۢۥۦ;->ۥ۟۟ۡۦ(LYue/ۥۢۥۦ;)V

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, LYue/ۥۢۥۦ;->ۥ۟۟۟(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LYue/ۥۢۥۦ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LYue/ۥۢۥۦ;

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    iget-object p1, p1, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-static {v0, p1}, LYue/ۥۡۢۨ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public ۥ()LYue/ۥۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ()LYue/ۥۢۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()LYue/ۥۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟()LYue/ۥۢۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()LYue/ۥۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟()LYue/ۥۢۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟(Landroid/view/View;)V

    return-void
.end method

.method public ۥ۟۟۟۟()LYue/ۥۣ۠۟۠;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۠()LYue/ۥۣ۠۟۠;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ(I)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(I)LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۢ(I)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۢ()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥۣ۟۟۟()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟۟()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iget v0, v0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    return v0
.end method

.method public ۥ۟۟۟ۤ()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iget v0, v0, LYue/ۥ۠ۥۣۡ;->ۥ:I

    return v0
.end method

.method public ۥ۟۟۟ۥ()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iget v0, v0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟۟۟ۦ()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iget v0, v0, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟۟ۧ()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۨ()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۥ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iget v0, v0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    return v0
.end method

.method public ۥ۟۟۠۟()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iget v0, v0, LYue/ۥ۠ۥۣۡ;->ۥ:I

    return v0
.end method

.method public ۥ۟۟۠۠()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iget v0, v0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟۟۠ۡ()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iget v0, v0, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟۠ۢ()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟۠()LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۧ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۤ()Z
    .locals 3

    invoke-static {}, LYue/ۥۢۥۦ$ۥ۟۟۟ۧ;->ۥ()I

    move-result v0

    invoke-virtual {p0, v0}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    invoke-virtual {v0, v1}, LYue/ۥ۠ۥۣۡ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LYue/ۥۢۥۦ$ۥ۟۟۟ۧ;->ۥ()I

    move-result v0

    invoke-static {}, LYue/ۥۢۥۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟()I

    move-result v2

    xor-int/2addr v0, v2

    invoke-virtual {p0, v0}, LYue/ۥۢۥۦ;->ۥ۟۟۟ۡ(I)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    invoke-virtual {v0, v1}, LYue/ۥ۠ۥۣۡ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۢۥۦ;->ۥ۟۟۟۟()LYue/ۥۣ۠۟۠;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public ۥ۟۟۠ۥ()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    invoke-virtual {v0, v1}, LYue/ۥ۠ۥۣۡ;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public ۥ۟۟۠ۦ()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    invoke-virtual {v0, v1}, LYue/ۥ۠ۥۣۡ;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public ۥ۟۟۠ۧ(IIII)LYue/ۥۢۥۦ;
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p4    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0, p1, p2, p3, p4}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۨ(IIII)LYue/ۥۢۥۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۨ(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ;
    .locals 3
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget v0, p1, LYue/ۥ۠ۥۣۡ;->ۥ:I

    iget v1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    iget v2, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    invoke-virtual {p0, v0, v1, v2, p1}, LYue/ۥۢۥۦ;->ۥ۟۟۠ۧ(IIII)LYue/ۥۢۥۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡ۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۠()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۡ۠()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۠۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۡۡ(I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۠۠(I)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟ۡۢ(IIII)LYue/ۥۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LYue/ۥۢۥۦ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۢۥۦ$ۥ۟;-><init>(LYue/ۥۢۥۦ;)V

    invoke-static {p1, p2, p3, p4}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟;->ۥ۟۟۟ۢ(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۢۥۦ$ۥ۟;->ۥ()LYue/ۥۢۥۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟ۡ(Landroid/graphics/Rect;)LYue/ۥۢۥۦ;
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LYue/ۥۢۥۦ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۢۥۦ$ۥ۟;-><init>(LYue/ۥۢۥۦ;)V

    invoke-static {p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟(Landroid/graphics/Rect;)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟;->ۥ۟۟۟ۢ(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۢۥۦ$ۥ۟;->ۥ()LYue/ۥۢۥۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۤ([LYue/ۥ۠ۥۣۡ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۡ([LYue/ۥ۠ۥۣۡ;)V

    return-void
.end method

.method public ۥ۟۟ۡۥ(LYue/ۥ۠ۥۣۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۢ(LYue/ۥ۠ۥۣۡ;)V

    return-void
.end method

.method public ۥ۟۟ۡۦ(LYue/ۥۢۥۦ;)V
    .locals 1
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥۣ۟۟۠(LYue/ۥۢۥۦ;)V

    return-void
.end method

.method public ۥ۟۟ۡۧ(LYue/ۥ۠ۥۣۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ(LYue/ۥ۠ۥۣۡ;)V

    return-void
.end method

.method public ۥ۟۟ۡۨ()Landroid/view/WindowInsets;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ;->ۥ:LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;

    instance-of v1, v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;

    iget-object v0, v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
