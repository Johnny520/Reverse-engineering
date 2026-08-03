.class public final Lf/v;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/v;

    invoke-direct {v0}, Lf/v;-><init>()V

    sput-object v0, Lf/v;->a:Lf/v;

    return-void
.end method

.method private static v(Lj/o;)Lj/o;
    .locals 7

    invoke-static {p0}, Lf/v;->w(Lj/o;)I

    move-result v0

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    new-instance v2, Lj/o;

    invoke-direct {v2, v0}, Lj/o;-><init>(I)V

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v0, v1, :cond_2

    invoke-virtual {p0, v0}, Lj/o;->p(I)Lj/m;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lj/o;->x(ILj/m;)V

    invoke-virtual {v4}, Lj/m;->g()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {v4}, Lj/m;->i()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    sget-object v6, Ll/c;->o:Ll/c;

    invoke-static {v4, v6}, Lj/m;->m(ILl/c;)Lj/m;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Lj/o;->x(ILj/m;)V

    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ln/j;->g()V

    return-object v2
.end method

.method private static w(Lj/o;)I
    .locals 7

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x5

    if-le v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v0, :cond_2

    invoke-virtual {p0, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v5

    invoke-virtual {v5}, Lj/m;->g()I

    move-result v6

    add-int/2addr v4, v6

    invoke-virtual {v5}, Lj/m;->i()I

    move-result v6

    invoke-virtual {v5}, Lj/m;->g()I

    move-result v5

    add-int/2addr v5, v6

    add-int/lit8 v5, v5, -0x1

    invoke-static {v5}, Le/p;->q(I)Z

    move-result v5

    if-nez v5, :cond_1

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-gt v4, v2, :cond_3

    move v1, v4

    :cond_3
    return v1
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final f(Le/j;)Ljava/util/BitSet;
    .locals 5

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1, v0}, Ljava/util/BitSet;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v3

    invoke-virtual {v3}, Lj/m;->i()I

    move-result v4

    invoke-virtual {v3}, Lj/m;->g()I

    move-result v3

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    invoke-static {v3}, Le/p;->q(I)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final g(Le/j;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-static {v0}, Lf/v;->v(Lj/o;)Lj/o;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Le/p;->n(Lj/o;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/j;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Le/j;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Le/j;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final i(Le/j;)Z
    .locals 3

    instance-of v0, p1, Le/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->z()I

    move-result v0

    invoke-static {v0}, Le/p;->r(I)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object v0

    instance-of v2, v0, Lk/q;

    if-nez v2, :cond_2

    instance-of v0, v0, Lk/u;

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    invoke-static {p1}, Lf/v;->w(Lj/o;)I

    move-result p1

    if-ltz p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 9

    move-object v0, p2

    check-cast v0, Le/g;

    invoke-virtual {v0}, Le/g;->z()I

    move-result v0

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v1

    invoke-static {v1}, Lf/v;->v(Lj/o;)Lj/o;

    move-result-object v1

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_0

    invoke-virtual {v1, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v4

    invoke-virtual {v4}, Lj/m;->i()I

    move-result v4

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-le v2, v5, :cond_1

    invoke-virtual {v1, v5}, Lj/o;->p(I)Lj/m;

    move-result-object v5

    invoke-virtual {v5}, Lj/m;->i()I

    move-result v5

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    const/4 v6, 0x2

    if-le v2, v6, :cond_2

    invoke-virtual {v1, v6}, Lj/o;->p(I)Lj/m;

    move-result-object v6

    invoke-virtual {v6}, Lj/m;->i()I

    move-result v6

    goto :goto_2

    :cond_2
    move v6, v3

    :goto_2
    const/4 v7, 0x3

    if-le v2, v7, :cond_3

    invoke-virtual {v1, v7}, Lj/o;->p(I)Lj/m;

    move-result-object v7

    invoke-virtual {v7}, Lj/m;->i()I

    move-result v7

    goto :goto_3

    :cond_3
    move v7, v3

    :goto_3
    const/4 v8, 0x4

    if-le v2, v8, :cond_4

    invoke-virtual {v1, v8}, Lj/o;->p(I)Lj/m;

    move-result-object v1

    invoke-virtual {v1}, Lj/m;->i()I

    move-result v3

    :cond_4
    invoke-static {v3, v2}, Le/p;->l(II)I

    move-result v1

    invoke-static {v1, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    int-to-short v0, v0

    and-int/lit8 v1, v4, 0xf

    if-ne v1, v4, :cond_8

    and-int/lit8 v1, v5, 0xf

    if-ne v1, v5, :cond_7

    and-int/lit8 v1, v6, 0xf

    if-ne v1, v6, :cond_6

    and-int/lit8 v1, v7, 0xf

    if-ne v1, v7, :cond_5

    shl-int/lit8 v1, v5, 0x4

    or-int/2addr v1, v4

    shl-int/lit8 v2, v6, 0x8

    or-int/2addr v1, v2

    shl-int/lit8 v2, v7, 0xc

    or-int/2addr v1, v2

    int-to-short v1, v1

    invoke-virtual {p1, p2}, Ln/d;->r(I)V

    invoke-virtual {p1, v0}, Ln/d;->r(I)V

    invoke-virtual {p1, v1}, Ln/d;->r(I)V

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "n3 out of range 0..15"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "n2 out of range 0..15"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "n1 out of range 0..15"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "n0 out of range 0..15"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
