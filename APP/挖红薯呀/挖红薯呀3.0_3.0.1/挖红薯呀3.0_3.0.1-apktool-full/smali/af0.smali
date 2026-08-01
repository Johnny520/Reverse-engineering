.class public final synthetic Laf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


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
    iput p6, p0, Laf0;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Laf0;->e:Landroid/content/Context;

    .line 4
    .line 5
    iput p3, p0, Laf0;->f:I

    .line 6
    .line 7
    iput p4, p0, Laf0;->g:I

    .line 8
    .line 9
    iput p5, p0, Laf0;->h:I

    .line 10
    .line 11
    iput-object p2, p0, Laf0;->i:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Laf0;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Laf0;->h:I

    .line 7
    .line 8
    iget-object v1, p0, Laf0;->i:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    iget-object v2, p0, Laf0;->e:Landroid/content/Context;

    .line 11
    .line 12
    iget v3, p0, Laf0;->f:I

    .line 13
    .line 14
    iget p0, p0, Laf0;->g:I

    .line 15
    .line 16
    invoke-static {v2, v3, p0, v0, v1}, Lvf0;->z0(Landroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget v0, p0, Laf0;->h:I

    .line 22
    .line 23
    iget-object v1, p0, Laf0;->i:Landroid/content/SharedPreferences;

    .line 24
    .line 25
    iget-object v2, p0, Laf0;->e:Landroid/content/Context;

    .line 26
    .line 27
    iget v3, p0, Laf0;->f:I

    .line 28
    .line 29
    iget p0, p0, Laf0;->g:I

    .line 30
    .line 31
    invoke-static {v2, v3, p0, v0, v1}, Lvf0;->M(Landroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
