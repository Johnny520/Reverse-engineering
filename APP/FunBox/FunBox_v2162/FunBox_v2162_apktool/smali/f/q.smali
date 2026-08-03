.class public final Lf/q;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/q;

    invoke-direct {v0}, Lf/q;-><init>()V

    sput-object v0, Lf/q;->a:Lf/q;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x3

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

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
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

    invoke-static {p1, p2, v0}, Le/p;->t(Ln/d;SI)V

    return-void
.end method
