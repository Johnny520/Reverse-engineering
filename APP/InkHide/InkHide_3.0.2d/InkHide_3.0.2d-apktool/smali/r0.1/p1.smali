.class public final synthetic Lr0/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/a;
.implements LM0/l;


# instance fields
.field public final synthetic a:Lr0/t1;


# direct methods
.method public synthetic constructor <init>(Lr0/t1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr0/p1;->a:Lr0/t1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lr0/q1;

    .line 2
    .line 3
    iget-object v1, p0, Lr0/p1;->a:Lr0/t1;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    invoke-direct {v0, v1, v2}, Lr0/q1;-><init>(Lr0/t1;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/p1;->a:Lr0/t1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v1, "getParameterTypes(...)"

    .line 20
    .line 21
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lr0/n1;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-direct {v1, v2}, Lr0/n1;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const-string v2, ","

    .line 31
    .line 32
    const/16 v3, 0x1e

    .line 33
    .line 34
    invoke-static {p1, v2, v1, v3}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, "("

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, ")"

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1
.end method
