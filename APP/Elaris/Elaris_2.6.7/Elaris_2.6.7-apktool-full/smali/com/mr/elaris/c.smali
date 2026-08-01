.class public final Lcom/mr/elaris/c;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# direct methods
.method public static a(Landroid/view/View;)Z
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 2
    :goto_0
    instance-of v3, v2, Landroid/content/ContextWrapper;

    if-eqz v3, :cond_2

    .line 3
    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/app/Activity;

    goto :goto_1

    .line 4
    :cond_1
    check-cast v2, Landroid/content/ContextWrapper;

    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 5
    :catchall_0
    :cond_2
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_47

    .line 6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 7
    const-string v4, "elaris"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_47

    const-string v4, "setting"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_47

    const-string v4, "mini"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_28

    .line 8
    :cond_3
    const-string v4, "activity.home"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_47

    const-string v4, "mainactivity"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_28

    .line 9
    :cond_4
    const-string v4, "aio"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "chat"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "splashactivity"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "conversation"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_47

    .line 10
    :cond_5
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    .line 11
    const-string v4, "group_admin_avatar_menu"

    sget-boolean v5, Ls6;->j:Z

    if-nez v5, :cond_8

    .line 12
    :try_start_1
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    if-eqz v3, :cond_7

    .line 13
    :try_start_2
    const-string v5, "settings"

    invoke-virtual {v3, v5, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 14
    invoke-interface {v5, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_6

    invoke-static {v4}, Lcom/mr/elaris/Prefs;->defaultBoolean(Ljava/lang/String;)Z

    move-result v4

    goto :goto_2

    .line 15
    :cond_6
    invoke-static {v4}, Lcom/mr/elaris/Prefs;->defaultBoolean(Ljava/lang/String;)Z

    move-result v6

    invoke-static {v5, v4, v6}, Lcom/mr/elaris/Prefs;->readBoolean(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Z

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    :cond_7
    move v4, v1

    .line 16
    :goto_2
    invoke-static {v4}, Ls6;->D0(Z)V

    .line 17
    :cond_8
    sget-boolean v4, Ls6;->i:Z

    if-nez v4, :cond_9

    goto/16 :goto_28

    .line 18
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 19
    const-string v6, "\u8d26\u6237"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_46

    const-string v6, "\u8bbe\u7f6e"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_46

    const-string v6, "account"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_a

    goto/16 :goto_27

    .line 20
    :cond_a
    invoke-static {v0}, Ls6;->X(Landroid/view/View;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 21
    const-string v6, "activity.home.view.titleareaheadlayout"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_46

    const-string v6, "activity.recent"

    .line 22
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_46

    const-string v6, "drawerframe"

    .line 23
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_46

    const-string v6, "tabframelayout"

    .line 24
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto/16 :goto_27

    .line 25
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 26
    const-string v6, "activity.home"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_46

    const-string v6, "mainactivity"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    goto/16 :goto_27

    .line 27
    :cond_c
    const-string v4, " "

    .line 28
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 31
    const-string v6, "avatar"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    const/4 v7, 0x5

    const/16 v8, 0x8

    if-nez v6, :cond_f

    const-string v6, "face"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_f

    const-string v6, "head"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_3

    .line 32
    :cond_d
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    sub-int v9, v4, v6

    .line 34
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 35
    instance-of v10, v0, Landroid/widget/ImageView;

    if-eqz v10, :cond_e

    const/16 v10, 0x18

    if-lt v4, v10, :cond_e

    if-lt v6, v10, :cond_e

    const/16 v10, 0x80

    if-gt v4, v10, :cond_e

    if-gt v6, v10, :cond_e

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    div-int/2addr v4, v7

    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-gt v9, v4, :cond_e

    goto :goto_3

    .line 36
    :cond_e
    invoke-static {v0}, Ls6;->X(Landroid/view/View;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 37
    const-string v5, "avatar"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_f

    const-string v5, "face"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_f

    const-string v5, "head"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_47

    .line 38
    :cond_f
    :goto_3
    const-string v4, "group avatar long click probe className="

    :try_start_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " tag="

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " contentDescription="

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " activity="

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " parentChain="

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    invoke-static {v0}, Ls6;->X(Landroid/view/View;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 43
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 44
    :catchall_3
    const-string v4, "u_"

    const-string v5, ""

    move-object v6, v0

    move v9, v1

    :goto_4
    if-eqz v6, :cond_13

    add-int/lit8 v11, v9, 0x1

    if-ge v9, v8, :cond_13

    .line 45
    invoke-static {v6}, Ls6;->D(Ljava/lang/Object;)Lb7;

    move-result-object v9

    if-eqz v9, :cond_10

    goto :goto_7

    .line 46
    :cond_10
    :try_start_4
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_5

    :catchall_4
    const/4 v9, 0x0

    .line 47
    :goto_5
    invoke-static {v9}, Ls6;->D(Ljava/lang/Object;)Lb7;

    move-result-object v9

    if-eqz v9, :cond_11

    goto :goto_7

    .line 48
    :cond_11
    :try_start_5
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    .line 49
    instance-of v9, v6, Landroid/view/View;

    if-eqz v9, :cond_12

    check-cast v6, Landroid/view/View;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_6

    :cond_12
    const/4 v6, 0x0

    :goto_6
    move v9, v11

    goto :goto_4

    :catchall_5
    :cond_13
    const/4 v9, 0x0

    .line 50
    :goto_7
    invoke-static {v9}, Ls6;->E(Lb7;)Ljava/lang/String;

    move-result-object v6

    .line 51
    invoke-static {v9}, Ls6;->K(Lb7;)Z

    move-result v9

    .line 52
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_17

    move-object v6, v0

    move v11, v1

    .line 53
    :goto_8
    instance-of v12, v6, Landroid/view/View;

    if-eqz v12, :cond_16

    add-int/lit8 v12, v11, 0x1

    if-ge v11, v8, :cond_16

    .line 54
    invoke-static {v6}, Ls6;->F(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 55
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    if-lt v13, v7, :cond_14

    :goto_9
    move-object v6, v11

    goto :goto_b

    .line 56
    :cond_14
    :try_start_6
    move-object v11, v6

    check-cast v11, Landroid/view/View;

    invoke-virtual {v11}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v11
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_a

    :catchall_6
    const/4 v11, 0x0

    .line 57
    :goto_a
    invoke-static {v11}, Ls6;->F(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 58
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    if-lt v13, v7, :cond_15

    goto :goto_9

    .line 59
    :cond_15
    :try_start_7
    check-cast v6, Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    move v11, v12

    goto :goto_8

    :catchall_7
    :cond_16
    move-object v6, v5

    .line 60
    :cond_17
    :goto_b
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v8

    if-nez v8, :cond_19

    :cond_18
    :goto_c
    move-object v8, v5

    goto :goto_d

    .line 61
    :cond_19
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 62
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_1a

    goto :goto_c

    .line 63
    :cond_1a
    const-string v11, "msgId"

    invoke-virtual {v8, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_18

    const-string v11, "peerId"

    invoke-virtual {v8, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_18

    const-string v11, "chatType"

    invoke-virtual {v8, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_1b

    goto :goto_c

    .line 64
    :cond_1b
    invoke-static {v8}, Ls6;->Z(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_18

    .line 65
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 66
    :goto_d
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    if-lt v11, v7, :cond_1c

    goto/16 :goto_11

    .line 67
    :cond_1c
    :try_start_8
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_e

    :catchall_8
    const/4 v8, 0x0

    .line 68
    :goto_e
    invoke-static {}, Ls6;->V()Ljava/util/Set;

    move-result-object v11

    invoke-static {v8, v1, v11}, Ls6;->w0(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    move-result-object v8

    .line 69
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    if-lt v11, v7, :cond_1d

    goto :goto_11

    .line 70
    :cond_1d
    invoke-static {}, Ls6;->V()Ljava/util/Set;

    move-result-object v8

    invoke-static {v0, v1, v8}, Ls6;->w0(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    move-result-object v8

    .line 71
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    if-lt v11, v7, :cond_1e

    goto :goto_11

    .line 72
    :cond_1e
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    move v11, v1

    :goto_f
    if-eqz v8, :cond_21

    add-int/lit8 v12, v11, 0x1

    const/4 v13, 0x4

    if-ge v11, v13, :cond_21

    .line 73
    invoke-static {}, Ls6;->V()Ljava/util/Set;

    move-result-object v11

    invoke-static {v8, v1, v11}, Ls6;->w0(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    move-result-object v11

    .line 74
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    if-lt v13, v7, :cond_1f

    :goto_10
    move-object v8, v11

    goto :goto_11

    .line 75
    :cond_1f
    instance-of v11, v8, Landroid/view/View;

    if-eqz v11, :cond_21

    .line 76
    :try_start_9
    move-object v11, v8

    check-cast v11, Landroid/view/View;

    invoke-virtual {v11}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v11

    invoke-static {}, Ls6;->V()Ljava/util/Set;

    move-result-object v13

    invoke-static {v11, v1, v13}, Ls6;->w0(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    move-result-object v11

    .line 77
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    if-lt v13, v7, :cond_20

    goto :goto_10

    .line 78
    :cond_20
    check-cast v8, Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    move v11, v12

    goto :goto_f

    :catchall_9
    :cond_21
    move-object v8, v5

    .line 79
    :goto_11
    :try_start_a
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v11
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    goto :goto_12

    :catchall_a
    const/4 v11, 0x0

    .line 80
    :goto_12
    const-string v12, "nick"

    const-string v13, "nickname"

    const-string v14, "senderName"

    const-string v15, "name"

    const-string v10, "remark"

    filled-new-array {v12, v13, v14, v15, v10}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v10}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 81
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_22

    move-object v10, v8

    .line 82
    :cond_22
    invoke-static {v0}, Ls6;->Q(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 83
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_23

    .line 84
    :try_start_b
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Ls6;->Q(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 85
    :catchall_b
    :cond_23
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v12

    if-eqz v12, :cond_24

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v12

    if-eqz v12, :cond_24

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_31

    .line 86
    :cond_24
    invoke-static {v11}, Lcom/mr/elaris/MessageRepeater;->cachedMsgRecordById(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_25

    goto :goto_17

    .line 87
    :cond_25
    :try_start_c
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v12
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    goto :goto_13

    :catchall_c
    const/4 v12, 0x0

    .line 88
    :goto_13
    invoke-static {v12}, Lcom/mr/elaris/MessageRepeater;->cachedMsgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_26

    goto :goto_17

    .line 89
    :cond_26
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->cachedMsgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_27

    goto :goto_17

    .line 90
    :cond_27
    :try_start_d
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v12
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    goto :goto_14

    :catchall_d
    const/4 v12, 0x0

    :goto_14
    move v13, v1

    :goto_15
    if-eqz v12, :cond_2a

    add-int/lit8 v14, v13, 0x1

    if-ge v13, v7, :cond_2a

    .line 91
    invoke-static {v12}, Lcom/mr/elaris/MessageRepeater;->cachedMsgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_28

    :goto_16
    move-object v12, v13

    goto :goto_17

    .line 92
    :cond_28
    instance-of v13, v12, Landroid/view/View;

    if-eqz v13, :cond_2a

    .line 93
    :try_start_e
    move-object v13, v12

    check-cast v13, Landroid/view/View;

    invoke-virtual {v13}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lcom/mr/elaris/MessageRepeater;->cachedMsgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_29

    goto :goto_16

    .line 94
    :cond_29
    check-cast v12, Landroid/view/View;

    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v12
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    move v13, v14

    goto :goto_15

    :catchall_e
    :cond_2a
    const/4 v12, 0x0

    :goto_17
    if-eqz v12, :cond_32

    .line 95
    invoke-static {}, Ls6;->V()Ljava/util/Set;

    move-result-object v13

    invoke-static {v12, v1, v13}, Ls6;->w0(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    move-result-object v13

    .line 96
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v14

    if-nez v14, :cond_2b

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v14

    if-lt v14, v7, :cond_2b

    move-object v8, v13

    .line 97
    :cond_2b
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_2d

    .line 98
    const-string v16, "sendNickName"

    const-string v17, "sendMemberName"

    const-string v18, "senderName"

    const-string v19, "senderNick"

    const-string v20, "nick"

    const-string v21, "nickname"

    const-string v22, "memberName"

    const-string v23, "remark"

    filled-new-array/range {v16 .. v23}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v12, v7}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 99
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_2c

    move-object v10, v8

    goto :goto_18

    :cond_2c
    move-object v10, v7

    .line 100
    :cond_2d
    :goto_18
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_2e

    .line 101
    invoke-static {v12}, Ls6;->D(Ljava/lang/Object;)Lb7;

    move-result-object v6

    .line 102
    invoke-static {v6}, Ls6;->K(Lb7;)Z

    move-result v9

    .line 103
    invoke-static {v6}, Ls6;->E(Lb7;)Ljava/lang/String;

    move-result-object v6

    goto :goto_19

    :cond_2e
    if-nez v9, :cond_2f

    .line 104
    invoke-static {v12}, Ls6;->D(Ljava/lang/Object;)Lb7;

    move-result-object v7

    invoke-static {v7}, Ls6;->K(Lb7;)Z

    move-result v9

    .line 105
    :cond_2f
    :goto_19
    invoke-static {v12}, Ls6;->Q(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 106
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_30

    move-object v11, v7

    .line 107
    :cond_30
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v12, "group avatar msg cache hit msgId="

    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " targetUin="

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :cond_31
    :goto_1a
    move-object/from16 v17, v6

    move-object/from16 v20, v11

    goto :goto_1b

    .line 108
    :cond_32
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_31

    .line 109
    const-string v7, "group avatar msg cache miss msgId="

    invoke-virtual {v7, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_1a

    :goto_1b
    if-nez v9, :cond_36

    .line 110
    invoke-static {v2}, Ls6;->D(Ljava/lang/Object;)Lb7;

    move-result-object v6

    if-eqz v6, :cond_33

    goto :goto_1c

    .line 111
    :cond_33
    invoke-static {}, Ls6;->V()Ljava/util/Set;

    move-result-object v6

    invoke-static {v2, v1, v6}, Ls6;->n0(Ljava/lang/Object;ILjava/util/Set;)Lb7;

    move-result-object v6

    if-eqz v6, :cond_34

    goto :goto_1c

    :cond_34
    const v6, 0x1020002

    .line 112
    invoke-virtual {v2, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 113
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    invoke-static {v6, v1, v7}, Ls6;->x(Landroid/view/View;ILjava/util/HashSet;)Ljava/lang/String;

    move-result-object v6

    .line 114
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_35

    const/4 v6, 0x0

    goto :goto_1c

    .line 115
    :cond_35
    new-instance v7, Lb7;

    const/4 v9, 0x2

    invoke-direct {v7, v6, v9}, Lb7;-><init>(Ljava/lang/String;I)V

    move-object v6, v7

    .line 116
    :goto_1c
    invoke-static {v6}, Ls6;->K(Lb7;)Z

    move-result v9

    :cond_36
    move/from16 v21, v9

    .line 117
    invoke-static {v2, v8}, Ls6;->i0(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 118
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_39

    invoke-virtual {v6, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_39

    .line 119
    invoke-virtual {v8, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_37

    move-object v8, v6

    .line 120
    :cond_37
    invoke-static {v10, v8}, Ls6;->L(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_38

    move-object v5, v6

    :goto_1d
    move-object/from16 v18, v8

    goto :goto_1e

    :cond_38
    move-object/from16 v18, v8

    move-object v5, v10

    goto :goto_1e

    .line 121
    :cond_39
    invoke-virtual {v10, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_38

    goto :goto_1d

    .line 122
    :goto_1e
    new-instance v16, Lq6;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_3a

    move-object/from16 v19, v18

    goto :goto_1f

    :cond_3a
    move-object/from16 v19, v5

    :goto_1f
    invoke-direct/range {v16 .. v21}, Lq6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v4, v16

    .line 123
    invoke-static {v2}, Ls6;->q(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v5

    .line 124
    const-string v6, "group avatar long click triggered"

    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 125
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "group avatar target found groupUin="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v4, Lq6;->a:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " targetUin="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v4, Lq6;->b:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " nick="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v4, Lq6;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " currentUin="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 126
    iget-object v6, v4, Lq6;->a:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_3b

    iget-object v6, v4, Lq6;->b:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_3b

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_3f

    .line 127
    :cond_3b
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "group avatar target missing "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    iget-object v7, v4, Lq6;->a:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_3c

    const-string v7, "groupUin "

    goto :goto_20

    :cond_3c
    const-string v7, ""

    :goto_20
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    iget-object v7, v4, Lq6;->b:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_3d

    const-string v7, "targetUin "

    goto :goto_21

    :cond_3d
    const-string v7, ""

    :goto_21
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_3e

    const-string v5, "currentUin"

    goto :goto_22

    :cond_3e
    const-string v5, ""

    :goto_22
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 131
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 132
    :cond_3f
    iget-object v5, v4, Lq6;->a:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_45

    iget-object v5, v4, Lq6;->b:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_40

    goto :goto_26

    .line 133
    :cond_40
    iget-object v5, v4, Lq6;->a:Ljava/lang/String;

    invoke-static {v5}, Ls6;->P(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_41

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "group avatar long click ignored reason=group-id-is-user-uid groupUin="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v4, Lq6;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_28

    .line 135
    :cond_41
    iget-boolean v5, v4, Lq6;->e:Z

    if-nez v5, :cond_42

    .line 136
    const-string v0, "group avatar long click ignored reason=not-confirmed-group-aio"

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_28

    .line 137
    :cond_42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 138
    sget-object v7, Ls6;->h:Ljava/util/Map;

    monitor-enter v7

    .line 139
    :try_start_f
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    .line 140
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {v7, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v9, 0x1

    if-eqz v8, :cond_43

    .line 141
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    sub-long/2addr v5, v10

    const-wide/16 v10, 0x28a

    cmp-long v5, v5, v10

    if-gez v5, :cond_43

    move v1, v9

    goto :goto_23

    :catchall_f
    move-exception v0

    goto :goto_25

    :cond_43
    :goto_23
    monitor-exit v7
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    if-eqz v1, :cond_44

    :goto_24
    move v1, v9

    goto :goto_28

    .line 142
    :cond_44
    new-instance v1, Lo;

    invoke-direct {v1, v3, v2, v0, v4}, Lo;-><init>(Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Lq6;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 143
    const-string v0, "group avatar long click consumed"

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_24

    .line 144
    :goto_25
    :try_start_10
    monitor-exit v7
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    throw v0

    .line 145
    :cond_45
    :goto_26
    const-string v0, "group avatar long click ignored reason=missing-chat-target"

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_28

    .line 146
    :cond_46
    :goto_27
    const-string v0, "group avatar long click ignored reason=home-account-avatar"

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :cond_47
    :goto_28
    return v1
.end method
