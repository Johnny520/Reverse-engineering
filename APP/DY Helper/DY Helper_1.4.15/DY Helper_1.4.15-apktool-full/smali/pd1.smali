.class public final synthetic Lpd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Lvd1;

.field public final synthetic θ:I

.field public final synthetic ι:Ljava/lang/Integer;

.field public final synthetic κ:Ljava/lang/Long;

.field public final synthetic λ:Z

.field public final synthetic μ:Z

.field public final synthetic ν:La80;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;Lvd1;ILjava/lang/Integer;Ljava/lang/Long;ZZLa80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpd1;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lpd1;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lpd1;->η:Lvd1;

    .line 9
    .line 10
    iput p4, p0, Lpd1;->θ:I

    .line 11
    .line 12
    iput-object p5, p0, Lpd1;->ι:Ljava/lang/Integer;

    .line 13
    .line 14
    iput-object p6, p0, Lpd1;->κ:Ljava/lang/Long;

    .line 15
    .line 16
    iput-boolean p7, p0, Lpd1;->λ:Z

    .line 17
    .line 18
    iput-boolean p8, p0, Lpd1;->μ:Z

    .line 19
    .line 20
    iput-object p9, p0, Lpd1;->ν:La80;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v1, p0, Lpd1;->ε:Landroid/app/Activity;

    .line 2
    .line 3
    iget-object v2, p0, Lpd1;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Lpd1;->η:Lvd1;

    .line 6
    .line 7
    iget v4, p0, Lpd1;->θ:I

    .line 8
    .line 9
    iget-object v5, p0, Lpd1;->ι:Ljava/lang/Integer;

    .line 10
    .line 11
    iget-object v6, p0, Lpd1;->κ:Ljava/lang/Long;

    .line 12
    .line 13
    iget-boolean v7, p0, Lpd1;->λ:Z

    .line 14
    .line 15
    iget-boolean v8, p0, Lpd1;->μ:Z

    .line 16
    .line 17
    iget-object v9, p0, Lpd1;->ν:La80;

    .line 18
    .line 19
    :try_start_0
    invoke-static/range {v1 .. v9}, Lxd1;->ν(Landroid/app/Activity;Ljava/lang/String;Lvd1;ILjava/lang/Integer;Ljava/lang/Long;ZZLa80;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    move-object p0, v0

    .line 27
    new-instance v0, Leo1;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    const-string v0, "DYHelper"

    .line 40
    .line 41
    const-string v2, "\u6253\u5f00\u8425\u5730\u79cd\u5b50\u9009\u62e9\u9762\u677f\u5931\u8d25"

    .line 42
    .line 43
    invoke-static {v0, v2, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-nez p0, :cond_0

    .line 51
    .line 52
    const-string p0, ""

    .line 53
    .line 54
    :cond_0
    const-string v0, "\u6253\u5f00\u79cd\u5b50\u9009\u62e9\u9762\u677f\u5931\u8d25: "

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-static {v2, v1, v0, p0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method
