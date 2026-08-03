.class public final La/A$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:La/A$b;

.field public static final c:La/A$b;


# instance fields
.field public final a:Ljava/util/concurrent/CancellationException;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, La/A;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, La/A$b;->c:La/A$b;

    sput-object v1, La/A$b;->b:La/A$b;

    return-void

    :cond_0
    new-instance v0, La/A$b;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, La/A$b;-><init>(ZLjava/util/concurrent/CancellationException;)V

    sput-object v0, La/A$b;->c:La/A$b;

    new-instance v0, La/A$b;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, La/A$b;-><init>(ZLjava/util/concurrent/CancellationException;)V

    sput-object v0, La/A$b;->b:La/A$b;

    return-void
.end method

.method public constructor <init>(ZLjava/util/concurrent/CancellationException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/A$b;->a:Ljava/util/concurrent/CancellationException;

    return-void
.end method
