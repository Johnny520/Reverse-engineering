.class public final synthetic Lff0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Landroid/content/Context;

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;IIIILandroid/app/Dialog;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lff0;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lff0;->f:Landroid/content/Context;

    .line 8
    .line 9
    iput p2, p0, Lff0;->g:I

    .line 10
    .line 11
    iput p3, p0, Lff0;->h:I

    .line 12
    .line 13
    iput p4, p0, Lff0;->i:I

    .line 14
    .line 15
    iput p5, p0, Lff0;->j:I

    .line 16
    .line 17
    iput-object p6, p0, Lff0;->e:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;IIII)V
    .locals 1

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lff0;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff0;->f:Landroid/content/Context;

    iput-object p2, p0, Lff0;->e:Ljava/lang/Object;

    iput p3, p0, Lff0;->g:I

    iput p4, p0, Lff0;->h:I

    iput p5, p0, Lff0;->i:I

    iput p6, p0, Lff0;->j:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;IIII)V
    .locals 1

    .line 21
    const/4 v0, 0x1

    iput v0, p0, Lff0;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff0;->e:Ljava/lang/Object;

    iput-object p2, p0, Lff0;->f:Landroid/content/Context;

    iput p3, p0, Lff0;->g:I

    iput p4, p0, Lff0;->h:I

    iput p5, p0, Lff0;->i:I

    iput p6, p0, Lff0;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lff0;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lff0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v7, v1

    .line 9
    check-cast v7, Landroid/app/Dialog;

    .line 10
    .line 11
    move-object v8, p1

    .line 12
    check-cast v8, Landroid/widget/LinearLayout;

    .line 13
    .line 14
    iget-object v2, p0, Lff0;->f:Landroid/content/Context;

    .line 15
    .line 16
    iget v3, p0, Lff0;->g:I

    .line 17
    .line 18
    iget v4, p0, Lff0;->h:I

    .line 19
    .line 20
    iget v5, p0, Lff0;->i:I

    .line 21
    .line 22
    iget v6, p0, Lff0;->j:I

    .line 23
    .line 24
    invoke-static/range {v2 .. v8}, Lvf0;->r(Landroid/content/Context;IIIILandroid/app/Dialog;Landroid/widget/LinearLayout;)Lna1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast v1, Landroid/content/SharedPreferences;

    .line 30
    .line 31
    iget v5, p0, Lff0;->j:I

    .line 32
    .line 33
    move-object v6, p1

    .line 34
    check-cast v6, Landroid/widget/LinearLayout;

    .line 35
    .line 36
    iget-object v0, p0, Lff0;->f:Landroid/content/Context;

    .line 37
    .line 38
    iget v2, p0, Lff0;->g:I

    .line 39
    .line 40
    iget v3, p0, Lff0;->h:I

    .line 41
    .line 42
    iget v4, p0, Lff0;->i:I

    .line 43
    .line 44
    invoke-static/range {v0 .. v6}, Lvf0;->M0(Landroid/content/Context;Landroid/content/SharedPreferences;IIIILandroid/widget/LinearLayout;)Lna1;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_1
    check-cast v1, Landroid/content/SharedPreferences;

    .line 50
    .line 51
    iget v5, p0, Lff0;->j:I

    .line 52
    .line 53
    move-object v6, p1

    .line 54
    check-cast v6, Landroid/widget/LinearLayout;

    .line 55
    .line 56
    iget-object v0, p0, Lff0;->f:Landroid/content/Context;

    .line 57
    .line 58
    iget v2, p0, Lff0;->g:I

    .line 59
    .line 60
    iget v3, p0, Lff0;->h:I

    .line 61
    .line 62
    iget v4, p0, Lff0;->i:I

    .line 63
    .line 64
    invoke-static/range {v0 .. v6}, Lvf0;->v(Landroid/content/Context;Landroid/content/SharedPreferences;IIIILandroid/widget/LinearLayout;)Lna1;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
