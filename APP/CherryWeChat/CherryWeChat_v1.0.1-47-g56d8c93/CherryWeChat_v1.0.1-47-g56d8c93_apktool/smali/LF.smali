.class public final LLF;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:LLF;


# instance fields
.field public final a:LHF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, LGF;->s:LLF;

    sput-object v0, LLF;->b:LLF;

    return-void

    :cond_0
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    sget-object v0, LEF;->r:LLF;

    sput-object v0, LLF;->b:LLF;

    return-void

    :cond_1
    sget-object v0, LHF;->b:LLF;

    sput-object v0, LLF;->b:LLF;

    return-void
.end method

.method public constructor <init>(LLF;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_7

    .line 9
    iget-object p1, p1, LLF;->a:LHF;

    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    instance-of v1, p1, LGF;

    if-eqz v1, :cond_0

    .line 11
    new-instance v0, LGF;

    move-object v1, p1

    check-cast v1, LGF;

    invoke-direct {v0, p0, v1}, LGF;-><init>(LLF;LGF;)V

    iput-object v0, p0, LLF;->a:LHF;

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 12
    instance-of v1, p1, LFF;

    if-eqz v1, :cond_1

    .line 13
    new-instance v0, LFF;

    move-object v1, p1

    check-cast v1, LFF;

    invoke-direct {v0, p0, v1}, LFF;-><init>(LLF;LFF;)V

    iput-object v0, p0, LLF;->a:LHF;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 14
    instance-of v1, p1, LEF;

    if-eqz v1, :cond_2

    .line 15
    new-instance v0, LEF;

    move-object v1, p1

    check-cast v1, LEF;

    invoke-direct {v0, p0, v1}, LEF;-><init>(LLF;LEF;)V

    iput-object v0, p0, LLF;->a:LHF;

    goto :goto_0

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 16
    instance-of v0, p1, LDF;

    if-eqz v0, :cond_3

    .line 17
    new-instance v0, LDF;

    move-object v1, p1

    check-cast v1, LDF;

    invoke-direct {v0, p0, v1}, LDF;-><init>(LLF;LDF;)V

    iput-object v0, p0, LLF;->a:LHF;

    goto :goto_0

    .line 18
    :cond_3
    instance-of v0, p1, LCF;

    if-eqz v0, :cond_4

    .line 19
    new-instance v0, LCF;

    move-object v1, p1

    check-cast v1, LCF;

    invoke-direct {v0, p0, v1}, LCF;-><init>(LLF;LCF;)V

    iput-object v0, p0, LLF;->a:LHF;

    goto :goto_0

    .line 20
    :cond_4
    instance-of v0, p1, LBF;

    if-eqz v0, :cond_5

    .line 21
    new-instance v0, LBF;

    move-object v1, p1

    check-cast v1, LBF;

    invoke-direct {v0, p0, v1}, LBF;-><init>(LLF;LBF;)V

    iput-object v0, p0, LLF;->a:LHF;

    goto :goto_0

    .line 22
    :cond_5
    instance-of v0, p1, LAF;

    if-eqz v0, :cond_6

    .line 23
    new-instance v0, LAF;

    move-object v1, p1

    check-cast v1, LAF;

    invoke-direct {v0, p0, v1}, LAF;-><init>(LLF;LAF;)V

    iput-object v0, p0, LLF;->a:LHF;

    goto :goto_0

    .line 24
    :cond_6
    new-instance v0, LHF;

    invoke-direct {v0, p0}, LHF;-><init>(LLF;)V

    iput-object v0, p0, LLF;->a:LHF;

    .line 25
    :goto_0
    invoke-virtual {p1, p0}, LHF;->e(LLF;)V

    return-void

    .line 26
    :cond_7
    new-instance p1, LHF;

    invoke-direct {p1, p0}, LHF;-><init>(LLF;)V

    iput-object p1, p0, LLF;->a:LHF;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LGF;

    invoke-direct {v0, p0, p1}, LGF;-><init>(LLF;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LLF;->a:LHF;

    return-void

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, LFF;

    invoke-direct {v0, p0, p1}, LFF;-><init>(LLF;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LLF;->a:LHF;

    return-void

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, LEF;

    invoke-direct {v0, p0, p1}, LEF;-><init>(LLF;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LLF;->a:LHF;

    return-void

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 6
    new-instance v0, LDF;

    invoke-direct {v0, p0, p1}, LDF;-><init>(LLF;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LLF;->a:LHF;

    return-void

    .line 7
    :cond_3
    new-instance v0, LCF;

    invoke-direct {v0, p0, p1}, LCF;-><init>(LLF;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LLF;->a:LHF;

    return-void
.end method

.method public static e(Lyl;IIII)Lyl;
    .locals 5

    iget v0, p0, Lyl;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, Lyl;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lyl;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, Lyl;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, Lyl;->b(IIII)Lyl;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;
    .locals 2

    new-instance v0, LLF;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p1}, LLF;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LfE;->a(Landroid/view/View;)LLF;

    move-result-object p1

    iget-object v1, v0, LLF;->a:LHF;

    invoke-virtual {v1, p1}, LHF;->r(LLF;)V

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {v1, p1}, LHF;->d(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result p0

    invoke-virtual {v1, p0}, LHF;->t(I)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, LLF;->a:LHF;

    invoke-virtual {v0}, LHF;->k()Lyl;

    move-result-object v0

    iget v0, v0, Lyl;->d:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, LLF;->a:LHF;

    invoke-virtual {v0}, LHF;->k()Lyl;

    move-result-object v0

    iget v0, v0, Lyl;->a:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, LLF;->a:LHF;

    invoke-virtual {v0}, LHF;->k()Lyl;

    move-result-object v0

    iget v0, v0, Lyl;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, LLF;->a:LHF;

    invoke-virtual {v0}, LHF;->k()Lyl;

    move-result-object v0

    iget v0, v0, Lyl;->b:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LLF;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LLF;

    iget-object v0, p0, LLF;->a:LHF;

    iget-object p1, p1, LLF;->a:LHF;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(IIII)LLF;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance v0, LyF;

    invoke-direct {v0, p0}, LyF;-><init>(LLF;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    new-instance v0, LxF;

    invoke-direct {v0, p0}, LxF;-><init>(LLF;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    new-instance v0, LwF;

    invoke-direct {v0, p0}, LwF;-><init>(LLF;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    new-instance v0, LvF;

    invoke-direct {v0, p0}, LvF;-><init>(LLF;)V

    goto :goto_0

    :cond_3
    new-instance v0, LuF;

    invoke-direct {v0, p0}, LuF;-><init>(LLF;)V

    :goto_0
    invoke-static {p1, p2, p3, p4}, Lyl;->b(IIII)Lyl;

    move-result-object p1

    invoke-virtual {v0, p1}, LzF;->g(Lyl;)V

    invoke-virtual {v0}, LzF;->b()LLF;

    move-result-object p1

    return-object p1
.end method

.method public final g()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, LLF;->a:LHF;

    instance-of v1, v0, LAF;

    if-eqz v1, :cond_0

    check-cast v0, LAF;

    iget-object v0, v0, LAF;->c:Landroid/view/WindowInsets;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LLF;->a:LHF;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, LHF;->hashCode()I

    move-result v0

    return v0
.end method
