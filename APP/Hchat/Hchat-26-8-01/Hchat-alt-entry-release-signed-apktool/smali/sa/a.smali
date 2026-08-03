.class public final synthetic Lsa/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/speech/tts/TextToSpeech$OnInitListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsa/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsa/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onInit(I)V
    .locals 4

    .line 1
    iget v0, p0, Lsa/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsa/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lua/k;

    .line 9
    .line 10
    iget-object v1, v0, Lua/k;->c:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v2, Lf0/d;

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    invoke-direct {v2, p1, v3, v0}, Lf0/d;-><init>(IILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lsa/a;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lra/c;

    .line 25
    .line 26
    iget-object v1, v0, Lra/c;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/os/Handler;

    .line 29
    .line 30
    new-instance v2, Lf0/d;

    .line 31
    .line 32
    const/4 v3, 0x3

    .line 33
    invoke-direct {v2, p1, v3, v0}, Lf0/d;-><init>(IILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
