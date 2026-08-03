.class public final synthetic Lfb/m1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/speech/tts/TextToSpeech$OnInitListener;


# virtual methods
.method public final onInit(I)V
    .locals 2

    .line 1
    sget-object v0, Lfb/o1;->a:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lfb/n1;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lfb/n1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
