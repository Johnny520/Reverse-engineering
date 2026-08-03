.class public final LI0/c;
.super LJ0/a;
.source "SourceFile"


# instance fields
.field public final b:LH0/d;

.field public transient c:LH0/a;

.field public d:I

.field public final synthetic e:LP0/p;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LH0/a;LH0/d;LP0/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p3, p0, LI0/c;->e:LP0/p;

    iput-object p4, p0, LI0/c;->f:Ljava/lang/Object;

    const-string p3, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p1, p3}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LJ0/a;-><init>(LH0/a;)V

    iput-object p2, p0, LI0/c;->b:LH0/d;

    return-void
.end method


# virtual methods
.method public final c()LH0/d;
    .locals 1

    iget-object v0, p0, LI0/c;->b:LH0/d;

    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LI0/c;->d:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, LI0/c;->d:I

    invoke-static {p1}, LA0/p;->b0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v1, p0, LI0/c;->d:I

    invoke-static {p1}, LA0/p;->b0(Ljava/lang/Object;)V

    iget-object p1, p0, LI0/c;->e:LP0/p;

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>"

    invoke-static {p1, v0}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LQ0/q;->a(Ljava/lang/Object;)V

    iget-object v0, p0, LI0/c;->f:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, LP0/p;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, LI0/c;->c:LH0/a;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    iget-object v1, p0, LI0/c;->b:LH0/d;

    invoke-static {v1}, LQ0/g;->b(Ljava/lang/Object;)V

    sget-object v2, LH0/b;->a:LH0/b;

    invoke-interface {v1, v2}, LH0/d;->a(LH0/b;)LH0/c;

    move-result-object v1

    invoke-static {v1}, LQ0/g;->b(Ljava/lang/Object;)V

    check-cast v0, LY0/a;

    :cond_0
    sget-object v0, LJ0/b;->a:LJ0/b;

    iput-object v0, p0, LI0/c;->c:LH0/a;

    return-void
.end method
