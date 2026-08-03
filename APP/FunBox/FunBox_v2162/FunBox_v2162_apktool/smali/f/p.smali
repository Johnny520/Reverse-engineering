.class public final Lf/p;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/p;

    invoke-direct {v0}, Lf/p;-><init>()V

    sput-object v0, Lf/p;->a:Lf/p;

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

    const/4 v1, 0x3

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

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->i()I

    move-result v2

    invoke-static {v2}, Le/p;->p(I)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    const/4 v1, 0x2

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

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v1

    invoke-virtual {v1}, Lj/m;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Le/j;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public final i(Le/j;)Z
    .locals 3

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    instance-of p1, p1, Le/E;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result p1

    const/4 v2, 0x3

    if-ne p1, v2, :cond_0

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->i()I

    move-result p1

    invoke-static {p1}, Le/p;->p(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lj/o;->p(I)Lj/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/m;->i()I

    move-result v2

    invoke-static {v2}, Le/p;->p(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0}, Le/p;->p(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v1, p1

    :cond_0
    return v1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 3

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v1

    invoke-virtual {v1}, Lj/m;->i()I

    move-result v1

    invoke-static {v1, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v1

    invoke-virtual {v1}, Lj/m;->i()I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v1, v0}, Le/p;->e(II)S

    move-result v0

    invoke-static {p1, p2, v0}, Le/p;->s(Ln/a;SS)V

    return-void
.end method
