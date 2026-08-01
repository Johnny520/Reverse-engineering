.class final Lcom/mr/elaris/InAppSettingsRepeaterIconPage;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final REPEATER_ICON_REQUEST:I = 0x1fa5

.field private static volatile activePathInput:Ljava/lang/ref/WeakReference; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/EditText;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile resultHookInstalled:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->activePathInput:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    return-void
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

.method public static bridge synthetic a(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->clearRepeaterIconPath(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic b(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->handleRepeaterIconActivityResult(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic c(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->openRepeaterIconPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static clearRepeaterIconPath(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "repeater"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->keepCategoryBackTarget(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, ""

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const-string v1, "message_repeater_icon_path"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-lez v2, :cond_1

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {p0, v1, v0, v2}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/mr/elaris/InAppSettings;->settleTextInput(Landroid/widget/EditText;Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->refocusElarisPage(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 3

    .line 1
    new-instance v0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$1;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "\u590d\u8bfb\u6309\u94ae\u56fe\u7247"

    .line 7
    .line 8
    const-string v2, "\u81ea\u5b9a\u4e49\u590d\u8bfb\u6309\u94ae\u7684\u56fe\u7247\uff0c\u70b9\u5f00\u8bbe\u7f6e"

    .line 9
    .line 10
    invoke-static {p0, v1, v2, v0}, Lcom/mr/elaris/InAppSettingsWidgets;->actionRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static bridge synthetic d(Lcom/mr/elaris/InAppSettings;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static handleRepeaterIconActivityResult(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 6

    .line 1
    const-string v0, "message_repeater_icon_path"

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->persistPickedRepeaterIcon(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v2, "settings"

    .line 21
    .line 22
    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v2, v0, p1}, Lcom/mr/elaris/Prefs;->putString(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    const-string v3, "config_version"

    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 44
    .line 45
    .line 46
    invoke-static {v0, p1}, Lcom/mr/elaris/HookEntry;->setRuntimeString(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->activePathInput:Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroid/widget/EditText;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    new-instance v2, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$6;

    .line 60
    .line 61
    invoke-direct {v2, v0, p1}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$6;-><init>(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    :goto_0
    const-string p1, "\u5df2\u8bbe\u7f6e\u590d\u8bfb\u6309\u94ae\u56fe\u7247\uff0c\u91cd\u8fdb\u804a\u5929\u540e\u751f\u6548"

    .line 71
    .line 72
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :goto_1
    const-string v0, "\u590d\u8bfb\u6309\u94ae\u56fe\u7247\u4fdd\u5b58\u5931\u8d25\uff0c\u8bf7\u6362\u4e00\u5f20\u56fe\u7247"

    .line 81
    .line 82
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 87
    .line 88
    .line 89
    new-instance p0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v0, "handle repeater icon result failed: "

    .line 92
    .line 93
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_2
    return-void
.end method

.method private static declared-synchronized installRepeaterIconResultHook()V
    .locals 3

    .line 1
    const-class v0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->resultHookInstalled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    :try_start_1
    sput-boolean v1, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->resultHookInstalled:Z

    .line 12
    .line 13
    new-instance v1, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$5;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$5;-><init>()V

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x1fa5

    .line 19
    .line 20
    invoke-static {v2, v1}, Ld;->a(ILc;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    throw v1
.end method

.method private static openRepeaterIconPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 7

    .line 1
    const-string v0, "\u9009\u62e9\u56fe\u7247\u540e\u4f1a\u81ea\u52a8\u4fdd\u5b58\u4e3a\u590d\u8bfb\u6309\u94ae\u56fe\u6807"

    .line 2
    .line 3
    const-string v1, "image/*"

    .line 4
    .line 5
    const-string v2, "android.intent.category.OPENABLE"

    .line 6
    .line 7
    const-string v3, "repeater"

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->keepCategoryBackTarget(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/mr/elaris/InAppSettings;->settleTextInput(Landroid/widget/EditText;Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-direct {v3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sput-object v3, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->activePathInput:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    const/16 p1, 0x1fa5

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->installRepeaterIconResultHook()V

    .line 26
    .line 27
    .line 28
    new-instance v4, Landroid/content/Intent;

    .line 29
    .line 30
    const-string v5, "android.intent.action.OPEN_DOCUMENT"

    .line 31
    .line 32
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 45
    .line 46
    invoke-virtual {v5, v4, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v4

    .line 54
    :try_start_1
    new-instance v5, Landroid/content/Intent;

    .line 55
    .line 56
    const-string v6, "android.intent.action.GET_CONTENT"

    .line 57
    .line 58
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 71
    .line 72
    invoke-virtual {v1, v5, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_1
    const-string p1, "\u65e0\u6cd5\u6253\u5f00\u56fe\u7247\u9009\u62e9\u5668\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v0, "system repeater icon picker failed: "

    .line 87
    .line 88
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->refocusElarisPage(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method private static persistPickedRepeaterIcon(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const-string v3, "elaris"

    .line 9
    .line 10
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    move-object p1, v0

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :goto_0
    new-instance v2, Ljava/io/File;

    .line 27
    .line 28
    const-string v3, "repeater_icon_custom"

    .line 29
    .line 30
    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 38
    .line 39
    .line 40
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    if-eqz p0, :cond_4

    .line 42
    .line 43
    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {p1, v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 47
    .line 48
    .line 49
    const/16 v0, 0x2000

    .line 50
    .line 51
    :try_start_2
    new-array v0, v0, [B

    .line 52
    .line 53
    move v3, v1

    .line 54
    :goto_1
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-ltz v4, :cond_3

    .line 59
    .line 60
    if-nez v4, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    add-int/2addr v3, v4

    .line 64
    const/high16 v5, 0x800000

    .line 65
    .line 66
    if-gt v3, v5, :cond_2

    .line 67
    .line 68
    invoke-virtual {p1, v0, v1, v4}, Ljava/io/FileOutputStream;->write([BII)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_1
    move-exception v0

    .line 73
    move-object v6, p1

    .line 74
    move-object p1, p0

    .line 75
    move-object p0, v0

    .line 76
    move-object v0, v6

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    const-string v1, "image too large"

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 94
    .line 95
    .line 96
    :catchall_2
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 97
    .line 98
    .line 99
    :catchall_3
    return-object v0

    .line 100
    :catchall_4
    move-exception p1

    .line 101
    move-object v6, p1

    .line 102
    move-object p1, p0

    .line 103
    move-object p0, v6

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 106
    .line 107
    const-string v1, "image stream is null"

    .line 108
    .line 109
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 113
    :goto_2
    if-eqz v0, :cond_5

    .line 114
    .line 115
    :try_start_6
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 116
    .line 117
    .line 118
    :catchall_5
    :cond_5
    if-eqz p1, :cond_6

    .line 119
    .line 120
    :try_start_7
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 121
    .line 122
    .line 123
    :catchall_6
    :cond_6
    throw p0
.end method

.method private static showDialog(Lcom/mr/elaris/InAppSettings;)V
    .locals 14

    .line 1
    :try_start_0
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const-string v2, "elaris_dialog_surface"

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/high16 v2, 0x41800000    # 16.0f

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/high16 v3, 0x41500000    # 13.0f

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/high16 v4, 0x41300000    # 11.0f

    .line 30
    .line 31
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v0, v2, v3, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    const-string v2, "\u590d\u8bfb\u6309\u94ae\u56fe\u7247"

    .line 46
    .line 47
    sget v3, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 48
    .line 49
    const/16 v4, 0x11

    .line 50
    .line 51
    invoke-virtual {p0, v2, v4, v3, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    const-string v2, "\u672a\u8bbe\u7f6e\uff0c\u4f7f\u7528\u9ed8\u8ba4 +1 \u56fe\u6807"

    .line 59
    .line 60
    const-string v3, "message_repeater_icon_path"

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {p0, v2, v3}, Lcom/mr/elaris/InAppSettings;->input(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/EditText;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setCursorVisible(Z)V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 82
    .line 83
    .line 84
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 85
    .line 86
    const/high16 v5, 0x42200000    # 40.0f

    .line 87
    .line 88
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    const/4 v6, -0x1

    .line 93
    invoke-direct {v4, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 94
    .line 95
    .line 96
    const/high16 v5, 0x41000000    # 8.0f

    .line 97
    .line 98
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 103
    .line 104
    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    .line 106
    .line 107
    const-string v4, "\u9009\u62e9\u540e\u81ea\u52a8\u4fdd\u5b58\uff0c\u6062\u590d\u9ed8\u8ba4\u540e\u4f7f\u7528 Elaris \u9ed8\u8ba4 +1 \u56fe\u6807"

    .line 108
    .line 109
    sget v7, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 110
    .line 111
    const/16 v8, 0xc

    .line 112
    .line 113
    invoke-virtual {p0, v4, v8, v7, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const/high16 v7, 0x40c00000    # 6.0f

    .line 118
    .line 119
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-virtual {v4, v3, v7, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 127
    .line 128
    .line 129
    new-instance v4, Landroid/app/AlertDialog$Builder;

    .line 130
    .line 131
    iget-object v7, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 132
    .line 133
    invoke-direct {v4, v7}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    const-string v4, "\u9009\u62e9\u56fe\u7247"

    .line 141
    .line 142
    invoke-virtual {p0, v4, v1}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    new-instance v7, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$2;

    .line 147
    .line 148
    invoke-direct {v7, p0, v2}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$2;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    .line 153
    .line 154
    const-string v7, "\u6062\u590d\u9ed8\u8ba4"

    .line 155
    .line 156
    invoke-virtual {p0, v7, v3}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    new-instance v9, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$3;

    .line 161
    .line 162
    invoke-direct {v9, p0, v2, v8}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$3;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/app/AlertDialog;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    .line 167
    .line 168
    new-instance v2, Landroid/widget/LinearLayout;

    .line 169
    .line 170
    iget-object v9, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 171
    .line 172
    invoke-direct {v2, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 176
    .line 177
    .line 178
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 179
    .line 180
    const/high16 v10, 0x42100000    # 36.0f

    .line 181
    .line 182
    invoke-virtual {p0, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    const/high16 v12, 0x3f800000    # 1.0f

    .line 187
    .line 188
    invoke-direct {v9, v3, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 192
    .line 193
    .line 194
    new-instance v4, Landroid/widget/Space;

    .line 195
    .line 196
    iget-object v9, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 197
    .line 198
    invoke-direct {v4, v9}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 199
    .line 200
    .line 201
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 202
    .line 203
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    invoke-direct {v9, v5, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v4, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 211
    .line 212
    .line 213
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 214
    .line 215
    invoke-virtual {p0, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    invoke-direct {v4, v3, v5, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 223
    .line 224
    .line 225
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 226
    .line 227
    const/4 v4, -0x2

    .line 228
    invoke-direct {v3, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 229
    .line 230
    .line 231
    const/high16 v5, 0x41200000    # 10.0f

    .line 232
    .line 233
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 238
    .line 239
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 240
    .line 241
    .line 242
    new-instance v9, Landroid/widget/ScrollView;

    .line 243
    .line 244
    iget-object v2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 245
    .line 246
    invoke-direct {v9, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 250
    .line 251
    .line 252
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 253
    .line 254
    invoke-direct {v1, v6, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v9, v0, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 258
    .line 259
    .line 260
    const/4 v12, 0x0

    .line 261
    const/4 v13, 0x0

    .line 262
    const/4 v10, 0x0

    .line 263
    const/4 v11, 0x0

    .line 264
    invoke-virtual/range {v8 .. v13}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 265
    .line 266
    .line 267
    new-instance v0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$4;

    .line 268
    .line 269
    invoke-direct {v0, p0, v8}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$4;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v8, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v8}, Landroid/app/Dialog;->show()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v8}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :catchall_0
    move-exception v0

    .line 283
    new-instance v1, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    const-string v2, "repeater icon dialog failed: "

    .line 286
    .line 287
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    const-string v2, ": "

    .line 291
    .line 292
    invoke-static {v0, v1, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const-string v0, "\u590d\u8bfb\u56fe\u7247\u8bbe\u7f6e\u6253\u5f00\u5931\u8d25"

    .line 296
    .line 297
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-void
.end method
