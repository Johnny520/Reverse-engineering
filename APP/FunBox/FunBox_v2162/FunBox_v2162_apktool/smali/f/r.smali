.class public final Lf/r;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/r;

    invoke-direct {v0}, Lf/r;-><init>()V

    sput-object v0, Lf/r;->a:Lf/r;

    return-void
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

    invoke-virtual {p1, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v3

    invoke-virtual {v3}, Lj/m;->i()I

    move-result v3

    invoke-static {v3}, Le/p;->p(I)Z

    move-result v3

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-virtual {p1, v4}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->i()I

    move-result p1

    if-ne v0, p1, :cond_1

    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    invoke-virtual {v1, v4, v3}, Ljava/util/BitSet;->set(IZ)V

    :cond_1
    :goto_0
    return-object v1
.end method

.method public final g(Le/j;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->o()Ljava/lang/String;

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
    .locals 5

    instance-of v0, p1, Le/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->i()I

    move-result v4

    invoke-virtual {v0, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    if-eq v4, v0, :cond_3

    return v1

    :cond_2
    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    :cond_3
    invoke-virtual {v2}, Lj/m;->i()I

    move-result v0

    invoke-static {v0}, Le/p;->p(I)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object p1

    instance-of v0, p1, Lk/u;

    if-nez v0, :cond_5

    instance-of p1, p1, Lk/t;

    if-eqz p1, :cond_6

    :cond_5
    move v1, v3

    :cond_6
    return v1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 3

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Le/g;

    invoke-virtual {v1}, Le/g;->z()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    invoke-static {p1, p2, v1}, Le/p;->t(Ln/d;SI)V

    return-void
.end method
