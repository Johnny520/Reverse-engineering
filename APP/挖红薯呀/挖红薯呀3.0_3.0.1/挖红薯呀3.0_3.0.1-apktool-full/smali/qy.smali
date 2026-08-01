.class public final synthetic Lqy;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Lqy;->d:I

    iput-object p1, p0, Lqy;->e:Landroid/content/Context;

    iput-object p2, p0, Lqy;->f:Ljava/lang/Object;

    iput-object p3, p0, Lqy;->g:Ljava/lang/Object;

    iput-object p4, p0, Lqy;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ln90$a;Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lqy;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqy;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lqy;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lqy;->e:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p4, p0, Lqy;->h:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lqy;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lqy;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lqy;->e:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, p0, Lqy;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lqy;->f:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Ln90$a;

    .line 15
    .line 16
    check-cast v3, Landroid/content/Context;

    .line 17
    .line 18
    check-cast v2, Landroid/app/Activity;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0, v3, v2, v1}, Lkf1;->j(Ln90$a;Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    check-cast p0, Ljava/lang/String;

    .line 27
    .line 28
    check-cast v3, Ljava/lang/String;

    .line 29
    .line 30
    check-cast v1, Lsw;

    .line 31
    .line 32
    invoke-static {v2, p0, v3, v1}, Lwb1;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lsw;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    check-cast v2, Landroid/app/Activity;

    .line 37
    .line 38
    check-cast p0, Ljava/lang/reflect/Method;

    .line 39
    .line 40
    check-cast v1, Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v2, p0, v3, v1}, Lwy;->f(Landroid/app/Activity;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
