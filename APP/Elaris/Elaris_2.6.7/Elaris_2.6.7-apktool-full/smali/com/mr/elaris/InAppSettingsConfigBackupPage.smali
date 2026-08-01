.class final Lcom/mr/elaris/InAppSettingsConfigBackupPage;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final BACKUP_TYPE:Ljava/lang/String; = "elaris_settings_backup"

.field private static final EXPORT_REQUEST:I = 0x2013

.field private static final IMPORT_REQUEST:I = 0x2014

.field private static final MAX_IMPORT_BYTES:I = 0x100000

.field private static volatile activeSettings:Ljava/lang/ref/WeakReference; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/mr/elaris/InAppSettings;",
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
    sput-object v0, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->activeSettings:Ljava/lang/ref/WeakReference;

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

.method public static bridge synthetic a(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->handleExportResult(Landroid/app/Activity;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic b(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->handleImportResult(Landroid/app/Activity;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static backupFileName()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyyMMdd-HHmmss"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/Date;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Elaris-settings-"

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ".json"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
.end method

.method public static bridge synthetic c(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->openExportPicker(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->innerBox()Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 6
    .line 7
    const-string v2, "\u6a21\u5757\u914d\u7f6e"

    .line 8
    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    invoke-virtual {p0, v2, v3, v1, v4}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/high16 v2, 0x40000000    # 2.0f

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-virtual {v1, v5, v3, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    const/16 v1, 0xc

    .line 30
    .line 31
    sget v3, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 32
    .line 33
    const-string v6, "\u5bfc\u51fa\u6216\u6062\u590d Elaris \u5f00\u5173\u548c\u6587\u672c\u914d\u7f6e\uff0c\u4e0d\u5305\u542b QQ \u804a\u5929\u6570\u636e"

    .line 34
    .line 35
    invoke-virtual {p0, v6, v1, v3, v5}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v5, v2, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Landroid/widget/LinearLayout;

    .line 50
    .line 51
    iget-object v2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 52
    .line 53
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 57
    .line 58
    .line 59
    const-string v2, "\u5bfc\u51fa\u914d\u7f6e"

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->button(Ljava/lang/String;)Landroid/widget/TextView;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    new-instance v3, Lcom/mr/elaris/InAppSettingsConfigBackupPage$1;

    .line 66
    .line 67
    invoke-direct {v3, p0}, Lcom/mr/elaris/InAppSettingsConfigBackupPage$1;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    .line 72
    .line 73
    const-string v3, "\u5bfc\u5165\u914d\u7f6e"

    .line 74
    .line 75
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->button(Ljava/lang/String;)Landroid/widget/TextView;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    new-instance v6, Lcom/mr/elaris/InAppSettingsConfigBackupPage$2;

    .line 80
    .line 81
    invoke-direct {v6, p0}, Lcom/mr/elaris/InAppSettingsConfigBackupPage$2;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 88
    .line 89
    const/high16 v7, 0x42100000    # 36.0f

    .line 90
    .line 91
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    const/high16 v9, 0x3f800000    # 1.0f

    .line 96
    .line 97
    invoke-direct {v6, v5, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 101
    .line 102
    .line 103
    new-instance v2, Landroid/widget/Space;

    .line 104
    .line 105
    iget-object v6, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 106
    .line 107
    invoke-direct {v2, v6}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 111
    .line 112
    const/high16 v8, 0x41200000    # 10.0f

    .line 113
    .line 114
    invoke-virtual {p0, v8}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    invoke-direct {v6, v8, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    .line 123
    .line 124
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 125
    .line 126
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    invoke-direct {v2, v5, v4, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 137
    .line 138
    const/4 v3, -0x2

    .line 139
    const/4 v4, -0x1

    .line 140
    invoke-direct {v2, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 141
    .line 142
    .line 143
    const/high16 v3, 0x40c00000    # 6.0f

    .line 144
    .line 145
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 150
    .line 151
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 152
    .line 153
    .line 154
    const-string v1, "\u91cd\u7f6e\u5168\u90e8\u5f00\u5173"

    .line 155
    .line 156
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->button(Ljava/lang/String;)Landroid/widget/TextView;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    new-instance v2, Lcom/mr/elaris/InAppSettingsConfigBackupPage$3;

    .line 161
    .line 162
    invoke-direct {v2, p0}, Lcom/mr/elaris/InAppSettingsConfigBackupPage$3;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    .line 167
    .line 168
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 169
    .line 170
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-direct {v2, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    iput p0, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 182
    .line 183
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 184
    .line 185
    .line 186
    return-object v0
.end method

.method public static bridge synthetic d(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->openImportPicker(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static handleExportResult(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->writeBackup(Landroid/app/Activity;Landroid/net/Uri;)V

    .line 3
    .line 4
    .line 5
    const-string p1, "\u914d\u7f6e\u5df2\u5bfc\u51fa"

    .line 6
    .line 7
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    const-string v1, "\u914d\u7f6e\u5bfc\u51fa\u5931\u8d25"

    .line 17
    .line 18
    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 23
    .line 24
    .line 25
    new-instance p0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v0, "settings backup export failed: "

    .line 28
    .line 29
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private static handleImportResult(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 3

    .line 1
    const-string v0, "\u914d\u7f6e\u5df2\u5bfc\u5165\uff1a"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->importBackup(Landroid/app/Activity;Landroid/net/Uri;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    sget-object v2, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->activeSettings:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lcom/mr/elaris/InAppSettings;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/mr/elaris/InAppSettings;->refreshCurrentPage()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, " \u9879\uff0c\u5efa\u8bae\u91cd\u542f QQ"

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_1
    const-string v0, "\u914d\u7f6e\u5bfc\u5165\u5931\u8d25\uff0c\u8bf7\u786e\u8ba4\u6587\u4ef6\u6b63\u786e"

    .line 50
    .line 51
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 56
    .line 57
    .line 58
    new-instance p0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v0, "settings backup import failed: "

    .line 61
    .line 62
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method private static importBackup(Landroid/app/Activity;Landroid/net/Uri;)I
    .locals 11

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->readText(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p1, "type"

    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v1, "elaris_settings_backup"

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_b

    .line 25
    .line 26
    const-string p1, "booleans"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v1, "strings"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "settings"

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    sget-object v1, Lcom/mr/elaris/Prefs;->BOOLEAN_KEYS:[Ljava/lang/String;

    .line 50
    .line 51
    array-length v3, v1

    .line 52
    new-array v3, v3, [Z

    .line 53
    .line 54
    array-length v1, v1

    .line 55
    new-array v1, v1, [Z

    .line 56
    .line 57
    sget-object v4, Lcom/mr/elaris/Prefs;->STRING_KEYS:[Ljava/lang/String;

    .line 58
    .line 59
    array-length v5, v4

    .line 60
    new-array v5, v5, [Z

    .line 61
    .line 62
    array-length v4, v4

    .line 63
    new-array v4, v4, [Ljava/lang/String;

    .line 64
    .line 65
    const/4 v6, 0x1

    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    move v7, v2

    .line 69
    move v8, v7

    .line 70
    :goto_0
    sget-object v9, Lcom/mr/elaris/Prefs;->BOOLEAN_KEYS:[Ljava/lang/String;

    .line 71
    .line 72
    array-length v10, v9

    .line 73
    if-ge v7, v10, :cond_2

    .line 74
    .line 75
    aget-object v9, v9, v7

    .line 76
    .line 77
    invoke-virtual {p1, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-nez v10, :cond_0

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_0
    aput-boolean v6, v3, v7

    .line 85
    .line 86
    invoke-static {v9}, Lcom/mr/elaris/Prefs;->defaultBoolean(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    invoke-virtual {p1, v9, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    aput-boolean v10, v1, v7

    .line 95
    .line 96
    invoke-static {p0, v9, v10}, Lcom/mr/elaris/Prefs;->putBoolean(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 97
    .line 98
    .line 99
    add-int/lit8 v8, v8, 0x1

    .line 100
    .line 101
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    move v8, v2

    .line 105
    :cond_2
    if-eqz v0, :cond_4

    .line 106
    .line 107
    move p1, v2

    .line 108
    :goto_2
    sget-object v7, Lcom/mr/elaris/Prefs;->STRING_KEYS:[Ljava/lang/String;

    .line 109
    .line 110
    array-length v9, v7

    .line 111
    if-ge p1, v9, :cond_4

    .line 112
    .line 113
    aget-object v7, v7, p1

    .line 114
    .line 115
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-nez v9, :cond_3

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_3
    aput-boolean v6, v5, p1

    .line 123
    .line 124
    invoke-static {v7}, Lcom/mr/elaris/Prefs;->defaultString(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-virtual {v0, v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    aput-object v9, v4, p1

    .line 133
    .line 134
    invoke-static {p0, v7, v9}, Lcom/mr/elaris/Prefs;->putString(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 135
    .line 136
    .line 137
    add-int/lit8 v8, v8, 0x1

    .line 138
    .line 139
    :goto_3
    add-int/lit8 p1, p1, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    if-lez v8, :cond_a

    .line 143
    .line 144
    const-string p1, "config_version"

    .line 145
    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v6

    .line 150
    invoke-interface {p0, p1, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 151
    .line 152
    .line 153
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_9

    .line 158
    .line 159
    move p0, v2

    .line 160
    :goto_4
    sget-object p1, Lcom/mr/elaris/Prefs;->BOOLEAN_KEYS:[Ljava/lang/String;

    .line 161
    .line 162
    array-length v0, p1

    .line 163
    if-ge p0, v0, :cond_6

    .line 164
    .line 165
    aget-boolean v0, v3, p0

    .line 166
    .line 167
    if-eqz v0, :cond_5

    .line 168
    .line 169
    aget-object p1, p1, p0

    .line 170
    .line 171
    aget-boolean v0, v1, p0

    .line 172
    .line 173
    invoke-static {p1, v0}, Lcom/mr/elaris/HookEntry;->setRuntimeBool(Ljava/lang/String;Z)V

    .line 174
    .line 175
    .line 176
    :cond_5
    add-int/lit8 p0, p0, 0x1

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_6
    :goto_5
    sget-object p0, Lcom/mr/elaris/Prefs;->STRING_KEYS:[Ljava/lang/String;

    .line 180
    .line 181
    array-length p1, p0

    .line 182
    if-ge v2, p1, :cond_8

    .line 183
    .line 184
    aget-boolean p1, v5, v2

    .line 185
    .line 186
    if-eqz p1, :cond_7

    .line 187
    .line 188
    aget-object p0, p0, v2

    .line 189
    .line 190
    aget-object p1, v4, v2

    .line 191
    .line 192
    invoke-static {p0, p1}, Lcom/mr/elaris/HookEntry;->setRuntimeString(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_8
    return v8

    .line 199
    :cond_9
    const-string p0, "commit backup failed"

    .line 200
    .line 201
    invoke-static {p0}, Lu2;->b(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return v2

    .line 205
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 206
    .line 207
    const-string p1, "empty backup"

    .line 208
    .line 209
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p0

    .line 213
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 214
    .line 215
    const-string p1, "unexpected backup type"

    .line 216
    .line 217
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p0
.end method

.method private static declared-synchronized installResultHook()V
    .locals 3

    .line 1
    const-class v0, Lcom/mr/elaris/InAppSettingsConfigBackupPage;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->resultHookInstalled:Z
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
    sput-boolean v1, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->resultHookInstalled:Z

    .line 12
    .line 13
    new-instance v1, Lcom/mr/elaris/InAppSettingsConfigBackupPage$4;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/mr/elaris/InAppSettingsConfigBackupPage$4;-><init>()V

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x2013

    .line 19
    .line 20
    invoke-static {v2, v1}, Ld;->a(ILc;)I

    .line 21
    .line 22
    .line 23
    const/16 v2, 0x2014

    .line 24
    .line 25
    invoke-static {v2, v1}, Ld;->a(ILc;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    throw v1
.end method

.method private static openExportPicker(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->activeSettings:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->installResultHook()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/content/Intent;

    .line 12
    .line 13
    const-string v1, "android.intent.action.CREATE_DOCUMENT"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "android.intent.category.OPENABLE"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    const-string v1, "application/json"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    const-string v1, "android.intent.extra.TITLE"

    .line 29
    .line 30
    invoke-static {}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->backupFileName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 42
    .line 43
    const/16 v2, 0x2013

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 46
    .line 47
    .line 48
    const-string v0, "\u8bf7\u9009\u62e9\u914d\u7f6e\u5907\u4efd\u4fdd\u5b58\u4f4d\u7f6e"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    const-string v1, "\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u4fdd\u5b58\u5668"

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "settings backup export picker failed: "

    .line 63
    .line 64
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->refocusElarisPage(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private static openImportPicker(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V
    .locals 8

    .line 1
    const-string v0, "\u8bf7\u9009\u62e9 Elaris \u914d\u7f6e\u5907\u4efd\u6587\u4ef6"

    .line 2
    .line 3
    const-string v1, "*/*"

    .line 4
    .line 5
    const-string v2, "android.intent.category.OPENABLE"

    .line 6
    .line 7
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sput-object v3, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->activeSettings:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    const/16 v3, 0x2014

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->installResultHook()V

    .line 18
    .line 19
    .line 20
    new-instance v5, Landroid/content/Intent;

    .line 21
    .line 22
    const-string v6, "android.intent.action.OPEN_DOCUMENT"

    .line 23
    .line 24
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    iget-object v6, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 37
    .line 38
    invoke-virtual {v6, v5, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v5

    .line 46
    :try_start_1
    new-instance v6, Landroid/content/Intent;

    .line 47
    .line 48
    const-string v7, "android.intent.action.GET_CONTENT"

    .line 49
    .line 50
    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 63
    .line 64
    invoke-virtual {v1, v6, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_1
    const-string v0, "\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v1, "settings backup import picker failed: "

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->refocusElarisPage(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method private static readText(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    const/16 p0, 0x2000

    .line 18
    .line 19
    new-array p0, p0, [B

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    move v2, p1

    .line 23
    :goto_0
    invoke-virtual {v1, p0}, Ljava/io/InputStream;->read([B)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-ltz v3, :cond_2

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    add-int/2addr v2, v3

    .line 33
    const/high16 v4, 0x100000

    .line 34
    .line 35
    if-gt v2, v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, p0, p1, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string p1, "backup file too large"

    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_2
    new-instance p0, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v2, "UTF-8"

    .line 58
    .line 59
    invoke-direct {p0, p1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    .line 65
    :catchall_1
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    .line 67
    .line 68
    :catchall_2
    return-object p0

    .line 69
    :cond_3
    :try_start_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string p1, "backup input stream is null"

    .line 72
    .line 73
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 77
    :goto_1
    if-eqz v1, :cond_4

    .line 78
    .line 79
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 80
    .line 81
    .line 82
    :catchall_3
    :cond_4
    :try_start_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 83
    .line 84
    .line 85
    :catchall_4
    throw p0
.end method

.method private static writeBackup(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 10

    .line 1
    const-string v0, "settings"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v2, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lorg/json/JSONObject;

    .line 14
    .line 15
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v4, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v5, Lcom/mr/elaris/Prefs;->BOOLEAN_KEYS:[Ljava/lang/String;

    .line 24
    .line 25
    array-length v6, v5

    .line 26
    move v7, v1

    .line 27
    :goto_0
    if-ge v7, v6, :cond_0

    .line 28
    .line 29
    aget-object v8, v5, v7

    .line 30
    .line 31
    invoke-static {v0, v8}, Lcom/mr/elaris/Prefs;->readBoolean(Landroid/content/SharedPreferences;Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    invoke-virtual {v3, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v7, v7, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v5, Lcom/mr/elaris/Prefs;->STRING_KEYS:[Ljava/lang/String;

    .line 42
    .line 43
    array-length v6, v5

    .line 44
    :goto_1
    if-ge v1, v6, :cond_1

    .line 45
    .line 46
    aget-object v7, v5, v1

    .line 47
    .line 48
    invoke-static {v0, v7}, Lcom/mr/elaris/Prefs;->readString(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const-string v0, "type"

    .line 59
    .line 60
    const-string v1, "elaris_settings_backup"

    .line 61
    .line 62
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    const-string v0, "version"

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    const-string v0, "createdAt"

    .line 72
    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    invoke-virtual {v2, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    const-string v0, "booleans"

    .line 81
    .line 82
    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    const-string v0, "strings"

    .line 86
    .line 87
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const-string v1, "wt"

    .line 96
    .line 97
    invoke-virtual {p0, p1, v1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    const/4 p0, 0x2

    .line 104
    invoke-virtual {v2, p0}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const-string p1, "UTF-8"

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 118
    .line 119
    .line 120
    :try_start_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    .line 123
    :catchall_0
    return-void

    .line 124
    :catchall_1
    move-exception p0

    .line 125
    goto :goto_2

    .line 126
    :cond_2
    :try_start_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    const-string p1, "backup output stream is null"

    .line 129
    .line 130
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 134
    :goto_2
    if-eqz v0, :cond_3

    .line 135
    .line 136
    :try_start_3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 137
    .line 138
    .line 139
    :catchall_2
    :cond_3
    throw p0
.end method
