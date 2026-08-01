.class public final Ldj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/content/Context;

.field public final β:Lcj;

.field public final γ:Ljava/io/File;

.field public final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ε:J

.field public final ζ:Ljava/lang/Object;

.field public η:Ljava/io/BufferedOutputStream;

.field public θ:J

.field public volatile ι:J

.field public volatile κ:Lej;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcj;Ljava/io/File;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldj;->α:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ldj;->β:Lcj;

    .line 7
    .line 8
    iput-object p3, p0, Ldj;->γ:Ljava/io/File;

    .line 9
    .line 10
    iput-object p4, p0, Ldj;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    iput-wide p1, p0, Ldj;->ε:J

    .line 17
    .line 18
    new-instance p1, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ldj;->ζ:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method
