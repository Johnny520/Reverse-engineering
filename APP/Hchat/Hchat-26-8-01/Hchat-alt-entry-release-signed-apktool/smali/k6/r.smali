.class public final Lk6/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/reflect/Field;

.field public final synthetic c:Ljava/lang/reflect/Method;

.field public final synthetic d:Lh6/n;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Lh6/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lk6/r;->c:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p4, p0, Lk6/r;->d:Lh6/n;

    .line 7
    .line 8
    iput-object p1, p0, Lk6/r;->a:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p2, p0, Lk6/r;->b:Ljava/lang/reflect/Field;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lo6/a;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk6/r;->c:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception p1

    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-static {v0, p2}, Ll6/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Laf/d;

    .line 18
    .line 19
    const-string v1, "Accessor "

    .line 20
    .line 21
    const-string v2, " threw exception"

    .line 22
    .line 23
    invoke-static {v1, p2, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_0
    iget-object v0, p0, Lk6/r;->b:Ljava/lang/reflect/Field;

    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    if-ne v0, p2, :cond_1

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object p2, p0, Lk6/r;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lo6/a;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, Lk6/r;->d:Lh6/n;

    .line 50
    .line 51
    invoke-virtual {p2, p1, v0}, Lh6/n;->b(Lo6/a;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
