.class public final Lws;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lws;

.field public static final c:Lvs;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lws;

    invoke-direct {v0}, Lws;-><init>()V

    sput-object v0, Lws;->b:Lws;

    new-instance v0, Lvs;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lws;->c:Lvs;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lws;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method
