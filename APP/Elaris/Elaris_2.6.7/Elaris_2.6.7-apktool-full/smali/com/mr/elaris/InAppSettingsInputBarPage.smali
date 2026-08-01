.class final Lcom/mr/elaris/InAppSettingsInputBarPage;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final OPTION_DESCRIPTIONS:[Ljava/lang/String;

.field private static final OPTION_IDS:[I

.field private static final OPTION_TITLES:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/mr/elaris/InAppSettingsInputBarPage;->OPTION_IDS:[I

    .line 8
    .line 9
    const-string v5, "\u8868\u60c5"

    .line 10
    .line 11
    const-string v6, "\u52a0\u53f7"

    .line 12
    .line 13
    const-string v1, "\u8bed\u97f3"

    .line 14
    .line 15
    const-string v2, "\u76f8\u518c"

    .line 16
    .line 17
    const-string v3, "\u76f8\u673a"

    .line 18
    .line 19
    const-string v4, "\u6ce1\u6ce1\u6d88\u606f"

    .line 20
    .line 21
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/mr/elaris/InAppSettingsInputBarPage;->OPTION_TITLES:[Ljava/lang/String;

    .line 26
    .line 27
    const-string v5, "\u9690\u85cf\u8868\u60c5\u9762\u677f\u5165\u53e3"

    .line 28
    .line 29
    const-string v6, "\u9690\u85cf\u66f4\u591a\u529f\u80fd\u5165\u53e3"

    .line 30
    .line 31
    const-string v1, "\u9690\u85cf QQ \u539f\u751f\u8bed\u97f3\u5165\u53e3"

    .line 32
    .line 33
    const-string v2, "\u9690\u85cf\u7cfb\u7edf\u76f8\u518c\u5165\u53e3"

    .line 34
    .line 35
    const-string v3, "\u9690\u85cf\u7cfb\u7edf\u76f8\u673a\u5165\u53e3"

    .line 36
    .line 37
    const-string v4, "\u9690\u85cf\u6ce1\u6ce1\u89c6\u9891\u5165\u53e3"

    .line 38
    .line 39
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lcom/mr/elaris/InAppSettingsInputBarPage;->OPTION_DESCRIPTIONS:[Ljava/lang/String;

    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :array_0
    .array-data 4
        0x3e8
        0x3eb
        0x3ed
        0x3f8
        0x3e9
        0x3ee
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic a()[I
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/InAppSettingsInputBarPage;->OPTION_IDS:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic b(Lcom/mr/elaris/InAppSettings;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsInputBarPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static createSwitchRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 10

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsInputBarPage;->ensureMigrated(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "aio_input_bar_enabled"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->getBool(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "aio_input_bar_hidden_ids"

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const-string v1, "\u5df2\u5173\u95ed"

    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    invoke-static {v2, v1}, Li5;->e0(Ljava/lang/String;Z)Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const-string v1, "\u672a\u9690\u85cf\u4efb\u4f55\u6309\u94ae"

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_1
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    sget-object v4, Li5;->d:[I

    .line 42
    .line 43
    const/4 v5, 0x6

    .line 44
    if-ne v3, v5, :cond_2

    .line 45
    .line 46
    const-string v1, "\u5df2\u9690\u85cf\u5168\u90e8 6 \u9879"

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v6, "\u5df2\u9690\u85cf\uff1a"

    .line 52
    .line 53
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v6, 0x1

    .line 57
    move v7, v1

    .line 58
    :goto_0
    if-ge v7, v5, :cond_b

    .line 59
    .line 60
    aget v8, v4, v7

    .line 61
    .line 62
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-interface {v2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-nez v9, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    if-nez v6, :cond_4

    .line 74
    .line 75
    const/16 v6, 0x3001

    .line 76
    .line 77
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    :cond_4
    const/16 v6, 0x3e8

    .line 81
    .line 82
    if-ne v8, v6, :cond_5

    .line 83
    .line 84
    const-string v6, "\u8bed\u97f3"

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    const/16 v6, 0x3eb

    .line 88
    .line 89
    if-ne v8, v6, :cond_6

    .line 90
    .line 91
    const-string v6, "\u76f8\u518c"

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_6
    const/16 v6, 0x3ed

    .line 95
    .line 96
    if-ne v8, v6, :cond_7

    .line 97
    .line 98
    const-string v6, "\u76f8\u673a"

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_7
    const/16 v6, 0x3f8

    .line 102
    .line 103
    if-ne v8, v6, :cond_8

    .line 104
    .line 105
    const-string v6, "\u6ce1\u6ce1\u6d88\u606f"

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_8
    const/16 v6, 0x3e9

    .line 109
    .line 110
    if-ne v8, v6, :cond_9

    .line 111
    .line 112
    const-string v6, "\u8868\u60c5"

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_9
    const/16 v6, 0x3ee

    .line 116
    .line 117
    if-ne v8, v6, :cond_a

    .line 118
    .line 119
    const-string v6, "\u52a0\u53f7"

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_a
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    :goto_1
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    move v6, v1

    .line 130
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_b
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :goto_3
    new-instance v2, Lcom/mr/elaris/InAppSettingsInputBarPage$1;

    .line 138
    .line 139
    invoke-direct {v2, p0}, Lcom/mr/elaris/InAppSettingsInputBarPage$1;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 140
    .line 141
    .line 142
    const-string v3, "\u5c4f\u853d\u8f93\u5165\u6846\u5e95\u680f"

    .line 143
    .line 144
    invoke-static {p0, v0, v3, v1, v2}, Lcom/mr/elaris/InAppSettingsWidgets;->switchDetailRowSilent(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0
.end method

.method private static ensureMigrated(Lcom/mr/elaris/InAppSettings;)V
    .locals 7

    .line 1
    const-string v0, "aio_input_bar_migrated"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->getBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v1, "aio_input_bar_hidden_ids"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "aio_input_bar_enabled"

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->getBool(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const-string v5, "hide_aio_input_camera_entries"

    .line 23
    .line 24
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->getBool(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-static {v2, v4, v6, v5}, Li5;->F0(Ljava/lang/String;ZZZ)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {v2, v6}, Li5;->n1(Ljava/lang/String;Z)Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    const/16 v5, 0x3ed

    .line 49
    .line 50
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    const/16 v5, 0x3f8

    .line 58
    .line 59
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-static {v2}, Li5;->K1(Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {p0, v1, v2, v6}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-virtual {p0, v3, v4, v6}, Lcom/mr/elaris/InAppSettings;->saveBool(Ljava/lang/String;ZZ)V

    .line 74
    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    invoke-virtual {p0, v0, v1, v6}, Lcom/mr/elaris/InAppSettings;->saveBool(Ljava/lang/String;ZZ)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private static showDialog(Lcom/mr/elaris/InAppSettings;)V
    .locals 12

    .line 1
    :try_start_0
    const-string v0, "aio_input_bar_hidden_ids"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, Li5;->e0(Ljava/lang/String;Z)Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, Lcom/mr/elaris/InAppSettingsInputBarPage;->OPTION_IDS:[I

    .line 13
    .line 14
    array-length v2, v2

    .line 15
    new-array v2, v2, [Z

    .line 16
    .line 17
    move v3, v1

    .line 18
    :goto_0
    sget-object v4, Lcom/mr/elaris/InAppSettingsInputBarPage;->OPTION_IDS:[I

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    if-ge v3, v5, :cond_0

    .line 22
    .line 23
    aget v4, v4, v3

    .line 24
    .line 25
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    aput-boolean v4, v2, v3

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v0, v1

    .line 39
    new-instance v1, Landroid/widget/LinearLayout;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 42
    .line 43
    invoke-direct {v1, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 48
    .line 49
    .line 50
    const-string v4, "elaris_dialog_surface"

    .line 51
    .line 52
    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/high16 v4, 0x41a00000    # 20.0f

    .line 56
    .line 57
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    const/high16 v5, 0x41900000    # 18.0f

    .line 62
    .line 63
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    const/high16 v6, 0x41600000    # 14.0f

    .line 68
    .line 69
    invoke-virtual {p0, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-virtual {v1, v4, v5, v4, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 81
    .line 82
    .line 83
    const-string v4, "\u5c4f\u853d\u8f93\u5165\u6846\u5e95\u680f"

    .line 84
    .line 85
    sget v5, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 86
    .line 87
    const/16 v6, 0x14

    .line 88
    .line 89
    invoke-virtual {p0, v4, v6, v5, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    const-string v4, "\u9009\u62e9\u8981\u4ece QQ \u804a\u5929\u5e95\u680f\u9690\u85cf\u7684\u5165\u53e3"

    .line 97
    .line 98
    sget v5, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 99
    .line 100
    const/16 v6, 0xd

    .line 101
    .line 102
    invoke-virtual {p0, v4, v6, v5, v0}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const/high16 v5, 0x40c00000    # 6.0f

    .line 107
    .line 108
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    const/high16 v7, 0x41000000    # 8.0f

    .line 113
    .line 114
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    invoke-virtual {v4, v0, v6, v0, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    move v4, v0

    .line 125
    :goto_1
    sget-object v6, Lcom/mr/elaris/InAppSettingsInputBarPage;->OPTION_IDS:[I

    .line 126
    .line 127
    array-length v7, v6

    .line 128
    if-ge v4, v7, :cond_2

    .line 129
    .line 130
    sget-object v7, Lcom/mr/elaris/InAppSettingsInputBarPage;->OPTION_TITLES:[Ljava/lang/String;

    .line 131
    .line 132
    aget-object v7, v7, v4

    .line 133
    .line 134
    sget-object v8, Lcom/mr/elaris/InAppSettingsInputBarPage;->OPTION_DESCRIPTIONS:[Ljava/lang/String;

    .line 135
    .line 136
    aget-object v8, v8, v4

    .line 137
    .line 138
    aget-boolean v9, v2, v4

    .line 139
    .line 140
    new-instance v10, Lcom/mr/elaris/InAppSettingsInputBarPage$2;

    .line 141
    .line 142
    invoke-direct {v10, v2, v4}, Lcom/mr/elaris/InAppSettingsInputBarPage$2;-><init>([ZI)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v7, v8, v9, v10}, Lcom/mr/elaris/InAppSettings;->settingItem(Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    array-length v6, v6

    .line 153
    sub-int/2addr v6, v3

    .line 154
    if-ge v4, v6, :cond_1

    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_2
    new-instance v4, Landroid/app/AlertDialog$Builder;

    .line 167
    .line 168
    iget-object v6, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 169
    .line 170
    invoke-direct {v4, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    new-instance v6, Landroid/widget/LinearLayout;

    .line 178
    .line 179
    iget-object v7, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 180
    .line 181
    invoke-direct {v6, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 185
    .line 186
    .line 187
    const-string v7, "\u53d6\u6d88"

    .line 188
    .line 189
    invoke-virtual {p0, v7, v0}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    const-string v8, "\u4fdd\u5b58"

    .line 194
    .line 195
    invoke-virtual {p0, v8, v3}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 200
    .line 201
    const/high16 v9, 0x42280000    # 42.0f

    .line 202
    .line 203
    invoke-virtual {p0, v9}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    const/high16 v11, 0x3f800000    # 1.0f

    .line 208
    .line 209
    invoke-direct {v8, v0, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    iput v10, v8, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 217
    .line 218
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 219
    .line 220
    invoke-virtual {p0, v9}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    invoke-direct {v10, v0, v9, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    iput v0, v10, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 232
    .line 233
    invoke-virtual {v6, v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 237
    .line 238
    .line 239
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 240
    .line 241
    const/4 v5, -0x1

    .line 242
    const/4 v8, -0x2

    .line 243
    invoke-direct {v0, v5, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 244
    .line 245
    .line 246
    const/high16 v5, 0x41400000    # 12.0f

    .line 247
    .line 248
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 253
    .line 254
    invoke-virtual {v1, v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 255
    .line 256
    .line 257
    new-instance v0, Lcom/mr/elaris/InAppSettingsInputBarPage$3;

    .line 258
    .line 259
    invoke-direct {v0, v4}, Lcom/mr/elaris/InAppSettingsInputBarPage$3;-><init>(Landroid/app/AlertDialog;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 263
    .line 264
    .line 265
    new-instance v0, Lcom/mr/elaris/InAppSettingsInputBarPage$4;

    .line 266
    .line 267
    invoke-direct {v0, v2, p0, v4}, Lcom/mr/elaris/InAppSettingsInputBarPage$4;-><init>([ZLcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 271
    .line 272
    .line 273
    move-object v0, v4

    .line 274
    const/4 v4, 0x0

    .line 275
    const/4 v5, 0x0

    .line 276
    const/4 v2, 0x0

    .line 277
    const/4 v3, 0x0

    .line 278
    invoke-virtual/range {v0 .. v5}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 279
    .line 280
    .line 281
    new-instance v1, Lcom/mr/elaris/InAppSettingsInputBarPage$5;

    .line 282
    .line 283
    invoke-direct {v1, p0, v0}, Lcom/mr/elaris/InAppSettingsInputBarPage$5;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :catchall_0
    move-exception v0

    .line 297
    move-object p0, v0

    .line 298
    new-instance v0, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v1, "input bar settings dialog failed: "

    .line 301
    .line 302
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    const-string v1, ": "

    .line 306
    .line 307
    invoke-static {p0, v0, v1}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    return-void
.end method
