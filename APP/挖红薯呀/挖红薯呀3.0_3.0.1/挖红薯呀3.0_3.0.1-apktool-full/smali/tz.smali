.class public final synthetic Ltz;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:I

.field public final synthetic g:J

.field public final synthetic h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic i:Lww;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;IJLjava/util/concurrent/atomic/AtomicInteger;Lww;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltz;->d:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ltz;->e:Landroid/content/Context;

    .line 7
    .line 8
    iput p3, p0, Ltz;->f:I

    .line 9
    .line 10
    iput-wide p4, p0, Ltz;->g:J

    .line 11
    .line 12
    iput-object p6, p0, Ltz;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iput-object p7, p0, Ltz;->i:Lww;

    .line 15
    .line 16
    iput p8, p0, Ltz;->j:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v6, p0, Ltz;->i:Lww;

    .line 2
    .line 3
    iget v7, p0, Ltz;->j:I

    .line 4
    .line 5
    iget-object v0, p0, Ltz;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Ltz;->e:Landroid/content/Context;

    .line 8
    .line 9
    iget v2, p0, Ltz;->f:I

    .line 10
    .line 11
    iget-wide v3, p0, Ltz;->g:J

    .line 12
    .line 13
    iget-object v5, p0, Ltz;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    invoke-static/range {v0 .. v7}, Lvz;->e(Ljava/lang/String;Landroid/content/Context;IJLjava/util/concurrent/atomic/AtomicInteger;Lww;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
