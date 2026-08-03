.class public La/nh$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/nh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# static fields
.field public static final b:La/nh;


# instance fields
.field public final a:La/nh;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, La/nh$d;

    invoke-direct {v0}, La/nh$d;-><init>()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, La/nh$c;

    invoke-direct {v0}, La/nh$c;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, La/nh$b;

    invoke-direct {v0}, La/nh$b;-><init>()V

    :goto_0
    invoke-virtual {v0}, La/nh$e;->b()La/nh;

    move-result-object v0

    iget-object v0, v0, La/nh;->a:La/nh$k;

    invoke-virtual {v0}, La/nh$k;->a()La/nh;

    move-result-object v0

    iget-object v0, v0, La/nh;->a:La/nh$k;

    invoke-virtual {v0}, La/nh$k;->b()La/nh;

    move-result-object v0

    iget-object v0, v0, La/nh;->a:La/nh$k;

    invoke-virtual {v0}, La/nh$k;->c()La/nh;

    move-result-object v0

    sput-object v0, La/nh$k;->b:La/nh;

    return-void
.end method

.method public constructor <init>(La/nh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nh$k;->a:La/nh;

    return-void
.end method


# virtual methods
.method public a()La/nh;
    .locals 1

    iget-object v0, p0, La/nh$k;->a:La/nh;

    return-object v0
.end method

.method public b()La/nh;
    .locals 1

    iget-object v0, p0, La/nh$k;->a:La/nh;

    return-object v0
.end method

.method public c()La/nh;
    .locals 1

    iget-object v0, p0, La/nh$k;->a:La/nh;

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e()La/m5;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La/nh$k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La/nh$k;

    invoke-virtual {p0}, La/nh$k;->n()Z

    move-result v1

    invoke-virtual {p1}, La/nh$k;->n()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, La/nh$k;->m()Z

    move-result v1

    invoke-virtual {p1}, La/nh$k;->m()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, La/nh$k;->j()La/a9;

    move-result-object v1

    invoke-virtual {p1}, La/nh$k;->j()La/a9;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, La/nh$k;->h()La/a9;

    move-result-object v1

    invoke-virtual {p1}, La/nh$k;->h()La/a9;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, La/nh$k;->e()La/m5;

    move-result-object v1

    invoke-virtual {p1}, La/nh$k;->e()La/m5;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public f(I)La/a9;
    .locals 0

    sget-object p1, La/a9;->e:La/a9;

    return-object p1
.end method

.method public g()La/a9;
    .locals 1

    invoke-virtual {p0}, La/nh$k;->j()La/a9;

    move-result-object v0

    return-object v0
.end method

.method public h()La/a9;
    .locals 1

    sget-object v0, La/a9;->e:La/a9;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, La/nh$k;->n()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0}, La/nh$k;->m()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0}, La/nh$k;->j()La/a9;

    move-result-object v2

    invoke-virtual {p0}, La/nh$k;->h()La/a9;

    move-result-object v3

    invoke-virtual {p0}, La/nh$k;->e()La/m5;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()La/a9;
    .locals 1

    invoke-virtual {p0}, La/nh$k;->j()La/a9;

    move-result-object v0

    return-object v0
.end method

.method public j()La/a9;
    .locals 1

    sget-object v0, La/a9;->e:La/a9;

    return-object v0
.end method

.method public k()La/a9;
    .locals 1

    invoke-virtual {p0}, La/nh$k;->j()La/a9;

    move-result-object v0

    return-object v0
.end method

.method public l(IIII)La/nh;
    .locals 0

    sget-object p1, La/nh$k;->b:La/nh;

    return-object p1
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o([La/a9;)V
    .locals 0

    return-void
.end method

.method public p(La/nh;)V
    .locals 0

    return-void
.end method

.method public q(La/a9;)V
    .locals 0

    return-void
.end method
