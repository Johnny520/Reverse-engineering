.class public final Lf/b;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/b;

    invoke-direct {v0}, Lf/b;-><init>()V

    sput-object v0, Lf/b;->a:Lf/b;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g(Le/j;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public final h(Le/j;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public final i(Le/j;)Z
    .locals 1

    instance-of v0, p1, Le/E;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p2}, Le/p;->m(ILe/j;)S

    move-result p2

    invoke-virtual {p1, p2}, Ln/d;->r(I)V

    return-void
.end method
