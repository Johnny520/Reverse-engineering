.class public final LW/s;
.super LT/y;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LT/l;LT/y;Ljava/lang/reflect/Type;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LW/s;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LW/s;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LW/s;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, LW/s;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 11

    const/4 v0, 0x1

    iput v0, p0, LW/s;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LW/s;->b:Ljava/lang/Object;

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LW/s;->c:Ljava/lang/Object;

    .line 8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LW/s;->d:Ljava/lang/Object;

    .line 9
    :try_start_0
    new-instance v0, LW/w;

    invoke-direct {v0, p1}, LW/w;-><init>(Ljava/lang/Class;)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/reflect/Field;

    .line 10
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    const/4 v4, 0x0

    .line 11
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Enum;

    .line 12
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    .line 13
    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v6

    .line 14
    const-class v7, LU/b;

    invoke-virtual {v3, v7}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, LU/b;

    if-eqz v3, :cond_0

    .line 15
    invoke-interface {v3}, LU/b;->value()Ljava/lang/String;

    move-result-object v5

    .line 16
    invoke-interface {v3}, LU/b;->alternate()[Ljava/lang/String;

    move-result-object v3

    array-length v7, v3

    move v8, v1

    :goto_1
    if-ge v8, v7, :cond_0

    aget-object v9, v3, v8

    .line 17
    iget-object v10, p0, LW/s;->b:Ljava/lang/Object;

    check-cast v10, Ljava/util/HashMap;

    invoke-virtual {v10, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    .line 18
    :cond_0
    iget-object v3, p0, LW/s;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    iget-object v3, p0, LW/s;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object v3, p0, LW/s;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 21
    :goto_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public final a(Lb0/b;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LW/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, LW/s;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Enum;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, LW/s;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Ljava/lang/Enum;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object p1, v0

    .line 47
    :goto_0
    return-object p1

    .line 48
    :pswitch_0
    iget-object v0, p0, LW/s;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, LT/y;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lb0/c;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, LW/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/lang/Enum;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, LW/s;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Ljava/lang/String;

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, LW/s;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/lang/reflect/Type;

    .line 29
    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    instance-of v1, v0, Ljava/lang/Class;

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    instance-of v1, v0, Ljava/lang/reflect/TypeVariable;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v1, v0

    .line 46
    :goto_1
    iget-object v2, p0, LW/s;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, LT/y;

    .line 49
    .line 50
    if-eq v1, v0, :cond_8

    .line 51
    .line 52
    new-instance v0, La0/a;

    .line 53
    .line 54
    invoke-direct {v0, v1}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, LW/s;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, LT/l;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, LT/l;->d(La0/a;)LT/y;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    instance-of v1, v0, LW/o;

    .line 66
    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_3
    move-object v1, v2

    .line 71
    :goto_2
    instance-of v3, v1, LT/k;

    .line 72
    .line 73
    if-eqz v3, :cond_6

    .line 74
    .line 75
    move-object v3, v1

    .line 76
    check-cast v3, LT/k;

    .line 77
    .line 78
    iget-object v3, v3, LT/k;->a:LT/y;

    .line 79
    .line 80
    if-eqz v3, :cond_5

    .line 81
    .line 82
    if-ne v3, v1, :cond_4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move-object v1, v3

    .line 86
    goto :goto_2

    .line 87
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string p2, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    .line 90
    .line 91
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_6
    :goto_3
    instance-of v1, v1, LW/o;

    .line 96
    .line 97
    if-nez v1, :cond_7

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_7
    :goto_4
    move-object v2, v0

    .line 101
    :cond_8
    :goto_5
    invoke-virtual {v2, p1, p2}, LT/y;->b(Lb0/c;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
