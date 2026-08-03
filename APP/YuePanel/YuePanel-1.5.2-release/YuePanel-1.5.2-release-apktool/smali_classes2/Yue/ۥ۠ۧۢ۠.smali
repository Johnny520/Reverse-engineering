.class public final LYue/ۥ۠ۧۢ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۣۣ۠ۢ;Ljava/util/concurrent/CancellationException;)V
    .locals 0
    .param p0    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "currentCoroutineContext().cancel(cause)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "*>;",
            "Ljava/util/concurrent/CancellationException;",
            ")V"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static synthetic ۥ۟(LYue/ۥۣۣ۠ۢ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۧۢ۠;->ۥ(LYue/ۥۣۣ۠ۢ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final ۥ۟۟(LYue/ۥۡۨۨ۠;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۡۨۨ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Applying \'cancellable\' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e0<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۡۨۨ۠;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from \'onSubscribe\' operator"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e0<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "Ljava/lang/Throwable;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟۠ۤ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۢ۠۟ۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۢ۠۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Applying \'conflate\' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e2\u06e0\u06df\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۡۨۨ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "SharedFlow never completes, so this terminal operation never completes."
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e0<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-static {p0, p1}, LYue/ۥۣ۠ۢۧ;->ۥۣ۟۟ۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    return-object p0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۢ۠۟ۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۢ۠۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Applying \'distinctUntilChanged\' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e2\u06e0\u06df\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۡۨۨ۠;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۡۨۨ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Applying \'flowOn\' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e0<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۣۣ۠ۢ;)LYue/ۥ۟ۧۦۥ;
    .locals 0
    .param p0    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static synthetic ۥ۟۟۟ۤ(LYue/ۥۣۣ۠ۢ;)V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "currentCoroutineContext()"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method

.method public static final ۥ۟۟۟ۥ(LYue/ۥۣۣ۠ۢ;)Z
    .locals 0
    .param p0    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static synthetic ۥ۟۟۟ۦ(LYue/ۥۣۣ۠ۢ;)V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "currentCoroutineContext().isActive"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method

.method public static final ۥ۟۟۟ۧ(LYue/ۥۡۨۨ۠;JLYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "SharedFlow never completes, so this operator has no effect."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e0<",
            "+TT;>;J",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Throwable;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠۠(LYue/ۥۣ۠ۢۡ;JLYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟ۨ(LYue/ۥۡۨۨ۠;JLYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۣ۠ۢۡ;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    new-instance p3, LYue/ۥ۠ۧۢ۠$ۥ;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, LYue/ۥ۠ۧۢ۠$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :cond_1
    invoke-static {p0, p1, p2, p3}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠۠(LYue/ۥۣ۠ۢۡ;JLYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠(LYue/ۥۡۨۨ۠;LYue/ۥۣ۠ۢۥ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "SharedFlow never completes, so this operator has no effect."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e0<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e5<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "Ljava/lang/Throwable;",
            "-",
            "Ljava/lang/Long;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠۠۠(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۥ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠۟(LYue/ۥۡۨۨ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "SharedFlow never completes, so this terminal operation never completes."
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e0<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, p1, v1, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠ۢۤ(LYue/ۥۣ۠ۢۡ;Ljava/util/List;LYue/ۥ۟ۧۤۢ;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    return-object p0
.end method

.method public static final ۥ۟۟۠۠(LYue/ۥۡۨۨ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "SharedFlow never completes, so this terminal operation never completes."
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e0<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/util/Set<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, p1, v1, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠ۢۦ(LYue/ۥۣ۠ۢۡ;Ljava/util/Set;LYue/ۥ۟ۧۤۢ;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    return-object p0
.end method
