.class public final synthetic Lfb/n1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lfb/n1;->g:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lfb/n1;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    sput-boolean v0, Lfb/o1;->c:Z

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    sget-object v0, Lfb/o1;->b:Landroid/speech/tts/TextToSpeech;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    sput-object v0, Lfb/o1;->b:Landroid/speech/tts/TextToSpeech;

    .line 23
    .line 24
    sput-object v1, Lfb/o1;->d:Ljava/lang/String;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    sget-object v0, Lfb/o1;->b:Landroid/speech/tts/TextToSpeech;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v2}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    .line 36
    .line 37
    .line 38
    :cond_3
    sget-object v0, Lfb/o1;->d:Ljava/lang/String;

    .line 39
    .line 40
    sput-object v1, Lfb/o1;->d:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    invoke-static {v0}, Lfb/o1;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    return-void
.end method
