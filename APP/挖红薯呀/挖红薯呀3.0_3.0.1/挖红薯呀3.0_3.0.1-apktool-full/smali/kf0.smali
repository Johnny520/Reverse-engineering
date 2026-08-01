.class public final synthetic Lkf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/content/SharedPreferences;

.field public final synthetic f:Landroid/content/Context;

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;IIIIILandroid/widget/TextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lkf0;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkf0;->e:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iput-object p2, p0, Lkf0;->f:Landroid/content/Context;

    .line 10
    .line 11
    iput p3, p0, Lkf0;->g:I

    .line 12
    .line 13
    iput p4, p0, Lkf0;->h:I

    .line 14
    .line 15
    iput p5, p0, Lkf0;->i:I

    .line 16
    .line 17
    iput p6, p0, Lkf0;->j:I

    .line 18
    .line 19
    iput p7, p0, Lkf0;->k:I

    .line 20
    .line 21
    iput-object p8, p0, Lkf0;->l:Landroid/view/View;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;IILandroid/widget/LinearLayout;III)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lkf0;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkf0;->e:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lkf0;->f:Landroid/content/Context;

    iput p3, p0, Lkf0;->g:I

    iput p4, p0, Lkf0;->h:I

    iput-object p5, p0, Lkf0;->l:Landroid/view/View;

    iput p6, p0, Lkf0;->i:I

    iput p7, p0, Lkf0;->j:I

    iput p8, p0, Lkf0;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lkf0;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lkf0;->l:Landroid/view/View;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v9, v1

    .line 9
    check-cast v9, Landroid/widget/TextView;

    .line 10
    .line 11
    move-object v10, p1

    .line 12
    check-cast v10, Landroid/widget/LinearLayout;

    .line 13
    .line 14
    iget-object v2, p0, Lkf0;->e:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    iget-object v3, p0, Lkf0;->f:Landroid/content/Context;

    .line 17
    .line 18
    iget v4, p0, Lkf0;->g:I

    .line 19
    .line 20
    iget v5, p0, Lkf0;->h:I

    .line 21
    .line 22
    iget v6, p0, Lkf0;->i:I

    .line 23
    .line 24
    iget v7, p0, Lkf0;->j:I

    .line 25
    .line 26
    iget v8, p0, Lkf0;->k:I

    .line 27
    .line 28
    invoke-static/range {v2 .. v10}, Lvf0;->t0(Landroid/content/SharedPreferences;Landroid/content/Context;IIIIILandroid/widget/TextView;Landroid/widget/LinearLayout;)Lna1;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    move-object v4, v1

    .line 34
    check-cast v4, Landroid/widget/LinearLayout;

    .line 35
    .line 36
    iget v7, p0, Lkf0;->k:I

    .line 37
    .line 38
    move-object v8, p1

    .line 39
    check-cast v8, Landroid/widget/LinearLayout;

    .line 40
    .line 41
    iget-object v0, p0, Lkf0;->e:Landroid/content/SharedPreferences;

    .line 42
    .line 43
    iget-object v1, p0, Lkf0;->f:Landroid/content/Context;

    .line 44
    .line 45
    iget v2, p0, Lkf0;->g:I

    .line 46
    .line 47
    iget v3, p0, Lkf0;->h:I

    .line 48
    .line 49
    iget v5, p0, Lkf0;->i:I

    .line 50
    .line 51
    iget v6, p0, Lkf0;->j:I

    .line 52
    .line 53
    invoke-static/range {v0 .. v8}, Lvf0;->H(Landroid/content/SharedPreferences;Landroid/content/Context;IILandroid/widget/LinearLayout;IIILandroid/widget/LinearLayout;)Lna1;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
