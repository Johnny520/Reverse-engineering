.class public final synthetic Lfx;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:J

.field public final synthetic η:Landroid/app/AlertDialog;

.field public final synthetic θ:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;JLandroid/app/AlertDialog;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    sget v0, Lix;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lfx;->ε:Landroid/app/Activity;

    .line 7
    .line 8
    iput-wide p2, p0, Lfx;->ζ:J

    .line 9
    .line 10
    iput-object p4, p0, Lfx;->η:Landroid/app/AlertDialog;

    .line 11
    .line 12
    iput-object p5, p0, Lfx;->θ:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    sget v0, Lix;->α:I

    .line 2
    .line 3
    iget-object v0, p0, Lfx;->ε:Landroid/app/Activity;

    .line 4
    .line 5
    iget-wide v1, p0, Lfx;->ζ:J

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    :try_start_0
    const-string v5, "dyhelper_dexkit_progress"

    .line 10
    .line 11
    invoke-virtual {v0, v5, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-static {v0, v1, v2}, Lix;->α(Landroid/content/Context;J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v5, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v5, "best-version warning acked, host="

    .line 33
    .line 34
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", best=390601"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lix;->θ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lix;->μ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lfx;->η:Landroid/app/AlertDialog;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lix;->κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lix;->ν:Landroid/os/Handler;

    .line 68
    .line 69
    new-instance v1, Loj;

    .line 70
    .line 71
    iget-object p0, p0, Lfx;->θ:Ljava/lang/ClassLoader;

    .line 72
    .line 73
    invoke-direct {v1, p0, v3}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 74
    .line 75
    .line 76
    const-wide/16 v2, 0x0

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 79
    .line 80
    .line 81
    sget-object p0, Ls62;->α:Ls62;

    .line 82
    .line 83
    return-object p0
.end method
