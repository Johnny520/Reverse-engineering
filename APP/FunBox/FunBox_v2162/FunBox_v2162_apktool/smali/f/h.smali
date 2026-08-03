.class public final Lf/h;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/h;

    invoke-direct {v0}, Lf/h;-><init>()V

    sput-object v0, Lf/h;->a:Lf/h;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final f(Le/j;)Ljava/util/BitSet;
    .locals 2

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->i()I

    move-result p1

    invoke-static {p1}, Le/p;->p(I)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0
.end method

.method public final g(Le/j;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object p1

    check-cast p1, Lk/n;

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

    invoke-static {p1}, Le/p;->k(Lk/n;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Le/j;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object p1

    check-cast p1, Lk/n;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x40

    :goto_0
    invoke-static {p1, v0}, Le/p;->j(Lk/n;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final i(Le/j;)Z
    .locals 6

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    instance-of v1, p1, Le/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_4

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v1

    invoke-virtual {v1}, Lj/m;->i()I

    move-result v1

    invoke-static {v1}, Le/p;->p(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object p1

    instance-of v1, p1, Lk/n;

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lk/n;

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->g()I

    move-result v0

    if-ne v0, v3, :cond_3

    invoke-virtual {p1}, Lk/n;->h()I

    move-result p1

    const v0, 0xffff

    and-int/2addr p1, v0

    if-nez p1, :cond_2

    move v2, v3

    :cond_2
    return v2

    :cond_3
    invoke-virtual {p1}, Lk/n;->i()J

    move-result-wide v0

    const-wide v4, 0xffffffffffffL

    and-long/2addr v0, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-nez p1, :cond_4

    move v2, v3

    :cond_4
    :goto_0
    return v2
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 5

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Le/g;

    invoke-virtual {v1}, Le/g;->y()Lk/a;

    move-result-object v1

    check-cast v1, Lk/n;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v3

    invoke-virtual {v3}, Lj/m;->g()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    invoke-virtual {v1}, Lk/n;->h()I

    move-result v1

    ushr-int/lit8 v1, v1, 0x10

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lk/n;->i()J

    move-result-wide v3

    const/16 v1, 0x30

    ushr-long/2addr v3, v1

    long-to-int v1, v3

    :goto_0
    int-to-short v1, v1

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    invoke-static {p1, p2, v1}, Le/p;->s(Ln/a;SS)V

    return-void
.end method
