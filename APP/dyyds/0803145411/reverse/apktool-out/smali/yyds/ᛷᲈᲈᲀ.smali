.class public abstract Lyyds/ᛷᲈᲈᲀ;
.super Landroid/app/Fragment;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛱᛸᲇᛵ;


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᛷᲈᲈᲀ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᲈᲈ;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lyyds/ᛲᛴᲈᲈ;->ᛵᛸᛸᛷ(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᛷᲈᲈᲀ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᲈᲈ;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object v1, Lyyds/ᛵᛷᛶᲁ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛵᛱᛱ;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lyyds/ᛴᛲᛷᛸ;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛵᛱᛱ;

    .line 28
    .line 29
    :cond_0
    iget-boolean v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᲇᲈᛵᛷ:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

    .line 35
    .line 36
    invoke-interface {p0}, Lyyds/ᛱᛸᲇᛵ;->getActivity()Landroid/app/Activity;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lyyds/ᛴᛶᲀᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {p0}, Lyyds/ᛲᲈᲀᛲ;->ᛲᲈᲁ(Landroid/app/Activity;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᛷᲈᲈᲀ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᲈᲈ;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lyyds/ᛲᛴᲈᲈ;->ᲀᛲᛳᲀ(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᛷᲈᲈᲀ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᲈᲈ;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

    .line 9
    .line 10
    iget-boolean v1, p0, Lyyds/ᛲᛴᲈᲈ;->ᛵᛸᛸᛷ:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lyyds/ᛷᲈᲈᲀ;->ᛲᲈᲁ()V

    .line 15
    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-boolean v1, p0, Lyyds/ᛲᛴᲈᲈ;->ᲀᛲᛳᲀ:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, p0, Lyyds/ᛲᛴᲈᲈ;->ᲀᛲᛳᲀ:Z

    .line 25
    .line 26
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->getActivity()Landroid/app/Activity;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Lyyds/ᛴᛶᲀᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->getArguments()Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    const-string v3, "request_code"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    :goto_0
    if-gtz v2, :cond_4

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->getArguments()Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    goto :goto_1

    .line 62
    :cond_5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 63
    .line 64
    const/16 v4, 0x21

    .line 65
    .line 66
    if-lt v3, v4, :cond_6

    .line 67
    .line 68
    invoke-static {v0}, Lyyds/ᛴᛵᛷᛳ;->ᛷᲈᲈᲁ(Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_1

    .line 73
    :cond_6
    const-string v3, "request_permissions"

    .line 74
    .line 75
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :goto_1
    if-eqz v0, :cond_9

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_7

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_7
    invoke-virtual {p0, v1, v0, v2}, Lyyds/ᛲᛴᲈᲈ;->ᲇᲈᛵᛷ(Landroid/app/Activity;Ljava/util/ArrayList;I)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, Lyyds/ᛲᛴᲈᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛵᛱᛱ;

    .line 92
    .line 93
    if-nez p0, :cond_8

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_8
    iget-object p0, p0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Lyyds/ᛴᛲᛷᛸ;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    :cond_9
    :goto_2
    return-void
.end method

.method public final ᛲᲈᲁ()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public abstract ᛵᛸᛸᛷ()Lyyds/ᛲᛴᲈᲈ;
.end method
