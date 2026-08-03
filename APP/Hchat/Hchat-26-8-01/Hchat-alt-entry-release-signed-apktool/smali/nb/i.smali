.class public final synthetic Lnb/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/speech/tts/TextToSpeech$OnInitListener;


# instance fields
.field public final synthetic a:Lnb/w;

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lnb/w;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnb/i;->a:Lnb/w;

    .line 5
    .line 6
    iput-wide p2, p0, Lnb/i;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lnb/i;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lnb/i;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onInit(I)V
    .locals 8

    .line 1
    iget-object v1, p0, Lnb/i;->a:Lnb/w;

    .line 2
    .line 3
    iget-object v7, v1, Lnb/w;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v0, Lnb/g;

    .line 6
    .line 7
    iget-wide v2, p0, Lnb/i;->b:J

    .line 8
    .line 9
    iget-object v4, p0, Lnb/i;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lnb/i;->d:Ljava/lang/String;

    .line 12
    .line 13
    move v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lnb/g;-><init>(Lnb/w;JLjava/lang/String;Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method
