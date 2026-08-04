.class public final synthetic Lyyds/ᛸᲇᲈᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛶᛷᛳᛷ;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

.field public final synthetic ᛵᛸᛸᛷ:Z


# direct methods
.method public synthetic constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᲇᲈᛶ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 5
    .line 6
    iput-boolean p2, p0, Lyyds/ᛸᲇᲈᛶ;->ᛵᛸᛸᛷ:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛸᲇᲈᛶ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 2
    .line 3
    check-cast p1, Lyyds/ᛵᲀᲀᛱ;

    .line 4
    .line 5
    sget-object p1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v1, v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛱᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 12
    .line 13
    invoke-virtual {v1}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    iget-boolean p0, p0, Lyyds/ᛸᲇᲈᛶ;->ᛵᛸᛸᛷ:Z

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    move p0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x2

    .line 27
    :goto_0
    :try_start_1
    invoke-virtual {p1, v1, p0, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p0, p1

    .line 40
    :goto_1
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    const-wide v1, -0xf655e68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-nez p0, :cond_1

    .line 61
    .line 62
    const-wide v2, -0xf65fe68a836eL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :cond_1
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 80
    .line 81
    .line 82
    :cond_2
    return p1
.end method
