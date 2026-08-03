.class public abstract La/b4;
.super La/W1;
.source "SourceFile"


# instance fields
.field public final b:La/x4;

.field public transient c:La/a4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a4<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/a4;La/x4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a4<",
            "Ljava/lang/Object;",
            ">;",
            "La/x4;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, La/W1;-><init>(La/a4;)V

    iput-object p2, p0, La/b4;->b:La/x4;

    return-void
.end method


# virtual methods
.method public final c()La/x4;
    .locals 1

    iget-object v0, p0, La/b4;->b:La/x4;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final i()V
    .locals 3

    iget-object v0, p0, La/b4;->c:La/a4;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    iget-object v1, p0, La/b4;->b:La/x4;

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    sget-object v2, La/c4$a;->a:La/c4$a;

    invoke-interface {v1, v2}, La/x4;->b(La/x4$b;)La/x4$a;

    move-result-object v1

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    check-cast v1, La/c4;

    invoke-interface {v1, v0}, La/c4;->a(La/a4;)V

    :cond_0
    sget-object v0, La/y3;->a:La/y3;

    iput-object v0, p0, La/b4;->c:La/a4;

    return-void
.end method
