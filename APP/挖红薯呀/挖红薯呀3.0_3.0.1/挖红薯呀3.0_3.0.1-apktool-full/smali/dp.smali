.class public final synthetic Ldp;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z

.field public final synthetic f:Landroid/content/Context;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLandroid/content/Context;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldp;->d:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Ldp;->e:Z

    .line 7
    .line 8
    iput-object p3, p0, Ldp;->f:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p4, p0, Ldp;->g:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p5, p0, Ldp;->h:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v3, p0, Ldp;->g:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v4, p0, Ldp;->h:J

    .line 4
    .line 5
    iget-object v0, p0, Ldp;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-boolean v1, p0, Ldp;->e:Z

    .line 8
    .line 9
    iget-object v2, p0, Ldp;->f:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, Lhp;->e(Ljava/lang/String;ZLandroid/content/Context;Ljava/lang/String;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
