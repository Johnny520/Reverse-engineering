.class final Lj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/f;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lj/b;->a:I

    return-void
.end method

.method private f(Lj/g;)V
    .locals 4

    invoke-virtual {p1}, Lj/g;->j()Lj/m;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/m;->h()I

    move-result v0

    iget v1, p0, Lj/b;->a:I

    if-le v0, v1, :cond_0

    iput v0, p0, Lj/b;->a:I

    :cond_0
    invoke-virtual {p1}, Lj/g;->k()Lj/o;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->h()I

    move-result v2

    iget v3, p0, Lj/b;->a:I

    if-le v2, v3, :cond_1

    iput v2, p0, Lj/b;->a:I

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Lj/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/b;->f(Lj/g;)V

    return-void
.end method

.method public final b(Lj/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/b;->f(Lj/g;)V

    return-void
.end method

.method public final c(Lj/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/b;->f(Lj/g;)V

    return-void
.end method

.method public final d(Lj/t;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/b;->f(Lj/g;)V

    return-void
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lj/b;->a:I

    return v0
.end method
