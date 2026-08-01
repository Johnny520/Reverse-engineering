.class public final synthetic Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/core/os/飘花落叶言子楪世兰哲苏;
.implements L飘花落叶言楪世兰苏哲子/飘花落叶言子楪苏世哲兰;
.implements L飘花落叶言楪哲子世苏兰/飘花落叶言子楪苏哲世兰;
.implements Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;
.implements Lcom/google/gson/internal/飘花落叶言子楪苏兰哲世;
.implements Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;
.implements L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;
.implements Landroidx/core/view/飘花落叶言子世楪苏兰哲;
.implements L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世兰哲;
.implements Lretrofit2/飘花落叶言子楪哲世兰苏;
.implements L飘花落叶言苏哲世楪兰子/飘花落叶言子楪苏哲兰世;


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

.method public 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    check-cast p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;

    .line 6
    .line 7
    invoke-virtual {p1}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v0, v0, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 13
    .line 14
    invoke-static {p1, p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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
    sget-object v0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    const-string v0, "Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 19
    .line 20
    invoke-static {v0, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

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
    invoke-static {p0}, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

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
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

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
    invoke-static {p0}, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

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
    invoke-static {p0, v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏哲兰楪(Lcom/google/android/material/internal/CheckableImageButton;Ljava/lang/CharSequence;)V

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
    const/16 v1, 0x49d

    .line 4
    .line 5
    const/16 v2, 0x49c

    .line 6
    .line 7
    const/16 v3, 0x49b

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    iget-object v0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v0, p1, v3}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

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
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

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
    invoke-static {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ljava/lang/Thread;

    .line 59
    .line 60
    new-instance v1, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰哲苏;

    .line 61
    .line 62
    const/4 v2, 0x6

    .line 63
    invoke-direct {v1, p0, p1, v2}, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;Ljava/util/List;I)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_0
    check-cast p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;

    .line 74
    .line 75
    iget-object v0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 76
    .line 77
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v0, p1, v3}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ExecutorService;

    .line 118
    .line 119
    new-instance v1, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰哲苏;

    .line 120
    .line 121
    const/4 v2, 0x5

    .line 122
    invoke-direct {v1, p0, p1, v2}, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;Ljava/util/List;I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_data_0
    .packed-switch 0x1c
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
    check-cast p2, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;

    .line 6
    .line 7
    invoke-static {p0, p2, p1, p3}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/view/PluginItemView;L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z

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
    const/4 v5, 0x7

    .line 10
    const/4 v6, 0x4

    .line 11
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    const-string v10, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 14
    .line 15
    const-class v11, Ljava/lang/String;

    .line 16
    .line 17
    const/high16 v13, 0x240f0000

    .line 18
    .line 19
    const/16 v14, 0x97

    .line 20
    .line 21
    const-class v15, Ljava/util/List;

    .line 22
    .line 23
    const/16 v16, 0x9b

    .line 24
    .line 25
    const/16 v17, 0x82f

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const/16 v18, 0x83

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    const/16 v19, 0x8f

    .line 32
    .line 33
    const/4 v9, 0x1

    .line 34
    const/16 v20, 0xef

    .line 35
    .line 36
    const/4 v12, 0x0

    .line 37
    iget-object v0, v0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 38
    .line 39
    packed-switch v2, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    :pswitch_0
    check-cast v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 43
    .line 44
    sget-object v2, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 45
    .line 46
    new-instance v2, Landroid/os/Handler;

    .line 47
    .line 48
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 53
    .line 54
    .line 55
    new-instance v3, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏兰哲;

    .line 56
    .line 57
    invoke-direct {v3, v0, v1}, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_1
    check-cast v0, Ljava/lang/ClassLoader;

    .line 65
    .line 66
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    const/16 v2, 0x462

    .line 76
    .line 77
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_0
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-ge v12, v2, :cond_1

    .line 90
    .line 91
    invoke-virtual {v1, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    if-ne v3, v0, :cond_0

    .line 100
    .line 101
    check-cast v2, Landroid/widget/ImageView;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_0
    add-int/lit8 v12, v12, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    :goto_1
    return-void

    .line 108
    :pswitch_2
    check-cast v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;

    .line 109
    .line 110
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 111
    .line 112
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 113
    .line 114
    aget-object v2, v2, v9

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    iget-object v5, v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 129
    .line 130
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 131
    .line 132
    new-array v4, v12, [Ljava/lang/Object;

    .line 133
    .line 134
    invoke-virtual {v3, v2, v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 143
    .line 144
    invoke-static {v4, v3, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, Ljava/lang/Long;

    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object v0, v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 154
    .line 155
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_2
    invoke-static/range {v19 .. v19}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const-class v3, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-static {v3, v0, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    check-cast v0, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_4

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-static/range {v18 .. v18}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    iget-object v5, v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 201
    .line 202
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 203
    .line 204
    const/16 v4, 0xa9

    .line 205
    .line 206
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-static {v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    iget-object v5, v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 215
    .line 216
    iput-object v4, v5, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 217
    .line 218
    new-array v4, v12, [Ljava/lang/Object;

    .line 219
    .line 220
    invoke-virtual {v3, v2, v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    if-eqz v2, :cond_3

    .line 225
    .line 226
    const/16 v3, 0x455

    .line 227
    .line 228
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-static {v7, v3, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    check-cast v3, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    const/16 v4, 0x456

    .line 243
    .line 244
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-static {v7, v4, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Ljava/lang/Integer;

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    const/16 v4, 0x1770

    .line 259
    .line 260
    if-le v2, v4, :cond_3

    .line 261
    .line 262
    if-le v3, v4, :cond_3

    .line 263
    .line 264
    invoke-virtual {v1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :cond_4
    :goto_2
    return-void

    .line 268
    :pswitch_3
    check-cast v0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世哲苏兰;

    .line 269
    .line 270
    sget-object v2, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 271
    .line 272
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 273
    .line 274
    instance-of v3, v2, Ljava/io/File;

    .line 275
    .line 276
    if-eqz v3, :cond_5

    .line 277
    .line 278
    check-cast v2, Ljava/io/File;

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_5
    move-object v2, v8

    .line 282
    :goto_3
    if-nez v2, :cond_6

    .line 283
    .line 284
    goto/16 :goto_7

    .line 285
    .line 286
    :cond_6
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getThrowable()Ljava/lang/Throwable;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    if-eqz v3, :cond_7

    .line 295
    .line 296
    goto/16 :goto_7

    .line 297
    .line 298
    :cond_7
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    instance-of v4, v3, [Ljava/lang/String;

    .line 303
    .line 304
    if-eqz v4, :cond_8

    .line 305
    .line 306
    check-cast v3, [Ljava/lang/String;

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_8
    move-object v3, v8

    .line 310
    :goto_4
    if-nez v3, :cond_9

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_9
    iget-object v0, v0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/HashSet;

    .line 314
    .line 315
    if-eqz v0, :cond_f

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    const/16 v4, 0x4c9

    .line 322
    .line 323
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    if-eqz v4, :cond_e

    .line 334
    .line 335
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    const/16 v5, 0x4ca

    .line 340
    .line 341
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    check-cast v4, Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-static {v2, v4, v12}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-eqz v4, :cond_a

    .line 357
    .line 358
    array-length v0, v3

    .line 359
    if-nez v0, :cond_b

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    .line 363
    .line 364
    array-length v2, v3

    .line 365
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 366
    .line 367
    .line 368
    array-length v2, v3

    .line 369
    move v4, v12

    .line 370
    :goto_5
    if-ge v4, v2, :cond_d

    .line 371
    .line 372
    aget-object v5, v3, v4

    .line 373
    .line 374
    if-eqz v5, :cond_c

    .line 375
    .line 376
    sget-object v6, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 377
    .line 378
    invoke-virtual {v6, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    if-nez v6, :cond_c

    .line 383
    .line 384
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_d
    new-array v2, v12, [Ljava/lang/String;

    .line 391
    .line 392
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    move-object v3, v0

    .line 397
    check-cast v3, [Ljava/lang/String;

    .line 398
    .line 399
    :goto_6
    invoke-virtual {v1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    :cond_e
    :goto_7
    return-void

    .line 403
    :cond_f
    const/16 v0, 0x960

    .line 404
    .line 405
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v8

    .line 413
    :pswitch_4
    check-cast v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 414
    .line 415
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 416
    .line 417
    aget-object v1, v1, v12

    .line 418
    .line 419
    invoke-static {v15, v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    check-cast v1, Ljava/util/List;

    .line 424
    .line 425
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-static {v3, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    new-array v4, v12, [Ljava/lang/Object;

    .line 446
    .line 447
    invoke-static {v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v3

    .line 451
    invoke-static {v3}, Llin/xposed/hook/util/qq/QQMessageUtils;->getMsgRecordPicUrlList(Ljava/lang/Object;)Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    if-eqz v4, :cond_10

    .line 460
    .line 461
    goto :goto_8

    .line 462
    :cond_10
    const/16 v4, 0x11a

    .line 463
    .line 464
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    new-instance v5, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲楪苏;

    .line 469
    .line 470
    invoke-direct {v5, v0, v3, v9}, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲楪苏;-><init>(Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;Ljava/util/List;I)V

    .line 471
    .line 472
    .line 473
    invoke-static {v2, v4, v13, v5}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;ILjava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-interface {v1, v12, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :goto_8
    return-void

    .line 481
    :pswitch_5
    check-cast v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世哲苏兰楪;

    .line 482
    .line 483
    iget-object v0, v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 484
    .line 485
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 486
    .line 487
    invoke-virtual {v0, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    return-void

    .line 494
    :pswitch_6
    check-cast v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世哲楪兰苏;

    .line 495
    .line 496
    iget-object v0, v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 497
    .line 498
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 499
    .line 500
    aget-object v1, v1, v3

    .line 501
    .line 502
    check-cast v1, Ljava/util/ArrayList;

    .line 503
    .line 504
    const/4 v2, -0x1

    .line 505
    move v5, v2

    .line 506
    move v6, v5

    .line 507
    move v4, v12

    .line 508
    :goto_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 509
    .line 510
    .line 511
    move-result v7

    .line 512
    if-ge v4, v7, :cond_13

    .line 513
    .line 514
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    move-result-object v8

    .line 522
    invoke-static {v8}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 523
    .line 524
    .line 525
    move-result-object v8

    .line 526
    invoke-static/range {v20 .. v20}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v9

    .line 530
    iget-object v10, v8, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 531
    .line 532
    iput-object v9, v10, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 533
    .line 534
    new-array v9, v12, [Ljava/lang/Object;

    .line 535
    .line 536
    invoke-virtual {v8, v7, v9}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v7

    .line 540
    if-eqz v7, :cond_12

    .line 541
    .line 542
    if-ne v5, v2, :cond_11

    .line 543
    .line 544
    move v5, v4

    .line 545
    :cond_11
    move v6, v4

    .line 546
    :cond_12
    add-int/lit8 v4, v4, 0x1

    .line 547
    .line 548
    goto :goto_9

    .line 549
    :cond_13
    if-ne v5, v2, :cond_14

    .line 550
    .line 551
    goto :goto_a

    .line 552
    :cond_14
    const-string v2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 553
    .line 554
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-virtual {v0, v2}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    check-cast v2, Ljava/lang/String;

    .line 563
    .line 564
    const-string v4, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 565
    .line 566
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    invoke-virtual {v0, v4}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    check-cast v4, Ljava/lang/String;

    .line 575
    .line 576
    const/16 v7, 0xeb

    .line 577
    .line 578
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v7

    .line 582
    invoke-virtual {v0, v7}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    check-cast v0, Ljava/lang/String;

    .line 587
    .line 588
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 589
    .line 590
    .line 591
    move-result v7

    .line 592
    if-nez v7, :cond_15

    .line 593
    .line 594
    new-instance v7, Ljava/text/SimpleDateFormat;

    .line 595
    .line 596
    sget-object v8, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 597
    .line 598
    invoke-direct {v7, v0, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 599
    .line 600
    .line 601
    new-instance v0, Ljava/util/Date;

    .line 602
    .line 603
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v7, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    const-string v7, "\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 611
    .line 612
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v8

    .line 616
    invoke-virtual {v2, v8, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v7

    .line 624
    invoke-virtual {v4, v7, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v4

    .line 628
    :cond_15
    invoke-static {v2}, Llin/xposed/hook/util/qq/CreateElement;->createTextElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-virtual {v1, v5, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    add-int/2addr v6, v3

    .line 636
    invoke-static {v4}, Llin/xposed/hook/util/qq/CreateElement;->createTextElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-virtual {v1, v6, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    :goto_a
    return-void

    .line 644
    :pswitch_7
    check-cast v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪兰世苏哲;

    .line 645
    .line 646
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v1, Landroid/widget/LinearLayout;

    .line 649
    .line 650
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    invoke-virtual {v1, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 655
    .line 656
    .line 657
    move-result-object v4

    .line 658
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 659
    .line 660
    .line 661
    move-result-object v4

    .line 662
    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 663
    .line 664
    iget-object v0, v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏子楪兰/飘花落叶言子楪兰哲世苏;

    .line 665
    .line 666
    invoke-static {v0, v2}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲兰世(L飘花落叶言世哲苏子楪兰/飘花落叶言子楪兰哲世苏;Landroid/content/Context;)Landroid/widget/ImageView;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    sub-int/2addr v2, v3

    .line 675
    invoke-virtual {v1, v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 676
    .line 677
    .line 678
    return-void

    .line 679
    :pswitch_8
    check-cast v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪兰世苏哲;

    .line 680
    .line 681
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 682
    .line 683
    move-object v7, v1

    .line 684
    check-cast v7, Landroid/widget/LinearLayout;

    .line 685
    .line 686
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 687
    .line 688
    .line 689
    move-result-object v8

    .line 690
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    if-lt v1, v6, :cond_17

    .line 695
    .line 696
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 697
    .line 698
    .line 699
    move-result-object v9

    .line 700
    if-nez v9, :cond_16

    .line 701
    .line 702
    goto :goto_b

    .line 703
    :cond_16
    new-instance v5, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲兰苏世;

    .line 704
    .line 705
    const/4 v10, 0x0

    .line 706
    move-object v6, v0

    .line 707
    invoke-direct/range {v5 .. v10}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v7, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 711
    .line 712
    .line 713
    goto :goto_b

    .line 714
    :cond_17
    move-object v6, v0

    .line 715
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    if-lt v0, v3, :cond_18

    .line 720
    .line 721
    new-instance v0, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 722
    .line 723
    invoke-direct {v0, v6, v7, v8, v5}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v7, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 727
    .line 728
    .line 729
    :cond_18
    :goto_b
    return-void

    .line 730
    :pswitch_9
    check-cast v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 731
    .line 732
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 733
    .line 734
    aget-object v1, v1, v12

    .line 735
    .line 736
    invoke-static {v15, v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    check-cast v1, Ljava/util/List;

    .line 741
    .line 742
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v3

    .line 750
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    invoke-static {v3, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    new-array v4, v12, [Ljava/lang/Object;

    .line 763
    .line 764
    invoke-static {v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    invoke-static {v3}, Llin/xposed/hook/util/qq/QQMessageUtils;->getMsgRecordPicUrlList(Ljava/lang/Object;)Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 773
    .line 774
    .line 775
    move-result v4

    .line 776
    if-eqz v4, :cond_19

    .line 777
    .line 778
    goto :goto_c

    .line 779
    :cond_19
    const/16 v4, 0x9c

    .line 780
    .line 781
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v4

    .line 785
    new-instance v5, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏哲兰世;

    .line 786
    .line 787
    invoke-direct {v5, v0, v3, v9}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏哲兰世;-><init>(Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;Ljava/util/List;I)V

    .line 788
    .line 789
    .line 790
    invoke-static {v2, v4, v13, v5}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;ILjava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    invoke-interface {v1, v12, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    :goto_c
    return-void

    .line 798
    :pswitch_a
    check-cast v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏世兰哲;

    .line 799
    .line 800
    const/16 v2, 0x8e

    .line 801
    .line 802
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    invoke-static {v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    if-eqz v2, :cond_1b

    .line 811
    .line 812
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    array-length v3, v2

    .line 817
    :goto_d
    if-ge v12, v3, :cond_1b

    .line 818
    .line 819
    aget-object v4, v2, v12

    .line 820
    .line 821
    invoke-virtual {v4, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 822
    .line 823
    .line 824
    iget-object v5, v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 825
    .line 826
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v7

    .line 830
    invoke-interface {v5, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    move-result v5

    .line 834
    if-eqz v5, :cond_1a

    .line 835
    .line 836
    new-instance v5, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;

    .line 837
    .line 838
    invoke-direct {v5, v6}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;-><init>(I)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v0, v4, v5}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 842
    .line 843
    .line 844
    :cond_1a
    add-int/lit8 v12, v12, 0x1

    .line 845
    .line 846
    goto :goto_d

    .line 847
    :cond_1b
    invoke-virtual {v1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 848
    .line 849
    .line 850
    return-void

    .line 851
    :pswitch_b
    check-cast v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世兰哲苏;

    .line 852
    .line 853
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 854
    .line 855
    aget-object v1, v1, v3

    .line 856
    .line 857
    check-cast v1, Ljava/util/ArrayList;

    .line 858
    .line 859
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    :cond_1c
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    if-eqz v2, :cond_1d

    .line 868
    .line 869
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    invoke-static/range {v18 .. v18}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v5

    .line 885
    iget-object v6, v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 886
    .line 887
    iput-object v5, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 888
    .line 889
    new-array v5, v12, [Ljava/lang/Object;

    .line 890
    .line 891
    invoke-virtual {v3, v2, v5}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    if-eqz v2, :cond_1c

    .line 896
    .line 897
    const/16 v3, 0x84

    .line 898
    .line 899
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v3

    .line 903
    const-class v5, Ljava/lang/Integer;

    .line 904
    .line 905
    invoke-static {v5, v3, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v3

    .line 909
    check-cast v3, Ljava/lang/Integer;

    .line 910
    .line 911
    invoke-virtual {v0}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v3

    .line 915
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 916
    .line 917
    .line 918
    move-result v5

    .line 919
    if-nez v5, :cond_1c

    .line 920
    .line 921
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    move-result-object v5

    .line 925
    invoke-static {v5}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 926
    .line 927
    .line 928
    move-result-object v5

    .line 929
    const/16 v6, 0x85

    .line 930
    .line 931
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v6

    .line 935
    iget-object v7, v5, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 936
    .line 937
    iput-object v6, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 938
    .line 939
    filled-new-array {v11}, [Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    move-result-object v6

    .line 943
    iput-object v6, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 944
    .line 945
    iput-object v4, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 946
    .line 947
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v3

    .line 951
    invoke-virtual {v5, v2, v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    goto :goto_e

    .line 955
    :cond_1d
    return-void

    .line 956
    :pswitch_c
    check-cast v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世哲兰苏;

    .line 957
    .line 958
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 959
    .line 960
    aget-object v2, v2, v9

    .line 961
    .line 962
    const-string v3, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 963
    .line 964
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v3

    .line 968
    invoke-static {v11, v3, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    check-cast v2, Ljava/lang/String;

    .line 973
    .line 974
    iget-object v3, v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 975
    .line 976
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    move-result v4

    .line 980
    if-nez v4, :cond_1f

    .line 981
    .line 982
    new-instance v4, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;

    .line 983
    .line 984
    invoke-direct {v4}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;-><init>()V

    .line 985
    .line 986
    .line 987
    new-instance v6, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;

    .line 988
    .line 989
    invoke-direct {v6, v4}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪苏兰哲;)V

    .line 990
    .line 991
    .line 992
    new-instance v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 993
    .line 994
    invoke-direct {v4, v5}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v4, v2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 998
    .line 999
    .line 1000
    const-string v5, "HEAD"

    .line 1001
    .line 1002
    invoke-virtual {v4, v5, v8}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;)V

    .line 1003
    .line 1004
    .line 1005
    new-instance v5, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;

    .line 1006
    .line 1007
    invoke-direct {v5, v4}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 1008
    .line 1009
    .line 1010
    new-instance v4, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

    .line 1011
    .line 1012
    invoke-direct {v4, v6, v5}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v4}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v4

    .line 1019
    const/16 v5, 0x1f8

    .line 1020
    .line 1021
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v5

    .line 1025
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1026
    .line 1027
    .line 1028
    iget-object v6, v4, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;

    .line 1029
    .line 1030
    invoke-virtual {v6, v5}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v5

    .line 1034
    if-nez v5, :cond_1e

    .line 1035
    .line 1036
    move-object v5, v8

    .line 1037
    :cond_1e
    invoke-virtual {v4}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->close()V

    .line 1038
    .line 1039
    .line 1040
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1041
    .line 1042
    .line 1043
    move-result-wide v4

    .line 1044
    goto :goto_f

    .line 1045
    :cond_1f
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v4

    .line 1049
    check-cast v4, Ljava/lang/Long;

    .line 1050
    .line 1051
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v4

    .line 1055
    :goto_f
    const-wide/32 v6, 0x6400000

    .line 1056
    .line 1057
    .line 1058
    cmp-long v6, v4, v6

    .line 1059
    .line 1060
    if-gtz v6, :cond_20

    .line 1061
    .line 1062
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    move-result v6

    .line 1066
    if-eqz v6, :cond_22

    .line 1067
    .line 1068
    :cond_20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1069
    .line 1070
    .line 1071
    move-result-wide v6

    .line 1072
    iget-wide v9, v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:J

    .line 1073
    .line 1074
    const-wide/32 v11, 0xea60

    .line 1075
    .line 1076
    .line 1077
    add-long/2addr v9, v11

    .line 1078
    cmp-long v6, v6, v9

    .line 1079
    .line 1080
    if-lez v6, :cond_21

    .line 1081
    .line 1082
    const/16 v6, 0x1f9

    .line 1083
    .line 1084
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v6

    .line 1088
    invoke-static {v6}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1092
    .line 1093
    .line 1094
    move-result-wide v6

    .line 1095
    iput-wide v6, v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:J

    .line 1096
    .line 1097
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    :cond_21
    invoke-virtual {v1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1105
    .line 1106
    .line 1107
    :cond_22
    return-void

    .line 1108
    :pswitch_d
    check-cast v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世哲苏兰;

    .line 1109
    .line 1110
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1111
    .line 1112
    aget-object v1, v1, v3

    .line 1113
    .line 1114
    check-cast v1, Ljava/util/ArrayList;

    .line 1115
    .line 1116
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v1

    .line 1120
    :cond_23
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1121
    .line 1122
    .line 1123
    move-result v2

    .line 1124
    if-eqz v2, :cond_26

    .line 1125
    .line 1126
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v2

    .line 1130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v5

    .line 1134
    invoke-static {v5}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v5

    .line 1138
    invoke-static/range {v20 .. v20}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v6

    .line 1142
    iget-object v8, v5, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 1143
    .line 1144
    iput-object v6, v8, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 1145
    .line 1146
    new-array v6, v12, [Ljava/lang/Object;

    .line 1147
    .line 1148
    invoke-virtual {v5, v2, v6}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    if-nez v2, :cond_24

    .line 1153
    .line 1154
    goto :goto_10

    .line 1155
    :cond_24
    const-string v5, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 1156
    .line 1157
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v5

    .line 1161
    invoke-static {v7, v5, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v5

    .line 1165
    check-cast v5, Ljava/lang/Integer;

    .line 1166
    .line 1167
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1168
    .line 1169
    .line 1170
    move-result v5

    .line 1171
    if-ne v5, v3, :cond_23

    .line 1172
    .line 1173
    iget-object v5, v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1174
    .line 1175
    const-string v6, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 1176
    .line 1177
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v6

    .line 1181
    invoke-virtual {v5, v6}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v5

    .line 1185
    check-cast v5, Ljava/lang/String;

    .line 1186
    .line 1187
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v6

    .line 1191
    if-eqz v6, :cond_25

    .line 1192
    .line 1193
    goto :goto_11

    .line 1194
    :cond_25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v6

    .line 1198
    invoke-static {v6}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v6

    .line 1202
    const/16 v8, 0x14c

    .line 1203
    .line 1204
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v8

    .line 1208
    iget-object v9, v6, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 1209
    .line 1210
    iput-object v8, v9, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 1211
    .line 1212
    filled-new-array {v11}, [Ljava/lang/Class;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v8

    .line 1216
    iput-object v8, v9, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 1217
    .line 1218
    iput-object v4, v9, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 1219
    .line 1220
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v5

    .line 1224
    invoke-virtual {v6, v2, v5}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    goto :goto_10

    .line 1228
    :cond_26
    :goto_11
    return-void

    .line 1229
    :pswitch_e
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子苏楪世哲兰;

    .line 1230
    .line 1231
    const-string v2, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1232
    .line 1233
    iget-object v3, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1234
    .line 1235
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1236
    .line 1237
    aget-object v1, v1, v12

    .line 1238
    .line 1239
    const/16 v4, 0x670

    .line 1240
    .line 1241
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1245
    .line 1246
    .line 1247
    check-cast v1, Landroid/view/View;

    .line 1248
    .line 1249
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v1

    .line 1253
    if-nez v1, :cond_27

    .line 1254
    .line 1255
    goto/16 :goto_1a

    .line 1256
    .line 1257
    :cond_27
    :try_start_0
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v4

    .line 1261
    invoke-static {v1, v4}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 1262
    .line 1263
    .line 1264
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    .line 1265
    if-nez v1, :cond_28

    .line 1266
    .line 1267
    goto/16 :goto_1a

    .line 1268
    .line 1269
    :cond_28
    const/16 v4, 0x941

    .line 1270
    .line 1271
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v4

    .line 1275
    invoke-static {v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v4

    .line 1279
    invoke-static {v4}, Llin/xposed/hook/util/qq/QQServiceTool;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v4

    .line 1283
    if-nez v4, :cond_29

    .line 1284
    .line 1285
    goto/16 :goto_1a

    .line 1286
    .line 1287
    :cond_29
    const/16 v5, 0x942

    .line 1288
    .line 1289
    :try_start_1
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v5

    .line 1293
    new-array v6, v12, [Ljava/lang/Object;

    .line 1294
    .line 1295
    invoke-static {v4, v5, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v5

    .line 1299
    invoke-static {v5}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v6

    .line 1303
    if-eqz v6, :cond_2a

    .line 1304
    .line 1305
    check-cast v5, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1306
    .line 1307
    goto :goto_12

    .line 1308
    :catch_0
    :cond_2a
    move-object v5, v8

    .line 1309
    goto :goto_12

    .line 1310
    :catch_1
    const/16 v5, 0x943

    .line 1311
    .line 1312
    :try_start_2
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v5

    .line 1316
    invoke-static {v4, v5}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v5

    .line 1320
    invoke-static {v5}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 1321
    .line 1322
    .line 1323
    move-result v6

    .line 1324
    if-eqz v6, :cond_2a

    .line 1325
    .line 1326
    check-cast v5, Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 1327
    .line 1328
    :goto_12
    if-nez v5, :cond_2b

    .line 1329
    .line 1330
    goto/16 :goto_1a

    .line 1331
    .line 1332
    :cond_2b
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v6

    .line 1336
    :catch_2
    :cond_2c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1337
    .line 1338
    .line 1339
    move-result v7

    .line 1340
    if-eqz v7, :cond_2d

    .line 1341
    .line 1342
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v7

    .line 1346
    :try_start_3
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v10

    .line 1350
    invoke-static {v7, v10}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 1351
    .line 1352
    .line 1353
    move-result v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 1354
    if-ne v10, v1, :cond_2c

    .line 1355
    .line 1356
    goto :goto_13

    .line 1357
    :cond_2d
    move-object v7, v8

    .line 1358
    :goto_13
    if-nez v7, :cond_2e

    .line 1359
    .line 1360
    goto/16 :goto_1a

    .line 1361
    .line 1362
    :cond_2e
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v5

    .line 1366
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1367
    .line 1368
    .line 1369
    move-result v6

    .line 1370
    if-nez v6, :cond_2f

    .line 1371
    .line 1372
    move-object v6, v8

    .line 1373
    goto :goto_17

    .line 1374
    :cond_2f
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v6

    .line 1378
    :try_start_4
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v10

    .line 1382
    invoke-static {v6, v10}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 1383
    .line 1384
    .line 1385
    move-result v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 1386
    goto :goto_14

    .line 1387
    :catch_3
    move v6, v12

    .line 1388
    :goto_14
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v6

    .line 1392
    :cond_30
    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1393
    .line 1394
    .line 1395
    move-result v10

    .line 1396
    if-eqz v10, :cond_31

    .line 1397
    .line 1398
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v10

    .line 1402
    :try_start_5
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v11

    .line 1406
    invoke-static {v10, v11}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 1407
    .line 1408
    .line 1409
    move-result v10
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 1410
    goto :goto_16

    .line 1411
    :catch_4
    move v10, v12

    .line 1412
    :goto_16
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v10

    .line 1416
    invoke-virtual {v6, v10}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 1417
    .line 1418
    .line 1419
    move-result v11

    .line 1420
    if-gez v11, :cond_30

    .line 1421
    .line 1422
    move-object v6, v10

    .line 1423
    goto :goto_15

    .line 1424
    :cond_31
    :goto_17
    if-eqz v6, :cond_32

    .line 1425
    .line 1426
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1427
    .line 1428
    .line 1429
    move-result v5

    .line 1430
    goto :goto_18

    .line 1431
    :cond_32
    move v5, v9

    .line 1432
    :goto_18
    if-ne v1, v5, :cond_33

    .line 1433
    .line 1434
    goto/16 :goto_1a

    .line 1435
    .line 1436
    :cond_33
    :try_start_6
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1437
    .line 1438
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v1

    .line 1442
    invoke-static {v7, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v1

    .line 1446
    instance-of v6, v1, Ljava/lang/String;

    .line 1447
    .line 1448
    if-eqz v6, :cond_34

    .line 1449
    .line 1450
    check-cast v1, Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 1451
    .line 1452
    goto :goto_19

    .line 1453
    :catch_5
    :cond_34
    move-object v1, v8

    .line 1454
    :goto_19
    if-eqz v1, :cond_35

    .line 1455
    .line 1456
    invoke-static {}, Llin/xposed/hook/util/qq/QQServiceTool;->getRuntime()Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v6

    .line 1460
    const/16 v10, 0x249

    .line 1461
    .line 1462
    :try_start_7
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v10

    .line 1466
    const/16 v11, 0x93d

    .line 1467
    .line 1468
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v11

    .line 1472
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v11

    .line 1476
    invoke-static {v6, v10, v11}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v8
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 1480
    :catch_6
    if-eqz v8, :cond_35

    .line 1481
    .line 1482
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;

    .line 1483
    .line 1484
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v1

    .line 1495
    invoke-static {v1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v1

    .line 1499
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v1

    .line 1503
    invoke-static {v8, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1504
    .line 1505
    .line 1506
    :cond_35
    const/16 v0, 0x944

    .line 1507
    .line 1508
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v1

    .line 1516
    invoke-static {v4, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1517
    .line 1518
    .line 1519
    const/16 v0, 0x945

    .line 1520
    .line 1521
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v1

    .line 1529
    invoke-static {v7, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v0

    .line 1533
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v1

    .line 1537
    add-int/2addr v5, v9

    .line 1538
    invoke-static {v0, v1, v5}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 1539
    .line 1540
    .line 1541
    const/16 v1, 0x946

    .line 1542
    .line 1543
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v1

    .line 1547
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v0

    .line 1551
    invoke-static {v4, v1, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    const/16 v0, 0x947

    .line 1555
    .line 1556
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    new-array v1, v12, [Ljava/lang/Object;

    .line 1561
    .line 1562
    invoke-static {v4, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1563
    .line 1564
    .line 1565
    const/16 v0, 0x948

    .line 1566
    .line 1567
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v0

    .line 1575
    const/16 v1, 0x949

    .line 1576
    .line 1577
    invoke-static {v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(I)Ljava/lang/Object;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v1

    .line 1581
    if-eqz v1, :cond_36

    .line 1582
    .line 1583
    const/16 v2, 0x94a

    .line 1584
    .line 1585
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v2

    .line 1589
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v0

    .line 1593
    invoke-static {v1, v2, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v0

    .line 1597
    const/16 v1, 0x94b

    .line 1598
    .line 1599
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v1

    .line 1603
    new-array v2, v12, [Ljava/lang/Object;

    .line 1604
    .line 1605
    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    :catch_7
    :cond_36
    :goto_1a
    return-void

    .line 1609
    :pswitch_f
    move-object v2, v0

    .line 1610
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;

    .line 1611
    .line 1612
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1613
    .line 1614
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1615
    .line 1616
    .line 1617
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v1

    .line 1621
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v1

    .line 1625
    invoke-static/range {v17 .. v17}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1629
    .line 1630
    .line 1631
    array-length v3, v1

    .line 1632
    move v4, v12

    .line 1633
    :goto_1b
    if-ge v4, v3, :cond_3b

    .line 1634
    .line 1635
    aget-object v5, v1, v4

    .line 1636
    .line 1637
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v6

    .line 1641
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v6

    .line 1645
    const/16 v7, 0x917

    .line 1646
    .line 1647
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v7

    .line 1651
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1652
    .line 1653
    .line 1654
    move-result v7

    .line 1655
    if-nez v7, :cond_37

    .line 1656
    .line 1657
    const-string v7, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 1658
    .line 1659
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v7

    .line 1663
    invoke-static {v6, v7, v12}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v6

    .line 1667
    if-eqz v6, :cond_3a

    .line 1668
    .line 1669
    goto :goto_1c

    .line 1670
    :catch_8
    move-exception v0

    .line 1671
    goto :goto_1f

    .line 1672
    :cond_37
    :goto_1c
    invoke-virtual {v5, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1673
    .line 1674
    .line 1675
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v5

    .line 1679
    if-nez v5, :cond_38

    .line 1680
    .line 1681
    goto :goto_1e

    .line 1682
    :cond_38
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v6

    .line 1686
    invoke-virtual {v6}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v6

    .line 1690
    const/16 v7, 0x918

    .line 1691
    .line 1692
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1696
    .line 1697
    .line 1698
    array-length v7, v6

    .line 1699
    move v10, v12

    .line 1700
    :goto_1d
    if-ge v10, v7, :cond_3a

    .line 1701
    .line 1702
    aget-object v11, v6, v10

    .line 1703
    .line 1704
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v13

    .line 1708
    const/16 v14, 0x919

    .line 1709
    .line 1710
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v14

    .line 1714
    invoke-static {v13, v14}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1715
    .line 1716
    .line 1717
    move-result v13

    .line 1718
    if-eqz v13, :cond_39

    .line 1719
    .line 1720
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 1721
    .line 1722
    .line 1723
    move-result v13

    .line 1724
    if-nez v13, :cond_39

    .line 1725
    .line 1726
    invoke-virtual {v11, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v11, v5, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v11

    .line 1733
    instance-of v13, v11, Landroid/widget/ImageView;

    .line 1734
    .line 1735
    if-eqz v13, :cond_39

    .line 1736
    .line 1737
    check-cast v11, Landroid/widget/ImageView;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 1738
    .line 1739
    move-object v8, v11

    .line 1740
    goto :goto_20

    .line 1741
    :cond_39
    add-int/lit8 v10, v10, 0x1

    .line 1742
    .line 1743
    goto :goto_1d

    .line 1744
    :cond_3a
    :goto_1e
    add-int/lit8 v4, v4, 0x1

    .line 1745
    .line 1746
    goto :goto_1b

    .line 1747
    :goto_1f
    invoke-virtual {v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v1

    .line 1751
    invoke-virtual {v1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 1752
    .line 1753
    .line 1754
    :cond_3b
    :goto_20
    if-nez v8, :cond_3c

    .line 1755
    .line 1756
    goto :goto_21

    .line 1757
    :cond_3c
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v0

    .line 1761
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v0

    .line 1765
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v0

    .line 1769
    const/16 v1, 0x78a

    .line 1770
    .line 1771
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1772
    .line 1773
    .line 1774
    const/16 v1, 0x91c

    .line 1775
    .line 1776
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v1

    .line 1780
    invoke-static {v0, v1, v12}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1781
    .line 1782
    .line 1783
    move-result v0

    .line 1784
    if-eqz v0, :cond_3d

    .line 1785
    .line 1786
    goto :goto_21

    .line 1787
    :cond_3d
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 1788
    .line 1789
    .line 1790
    move-result v0

    .line 1791
    if-nez v0, :cond_3e

    .line 1792
    .line 1793
    const/16 v0, 0x8

    .line 1794
    .line 1795
    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1796
    .line 1797
    .line 1798
    :cond_3e
    :goto_21
    return-void

    .line 1799
    :pswitch_10
    move-object v2, v0

    .line 1800
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰哲苏;

    .line 1801
    .line 1802
    sget-object v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1803
    .line 1804
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1805
    .line 1806
    aget-object v1, v0, v12

    .line 1807
    .line 1808
    if-nez v1, :cond_3f

    .line 1809
    .line 1810
    goto/16 :goto_33

    .line 1811
    .line 1812
    :cond_3f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v0

    .line 1816
    move-object v3, v0

    .line 1817
    :goto_22
    if-eqz v3, :cond_43

    .line 1818
    .line 1819
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v4

    .line 1823
    invoke-static/range {v17 .. v17}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1824
    .line 1825
    .line 1826
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1827
    .line 1828
    .line 1829
    array-length v5, v4

    .line 1830
    move v6, v12

    .line 1831
    :goto_23
    if-ge v6, v5, :cond_42

    .line 1832
    .line 1833
    aget-object v0, v4, v6

    .line 1834
    .line 1835
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v7

    .line 1839
    invoke-virtual {v15, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1840
    .line 1841
    .line 1842
    move-result v7

    .line 1843
    if-eqz v7, :cond_41

    .line 1844
    .line 1845
    :try_start_9
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1846
    .line 1847
    .line 1848
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v0

    .line 1852
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 1853
    .line 1854
    .line 1855
    move-result v7

    .line 1856
    if-eqz v7, :cond_40

    .line 1857
    .line 1858
    check-cast v0, Ljava/util/List;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 1859
    .line 1860
    goto :goto_24

    .line 1861
    :catchall_0
    move-exception v0

    .line 1862
    goto :goto_25

    .line 1863
    :cond_40
    move-object v0, v8

    .line 1864
    :goto_24
    move-object v1, v0

    .line 1865
    goto :goto_26

    .line 1866
    :goto_25
    new-instance v7, Lkotlin/Result$Failure;

    .line 1867
    .line 1868
    invoke-direct {v7, v0}, Lkotlin/Result$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 1869
    .line 1870
    .line 1871
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1872
    .line 1873
    .line 1874
    :cond_41
    add-int/lit8 v6, v6, 0x1

    .line 1875
    .line 1876
    goto :goto_23

    .line 1877
    :cond_42
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v3

    .line 1881
    goto :goto_22

    .line 1882
    :cond_43
    move-object v1, v8

    .line 1883
    :goto_26
    if-nez v1, :cond_44

    .line 1884
    .line 1885
    goto/16 :goto_33

    .line 1886
    .line 1887
    :cond_44
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪苏世兰(Ljava/util/List;)Ljava/lang/Object;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v3

    .line 1891
    if-nez v3, :cond_45

    .line 1892
    .line 1893
    goto/16 :goto_33

    .line 1894
    .line 1895
    :cond_45
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v4

    .line 1899
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v0

    .line 1903
    move-object v5, v0

    .line 1904
    :goto_27
    if-eqz v5, :cond_48

    .line 1905
    .line 1906
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v6

    .line 1910
    invoke-static/range {v17 .. v17}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1911
    .line 1912
    .line 1913
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1914
    .line 1915
    .line 1916
    array-length v7, v6

    .line 1917
    move v11, v12

    .line 1918
    :goto_28
    if-ge v11, v7, :cond_47

    .line 1919
    .line 1920
    aget-object v0, v6, v11

    .line 1921
    .line 1922
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v14

    .line 1926
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v14

    .line 1930
    invoke-virtual {v14, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1931
    .line 1932
    .line 1933
    move-result v14

    .line 1934
    if-eqz v14, :cond_46

    .line 1935
    .line 1936
    :try_start_a
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1937
    .line 1938
    .line 1939
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 1943
    move-object v3, v0

    .line 1944
    goto :goto_29

    .line 1945
    :catchall_1
    move-exception v0

    .line 1946
    new-instance v14, Lkotlin/Result$Failure;

    .line 1947
    .line 1948
    invoke-direct {v14, v0}, Lkotlin/Result$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 1949
    .line 1950
    .line 1951
    invoke-static {v14}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1952
    .line 1953
    .line 1954
    :cond_46
    add-int/lit8 v11, v11, 0x1

    .line 1955
    .line 1956
    goto :goto_28

    .line 1957
    :cond_47
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v5

    .line 1961
    goto :goto_27

    .line 1962
    :cond_48
    move-object v3, v8

    .line 1963
    :goto_29
    if-nez v3, :cond_49

    .line 1964
    .line 1965
    goto/16 :goto_33

    .line 1966
    .line 1967
    :cond_49
    :try_start_b
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v0

    .line 1971
    new-array v4, v12, [Ljava/lang/Object;

    .line 1972
    .line 1973
    invoke-static {v3, v0, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v0

    .line 1977
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1981
    goto :goto_2a

    .line 1982
    :catchall_2
    move-exception v0

    .line 1983
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v0

    .line 1987
    :goto_2a
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 1988
    .line 1989
    .line 1990
    move-result v4

    .line 1991
    if-eqz v4, :cond_4a

    .line 1992
    .line 1993
    move-object v0, v8

    .line 1994
    :cond_4a
    if-nez v0, :cond_4b

    .line 1995
    .line 1996
    goto/16 :goto_33

    .line 1997
    .line 1998
    :cond_4b
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v4

    .line 2002
    invoke-static {v0, v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v4

    .line 2006
    if-eqz v4, :cond_5c

    .line 2007
    .line 2008
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 2009
    .line 2010
    .line 2011
    move-result-wide v4

    .line 2012
    invoke-static/range {v19 .. v19}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v6

    .line 2016
    invoke-static {v0, v6}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v0

    .line 2020
    if-nez v0, :cond_4d

    .line 2021
    .line 2022
    :cond_4c
    move-object v0, v8

    .line 2023
    goto :goto_2b

    .line 2024
    :cond_4d
    instance-of v6, v0, Ljava/util/List;

    .line 2025
    .line 2026
    if-eqz v6, :cond_4c

    .line 2027
    .line 2028
    check-cast v0, Ljava/util/List;

    .line 2029
    .line 2030
    :goto_2b
    const-string v6, ""

    .line 2031
    .line 2032
    if-nez v0, :cond_4e

    .line 2033
    .line 2034
    goto/16 :goto_32

    .line 2035
    .line 2036
    :cond_4e
    new-instance v7, Ljava/lang/StringBuilder;

    .line 2037
    .line 2038
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 2039
    .line 2040
    .line 2041
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v10

    .line 2045
    :goto_2c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2046
    .line 2047
    .line 2048
    move-result v0

    .line 2049
    if-eqz v0, :cond_58

    .line 2050
    .line 2051
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v0

    .line 2055
    const/16 v11, 0x14a

    .line 2056
    .line 2057
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v11

    .line 2061
    invoke-static {v0, v11}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v11

    .line 2065
    if-nez v11, :cond_50

    .line 2066
    .line 2067
    :cond_4f
    move-object v11, v8

    .line 2068
    goto :goto_2d

    .line 2069
    :cond_50
    instance-of v14, v11, Ljava/lang/Integer;

    .line 2070
    .line 2071
    if-eqz v14, :cond_51

    .line 2072
    .line 2073
    check-cast v11, Ljava/lang/Integer;

    .line 2074
    .line 2075
    goto :goto_2d

    .line 2076
    :cond_51
    instance-of v14, v11, Ljava/lang/Number;

    .line 2077
    .line 2078
    if-eqz v14, :cond_4f

    .line 2079
    .line 2080
    check-cast v11, Ljava/lang/Number;

    .line 2081
    .line 2082
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 2083
    .line 2084
    .line 2085
    move-result v11

    .line 2086
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v11

    .line 2090
    :goto_2d
    if-eqz v11, :cond_59

    .line 2091
    .line 2092
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 2093
    .line 2094
    .line 2095
    move-result v11

    .line 2096
    if-eq v11, v9, :cond_52

    .line 2097
    .line 2098
    goto :goto_32

    .line 2099
    :cond_52
    :try_start_c
    invoke-static/range {v20 .. v20}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v11

    .line 2103
    new-array v14, v12, [Ljava/lang/Object;

    .line 2104
    .line 2105
    invoke-static {v0, v11, v14}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v0

    .line 2109
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 2113
    goto :goto_2e

    .line 2114
    :catchall_3
    move-exception v0

    .line 2115
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v0

    .line 2119
    :goto_2e
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 2120
    .line 2121
    .line 2122
    move-result v11

    .line 2123
    if-eqz v11, :cond_53

    .line 2124
    .line 2125
    move-object v0, v8

    .line 2126
    :cond_53
    if-nez v0, :cond_54

    .line 2127
    .line 2128
    goto :goto_32

    .line 2129
    :cond_54
    const/16 v11, 0x14b

    .line 2130
    .line 2131
    :try_start_d
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v11

    .line 2135
    new-array v14, v12, [Ljava/lang/Object;

    .line 2136
    .line 2137
    invoke-static {v0, v11, v14}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v0

    .line 2141
    instance-of v11, v0, Ljava/lang/String;

    .line 2142
    .line 2143
    if-eqz v11, :cond_55

    .line 2144
    .line 2145
    check-cast v0, Ljava/lang/String;

    .line 2146
    .line 2147
    goto :goto_2f

    .line 2148
    :catchall_4
    move-exception v0

    .line 2149
    goto :goto_30

    .line 2150
    :cond_55
    move-object v0, v8

    .line 2151
    :goto_2f
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 2155
    goto :goto_31

    .line 2156
    :goto_30
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v0

    .line 2160
    :goto_31
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 2161
    .line 2162
    .line 2163
    move-result v11

    .line 2164
    if-eqz v11, :cond_56

    .line 2165
    .line 2166
    move-object v0, v8

    .line 2167
    :cond_56
    check-cast v0, Ljava/lang/String;

    .line 2168
    .line 2169
    if-nez v0, :cond_57

    .line 2170
    .line 2171
    goto :goto_32

    .line 2172
    :cond_57
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2173
    .line 2174
    .line 2175
    goto/16 :goto_2c

    .line 2176
    .line 2177
    :cond_58
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v6

    .line 2181
    const/16 v0, 0x4f4

    .line 2182
    .line 2183
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2184
    .line 2185
    .line 2186
    :cond_59
    :goto_32
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 2187
    .line 2188
    .line 2189
    move-result v0

    .line 2190
    if-lez v0, :cond_5a

    .line 2191
    .line 2192
    move-object v8, v6

    .line 2193
    :cond_5a
    if-nez v8, :cond_5b

    .line 2194
    .line 2195
    goto :goto_33

    .line 2196
    :cond_5b
    const/16 v0, 0x8ff

    .line 2197
    .line 2198
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v0

    .line 2202
    new-instance v6, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲苏兰;

    .line 2203
    .line 2204
    invoke-direct {v6, v2, v8, v4, v5}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲苏兰;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰哲苏;Ljava/lang/String;J)V

    .line 2205
    .line 2206
    .line 2207
    invoke-static {v3, v0, v13, v6}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;ILjava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v0

    .line 2211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2212
    .line 2213
    .line 2214
    invoke-interface {v1, v12, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 2215
    .line 2216
    .line 2217
    :cond_5c
    :goto_33
    return-void

    .line 2218
    :pswitch_11
    move-object v2, v0

    .line 2219
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;

    .line 2220
    .line 2221
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 2222
    .line 2223
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 2224
    .line 2225
    .line 2226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2227
    .line 2228
    .line 2229
    const/16 v3, 0x681

    .line 2230
    .line 2231
    const/16 v4, 0x680

    .line 2232
    .line 2233
    :try_start_e
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2234
    .line 2235
    aget-object v0, v0, v12

    .line 2236
    .line 2237
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2238
    .line 2239
    .line 2240
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2241
    .line 2242
    .line 2243
    check-cast v0, Ljava/lang/String;

    .line 2244
    .line 2245
    iget-object v5, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2246
    .line 2247
    aget-object v5, v5, v9

    .line 2248
    .line 2249
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2250
    .line 2251
    .line 2252
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2253
    .line 2254
    .line 2255
    check-cast v5, [B

    .line 2256
    .line 2257
    const/16 v6, 0x682

    .line 2258
    .line 2259
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v6

    .line 2263
    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2264
    .line 2265
    .line 2266
    move-result v6

    .line 2267
    if-eqz v6, :cond_5d

    .line 2268
    .line 2269
    invoke-static {v5, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲([BLde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 2270
    .line 2271
    .line 2272
    goto/16 :goto_35

    .line 2273
    .line 2274
    :catch_9
    move-exception v0

    .line 2275
    goto :goto_34

    .line 2276
    :cond_5d
    const/16 v6, 0x12f

    .line 2277
    .line 2278
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2279
    .line 2280
    .line 2281
    move-result-object v6

    .line 2282
    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2283
    .line 2284
    .line 2285
    move-result v0

    .line 2286
    if-eqz v0, :cond_5e

    .line 2287
    .line 2288
    invoke-static {v5, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世([BLde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_9

    .line 2289
    .line 2290
    .line 2291
    goto/16 :goto_35

    .line 2292
    .line 2293
    :goto_34
    invoke-virtual {v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v5

    .line 2297
    const/16 v6, 0x8fb

    .line 2298
    .line 2299
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2300
    .line 2301
    .line 2302
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2303
    .line 2304
    .line 2305
    invoke-virtual {v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v2

    .line 2309
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2310
    .line 2311
    .line 2312
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2313
    .line 2314
    .line 2315
    const-string v6, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 2316
    .line 2317
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v6

    .line 2321
    const/4 v7, 0x6

    .line 2322
    invoke-static {v12, v7, v2, v6}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰苏世楪(IILjava/lang/String;Ljava/lang/String;)I

    .line 2323
    .line 2324
    .line 2325
    move-result v2

    .line 2326
    add-int/2addr v2, v9

    .line 2327
    invoke-virtual {v5, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 2328
    .line 2329
    .line 2330
    move-result-object v2

    .line 2331
    const/16 v5, 0x7db

    .line 2332
    .line 2333
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2334
    .line 2335
    .line 2336
    const/16 v5, 0x2f4

    .line 2337
    .line 2338
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2339
    .line 2340
    .line 2341
    move-result-object v5

    .line 2342
    invoke-static {v5, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2343
    .line 2344
    .line 2345
    sget-object v5, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2346
    .line 2347
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v5

    .line 2351
    invoke-static {v2, v5, v0, v9}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 2352
    .line 2353
    .line 2354
    iget-object v5, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2355
    .line 2356
    aget-object v5, v5, v12

    .line 2357
    .line 2358
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2359
    .line 2360
    .line 2361
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2362
    .line 2363
    .line 2364
    check-cast v5, Ljava/lang/String;

    .line 2365
    .line 2366
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2367
    .line 2368
    aget-object v1, v1, v9

    .line 2369
    .line 2370
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 2371
    .line 2372
    .line 2373
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2374
    .line 2375
    .line 2376
    check-cast v1, [B

    .line 2377
    .line 2378
    new-instance v3, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 2379
    .line 2380
    invoke-direct {v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2381
    .line 2382
    .line 2383
    invoke-static {v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏([B)[B

    .line 2384
    .line 2385
    .line 2386
    move-result-object v1

    .line 2387
    invoke-virtual {v3, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([B)V

    .line 2388
    .line 2389
    .line 2390
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2391
    .line 2392
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2393
    .line 2394
    .line 2395
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2396
    .line 2397
    .line 2398
    const-string v4, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c"

    .line 2399
    .line 2400
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 2401
    .line 2402
    .line 2403
    move-result-object v4

    .line 2404
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2405
    .line 2406
    .line 2407
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2408
    .line 2409
    .line 2410
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5"

    .line 2411
    .line 2412
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v3

    .line 2416
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2417
    .line 2418
    .line 2419
    invoke-static {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Exception;)Ljava/lang/String;

    .line 2420
    .line 2421
    .line 2422
    move-result-object v0

    .line 2423
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2424
    .line 2425
    .line 2426
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v0

    .line 2430
    invoke-static {v0, v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2431
    .line 2432
    .line 2433
    :cond_5e
    :goto_35
    return-void

    .line 2434
    nop

    .line 2435
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public 飘花落叶言子苏兰楪世哲(Landroid/view/View;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;
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
