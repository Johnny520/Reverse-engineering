.class public final Lf12;
.super Lvj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lf12;

.field public static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf12;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lf12;->d:Lf12;

    .line 8
    .line 9
    const-string v0, "PlusMenuInject"

    .line 10
    .line 11
    sput-object v0, Lf12;->e:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public static j()V
    .locals 5

    .line 1
    sget-object v0, Lup0;->k:Landroid/app/Activity;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "hostAct"

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    new-instance v3, Landroid/content/Intent;

    .line 9
    .line 10
    sget-object v4, Lup0;->k:Landroid/app/Activity;

    .line 11
    .line 12
    if-eqz v4, :cond_1

    .line 13
    .line 14
    const-class v1, Lnuke/ui/HomeActivity;

    .line 15
    .line 16
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v2

    .line 28
    :goto_0
    invoke-direct {v3, v4, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_2
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public static k(Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    const/4 v4, 0x0

    .line 16
    if-ge v3, v1, :cond_2

    .line 17
    .line 18
    aget-object v5, v0, v3

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const-class v7, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-static {v7}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-static {v8}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    if-nez v8, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    move-object v7, v8

    .line 38
    :goto_1
    invoke-static {v6, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move-object v5, v4

    .line 49
    :goto_2
    if-eqz v5, :cond_7

    .line 50
    .line 51
    invoke-static {v5}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz p0, :cond_7

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    array-length v1, v0

    .line 72
    :goto_3
    if-ge v2, v1, :cond_5

    .line 73
    .line 74
    aget-object v3, v0, v2

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const-class v6, Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v6}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-static {v7}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    if-nez v7, :cond_3

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_3
    move-object v6, v7

    .line 94
    :goto_4
    invoke-static {v5, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_4

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    move-object v3, v4

    .line 105
    :goto_5
    if-eqz v3, :cond_6

    .line 106
    .line 107
    invoke-static {v3}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    goto :goto_6

    .line 115
    :cond_6
    move-object p0, v4

    .line 116
    :goto_6
    instance-of v0, p0, Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    check-cast p0, Ljava/lang/String;

    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_7
    return-object v4
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Ld12;->b:Ld12;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object p0, Le12;->b:Le12;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lf12;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 5

    .line 1
    new-instance v0, Lhn1;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x6a3

    .line 9
    .line 10
    const-string v3, "Nuke"

    .line 11
    .line 12
    invoke-static {v2, v0, v3}, Lld3;->a(ILxm0;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "com.tencent.mm.ui.HomeUI$PlusActionView"

    .line 16
    .line 17
    invoke-static {v0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v2, 0x0

    .line 26
    aget-object v0, v0, v2

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v2, Leq1;

    .line 32
    .line 33
    const/4 v3, 0x6

    .line 34
    invoke-direct {v2, v3}, Leq1;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Lkg3;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct {v3, p0, v4, v2}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    sget-object v0, Ld12;->b:Ld12;

    .line 51
    .line 52
    invoke-virtual {v0}, Lv70;->d()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v2, "getView"

    .line 65
    .line 66
    iput-object v2, v0, Lzf1;->b:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lzg1;

    .line 77
    .line 78
    iget-object v0, v0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v2, Leq1;

    .line 84
    .line 85
    invoke-direct {v2, v1}, Leq1;-><init>(I)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Lkg3;

    .line 89
    .line 90
    invoke-direct {v1, p0, v4, v2}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v0, Le12;->b:Le12;

    .line 101
    .line 102
    invoke-virtual {v0}, Lv70;->d()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v1, "onItemClick"

    .line 115
    .line 116
    iput-object v1, v0, Lzf1;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lzg1;

    .line 127
    .line 128
    iget-object v0, v0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v1, Leq1;

    .line 134
    .line 135
    const/4 v2, 0x7

    .line 136
    invoke-direct {v1, v2}, Leq1;-><init>(I)V

    .line 137
    .line 138
    .line 139
    new-instance v2, Lkg3;

    .line 140
    .line 141
    invoke-direct {v2, p0, v4, v1}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    return-void
.end method
