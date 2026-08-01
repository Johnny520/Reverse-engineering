.class public final synthetic Lgf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;II)V
    .locals 0

    .line 1
    iput p4, p0, Lgf0;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lgf0;->e:Landroid/content/Context;

    .line 4
    .line 5
    iput p1, p0, Lgf0;->f:I

    .line 6
    .line 7
    iput p3, p0, Lgf0;->g:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lgf0;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lgf0;->f:I

    .line 7
    .line 8
    iget v1, p0, Lgf0;->g:I

    .line 9
    .line 10
    iget-object p0, p0, Lgf0;->e:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lvf0;->n(Landroid/content/Context;II)Lna1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    iget v0, p0, Lgf0;->f:I

    .line 18
    .line 19
    iget v1, p0, Lgf0;->g:I

    .line 20
    .line 21
    iget-object p0, p0, Lgf0;->e:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {p0, v0, v1}, Lvf0;->F(Landroid/content/Context;II)Lna1;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    iget v0, p0, Lgf0;->f:I

    .line 29
    .line 30
    iget v1, p0, Lgf0;->g:I

    .line 31
    .line 32
    iget-object p0, p0, Lgf0;->e:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {p0, v0, v1}, Lvf0;->F0(Landroid/content/Context;II)Lna1;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
