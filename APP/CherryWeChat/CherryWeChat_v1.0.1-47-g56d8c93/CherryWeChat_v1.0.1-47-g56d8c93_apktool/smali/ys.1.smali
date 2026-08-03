.class public final Lys;
.super LEu;
.source ""

# interfaces
.implements LPm;
.implements Lfj;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x0

    sget-object v3, LE6;->a:LE6;

    const-class v2, Lio/sentry/android/replay/capture/e;

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LEu;-><init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c()LKm;
    .locals 1

    sget-object v0, LJv;->a:LKv;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lys;->h()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final h()V
    .locals 2

    iget-boolean v0, p0, LEu;->g:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, LEu;->f()LKm;

    move-result-object v0

    if-eq v0, p0, :cond_0

    check-cast v0, LPm;

    check-cast v0, Lys;

    invoke-virtual {v0}, Lys;->h()V

    return-void

    :cond_0
    new-instance v0, Lic;

    const-string v1, "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
