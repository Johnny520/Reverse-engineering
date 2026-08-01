.class public final Lky;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lgr;


# instance fields
.field public final synthetic ε:Ljr0;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/EmojiCompatInitializer;Ljr0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lky;->ε:Ljr0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final θ(Lhr0;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lio;->α(Landroid/os/Looper;)Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lmd;

    .line 10
    .line 11
    invoke-direct {v0}, Lmd;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide/16 v1, 0x1f4

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lky;->ε:Ljr0;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljr0;->ζ(Lgr0;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
