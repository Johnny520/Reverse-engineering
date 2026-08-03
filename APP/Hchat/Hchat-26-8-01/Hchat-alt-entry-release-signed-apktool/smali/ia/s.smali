.class public final synthetic Lia/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lia/a0;

.field public final synthetic i:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Lia/a0;Landroid/content/SharedPreferences;I)V
    .locals 0

    .line 1
    iput p3, p0, Lia/s;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lia/s;->h:Lia/a0;

    .line 4
    .line 5
    iput-object p2, p0, Lia/s;->i:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lia/s;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lia/s;->h:Lia/a0;

    .line 7
    .line 8
    iget-object v1, p0, Lia/s;->i:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    iget-boolean v2, v0, Lia/a0;->n:Z

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-boolean v0, v0, Lia/a0;->o:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "fake_comment_hide_menu"

    .line 20
    .line 21
    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const-string v0, "fake_comment_enable"

    .line 28
    .line 29
    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    :cond_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :pswitch_0
    iget-object v0, p0, Lia/s;->h:Lia/a0;

    .line 42
    .line 43
    iget-object v1, p0, Lia/s;->i:Landroid/content/SharedPreferences;

    .line 44
    .line 45
    iget-boolean v0, v0, Lia/a0;->n:Z

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    const-string v0, "fake_like_hide_menu"

    .line 51
    .line 52
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    const-string v0, "fake_like_enable"

    .line 59
    .line 60
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
