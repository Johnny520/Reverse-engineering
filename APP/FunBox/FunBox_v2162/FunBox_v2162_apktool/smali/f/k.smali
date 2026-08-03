.class public final Lf/k;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/k;

    invoke-direct {v0}, Lf/k;-><init>()V

    sput-object v0, Lf/k;->a:Lf/k;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final f(Le/j;)Ljava/util/BitSet;
    .locals 3

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->i()I

    move-result v2

    invoke-static {v2}, Le/p;->p(I)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    const/4 v1, 0x1

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
    .locals 4

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

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Le/p;->k(Lk/n;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Le/j;)Ljava/lang/String;
    .locals 1

    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object p1

    check-cast p1, Lk/n;

    const/16 v0, 0x8

    invoke-static {p1, v0}, Le/p;->j(Lk/n;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final i(Le/j;)Z
    .locals 4

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    instance-of v1, p1, Le/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v1

    invoke-virtual {v1}, Lj/m;->i()I

    move-result v1

    invoke-static {v1}, Le/p;->p(I)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0}, Le/p;->p(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object p1

    instance-of v0, p1, Lk/n;

    if-nez v0, :cond_1

    return v2

    :cond_1
    check-cast p1, Lk/n;

    invoke-virtual {p1}, Lk/n;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lk/n;->h()I

    move-result p1

    int-to-byte v0, p1

    if-ne v0, p1, :cond_2

    move p1, v1

    goto :goto_0

    :cond_2
    move p1, v2

    :goto_0
    if-eqz p1, :cond_3

    move v2, v1

    :cond_3
    :goto_1
    return v2
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 3

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Le/g;

    invoke-virtual {v1}, Le/g;->y()Lk/a;

    move-result-object v1

    check-cast v1, Lk/n;

    invoke-virtual {v1}, Lk/n;->h()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->i()I

    move-result v2

    invoke-static {v2, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    and-int/lit16 v1, v1, 0xff

    invoke-static {v0, v1}, Le/p;->e(II)S

    move-result v0

    invoke-static {p1, p2, v0}, Le/p;->s(Ln/a;SS)V

    return-void
.end method
