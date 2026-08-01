.class public final LW/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/reflect/Field;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final synthetic f:Ljava/lang/reflect/Method;

.field public final synthetic g:Z

.field public final synthetic h:LT/y;

.field public final synthetic i:LT/l;

.field public final synthetic j:La0/a;

.field public final synthetic k:Z

.field public final synthetic l:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZZLjava/lang/reflect/Method;ZLT/y;LT/l;La0/a;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, LW/n;->f:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-boolean p6, p0, LW/n;->g:Z

    .line 7
    .line 8
    iput-object p7, p0, LW/n;->h:LT/y;

    .line 9
    .line 10
    iput-object p8, p0, LW/n;->i:LT/l;

    .line 11
    .line 12
    iput-object p9, p0, LW/n;->j:La0/a;

    .line 13
    .line 14
    iput-boolean p10, p0, LW/n;->k:Z

    .line 15
    .line 16
    iput-boolean p11, p0, LW/n;->l:Z

    .line 17
    .line 18
    iput-object p1, p0, LW/n;->a:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p2, p0, LW/n;->b:Ljava/lang/reflect/Field;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, LW/n;->c:Ljava/lang/String;

    .line 27
    .line 28
    iput-boolean p3, p0, LW/n;->d:Z

    .line 29
    .line 30
    iput-boolean p4, p0, LW/n;->e:Z

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Lb0/c;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LW/n;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, LW/n;->b:Ljava/lang/reflect/Field;

    .line 7
    .line 8
    iget-object v1, p0, LW/n;->f:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v1, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-static {v1, p2}, LY/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    new-instance v0, LT/p;

    .line 25
    .line 26
    const-string v1, "Accessor "

    .line 27
    .line 28
    const-string v2, " threw exception"

    .line 29
    .line 30
    invoke-static {v1, p2, v2}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    if-ne v0, p2, :cond_2

    .line 47
    .line 48
    :goto_1
    return-void

    .line 49
    :cond_2
    iget-object p2, p0, LW/n;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lb0/c;->g(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-boolean p2, p0, LW/n;->g:Z

    .line 55
    .line 56
    iget-object v1, p0, LW/n;->h:LT/y;

    .line 57
    .line 58
    if-eqz p2, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    new-instance p2, LW/s;

    .line 62
    .line 63
    iget-object v2, p0, LW/n;->j:La0/a;

    .line 64
    .line 65
    iget-object v3, p0, LW/n;->i:LT/l;

    .line 66
    .line 67
    iget-object v2, v2, La0/a;->b:Ljava/lang/reflect/Type;

    .line 68
    .line 69
    invoke-direct {p2, v3, v1, v2}, LW/s;-><init>(LT/l;LT/y;Ljava/lang/reflect/Type;)V

    .line 70
    .line 71
    .line 72
    move-object v1, p2

    .line 73
    :goto_2
    invoke-virtual {v1, p1, v0}, LT/y;->b(Lb0/c;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
