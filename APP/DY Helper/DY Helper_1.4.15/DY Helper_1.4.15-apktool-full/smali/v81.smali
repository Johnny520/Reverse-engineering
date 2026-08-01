.class public abstract Lv81;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public static final α(Ld22;Lwh1;Lq8;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lr22;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lr22;

    .line 7
    .line 8
    iget v1, v0, Lr22;->λ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lr22;->λ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr22;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lpp;-><init>(Lop;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lr22;->κ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lr22;->λ:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Lr22;->ι:Lwh1;

    .line 35
    .line 36
    iget-object p1, v0, Lr22;->θ:Ld22;

    .line 37
    .line 38
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v7, p1

    .line 42
    move-object p1, p0

    .line 43
    move-object p0, v7

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    iput-object p0, v0, Lr22;->θ:Ld22;

    .line 56
    .line 57
    iput-object p1, v0, Lr22;->ι:Lwh1;

    .line 58
    .line 59
    iput v2, v0, Lr22;->λ:I

    .line 60
    .line 61
    invoke-virtual {p0, p1, v0}, Ld22;->δ(Lwh1;Lq8;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    sget-object v1, Lcq;->ε:Lcq;

    .line 66
    .line 67
    if-ne p2, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_2
    check-cast p2, Lvh1;

    .line 71
    .line 72
    iget-object v1, p2, Lvh1;->α:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    const/4 v4, 0x0

    .line 79
    move v5, v4

    .line 80
    :goto_3
    if-ge v5, v3, :cond_5

    .line 81
    .line 82
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Lai1;

    .line 87
    .line 88
    invoke-static {v6}, Lj81;->η(Lai1;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    iget-object p0, p2, Lvh1;->α:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method

.method public static final β(Luc0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Luc0;->α:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static γ(Landroid/content/Context;I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p1, p0

    .line 13
    const/high16 p0, 0x3f000000    # 0.5f

    .line 14
    .line 15
    add-float/2addr p1, p0

    .line 16
    float-to-int p0, p1

    .line 17
    return p0
.end method

.method public static final δ(Lxr1;Lis1;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxr1;->ε:Lb21;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    :cond_0
    return-object p0
.end method

.method public static final ε(Landroid/view/View;)Lgi1;
    .locals 2

    .line 1
    const v0, 0x7f090258

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lgi1;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lgi1;

    .line 13
    .line 14
    invoke-direct {v1}, Lgi1;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object v1
.end method

.method public static final ζ(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x21

    .line 22
    .line 23
    if-gt v3, v2, :cond_0

    .line 24
    .line 25
    const/16 v3, 0x7f

    .line 26
    .line 27
    if-ge v2, v3, :cond_0

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v3, "Unexpected char 0x"

    .line 35
    .line 36
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/16 v3, 0x10

    .line 40
    .line 41
    invoke-static {v3}, Ljx0;->λ(I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v4, 0x2

    .line 56
    if-ge v3, v4, :cond_1

    .line 57
    .line 58
    const-string v3, "0"

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v2, " at "

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, " in header name: "

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0

    .line 97
    :cond_2
    return-void

    .line 98
    :cond_3
    const-string p0, "name is empty"

    .line 99
    .line 100
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public static final η(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/16 v3, 0x9

    .line 16
    .line 17
    if-eq v2, v3, :cond_3

    .line 18
    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    if-gt v3, v2, :cond_0

    .line 22
    .line 23
    const/16 v3, 0x7f

    .line 24
    .line 25
    if-ge v2, v3, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "Unexpected char 0x"

    .line 31
    .line 32
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/16 v3, 0x10

    .line 36
    .line 37
    invoke-static {v3}, Ljx0;->λ(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x2

    .line 52
    if-ge v3, v4, :cond_1

    .line 53
    .line 54
    const-string v3, "0"

    .line 55
    .line 56
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v2, " at "

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, " in "

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, " value"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Lsd2;->κ(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_2

    .line 89
    .line 90
    const-string p0, ""

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const-string p1, ": "

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    return-void
.end method

.method public static θ()Ljava/util/Map;
    .locals 18

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lkz;->ε:Lkz;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const-string v0, "pet_elf_camp_person_rules_v2"

    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sget-object v2, Ljz;->ε:Ljz;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto/16 :goto_6

    .line 27
    .line 28
    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v3, v0}, Lj81;->Σ(II)Lxm0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v3, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    :cond_2
    :goto_0
    move-object v0, v4

    .line 52
    check-cast v0, Lwm0;

    .line 53
    .line 54
    iget-boolean v0, v0, Lwm0;->η:Z

    .line 55
    .line 56
    if-eqz v0, :cond_8

    .line 57
    .line 58
    move-object v0, v4

    .line 59
    check-cast v0, Lwm0;

    .line 60
    .line 61
    invoke-virtual {v0}, Lwm0;->nextInt()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const/4 v0, 0x0

    .line 70
    if-nez v5, :cond_3

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_3
    const-string v6, "conversation_short_id"

    .line 74
    .line 75
    const-wide/16 v7, 0x0

    .line 76
    .line 77
    invoke-virtual {v5, v6, v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v10

    .line 81
    cmp-long v6, v10, v7

    .line 82
    .line 83
    if-gtz v6, :cond_4

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    const-string v6, "seed_id"

    .line 87
    .line 88
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    if-lez v6, :cond_5

    .line 97
    .line 98
    move-object v15, v7

    .line 99
    goto :goto_1

    .line 100
    :cond_5
    move-object v15, v0

    .line 101
    :goto_1
    new-instance v9, Lsd;

    .line 102
    .line 103
    const-string v0, "harvest"

    .line 104
    .line 105
    invoke-static {v0, v5}, Lv81;->μ(Ljava/lang/String;Lorg/json/JSONObject;)Lip1;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    const-string v0, "plant"

    .line 110
    .line 111
    invoke-static {v0, v5}, Lv81;->μ(Ljava/lang/String;Lorg/json/JSONObject;)Lip1;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    const-string v0, "water"

    .line 116
    .line 117
    invoke-static {v0, v5}, Lv81;->μ(Ljava/lang/String;Lorg/json/JSONObject;)Lip1;

    .line 118
    .line 119
    .line 120
    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 121
    :try_start_1
    const-string v0, "seed_mode"

    .line 122
    .line 123
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v0}, Ltd;->valueOf(Ljava/lang/String;)Ltd;

    .line 131
    .line 132
    .line 133
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    goto :goto_2

    .line 135
    :catchall_0
    move-exception v0

    .line 136
    :try_start_2
    new-instance v6, Leo1;

    .line 137
    .line 138
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    move-object v0, v6

    .line 142
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    if-nez v6, :cond_6

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    if-eqz v15, :cond_7

    .line 150
    .line 151
    sget-object v0, Ltd;->η:Ltd;

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    sget-object v0, Ltd;->ε:Ltd;

    .line 155
    .line 156
    :goto_3
    move-object/from16 v16, v0

    .line 157
    .line 158
    check-cast v16, Ltd;

    .line 159
    .line 160
    invoke-static {v5}, Lv81;->ν(Lorg/json/JSONObject;)Ljava/util/SortedSet;

    .line 161
    .line 162
    .line 163
    move-result-object v17

    .line 164
    invoke-direct/range {v9 .. v17}, Lsd;-><init>(JLip1;Lip1;Lip1;Ljava/lang/Integer;Ltd;Ljava/util/Set;)V

    .line 165
    .line 166
    .line 167
    move-object v0, v9

    .line 168
    :goto_4
    if-eqz v0, :cond_2

    .line 169
    .line 170
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :catchall_1
    move-exception v0

    .line 175
    new-instance v3, Leo1;

    .line 176
    .line 177
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    :cond_8
    instance-of v0, v3, Leo1;

    .line 181
    .line 182
    if-eqz v0, :cond_9

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_9
    move-object v2, v3

    .line 186
    :goto_5
    check-cast v2, Ljava/util/List;

    .line 187
    .line 188
    :goto_6
    const/16 v0, 0xa

    .line 189
    .line 190
    invoke-static {v2, v0}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    invoke-static {v0}, Lex0;->Κ(I)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    const/16 v1, 0x10

    .line 199
    .line 200
    if-ge v0, v1, :cond_a

    .line 201
    .line 202
    move v0, v1

    .line 203
    :cond_a
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 204
    .line 205
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_b

    .line 217
    .line 218
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    move-object v3, v2

    .line 223
    check-cast v3, Lsd;

    .line 224
    .line 225
    iget-wide v3, v3, Lsd;->α:J

    .line 226
    .line 227
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_b
    return-object v1
.end method

.method public static ι()Lqd;
    .locals 9

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Lqd;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    invoke-direct/range {v1 .. v7}, Lqd;-><init>(ZZZLtd;Ljava/lang/Integer;I)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    const-string v0, "pet_elf_camp_auto_harvest"

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const-string v0, "pet_elf_camp_auto_plant"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const-string v0, "pet_elf_camp_auto_water"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const-string v0, "pet_elf_camp_global_plant_seed_mode"

    .line 39
    .line 40
    const-string v2, ""

    .line 41
    .line 42
    invoke-static {v0, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :try_start_0
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Ltd;->valueOf(Ljava/lang/String;)Ltd;

    .line 55
    .line 56
    .line 57
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    new-instance v2, Leo1;

    .line 61
    .line 62
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v2

    .line 66
    :goto_0
    instance-of v2, v0, Leo1;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    move-object v0, v6

    .line 72
    :cond_1
    check-cast v0, Ltd;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    sget-object v2, Ltd;->ζ:Ltd;

    .line 77
    .line 78
    if-eq v0, v2, :cond_3

    .line 79
    .line 80
    sget-object v2, Ltd;->η:Ltd;

    .line 81
    .line 82
    if-ne v0, v2, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move-object v0, v6

    .line 86
    :cond_3
    :goto_1
    const-string v2, "pet_elf_camp_global_plant_seed_id"

    .line 87
    .line 88
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-interface {v7, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 93
    .line 94
    .line 95
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    goto :goto_2

    .line 97
    :catchall_1
    move v2, v1

    .line 98
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    if-lez v2, :cond_4

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    move-object v7, v6

    .line 106
    :goto_3
    const-string v2, "pet_elf_camp_smart_seed_max_price"

    .line 107
    .line 108
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-interface {v6, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 116
    goto :goto_4

    .line 117
    :catchall_2
    move v2, v1

    .line 118
    :goto_4
    const v6, 0xf4240

    .line 119
    .line 120
    .line 121
    invoke-static {v2, v1, v6}, Lj81;->μ(III)I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    new-instance v2, Lqd;

    .line 126
    .line 127
    move-object v6, v0

    .line 128
    invoke-direct/range {v2 .. v8}, Lqd;-><init>(ZZZLtd;Ljava/lang/Integer;I)V

    .line 129
    .line 130
    .line 131
    return-object v2
.end method

.method public static κ(Ldp1;IIIIILrx0;Ljava/util/List;[Lch1;I)Lqx0;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    move/from16 v5, p9

    .line 12
    .line 13
    int-to-long v6, v3

    .line 14
    new-array v8, v5, [I

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v15, 0x0

    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    :goto_0
    const/16 v17, 0x0

    .line 25
    .line 26
    if-ge v11, v5, :cond_7

    .line 27
    .line 28
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v18

    .line 32
    move-object/from16 v9, v18

    .line 33
    .line 34
    check-cast v9, Lkx0;

    .line 35
    .line 36
    move-wide/from16 v19, v6

    .line 37
    .line 38
    invoke-interface {v9}, Lkx0;->λ()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    instance-of v7, v6, Lep1;

    .line 43
    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    move-object/from16 v17, v6

    .line 47
    .line 48
    check-cast v17, Lep1;

    .line 49
    .line 50
    :cond_0
    move-object/from16 v6, v17

    .line 51
    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    iget v6, v6, Lep1;->α:F

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move/from16 v6, v16

    .line 58
    .line 59
    :goto_1
    cmpl-float v7, v6, v16

    .line 60
    .line 61
    if-lez v7, :cond_2

    .line 62
    .line 63
    add-float/2addr v15, v6

    .line 64
    add-int/lit8 v12, v12, 0x1

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_2
    sub-int v6, v1, v13

    .line 68
    .line 69
    aget-object v7, p8, v11

    .line 70
    .line 71
    if-nez v7, :cond_5

    .line 72
    .line 73
    const v14, 0x7fffffff

    .line 74
    .line 75
    .line 76
    if-ne v1, v14, :cond_3

    .line 77
    .line 78
    move/from16 v17, v6

    .line 79
    .line 80
    const v7, 0x7fffffff

    .line 81
    .line 82
    .line 83
    :goto_2
    const/4 v14, 0x0

    .line 84
    goto :goto_3

    .line 85
    :cond_3
    if-gez v6, :cond_4

    .line 86
    .line 87
    move/from16 v17, v6

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move v7, v6

    .line 92
    move/from16 v17, v7

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :goto_3
    invoke-interface {v0, v14, v7, v2, v14}, Ldp1;->γ(IIIZ)J

    .line 96
    .line 97
    .line 98
    move-result-wide v6

    .line 99
    invoke-interface {v9, v6, v7}, Lkx0;->ζ(J)Lch1;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    goto :goto_4

    .line 104
    :cond_5
    move/from16 v17, v6

    .line 105
    .line 106
    :goto_4
    invoke-interface {v0, v7}, Ldp1;->ζ(Lch1;)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-interface {v0, v7}, Ldp1;->δ(Lch1;)I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    aput v6, v8, v11

    .line 115
    .line 116
    sub-int v14, v17, v6

    .line 117
    .line 118
    if-gez v14, :cond_6

    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    :cond_6
    invoke-static {v3, v14}, Ljava/lang/Math;->min(II)I

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    add-int/2addr v6, v14

    .line 126
    add-int/2addr v13, v6

    .line 127
    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    aput-object v7, p8, v11

    .line 132
    .line 133
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 134
    .line 135
    move-wide/from16 v6, v19

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_7
    move-wide/from16 v19, v6

    .line 139
    .line 140
    if-nez v12, :cond_8

    .line 141
    .line 142
    sub-int/2addr v13, v14

    .line 143
    const/4 v14, 0x0

    .line 144
    goto/16 :goto_13

    .line 145
    .line 146
    :cond_8
    const v14, 0x7fffffff

    .line 147
    .line 148
    .line 149
    if-eq v1, v14, :cond_9

    .line 150
    .line 151
    move v3, v1

    .line 152
    goto :goto_6

    .line 153
    :cond_9
    move/from16 v3, p1

    .line 154
    .line 155
    :goto_6
    const/4 v6, 0x1

    .line 156
    sub-int/2addr v12, v6

    .line 157
    int-to-long v11, v12

    .line 158
    mul-long v11, v11, v19

    .line 159
    .line 160
    sub-int/2addr v3, v13

    .line 161
    int-to-long v6, v3

    .line 162
    sub-long/2addr v6, v11

    .line 163
    const-wide/16 v19, 0x0

    .line 164
    .line 165
    cmp-long v3, v6, v19

    .line 166
    .line 167
    if-gez v3, :cond_a

    .line 168
    .line 169
    move-wide/from16 v6, v19

    .line 170
    .line 171
    :cond_a
    long-to-float v3, v6

    .line 172
    div-float/2addr v3, v15

    .line 173
    const/4 v9, 0x0

    .line 174
    :goto_7
    if-ge v9, v5, :cond_d

    .line 175
    .line 176
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    check-cast v14, Lkx0;

    .line 181
    .line 182
    invoke-interface {v14}, Lkx0;->λ()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    instance-of v15, v14, Lep1;

    .line 187
    .line 188
    if-eqz v15, :cond_b

    .line 189
    .line 190
    check-cast v14, Lep1;

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_b
    move-object/from16 v14, v17

    .line 194
    .line 195
    :goto_8
    if-eqz v14, :cond_c

    .line 196
    .line 197
    iget v14, v14, Lep1;->α:F

    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_c
    move/from16 v14, v16

    .line 201
    .line 202
    :goto_9
    mul-float/2addr v14, v3

    .line 203
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 204
    .line 205
    .line 206
    move-result v14

    .line 207
    int-to-long v14, v14

    .line 208
    sub-long/2addr v6, v14

    .line 209
    add-int/lit8 v9, v9, 0x1

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_d
    const/4 v9, 0x0

    .line 213
    const/4 v14, 0x0

    .line 214
    :goto_a
    if-ge v14, v5, :cond_15

    .line 215
    .line 216
    aget-object v15, p8, v14

    .line 217
    .line 218
    if-nez v15, :cond_14

    .line 219
    .line 220
    invoke-interface {v4, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v15

    .line 224
    check-cast v15, Lkx0;

    .line 225
    .line 226
    invoke-interface {v15}, Lkx0;->λ()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    move/from16 v18, v3

    .line 231
    .line 232
    instance-of v3, v1, Lep1;

    .line 233
    .line 234
    if-eqz v3, :cond_e

    .line 235
    .line 236
    check-cast v1, Lep1;

    .line 237
    .line 238
    goto :goto_b

    .line 239
    :cond_e
    move-object/from16 v1, v17

    .line 240
    .line 241
    :goto_b
    if-eqz v1, :cond_f

    .line 242
    .line 243
    iget v3, v1, Lep1;->α:F

    .line 244
    .line 245
    goto :goto_c

    .line 246
    :cond_f
    move/from16 v3, v16

    .line 247
    .line 248
    :goto_c
    cmpl-float v19, v3, v16

    .line 249
    .line 250
    if-lez v19, :cond_10

    .line 251
    .line 252
    :goto_d
    move/from16 v19, v3

    .line 253
    .line 254
    goto :goto_e

    .line 255
    :cond_10
    const-string v19, "All weights <= 0 should have placeables"

    .line 256
    .line 257
    invoke-static/range {v19 .. v19}, Lyl0;->β(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    goto :goto_d

    .line 261
    :goto_e
    invoke-static {v6, v7}, Ljava/lang/Long;->signum(J)I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    move-wide/from16 v20, v6

    .line 266
    .line 267
    int-to-long v6, v3

    .line 268
    sub-long v6, v20, v6

    .line 269
    .line 270
    mul-float v19, v19, v18

    .line 271
    .line 272
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->round(F)I

    .line 273
    .line 274
    .line 275
    move-result v19

    .line 276
    add-int v3, v19, v3

    .line 277
    .line 278
    const/4 v4, 0x0

    .line 279
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-eqz v1, :cond_11

    .line 284
    .line 285
    iget-boolean v1, v1, Lep1;->β:Z

    .line 286
    .line 287
    goto :goto_f

    .line 288
    :cond_11
    const/4 v1, 0x1

    .line 289
    :goto_f
    if-eqz v1, :cond_12

    .line 290
    .line 291
    const v1, 0x7fffffff

    .line 292
    .line 293
    .line 294
    if-eq v3, v1, :cond_13

    .line 295
    .line 296
    move v4, v3

    .line 297
    :goto_10
    const/4 v1, 0x1

    .line 298
    goto :goto_11

    .line 299
    :cond_12
    const v1, 0x7fffffff

    .line 300
    .line 301
    .line 302
    :cond_13
    const/4 v4, 0x0

    .line 303
    goto :goto_10

    .line 304
    :goto_11
    invoke-interface {v0, v4, v3, v2, v1}, Ldp1;->γ(IIIZ)J

    .line 305
    .line 306
    .line 307
    move-result-wide v3

    .line 308
    invoke-interface {v15, v3, v4}, Lkx0;->ζ(J)Lch1;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    invoke-interface {v0, v3}, Ldp1;->ζ(Lch1;)I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    invoke-interface {v0, v3}, Ldp1;->δ(Lch1;)I

    .line 317
    .line 318
    .line 319
    move-result v15

    .line 320
    aput v4, v8, v14

    .line 321
    .line 322
    add-int/2addr v9, v4

    .line 323
    invoke-static {v10, v15}, Ljava/lang/Math;->max(II)I

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    aput-object v3, p8, v14

    .line 328
    .line 329
    move v10, v4

    .line 330
    goto :goto_12

    .line 331
    :cond_14
    move/from16 v18, v3

    .line 332
    .line 333
    move-wide/from16 v20, v6

    .line 334
    .line 335
    const/4 v1, 0x1

    .line 336
    :goto_12
    add-int/lit8 v14, v14, 0x1

    .line 337
    .line 338
    move/from16 v1, p3

    .line 339
    .line 340
    move-object/from16 v4, p7

    .line 341
    .line 342
    move/from16 v3, v18

    .line 343
    .line 344
    goto/16 :goto_a

    .line 345
    .line 346
    :cond_15
    int-to-long v1, v9

    .line 347
    add-long/2addr v1, v11

    .line 348
    long-to-int v14, v1

    .line 349
    sub-int v1, p3, v13

    .line 350
    .line 351
    if-gez v14, :cond_16

    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    :cond_16
    if-le v14, v1, :cond_17

    .line 355
    .line 356
    move v14, v1

    .line 357
    :cond_17
    :goto_13
    add-int/2addr v14, v13

    .line 358
    if-gez v14, :cond_18

    .line 359
    .line 360
    const/4 v14, 0x0

    .line 361
    :cond_18
    move/from16 v1, p1

    .line 362
    .line 363
    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    move/from16 v1, p2

    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    invoke-static {v1, v14}, Ljava/lang/Math;->max(II)I

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    new-array v3, v5, [I

    .line 379
    .line 380
    move-object/from16 v2, p6

    .line 381
    .line 382
    invoke-interface {v0, v4, v2, v8, v3}, Ldp1;->β(ILrx0;[I[I)V

    .line 383
    .line 384
    .line 385
    move v5, v1

    .line 386
    move-object/from16 v1, p8

    .line 387
    .line 388
    invoke-interface/range {v0 .. v5}, Ldp1;->α([Lch1;Lrx0;[III)Lqx0;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    return-object v0
.end method

.method public static λ(Ljava/util/ArrayList;Leu1;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ln71;

    .line 27
    .line 28
    new-instance v2, Lmv1;

    .line 29
    .line 30
    sget-object v3, Lw71;->α:Ljava/util/List;

    .line 31
    .line 32
    iget-object v3, v1, Ln71;->α:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v3}, Lw71;->β(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v4, v1, Ln71;->γ:Ljava/lang/String;

    .line 39
    .line 40
    iget v5, v1, Ln71;->ε:I

    .line 41
    .line 42
    iget-object v6, v1, Ln71;->ζ:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v8, Lz61;

    .line 45
    .line 46
    const/4 v7, 0x7

    .line 47
    invoke-direct {v8, p1, v7, v1}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    invoke-direct/range {v2 .. v8}, Lmv1;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLp70;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-object v0
.end method

.method public static μ(Ljava/lang/String;Lorg/json/JSONObject;)Lip1;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lip1;->valueOf(Ljava/lang/String;)Lip1;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance p1, Leo1;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, p1

    .line 20
    :goto_0
    instance-of p1, p0, Leo1;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    sget-object p0, Lip1;->ε:Lip1;

    .line 25
    .line 26
    :cond_0
    check-cast p0, Lip1;

    .line 27
    .line 28
    return-object p0
.end method

.method public static ν(Lorg/json/JSONObject;)Ljava/util/SortedSet;
    .locals 4

    .line 1
    const-string v0, "excluded_seed_ids"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v0, v1}, Lj81;->Σ(II)Lxm0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    :goto_0
    move-object v2, v0

    .line 28
    check-cast v2, Lwm0;

    .line 29
    .line 30
    iget-boolean v3, v2, Lwm0;->η:Z

    .line 31
    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    invoke-virtual {v2}, Lwm0;->nextInt()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optInt(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-lez v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 v3, 0x0

    .line 50
    :goto_1
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    sget-object v1, Ljz;->ε:Ljz;

    .line 57
    .line 58
    :cond_3
    new-instance p0, Ljava/util/TreeSet;

    .line 59
    .line 60
    invoke-direct {p0}, Ljava/util/TreeSet;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, p0}, Lxh;->ｃ(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 64
    .line 65
    .line 66
    return-object p0
.end method

.method public static ξ(Landroid/content/Context;Ljava/util/ArrayList;Lp70;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 27
    .line 28
    and-int/lit8 v0, v0, 0x30

    .line 29
    .line 30
    const/16 v5, 0x20

    .line 31
    .line 32
    if-ne v0, v5, :cond_0

    .line 33
    .line 34
    move v0, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v0, v3

    .line 37
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    new-instance v5, Leo1;

    .line 44
    .line 45
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    move-object v0, v5

    .line 49
    :goto_1
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 50
    .line 51
    instance-of v6, v0, Leo1;

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    move-object v0, v5

    .line 56
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    new-instance v5, Lnv1;

    .line 65
    .line 66
    const v14, 0x18ffffff

    .line 67
    .line 68
    .line 69
    const v15, 0x20ffffff

    .line 70
    .line 71
    .line 72
    const v6, -0xe8e8e4

    .line 73
    .line 74
    .line 75
    const v7, -0xdad9cf

    .line 76
    .line 77
    .line 78
    const v8, 0x24ffffff

    .line 79
    .line 80
    .line 81
    const/4 v9, -0x1

    .line 82
    const v10, -0x4c000001

    .line 83
    .line 84
    .line 85
    const v11, -0x59000001

    .line 86
    .line 87
    .line 88
    const v12, 0x22ffffff

    .line 89
    .line 90
    .line 91
    const/4 v13, -0x1

    .line 92
    invoke-direct/range {v5 .. v15}, Lnv1;-><init>(IIIIIIIIII)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    new-instance v6, Lnv1;

    .line 97
    .line 98
    const v15, -0xd0c0b

    .line 99
    .line 100
    .line 101
    const/high16 v16, 0x12000000

    .line 102
    .line 103
    const/4 v7, -0x1

    .line 104
    const v8, -0x80706

    .line 105
    .line 106
    .line 107
    const/high16 v9, 0x14000000

    .line 108
    .line 109
    const v10, -0xe9e7dd

    .line 110
    .line 111
    .line 112
    const v11, -0x948d80

    .line 113
    .line 114
    .line 115
    const v12, -0x757572

    .line 116
    .line 117
    .line 118
    const/high16 v13, 0xf000000

    .line 119
    .line 120
    const v14, -0xe9e7dd

    .line 121
    .line 122
    .line 123
    invoke-direct/range {v6 .. v16}, Lnv1;-><init>(IIIIIIIIII)V

    .line 124
    .line 125
    .line 126
    move-object v5, v6

    .line 127
    :goto_2
    new-instance v6, Landroid/widget/LinearLayout;

    .line 128
    .line 129
    invoke-direct {v6, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    move-object/from16 v7, p3

    .line 133
    .line 134
    invoke-virtual {v6, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 138
    .line 139
    .line 140
    const/16 v7, 0xe

    .line 141
    .line 142
    invoke-static {v1, v7}, Lv81;->γ(Landroid/content/Context;I)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    const/16 v8, 0xa

    .line 147
    .line 148
    invoke-static {v1, v8}, Lv81;->γ(Landroid/content/Context;I)I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    invoke-static {v1, v7}, Lv81;->γ(Landroid/content/Context;I)I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    const/16 v11, 0xc

    .line 157
    .line 158
    invoke-static {v1, v11}, Lv81;->γ(Landroid/content/Context;I)I

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    invoke-virtual {v6, v0, v9, v10, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 163
    .line 164
    .line 165
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 166
    .line 167
    sget-object v9, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 168
    .line 169
    iget v10, v5, Lnv1;->α:I

    .line 170
    .line 171
    iget v12, v5, Lnv1;->β:I

    .line 172
    .line 173
    filled-new-array {v10, v12}, [I

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-direct {v0, v9, v10}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 178
    .line 179
    .line 180
    const/16 v9, 0x12

    .line 181
    .line 182
    invoke-static {v1, v9}, Lv81;->γ(Landroid/content/Context;I)I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    int-to-float v9, v9

    .line 187
    invoke-virtual {v0, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v4}, Lv81;->γ(Landroid/content/Context;I)I

    .line 191
    .line 192
    .line 193
    move-result v9

    .line 194
    iget v10, v5, Lnv1;->γ:I

    .line 195
    .line 196
    invoke-virtual {v0, v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 200
    .line 201
    .line 202
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 203
    .line 204
    const/4 v9, -0x1

    .line 205
    const/4 v10, -0x2

    .line 206
    invoke-direct {v0, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 207
    .line 208
    .line 209
    invoke-static {v1, v11}, Lv81;->γ(Landroid/content/Context;I)I

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    const/4 v13, 0x6

    .line 214
    invoke-static {v1, v13}, Lv81;->γ(Landroid/content/Context;I)I

    .line 215
    .line 216
    .line 217
    move-result v14

    .line 218
    invoke-static {v1, v11}, Lv81;->γ(Landroid/content/Context;I)I

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    move/from16 p3, v9

    .line 223
    .line 224
    const/16 v9, 0x8

    .line 225
    .line 226
    invoke-static {v1, v9}, Lv81;->γ(Landroid/content/Context;I)I

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    invoke-virtual {v0, v12, v14, v15, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v4}, Landroid/view/View;->setClickable(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x40c00000    # 6.0f

    .line 243
    .line 244
    mul-float/2addr v2, v0

    .line 245
    invoke-virtual {v6, v2}, Landroid/view/View;->setElevation(F)V

    .line 246
    .line 247
    .line 248
    new-instance v0, Lb9;

    .line 249
    .line 250
    const/4 v2, 0x7

    .line 251
    move-object/from16 v12, p2

    .line 252
    .line 253
    invoke-direct {v0, v2, v12}, Lb9;-><init>(ILp70;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 257
    .line 258
    .line 259
    new-instance v0, Landroid/widget/LinearLayout;

    .line 260
    .line 261
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 265
    .line 266
    .line 267
    const/16 v2, 0x10

    .line 268
    .line 269
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 270
    .line 271
    .line 272
    new-instance v12, Landroid/widget/LinearLayout;

    .line 273
    .line 274
    invoke-direct {v12, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 278
    .line 279
    .line 280
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 281
    .line 282
    const/high16 v14, 0x3f800000    # 1.0f

    .line 283
    .line 284
    invoke-direct {v13, v3, v10, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 288
    .line 289
    .line 290
    new-instance v13, Landroid/widget/TextView;

    .line 291
    .line 292
    invoke-direct {v13, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 293
    .line 294
    .line 295
    const-string v15, "DY Helper"

    .line 296
    .line 297
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    .line 299
    .line 300
    const/high16 v15, 0x41700000    # 15.0f

    .line 301
    .line 302
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 306
    .line 307
    .line 308
    const/4 v15, 0x0

    .line 309
    invoke-virtual {v13, v15, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 310
    .line 311
    .line 312
    iget v10, v5, Lnv1;->δ:I

    .line 313
    .line 314
    invoke-virtual {v13, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 318
    .line 319
    .line 320
    new-instance v13, Landroid/widget/TextView;

    .line 321
    .line 322
    invoke-direct {v13, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 323
    .line 324
    .line 325
    const-string v14, "\u5feb\u6377\u64cd\u4f5c\uff0c\u4e5f\u53ef\u6253\u5f00\u5b8c\u6574\u64cd\u4f5c\u83dc\u5355"

    .line 326
    .line 327
    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    const/high16 v14, 0x41300000    # 11.0f

    .line 331
    .line 332
    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 336
    .line 337
    .line 338
    iget v7, v5, Lnv1;->ε:I

    .line 339
    .line 340
    invoke-virtual {v13, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 341
    .line 342
    .line 343
    const/4 v7, 0x3

    .line 344
    invoke-static {v1, v7}, Lv81;->γ(Landroid/content/Context;I)I

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    invoke-virtual {v13, v3, v7, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 355
    .line 356
    .line 357
    new-instance v7, Landroid/widget/TextView;

    .line 358
    .line 359
    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 360
    .line 361
    .line 362
    const-string v12, "\u66f4\u591a"

    .line 363
    .line 364
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v7, v15, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 374
    .line 375
    .line 376
    const/16 v12, 0x11

    .line 377
    .line 378
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 379
    .line 380
    .line 381
    iget v12, v5, Lnv1;->θ:I

    .line 382
    .line 383
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 384
    .line 385
    .line 386
    const/16 v12, 0x9

    .line 387
    .line 388
    invoke-static {v1, v12}, Lv81;->γ(Landroid/content/Context;I)I

    .line 389
    .line 390
    .line 391
    move-result v13

    .line 392
    const/4 v14, 0x5

    .line 393
    invoke-static {v1, v14}, Lv81;->γ(Landroid/content/Context;I)I

    .line 394
    .line 395
    .line 396
    move-result v15

    .line 397
    invoke-static {v1, v12}, Lv81;->γ(Landroid/content/Context;I)I

    .line 398
    .line 399
    .line 400
    move-result v12

    .line 401
    invoke-static {v1, v14}, Lv81;->γ(Landroid/content/Context;I)I

    .line 402
    .line 403
    .line 404
    move-result v14

    .line 405
    invoke-virtual {v7, v13, v15, v12, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 406
    .line 407
    .line 408
    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    .line 409
    .line 410
    invoke-direct {v12}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 411
    .line 412
    .line 413
    iget v13, v5, Lnv1;->η:I

    .line 414
    .line 415
    invoke-virtual {v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 416
    .line 417
    .line 418
    invoke-static {v1, v11}, Lv81;->γ(Landroid/content/Context;I)I

    .line 419
    .line 420
    .line 421
    move-result v11

    .line 422
    int-to-float v11, v11

    .line 423
    invoke-virtual {v12, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v7, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-nez v0, :cond_d

    .line 440
    .line 441
    new-instance v7, Landroid/widget/LinearLayout;

    .line 442
    .line 443
    invoke-direct {v7, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v7, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 447
    .line 448
    .line 449
    invoke-static {v1, v8}, Lv81;->γ(Landroid/content/Context;I)I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    invoke-virtual {v7, v3, v0, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 454
    .line 455
    .line 456
    const/4 v11, 0x2

    .line 457
    move-object/from16 v12, p1

    .line 458
    .line 459
    invoke-static {v11, v12}, Lxh;->А(ILjava/util/List;)Ljava/util/ArrayList;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 464
    .line 465
    .line 466
    move-result-object v12

    .line 467
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    if-eqz v0, :cond_c

    .line 472
    .line 473
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    move-object v13, v0

    .line 478
    check-cast v13, Ljava/util/List;

    .line 479
    .line 480
    new-instance v14, Landroid/widget/LinearLayout;

    .line 481
    .line 482
    invoke-direct {v14, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v14, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v14, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v15

    .line 495
    move/from16 v18, v3

    .line 496
    .line 497
    :goto_4
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-eqz v0, :cond_a

    .line 502
    .line 503
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    add-int/lit8 v19, v18, 0x1

    .line 508
    .line 509
    if-ltz v18, :cond_9

    .line 510
    .line 511
    move-object v11, v0

    .line 512
    check-cast v11, Lmv1;

    .line 513
    .line 514
    iget-boolean v4, v11, Lmv1;->ε:Z

    .line 515
    .line 516
    iget-object v9, v11, Lmv1;->β:Ljava/lang/String;

    .line 517
    .line 518
    iget-object v8, v11, Lmv1;->α:Ljava/lang/String;

    .line 519
    .line 520
    iget v2, v5, Lnv1;->ζ:I

    .line 521
    .line 522
    if-nez v4, :cond_3

    .line 523
    .line 524
    move v0, v2

    .line 525
    goto :goto_6

    .line 526
    :cond_3
    :try_start_1
    iget-object v0, v11, Lmv1;->δ:Ljava/lang/String;

    .line 527
    .line 528
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 536
    goto :goto_5

    .line 537
    :catchall_1
    move-exception v0

    .line 538
    new-instance v3, Leo1;

    .line 539
    .line 540
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 541
    .line 542
    .line 543
    move-object v0, v3

    .line 544
    :goto_5
    const v3, -0x1d3ab

    .line 545
    .line 546
    .line 547
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    move-object/from16 v21, v3

    .line 552
    .line 553
    instance-of v3, v0, Leo1;

    .line 554
    .line 555
    if-eqz v3, :cond_4

    .line 556
    .line 557
    move-object/from16 v0, v21

    .line 558
    .line 559
    :cond_4
    check-cast v0, Ljava/lang/Number;

    .line 560
    .line 561
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    :goto_6
    new-instance v3, Landroid/widget/LinearLayout;

    .line 566
    .line 567
    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 568
    .line 569
    .line 570
    move-object/from16 v21, v12

    .line 571
    .line 572
    const/4 v12, 0x0

    .line 573
    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 574
    .line 575
    .line 576
    const/16 v12, 0x10

    .line 577
    .line 578
    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 579
    .line 580
    .line 581
    move-object/from16 v20, v13

    .line 582
    .line 583
    const/16 v12, 0xa

    .line 584
    .line 585
    invoke-static {v1, v12}, Lv81;->γ(Landroid/content/Context;I)I

    .line 586
    .line 587
    .line 588
    move-result v13

    .line 589
    move-object/from16 v23, v6

    .line 590
    .line 591
    move-object/from16 v22, v15

    .line 592
    .line 593
    const/16 v15, 0x8

    .line 594
    .line 595
    invoke-static {v1, v15}, Lv81;->γ(Landroid/content/Context;I)I

    .line 596
    .line 597
    .line 598
    move-result v6

    .line 599
    move-object/from16 v24, v7

    .line 600
    .line 601
    invoke-static {v1, v12}, Lv81;->γ(Landroid/content/Context;I)I

    .line 602
    .line 603
    .line 604
    move-result v7

    .line 605
    invoke-static {v1, v15}, Lv81;->γ(Landroid/content/Context;I)I

    .line 606
    .line 607
    .line 608
    move-result v12

    .line 609
    invoke-virtual {v3, v13, v6, v7, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 610
    .line 611
    .line 612
    iget v6, v5, Lnv1;->κ:I

    .line 613
    .line 614
    iget v7, v5, Lnv1;->ι:I

    .line 615
    .line 616
    if-eqz v4, :cond_5

    .line 617
    .line 618
    const v12, 0x18ffffff

    .line 619
    .line 620
    .line 621
    invoke-static {v12}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 622
    .line 623
    .line 624
    move-result-object v12

    .line 625
    invoke-static {v7}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    const/16 v13, 0xe

    .line 630
    .line 631
    invoke-static {v1, v13}, Lv81;->γ(Landroid/content/Context;I)I

    .line 632
    .line 633
    .line 634
    move-result v15

    .line 635
    int-to-float v15, v15

    .line 636
    invoke-virtual {v7, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 637
    .line 638
    .line 639
    const/4 v15, 0x1

    .line 640
    invoke-static {v1, v15}, Lv81;->γ(Landroid/content/Context;I)I

    .line 641
    .line 642
    .line 643
    move-result v13

    .line 644
    invoke-virtual {v7, v13, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 645
    .line 646
    .line 647
    new-instance v6, Landroid/graphics/drawable/RippleDrawable;

    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    invoke-direct {v6, v12, v7, v13}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 651
    .line 652
    .line 653
    const/16 v13, 0xe

    .line 654
    .line 655
    goto :goto_7

    .line 656
    :cond_5
    const/4 v15, 0x1

    .line 657
    invoke-static {v7}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 658
    .line 659
    .line 660
    move-result-object v7

    .line 661
    const/16 v13, 0xe

    .line 662
    .line 663
    invoke-static {v1, v13}, Lv81;->γ(Landroid/content/Context;I)I

    .line 664
    .line 665
    .line 666
    move-result v12

    .line 667
    int-to-float v12, v12

    .line 668
    invoke-virtual {v7, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 669
    .line 670
    .line 671
    invoke-static {v1, v15}, Lv81;->γ(Landroid/content/Context;I)I

    .line 672
    .line 673
    .line 674
    move-result v12

    .line 675
    invoke-virtual {v7, v12, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 676
    .line 677
    .line 678
    move-object v6, v7

    .line 679
    :goto_7
    invoke-virtual {v3, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 680
    .line 681
    .line 682
    if-eqz v4, :cond_6

    .line 683
    .line 684
    const/high16 v6, 0x3f800000    # 1.0f

    .line 685
    .line 686
    goto :goto_8

    .line 687
    :cond_6
    const v6, 0x3f051eb8    # 0.52f

    .line 688
    .line 689
    .line 690
    :goto_8
    invoke-virtual {v3, v6}, Landroid/view/View;->setAlpha(F)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v3, v15}, Landroid/view/View;->setClickable(Z)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v3, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 697
    .line 698
    .line 699
    if-eqz v4, :cond_7

    .line 700
    .line 701
    move-object v4, v8

    .line 702
    goto :goto_9

    .line 703
    :cond_7
    const-string v4, "\uff0c"

    .line 704
    .line 705
    invoke-static {v8, v4, v9}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v4

    .line 709
    :goto_9
    invoke-virtual {v3, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 710
    .line 711
    .line 712
    new-instance v4, Lhi;

    .line 713
    .line 714
    const/4 v6, 0x7

    .line 715
    invoke-direct {v4, v6, v11}, Lhi;-><init>(ILjava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 719
    .line 720
    .line 721
    new-instance v4, Landroid/widget/ImageView;

    .line 722
    .line 723
    invoke-direct {v4, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 724
    .line 725
    .line 726
    sget-object v6, Lx01;->α:Lx01;

    .line 727
    .line 728
    iget v7, v11, Lmv1;->γ:I

    .line 729
    .line 730
    invoke-virtual {v6, v1, v7}, Lx01;->β(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 731
    .line 732
    .line 733
    move-result-object v6

    .line 734
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 735
    .line 736
    .line 737
    invoke-static/range {p3 .. p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 742
    .line 743
    .line 744
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 745
    .line 746
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 747
    .line 748
    .line 749
    const/4 v15, 0x1

    .line 750
    invoke-virtual {v6, v15}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v6, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 757
    .line 758
    .line 759
    const/4 v0, 0x7

    .line 760
    invoke-static {v1, v0}, Lv81;->γ(Landroid/content/Context;I)I

    .line 761
    .line 762
    .line 763
    move-result v6

    .line 764
    invoke-static {v1, v0}, Lv81;->γ(Landroid/content/Context;I)I

    .line 765
    .line 766
    .line 767
    move-result v7

    .line 768
    invoke-static {v1, v0}, Lv81;->γ(Landroid/content/Context;I)I

    .line 769
    .line 770
    .line 771
    move-result v11

    .line 772
    invoke-static {v1, v0}, Lv81;->γ(Landroid/content/Context;I)I

    .line 773
    .line 774
    .line 775
    move-result v0

    .line 776
    invoke-virtual {v4, v6, v7, v11, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 777
    .line 778
    .line 779
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 780
    .line 781
    const/16 v6, 0x1e

    .line 782
    .line 783
    invoke-static {v1, v6}, Lv81;->γ(Landroid/content/Context;I)I

    .line 784
    .line 785
    .line 786
    move-result v7

    .line 787
    invoke-static {v1, v6}, Lv81;->γ(Landroid/content/Context;I)I

    .line 788
    .line 789
    .line 790
    move-result v6

    .line 791
    invoke-direct {v0, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 792
    .line 793
    .line 794
    const/16 v15, 0x8

    .line 795
    .line 796
    invoke-static {v1, v15}, Lv81;->γ(Landroid/content/Context;I)I

    .line 797
    .line 798
    .line 799
    move-result v6

    .line 800
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 807
    .line 808
    .line 809
    new-instance v0, Landroid/widget/LinearLayout;

    .line 810
    .line 811
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 812
    .line 813
    .line 814
    const/4 v15, 0x1

    .line 815
    invoke-virtual {v0, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 816
    .line 817
    .line 818
    const/16 v12, 0x10

    .line 819
    .line 820
    invoke-virtual {v0, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 821
    .line 822
    .line 823
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 824
    .line 825
    const/high16 v6, 0x3f800000    # 1.0f

    .line 826
    .line 827
    const/4 v7, -0x2

    .line 828
    const/4 v11, 0x0

    .line 829
    invoke-direct {v4, v11, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 833
    .line 834
    .line 835
    new-instance v4, Landroid/widget/TextView;

    .line 836
    .line 837
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 841
    .line 842
    .line 843
    const/high16 v6, 0x41500000    # 13.0f

    .line 844
    .line 845
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 849
    .line 850
    .line 851
    sget-object v6, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 852
    .line 853
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 857
    .line 858
    .line 859
    const/4 v7, 0x0

    .line 860
    invoke-virtual {v4, v7, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 867
    .line 868
    .line 869
    new-instance v4, Landroid/widget/TextView;

    .line 870
    .line 871
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 875
    .line 876
    .line 877
    const/high16 v7, 0x41200000    # 10.0f

    .line 878
    .line 879
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 892
    .line 893
    .line 894
    const/4 v2, 0x2

    .line 895
    invoke-static {v1, v2}, Lv81;->γ(Landroid/content/Context;I)I

    .line 896
    .line 897
    .line 898
    move-result v6

    .line 899
    invoke-virtual {v4, v11, v6, v11, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 906
    .line 907
    .line 908
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 909
    .line 910
    const/16 v4, 0x36

    .line 911
    .line 912
    invoke-static {v1, v4}, Lv81;->γ(Landroid/content/Context;I)I

    .line 913
    .line 914
    .line 915
    move-result v4

    .line 916
    const/high16 v6, 0x3f800000    # 1.0f

    .line 917
    .line 918
    invoke-direct {v0, v11, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 919
    .line 920
    .line 921
    if-nez v18, :cond_8

    .line 922
    .line 923
    const/4 v4, 0x6

    .line 924
    invoke-static {v1, v4}, Lv81;->γ(Landroid/content/Context;I)I

    .line 925
    .line 926
    .line 927
    move-result v6

    .line 928
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 929
    .line 930
    .line 931
    goto :goto_a

    .line 932
    :cond_8
    const/4 v4, 0x6

    .line 933
    invoke-static {v1, v4}, Lv81;->γ(Landroid/content/Context;I)I

    .line 934
    .line 935
    .line 936
    move-result v6

    .line 937
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 938
    .line 939
    .line 940
    :goto_a
    invoke-virtual {v14, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 941
    .line 942
    .line 943
    move v11, v2

    .line 944
    move v2, v12

    .line 945
    move/from16 v18, v19

    .line 946
    .line 947
    move-object/from16 v13, v20

    .line 948
    .line 949
    move-object/from16 v12, v21

    .line 950
    .line 951
    move-object/from16 v15, v22

    .line 952
    .line 953
    move-object/from16 v6, v23

    .line 954
    .line 955
    move-object/from16 v7, v24

    .line 956
    .line 957
    const/4 v3, 0x0

    .line 958
    const/4 v4, 0x1

    .line 959
    const/16 v8, 0xa

    .line 960
    .line 961
    const/16 v9, 0x8

    .line 962
    .line 963
    goto/16 :goto_4

    .line 964
    .line 965
    :cond_9
    invoke-static {}, Lyh;->х()V

    .line 966
    .line 967
    .line 968
    const/16 v17, 0x0

    .line 969
    .line 970
    throw v17

    .line 971
    :cond_a
    move-object/from16 v23, v6

    .line 972
    .line 973
    move-object/from16 v24, v7

    .line 974
    .line 975
    move-object/from16 v21, v12

    .line 976
    .line 977
    move-object/from16 v20, v13

    .line 978
    .line 979
    const/16 v13, 0xe

    .line 980
    .line 981
    const/16 v17, 0x0

    .line 982
    .line 983
    move v12, v2

    .line 984
    const/4 v2, 0x2

    .line 985
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    const/4 v15, 0x1

    .line 990
    if-ne v0, v15, :cond_b

    .line 991
    .line 992
    new-instance v0, Landroid/view/View;

    .line 993
    .line 994
    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 995
    .line 996
    .line 997
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 998
    .line 999
    const/16 v4, 0x36

    .line 1000
    .line 1001
    invoke-static {v1, v4}, Lv81;->γ(Landroid/content/Context;I)I

    .line 1002
    .line 1003
    .line 1004
    move-result v4

    .line 1005
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1006
    .line 1007
    const/4 v11, 0x0

    .line 1008
    invoke-direct {v3, v11, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1009
    .line 1010
    .line 1011
    const/4 v4, 0x6

    .line 1012
    invoke-static {v1, v4}, Lv81;->γ(Landroid/content/Context;I)I

    .line 1013
    .line 1014
    .line 1015
    move-result v7

    .line 1016
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v14, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1020
    .line 1021
    .line 1022
    goto :goto_b

    .line 1023
    :cond_b
    const/4 v4, 0x6

    .line 1024
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1025
    .line 1026
    const/4 v11, 0x0

    .line 1027
    :goto_b
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1028
    .line 1029
    move/from16 v3, p3

    .line 1030
    .line 1031
    const/4 v7, -0x2

    .line 1032
    invoke-direct {v0, v3, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1033
    .line 1034
    .line 1035
    const/16 v8, 0x8

    .line 1036
    .line 1037
    invoke-static {v1, v8}, Lv81;->γ(Landroid/content/Context;I)I

    .line 1038
    .line 1039
    .line 1040
    move-result v9

    .line 1041
    iput v9, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1042
    .line 1043
    move-object/from16 v9, v24

    .line 1044
    .line 1045
    invoke-virtual {v9, v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1046
    .line 1047
    .line 1048
    move-object v7, v9

    .line 1049
    move v3, v11

    .line 1050
    move v4, v15

    .line 1051
    move-object/from16 v6, v23

    .line 1052
    .line 1053
    move v11, v2

    .line 1054
    move v9, v8

    .line 1055
    move v2, v12

    .line 1056
    move-object/from16 v12, v21

    .line 1057
    .line 1058
    const/16 v8, 0xa

    .line 1059
    .line 1060
    goto/16 :goto_3

    .line 1061
    .line 1062
    :cond_c
    move-object v14, v6

    .line 1063
    move-object v9, v7

    .line 1064
    invoke-virtual {v14, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1065
    .line 1066
    .line 1067
    goto :goto_c

    .line 1068
    :cond_d
    move-object v14, v6

    .line 1069
    :goto_c
    return-object v14
.end method

.method public static ο(Lsd;)V
    .locals 9

    .line 1
    iget-wide v0, p0, Lsd;->α:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-lez v2, :cond_5

    .line 8
    .line 9
    invoke-static {}, Lv81;->θ()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v3, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p0, Lui1;->α:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v2, Lorg/json/JSONArray;

    .line 35
    .line 36
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 37
    .line 38
    .line 39
    check-cast p0, Ljava/lang/Iterable;

    .line 40
    .line 41
    new-instance v3, Lib1;

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    invoke-direct {v3, v4}, Lib1;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lsd;

    .line 66
    .line 67
    invoke-virtual {v3}, Lsd;->β()Ltd;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    new-instance v5, Lorg/json/JSONObject;

    .line 72
    .line 73
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v6, "conversation_short_id"

    .line 77
    .line 78
    iget-wide v7, v3, Lsd;->α:J

    .line 79
    .line 80
    invoke-virtual {v5, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    iget-object v6, v3, Lsd;->β:Lip1;

    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const-string v7, "harvest"

    .line 90
    .line 91
    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 92
    .line 93
    .line 94
    iget-object v6, v3, Lsd;->γ:Lip1;

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    const-string v7, "plant"

    .line 101
    .line 102
    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    iget-object v6, v3, Lsd;->δ:Lip1;

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    const-string v7, "water"

    .line 112
    .line 113
    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    const-string v6, "seed_mode"

    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    sget-object v6, Ltd;->η:Ltd;

    .line 126
    .line 127
    if-ne v4, v6, :cond_0

    .line 128
    .line 129
    iget-object v4, v3, Lsd;->ε:Ljava/lang/Integer;

    .line 130
    .line 131
    if-nez v4, :cond_1

    .line 132
    .line 133
    sget-object v4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_0
    sget-object v4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 137
    .line 138
    :cond_1
    :goto_1
    const-string v6, "seed_id"

    .line 139
    .line 140
    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    iget-object v3, v3, Lsd;->η:Ljava/util/Set;

    .line 144
    .line 145
    check-cast v3, Ljava/lang/Iterable;

    .line 146
    .line 147
    new-instance v4, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-eqz v6, :cond_3

    .line 161
    .line 162
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    move-object v7, v6

    .line 167
    check-cast v7, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-lez v7, :cond_2

    .line 174
    .line 175
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_3
    invoke-static {v4}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    new-instance v4, Lorg/json/JSONArray;

    .line 184
    .line 185
    invoke-direct {v4, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 186
    .line 187
    .line 188
    const-string v3, "excluded_seed_ids"

    .line 189
    .line 190
    invoke-virtual {v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 194
    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_4
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    const-string v2, "pet_elf_camp_person_rules_v2"

    .line 206
    .line 207
    invoke-static {v2, p0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    sget-object p0, Lxn0;->ρ:Lxn0;

    .line 211
    .line 212
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {p0, v0}, Lxn0;->Χ(Ljava/lang/Long;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_5
    const-string p0, "\u4f1a\u8bdd\u77ed ID \u65e0\u6548"

    .line 221
    .line 222
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public static π(Landroid/widget/TextView;I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eq p1, v0, :cond_0

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    int-to-float p1, p1

    .line 16
    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method public static ρ(Ljava/util/ArrayList;)[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lo62;

    .line 23
    .line 24
    iget-byte v2, v2, Lo62;->ε:B

    .line 25
    .line 26
    add-int/lit8 v3, v1, 0x1

    .line 27
    .line 28
    aput-byte v2, v0, v1

    .line 29
    .line 30
    move v1, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0
.end method

.method public static final σ(I)I
    .locals 3

    .line 1
    const v0, 0x12492492

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    const v1, 0x24924924

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, p0

    .line 9
    const v2, -0x36db6db7

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, v2

    .line 13
    shr-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    or-int/2addr v2, v0

    .line 16
    or-int/2addr p0, v2

    .line 17
    shl-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    or-int/2addr p0, v0

    .line 21
    return p0
.end method
