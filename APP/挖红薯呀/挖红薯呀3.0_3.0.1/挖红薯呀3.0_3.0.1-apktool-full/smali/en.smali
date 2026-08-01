.class public final synthetic Len;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput p2, p0, Len;->d:I

    iput-object p3, p0, Len;->f:Ljava/lang/Object;

    iput p1, p0, Len;->e:I

    iput-object p4, p0, Len;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkp;Landroid/content/Context;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Len;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Len;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Len;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Len;->e:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Len;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Len;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Len;->e:I

    .line 6
    .line 7
    iget-object p0, p0, Len;->f:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Landroid/content/Context;

    .line 13
    .line 14
    check-cast v1, Landroid/app/Dialog;

    .line 15
    .line 16
    invoke-static {p0, v2, v1}, Lvf0;->m0(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast p0, Lkp;

    .line 21
    .line 22
    check-cast v1, Landroid/content/Context;

    .line 23
    .line 24
    invoke-static {p0, v1, v2}, Lob0;->b(Lkp;Landroid/content/Context;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    check-cast p0, Lfn;

    .line 29
    .line 30
    iget-object p0, p0, Lfn;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lss0;

    .line 33
    .line 34
    invoke-interface {p0, v2, v1}, Lss0;->f(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
