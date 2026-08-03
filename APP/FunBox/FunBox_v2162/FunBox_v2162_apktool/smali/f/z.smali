.class public final Lf/z;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/z;

    invoke-direct {v0}, Lf/z;-><init>()V

    sput-object v0, Lf/z;->a:Lf/z;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x5

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
    .locals 1

    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object p1

    check-cast p1, Lk/n;

    const/16 v0, 0x40

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

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0}, Le/p;->p(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Le/g;

    invoke-virtual {p1}, Le/g;->y()Lk/a;

    move-result-object p1

    instance-of p1, p1, Lk/m;

    return p1

    :cond_1
    :goto_0
    return v2
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 6

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Le/g;

    invoke-virtual {v1}, Le/g;->y()Lk/a;

    move-result-object v1

    check-cast v1, Lk/m;

    invoke-virtual {v1}, Lk/m;->i()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    long-to-int v0, v1

    int-to-short v0, v0

    const/16 v3, 0x10

    shr-long v3, v1, v3

    long-to-int v3, v3

    int-to-short v3, v3

    const/16 v4, 0x20

    shr-long v4, v1, v4

    long-to-int v4, v4

    int-to-short v4, v4

    const/16 v5, 0x30

    shr-long/2addr v1, v5

    long-to-int v1, v1

    int-to-short v1, v1

    invoke-virtual {p1, p2}, Ln/d;->r(I)V

    invoke-virtual {p1, v0}, Ln/d;->r(I)V

    invoke-virtual {p1, v3}, Ln/d;->r(I)V

    invoke-virtual {p1, v4}, Ln/d;->r(I)V

    invoke-virtual {p1, v1}, Ln/d;->r(I)V

    return-void
.end method
