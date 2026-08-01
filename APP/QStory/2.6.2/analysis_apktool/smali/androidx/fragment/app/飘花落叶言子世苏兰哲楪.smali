.class public final Landroidx/fragment/app/飘花落叶言子世苏兰哲楪;
.super L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/fragment/app/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Landroid/content/Intent;I)Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, Landroidx/fragment/app/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroidx/activity/result/ActivityResult;

    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Landroidx/activity/result/ActivityResult;-><init>(Landroid/content/Intent;I)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_0
    const/4 p0, -0x1

    .line 13
    if-eq p2, p0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏兰哲()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_3

    .line 20
    :cond_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏兰哲()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_3

    .line 27
    :cond_1
    const-string p0, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p2, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_5

    .line 40
    .line 41
    if-nez p0, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    .line 45
    .line 46
    array-length v0, p1

    .line 47
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    array-length v0, p1

    .line 51
    const/4 v1, 0x0

    .line 52
    move v2, v1

    .line 53
    :goto_0
    if-ge v2, v0, :cond_4

    .line 54
    .line 55
    aget v3, p1, v2

    .line 56
    .line 57
    if-nez v3, :cond_3

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move v3, v1

    .line 62
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏楪兰哲世([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0, p2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世兰苏楪(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子世苏哲兰楪(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    goto :goto_3

    .line 85
    :cond_5
    :goto_2
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏兰哲()Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    :goto_3
    return-object p0

    .line 90
    :pswitch_1
    new-instance p0, Landroidx/activity/result/ActivityResult;

    .line 91
    .line 92
    invoke-direct {p0, p1, p2}, Landroidx/activity/result/ActivityResult;-><init>(Landroid/content/Intent;I)V

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪世苏兰哲(Landroid/content/Context;Ljava/lang/Object;)L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;
    .locals 4

    .line 1
    iget v0, p0, Landroidx/fragment/app/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Ljava/lang/Object;)L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p2, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    array-length p0, p2

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    new-instance p0, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏兰哲()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    array-length p0, p2

    .line 30
    const/4 v0, 0x0

    .line 31
    move v1, v0

    .line 32
    :goto_0
    if-ge v1, p0, :cond_2

    .line 33
    .line 34
    aget-object v2, p2, v1

    .line 35
    .line 36
    invoke-static {p1, v2}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    array-length p0, p2

    .line 48
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪哲兰苏(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    const/16 p1, 0x10

    .line 53
    .line 54
    if-ge p0, p1, :cond_3

    .line 55
    .line 56
    move p0, p1

    .line 57
    :cond_3
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {p1, p0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 60
    .line 61
    .line 62
    array-length p0, p2

    .line 63
    :goto_1
    if-ge v0, p0, :cond_4

    .line 64
    .line 65
    aget-object v1, p2, v0

    .line 66
    .line 67
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 68
    .line 69
    new-instance v3, Lkotlin/Pair;

    .line 70
    .line 71
    invoke-direct {v3, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    new-instance p0, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;

    .line 89
    .line 90
    invoke-direct {p0, p1}, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :goto_2
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 3

    .line 1
    iget p0, p0, Landroidx/fragment/app/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Landroid/content/Intent;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p2

    .line 12
    :pswitch_0
    check-cast p2, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance p0, Landroid/content/Intent;

    .line 18
    .line 19
    const-string p1, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string p1, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    check-cast p2, Landroidx/activity/result/IntentSenderRequest;

    .line 35
    .line 36
    new-instance p0, Landroid/content/Intent;

    .line 37
    .line 38
    const-string p1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 39
    .line 40
    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p2, Landroidx/activity/result/IntentSenderRequest;->飘花落叶言子楪哲兰世苏:Landroid/content/Intent;

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    const-string v0, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    iget-object p1, p2, Landroidx/activity/result/IntentSenderRequest;->飘花落叶言子楪哲苏兰世:Landroid/content/IntentSender;

    .line 71
    .line 72
    iget v0, p2, Landroidx/activity/result/IntentSenderRequest;->飘花落叶言子楪兰世苏哲:I

    .line 73
    .line 74
    iget p2, p2, Landroidx/activity/result/IntentSenderRequest;->飘花落叶言子楪哲兰苏世:I

    .line 75
    .line 76
    new-instance v1, Landroidx/activity/result/IntentSenderRequest;

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {v1, p1, v2, p2, v0}, Landroidx/activity/result/IntentSenderRequest;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 80
    .line 81
    .line 82
    move-object p2, v1

    .line 83
    :cond_0
    const-string p1, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    .line 84
    .line 85
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x2

    .line 89
    invoke-static {p1}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    new-instance p1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string p2, "CreateIntent created the following intent: "

    .line 98
    .line 99
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const-string p2, "FragmentManager"

    .line 110
    .line 111
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    :cond_1
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
