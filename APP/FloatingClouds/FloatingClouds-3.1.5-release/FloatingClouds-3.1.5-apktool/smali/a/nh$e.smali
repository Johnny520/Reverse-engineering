.class public La/nh$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/nh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:La/nh;

.field public b:[La/a9;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, La/nh;

    invoke-direct {v0}, La/nh;-><init>()V

    invoke-direct {p0, v0}, La/nh$e;-><init>(La/nh;)V

    return-void
.end method

.method public constructor <init>(La/nh;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La/nh$e;->a:La/nh;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, La/nh$e;->b:[La/a9;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iget-object v3, p0, La/nh$e;->a:La/nh;

    if-nez v0, :cond_0

    iget-object v0, v3, La/nh;->a:La/nh$k;

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, La/nh$k;->f(I)La/a9;

    move-result-object v0

    :cond_0
    if-nez v1, :cond_1

    iget-object v1, v3, La/nh;->a:La/nh$k;

    invoke-virtual {v1, v2}, La/nh$k;->f(I)La/a9;

    move-result-object v1

    :cond_1
    invoke-static {v1, v0}, La/a9;->a(La/a9;La/a9;)La/a9;

    move-result-object v0

    invoke-virtual {p0, v0}, La/nh$e;->g(La/a9;)V

    iget-object v0, p0, La/nh$e;->b:[La/a9;

    const/16 v1, 0x10

    invoke-static {v1}, La/nh$l;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, La/nh$e;->f(La/a9;)V

    :cond_2
    iget-object v0, p0, La/nh$e;->b:[La/a9;

    const/16 v1, 0x20

    invoke-static {v1}, La/nh$l;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, La/nh$e;->d(La/a9;)V

    :cond_3
    iget-object v0, p0, La/nh$e;->b:[La/a9;

    const/16 v1, 0x40

    invoke-static {v1}, La/nh$l;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, La/nh$e;->h(La/a9;)V

    :cond_4
    return-void
.end method

.method public b()La/nh;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public c(ILa/a9;)V
    .locals 3

    iget-object v0, p0, La/nh$e;->b:[La/a9;

    if-nez v0, :cond_0

    const/16 v0, 0x9

    new-array v0, v0, [La/a9;

    iput-object v0, p0, La/nh$e;->b:[La/a9;

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    and-int v1, p1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, La/nh$e;->b:[La/a9;

    invoke-static {v0}, La/nh$l;->a(I)I

    move-result v2

    aput-object p2, v1, v2

    :goto_1
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public d(La/a9;)V
    .locals 0

    return-void
.end method

.method public e(La/a9;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public f(La/a9;)V
    .locals 0

    return-void
.end method

.method public g(La/a9;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public h(La/a9;)V
    .locals 0

    return-void
.end method
