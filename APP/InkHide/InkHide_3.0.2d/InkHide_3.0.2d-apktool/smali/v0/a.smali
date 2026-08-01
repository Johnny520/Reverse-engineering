.class public final synthetic Lv0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/p;
.implements LM0/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv0/a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, LD0/c;

    .line 8
    .line 9
    const-string p2, "onFetch retry:"

    .line 10
    .line 11
    invoke-static {p1, p2}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p2, p0, Lv0/a;->a:Ljava/lang/String;

    .line 16
    .line 17
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Li0/a;->c([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, LE0/i;->a:LE0/i;

    .line 25
    .line 26
    return-object p1
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lz0/p;

    .line 2
    .line 3
    const-string v0, "it"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p1, Lz0/p;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, p0, Lv0/a;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p1, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method
