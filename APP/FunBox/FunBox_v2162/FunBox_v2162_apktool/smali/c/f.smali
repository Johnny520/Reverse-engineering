.class public final Lc/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/LinkedHashMap;

.field private b:Lg/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lc/f;->a:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a(Lc/i;I)Lc/a;
    .locals 3

    iget-object v0, p0, Lc/f;->a:Ljava/util/LinkedHashMap;

    iget-object v1, p1, Lc/i;->a:Lc/j;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/e;

    if-nez v2, :cond_0

    new-instance v2, Lc/e;

    invoke-direct {v2, v1}, Lc/e;-><init>(Lc/j;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {v2}, Lc/e;->b(Lc/e;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    and-int/lit16 v0, p2, -0x1580

    if-nez v0, :cond_4

    and-int/lit8 v0, p2, 0x20

    if-eqz v0, :cond_1

    and-int/lit8 p2, p2, -0x21

    const/high16 v0, 0x20000

    or-int/2addr p2, v0

    :cond_1
    iget-object v0, p1, Lc/i;->c:Ljava/lang/String;

    const-string v1, "<init>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "<clinit>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/high16 v0, 0x10000

    or-int/2addr p2, v0

    :cond_3
    new-instance v0, Lc/c;

    invoke-direct {v0, p1, p2}, Lc/c;-><init>(Lc/i;I)V

    invoke-static {v2}, Lc/e;->b(Lc/e;)Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lc/c;->a(Lc/c;)Lc/a;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected flag: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "already declared: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final varargs b(Lc/j;Lc/j;[Lc/j;)V
    .locals 2

    iget-object v0, p0, Lc/f;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/e;

    if-nez v1, :cond_0

    new-instance v1, Lc/e;

    invoke-direct {v1, p1}, Lc/e;-><init>(Lc/j;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {v1}, Lc/e;->a(Lc/e;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Lc/e;->c(Lc/e;)V

    invoke-static {v1}, Lc/e;->d(Lc/e;)V

    invoke-static {v1, p2}, Lc/e;->g(Lc/e;Lc/j;)V

    invoke-static {v1}, Lc/e;->f(Lc/e;)V

    new-instance p1, Lc/k;

    invoke-direct {p1, p3}, Lc/k;-><init>([Lc/j;)V

    invoke-static {v1, p1}, Lc/e;->e(Lc/e;Lc/k;)V

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "already declared: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final c()[B
    .locals 3

    iget-object v0, p0, Lc/f;->b:Lg/k;

    if-nez v0, :cond_0

    new-instance v0, Ld/a;

    invoke-direct {v0}, Ld/a;-><init>()V

    const/16 v1, 0xd

    iput v1, v0, Ld/a;->a:I

    new-instance v1, Lg/k;

    invoke-direct {v1, v0}, Lg/k;-><init>(Ld/a;)V

    iput-object v1, p0, Lc/f;->b:Lg/k;

    :cond_0
    iget-object v0, p0, Lc/f;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/e;

    iget-object v2, p0, Lc/f;->b:Lg/k;

    invoke-virtual {v1}, Lc/e;->h()Lg/e;

    move-result-object v1

    invoke-virtual {v2, v1}, Lg/k;->a(Lg/e;)V

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lc/f;->b:Lg/k;

    invoke-virtual {v0}, Lg/k;->u()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
