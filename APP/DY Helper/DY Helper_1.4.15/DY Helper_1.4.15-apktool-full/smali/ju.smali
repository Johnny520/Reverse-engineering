.class public final Lju;
.super Landroid/app/Fragment;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:Lhu;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2af9

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_5

    .line 9
    .line 10
    :cond_0
    const/4 p1, -0x1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-ne p2, p1, :cond_7

    .line 13
    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-object p1, v0

    .line 22
    :goto_0
    if-eqz p1, :cond_6

    .line 23
    .line 24
    if-eqz p3, :cond_2

    .line 25
    .line 26
    invoke-virtual {p3}, Landroid/content/Intent;->getFlags()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 p2, 0x0

    .line 32
    :goto_1
    and-int/lit8 p3, p2, 0x3

    .line 33
    .line 34
    and-int/lit8 p2, p2, 0x2

    .line 35
    .line 36
    if-eqz p2, :cond_5

    .line 37
    .line 38
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p2, :cond_4

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1, p1, p3}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p1}, Lyh;->ν(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    new-instance p1, Ljava/lang/SecurityException;

    .line 59
    .line 60
    const-string p2, "\u5f53\u524d\u7528\u6237\u7a7a\u95f4\u672a\u4fdd\u5b58\u6301\u4e45\u8bfb\u5199\u6388\u6743"

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_2

    .line 68
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string p2, "\u5bbf\u4e3b Activity \u5df2\u5931\u6548"

    .line 71
    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_5
    new-instance p1, Ljava/lang/SecurityException;

    .line 77
    .line 78
    const-string p2, "\u76ee\u5f55\u9009\u62e9\u5668\u672a\u6388\u4e88\u5199\u5165\u6743\u9650"

    .line 79
    .line 80
    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :goto_2
    const-string p2, "DYHelper"

    .line 85
    .line 86
    const-string p3, "\u6301\u4e45\u5316\u4e0b\u8f7d\u76ee\u5f55\u6388\u6743\u5931\u8d25"

    .line 87
    .line 88
    invoke-static {p2, p3, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-eqz p1, :cond_7

    .line 96
    .line 97
    const-string p2, "\u76ee\u5f55\u6388\u6743\u672a\u80fd\u4fdd\u5b58\uff0c\u5c06\u7ee7\u7eed\u4f7f\u7528\u7cfb\u7edf\u9ed8\u8ba4\u76ee\u5f55"

    .line 98
    .line 99
    const/4 p3, 0x1

    .line 100
    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_6
    :goto_3
    move-object v0, p1

    .line 109
    :cond_7
    :goto_4
    iget-object p1, p0, Lju;->ε:Lhu;

    .line 110
    .line 111
    if-eqz p1, :cond_8

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Lhu;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_8
    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_9

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-eqz p1, :cond_9

    .line 127
    .line 128
    invoke-virtual {p1, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-eqz p0, :cond_9

    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 135
    .line 136
    .line 137
    :cond_9
    :goto_5
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/content/Intent;

    .line 5
    .line 6
    const-string v0, "android.intent.action.OPEN_DOCUMENT_TREE"

    .line 7
    .line 8
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/16 v0, 0xc3

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    const-string v0, "android.content.extra.SHOW_ADVANCED"

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    :try_start_0
    const-string v0, "android.provider.extra.INITIAL_URI"

    .line 23
    .line 24
    const-string v1, "content://com.android.externalstorage.documents/root/primary"

    .line 25
    .line 26
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :catchall_0
    const/16 v0, 0x2af9

    .line 34
    .line 35
    :try_start_1
    invoke-virtual {p0, p1, v0}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "\u65e0\u6cd5\u6253\u5f00\u76ee\u5f55\u9009\u62e9\u5668"

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lju;->ε:Lhu;

    .line 54
    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-virtual {p1, v0}, Lhu;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    invoke-virtual {p1, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-eqz p0, :cond_1

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 80
    .line 81
    .line 82
    :cond_1
    :goto_0
    return-void
.end method
