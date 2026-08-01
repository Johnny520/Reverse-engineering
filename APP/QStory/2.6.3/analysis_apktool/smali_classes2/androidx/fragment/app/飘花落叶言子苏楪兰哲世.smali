.class public final synthetic Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/core/os/飘花落叶言子楪世兰苏哲;
.implements L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏世哲兰;
.implements L飘花落叶言楪苏兰世子哲/飘花落叶言子楪苏哲世兰;
.implements Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;
.implements Lcom/google/gson/internal/飘花落叶言子楪苏兰哲世;
.implements Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;
.implements L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;
.implements Landroidx/core/view/飘花落叶言子世楪苏兰哲;
.implements L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏哲世兰;
.implements L飘花落叶言世兰子苏楪哲/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Lcom/bumptech/glide/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public onCancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public 飘花落叶言子楪世兰苏哲()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    const-string v0, "\' with no args"

    .line 6
    .line 7
    const-string v1, "Failed to invoke constructor \'"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    sget-object v0, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    const-string v0, "Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 19
    .line 20
    invoke-static {v0, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :catch_1
    move-exception v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :catch_2
    move-exception v2

    .line 53
    new-instance v3, Ljava/lang/RuntimeException;

    .line 54
    .line 55
    invoke-static {p0}, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v4, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-direct {v3, p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v3
.end method

.method public 飘花落叶言子楪世哲兰苏()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪兰哲苏(Lcom/google/android/material/internal/CheckableImageButton;Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public 飘花落叶言子楪世哲苏兰(Ljava/util/List;)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v1, 0x4b9

    .line 4
    .line 5
    const/16 v2, 0x4b8

    .line 6
    .line 7
    const/16 v3, 0x4b7

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    iget-object v0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v0, p1, v3}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ljava/lang/Thread;

    .line 59
    .line 60
    new-instance v1, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 61
    .line 62
    const/16 v2, 0x1a

    .line 63
    .line 64
    invoke-direct {v1, p0, v2, p1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_0
    check-cast p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲兰苏;

    .line 75
    .line 76
    iget-object v0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 77
    .line 78
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v0, p1, v3}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Ljava/lang/Thread;

    .line 119
    .line 120
    new-instance v1, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 121
    .line 122
    const/16 v2, 0x19

    .line 123
    .line 124
    invoke-direct {v1, p0, v2, p1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_1
    check-cast p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏兰哲;

    .line 135
    .line 136
    iget-object v0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 137
    .line 138
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v0, p1, v3}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ExecutorService;

    .line 179
    .line 180
    new-instance v1, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 181
    .line 182
    const/16 v2, 0x18

    .line 183
    .line 184
    invoke-direct {v1, p0, v2, p1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 4
    .line 5
    check-cast p2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;

    .line 6
    .line 7
    invoke-static {p0, p2, p1, p3}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/view/PluginItemView;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v5, 0x6

    .line 10
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    const-string v9, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 13
    .line 14
    const/16 v10, 0x8

    .line 15
    .line 16
    const/high16 v11, 0x240f0000

    .line 17
    .line 18
    const-class v13, Ljava/util/List;

    .line 19
    .line 20
    const/16 v14, 0xf7

    .line 21
    .line 22
    const-class v15, Ljava/lang/String;

    .line 23
    .line 24
    const/16 v16, 0xa4

    .line 25
    .line 26
    const/16 v17, 0x7c1

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    const/16 v18, 0x8c

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const/16 v19, 0x98

    .line 33
    .line 34
    const/4 v8, 0x1

    .line 35
    const/16 v20, 0xa0

    .line 36
    .line 37
    const/4 v12, 0x0

    .line 38
    iget-object v0, v0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 39
    .line 40
    packed-switch v2, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    :pswitch_0
    check-cast v0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世哲兰苏;

    .line 44
    .line 45
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 48
    .line 49
    aget-object v2, v2, v8

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static/range {v16 .. v16}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iget-object v5, v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 64
    .line 65
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 66
    .line 67
    new-array v4, v12, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v3, v2, v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    invoke-static {v4, v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_0

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    invoke-static/range {v19 .. v19}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-class v3, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-static {v3, v0, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_2

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-static/range {v18 .. v18}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    iget-object v5, v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 136
    .line 137
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 138
    .line 139
    const/16 v4, 0xb2

    .line 140
    .line 141
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-static {v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    iget-object v5, v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 150
    .line 151
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 152
    .line 153
    new-array v4, v12, [Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {v3, v2, v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    if-eqz v2, :cond_1

    .line 160
    .line 161
    const/16 v3, 0x472

    .line 162
    .line 163
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-static {v6, v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const/16 v4, 0x473

    .line 178
    .line 179
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-static {v6, v4, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    const/16 v4, 0x1770

    .line 194
    .line 195
    if-le v2, v4, :cond_1

    .line 196
    .line 197
    if-le v3, v4, :cond_1

    .line 198
    .line 199
    invoke-virtual {v1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_2
    :goto_0
    return-void

    .line 203
    :pswitch_1
    check-cast v0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世哲苏兰;

    .line 204
    .line 205
    sget-object v2, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 206
    .line 207
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 208
    .line 209
    instance-of v3, v2, Ljava/io/File;

    .line 210
    .line 211
    if-eqz v3, :cond_3

    .line 212
    .line 213
    check-cast v2, Ljava/io/File;

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_3
    move-object v2, v7

    .line 217
    :goto_1
    if-nez v2, :cond_4

    .line 218
    .line 219
    goto/16 :goto_5

    .line 220
    .line 221
    :cond_4
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getThrowable()Ljava/lang/Throwable;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    if-eqz v3, :cond_5

    .line 230
    .line 231
    goto/16 :goto_5

    .line 232
    .line 233
    :cond_5
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    instance-of v4, v3, [Ljava/lang/String;

    .line 238
    .line 239
    if-eqz v4, :cond_6

    .line 240
    .line 241
    check-cast v3, [Ljava/lang/String;

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    move-object v3, v7

    .line 245
    :goto_2
    if-nez v3, :cond_7

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_7
    iget-object v0, v0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/HashSet;

    .line 249
    .line 250
    if-eqz v0, :cond_d

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    const/16 v4, 0x4e5

    .line 257
    .line 258
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-eqz v4, :cond_c

    .line 269
    .line 270
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    const/16 v5, 0x4e6

    .line 275
    .line 276
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    check-cast v4, Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-static {v2, v4, v12}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_8

    .line 292
    .line 293
    array-length v0, v3

    .line 294
    if-nez v0, :cond_9

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 298
    .line 299
    array-length v2, v3

    .line 300
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 301
    .line 302
    .line 303
    array-length v2, v3

    .line 304
    move v4, v12

    .line 305
    :goto_3
    if-ge v4, v2, :cond_b

    .line 306
    .line 307
    aget-object v5, v3, v4

    .line 308
    .line 309
    if-eqz v5, :cond_a

    .line 310
    .line 311
    sget-object v6, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 312
    .line 313
    invoke-virtual {v6, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-nez v6, :cond_a

    .line 318
    .line 319
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_b
    new-array v2, v12, [Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    move-object v3, v0

    .line 332
    check-cast v3, [Ljava/lang/String;

    .line 333
    .line 334
    :goto_4
    invoke-virtual {v1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_c
    :goto_5
    return-void

    .line 338
    :cond_d
    const/16 v0, 0x8ea

    .line 339
    .line 340
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v7

    .line 348
    :pswitch_2
    check-cast v0, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世兰苏哲;

    .line 349
    .line 350
    sget-object v2, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 351
    .line 352
    new-instance v2, Landroid/os/Handler;

    .line 353
    .line 354
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 359
    .line 360
    .line 361
    new-instance v3, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;

    .line 362
    .line 363
    invoke-direct {v3, v0, v1}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世兰苏哲;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :pswitch_3
    check-cast v0, Ljava/lang/reflect/Method;

    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 377
    .line 378
    invoke-static {v0, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-eqz v0, :cond_e

    .line 383
    .line 384
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 385
    .line 386
    :cond_e
    invoke-virtual {v1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :pswitch_4
    check-cast v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲兰苏;

    .line 391
    .line 392
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 393
    .line 394
    aget-object v2, v2, v8

    .line 395
    .line 396
    const-string v3, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 397
    .line 398
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-static {v15, v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    check-cast v2, Ljava/lang/String;

    .line 407
    .line 408
    iget-object v3, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 409
    .line 410
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    if-nez v4, :cond_10

    .line 415
    .line 416
    new-instance v4, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;

    .line 417
    .line 418
    invoke-direct {v4}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 419
    .line 420
    .line 421
    new-instance v6, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;

    .line 422
    .line 423
    invoke-direct {v6, v4}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;)V

    .line 424
    .line 425
    .line 426
    new-instance v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 427
    .line 428
    invoke-direct {v4, v5}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4, v2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    const-string v5, "HEAD"

    .line 435
    .line 436
    invoke-virtual {v4, v5, v7}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;)V

    .line 437
    .line 438
    .line 439
    new-instance v5, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;

    .line 440
    .line 441
    invoke-direct {v5, v4}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 442
    .line 443
    .line 444
    new-instance v4, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;

    .line 445
    .line 446
    invoke-direct {v4, v6, v5}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v4}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    const/16 v5, 0x209

    .line 454
    .line 455
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    iget-object v6, v4, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲苏兰世;

    .line 460
    .line 461
    invoke-virtual {v6, v5}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    if-nez v5, :cond_f

    .line 466
    .line 467
    move-object v5, v7

    .line 468
    :cond_f
    invoke-virtual {v4}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->close()V

    .line 469
    .line 470
    .line 471
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 472
    .line 473
    .line 474
    move-result-wide v4

    .line 475
    goto :goto_6

    .line 476
    :cond_10
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    check-cast v4, Ljava/lang/Long;

    .line 481
    .line 482
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 483
    .line 484
    .line 485
    move-result-wide v4

    .line 486
    :goto_6
    const-wide/32 v8, 0x6400000

    .line 487
    .line 488
    .line 489
    cmp-long v6, v4, v8

    .line 490
    .line 491
    if-gtz v6, :cond_11

    .line 492
    .line 493
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v6

    .line 497
    if-eqz v6, :cond_13

    .line 498
    .line 499
    :cond_11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 500
    .line 501
    .line 502
    move-result-wide v8

    .line 503
    iget-wide v10, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:J

    .line 504
    .line 505
    const-wide/32 v12, 0xea60

    .line 506
    .line 507
    .line 508
    add-long/2addr v10, v12

    .line 509
    cmp-long v6, v8, v10

    .line 510
    .line 511
    if-lez v6, :cond_12

    .line 512
    .line 513
    const/16 v6, 0x20a

    .line 514
    .line 515
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    invoke-static {v6}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 523
    .line 524
    .line 525
    move-result-wide v8

    .line 526
    iput-wide v8, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:J

    .line 527
    .line 528
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    :cond_12
    invoke-virtual {v1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    :cond_13
    return-void

    .line 539
    :pswitch_5
    check-cast v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲苏兰;

    .line 540
    .line 541
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 542
    .line 543
    aget-object v1, v1, v3

    .line 544
    .line 545
    check-cast v1, Ljava/util/ArrayList;

    .line 546
    .line 547
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    :cond_14
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    if-eqz v2, :cond_17

    .line 556
    .line 557
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    move-result-object v5

    .line 565
    invoke-static {v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 566
    .line 567
    .line 568
    move-result-object v5

    .line 569
    invoke-static {v14}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v7

    .line 573
    iget-object v8, v5, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 574
    .line 575
    iput-object v7, v8, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 576
    .line 577
    new-array v7, v12, [Ljava/lang/Object;

    .line 578
    .line 579
    invoke-virtual {v5, v2, v7}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    if-nez v2, :cond_15

    .line 584
    .line 585
    goto :goto_7

    .line 586
    :cond_15
    const-string v5, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 587
    .line 588
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    invoke-static {v6, v5, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    check-cast v5, Ljava/lang/Integer;

    .line 597
    .line 598
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 599
    .line 600
    .line 601
    move-result v5

    .line 602
    if-ne v5, v3, :cond_14

    .line 603
    .line 604
    iget-object v5, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 605
    .line 606
    const-string v7, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 607
    .line 608
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v7

    .line 612
    invoke-virtual {v5, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v5

    .line 616
    check-cast v5, Ljava/lang/String;

    .line 617
    .line 618
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 619
    .line 620
    .line 621
    move-result v7

    .line 622
    if-eqz v7, :cond_16

    .line 623
    .line 624
    goto :goto_8

    .line 625
    :cond_16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    invoke-static {v7}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 630
    .line 631
    .line 632
    move-result-object v7

    .line 633
    const/16 v8, 0x154

    .line 634
    .line 635
    invoke-static {v8}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v8

    .line 639
    iget-object v9, v7, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 640
    .line 641
    iput-object v8, v9, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 642
    .line 643
    filled-new-array {v15}, [Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    move-result-object v8

    .line 647
    iput-object v8, v9, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 648
    .line 649
    iput-object v4, v9, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 650
    .line 651
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    invoke-virtual {v7, v2, v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    goto :goto_7

    .line 659
    :cond_17
    :goto_8
    return-void

    .line 660
    :pswitch_6
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 661
    .line 662
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 663
    .line 664
    aget-object v1, v1, v12

    .line 665
    .line 666
    invoke-static {v13, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    check-cast v1, Ljava/util/List;

    .line 671
    .line 672
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    invoke-static/range {v20 .. v20}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v3

    .line 680
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    move-result-object v3

    .line 684
    invoke-static {v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    invoke-static/range {v16 .. v16}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    new-array v4, v12, [Ljava/lang/Object;

    .line 693
    .line 694
    invoke-static {v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    invoke-static {v3}, Llin/xposed/hook/util/qq/QQMessageUtils;->getMsgRecordPicUrlList(Ljava/lang/Object;)Ljava/util/List;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 703
    .line 704
    .line 705
    move-result v4

    .line 706
    if-eqz v4, :cond_18

    .line 707
    .line 708
    goto :goto_9

    .line 709
    :cond_18
    const/16 v4, 0x122

    .line 710
    .line 711
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v4

    .line 715
    new-instance v5, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰苏哲楪;

    .line 716
    .line 717
    invoke-direct {v5, v0, v3, v8}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰苏哲楪;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;Ljava/util/List;I)V

    .line 718
    .line 719
    .line 720
    invoke-static {v2, v4, v11, v5}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;ILjava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    invoke-interface {v1, v12, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 725
    .line 726
    .line 727
    :goto_9
    return-void

    .line 728
    :pswitch_7
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;

    .line 729
    .line 730
    iget-object v0, v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 731
    .line 732
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 733
    .line 734
    invoke-virtual {v0, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    return-void

    .line 741
    :pswitch_8
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪苏兰;

    .line 742
    .line 743
    iget-object v0, v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 744
    .line 745
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 746
    .line 747
    aget-object v1, v1, v3

    .line 748
    .line 749
    check-cast v1, Ljava/util/ArrayList;

    .line 750
    .line 751
    const/4 v2, -0x1

    .line 752
    move v5, v2

    .line 753
    move v6, v5

    .line 754
    move v4, v12

    .line 755
    :goto_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 756
    .line 757
    .line 758
    move-result v7

    .line 759
    if-ge v4, v7, :cond_1b

    .line 760
    .line 761
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v7

    .line 765
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    move-result-object v8

    .line 769
    invoke-static {v8}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 770
    .line 771
    .line 772
    move-result-object v8

    .line 773
    invoke-static {v14}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v9

    .line 777
    iget-object v10, v8, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 778
    .line 779
    iput-object v9, v10, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 780
    .line 781
    new-array v9, v12, [Ljava/lang/Object;

    .line 782
    .line 783
    invoke-virtual {v8, v7, v9}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v7

    .line 787
    if-eqz v7, :cond_1a

    .line 788
    .line 789
    if-ne v5, v2, :cond_19

    .line 790
    .line 791
    move v5, v4

    .line 792
    :cond_19
    move v6, v4

    .line 793
    :cond_1a
    add-int/lit8 v4, v4, 0x1

    .line 794
    .line 795
    goto :goto_a

    .line 796
    :cond_1b
    if-ne v5, v2, :cond_1c

    .line 797
    .line 798
    goto :goto_b

    .line 799
    :cond_1c
    const-string v2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 800
    .line 801
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v2

    .line 805
    invoke-virtual {v0, v2}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    check-cast v2, Ljava/lang/String;

    .line 810
    .line 811
    const-string v4, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 812
    .line 813
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v4

    .line 817
    invoke-virtual {v0, v4}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v4

    .line 821
    check-cast v4, Ljava/lang/String;

    .line 822
    .line 823
    const/16 v7, 0xf3

    .line 824
    .line 825
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v7

    .line 829
    invoke-virtual {v0, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    check-cast v0, Ljava/lang/String;

    .line 834
    .line 835
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 836
    .line 837
    .line 838
    move-result v7

    .line 839
    if-nez v7, :cond_1d

    .line 840
    .line 841
    new-instance v7, Ljava/text/SimpleDateFormat;

    .line 842
    .line 843
    sget-object v8, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 844
    .line 845
    invoke-direct {v7, v0, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 846
    .line 847
    .line 848
    new-instance v0, Ljava/util/Date;

    .line 849
    .line 850
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v7, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    const-string v7, "\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 858
    .line 859
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v8

    .line 863
    invoke-virtual {v2, v8, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v2

    .line 867
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v7

    .line 871
    invoke-virtual {v4, v7, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v4

    .line 875
    :cond_1d
    invoke-static {v2}, Llin/xposed/hook/util/qq/CreateElement;->createTextElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-virtual {v1, v5, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 880
    .line 881
    .line 882
    add-int/2addr v6, v3

    .line 883
    invoke-static {v4}, Llin/xposed/hook/util/qq/CreateElement;->createTextElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-virtual {v1, v6, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    :goto_b
    return-void

    .line 891
    :pswitch_9
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰苏世;

    .line 892
    .line 893
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 894
    .line 895
    check-cast v1, Landroid/widget/LinearLayout;

    .line 896
    .line 897
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 898
    .line 899
    .line 900
    move-result-object v2

    .line 901
    invoke-virtual {v1, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 902
    .line 903
    .line 904
    move-result-object v4

    .line 905
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 906
    .line 907
    .line 908
    move-result-object v4

    .line 909
    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 910
    .line 911
    iget-object v0, v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏哲世;

    .line 912
    .line 913
    invoke-static {v0, v2}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲兰世(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏哲世;Landroid/content/Context;)Landroid/widget/ImageView;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 918
    .line 919
    .line 920
    move-result v2

    .line 921
    sub-int/2addr v2, v3

    .line 922
    invoke-virtual {v1, v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 923
    .line 924
    .line 925
    return-void

    .line 926
    :pswitch_a
    move-object v6, v0

    .line 927
    check-cast v6, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰苏世;

    .line 928
    .line 929
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 930
    .line 931
    move-object v7, v0

    .line 932
    check-cast v7, Landroid/widget/LinearLayout;

    .line 933
    .line 934
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 935
    .line 936
    .line 937
    move-result-object v8

    .line 938
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 939
    .line 940
    .line 941
    move-result v0

    .line 942
    const/4 v1, 0x4

    .line 943
    if-lt v0, v1, :cond_1f

    .line 944
    .line 945
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 946
    .line 947
    .line 948
    move-result-object v9

    .line 949
    if-nez v9, :cond_1e

    .line 950
    .line 951
    goto :goto_c

    .line 952
    :cond_1e
    new-instance v5, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;

    .line 953
    .line 954
    const/4 v10, 0x1

    .line 955
    invoke-direct/range {v5 .. v10}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v7, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 959
    .line 960
    .line 961
    goto :goto_c

    .line 962
    :cond_1f
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 963
    .line 964
    .line 965
    move-result v0

    .line 966
    if-lt v0, v3, :cond_20

    .line 967
    .line 968
    new-instance v0, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 969
    .line 970
    invoke-direct {v0, v6, v7, v8, v10}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v7, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 974
    .line 975
    .line 976
    :cond_20
    :goto_c
    return-void

    .line 977
    :pswitch_b
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 978
    .line 979
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 980
    .line 981
    aget-object v1, v1, v12

    .line 982
    .line 983
    invoke-static {v13, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    check-cast v1, Ljava/util/List;

    .line 988
    .line 989
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v2

    .line 993
    invoke-static/range {v20 .. v20}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v3

    .line 997
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    move-result-object v3

    .line 1001
    invoke-static {v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    invoke-static/range {v16 .. v16}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    new-array v4, v12, [Ljava/lang/Object;

    .line 1010
    .line 1011
    invoke-static {v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v3

    .line 1015
    invoke-static {v3}, Llin/xposed/hook/util/qq/QQMessageUtils;->getMsgRecordPicUrlList(Ljava/lang/Object;)Ljava/util/List;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v3

    .line 1019
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v4

    .line 1023
    if-eqz v4, :cond_21

    .line 1024
    .line 1025
    goto :goto_d

    .line 1026
    :cond_21
    const/16 v4, 0xa5

    .line 1027
    .line 1028
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v4

    .line 1032
    new-instance v5, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪苏哲兰世;

    .line 1033
    .line 1034
    invoke-direct {v5, v0, v3, v8}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪苏哲兰世;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;Ljava/util/List;I)V

    .line 1035
    .line 1036
    .line 1037
    invoke-static {v2, v4, v11, v5}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;ILjava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    invoke-interface {v1, v12, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1042
    .line 1043
    .line 1044
    :goto_d
    return-void

    .line 1045
    :pswitch_c
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪苏世兰哲;

    .line 1046
    .line 1047
    const/16 v2, 0x97

    .line 1048
    .line 1049
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v2

    .line 1053
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v2

    .line 1057
    if-eqz v2, :cond_23

    .line 1058
    .line 1059
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    array-length v3, v2

    .line 1064
    :goto_e
    if-ge v12, v3, :cond_23

    .line 1065
    .line 1066
    aget-object v4, v2, v12

    .line 1067
    .line 1068
    invoke-virtual {v4, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1069
    .line 1070
    .line 1071
    iget-object v5, v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 1072
    .line 1073
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v6

    .line 1077
    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v5

    .line 1081
    if-eqz v5, :cond_22

    .line 1082
    .line 1083
    new-instance v5, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;

    .line 1084
    .line 1085
    invoke-direct {v5, v10}, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v0, v4, v5}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 1089
    .line 1090
    .line 1091
    :cond_22
    add-int/lit8 v12, v12, 0x1

    .line 1092
    .line 1093
    goto :goto_e

    .line 1094
    :cond_23
    invoke-virtual {v1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1095
    .line 1096
    .line 1097
    return-void

    .line 1098
    :pswitch_d
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世兰哲苏;

    .line 1099
    .line 1100
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1101
    .line 1102
    aget-object v1, v1, v3

    .line 1103
    .line 1104
    check-cast v1, Ljava/util/ArrayList;

    .line 1105
    .line 1106
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v1

    .line 1110
    :cond_24
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1111
    .line 1112
    .line 1113
    move-result v2

    .line 1114
    if-eqz v2, :cond_25

    .line 1115
    .line 1116
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v2

    .line 1120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v3

    .line 1124
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v3

    .line 1128
    invoke-static/range {v18 .. v18}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v5

    .line 1132
    iget-object v6, v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 1133
    .line 1134
    iput-object v5, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 1135
    .line 1136
    new-array v5, v12, [Ljava/lang/Object;

    .line 1137
    .line 1138
    invoke-virtual {v3, v2, v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v2

    .line 1142
    if-eqz v2, :cond_24

    .line 1143
    .line 1144
    const/16 v3, 0x8d

    .line 1145
    .line 1146
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v3

    .line 1150
    const-class v5, Ljava/lang/Integer;

    .line 1151
    .line 1152
    invoke-static {v5, v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v3

    .line 1156
    check-cast v3, Ljava/lang/Integer;

    .line 1157
    .line 1158
    invoke-virtual {v0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世()Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v3

    .line 1162
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v5

    .line 1166
    if-nez v5, :cond_24

    .line 1167
    .line 1168
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v5

    .line 1172
    invoke-static {v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v5

    .line 1176
    const/16 v6, 0x8e

    .line 1177
    .line 1178
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v6

    .line 1182
    iget-object v7, v5, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 1183
    .line 1184
    iput-object v6, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 1185
    .line 1186
    filled-new-array {v15}, [Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v6

    .line 1190
    iput-object v6, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 1191
    .line 1192
    iput-object v4, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 1193
    .line 1194
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v3

    .line 1198
    invoke-virtual {v5, v2, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    goto :goto_f

    .line 1202
    :cond_25
    return-void

    .line 1203
    :pswitch_e
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰哲楪苏;

    .line 1204
    .line 1205
    const-string v2, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1206
    .line 1207
    iget-object v3, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1208
    .line 1209
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1210
    .line 1211
    aget-object v1, v1, v12

    .line 1212
    .line 1213
    const/16 v4, 0x607

    .line 1214
    .line 1215
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1219
    .line 1220
    .line 1221
    check-cast v1, Landroid/view/View;

    .line 1222
    .line 1223
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v1

    .line 1227
    if-nez v1, :cond_26

    .line 1228
    .line 1229
    goto/16 :goto_18

    .line 1230
    .line 1231
    :cond_26
    :try_start_0
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v4

    .line 1235
    invoke-static {v1, v4}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 1236
    .line 1237
    .line 1238
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    .line 1239
    if-nez v1, :cond_27

    .line 1240
    .line 1241
    goto/16 :goto_18

    .line 1242
    .line 1243
    :cond_27
    const/16 v4, 0x8cb

    .line 1244
    .line 1245
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v4

    .line 1249
    invoke-static {v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v4

    .line 1253
    invoke-static {v4}, Llin/xposed/hook/util/qq/QQServiceTool;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v4

    .line 1257
    if-nez v4, :cond_28

    .line 1258
    .line 1259
    goto/16 :goto_18

    .line 1260
    .line 1261
    :cond_28
    const/16 v5, 0x8cc

    .line 1262
    .line 1263
    :try_start_1
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v5

    .line 1267
    new-array v6, v12, [Ljava/lang/Object;

    .line 1268
    .line 1269
    invoke-static {v4, v5, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v5

    .line 1273
    invoke-static {v5}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 1274
    .line 1275
    .line 1276
    move-result v6

    .line 1277
    if-eqz v6, :cond_29

    .line 1278
    .line 1279
    check-cast v5, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1280
    .line 1281
    goto :goto_10

    .line 1282
    :catch_0
    :cond_29
    move-object v5, v7

    .line 1283
    goto :goto_10

    .line 1284
    :catch_1
    const/16 v5, 0x8cd

    .line 1285
    .line 1286
    :try_start_2
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v5

    .line 1290
    invoke-static {v4, v5}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v5

    .line 1294
    invoke-static {v5}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v6

    .line 1298
    if-eqz v6, :cond_29

    .line 1299
    .line 1300
    check-cast v5, Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 1301
    .line 1302
    :goto_10
    if-nez v5, :cond_2a

    .line 1303
    .line 1304
    goto/16 :goto_18

    .line 1305
    .line 1306
    :cond_2a
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v6

    .line 1310
    :catch_2
    :cond_2b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1311
    .line 1312
    .line 1313
    move-result v9

    .line 1314
    if-eqz v9, :cond_2c

    .line 1315
    .line 1316
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v9

    .line 1320
    :try_start_3
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v10

    .line 1324
    invoke-static {v9, v10}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 1325
    .line 1326
    .line 1327
    move-result v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 1328
    if-ne v10, v1, :cond_2b

    .line 1329
    .line 1330
    goto :goto_11

    .line 1331
    :cond_2c
    move-object v9, v7

    .line 1332
    :goto_11
    if-nez v9, :cond_2d

    .line 1333
    .line 1334
    goto/16 :goto_18

    .line 1335
    .line 1336
    :cond_2d
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v5

    .line 1340
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1341
    .line 1342
    .line 1343
    move-result v6

    .line 1344
    if-nez v6, :cond_2e

    .line 1345
    .line 1346
    move-object v6, v7

    .line 1347
    goto :goto_15

    .line 1348
    :cond_2e
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v6

    .line 1352
    :try_start_4
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v10

    .line 1356
    invoke-static {v6, v10}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 1357
    .line 1358
    .line 1359
    move-result v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 1360
    goto :goto_12

    .line 1361
    :catch_3
    move v6, v12

    .line 1362
    :goto_12
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v6

    .line 1366
    :cond_2f
    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1367
    .line 1368
    .line 1369
    move-result v10

    .line 1370
    if-eqz v10, :cond_30

    .line 1371
    .line 1372
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v10

    .line 1376
    :try_start_5
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v11

    .line 1380
    invoke-static {v10, v11}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 1381
    .line 1382
    .line 1383
    move-result v10
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 1384
    goto :goto_14

    .line 1385
    :catch_4
    move v10, v12

    .line 1386
    :goto_14
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v10

    .line 1390
    invoke-virtual {v6, v10}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 1391
    .line 1392
    .line 1393
    move-result v11

    .line 1394
    if-gez v11, :cond_2f

    .line 1395
    .line 1396
    move-object v6, v10

    .line 1397
    goto :goto_13

    .line 1398
    :cond_30
    :goto_15
    if-eqz v6, :cond_31

    .line 1399
    .line 1400
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1401
    .line 1402
    .line 1403
    move-result v5

    .line 1404
    goto :goto_16

    .line 1405
    :cond_31
    move v5, v8

    .line 1406
    :goto_16
    if-ne v1, v5, :cond_32

    .line 1407
    .line 1408
    goto/16 :goto_18

    .line 1409
    .line 1410
    :cond_32
    :try_start_6
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1411
    .line 1412
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v1

    .line 1416
    invoke-static {v9, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    instance-of v6, v1, Ljava/lang/String;

    .line 1421
    .line 1422
    if-eqz v6, :cond_33

    .line 1423
    .line 1424
    check-cast v1, Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 1425
    .line 1426
    goto :goto_17

    .line 1427
    :catch_5
    :cond_33
    move-object v1, v7

    .line 1428
    :goto_17
    if-eqz v1, :cond_34

    .line 1429
    .line 1430
    invoke-static {}, Llin/xposed/hook/util/qq/QQServiceTool;->getRuntime()Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v6

    .line 1434
    const/16 v10, 0x25a

    .line 1435
    .line 1436
    :try_start_7
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v10

    .line 1440
    const/16 v11, 0x8c7

    .line 1441
    .line 1442
    invoke-static {v11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v11

    .line 1446
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v11

    .line 1450
    invoke-static {v6, v10, v11}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v7
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 1454
    :catch_6
    if-eqz v7, :cond_34

    .line 1455
    .line 1456
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;

    .line 1457
    .line 1458
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v0

    .line 1465
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v1

    .line 1469
    invoke-static {v1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v1

    .line 1473
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v1

    .line 1477
    invoke-static {v7, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1478
    .line 1479
    .line 1480
    :cond_34
    const/16 v0, 0x8ce

    .line 1481
    .line 1482
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v1

    .line 1490
    invoke-static {v4, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    const/16 v0, 0x8cf

    .line 1494
    .line 1495
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v0

    .line 1499
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v1

    .line 1503
    invoke-static {v9, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v1

    .line 1511
    add-int/2addr v5, v8

    .line 1512
    invoke-static {v0, v1, v5}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 1513
    .line 1514
    .line 1515
    const/16 v1, 0x8d0

    .line 1516
    .line 1517
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    invoke-static {v4, v1, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    const/16 v0, 0x8d1

    .line 1529
    .line 1530
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    new-array v1, v12, [Ljava/lang/Object;

    .line 1535
    .line 1536
    invoke-static {v4, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    const/16 v0, 0x8d2

    .line 1540
    .line 1541
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v0

    .line 1545
    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    const/16 v1, 0x8d3

    .line 1550
    .line 1551
    invoke-static {v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰(I)Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v1

    .line 1555
    if-eqz v1, :cond_35

    .line 1556
    .line 1557
    const/16 v2, 0x8d4

    .line 1558
    .line 1559
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v2

    .line 1563
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    invoke-static {v1, v2, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    const/16 v1, 0x8d5

    .line 1572
    .line 1573
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v1

    .line 1577
    new-array v2, v12, [Ljava/lang/Object;

    .line 1578
    .line 1579
    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1580
    .line 1581
    .line 1582
    :catch_7
    :cond_35
    :goto_18
    return-void

    .line 1583
    :pswitch_f
    move-object v2, v0

    .line 1584
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;

    .line 1585
    .line 1586
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1587
    .line 1588
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1589
    .line 1590
    .line 1591
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v1

    .line 1595
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v1

    .line 1599
    invoke-static/range {v17 .. v17}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1603
    .line 1604
    .line 1605
    array-length v3, v1

    .line 1606
    move v4, v12

    .line 1607
    :goto_19
    if-ge v4, v3, :cond_3a

    .line 1608
    .line 1609
    aget-object v5, v1, v4

    .line 1610
    .line 1611
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v6

    .line 1615
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v6

    .line 1619
    const/16 v9, 0x8a6

    .line 1620
    .line 1621
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v9

    .line 1625
    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1626
    .line 1627
    .line 1628
    move-result v9

    .line 1629
    if-nez v9, :cond_36

    .line 1630
    .line 1631
    const-string v9, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 1632
    .line 1633
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v9

    .line 1637
    invoke-static {v6, v9, v12}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1638
    .line 1639
    .line 1640
    move-result v6

    .line 1641
    if-eqz v6, :cond_39

    .line 1642
    .line 1643
    goto :goto_1a

    .line 1644
    :catch_8
    move-exception v0

    .line 1645
    goto :goto_1d

    .line 1646
    :cond_36
    :goto_1a
    invoke-virtual {v5, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v5

    .line 1653
    if-nez v5, :cond_37

    .line 1654
    .line 1655
    goto :goto_1c

    .line 1656
    :cond_37
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v6

    .line 1660
    invoke-virtual {v6}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v6

    .line 1664
    const/16 v9, 0x8a7

    .line 1665
    .line 1666
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1667
    .line 1668
    .line 1669
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1670
    .line 1671
    .line 1672
    array-length v9, v6

    .line 1673
    move v11, v12

    .line 1674
    :goto_1b
    if-ge v11, v9, :cond_39

    .line 1675
    .line 1676
    aget-object v13, v6, v11

    .line 1677
    .line 1678
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v14

    .line 1682
    const/16 v15, 0x8a8

    .line 1683
    .line 1684
    invoke-static {v15}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v15

    .line 1688
    invoke-static {v14, v15}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1689
    .line 1690
    .line 1691
    move-result v14

    .line 1692
    if-eqz v14, :cond_38

    .line 1693
    .line 1694
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 1695
    .line 1696
    .line 1697
    move-result v14

    .line 1698
    if-nez v14, :cond_38

    .line 1699
    .line 1700
    invoke-virtual {v13, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v13, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v13

    .line 1707
    instance-of v14, v13, Landroid/widget/ImageView;

    .line 1708
    .line 1709
    if-eqz v14, :cond_38

    .line 1710
    .line 1711
    check-cast v13, Landroid/widget/ImageView;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 1712
    .line 1713
    move-object v7, v13

    .line 1714
    goto :goto_1e

    .line 1715
    :cond_38
    add-int/lit8 v11, v11, 0x1

    .line 1716
    .line 1717
    goto :goto_1b

    .line 1718
    :cond_39
    :goto_1c
    add-int/lit8 v4, v4, 0x1

    .line 1719
    .line 1720
    goto :goto_19

    .line 1721
    :goto_1d
    invoke-virtual {v2}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v1

    .line 1725
    invoke-virtual {v1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 1726
    .line 1727
    .line 1728
    :cond_3a
    :goto_1e
    if-nez v7, :cond_3b

    .line 1729
    .line 1730
    goto :goto_1f

    .line 1731
    :cond_3b
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v0

    .line 1735
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v0

    .line 1739
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v0

    .line 1743
    const/16 v1, 0x71c

    .line 1744
    .line 1745
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1746
    .line 1747
    .line 1748
    const/16 v1, 0x8ab

    .line 1749
    .line 1750
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v1

    .line 1754
    invoke-static {v0, v1, v12}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1755
    .line 1756
    .line 1757
    move-result v0

    .line 1758
    if-eqz v0, :cond_3c

    .line 1759
    .line 1760
    goto :goto_1f

    .line 1761
    :cond_3c
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 1762
    .line 1763
    .line 1764
    move-result v0

    .line 1765
    if-nez v0, :cond_3d

    .line 1766
    .line 1767
    invoke-virtual {v7, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1768
    .line 1769
    .line 1770
    :cond_3d
    :goto_1f
    return-void

    .line 1771
    :pswitch_10
    move-object v2, v0

    .line 1772
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;

    .line 1773
    .line 1774
    sget-object v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1775
    .line 1776
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1777
    .line 1778
    aget-object v1, v0, v12

    .line 1779
    .line 1780
    if-nez v1, :cond_3e

    .line 1781
    .line 1782
    goto/16 :goto_31

    .line 1783
    .line 1784
    :cond_3e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v0

    .line 1788
    move-object v3, v0

    .line 1789
    :goto_20
    if-eqz v3, :cond_42

    .line 1790
    .line 1791
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v4

    .line 1795
    invoke-static/range {v17 .. v17}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1796
    .line 1797
    .line 1798
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1799
    .line 1800
    .line 1801
    array-length v5, v4

    .line 1802
    move v6, v12

    .line 1803
    :goto_21
    if-ge v6, v5, :cond_41

    .line 1804
    .line 1805
    aget-object v0, v4, v6

    .line 1806
    .line 1807
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v10

    .line 1811
    invoke-virtual {v13, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1812
    .line 1813
    .line 1814
    move-result v10

    .line 1815
    if-eqz v10, :cond_40

    .line 1816
    .line 1817
    :try_start_9
    invoke-virtual {v0, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1818
    .line 1819
    .line 1820
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v0

    .line 1824
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 1825
    .line 1826
    .line 1827
    move-result v10

    .line 1828
    if-eqz v10, :cond_3f

    .line 1829
    .line 1830
    check-cast v0, Ljava/util/List;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 1831
    .line 1832
    goto :goto_22

    .line 1833
    :catchall_0
    move-exception v0

    .line 1834
    goto :goto_23

    .line 1835
    :cond_3f
    move-object v0, v7

    .line 1836
    :goto_22
    move-object v1, v0

    .line 1837
    goto :goto_24

    .line 1838
    :goto_23
    new-instance v10, Lkotlin/Result$Failure;

    .line 1839
    .line 1840
    invoke-direct {v10, v0}, Lkotlin/Result$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 1841
    .line 1842
    .line 1843
    invoke-static {v10}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1844
    .line 1845
    .line 1846
    :cond_40
    add-int/lit8 v6, v6, 0x1

    .line 1847
    .line 1848
    goto :goto_21

    .line 1849
    :cond_41
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v3

    .line 1853
    goto :goto_20

    .line 1854
    :cond_42
    move-object v1, v7

    .line 1855
    :goto_24
    if-nez v1, :cond_43

    .line 1856
    .line 1857
    goto/16 :goto_31

    .line 1858
    .line 1859
    :cond_43
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲苏世兰楪(Ljava/util/List;)Ljava/lang/Object;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v3

    .line 1863
    if-nez v3, :cond_44

    .line 1864
    .line 1865
    goto/16 :goto_31

    .line 1866
    .line 1867
    :cond_44
    invoke-static/range {v20 .. v20}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v4

    .line 1871
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v0

    .line 1875
    move-object v5, v0

    .line 1876
    :goto_25
    if-eqz v5, :cond_47

    .line 1877
    .line 1878
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v6

    .line 1882
    invoke-static/range {v17 .. v17}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1883
    .line 1884
    .line 1885
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1886
    .line 1887
    .line 1888
    array-length v10, v6

    .line 1889
    move v13, v12

    .line 1890
    :goto_26
    if-ge v13, v10, :cond_46

    .line 1891
    .line 1892
    aget-object v0, v6, v13

    .line 1893
    .line 1894
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v15

    .line 1898
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v15

    .line 1902
    invoke-virtual {v15, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1903
    .line 1904
    .line 1905
    move-result v15

    .line 1906
    if-eqz v15, :cond_45

    .line 1907
    .line 1908
    :try_start_a
    invoke-virtual {v0, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1909
    .line 1910
    .line 1911
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 1915
    move-object v3, v0

    .line 1916
    goto :goto_27

    .line 1917
    :catchall_1
    move-exception v0

    .line 1918
    new-instance v15, Lkotlin/Result$Failure;

    .line 1919
    .line 1920
    invoke-direct {v15, v0}, Lkotlin/Result$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 1921
    .line 1922
    .line 1923
    invoke-static {v15}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    :cond_45
    add-int/lit8 v13, v13, 0x1

    .line 1927
    .line 1928
    goto :goto_26

    .line 1929
    :cond_46
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v5

    .line 1933
    goto :goto_25

    .line 1934
    :cond_47
    move-object v3, v7

    .line 1935
    :goto_27
    if-nez v3, :cond_48

    .line 1936
    .line 1937
    goto/16 :goto_31

    .line 1938
    .line 1939
    :cond_48
    :try_start_b
    invoke-static/range {v16 .. v16}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v0

    .line 1943
    new-array v4, v12, [Ljava/lang/Object;

    .line 1944
    .line 1945
    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v0

    .line 1949
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1953
    goto :goto_28

    .line 1954
    :catchall_2
    move-exception v0

    .line 1955
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v0

    .line 1959
    :goto_28
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 1960
    .line 1961
    .line 1962
    move-result v4

    .line 1963
    if-eqz v4, :cond_49

    .line 1964
    .line 1965
    move-object v0, v7

    .line 1966
    :cond_49
    if-nez v0, :cond_4a

    .line 1967
    .line 1968
    goto/16 :goto_31

    .line 1969
    .line 1970
    :cond_4a
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v4

    .line 1974
    invoke-static {v0, v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v4

    .line 1978
    if-eqz v4, :cond_5b

    .line 1979
    .line 1980
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 1981
    .line 1982
    .line 1983
    move-result-wide v4

    .line 1984
    invoke-static/range {v19 .. v19}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v6

    .line 1988
    invoke-static {v0, v6}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v0

    .line 1992
    if-nez v0, :cond_4c

    .line 1993
    .line 1994
    :cond_4b
    move-object v0, v7

    .line 1995
    goto :goto_29

    .line 1996
    :cond_4c
    instance-of v6, v0, Ljava/util/List;

    .line 1997
    .line 1998
    if-eqz v6, :cond_4b

    .line 1999
    .line 2000
    check-cast v0, Ljava/util/List;

    .line 2001
    .line 2002
    :goto_29
    const-string v6, ""

    .line 2003
    .line 2004
    if-nez v0, :cond_4d

    .line 2005
    .line 2006
    goto/16 :goto_30

    .line 2007
    .line 2008
    :cond_4d
    new-instance v9, Ljava/lang/StringBuilder;

    .line 2009
    .line 2010
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 2011
    .line 2012
    .line 2013
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v10

    .line 2017
    :goto_2a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2018
    .line 2019
    .line 2020
    move-result v0

    .line 2021
    if-eqz v0, :cond_57

    .line 2022
    .line 2023
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v0

    .line 2027
    const/16 v13, 0x152

    .line 2028
    .line 2029
    invoke-static {v13}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v13

    .line 2033
    invoke-static {v0, v13}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v13

    .line 2037
    if-nez v13, :cond_4f

    .line 2038
    .line 2039
    :cond_4e
    move-object v13, v7

    .line 2040
    goto :goto_2b

    .line 2041
    :cond_4f
    instance-of v15, v13, Ljava/lang/Integer;

    .line 2042
    .line 2043
    if-eqz v15, :cond_50

    .line 2044
    .line 2045
    check-cast v13, Ljava/lang/Integer;

    .line 2046
    .line 2047
    goto :goto_2b

    .line 2048
    :cond_50
    instance-of v15, v13, Ljava/lang/Number;

    .line 2049
    .line 2050
    if-eqz v15, :cond_4e

    .line 2051
    .line 2052
    check-cast v13, Ljava/lang/Number;

    .line 2053
    .line 2054
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 2055
    .line 2056
    .line 2057
    move-result v13

    .line 2058
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v13

    .line 2062
    :goto_2b
    if-eqz v13, :cond_58

    .line 2063
    .line 2064
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 2065
    .line 2066
    .line 2067
    move-result v13

    .line 2068
    if-eq v13, v8, :cond_51

    .line 2069
    .line 2070
    goto :goto_30

    .line 2071
    :cond_51
    :try_start_c
    invoke-static {v14}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v13

    .line 2075
    new-array v15, v12, [Ljava/lang/Object;

    .line 2076
    .line 2077
    invoke-static {v0, v13, v15}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v0

    .line 2081
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 2085
    goto :goto_2c

    .line 2086
    :catchall_3
    move-exception v0

    .line 2087
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v0

    .line 2091
    :goto_2c
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 2092
    .line 2093
    .line 2094
    move-result v13

    .line 2095
    if-eqz v13, :cond_52

    .line 2096
    .line 2097
    move-object v0, v7

    .line 2098
    :cond_52
    if-nez v0, :cond_53

    .line 2099
    .line 2100
    goto :goto_30

    .line 2101
    :cond_53
    const/16 v13, 0x153

    .line 2102
    .line 2103
    :try_start_d
    invoke-static {v13}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2104
    .line 2105
    .line 2106
    move-result-object v13

    .line 2107
    new-array v15, v12, [Ljava/lang/Object;

    .line 2108
    .line 2109
    invoke-static {v0, v13, v15}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v0

    .line 2113
    instance-of v13, v0, Ljava/lang/String;

    .line 2114
    .line 2115
    if-eqz v13, :cond_54

    .line 2116
    .line 2117
    check-cast v0, Ljava/lang/String;

    .line 2118
    .line 2119
    goto :goto_2d

    .line 2120
    :catchall_4
    move-exception v0

    .line 2121
    goto :goto_2e

    .line 2122
    :cond_54
    move-object v0, v7

    .line 2123
    :goto_2d
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 2127
    goto :goto_2f

    .line 2128
    :goto_2e
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v0

    .line 2132
    :goto_2f
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 2133
    .line 2134
    .line 2135
    move-result v13

    .line 2136
    if-eqz v13, :cond_55

    .line 2137
    .line 2138
    move-object v0, v7

    .line 2139
    :cond_55
    check-cast v0, Ljava/lang/String;

    .line 2140
    .line 2141
    if-nez v0, :cond_56

    .line 2142
    .line 2143
    goto :goto_30

    .line 2144
    :cond_56
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2145
    .line 2146
    .line 2147
    goto/16 :goto_2a

    .line 2148
    .line 2149
    :cond_57
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v6

    .line 2153
    const/16 v0, 0x510

    .line 2154
    .line 2155
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2156
    .line 2157
    .line 2158
    :cond_58
    :goto_30
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 2159
    .line 2160
    .line 2161
    move-result v0

    .line 2162
    if-lez v0, :cond_59

    .line 2163
    .line 2164
    move-object v7, v6

    .line 2165
    :cond_59
    if-nez v7, :cond_5a

    .line 2166
    .line 2167
    goto :goto_31

    .line 2168
    :cond_5a
    const/16 v0, 0x88e

    .line 2169
    .line 2170
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v0

    .line 2174
    new-instance v6, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;

    .line 2175
    .line 2176
    invoke-direct {v6, v2, v7, v4, v5}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;Ljava/lang/String;J)V

    .line 2177
    .line 2178
    .line 2179
    invoke-static {v3, v0, v11, v6}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;ILjava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v0

    .line 2183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2184
    .line 2185
    .line 2186
    invoke-interface {v1, v12, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 2187
    .line 2188
    .line 2189
    :cond_5b
    :goto_31
    return-void

    .line 2190
    :pswitch_11
    move-object v2, v0

    .line 2191
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;

    .line 2192
    .line 2193
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 2194
    .line 2195
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 2196
    .line 2197
    .line 2198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2199
    .line 2200
    .line 2201
    const/16 v3, 0x618

    .line 2202
    .line 2203
    const/16 v4, 0x617

    .line 2204
    .line 2205
    :try_start_e
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2206
    .line 2207
    aget-object v0, v0, v12

    .line 2208
    .line 2209
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2210
    .line 2211
    .line 2212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2213
    .line 2214
    .line 2215
    check-cast v0, Ljava/lang/String;

    .line 2216
    .line 2217
    iget-object v6, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2218
    .line 2219
    aget-object v6, v6, v8

    .line 2220
    .line 2221
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2222
    .line 2223
    .line 2224
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2225
    .line 2226
    .line 2227
    check-cast v6, [B

    .line 2228
    .line 2229
    const/16 v7, 0x619

    .line 2230
    .line 2231
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v7

    .line 2235
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2236
    .line 2237
    .line 2238
    move-result v7

    .line 2239
    if-eqz v7, :cond_5c

    .line 2240
    .line 2241
    invoke-static {v6, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰([BLde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 2242
    .line 2243
    .line 2244
    goto/16 :goto_33

    .line 2245
    .line 2246
    :catch_9
    move-exception v0

    .line 2247
    goto :goto_32

    .line 2248
    :cond_5c
    const/16 v7, 0x137

    .line 2249
    .line 2250
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2251
    .line 2252
    .line 2253
    move-result-object v7

    .line 2254
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2255
    .line 2256
    .line 2257
    move-result v0

    .line 2258
    if-eqz v0, :cond_5d

    .line 2259
    .line 2260
    invoke-static {v6, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏兰哲([BLde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_9

    .line 2261
    .line 2262
    .line 2263
    goto/16 :goto_33

    .line 2264
    .line 2265
    :goto_32
    invoke-virtual {v2}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 2266
    .line 2267
    .line 2268
    move-result-object v6

    .line 2269
    const/16 v7, 0x88a

    .line 2270
    .line 2271
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2272
    .line 2273
    .line 2274
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2275
    .line 2276
    .line 2277
    invoke-virtual {v2}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v2

    .line 2281
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2282
    .line 2283
    .line 2284
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2285
    .line 2286
    .line 2287
    const-string v7, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 2288
    .line 2289
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v7

    .line 2293
    invoke-static {v12, v5, v2, v7}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏兰楪哲世(IILjava/lang/String;Ljava/lang/String;)I

    .line 2294
    .line 2295
    .line 2296
    move-result v2

    .line 2297
    add-int/2addr v2, v8

    .line 2298
    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v2

    .line 2302
    const/16 v5, 0x76d

    .line 2303
    .line 2304
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2305
    .line 2306
    .line 2307
    const/16 v5, 0x305

    .line 2308
    .line 2309
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v5

    .line 2313
    invoke-static {v5, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2314
    .line 2315
    .line 2316
    sget-object v5, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2317
    .line 2318
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v5

    .line 2322
    invoke-static {v2, v5, v0, v8}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 2323
    .line 2324
    .line 2325
    iget-object v5, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2326
    .line 2327
    aget-object v5, v5, v12

    .line 2328
    .line 2329
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2330
    .line 2331
    .line 2332
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2333
    .line 2334
    .line 2335
    check-cast v5, Ljava/lang/String;

    .line 2336
    .line 2337
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2338
    .line 2339
    aget-object v1, v1, v8

    .line 2340
    .line 2341
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 2342
    .line 2343
    .line 2344
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2345
    .line 2346
    .line 2347
    check-cast v1, [B

    .line 2348
    .line 2349
    new-instance v3, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;

    .line 2350
    .line 2351
    invoke-direct {v3}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2352
    .line 2353
    .line 2354
    invoke-static {v1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏([B)[B

    .line 2355
    .line 2356
    .line 2357
    move-result-object v1

    .line 2358
    invoke-virtual {v3, v1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([B)V

    .line 2359
    .line 2360
    .line 2361
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2362
    .line 2363
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2364
    .line 2365
    .line 2366
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2367
    .line 2368
    .line 2369
    const-string v4, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c"

    .line 2370
    .line 2371
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 2372
    .line 2373
    .line 2374
    move-result-object v4

    .line 2375
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2376
    .line 2377
    .line 2378
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2379
    .line 2380
    .line 2381
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5"

    .line 2382
    .line 2383
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v3

    .line 2387
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2388
    .line 2389
    .line 2390
    invoke-static {v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Exception;)Ljava/lang/String;

    .line 2391
    .line 2392
    .line 2393
    move-result-object v0

    .line 2394
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2395
    .line 2396
    .line 2397
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v0

    .line 2401
    invoke-static {v0, v2}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2402
    .line 2403
    .line 2404
    :cond_5d
    :goto_33
    return-void

    .line 2405
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public 飘花落叶言子苏哲楪兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;
    .locals 5

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    iget-object p1, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v0, p2, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲苏兰世楪;

    .line 8
    .line 9
    const/16 v1, 0x207

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/16 v3, 0x40

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v2, v4}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v1}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲兰世(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v3}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲兰世(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v1, v0}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    iget-object v1, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    :cond_0
    iput-object v2, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 54
    .line 55
    iput-object v0, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    add-int/lit8 p0, p0, -0x1

    .line 62
    .line 63
    :goto_0
    if-ltz p0, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 70
    .line 71
    iput-object v2, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 72
    .line 73
    iput-object v0, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 74
    .line 75
    invoke-virtual {v1}, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()V

    .line 76
    .line 77
    .line 78
    add-int/lit8 p0, p0, -0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    return-object p2
.end method
