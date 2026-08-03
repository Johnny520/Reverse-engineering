.class public final Lf/x;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/x;

    invoke-direct {v0}, Lf/x;-><init>()V

    sput-object v0, Lf/x;->a:Lf/x;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x4

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
    .locals 9

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x5

    if-le v1, v4, :cond_0

    goto :goto_1

    :cond_0
    move v5, v2

    move v6, v5

    :goto_0
    if-ge v5, v1, :cond_2

    invoke-virtual {v0, v5}, Lj/o;->p(I)Lj/m;

    move-result-object v7

    invoke-virtual {v7}, Lj/m;->g()I

    move-result v8

    add-int/2addr v6, v8

    invoke-virtual {v7}, Lj/m;->i()I

    move-result v8

    invoke-virtual {v7}, Lj/m;->g()I

    move-result v7

    add-int/2addr v7, v8

    add-int/2addr v7, v3

    invoke-static {v7}, Le/p;->q(I)Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    if-gt v6, v4, :cond_3

    move v3, v6

    :cond_3
    :goto_1
    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    if-ne v3, v1, :cond_4

    goto :goto_4

    :cond_4
    new-instance v4, Lj/o;

    invoke-direct {v4, v3}, Lj/o;-><init>(I)V

    move v3, v2

    :goto_2
    if-ge v2, v1, :cond_6

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Lj/o;->x(ILj/m;)V

    invoke-virtual {v5}, Lj/m;->g()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_5

    add-int/lit8 v6, v3, 0x1

    invoke-virtual {v5}, Lj/m;->i()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    sget-object v7, Ll/c;->o:Ll/c;

    invoke-static {v5, v7}, Lj/m;->m(ILl/c;)Lj/m;

    move-result-object v5

    invoke-virtual {v4, v6, v5}, Lj/o;->x(ILj/m;)V

    add-int/lit8 v3, v3, 0x2

    goto :goto_3

    :cond_5
    add-int/lit8 v3, v3, 0x1

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {v4}, Ln/j;->g()V

    move-object v0, v4

    :goto_4
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
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 0

    invoke-static {p2}, Lc/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method
