.class public final synthetic La71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Landroid/view/View;

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Lum1;

.field public final synthetic ι:Ljava/util/List;

.field public final synthetic κ:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/app/Activity;Lum1;Lum1;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La71;->ε:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, La71;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, La71;->η:Lum1;

    .line 9
    .line 10
    iput-object p4, p0, La71;->θ:Lum1;

    .line 11
    .line 12
    iput-object p5, p0, La71;->ι:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p6, p0, La71;->κ:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v3, p0, La71;->ζ:Landroid/app/Activity;

    .line 2
    .line 3
    iget-object v1, p0, La71;->η:Lum1;

    .line 4
    .line 5
    iget-object v2, p0, La71;->θ:Lum1;

    .line 6
    .line 7
    iget-object v4, p0, La71;->ι:Ljava/util/List;

    .line 8
    .line 9
    iget-boolean v5, p0, La71;->κ:Z

    .line 10
    .line 11
    check-cast p1, Lj71;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p1, Lj71;->η:Z

    .line 17
    .line 18
    iget-object v6, p1, Lj71;->α:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    :try_start_0
    iget-object v8, p1, Lj71;->θ:Lp70;

    .line 22
    .line 23
    invoke-interface {v8}, Lp70;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-boolean p1, p1, Lj71;->γ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    iget-object p0, p0, La71;->ε:Landroid/view/View;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    :try_start_1
    sget-object p1, Lq71;->α:Lq71;

    .line 35
    .line 36
    invoke-static {p0}, Lq71;->μ(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p0, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    if-nez v0, :cond_1

    .line 44
    .line 45
    const-string p1, "\u4e66\u7b7e"

    .line 46
    .line 47
    invoke-static {v6, p1, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    new-instance v0, Lxg0;

    .line 54
    .line 55
    invoke-direct/range {v0 .. v5}, Lxg0;-><init>(Lum1;Lum1;Landroid/app/Activity;Ljava/util/List;Z)V

    .line 56
    .line 57
    .line 58
    const-wide/16 v1, 0x78

    .line 59
    .line 60
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :goto_0
    const-string p1, "\u64cd\u4f5c\u9762\u677f\u6267\u884c\u5931\u8d25: "

    .line 65
    .line 66
    invoke-virtual {p1, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string v0, "DYHelper"

    .line 71
    .line 72
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    const-string p0, "\u6267\u884c\u5931\u8d25"

    .line 76
    .line 77
    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {v3, p0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 86
    .line 87
    .line 88
    :cond_1
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 89
    .line 90
    return-object p0
.end method
