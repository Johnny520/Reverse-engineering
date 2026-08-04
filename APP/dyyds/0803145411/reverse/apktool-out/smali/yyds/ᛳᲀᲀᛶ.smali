.class public final synthetic Lyyds/ᛳᲀᲀᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛳᲀᲀᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛳᲀᲀᛶ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛳᲀᲀᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛳᲀᲀᛶ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Landroid/content/ComponentName;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-class v1, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-wide v2, -0xf6f3e68a836eL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x6

    .line 33
    const/16 v3, 0x2e

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static {v1, v3, v4, v2}, Lyyds/ᛲᲇᛸᲇ;->ᛷᛶᛷᲀ(Ljava/lang/String;CII)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, -0x1

    .line 41
    if-ne v2, v3, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :goto_0
    const-wide v2, -0xf700e68a836eL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_0
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛳᛶᛵ()V

    .line 68
    .line 69
    .line 70
    return-object v1

    .line 71
    :pswitch_1
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᛱᛲ()V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :pswitch_2
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᛱᛲ()V

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :pswitch_3
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᛱᛲ()V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :pswitch_4
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛳᛶᛵ()V

    .line 92
    .line 93
    .line 94
    return-object v1

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
