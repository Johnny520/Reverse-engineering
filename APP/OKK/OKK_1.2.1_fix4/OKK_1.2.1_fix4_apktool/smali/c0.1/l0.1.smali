.class public final Lc0/l0;
.super LJ0/g;
.source "SourceFile"

# interfaces
.implements LP0/p;


# instance fields
.field public c:Ljava/lang/Class;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;LH0/a;)V
    .locals 0

    iput-object p1, p0, Lc0/l0;->f:Ljava/lang/Class;

    invoke-direct {p0, p2}, LJ0/g;-><init>(LH0/a;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV0/i;

    check-cast p2, LH0/a;

    invoke-virtual {p0, p1, p2}, Lc0/l0;->d(Ljava/lang/Object;LH0/a;)LH0/a;

    move-result-object p1

    check-cast p1, Lc0/l0;

    sget-object p2, LD0/l;->a:LD0/l;

    invoke-virtual {p1, p2}, Lc0/l0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;LH0/a;)LH0/a;
    .locals 2

    new-instance v0, Lc0/l0;

    iget-object v1, p0, Lc0/l0;->f:Ljava/lang/Class;

    invoke-direct {v0, v1, p2}, Lc0/l0;-><init>(Ljava/lang/Class;LH0/a;)V

    iput-object p1, v0, Lc0/l0;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, LI0/a;->a:LI0/a;

    iget v1, p0, Lc0/l0;->d:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lc0/l0;->c:Ljava/lang/Class;

    iget-object v3, p0, Lc0/l0;->e:Ljava/lang/Object;

    check-cast v3, LV0/i;

    invoke-static {p1}, LA0/p;->b0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LA0/p;->b0(Ljava/lang/Object;)V

    iget-object p1, p0, Lc0/l0;->e:Ljava/lang/Object;

    check-cast p1, LV0/i;

    iget-object v1, p0, Lc0/l0;->f:Ljava/lang/Class;

    move-object v3, p1

    :goto_0
    if-eqz v1, :cond_3

    const-class p1, Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p1

    const-string v4, "getDeclaredMethods(...)"

    invoke-static {p1, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LE0/j;->h0([Ljava/lang/Object;)LV0/h;

    move-result-object p1

    iput-object v3, p0, Lc0/l0;->e:Ljava/lang/Object;

    iput-object v1, p0, Lc0/l0;->c:Ljava/lang/Class;

    iput v2, p0, Lc0/l0;->d:I

    invoke-virtual {v3, p1, p0}, LV0/i;->e(LV0/h;LH0/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_3
    sget-object p1, LD0/l;->a:LD0/l;

    return-object p1
.end method
