.class public final La/j9;
.super La/vd;
.source "SourceFile"


# instance fields
.field public b:I

.field public final synthetic c:La/H7;

.field public final synthetic d:La/a4;


# direct methods
.method public constructor <init>(La/a4;La/a4;La/H7;)V
    .locals 0

    iput-object p3, p0, La/j9;->c:La/H7;

    iput-object p2, p0, La/j9;->d:La/a4;

    invoke-direct {p0, p1}, La/vd;-><init>(La/a4;)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, La/j9;->b:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, La/j9;->b:I

    invoke-static {p1}, La/xd;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v1, p0, La/j9;->b:I

    invoke-static {p1}, La/xd;->b(Ljava/lang/Object;)V

    iget-object p1, p0, La/j9;->c:La/H7;

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>"

    invoke-static {p1, v0}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, La/Kf;->a(Ljava/lang/Object;)V

    iget-object v0, p0, La/j9;->d:La/a4;

    invoke-interface {p1, v0, p0}, La/H7;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
