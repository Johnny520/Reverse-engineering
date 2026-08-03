.class public final Lu9/g;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lu9/h;


# direct methods
.method public synthetic constructor <init>(Lu9/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu9/g;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lu9/g;->b:Lu9/h;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    iget v0, p0, Lu9/g;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 10
    .line 11
    instance-of v0, p1, Landroid/app/Activity;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Landroid/app/Activity;

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    if-eqz p1, :cond_4

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    if-eqz v1, :cond_4

    .line 26
    .line 27
    const-class v2, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_4

    .line 34
    .line 35
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    move-object v4, v3

    .line 54
    check-cast v4, Ljava/lang/reflect/Field;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-nez v5, :cond_1

    .line 65
    .line 66
    const-class v5, Landroid/app/Activity;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move-object v3, v0

    .line 80
    :goto_1
    check-cast v3, Ljava/lang/reflect/Field;

    .line 81
    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    instance-of v1, p1, Landroid/app/Activity;

    .line 89
    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    check-cast p1, Landroid/app/Activity;

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    goto :goto_0

    .line 100
    :cond_4
    move-object p1, v0

    .line 101
    :goto_2
    if-eqz p1, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    invoke-static {p1}, Lu9/h;->d(Landroid/view/View;)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    iget-object v0, p0, Lu9/g;->b:Lu9/h;

    .line 122
    .line 123
    iget-object v1, v0, Lu9/h;->e:Landroid/content/SharedPreferences;

    .line 124
    .line 125
    const-string v2, "hide_wechat_bottom_bar_enable"

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-virtual {v0, p1, v1}, Lu9/h;->a(Landroid/view/View;Z)V

    .line 133
    .line 134
    .line 135
    :cond_5
    return-void

    .line 136
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 137
    .line 138
    instance-of v0, p1, Landroid/app/Activity;

    .line 139
    .line 140
    if-eqz v0, :cond_6

    .line 141
    .line 142
    check-cast p1, Landroid/app/Activity;

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_6
    const/4 p1, 0x0

    .line 146
    :goto_3
    if-eqz p1, :cond_7

    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eqz p1, :cond_7

    .line 159
    .line 160
    invoke-static {p1}, Lu9/h;->d(Landroid/view/View;)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    iget-object v0, p0, Lu9/g;->b:Lu9/h;

    .line 167
    .line 168
    iget-object v1, v0, Lu9/h;->e:Landroid/content/SharedPreferences;

    .line 169
    .line 170
    const-string v2, "hide_wechat_bottom_bar_enable"

    .line 171
    .line 172
    const/4 v3, 0x0

    .line 173
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {v0, p1, v1}, Lu9/h;->a(Landroid/view/View;Z)V

    .line 178
    .line 179
    .line 180
    :cond_7
    return-void

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
