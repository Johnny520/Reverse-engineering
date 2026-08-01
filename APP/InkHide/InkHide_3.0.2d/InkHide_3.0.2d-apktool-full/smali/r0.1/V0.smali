.class public final Lr0/V0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lr0/Y0;

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lr0/Y0;Ljava/lang/Class;Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr0/V0;->a:Lr0/Y0;

    .line 2
    .line 3
    iput-object p2, p0, Lr0/V0;->b:Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p3, p0, Lr0/V0;->c:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p4, p0, Lr0/V0;->d:Ljava/lang/Class;

    .line 8
    .line 9
    iput-object p5, p0, Lr0/V0;->e:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    .line 1
    const-string v0, "param"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/V0;->a:Lr0/Y0;

    .line 7
    .line 8
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v1, p0, Lr0/V0;->b:Ljava/lang/Class;

    .line 11
    .line 12
    iget-object v2, p0, Lr0/V0;->c:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v3, p0, Lr0/V0;->d:Ljava/lang/Class;

    .line 15
    .line 16
    iget-object v4, p0, Lr0/V0;->e:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const-string v6, "getDeclaredMethods(...)"

    .line 33
    .line 34
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    array-length v7, v5

    .line 43
    const/4 v8, 0x0

    .line 44
    :goto_0
    if-ge v8, v7, :cond_2

    .line 45
    .line 46
    aget-object v9, v5, v8

    .line 47
    .line 48
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    const-string v11, "getParameterTypes(...)"

    .line 53
    .line 54
    invoke-static {v10, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    array-length v10, v10

    .line 58
    if-nez v10, :cond_1

    .line 59
    .line 60
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    const-string v11, "getReturnType(...)"

    .line 65
    .line 66
    invoke-static {v10, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v10, v1}, Lr0/Y0;->E(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    if-eqz v10, :cond_1

    .line 74
    .line 75
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :catchall_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_4

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Ljava/lang/reflect/Method;

    .line 96
    .line 97
    const/4 v6, 0x1

    .line 98
    :try_start_0
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 99
    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-nez v5, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    iput-object v5, v0, Lr0/Y0;->k:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-virtual {v0, v2, v5, v3, v4}, Lr0/Y0;->k(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    :goto_2
    return-void
.end method
