.class public final Lq8/f;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Constructor;

.field public final synthetic b:Lq8/b;

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:Ljava/lang/Class;

.field public final synthetic f:Ljava/lang/Class;

.field public final synthetic g:Lq8/h;


# direct methods
.method public constructor <init>(Lq8/h;Ljava/lang/reflect/Constructor;Lq8/b;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq8/f;->g:Lq8/h;

    .line 2
    .line 3
    iput-object p2, p0, Lq8/f;->a:Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    iput-object p3, p0, Lq8/f;->b:Lq8/b;

    .line 6
    .line 7
    iput-object p4, p0, Lq8/f;->c:Ljava/lang/Class;

    .line 8
    .line 9
    iput-object p5, p0, Lq8/f;->d:Ljava/lang/Class;

    .line 10
    .line 11
    iput-object p6, p0, Lq8/f;->e:Ljava/lang/Class;

    .line 12
    .line 13
    iput-object p7, p0, Lq8/f;->f:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lq8/f;->g:Lq8/h;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/Map;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v0, Lq8/h;->c:Le8/c;

    .line 22
    .line 23
    iget-object v4, v3, Le8/c;->l:Ljava/lang/Class;

    .line 24
    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_5

    .line 41
    .line 42
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    iget-object v6, v3, Le8/c;->l:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    array-length v1, v0

    .line 61
    if-lez v1, :cond_3

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    aget-object v0, v0, v1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto :goto_4

    .line 69
    :cond_3
    const/4 v0, 0x0

    .line 70
    :goto_0
    if-nez v0, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    iget-object v1, p0, Lq8/f;->a:Ljava/lang/reflect/Constructor;

    .line 74
    .line 75
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v1, p0, Lq8/f;->b:Lq8/b;

    .line 84
    .line 85
    invoke-static {v0, v1}, Ly4/c;->d(Ljava/lang/Object;Lq8/b;)V

    .line 86
    .line 87
    .line 88
    const-string v1, "SettingGroup_Main_Other_Hchat"

    .line 89
    .line 90
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    :goto_1
    iget-object v3, p0, Lq8/f;->c:Ljava/lang/Class;

    .line 98
    .line 99
    iget-object v4, p0, Lq8/f;->d:Ljava/lang/Class;

    .line 100
    .line 101
    iget-object v5, p0, Lq8/f;->e:Ljava/lang/Class;

    .line 102
    .line 103
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {v0, v1, v3, v4}, Lq8/h;->e(Lq8/h;Ljava/util/Map;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_6
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    instance-of v3, v1, Ljava/lang/Iterable;

    .line 119
    .line 120
    if-nez v3, :cond_7

    .line 121
    .line 122
    :goto_2
    return-void

    .line 123
    :cond_7
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 124
    .line 125
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 126
    .line 127
    .line 128
    check-cast v1, Ljava/lang/Iterable;

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_8

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_8
    iget-object v1, p0, Lq8/f;->f:Ljava/lang/Class;

    .line 149
    .line 150
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v1, "[Hchat:SettingsInjector] [Modern] ClassesProvider \u6ce8\u5165\u5931\u8d25: "

    .line 163
    .line 164
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    return-void
.end method
