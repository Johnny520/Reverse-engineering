.class public final Lf/j;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/j;

    invoke-direct {v0}, Lf/j;-><init>()V

    sput-object v0, Lf/j;->a:Lf/j;

    return-void
.end method


# virtual methods
.method public final b(Le/F;)Z
    .locals 3

    invoke-virtual {p1}, Le/F;->A()I

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    int-to-short v1, p1

    const/4 v2, 0x1

    if-ne v1, p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_1

    move v0, v2

    :cond_1
    return v0
.end method

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

    invoke-static {p1}, Le/p;->c(Le/j;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Le/j;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Le/p;->a(Le/j;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final i(Le/j;)Z
    .locals 4

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    instance-of v1, p1, Le/F;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0}, Le/p;->p(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Le/F;

    invoke-virtual {p1}, Le/F;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lf/j;->b(Le/F;)Z

    move-result v3

    :cond_1
    return v3

    :cond_2
    :goto_0
    return v2
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 3

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Le/F;

    invoke-virtual {v1}, Le/F;->A()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    int-to-short v0, v1

    invoke-static {p1, p2, v0}, Le/p;->s(Ln/a;SS)V

    return-void
.end method
