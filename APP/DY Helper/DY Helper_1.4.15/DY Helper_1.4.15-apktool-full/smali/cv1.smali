.class public final synthetic Lcv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcom/example/dyhelper/ui/SettingsUIComponents;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/SettingsUIComponents;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcv1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lcv1;->ζ:Lcom/example/dyhelper/ui/SettingsUIComponents;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lcv1;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lcv1;->ζ:Lcom/example/dyhelper/ui/SettingsUIComponents;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/example/dyhelper/ui/SettingsUIComponents;->ε:I

    .line 9
    .line 10
    new-instance v0, Lcl1;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-direct {v0, v1, p0}, Lcl1;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    sget v0, Lcom/example/dyhelper/ui/SettingsUIComponents;->ε:I

    .line 18
    .line 19
    const-string v0, "dyhelper_prefs"

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    :try_start_0
    const-string v2, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 23
    .line 24
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v4, "\u65e0\u6cd5\u8bbf\u95ee\u5bbf\u4e3b SP\uff0c\u4f7f\u7528\u672c\u5730: "

    .line 46
    .line 47
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v3, "DYHelper"

    .line 58
    .line 59
    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_0
    return-object p0

    .line 67
    :pswitch_1
    sget v0, Lcom/example/dyhelper/ui/SettingsUIComponents;->ε:I

    .line 68
    .line 69
    new-instance v0, Lrk0;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 80
    .line 81
    const/16 p0, 0x1b

    .line 82
    .line 83
    invoke-direct {v0, p0}, Lrk0;-><init>(I)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
