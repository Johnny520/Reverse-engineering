.class final Le/B;
.super La/b;
.source "SourceFile"


# instance fields
.field final synthetic a:[Z

.field final synthetic b:I

.field final synthetic c:I


# direct methods
.method constructor <init>([ZII)V
    .locals 0

    iput-object p1, p0, Le/B;->a:[Z

    iput p2, p0, Le/B;->b:I

    iput p3, p0, Le/B;->c:I

    invoke-direct {p0}, La/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lj/i;)V
    .locals 5

    invoke-virtual {p1}, Lj/g;->h()Lj/q;

    move-result-object v0

    invoke-virtual {v0}, Lj/q;->d()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lj/d;->l()Lk/a;

    move-result-object v0

    check-cast v0, Lk/j;

    invoke-virtual {v0}, Lk/l;->h()I

    move-result v0

    iget-object v1, p0, Le/B;->a:[Z

    const/4 v2, 0x0

    aget-boolean v3, v1, v2

    if-eqz v3, :cond_0

    iget v3, p0, Le/B;->b:I

    iget v4, p0, Le/B;->c:I

    sub-int/2addr v3, v4

    add-int/2addr v3, v0

    invoke-virtual {p1}, Lj/g;->j()Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->i()I

    move-result p1

    if-ne v3, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    aput-boolean p1, v1, v2

    :cond_1
    return-void
.end method
