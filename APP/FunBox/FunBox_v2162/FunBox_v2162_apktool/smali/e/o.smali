.class public final Le/o;
.super Le/j;
.source "SourceFile"


# instance fields
.field private e:[Le/E;


# direct methods
.method public constructor <init>(Lj/s;Lj/o;)V
    .locals 1

    sget-object v0, Le/m;->b:Le/l;

    invoke-direct {p0, v0, p1, p2}, Le/j;-><init>(Le/l;Lj/s;Lj/o;)V

    invoke-virtual {p2}, Ln/e;->B()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Le/o;->e:[Le/E;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "registers.size() == 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private y()V
    .locals 8

    iget-object v0, p0, Le/o;->e:[Le/E;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    new-array v2, v1, [Le/E;

    iput-object v2, p0, Le/o;->e:[Le/E;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v4

    iget-object v5, p0, Le/o;->e:[Le/E;

    invoke-virtual {v4}, Lj/m;->c()Ll/c;

    move-result-object v6

    invoke-static {v3, v6}, Lj/m;->m(ILl/c;)Lj/m;

    move-result-object v6

    sget-object v7, Lj/s;->a:Lj/s;

    invoke-static {v7, v6, v4}, Le/j;->r(Lj/s;Lj/m;Lj/m;)Le/E;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {v4}, Lj/m;->g()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method protected final a()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()I
    .locals 5

    invoke-direct {p0}, Le/o;->y()V

    iget-object v0, p0, Le/o;->e:[Le/E;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-virtual {v4}, Le/n;->b()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method protected final q()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x64

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v5

    invoke-virtual {v5}, Lj/m;->c()Ll/c;

    move-result-object v6

    invoke-static {v4, v6}, Lj/m;->m(ILl/c;)Lj/m;

    move-result-object v6

    sget-object v7, Lj/s;->a:Lj/s;

    invoke-static {v7, v6, v5}, Le/j;->r(Lj/s;Lj/m;Lj/m;)Le/E;

    move-result-object v6

    if-eqz v3, :cond_0

    const/16 v7, 0xa

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v6}, Le/n;->q()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lj/m;->g()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Le/l;)Le/j;
    .locals 1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v(I)Le/j;
    .locals 1

    invoke-virtual {p0}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/o;->N(I)Lj/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/o;->w(Lj/o;)Le/j;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lj/o;)Le/j;
    .locals 2

    new-instance v0, Le/o;

    invoke-virtual {p0}, Le/j;->l()Lj/s;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Le/o;-><init>(Lj/s;Lj/o;)V

    return-object v0
.end method

.method public final x(Ln/d;)V
    .locals 4

    invoke-direct {p0}, Le/o;->y()V

    iget-object v0, p0, Le/o;->e:[Le/E;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Le/n;->x(Ln/d;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
