.class public final Lf/f;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/f;

    invoke-direct {v0}, Lf/f;-><init>()V

    sput-object v0, Lf/f;->a:Lf/f;

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

.method public final g(Le/j;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Le/p;->c(Le/j;)Ljava/lang/String;

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
    .locals 1

    instance-of v0, p1, Le/F;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Le/F;

    invoke-virtual {p1}, Le/F;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lf/f;->b(Le/F;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 2

    move-object v0, p2

    check-cast v0, Le/F;

    invoke-virtual {v0}, Le/F;->A()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    int-to-short v0, v0

    invoke-static {p1, p2, v0}, Le/p;->s(Ln/a;SS)V

    return-void
.end method
