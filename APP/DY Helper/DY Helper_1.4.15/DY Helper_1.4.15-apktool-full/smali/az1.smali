.class public final synthetic Laz1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:La80;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Landroid/widget/EditText;

.field public final synthetic ι:Z

.field public final synthetic κ:Lum1;

.field public final synthetic λ:Lum1;

.field public final synthetic μ:Lum1;

.field public final synthetic ν:Lum1;

.field public final synthetic ξ:Lum1;

.field public final synthetic ο:Lum1;

.field public final synthetic π:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;La80;Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laz1;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Laz1;->ζ:La80;

    .line 7
    .line 8
    iput-object p3, p0, Laz1;->η:Lum1;

    .line 9
    .line 10
    iput-object p4, p0, Laz1;->θ:Landroid/widget/EditText;

    .line 11
    .line 12
    iput-boolean p5, p0, Laz1;->ι:Z

    .line 13
    .line 14
    iput-object p6, p0, Laz1;->κ:Lum1;

    .line 15
    .line 16
    iput-object p7, p0, Laz1;->λ:Lum1;

    .line 17
    .line 18
    iput-object p8, p0, Laz1;->μ:Lum1;

    .line 19
    .line 20
    iput-object p9, p0, Laz1;->ν:Lum1;

    .line 21
    .line 22
    iput-object p10, p0, Laz1;->ξ:Lum1;

    .line 23
    .line 24
    iput-object p11, p0, Laz1;->ο:Lum1;

    .line 25
    .line 26
    iput-object p12, p0, Laz1;->π:Landroid/widget/TextView;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Laz1;->ζ:La80;

    .line 2
    .line 3
    iget-object v1, p0, Laz1;->η:Lum1;

    .line 4
    .line 5
    iget-object v2, p0, Laz1;->θ:Landroid/widget/EditText;

    .line 6
    .line 7
    iget-boolean v3, p0, Laz1;->ι:Z

    .line 8
    .line 9
    iget-object v4, p0, Laz1;->κ:Lum1;

    .line 10
    .line 11
    iget-object v5, p0, Laz1;->λ:Lum1;

    .line 12
    .line 13
    iget-object v6, p0, Laz1;->μ:Lum1;

    .line 14
    .line 15
    iget-object v7, p0, Laz1;->ν:Lum1;

    .line 16
    .line 17
    iget-object v8, p0, Laz1;->ξ:Lum1;

    .line 18
    .line 19
    iget-object v9, p0, Laz1;->ο:Lum1;

    .line 20
    .line 21
    :try_start_0
    invoke-static/range {v1 .. v9}, Ljz1;->χ(Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;)Lmy1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    new-instance v1, Leo1;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object v0, v1

    .line 39
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_1
    const-string v1, "\u6d4b\u8bd5\u53d1\u9001\u5f02\u5e38: "

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    new-instance v1, Ljg1;

    .line 69
    .line 70
    const/4 v2, 0x6

    .line 71
    iget-object v3, p0, Laz1;->π:Landroid/widget/TextView;

    .line 72
    .line 73
    iget-object p0, p0, Laz1;->ε:Landroid/app/Activity;

    .line 74
    .line 75
    invoke-direct {v1, v3, p0, v0, v2}, Ljg1;-><init>(Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/Comparable;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
