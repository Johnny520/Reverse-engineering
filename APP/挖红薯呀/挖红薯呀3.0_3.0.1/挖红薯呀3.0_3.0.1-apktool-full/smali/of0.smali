.class public final synthetic Lof0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;IIII)V
    .locals 0

    .line 1
    iput p6, p0, Lof0;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lof0;->e:Landroid/content/Context;

    .line 4
    .line 5
    iput p3, p0, Lof0;->f:I

    .line 6
    .line 7
    iput p4, p0, Lof0;->g:I

    .line 8
    .line 9
    iput p5, p0, Lof0;->h:I

    .line 10
    .line 11
    iput-object p2, p0, Lof0;->i:Landroid/content/SharedPreferences;

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
    iget v0, p0, Lof0;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v5, p0, Lof0;->i:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    move-object v6, p1

    .line 9
    check-cast v6, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    iget-object v1, p0, Lof0;->e:Landroid/content/Context;

    .line 12
    .line 13
    iget v2, p0, Lof0;->f:I

    .line 14
    .line 15
    iget v3, p0, Lof0;->g:I

    .line 16
    .line 17
    iget v4, p0, Lof0;->h:I

    .line 18
    .line 19
    invoke-static/range {v1 .. v6}, Lvf0;->C0(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    iget-object v4, p0, Lof0;->i:Landroid/content/SharedPreferences;

    .line 25
    .line 26
    move-object v5, p1

    .line 27
    check-cast v5, Landroid/widget/LinearLayout;

    .line 28
    .line 29
    iget-object v0, p0, Lof0;->e:Landroid/content/Context;

    .line 30
    .line 31
    iget v1, p0, Lof0;->f:I

    .line 32
    .line 33
    iget v2, p0, Lof0;->g:I

    .line 34
    .line 35
    iget v3, p0, Lof0;->h:I

    .line 36
    .line 37
    invoke-static/range {v0 .. v5}, Lvf0;->U(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
