.class final Lc/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lc/j;

.field private b:Z

.field private c:I

.field private d:Lc/j;

.field private e:Ljava/lang/String;

.field private f:Lc/k;

.field private g:Lg/e;

.field private final h:Ljava/util/LinkedHashMap;

.field private final i:Ljava/util/LinkedHashMap;


# direct methods
.method constructor <init>(Lc/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lc/e;->h:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lc/e;->i:Ljava/util/LinkedHashMap;

    iput-object p1, p0, Lc/e;->a:Lc/j;

    return-void
.end method

.method static bridge synthetic a(Lc/e;)Z
    .locals 0

    iget-boolean p0, p0, Lc/e;->b:Z

    return p0
.end method

.method static bridge synthetic b(Lc/e;)Ljava/util/LinkedHashMap;
    .locals 0

    iget-object p0, p0, Lc/e;->i:Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method static bridge synthetic c(Lc/e;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/e;->b:Z

    return-void
.end method

.method static bridge synthetic d(Lc/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc/e;->c:I

    return-void
.end method

.method static bridge synthetic e(Lc/e;Lc/k;)V
    .locals 0

    iput-object p1, p0, Lc/e;->f:Lc/k;

    return-void
.end method

.method static bridge synthetic f(Lc/e;)V
    .locals 1

    const-string v0, "I"

    iput-object v0, p0, Lc/e;->e:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic g(Lc/e;Lc/j;)V
    .locals 0

    iput-object p1, p0, Lc/e;->d:Lc/j;

    return-void
.end method


# virtual methods
.method final h()Lg/e;
    .locals 11

    iget-boolean v0, p0, Lc/e;->b:Z

    iget-object v1, p0, Lc/e;->i:Ljava/util/LinkedHashMap;

    iget-object v2, p0, Lc/e;->h:Ljava/util/LinkedHashMap;

    iget-object v3, p0, Lc/e;->a:Lc/j;

    if-eqz v0, :cond_4

    new-instance v0, Ld/a;

    invoke-direct {v0}, Ld/a;-><init>()V

    const/16 v4, 0xd

    iput v4, v0, Ld/a;->a:I

    iget-object v6, v3, Lc/j;->c:Lk/u;

    iget-object v3, p0, Lc/e;->g:Lg/e;

    if-nez v3, :cond_3

    new-instance v3, Lg/e;

    iget v7, p0, Lc/e;->c:I

    iget-object v4, p0, Lc/e;->d:Lc/j;

    iget-object v8, v4, Lc/j;->c:Lk/u;

    iget-object v4, p0, Lc/e;->f:Lc/k;

    iget-object v9, v4, Lc/k;->b:Ll/b;

    new-instance v10, Lk/t;

    iget-object v4, p0, Lc/e;->e:Ljava/lang/String;

    invoke-direct {v10, v4}, Lk/t;-><init>(Ljava/lang/String;)V

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Lg/e;-><init>(Lk/u;ILk/u;Ll/b;Lk/t;)V

    iput-object v3, p0, Lc/e;->g:Lg/e;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/c;

    invoke-virtual {v3, v0}, Lc/c;->d(Ld/a;)Lg/n;

    move-result-object v4

    invoke-virtual {v3}, Lc/c;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lc/e;->g:Lg/e;

    invoke-virtual {v3, v4}, Lg/e;->i(Lg/n;)V

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lc/e;->g:Lg/e;

    invoke-virtual {v3, v4}, Lg/e;->j(Lg/n;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lc/d;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lc/e;->g:Lg/e;

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Undeclared type "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " declares members: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
