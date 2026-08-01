.class public final synthetic Ldf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)V
    .locals 0

    .line 1
    iput p5, p0, Ldf0;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Ldf0;->e:Landroid/content/Context;

    .line 4
    .line 5
    iput p3, p0, Ldf0;->f:I

    .line 6
    .line 7
    iput p4, p0, Ldf0;->g:I

    .line 8
    .line 9
    iput-boolean p1, p0, Ldf0;->h:Z

    .line 10
    .line 11
    iput-object p6, p0, Ldf0;->i:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ldf0;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v5, p0, Ldf0;->i:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    move-object v6, p1

    .line 9
    check-cast v6, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    iget-object v1, p0, Ldf0;->e:Landroid/content/Context;

    .line 12
    .line 13
    iget v2, p0, Ldf0;->f:I

    .line 14
    .line 15
    iget v3, p0, Ldf0;->g:I

    .line 16
    .line 17
    iget-boolean v4, p0, Ldf0;->h:Z

    .line 18
    .line 19
    invoke-static/range {v1 .. v6}, Lvf0;->i0(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    iget-object v4, p0, Ldf0;->i:Landroid/content/SharedPreferences;

    .line 25
    .line 26
    move-object v5, p1

    .line 27
    check-cast v5, Landroid/widget/LinearLayout;

    .line 28
    .line 29
    iget-object v0, p0, Ldf0;->e:Landroid/content/Context;

    .line 30
    .line 31
    iget v1, p0, Ldf0;->f:I

    .line 32
    .line 33
    iget v2, p0, Ldf0;->g:I

    .line 34
    .line 35
    iget-boolean v3, p0, Ldf0;->h:Z

    .line 36
    .line 37
    invoke-static/range {v0 .. v5}, Lvf0;->D(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_1
    iget-object v4, p0, Ldf0;->i:Landroid/content/SharedPreferences;

    .line 43
    .line 44
    move-object v5, p1

    .line 45
    check-cast v5, Landroid/widget/LinearLayout;

    .line 46
    .line 47
    iget-object v0, p0, Ldf0;->e:Landroid/content/Context;

    .line 48
    .line 49
    iget v1, p0, Ldf0;->f:I

    .line 50
    .line 51
    iget v2, p0, Ldf0;->g:I

    .line 52
    .line 53
    iget-boolean v3, p0, Ldf0;->h:Z

    .line 54
    .line 55
    invoke-static/range {v0 .. v5}, Lvf0;->c0(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    iget-object v4, p0, Ldf0;->i:Landroid/content/SharedPreferences;

    .line 61
    .line 62
    move-object v5, p1

    .line 63
    check-cast v5, Landroid/widget/LinearLayout;

    .line 64
    .line 65
    iget-object v0, p0, Ldf0;->e:Landroid/content/Context;

    .line 66
    .line 67
    iget v1, p0, Ldf0;->f:I

    .line 68
    .line 69
    iget v2, p0, Ldf0;->g:I

    .line 70
    .line 71
    iget-boolean v3, p0, Ldf0;->h:Z

    .line 72
    .line 73
    invoke-static/range {v0 .. v5}, Lvf0;->P0(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
