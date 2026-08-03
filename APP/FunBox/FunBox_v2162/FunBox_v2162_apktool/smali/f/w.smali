.class public final Lf/w;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/w;

    invoke-direct {v0}, Lf/w;-><init>()V

    sput-object v0, Lf/w;->a:Lf/w;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final g(Le/j;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v1

    invoke-static {v1}, Le/p;->o(Lj/o;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/j;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
    .locals 7

    instance-of v0, p1, Le/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->z()I

    move-result v0

    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object v2

    invoke-static {v0}, Le/p;->r(I)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    instance-of v0, v2, Lk/q;

    if-nez v0, :cond_2

    instance-of v0, v2, Lk/u;

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    const/4 v3, 0x2

    if-ge v0, v3, :cond_4

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v3

    invoke-virtual {v3}, Lj/m;->i()I

    move-result v3

    move v4, v1

    :goto_0
    if-ge v4, v0, :cond_3

    invoke-virtual {p1, v4}, Lj/o;->p(I)Lj/m;

    move-result-object v5

    invoke-virtual {v5}, Lj/m;->i()I

    move-result v6

    if-eq v6, v3, :cond_5

    move v0, v1

    goto :goto_1

    :cond_5
    invoke-virtual {v5}, Lj/m;->g()I

    move-result v5

    add-int/2addr v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :goto_1
    if-eqz v0, :cond_8

    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0}, Le/p;->r(I)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    move v3, v1

    move v4, v3

    :goto_2
    if-ge v3, v0, :cond_6

    invoke-virtual {p1, v3}, Lj/o;->b(I)Ll/c;

    move-result-object v5

    invoke-virtual {v5}, Ll/c;->f()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    invoke-static {v4}, Le/p;->p(I)Z

    move-result p1

    if-eqz p1, :cond_8

    :cond_7
    move v1, v2

    :cond_8
    return v1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 7

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Le/g;

    invoke-virtual {v1}, Le/g;->z()I

    move-result v1

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->i()I

    move-result v2

    :goto_0
    invoke-virtual {v0}, Ln/e;->B()I

    move-result v4

    move v5, v3

    :goto_1
    if-ge v3, v4, :cond_1

    invoke-virtual {v0, v3}, Lj/o;->b(I)Ll/c;

    move-result-object v6

    invoke-virtual {v6}, Ll/c;->f()I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v5, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    int-to-short v0, v1

    int-to-short v1, v2

    invoke-virtual {p1, p2}, Ln/d;->r(I)V

    invoke-virtual {p1, v0}, Ln/d;->r(I)V

    invoke-virtual {p1, v1}, Ln/d;->r(I)V

    return-void
.end method
