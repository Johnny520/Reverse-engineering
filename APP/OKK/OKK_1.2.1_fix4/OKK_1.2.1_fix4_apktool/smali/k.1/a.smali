.class public final Lk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lk/a;

.field public static final c:Lk/a;


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, Lk/g;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lk/a;->c:Lk/a;

    sput-object v1, Lk/a;->b:Lk/a;

    goto :goto_0

    :cond_0
    new-instance v0, Lk/a;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lk/a;-><init>(ZLjava/util/concurrent/CancellationException;)V

    sput-object v0, Lk/a;->c:Lk/a;

    new-instance v0, Lk/a;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lk/a;-><init>(ZLjava/util/concurrent/CancellationException;)V

    sput-object v0, Lk/a;->b:Lk/a;

    :goto_0
    return-void
.end method

.method public constructor <init>(ZLjava/util/concurrent/CancellationException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk/a;->a:Ljava/lang/Throwable;

    return-void
.end method
