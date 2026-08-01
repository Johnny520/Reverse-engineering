.class public final synthetic Lgk0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p6, p0, Lgk0;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lgk0;->e:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lgk0;->f:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lgk0;->g:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lgk0;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p5, p0, Lgk0;->i:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lgk0;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgk0;->h:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Lgk0;->i:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lgk0;->e:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, p0, Lgk0;->f:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p0, p0, Lgk0;->g:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v2, v3, p0, v0, v1}, Lhk0;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lgk0;->h:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p0, Lgk0;->i:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lgk0;->e:Landroid/content/Context;

    .line 25
    .line 26
    iget-object v3, p0, Lgk0;->f:Ljava/lang/String;

    .line 27
    .line 28
    iget-object p0, p0, Lgk0;->g:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2, v3, p0, v0, v1}, Lhk0;->r(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
