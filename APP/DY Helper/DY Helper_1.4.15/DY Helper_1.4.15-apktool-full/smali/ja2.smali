.class public final synthetic Lja2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/content/Context;

.field public final synthetic ζ:Lya2;

.field public final synthetic η:Lqa2;

.field public final synthetic θ:Ljava/io/File;

.field public final synthetic ι:J

.field public final synthetic κ:Ljava/util/List;

.field public final synthetic λ:Le80;

.field public final synthetic μ:Lgc;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lya2;Lqa2;Ljava/io/File;JLjava/util/List;Le80;Lgc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lja2;->ε:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lja2;->ζ:Lya2;

    .line 7
    .line 8
    iput-object p3, p0, Lja2;->η:Lqa2;

    .line 9
    .line 10
    iput-object p4, p0, Lja2;->θ:Ljava/io/File;

    .line 11
    .line 12
    iput-wide p5, p0, Lja2;->ι:J

    .line 13
    .line 14
    iput-object p7, p0, Lja2;->κ:Ljava/util/List;

    .line 15
    .line 16
    iput-object p8, p0, Lja2;->λ:Le80;

    .line 17
    .line 18
    iput-object p9, p0, Lja2;->μ:Lgc;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    sget-object v0, Lib2;->α:Lib2;

    .line 2
    .line 3
    iget-object v1, p0, Lja2;->ε:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lja2;->ζ:Lya2;

    .line 6
    .line 7
    iget-object v3, p0, Lja2;->η:Lqa2;

    .line 8
    .line 9
    iget-object v4, p0, Lja2;->θ:Ljava/io/File;

    .line 10
    .line 11
    iget-wide v5, p0, Lja2;->ι:J

    .line 12
    .line 13
    iget-object v7, p0, Lja2;->κ:Ljava/util/List;

    .line 14
    .line 15
    iget-object v8, p0, Lja2;->λ:Le80;

    .line 16
    .line 17
    invoke-static/range {v1 .. v8}, Lib2;->ζ(Landroid/content/Context;Lya2;Lqa2;Ljava/io/File;JLjava/util/List;Le80;)Lcb2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lib2;->β:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v2, Lka2;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    iget-object p0, p0, Lja2;->μ:Lgc;

    .line 27
    .line 28
    invoke-direct {v2, p0, v3, v0}, Lka2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method
