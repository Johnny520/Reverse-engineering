.class public final LI0/b;
.super LJ0/f;
.source "SourceFile"


# instance fields
.field public b:I

.field public final synthetic c:LP0/p;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LH0/a;LP0/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, LI0/b;->c:LP0/p;

    iput-object p3, p0, LI0/b;->d:Ljava/lang/Object;

    const-string p2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LJ0/f;-><init>(LH0/a;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LI0/b;->b:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, LI0/b;->b:I

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
    iput v1, p0, LI0/b;->b:I

    invoke-static {p1}, LA0/p;->b0(Ljava/lang/Object;)V

    iget-object p1, p0, LI0/b;->c:LP0/p;

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>"

    invoke-static {p1, v0}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LQ0/q;->a(Ljava/lang/Object;)V

    iget-object v0, p0, LI0/b;->d:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, LP0/p;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
