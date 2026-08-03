.class public final Lf/d;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/d;

    invoke-direct {v0}, Lf/d;-><init>()V

    sput-object v0, Lf/d;->a:Lf/d;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x1

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
    .locals 1

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->o()Ljava/lang/String;

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

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->i()I

    move-result p1

    invoke-static {p1}, Le/p;->p(I)Z

    move-result p1

    if-eqz p1, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 2

    invoke-virtual {p2}, Le/j;->m()Lj/o;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj/o;->p(I)Lj/m;

    move-result-object v0

    invoke-virtual {v0}, Lj/m;->i()I

    move-result v0

    invoke-static {v0, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    invoke-virtual {p1, p2}, Ln/d;->r(I)V

    return-void
.end method
