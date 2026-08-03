.class public final Lf/e;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    sput-object v0, Lf/e;->a:Lf/e;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f(Le/j;)Ljava/util/BitSet;
    .locals 8

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v3

    invoke-virtual {v3}, Lj/m;->i()I

    move-result v3

    const/4 v4, 0x1

    invoke-virtual {p1, v4}, Lj/o;->p(I)Lj/m;

    move-result-object v5

    invoke-virtual {v5}, Lj/m;->i()I

    move-result v5

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v6

    if-eq v6, v1, :cond_2

    const/4 v7, 0x3

    if-ne v6, v7, :cond_1

    if-eq v3, v5, :cond_0

    invoke-virtual {v0, v2, v2}, Ljava/util/BitSet;->set(IZ)V

    invoke-virtual {v0, v4, v2}, Ljava/util/BitSet;->set(IZ)V

    goto :goto_0

    :cond_0
    invoke-static {v5}, Le/p;->q(I)Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    invoke-virtual {v0, v4, v3}, Ljava/util/BitSet;->set(IZ)V

    :goto_0
    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->i()I

    move-result p1

    invoke-static {p1}, Le/p;->q(I)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    invoke-static {v3}, Le/p;->q(I)Z

    move-result p1

    invoke-virtual {v0, v2, p1}, Ljava/util/BitSet;->set(IZ)V

    invoke-static {v5}, Le/p;->q(I)Z

    move-result p1

    invoke-virtual {v0, v4, p1}, Ljava/util/BitSet;->set(IZ)V

    :goto_1
    return-object v0
.end method

.method public final g(Le/j;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v2, v0, -0x2

    invoke-virtual {p1, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Le/j;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public final i(Le/j;)Z
    .locals 5

    instance-of v0, p1, Le/E;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v2, :cond_2

    const/4 v4, 0x3

    if-eq v0, v4, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {p1, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v4

    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->i()I

    move-result p1

    if-eq v4, p1, :cond_3

    return v1

    :cond_2
    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {p1, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    :cond_3
    invoke-virtual {v0}, Lj/m;->i()I

    move-result p1

    invoke-static {p1}, Le/p;->q(I)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v2}, Lj/m;->i()I

    move-result p1

    invoke-static {p1}, Le/p;->q(I)Z

    move-result p1

    if-eqz p1, :cond_4

    move v1, v3

    :cond_4
    return v1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 3

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    add-int/lit8 v2, v1, -0x2

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->i()I

    move-result v2

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v2, v0}, Le/p;->l(II)I

    move-result v0

    invoke-static {v0, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    invoke-virtual {p1, p2}, Ln/d;->r(I)V

    return-void
.end method
