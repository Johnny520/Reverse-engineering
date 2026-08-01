.class public final synthetic Lvb1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:J

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:Lsw;


# direct methods
.method public synthetic constructor <init>(JLandroid/content/Context;Lsw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lvb1;->d:J

    .line 5
    .line 6
    iput-object p3, p0, Lvb1;->e:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p4, p0, Lvb1;->f:Lsw;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lvb1;->e:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lvb1;->f:Lsw;

    .line 4
    .line 5
    iget-wide v2, p0, Lvb1;->d:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, Lwb1;->j(JLandroid/content/Context;Lsw;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
