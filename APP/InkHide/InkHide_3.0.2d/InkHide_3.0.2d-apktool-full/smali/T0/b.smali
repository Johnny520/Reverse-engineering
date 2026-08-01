.class public final LT0/b;
.super LF0/b;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/Iterator;

.field public final d:LT0/k;

.field public final e:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 2

    .line 1
    sget-object v0, LT0/k;->b:LT0/k;

    .line 2
    .line 3
    const-string v1, "source"

    .line 4
    .line 5
    invoke-static {p1, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, LF0/b;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LT0/b;->c:Ljava/util/Iterator;

    .line 12
    .line 13
    iput-object v0, p0, LT0/b;->d:LT0/k;

    .line 14
    .line 15
    new-instance p1, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LT0/b;->e:Ljava/util/HashSet;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, LT0/b;->c:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, LT0/b;->d:LT0/k;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LT0/b;->e:Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iput-object v0, p0, LF0/b;->b:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v0, LF0/x;->a:LF0/x;

    .line 29
    .line 30
    iput-object v0, p0, LF0/b;->a:LF0/x;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    sget-object v0, LF0/x;->c:LF0/x;

    .line 34
    .line 35
    iput-object v0, p0, LF0/b;->a:LF0/x;

    .line 36
    .line 37
    return-void
.end method
