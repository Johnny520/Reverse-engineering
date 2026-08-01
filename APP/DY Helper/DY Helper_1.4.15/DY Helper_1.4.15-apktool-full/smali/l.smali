.class public final Ll;
.super Ls1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic φ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ll;->φ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final φ(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, Ll;->φ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lk;

    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lk;-><init>(ILandroid/content/Intent;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_0
    new-instance p0, Lk;

    .line 13
    .line 14
    invoke-direct {p0, p1, p2}, Lk;-><init>(ILandroid/content/Intent;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    const/4 p0, -0x1

    .line 19
    if-eq p1, p0, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    if-nez p2, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    const-string p0, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 26
    .line 27
    invoke-virtual {p2, p0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string p1, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_5

    .line 38
    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    .line 43
    .line 44
    array-length v0, p1

    .line 45
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    array-length v0, p1

    .line 49
    const/4 v1, 0x0

    .line 50
    move v2, v1

    .line 51
    :goto_0
    if-ge v2, v0, :cond_4

    .line 52
    .line 53
    aget v3, p1, v2

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move v3, v1

    .line 60
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-static {p0}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0, p2}, Lxh;->ｋ(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Lex0;->Ξ(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    goto :goto_3

    .line 83
    :cond_5
    :goto_2
    sget-object p0, Lkz;->ε:Lkz;

    .line 84
    .line 85
    :goto_3
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
