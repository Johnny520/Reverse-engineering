.class public final Le/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private b:Le/x;

.field private c:Le/a;

.field private d:Le/e;

.field private e:Le/z;

.field private f:Le/t;

.field private g:Le/k;


# direct methods
.method public constructor <init>(ILe/x;Le/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    iput p1, p0, Le/i;->a:I

    iput-object p2, p0, Le/i;->b:Le/x;

    iput-object p3, p0, Le/i;->c:Le/a;

    const/4 p1, 0x0

    iput-object p1, p0, Le/i;->d:Le/e;

    iput-object p1, p0, Le/i;->e:Le/z;

    iput-object p1, p0, Le/i;->f:Le/t;

    iput-object p1, p0, Le/i;->g:Le/k;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "unprocessedInsns == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private b()V
    .locals 6

    iget-object v0, p0, Le/i;->g:Le/k;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le/i;->b:Le/x;

    invoke-virtual {v0}, Le/x;->f()Le/k;

    move-result-object v0

    iput-object v0, p0, Le/i;->g:Le/k;

    iget v1, p0, Le/i;->a:I

    invoke-static {v0, v1}, Le/z;->F(Le/k;I)Le/z;

    move-result-object v0

    iput-object v0, p0, Le/i;->e:Le/z;

    iget-object v0, p0, Le/i;->g:Le/k;

    sget-object v1, Le/t;->c:Le/t;

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    new-instance v2, Le/s;

    invoke-direct {v2, v1}, Le/s;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {v0, v3}, Le/k;->l(I)Le/j;

    move-result-object v4

    instance-of v5, v4, Le/u;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Le/u;

    invoke-virtual {v5}, Le/u;->y()Lj/p;

    move-result-object v5

    invoke-virtual {v4}, Le/j;->h()I

    move-result v4

    invoke-virtual {v2, v4, v5}, Le/s;->g(ILj/p;)V

    goto :goto_1

    :cond_1
    instance-of v5, v4, Le/v;

    if-eqz v5, :cond_2

    move-object v5, v4

    check-cast v5, Le/v;

    invoke-virtual {v5}, Le/v;->y()Lj/m;

    move-result-object v5

    invoke-virtual {v4}, Le/j;->h()I

    move-result v4

    invoke-virtual {v2, v4, v5}, Le/s;->h(ILj/m;)V

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Le/s;->f()Le/t;

    move-result-object v0

    iput-object v0, p0, Le/i;->f:Le/t;

    iget-object v0, p0, Le/i;->c:Le/a;

    invoke-virtual {v0}, Le/a;->a()Le/e;

    move-result-object v0

    iput-object v0, p0, Le/i;->d:Le/e;

    const/4 v0, 0x0

    iput-object v0, p0, Le/i;->b:Le/x;

    iput-object v0, p0, Le/i;->c:Le/a;

    return-void
.end method


# virtual methods
.method public final a(Le/h;)V
    .locals 1

    iget-object v0, p0, Le/i;->b:Le/x;

    invoke-virtual {v0, p1}, Le/x;->c(Le/h;)V

    return-void
.end method

.method public final c()Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, Le/i;->c:Le/a;

    invoke-virtual {v0}, Le/a;->b()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public final d()Le/e;
    .locals 1

    invoke-direct {p0}, Le/i;->b()V

    iget-object v0, p0, Le/i;->d:Le/e;

    return-object v0
.end method

.method public final e()Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, Le/i;->b:Le/x;

    invoke-virtual {v0}, Le/x;->h()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public final f()Le/k;
    .locals 1

    invoke-direct {p0}, Le/i;->b()V

    iget-object v0, p0, Le/i;->g:Le/k;

    return-object v0
.end method

.method public final g()Le/t;
    .locals 1

    invoke-direct {p0}, Le/i;->b()V

    iget-object v0, p0, Le/i;->f:Le/t;

    return-object v0
.end method

.method public final h()Le/z;
    .locals 1

    invoke-direct {p0}, Le/i;->b()V

    iget-object v0, p0, Le/i;->e:Le/z;

    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Le/i;->c:Le/a;

    invoke-virtual {v0}, Le/a;->g()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Le/i;->b:Le/x;

    invoke-virtual {v0}, Le/x;->i()Z

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 2

    iget v0, p0, Le/i;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Le/i;->b:Le/x;

    invoke-virtual {v0}, Le/x;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
