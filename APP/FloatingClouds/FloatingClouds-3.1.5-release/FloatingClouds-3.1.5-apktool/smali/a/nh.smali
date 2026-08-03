.class public final La/nh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/nh$j;,
        La/nh$k;,
        La/nh$i;,
        La/nh$h;,
        La/nh$g;,
        La/nh$f;,
        La/nh$l;,
        La/nh$a;,
        La/nh$m;,
        La/nh$d;,
        La/nh$c;,
        La/nh$b;,
        La/nh$e;
    }
.end annotation


# static fields
.field public static final b:La/nh;


# instance fields
.field public final a:La/nh$k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, La/nh$j;->q:La/nh;

    sput-object v0, La/nh;->b:La/nh;

    return-void

    :cond_0
    sget-object v0, La/nh$k;->b:La/nh;

    sput-object v0, La/nh;->b:La/nh;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, La/nh$k;

    invoke-direct {v0, p0}, La/nh$k;-><init>(La/nh;)V

    iput-object v0, p0, La/nh;->a:La/nh$k;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, La/nh$j;

    invoke-direct {v0, p0, p1}, La/nh$j;-><init>(La/nh;Landroid/view/WindowInsets;)V

    iput-object v0, p0, La/nh;->a:La/nh$k;

    return-void

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, La/nh$i;

    invoke-direct {v0, p0, p1}, La/nh$i;-><init>(La/nh;Landroid/view/WindowInsets;)V

    iput-object v0, p0, La/nh;->a:La/nh$k;

    return-void

    .line 5
    :cond_1
    new-instance v0, La/nh$h;

    invoke-direct {v0, p0, p1}, La/nh$h;-><init>(La/nh;Landroid/view/WindowInsets;)V

    iput-object v0, p0, La/nh;->a:La/nh$k;

    return-void
.end method

.method public static e(La/a9;IIII)La/a9;
    .locals 5

    iget v0, p0, La/a9;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, La/a9;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, La/a9;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, La/a9;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, La/a9;->b(IIII)La/a9;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/view/View;Landroid/view/WindowInsets;)La/nh;
    .locals 2

    new-instance v0, La/nh;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p1}, La/nh;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, La/ug$e;->a(Landroid/view/View;)La/nh;

    move-result-object p1

    iget-object v1, v0, La/nh;->a:La/nh$k;

    invoke-virtual {v1, p1}, La/nh$k;->p(La/nh;)V

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v1, p0}, La/nh$k;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/nh;->a:La/nh$k;

    invoke-virtual {v0}, La/nh$k;->j()La/a9;

    move-result-object v0

    iget v0, v0, La/a9;->d:I

    return v0
.end method

.method public final b()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/nh;->a:La/nh$k;

    invoke-virtual {v0}, La/nh$k;->j()La/a9;

    move-result-object v0

    iget v0, v0, La/a9;->a:I

    return v0
.end method

.method public final c()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/nh;->a:La/nh$k;

    invoke-virtual {v0}, La/nh$k;->j()La/a9;

    move-result-object v0

    iget v0, v0, La/a9;->c:I

    return v0
.end method

.method public final d()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/nh;->a:La/nh$k;

    invoke-virtual {v0}, La/nh$k;->j()La/a9;

    move-result-object v0

    iget v0, v0, La/a9;->b:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, La/nh;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, La/nh;

    iget-object p1, p1, La/nh;->a:La/nh$k;

    iget-object v0, p0, La/nh;->a:La/nh$k;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, La/nh;->a:La/nh$k;

    instance-of v1, v0, La/nh$f;

    if-eqz v1, :cond_0

    check-cast v0, La/nh$f;

    iget-object v0, v0, La/nh$f;->c:Landroid/view/WindowInsets;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, La/nh;->a:La/nh$k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, La/nh$k;->hashCode()I

    move-result v0

    return v0
.end method
