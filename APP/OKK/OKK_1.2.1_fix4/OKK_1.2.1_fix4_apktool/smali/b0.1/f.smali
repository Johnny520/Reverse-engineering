.class public final synthetic Lb0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LP0/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/f;->a:Ljava/lang/String;

    iput-object p2, p0, Lb0/f;->b:Ljava/lang/String;

    iput-object p3, p0, Lb0/f;->c:LP0/l;

    return-void
.end method


# virtual methods
.method public final a(Lb0/l;)Lb0/n;
    .locals 4

    iget-object v0, p0, Lb0/f;->a:Ljava/lang/String;

    const-string v1, "$id"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lb0/f;->b:Ljava/lang/String;

    const-string v2, "$title"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lb0/f;->c:LP0/l;

    const-string v3, "$block"

    invoke-static {v2, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {v2, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb0/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p1

    :goto_0
    invoke-static {p1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    sget-object v3, Lb0/m;->c:Lb0/m;

    if-nez v2, :cond_3

    check-cast p1, Lb0/j;

    instance-of v2, p1, Lb0/h;

    if-eqz v2, :cond_0

    sget-object v3, Lb0/m;->a:Lb0/m;

    goto :goto_1

    :cond_0
    instance-of v2, p1, Lb0/i;

    if-eqz v2, :cond_1

    sget-object v3, Lb0/m;->b:Lb0/m;

    goto :goto_1

    :cond_1
    instance-of v2, p1, Lb0/g;

    if-eqz v2, :cond_2

    :goto_1
    new-instance v2, Lb0/n;

    invoke-virtual {p1}, Lb0/j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v0, v1, v3, p1}, Lb0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lb0/m;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    new-instance p1, LD0/c;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Lb0/n;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    const-string v2, "error"

    :cond_4
    invoke-direct {p1, v0, v1, v3, v2}, Lb0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lb0/m;Ljava/lang/String;)V

    move-object v2, p1

    :goto_2
    return-object v2
.end method
