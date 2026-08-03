.class public abstract Le/G;
.super Le/j;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj/s;)V
    .locals 2

    sget-object v0, Le/m;->b:Le/l;

    sget-object v1, Lj/o;->c:Lj/o;

    invoke-direct {p0, v0, p1, v1}, Le/j;-><init>(Le/l;Lj/s;Lj/o;)V

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final u(Le/l;)Le/j;
    .locals 1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v(I)Le/j;
    .locals 1

    invoke-virtual {p0}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/o;->N(I)Lj/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/j;->w(Lj/o;)Le/j;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ln/d;)V
    .locals 0

    return-void
.end method
