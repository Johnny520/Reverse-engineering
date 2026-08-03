.class public abstract Lfb/o1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Landroid/os/Handler;

.field public static b:Landroid/speech/tts/TextToSpeech;

.field public static c:Z

.field public static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lfb/o1;->a:Landroid/os/Handler;

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    sput-object v0, Lfb/o1;->d:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lfb/o1;->b:Landroid/speech/tts/TextToSpeech;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-string v4, "hchat_script_agent_"

    .line 15
    .line 16
    invoke-static {v2, v3, v4}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v0, p0, v3, v1, v2}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/CharSequence;ILandroid/os/Bundle;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
